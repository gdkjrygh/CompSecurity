// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tjeannin.provigen;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import com.tjeannin.provigen.model.Contract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public abstract class ProviGenProvider extends ContentProvider
{

    protected static final int ITEM = 1;
    protected static final int ITEM_ID = 2;
    private List contracts;
    private volatile boolean isBatchingNotifications;
    private volatile Set mBatchedUris;
    private final Object mBatchingLock = new Object();
    private volatile int mNumBatchingCalls;
    protected SQLiteOpenHelper openHelper;
    protected UriMatcher uriMatcher;

    public ProviGenProvider()
    {
        contracts = new ArrayList();
        isBatchingNotifications = false;
        mBatchedUris = Collections.newSetFromMap(new ConcurrentHashMap());
    }

    private static String[] appendToStringArray(String as[], String s)
    {
        if (as != null)
        {
            String as1[] = new String[as.length + 1];
            System.arraycopy(as, 0, as1, 0, as.length);
            as1[as.length] = s;
            return as1;
        } else
        {
            return (new String[] {
                s
            });
        }
    }

    protected void beginBatching()
    {
        isBatchingNotifications = true;
        synchronized (mBatchingLock)
        {
            mNumBatchingCalls = mNumBatchingCalls + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public abstract Class[] contractClasses();

    public int delete(Uri uri, String s, String as[])
    {
        SQLiteDatabase sqlitedatabase;
        Contract contract;
        sqlitedatabase = openHelper.getWritableDatabase();
        contract = findMatchingContract(uri);
        uriMatcher.match(uri);
        JVM INSTR tableswitch 1 2: default 48
    //                   1 75
    //                   2 97;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown uri ").append(uri).toString());
_L2:
        int i = sqlitedatabase.delete(contract.getTable(), s, as);
_L5:
        notify(uri);
        return i;
_L3:
        String s1 = String.valueOf(ContentUris.parseId(uri));
        if (TextUtils.isEmpty(s))
        {
            i = sqlitedatabase.delete(contract.getTable(), (new StringBuilder()).append(contract.getIdField()).append(" = ? ").toString(), new String[] {
                s1
            });
        } else
        {
            i = sqlitedatabase.delete(contract.getTable(), (new StringBuilder()).append(s).append(" AND ").append(contract.getIdField()).append(" = ? ").toString(), appendToStringArray(as, s1));
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void endBatching()
    {
        Object obj1 = mBatchingLock;
        obj1;
        JVM INSTR monitorenter ;
        mNumBatchingCalls = mNumBatchingCalls - 1;
        if (mNumBatchingCalls < 0)
        {
            throw new IllegalStateException("endBatching() called with no corresponding beginBatching() call");
        }
        break MISSING_BLOCK_LABEL_39;
        Exception exception;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj;
        if (mNumBatchingCalls != 0)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        isBatchingNotifications = false;
        obj = new HashSet(mBatchedUris);
        mBatchedUris.clear();
_L1:
        obj1;
        JVM INSTR monitorexit ;
        if (obj != null)
        {
            Uri uri;
            for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); getContext().getContentResolver().notifyChange(uri, null))
            {
                uri = (Uri)((Iterator) (obj)).next();
            }

        }
        return;
        obj = null;
          goto _L1
    }

    public Contract findMatchingContract(Uri uri)
    {
        for (Iterator iterator = contracts.iterator(); iterator.hasNext();)
        {
            Contract contract = (Contract)iterator.next();
            if (contract.getTable().equals(uri.getPathSegments().get(0)))
            {
                return contract;
            }
        }

        return null;
    }

    public String getType(Uri uri)
    {
        Contract contract = findMatchingContract(uri);
        switch (uriMatcher.match(uri))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown uri ").append(uri).toString());

        case 1: // '\001'
            return (new StringBuilder()).append("vnd.android.cursor.dir/vdn.").append(contract.getTable()).toString();

        case 2: // '\002'
            return (new StringBuilder()).append("vnd.android.cursor.item/vdn.").append(contract.getTable()).toString();
        }
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        SQLiteDatabase sqlitedatabase = openHelper.getWritableDatabase();
        Contract contract = findMatchingContract(uri);
        long l;
        switch (uriMatcher.match(uri))
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown uri ").append(uri).toString());

        case 1: // '\001'
            l = sqlitedatabase.insert(contract.getTable(), null, contentvalues);
            break;
        }
        notify(uri);
        return Uri.withAppendedPath(uri, String.valueOf(l));
    }

    protected void notify(Uri uri)
    {
        if (isBatchingNotifications)
        {
            synchronized (mBatchingLock)
            {
                mBatchedUris.add(uri);
            }
            return;
        } else
        {
            getContext().getContentResolver().notifyChange(uri, null);
            return;
        }
        uri;
        obj;
        JVM INSTR monitorexit ;
        throw uri;
    }

    public boolean onCreate()
    {
        openHelper = openHelper(getContext());
        Class aclass[] = contractClasses();
        int j = aclass.length;
        for (int i = 0; i < j; i++)
        {
            Class class1 = aclass[i];
            contracts.add(new Contract(class1));
        }

        uriMatcher = new UriMatcher(-1);
        Contract contract;
        for (Iterator iterator = contracts.iterator(); iterator.hasNext(); uriMatcher.addURI(contract.getAuthority(), (new StringBuilder()).append(contract.getTable()).append("/#").toString(), 2))
        {
            contract = (Contract)iterator.next();
            uriMatcher.addURI(contract.getAuthority(), contract.getTable(), 1);
        }

        return true;
    }

    public abstract SQLiteOpenHelper openHelper(Context context);

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        SQLiteDatabase sqlitedatabase;
        Contract contract;
        sqlitedatabase = openHelper.getReadableDatabase();
        contract = findMatchingContract(uri);
        uriMatcher.match(uri);
        JVM INSTR tableswitch 1 2: default 48
    //                   1 75
    //                   2 114;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown uri ").append(uri).toString());
_L2:
        as = sqlitedatabase.query(contract.getTable(), as, s, as1, "", "", s1);
_L5:
        as.setNotificationUri(getContext().getContentResolver(), uri);
        return as;
_L3:
        String s2 = String.valueOf(ContentUris.parseId(uri));
        if (TextUtils.isEmpty(s))
        {
            as = sqlitedatabase.query(contract.getTable(), as, (new StringBuilder()).append(contract.getIdField()).append(" = ? ").toString(), new String[] {
                s2
            }, "", "", s1);
        } else
        {
            as = sqlitedatabase.query(contract.getTable(), as, (new StringBuilder()).append(s).append(" AND ").append(contract.getIdField()).append(" = ? ").toString(), appendToStringArray(as1, s2), "", "", s1);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        SQLiteDatabase sqlitedatabase;
        Contract contract;
        sqlitedatabase = openHelper.getWritableDatabase();
        contract = findMatchingContract(uri);
        uriMatcher.match(uri);
        JVM INSTR tableswitch 1 2: default 48
    //                   1 75
    //                   2 99;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown uri ").append(uri).toString());
_L2:
        int i = sqlitedatabase.update(contract.getTable(), contentvalues, s, as);
_L5:
        notify(uri);
        return i;
_L3:
        String s1 = String.valueOf(ContentUris.parseId(uri));
        if (TextUtils.isEmpty(s))
        {
            i = sqlitedatabase.update(contract.getTable(), contentvalues, (new StringBuilder()).append(contract.getIdField()).append(" = ? ").toString(), new String[] {
                s1
            });
        } else
        {
            i = sqlitedatabase.update(contract.getTable(), contentvalues, (new StringBuilder()).append(s).append(" AND ").append(contract.getIdField()).append(" = ? ").toString(), appendToStringArray(as, s1));
        }
        if (true) goto _L5; else goto _L4
_L4:
    }
}
