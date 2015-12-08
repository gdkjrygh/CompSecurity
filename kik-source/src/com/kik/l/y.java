// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import kik.android.util.DeviceUtils;
import kik.android.util.bx;

public class y
    implements Cursor
{
    public static interface a
    {

        public abstract void a(Object obj);
    }


    private HashMap a;
    private final Cursor b;

    public y(Cursor cursor)
    {
        b = cursor;
        a = new HashMap();
        cursor = b.getColumnNames();
        for (int i = 0; i < cursor.length; i++)
        {
            a.put(cursor[i], Integer.valueOf(i));
        }

    }

    private static y a(Cursor cursor, Class class1)
    {
        try
        {
            cursor = (y)class1.getConstructor(new Class[] {
                android/database/Cursor
            }).newInstance(new Object[] {
                cursor
            });
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            cursor.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            cursor.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            cursor.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            cursor.printStackTrace();
            return null;
        }
        return cursor;
    }

    public static y a(SQLiteDatabase sqlitedatabase, Class class1, String s)
    {
        return a(sqlitedatabase.query(s, null, null, null, null, null, null), class1);
    }

    public static transient y a(SQLiteDatabase sqlitedatabase, Class class1, String s, String s1, String as[])
    {
        return a(sqlitedatabase.query(s, null, s1, as, null, null, null), class1);
    }

    public final void a(a a1)
    {
        boolean flag = moveToFirst();
        if (!flag) goto _L2; else goto _L1
_L1:
        a1.a(this);
_L4:
        flag = moveToNext();
        if (flag) goto _L1; else goto _L2
_L2:
        close();
        return;
        Exception exception;
        exception;
        bx.a(exception);
        if (!DeviceUtils.c()) goto _L4; else goto _L3
_L3:
        throw new RuntimeException(exception);
        a1;
        close();
        throw a1;
    }

    public final boolean a(String s)
    {
        int i = getColumnIndex(s);
        return b.getInt(i) == 1;
    }

    public final byte[] b(String s)
    {
        return b.getBlob(getColumnIndex(s));
    }

    public final String c(String s)
    {
        return b.getString(getColumnIndex(s));
    }

    public void close()
    {
        if (b != null)
        {
            b.close();
        }
    }

    public void copyStringToBuffer(int i, CharArrayBuffer chararraybuffer)
    {
        b.copyStringToBuffer(i, chararraybuffer);
    }

    public final int d(String s)
    {
        return b.getInt(getColumnIndex(s));
    }

    public void deactivate()
    {
        b.deactivate();
    }

    public final long e(String s)
    {
        return b.getLong(getColumnIndex(s));
    }

    public byte[] getBlob(int i)
    {
        return b.getBlob(i);
    }

    public int getColumnCount()
    {
        return b.getColumnCount();
    }

    public int getColumnIndex(String s)
    {
        int i;
        if (a.containsKey(s))
        {
            i = ((Integer)a.get(s)).intValue();
        } else
        {
            int j = b.getColumnIndex(s);
            i = j;
            if (j >= 0)
            {
                a.put(s, Integer.valueOf(j));
                return j;
            }
        }
        return i;
    }

    public int getColumnIndexOrThrow(String s)
    {
        if (a.containsKey(s))
        {
            return ((Integer)a.get(s)).intValue();
        } else
        {
            int i = b.getColumnIndexOrThrow(s);
            a.put(s, Integer.valueOf(i));
            return i;
        }
    }

    public String getColumnName(int i)
    {
        return b.getColumnName(i);
    }

    public String[] getColumnNames()
    {
        return b.getColumnNames();
    }

    public int getCount()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.getCount();
        }
    }

    public double getDouble(int i)
    {
        return b.getDouble(i);
    }

    public Bundle getExtras()
    {
        return b.getExtras();
    }

    public float getFloat(int i)
    {
        return b.getFloat(i);
    }

    public int getInt(int i)
    {
        return b.getInt(i);
    }

    public long getLong(int i)
    {
        return b.getLong(i);
    }

    public Uri getNotificationUri()
    {
        return null;
    }

    public int getPosition()
    {
        return b.getPosition();
    }

    public short getShort(int i)
    {
        return b.getShort(i);
    }

    public String getString(int i)
    {
        return b.getString(i);
    }

    public int getType(int i)
    {
        return 0;
    }

    public boolean getWantsAllOnMoveCalls()
    {
        return b.getWantsAllOnMoveCalls();
    }

    public boolean isAfterLast()
    {
        if (b == null)
        {
            return true;
        } else
        {
            return b.isAfterLast();
        }
    }

    public boolean isBeforeFirst()
    {
        return b.isBeforeFirst();
    }

    public boolean isClosed()
    {
        return b.isClosed();
    }

    public boolean isFirst()
    {
        if (b == null)
        {
            return false;
        } else
        {
            return b.isFirst();
        }
    }

    public boolean isLast()
    {
        return b.isLast();
    }

    public boolean isNull(int i)
    {
        return b.isNull(i);
    }

    public boolean move(int i)
    {
        if (b == null)
        {
            return false;
        } else
        {
            return b.move(i);
        }
    }

    public boolean moveToFirst()
    {
        if (b == null)
        {
            return false;
        } else
        {
            return b.moveToFirst();
        }
    }

    public boolean moveToLast()
    {
        if (b == null)
        {
            return false;
        } else
        {
            return b.moveToLast();
        }
    }

    public boolean moveToNext()
    {
        if (b == null)
        {
            return false;
        } else
        {
            return b.moveToNext();
        }
    }

    public boolean moveToPosition(int i)
    {
        if (b == null)
        {
            return false;
        } else
        {
            return b.moveToPosition(i);
        }
    }

    public boolean moveToPrevious()
    {
        if (b == null)
        {
            return false;
        } else
        {
            return b.moveToPrevious();
        }
    }

    public void registerContentObserver(ContentObserver contentobserver)
    {
        b.registerContentObserver(contentobserver);
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        b.registerDataSetObserver(datasetobserver);
    }

    public boolean requery()
    {
        return b.requery();
    }

    public Bundle respond(Bundle bundle)
    {
        return b.respond(bundle);
    }

    public void setNotificationUri(ContentResolver contentresolver, Uri uri)
    {
        b.setNotificationUri(contentresolver, uri);
    }

    public void unregisterContentObserver(ContentObserver contentobserver)
    {
        b.unregisterContentObserver(contentobserver);
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        b.unregisterDataSetObserver(datasetobserver);
    }
}
