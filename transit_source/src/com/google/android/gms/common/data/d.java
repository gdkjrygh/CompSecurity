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
import com.google.android.gms.internal.dm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.data:
//            e

public final class d
    implements SafeParcelable
{
    public static class a
    {

        private final String jm[];
        private final ArrayList jv;
        private final String jw;
        private final HashMap jx;
        private boolean jy;
        private String jz;

        static String[] b(a a1)
        {
            return a1.jm;
        }

        static ArrayList c(a a1)
        {
            return a1.jv;
        }

        private a(String as[], String s)
        {
            jm = (String[])dm.e(as);
            jv = new ArrayList();
            jw = s;
            jx = new HashMap();
            jy = false;
            jz = null;
        }

    }


    public static final e CREATOR = new e();
    private static final a ju = new a(new String[0], null) {

    };
    private final int iC;
    private final int iM;
    private final String jm[];
    Bundle jn;
    private final CursorWindow jo[];
    private final Bundle jp;
    int jq[];
    int jr;
    private Object js;
    private boolean jt;
    boolean mClosed;

    d(int i, String as[], CursorWindow acursorwindow[], int j, Bundle bundle)
    {
        mClosed = false;
        jt = true;
        iM = i;
        jm = as;
        jo = acursorwindow;
        iC = j;
        jp = bundle;
    }

    private d(a a1, int i, Bundle bundle)
    {
        this(a.b(a1), a(a1), i, bundle);
    }

    public d(String as[], CursorWindow acursorwindow[], int i, Bundle bundle)
    {
        mClosed = false;
        jt = true;
        iM = 1;
        jm = (String[])dm.e(as);
        jo = (CursorWindow[])dm.e(acursorwindow);
        iC = i;
        jp = bundle;
        aJ();
    }

    public static d a(int i, Bundle bundle)
    {
        return new d(ju, i, bundle);
    }

    private static CursorWindow[] a(a a1)
    {
        CursorWindow cursorwindow;
        ArrayList arraylist;
        ArrayList arraylist1;
        int i;
        int j;
        boolean flag;
        int l;
        flag = false;
        if (a.b(a1).length == 0)
        {
            return new CursorWindow[0];
        }
        arraylist1 = a.c(a1);
        l = arraylist1.size();
        cursorwindow = new CursorWindow(false);
        arraylist = new ArrayList();
        arraylist.add(cursorwindow);
        cursorwindow.setNumColumns(a.b(a1).length);
        i = 0;
        j = 0;
_L3:
        if (i >= l) goto _L2; else goto _L1
_L1:
        if (!cursorwindow.allocRow())
        {
            Log.d("DataHolder", (new StringBuilder()).append("Allocating additional cursor window for large data set (row ").append(i).append(")").toString());
            cursorwindow = new CursorWindow(false);
            cursorwindow.setNumColumns(a.b(a1).length);
            arraylist.add(cursorwindow);
            if (!cursorwindow.allocRow())
            {
                Log.e("DataHolder", "Unable to allocate row to hold data.");
                arraylist.remove(cursorwindow);
                return (CursorWindow[])arraylist.toArray(new CursorWindow[arraylist.size()]);
            }
            break MISSING_BLOCK_LABEL_598;
        }
_L5:
        Map map = (Map)arraylist1.get(i);
        boolean flag1;
        flag1 = true;
        String s;
        Object obj;
        long l1;
        for (int k = 0; k >= a.b(a1).length || !flag1; k++)
        {
            break MISSING_BLOCK_LABEL_470;
        }

        s = a.b(a1)[k];
        obj = map.get(s);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        flag1 = cursorwindow.putNull(j, k);
        break MISSING_BLOCK_LABEL_604;
        if (obj instanceof String)
        {
            flag1 = cursorwindow.putString((String)obj, j, k);
            break MISSING_BLOCK_LABEL_604;
        }
        if (obj instanceof Long)
        {
            flag1 = cursorwindow.putLong(((Long)obj).longValue(), j, k);
            break MISSING_BLOCK_LABEL_604;
        }
        if (obj instanceof Integer)
        {
            flag1 = cursorwindow.putLong(((Integer)obj).intValue(), j, k);
            break MISSING_BLOCK_LABEL_604;
        }
        if (!(obj instanceof Boolean))
        {
            break MISSING_BLOCK_LABEL_364;
        }
        if (((Boolean)obj).booleanValue())
        {
            l1 = 1L;
        } else
        {
            l1 = 0L;
        }
        flag1 = cursorwindow.putLong(l1, j, k);
        break MISSING_BLOCK_LABEL_604;
        if (obj instanceof byte[])
        {
            flag1 = cursorwindow.putBlob((byte[])(byte[])obj, j, k);
            break MISSING_BLOCK_LABEL_604;
        }
        try
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unsupported object for column ").append(s).append(": ").append(obj).toString());
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

        break MISSING_BLOCK_LABEL_578;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_561;
        }
        Log.d("DataHolder", (new StringBuilder()).append("Couldn't populate window data for row ").append(i).append(" - allocating new window.").toString());
        cursorwindow.freeLastRow();
        cursorwindow = new CursorWindow(false);
        cursorwindow.setNumColumns(a.b(a1).length);
        arraylist.add(cursorwindow);
        j = i - 1;
        i = 0;
_L4:
        k = j + 1;
        j = i;
        i = k;
          goto _L3
        k = j + 1;
        j = i;
        i = k;
          goto _L4
        throw a1;
          goto _L3
_L2:
        return (CursorWindow[])arraylist.toArray(new CursorWindow[arraylist.size()]);
        j = 0;
          goto _L5
    }

    private void b(String s, int i)
    {
        if (jn == null || !jn.containsKey(s))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No such column: ").append(s).toString());
        }
        if (isClosed())
        {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= jr)
        {
            throw new CursorIndexOutOfBoundsException(i, jr);
        } else
        {
            return;
        }
    }

    public static d r(int i)
    {
        return a(i, null);
    }

    public long a(String s, int i, int j)
    {
        b(s, i);
        return jo[j].getLong(i - jq[j], jn.getInt(s));
    }

    public void a(String s, int i, int j, CharArrayBuffer chararraybuffer)
    {
        b(s, i);
        jo[j].copyStringToBuffer(i - jq[j], jn.getInt(s), chararraybuffer);
    }

    public void aJ()
    {
        int k = 0;
        jn = new Bundle();
        for (int i = 0; i < jm.length; i++)
        {
            jn.putInt(jm[i], i);
        }

        jq = new int[jo.length];
        boolean flag = false;
        int j = k;
        k = ((flag) ? 1 : 0);
        for (; j < jo.length; j++)
        {
            jq[j] = k;
            k += jo[j].getNumRows();
        }

        jr = k;
    }

    String[] aK()
    {
        return jm;
    }

    CursorWindow[] aL()
    {
        return jo;
    }

    public Bundle aM()
    {
        return jp;
    }

    public int b(String s, int i, int j)
    {
        b(s, i);
        return jo[j].getInt(i - jq[j], jn.getInt(s));
    }

    public void b(Object obj)
    {
        js = obj;
    }

    public String c(String s, int i, int j)
    {
        b(s, i);
        return jo[j].getString(i - jq[j], jn.getInt(s));
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
        if (i >= jo.length)
        {
            break; /* Loop/switch isn't completed */
        }
        jo[i].close();
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
        b(s, i);
        return Long.valueOf(jo[j].getLong(i - jq[j], jn.getInt(s))).longValue() == 1L;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] e(String s, int i, int j)
    {
        b(s, i);
        return jo[j].getBlob(i - jq[j], jn.getInt(s));
    }

    public Uri f(String s, int i, int j)
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

    protected void finalize()
        throws Throwable
    {
        if (!jt || jo.length <= 0 || isClosed()) goto _L2; else goto _L1
_L1:
        String s;
        if (js != null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        s = (new StringBuilder()).append("internal object: ").append(toString()).toString();
_L3:
        Log.e("DataHolder", (new StringBuilder()).append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call close() on all DataBuffer extending objects when you are done with them. (").append(s).append(")").toString());
        close();
_L2:
        super.finalize();
        return;
        s = js.toString();
          goto _L3
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public boolean g(String s, int i, int j)
    {
        b(s, i);
        return jo[j].isNull(i - jq[j], jn.getInt(s));
    }

    public int getCount()
    {
        return jr;
    }

    public int getStatusCode()
    {
        return iC;
    }

    int getVersionCode()
    {
        return iM;
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

    public int q(int i)
    {
        int k = 0;
        boolean flag;
        if (i >= 0 && i < jr)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.k(flag);
        do
        {
label0:
            {
                int j = k;
                if (k < jq.length)
                {
                    if (i >= jq[k])
                    {
                        break label0;
                    }
                    j = k - 1;
                }
                i = j;
                if (j == jq.length)
                {
                    i = j - 1;
                }
                return i;
            }
            k++;
        } while (true);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.common.data.e.a(this, parcel, i);
    }

}
