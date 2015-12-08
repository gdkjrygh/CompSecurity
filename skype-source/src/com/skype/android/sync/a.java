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
import android.text.format.DateFormat;
import com.skype.PROPKEY;
import com.skype.android.util.TimeUtil;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.sync:
//            BaseOperationsBuilder, SyncAdapter

class a extends BaseOperationsBuilder
{

    static final boolean $assertionsDisabled;
    private int backReference;
    private long currentTimestamp;
    private long rawContactId;
    private long storedTimestamp;
    private TimeUtil timeUtil;

    public a(Context context, TimeUtil timeutil, String s, String s1, long l)
    {
        super(context, s, s1);
        storedTimestamp = -1L;
        timeUtil = timeutil;
        backReference = operations.size();
        currentTimestamp = l;
        getRawContactId();
        if (rawContactId == -1L)
        {
            createInitialContactOperation(l);
        }
    }

    private void addCurrentOpAsDelete(String s, String as[], Uri uri)
    {
        uri = ContentProviderOperation.newDelete(uri);
        uri.withSelection(s, as);
        operations.add(uri.build());
    }

    private void addCurrentOpAsDelete(String as[], String as1[], Uri uri)
    {
        if (!$assertionsDisabled && as.length != as1.length)
        {
            throw new AssertionError();
        } else
        {
            addCurrentOpAsDelete(createSelection("raw_contact_id = ?  ", as), mergeArrays(new String[] {
                String.valueOf(rawContactId)
            }, as1), uri);
            return;
        }
    }

    private void addCurrentOpAsInsert(ContentValues contentvalues, Uri uri)
    {
        contentvalues.put("data_sync1", identity);
        if (TextUtils.isEmpty(contentvalues.getAsString("data_sync2")))
        {
            contentvalues.put("data_sync2", Long.valueOf(System.currentTimeMillis()));
        }
        uri = ContentProviderOperation.newInsert(uri);
        if (rawContactId == -1L)
        {
            uri.withValueBackReference("raw_contact_id", backReference);
        } else
        {
            contentvalues.put("raw_contact_id", Long.valueOf(rawContactId));
        }
        uri.withValues(contentvalues);
        operations.add(uri.build());
    }

    private void addCurrentOpAsUpdate(ContentValues contentvalues, String s, String as[], Uri uri)
    {
        contentvalues.put("data_sync1", identity);
        if (TextUtils.isEmpty(contentvalues.getAsString("data_sync2")))
        {
            contentvalues.put("data_sync2", Long.valueOf(System.currentTimeMillis()));
        }
        uri = ContentProviderOperation.newUpdate(uri);
        uri.withValues(contentvalues);
        uri.withSelection(s, as);
        operations.add(uri.build());
    }

    private void addCurrentOpAsUpdate(ContentValues contentvalues, String as[], String as1[], Uri uri)
    {
        if (!$assertionsDisabled && as.length != as1.length)
        {
            throw new AssertionError();
        } else
        {
            addCurrentOpAsUpdate(contentvalues, createSelection("raw_contact_id = ?  ", as), mergeArrays(new String[] {
                String.valueOf(rawContactId)
            }, as1), uri);
            return;
        }
    }

    private void createInitialContactOperation(long l)
    {
        android.content.ContentProviderOperation.Builder builder = ContentProviderOperation.newInsert(getUriForContactOperation());
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("sourceid", identity);
        contentvalues.put("account_type", "com.skype.contacts.sync");
        contentvalues.put("account_name", accountName);
        contentvalues.put("sync2", Long.valueOf(l));
        builder.withValues(contentvalues);
        builder.withYieldAllowed(true);
        operations.add(builder.build());
    }

    private static int getContactPhoneType(PROPKEY propkey)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$PROPKEY[];

            static 
            {
                $SwitchMap$com$skype$PROPKEY = new int[PROPKEY.values().length];
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_PHONE_HOME.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_PHONE_MOBILE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_PHONE_OFFICE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$PROPKEY[PROPKEY.CONTACT_PSTNNUMBER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.PROPKEY[propkey.ordinal()])
        {
        default:
            return 7;

        case 1: // '\001'
            return 1;

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;

        case 4: // '\004'
            return 0;
        }
    }

