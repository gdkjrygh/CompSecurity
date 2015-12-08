// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.common.Closeables;
import me.lyft.android.common.Strings;
import me.lyft.android.data.ContactsDatabaseHelper;
import rx.Observable;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.providers:
//            ISplitFareProvider, UserContact, ContactPhone

public class SplitFareDatabaseProvider
    implements ISplitFareProvider
{

    private static final String CONTACT_PROJECTION[] = {
        "_id", "name", "phone", "times_splitted"
    };
    private static final String PHONE_PROJECTION[] = {
        "_id", "phone", "times_splitted"
    };
    private static final String PHONE_SELECTION = String.format("%s =?", new Object[] {
        "phone"
    });
    private final ContactsDatabaseHelper databaseHelper;
    private final rx.Observable.OnSubscribe splitFareContactsSubscriber = new rx.Observable.OnSubscribe() {

        final SplitFareDatabaseProvider this$0;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber)
        {
            Object obj1;
            Object obj2;
            String s;
            obj2 = null;
            s = null;
            obj1 = null;
            Object obj = databaseHelper.getReadableDatabase();
            obj1 = s;
            obj2 = ((SQLiteDatabase) (obj)).query(true, "Contacts", SplitFareDatabaseProvider.CONTACT_PROJECTION, null, null, null, null, String.format("%s DESC", new Object[] {
                "times_splitted"
            }), null);
            if (obj2 == null) goto _L2; else goto _L1
_L1:
            obj1 = obj2;
            if (!((Cursor) (obj2)).moveToFirst()) goto _L2; else goto _L3
_L3:
            obj1 = obj2;
            int i = ((Cursor) (obj2)).getColumnIndex("name");
            obj1 = obj2;
            int j = ((Cursor) (obj2)).getColumnIndex("phone");
_L4:
            obj1 = obj2;
            s = ((Cursor) (obj2)).getString(i);
            obj1 = obj2;
            ContactPhone contactphone = new ContactPhone(((Cursor) (obj2)).getString(j));
            obj1 = obj2;
            subscriber.onNext((new UserContact(s)).setContactPhone(contactphone));
            obj1 = obj2;
            if (((Cursor) (obj2)).moveToNext()) goto _L4; else goto _L2
_L2:
            obj1 = obj2;
            subscriber.onCompleted();
            Closeables.closeQuietly(((java.io.Closeable) (obj)));
            Closeables.closeQuietly(((java.io.Closeable) (obj2)));
            return;
            obj2;
            obj = null;
_L8:
            subscriber.onError(((Throwable) (obj2)));
            Closeables.closeQuietly(((java.io.Closeable) (obj)));
            Closeables.closeQuietly(((java.io.Closeable) (obj1)));
            return;
            subscriber;
            obj = null;
            obj1 = obj2;
_L6:
            Closeables.closeQuietly(((java.io.Closeable) (obj1)));
            Closeables.closeQuietly(((java.io.Closeable) (obj)));
            throw subscriber;
            subscriber;
            obj2 = null;
            obj1 = obj;
            obj = obj2;
            continue; /* Loop/switch isn't completed */
            subscriber;
            obj1 = obj;
            obj = obj2;
            continue; /* Loop/switch isn't completed */
            subscriber;
            obj2 = obj;
            obj = obj1;
            obj1 = obj2;
            if (true) goto _L6; else goto _L5
_L5:
            obj2;
            if (true) goto _L8; else goto _L7
_L7:
        }

            
            {
                this$0 = SplitFareDatabaseProvider.this;
                super();
            }
    };

    public SplitFareDatabaseProvider(ContactsDatabaseHelper contactsdatabasehelper)
    {
        databaseHelper = contactsdatabasehelper;
    }

    private int getTimesSplitted(SQLiteDatabase sqlitedatabase, String s)
    {
        sqlitedatabase = sqlitedatabase.query(false, "Contacts", PHONE_PROJECTION, PHONE_SELECTION, new String[] {
            s
        }, null, null, null, null);
        int i = -1;
        int j = i;
        if (sqlitedatabase != null)
        {
            if (sqlitedatabase.moveToFirst())
            {
                i = sqlitedatabase.getInt(sqlitedatabase.getColumnIndex("times_splitted"));
            }
            Closeables.closeQuietly(sqlitedatabase);
            j = i;
        }
        return j;
    }

    private void incrementSplitFareCount(SQLiteDatabase sqlitedatabase, List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            Object obj = (UserContact)list.next();
            String s = ((UserContact) (obj)).getName();
            if (!Strings.isNullOrEmpty(s))
            {
                obj = ((UserContact) (obj)).getPhoneNumber().getPhoneNumber();
                int i = getTimesSplitted(sqlitedatabase, ((String) (obj)));
                if (i == -1)
                {
                    insertSplitFareContact(sqlitedatabase, s, ((String) (obj)));
                } else
                {
                    updateSplitFareCount(sqlitedatabase, ((String) (obj)), i + 1);
                }
            }
        } while (true);
    }

    private void insertSplitFareContact(SQLiteDatabase sqlitedatabase, String s, String s1)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("name", s);
        contentvalues.put("phone", s1);
        contentvalues.put("times_splitted", Integer.valueOf(1));
        contentvalues.put("last_time_splitted", Long.valueOf(System.currentTimeMillis()));
        sqlitedatabase.insert("Contacts", null, contentvalues);
    }

    private void updateSplitFareCount(SQLiteDatabase sqlitedatabase, String s, int i)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("times_splitted", Integer.valueOf(i));
        contentvalues.put("last_time_splitted", Long.valueOf(System.currentTimeMillis()));
        sqlitedatabase.update("Contacts", contentvalues, PHONE_SELECTION, new String[] {
            s
        });
    }

    public void incrementSplitFareCount(List list)
    {
        SQLiteDatabase sqlitedatabase = databaseHelper.getWritableDatabase();
        incrementSplitFareCount(sqlitedatabase, list);
        Closeables.closeQuietly(sqlitedatabase);
        return;
        list;
        Closeables.closeQuietly(sqlitedatabase);
        throw list;
    }

    public Observable observeTopSplitFareContacts()
    {
        return Observable.create(splitFareContactsSubscriber);
    }



}
