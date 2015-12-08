// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.content.res.a;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.TextView;
import com.skype.ContactImpl;
import com.skype.ConversationImpl;
import com.skype.ObjectInterface;
import com.skype.SkyLib;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityTextDecorator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.widget:
//            ParticipantSpan, VirtualAccessibilityNodeProvider, InterceptionListener

public class ParticipantsDisplayText extends TextView
{
    public static interface ParticipantUpdateListener
    {

        public abstract void onParticipantAdded(ParticipantsDisplayText participantsdisplaytext, ObjectInterface objectinterface);

        public abstract void onParticipantRemoved(ParticipantsDisplayText participantsdisplaytext, ObjectInterface objectinterface);
    }

    private final class a
        implements TextWatcher
    {

        final ParticipantsDisplayText a;

        public final void afterTextChanged(Editable editable)
        {
            if (editable == null || editable.toString().trim().isEmpty())
            {
                ParticipantSpan aparticipantspan[] = (ParticipantSpan[])com.skype.android.widget.ParticipantsDisplayText.a(a).getSpans(0, com.skype.android.widget.ParticipantsDisplayText.a(a).length(), com/skype/android/widget/ParticipantSpan);
                int j1 = aparticipantspan.length;
                for (int i1 = 0; i1 < j1; i1++)
                {
                    ParticipantSpan participantspan = aparticipantspan[i1];
                    com.skype.android.widget.ParticipantsDisplayText.a(a).removeSpan(participantspan);
                }

                if (ParticipantsDisplayText.b(a).size() > 0)
                {
                    ParticipantsDisplayText.b(a).clear();
                }
                if (editable != null && editable.length() > 0)
                {
                    editable.clear();
                }
            }
            ParticipantsDisplayText.c(a);
        }

        public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
        {
        }

        public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
        {
            if (j1 <= k1) goto _L2; else goto _L1
_L1:
            j1 = 0;
            charsequence = null;
            if (ParticipantsDisplayText.d(a) == null) goto _L4; else goto _L3
_L3:
            charsequence = ParticipantsDisplayText.d(a);
            i1 = 1;
_L9:
            if (charsequence == null) goto _L2; else goto _L5
_L5:
            int l1;
            l1 = com.skype.android.widget.ParticipantsDisplayText.a(a, charsequence);
            k1 = ParticipantsDisplayText.b(a, charsequence);
            if (k1 != l1) goto _L6; else goto _L2
_L2:
            return;
_L4:
            i1 = a.getSelectionStart();
            ParticipantSpan aparticipantspan[] = (ParticipantSpan[])com.skype.android.widget.ParticipantsDisplayText.a(a).getSpans(i1, i1, com/skype/android/widget/ParticipantSpan);
            i1 = j1;
            if (aparticipantspan.length > 0)
            {
                charsequence = aparticipantspan[0];
                i1 = j1;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            j1 = k1;
            if (k1 > com.skype.android.widget.ParticipantsDisplayText.a(a).length())
            {
                j1 = com.skype.android.widget.ParticipantsDisplayText.a(a).length();
            }
            com.skype.android.widget.ParticipantsDisplayText.a(a, com.skype.android.widget.ParticipantsDisplayText.a(a), charsequence, l1, j1);
            if (i1 == 0) goto _L2; else goto _L7
_L7:
            ParticipantsDisplayText.c(a);
            com.skype.android.widget.ParticipantsDisplayText.a(a).append(" ");
            return;
            if (true) goto _L9; else goto _L8
_L8:
        }

        private a()
        {
            a = ParticipantsDisplayText.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final Logger a = Logger.getLogger("ParticipantsDisplayText");
    private ParticipantUpdateListener b;
    private HashSet c;
    private ParticipantSpan d;
    private List e;
    private Map f;
    private float g;
    private float h;
    private float i;
    private int j;
    private AccessibilityTextDecorator k;
    private android.support.v4.content.res.a l;
    private InterceptionListener m;
    private SpannableStringBuilder n;

    public ParticipantsDisplayText(Context context)
    {
        super(context);
        c = new HashSet();
        f = new HashMap();
        g = 0.0F;
        h = 0.0F;
        l = new android.support.v4.content.res.a();
        n = new SpannableStringBuilder();
    }

    public ParticipantsDisplayText(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = new HashSet();
        f = new HashMap();
        g = 0.0F;
        h = 0.0F;
        l = new android.support.v4.content.res.a();
        n = new SpannableStringBuilder();
    }

    public ParticipantsDisplayText(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = new HashSet();
        f = new HashMap();
        g = 0.0F;
        h = 0.0F;
        l = new android.support.v4.content.res.a();
        n = new SpannableStringBuilder();
    }

    private int a(float f1, float f2)
    {
        if (getLayout() == null)
        {
            return -1;
        }
        int i1;
        try
        {
            f2 = Math.max(0.0F, f2 - (float)getTotalPaddingTop());
            f2 = Math.min(getHeight() - getTotalPaddingBottom() - 1, f2);
            float f3 = getScrollY();
            i1 = a(getLayout().getLineForVertical((int)(f2 + f3)), f1);
        }
        catch (Exception exception)
        {
            a.severe("Something weird happen in [getOffsetForPositionInWidget]");
            exception.printStackTrace();
            return -1;
        }
        return i1;
    }

    private int a(int i1, float f1)
    {
        try
        {
            f1 = Math.max(0.0F, f1 - (float)getTotalPaddingLeft());
            f1 = Math.min(getWidth() - getTotalPaddingRight() - 1, f1);
            float f2 = getScrollX();
            i1 = getLayout().getOffsetForHorizontal(i1, f1 + f2);
        }
        catch (Exception exception)
        {
            a.severe("Something weird happen in [_getOffsetAtCoordinate]");
            exception.printStackTrace();
            return -1;
        }
        return i1;
    }

    private int a(ParticipantSpan participantspan)
    {
        return n.getSpanStart(participantspan);
    }

    static int a(ParticipantsDisplayText participantsdisplaytext, ParticipantSpan participantspan)
    {
        return participantsdisplaytext.a(participantspan);
    }

    static SpannableStringBuilder a(ParticipantsDisplayText participantsdisplaytext)
    {
        return participantsdisplaytext.n;
    }

    private ParticipantSpan a(int i1)
    {
        ParticipantSpan aparticipantspan[] = (ParticipantSpan[])n.getSpans(0, n.length(), com/skype/android/widget/ParticipantSpan);
        int k1 = aparticipantspan.length;
        for (int j1 = 0; j1 < k1; j1++)
        {
            ParticipantSpan participantspan = aparticipantspan[j1];
            int l1 = a(participantspan);
            int i2 = b(participantspan);
            if (i1 >= l1 && i1 <= i2)
            {
                return participantspan;
            }
        }

        return null;
    }

    private ParticipantSpan a(ObjectInterface objectinterface, int i1, int j1, boolean flag)
    {
        ParticipantSpan.Builder builder = (ParticipantSpan.Builder)f.get(objectinterface.getClass());
        if (builder == null)
        {
            objectinterface = null;
        } else
        {
            objectinterface = builder.a(getPaint(), objectinterface, getWidth() - (getPaddingLeft() + getPaddingRight()), flag, false);
        }
        if (objectinterface == null)
        {
            return null;
        } else
        {
            SpannableString spannablestring = new SpannableString((new StringBuilder()).append(objectinterface.getSource()).append(" ").toString());
            spannablestring.setSpan(objectinterface, 0, spannablestring.length() - 1, 33);
            n.replace(i1, j1, spannablestring);
            setText(n);
            return objectinterface;
        }
    }

    private void a(SpannableStringBuilder spannablestringbuilder, ParticipantSpan participantspan, int i1, int j1)
    {
        spannablestringbuilder.removeSpan(participantspan);
        spannablestringbuilder.delete(i1, j1);
        c.remove(participantspan.b());
        setText(n);
    }

    private void a(ParticipantSpan participantspan, boolean flag)
    {
        int i1 = a(participantspan);
        int j1 = b(participantspan);
        if (i1 == -1 || j1 == -1)
        {
            a.warning("The span doesn't exist or may be a span a user was editing");
        } else
        {
            n.removeSpan(participantspan);
            participantspan = a(participantspan.b(), i1, j1 + 1, flag);
            if (flag)
            {
                d = participantspan;
                return;
            }
        }
    }

    static void a(ParticipantsDisplayText participantsdisplaytext, SpannableStringBuilder spannablestringbuilder, ParticipantSpan participantspan, int i1, int j1)
    {
        participantsdisplaytext.a(spannablestringbuilder, participantspan, i1, j1);
    }

    private int b(ParticipantSpan participantspan)
    {
        return n.getSpanEnd(participantspan);
    }

    static int b(ParticipantsDisplayText participantsdisplaytext, ParticipantSpan participantspan)
    {
        return participantsdisplaytext.b(participantspan);
    }

    static HashSet b(ParticipantsDisplayText participantsdisplaytext)
    {
        return participantsdisplaytext.c;
    }

    private ParticipantSpan[] b()
    {
        ArrayList arraylist = new ArrayList(Arrays.asList((ParticipantSpan[])n.getSpans(0, n.length(), com/skype/android/widget/ParticipantSpan)));
        Collections.sort(arraylist, new Comparator() {

            final ParticipantsDisplayText a;

            public final int compare(Object obj, Object obj1)
            {
                obj = (ParticipantSpan)obj;
                obj1 = (ParticipantSpan)obj1;
                int i1 = com.skype.android.widget.ParticipantsDisplayText.a(a).getSpanStart(obj);
                int j1 = com.skype.android.widget.ParticipantsDisplayText.a(a).getSpanStart(obj1);
                if (i1 < j1)
                {
                    return -1;
                }
                return i1 <= j1 ? 0 : 1;
            }

            
            {
                a = ParticipantsDisplayText.this;
                super();
            }
        });
        return (ParticipantSpan[])arraylist.toArray(new ParticipantSpan[arraylist.size()]);
    }

    private ParticipantSpan c()
    {
        Object obj = null;
        ParticipantSpan aparticipantspan[] = b();
        ParticipantSpan participantspan = obj;
        if (aparticipantspan != null)
        {
            participantspan = obj;
            if (aparticipantspan.length > 0)
            {
                participantspan = aparticipantspan[aparticipantspan.length - 1];
            }
        }
        return participantspan;
    }

    static void c(ParticipantsDisplayText participantsdisplaytext)
    {
        participantsdisplaytext.d();
    }

    static ParticipantSpan d(ParticipantsDisplayText participantsdisplaytext)
    {
        return participantsdisplaytext.d;
    }

    private void d()
    {
        if (d != null)
        {
            a(d, false);
            d = null;
        }
    }

    public final List a()
    {
        ArrayList arraylist = new ArrayList(e.size() + c.size());
        arraylist.addAll(e);
        arraylist.addAll(c);
        return arraylist;
    }

    public final void a(ObjectInterface objectinterface)
    {
        clearComposingText();
        if (n.length() > 0)
        {
            SpannableStringBuilder spannablestringbuilder = n;
            Object obj = c();
            int i1;
            int j1;
            if (obj != null)
            {
                i1 = spannablestringbuilder.getSpanEnd(obj);
            } else
            {
                i1 = 0;
            }
            j1 = spannablestringbuilder.length();
            if (c.size() == 0)
            {
                obj = "";
            } else
            {
                obj = " ";
            }
            spannablestringbuilder.replace(i1, j1, ((CharSequence) (obj)));
        }
        i1 = n.length();
        if (c.add(objectinterface))
        {
            a(objectinterface, i1, i1, false);
            b.onParticipantAdded(this, objectinterface);
            return;
        } else
        {
            n.replace(i1, i1, "");
            return;
        }
    }

    public final void a(SkyLib skylib, ContactUtil contactutil, ConversationUtil conversationutil)
    {
        f.put(com/skype/ContactImpl, new ContactSpan.Builder(getContext(), contactutil));
        f.put(com/skype/ConversationImpl, new ConversationSpan.Builder(getContext(), skylib, contactutil, conversationutil));
        setLongClickable(false);
        setCustomSelectionActionModeCallback(new android.view.ActionMode.Callback() {

            final ParticipantsDisplayText a;

            public final boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
            {
                return false;
            }

            public final boolean onCreateActionMode(ActionMode actionmode, Menu menu)
            {
                return false;
            }

            public final void onDestroyActionMode(ActionMode actionmode)
            {
            }

            public final boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
            {
                return false;
            }

            
            {
                a = ParticipantsDisplayText.this;
                super();
            }
        });
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            m = new VirtualAccessibilityNodeProvider(this);
        } else
        {
            m = null;
        }
        addTextChangedListener(new a((byte)0));
        j = ViewUtil.a(this);
        i = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public final void b(ObjectInterface objectinterface)
    {
        ParticipantSpan aparticipantspan[];
        int i1;
        int j1;
        i1 = 0;
        aparticipantspan = (ParticipantSpan[])n.getSpans(0, n.length(), com/skype/android/widget/ParticipantSpan);
        j1 = aparticipantspan.length;
_L3:
        ParticipantSpan participantspan;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        participantspan = aparticipantspan[i1];
        if (!participantspan.b().equals(objectinterface)) goto _L2; else goto _L1
_L1:
        if (participantspan != null)
        {
            a(n, participantspan, n.getSpanStart(participantspan), n.getSpanEnd(participantspan));
            e.remove(objectinterface);
            b.onParticipantRemoved(this, participantspan.b());
        }
        return;
_L2:
        i1++;
          goto _L3
        participantspan = null;
          goto _L1
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider()
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            m.a();
        }
        return null;
    }

    public CharSequence getContentDescription()
    {
        return k.a(getContext().getString(0x7f080050));
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        if (!TextUtils.isEmpty(getContentDescription()))
        {
            accessibilitynodeinfo.setText(getContentDescription());
        }
    }

    public boolean onKeyPreIme(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && d != null)
        {
            d();
            return true;
        } else
        {
            return super.onKeyPreIme(i1, keyevent);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!TextUtils.isEmpty(getText()))
        {
            super.onRestoreInstanceState(null);
            n = new SpannableStringBuilder(getText());
        } else
        {
            super.onRestoreInstanceState(parcelable);
            n = new SpannableStringBuilder(getText());
            parcelable = b();
            int j1 = parcelable.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                ParticipantSpan participantspan = parcelable[i1];
                c.add(participantspan.b());
                i1++;
            }
        }
    }

