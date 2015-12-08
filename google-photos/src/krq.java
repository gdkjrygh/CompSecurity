// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.UnsupportedEncodingException;

public class krq extends kyw
{

    private final lac k;

    private krq(int i, String s, lac lac1, lab lab)
    {
        super(0, s, lab);
        k = lac1;
    }

    public krq(String s, lac lac1, lab lab)
    {
        this(0, s, lac1, lab);
    }

    protected final laa a(kwt kwt1)
    {
        String s;
        try
        {
            s = new String(kwt1.a, b.a(kwt1.b));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception = new String(kwt1.a);
        }
        return new laa(s, b.a(kwt1));
    }

    protected final void a(Object obj)
    {
        obj = (String)obj;
        k.a(obj);
    }
}
