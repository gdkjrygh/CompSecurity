// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.d;

import java.io.Closeable;
import java.io.IOException;

public class c
{

    public static transient void a(Closeable acloseable[])
    {
        if (acloseable != null)
        {
            int j = acloseable.length;
            int i = 0;
            while (i < j) 
            {
                Closeable closeable = acloseable[i];
                if (closeable != null)
                {
                    try
                    {
                        closeable.close();
                    }
                    catch (IOException ioexception) { }
                }
                i++;
            }
        }
    }
}
