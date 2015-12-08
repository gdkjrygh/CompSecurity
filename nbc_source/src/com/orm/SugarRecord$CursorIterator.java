// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.orm;

import android.database.Cursor;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.orm:
//            SugarRecord

static class cursor
    implements Iterator
{

    Cursor cursor;
    Class type;

    public boolean hasNext()
    {
        return cursor != null && !cursor.isClosed() && !cursor.isAfterLast();
    }

    public SugarRecord next()
    {
        SugarRecord sugarrecord;
        sugarrecord = null;
        if (cursor == null || cursor.isAfterLast())
        {
            throw new NoSuchElementException();
        }
        if (cursor.isBeforeFirst())
        {
            cursor.moveToFirst();
        }
        SugarRecord sugarrecord1 = (SugarRecord)type.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        sugarrecord = sugarrecord1;
        sugarrecord1.inflate(cursor);
        SugarRecord sugarrecord2;
        cursor.moveToNext();
        sugarrecord2 = sugarrecord1;
        if (cursor.isAfterLast())
        {
            cursor.close();
            sugarrecord2 = sugarrecord1;
        }
_L2:
        return sugarrecord2;
        Exception exception1;
        exception1;
        exception1.printStackTrace();
        cursor.moveToNext();
        sugarrecord2 = sugarrecord;
        if (!cursor.isAfterLast()) goto _L2; else goto _L1
_L1:
        cursor.close();
        return sugarrecord;
        Exception exception;
        exception;
        cursor.moveToNext();
        if (cursor.isAfterLast())
        {
            cursor.close();
        }
        throw exception;
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    public tion(Class class1, Cursor cursor1)
    {
        type = class1;
        cursor = cursor1;
    }
}
