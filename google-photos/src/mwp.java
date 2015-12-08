// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import com.google.android.libraries.social.settings.LabelPreference;

final class mwp
    implements oab
{

    private mwo a;

    mwp(mwo mwo1)
    {
        a = mwo1;
        super();
    }

    public final boolean s()
    {
        boolean flag = false;
        Object obj = oam.b(mwo.a(a));
        if (!((SharedPreferences) (obj)).getBoolean("net_netlogs_key", false))
        {
            flag = true;
        }
        obj = ((SharedPreferences) (obj)).edit();
        LabelPreference labelpreference;
        if (flag)
        {
            npi.a(mwo.b(a));
        } else
        {
            npi.b(mwo.c(a));
        }
        ((android.content.SharedPreferences.Editor) (obj)).putBoolean("net_netlogs_key", flag);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        labelpreference = mwo.d(a);
        if (flag)
        {
            obj = "ON";
        } else
        {
            obj = "OFF";
        }
        labelpreference.a(((CharSequence) (obj)));
        return true;
    }
}
