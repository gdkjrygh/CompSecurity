// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget.preferences;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import kik.android.chat.fragment.settings.d;

// Referenced classes of package kik.android.widget.preferences:
//            KikPreferenceScreen

public class DevelopersPreference extends KikPreferenceScreen
{

    public DevelopersPreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, null);
    }

    public DevelopersPreference(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, null);
    }

    public boolean onPreferenceClick(Preference preference)
    {
        kik.android.chat.fragment.KikScopedDialogFragment kikscopeddialogfragment = b();
        if (kikscopeddialogfragment instanceof d)
        {
            ((d)kikscopeddialogfragment).b();
        }
        return super.onPreferenceClick(preference);
    }
}
