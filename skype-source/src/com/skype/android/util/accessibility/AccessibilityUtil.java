// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.accessibility;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.view.a;
import android.support.v4.view.accessibility.b;
import android.support.v4.view.x;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.StateSet;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.skype.android.widget.drawable.FocusedStateListDrawable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

public class AccessibilityUtil
{
    public class AccessibleTouchDelegate extends TouchDelegate
    {

        final AccessibilityUtil a;
        private View b;
        private Rect c;

        public final View a()
        {
            return b;
        }

        public final Rect b()
        {
            return c;
        }

        public AccessibleTouchDelegate(Rect rect, View view)
        {
            a = AccessibilityUtil.this;
            super(rect, view);
            b = view;
            c = rect;
        }
    }

    public class AccessibleTouchMap
    {

        final AccessibilityUtil a;
        private HashMap b;
        private ViewGroup c;

        private void a(boolean flag)
        {
            Object obj;
            int i;
            int j;
            j = c.getChildCount() - 1;
            obj = null;
            i = 0;
_L11:
            if (i > j) goto _L2; else goto _L1
_L1:
            View view = c.getChildAt(i);
            if ((view instanceof Button) || (view instanceof ImageButton)) goto _L4; else goto _L3
_L3:
            Object obj1 = obj;
            if (!(view instanceof ViewGroup)) goto _L5; else goto _L4
_L4:
            view = (View)view;
            obj1 = obj;
            if (!view.isShown()) goto _L5; else goto _L6
_L6:
            obj1 = new Rect();
            view.getHitRect(((Rect) (obj1)));
            if (!flag) goto _L8; else goto _L7
_L7:
            if (obj == null)
            {
                obj1.left = c.getLeft();
            } else
            {
                obj1.left = ((View) (obj)).getRight();
            }
            if (i == j)
            {
                obj1.right = c.getRight();
            }
_L9:
            b.put(obj1, view);
            obj1 = view;
_L5:
            i++;
            obj = obj1;
            continue; /* Loop/switch isn't completed */
_L8:
            if (obj == null)
            {
                obj1.top = c.getTop();
            } else
            {
                obj1.top = ((View) (obj)).getBottom();
            }
            if (i == j)
            {
                obj1.bottom = c.getBottom();
            }
            if (true) goto _L9; else goto _L2
_L2:
            return;
            if (true) goto _L11; else goto _L10
_L10:
        }

        public final View a(int i, int j)
        {
            Object obj1 = null;
            Iterator iterator = b.entrySet().iterator();
            Object obj;
            do
            {
                obj = obj1;
                if (!iterator.hasNext())
                {
                    break;
                }
                obj = (java.util.Map.Entry)iterator.next();
                if (!((Rect)((java.util.Map.Entry) (obj)).getKey()).contains(i, j))
                {
                    continue;
                }
                obj = (View)((java.util.Map.Entry) (obj)).getValue();
                break;
            } while (true);
            return ((View) (obj));
        }

        public AccessibleTouchMap(ViewGroup viewgroup, boolean flag)
        {
            a = AccessibilityUtil.this;
            super();
            if ((viewgroup instanceof LinearLayout) || (viewgroup instanceof RelativeLayout))
            {
                c = viewgroup;
                b = new HashMap();
                a(flag);
                return;
            } else
            {
                throw new IllegalArgumentException("Unsupported ViewGroup subclass: only LinearLayout and RelativeLayout are supported.");
            }
        }
    }

    public static interface PassThroughFilter
    {
    }

    public static class StructuralFilter
        implements PassThroughFilter
    {

        public StructuralFilter()
        {
        }
    }


    private static final Logger a = Logger.getLogger("AccessibilityUtil");
    private Context b;
    private boolean c;
    private long d;
    private PassThroughFilter e;

    public AccessibilityUtil(Context context)
    {
        d = SystemClock.uptimeMillis();
        e = new StructuralFilter();
        b = context;
    }

    public static String a(String s)
    {
        return s.replace("", " ").trim();
    }

    public static void a(MenuItem menuitem, int i)
    {
        if (menuitem != null)
        {
            menuitem.setTitle(i);
        }
    }

    public static void a(View view, int i)
    {
        view.sendAccessibilityEvent(i);
    }

    public static transient void a(View aview[])
    {
        int j = aview.length;
        for (int i = 0; i < j; i++)
        {
            View view = aview[i];
            if (view != null)
            {
                x.c(view, 2);
            }
        }

    }

