// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import org.json.JSONException;

public class o extends JSONException
{

    private final String a;

    public o(String s, String s1)
    {
        super(s);
        a = s1;
    }

    public String a()
    {
        return a;
    }
}
