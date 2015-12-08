// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import com.skype.android.addressbook.ContactList;
import com.skype.android.config.FileUtil;
import com.skype.android.util.permission.Permission;
import com.skype.android.util.permission.PermissionUtil;
import java.util.HashMap;

public class AddressBookReader
{
    private static final class a extends Enum
    {

        private static final a $VALUES[];
        public static final a EMAIL;
        public static final a PHONE;
        private static final HashMap mimetypes;
        private final String type;

        public static a get(String s)
        {
            return (a)mimetypes.get(s);
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/skype/android/sync/AddressBookReader$a, s);
        }

        public static a[] values()
        {
            return (a[])$VALUES.clone();
        }

        static 
        {
            EMAIL = new a("EMAIL", 0, "vnd.android.cursor.item/email_v2");
            PHONE = new a("PHONE", 1, "vnd.android.cursor.item/phone_v2");
            $VALUES = (new a[] {
                EMAIL, PHONE
            });
            mimetypes = new HashMap();
            a aa[] = values();
            int j = aa.length;
            for (int i = 0; i < j; i++)
            {
                a a1 = aa[i];
                mimetypes.put(a1.type, a1);
            }

        }

        private a(String s, int i, String s1)
        {
            super(s, i);
            type = s1;
        }
    }


    private static final int CONTACT_ID_INDEX = 0;
    private static final int DATA_INDEX = 1;
    private static final int LOOKUPKEY_INDEX = 2;
    private static final int MIMETYPE_INDEX = 3;
    private static final String PROJECTION[] = {
        "contact_id", "data1", "lookup", "mimetype"
    };
    private static final String SELECTION = "(account_type!='com.skype.contacts.sync' OR account_type IS NULL) AND mimetype IN ('vnd.android.cursor.item/email_v2','vnd.android.cursor.item/phone_v2')";
    private PermissionUtil permissionUtil;
    private final ContentResolver resolver;

    public AddressBookReader(Context context, PermissionUtil permissionutil)
    {
        resolver = context.getContentResolver();
        permissionUtil = permissionutil;
    }

    private ContactList getAllContacts(ContactList contactlist)
    {
        if (permissionUtil.a(Permission.d))
        {
            getAllData(contactlist);
        }
        return contactlist;
    }

    private void getAllData(ContactList contactlist)
    {
        Cursor cursor;
        Object obj;
        obj = android.provider.ContactsContract.Data.CONTENT_URI;
        cursor = null;
        obj = resolver.query(((android.net.Uri) (obj)), PROJECTION, "(account_type!='com.skype.contacts.sync' OR account_type IS NULL) AND mimetype IN ('vnd.android.cursor.item/email_v2','vnd.android.cursor.item/phone_v2')", null, null);
        if (obj == null)
        {
            FileUtil.closeStream(((java.io.Closeable) (obj)));
            return;
        }
_L5:
        cursor = ((Cursor) (obj));
        if (!((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        cursor = ((Cursor) (obj));
        a a1 = a.get(((Cursor) (obj)).getString(3));
        cursor = ((Cursor) (obj));
        String s = ((Cursor) (obj)).getString(2);
        cursor = ((Cursor) (obj));
        String s1 = ((Cursor) (obj)).getString(1);
        if (a1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        cursor = ((Cursor) (obj));
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$android$sync$AddressBookReader$MIMETYPE[];

            static 
            {
                $SwitchMap$com$skype$android$sync$AddressBookReader$MIMETYPE = new int[a.values().length];
                try
                {
                    $SwitchMap$com$skype$android$sync$AddressBookReader$MIMETYPE[a.EMAIL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$sync$AddressBookReader$MIMETYPE[a.PHONE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.skype.android.sync.AddressBookReader.MIMETYPE[a1.ordinal()];
        JVM INSTR tableswitch 1 2: default 154
    //                   1 116
    //                   2 136;
           goto _L1 _L2 _L3
_L1:
        continue; /* Loop/switch isn't completed */
_L2:
        cursor = ((Cursor) (obj));
        contactlist.addEmail(s, s1);
        continue; /* Loop/switch isn't completed */
        contactlist;
        FileUtil.closeStream(cursor);
        throw contactlist;
_L3:
        cursor = ((Cursor) (obj));
        contactlist.addPhone(s, s1);
        if (true) goto _L5; else goto _L4
_L4:
        FileUtil.closeStream(((java.io.Closeable) (obj)));
        return;
    }

    public ContactList getAllContacts()
    {
        return getAllContacts(new ContactList());
    }

    public com.skype.android.addressbook.ContactIngestionJNI.ContactList getAllContactsLegacy()
    {
        return (com.skype.android.addressbook.ContactIngestionJNI.ContactList)getAllContacts(new com.skype.android.addressbook.ContactIngestionJNI.ContactList());
    }

}
