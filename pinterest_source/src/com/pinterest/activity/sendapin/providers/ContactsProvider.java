// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.providers;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.base.Strings;
import com.pinterest.activity.commerce.model.ContactAddressItem;
import com.pinterest.activity.contacts.InvitabilityContact;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.reporting.CrashReporting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

public class ContactsProvider
{

    private static final Uri CONTACTS_URI;
    public static final int CONTACT_LIMIT = 1000;
    private static final String EQUAL_PLACEHOLDER = " = ?";
    private static final String LIMIT_ONE = " LIMIT 1";
    private static final String PROJECTION_ADDRESS[] = {
        "contact_id", "data4", "data7", "data8", "data9", "data10", "display_name"
    };
    private static final String PROJECTION_EMAIL[] = {
        "_id", "photo_id", "display_name", "contact_id", "data1"
    };
    private static final String PROJECTION_EMAIL_Address[] = {
        "data1"
    };
    private static final String PROJECTION_NAME[] = {
        "data2", "data3", "data1"
    };
    private static final String PROJECTION_NUMBER[] = {
        "data1"
    };
    private static final String PROJECTION_PHONE[] = {
        "_id", "photo_id", "display_name", "contact_id", "data1"
    };
    private static final String SELECTION_ADDRESS = "mimetype = ?";
    private static final String SELECTION_ADDRESS_ARGS[] = {
        "vnd.android.cursor.item/postal-address_v2"
    };
    private static final String SELECTION_EMAIL = "contact_id = ?";
    private static final String SELECTION_NAME = "mimetype = ? AND contact_id = ?";
    private static final String SELECTION_NUMBER = "contact_id = ?";
    private static final String SORT_LIMIT_EMAIL = "data1 LIMIT 1";
    private static final String SORT_LIMIT_NAME = "data2 LIMIT 1";
    private static final String SORT_LIMIT_NUMBER = "data1 LIMIT 1";
    private static final String SPLIT_DISPLAY_NAME = " ";
    private static final String TAG = "ContactsProvider";
    private static final String WHERE_FORMAT = "%s LIKE '%s' OR %s LIKE '%s' AND %s <> '' AND %s = 1";
    private static List bannedEmailDomains;

    public ContactsProvider()
    {
    }

    public static String escapeQuotes(String s)
    {
        return StringUtils.replace(s, "'", "''");
    }