    static boolean a(View view, MotionEvent motionevent)
    {
        int i;
        int j;
        boolean flag1;
        flag1 = false;
        i = (int)motionevent.getX();
        j = (int)motionevent.getY();
        motionevent = ((MotionEvent) (view.getTag()));
        view = view.getTouchDelegate();
        if (motionevent == null || !(motionevent instanceof AccessibleTouchMap)) goto _L2; else goto _L1
_L1:
        view = ((AccessibleTouchMap)motionevent).a(i, j);
        if (view == null) goto _L4; else goto _L3
_L3:
        if (!(view instanceof ViewGroup)) goto _L6; else goto _L5
_L5:
        TouchDelegate touchdelegate;
        motionevent = ((MotionEvent) (view.getTag()));
        touchdelegate = view.getTouchDelegate();
        if (touchdelegate == null || !(touchdelegate instanceof AccessibleTouchDelegate)) goto _L8; else goto _L7
_L7:
        boolean flag;
        ((AccessibleTouchDelegate)touchdelegate).a().sendAccessibilityEvent(128);
        flag = true;
_L10:
        return flag;
_L8:
        if (motionevent != null && (motionevent instanceof AccessibleTouchMap))
        {
            throw new IllegalStateException("Nested AccessibleTouchMaps are not supported.");
        }
_L6:
        view.sendAccessibilityEvent(128);
        flag = true;
        continue; /* Loop/switch isn't completed */
_L2:
        flag = flag1;
        if (view != null)
        {
            flag = flag1;
            if (view instanceof AccessibleTouchDelegate)
            {
                view = (AccessibleTouchDelegate)view;
                if (view.b().contains(i, j))
                {
                    view.a().sendAccessibilityEvent(128);
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        flag = false;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static Logger b()
    {
        return a;
    }

    public static void b(View view, CharSequence charsequence)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            view.announceForAccessibility(charsequence);
            return;
        } else
        {
            Toast.makeText(view.getContext(), charsequence, 0).show();
            return;
        }
    }

    public final Drawable a(Drawable drawable, Drawable drawable1, ViewTreeObserver viewtreeobserver)
    {
        if (drawable instanceof FocusedStateListDrawable)
        {
            return drawable;
        }
        Object obj = drawable;
        if (drawable == null)
        {
            obj = new ColorDrawable(b.getResources().getColor(0x106000d));
        }
        drawable = new FocusedStateListDrawable(((Drawable) (obj)));
        drawable1 = new LayerDrawable(new Drawable[] {
            obj, drawable1
        });
        drawable.addState(new int[] {
            0x101009c
        }, drawable1);
        drawable.addState(StateSet.WILD_CARD, ((Drawable) (obj)));
        viewtreeobserver.addOnTouchModeChangeListener(drawable);
        return drawable;
    }

    public final Runnable a(View view, View view1, int i)
    {
        return new Runnable(view1, i, view) {

            final View a;
            final int b;
            final View c;
            final AccessibilityUtil d;

            public final void run()
            {
                Object obj = new Rect();
                a.getHitRect(((Rect) (obj)));
                if ((b & 4) == 4)
                {
                    obj.left = 0;
                }
                if ((b & 1) == 1)
                {
                    obj.top = 0;
                }
                if ((b & 8) == 8)
                {
                    obj.right = c.getWidth();
                }
                if ((b & 2) == 2)
                {
                    obj.bottom = c.getHeight();
                }
                obj = d. new AccessibleTouchDelegate(((Rect) (obj)), a);
                c.setTouchDelegate(((TouchDelegate) (obj)));
            }

            
            {
                d = AccessibilityUtil.this;
                a = view;
                b = i;
                c = view1;
                super();
            }
        };
    }

    public final Runnable a(ViewGroup viewgroup, boolean flag)
    {
        return new Runnable(viewgroup, flag) {

            final ViewGroup a;
            final boolean b;
            final AccessibilityUtil c;

            public final void run()
            {
                AccessibleTouchMap accessibletouchmap = c. new AccessibleTouchMap(a, b);
                a.setTag(accessibletouchmap);
            }

            
            {
                c = AccessibilityUtil.this;
                a = viewgroup;
                b = flag;
                super();
            }
        };
    }

    public final void a(Handler handler, View view)
    {
        handler.postDelayed(new Runnable(view) {

            final View a;
            final AccessibilityUtil b;

            public final void run()
            {
                com.skype.android.util.accessibility.AccessibilityUtil.a(a, 128);
            }

            
            {
                b = AccessibilityUtil.this;
                a = view;
                super();
            }
        }, 1500L);
    }

    public final void a(MenuItem menuitem)
    {
        if (menuitem != null)
        {
            CharSequence charsequence = menuitem.getTitle();
            menuitem.setTitle(b.getString(0x7f080084, new Object[] {
                charsequence
            }));
        }
    }

    public final void a(View view)
    {
        view.setOnHoverListener(new android.view.View.OnHoverListener() {

            final AccessibilityUtil a;

            public final boolean onHover(View view1, MotionEvent motionevent)
            {
                boolean flag = false;
                int i = motionevent.getAction();
                if (i == 9 || i == 7)
                {
                    flag = com.skype.android.util.accessibility.AccessibilityUtil.a(view1, motionevent);
                }
                return flag;
            }

            
            {
                a = AccessibilityUtil.this;
                super();
            }
        });
    }

    public final void a(View view, View view1)
    {
        x.a(view, new a(view1) {

            final int a = 128;
            final View c;
            final AccessibilityUtil d;

            public final boolean a(View view2, int i, Bundle bundle)
            {
                com.skype.android.util.accessibility.AccessibilityUtil.b().info((new StringBuilder("setDelegate: action ")).append(i).append(", newAction ").append(a).toString());
                if (c != null)
                {
                    com.skype.android.util.accessibility.AccessibilityUtil.a(c, a);
                }
                return true;
            }

            
            {
                d = AccessibilityUtil.this;
                c = view;
                super();
            }
        });
    }

    public final void a(View view, CharSequence charsequence)
    {
        if (!a())
        {
            return;
        } else
        {
            view.postDelayed(new Runnable(view, charsequence) {

                final View a;
                final CharSequence b;
                final AccessibilityUtil c;

                public final void run()
                {
                    com.skype.android.util.accessibility.AccessibilityUtil.b(a, b);
                }

            
            {
                c = AccessibilityUtil.this;
                a = view;
                b = charsequence;
                super();
            }
            }, 1000L);
            return;
        }
    }

    public final void a(ViewGroup viewgroup, View view, int i)
    {
        viewgroup.post(a(((View) (viewgroup)), view, i));
        a(((View) (viewgroup)));
    }

    public final void a(TextView textview, CharSequence charsequence, boolean flag)
    {
        boolean flag1 = true;
        if (textview == null)
        {
            return;
        }
        if (!(charsequence instanceof Spanned) || !flag)
        {
            textview.setText(charsequence);
            textview.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        Spanned spanned = (Spanned)charsequence;
        URLSpan aurlspan[] = (URLSpan[])spanned.getSpans(0, spanned.length(), android/text/style/URLSpan);
        charsequence = null;
        if (aurlspan.length == 1)
        {
            charsequence = new android.view.View.OnClickListener(aurlspan[0], textview) {

                final URLSpan a;
                final TextView b;
                final AccessibilityUtil c;

                public final void onClick(View view)
                {
                    view = new Intent("android.intent.action.VIEW");
                    view.setData(Uri.parse(a.getURL()));
                    b.getContext().startActivity(view);
                }

            
            {
                c = AccessibilityUtil.this;
                a = urlspan;
                b = textview;
                super();
            }
            };
        } else
        if (aurlspan.length > 1)
        {
            charsequence = new android.view.View.OnClickListener(aurlspan, spanned, textview) {

                final URLSpan a[];
                final Spanned b;
                final TextView c;
                final AccessibilityUtil d;

                public final void onClick(View view)
                {
                    view = new CharSequence[a.length];
                    for (int i = 0; i < a.length; i++)
                    {
                        URLSpan urlspan = a[i];
                        view[i] = b.subSequence(b.getSpanStart(urlspan), b.getSpanEnd(urlspan)).toString();
                    }

                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(c.getContext());
                    builder.setTitle(0x7f08007d);
                    builder.setItems(view, new android.content.DialogInterface.OnClickListener(this) {

                        final _cls1 a;

                        public final void onClick(DialogInterface dialoginterface, int i)
                        {
                            dialoginterface = new Intent("android.intent.action.VIEW");
                            dialoginterface.setData(Uri.parse(a.a[i].getURL()));
                            a.c.getContext().startActivity(dialoginterface);
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                    builder.create().show();
                }

            
            {
                d = AccessibilityUtil.this;
                a = aurlspan;
                b = spanned;
                c = textview;
                super();
            }
            };
        }
        textview.setOnClickListener(charsequence);
        if (charsequence != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        textview.setFocusable(flag);
        if (charsequence != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        textview.setClickable(flag);
        textview.setText(spanned);
    }

    public final void a(boolean flag)
    {
label0:
        {
            boolean flag2 = false;
            if (!flag)
            {
                boolean flag1;
                if (android.os.Build.VERSION.SDK_INT >= 21)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                flag = flag2;
                if (!flag1)
                {
                    break label0;
                }
            }
            flag = true;
        }
        c = flag;
    }

    public final boolean a()
    {
        AccessibilityManager accessibilitymanager = (AccessibilityManager)b.getSystemService("accessibility");
        return accessibilitymanager != null && android.support.v4.view.accessibility.b.a(accessibilitymanager);
    }

    public final void b(View view, int i)
    {
        a((ViewGroup)view.getParent(), view, i);
    }

}
