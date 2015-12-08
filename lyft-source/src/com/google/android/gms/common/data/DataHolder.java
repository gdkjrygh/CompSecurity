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
import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.data:
//            zze

public final class DataHolder
    implements SafeParcelable
{

    public static final zze CREATOR = new zze();
    private static final zza l = new zza(new String[0], null) {
            private class zza
            {

                private final String a[];
                private final ArrayList b;
                private final String c;
                private final HashMap d;
                private boolean e;
                private String f;

                static String[] a(zza zza1)
                {
                    return zza1.a;
                }

                static ArrayList b(zza zza1)
                {
                    return zza1.b;
                }

                private zza(String as[], String s)
                {
                    a = (String[])zzu.a(as);
                    b = new ArrayList();
                    c = s;
                    d = new HashMap();
                    e = false;
                    f = null;
                }

            }


    };
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

    private DataHolder(zza zza, int i1, Bundle bundle)
    {
        this(zza.a(zza), a(zza, -1), i1, bundle);
    }

    public DataHolder(String as[], CursorWindow acursorwindow[], int i1, Bundle bundle)
    {
        d = false;
        k = true;
        e = 1;
        f = (String[])zzu.a(as);
        g = (CursorWindow[])zzu.a(acursorwindow);
        h = i1;
        i = bundle;
        a();
    }

    public static DataHolder a(int i1, Bundle bundle)
    {
        return new DataHolder(l, i1, bundle);
    }

    private void a(String s, int i1)
    {
        if (a == null || !a.containsKey(s))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No such column: ").append(s).toString());
        }
        if (h())
        {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i1 < 0 || i1 >= c)
        {
            throw new CursorIndexOutOfBoundsException(i1, c);
        } else
        {
            return;
        }
    }

    private static CursorWindow[] a(zza zza, int i1)
    {
        CursorWindow cursorwindow;
        Object obj;
        Object obj1;
        ArrayList arraylist;
        int j1;
        boolean flag;
        flag = false;
        if (zza.a(zza).length == 0)
        {
            return new CursorWindow[0];
        }
        int l1;
        if (i1 < 0 || i1 >= zza.b(zza).size())
        {
            obj1 = zza.b(zza);
        } else
        {
            obj1 = zza.b(zza).subList(0, i1);
        }
        l1 = ((List) (obj1)).size();
        obj = new CursorWindow(false);
        arraylist = new ArrayList();
        arraylist.add(obj);
        ((CursorWindow) (obj)).setNumColumns(zza.a(zza).length);
        i1 = 0;
        j1 = 0;
_L4:
        if (i1 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        cursorwindow = ((CursorWindow) (obj));
        if (((CursorWindow) (obj)).allocRow())
        {
            break MISSING_BLOCK_LABEL_219;
        }
        Log.d("DataHolder", (new StringBuilder()).append("Allocating additional cursor window for large data set (row ").append(i1).append(")").toString());
        obj = new CursorWindow(false);
        ((CursorWindow) (obj)).setStartPosition(i1);
        ((CursorWindow) (obj)).setNumColumns(zza.a(zza).length);
        arraylist.add(obj);
        cursorwindow = ((CursorWindow) (obj));
        if (((CursorWindow) (obj)).allocRow())
        {
            break MISSING_BLOCK_LABEL_219;
        }
        Log.e("DataHolder", "Unable to allocate row to hold data.");
        arraylist.remove(obj);
        zza = (CursorWindow[])arraylist.toArray(new CursorWindow[arraylist.size()]);
        return zza;
        obj = (Map)((List) (obj1)).get(i1);
        int k1;
        k1 = 0;
        String s;
        Object obj2;
        long l2;
        for (boolean flag1 = true; k1 >= zza.a(zza).length || !flag1; k1++)
        {
            break MISSING_BLOCK_LABEL_565;
        }

        s = zza.a(zza)[k1];
        obj2 = ((Map) (obj)).get(s);
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_288;
        }
        flag1 = cursorwindow.putNull(i1, k1);
        break MISSING_BLOCK_LABEL_708;
        if (obj2 instanceof String)
        {
            flag1 = cursorwindow.putString((String)obj2, i1, k1);
            break MISSING_BLOCK_LABEL_708;
        }
        if (obj2 instanceof Long)
        {
            flag1 = cursorwindow.putLong(((Long)obj2).longValue(), i1, k1);
            break MISSING_BLOCK_LABEL_708;
        }
        if (obj2 instanceof Integer)
        {
            flag1 = cursorwindow.putLong(((Integer)obj2).intValue(), i1, k1);
            break MISSING_BLOCK_LABEL_708;
        }
        if (!(obj2 instanceof Boolean))
        {
            break MISSING_BLOCK_LABEL_406;
        }
        if (((Boolean)obj2).booleanValue())
        {
            l2 = 1L;
        } else
        {
            l2 = 0L;
        }
        flag1 = cursorwindow.putLong(l2, i1, k1);
        break MISSING_BLOCK_LABEL_708;
        if (obj2 instanceof byte[])
        {
            flag1 = cursorwindow.putBlob((byte[])(byte[])obj2, i1, k1);
            break MISSING_BLOCK_LABEL_708;
        }
        if (obj2 instanceof Double)
        {
            flag1 = cursorwindow.putDouble(((Double)obj2).doubleValue(), i1, k1);
            break MISSING_BLOCK_LABEL_708;
        }
        if (obj2 instanceof Float)
        {
            flag1 = cursorwindow.putDouble(((Float)obj2).floatValue(), i1, k1);
            break MISSING_BLOCK_LABEL_708;
        }
        try
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unsupported object for column ").append(s).append(": ").append(obj2).toString());
        }
        // Misplaced declaration of an exception variable
        catch (zza zza)
        {
            j1 = arraylist.size();
        }
        for (i1 = ((flag) ? 1 : 0); i1 < j1; i1++)
        {
            ((CursorWindow)arraylist.get(i1)).close();
        }

        break MISSING_BLOCK_LABEL_689;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_677;
        }
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_586;
        }
        throw new zzb("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
        Log.d("DataHolder", (new StringBuilder()).append("Couldn't populate window data for row ").append(i1).append(" - allocating new window.").toString());
        cursorwindow.freeLastRow();
        cursorwindow = new CursorWindow(false);
        cursorwindow.setStartPosition(i1);
        cursorwindow.setNumColumns(zza.a(zza).length);
        arraylist.add(cursorwindow);
        j1 = i1 - 1;
        i1 = 1;
_L2:
        k1 = i1;
        i1 = j1 + 1;
        obj = cursorwindow;
        j1 = k1;
        continue; /* Loop/switch isn't completed */
        k1 = 0;
        j1 = i1;
        i1 = k1;
        if (true) goto _L2; else goto _L1
_L1:
        throw zza;
        if (true) goto _L4; else goto _L3
_L3:
        return (CursorWindow[])arraylist.toArray(new CursorWindow[arraylist.size()]);
    }

    public static DataHolder b(int i1)
    {
        return a(i1, ((Bundle) (null)));
    }

    public int a(int i1)
    {
        int k1 = 0;
        boolean flag;
        if (i1 >= 0 && i1 < c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.a(flag);
        do
        {
label0:
            {
                int j1 = k1;
                if (k1 < b.length)
                {
                    if (i1 >= b[k1])
                    {
                        break label0;
                    }
                    j1 = k1 - 1;
                }
                i1 = j1;
                if (j1 == b.length)
                {
                    i1 = j1 - 1;
                }
                return i1;
            }
            k1++;
        } while (true);
    }

    public int a(String s, int i1, int j1)
    {
        a(s, i1);
        return g[j1].getInt(i1, a.getInt(s));
    }

    public void a()
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

    public void a(Object obj)
    {
        j = obj;
    }

    public boolean a(String s)
    {
        return a.containsKey(s);
    }

    int b()
    {
        return e;
    }

    public String b(String s, int i1, int j1)
    {
        a(s, i1);
        return g[j1].getString(i1, a.getInt(s));
    }

    public boolean c(String s, int i1, int j1)
    {
        a(s, i1);
        return Long.valueOf(g[j1].getLong(i1, a.getInt(s))).longValue() == 1L;
    }

    String[] c()
    {
        return f;
    }

    public float d(String s, int i1, int j1)
    {
        a(s, i1);
        return g[j1].getFloat(i1, a.getInt(s));
    }

    CursorWindow[] d()
    {
        return g;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return h;
    }

    public byte[] e(String s, int i1, int j1)
    {
        a(s, i1);
        return g[j1].getBlob(i1, a.getInt(s));
    }

    public Bundle f()
    {
        return i;
    }

    public boolean f(String s, int i1, int j1)
    {
        a(s, i1);
        return g[j1].isNull(i1, a.getInt(s));
    }

    protected void finalize()
    {
        if (!k || g.length <= 0 || h()) goto _L2; else goto _L1
_L1:
        String s;
        if (j != null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        s = (new StringBuilder()).append("internal object: ").append(toString()).toString();
_L3:
        Log.e("DataBuffer", (new StringBuilder()).append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (").append(s).append(")").toString());
        i();
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

    public int g()
    {
        return c;
    }

    public boolean h()
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

    public void i()
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

    public void writeToParcel(Parcel parcel, int i1)
    {
        zze.a(this, parcel, i1);
    }


    private class zzb extends RuntimeException
    {

        public zzb(String s)
        {
            super(s);
        }
    }

}
