// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.velour.a;

import com.google.android.libraries.velour.e;
import java.io.IOException;
import java.util.Map;
import java.util.jar.JarFile;

public final class b
{

    public final ClassLoader a;
    final Map b;
    final Object c;
    public final e d;
    int e;
    private final String f;
    private final JarFile g;

    final void a()
    {
        if (g != null)
        {
            try
            {
                g.close();
            }
            catch (IOException ioexception) { }
        }
        e = 2;
    }

    public final void finalize()
    {
        synchronized (c)
        {
            if (e != 2)
            {
                if (g != null)
                {
                    String s = String.valueOf(this);
                    (new StringBuilder(String.valueOf(s).length() + 19)).append("LEAK!!! ").append(s).append(" not closed");
                }
                a();
            }
        }
        super.finalize();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("JarHandle{")).append(f).append(", file=");
        String s;
        if (g != null)
        {
            s = g.getName();
        } else
        {
            s = "null";
        }
        return stringbuilder.append(s).append(", state=").append(e).append("}").toString();
    }
}
