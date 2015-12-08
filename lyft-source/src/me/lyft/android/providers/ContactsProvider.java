// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import android.content.ContentResolver;
import android.database.Cursor;
import me.lyft.android.common.Closeables;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.providers:
//            UserContact, ContactPhone

public class ContactsProvider
{

    final Observable companyObservable;
    final rx.Observable.OnSubscribe companySubscriber = new rx.Observable.OnSubscribe() {

        final ContactsProvider this$0;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber)
        {
            Object obj;
            ContentResolver contentresolver1 = resolver;
            obj = android.provider.ContactsContract.Data.CONTENT_URI;
            String s = (new StringBuilder()).append("display_name").append(" COLLATE NOCASE ASC").toString();
            obj = contentresolver1.query(((android.net.Uri) (obj)), new String[] {
                "display_name", "data1"
            }, "mimetype LIKE ?", new String[] {
                "%organization%"
            }, s);
            Cursor cursor = ((Cursor) (obj));
            int i = ((Cursor) (obj)).getColumnIndex("display_name");
            cursor = ((Cursor) (obj));
            int j = ((Cursor) (obj)).getColumnIndex("data1");
_L2:
            cursor = ((Cursor) (obj));
            if (!((Cursor) (obj)).moveToNext())
            {
                break; /* Loop/switch isn't completed */
            }
            cursor = ((Cursor) (obj));
            subscriber.onNext((new UserContact(((Cursor) (obj)).getString(i))).setCompany(((Cursor) (obj)).getString(j)));
            if (true) goto _L2; else goto _L1
            Exception exception;
            exception;
_L6:
            cursor = ((Cursor) (obj));
            subscriber.onError(exception);
            Closeables.closeQuietly(((java.io.Closeable) (obj)));
            return;
_L1:
            cursor = ((Cursor) (obj));
            subscriber.onCompleted();
            Closeables.closeQuietly(((java.io.Closeable) (obj)));
            return;
            subscriber;
            cursor = null;
_L4:
            Closeables.closeQuietly(cursor);
            throw subscriber;
            subscriber;
            if (true) goto _L4; else goto _L3
_L3:
            exception;
            obj = null;
            if (true) goto _L6; else goto _L5
_L5:
        }

            
            {
                this$0 = ContactsProvider.this;
                super();
            }
    };
    final Func1 emailLengthFilter = new Func1() {

        final ContactsProvider this$0;

        public Boolean call(UserContact usercontact)
        {
            boolean flag;
            if (usercontact.getEmail().length() < 40)
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
                this$0 = ContactsProvider.this;
                super();
            }
    };
    final rx.Observable.OnSubscribe emailSubscriber = new rx.Observable.OnSubscribe() {

        final ContactsProvider this$0;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber)
        {
            Cursor cursor1 = resolver.query(android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI, new String[] {
                "display_name", "data1"
            }, null, null, "display_name COLLATE NOCASE ASC");
            Cursor cursor = cursor1;
            int i = cursor1.getColumnIndex("display_name");
            cursor = cursor1;
            int j = cursor1.getColumnIndex("data1");
_L2:
            cursor = cursor1;
            if (!cursor1.moveToNext())
            {
                break; /* Loop/switch isn't completed */
            }
            cursor = cursor1;
            subscriber.onNext((new UserContact(cursor1.getString(i))).setEmail(cursor1.getString(j)));
            if (true) goto _L2; else goto _L1
            Exception exception;
            exception;
_L6:
            cursor = cursor1;
            subscriber.onError(exception);
            Closeables.closeQuietly(cursor1);
            return;
_L1:
            cursor = cursor1;
            subscriber.onCompleted();
            Closeables.closeQuietly(cursor1);
            return;
            subscriber;
            cursor = null;
_L4:
            Closeables.closeQuietly(cursor);
            throw subscriber;
            subscriber;
            if (true) goto _L4; else goto _L3
_L3:
            exception;
            cursor1 = null;
            if (true) goto _L6; else goto _L5
_L5:
        }

            
            {
                this$0 = ContactsProvider.this;
                super();
            }
    };
    final Observable emailsObservable;
    final rx.Observable.OnSubscribe phoneSubscriber = new rx.Observable.OnSubscribe() {

        final ContactsProvider this$0;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber)
        {
            Cursor cursor1 = resolver.query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[] {
                "display_name", "data1", "data2"
            }, null, null, "display_name COLLATE NOCASE ASC");
            Cursor cursor = cursor1;
            int i = cursor1.getColumnIndex("display_name");
            cursor = cursor1;
            int j = cursor1.getColumnIndex("data1");
            cursor = cursor1;
            int k = cursor1.getColumnIndex("data2");
_L2:
            cursor = cursor1;
            if (!cursor1.moveToNext())
            {
                break; /* Loop/switch isn't completed */
            }
            cursor = cursor1;
            subscriber.onNext((new UserContact(cursor1.getString(i))).setContactPhone(new ContactPhone(cursor1.getString(j), cursor1.getInt(k))));
            if (true) goto _L2; else goto _L1
            Exception exception;
            exception;
_L6:
            cursor = cursor1;
            subscriber.onError(exception);
            Closeables.closeQuietly(cursor1);
            return;
_L1:
            cursor = cursor1;
            subscriber.onCompleted();
            Closeables.closeQuietly(cursor1);
            return;
            subscriber;
            cursor = null;
_L4:
            Closeables.closeQuietly(cursor);
            throw subscriber;
            subscriber;
            if (true) goto _L4; else goto _L3
_L3:
            exception;
            cursor1 = null;
            if (true) goto _L6; else goto _L5
_L5:
        }

            
            {
                this$0 = ContactsProvider.this;
                super();
            }
    };
    final Observable phonesObservable;
    final ContentResolver resolver;

    public ContactsProvider(ContentResolver contentresolver)
    {
        resolver = contentresolver;
        phonesObservable = Observable.create(phoneSubscriber).filter(new PhoneNumberFilter()).cache();
        emailsObservable = Observable.create(emailSubscriber).filter(emailLengthFilter).cache();
        companyObservable = Observable.create(companySubscriber).cache();
    }

    public Builder create()
    {
        return new Builder();
    }

    public Observable getPhonesObservable()
    {
        return phonesObservable;
    }

    private class PhoneNumberFilter
        implements Func1
    {

        private final Set addedPhoneNumbers = new HashSet();

        public Boolean call(UserContact usercontact)
        {
            usercontact = SearchHelper.normalizeNumber(usercontact.getPhoneNumber().getPhoneNumber());
            if (!addedPhoneNumbers.contains(usercontact) && SearchHelper.isNormalizedNumberValid(usercontact))
            {
                addedPhoneNumbers.add(usercontact);
                return Boolean.valueOf(true);
            } else
            {
                return Boolean.valueOf(false);
            }
        }

        public volatile Object call(Object obj)
        {
            return call((UserContact)obj);
        }

        public PhoneNumberFilter()
        {
        }
    }


    private class Builder
    {

        final List observables;
        final ContactsProvider this$0;

        public Builder companies()
        {
            observables.add(companyObservable);
            return this;
        }

        public Builder emails()
        {
            observables.add(emailsObservable);
            return this;
        }

        public Observable observe()
        {
            return Observable.merge(observables).toSortedList().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        }

        public Builder phones()
        {
            observables.add(phonesObservable);
            return this;
        }

        private Builder()
        {
            this$0 = ContactsProvider.this;
            super();
            observables = new ArrayList(4);
        }

    }

}
