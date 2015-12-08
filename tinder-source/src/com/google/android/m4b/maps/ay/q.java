// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.cq.o;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            n, r, m, ac

public final class q extends n
{

    private final r a;
    private final m b;

    public q(r r1, m m1)
    {
        a = r1;
        b = m1;
        if (!r1.a.i(1))
        {
            String s = m1.a("Cohort");
            if (s != null)
            {
                r1.b(s);
            }
        }
        if (!r1.a.i(6))
        {
            m1 = m1.a("LegalCountry");
            if (m1 != null)
            {
                r1.c(m1);
            }
        }
    }

    public final void a(DataOutput dataoutput)
    {
        com.google.android.m4b.maps.ac.c.a(dataoutput, a.a);
    }

    public final boolean a(DataInput datainput)
    {
        datainput = com.google.android.m4b.maps.ac.c.a(o.b, datainput);
        if (datainput.i(1))
        {
            String s = datainput.g(1);
            a.b(s);
            b.a("Cohort", s);
        }
        if (datainput.i(3))
        {
            String s1 = datainput.g(3);
            a.c(s1);
            b.a("LegalCountry", s1);
        }
        if (datainput.i(2))
        {
            Object obj = b;
            a a1 = datainput.f(2);
            if (((m) (obj)).j == null)
            {
                obj.j = new ac();
            }
            datainput = ((m) (obj)).j;
            obj = ((m) (obj)).l;
            datainput.a = a1;
            try
            {
                String s2 = Base64.encodeToString(((ac) (datainput)).a.c(), 0);
                obj = ((SharedPreferences) (obj)).edit();
                ((android.content.SharedPreferences.Editor) (obj)).putString("ShortbreadToken", s2);
                ((android.content.SharedPreferences.Editor) (obj)).commit();
            }
            catch (IOException ioexception)
            {
                datainput.a = null;
                return true;
            }
        }
        return true;
    }

    public final boolean c()
    {
        return false;
    }

    public final boolean d()
    {
        return false;
    }

    public final int g()
    {
        return 62;
    }
}
