// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.content.SharedPreferences;
import com.google.android.libraries.translate.d.g;
import com.google.android.libraries.translate.e.d;
import com.google.android.libraries.translate.e.k;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            ad, aj, e, TranslateLocationProfileProf, 
//            j

final class ak extends k
{

    final g a;
    final j b;
    final aj c;

    ak(aj aj1, g g1, j j)
    {
        c = aj1;
        a = g1;
        b = j;
        super();
    }

    private transient Void a()
    {
        try
        {
            d.a(a.a(((ad) (c)).c));
            if (c.j.b(b, c.b(c.j, c.a, c.b)))
            {
                c.k = ((TranslateLocationProfileProf)c.i).h;
                c.d.edit().putInt("key_rr_version", c.k).commit();
            }
        }
        catch (Exception exception) { }
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }
}
