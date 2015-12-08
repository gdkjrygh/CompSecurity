// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import com.crittercism.app.CrittercismConfig;
import java.util.List;

// Referenced classes of package b.a:
//            ay

public final class ab extends CrittercismConfig
{

    private String b;
    private ay c;

    public ab(ay ay1, CrittercismConfig crittercismconfig)
    {
        super(crittercismconfig);
        b = "524c99a04002057fcd000001";
        c = ay1;
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof ab))
        {
            return false;
        }
        ab ab1 = (ab)obj;
        return super.equals(obj) && a(c.a(), ab1.c.a()) && a(c.b(), ab1.c.b()) && a(c.d(), ab1.c.d()) && a(c.c(), ab1.c.c()) && a(b, ab1.b);
    }

    public final int hashCode()
    {
        return ((((super.hashCode() * 31 + c.a().hashCode()) * 31 + c.b().hashCode()) * 31 + c.d().hashCode()) * 31 + c.c().hashCode()) * 31 + b.hashCode();
    }

    public final List j()
    {
        List list = super.j();
        list.add(c.b());
        return list;
    }

    public final String k()
    {
        return c.a();
    }

    public final String l()
    {
        return c.b();
    }

    public final String m()
    {
        return c.d();
    }

    public final String n()
    {
        return c.c();
    }

    public final String o()
    {
        return b;
    }

    public final String p()
    {
        return a;
    }
}
