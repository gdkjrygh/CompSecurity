// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

final class ng.String extends XJ
{

    private Yz a;
    private a b;

    public final void a()
    {
        try
        {
            Yy.f(b.b).a(a);
            return;
        }
        catch (IOException ioexception)
        {
            XH.a.log(Level.INFO, (new StringBuilder("StreamHandler failure for ")).append(Yy.a(b.b)).toString(), ioexception);
        }
        try
        {
            a.a(Yk.b);
            return;
        }
        catch (IOException ioexception1)
        {
            return;
        }
    }

    transient ng.Object(ct ct, String s, Object aobj[], Yz yz)
    {
        b = ct;
        a = yz;
        super(s, aobj);
    }
}
