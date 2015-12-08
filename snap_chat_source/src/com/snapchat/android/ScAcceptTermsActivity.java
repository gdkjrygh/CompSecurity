// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android;

import S;
import V;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.snapchat.android.fragments.ScAcceptTermsFragment;
import com.snapchat.android.util.fragment.SnapchatFragment;

// Referenced classes of package com.snapchat.android:
//            SnapchatActivity

public class ScAcceptTermsActivity extends SnapchatActivity
{

    public ScAcceptTermsActivity()
    {
    }

    public void onBackPressed()
    {
        Object obj = super.mFragments;
        int i = ((S) (obj)).e();
        if (i > 0)
        {
            obj = (SnapchatFragment)((S) (obj)).a(((S) (obj)).c(i - 1).c());
            if (obj != null && ((SnapchatFragment) (obj)).f())
            {
                return;
            }
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0400bb);
        bundle = super.mFragments;
        if (bundle.a(0x7f0d03f5) == null)
        {
            ScAcceptTermsFragment scaccepttermsfragment = new ScAcceptTermsFragment();
            bundle.a().a(0x7f0d03f5, scaccepttermsfragment, "ScAcceptTermsFragment").a("ScAcceptTermsFragment").a();
        }
    }
}
