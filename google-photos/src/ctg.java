// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.Array;

public final class ctg extends AbstractCursor
{

    int a;
    private Cursor b[];
    private int c[];
    private final int d;
    private Cursor e;
    private final int f;
    private final int g[];
    private final int h[];
    private final int i[][];
    private int j;
    private int k;
    private final Bundle l;
    private DataSetObserver m;

    public ctg(Cursor acursor[], String s, int i1)
    {
        this(acursor, s, 0, 128);
    }

    private ctg(Cursor acursor[], String s, int i1, int j1)
    {
        j = -1;
        l = new Bundle();
        m = new cth(this);
        b = acursor;
        d = i1;
        int k1 = b.length;
        c = new int[k1];
        for (i1 = 0; i1 < k1; i1++)
        {
            if (b[i1] != null)
            {
                b[i1].registerDataSetObserver(m);
                b[i1].moveToFirst();
                c[i1] = b[i1].getColumnIndexOrThrow(s);
            }
        }

        a = -1;
        e = null;
        long l1 = 0L;
        j1 = 0;
        do
        {
label0:
            {
label1:
                {
                    if (j1 >= k1)
                    {
                        break label0;
                    }
                    long l2 = l1;
                    if (b[j1] == null)
                    {
                        break label1;
                    }
                    l2 = l1;
                    if (b[j1].isAfterLast())
                    {
                        break label1;
                    }
                    long l3 = b[j1].getLong(c[j1]);
                    if (d == 1)
                    {
                        if (l3 < l1)
                        {
                            i1 = 1;
                        } else
                        {
                            i1 = 0;
                        }
                    } else
                    if (l3 > l1)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    if (a != -1)
                    {
                        l2 = l1;
                        if (i1 == 0)
                        {
                            break label1;
                        }
                    }
                    a = j1;
                    e = b[j1];
                    l2 = l3;
                }
                j1++;
                l1 = l2;
                continue;
            }
            f = 128;
            g = new int[f];
            h = new int[f];
            a();
            i1 = f;
            i = (int[][])Array.newInstance(Integer.TYPE, new int[] {
                i1, k1
            });
            return;
        } while (true);
    }

    static int a(ctg ctg1, int i1)
    {
        ctg1.mPos = -1;
        return -1;
    }

    private void a()
    {
        for (int i1 = g.length - 1; i1 >= 0; i1--)
        {
            g[i1] = 0x80000000;
        }

        k = 0x80000000;
    }

    static void a(ctg ctg1)
    {
        ctg1.a();
    }

    static int b(ctg ctg1, int i1)
    {
        ctg1.mPos = -1;
        return -1;
    }

