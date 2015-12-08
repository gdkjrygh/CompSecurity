// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.skype.Contact;
import com.skype.PROPKEY;
import com.skype.android.util.TimeUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.sync:
//            b, a, StatusOperationsBuilder

public class ContactOperationUtils
{

    private static final PROPKEY PHONE_PROPKEYS[];
    private Context context;
    private TimeUtil timeUtil;

    public ContactOperationUtils(Context context1, TimeUtil timeutil)
    {
        if (context1 == null)
        {
            throw new IllegalArgumentException("null context");
        } else
        {
            context = context1;
            timeUtil = timeutil;
            return;
        }
    }

    static boolean eq(String s, String s1)
    {
        return s == s1 || s != null && s.equals(s1);
    }

    private Uri getGroupContentUri()
    {
        return android.provider.ContactsContract.Groups.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
    }

    private int getGroupId(String s)
    {
        int i;
        i = -1;
        s = context.getContentResolver().query(getGroupContentUri(), new String[] {
            "_id"
        }, "account_name=? AND account_type =?", new String[] {
            s, "com.skype.contacts.sync"
        }, null);
        if (s.moveToFirst())
        {
            i = s.getInt(0);
        }
        if (s != null)
        {
            s.close();
        }
        return i;
        Exception exception;
        exception;
        if (s != null)
        {
            s.close();
        }
        throw exception;
    }

    private static List getPhoneNumbers(b b1)
    {
        ArrayList arraylist = new ArrayList();
        PROPKEY apropkey[] = PHONE_PROPKEYS;
        int j = apropkey.length;
        for (int i = 0; i < j; i++)
        {
            PROPKEY propkey = apropkey[i];
            String s = b1.getStrProperty(propkey);
            if (!TextUtils.isEmpty(s))
            {
                arraylist.add(new Pair(propkey, s));
            }
        }

        return arraylist;
    }

    static int getPresence(com.skype.Contact.AVAILABILITY availability)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$Contact$AVAILABILITY[];

