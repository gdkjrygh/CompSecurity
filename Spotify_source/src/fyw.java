// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;

public final class fyw
{

    public static Flags a(Activity activity)
    {
        Assertion.a(activity);
        activity = activity.getIntent();
        Assertion.a(activity, "The activity must have an Intent");
        return a(((Intent) (activity)));
    }

    public static Flags a(Intent intent)
    {
        Assertion.a(intent, "The Intent must not be null");
        intent = (Flags)intent.getParcelableExtra("FlagsArgumentHelper.Flags");
        Assertion.a(intent, "The Activity must have a Flags argument");
        return intent;
    }

    public static Flags a(Bundle bundle)
    {
        Assertion.a(bundle);
        Assertion.a(bundle.containsKey("FlagsArgumentHelper.Flags"), "The Bundle must have a Flags argument");
        return (Flags)bundle.getParcelable("FlagsArgumentHelper.Flags");
    }

    public static Flags a(Fragment fragment)
    {
        Assertion.a(fragment);
        fragment = fragment.g();
        Assertion.a(fragment, "The Fragment must have an argument Bundle");
        fragment = a(((Bundle) (fragment)));
        Assertion.a(fragment, "The Fragment must have a Flags argument");
        return fragment;
    }

    public static void a(Intent intent, Flags flags)
    {
        ctz.a(flags);
        intent.putExtra("FlagsArgumentHelper.Flags", flags);
    }

    public static void a(Fragment fragment, Flags flags)
    {
        ctz.a(flags);
        Bundle bundle1 = fragment.g();
        Bundle bundle = bundle1;
        if (bundle1 == null)
        {
            bundle = new Bundle();
            fragment.f(bundle);
        }
        bundle.putParcelable("FlagsArgumentHelper.Flags", flags);
    }
}
