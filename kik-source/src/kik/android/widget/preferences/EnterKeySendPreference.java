// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import kik.android.chat.a.a;

// Referenced classes of package kik.android.widget.preferences:
//            KikCheckBoxPreference

public class EnterKeySendPreference extends KikCheckBoxPreference
{

    private a b;

    public EnterKeySendPreference(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x101008f);
    }

    public EnterKeySendPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, com.kik.d.b.a.c.p);
    }

    public final void a(a a1)
    {
        b = a1;
    }

    public boolean onPreferenceChange(Preference preference, Object obj)
    {
        if ((obj instanceof Boolean) && b != null)
        {
            b.a(((Boolean)obj).booleanValue());
        }
        return true;
    }
}
