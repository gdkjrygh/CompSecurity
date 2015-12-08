// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedList;

final class hwz extends mtf
{

    private hwy a;

    hwz(hwy hwy1, Context context, String s)
    {
        a = hwy1;
        super(context, s);
    }

    protected final mue a()
    {
        Object obj4 = a.a;
        obj4;
        JVM INSTR monitorenter ;
        Object obj2 = new LinkedList();
        ObjectInputStream objectinputstream = new ObjectInputStream(new BufferedInputStream(a.c.openFileInput("photosOnDeviceSearchHistory")));
        Object obj = (LinkedList)objectinputstream.readObject();
        objectinputstream.close();
_L1:
        obj2 = new mue(true);
        ((mue) (obj2)).a().putCharSequenceArrayList("file_entries", new ArrayList(((java.util.Collection) (obj))));
        obj4;
        JVM INSTR monitorexit ;
        return ((mue) (obj2));
        obj;
        objectinputstream.close();
        throw obj;
        Object obj1;
        obj1;
        obj1 = obj2;
_L3:
        Log.w("OnDeviceHistory", "Cannot perform input. Class not found.");
          goto _L1
        obj1;
        obj4;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        obj1 = obj2;
_L2:
        Log.w("OnDeviceHistory", "I/O error. Gave up reading local searches.");
          goto _L1
        Object obj3;
        obj3;
          goto _L2
        obj3;
          goto _L3
    }
}
