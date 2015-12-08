// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.data:
//            d, a, b

public final class DataHolder
    implements SafeParcelable
{

    public static final d CREATOR = new d();
    private static final b l = new a(new String[0]);
    Bundle a;
    int b[];
    int c;
    boolean d;
    private final int e;
    private final String f[];
    private final CursorWindow g[];
    private final int h;
    private final Bundle i;
    private Object j;
    private boolean k;

    DataHolder(int i1, String as[], CursorWindow acursorwindow[], int j1, Bundle bundle)
    {
        d = false;
        k = true;
        e = i1;
        f = as;
        g = acursorwindow;
        h = j1;
        i = bundle;
    }

    private boolean g()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = d;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void h()
    {
        this;
        JVM INSTR monitorenter ;
        if (d) goto _L2; else goto _L1
_L1:
        d = true;
        int i1 = 0;
_L3:
        if (i1 >= g.length)
        {
            break; /* Loop/switch isn't completed */
        }
        g[i1].close();
        i1++;
        if (true) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a()
    {
        int k1 = 0;
        a = new Bundle();
        for (int i1 = 0; i1 < f.length; i1++)
        {
            a.putInt(f[i1], i1);
        }

        b = new int[g.length];
        boolean flag = false;
        int j1 = k1;
        k1 = ((flag) ? 1 : 0);
        for (; j1 < g.length; j1++)
        {
            b[j1] = k1;
            int l1 = g[j1].getStartPosition();
            k1 += g[j1].getNumRows() - (k1 - l1);
        }

        c = k1;
    }

    final int b()
    {
        return e;
    }

    final String[] c()
    {
        return f;
    }

    final CursorWindow[] d()
    {
        return g;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int e()
    {
        return h;
    }

    public final Bundle f()
    {
        return i;
    }

    protected final void finalize()
    {
        if (!k || g.length <= 0 || g()) goto _L2; else goto _L1
_L1:
        String s;
        if (j != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        s = (new StringBuilder("internal object: ")).append(toString()).toString();
_L3:
        Log.e("DataBuffer", (new StringBuilder("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (")).append(s).append(")").toString());
        h();
_L2:
        super.finalize();
        return;
        s = j.toString();
          goto _L3
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.common.data.d.a(this, parcel, i1);
    }

}
