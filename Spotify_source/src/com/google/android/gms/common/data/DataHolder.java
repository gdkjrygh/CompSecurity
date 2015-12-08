// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import brj;
import brm;
import btl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class DataHolder
    implements SafeParcelable
{

    public static final brm CREATOR = new brm();
    public final int a;
    public final String b[];
    public Bundle c;
    public final CursorWindow d[];
    public final int e;
    public final Bundle f;
    public int g;
    public Object h;
    private int i[];
    private boolean j;
    private boolean k;

    public DataHolder(int l, String as[], CursorWindow acursorwindow[], int i1, Bundle bundle)
    {
        j = false;
        k = true;
        a = l;
        b = as;
        d = acursorwindow;
        e = i1;
        f = bundle;
    }

    private boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = j;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int a(int l)
    {
        int j1 = 0;
        boolean flag;
        if (l >= 0 && l < g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        btl.a(flag);
        do
        {
label0:
            {
                int i1 = j1;
                if (j1 < i.length)
                {
                    if (l >= i[j1])
                    {
                        break label0;
                    }
                    i1 = j1 - 1;
                }
                l = i1;
                if (i1 == i.length)
                {
                    l = i1 - 1;
                }
                return l;
            }
            j1++;
        } while (true);
    }

    public final String a(String s, int l, int i1)
    {
        a(s, l);
        return d[i1].getString(l, c.getInt(s));
    }

    public final void a()
    {
        int j1 = 0;
        c = new Bundle();
        for (int l = 0; l < b.length; l++)
        {
            c.putInt(b[l], l);
        }

        i = new int[d.length];
        boolean flag = false;
        int i1 = j1;
        j1 = ((flag) ? 1 : 0);
        for (; i1 < d.length; i1++)
        {
            i[i1] = j1;
            int k1 = d[i1].getStartPosition();
            j1 += d[i1].getNumRows() - (j1 - k1);
        }

        g = j1;
    }

    public final void a(String s, int l)
    {
        if (c == null || !c.containsKey(s))
        {
            throw new IllegalArgumentException((new StringBuilder("No such column: ")).append(s).toString());
        }
        if (c())
        {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (l < 0 || l >= g)
        {
            throw new CursorIndexOutOfBoundsException(l, g);
        } else
        {
            return;
        }
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (j) goto _L2; else goto _L1
_L1:
        j = true;
        int l = 0;
_L3:
        if (l >= d.length)
        {
            break; /* Loop/switch isn't completed */
        }
        d[l].close();
        l++;
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

    public final int describeContents()
    {
        return 0;
    }

    protected final void finalize()
    {
        if (!k || d.length <= 0 || c()) goto _L2; else goto _L1
_L1:
        String s;
        if (h != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        s = (new StringBuilder("internal object: ")).append(toString()).toString();
_L3:
        Log.e("DataBuffer", (new StringBuilder("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (")).append(s).append(")").toString());
        b();
_L2:
        super.finalize();
        return;
        s = h.toString();
          goto _L3
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public final void writeToParcel(Parcel parcel, int l)
    {
        brm.a(this, parcel, l);
    }

    static 
    {
        new brj(new String[0]) {

        };
    }
}
