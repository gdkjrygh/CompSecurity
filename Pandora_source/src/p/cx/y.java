// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import org.json.JSONObject;

public class y extends Exception
{

    private final int a;
    private final JSONObject b;
    private final String c;

    public y(int i, String s, JSONObject jsonobject, String s1)
    {
        super(s);
        a = i;
        b = jsonobject;
        c = s1;
    }

    public int a()
    {
        return a;
    }

    public JSONObject b()
    {
        return b;
    }
}
