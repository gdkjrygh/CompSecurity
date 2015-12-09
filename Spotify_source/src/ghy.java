// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.text.DateFormat;
import java.util.Date;

final class ghy
{

    char a;
    String b;
    String c;
    Throwable d;
    long e;

    private ghy()
    {
    }

    ghy(byte byte0)
    {
        this();
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(a);
        stringbuilder.append('\t');
        ghx.a().setTime(e);
        synchronized (ghx.b())
        {
            stringbuilder.append(ghx.b().format(ghx.a()));
        }
        stringbuilder.append('\t');
        stringbuilder.append(b);
        stringbuilder.append('\t');
        stringbuilder.append(c);
        if (d != null)
        {
            stringbuilder.append(' ');
            stringbuilder.append(Log.getStackTraceString(d));
        }
        return stringbuilder.toString();
        exception;
        dateformat;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
