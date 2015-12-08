// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

public class jua extends jtx
{

    private final Intent a;

    public jua(String s, Intent intent)
    {
        super(s);
        a = intent;
    }

    public final Intent a()
    {
        if (a == null)
        {
            return null;
        } else
        {
            return new Intent(a);
        }
    }
}