    private static String getContactPhoneTypeStr(PROPKEY propkey)
    {
        switch (_cls1..SwitchMap.com.skype.PROPKEY[propkey.ordinal()])
        {
        default:
            return "other";

        case 1: // '\001'
            return "home";

        case 2: // '\002'
            return "mobile";

        case 3: // '\003'
            return "work";

        case 4: // '\004'
            return "custom";
        }
    }

    private void getRawContactId()
    {
        Cursor cursor;
        Object obj;
        String s;
        rawContactId = -1L;
        obj = context.getContentResolver();
        s = identity;
        cursor = null;
        obj = ((ContentResolver) (obj)).query(android.provider.ContactsContract.RawContacts.CONTENT_URI, new String[] {
            "_id", "sync2"
        }, "sourceid=? AND account_type=?", new String[] {
            s, "com.skype.contacts.sync"
        }, null);
        cursor = ((Cursor) (obj));
        if (!((Cursor) (obj)).moveToFirst())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        cursor = ((Cursor) (obj));
        rawContactId = ((Cursor) (obj)).getLong(0);
        cursor = ((Cursor) (obj));
        storedTimestamp = parseTimestamp(((Cursor) (obj)).getString(1));
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return;
        Exception exception;
        exception;
        if (cursor != null)
        {
            cursor.close();
        }
        throw exception;
    }

    private boolean hasExistingRecord(String as[], String as1[])
    {
        return hasUpToDateRecord(as, as1, null, -1L);
    }

