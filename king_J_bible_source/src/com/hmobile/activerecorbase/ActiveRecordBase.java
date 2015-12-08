// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.activerecorbase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.hmobile.common.Utils;
import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.hmobile.activerecorbase:
//            EntitiesMap, ActiveRecordException, Database, CamelNotationHelper

public class ActiveRecordBase
{

    static EntitiesMap s_EntitiesMap = new EntitiesMap();
    protected long _id;
    Database m_Database;
    boolean m_NeedsInsert;

    protected ActiveRecordBase()
    {
        m_NeedsInsert = true;
        _id = 0L;
    }

    protected ActiveRecordBase(Database database)
    {
        m_NeedsInsert = true;
        _id = 0L;
        m_Database = database;
    }

    public static ActiveRecordBase createInstance(Database database)
    {
        return new ActiveRecordBase(database);
    }

    private String getDateFormat()
    {
        return "dd/MM/yyyy hh:mm";
    }

    public static ActiveRecordBase open(Context context, String s, int i)
        throws ActiveRecordException
    {
        context = Database.createInstance(context, s, i);
        context.open();
        return createInstance(context);
    }

    public void beginTransaction()
        throws ActiveRecordException
    {
        if (m_Database == null)
        {
            throw new ActiveRecordException("Set database first");
        } else
        {
            m_Database.beginTransaction();
            return;
        }
    }

    public void close()
    {
        m_Database.close();
    }

