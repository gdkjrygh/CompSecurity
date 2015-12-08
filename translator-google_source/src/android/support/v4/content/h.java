// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.v4.os.OperationCanceledException;
import android.support.v4.os.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

// Referenced classes of package android.support.v4.content:
//            a, q, p, c

public final class h extends android.support.v4.content.a
{

    final q f = new q(this);
    Uri g;
    String h[];
    String i;
    String j[];
    String k;
    Cursor l;
    a m;

    public h(Context context, Uri uri, String as[])
    {
        super(context);
        g = uri;
        h = as;
        i = null;
        j = null;
        k = null;
    }

    private void a(Cursor cursor)
    {
        if (super.t)
        {
            if (cursor != null)
            {
                cursor.close();
            }
        } else
        {
            Cursor cursor1 = l;
            l = cursor;
            if (super.r)
            {
                super.b(cursor);
            }
            if (cursor1 != null && cursor1 != cursor && !cursor1.isClosed())
            {
                cursor1.close();
                return;
            }
        }
    }

    private Cursor o()
    {
        this;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (super.b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        throw new OperationCanceledException();
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        m = new a();
        this;
        JVM INSTR monitorexit ;
        Cursor cursor = android.support.v4.content.c.a(super.q.getContentResolver(), g, h, i, j, k, m);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        cursor.getCount();
        cursor.registerContentObserver(f);
        this;
        JVM INSTR monitorenter ;
        m = null;
        this;
        JVM INSTR monitorexit ;
        return cursor;
        RuntimeException runtimeexception;
        runtimeexception;
        cursor.close();
        throw runtimeexception;
        Exception exception1;
        exception1;
        this;
        JVM INSTR monitorenter ;
        m = null;
        this;
        JVM INSTR monitorexit ;
        throw exception1;
        exception1;
        this;
        JVM INSTR monitorexit ;
        throw exception1;
        exception1;
        this;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    public final void a(Object obj)
    {
        obj = (Cursor)obj;
        if (obj != null && !((Cursor) (obj)).isClosed())
        {
            ((Cursor) (obj)).close();
        }
    }

    public final void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.a(s, filedescriptor, printwriter, as);
        printwriter.print(s);
        printwriter.print("mUri=");
        printwriter.println(g);
        printwriter.print(s);
        printwriter.print("mProjection=");
        printwriter.println(Arrays.toString(h));
        printwriter.print(s);
        printwriter.print("mSelection=");
        printwriter.println(i);
        printwriter.print(s);
        printwriter.print("mSelectionArgs=");
        printwriter.println(Arrays.toString(j));
        printwriter.print(s);
        printwriter.print("mSortOrder=");
        printwriter.println(k);
        printwriter.print(s);
        printwriter.print("mCursor=");
        printwriter.println(l);
        printwriter.print(s);
        printwriter.print("mContentChanged=");
        printwriter.println(u);
    }

    public final void b(Object obj)
    {
        a((Cursor)obj);
    }

    public final Object d()
    {
        return o();
    }

    public final void e()
    {
        super.e();
        this;
        JVM INSTR monitorenter ;
        if (m == null) goto _L2; else goto _L1
_L1:
        Object obj = m;
        obj;
        JVM INSTR monitorenter ;
        if (!((a) (obj)).a) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        Object obj1;
        obj.a = true;
        obj.c = true;
        obj1 = ((a) (obj)).b;
        obj;
        JVM INSTR monitorexit ;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        ((CancellationSignal)obj1).cancel();
        obj;
        JVM INSTR monitorenter ;
        obj.c = false;
        obj.notifyAll();
        obj;
        JVM INSTR monitorexit ;
          goto _L2
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        obj;
        JVM INSTR monitorenter ;
        obj.c = false;
        obj.notifyAll();
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void f()
    {
        if (l != null)
        {
            a(l);
        }
        boolean flag = super.u;
        super.u = false;
        super.v = super.v | flag;
        if (flag || l == null)
        {
            k();
        }
    }

    protected final void g()
    {
        j();
    }

    protected final void h()
    {
        super.h();
        j();
        if (l != null && !l.isClosed())
        {
            l.close();
        }
        l = null;
    }
}