    private boolean hasUpToDateRecord(String as[], String as1[], String s, long l)
    {
        if (rawContactId != -1L) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        return flag1;
_L2:
        ContentResolver contentresolver = context.getContentResolver();
        String as2[];
        String s1;
        long l1;
        long l3;
        if (s != null)
        {
            as2 = new String[2];
            as2[0] = "raw_contact_id";
            as2[1] = s;
        } else
        {
            as2 = new String[1];
            as2[0] = "raw_contact_id";
        }
        s1 = createSelection("raw_contact_id = ?  ", as);
        as1 = mergeArrays(new String[] {
            String.valueOf(rawContactId)
        }, as1);
        as = null;
        as1 = contentresolver.query(android.provider.ContactsContract.Data.CONTENT_URI, as2, s1, as1, null);
        as = as1;
        if (!as1.moveToFirst())
        {
            break; /* Loop/switch isn't completed */
        }
        as = as1;
        l1 = rawContactId;
        as = as1;
        l3 = as1.getLong(0);
        if (l1 != l3)
        {
            break; /* Loop/switch isn't completed */
        }
        if (s == null)
        {
            if (as1 != null)
            {
                as1.close();
            }
            return true;
        }
        as = as1;
        long l2 = parseTimestamp(as1.getString(1));
        boolean flag;
        if (l2 >= l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (as1 != null)
        {
            as1.close();
            return flag;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (as1 != null)
        {
            as1.close();
        }
        return false;
        as1;
        if (as != null)
        {
            as.close();
        }
        throw as1;
    }

    private void markReadOnly(ContentValues contentvalues)
    {
        contentvalues.put("is_read_only", "1");
    }

    private long parseTimestamp(String s)
    {
        long l = 0L;
        if (!TextUtils.isEmpty(s))
        {
            try
            {
                l = Long.parseLong(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                SyncAdapter.log.severe(s.toString());
                return 0L;
            }
        }
        return l;
    }

    public a addressEvent(String s, String s1, String s2)
    {
        Uri uri = getUriForDataOperation();
        ContentValues contentvalues = new ContentValues();
        String as[] = new String[2];
        as[0] = "mimetype";
        as[1] = "data2";
        String as1[] = new String[2];
        as1[0] = "vnd.android.cursor.item/postal-address_v2";
        as1[1] = "3";
        contentvalues.put("data7", s2);
        contentvalues.put("data8", s1);
        contentvalues.put("data10", s.toUpperCase(Locale.getDefault()));
        contentvalues.put("data2", Integer.valueOf(3));
        String s3;
        boolean flag;
        boolean flag1;
        if (s2 != null)
        {
            s3 = s2;
        } else
        if ((new StringBuilder(" ")).append(s).toString() != null)
        {
            s3 = s;
        } else
        {
            s3 = "";
        }
        contentvalues.put("data3", s3);
        contentvalues.put("mimetype", "vnd.android.cursor.item/postal-address_v2");
        markReadOnly(contentvalues);
        if (rawContactId == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            if (!hasExistingRecord(as, as1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1)
        {
            if (!TextUtils.isEmpty(s) || !TextUtils.isEmpty(s2) || !TextUtils.isEmpty(s1))
            {
                addCurrentOpAsInsert(contentvalues, uri);
            }
            return this;
        }
        if (TextUtils.isEmpty(s) && TextUtils.isEmpty(s2) && TextUtils.isEmpty(s1))
        {
            addCurrentOpAsDelete(as, as1, uri);
            return this;
        } else
        {
            addCurrentOpAsUpdate(contentvalues, as, as1, uri);
            return this;
        }
    }

    public a avatarOperation(byte abyte0[], long l)
    {
        Uri uri;
        ContentValues contentvalues;
        String as[];
        String as1[];
        uri = getUriForDataOperation();
        contentvalues = new ContentValues();
        as = new String[1];
        as[0] = "mimetype";
        as1 = new String[1];
        as1[0] = "vnd.android.cursor.item/photo";
        if (abyte0 == null || l <= 0L) goto _L2; else goto _L1
_L1:
        contentvalues.put("data15", abyte0);
        contentvalues.put("mimetype", "vnd.android.cursor.item/photo");
        contentvalues.put("is_super_primary", Integer.valueOf(0));
        contentvalues.put("data_sync2", Long.valueOf(l));
        if (rawContactId != -1L) goto _L4; else goto _L3
_L3:
        addCurrentOpAsInsert(contentvalues, getUriForDataOperation());
_L6:
        return this;
_L4:
        addCurrentOpAsUpdate(contentvalues, as, as1, uri);
        return this;
_L2:
        if (l == -1L || abyte0 == null)
        {
            addCurrentOpAsDelete(as, as1, uri);
            return this;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public a callOperation(String s)
    {
        Uri uri = getUriForDataOperation();
        ContentValues contentvalues = new ContentValues();
        String as[] = new String[2];
        as[0] = "mimetype";
        as[1] = "data5";
        String as1[] = new String[2];
        as1[0] = "vnd.android.cursor.item/com.skype.android.skypecall.action";
        as1[1] = "3";
        contentvalues.put("data1", identity);
        contentvalues.put("data2", Integer.valueOf(0));
        contentvalues.put("data3", this.context.getString(0x7f08029e));
        Context context = this.context;
        String s1;
        boolean flag;
        boolean flag1;
        if (TextUtils.isEmpty(s))
        {
            s1 = identity;
        } else
        {
            s1 = s;
        }
        contentvalues.put("data4", context.getString(0x7f080297, new Object[] {
            s1
        }));
        contentvalues.put("data5", Integer.valueOf(3));
        contentvalues.put("mimetype", "vnd.android.cursor.item/com.skype.android.skypecall.action");
        markReadOnly(contentvalues);
        if (rawContactId == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            if (!hasExistingRecord(as, as1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1)
        {
            if (!TextUtils.isEmpty(s))
            {
                addCurrentOpAsInsert(contentvalues, uri);
            }
            return this;
        }
        if (TextUtils.isEmpty(s))
        {
            addCurrentOpAsDelete(as, as1, uri);
            return this;
        } else
        {
            addCurrentOpAsUpdate(contentvalues, as, as1, uri);
            return this;
        }
    }

    public a chatOperation(String s)
    {
        Uri uri = getUriForDataOperation();
        ContentValues contentvalues = new ContentValues();
        String as[] = new String[2];
        as[0] = "mimetype";
        as[1] = "data5";
        String as1[] = new String[2];
        as1[0] = "vnd.android.cursor.item/com.skype.android.chat.action";
        as1[1] = "3";
        contentvalues.put("data1", identity);
        contentvalues.put("data2", Integer.valueOf(0));
        contentvalues.put("data3", this.context.getString(0x7f0802c5));
        Context context = this.context;
        String s1;
        boolean flag;
        boolean flag1;
        if (TextUtils.isEmpty(s))
        {
            s1 = identity;
        } else
        {
            s1 = s;
        }
        contentvalues.put("data4", context.getString(0x7f0802a0, new Object[] {
            s1
        }));
        contentvalues.put("data5", Integer.valueOf(3));
        contentvalues.put("mimetype", "vnd.android.cursor.item/com.skype.android.chat.action");
        markReadOnly(contentvalues);
        if (rawContactId == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            if (!hasExistingRecord(as, as1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1)
        {
            if (!TextUtils.isEmpty(s))
            {
                addCurrentOpAsInsert(contentvalues, uri);
            }
            return this;
        }
        if (TextUtils.isEmpty(s))
        {
            addCurrentOpAsDelete(as, as1, uri);
            return this;
        } else
        {
            addCurrentOpAsUpdate(contentvalues, as, as1, uri);
            return this;
        }
    }

    public a emailOperation(String s)
    {
        Uri uri = getUriForDataOperation();
        ContentValues contentvalues = new ContentValues();
        String as[] = new String[2];
        as[0] = "mimetype";
        as[1] = "data2";
        String as1[] = new String[2];
        as1[0] = "vnd.android.cursor.item/email_v2";
        as1[1] = "2";
        contentvalues.put("data1", s);
        contentvalues.put("data2", Integer.valueOf(2));
        contentvalues.put("data3", s);
        contentvalues.put("mimetype", "vnd.android.cursor.item/email_v2");
        markReadOnly(contentvalues);
        boolean flag;
        boolean flag1;
        if (rawContactId == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            if (!hasExistingRecord(as, as1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1)
        {
            if (!TextUtils.isEmpty(s))
            {
                addCurrentOpAsInsert(contentvalues, uri);
            }
            return this;
        }
        if (TextUtils.isEmpty(s))
        {
            addCurrentOpAsDelete(as, as1, uri);
            return this;
        } else
        {
            addCurrentOpAsUpdate(contentvalues, as, as1, uri);
            return this;
        }
    }

    public a eventOperation(int i)
    {
        Uri uri = getUriForDataOperation();
        long l = 0L;
        Object obj = TimeUtil.b(i);
        if (obj != null)
        {
            l = ((GregorianCalendar) (obj)).getTimeInMillis();
        }
        Object obj1 = DateFormat.getMediumDateFormat(context);
        obj = new ContentValues();
        String as[] = new String[2];
        as[0] = "mimetype";
        as[1] = "data2";
        String as1[] = new String[2];
        as1[0] = "vnd.android.cursor.item/contact_event";
        as1[1] = "3";
        obj1 = ((java.text.DateFormat) (obj1)).format(new Date(l));
        ((ContentValues) (obj)).put("data1", ((String) (obj1)));
        ((ContentValues) (obj)).put("data2", Integer.valueOf(3));
        ((ContentValues) (obj)).put("data3", ((String) (obj1)));
        ((ContentValues) (obj)).put("mimetype", "vnd.android.cursor.item/contact_event");
        markReadOnly(((ContentValues) (obj)));
        int j;
        if (rawContactId == -1L)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j = i;
        if (i == 0)
        {
            if (!hasExistingRecord(as, as1))
            {
                j = 1;
            } else
            {
                j = 0;
            }
        }
        if (j != 0)
        {
            if (l != 0L)
            {
                addCurrentOpAsInsert(((ContentValues) (obj)), uri);
            }
            return this;
        }
        if (l == 0L)
        {
            addCurrentOpAsDelete(as, as1, uri);
            return this;
        } else
        {
            addCurrentOpAsUpdate(((ContentValues) (obj)), as, as1, uri);
            return this;
        }
    }

    void groupOperationIfRequired(int i)
    {
        android.content.ContentProviderOperation.Builder builder = ContentProviderOperation.newInsert(getUriForDataOperation());
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("data1", Integer.valueOf(i));
        contentvalues.put("mimetype", "vnd.android.cursor.item/group_membership");
        if (rawContactId != -1L)
        {
            contentvalues.put("raw_contact_id", Long.valueOf(rawContactId));
        }
        builder.withValues(contentvalues);
        if (rawContactId == -1L)
        {
            builder.withValueBackReference("raw_contact_id", backReference);
        }
        operations.add(builder.build());
    }

    public a nameOperation(String s)
    {
        Uri uri = getUriForDataOperation();
        ContentValues contentvalues = new ContentValues();
        String as[] = new String[1];
        as[0] = "mimetype";
        String as1[] = new String[1];
        as1[0] = "vnd.android.cursor.item/name";
        contentvalues.put("data1", s);
        contentvalues.put("mimetype", "vnd.android.cursor.item/name");
        boolean flag;
        boolean flag1;
        if (rawContactId == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            if (!hasExistingRecord(as, as1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1)
        {
            addCurrentOpAsInsert(contentvalues, uri);
            return this;
        } else
        {
            addCurrentOpAsUpdate(contentvalues, as, as1, uri);
            return this;
        }
    }

    boolean needsAvatarUpdate(long l)
    {
        return !hasUpToDateRecord(new String[] {
            "mimetype"
        }, new String[] {
            "vnd.android.cursor.item/photo"
        }, "data_sync2", l);
    }

    boolean needsInfoUpdate()
    {
        return currentTimestamp > storedTimestamp;
    }

    public a noteOperation(String s)
    {
        Uri uri = getUriForDataOperation();
        ContentValues contentvalues = new ContentValues();
        String as[] = new String[1];
        as[0] = "mimetype";
        String as1[] = new String[1];
        as1[0] = "vnd.android.cursor.item/note";
        contentvalues.put("data1", s);
        contentvalues.put("mimetype", "vnd.android.cursor.item/note");
        markReadOnly(contentvalues);
        boolean flag;
        boolean flag1;
        if (rawContactId == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            if (!hasExistingRecord(as, as1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1)
        {
            if (!TextUtils.isEmpty(s))
            {
                addCurrentOpAsInsert(contentvalues, uri);
            }
            return this;
        }
        if (TextUtils.isEmpty(s))
        {
            addCurrentOpAsDelete(as, as1, uri);
            return this;
        } else
        {
            addCurrentOpAsUpdate(contentvalues, as, as1, uri);
            return this;
        }
    }

    public a organizationEvent(String s)
    {
        Uri uri = getUriForDataOperation();
        ContentValues contentvalues = new ContentValues();
        String as[] = new String[2];
        as[0] = "mimetype";
        as[1] = "data2";
        String as1[] = new String[2];
        as1[0] = "vnd.android.cursor.item/organization";
        as1[1] = "1";
        contentvalues.put("data1", s);
        contentvalues.put("data2", Integer.valueOf(1));
        contentvalues.put("data3", s);
        contentvalues.put("mimetype", "vnd.android.cursor.item/organization");
        markReadOnly(contentvalues);
        boolean flag;
        boolean flag1;
        if (rawContactId == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            if (!hasExistingRecord(as, as1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1)
        {
            if (!TextUtils.isEmpty(s))
            {
                addCurrentOpAsInsert(contentvalues, uri);
            }
            return this;
        }
        if (TextUtils.isEmpty(s))
        {
            addCurrentOpAsDelete(as, as1, uri);
            return this;
        } else
        {
            addCurrentOpAsUpdate(contentvalues, as, as1, uri);
            return this;
        }
    }

    public a phoneNumberOperation(PROPKEY propkey, String s)
    {
        int i = getContactPhoneType(propkey);
        propkey = getUriForDataOperation();
        ContentValues contentvalues = new ContentValues();
        String as[] = new String[2];
        as[0] = "mimetype";
        as[1] = "data2";
        String as1[] = new String[2];
        as1[0] = "vnd.android.cursor.item/phone_v2";
        as1[1] = String.valueOf(i);
        contentvalues.put("data1", s);
        contentvalues.put("data2", Integer.valueOf(i));
        contentvalues.put("data3", s);
        contentvalues.put("mimetype", "vnd.android.cursor.item/phone_v2");
        markReadOnly(contentvalues);
        boolean flag;
        boolean flag1;
        if (rawContactId == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            if (!hasExistingRecord(as, as1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1)
        {
            if (!TextUtils.isEmpty(s))
            {
                addCurrentOpAsInsert(contentvalues, propkey);
            }
            return this;
        }
        if (TextUtils.isEmpty(s))
        {
            addCurrentOpAsDelete(as, as1, propkey);
            return this;
        } else
        {
            addCurrentOpAsUpdate(contentvalues, as, as1, propkey);
            return this;
        }
    }

    public a smsOperation(PROPKEY propkey, String s)
    {
        Uri uri = getUriForDataOperation();
        ContentValues contentvalues = new ContentValues();
        String s1 = String.format("vnd.android.cursor.item/com.skype.android.sms.%s", new Object[] {
            getContactPhoneTypeStr(propkey)
        });
        String as[] = new String[2];
        as[0] = "mimetype";
        as[1] = "data5";
        String as1[] = new String[2];
        as1[0] = s1;
        as1[1] = "3";
        contentvalues.put("data1", identity);
        contentvalues.put("data2", Integer.valueOf(0));
        Context context = this.context;
        boolean flag;
        boolean flag1;
        if (TextUtils.isEmpty(s))
        {
            propkey = identity;
        } else
        {
            propkey = s;
        }
        contentvalues.put("data3", context.getString(0x7f08032d, new Object[] {
            propkey
        }));
        context = this.context;
        if (TextUtils.isEmpty(s))
        {
            propkey = identity;
        } else
        {
            propkey = s;
        }
        contentvalues.put("data4", context.getString(0x7f08032d, new Object[] {
            propkey
        }));
        contentvalues.put("data5", Integer.valueOf(3));
        contentvalues.put("mimetype", s1);
        markReadOnly(contentvalues);
        if (rawContactId == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            if (!hasExistingRecord(as, as1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1)
        {
            if (!TextUtils.isEmpty(s))
            {
                addCurrentOpAsInsert(contentvalues, uri);
            }
            return this;
        }
        if (TextUtils.isEmpty(s))
        {
            addCurrentOpAsDelete(as, as1, uri);
            return this;
        } else
        {
            addCurrentOpAsUpdate(contentvalues, as, as1, uri);
            return this;
        }
    }

    public a videoOperation(String s)
    {
        Uri uri = getUriForDataOperation();
        ContentValues contentvalues = new ContentValues();
        String as[] = new String[2];
        as[0] = "mimetype";
        as[1] = "data5";
        String as1[] = new String[2];
        as1[0] = "vnd.android.cursor.item/com.skype.android.videocall.action";
        as1[1] = "3";
        contentvalues.put("data1", identity);
        contentvalues.put("data2", Integer.valueOf(0));
        contentvalues.put("data3", this.context.getString(0x7f080344));
        Context context = this.context;
        String s1;
        boolean flag;
        boolean flag1;
        if (TextUtils.isEmpty(s))
        {
            s1 = identity;
        } else
        {
            s1 = s;
        }
        contentvalues.put("data4", context.getString(0x7f080343, new Object[] {
            s1
        }));
        contentvalues.put("data5", Integer.valueOf(3));
        contentvalues.put("mimetype", "vnd.android.cursor.item/com.skype.android.videocall.action");
        markReadOnly(contentvalues);
        if (rawContactId == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            if (!hasExistingRecord(as, as1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1)
        {
            if (!TextUtils.isEmpty(s))
            {
                addCurrentOpAsInsert(contentvalues, uri);
            }
            return this;
        }
        if (TextUtils.isEmpty(s))
        {
            addCurrentOpAsDelete(as, as1, uri);
            return this;
        } else
        {
            addCurrentOpAsUpdate(contentvalues, as, as1, uri);
            return this;
        }
    }

    public a websiteEvent(String s)
    {
        Uri uri = getUriForDataOperation();
        ContentValues contentvalues = new ContentValues();
        String as[] = new String[2];
        as[0] = "mimetype";
        as[1] = "data2";
        String as1[] = new String[2];
        as1[0] = "vnd.android.cursor.item/website";
        as1[1] = "1";
        contentvalues.put("data1", s);
        contentvalues.put("data2", Integer.valueOf(1));
        contentvalues.put("data3", s);
        contentvalues.put("mimetype", "vnd.android.cursor.item/website");
        markReadOnly(contentvalues);
        boolean flag;
        boolean flag1;
        if (rawContactId == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            if (!hasExistingRecord(as, as1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
        }
        if (flag1)
        {
            if (!TextUtils.isEmpty(s))
            {
                addCurrentOpAsInsert(contentvalues, uri);
            }
            return this;
        }
        if (TextUtils.isEmpty(s))
        {
            addCurrentOpAsDelete(as, as1, uri);
            return this;
        } else
        {
            addCurrentOpAsUpdate(contentvalues, as, as1, uri);
            return this;
        }
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/sync/a.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