    public Parcelable onSaveInstanceState()
    {
        d();
        return super.onSaveInstanceState();
    }

    public void onSelectionChanged(int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        if (d != null)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (k1 == 0) goto _L2; else goto _L1
_L1:
        k1 = getContext().getResources().getColor(0x106000d);
        i2 = j1;
        l1 = i1;
_L4:
        setHighlightColor(k1);
        super.onSelectionChanged(l1, i2);
        return;
_L2:
        int j2 = j;
        ParticipantSpan participantspan = c();
        k1 = j2;
        l1 = i1;
        i2 = j1;
        if (participantspan != null)
        {
            k1 = j2;
            l1 = i1;
            i2 = j1;
            if (i1 < n.getSpanEnd(participantspan) + 1)
            {
                i2 = Math.min(n.length(), n.getSpanEnd(participantspan) + 1);
                l1 = i2;
                k1 = j2;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int j1;
        boolean flag;
        flag = false;
        j1 = motionevent.getAction();
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        int i1;
        g = motionevent.getX();
        h = motionevent.getY();
        i1 = ((flag) ? 1 : 0);
_L4:
        float f1;
        float f2;
        return i1 != 0 || super.onTouchEvent(motionevent);
_L2:
        i1 = ((flag) ? 1 : 0);
        if (j1 != 1) goto _L4; else goto _L3
_L3:
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        i1 = ((flag) ? 1 : 0);
        if (Math.abs(f1 - g) >= i) goto _L4; else goto _L5
_L5:
        i1 = ((flag) ? 1 : 0);
        if (Math.abs(f2 - h) >= i) goto _L4; else goto _L6
_L6:
        i1 = a(f1, f2);
        int k1 = n.length();
        for (int j2 = k1 - 1; j2 >= 0 && n.charAt(j2) == ' '; j2--)
        {
            k1--;
        }

        int k2 = i1;
        if (i1 < k1)
        {
            SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(n);
            do
            {
                k2 = i1;
                if (i1 < 0)
                {
                    break;
                }
                int l1;
                if (spannablestringbuilder.charAt(i1) != ' ')
                {
                    l1 = i1;
                } else
                {
                    l1 = -1;
                }
                k2 = i1;
                if (l1 != -1)
                {
                    break;
                }
                k2 = i1;
                if (a(i1) != null)
                {
                    break;
                }
                i1--;
            } while (true);
        }
        ParticipantSpan participantspan = a(k2);
        if (participantspan == null)
        {
            break MISSING_BLOCK_LABEL_664;
        }
        if (d != null)
        {
            if (participantspan.c())
            {
                break MISSING_BLOCK_LABEL_307;
            }
            d();
        }
        a(participantspan, true);
        sendAccessibilityEvent(4);
_L7:
        i1 = 1;
          goto _L4
        ParticipantSpan participantspan1 = d;
        Layout layout = getLayout();
        int ai[] = new int[2];
        ai;
        ai[0] = 0;
        ai[1] = 0;
        i1 = a(participantspan1);
        int i2 = b(participantspan1);
        float f3 = layout.getPrimaryHorizontal(i1);
        float f4 = layout.getPrimaryHorizontal(i2);
        Rect rect = new Rect();
        layout.getLineBounds(layout.getLineForOffset(i1), rect);
        i1 = (ai[1] - getScrollY()) + getCompoundPaddingTop();
        rect.top = rect.top + i1;
        rect.bottom = i1 + rect.bottom;
        rect.left = (int)((float)rect.left + (((float)ai[0] + f3 + (float)getCompoundPaddingLeft()) - (float)getScrollX()));
        rect.right = (int)(((float)rect.left + f4) - f3);
        i1 = getResources().getDimensionPixelSize(0x7f0c00c0);
        rect.left = rect.left - i1;
        rect.right = rect.right + i1;
        rect.top = rect.top - i1;
        rect.bottom = rect.bottom + i1;
        if (rect.contains((int)f1, (int)f2) && f1 > (float)(rect.right - participantspan1.d() - i1 * 2))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            ObjectInterface objectinterface = d.b();
            a(n, d, a(d), b(d) + 1);
            setText(n);
            b.onParticipantRemoved(this, objectinterface);
        }
        d();
          goto _L7
        i1 = ((flag) ? 1 : 0);
        if (d != null)
        {
            d();
            i1 = 1;
        }
          goto _L4
    }

    public void setExistingParticipants(List list)
    {
        e = list;
        k = new AccessibilityTextDecorator(this);
    }

    public void setParticipantUpdateListener(ParticipantUpdateListener participantupdatelistener)
    {
        b = participantupdatelistener;
    }

}
