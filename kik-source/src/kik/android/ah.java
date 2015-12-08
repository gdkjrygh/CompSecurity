// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.util.Log;
import java.lang.reflect.Array;

// Referenced classes of package kik.android:
//            ai

public final class ah extends AbstractCursor
{

    private Cursor a;
    private Cursor b[];
    private int c[];
    private final int d = 64;
    private int e[];
    private int f[];
    private int g[][];
    private int h;
    private DataSetObserver i;

    public ah(Cursor acursor[], String s)
    {
        e = new int[64];
        f = new int[64];
        h = -1;
        i = new ai(this);
        b = acursor;
        int i1 = b.length;
        c = new int[i1];
        for (int j = 0; j < i1; j++)
        {
            if (b[j] != null)
            {
                b[j].registerDataSetObserver(i);
                b[j].moveToFirst();
                c[j] = b[j].getColumnIndexOrThrow(s);
            }
        }

        a = null;
        s = "";
        int k = 0;
        while (k < i1) 
        {
label0:
            {
                Object obj = s;
                if (b[k] == null)
                {
                    break label0;
                }
                obj = s;
                if (b[k].isAfterLast())
                {
                    break label0;
                }
                if (b[k].getString(c[k]) == null)
                {
                    acursor = "";
                } else
                {
                    acursor = b[k].getString(c[k]);
                }
                if (a != null)
                {
                    obj = s;
                    if (s == null)
                    {
                        break label0;
                    }
                    obj = s;
                    if (acursor.compareToIgnoreCase(s) >= 0)
                    {
                        break label0;
                    }
                }
                a = b[k];
                obj = acursor;
            }
            k++;
            s = ((String) (obj));
        }
        for (int l = e.length - 1; l >= 0; l--)
        {
            e[l] = -2;
        }

        g = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            64, i1
        });
    }

    static int a(ah ah1)
    {
        ah1.mPos = -1;
        return -1;
    }

    static int b(ah ah1)
    {
        ah1.mPos = -1;
        return -1;
    }

    public final void close()
    {
        int k = b.length;
        for (int j = 0; j < k; j++)
        {
            if (b[j] != null)
            {
                b[j].close();
            }
        }

    }

    public final void deactivate()
    {
        int k = b.length;
        for (int j = 0; j < k; j++)
        {
            if (b[j] != null)
            {
                b[j].deactivate();
            }
        }

    }

    public final byte[] getBlob(int j)
    {
        if (a == null)
        {
            return null;
        } else
        {
            return a.getBlob(j);
        }
    }

    public final String[] getColumnNames()
    {
        if (a != null)
        {
            return a.getColumnNames();
        }
        int k = b.length;
        for (int j = 0; j < k; j++)
        {
            if (b[j] != null)
            {
                return b[j].getColumnNames();
            }
        }

        throw new IllegalStateException("No cursor that can return names");
    }

    public final int getCount()
    {
        int k = 0;
        int i1 = b.length;
        for (int j = 0; j < i1;)
        {
            int l = k;
            if (b[j] != null)
            {
                l = k + b[j].getCount();
            }
            j++;
            k = l;
        }

        return k;
    }

    public final double getDouble(int j)
    {
        if (a == null)
        {
            return 0.0D;
        } else
        {
            return a.getDouble(j);
        }
    }

    public final float getFloat(int j)
    {
        if (a == null)
        {
            return 0.0F;
        } else
        {
            return a.getFloat(j);
        }
    }

    public final int getInt(int j)
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.getInt(j);
        }
    }

    public final long getLong(int j)
    {
        if (a == null)
        {
            return 0L;
        } else
        {
            return a.getLong(j);
        }
    }

    public final short getShort(int j)
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.getShort(j);
        }
    }

    public final String getString(int j)
    {
        if (a == null)
        {
            return null;
        } else
        {
            return a.getString(j);
        }
    }

    public final int getType(int j)
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.getType(j);
        }
    }

    public final boolean isNull(int j)
    {
        if (a == null)
        {
            return false;
        } else
        {
            return a.isNull(j);
        }
    }

    public final boolean onMove(int j, int k)
    {
        boolean flag = false;
        if (j == k)
        {
            return true;
        }
        int k1 = k % 64;
        if (e[k1] == k)
        {
            j = f[k1];
            a = b[j];
            if (a == null)
            {
                Log.w("SortCursor", "onMove: cache results in a null cursor.");
                return false;
            } else
            {
                a.moveToPosition(g[k1][j]);
                h = k1;
                return true;
            }
        }
        a = null;
        int l1 = b.length;
        if (h >= 0)
        {
            for (int l = 0; l < l1; l++)
            {
                if (b[l] != null)
                {
                    b[l].moveToPosition(g[h][l]);
                }
            }

        }
        String s;
        String s1;
        int i1;
        int j1;
        if (k < j || j == -1)
        {
            for (j = 0; j < l1; j++)
            {
                if (b[j] != null)
                {
                    b[j].moveToFirst();
                }
            }

            i1 = 0;
        } else
        {
            i1 = j;
        }
        j = i1;
        if (i1 < 0)
        {
            j = 0;
        }
        i1 = -1;
        j1 = j;
        j = i1;
        i1 = j;
        if (j1 > k) goto _L2; else goto _L1
_L1:
        s1 = "";
        i1 = 0;
        j = -1;
_L4:
        if (i1 >= l1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (b[i1] == null || b[i1].isAfterLast())
        {
            break MISSING_BLOCK_LABEL_480;
        }
        if (b[i1].getString(c[i1]) == null)
        {
            s = "";
        } else
        {
            s = b[i1].getString(c[i1]);
        }
        if (j >= 0 && (s1 == null || s.compareToIgnoreCase(s1) <= 0))
        {
            break MISSING_BLOCK_LABEL_480;
        }
        j = i1;
_L5:
        i1++;
        s1 = s;
        if (true) goto _L4; else goto _L3
_L3:
        i1 = j;
        if (j1 != k)
        {
            if (b[j] != null)
            {
                b[j].moveToNext();
            }
            j1++;
            break MISSING_BLOCK_LABEL_230;
        }
_L2:
        a = b[i1];
        e[k1] = k;
        f[k1] = i1;
        for (j = ((flag) ? 1 : 0); j < l1; j++)
        {
            if (b[j] != null)
            {
                g[k1][j] = b[j].getPosition();
            }
        }

        h = -1;
        return true;
        s = s1;
          goto _L5
    }

    public final void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        int k = b.length;
        for (int j = 0; j < k; j++)
        {
            if (b[j] != null)
            {
                b[j].registerDataSetObserver(datasetobserver);
            }
        }

    }

    public final boolean requery()
    {
        int k = b.length;
        for (int j = 0; j < k; j++)
        {
            if (b[j] != null && !b[j].requery())
            {
                return false;
            }
        }

        return true;
    }

    public final void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        int k = b.length;
        for (int j = 0; j < k; j++)
        {
            if (b[j] != null)
            {
                b[j].unregisterDataSetObserver(datasetobserver);
            }
        }

    }
}
