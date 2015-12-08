// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.v4.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public final class cu extends cn
{

    private db k;
    private Uri l;
    private String m[];
    private String n;
    private String o;
    private Cursor p;
    private gm q;

    public cu(Context context, Uri uri, String as[], String s1, String s2)
    {
        super(context);
        k = new db(this);
        l = uri;
        m = as;
        n = s1;
        o = s2;
    }

    private void a(Cursor cursor)
    {
        if (super.h)
        {
            if (cursor != null)
            {
                cursor.close();
            }
        } else
        {
            Cursor cursor1 = p;
            p = cursor;
            if (super.f)
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

    private Cursor s()
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
        q = new gm();
        this;
        JVM INSTR monitorexit ;
        Cursor cursor = cp.a(super.e.getContentResolver(), l, m, n, o, q);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        cursor.getCount();
        cursor.registerContentObserver(k);
        this;
        JVM INSTR monitorenter ;
        q = null;
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
        q = null;
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

    public final void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.a(s1, filedescriptor, printwriter, as);
        printwriter.print(s1);
        printwriter.print("mUri=");
        printwriter.println(l);
        printwriter.print(s1);
        printwriter.print("mProjection=");
        printwriter.println(Arrays.toString(m));
        printwriter.print(s1);
        printwriter.print("mSelection=");
        printwriter.println(n);
        printwriter.print(s1);
        printwriter.print("mSelectionArgs=");
        printwriter.println(Arrays.toString(null));
        printwriter.print(s1);
        printwriter.print("mSortOrder=");
        printwriter.println(o);
        printwriter.print(s1);
        printwriter.print("mCursor=");
        printwriter.println(p);
        printwriter.print(s1);
        printwriter.print("mContentChanged=");
        printwriter.println(i);
    }

    public final void b(Object obj)
    {
        a((Cursor)obj);
    }

    public final Object d()
    {
        return s();
    }

    public final void e()
    {
        super.e();
        this;
        JVM INSTR monitorenter ;
        if (q == null) goto _L2; else goto _L1
_L1:
        Object obj = q;
        obj;
        JVM INSTR monitorenter ;
        if (!((gm) (obj)).a) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        Object obj1;
        obj.a = true;
        obj1 = ((gm) (obj)).b;
        obj;
        JVM INSTR monitorexit ;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        ((CancellationSignal)obj1).cancel();
        obj;
        JVM INSTR monitorenter ;
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
        if (p != null)
        {
            a(p);
        }
        if (q() || p == null)
        {
            n();
        }
    }

    protected final void g()
    {
        m();
    }

    protected final void h()
    {
        super.h();
        m();
        if (p != null && !p.isClosed())
        {
            p.close();
        }
        p = null;
    }
}
