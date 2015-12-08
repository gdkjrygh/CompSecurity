// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import kar;
import kat;

public final class DataHolder
    implements SafeParcelable
{

    public static final kat CREATOR = new kat();
    public final int a;
    public final String b[];
    public final CursorWindow c[];
    public final int d;
    public final Bundle e;
    public int f;
    private Bundle g;
    private int h[];
    private boolean i;
    private boolean j;

    public DataHolder(int k, String as[], CursorWindow acursorwindow[], int l, Bundle bundle)
    {
        i = false;
        j = true;
        a = k;
        b = as;
        c = acursorwindow;
        d = l;
        e = bundle;
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (i) goto _L2; else goto _L1
_L1:
        i = true;
        int k = 0;
_L3:
        if (k >= c.length)
        {
            break; /* Loop/switch isn't completed */
        }
        c[k].close();
        k++;
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
        int i1 = 0;
        g = new Bundle();
        for (int k = 0; k < b.length; k++)
        {
            g.putInt(b[k], k);
        }

        h = new int[c.length];
        boolean flag = false;
        int l = i1;
        i1 = ((flag) ? 1 : 0);
        for (; l < c.length; l++)
        {
            h[l] = i1;
            int j1 = c[l].getStartPosition();
            i1 += c[l].getNumRows() - (i1 - j1);
        }

        f = i1;
    }

    public final boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = i;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int describeContents()
    {
        return 0;
    }

    protected final void finalize()
    {
        if (j && c.length > 0 && !b())
        {
            String s = (new StringBuilder("internal object: ")).append(toString()).toString();
            Log.e("DataBuffer", (new StringBuilder("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (")).append(s).append(")").toString());
            c();
        }
        super.finalize();
        return;
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public final void writeToParcel(Parcel parcel, int k)
    {
        kat.a(this, parcel, k);
    }

    static 
    {
        new kar(new String[0], null);
    }
}
