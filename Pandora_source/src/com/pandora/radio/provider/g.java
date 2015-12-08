// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.provider;

import android.database.AbstractCursor;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import com.pandora.radio.data.StationRecommendation;
import com.pandora.radio.data.y;
import java.security.InvalidParameterException;

// Referenced classes of package com.pandora.radio.provider:
//            j, a

public class g extends AbstractCursor
{

    private Cursor a;
    private j b;
    private Cursor c;
    private boolean d;
    private int e;
    private DataSetObserver f;

    public g(Cursor cursor, j j1, boolean flag)
    {
        f = new DataSetObserver() {

            final g a;

            public void onChanged()
            {
                g.a(a, -1);
            }

            public void onInvalidated()
            {
                g.b(a, -1);
            }

            
            {
                a = g.this;
                super();
            }
        };
        a = cursor;
        b = j1;
        c = cursor;
        d = flag;
        if (flag)
        {
            e = a(cursor);
        }
        cursor.registerDataSetObserver(f);
        if (a())
        {
            j1.registerDataSetObserver(f);
        }
    }

    private int a(Cursor cursor)
    {
        int i = cursor.getPosition();
        if (cursor.getCount() > 0 && cursor.moveToFirst() && (new y(cursor)).s())
        {
            return 0;
        } else
        {
            cursor.moveToPosition(i);
            return -1;
        }
    }

    static int a(g g1, int i)
    {
        g1.mPos = i;
        return i;
    }

    static int b(g g1, int i)
    {
        g1.mPos = i;
        return i;
    }

    private int e(int i)
    {
        if (!d || !a()) goto _L2; else goto _L1
_L1:
        if (i > e) goto _L4; else goto _L3
_L3:
        return i;
_L4:
        if (i > e + b.getCount())
        {
            return i - b.getCount();
        } else
        {
            return i - e - 1;
        }
_L2:
        int k = b();
        if (i >= k)
        {
            return i - k;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public StationRecommendation a(int i)
    {
        if (b(i))
        {
            throw new InvalidParameterException((new StringBuilder()).append("position out of station recommendations range - ").append(i).toString());
        } else
        {
            return b.a(e(i));
        }
    }

    public boolean a()
    {
        return b != null && b.getCount() > 0;
    }

    public int b()
    {
        return a.getCount();
    }

    public boolean b(int i)
    {
        boolean flag;
label0:
        {
label1:
            {
                flag = true;
                boolean flag1 = false;
                if (!d || !a())
                {
                    break label0;
                }
                if (i > e)
                {
                    flag = flag1;
                    if (i <= e + b.getCount())
                    {
                        break label1;
                    }
                }
                flag = true;
            }
            return flag;
        }
        if (i >= b() || i < 0)
        {
            flag = false;
        }
        return flag;
    }

    public int c(int i)
    {
        boolean flag;
        if (c == a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (b(i))
        {
            if (!(a instanceof a))
            {
                a = new a(a);
                if (flag)
                {
                    c = a;
                }
            }
            return ((a)a).b(e(i));
        } else
        {
            return -1;
        }
    }

    public StationRecommendation c()
    {
        return b.a(e(mPos));
    }

    public void close()
    {
        a.close();
        if (a())
        {
            b.close();
        }
        super.close();
    }

    public StationRecommendation d()
    {
        if (d && a())
        {
            return b.b();
        } else
        {
            return null;
        }
    }

    public boolean d(int i)
    {
        if (a instanceof a)
        {
            return ((a)a).c(i);
        } else
        {
            return false;
        }
    }

    public void deactivate()
    {
        a.deactivate();
        if (a())
        {
            b.deactivate();
        }
        super.deactivate();
    }

    public byte[] getBlob(int i)
    {
        return c.getBlob(i);
    }

    public int getColumnIndexOrThrow(String s)
    {
        return super.getColumnIndexOrThrow(s);
    }

    public String[] getColumnNames()
    {
        if (c != null)
        {
            return c.getColumnNames();
        } else
        {
            throw new SQLException("Cursor's query did not return any columnNames");
        }
    }

    public int getCount()
    {
        int k = b();
        int i = k;
        if (a())
        {
            i = k + b.getCount();
        }
        return i;
    }

    public double getDouble(int i)
    {
        return c.getDouble(i);
    }

    public float getFloat(int i)
    {
        return c.getFloat(i);
    }

    public int getInt(int i)
    {
        return c.getInt(i);
    }

    public long getLong(int i)
    {
        return c.getLong(i);
    }

    public short getShort(int i)
    {
        return c.getShort(i);
    }

    public String getString(int i)
    {
        return c.getString(i);
    }

    public int getType(int i)
    {
        return c.getType(i);
    }

    public boolean isNull(int i)
    {
        return c.isNull(i);
    }

    public boolean onMove(int i, int k)
    {
        Object obj;
        if (b(k))
        {
            obj = a;
        } else
        {
            obj = b;
        }
        c = ((Cursor) (obj));
        return c.moveToPosition(e(k));
    }

    public void registerContentObserver(ContentObserver contentobserver)
    {
        a.registerContentObserver(contentobserver);
        if (a())
        {
            b.registerContentObserver(contentobserver);
        }
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        a.registerDataSetObserver(datasetobserver);
        if (a())
        {
            b.registerDataSetObserver(datasetobserver);
        }
    }

    public boolean requery()
    {
        if (a.requery() && a())
        {
            b.requery();
        }
        return true;
    }

    public void unregisterContentObserver(ContentObserver contentobserver)
    {
        a.unregisterContentObserver(contentobserver);
        if (a())
        {
            b.unregisterContentObserver(contentobserver);
        }
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        a.unregisterDataSetObserver(datasetobserver);
        if (a())
        {
            b.unregisterDataSetObserver(datasetobserver);
        }
    }
}
