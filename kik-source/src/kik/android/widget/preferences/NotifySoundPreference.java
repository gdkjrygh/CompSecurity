// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;

// Referenced classes of package kik.android.widget.preferences:
//            KikCheckBoxPreference

public class NotifySoundPreference extends KikCheckBoxPreference
{

    public NotifySoundPreference(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101008f);
    }

    public NotifySoundPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, com.kik.d.b.a.c.b);
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        return true;
    }
}
