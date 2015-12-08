// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import kik.android.chat.activity.k;

// Referenced classes of package kik.android.widget.preferences:
//            KikPreference

public class AbTestsPreference extends KikPreference
{

    public AbTestsPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, null);
    }

    public AbTestsPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, null);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        k.a(new kik.android.chat.fragment.AbTestsFragment.f(), getContext()).f();
        return false;
    }
}
