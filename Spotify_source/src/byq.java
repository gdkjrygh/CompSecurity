// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.internal.zzk;
import java.io.UnsupportedEncodingException;

public class byq extends zzk
{

    private final cnd j;

    private byq(String s, cnd cnd1, cnc cnc)
    {
        super(s, cnc);
        j = cnd1;
    }

    public byq(String s, cnd cnd1, cnc cnc, byte byte0)
    {
        this(s, cnd1, cnc);
    }

    protected final cnb a(cjd cjd1)
    {
        String s;
        try
        {
            s = new String(cjd1.a, coy.a(cjd1.b, "ISO-8859-1"));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception = new String(cjd1.a);
        }
        return cnb.a(s, coy.a(cjd1));
    }

    protected final void a(Object obj)
    {
        obj = (String)obj;
        j.a(obj);
    }
}
