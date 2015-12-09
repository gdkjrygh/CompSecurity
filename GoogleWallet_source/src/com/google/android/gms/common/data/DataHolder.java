// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.kn;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.data:
//            e

public final class DataHolder
    implements SafeParcelable
{
    public static class a
    {

        private final String Ub[];
        private final ArrayList Uk;
        private final String Ul;
        private final HashMap Um;
        private boolean Un;
        private String Uo;

        private a(String as[], String s)
        {
            Ub = (String[])kn.k(as);
            Uk = new ArrayList();
            Ul = s;
            Um = new HashMap();
            Un = false;
            Uo = null;
        }

    }


    public static final e CREATOR = new e();
    private static final a Uj = new a(new String[0], null) {

    };
    private final int Rk;
    private final String Ub[];
    Bundle Uc;
    private final CursorWindow Ud[];
    private final Bundle Ue;
    int Uf[];
    int Ug;
    private Object Uh;
    private boolean Ui;
    boolean mClosed;
    private final int mVersionCode;

    DataHolder(int i, String as[], CursorWindow acursorwindow[], int j, Bundle bundle)
    {
        mClosed = false;
        Ui = true;
        mVersionCode = i;
        Ub = as;
        Ud = acursorwindow;
        Rk = j;
        Ue = bundle;
    }

    private void h(String s, int i)
    {
        if (Uc == null || !Uc.containsKey(s))
        {
            throw new IllegalArgumentException((new StringBuilder("No such column: ")).append(s).toString());
        }
        if (isClosed())
        {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= Ug)
        {
            throw new CursorIndexOutOfBoundsException(i, Ug);
        } else
        {
            return;
        }
    }

    private boolean isClosed()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = mClosed;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String c(String s, int i, int j)
    {
        h(s, i);
        return Ud[j].getString(i, Uc.getInt(s));
    }

    public final int cW(int i)
    {
        int k = 0;
        boolean flag;
        if (i >= 0 && i < Ug)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.K(flag);
        do
        {
label0:
            {
                int j = k;
                if (k < Uf.length)
                {
                    if (i >= Uf[k])
                    {
                        break label0;
                    }
                    j = k - 1;
                }
                i = j;
                if (j == Uf.length)
                {
                    i = j - 1;
                }
                return i;
            }
            k++;
        } while (true);
    }

    public final void close()
    {
        this;
        JVM INSTR monitorenter ;
        if (mClosed) goto _L2; else goto _L1
_L1:
        mClosed = true;
        int i = 0;
_L3:
        if (i >= Ud.length)
        {
            break; /* Loop/switch isn't completed */
        }
        Ud[i].close();
        i++;
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
        throws Throwable
    {
        if (!Ui || Ud.length <= 0 || isClosed()) goto _L2; else goto _L1
_L1:
        String s;
        if (Uh != null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        s = (new StringBuilder("internal object: ")).append(toString()).toString();
_L3:
        Log.e("DataBuffer", (new StringBuilder("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (")).append(s).append(")").toString());
        close();
_L2:
        super.finalize();
        return;
        s = Uh.toString();
          goto _L3
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public final void g(Object obj)
    {
        Uh = obj;
    }

    public final int getCount()
    {
        return Ug;
    }

    public final Bundle getMetadata()
    {
        return Ue;
    }

    public final int getStatusCode()
    {
        return Rk;
    }

    final int getVersionCode()
    {
        return mVersionCode;
    }

    public final void ir()
    {
        int k = 0;
        Uc = new Bundle();
        for (int i = 0; i < Ub.length; i++)
        {
            Uc.putInt(Ub[i], i);
        }

        Uf = new int[Ud.length];
        boolean flag = false;
        int j = k;
        k = ((flag) ? 1 : 0);
        for (; j < Ud.length; j++)
        {
            Uf[j] = k;
            int l = Ud[j].getStartPosition();
            k += Ud[j].getNumRows() - (k - l);
        }

        Ug = k;
    }

    final String[] is()
    {
        return Ub;
    }

    final CursorWindow[] it()
    {
        return Ud;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel, i);
    }

}
