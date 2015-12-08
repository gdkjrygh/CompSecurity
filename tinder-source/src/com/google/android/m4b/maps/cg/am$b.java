// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.b;
import com.google.android.m4b.maps.ap.c;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            am, az

public static final class a
{

    private final String a;
    private final Context b;

    public final a a(b b1)
    {
        Object obj1 = null;
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        Object obj2 = com.google.android.m4b.maps.cg.az.a();
        java.io.FileInputStream fileinputstream = b.openFileInput(a);
        if (fileinputstream == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        obj = fileinputstream;
        b1 = new a(b1);
        obj = fileinputstream;
        b1.a(c.a(fileinputstream));
        obj = b1;
        com.google.android.m4b.maps.cg.az.a(obj2);
        c.b(fileinputstream);
        b1 = ((b) (obj));
_L1:
        this;
        JVM INSTR monitorexit ;
        return b1;
        b1;
        fileinputstream = null;
        b1 = obj1;
_L4:
        obj = fileinputstream;
        b.deleteFile(a);
        com.google.android.m4b.maps.cg.az.a(obj2);
        c.b(fileinputstream);
          goto _L1
        b1;
        throw b1;
        b1;
        obj = null;
_L3:
        com.google.android.m4b.maps.cg.az.a(obj2);
        c.b(((java.io.InputStream) (obj)));
        throw b1;
        b1;
        if (true) goto _L3; else goto _L2
_L2:
        b1;
        b1 = obj1;
          goto _L4
        IOException ioexception;
        ioexception;
          goto _L4
    }

    public final void a(a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a1 != null) goto _L2; else goto _L1
_L1:
        b.deleteFile(a);
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        FileOutputStream fileoutputstream = null;
        Object obj = com.google.android.m4b.maps.cg.az.b();
        FileOutputStream fileoutputstream2 = b.openFileOutput(a, 0);
        FileOutputStream fileoutputstream1;
        fileoutputstream = fileoutputstream2;
        fileoutputstream1 = fileoutputstream2;
        fileoutputstream2.write(a1.c());
        com.google.android.m4b.maps.cg.az.a(obj);
        c.a(fileoutputstream2);
          goto _L3
        a1;
        throw a1;
        a1;
        fileoutputstream1 = fileoutputstream;
        b.deleteFile(a);
        com.google.android.m4b.maps.cg.az.a(obj);
        c.a(fileoutputstream);
          goto _L3
_L5:
        com.google.android.m4b.maps.cg.az.a(obj);
        c.a(fileoutputstream1);
        throw a1;
        a1;
        continue; /* Loop/switch isn't completed */
        a1;
        fileoutputstream1 = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public (Context context, String s)
    {
        b = context;
        a = s;
    }
}
