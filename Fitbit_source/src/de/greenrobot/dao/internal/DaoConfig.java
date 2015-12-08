// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.dao.internal;

import android.database.sqlite.SQLiteDatabase;
import de.greenrobot.dao.DaoException;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.identityscope.IdentityScope;
import de.greenrobot.dao.identityscope.IdentityScopeLong;
import de.greenrobot.dao.identityscope.IdentityScopeObject;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package de.greenrobot.dao.internal:
//            TableStatements

public final class DaoConfig
    implements Cloneable
{

    public final String allColumns[];
    public final SQLiteDatabase db;
    private IdentityScope identityScope;
    public final boolean keyIsNumeric;
    public final String nonPkColumns[];
    public final String pkColumns[];
    public final Property pkProperty;
    public final Property properties[];
    public final TableStatements statements;
    public final String tablename;

    public DaoConfig(SQLiteDatabase sqlitedatabase, Class class1)
    {
        int i;
        boolean flag;
        db = sqlitedatabase;
        Property property;
        Property aproperty[];
        ArrayList arraylist;
        ArrayList arraylist1;
        String s;
        try
        {
            tablename = (String)class1.getField("TABLENAME").get(null);
            aproperty = reflectProperties(class1);
            properties = aproperty;
            allColumns = new String[aproperty.length];
            arraylist = new ArrayList();
            arraylist1 = new ArrayList();
        }
        // Misplaced declaration of an exception variable
        catch (SQLiteDatabase sqlitedatabase)
        {
            throw new DaoException("Could not init DAOConfig", sqlitedatabase);
        }
        i = 0;
        class1 = null;
_L2:
        if (i >= aproperty.length)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        property = aproperty[i];
        s = property.columnName;
        allColumns[i] = s;
        if (!property.primaryKey)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        arraylist.add(s);
        class1 = property;
        break MISSING_BLOCK_LABEL_340;
        arraylist1.add(s);
        break MISSING_BLOCK_LABEL_340;
        nonPkColumns = (String[])arraylist1.toArray(new String[arraylist1.size()]);
        pkColumns = (String[])arraylist.toArray(new String[arraylist.size()]);
        if (pkColumns.length != 1)
        {
            class1 = null;
        }
        pkProperty = class1;
        statements = new TableStatements(sqlitedatabase, tablename, allColumns, pkColumns);
        if (pkProperty == null)
        {
            break MISSING_BLOCK_LABEL_322;
        }
        sqlitedatabase = pkProperty.type;
        if (sqlitedatabase.equals(Long.TYPE) || sqlitedatabase.equals(java/lang/Long) || sqlitedatabase.equals(Integer.TYPE) || sqlitedatabase.equals(java/lang/Integer) || sqlitedatabase.equals(Short.TYPE) || sqlitedatabase.equals(java/lang/Short) || sqlitedatabase.equals(Byte.TYPE) || sqlitedatabase.equals(java/lang/Byte))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        keyIsNumeric = flag;
        return;
        keyIsNumeric = false;
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public DaoConfig(DaoConfig daoconfig)
    {
        db = daoconfig.db;
        tablename = daoconfig.tablename;
        properties = daoconfig.properties;
        allColumns = daoconfig.allColumns;
        pkColumns = daoconfig.pkColumns;
        nonPkColumns = daoconfig.nonPkColumns;
        pkProperty = daoconfig.pkProperty;
        statements = daoconfig.statements;
        keyIsNumeric = daoconfig.keyIsNumeric;
    }

    private static Property[] reflectProperties(Class class1)
        throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException
    {
        Object aobj[] = Class.forName((new StringBuilder()).append(class1.getName()).append("$Properties").toString()).getDeclaredFields();
        class1 = new ArrayList();
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = aobj[i];
            if ((((Field) (obj)).getModifiers() & 9) != 9)
            {
                continue;
            }
            obj = ((Field) (obj)).get(null);
            if (obj instanceof Property)
            {
                class1.add((Property)obj);
            }
        }

        aobj = new Property[class1.size()];
        for (class1 = class1.iterator(); class1.hasNext();)
        {
            Property property = (Property)class1.next();
            if (aobj[property.ordinal] != null)
            {
                throw new DaoException("Duplicate property ordinals");
            }
            aobj[property.ordinal] = property;
        }

        return ((Property []) (aobj));
    }

    public DaoConfig clone()
    {
        return new DaoConfig(this);
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public IdentityScope getIdentityScope()
    {
        return identityScope;
    }

    public void initIdentityScope(IdentityScopeType identityscopetype)
    {
        if (identityscopetype == IdentityScopeType.None)
        {
            identityScope = null;
            return;
        }
        if (identityscopetype == IdentityScopeType.Session)
        {
            if (keyIsNumeric)
            {
                identityScope = new IdentityScopeLong();
                return;
            } else
            {
                identityScope = new IdentityScopeObject();
                return;
            }
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unsupported type: ").append(identityscopetype).toString());
        }
    }

    public void setIdentityScope(IdentityScope identityscope)
    {
        identityScope = identityscope;
    }
}
