// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.snapchat.android.fragments:
//            ScAcceptTermsFragment

final class a
    implements android.view.lLayoutListener
{

    private ScAcceptTermsFragment a;

    public final void onGlobalLayout()
    {
label0:
        {
            ScAcceptTermsFragment.a(a);
            if (ScAcceptTermsFragment.b(a).getViewTreeObserver().isAlive())
            {
                if (android.os.ve < 16)
                {
                    break label0;
                }
                ScAcceptTermsFragment.c(a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            return;
        }
        ScAcceptTermsFragment.d(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    (ScAcceptTermsFragment scaccepttermsfragment)
    {
        a = scaccepttermsfragment;
        super();
    }
}
