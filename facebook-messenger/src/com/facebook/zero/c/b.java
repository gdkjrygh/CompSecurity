// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.c;

import android.preference.Preference;

// Referenced classes of package com.facebook.zero.c:
//            a

class b
    implements android.preference.Preference.OnPreferenceClickListener
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        com.facebook.zero.c.a.a(a);
        return true;
    }
}
