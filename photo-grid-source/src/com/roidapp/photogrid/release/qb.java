// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            Preference

final class qb
    implements android.view.View.OnClickListener
{

    final Preference a;

    qb(Preference preference)
    {
        a = preference;
        super();
    }

    public final void onClick(View view)
    {
        if (Preference.a(a))
        {
            Preference.b(a);
            return;
        } else
        {
            Preference.c(a);
            return;
        }
    }
}
