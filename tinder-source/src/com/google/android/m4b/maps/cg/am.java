// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import com.google.android.m4b.maps.ac.a;
import com.google.android.m4b.maps.ac.c;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.n;
import com.google.android.m4b.maps.ay.u;
import com.google.android.m4b.maps.cq.i;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            az

public final class am
{
    final class a extends n
    {

        private int a;
        private am b;

        public final void a()
        {
            synchronized (b)
            {
                a = 0;
                b.c = false;
            }
            return;
            exception;
            am1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void a(DataOutput dataoutput)
        {
            synchronized (b)
            {
                com.google.android.m4b.maps.ac.a a1 = b.b.a(i.a);
                a = a1.j(1);
                com.google.android.m4b.maps.ac.c.a(dataoutput, a1);
            }
            return;
            dataoutput;
            am1;
            JVM INSTR monitorexit ;
            throw dataoutput;
        }

        public final boolean a(DataInput datainput)
        {
            switch (com.google.android.m4b.maps.ac.c.a(i.c, datainput).d(1))
            {
            case 0: // '\0'
            default:
                return true;

            case 1: // '\001'
                ab.a("This application has been blocked by the Google Maps API. This might be because of an incorrectly registered key.");
                b.a.f();
                return true;

            case 2: // '\002'
                ab.a("This application has exceeded its quota for the Google Maps API.");
                break;
            }
            b.a.f();
            return true;
        }

        public final void b()
        {
            int j;
            j = 0;
            super.b();
            am am1 = b;
            am1;
            JVM INSTR monitorenter ;
            com.google.android.m4b.maps.ac.a a1;
            int k;
            a1 = b.b.a(i.a);
            k = Math.min(a, a1.j(1));
_L2:
            if (j >= k)
            {
                break; /* Loop/switch isn't completed */
            }
            a1.e(1, 0);
            j++;
            if (true) goto _L2; else goto _L1
_L1:
            b.b.a(a1);
            a = 0;
            b.c = false;
            am1;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            am1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final int g()
        {
            return 147;
        }

        a()
        {
            b = am.this;
            super();
        }
    }

    public static final class b
    {

        private final String a;
        private final Context b;

        public final com.google.android.m4b.maps.ac.a a(com.google.android.m4b.maps.ac.b b1)
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
            b1 = new com.google.android.m4b.maps.ac.a(b1);
            obj = fileinputstream;
            b1.a(com.google.android.m4b.maps.ap.c.a(fileinputstream));
            obj = b1;
            com.google.android.m4b.maps.cg.az.a(obj2);
            com.google.android.m4b.maps.ap.c.b(fileinputstream);
            b1 = ((com.google.android.m4b.maps.ac.b) (obj));
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
            com.google.android.m4b.maps.ap.c.b(fileinputstream);
              goto _L1
            b1;
            throw b1;
            b1;
            obj = null;
_L3:
            com.google.android.m4b.maps.cg.az.a(obj2);
            com.google.android.m4b.maps.ap.c.b(((java.io.InputStream) (obj)));
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

        public final void a(com.google.android.m4b.maps.ac.a a1)
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
            Object obj = az.b();
            FileOutputStream fileoutputstream2 = b.openFileOutput(a, 0);
            FileOutputStream fileoutputstream1;
            fileoutputstream = fileoutputstream2;
            fileoutputstream1 = fileoutputstream2;
            fileoutputstream2.write(a1.c());
            com.google.android.m4b.maps.cg.az.a(obj);
            com.google.android.m4b.maps.ap.c.a(fileoutputstream2);
              goto _L3
            a1;
            throw a1;
            a1;
            fileoutputstream1 = fileoutputstream;
            b.deleteFile(a);
            com.google.android.m4b.maps.cg.az.a(obj);
            com.google.android.m4b.maps.ap.c.a(fileoutputstream);
              goto _L3
_L5:
            com.google.android.m4b.maps.cg.az.a(obj);
            com.google.android.m4b.maps.ap.c.a(fileoutputstream1);
            throw a1;
            a1;
            continue; /* Loop/switch isn't completed */
            a1;
            fileoutputstream1 = null;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public b(Context context, String s)
        {
            b = context;
            a = s;
        }
    }


    final u a;
    final b b;
    boolean c;

    public am(u u1, b b1)
    {
        a = u1;
        b = b1;
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            c = true;
            a.c(new a());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    final void a()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.m4b.maps.ac.a a2 = b.a(i.a);
        com.google.android.m4b.maps.ac.a a1;
        a1 = a2;
        if (a2 != null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        a1 = new com.google.android.m4b.maps.ac.a(i.a);
        com.google.android.m4b.maps.ac.a a3 = new com.google.android.m4b.maps.ac.a(i.b);
        a3.a(1, 1);
        a1.a(1, a3);
        b.a(a1);
        b();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
