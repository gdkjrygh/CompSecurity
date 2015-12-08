// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.addressbook;

import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.addressbook:
//            IngestionCallback, ContactList, PropertySet

public class ContactIngestionJNI
{
    public static final class AuthTicketType extends Enum
    {

        private static final AuthTicketType $VALUES[];
        public static final AuthTicketType AUTH_LiveIDToken;
        public static final AuthTicketType AUTH_SkypeToken;
        private final String message;
        private final int value;

        public static AuthTicketType valueOf(String s)
        {
            return (AuthTicketType)Enum.valueOf(com/skype/android/addressbook/ContactIngestionJNI$AuthTicketType, s);
        }

        public static AuthTicketType[] values()
        {
            return (AuthTicketType[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        public final String toString()
        {
            return message;
        }

        static 
        {
            AUTH_LiveIDToken = new AuthTicketType("AUTH_LiveIDToken", 0, 0, "MSA aka LiveID token! It can be for example retrived from CoreLib by SkyLib::RequestAccessToken(999, ...)");
            AUTH_SkypeToken = new AuthTicketType("AUTH_SkypeToken", 1, 1, "Skype token It can be for example retrived from CoreLib by SkyLib::RequestSkypeToken(999, ...)");
            $VALUES = (new AuthTicketType[] {
                AUTH_LiveIDToken, AUTH_SkypeToken
            });
        }

        private AuthTicketType(String s, int i, int j, String s1)
        {
            super(s, i);
            value = j;
            message = s1;
        }
    }

    public static final class CONFIG_KEY extends Enum
    {

        private static final CONFIG_KEY $VALUES[];
        public static final CONFIG_KEY ACCOUNT_NAME;
        public static final CONFIG_KEY COUNTRY_PREFIX;
        public static final CONFIG_KEY DATABASE_PATH;
        public static final CONFIG_KEY DATABASE_TMP;
        public static final CONFIG_KEY HTTP_STACK;
        public static final CONFIG_KEY INVALID;
        public static final CONFIG_KEY SERVICE_APP_ID;
        public static final CONFIG_KEY SERVICE_BASE_URL;
        private static final SparseArray intToTypeMap;
        private final String message;
        private final int value;

        public static CONFIG_KEY fromInt(int i)
        {
            return (CONFIG_KEY)intToTypeMap.get(Integer.valueOf(i).intValue());
        }

        public static CONFIG_KEY valueOf(String s)
        {
            return (CONFIG_KEY)Enum.valueOf(com/skype/android/addressbook/ContactIngestionJNI$CONFIG_KEY, s);
        }

        public static CONFIG_KEY[] values()
        {
            return (CONFIG_KEY[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        public final String toString()
        {
            return message;
        }

        static 
        {
            INVALID = new CONFIG_KEY("INVALID", 0, 0, "Invalid value.  Do not use.");
            DATABASE_PATH = new CONFIG_KEY("DATABASE_PATH", 1, 1, "Path to local storage file.  Optional.  Defaults to ./ingestion.db.");
            DATABASE_TMP = new CONFIG_KEY("DATABASE_TMP", 2, 7, "Path to DBMS temp storage.  Optional.  Defaults to /var/tmp.");
            COUNTRY_PREFIX = new CONFIG_KEY("COUNTRY_PREFIX", 3, 2, "Local country prefix to use when normalizing phone numbers.  Optional.");
            HTTP_STACK = new CONFIG_KEY("HTTP_STACK", 4, 3, "Pointer to IHttpStack interface to use for HTTP requests.  Optional.  Library provides default.");
            ACCOUNT_NAME = new CONFIG_KEY("ACCOUNT_NAME", 5, 4, "Skype ID of the logged-in user on whose behalf the library runs.  Required for lookups.");
            SERVICE_BASE_URL = new CONFIG_KEY("SERVICE_BASE_URL", 6, 5, "Base URL for requests to the external lookup service.  Optional.");
            SERVICE_APP_ID = new CONFIG_KEY("SERVICE_APP_ID", 7, 6, "App ID of the parent application as assigned by ABCH team. Required for lookups.");
            $VALUES = (new CONFIG_KEY[] {
                INVALID, DATABASE_PATH, DATABASE_TMP, COUNTRY_PREFIX, HTTP_STACK, ACCOUNT_NAME, SERVICE_BASE_URL, SERVICE_APP_ID
            });
            intToTypeMap = new SparseArray();
            CONFIG_KEY aconfig_key[] = values();
            int j = aconfig_key.length;
            for (int i = 0; i < j; i++)
            {
                CONFIG_KEY config_key = aconfig_key[i];
                intToTypeMap.put(config_key.value, config_key);
            }

        }

        private CONFIG_KEY(String s, int i, int j, String s1)
        {
            super(s, i);
            value = j;
            message = s1;
        }
    }

    public static class ConfigurationSet
    {

        private List configuration;

        public void addConfiguration(CONFIG_KEY config_key, String s)
        {
            configuration.add(Pair.create(config_key, s));
        }

        public CONFIG_KEY getConfigurationKey(int i)
        {
            CONFIG_KEY config_key = CONFIG_KEY.INVALID;
            Pair pair = (Pair)configuration.get(i);
            if (pair != null)
            {
                config_key = (CONFIG_KEY)pair.first;
            }
            return config_key;
        }

        public int getConfigurationKeyInt(int i)
        {
            return getConfigurationKey(i).toInt();
        }

        public String getConfigurationValue(Integer integer)
        {
            Object obj1 = null;
            Iterator iterator = configuration.iterator();
            Object obj;
            do
            {
                obj = obj1;
                if (!iterator.hasNext())
                {
                    break;
                }
                obj = (Pair)iterator.next();
                if (((CONFIG_KEY)((Pair) (obj)).first).toInt() != integer.intValue())
                {
                    continue;
                }
                obj = (String)((Pair) (obj)).second;
                break;
            } while (true);
            return ((String) (obj));
        }

        public String getConfigurationValueInt(int i)
        {
            return getConfigurationValue(Integer.valueOf(i));
        }

        public int size()
        {
            return configuration.size();
        }

        public ConfigurationSet()
        {
            configuration = new ArrayList();
        }
    }

    public static class ContactList extends com.skype.android.addressbook.ContactList
    {

        private static final int DEFAULT_CAPACITY = 500;
        private List contacts;

        private PropertySet findContactById(String s)
        {
            for (Iterator iterator = contacts.iterator(); iterator.hasNext();)
            {
                PropertySet propertyset1 = (PropertySet)iterator.next();
                if (propertyset1.hasId(s))
                {
                    return propertyset1;
                }
            }

            PropertySet propertyset = new PropertySet();
            propertyset.setName(s);
            contacts.add(propertyset);
            return propertyset;
        }

        public void addContact(PropertySet propertyset)
        {
            contacts.add(propertyset);
        }

        public void addEmail(String s, String s1)
        {
            findContactById(s).addEmail(s1);
        }

        public void addPhone(String s, String s1)
        {
            findContactById(s).addPhone(s1);
        }

        public void clear()
        {
            contacts.clear();
        }

        public PropertySet getContact(int i)
        {
            return (PropertySet)contacts.get(i);
        }

        public volatile com.skype.android.addressbook.PropertySet getContact(int i)
        {
            return getContact(i);
        }

        public String getStats()
        {
            int j = 0;
            int i = 0;
            for (Iterator iterator = contacts.iterator(); iterator.hasNext();)
            {
                PropertySet propertyset = (PropertySet)iterator.next();
                j += propertyset.countEmails();
                i += propertyset.countPhones();
            }

            return (new StringBuilder("Contact list contains: ")).append(contacts.size()).append(" contacts, ").append(j).append(" emails, ").append(i).append(" phone numbers").toString();
        }

        public ContactList getSubset(int i, int j)
        {
            if (i >= 0 && i < contacts.size()) goto _L2; else goto _L1
_L1:
            ContactList contactlist = null;
_L4:
            return contactlist;
_L2:
            ContactList contactlist1 = new ContactList(j);
            boolean flag = false;
            int k = Math.min(contacts.size() - i, j);
            j = ((flag) ? 1 : 0);
            do
            {
                contactlist = contactlist1;
                if (j >= k)
                {
                    continue;
                }
                contactlist1.addContact((PropertySet)contacts.get(i + j));
                j++;
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public volatile com.skype.android.addressbook.ContactList getSubset(int i, int j)
        {
            return getSubset(i, j);
        }

        public int size()
        {
            return contacts.size();
        }

        public ContactList()
        {
            contacts = new ArrayList(500);
        }

        public ContactList(int i)
        {
            contacts = new ArrayList(i);
        }
    }

    public static final class ERROR_CODE extends Enum
    {

        private static final ERROR_CODE $VALUES[];
        public static final ERROR_CODE ABORTED;
        public static final ERROR_CODE BUSY;
        public static final ERROR_CODE DATABASE_ERROR;
        public static final ERROR_CODE INTERNAL_ERROR;
        public static final ERROR_CODE INVALID_ARG;
        public static final ERROR_CODE INVALID_CONFIGURATION;
        public static final ERROR_CODE INVALID_CONFIG_ITEM;
        public static final ERROR_CODE IN_PROGRESS;
        public static final ERROR_CODE LOOKUP_BAD_AUTH;
        public static final ERROR_CODE LOOKUP_CLIENT_ERROR;
        public static final ERROR_CODE LOOKUP_DATA_ERROR;
        public static final ERROR_CODE LOOKUP_NETWORK_FAILURE;
        public static final ERROR_CODE LOOKUP_NOT_RECOMMENDED;
        public static final ERROR_CODE LOOKUP_QUERY_LIMIT;
        public static final ERROR_CODE LOOKUP_SERVER_ERROR;
        public static final ERROR_CODE NOT_FOUND;
        public static final ERROR_CODE OK;
        private static final SparseArray intToTypeMap;
        private final String message;
        private final int value;

        public static ERROR_CODE fromInt(int i)
        {
            return (ERROR_CODE)intToTypeMap.get(Integer.valueOf(i).intValue());
        }

        public static ERROR_CODE valueOf(String s)
        {
            return (ERROR_CODE)Enum.valueOf(com/skype/android/addressbook/ContactIngestionJNI$ERROR_CODE, s);
        }

        public static ERROR_CODE[] values()
        {
            return (ERROR_CODE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        public final String toString()
        {
            return message;
        }

        static 
        {
            OK = new ERROR_CODE("OK", 0, 0, "No error has occurred.");
            INTERNAL_ERROR = new ERROR_CODE("INTERNAL_ERROR", 1, -1, "Unspecified internal error.");
            INVALID_ARG = new ERROR_CODE("INVALID_ARG", 2, -2, "Invalid argument passed to a function.");
            INVALID_CONFIG_ITEM = new ERROR_CODE("INVALID_CONFIG_ITEM", 3, -3, "Using an invalid/unknown config item.");
            INVALID_CONFIGURATION = new ERROR_CODE("INVALID_CONFIGURATION", 4, -4, "The library was not configured properly.");
            DATABASE_ERROR = new ERROR_CODE("DATABASE_ERROR", 5, -10, "Error during database query. The database file is probably corrupted and needs to be deleted externally.");
            NOT_FOUND = new ERROR_CODE("NOT_FOUND", 6, -11, "No such contact has been found.");
            BUSY = new ERROR_CODE("BUSY", 7, -20, "The operation has not been started because another such operation is already running.");
            IN_PROGRESS = new ERROR_CODE("IN_PROGRESS", 8, -21, "The operation has been successfully started and will be finished asynchronously.");
            ABORTED = new ERROR_CODE("ABORTED", 9, -22, "The lookup has been aborted.");
            LOOKUP_NETWORK_FAILURE = new ERROR_CODE("LOOKUP_NETWORK_FAILURE", 10, -30, "A stable network connection could not be established to the lookup service.");
            LOOKUP_DATA_ERROR = new ERROR_CODE("LOOKUP_DATA_ERROR", 11, -31, "An error occurred during remote lookup, the server response could not be parsed properly.");
            LOOKUP_SERVER_ERROR = new ERROR_CODE("LOOKUP_SERVER_ERROR", 12, -32, "An error occurred during remote lookup, the server reported an error status.");
            LOOKUP_CLIENT_ERROR = new ERROR_CODE("LOOKUP_CLIENT_ERROR", 13, -33, " An error occurred during remote lookup, the server said the library sent some data wrongly formatted, invalid, etc.");
            LOOKUP_BAD_AUTH = new ERROR_CODE("LOOKUP_BAD_AUTH", 14, -34, "There was an authentication error.  Make sure CFG_AuthCookie is set to a valid and recent authentication cookie.");
            LOOKUP_QUERY_LIMIT = new ERROR_CODE("LOOKUP_QUERY_LIMIT", 15, -35, "Query limit reached.");
            LOOKUP_NOT_RECOMMENDED = new ERROR_CODE("LOOKUP_NOT_RECOMMENDED", 16, -81, "Native address book update processed correctly with no changes requiring lookup");
            $VALUES = (new ERROR_CODE[] {
                OK, INTERNAL_ERROR, INVALID_ARG, INVALID_CONFIG_ITEM, INVALID_CONFIGURATION, DATABASE_ERROR, NOT_FOUND, BUSY, IN_PROGRESS, ABORTED, 
                LOOKUP_NETWORK_FAILURE, LOOKUP_DATA_ERROR, LOOKUP_SERVER_ERROR, LOOKUP_CLIENT_ERROR, LOOKUP_BAD_AUTH, LOOKUP_QUERY_LIMIT, LOOKUP_NOT_RECOMMENDED
            });
            intToTypeMap = new SparseArray();
            ERROR_CODE aerror_code[] = values();
            int j = aerror_code.length;
            for (int i = 0; i < j; i++)
            {
                ERROR_CODE error_code = aerror_code[i];
                intToTypeMap.put(error_code.value, error_code);
            }

        }

        private ERROR_CODE(String s, int i, int j, String s1)
        {
            super(s, i);
            value = j;
            message = s1;
        }
    }

    public static class PropertySet extends com.skype.android.addressbook.PropertySet
    {

        private List properties;

        public void addEmail(String s)
        {
            addProperty("email", s);
        }

        public void addPhone(String s)
        {
            addProperty("phone", s);
        }

        protected void addProperty(String s, String s1)
        {
            s = Pair.create(s, s1);
            if (!properties.contains(s))
            {
                properties.add(s);
            }
        }

        public int countEmails()
        {
            int i = 0;
            Iterator iterator = properties.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((Pair)iterator.next()).first == "email")
                {
                    i++;
                }
            } while (true);
            return i;
        }

        public int countPhones()
        {
            int i = 0;
            Iterator iterator = properties.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((Pair)iterator.next()).first == "phone")
                {
                    i++;
                }
            } while (true);
            return i;
        }

        protected String getPropertyKey(int i)
        {
            String s = null;
            Pair pair = (Pair)properties.get(i);
            if (pair != null)
            {
                s = (String)pair.first;
            }
            return s;
        }

        protected String getPropertyValue(int i)
        {
            String s = null;
            Pair pair = (Pair)properties.get(i);
            if (pair != null)
            {
                s = (String)pair.second;
            }
            return s;
        }

        public boolean hasData()
        {
            for (Iterator iterator = properties.iterator(); iterator.hasNext();)
            {
                if (((Pair)iterator.next()).first != "id")
                {
                    return true;
                }
            }

            return false;
        }

        public boolean hasId(String s)
        {
            for (Iterator iterator = properties.iterator(); iterator.hasNext();)
            {
                Pair pair = (Pair)iterator.next();
                if (pair.first == "id" && ((String)pair.second).equals(s))
                {
                    return true;
                }
            }

            return false;
        }

        public void setName(String s)
        {
            addProperty("id", s);
        }

        public int size()
        {
            return properties.size();
        }

        public PropertySet()
        {
            properties = new ArrayList();
        }

        public PropertySet(int i)
        {
            properties = new ArrayList(i);
        }
    }

    private final class a
    {

        private final IngestionCallback ingestionCallback;
        final ContactIngestionJNI this$0;

        public final void onBatchDone(int i, int j, int k)
        {
            ingestionCallback.onBatchDone(i, j, k);
        }

        public final void onLookupDone(int i, int j, int k)
        {
            ingestionCallback.onLookupDone(i, j, k);
        }

        public a(IngestionCallback ingestioncallback)
        {
            this$0 = ContactIngestionJNI.this;
            super();
            ingestionCallback = ingestioncallback;
        }
    }


    public static final String INGEST_SERVICE_URL_LIVE = "https://people.directory.live.com/people/";
    public static final String INGEST_SERVICE_URL_TEST = "https://people.directory.live-int.com/people/";
    private static final String PROPKEY_EMAIL = "email";
    private static final String PROPKEY_ID = "id";
    private static final String PROPKEY_PHONE = "phone";
    public static final String SERVICE_APP_ID = "D1604CB9-CFF6-4A1B-8A91-3C6751D6D79A";
    public static final String SOURCE_ID = "DCON";

    public ContactIngestionJNI()
    {
    }

    private native int intPerformLookup(int i, String s, a a1);

    public native int abortLookup();

    public native int addOrUpdateContacts(String s, ContactList contactlist);

    public native int cleanup();

    public native int configure(ConfigurationSet configurationset);

    public native int deleteContacts(String s, ContactList contactlist);

    public native int expireContacts(String s, long l);

    public native int getContactInfo(String s, PropertySet propertyset, PropertySet propertyset1, PropertySet propertyset2);

    public native int getContactInfo(String s, String s1, PropertySet propertyset, PropertySet propertyset1);

    public native long getVersion();

    public native int isLookupRecommended();

    public ERROR_CODE performLookup(AuthTicketType authtickettype, String s, IngestionCallback ingestioncallback)
    {
        return ERROR_CODE.fromInt(intPerformLookup(authtickettype.toInt(), s, new a(ingestioncallback)));
    }

    public native int updateAllContacts(String s, ContactList contactlist);
}
