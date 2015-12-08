// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.objects;

import java.io.Serializable;

public class ErrorObject
    implements Serializable
{

    private static final long serialVersionUID = 0x14ede2a74a40f08cL;
    private int code;
    private String message;

    public ErrorObject()
    {
    }

    public int a()
    {
        return code;
    }

    public void a(int i)
    {
        code = i;
    }

    public void a(String s)
    {
        message = s;
    }

    public String b()
    {
        return message;
    }
}
