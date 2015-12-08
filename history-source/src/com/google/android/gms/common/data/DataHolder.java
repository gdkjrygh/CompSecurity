// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.data:
//            f

public final class DataHolder
    implements SafeParcelable
{
    public static class a
    {

        private final String Ld[];
        private final ArrayList Lm;
        private final String Ln;
        private final HashMap Lo;
        private boolean Lp;
        private String Lq;

        static String[] a(a a1)
        {
            return a1.Ld;
        }

        static ArrayList b(a a1)
        {
            return a1.Lm;
        }

        private a(String as[], String s)
        {
            Ld = (String[])jx.i(as);
            Lm = new ArrayList();
            Ln = s;
            Lo = new HashMap();
            Lp = false;
            Lq = null;
        }

    }

    public static class b extends RuntimeException
    {

        public b(String s)
        {
            super(s);
        }
    }


    public static final f CREATOR = new f();
    private static final a Ll = new a(new String[0], null) {

    };
    private final int CK;
    private final int Iv;
    private final String Ld[];
    Bundle Le;
    private final CursorWindow Lf[];
    private final Bundle Lg;
    int Lh[];
    int Li;
    private Object Lj;
    private boolean Lk;
    boolean mClosed;

    DataHolder(int i, String as[], CursorWindow acursorwindow[], int j, Bundle bundle)
    {
        mClosed = false;
        Lk = true;
        CK = i;
        Ld = as;
        Lf = acursorwindow;
        Iv = j;
        Lg = bundle;
    }

    private DataHolder(a a1, int i, Bundle bundle)
    {
        this(a.a(a1), a(a1, -1), i, bundle);
    }

    public DataHolder(String as[], CursorWindow acursorwindow[], int i, Bundle bundle)
    {
        mClosed = false;
        Lk = true;
        CK = 1;
        Ld = (String[])jx.i(as);
        Lf = (CursorWindow[])jx.i(acursorwindow);
        Iv = i;
        Lg = bundle;
        gX();
    }

    public static DataHolder a(int i, Bundle bundle)
    {
        return new DataHolder(Ll, i, bundle);
    }

    private static CursorWindow[] a(a a1, int i)
    {
        CursorWindow cursorwindow;
        Object obj;
        Object obj1;
        ArrayList arraylist;
        int j;
        boolean flag;
        flag = false;
        if (a.a(a1).length == 0)
        {
            return new CursorWindow[0];
        }
        int l;
        if (i < 0 || i >= a.b(a1).size())
        {
            obj1 = a.b(a1);
        } else
        {
            obj1 = a.b(a1).subList(0, i);
        }
        l = ((List) (obj1)).size();
        obj = new CursorWindow(false);
        arraylist = new ArrayList();
        arraylist.add(obj);
        ((CursorWindow) (obj)).setNumColumns(a.a(a1).length);
        i = 0;
        j = 0;
_L4:
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        cursorwindow = ((CursorWindow) (obj));
        if (((CursorWindow) (obj)).allocRow())
        {
            break MISSING_BLOCK_LABEL_219;
        }
        Log.d("DataHolder", (new StringBuilder()).append("Allocating additional cursor window for large data set (row ").append(i).append(")").toString());
        obj = new CursorWindow(false);
        ((CursorWindow) (obj)).setStartPosition(i);
        ((CursorWindow) (obj)).setNumColumns(a.a(a1).length);
        arraylist.add(obj);
        cursorwindow = ((CursorWindow) (obj));
        if (((CursorWindow) (obj)).allocRow())
        {
            break MISSING_BLOCK_LABEL_219;
        }
        Log.e("DataHolder", "Unable to allocate row to hold data.");
        arraylist.remove(obj);
        a1 = (CursorWindow[])arraylist.toArray(new CursorWindow[arraylist.size()]);
        return a1;
        obj = (Map)((List) (obj1)).get(i);
        int k;
        k = 0;
        String s;
        Object obj2;
        long l1;
        for (boolean flag1 = true; k >= a.a(a1).length || !flag1; k++)
        {
            break MISSING_BLOCK_LABEL_565;
        }

        s = a.a(a1)[k];
        obj2 = ((Map) (obj)).get(s);
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        flag1 = cursorwindow.putNull(i, k);
        break MISSING_BLOCK_LABEL_705;
        if (obj2 instanceof String)
        {
            flag1 = cursorwindow.putString((String)obj2, i, k);
            break MISSING_BLOCK_LABEL_705;
        }
        if (obj2 instanceof Long)
        {
            flag1 = cursorwindow.putLong(((Long)obj2).longValue(), i, k);
            break MISSING_BLOCK_LABEL_705;
        }
        if (obj2 instanceof Integer)
        {
            flag1 = cursorwindow.putLong(((Integer)obj2).intValue(), i, k);
            break MISSING_BLOCK_LABEL_705;
        }
        if (!(obj2 instanceof Boolean))
        {
            break MISSING_BLOCK_LABEL_406;
        }
        if (((Boolean)obj2).booleanValue())
        {
            l1 = 1L;
        } else
        {
            l1 = 0L;
        }
        flag1 = cursorwindow.putLong(l1, i, k);
        break MISSING_BLOCK_LABEL_705;
        if (obj2 instanceof byte[])
        {
            flag1 = cursorwindow.putBlob((byte[])(byte[])obj2, i, k);
            break MISSING_BLOCK_LABEL_705;
        }
        if (obj2 instanceof Double)
        {
            flag1 = cursorwindow.putDouble(((Double)obj2).doubleValue(), i, k);
            break MISSING_BLOCK_LABEL_705;
        }
        if (obj2 instanceof Float)
        {
            flag1 = cursorwindow.putDouble(((Float)obj2).floatValue(), i, k);
            break MISSING_BLOCK_LABEL_705;
        }
        try
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unsupported object for column ").append(s).append(": ").append(obj2).toString());
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            j = arraylist.size();
        }
        for (i = ((flag) ? 1 : 0); i < j; i++)
        {
            ((CursorWindow)arraylist.get(i)).close();
        }

        break MISSING_BLOCK_LABEL_686;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_674;
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_585;
        }
        throw new b("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
        Log.d("DataHolder", (new StringBuilder()).append("Couldn't populate window data for row ").append(i).append(" - allocating new window.").toString());
        cursorwindow.freeLastRow();
        cursorwindow = new CursorWindow(false);
        cursorwindow.setStartPosition(i);
        cursorwindow.setNumColumns(a.a(a1).length);
        arraylist.add(cursorwindow);
        j = i - 1;
        i = 1;
_L2:
        k = i;
        i = j + 1;
        obj = cursorwindow;
        j = k;
        continue; /* Loop/switch isn't completed */
        k = 0;
        j = i;
        i = k;
        if (true) goto _L2; else goto _L1
_L1:
        throw a1;
        if (true) goto _L4; else goto _L3
_L3:
        return (CursorWindow[])arraylist.toArray(new CursorWindow[arraylist.size()]);
    }

    public static DataHolder av(int i)
    {
        return a(i, ((Bundle) (null)));
    }

    private void g(String s, int i)
    {
        if (Le == null || !Le.containsKey(s))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No such column: ").append(s).toString());
        }
        if (isClosed())
        {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= Li)
        {
            throw new CursorIndexOutOfBoundsException(i, Li);
        } else
        {
            return;
        }
    }

    public long a(String s, int i, int j)
    {
        g(s, i);
        return Lf[j].getLong(i, Le.getInt(s));
    }

    public void a(String s, int i, int j, CharArrayBuffer chararraybuffer)
    {
        g(s, i);
        Lf[j].copyStringToBuffer(i, Le.getInt(s), chararraybuffer);
    }

    public boolean aQ(String s)
    {
        return Le.containsKey(s);
    }

    public int au(int i)
    {
        int k = 0;
        boolean flag;
        if (i >= 0 && i < Li)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.K(flag);
        do
        {
label0:
            {
                int j = k;
                if (k < Lh.length)
                {
                    if (i >= Lh[k])
                    {
                        break label0;
                    }
                    j = k - 1;
                }
                i = j;
                if (j == Lh.length)
                {
                    i = j - 1;
                }
                return i;
            }
            k++;
        } while (true);
    }

    public int b(String s, int i, int j)
    {
        g(s, i);
        return Lf[j].getInt(i, Le.getInt(s));
    }

    public String c(String s, int i, int j)
    {
        g(s, i);
        return Lf[j].getString(i, Le.getInt(s));
    }

    public void close()
    {
        this;
        JVM INSTR monitorenter ;
        if (mClosed) goto _L2; else goto _L1
_L1:
        mClosed = true;
        int i = 0;
_L3:
        if (i >= Lf.length)
        {
            break; /* Loop/switch isn't completed */
        }
        Lf[i].close();
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

    public boolean d(String s, int i, int j)
    {
        g(s, i);
        return Long.valueOf(Lf[j].getLong(i, Le.getInt(s))).longValue() == 1L;
    }

    public int describeContents()
    {
        return 0;
    }

    public float e(String s, int i, int j)
    {
        g(s, i);
        return Lf[j].getFloat(i, Le.getInt(s));
    }

    public void e(Object obj)
    {
        Lj = obj;
    }

    public byte[] f(String s, int i, int j)
    {
        g(s, i);
        return Lf[j].getBlob(i, Le.getInt(s));
    }

    protected void finalize()
        throws Throwable
    {
        if (!Lk || Lf.length <= 0 || isClosed()) goto _L2; else goto _L1
_L1:
        String s;
        if (Lj != null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        s = (new StringBuilder()).append("internal object: ").append(toString()).toString();
_L3:
        Log.e("DataBuffer", (new StringBuilder()).append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (").append(s).append(")").toString());
        close();
_L2:
        super.finalize();
        return;
        s = Lj.toString();
          goto _L3
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public Uri g(String s, int i, int j)
    {
        s = c(s, i, j);
        if (s == null)
        {
            return null;
        } else
        {
            return Uri.parse(s);
        }
    }

    public Bundle gV()
    {
        return Lg;
    }

    public void gX()
    {
        int k = 0;
        Le = new Bundle();
        for (int i = 0; i < Ld.length; i++)
        {
            Le.putInt(Ld[i], i);
        }

        Lh = new int[Lf.length];
        boolean flag = false;
        int j = k;
        k = ((flag) ? 1 : 0);
        for (; j < Lf.length; j++)
        {
            Lh[j] = k;
            int l = Lf[j].getStartPosition();
            k += Lf[j].getNumRows() - (k - l);
        }

        Li = k;
    }

    String[] gY()
    {
        return Ld;
    }

    CursorWindow[] gZ()
    {
        return Lf;
    }

    public int getCount()
    {
        return Li;
    }

    public int getStatusCode()
    {
        return Iv;
    }

    int getVersionCode()
    {
        return CK;
    }

    public boolean h(String s, int i, int j)
    {
        g(s, i);
        return Lf[j].isNull(i, Le.getInt(s));
    }

    public boolean isClosed()
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

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.common.data.f.a(this, parcel, i);
    }

}