            static 
            {
                $SwitchMap$com$skype$Contact$AVAILABILITY = new int[com.skype.Contact.AVAILABILITY.values().length];
                try
                {
                    $SwitchMap$com$skype$Contact$AVAILABILITY[com.skype.Contact.AVAILABILITY.ONLINE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$Contact$AVAILABILITY[com.skype.Contact.AVAILABILITY.AWAY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$Contact$AVAILABILITY[com.skype.Contact.AVAILABILITY.DO_NOT_DISTURB.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.Contact.AVAILABILITY[availability.ordinal()])
        {
        default:
            return 0;

        case 1: // '\001'
            return 5;

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 4;
        }
    }

    public ArrayList cleanUpOrphanRecords(String s)
    {
        ArrayList arraylist = new ArrayList();
        Object obj = (new StringBuilder("sourceid NOT IN (")).append(s).append(") AND account_type = ?").toString();
        String as[] = new String[1];
        as[0] = "com.skype.contacts.sync";
        android.content.ContentProviderOperation.Builder builder = ContentProviderOperation.newDelete(a.addCallerIsSyncAdapterParameter(android.provider.ContactsContract.RawContacts.CONTENT_URI));
        builder.withSelection(((String) (obj)), as);
        arraylist.add(builder.build());
        s = (new StringBuilder("data_sync1 NOT IN (")).append(s).append(") AND account_type = ?").toString();
        obj = ContentProviderOperation.newDelete(a.addCallerIsSyncAdapterParameter(android.provider.ContactsContract.Data.CONTENT_URI));
        ((android.content.ContentProviderOperation.Builder) (obj)).withSelection(s, as);
        arraylist.add(((android.content.ContentProviderOperation.Builder) (obj)).build());
        return arraylist;
    }

    public int createGroup(String s)
    {
        int i = getGroupId(s);
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("account_type", "com.skype.contacts.sync");
            contentvalues.put("account_name", s);
            contentvalues.put("title", s);
            contentvalues.put("group_visible", Integer.valueOf(1));
            context.getContentResolver().insert(getGroupContentUri(), contentvalues);
            i = getGroupId(s);
        }
        return i;
    }

    public ArrayList deleteContact(Contact contact)
    {
        ArrayList arraylist = new ArrayList();
        Object obj = contact.getIdentity();
        android.content.ContentProviderOperation.Builder builder = ContentProviderOperation.newDelete(a.addCallerIsSyncAdapterParameter(android.provider.ContactsContract.RawContacts.CONTENT_URI));
        builder.withSelection("sourceid = ? AND account_type = ?", new String[] {
            obj, "com.skype.contacts.sync"
        });
        arraylist.add(builder.build());
        contact = contact.getIdentity();
        obj = ContentProviderOperation.newDelete(a.addCallerIsSyncAdapterParameter(android.provider.ContactsContract.Data.CONTENT_URI));
        ((android.content.ContentProviderOperation.Builder) (obj)).withSelection("data_sync1 = ?", new String[] {
            contact
        });
        arraylist.add(((android.content.ContentProviderOperation.Builder) (obj)).build());
        return arraylist;
    }

    public ArrayList insertStatusAndMood(b b1, String s, boolean flag)
    {
        if (b1.getType() != com.skype.Contact.TYPE.SKYPE) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        long l2;
        long l3;
        long l4;
        long l5;
        obj1 = b1.getIdentity();
        l4 = -1L;
        l2 = -1L;
        l3 = -1L;
        l5 = -1L;
        obj = null;
        obj1 = context.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, null, "sourceid=? AND account_type=?", new String[] {
            obj1, "com.skype.contacts.sync"
        }, null);
        long l6;
        long l7;
        long l8;
        long l9;
        obj = obj1;
        l6 = l4;
        l7 = l5;
        l8 = l3;
        l9 = l2;
        if (!((Cursor) (obj1)).moveToFirst()) goto _L4; else goto _L3
_L3:
        obj = obj1;
        l6 = l4;
        l7 = l5;
        l8 = l3;
        l9 = l2;
        if (((Cursor) (obj1)).isAfterLast()) goto _L4; else goto _L5
_L5:
        obj = obj1;
        String s2 = ((Cursor) (obj1)).getString(((Cursor) (obj1)).getColumnIndexOrThrow("mimetype"));
        obj = obj1;
        if (!s2.equals("vnd.android.cursor.item/name")) goto _L7; else goto _L6
_L6:
        obj = obj1;
        l6 = ((Cursor) (obj1)).getLong(((Cursor) (obj1)).getColumnIndexOrThrow("_id"));
        l8 = l2;
        l7 = l3;
_L8:
        obj = obj1;
        ((Cursor) (obj1)).moveToNext();
        l4 = l6;
        l3 = l7;
        l2 = l8;
        continue; /* Loop/switch isn't completed */
        b1;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw b1;
_L7:
        obj = obj1;
        if (!s2.equals("vnd.android.cursor.item/com.skype.android.videocall.action"))
        {
            break MISSING_BLOCK_LABEL_291;
        }
        obj = obj1;
        l8 = ((Cursor) (obj1)).getLong(((Cursor) (obj1)).getColumnIndexOrThrow("_id"));
        l6 = l4;
        l7 = l3;
        continue; /* Loop/switch isn't completed */
        obj = obj1;
        if (!s2.equals("vnd.android.cursor.item/com.skype.android.chat.action"))
        {
            break MISSING_BLOCK_LABEL_339;
        }
        obj = obj1;
        l7 = ((Cursor) (obj1)).getLong(((Cursor) (obj1)).getColumnIndexOrThrow("_id"));
        l6 = l4;
        l8 = l2;
        continue; /* Loop/switch isn't completed */
        l6 = l4;
        l7 = l3;
        l8 = l2;
        obj = obj1;
        if (!s2.equals("vnd.android.cursor.item/com.skype.android.skypecall.action"))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = obj1;
        l5 = ((Cursor) (obj1)).getLong(((Cursor) (obj1)).getColumnIndexOrThrow("_id"));
        l6 = l4;
        l7 = l3;
        l8 = l2;
        if (true) goto _L8; else goto _L4
_L4:
        Object obj2;
        int i;
        int j;
        int l;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        i = -1;
        j = -1;
        l = -1;
        s2 = null;
        obj = null;
        obj2 = (new StringBuilder("_id IN (")).append(l6).append(',').append(l9).append(',').append(l8).append(',').append(l7).append(')').toString();
        obj1 = null;
        obj2 = context.getContentResolver().query(android.provider.ContactsContract.StatusUpdates.CONTENT_URI, null, ((String) (obj2)), null, null);
        int i1;
        int j1;
        byte byte0;
        obj1 = obj2;
        i1 = j;
        j1 = i;
        byte0 = l;
        if (!((Cursor) (obj2)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_818;
        }
        obj1 = obj2;
        int k1 = ((Cursor) (obj2)).getColumnIndexOrThrow("presence_data_id");
        obj1 = obj2;
        int l1 = ((Cursor) (obj2)).getColumnIndexOrThrow("mode");
        obj1 = obj2;
        int i2 = ((Cursor) (obj2)).getColumnIndexOrThrow("status");
_L11:
        obj1 = obj2;
        i1 = j;
        j1 = i;
        s2 = ((String) (obj));
        byte0 = l;
        if (((Cursor) (obj2)).isAfterLast())
        {
            break MISSING_BLOCK_LABEL_818;
        }
        obj1 = obj2;
        l2 = ((Cursor) (obj2)).getLong(k1);
        if (l2 != l6) goto _L10; else goto _L9
_L9:
        obj1 = obj2;
        s2 = ((Cursor) (obj2)).getString(i2);
        j1 = i;
        i1 = j;
_L12:
        obj1 = obj2;
        ((Cursor) (obj2)).moveToNext();
        j = i1;
        i = j1;
        obj = s2;
          goto _L11
        b1;
        if (obj1 != null)
        {
            ((Cursor) (obj1)).close();
        }
        throw b1;
_L10:
        if (l2 != l8)
        {
            break MISSING_BLOCK_LABEL_734;
        }
        obj1 = obj2;
        j1 = ((Cursor) (obj2)).getInt(l1);
        i1 = j;
        s2 = ((String) (obj));
          goto _L12
        if (l2 != l7)
        {
            break MISSING_BLOCK_LABEL_768;
        }
        obj1 = obj2;
        i1 = ((Cursor) (obj2)).getInt(l1);
        j1 = i;
        s2 = ((String) (obj));
          goto _L12
        i1 = j;
        j1 = i;
        s2 = ((String) (obj));
        if (l2 != l9) goto _L12; else goto _L13
_L13:
        obj1 = obj2;
        l = ((Cursor) (obj2)).getInt(l1);
        i1 = j;
        j1 = i;
        s2 = ((String) (obj));
          goto _L12
        if (obj2 != null)
        {
            ((Cursor) (obj2)).close();
        }
        int k = getPresence(b1.getAvailability());
        String s1 = b1.getStrProperty(PROPKEY.CONTACT_MOOD_TEXT);
        boolean flag2 = eq(s1, s2);
        boolean flag1;
        if (k != i1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (l8 != -1L && (flag2 || flag1))
        {
            s = new StatusOperationsBuilder(context, b1.getIdentity(), s);
            if (k != j1)
            {
                s.addStatus(l8, k);
            }
            if (l7 != -1L && k != i1)
            {
                s.addStatus(l7, k);
            }
            if (l9 != -1L && flag && k != byte0)
            {
                s.addStatus(l9, k);
            }
            if (l6 != -1L && flag2)
            {
                s.addMood(l6, s1, b1.getIntProperty(PROPKEY.CONTACT_MOOD_TIMESTAMP));
            }
            return s.getOperations();
        }
_L2:
        return null;
        if (true) goto _L3; else goto _L14
_L14:
    }

    public void removeAllContacts(String s)
    {
        context.getContentResolver().delete(android.provider.ContactsContract.StatusUpdates.CONTENT_URI, "im_account=? AND protocol=?", new String[] {
            s, "3"
        });
        Uri uri = android.provider.ContactsContract.RawContacts.CONTENT_URI.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").build();
        context.getContentResolver().delete(uri, "account_type=? AND account_name=?", new String[] {
            "com.skype.contacts.sync", s
        });
    }

    public void setAllContactsOffline(String s)
    {
        ContentResolver contentresolver = context.getContentResolver();
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("mode", Integer.valueOf(0));
        contentresolver.update(android.provider.ContactsContract.StatusUpdates.CONTENT_URI, contentvalues, "im_account = ? ", new String[] {
            s
        });
    }

    public void setGroupVisibility(String s, boolean flag)
    {
        if (getGroupId(s) != -1)
        {
            ContentValues contentvalues = new ContentValues();
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            contentvalues.put("group_visible", Integer.valueOf(i));
            context.getContentResolver().update(getGroupContentUri(), contentvalues, "account_name = ? AND account_type = ?", new String[] {
                s, "com.skype.contacts.sync"
            });
        }
    }

    public ArrayList updateContact(b b1, String s, int i, boolean flag)
    {
        com.skype.Contact.TYPE type = b1.getType();
        a a1 = new a(context, timeUtil, b1.getIdentity(), s, (long)b1.getIntProperty(PROPKEY.CONTACT_PROFILE_TIMESTAMP) & 0xffffffffL);
        if (a1.needsInfoUpdate())
        {
            s = b1.getDisplayName();
            a1.nameOperation(s);
            a1.groupOperationIfRequired(i);
            Pair pair;
            for (Iterator iterator = getPhoneNumbers(b1).iterator(); iterator.hasNext(); a1.phoneNumberOperation((PROPKEY)pair.first, (String)pair.second))
            {
                pair = (Pair)iterator.next();
            }

            a1.emailOperation(b1.getStrProperty(PROPKEY.CONTACT_EMAILS));
            a1.eventOperation(b1.getIntProperty(PROPKEY.CONTACT_BIRTHDAY));
            a1.websiteEvent(b1.getStrProperty(PROPKEY.CONTACT_HOMEPAGE));
            a1.addressEvent(b1.getStrProperty(PROPKEY.CONTACT_COUNTRY), b1.getStrProperty(PROPKEY.CONTACT_PROVINCE), b1.getStrProperty(PROPKEY.CONTACT_CITY));
            a1.chatOperation(s);
            if (type == com.skype.Contact.TYPE.SKYPE || type == com.skype.Contact.TYPE.FREE_PSTN || type == com.skype.Contact.TYPE.PASSPORT || type == com.skype.Contact.TYPE.LYNC || type == com.skype.Contact.TYPE.PSTN)
            {
                a1.callOperation(s);
            }
            if (flag && (type == com.skype.Contact.TYPE.SKYPE || type == com.skype.Contact.TYPE.PASSPORT || type == com.skype.Contact.TYPE.LYNC))
            {
                a1.videoOperation(s);
            }
        }
        if ((type == com.skype.Contact.TYPE.SKYPE || type == com.skype.Contact.TYPE.PASSPORT || type == com.skype.Contact.TYPE.LYNC) && a1.needsAvatarUpdate((long)b1.getIntProperty(PROPKEY.CONTACT_AVATAR_TIMESTAMP) & 0xffffffffL))
        {
            byte abyte0[] = b1.getAvatar();
            Object obj = null;
            s = obj;
            if (abyte0 != null)
            {
                s = obj;
                if (abyte0.length > 2)
                {
                    s = new byte[abyte0.length - 1];
                    System.arraycopy(abyte0, 1, s, 0, s.length);
                }
            }
            a1.avatarOperation(s, b1.getIntProperty(PROPKEY.CONTACT_AVATAR_TIMESTAMP));
        }
        return a1.getOperations();
    }

    public long updateNameRowId(Context context1, String s)
    {
        Context context2;
        long l;
        l = 0L;
        context2 = null;
        context1 = context1.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, new String[] {
            "_id"
        }, "account_type=? AND data1 = ? AND mimetype=?", new String[] {
            "com.skype.contacts.sync", s, "vnd.android.cursor.item/name"
        }, null);
        context2 = context1;
        if (!context1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_70;
        }
        context2 = context1;
        l = context1.getLong(0);
        if (context1 != null)
        {
            context1.close();
        }
        return l;
        context1;
        if (context2 != null)
        {
            context2.close();
        }
        throw context1;
    }

    static 
    {
        PHONE_PROPKEYS = (new PROPKEY[] {
            PROPKEY.CONTACT_PHONE_HOME, PROPKEY.CONTACT_PHONE_OFFICE, PROPKEY.CONTACT_PHONE_MOBILE
        });
    }
}
