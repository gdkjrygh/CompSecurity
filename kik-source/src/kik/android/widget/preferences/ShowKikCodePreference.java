// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import com.kik.e.a;
import kik.android.chat.activity.k;

// Referenced classes of package kik.android.widget.preferences:
//            KikPreference

public class ShowKikCodePreference extends KikPreference
{

    Context b;

    public ShowKikCodePreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, null);
        b = context;
    }

    public ShowKikCodePreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, null);
        b = context;
    }

    public final void a(a a1)
    {
        a1.a(this);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        k.a((new kik.android.chat.fragment.ScanCodeTabFragment.a()).a(true).a(kik.android.chat.fragment.ScanCodeTabFragment.c.b), b).f();
        return true;
    }
}
