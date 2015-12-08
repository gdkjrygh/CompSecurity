// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import com.kik.e.a;
import kik.a.e.w;
import kik.android.chat.fragment.settings.d;

// Referenced classes of package kik.android.widget.preferences:
//            KikModalPreference

public class HelpPreference extends KikModalPreference
{

    w a;

    public HelpPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, com.kik.d.b.a.c.r);
    }

    public final void a(a a1)
    {
        a1.a(this);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        preference = b();
        if (preference instanceof d)
        {
            ((d)preference).b();
        }
        return false;
    }
}
