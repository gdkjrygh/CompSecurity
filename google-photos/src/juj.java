// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.RemoteException;
import com.google.android.gms.cast.LaunchOptions;
import java.io.IOException;
import java.util.Map;

public class juj
{

    public juj()
    {
    }

    public double a(jyn jyn1)
    {
        jyn1 = (jwh)jyn1.a(jww.a);
        jyn1.f();
        return ((jwh) (jyn1)).c;
    }

    public jyt a(jyn jyn1, String s, LaunchOptions launchoptions)
    {
        return jyn1.b(new jul(this, jyn1, s, launchoptions));
    }

    public jyt a(jyn jyn1, String s, String s1)
    {
        return jyn1.b(new juk(this, jyn1, s, s1));
    }

    public jyt a(jyn jyn1, String s, boolean flag)
    {
        jvo jvo1 = new jvo();
        jvo1.a.b = flag;
        return a(jyn1, s, jvo1.a);
    }

    public void a(jyn jyn1, double d)
    {
        try
        {
            jyn1 = (jwh)jyn1.a(jww.a);
            if (Double.isInfinite(d) || Double.isNaN(d))
            {
                throw new IllegalArgumentException((new StringBuilder("Volume cannot be ")).append(d).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (jyn jyn1)
        {
            throw new IOException("service error");
        }
        ((jwr)jyn1.o()).a(d, ((jwh) (jyn1)).c, ((jwh) (jyn1)).b);
        return;
    }

    public void a(jyn jyn1, String s, jup jup)
    {
        jwh jwh1;
        try
        {
            jwh1 = (jwh)jyn1.a(jww.a);
            jwo.a(s);
            jwh1.a(s);
        }
        // Misplaced declaration of an exception variable
        catch (jyn jyn1)
        {
            throw new IOException("service error");
        }
        if (jup == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        synchronized (jwh1.a)
        {
            jwh1.a.put(s, jup);
        }
        ((jwr)jwh1.o()).b(s);
        return;
        s;
        jyn1;
        JVM INSTR monitorexit ;
        throw s;
    }
}
