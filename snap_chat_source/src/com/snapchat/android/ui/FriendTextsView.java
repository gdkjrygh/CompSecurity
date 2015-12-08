// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.snapchat.android.Timber;

public class FriendTextsView extends LinearLayout
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/snapchat/android/ui/FriendTextsView$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("HIDDEN", 0);
            b = new a("HIDDEN_TO_SHOWN", 1);
            c = new a("SHOWN", 2);
            d = new a("SHOWN_TO_HIDDEN", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private TextView a;
    private TextView b;
    private a c;
    private int d;

    public FriendTextsView(Context context)
    {
        super(context);
        inflate(getContext(), 0x7f04007e, this);
        a = (TextView)findViewById(0x7f0d01bd);
        b = (TextView)findViewById(0x7f0d02df);
        b.setAlpha(0.0F);
        c = a.a;
    }

    public FriendTextsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        inflate(getContext(), 0x7f04007e, this);
        a = (TextView)findViewById(0x7f0d01bd);
        b = (TextView)findViewById(0x7f0d02df);
        b.setAlpha(0.0F);
        c = a.a;
    }

    public FriendTextsView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        inflate(getContext(), 0x7f04007e, this);
        a = (TextView)findViewById(0x7f0d01bd);
        b = (TextView)findViewById(0x7f0d02df);
        b.setAlpha(0.0F);
        c = a.a;
    }

    static TextView a(FriendTextsView friendtextsview)
    {
        return friendtextsview.b;
    }

    private void a(a a1)
    {
        Timber.c("FriendListItemTextsView", (new StringBuilder("change SecondaryViewStatus FROM ")).append(a.getText()).append(" TO ").append(c).append(" -> ").append(a1).toString(), new Object[0]);
        c = a1;
    }

    static void a(FriendTextsView friendtextsview, a a1)
    {
        friendtextsview.a(a1);
    }

    public final void a(boolean flag)
    {
        if (TextUtils.isEmpty(b.getText()))
        {
            b(false);
            return;
        }
        static final class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3.a[c.ordinal()];
        JVM INSTR tableswitch 1 3: default 56
    //                   1 57
    //                   2 56
    //                   3 94;
           goto _L1 _L2 _L1 _L3
_L1:
        return;
_L2:
        if (flag)
        {
            a(a.b);
            a.animate().translationY(0.0F).setListener(new android.animation.Animator.AnimatorListener() {

                private FriendTextsView a;

                public final void onAnimationCancel(Animator animator)
                {
                    FriendTextsView.a(a, a.a);
                }

                public final void onAnimationEnd(Animator animator)
                {
                    FriendTextsView.a(a, a.c);
                    FriendTextsView.a(a).setAlpha(1.0F);
                }

                public final void onAnimationRepeat(Animator animator)
                {
                }

                public final void onAnimationStart(Animator animator)
                {
                }

            
            {
                a = FriendTextsView.this;
                super();
            }
            }).start();
            return;
        } else
        {
            a.setTranslationY(0.0F);
            b.setAlpha(1.0F);
            a(a.c);
            return;
        }
_L3:
        a.animate().cancel();
          goto _L2
    }

    public final void b(boolean flag)
    {
        switch (_cls3.a[c.ordinal()])
        {
        case 3: // '\003'
        default:
            return;

        case 4: // '\004'
            a.animate().cancel();
            break;

        case 2: // '\002'
            break;
        }
        if (flag)
        {
            a(a.d);
            a.animate().translationY(b.getMeasuredHeight() / 2).setListener(new android.animation.Animator.AnimatorListener() {

                private FriendTextsView a;

                public final void onAnimationCancel(Animator animator)
                {
                    FriendTextsView.a(a, a.c);
                }

                public final void onAnimationEnd(Animator animator)
                {
                    FriendTextsView.a(a).setAlpha(0.0F);
                    FriendTextsView.a(a, a.a);
                }

                public final void onAnimationRepeat(Animator animator)
                {
                }

                public final void onAnimationStart(Animator animator)
                {
                }

            
            {
                a = FriendTextsView.this;
                super();
            }
            }).start();
            return;
        } else
        {
            a.setTranslationY(b.getMeasuredHeight() / 2);
            b.setAlpha(0.0F);
            a(a.a);
            return;
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        i = b.getMeasuredHeight();
        if (d == i) goto _L2; else goto _L1
_L1:
        d = i;
        _cls3.a[c.ordinal()];
        JVM INSTR tableswitch 1 2: default 60
    //                   1 61
    //                   2 79;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        a.setTranslationY(b.getMeasuredHeight() / 2);
        return;
_L4:
        a.setTranslationY(0.0F);
        return;
    }

    public void setPrimaryText(CharSequence charsequence)
    {
        a.setText(charsequence);
    }

    public void setSecondaryText(CharSequence charsequence)
    {
        b.setText(charsequence);
    }

    public void setTextColor(int i)
    {
        a.setTextColor(i);
        b.setTextColor(i);
    }
}
