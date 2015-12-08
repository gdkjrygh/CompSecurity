// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.c;

import java.io.File;

final class d extends Thread
{

    private final String a;

    d(String s)
    {
        a = s;
        super();
    }

    public final void run()
    {
        File file = new File(a);
        if (file.exists())
        {
            file.delete();
        }
    }
}
