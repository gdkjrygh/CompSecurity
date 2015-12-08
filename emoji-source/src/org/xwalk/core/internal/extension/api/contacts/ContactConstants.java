// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.contacts;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactConstants
{
    public static class ContactMap
    {

        public Map mDataMap;
        public String mMimeType;
        public String mName;
        public Map mTypeMap;
        public Map mTypeValueMap;

        public ContactMap(String s, Map map, Map map1, Map map2)
        {
            mName = s;
            mMimeType = (String)((Pair)ContactConstants.contactDataMap.get(s)).second;
            mDataMap = map;
            mTypeMap = map1;
            mTypeValueMap = map2;
        }
    }


    public static final String CUSTOM_MIMETYPE_GENDER = "vnd.android.cursor.item/contact_custom_gender";
    public static final String CUSTOM_MIMETYPE_LASTUPDATED = "vnd.android.cursor.item/contact_custom_lastupdated";
    public static final Map addressDataMap = createStringMap(new String[] {
        "data4", "streetAddress", "data6", "locality", "data8", "region", "data9", "postalCode", "data10", "countryName"
    });
    public static final Map addressTypeMap = new HashMap() {

            
            {
                put("type", "data2");
                put("isPrimary", "is_primary");
                put("isSuperPrimary", "is_super_primary");
            }
    };
    public static final Map addressTypeValuesMap = new HashMap() {

            
            {
                put("work", Integer.valueOf(2));
                put("home", Integer.valueOf(1));
                put("other", Integer.valueOf(3));
            }
    };
    public static final Map companyDataMap = createDataMap("data1");
    public static final Map contactDataMap = createTripleMap(new String[] {
        "id", "contact_id", null, "displayName", "data1", "vnd.android.cursor.item/name", "familyNames", "data3", "vnd.android.cursor.item/name", "givenNames", 
        "data2", "vnd.android.cursor.item/name", "middleNames", "data5", "vnd.android.cursor.item/name", "additionalNames", "data5", "vnd.android.cursor.item/name", "honorificPrefixes", "data4", 
        "vnd.android.cursor.item/name", "honorificSuffixes", "data6", "vnd.android.cursor.item/name", "nickNames", "data1", "vnd.android.cursor.item/nickname", "categories", "data1", "vnd.android.cursor.item/group_membership", 
        "gender", "data1", "vnd.android.cursor.item/contact_custom_gender", "lastUpdated", "data1", "vnd.android.cursor.item/contact_custom_lastupdated", "birthday", "data1", "vnd.android.cursor.item/contact_event", "anniversary", 
        "data1", "vnd.android.cursor.item/contact_event", "emails", "data1", "vnd.android.cursor.item/email_v2", "photos", "data15", "vnd.android.cursor.item/photo", "urls", "data1", 
        "vnd.android.cursor.item/website", "phoneNumbers", "data1", "vnd.android.cursor.item/phone_v2", "addresses", null, "vnd.android.cursor.item/postal-address_v2", "streetAddress", "data4", "vnd.android.cursor.item/postal-address_v2", 
        "locality", "data6", "vnd.android.cursor.item/postal-address_v2", "region", "data8", "vnd.android.cursor.item/postal-address_v2", "postalCode", "data9", "vnd.android.cursor.item/postal-address_v2", "countryName", 
        "data10", "vnd.android.cursor.item/postal-address_v2", "organizations", "data1", "vnd.android.cursor.item/organization", "jobTitles", "data4", "vnd.android.cursor.item/organization", "notes", "data1", 
        "vnd.android.cursor.item/note", "impp", "data1", "vnd.android.cursor.item/im"
    });
    public static final List contactMapList = new ArrayList() {

            
            {
                add(new ContactMap("emails", ContactConstants.emailDataMap, ContactConstants.emailTypeMap, ContactConstants.emailTypeValuesMap));
                add(new ContactMap("photos", ContactConstants.photoDataMap, null, null));
                add(new ContactMap("urls", ContactConstants.websiteDataMap, ContactConstants.websiteTypeMap, ContactConstants.websiteTypeValuesMap));
                add(new ContactMap("phoneNumbers", ContactConstants.phoneDataMap, ContactConstants.phoneTypeMap, ContactConstants.phoneTypeValuesMap));
                add(new ContactMap("addresses", ContactConstants.addressDataMap, ContactConstants.addressTypeMap, ContactConstants.addressTypeValuesMap));
                add(new ContactMap("organizations", ContactConstants.companyDataMap, null, null));
                add(new ContactMap("jobTitles", ContactConstants.jobtitleDataMap, null, null));
                add(new ContactMap("notes", ContactConstants.noteDataMap, null, null));
                add(new ContactMap("impp", ContactConstants.imDataMap, ContactConstants.imTypeMap, ContactConstants.imTypeValuesMap));
            }
    };
    public static final Map emailDataMap = createValueMap("data1");
    public static final Map emailTypeMap = new HashMap() {

            
            {
                put("type", "data2");
                put("isPrimary", "is_primary");
                put("isSuperPrimary", "is_super_primary");
            }
    };
    public static final Map emailTypeValuesMap = new HashMap() {

            
            {
                put("work", Integer.valueOf(2));
                put("home", Integer.valueOf(1));
                put("mobile", Integer.valueOf(4));
            }
    };
    public static final Map findFieldMap = createStringMap(new String[] {
        "familyName", "familyNames", "givenName", "givenNames", "middleName", "middleNames", "additionalName", "additionalNames", "honorificPrefix", "honorificPrefixes", 
        "honorificSuffix", "honorificSuffixes", "nickName", "nickNames", "email", "emails", "photo", "photos", "url", "urls", 
        "phoneNumber", "phoneNumbers", "organization", "organizations", "jobTitle", "jobTitles", "note", "notes"
    });
    public static final Map imDataMap = createValueMap("data1");
    public static final Map imProtocolMap = new HashMap() {

            
            {
                put("aim", Integer.valueOf(0));
                put("msn", Integer.valueOf(1));
                put("ymsgr", Integer.valueOf(2));
                put("skype", Integer.valueOf(3));
                put("qq", Integer.valueOf(4));
                put("gtalk", Integer.valueOf(5));
                put("icq", Integer.valueOf(6));
                put("jabber", Integer.valueOf(7));
                put("netmeeting", Integer.valueOf(8));
            }
    };
    public static final Map imTypeMap = new HashMap() {

            
            {
                put("type", "data2");
                put("isPrimary", "is_primary");
                put("isSuperPrimary", "is_super_primary");
            }
    };
    public static final Map imTypeValuesMap = new HashMap() {

            
            {
                put("work", Integer.valueOf(2));
                put("home", Integer.valueOf(1));
                put("other", Integer.valueOf(3));
            }
    };
    public static final Map jobtitleDataMap = createDataMap("data4");
    public static final Map noteDataMap = createDataMap("data1");
    public static final Map phoneDataMap = createValueMap("data1");
    public static final Map phoneTypeMap = new HashMap() {

            
            {
                put("type", "data2");
                put("isPrimary", "is_primary");
                put("isSuperPrimary", "is_super_primary");
            }
    };
    public static final Map phoneTypeValuesMap = new HashMap() {

            
            {
                put("home", Integer.valueOf(1));
                put("mobile", Integer.valueOf(2));
                put("work", Integer.valueOf(3));
                put("fax_work", Integer.valueOf(4));
                put("fax_home", Integer.valueOf(5));
                put("pager", Integer.valueOf(6));
                put("other", Integer.valueOf(7));
                put("callback", Integer.valueOf(8));
                put("car", Integer.valueOf(9));
                put("company_main", Integer.valueOf(10));
                put("isdn", Integer.valueOf(11));
                put("main", Integer.valueOf(12));
                put("other_fax", Integer.valueOf(13));
                put("radio", Integer.valueOf(14));
                put("telex", Integer.valueOf(15));
                put("tty_tdd", Integer.valueOf(16));
                put("mobile", Integer.valueOf(17));
                put("work_pager", Integer.valueOf(18));
                put("assistant", Integer.valueOf(19));
                put("mms", Integer.valueOf(20));
            }
    };
    public static final Map photoDataMap = createDataMap("data15");
    public static final Map websiteDataMap = createValueMap("data1");
    public static final Map websiteTypeMap = new HashMap() {

            
            {
                put("type", "data2");
                put("isPrimary", "is_primary");
                put("isSuperPrimary", "is_super_primary");
            }
    };
    public static final Map websiteTypeValuesMap = new HashMap() {

            
            {
                put("blog", Integer.valueOf(2));
                put("ftp", Integer.valueOf(6));
                put("home", Integer.valueOf(4));
                put("homepage", Integer.valueOf(1));
                put("other", Integer.valueOf(7));
                put("profile", Integer.valueOf(3));
                put("work", Integer.valueOf(5));
            }
    };

    public ContactConstants()
    {
    }

    private static Map createDataMap(String s)
    {
        return createStringMap(new String[] {
            "data", s
        });
    }

    private static Map createStringMap(String as[])
    {
        HashMap hashmap = new HashMap();
        for (int i = 0; i < as.length; i += 2)
        {
            hashmap.put(as[i], as[i + 1]);
        }

        return Collections.unmodifiableMap(hashmap);
    }

    private static Map createTripleMap(String as[])
    {
        HashMap hashmap = new HashMap();
        for (int i = 0; i < as.length; i += 3)
        {
            hashmap.put(as[i], new Pair(as[i + 1], as[i + 2]));
        }

        return Collections.unmodifiableMap(hashmap);
    }

    private static Map createValueMap(String s)
    {
        return createStringMap(new String[] {
            s, "value"
        });
    }

}
