// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.orm;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.Log;
import com.orm.dsl.Ignore;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.orm:
//            SugarApp, Database, StringUtil, SugarConfig

public class SugarRecord
{
    static class CursorIterator
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

        public CursorIterator(Class class1, Cursor cursor1)
        {
            type = class1;
            cursor = cursor1;
        }
    }


    protected Long id;
    String tableName;

    public SugarRecord()
    {
        tableName = getSqlName();
        id = null;
    }

    public static long count(Class class1, String s, String as[])
    {
        return count(class1, s, as, null, null, null);
    }

    public static long count(Class class1, String s, String as[], String s1, String s2, String s3)
    {
        s1 = SugarApp.getSugarContext().getDatabase().getDB();
        if (!TextUtils.isEmpty(s))
        {
            s = (new StringBuilder()).append(" where ").append(s).toString();
        } else
        {
            s = "";
        }
        class1 = s1.compileStatement((new StringBuilder()).append("SELECT count(*) FROM ").append(getTableName(class1)).append(s).toString());
        if (as != null)
        {
            for (int i = as.length; i != 0; i--)
            {
                class1.bindString(i, as[i - 1]);
            }

        }
        long l = class1.simpleQueryForLong();
        class1.close();
        return l;
        s;
        s.printStackTrace();
        class1.close();
        return -1L;
        s;
        class1.close();
        throw s;
    }

    public static void deleteAll(Class class1)
    {
        SugarApp.getSugarContext().getDatabase().getDB().delete(getTableName(class1), null, null);
    }

    public static transient void deleteAll(Class class1, String s, String as[])
    {
        SugarApp.getSugarContext().getDatabase().getDB().delete(getTableName(class1), s, as);
    }

    public static transient void executeQuery(String s, String as[])
    {
        SugarApp.getSugarContext().getDatabase().getDB().execSQL(s, as);
    }

    public static transient List find(Class class1, String s, String as[])
    {
        return find(class1, s, as, null, null, null);
    }

    public static List find(Class class1, String s, String as[], String s1, String s2, String s3)
    {
        SQLiteDatabase sqlitedatabase = SugarApp.getSugarContext().getDatabase().getDB();
        ArrayList arraylist = new ArrayList();
        s = sqlitedatabase.query(getTableName(class1), null, s, as, s1, null, s2, s3);
        try
        {
            while (s.moveToNext()) 
            {
                as = (SugarRecord)class1.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                as.inflate(s);
                arraylist.add(as);
            }
            break MISSING_BLOCK_LABEL_98;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1) { }
        finally
        {
            s.close();
            throw class1;
        }
        class1.printStackTrace();
        s.close();
        return arraylist;
        s.close();
        return arraylist;
    }

    public static Iterator findAll(Class class1)
    {
        return findAsIterator(class1, null, null, null, null, null);
    }

    public static transient Iterator findAsIterator(Class class1, String s, String as[])
    {
        return findAsIterator(class1, s, as, null, null, null);
    }

    public static Iterator findAsIterator(Class class1, String s, String as[], String s1, String s2, String s3)
    {
        return new CursorIterator(class1, SugarApp.getSugarContext().getDatabase().getDB().query(getTableName(class1), null, s, as, s1, null, s2, s3));
    }

    public static SugarRecord findById(Class class1, Long long1)
    {
        class1 = find(class1, "id=?", new String[] {
            String.valueOf(long1)
        }, null, null, "1");
        if (class1.isEmpty())
        {
            return null;
        } else
        {
            return (SugarRecord)class1.get(0);
        }
    }

    public static transient List findWithQuery(Class class1, String s, String as[])
    {
        SQLiteDatabase sqlitedatabase = SugarApp.getSugarContext().getDatabase().getDB();
        ArrayList arraylist = new ArrayList();
        s = sqlitedatabase.rawQuery(s, as);
        try
        {
            while (s.moveToNext()) 
            {
                as = (SugarRecord)class1.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                as.inflate(s);
                arraylist.add(as);
            }
            break MISSING_BLOCK_LABEL_84;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1) { }
        finally
        {
            s.close();
            throw class1;
        }
        class1.printStackTrace();
        s.close();
        return arraylist;
        s.close();
        return arraylist;
    }

    public static transient Iterator findWithQueryAsIterator(Class class1, String s, String as[])
    {
        return new CursorIterator(class1, SugarApp.getSugarContext().getDatabase().getDB().rawQuery(s, as));
    }

    private static List getAllFields(List list, Class class1)
    {
        Collections.addAll(list, class1.getDeclaredFields());
        List list1 = list;
        if (class1.getSuperclass() != null)
        {
            list1 = getAllFields(list, class1.getSuperclass());
        }
        return list1;
    }

    public static String getTableName(Class class1)
    {
        return StringUtil.toSQLName(class1.getSimpleName());
    }

    public static List listAll(Class class1)
    {
        return find(class1, null, null, null, null, null);
    }

    public static void saveInTx(Collection collection)
    {
        SQLiteDatabase sqlitedatabase = SugarApp.getSugarContext().getDatabase().getDB();
        try
        {
            sqlitedatabase.beginTransaction();
            sqlitedatabase.setLockingEnabled(false);
            for (collection = collection.iterator(); collection.hasNext(); ((SugarRecord)collection.next()).save(sqlitedatabase)) { }
            break MISSING_BLOCK_LABEL_92;
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection) { }
        finally
        {
            sqlitedatabase.endTransaction();
            sqlitedatabase.setLockingEnabled(true);
            throw collection;
        }
        Log.i("Sugar", (new StringBuilder()).append("Error in saving in transaction ").append(collection.getMessage()).toString());
        sqlitedatabase.endTransaction();
        sqlitedatabase.setLockingEnabled(true);
        return;
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        sqlitedatabase.setLockingEnabled(true);
        return;
    }

    public static transient void saveInTx(SugarRecord asugarrecord[])
    {
        saveInTx(((Collection) (Arrays.asList(asugarrecord))));
    }

    public void delete()
    {
        SugarApp.getSugarContext().getDatabase().getDB().delete(tableName, "Id=?", new String[] {
            getId().toString()
        });
    }

    public Long getId()
    {
        return id;
    }

    public String getSqlName()
    {
        return getTableName(getClass());
    }

    public List getTableFields()
    {
        Object obj = SugarConfig.getFields(getClass());
        if (obj != null)
        {
            return ((List) (obj));
        }
        Log.d("Sugar", "Fetching properties");
        Object obj1 = new ArrayList();
        getAllFields(((List) (obj1)), getClass());
        obj = new ArrayList();
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            Field field = (Field)((Iterator) (obj1)).next();
            if (!field.isAnnotationPresent(com/orm/dsl/Ignore) && !Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()))
            {
                ((List) (obj)).add(field);
            }
        } while (true);
        SugarConfig.setFields(getClass(), ((List) (obj)));
        return ((List) (obj));
    }

    void inflate(Cursor cursor)
    {
        HashMap hashmap;
        Iterator iterator;
        hashmap = new HashMap();
        iterator = getTableFields().iterator();
_L2:
        Field field1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        field1 = (Field)iterator.next();
        field1.setAccessible(true);
        Object obj;
        int i;
        obj = field1.getType();
        String s = StringUtil.toSQLName(field1.getName());
        i = cursor.getColumnIndex(s);
        if (cursor.isNull(i))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (s.equalsIgnoreCase("id"))
        {
            field1.set(this, Long.valueOf(cursor.getLong(i)));
            continue; /* Loop/switch isn't completed */
        }
        if (obj.equals(Long.TYPE) || obj.equals(java/lang/Long))
        {
            field1.set(this, Long.valueOf(cursor.getLong(i)));
            continue; /* Loop/switch isn't completed */
        }
        String s1;
        if (!obj.equals(java/lang/String))
        {
            break MISSING_BLOCK_LABEL_231;
        }
        s1 = cursor.getString(i);
        obj = s1;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        obj = s1;
        if (s1.equals("null"))
        {
            obj = null;
        }
        try
        {
            field1.set(this, obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("field set error", ((IllegalArgumentException) (obj)).getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("field set error", ((IllegalAccessException) (obj)).getMessage());
        }
        continue; /* Loop/switch isn't completed */
        if (obj.equals(Double.TYPE) || obj.equals(java/lang/Double))
        {
            field1.set(this, Double.valueOf(cursor.getDouble(i)));
            continue; /* Loop/switch isn't completed */
        }
        if (obj.equals(Boolean.TYPE) || obj.equals(java/lang/Boolean))
        {
            field1.set(this, Boolean.valueOf(cursor.getString(i).equals("1")));
            continue; /* Loop/switch isn't completed */
        }
        if (field1.getType().getName().equals("[B"))
        {
            field1.set(this, cursor.getBlob(i));
            continue; /* Loop/switch isn't completed */
        }
        if (obj.equals(Integer.TYPE) || obj.equals(java/lang/Integer))
        {
            field1.set(this, Integer.valueOf(cursor.getInt(i)));
            continue; /* Loop/switch isn't completed */
        }
        if (obj.equals(Float.TYPE) || obj.equals(java/lang/Float))
        {
            field1.set(this, Float.valueOf(cursor.getFloat(i)));
            continue; /* Loop/switch isn't completed */
        }
        if (obj.equals(Short.TYPE) || obj.equals(java/lang/Short))
        {
            field1.set(this, Short.valueOf(cursor.getShort(i)));
            continue; /* Loop/switch isn't completed */
        }
        if (obj.equals(java/sql/Timestamp))
        {
            field1.set(this, new Timestamp(cursor.getLong(i)));
            continue; /* Loop/switch isn't completed */
        }
        if (obj.equals(java/util/Date))
        {
            field1.set(this, new Date(cursor.getLong(i)));
            continue; /* Loop/switch isn't completed */
        }
        if (obj.equals(java/util/Calendar))
        {
            long l = cursor.getLong(i);
            obj = Calendar.getInstance();
            ((Calendar) (obj)).setTimeInMillis(l);
            field1.set(this, obj);
            continue; /* Loop/switch isn't completed */
        }
        boolean flag = java/lang/Enum.isAssignableFrom(((Class) (obj)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_683;
        }
        obj = field1.getType().getMethod("valueOf", new Class[] {
            java/lang/String
        });
        String s2 = cursor.getString(i);
        field1.set(this, ((Method) (obj)).invoke(field1.getType(), new Object[] {
            s2
        }));
        continue; /* Loop/switch isn't completed */
        obj;
        Log.e("Sugar", (new StringBuilder()).append("Enum cannot be read from Sqlite3 database. Please check the type of field ").append(field1.getName()).toString());
        continue; /* Loop/switch isn't completed */
        long l1;
        if (!com/orm/SugarRecord.isAssignableFrom(((Class) (obj))))
        {
            break MISSING_BLOCK_LABEL_737;
        }
        l1 = cursor.getLong(i);
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_727;
        }
        hashmap.put(field1, Long.valueOf(l1));
        continue; /* Loop/switch isn't completed */
        field1.set(this, null);
        continue; /* Loop/switch isn't completed */
        Log.e("Sugar", (new StringBuilder()).append("Class cannot be read from Sqlite3 database. Please check the type of field ").append(field1.getName()).append("(").append(field1.getType().getName()).append(")").toString());
        if (true) goto _L2; else goto _L1
_L1:
        for (cursor = hashmap.keySet().iterator(); cursor.hasNext();)
        {
            Field field = (Field)cursor.next();
            try
            {
                field.set(this, findById(field.getType(), (Long)hashmap.get(field)));
            }
            catch (SQLiteException sqliteexception) { }
            catch (IllegalArgumentException illegalargumentexception) { }
            catch (IllegalAccessException illegalaccessexception) { }
        }

        return;
    }

    public void save()
    {
        save(SugarApp.getSugarContext().getDatabase().getDB());
    }

    void save(SQLiteDatabase sqlitedatabase)
    {
        ContentValues contentvalues;
        Iterator iterator;
        List list = getTableFields();
        contentvalues = new ContentValues(list.size());
        iterator = list.iterator();
_L7:
        Object obj;
        Class class1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (Field)iterator.next();
        ((Field) (obj)).setAccessible(true);
        class1 = ((Field) (obj)).getType();
        String s;
        Object obj1;
        s = StringUtil.toSQLName(((Field) (obj)).getName());
        obj1 = ((Field) (obj)).get(this);
        if (!com/orm/SugarRecord.isAssignableFrom(class1)) goto _L2; else goto _L1
_L1:
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        obj = String.valueOf(((SugarRecord)obj1).id);
_L5:
        contentvalues.put(s, ((String) (obj)));
        continue; /* Loop/switch isn't completed */
_L4:
        obj = "0";
        if (true) goto _L5; else goto _L2
_L2:
        if ("id".equalsIgnoreCase(((Field) (obj)).getName()))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (class1.equals(java/lang/Short) || class1.equals(Short.TYPE))
        {
            contentvalues.put(s, (Short)obj1);
            continue; /* Loop/switch isn't completed */
        }
        if (class1.equals(java/lang/Integer) || class1.equals(Integer.TYPE))
        {
            contentvalues.put(s, (Integer)obj1);
            continue; /* Loop/switch isn't completed */
        }
        if (class1.equals(java/lang/Long) || class1.equals(Long.TYPE))
        {
            contentvalues.put(s, (Long)obj1);
            continue; /* Loop/switch isn't completed */
        }
        if (class1.equals(java/lang/Float) || class1.equals(Float.TYPE))
        {
            contentvalues.put(s, (Float)obj1);
            continue; /* Loop/switch isn't completed */
        }
        if (class1.equals(java/lang/Double) || class1.equals(Double.TYPE))
        {
            contentvalues.put(s, (Double)obj1);
            continue; /* Loop/switch isn't completed */
        }
        if (class1.equals(java/lang/Boolean) || class1.equals(Boolean.TYPE))
        {
            contentvalues.put(s, (Boolean)obj1);
            continue; /* Loop/switch isn't completed */
        }
        if (java/util/Date.equals(class1))
        {
            contentvalues.put(s, Long.valueOf(((Date)((Field) (obj)).get(this)).getTime()));
            continue; /* Loop/switch isn't completed */
        }
        if (java/util/Calendar.equals(class1))
        {
            contentvalues.put(s, Long.valueOf(((Calendar)((Field) (obj)).get(this)).getTimeInMillis()));
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            contentvalues.put(s, String.valueOf(obj1));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("Sugar", ((IllegalAccessException) (obj)).getMessage());
        }
        if (true) goto _L7; else goto _L6
_L6:
        if (id == null)
        {
            id = Long.valueOf(sqlitedatabase.insert(getSqlName(), null, contentvalues));
        } else
        {
            sqlitedatabase.update(getSqlName(), contentvalues, "ID = ?", new String[] {
                String.valueOf(id)
            });
        }
        Log.i("Sugar", (new StringBuilder()).append(getClass().getSimpleName()).append(" saved : ").append(id).toString());
        return;
    }

    public void setId(Long long1)
    {
        id = long1;
    }
}
