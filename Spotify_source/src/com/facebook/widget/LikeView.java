// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import apn;
import aqz;
import arp;
import asa;
import asb;
import com.facebook.AppEventsLogger;
import com.facebook.internal.LikeActionController;
import com.facebook.internal.LikeBoxCountView;
import de;

public class LikeView extends FrameLayout
{

    private String a;
    private LinearLayout b;
    private aqz c;
    private LikeBoxCountView d;
    private TextView e;
    private LikeActionController f;
    private BroadcastReceiver g;
    private asa h;
    private Style i;
    private HorizontalAlignment j;
    private AuxiliaryViewPosition k;
    private int l;
    private int m;
    private int n;

    public LikeView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = Style.c;
        j = HorizontalAlignment.d;
        k = AuxiliaryViewPosition.d;
        l = -1;
        boolean flag;
        if (attributeset != null && getContext() != null)
        {
            attributeset = getContext().obtainStyledAttributes(attributeset, apn.a);
            if (attributeset != null)
            {
                a = arp.a(attributeset.getString(1), null);
                i = Style.a(attributeset.getInt(2, Style.a(Style.c)));
                if (i == null)
                {
                    throw new IllegalArgumentException("Unsupported value for LikeView 'style'");
                }
                k = AuxiliaryViewPosition.a(attributeset.getInt(3, AuxiliaryViewPosition.a(AuxiliaryViewPosition.d)));
                if (k == null)
                {
                    throw new IllegalArgumentException("Unsupported value for LikeView 'auxiliary_view_position'");
                }
                j = HorizontalAlignment.a(attributeset.getInt(4, HorizontalAlignment.a(HorizontalAlignment.d)));
                if (j == null)
                {
                    throw new IllegalArgumentException("Unsupported value for LikeView 'horizontal_alignment'");
                }
                l = attributeset.getColor(0, -1);
                attributeset.recycle();
            }
        }
        m = getResources().getDimensionPixelSize(0x7f0c00af);
        n = getResources().getDimensionPixelSize(0x7f0c00b0);
        if (l == -1)
        {
            l = getResources().getColor(0x7f0f00c7);
        }
        setBackgroundColor(0);
        b = new LinearLayout(context);
        attributeset = new android.widget.FrameLayout.LayoutParams(-2, -2);
        b.setLayoutParams(attributeset);
        if (f != null)
        {
            flag = f.a;
        } else
        {
            flag = false;
        }
        c = new aqz(context, flag);
        c.setOnClickListener(new android.view.View.OnClickListener() {

            private LikeView a;

            public final void onClick(View view)
            {
                LikeView.a(a);
            }

            
            {
                a = LikeView.this;
                super();
            }
        });
        attributeset = new android.widget.LinearLayout.LayoutParams(-2, -2);
        c.setLayoutParams(attributeset);
        e = new TextView(context);
        e.setTextSize(0, getResources().getDimension(0x7f0c00b1));
        e.setMaxLines(2);
        e.setTextColor(l);
        e.setGravity(17);
        attributeset = new android.widget.LinearLayout.LayoutParams(-2, -1);
        e.setLayoutParams(attributeset);
        d = new LikeBoxCountView(context);
        context = new android.widget.LinearLayout.LayoutParams(-1, -1);
        d.setLayoutParams(context);
        b.addView(c);
        b.addView(e);
        b.addView(d);
        addView(b);
        a(a);
        a();
    }

    private void a()
    {
        Object obj;
        boolean flag = true;
        Object obj1;
        int i1;
        if (f == null)
        {
            c.a(false);
            e.setText(null);
            d.a(null);
        } else
        {
            c.a(f.a);
            e.setText(f.b());
            d.a(f.a());
        }
        obj = (android.widget.FrameLayout.LayoutParams)b.getLayoutParams();
        obj1 = (android.widget.LinearLayout.LayoutParams)c.getLayoutParams();
        if (j == HorizontalAlignment.b)
        {
            i1 = 3;
        } else
        if (j == HorizontalAlignment.a)
        {
            i1 = 1;
        } else
        {
            i1 = 5;
        }
        obj.gravity = i1 | 0x30;
        obj1.gravity = i1;
        e.setVisibility(8);
        d.setVisibility(8);
        if (i != Style.a || f == null || arp.a(f.b())) goto _L2; else goto _L1
_L1:
        obj = e;
_L12:
        ((View) (obj)).setVisibility(0);
        ((android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams()).gravity = i1;
        obj1 = b;
        i1 = ((flag) ? 1 : 0);
        if (k == AuxiliaryViewPosition.b)
        {
            i1 = 0;
        }
        ((LinearLayout) (obj1)).setOrientation(i1);
        final class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[AuxiliaryViewPosition.values().length];
                try
                {
                    a[AuxiliaryViewPosition.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[AuxiliaryViewPosition.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[AuxiliaryViewPosition.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        LikeBoxCountView likeboxcountview;
        if (k == AuxiliaryViewPosition.c || k == AuxiliaryViewPosition.b && j == HorizontalAlignment.c)
        {
            b.removeView(c);
            b.addView(c);
        } else
        {
            b.removeView(((View) (obj)));
            b.addView(((View) (obj)));
        }
        _cls2.a[k.ordinal()];
        JVM INSTR tableswitch 1 3: default 264
    //                   1 481
    //                   2 502
    //                   3 523;
           goto _L3 _L4 _L5 _L6
_L3:
        return;
_L2:
        if (i != Style.b || f == null || arp.a(f.a())) goto _L3; else goto _L7
_L7:
        _cls2.a[k.ordinal()];
        JVM INSTR tableswitch 1 3: default 396
    //                   1 404
    //                   2 421
    //                   3 433;
           goto _L8 _L9 _L10 _L11
_L8:
        obj = d;
          goto _L12
_L9:
        likeboxcountview = d;
        obj = com.facebook.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.d;
_L13:
        likeboxcountview.a(((com.facebook.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition) (obj)));
          goto _L8
_L10:
        likeboxcountview = d;
        obj = com.facebook.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.b;
          goto _L13
_L11:
        likeboxcountview = d;
        if (j == HorizontalAlignment.c)
        {
            obj = com.facebook.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.c;
        } else
        {
            obj = com.facebook.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.a;
        }
          goto _L13
_L4:
        ((View) (obj)).setPadding(m, m, m, n);
        return;
_L5:
        ((View) (obj)).setPadding(m, n, m, m);
        return;
_L6:
        if (j == HorizontalAlignment.c)
        {
            ((View) (obj)).setPadding(m, m, n, m);
            return;
        } else
        {
            ((View) (obj)).setPadding(n, m, m, m);
            return;
        }
    }

    static void a(LikeView likeview)
    {
        Activity activity;
        LikeActionController likeactioncontroller;
        Bundle bundle;
        boolean flag;
label0:
        {
            if (likeview.f != null)
            {
                activity = (Activity)likeview.getContext();
                likeactioncontroller = likeview.f;
                bundle = new Bundle();
                bundle.putString("style", likeview.i.toString());
                bundle.putString("auxiliary_position", likeview.k.toString());
                bundle.putString("horizontal_alignment", likeview.j.toString());
                bundle.putString("object_id", arp.a(likeview.a, ""));
                likeactioncontroller.h.b("fb_like_control_did_tap", bundle);
                if (!likeactioncontroller.a)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!likeactioncontroller.a(flag))
                {
                    break label0;
                }
                likeactioncontroller.a(flag, likeactioncontroller.b, likeactioncontroller.c, likeactioncontroller.d, likeactioncontroller.e, likeactioncontroller.f);
                if (!likeactioncontroller.g)
                {
                    break label0;
                }
                likeactioncontroller.h.b("fb_like_control_did_undo_quickly", bundle);
            }
            return;
        }
        likeactioncontroller.a(activity, flag, bundle);
    }

    public static void a(LikeView likeview, LikeActionController likeactioncontroller)
    {
        likeview.f = likeactioncontroller;
        likeview.g = new asb(likeview, (byte)0);
        likeactioncontroller = de.a(likeview.getContext());
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.facebook.sdk.LikeActionController.UPDATED");
        intentfilter.addAction("com.facebook.sdk.LikeActionController.DID_ERROR");
        intentfilter.addAction("com.facebook.sdk.LikeActionController.DID_RESET");
        likeactioncontroller.a(likeview.g, intentfilter);
    }

    public static void a(LikeView likeview, String s)
    {
        likeview.a(s);
    }

    private void a(String s)
    {
        if (g != null)
        {
            de.a(getContext()).a(g);
            g = null;
        }
        if (h != null)
        {
            h.a = true;
            h = null;
        }
        f = null;
        a = s;
        if (arp.a(s))
        {
            return;
        } else
        {
            h = new asa(this, (byte)0);
            LikeActionController.a(getContext(), s, h);
            return;
        }
    }

    public static String b(LikeView likeview)
    {
        return likeview.a;
    }

    public static void c(LikeView likeview)
    {
        likeview.a();
    }

    public static asa d(LikeView likeview)
    {
        likeview.h = null;
        return null;
    }

    protected void onDetachedFromWindow()
    {
        String s = arp.a(null, null);
        if (!arp.a(s, a))
        {
            a(s);
            a();
        }
        super.onDetachedFromWindow();
    }

    private class Style extends Enum
    {

        public static final Style a;
        public static final Style b;
        static Style c;
        private static Style d;
        private static final Style e[];
        private int intValue;
        private String stringValue;

        static int a(Style style)
        {
            return style.intValue;
        }

        static Style a(int i1)
        {
            Style astyle[] = values();
            int k1 = astyle.length;
            for (int j1 = 0; j1 < k1; j1++)
            {
                Style style = astyle[j1];
                if (style.intValue == i1)
                {
                    return style;
                }
            }

            return null;
        }

        public static Style valueOf(String s)
        {
            return (Style)Enum.valueOf(com/facebook/widget/LikeView$Style, s);
        }

        public static Style[] values()
        {
            return (Style[])e.clone();
        }

        public final String toString()
        {
            return stringValue;
        }

        static 
        {
            a = new Style("STANDARD", 0, "standard", 0);
            d = new Style("BUTTON", 1, "button", 1);
            b = new Style("BOX_COUNT", 2, "box_count", 2);
            e = (new Style[] {
                a, d, b
            });
            c = a;
        }

        private Style(String s, int i1, String s1, int j1)
        {
            super(s, i1);
            stringValue = s1;
            intValue = j1;
        }
    }


    private class HorizontalAlignment extends Enum
    {

        public static final HorizontalAlignment a;
        public static final HorizontalAlignment b;
        public static final HorizontalAlignment c;
        static HorizontalAlignment d;
        private static final HorizontalAlignment e[];
        private int intValue;
        private String stringValue;

        static int a(HorizontalAlignment horizontalalignment)
        {
            return horizontalalignment.intValue;
        }

        static HorizontalAlignment a(int i1)
        {
            HorizontalAlignment ahorizontalalignment[] = values();
            int k1 = ahorizontalalignment.length;
            for (int j1 = 0; j1 < k1; j1++)
            {
                HorizontalAlignment horizontalalignment = ahorizontalalignment[j1];
                if (horizontalalignment.intValue == i1)
                {
                    return horizontalalignment;
                }
            }

            return null;
        }

        public static HorizontalAlignment valueOf(String s)
        {
            return (HorizontalAlignment)Enum.valueOf(com/facebook/widget/LikeView$HorizontalAlignment, s);
        }

        public static HorizontalAlignment[] values()
        {
            return (HorizontalAlignment[])e.clone();
        }

        public final String toString()
        {
            return stringValue;
        }

        static 
        {
            a = new HorizontalAlignment("CENTER", 0, "center", 0);
            b = new HorizontalAlignment("LEFT", 1, "left", 1);
            c = new HorizontalAlignment("RIGHT", 2, "right", 2);
            e = (new HorizontalAlignment[] {
                a, b, c
            });
            d = a;
        }

        private HorizontalAlignment(String s, int i1, String s1, int j1)
        {
            super(s, i1);
            stringValue = s1;
            intValue = j1;
        }
    }


    private class AuxiliaryViewPosition extends Enum
    {

        public static final AuxiliaryViewPosition a;
        public static final AuxiliaryViewPosition b;
        public static final AuxiliaryViewPosition c;
        static AuxiliaryViewPosition d;
        private static final AuxiliaryViewPosition e[];
        private int intValue;
        private String stringValue;

        static int a(AuxiliaryViewPosition auxiliaryviewposition)
        {
            return auxiliaryviewposition.intValue;
        }

        static AuxiliaryViewPosition a(int i1)
        {
            AuxiliaryViewPosition aauxiliaryviewposition[] = values();
            int k1 = aauxiliaryviewposition.length;
            for (int j1 = 0; j1 < k1; j1++)
            {
                AuxiliaryViewPosition auxiliaryviewposition = aauxiliaryviewposition[j1];
                if (auxiliaryviewposition.intValue == i1)
                {
                    return auxiliaryviewposition;
                }
            }

            return null;
        }

        public static AuxiliaryViewPosition valueOf(String s)
        {
            return (AuxiliaryViewPosition)Enum.valueOf(com/facebook/widget/LikeView$AuxiliaryViewPosition, s);
        }

        public static AuxiliaryViewPosition[] values()
        {
            return (AuxiliaryViewPosition[])e.clone();
        }

        public final String toString()
        {
            return stringValue;
        }

        static 
        {
            a = new AuxiliaryViewPosition("BOTTOM", 0, "bottom", 0);
            b = new AuxiliaryViewPosition("INLINE", 1, "inline", 1);
            c = new AuxiliaryViewPosition("TOP", 2, "top", 2);
            e = (new AuxiliaryViewPosition[] {
                a, b, c
            });
            d = a;
        }

        private AuxiliaryViewPosition(String s, int i1, String s1, int j1)
        {
            super(s, i1);
            stringValue = s1;
            intValue = j1;
        }
    }

}