    private static String extractEmail(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            s = s.split("<|>|\\s");
            int j = s.length;
            int i = 0;
            while (i < j) 
            {
                CharSequence charsequence = s[i];
                if (StringUtils.isNotEmpty(charsequence) && SignupFormUtils.isEmailValid(charsequence))
                {
                    return charsequence;
                }
                i++;
            }
        }
        return null;
    }

    public static void fillInvitabilityContactsWithCloseFriend(Context context, HashMap hashmap)
    {
        if (hashmap.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = String.format("%s = 1 AND %s in %s", new Object[] {
            "in_visible_group", "_id", toSqlWhereInString(hashmap.keySet())
        });
        obj = context.getContentResolver().query(android.provider.ContactsContract.Contacts.CONTENT_STREQUENT_URI, new String[] {
            "_id"
        }, ((String) (obj)), null, null);
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        context = ((Context) (obj));
        if (!((Cursor) (obj)).moveToFirst())
        {
            continue; /* Loop/switch isn't completed */
        }
        context = ((Context) (obj));
        int i = ((Cursor) (obj)).getColumnIndex("_id");
_L4:
        context = ((Context) (obj));
        if (((Cursor) (obj)).isAfterLast())
        {
            break; /* Loop/switch isn't completed */
        }
        context = ((Context) (obj));
        long l = ((Cursor) (obj)).getLong(i);
        context = ((Context) (obj));
        if (!hashmap.containsKey(Long.valueOf(l)))
        {
            break MISSING_BLOCK_LABEL_141;
        }
        context = ((Context) (obj));
        ((InvitabilityContact)hashmap.get(Long.valueOf(l))).isCloseFriend = true;
        context = ((Context) (obj));
        ((Cursor) (obj)).moveToNext();
        if (true) goto _L4; else goto _L3
        hashmap;
_L10:
        context = ((Context) (obj));
        PLog.log("ContactsProvider", hashmap.getMessage(), new Object[0]);
        if (obj != null)
        {
            ((Cursor) (obj)).close();
            return;
        }
          goto _L1
_L3:
        context = ((Context) (obj));
        ((Cursor) (obj)).close();
        if (obj == null) goto _L1; else goto _L5
_L5:
        ((Cursor) (obj)).close();
        return;
        hashmap;
        obj = null;
_L9:
        context = ((Context) (obj));
        CrashReporting.a(hashmap);
        if (obj == null) goto _L1; else goto _L6
_L6:
        ((Cursor) (obj)).close();
        return;
        hashmap;
        context = null;
_L8:
        if (context != null)
        {
            context.close();
        }
        throw hashmap;
        hashmap;
        if (true) goto _L8; else goto _L7
_L7:
        hashmap;
          goto _L9
        hashmap;
        obj = null;
          goto _L10
    }

    public static void fillInvitabilityContactsWithEmail(Context context, HashMap hashmap, int i)
    {
        List list = getNamedContactsWithEmail(context, "", i);
        i = 0;
        while (i < list.size()) 
        {
            TypeAheadItem typeaheaditem = (TypeAheadItem)list.get(i);
            Long long1 = Long.valueOf(Long.parseLong(typeaheaditem.getUid()));
            boolean flag;
            boolean flag1;
            if (hashmap.containsKey(long1))
            {
                context = (InvitabilityContact)hashmap.get(long1);
            } else
            {
                context = new InvitabilityContact(long1.longValue());
                hashmap.put(long1, context);
            }
            if (TextUtils.isEmpty(((InvitabilityContact) (context)).email))
            {
                context.email = typeaheaditem.getIdentifier();
            }
            flag1 = ((InvitabilityContact) (context)).hasPhoto;
            if (!TextUtils.isEmpty(typeaheaditem.getImageUri()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            context.hasPhoto = flag | flag1;
            context.name = typeaheaditem.getTitle();
            context.numPiecesOfInfo = ((InvitabilityContact) (context)).numPiecesOfInfo + 1;
            i++;
        }
    }

    public static void fillInvitabilityContactsWithName(Context context, HashMap hashmap)
    {
        if (hashmap.size() != 0)
        {
            String s = String.format("%s = 1 AND %s = \"%s\" AND %s in %s", new Object[] {
                "in_visible_group", "mimetype", "vnd.android.cursor.item/name", "contact_id", toSqlWhereInString(hashmap.keySet())
            });
            try
            {
                context = context.getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, new String[] {
                    "contact_id", "data2", "data3"
                }, s, null, null);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                CrashReporting.a(context);
                context = null;
            }
            if (context != null && context.moveToFirst())
            {
                int i = context.getColumnIndex("contact_id");
                int j = context.getColumnIndex("data2");
                int k = context.getColumnIndex("data3");
                for (; !context.isAfterLast(); context.moveToNext())
                {
                    long l = context.getLong(i);
                    String s1 = context.getString(j);
                    String s2 = context.getString(k);
                    if (hashmap.containsKey(Long.valueOf(l)))
                    {
                        InvitabilityContact invitabilitycontact = (InvitabilityContact)hashmap.get(Long.valueOf(l));
                        invitabilitycontact.firstName = s1;
                        invitabilitycontact.lastName = s2;
                    }
                }

                context.close();
                return;
            }
        }
    }

    public static void fillInvitabilityContactsWithPhone(Context context, HashMap hashmap)
    {
        context = getContactsWithPhoneNumber(context, "", 1000);
        int i = 0;
        while (i < context.size()) 
        {
            TypeAheadItem typeaheaditem = (TypeAheadItem)context.get(i);
            Object obj = Long.valueOf(Long.parseLong(typeaheaditem.getUid()));
            if (!hashmap.containsKey(obj))
            {
                continue;
            }
            obj = (InvitabilityContact)hashmap.get(obj);
            boolean flag1 = ((InvitabilityContact) (obj)).hasPhoto;
            boolean flag;
            if (!TextUtils.isEmpty(typeaheaditem.getImageUri()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj.hasPhoto = flag | flag1;
            if (TextUtils.isEmpty(((InvitabilityContact) (obj)).phoneNumber))
            {
                obj.phoneNumber = (String)typeaheaditem.getPhoneNumbers().get(0);
            }
            obj.numPiecesOfInfo = ((InvitabilityContact) (obj)).numPiecesOfInfo + 1;
            i++;
        }
    }

    public static void fillInvitabilityContactsWithPostal(Context context, HashMap hashmap)
    {
        if (hashmap.size() != 0)
        {
            String s = String.format("%s = 1 AND %s in %s", new Object[] {
                "in_visible_group", "contact_id", toSqlWhereInString(hashmap.keySet())
            });
            try
            {
                context = context.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.StructuredPostal.CONTENT_URI, new String[] {
                    "contact_id"
                }, s, null, null);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                CrashReporting.a(context);
                context = null;
            }
            if (context != null && context.moveToFirst())
            {
                int i = context.getColumnIndex("contact_id");
                for (; !context.isAfterLast(); context.moveToNext())
                {
                    long l = context.getLong(i);
                    if (hashmap.containsKey(Long.valueOf(l)))
                    {
                        InvitabilityContact invitabilitycontact = (InvitabilityContact)hashmap.get(Long.valueOf(l));
                        invitabilitycontact.numPiecesOfInfo = invitabilitycontact.numPiecesOfInfo + 1;
                    }
                }

                context.close();
                return;
            }
        }
    }

    private static String getContactSortOrder()
    {
        String s = "display_name COLLATE LOCALIZED ASC";
        if (Locale.getDefault().getLanguage().equals("ja"))
        {
            s = (new StringBuilder("phonetic_name IS NULL, phonetic_name COLLATE LOCALIZED ASC, ")).append("display_name COLLATE LOCALIZED ASC").toString();
        }
        return s;
    }

    public static ArrayList getContactsWithAddress(Context context)
    {
        ArrayList arraylist = new ArrayList(0);
        ContentResolver contentresolver = context.getContentResolver();
        try
        {
            context = contentresolver.query(android.provider.ContactsContract.Data.CONTENT_URI, PROJECTION_ADDRESS, "mimetype = ?", SELECTION_ADDRESS_ARGS, getContactSortOrder());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            CrashReporting.a(context);
            context = null;
        }
        if (context != null && context.moveToFirst())
        {
            arraylist = new ArrayList(context.getCount());
            int k2 = context.getColumnIndex("contact_id");
            int l2 = context.getColumnIndex("data4");
            int i3 = context.getColumnIndex("data7");
            int j3 = context.getColumnIndex("data8");
            int k3 = context.getColumnIndex("data9");
            int l3 = context.getColumnIndex("data10");
            int i4 = context.getColumnIndex("display_name");
            int i = -1;
            int k = -1;
            int i1 = -1;
            int l = -1;
            int j = -1;
            boolean flag = false;
            for (; !context.isAfterLast(); context.moveToNext())
            {
                Object obj = context.getString(k2);
                ContactAddressItem contactaddressitem = new ContactAddressItem();
                contactaddressitem.setStreetAddress1(context.getString(l2));
                contactaddressitem.setCity(context.getString(i3));
                contactaddressitem.setState(context.getString(j3));
                contactaddressitem.setZipCode(context.getString(k3));
                contactaddressitem.setCountry(context.getString(l3));
                Object obj1 = context.getString(i4);
                Cursor cursor = contentresolver.query(android.provider.ContactsContract.Data.CONTENT_URI, PROJECTION_NAME, "mimetype = ? AND contact_id = ?", new String[] {
                    "vnd.android.cursor.item/name", obj
                }, "data2 LIMIT 1");
                do
                {
                    if (!cursor.moveToNext())
                    {
                        break;
                    }
                    boolean flag1 = flag;
                    int j2 = i1;
                    int i2 = l;
                    int j1 = j;
                    if (!flag)
                    {
                        flag1 = true;
                        j1 = cursor.getColumnIndex("data2");
                        i2 = cursor.getColumnIndex("data3");
                        j2 = cursor.getColumnIndex("data1");
                    }
                    String s = cursor.getString(j1);
                    String s1 = cursor.getString(i2);
                    String s2 = cursor.getString(j2);
                    if (!Strings.isNullOrEmpty(s) || !Strings.isNullOrEmpty(s1))
                    {
                        contactaddressitem.setFirstName(s);
                        contactaddressitem.setLastName(s1);
                        flag = flag1;
                        i1 = j2;
                        l = i2;
                        j = j1;
                    } else
                    {
                        flag = flag1;
                        i1 = j2;
                        l = i2;
                        j = j1;
                        if (!Strings.isNullOrEmpty(s2))
                        {
                            splitDisplayNameAndSet(((String) (obj1)), contactaddressitem);
                            flag = flag1;
                            i1 = j2;
                            l = i2;
                            j = j1;
                        }
                    }
                } while (true);
                cursor.close();
                if (Strings.isNullOrEmpty(contactaddressitem.getFirstName()) && Strings.isNullOrEmpty(contactaddressitem.getLastName()) && !Strings.isNullOrEmpty(((String) (obj1))))
                {
                    splitDisplayNameAndSet(((String) (obj1)), contactaddressitem);
                }
                for (obj1 = contentresolver.query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, PROJECTION_NUMBER, "contact_id = ?", new String[] {
    obj
}, "data1 LIMIT 1"); ((Cursor) (obj1)).moveToNext();)
                {
                    int k1 = k;
                    if (k == -1)
                    {
                        k1 = ((Cursor) (obj1)).getColumnIndex("data1");
                    }
                    contactaddressitem.setPhoneNumber(((Cursor) (obj1)).getString(k1));
                    k = k1;
                }

                ((Cursor) (obj1)).close();
                for (obj = contentresolver.query(android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI, PROJECTION_EMAIL_Address, "contact_id = ?", new String[] {
    obj
}, "data1 LIMIT 1"); ((Cursor) (obj)).moveToNext();)
                {
                    int l1 = i;
                    if (i == -1)
                    {
                        l1 = ((Cursor) (obj)).getColumnIndex("data1");
                    }
                    contactaddressitem.setEmail(((Cursor) (obj)).getString(l1));
                    i = l1;
                }

                ((Cursor) (obj)).close();
                arraylist.add(contactaddressitem);
            }

            context.close();
            return arraylist;
        } else
        {
            return arraylist;
        }
    }

    public static List getContactsWithEmail(Context context, String s, int i)
    {
        Object obj = Collections.emptyList();
        Object obj1 = (new StringBuilder()).append(escapeQuotes(s)).append("%").toString();
        obj1 = String.format("%s LIKE '%s' OR %s LIKE '%s' AND %s <> '' AND %s = 1", new Object[] {
            "display_name", obj1, "display_name", (new StringBuilder("% ")).append(((String) (obj1))).toString(), "data1", "in_visible_group"
        });
        String s1 = (new StringBuilder()).append(getContactSortOrder()).append(" LIMIT ").append(i).toString();
        try
        {
            context = context.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_URI, PROJECTION_EMAIL, ((String) (obj1)), null, s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            CrashReporting.a(context);
            context = null;
        }
        obj1 = new HashSet();
        if (context != null && context.moveToFirst())
        {
            obj = new ArrayList(context.getCount());
            i = context.getColumnIndex("display_name");
            int j = context.getColumnIndex("data1");
            int k = context.getColumnIndex("contact_id");
            int l = context.getColumnIndex("photo_id");
            for (; !context.isAfterLast(); context.moveToNext())
            {
                String s2 = extractEmail(context.getString(j));
                if (s2 != null && isEmailAllowed(s2) && !((HashSet) (obj1)).contains(s2))
                {
                    String s3 = String.valueOf(context.getLong(k));
                    String s4 = context.getString(i);
                    TypeAheadItem typeaheaditem = new TypeAheadItem();
                    typeaheaditem.setUid(s3);
                    typeaheaditem.setTitle(s4);
                    typeaheaditem.setItemType(com.pinterest.activity.search.model.TypeAheadItem.ItemType.EMAIL_CONTACT);
                    if (!StringUtils.isEmpty(context.getString(l)))
                    {
                        typeaheaditem.setImageUri((new StringBuilder()).append(CONTACTS_URI).append("/").append(s3).append("/photo").toString());
                    }
                    typeaheaditem.setIdentifier(s2);
                    ((List) (obj)).add(typeaheaditem);
                    ((HashSet) (obj1)).add(s2);
                }
            }

            context.close();
            return sortByFirstNameMatch(escapeQuotes(s).toLowerCase(), ((List) (obj)));
        } else
        {
            return ((List) (obj));
        }
    }

    public static List getContactsWithPhoneNumber(Context context, String s, int i)
    {
        Object obj = Collections.emptyList();
        Object obj1 = (new StringBuilder()).append(escapeQuotes(s)).append("%").toString();
        obj1 = String.format("%s LIKE '%s' OR %s LIKE '%s' AND %s <> '' AND %s = 1", new Object[] {
            "display_name", obj1, "display_name", (new StringBuilder("% ")).append(((String) (obj1))).toString(), "data1", "in_visible_group"
        });
        String s1 = (new StringBuilder()).append(getContactSortOrder()).append(" LIMIT ").append(i).toString();
        try
        {
            context = context.getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, PROJECTION_PHONE, ((String) (obj1)), null, s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            CrashReporting.a(context);
            context = null;
        }
        obj1 = new HashSet();
        if (context != null && context.moveToFirst())
        {
            obj = new ArrayList(context.getCount());
            i = context.getColumnIndex("display_name");
            int j = context.getColumnIndex("data1");
            int k = context.getColumnIndex("contact_id");
            int l = context.getColumnIndex("photo_id");
            for (; !context.isAfterLast(); context.moveToNext())
            {
                String s2 = context.getString(j);
                if (s2 != null && !((HashSet) (obj1)).contains(s2))
                {
                    String s3 = String.valueOf(context.getLong(k));
                    String s4 = context.getString(i);
                    TypeAheadItem typeaheaditem = new TypeAheadItem();
                    typeaheaditem.setUid(s3);
                    typeaheaditem.setTitle(s4);
                    typeaheaditem.setItemType(com.pinterest.activity.search.model.TypeAheadItem.ItemType.PHONE_CONTACT);
                    if (!StringUtils.isEmpty(context.getString(l)))
                    {
                        typeaheaditem.setImageUri((new StringBuilder()).append(CONTACTS_URI).append("/").append(s3).append("/photo").toString());
                    }
                    typeaheaditem.setIdentifier(s2);
                    typeaheaditem.addPhoneNumber(s2);
                    ((List) (obj)).add(typeaheaditem);
                    ((HashSet) (obj1)).add(s2);
                }
            }

            context.close();
            return sortByFirstNameMatch(escapeQuotes(s).toLowerCase(), ((List) (obj)));
        } else
        {
            return ((List) (obj));
        }
    }

    public static List getNamedContactsWithEmail(Context context, String s, int i)
    {
        HashSet hashset = new HashSet(getSortedContacts(context, i));
        ArrayList arraylist = new ArrayList(hashset.size());
        context = getContactsWithEmail(context, s, i).iterator();
        do
        {
            if (!context.hasNext())
            {
                break;
            }
            s = (TypeAheadItem)context.next();
            if (hashset.contains(s.getUid()))
            {
                arraylist.add(s);
            }
        } while (true);
        return arraylist;
    }

    public static List getSortedContacts(Context context, int i)
    {
        Object obj = Collections.emptyList();
        Uri uri = android.provider.ContactsContract.Contacts.CONTENT_URI;
        String s = (new StringBuilder()).append(getContactSortOrder()).append(" LIMIT ").append(i).toString();
        try
        {
            context = context.getContentResolver().query(uri, new String[] {
                "_id"
            }, "in_visible_group = 1", null, s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            CrashReporting.a(context);
            context = null;
        }
        if (context != null && context.moveToFirst())
        {
            obj = new ArrayList(context.getCount());
            i = context.getColumnIndex("_id");
            for (; !context.isAfterLast(); context.moveToNext())
            {
                ((List) (obj)).add(String.valueOf(context.getLong(i)));
            }

            context.close();
            return ((List) (obj));
        } else
        {
            return ((List) (obj));
        }
    }

    private static boolean isEmailAllowed(String s)
    {
        s = s.split("@");
        s = s[s.length - 1];
        return !bannedEmailDomains.contains(s);
    }

    public static List sortByFirstNameMatch(String s, List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        ArrayList arraylist1 = new ArrayList();
        for (Iterator iterator = list.iterator(); iterator.hasNext();)
        {
            TypeAheadItem typeaheaditem = (TypeAheadItem)iterator.next();
            list = typeaheaditem.getTitle();
            int i = list.indexOf(' ');
            if (i > 0)
            {
                String s1 = list.substring(0, i);
                list.substring(i + 1);
                list = s1;
            }
            if (list.toLowerCase().startsWith(s))
            {
                arraylist.add(typeaheaditem);
            } else
            {
                arraylist1.add(typeaheaditem);
            }
        }

        arraylist.addAll(arraylist1);
        return arraylist;
    }

    private static void splitDisplayNameAndSet(String s, ContactAddressItem contactaddressitem)
    {
        s = s.split(" ");
        if (s.length > 0)
        {
            contactaddressitem.setFirstName(s[0]);
        }
        if (s.length > 1)
        {
            contactaddressitem.setLastName(s[s.length - 1]);
        }
    }

    private static String toSqlWhereInString(Set set)
    {
        return set.toString().replace('[', '(').replace(']', ')');
    }

    static 
    {
        CONTACTS_URI = android.provider.ContactsContract.Contacts.CONTENT_URI;
        ArrayList arraylist = new ArrayList();
        bannedEmailDomains = arraylist;
        arraylist.add("facebook.com");
    }
}
