// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

final class hxa extends mtf
{

    private hwy a;

    hxa(hwy hwy1, Context context, String s)
    {
        a = hwy1;
        super(context, s);
    }

    protected final mue a()
    {
        Object obj = a.a;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = new ObjectOutputStream(new BufferedOutputStream(a.c.openFileOutput("photosOnDeviceSearchHistory", 0)));
        ((ObjectOutput) (obj1)).writeObject(a.d);
        ((ObjectOutput) (obj1)).close();
        obj1 = new mue(true);
        obj;
        JVM INSTR monitorexit ;
        return ((mue) (obj1));
        Exception exception1;
        exception1;
        Exception exception;
        try
        {
            ((ObjectOutput) (obj1)).close();
            throw exception1;
        }
        catch (IOException ioexception) { }
        finally { }
        Log.e("OnDeviceHistory", "I/O error. Gave up saving local searches.");
        ioexception = new mue(false);
        obj;
        JVM INSTR monitorexit ;
        return ioexception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
