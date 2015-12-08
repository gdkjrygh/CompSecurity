// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.here;

import Ic;
import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.videochat.view.HoldToStreamView;
import com.snapchat.videochat.view.LocalPreview;

public class HereTooltip extends RelativeLayout
{

    public final SharedPreferences a;
    private boolean b;
    private long c;
    private TextView d;

    public HereTooltip(Context context)
    {
        this(context, null);
    }

    public HereTooltip(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(0x7f04008a, this, true);
        d = (TextView)findViewById(0x7f0d011d);
        c = 0L;
        a = PreferenceManager.getDefaultSharedPreferences(context);
        setAlpha(0.0F);
    }

    private static boolean a()
    {
        return Ic.b() && LocalPreview.a();
    }

    public final void a(ChatConversation chatconversation, boolean flag)
    {
        boolean flag1;
        flag1 = true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        if (!chatconversation.mIsRecipientPresent) goto _L2; else goto _L1
_L1:
        boolean flag3;
        flag = a();
        flag3 = chatconversation.mRecipientSupportsHere;
        if (flag && flag3) goto _L4; else goto _L3
_L3:
        int i = 0;
_L6:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        flag = flag1;
_L7:
        if (b != flag)
        {
            TextView textview = d;
            boolean flag2 = a();
            boolean flag4 = chatconversation.mRecipientSupportsHere;
            int j;
            if (!flag2)
            {
                i = 0x7f0801a0;
            } else
            if (!flag4)
            {
                i = 0x7f08019f;
            } else
            if (HoldToStreamView.i)
            {
                i = 0x7f080176;
            } else
            {
                i = 0x7f080153;
            }
            textview.setText(i);
            a(flag);
        }
        return;
_L4:
        j = a.getInt(SharedPreferenceKey.TIMES_DISPLAYED_HERE_TOOLTIP.getKey(), 0);
        if (System.currentTimeMillis() - c < 7000L)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (j >= 3 && i == 0) goto _L2; else goto _L5
_L5:
        i = 1;
          goto _L6
_L2:
        i = 0;
          goto _L6
        flag = false;
          goto _L7
    }

    public final void a(boolean flag)
    {
        if (flag == b)
        {
            return;
        }
        b = flag;
        c = 0L;
        ViewPropertyAnimator viewpropertyanimator = animate();
        float f;
        if (flag)
        {
            f = 1.0F;
        } else
        {
            f = 0.0F;
        }
        viewpropertyanimator.alpha(f);
        viewpropertyanimator.setDuration(1000L);
        if (flag)
        {
            viewpropertyanimator.setListener(new android.animation.Animator.AnimatorListener(viewpropertyanimator) {

                private ViewPropertyAnimator a;

                public final void onAnimationCancel(Animator animator)
                {
                }

                public final void onAnimationEnd(Animator animator)
                {
                    a.setListener(null);
                    a.alpha(0.0F);
                    a.setDuration(1000L);
                    a.setStartDelay(3000L);
                    a.start();
                }

                public final void onAnimationRepeat(Animator animator)
                {
                }

                public final void onAnimationStart(Animator animator)
                {
                }

            
            {
                a = viewpropertyanimator;
                super();
            }
            });
            int i = a.getInt(SharedPreferenceKey.TIMES_DISPLAYED_HERE_TOOLTIP.getKey(), 0);
            android.content.SharedPreferences.Editor editor = a.edit();
            editor.putInt(SharedPreferenceKey.TIMES_DISPLAYED_HERE_TOOLTIP.getKey(), i + 1);
            editor.apply();
        }
        viewpropertyanimator.setStartDelay(0L);
        viewpropertyanimator.start();
    }

    public void setCancelInChatSnapTime(long l)
    {
        c = l;
    }
}
