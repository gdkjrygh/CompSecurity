// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

public class jyg extends Exception
{

    private final Intent a;

    public jyg(String s, Intent intent)
    {
        super(s);
        a = intent;
    }

    public final Intent a()
    {
        return new Intent(a);
    }
}
