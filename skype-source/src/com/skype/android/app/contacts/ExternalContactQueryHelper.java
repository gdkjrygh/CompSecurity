// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import com.skype.android.config.ecs.EcsConfiguration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactItem

public class ExternalContactQueryHelper
{

    private static final String ALL_CONTACTS_SELECTION = "in_visible_group=1 AND mimetype IN ('vnd.android.cursor.item/phone_v2','vnd.android.cursor.item/email_v2')";
    private static final int CONTACT_ID_IDX = 0;
    private static final String EXISTING_CONTACTS_PROJECTION[] = {
        "contact_id"
    };
    private static final String EXISTING_CONTACTS_SELECTION = "account_type='com.skype.contacts.sync'";
    private static final String SINGLE_ITEM_SELECTION = "lookup=? AND in_visible_group=1 AND mimetype IN ('vnd.android.cursor.item/phone_v2','vnd.android.cursor.item/email_v2')";
    private final Context context;
    private final EcsConfiguration ecsConfiguration;
    Logger log;

    public ExternalContactQueryHelper(Context context1, EcsConfiguration ecsconfiguration)
    {
        log = Logger.getLogger("ExternalContactQueryHelper");
        context = context1;
        ecsConfiguration = ecsconfiguration;
    }

    private void safelyCloseCursor(Cursor cursor)
    {
        if (cursor != null && !cursor.isClosed())
        {
            cursor.close();
        }
    }

    Set getExistingContactIds(ContentResolver contentresolver)
    {
        ContentResolver contentresolver1;
        ContentResolver contentresolver2;
        HashSet hashset;
        hashset = new HashSet();
        contentresolver2 = null;
        contentresolver1 = null;
        contentresolver = contentresolver.query(android.provider.ContactsContract.RawContacts.CONTENT_URI, EXISTING_CONTACTS_PROJECTION, "account_type='com.skype.contacts.sync'", null, "contact_id ASC");
        if (contentresolver == null) goto _L2; else goto _L1
_L1:
        contentresolver1 = contentresolver;
        contentresolver2 = contentresolver;
        if (!contentresolver.moveToFirst()) goto _L2; else goto _L3
_L3:
        contentresolver1 = contentresolver;
        contentresolver2 = contentresolver;
        hashset.add(Integer.valueOf(contentresolver.getInt(0)));
        contentresolver1 = contentresolver;
        contentresolver2 = contentresolver;
        boolean flag = contentresolver.moveToNext();
        if (flag) goto _L3; else goto _L2
_L2:
        safelyCloseCursor(contentresolver);
        return hashset;
        contentresolver;
        contentresolver2 = contentresolver1;
        contentresolver.printStackTrace();
        safelyCloseCursor(contentresolver1);
        return hashset;
        contentresolver;
        safelyCloseCursor(contentresolver2);
        throw contentresolver;
    }

    public List queryExternalResults()
    {
        ArrayList arraylist = new ArrayList();
        if (!ecsConfiguration.showExternalContacts()) goto _L2; else goto _L1
_L1:
        Cursor cursor;
        Cursor cursor1;
        Object obj;
        Set set;
        obj = context.getContentResolver();
        set = getExistingContactIds(((ContentResolver) (obj)));
        cursor1 = null;
        cursor = null;
        obj = ((ContentResolver) (obj)).query(android.provider.ContactsContract.Data.CONTENT_URI, ContactItem.PROJECTION, "in_visible_group=1 AND mimetype IN ('vnd.android.cursor.item/phone_v2','vnd.android.cursor.item/email_v2')", null, "contact_id ASC");
        cursor = ((Cursor) (obj));
        cursor1 = ((Cursor) (obj));
        if (!((Cursor) (obj)).moveToFirst()) goto _L4; else goto _L3
_L3:
        cursor = ((Cursor) (obj));
        cursor1 = ((Cursor) (obj));
        if (!set.contains(Integer.valueOf(((Cursor) (obj)).getInt(0)))) goto _L6; else goto _L5
_L5:
        cursor = ((Cursor) (obj));
        cursor1 = ((Cursor) (obj));
        ((Cursor) (obj)).moveToNext();
_L7:
        cursor = ((Cursor) (obj));
        cursor1 = ((Cursor) (obj));
        boolean flag = ((Cursor) (obj)).isAfterLast();
        if (!flag) goto _L3; else goto _L4
_L4:
        safelyCloseCursor(((Cursor) (obj)));
_L2:
        return arraylist;
_L6:
        cursor = ((Cursor) (obj));
        cursor1 = ((Cursor) (obj));
        arraylist.add(new ContactItem(((Cursor) (obj)), false));
          goto _L7
        Exception exception1;
        exception1;
        cursor1 = cursor;
        exception1.printStackTrace();
        safelyCloseCursor(cursor);
        return arraylist;
        Exception exception;
        exception;
        safelyCloseCursor(cursor1);
        throw exception;
    }

    public ContactItem querySingleContact(String s)
    {
        String s1;
        String s2;
        s2 = null;
        s1 = null;
        s = context.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, ContactItem.PROJECTION, "lookup=? AND in_visible_group=1 AND mimetype IN ('vnd.android.cursor.item/phone_v2','vnd.android.cursor.item/email_v2')", new String[] {
            s
        }, "contact_id ASC");
        s1 = s;
        s2 = s;
        if (!s.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_69;
        }
        s1 = s;
        s2 = s;
        ContactItem contactitem = new ContactItem(s, true);
        safelyCloseCursor(s);
        return contactitem;
        safelyCloseCursor(s);
_L2:
        return null;
        s;
        s2 = s1;
        s.printStackTrace();
        safelyCloseCursor(s1);
        if (true) goto _L2; else goto _L1
_L1:
        s;
        safelyCloseCursor(s2);
        throw s;
    }

}