    public void copyFrom(Object obj)
    {
        Iterator iterator = getColumnFieldsWithoutID().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return;
            }
            Field field = (Field)iterator.next();
            try
            {
                field.set(this, obj.getClass().getField(field.getName()).get(obj));
            }
            catch (SecurityException securityexception) { }
            catch (NoSuchFieldException nosuchfieldexception) { }
            catch (IllegalArgumentException illegalargumentexception) { }
            catch (IllegalAccessException illegalaccessexception) { }
        } while (true);
    }

    public int delete(Class class1)
        throws ActiveRecordException
    {
        if (m_Database == null)
        {
            throw new ActiveRecordException("Set database first");
        }
        try
        {
            class1 = (ActiveRecordBase)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        return m_Database.delete(class1.getTableName(), "_id >0 ", null);
    }

    public int delete(Class class1, String s, String as[])
        throws ActiveRecordException
    {
        if (m_Database == null)
        {
            throw new ActiveRecordException("Set database first");
        }
        try
        {
            class1 = (ActiveRecordBase)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        return m_Database.delete(class1.getTableName(), s, as);
    }

    public boolean delete()
        throws ActiveRecordException
    {
        boolean flag = false;
        if (m_Database == null)
        {
            throw new ActiveRecordException("Set database first");
        }
        if (m_Database.delete(getTableName(), "_id = ?", new String[] {
    String.valueOf(_id)
}) != 0)
        {
            flag = true;
        }
        _id = 0L;
        m_NeedsInsert = true;
        return flag;
    }

    public int deleteByColumn(Class class1, String s, String s1)
        throws ActiveRecordException
    {
        return delete(class1, String.format("%s = ?", new Object[] {
            s
        }), new String[] {
            s1
        });
    }

    public int deleterecord(Class class1)
        throws ActiveRecordException
    {
        if (m_Database == null)
        {
            throw new ActiveRecordException("Set database first");
        }
        try
        {
            class1 = (ActiveRecordBase)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        return m_Database.delete(class1.getTableName(), "_id >0 ", null);
    }

    public void endTransaction()
    {
        m_Database.endTransaction();
    }

    public List excecuteRawQuery(Class class1, String s, String as[])
        throws ActiveRecordException
    {
        Object obj;
        String s1;
        ArrayList arraylist;
        if (m_Database == null)
        {
            throw new ActiveRecordException("Set database first");
        }
        boolean flag;
        try
        {
            obj = (ActiveRecordBase)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        arraylist = new ArrayList();
        s1 = null;
        obj = null;
        if (as != null) goto _L2; else goto _L1
_L1:
        s = m_Database.rawQuery(s);
_L4:
        obj = s;
        s1 = s;
        ActiveRecordBase activerecordbase;
        try
        {
            flag = s.moveToNext();
            break MISSING_BLOCK_LABEL_68;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            s1 = ((String) (obj));
        }
        finally
        {
            if (s1 != null)
            {
                s1.close();
            }
            throw class1;
        }
          goto _L3
_L2:
        s = m_Database.rawQuery(s, as);
          goto _L4
        if (!flag)
        {
            if (s != null)
            {
                s.close();
            }
            return arraylist;
        }
        obj = s;
        s1 = s;
        activerecordbase = s_EntitiesMap.get(class1, s.getLong(s.getColumnIndex("_id")));
        as = activerecordbase;
        if (activerecordbase != null)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        obj = s;
        s1 = s;
        as = (ActiveRecordBase)class1.newInstance();
        obj = s;
        s1 = s;
        as.m_NeedsInsert = false;
        obj = s;
        s1 = s;
        as.inflate(s);
        obj = s;
        s1 = s;
        as.m_Database = m_Database;
        obj = s;
        s1 = s;
        arraylist.add(as);
          goto _L4
_L3:
        throw new ActiveRecordException(class1.getLocalizedMessage());
    }

    public void executeRawQuery(String s, String as[])
        throws ActiveRecordException
    {
        Object obj;
        if (m_Database == null)
        {
            throw new ActiveRecordException("Set database first");
        }
        obj = null;
        if (as != null) goto _L2; else goto _L1
_L1:
        m_Database.execute(s);
        s = obj;
_L4:
        if (s != null)
        {
            s.close();
        }
        return;
_L2:
        s = m_Database.rawQuery(s, as);
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw new ActiveRecordException(s.getLocalizedMessage());
        s;
        if (false)
        {
            throw new NullPointerException();
        } else
        {
            throw s;
        }
    }

    public List find(Class class1, String s, String as[])
        throws ActiveRecordException
    {
        ArrayList arraylist;
        Object obj;
        int i;
        i = 0;
        if (m_Database == null)
        {
            throw new ActiveRecordException("Set database first");
        }
        int j;
        boolean flag;
        try
        {
            obj = (ActiveRecordBase)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        arraylist = new ArrayList();
        if (as == null) goto _L2; else goto _L1
_L1:
        j = as.length;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        obj = m_Database.query(((ActiveRecordBase) (obj)).getTableName(), null, s, as);
_L6:
        flag = ((Cursor) (obj)).moveToNext();
        if (!flag)
        {
            ((Cursor) (obj)).close();
            return arraylist;
        }
          goto _L4
_L3:
        String s1 = as[i];
        if (s1.contains("'"))
        {
            s1.replace("'", "''");
        }
        i++;
          goto _L5
_L4:
        as = s_EntitiesMap.get(class1, ((Cursor) (obj)).getLong(((Cursor) (obj)).getColumnIndex("_id")));
        s = as;
        if (as != null)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        s = (ActiveRecordBase)class1.newInstance();
        s.m_NeedsInsert = false;
        s.inflate(((Cursor) (obj)));
        s.m_Database = m_Database;
        arraylist.add(s);
          goto _L6
        class1;
        throw new ActiveRecordException(class1.getLocalizedMessage());
        class1;
        ((Cursor) (obj)).close();
        throw class1;
        class1;
        throw new ActiveRecordException(class1.getLocalizedMessage());
          goto _L5
    }

    public List find(Class class1, boolean flag, String s, String as[], String s1, String s2, String s3, 
            String s4)
        throws ActiveRecordException
    {
        ArrayList arraylist;
        if (m_Database == null)
        {
            throw new ActiveRecordException("Set database first");
        }
        ActiveRecordBase activerecordbase;
        try
        {
            activerecordbase = (ActiveRecordBase)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        arraylist = new ArrayList();
        s1 = m_Database.query(flag, activerecordbase.getTableName(), null, s, as, s1, s2, s3, s4);
_L1:
        flag = s1.moveToNext();
        if (!flag)
        {
            s1.close();
            return arraylist;
        }
        as = s_EntitiesMap.get(class1, s1.getLong(s1.getColumnIndex("_id")));
        s = as;
        if (as != null)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        s = (ActiveRecordBase)class1.newInstance();
        s.m_NeedsInsert = false;
        s.inflate(s1);
        s.m_Database = m_Database;
        arraylist.add(s);
          goto _L1
        class1;
        throw new ActiveRecordException(class1.getLocalizedMessage());
        class1;
        s1.close();
        throw class1;
        class1;
        throw new ActiveRecordException(class1.getLocalizedMessage());
    }

    public List findAll(Class class1)
        throws ActiveRecordException
    {
        return find(class1, null, null);
    }

    public List findAll(Class class1, int i, int j)
        throws ActiveRecordException
    {
        Cursor cursor;
        ArrayList arraylist;
        if (m_Database == null)
        {
            throw new ActiveRecordException("Set database first");
        }
        ActiveRecordBase activerecordbase;
        boolean flag;
        try
        {
            activerecordbase = (ActiveRecordBase)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        arraylist = new ArrayList();
        cursor = m_Database.query(activerecordbase.getTableName(), null, null, null);
        cursor.moveToPosition(i);
_L4:
        flag = cursor.moveToNext();
        if (flag) goto _L2; else goto _L1
_L1:
        cursor.close();
        return arraylist;
_L2:
        if (cursor.getPosition() > i + j) goto _L1; else goto _L3
_L3:
        ActiveRecordBase activerecordbase2 = s_EntitiesMap.get(class1, cursor.getLong(cursor.getColumnIndex("_id")));
        ActiveRecordBase activerecordbase1;
        activerecordbase1 = activerecordbase2;
        if (activerecordbase2 != null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        activerecordbase1 = (ActiveRecordBase)class1.newInstance();
        activerecordbase1.m_NeedsInsert = false;
        activerecordbase1.inflate(cursor);
        activerecordbase1.m_Database = m_Database;
        arraylist.add(activerecordbase1);
          goto _L4
        class1;
        throw new ActiveRecordException(class1.getLocalizedMessage());
        class1;
        cursor.close();
        throw class1;
        class1;
        throw new ActiveRecordException(class1.getLocalizedMessage());
    }

    public List findByColumn(Class class1, String s, String s1)
        throws ActiveRecordException
    {
        return find(class1, String.format("%s = ?", new Object[] {
            s
        }), new String[] {
            s1
        });
    }

    public ActiveRecordBase findByID(Class class1, long l)
        throws ActiveRecordException
    {
        ActiveRecordBase activerecordbase;
        if (m_Database == null)
        {
            throw new ActiveRecordException("Set database first");
        }
        activerecordbase = s_EntitiesMap.get(class1, l);
        if (activerecordbase != null)
        {
            return activerecordbase;
        }
        boolean flag;
        try
        {
            activerecordbase = (ActiveRecordBase)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        class1 = m_Database.query(activerecordbase.getTableName(), null, "_id = ?", new String[] {
            String.valueOf(l)
        });
        flag = class1.moveToNext();
        if (!flag)
        {
            class1.close();
            return null;
        }
        activerecordbase.inflate(class1);
        activerecordbase.m_NeedsInsert = false;
        activerecordbase.m_Database = m_Database;
        class1.close();
        return activerecordbase;
        Exception exception;
        exception;
        class1.close();
        throw exception;
    }

    public List findDistinctColumn(Class class1, boolean flag, String s, String s1, String as[])
        throws ActiveRecordException
    {
        if (m_Database == null)
        {
            throw new ActiveRecordException("Set database first");
        }
        ActiveRecordBase activerecordbase;
        try
        {
            activerecordbase = (ActiveRecordBase)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        class1 = new ArrayList();
        s1 = m_Database.query(flag, activerecordbase.getTableName(), new String[] {
            CamelNotationHelper.toSQLName(s)
        }, s1, as, null, null, null, null);
_L1:
        flag = s1.moveToNext();
        if (!flag)
        {
            s1.close();
            return class1;
        }
        class1.add(s1.getString(s1.getColumnIndex(CamelNotationHelper.toSQLName(s))));
          goto _L1
        class1;
        throw new ActiveRecordException(class1.getLocalizedMessage());
        class1;
        s1.close();
        throw class1;
    }

    protected List getColumnFields()
    {
        ArrayList arraylist;
        Field afield[];
        int i;
        boolean flag;
        int j;
        flag = false;
        afield = getClass().getDeclaredFields();
        arraylist = new ArrayList();
        j = afield.length;
        i = 0;
_L5:
        if (i < j) goto _L2; else goto _L1
_L1:
        if (getClass().equals(com/hmobile/activerecorbase/ActiveRecordBase)) goto _L4; else goto _L3
_L3:
        afield = com/hmobile/activerecorbase/ActiveRecordBase.getDeclaredFields();
        j = afield.length;
        i = ((flag) ? 1 : 0);
_L6:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_116;
        }
_L4:
        return arraylist;
_L2:
        Field field = afield[i];
        if (!field.getName().startsWith("m_") && !field.getName().startsWith("s_"))
        {
            arraylist.add(field);
        }
        i++;
          goto _L5
        Field field1 = afield[i];
        if (!field1.getName().startsWith("m_") && !field1.getName().startsWith("s_"))
        {
            arraylist.add(field1);
        }
        i++;
          goto _L6
    }

    protected List getColumnFieldsWithoutID()
    {
        Field afield[] = getClass().getDeclaredFields();
        ArrayList arraylist = new ArrayList();
        int j = afield.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return arraylist;
            }
            Field field = afield[i];
            if (!field.getName().startsWith("m_") && !field.getName().startsWith("s_"))
            {
                arraylist.add(field);
            }
            i++;
        } while (true);
    }

    protected String[] getColumns()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = getColumnFields().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return (String[])arraylist.toArray(new String[0]);
            }
            arraylist.add(((Field)iterator.next()).getName());
        } while (true);
    }

    protected String[] getColumnsWithoutID()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = getColumnFieldsWithoutID().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return (String[])arraylist.toArray(new String[0]);
            }
            arraylist.add(((Field)iterator.next()).getName());
        } while (true);
    }

    public Database getDatabase()
    {
        return m_Database;
    }

    protected String[] getDatabaseColumns()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = getColumnFieldsWithoutID().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return (String[])arraylist.toArray(new String[0]);
            }
            arraylist.add(CamelNotationHelper.toSQLName(((Field)iterator.next()).getName()));
        } while (true);
    }

    public long getID()
    {
        return _id;
    }

    public ActiveRecordBase getRandom(Class class1)
        throws ActiveRecordException
    {
        int i;
        int k;
        k = getRecordCount(class1);
        i = 0;
_L2:
        if (i > 0 && i <= k)
        {
            return findByID(class1, i);
        }
        int j = (new Random((new Date()).getTime())).nextInt(k);
        i = j;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        exception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public int getRecordCount(Class class1)
        throws ActiveRecordException
    {
        if (m_Database == null)
        {
            throw new ActiveRecordException("Set database first");
        }
        Cursor cursor;
        int i;
        long l;
        try
        {
            class1 = (ActiveRecordBase)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        new ArrayList();
        try
        {
            cursor = m_Database.query(class1.getTableName(), null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return 0;
        }
        i = 0;
        if (cursor.moveToNext())
        {
            break MISSING_BLOCK_LABEL_107;
        }
        l = DatabaseUtils.queryNumEntries(m_Database.getSqlLiteDatabase(), class1.getTableName());
        return (int)l - 1;
        for (i++; false;)
        {
        }

        break MISSING_BLOCK_LABEL_50;
    }

    protected String getTableName()
    {
        return CamelNotationHelper.toSQLName(getClass().getSimpleName());
    }

    void inflate(Cursor cursor)
        throws ActiveRecordException
    {
        HashMap hashmap;
        Iterator iterator;
        hashmap = new HashMap();
        iterator = getColumnFields().iterator();
_L10:
        if (!iterator.hasNext())
        {
            s_EntitiesMap.set(this);
            cursor = hashmap.keySet().iterator();
            break MISSING_BLOCK_LABEL_48;
        }
        field = (Field)iterator.next();
        Object obj;
        obj1 = field.getType().getName();
        obj = CamelNotationHelper.toSQLName(field.getName());
        if (((String) (obj1)).equals("long"))
        {
            field.setLong(this, cursor.getLong(cursor.getColumnIndex(((String) (obj)))));
            continue; /* Loop/switch isn't completed */
        }
        if (!((String) (obj1)).equals("java.lang.String"))
        {
            break MISSING_BLOCK_LABEL_194;
        }
        obj1 = cursor.getString(cursor.getColumnIndex(((String) (obj))));
        obj = obj1;
        if (((String) (obj1)).equals("null"))
        {
            obj = null;
        }
        try
        {
            field.set(this, obj);
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            throw new ActiveRecordException(cursor.getLocalizedMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            throw new ActiveRecordException(cursor.getLocalizedMessage());
        }
        continue; /* Loop/switch isn't completed */
        if (((String) (obj1)).equals("double"))
        {
            field.setDouble(this, cursor.getDouble(cursor.getColumnIndex(((String) (obj)))));
            continue; /* Loop/switch isn't completed */
        }
        if (((String) (obj1)).equals("boolean"))
        {
            field.setBoolean(this, cursor.getString(cursor.getColumnIndex(((String) (obj)))).equals("true"));
            continue; /* Loop/switch isn't completed */
        }
        if (((String) (obj1)).equals("[B"))
        {
            field.set(this, cursor.getBlob(cursor.getColumnIndex(((String) (obj)))));
            continue; /* Loop/switch isn't completed */
        }
        if (((String) (obj1)).equals("int"))
        {
            field.setInt(this, cursor.getInt(cursor.getColumnIndex(((String) (obj)))));
            continue; /* Loop/switch isn't completed */
        }
        if (((String) (obj1)).equals("float"))
        {
            field.setFloat(this, cursor.getFloat(cursor.getColumnIndex(((String) (obj)))));
            continue; /* Loop/switch isn't completed */
        }
        if (((String) (obj1)).equals("short"))
        {
            field.setShort(this, cursor.getShort(cursor.getColumnIndex(((String) (obj)))));
            continue; /* Loop/switch isn't completed */
        }
        if (((String) (obj1)).equals("java.sql.Timestamp"))
        {
            field.set(this, new Timestamp(cursor.getLong(cursor.getColumnIndex(((String) (obj))))));
            continue; /* Loop/switch isn't completed */
        }
        if (!((String) (obj1)).equals(java/util/ArrayList.getName())) goto _L2; else goto _L1
_L1:
        obj1 = cursor.getString(cursor.getColumnIndex(((String) (obj))));
        obj = new ArrayList();
        obj1 = ((String) (obj1)).split("##");
        j = obj1.length;
        i = 0;
_L3:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_497;
        }
        field.set(this, obj);
        continue; /* Loop/switch isn't completed */
        ((ArrayList) (obj)).add(obj1[i]);
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        flag = ((String) (obj1)).equals("java.util.Date");
        if (!flag) goto _L5; else goto _L4
_L4:
        obj1 = null;
        s = cursor.getString(cursor.getColumnIndex(((String) (obj))));
        obj = obj1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_597;
        }
        obj = obj1;
        if (s.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_597;
        }
        obj = getDateFormat();
        if (!s.contains(":"))
        {
            obj = "dd/MM/yyyy";
        }
        obj = (new SimpleDateFormat(((String) (obj)))).parse(s);
_L6:
        field.set(this, obj);
        continue; /* Loop/switch isn't completed */
        obj;
        ((ParseException) (obj)).printStackTrace();
        obj = obj1;
        if (true) goto _L6; else goto _L5
_L5:
        if (field.getType().getSuperclass() != com/hmobile/activerecorbase/ActiveRecordBase)
        {
            break MISSING_BLOCK_LABEL_678;
        }
        l = cursor.getLong(cursor.getColumnIndex(((String) (obj))));
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_668;
        }
        hashmap.put(field, Long.valueOf(l));
        continue; /* Loop/switch isn't completed */
        field.set(this, null);
        continue; /* Loop/switch isn't completed */
        throw new ActiveRecordException("Class cannot be read from Sqlite3 database.");
_L8:
        Object obj1;
        Field field;
        String s;
        int i;
        int j;
        long l;
        boolean flag;
        if (!cursor.hasNext())
        {
            return;
        }
        obj = (Field)cursor.next();
        ((Field) (obj)).set(this, findByID(((Field) (obj)).getType(), ((Long)hashmap.get(obj)).longValue()));
        if (true) goto _L8; else goto _L7
_L7:
        cursor;
        throw new ActiveRecordException(cursor.getLocalizedMessage());
        cursor;
        throw new ActiveRecordException(cursor.getLocalizedMessage());
        cursor;
        throw new ActiveRecordException(cursor.getLocalizedMessage());
        if (true) goto _L10; else goto _L9
_L9:
    }

    public long insert()
        throws ActiveRecordException
    {
        ContentValues contentvalues;
        Iterator iterator;
        List list;
        if (_id > 0L)
        {
            list = getColumnFields();
        } else
        {
            list = getColumnFieldsWithoutID();
        }
        contentvalues = new ContentValues(list.size());
        iterator = list.iterator();
_L7:
        Field field;
        if (!iterator.hasNext())
        {
            _id = m_Database.insert(getTableName(), contentvalues);
            if (-1L != _id)
            {
                m_NeedsInsert = false;
            }
            return _id;
        }
        field = (Field)iterator.next();
        if (field.getType().getSuperclass() != com/hmobile/activerecorbase/ActiveRecordBase) goto _L2; else goto _L1
_L1:
        Object obj2 = CamelNotationHelper.toSQLName(field.getName());
        if (field.get(this) == null) goto _L4; else goto _L3
_L3:
        Object obj = String.valueOf(((ActiveRecordBase)field.get(this))._id);
_L5:
        contentvalues.put(((String) (obj2)), ((String) (obj)));
        continue; /* Loop/switch isn't completed */
_L4:
        obj = "0";
        if (true) goto _L5; else goto _L2
_L2:
        obj = "";
        if (field.getType() != java/util/Date)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        obj2 = (Date)field.get(this);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        obj = (new SimpleDateFormat(getDateFormat())).format(((Date) (obj2)));
        contentvalues.put(CamelNotationHelper.toSQLName(field.getName()), String.valueOf(obj));
        continue; /* Loop/switch isn't completed */
        if (field.getType().getName().equalsIgnoreCase("[B"))
        {
            byte abyte0[] = (byte[])field.get(this);
            contentvalues.put(CamelNotationHelper.toSQLName(field.getName()), abyte0);
            continue; /* Loop/switch isn't completed */
        }
        if (field.getType().getName().equalsIgnoreCase(java/util/ArrayList.getName()))
        {
            Object obj1 = (ArrayList)field.get(this);
            obj1 = Utils.Instance().join(((List) (obj1)), "##");
            contentvalues.put(CamelNotationHelper.toSQLName(field.getName()), ((String) (obj1)));
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            String s = String.valueOf(field.get(this));
            contentvalues.put(CamelNotationHelper.toSQLName(field.getName()), String.valueOf(s));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new ActiveRecordException(((IllegalAccessException) (obj)).getLocalizedMessage());
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean isExist(Class class1, String s, String as[])
        throws ActiveRecordException
    {
        boolean flag = false;
        if (m_Database == null)
        {
            throw new ActiveRecordException("Set database first");
        }
        int i;
        try
        {
            class1 = (ActiveRecordBase)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ActiveRecordException(class1.getLocalizedMessage());
        }
        class1 = m_Database.query(class1.getTableName(), null, s, as);
        i = class1.getCount();
        if (i > 0)
        {
            flag = true;
        }
        class1.close();
        return flag;
        s;
        throw new ActiveRecordException(s.getLocalizedMessage());
        s;
        class1.close();
        throw s;
    }

    public boolean isOpen()
    {
        return m_Database.isOpen();
    }

    public ActiveRecordBase newEntity(Class class1)
        throws ActiveRecordException
    {
        ActiveRecordBase activerecordbase;
        try
        {
            activerecordbase = (ActiveRecordBase)class1.newInstance();
            activerecordbase.setDatabase(m_Database);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new ActiveRecordException((new StringBuilder("Can't instantiate ")).append(class1.getClass()).toString());
        }
        catch (InstantiationException instantiationexception)
        {
            throw new ActiveRecordException((new StringBuilder("Can't instantiate ")).append(class1.getClass()).toString());
        }
        return activerecordbase;
    }

    public void open()
        throws ActiveRecordException
    {
        m_Database.open();
    }

    public long save()
        throws ActiveRecordException
    {
        if (m_Database == null)
        {
            throw new ActiveRecordException("Set database first");
        }
        long l;
        if (findByID(getClass(), _id) == null)
        {
            l = insert();
        } else
        {
            l = update();
        }
        s_EntitiesMap.set(this);
        return l;
    }

    public ArrayList saveBatch(Class class1, ArrayList arraylist)
        throws ActiveRecordException
    {
        class1 = new ArrayList();
        if (m_Database == null)
        {
            throw new ActiveRecordException("Set database first");
        }
        m_Database.beginTransaction();
        int i = 0;
        arraylist = arraylist.iterator();
_L3:
        if (arraylist.hasNext()) goto _L2; else goto _L1
_L1:
        m_Database.setTransactionSuccessful();
        m_Database.endTransaction();
        return class1;
_L2:
        ActiveRecordBase activerecordbase = (ActiveRecordBase)arraylist.next();
        Log.d("ACTIVERECORDS--", (new StringBuilder("saveBatch : current count : ")).append(i).toString());
        activerecordbase.save();
        i++;
          goto _L3
        class1;
        throw new ActiveRecordException(class1);
        class1;
        m_Database.endTransaction();
        throw class1;
    }

    public void setDatabase(Database database)
    {
        m_Database = database;
    }

    public void setTransactionSuccessful()
        throws ActiveRecordException
    {
        m_Database.setTransactionSuccessful();
    }

    public int update()
        throws ActiveRecordException
    {
        ContentValues contentvalues;
        Iterator iterator;
        List list = getColumnFieldsWithoutID();
        contentvalues = new ContentValues(list.size());
        iterator = list.iterator();
_L7:
        Field field;
        if (!iterator.hasNext())
        {
            return m_Database.update(getTableName(), contentvalues, "_id = ?", new String[] {
                String.valueOf(_id)
            });
        }
        field = (Field)iterator.next();
        if (field.getType().getSuperclass() != com/hmobile/activerecorbase/ActiveRecordBase) goto _L2; else goto _L1
_L1:
        Object obj1 = CamelNotationHelper.toSQLName(field.getName());
        if (field.get(this) == null) goto _L4; else goto _L3
_L3:
        Object obj = String.valueOf(((ActiveRecordBase)field.get(this))._id);
_L5:
        contentvalues.put(((String) (obj1)), ((String) (obj)));
        continue; /* Loop/switch isn't completed */
_L4:
        obj = "0";
        if (true) goto _L5; else goto _L2
_L2:
        obj = "";
        if (field.getType() != java/util/Date)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (Date)field.get(this);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        obj = (new SimpleDateFormat(getDateFormat())).format(((Date) (obj1)));
_L8:
        contentvalues.put(CamelNotationHelper.toSQLName(field.getName()), String.valueOf(obj));
        if (true) goto _L7; else goto _L6
_L6:
        try
        {
            obj = String.valueOf(field.get(this));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new ActiveRecordException((new StringBuilder("No column ")).append(field.getName()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new ActiveRecordException((new StringBuilder("No column ")).append(field.getName()).toString());
        }
          goto _L8
        if (true) goto _L7; else goto _L9
_L9:
    }

}
