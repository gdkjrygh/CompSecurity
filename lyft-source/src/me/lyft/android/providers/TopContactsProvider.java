// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.HashSet;
import java.util.Set;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.common.Closeables;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.User;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

// Referenced classes of package me.lyft.android.providers:
//            UserContact

public class TopContactsProvider
{

    private final ContentResolver contentResolver;
    private final IUserProvider userProvider;

    public TopContactsProvider(ContentResolver contentresolver, IUserProvider iuserprovider)
    {
        contentResolver = contentresolver;
        userProvider = iuserprovider;
    }

    private static String getString(Cursor cursor, String s)
    {
        int i = cursor.getColumnIndex(s);
        if (i != -1)
        {
            return cursor.getString(i);
        } else
        {
            return null;
        }
    }

    private String queryUserEmail(String s)
    {
        ContentResolver contentresolver = contentResolver;
        Object obj = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI;
        String s1 = String.format("%s =?", new Object[] {
            "display_name"
        });
        obj = contentresolver.query(((android.net.Uri) (obj)), new String[] {
            "contact_id", "display_name", "data1", "is_super_primary"
        }, s1, new String[] {
            s
        }, "is_super_primary DESC");
        contentresolver = null;
        s = contentresolver;
        if (obj != null)
        {
            s = contentresolver;
            if (((Cursor) (obj)).moveToFirst())
            {
                s = ((Cursor) (obj)).getString(((Cursor) (obj)).getColumnIndex("data1"));
            }
        }
        Closeables.closeQuietly(((java.io.Closeable) (obj)));
        return s;
    }

    private String queryUserPhoto(String s)
    {
        Object obj = null;
        Object obj1 = contentResolver;
        android.net.Uri uri = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI;
        String s1 = String.format("%s =? AND %s IS NOT NULL", new Object[] {
            "display_name", "photo_uri"
        });
        obj1 = ((ContentResolver) (obj1)).query(uri, new String[] {
            "contact_id", "display_name", "photo_uri"
        }, s1, new String[] {
            s
        }, null);
        s = obj;
        if (obj1 != null)
        {
            s = obj;
            if (((Cursor) (obj1)).moveToFirst())
            {
                s = ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndex("photo_uri"));
            }
        }
        Closeables.closeQuietly(((java.io.Closeable) (obj1)));
        return s;
    }

    public Observable createTimesContactedObservable(final int limit)
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final TopContactsProvider this$0;
            final int val$limit;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                Object obj1 = null;
                Object obj;
                obj = contentResolver;
                android.net.Uri uri = android.provider.ContactsContract.Contacts.CONTENT_URI;
                String s1 = String.format("%s=? OR %s=?", new Object[] {
                    "display_name_source", "display_name_source"
                });
                String s3 = String.format("%s DESC LIMIT %d", new Object[] {
                    "times_contacted", Integer.valueOf(limit)
                });
                obj = ((ContentResolver) (obj)).query(uri, new String[] {
                    "_id", "last_time_contacted", "times_contacted", "photo_uri", "display_name", "display_name_source"
                }, s1, new String[] {
                    String.valueOf(40), String.valueOf(35)
                }, s3);
                obj1 = obj;
                if (obj1 == null) goto _L2; else goto _L1
_L1:
                obj = obj1;
                if (!((Cursor) (obj1)).moveToFirst()) goto _L2; else goto _L3
_L3:
                obj = obj1;
                String s = TopContactsProvider.getString(((Cursor) (obj1)), "display_name");
                obj = obj1;
                String s2 = TopContactsProvider.getString(((Cursor) (obj1)), "photo_uri");
                obj = obj1;
                subscriber.onNext((new UserContact(s)).setPhotoUri(s2));
                obj = obj1;
                boolean flag = ((Cursor) (obj1)).moveToNext();
                if (flag) goto _L3; else goto _L2
_L2:
                Closeables.closeQuietly(((java.io.Closeable) (obj1)));
                subscriber.onCompleted();
                return;
                Object obj2;
                obj2;
                obj1 = null;
_L7:
                obj = obj1;
                subscriber.onError(((Throwable) (obj2)));
                Closeables.closeQuietly(((java.io.Closeable) (obj1)));
                subscriber.onCompleted();
                return;
                obj;
_L5:
                Closeables.closeQuietly(((java.io.Closeable) (obj1)));
                subscriber.onCompleted();
                throw obj;
                obj2;
                obj1 = obj;
                obj = obj2;
                if (true) goto _L5; else goto _L4
_L4:
                obj2;
                if (true) goto _L7; else goto _L6
_L6:
            }

            
            {
                this$0 = TopContactsProvider.this;
                limit = i;
                super();
            }
        });
    }

    public Observable observeTopContacts(int i)
    {
        final HashSet addedContacts = new HashSet();
        addedContacts.add(userProvider.getUser().getFullName());
        return createTimesContactedObservable(i).doOnNext(new Action1() {

            final TopContactsProvider this$0;

            public volatile void call(Object obj)
            {
                call((UserContact)obj);
            }

            public void call(UserContact usercontact)
            {
                if (Strings.isNullOrEmpty(usercontact.getEmail()))
                {
                    usercontact.setEmail(queryUserEmail(usercontact.getName()));
                }
            }

            
            {
                this$0 = TopContactsProvider.this;
                super();
            }
        }).filter(new Func1() {

            final TopContactsProvider this$0;
            final Set val$addedContacts;

            public Boolean call(UserContact usercontact)
            {
                String s;
                boolean flag;
                if (usercontact.getName() == null)
                {
                    s = "";
                } else
                {
                    s = usercontact.getName().trim();
                }
                if (!Strings.isNullOrEmpty(usercontact.getEmail()) && !Strings.isNullOrEmpty(s) && !addedContacts.contains(usercontact.getName()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj)
            {
                return call((UserContact)obj);
            }

            
            {
                this$0 = TopContactsProvider.this;
                addedContacts = set;
                super();
            }
        }).doOnNext(new Action1() {

            final TopContactsProvider this$0;
            final Set val$addedContacts;

            public volatile void call(Object obj)
            {
                call((UserContact)obj);
            }

            public void call(UserContact usercontact)
            {
                addedContacts.add(usercontact.getName());
                if (Strings.isNullOrEmpty(usercontact.getPhotoUri()))
                {
                    usercontact.setPhotoUri(queryUserPhoto(usercontact.getName()));
                }
            }

            
            {
                this$0 = TopContactsProvider.this;
                addedContacts = set;
                super();
            }
        }).toList().subscribeOn(Schedulers.io());
    }




}