    public final void close()
    {
        int j1 = b.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (b[i1] != null)
            {
                b[i1].close();
            }
        }

    }

    public final byte[] getBlob(int i1)
    {
        return e.getBlob(i1);
    }

    public final String[] getColumnNames()
    {
        if (a >= 0)
        {
            return e.getColumnNames();
        }
        int j1 = b.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (b[i1] != null)
            {
                return b[i1].getColumnNames();
            }
        }

        throw new IllegalStateException("No cursor that can return names");
    }

    public final int getCount()
    {
        int j1 = 0;
        if (k >= 0)
        {
            return k;
        }
        int l1 = b.length;
        for (int i1 = 0; i1 < l1;)
        {
            int k1 = j1;
            if (b[i1] != null)
            {
                k1 = j1 + b[i1].getCount();
            }
            i1++;
            j1 = k1;
        }

        k = j1;
        return j1;
    }

    public final double getDouble(int i1)
    {
        return e.getDouble(i1);
    }

    public final Bundle getExtras()
    {
        return l;
    }

    public final float getFloat(int i1)
    {
        return e.getFloat(i1);
    }

    public final int getInt(int i1)
    {
        return e.getInt(i1);
    }

    public final long getLong(int i1)
    {
        return e.getLong(i1);
    }

    public final short getShort(int i1)
    {
        return e.getShort(i1);
    }

    public final String getString(int i1)
    {
        return e.getString(i1);
    }

    public final int getType(int i1)
    {
        return e.getType(i1);
    }

    public final boolean isNull(int i1)
    {
        return e.isNull(i1);
    }

    public final boolean onMove(int i1, int j1)
    {
label0:
        {
            if (i1 == j1)
            {
                return true;
            }
            int k1 = j1 % f;
            int i2;
            if (g[k1] == j1)
            {
                i2 = h[k1];
                a = i2;
                e = b[i2];
                if (e != null)
                {
                    break label0;
                }
                Log.w("EsSortCursor", "onMove: cache results in a null cursor.");
            }
            a = -1;
            e = null;
            int j3 = b.length;
            if (j1 < i1 || i1 == -1)
            {
                for (i1 = 0; i1 < j3; i1++)
                {
                    if (b[i1] != null)
                    {
                        b[i1].moveToFirst();
                    }
                }

                i1 = 0;
                do
                {
                    int l1 = i1;
                    if (i1 < 0)
                    {
                        l1 = 0;
                    }
                    i1 = -1;
                    int l2 = l1;
                    do
                    {
                        l1 = i1;
                        if (l2 > j1)
                        {
                            break;
                        }
                        long l3 = 0L;
                        int j2 = 0;
                        i1 = -1;
label1:
                        do
                        {
label2:
                            {
                                if (j2 >= j3)
                                {
                                    break label1;
                                }
                                int i3 = i1;
                                long l4 = l3;
                                if (b[j2] == null)
                                {
                                    break label2;
                                }
                                i3 = i1;
                                l4 = l3;
                                if (b[j2].isAfterLast())
                                {
                                    break label2;
                                }
                                long l5 = b[j2].getLong(c[j2]);
                                if (d == 1)
                                {
                                    if (l5 < l3)
                                    {
                                        l1 = 1;
                                    } else
                                    {
                                        l1 = 0;
                                    }
                                } else
                                if (l5 > l3)
                                {
                                    l1 = 1;
                                } else
                                {
                                    l1 = 0;
                                }
                                if (i1 >= 0)
                                {
                                    i3 = i1;
                                    l4 = l3;
                                    if (l1 == 0)
                                    {
                                        break label2;
                                    }
                                }
                                l4 = l5;
                                i3 = j2;
                            }
                            j2++;
                            i1 = i3;
                            l3 = l4;
                        } while (true);
                        if (j1 - l2 <= f)
                        {
                            int k2 = l2 % f;
                            g[k2] = l2;
                            h[k2] = i1;
                            for (l1 = 0; l1 < j3; l1++)
                            {
                                if (b[l1] != null)
                                {
                                    i[k2][l1] = b[l1].getPosition();
                                }
                            }

                        }
                        l1 = i1;
                        if (l2 == j1)
                        {
                            break;
                        }
                        if (b[i1] != null)
                        {
                            b[i1].moveToNext();
                        }
                        l2++;
                    } while (true);
                    a = l1;
                    e = b[l1];
                    j = -1;
                    return true;
                } while (true);
            } else
            {
                if (j >= 0)
                {
                    l1 = 0;
                    while (l1 < j3) 
                    {
                        if (b[l1] != null)
                        {
                            b[l1].moveToPosition(i[j][l1]);
                        }
                        l1++;
                    }
                }
                continue;
            }
        }
        e.moveToPosition(i[k1][i2]);
        j = k1;
        return true;
    }

    public final void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        int j1 = b.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (b[i1] != null)
            {
                b[i1].registerDataSetObserver(datasetobserver);
            }
        }

    }

    public final void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        int j1 = b.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (b[i1] != null)
            {
                b[i1].unregisterDataSetObserver(datasetobserver);
            }
        }

    }
}
