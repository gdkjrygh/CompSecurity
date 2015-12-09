// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c;


public final class i extends Enum
{

    public static final i DELETE;
    public static final i GET;
    public static final i HEAD;
    public static final i OPTIONS;
    public static final i POST;
    public static final i PUT;
    public static final i TRACE;
    private static final i a[];

    private i(String s, int j)
    {
        super(s, j);
    }

    public static i valueOf(String s)
    {
        return (i)Enum.valueOf(org/c/c/i, s);
    }

    public static i[] values()
    {
        return (i[])a.clone();
    }

    static 
    {
        GET = new i("GET", 0);
        POST = new i("POST", 1);
        HEAD = new i("HEAD", 2);
        OPTIONS = new i("OPTIONS", 3);
        PUT = new i("PUT", 4);
        DELETE = new i("DELETE", 5);
        TRACE = new i("TRACE", 6);
        a = (new i[] {
            GET, POST, HEAD, OPTIONS, PUT, DELETE, TRACE
        });
    }
}
