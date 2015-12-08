// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Bt;
import PB;
import android.content.Context;
import android.util.AttributeSet;
import com.snapchat.android.Timber;
import com.snapchat.android.database.SharedPreferenceKey;

// Referenced classes of package com.snapchat.android.ui:
//            VerticalSwipeLayout

public class InAppPromptFlipper extends VerticalSwipeLayout
{

    private boolean a;

    public InAppPromptFlipper(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, new PB(), Bt.a());
    }

    InAppPromptFlipper(Context context, AttributeSet attributeset, PB pb, Bt bt)
    {
        super(context, attributeset);
        a = false;
        a(1, 0.0D);
        a(new VerticalSwipeLayout.a() {

            private InAppPromptFlipper a;

            public final void a(int i, int j, int k)
            {
            }

            public final void b(int i, int j, int k)
            {
            }

            public final void b_(int i)
            {
                switch (i)
                {
                default:
                    return;

                case 0: // '\0'
                    InAppPromptFlipper.a(a);
                    return;

                case 1: // '\001'
                    break;
                }
                if (InAppPromptFlipper.b(a))
                {
                    InAppPromptFlipper.c();
                }
                a.setVisibility(8);
            }

            
            {
                a = InAppPromptFlipper.this;
                super();
            }
        });
    }

    static boolean a(InAppPromptFlipper inapppromptflipper)
    {
        inapppromptflipper.a = true;
        return true;
    }

    static boolean b(InAppPromptFlipper inapppromptflipper)
    {
        return inapppromptflipper.a;
    }

    static void c()
    {
        long l = System.currentTimeMillis();
        if (l > Bt.bk())
        {
            SharedPreferenceKey.SUGGESTION_PROMPT_LAST_DISMISSED_TIMESTAMP.putLong(l);
        }
        Timber.c("UpgradePromptView", (new StringBuilder("onPanelSelected - setSuggestionPromptLastDismissedTimestamp ")).append(Bt.bk()).toString(), new Object[0]);
    }

    public final void a()
    {
        Timber.c("UpgradePromptView", "showPrompt()", new Object[0]);
        post(new Runnable() {

            final InAppPromptFlipper a;

            public final void run()
            {
                a.setVisibility(0);
                a.post(new Runnable(this) {

                    private _cls2 a;

                    public final void run()
                    {
                        a.a.a(0, 1.5D);
                    }

            
            {
                a = _pcls2;
                super();
            }
                });
            }

            
            {
                a = InAppPromptFlipper.this;
                super();
            }
        });
    }

    public final void b()
    {
        a = false;
        a(1, 1.0D);
    }
}
