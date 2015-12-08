// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gt;

// Referenced classes of package com.google.android.gms.common.data:
//            c, a, b

public final class DataHolder
    implements SafeParcelable
{

    public static final c a = new c();
    private static final b m = new a(new String[0]);
    Bundle b;
    int c[];
    int d;
    boolean e;
    private final int f;
    private final String g[];
    private final CursorWindow h[];
    private final int i;
    private final Bundle j;
    private Object k;
    private boolean l;

    DataHolder(int i1, String as[], CursorWindow acursorwindow[], int j1, Bundle bundle)
    {
        e = false;
        l = true;
        f = i1;
        g = as;
        h = acursorwindow;
        i = j1;
        j = bundle;
    }

    private void a(String s, int i1)
    {
        if (b == null || !b.containsKey(s))
        {
            throw new IllegalArgumentException((new StringBuilder("No such column: ")).append(s).toString());
        }
        if (h())
        {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i1 < 0 || i1 >= d)
        {
            throw new CursorIndexOutOfBoundsException(i1, d);
        } else
        {
            return;
        }
    }

    private boolean h()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    private void i()
    {
        this;
        JVM INSTR monitorenter ;
        if (e) goto _L2; else goto _L1
_L1:
        e = true;
        int i1 = 0;
_L3:
        if (i1 >= h.length)
        {
            break; /* Loop/switch isn't completed */
        }
        h[i1].close();
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

    public final int a(int i1)
    {
        int k1 = 0;
        boolean flag;
        if (i1 >= 0 && i1 < d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gt.a(flag);
        do
        {
label0:
            {
                int j1 = k1;
                if (k1 < c.length)
                {
                    if (i1 >= c[k1])
                    {
                        break label0;
                    }
                    j1 = k1 - 1;
                }
                i1 = j1;
                if (j1 == c.length)
                {
                    i1 = j1 - 1;
                }
                return i1;
            }
            k1++;
        } while (true);
    }

    public final long a(String s, int i1, int j1)
    {
        a(s, i1);
        return h[j1].getLong(i1, b.getInt(s));
    }

    public final void a()
    {
        int k1 = 0;
        b = new Bundle();
        for (int i1 = 0; i1 < g.length; i1++)
        {
            b.putInt(g[i1], i1);
        }

        c = new int[h.length];
        boolean flag = false;
        int j1 = k1;
        k1 = ((flag) ? 1 : 0);
        for (; j1 < h.length; j1++)
        {
            c[j1] = k1;
            int l1 = h[j1].getStartPosition();
            k1 += h[j1].getNumRows() - (k1 - l1);
        }

        d = k1;
    }

    public final boolean a(String s)
    {
        return b.containsKey(s);
    }

    final int b()
    {
        return f;
    }

    public final int b(String s, int i1, int j1)
    {
        a(s, i1);
        return h[j1].getInt(i1, b.getInt(s));
    }

    public final String c(String s, int i1, int j1)
    {
        a(s, i1);
        return h[j1].getString(i1, b.getInt(s));
    }

    final String[] c()
    {
        return g;
    }

    public final boolean d(String s, int i1, int j1)
    {
        a(s, i1);
        return Long.valueOf(h[j1].getLong(i1, b.getInt(s))).longValue() == 1L;
    }

    final CursorWindow[] d()
    {
        return h;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int e()
    {
        return i;
    }

    public final byte[] e(String s, int i1, int j1)
    {
        a(s, i1);
        return h[j1].getBlob(i1, b.getInt(s));
    }

    public final Uri f(String s, int i1, int j1)
    {
        s = c(s, i1, j1);
        if (s == null)
        {
            return null;
        } else
        {
            return Uri.parse(s);
        }
    }

    public final Bundle f()
    {
        return j;
    }

    protected final void finalize()
    {
        if (!l || h.length <= 0 || h()) goto _L2; else goto _L1
_L1:
        String s;
        if (k != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        s = (new StringBuilder("internal object: ")).append(toString()).toString();
_L3:
        Log.e("DataBuffer", (new StringBuilder("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call close() on all DataBuffer extending objects when you are done with them. (")).append(s).append(")").toString());
        i();
_L2:
        super.finalize();
        return;
        s = k.toString();
          goto _L3
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public final int g()
    {
        return d;
    }

    public final boolean g(String s, int i1, int j1)
    {
        a(s, i1);
        return h[j1].isNull(i1, b.getInt(s));
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.common.data.c.a(this, parcel, i1);
    }

}
