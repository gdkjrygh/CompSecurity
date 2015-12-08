// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import android.webkit.WebView;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.cordova.api.CordovaInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova:
//            ContactAccessor

public class ContactAccessorSdk5 extends ContactAccessor
{

    private static final String EMAIL_REGEXP = ".+@.+\\.+.+";
    private static final long MAX_PHOTO_SIZE = 0x100000L;
    private static final Map dbMap;

    public ContactAccessorSdk5(WebView webview, CordovaInterface cordovainterface)
    {
        mApp = cordovainterface;
        mView = webview;
    }

    private JSONObject addressQuery(Cursor cursor)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", cursor.getString(cursor.getColumnIndex("_id")));
            jsonobject.put("pref", false);
            jsonobject.put("type", getAddressType(cursor.getInt(cursor.getColumnIndex("data2"))));
            jsonobject.put("formatted", cursor.getString(cursor.getColumnIndex("data1")));
            jsonobject.put("streetAddress", cursor.getString(cursor.getColumnIndex("data4")));
            jsonobject.put("locality", cursor.getString(cursor.getColumnIndex("data7")));
            jsonobject.put("region", cursor.getString(cursor.getColumnIndex("data8")));
            jsonobject.put("postalCode", cursor.getString(cursor.getColumnIndex("data9")));
            jsonobject.put("country", cursor.getString(cursor.getColumnIndex("data10")));
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            Log.e("ContactsAccessor", cursor.getMessage(), cursor);
            return jsonobject;
        }
        return jsonobject;
    }

    private ContactAccessor.WhereOptions buildIdClause(Set set, String s)
    {
        ContactAccessor.WhereOptions whereoptions = new ContactAccessor.WhereOptions(this);
        if (s.equals("%"))
        {
            whereoptions.setWhere("(contact_id LIKE ? )");
            whereoptions.setWhereArgs(new String[] {
                s
            });
            return whereoptions;
        }
        set = set.iterator();
        s = new StringBuffer("(");
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            s.append((new StringBuilder()).append("'").append((String)set.next()).append("'").toString());
            if (set.hasNext())
            {
                s.append(",");
            }
        } while (true);
        s.append(")");
        whereoptions.setWhere((new StringBuilder()).append("contact_id IN ").append(s.toString()).toString());
        whereoptions.setWhereArgs(null);
        return whereoptions;
    }

    private ContactAccessor.WhereOptions buildWhereClause(JSONArray jsonarray, String s)
    {
        ArrayList arraylist;
        ContactAccessor.WhereOptions whereoptions;
        ArrayList arraylist1;
        int i;
        arraylist1 = new ArrayList();
        arraylist = new ArrayList();
        whereoptions = new ContactAccessor.WhereOptions(this);
        if (isWildCardSearch(jsonarray))
        {
            if ("%".equals(s))
            {
                whereoptions.setWhere("(display_name LIKE ? )");
                whereoptions.setWhereArgs(new String[] {
                    s
                });
                return whereoptions;
            }
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get("displayName")).append(" LIKE ? )").toString());
            arraylist.add(s);
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get("name")).append(" LIKE ? AND ").append("mimetype").append(" = ? )").toString());
            arraylist.add(s);
            arraylist.add("vnd.android.cursor.item/name");
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get("nickname")).append(" LIKE ? AND ").append("mimetype").append(" = ? )").toString());
            arraylist.add(s);
            arraylist.add("vnd.android.cursor.item/nickname");
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get("phoneNumbers")).append(" LIKE ? AND ").append("mimetype").append(" = ? )").toString());
            arraylist.add(s);
            arraylist.add("vnd.android.cursor.item/phone_v2");
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get("emails")).append(" LIKE ? AND ").append("mimetype").append(" = ? )").toString());
            arraylist.add(s);
            arraylist.add("vnd.android.cursor.item/email_v2");
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get("addresses")).append(" LIKE ? AND ").append("mimetype").append(" = ? )").toString());
            arraylist.add(s);
            arraylist.add("vnd.android.cursor.item/postal-address_v2");
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get("ims")).append(" LIKE ? AND ").append("mimetype").append(" = ? )").toString());
            arraylist.add(s);
            arraylist.add("vnd.android.cursor.item/im");
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get("organizations")).append(" LIKE ? AND ").append("mimetype").append(" = ? )").toString());
            arraylist.add(s);
            arraylist.add("vnd.android.cursor.item/organization");
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get("note")).append(" LIKE ? AND ").append("mimetype").append(" = ? )").toString());
            arraylist.add(s);
            arraylist.add("vnd.android.cursor.item/note");
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get("urls")).append(" LIKE ? AND ").append("mimetype").append(" = ? )").toString());
            arraylist.add(s);
            arraylist.add("vnd.android.cursor.item/website");
        }
        if ("%".equals(s))
        {
            whereoptions.setWhere("(display_name LIKE ? )");
            whereoptions.setWhereArgs(new String[] {
                s
            });
            return whereoptions;
        }
        i = 0;
_L6:
        if (i >= jsonarray.length()) goto _L2; else goto _L1
_L1:
        String s1;
        s1 = jsonarray.getString(i);
        if (s1.equals("id"))
        {
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get(s1)).append(" = ? )").toString());
            arraylist.add(s.substring(1, s.length() - 1));
            break MISSING_BLOCK_LABEL_1800;
        }
        if (s1.startsWith("displayName"))
        {
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get(s1)).append(" LIKE ? )").toString());
            arraylist.add(s);
            break MISSING_BLOCK_LABEL_1800;
        }
          goto _L3
_L2:
        jsonarray = new StringBuffer();
        for (i = 0; i < arraylist1.size(); i++)
        {
            jsonarray.append((String)arraylist1.get(i));
            if (i != arraylist1.size() - 1)
            {
                jsonarray.append(" OR ");
            }
        }

        break; /* Loop/switch isn't completed */
_L3:
        if (s1.startsWith("name"))
        {
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get(s1)).append(" LIKE ? AND ").append("mimetype").append(" = ? )").toString());
            arraylist.add(s);
            arraylist.add("vnd.android.cursor.item/name");
            break MISSING_BLOCK_LABEL_1800;
        }
        if (s1.startsWith("nickname"))
        {
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get(s1)).append(" LIKE ? AND ").append("mimetype").append(" = ? )").toString());
            arraylist.add(s);
            arraylist.add("vnd.android.cursor.item/nickname");
            break MISSING_BLOCK_LABEL_1800;
        }
        if (s1.startsWith("phoneNumbers"))
        {
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get(s1)).append(" LIKE ? AND ").append("mimetype").append(" = ? )").toString());
            arraylist.add(s);
            arraylist.add("vnd.android.cursor.item/phone_v2");
            break MISSING_BLOCK_LABEL_1800;
        }
        if (s1.startsWith("emails"))
        {
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get(s1)).append(" LIKE ? AND ").append("mimetype").append(" = ? )").toString());
            arraylist.add(s);
            arraylist.add("vnd.android.cursor.item/email_v2");
            break MISSING_BLOCK_LABEL_1800;
        }
        if (s1.startsWith("addresses"))
        {
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get(s1)).append(" LIKE ? AND ").append("mimetype").append(" = ? )").toString());
            arraylist.add(s);
            arraylist.add("vnd.android.cursor.item/postal-address_v2");
            break MISSING_BLOCK_LABEL_1800;
        }
        if (s1.startsWith("ims"))
        {
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get(s1)).append(" LIKE ? AND ").append("mimetype").append(" = ? )").toString());
            arraylist.add(s);
            arraylist.add("vnd.android.cursor.item/im");
            break MISSING_BLOCK_LABEL_1800;
        }
        if (s1.startsWith("organizations"))
        {
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get(s1)).append(" LIKE ? AND ").append("mimetype").append(" = ? )").toString());
            arraylist.add(s);
            arraylist.add("vnd.android.cursor.item/organization");
            break MISSING_BLOCK_LABEL_1800;
        }
        if (s1.startsWith("note"))
        {
            arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get(s1)).append(" LIKE ? AND ").append("mimetype").append(" = ? )").toString());
            arraylist.add(s);
            arraylist.add("vnd.android.cursor.item/note");
            break MISSING_BLOCK_LABEL_1800;
        }
        try
        {
            if (s1.startsWith("urls"))
            {
                arraylist1.add((new StringBuilder()).append("(").append((String)dbMap.get(s1)).append(" LIKE ? AND ").append("mimetype").append(" = ? )").toString());
                arraylist.add(s);
                arraylist.add("vnd.android.cursor.item/website");
            }
            break MISSING_BLOCK_LABEL_1800;
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            Log.e("ContactsAccessor", jsonarray.getMessage(), jsonarray);
        }
        if (true) goto _L2; else goto _L4
_L4:
        whereoptions.setWhere(jsonarray.toString());
        jsonarray = new String[arraylist.size()];
        for (i = 0; i < arraylist.size(); i++)
        {
            jsonarray[i] = (String)arraylist.get(i);
        }

        whereoptions.setWhereArgs(jsonarray);
        return whereoptions;
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private String createNewContact(JSONObject jsonobject, String s, String s1)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", s).withValue("account_name", s1).build());
        s = jsonobject.optJSONObject("name");
        s1 = jsonobject.getString("displayName");
        int i;
        if (s1 != null || s != null)
        {
            try
            {
                arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data1", s1).withValue("data3", getJsonString(s, "familyName")).withValue("data5", getJsonString(s, "middleName")).withValue("data2", getJsonString(s, "givenName")).withValue("data4", getJsonString(s, "honorificPrefix")).withValue("data6", getJsonString(s, "honorificSuffix")).build());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.d("ContactsAccessor", "Could not get name object");
            }
        }
        s = jsonobject.getJSONArray("phoneNumbers");
        if (s == null) goto _L2; else goto _L1
_L1:
        i = 0;
_L3:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        insertPhone(arraylist, (JSONObject)s.get(i));
        i++;
        if (true) goto _L3; else goto _L2
        s;
        Log.d("ContactsAccessor", "Could not get phone numbers");
_L2:
        s = jsonobject.getJSONArray("emails");
        if (s == null) goto _L5; else goto _L4
_L4:
        i = 0;
_L6:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        insertEmail(arraylist, (JSONObject)s.get(i));
        i++;
        if (true) goto _L6; else goto _L5
        s;
        Log.d("ContactsAccessor", "Could not get emails");
_L5:
        s = jsonobject.getJSONArray("addresses");
        if (s == null) goto _L8; else goto _L7
_L7:
        i = 0;
_L9:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        insertAddress(arraylist, (JSONObject)s.get(i));
        i++;
        if (true) goto _L9; else goto _L8
        s;
        Log.d("ContactsAccessor", "Could not get addresses");
_L8:
        s = jsonobject.getJSONArray("organizations");
        if (s == null) goto _L11; else goto _L10
_L10:
        i = 0;
_L12:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        insertOrganization(arraylist, (JSONObject)s.get(i));
        i++;
        if (true) goto _L12; else goto _L11
        s;
        Log.d("ContactsAccessor", "Could not get organizations");
_L11:
        s = jsonobject.getJSONArray("ims");
        if (s == null) goto _L14; else goto _L13
_L13:
        i = 0;
_L15:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        insertIm(arraylist, (JSONObject)s.get(i));
        i++;
        if (true) goto _L15; else goto _L14
        s;
        Log.d("ContactsAccessor", "Could not get emails");
_L14:
        s = getJsonString(jsonobject, "note");
        if (s != null)
        {
            arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/note").withValue("data1", s).build());
        }
        s = getJsonString(jsonobject, "nickname");
        if (s != null)
        {
            arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/nickname").withValue("data1", s).build());
        }
        s = jsonobject.getJSONArray("urls");
        if (s == null) goto _L17; else goto _L16
_L16:
        i = 0;
_L18:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        insertWebsite(arraylist, (JSONObject)s.get(i));
        i++;
        if (true) goto _L18; else goto _L17
        s;
        Log.d("ContactsAccessor", "Could not get websites");
_L17:
        s = getJsonString(jsonobject, "birthday");
        if (s != null)
        {
            arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/contact_event").withValue("data2", Integer.valueOf(3)).withValue("data1", s).build());
        }
        jsonobject = jsonobject.getJSONArray("photos");
        if (jsonobject == null) goto _L20; else goto _L19
_L19:
        i = 0;
_L21:
        if (i >= jsonobject.length())
        {
            break; /* Loop/switch isn't completed */
        }
        insertPhoto(arraylist, (JSONObject)jsonobject.get(i));
        i++;
        if (true) goto _L21; else goto _L20
        jsonobject;
        Log.d("ContactsAccessor", "Could not get photos");
_L20:
        jsonobject = null;
        try
        {
            s = mApp.getActivity().getContentResolver().applyBatch("com.android.contacts", arraylist);
            if (s.length >= 0)
            {
                jsonobject = ((ContentProviderResult) (s[0])).uri.getLastPathSegment();
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("ContactsAccessor", jsonobject.getMessage(), jsonobject);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("ContactsAccessor", jsonobject.getMessage(), jsonobject);
            return null;
        }
        return jsonobject;
    }

    private JSONObject emailQuery(Cursor cursor)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", cursor.getString(cursor.getColumnIndex("_id")));
            jsonobject.put("pref", false);
            jsonobject.put("value", cursor.getString(cursor.getColumnIndex("data1")));
            jsonobject.put("type", getContactType(cursor.getInt(cursor.getColumnIndex("data2"))));
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            Log.e("ContactsAccessor", cursor.getMessage(), cursor);
            return jsonobject;
        }
        return jsonobject;
    }

    private int getAddressType(String s)
    {
        byte byte1 = 3;
        byte byte0 = byte1;
        if (s != null)
        {
            if ("work".equals(s.toLowerCase()))
            {
                byte0 = 2;
            } else
            {
                if ("other".equals(s.toLowerCase()))
                {
                    return 3;
                }
                byte0 = byte1;
                if ("home".equals(s.toLowerCase()))
                {
                    return 1;
                }
            }
        }
        return byte0;
    }

    private String getAddressType(int i)
    {
        switch (i)
        {
        default:
            return "other";

        case 1: // '\001'
            return "home";

        case 2: // '\002'
            return "work";
        }
    }

    private int getContactType(String s)
    {
        byte byte1 = 3;
        byte byte0 = byte1;
        if (s != null)
        {
            if ("home".equals(s.toLowerCase()))
            {
                byte0 = 1;
            } else
            {
                if ("work".equals(s.toLowerCase()))
                {
                    return 2;
                }
                if ("other".equals(s.toLowerCase()))
                {
                    return 3;
                }
                if ("mobile".equals(s.toLowerCase()))
                {
                    return 4;
                }
                byte0 = byte1;
                if ("custom".equals(s.toLowerCase()))
                {
                    return 0;
                }
            }
        }
        return byte0;
    }

    private String getContactType(int i)
    {
        switch (i)
        {
        case 3: // '\003'
        default:
            return "other";

        case 0: // '\0'
            return "custom";

        case 1: // '\001'
            return "home";

        case 2: // '\002'
            return "work";

        case 4: // '\004'
            return "mobile";
        }
    }

    private int getImType(String s)
    {
        byte byte1 = -1;
        byte byte0 = byte1;
        if (s != null)
        {
            if ("aim".equals(s.toLowerCase()))
            {
                byte0 = 0;
            } else
            {
                if ("google talk".equals(s.toLowerCase()))
                {
                    return 5;
                }
                if ("icq".equals(s.toLowerCase()))
                {
                    return 6;
                }
                if ("jabber".equals(s.toLowerCase()))
                {
                    return 7;
                }
                if ("msn".equals(s.toLowerCase()))
                {
                    return 1;
                }
                if ("netmeeting".equals(s.toLowerCase()))
                {
                    return 8;
                }
                if ("qq".equals(s.toLowerCase()))
                {
                    return 4;
                }
                if ("skype".equals(s.toLowerCase()))
                {
                    return 3;
                }
                byte0 = byte1;
                if ("yahoo".equals(s.toLowerCase()))
                {
                    return 2;
                }
            }
        }
        return byte0;
    }

    private String getImType(int i)
    {
        switch (i)
        {
        default:
            return "custom";

        case 0: // '\0'
            return "AIM";

        case 5: // '\005'
            return "Google Talk";

        case 6: // '\006'
            return "ICQ";

        case 7: // '\007'
            return "Jabber";

        case 1: // '\001'
            return "MSN";

        case 8: // '\b'
            return "NetMeeting";

        case 4: // '\004'
            return "QQ";

        case 3: // '\003'
            return "Skype";

        case 2: // '\002'
            return "Yahoo";
        }
    }

    private int getOrgType(String s)
    {
        byte byte1 = 2;
        byte byte0 = byte1;
        if (s != null)
        {
            if ("work".equals(s.toLowerCase()))
            {
                byte0 = 1;
            } else
            {
                if ("other".equals(s.toLowerCase()))
                {
                    return 2;
                }
                byte0 = byte1;
                if ("custom".equals(s.toLowerCase()))
                {
                    return 0;
                }
            }
        }
        return byte0;
    }

    private String getOrgType(int i)
    {
        switch (i)
        {
        default:
            return "other";

        case 0: // '\0'
            return "custom";

        case 1: // '\001'
            return "work";
        }
    }

    private InputStream getPathFromUri(String s)
        throws IOException
    {
        if (s.startsWith("content:"))
        {
            s = Uri.parse(s);
            return mApp.getActivity().getContentResolver().openInputStream(s);
        }
        if (s.startsWith("http:") || s.startsWith("https:") || s.startsWith("file:"))
        {
            return (new URL(s)).openStream();
        } else
        {
            return new FileInputStream(s);
        }
    }

    private int getPhoneType(String s)
    {
        byte byte1 = 7;
        byte byte0 = byte1;
        if (s != null)
        {
            if ("home".equals(s.toLowerCase()))
            {
                byte0 = 1;
            } else
            {
                if ("mobile".equals(s.toLowerCase()))
                {
                    return 2;
                }
                if ("work".equals(s.toLowerCase()))
                {
                    return 3;
                }
                if ("work fax".equals(s.toLowerCase()))
                {
                    return 4;
                }
                if ("home fax".equals(s.toLowerCase()))
                {
                    return 5;
                }
                if ("fax".equals(s.toLowerCase()))
                {
                    return 4;
                }
                if ("pager".equals(s.toLowerCase()))
                {
                    return 6;
                }
                if ("other".equals(s.toLowerCase()))
                {
                    return 7;
                }
                if ("car".equals(s.toLowerCase()))
                {
                    return 9;
                }
                if ("company main".equals(s.toLowerCase()))
                {
                    return 10;
                }
                if ("isdn".equals(s.toLowerCase()))
                {
                    return 11;
                }
                if ("main".equals(s.toLowerCase()))
                {
                    return 12;
                }
                if ("other fax".equals(s.toLowerCase()))
                {
                    return 13;
                }
                if ("radio".equals(s.toLowerCase()))
                {
                    return 14;
                }
                if ("telex".equals(s.toLowerCase()))
                {
                    return 15;
                }
                if ("work mobile".equals(s.toLowerCase()))
                {
                    return 17;
                }
                if ("work pager".equals(s.toLowerCase()))
                {
                    return 18;
                }
                if ("assistant".equals(s.toLowerCase()))
                {
                    return 19;
                }
                if ("mms".equals(s.toLowerCase()))
                {
                    return 20;
                }
                if ("callback".equals(s.toLowerCase()))
                {
                    return 8;
                }
                if ("tty ttd".equals(s.toLowerCase()))
                {
                    return 16;
                }
                byte0 = byte1;
                if ("custom".equals(s.toLowerCase()))
                {
                    return 0;
                }
            }
        }
        return byte0;
    }

    private String getPhoneType(int i)
    {
        switch (i)
        {
        case 7: // '\007'
        case 12: // '\f'
        default:
            return "other";

        case 0: // '\0'
            return "custom";

        case 5: // '\005'
            return "home fax";

        case 4: // '\004'
            return "work fax";

        case 1: // '\001'
            return "home";

        case 2: // '\002'
            return "mobile";

        case 6: // '\006'
            return "pager";

        case 3: // '\003'
            return "work";

        case 8: // '\b'
            return "callback";

        case 9: // '\t'
            return "car";

        case 10: // '\n'
            return "company main";

        case 13: // '\r'
            return "other fax";

        case 14: // '\016'
            return "radio";

        case 15: // '\017'
            return "telex";

        case 16: // '\020'
            return "tty tdd";

        case 17: // '\021'
            return "work mobile";

        case 18: // '\022'
            return "work pager";

        case 19: // '\023'
            return "assistant";

        case 20: // '\024'
            return "mms";

        case 11: // '\013'
            return "isdn";
        }
    }

    private byte[] getPhotoBytes(String s)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        long l;
        bytearrayoutputstream = new ByteArrayOutputStream();
        l = 0L;
        byte abyte0[];
        abyte0 = new byte[8192];
        s = getPathFromUri(s);
_L1:
        int i = s.read(abyte0, 0, abyte0.length);
        if (i == -1 || l > 0x100000L)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        bytearrayoutputstream.write(abyte0, 0, i);
        l += i;
          goto _L1
        try
        {
            s.close();
            bytearrayoutputstream.flush();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("ContactsAccessor", s.getMessage(), s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("ContactsAccessor", s.getMessage(), s);
        }
        return bytearrayoutputstream.toByteArray();
    }

    private JSONObject imQuery(Cursor cursor)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", cursor.getString(cursor.getColumnIndex("_id")));
            jsonobject.put("pref", false);
            jsonobject.put("value", cursor.getString(cursor.getColumnIndex("data1")));
            jsonobject.put("type", getImType((new Integer(cursor.getString(cursor.getColumnIndex("data5")))).intValue()));
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            Log.e("ContactsAccessor", cursor.getMessage(), cursor);
            return jsonobject;
        }
        return jsonobject;
    }

    private void insertAddress(ArrayList arraylist, JSONObject jsonobject)
    {
        arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/postal-address_v2").withValue("data2", Integer.valueOf(getAddressType(getJsonString(jsonobject, "type")))).withValue("data1", getJsonString(jsonobject, "formatted")).withValue("data4", getJsonString(jsonobject, "streetAddress")).withValue("data7", getJsonString(jsonobject, "locality")).withValue("data8", getJsonString(jsonobject, "region")).withValue("data9", getJsonString(jsonobject, "postalCode")).withValue("data10", getJsonString(jsonobject, "country")).build());
    }

    private void insertEmail(ArrayList arraylist, JSONObject jsonobject)
    {
        arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/email_v2").withValue("data1", getJsonString(jsonobject, "value")).withValue("data2", Integer.valueOf(getContactType(getJsonString(jsonobject, "type")))).build());
    }

    private void insertIm(ArrayList arraylist, JSONObject jsonobject)
    {
        arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/im").withValue("data1", getJsonString(jsonobject, "value")).withValue("data2", Integer.valueOf(getImType(getJsonString(jsonobject, "type")))).build());
    }

    private void insertOrganization(ArrayList arraylist, JSONObject jsonobject)
    {
        arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/organization").withValue("data2", Integer.valueOf(getOrgType(getJsonString(jsonobject, "type")))).withValue("data5", getJsonString(jsonobject, "department")).withValue("data1", getJsonString(jsonobject, "name")).withValue("data4", getJsonString(jsonobject, "title")).build());
    }

    private void insertPhone(ArrayList arraylist, JSONObject jsonobject)
    {
        arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", getJsonString(jsonobject, "value")).withValue("data2", Integer.valueOf(getPhoneType(getJsonString(jsonobject, "type")))).build());
    }

    private void insertPhoto(ArrayList arraylist, JSONObject jsonobject)
    {
        jsonobject = getPhotoBytes(getJsonString(jsonobject, "value"));
        arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("is_super_primary", Integer.valueOf(1)).withValue("mimetype", "vnd.android.cursor.item/photo").withValue("data15", jsonobject).build());
    }

    private void insertWebsite(ArrayList arraylist, JSONObject jsonobject)
    {
        arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/website").withValue("data1", getJsonString(jsonobject, "value")).withValue("data2", Integer.valueOf(getContactType(getJsonString(jsonobject, "type")))).build());
    }

    private boolean isWildCardSearch(JSONArray jsonarray)
    {
        if (jsonarray.length() == 1)
        {
            boolean flag;
            try
            {
                flag = "*".equals(jsonarray.getString(0));
            }
            // Misplaced declaration of an exception variable
            catch (JSONArray jsonarray)
            {
                return false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    private String modifyContact(String s, JSONObject jsonobject, String s1, String s2)
    {
        ArrayList arraylist;
        int j;
        j = (new Integer(getJsonString(jsonobject, "rawId"))).intValue();
        arraylist = new ArrayList();
        arraylist.add(ContentProviderOperation.newUpdate(android.provider.ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", s1).withValue("account_name", s2).build());
        String s3;
        s3 = getJsonString(jsonobject, "displayName");
        s2 = jsonobject.getJSONObject("name");
        if (s3 == null && s2 == null)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        s1 = ContentProviderOperation.newUpdate(android.provider.ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype=?", new String[] {
            s, "vnd.android.cursor.item/name"
        });
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        s1.withValue("data1", s3);
        s3 = getJsonString(s2, "familyName");
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        s1.withValue("data3", s3);
        s3 = getJsonString(s2, "middleName");
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        s1.withValue("data5", s3);
        s3 = getJsonString(s2, "givenName");
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        s1.withValue("data2", s3);
        s3 = getJsonString(s2, "honorificPrefix");
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        s1.withValue("data4", s3);
        s2 = getJsonString(s2, "honorificSuffix");
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_252;
        }
        s1.withValue("data6", s2);
        arraylist.add(s1.build());
_L29:
        s1 = jsonobject.getJSONArray("phoneNumbers");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (s1.length() != 0) goto _L4; else goto _L3
_L3:
        arraylist.add(ContentProviderOperation.newDelete(android.provider.ContactsContract.Data.CONTENT_URI).withSelection("raw_contact_id=? AND mimetype=?", new String[] {
            (new StringBuilder()).append("").append(j).toString(), "vnd.android.cursor.item/phone_v2"
        }).build());
_L2:
        s1 = jsonobject.getJSONArray("emails");
        if (s1 == null) goto _L6; else goto _L5
_L5:
        if (s1.length() != 0) goto _L8; else goto _L7
_L7:
        arraylist.add(ContentProviderOperation.newDelete(android.provider.ContactsContract.Data.CONTENT_URI).withSelection("raw_contact_id=? AND mimetype=?", new String[] {
            (new StringBuilder()).append("").append(j).toString(), "vnd.android.cursor.item/email_v2"
        }).build());
_L6:
        s1 = jsonobject.getJSONArray("addresses");
        if (s1 == null) goto _L10; else goto _L9
_L9:
        if (s1.length() != 0) goto _L12; else goto _L11
_L11:
        arraylist.add(ContentProviderOperation.newDelete(android.provider.ContactsContract.Data.CONTENT_URI).withSelection("raw_contact_id=? AND mimetype=?", new String[] {
            (new StringBuilder()).append("").append(j).toString(), "vnd.android.cursor.item/postal-address_v2"
        }).build());
_L10:
        s1 = jsonobject.getJSONArray("organizations");
        if (s1 == null) goto _L14; else goto _L13
_L13:
        if (s1.length() != 0) goto _L16; else goto _L15
_L15:
        arraylist.add(ContentProviderOperation.newDelete(android.provider.ContactsContract.Data.CONTENT_URI).withSelection("raw_contact_id=? AND mimetype=?", new String[] {
            (new StringBuilder()).append("").append(j).toString(), "vnd.android.cursor.item/organization"
        }).build());
_L14:
        s1 = jsonobject.getJSONArray("ims");
        if (s1 == null) goto _L18; else goto _L17
_L17:
        if (s1.length() != 0) goto _L20; else goto _L19
_L19:
        arraylist.add(ContentProviderOperation.newDelete(android.provider.ContactsContract.Data.CONTENT_URI).withSelection("raw_contact_id=? AND mimetype=?", new String[] {
            (new StringBuilder()).append("").append(j).toString(), "vnd.android.cursor.item/im"
        }).build());
_L18:
        s1 = getJsonString(jsonobject, "note");
        arraylist.add(ContentProviderOperation.newUpdate(android.provider.ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype=?", new String[] {
            s, "vnd.android.cursor.item/note"
        }).withValue("data1", s1).build());
        s1 = getJsonString(jsonobject, "nickname");
        if (s1 != null)
        {
            arraylist.add(ContentProviderOperation.newUpdate(android.provider.ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype=?", new String[] {
                s, "vnd.android.cursor.item/nickname"
            }).withValue("data1", s1).build());
        }
        s1 = jsonobject.getJSONArray("urls");
        if (s1 == null) goto _L22; else goto _L21
_L21:
        if (s1.length() != 0) goto _L24; else goto _L23
_L23:
        Log.d("ContactsAccessor", "This means we should be deleting all the phone numbers.");
        arraylist.add(ContentProviderOperation.newDelete(android.provider.ContactsContract.Data.CONTENT_URI).withSelection("raw_contact_id=? AND mimetype=?", new String[] {
            (new StringBuilder()).append("").append(j).toString(), "vnd.android.cursor.item/website"
        }).build());
_L22:
        s1 = getJsonString(jsonobject, "birthday");
        if (s1 != null)
        {
            arraylist.add(ContentProviderOperation.newUpdate(android.provider.ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype=? AND data2=?", new String[] {
                s, "vnd.android.cursor.item/contact_event", new String("3")
            }).withValue("data2", Integer.valueOf(3)).withValue("data1", s1).build());
        }
        jsonobject = jsonobject.getJSONArray("photos");
        if (jsonobject == null) goto _L26; else goto _L25
_L25:
        if (jsonobject.length() != 0) goto _L28; else goto _L27
_L27:
        arraylist.add(ContentProviderOperation.newDelete(android.provider.ContactsContract.Data.CONTENT_URI).withSelection("raw_contact_id=? AND mimetype=?", new String[] {
            (new StringBuilder()).append("").append(j).toString(), "vnd.android.cursor.item/photo"
        }).build());
_L26:
        int i;
        i = 1;
        Object obj;
        try
        {
            mApp.getActivity().getContentResolver().applyBatch("com.android.contacts", arraylist);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("ContactsAccessor", jsonobject.getMessage(), jsonobject);
            Log.e("ContactsAccessor", Log.getStackTraceString(jsonobject), jsonobject);
            i = 0;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("ContactsAccessor", jsonobject.getMessage(), jsonobject);
            Log.e("ContactsAccessor", Log.getStackTraceString(jsonobject), jsonobject);
            i = 0;
        }
        if (i != 0)
        {
            return s;
        } else
        {
            return null;
        }
        s1;
        Log.d("ContactsAccessor", "Could not get name");
          goto _L29
_L4:
        i = 0;
_L55:
        if (i >= s1.length()) goto _L2; else goto _L30
_L30:
        s2 = (JSONObject)s1.get(i);
        obj = getJsonString(s2, "id");
        if (obj != null) goto _L32; else goto _L31
_L31:
        obj = new ContentValues();
        ((ContentValues) (obj)).put("raw_contact_id", Integer.valueOf(j));
        ((ContentValues) (obj)).put("mimetype", "vnd.android.cursor.item/phone_v2");
        ((ContentValues) (obj)).put("data1", getJsonString(s2, "value"));
        ((ContentValues) (obj)).put("data2", Integer.valueOf(getPhoneType(getJsonString(s2, "type"))));
        arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValues(((ContentValues) (obj))).build());
          goto _L33
_L32:
        arraylist.add(ContentProviderOperation.newUpdate(android.provider.ContactsContract.Data.CONTENT_URI).withSelection("_id=? AND mimetype=?", new String[] {
            obj, "vnd.android.cursor.item/phone_v2"
        }).withValue("data1", getJsonString(s2, "value")).withValue("data2", Integer.valueOf(getPhoneType(getJsonString(s2, "type")))).build());
          goto _L33
        s1;
        Log.d("ContactsAccessor", "Could not get phone numbers");
          goto _L2
_L8:
        i = 0;
_L56:
        if (i >= s1.length()) goto _L6; else goto _L34
_L34:
        s2 = (JSONObject)s1.get(i);
        obj = getJsonString(s2, "id");
        if (obj != null) goto _L36; else goto _L35
_L35:
        obj = new ContentValues();
        ((ContentValues) (obj)).put("raw_contact_id", Integer.valueOf(j));
        ((ContentValues) (obj)).put("mimetype", "vnd.android.cursor.item/email_v2");
        ((ContentValues) (obj)).put("data1", getJsonString(s2, "value"));
        ((ContentValues) (obj)).put("data2", Integer.valueOf(getContactType(getJsonString(s2, "type"))));
        arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValues(((ContentValues) (obj))).build());
          goto _L37
_L36:
        arraylist.add(ContentProviderOperation.newUpdate(android.provider.ContactsContract.Data.CONTENT_URI).withSelection("_id=? AND mimetype=?", new String[] {
            obj, "vnd.android.cursor.item/email_v2"
        }).withValue("data1", getJsonString(s2, "value")).withValue("data2", Integer.valueOf(getContactType(getJsonString(s2, "type")))).build());
          goto _L37
        s1;
        Log.d("ContactsAccessor", "Could not get emails");
          goto _L6
_L12:
        i = 0;
_L57:
        if (i >= s1.length()) goto _L10; else goto _L38
_L38:
        s2 = (JSONObject)s1.get(i);
        obj = getJsonString(s2, "id");
        if (obj != null) goto _L40; else goto _L39
_L39:
        obj = new ContentValues();
        ((ContentValues) (obj)).put("raw_contact_id", Integer.valueOf(j));
        ((ContentValues) (obj)).put("mimetype", "vnd.android.cursor.item/postal-address_v2");
        ((ContentValues) (obj)).put("data2", Integer.valueOf(getAddressType(getJsonString(s2, "type"))));
        ((ContentValues) (obj)).put("data1", getJsonString(s2, "formatted"));
        ((ContentValues) (obj)).put("data4", getJsonString(s2, "streetAddress"));
        ((ContentValues) (obj)).put("data7", getJsonString(s2, "locality"));
        ((ContentValues) (obj)).put("data8", getJsonString(s2, "region"));
        ((ContentValues) (obj)).put("data9", getJsonString(s2, "postalCode"));
        ((ContentValues) (obj)).put("data10", getJsonString(s2, "country"));
        arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValues(((ContentValues) (obj))).build());
          goto _L41
_L40:
        arraylist.add(ContentProviderOperation.newUpdate(android.provider.ContactsContract.Data.CONTENT_URI).withSelection("_id=? AND mimetype=?", new String[] {
            obj, "vnd.android.cursor.item/postal-address_v2"
        }).withValue("data2", Integer.valueOf(getAddressType(getJsonString(s2, "type")))).withValue("data1", getJsonString(s2, "formatted")).withValue("data4", getJsonString(s2, "streetAddress")).withValue("data7", getJsonString(s2, "locality")).withValue("data8", getJsonString(s2, "region")).withValue("data9", getJsonString(s2, "postalCode")).withValue("data10", getJsonString(s2, "country")).build());
          goto _L41
        s1;
        Log.d("ContactsAccessor", "Could not get addresses");
          goto _L10
_L16:
        i = 0;
_L58:
        if (i >= s1.length()) goto _L14; else goto _L42
_L42:
        s2 = (JSONObject)s1.get(i);
        obj = getJsonString(s2, "id");
        if (obj != null) goto _L44; else goto _L43
_L43:
        obj = new ContentValues();
        ((ContentValues) (obj)).put("raw_contact_id", Integer.valueOf(j));
        ((ContentValues) (obj)).put("mimetype", "vnd.android.cursor.item/organization");
        ((ContentValues) (obj)).put("data2", Integer.valueOf(getOrgType(getJsonString(s2, "type"))));
        ((ContentValues) (obj)).put("data5", getJsonString(s2, "department"));
        ((ContentValues) (obj)).put("data1", getJsonString(s2, "name"));
        ((ContentValues) (obj)).put("data4", getJsonString(s2, "title"));
        arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValues(((ContentValues) (obj))).build());
          goto _L45
_L44:
        arraylist.add(ContentProviderOperation.newUpdate(android.provider.ContactsContract.Data.CONTENT_URI).withSelection("_id=? AND mimetype=?", new String[] {
            obj, "vnd.android.cursor.item/organization"
        }).withValue("data2", Integer.valueOf(getOrgType(getJsonString(s2, "type")))).withValue("data5", getJsonString(s2, "department")).withValue("data1", getJsonString(s2, "name")).withValue("data4", getJsonString(s2, "title")).build());
          goto _L45
        s1;
        Log.d("ContactsAccessor", "Could not get organizations");
          goto _L14
_L20:
        i = 0;
_L59:
        if (i >= s1.length()) goto _L18; else goto _L46
_L46:
        s2 = (JSONObject)s1.get(i);
        obj = getJsonString(s2, "id");
        if (obj != null) goto _L48; else goto _L47
_L47:
        obj = new ContentValues();
        ((ContentValues) (obj)).put("raw_contact_id", Integer.valueOf(j));
        ((ContentValues) (obj)).put("mimetype", "vnd.android.cursor.item/im");
        ((ContentValues) (obj)).put("data1", getJsonString(s2, "value"));
        ((ContentValues) (obj)).put("data2", Integer.valueOf(getImType(getJsonString(s2, "type"))));
        arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValues(((ContentValues) (obj))).build());
          goto _L49
_L48:
        arraylist.add(ContentProviderOperation.newUpdate(android.provider.ContactsContract.Data.CONTENT_URI).withSelection("_id=? AND mimetype=?", new String[] {
            obj, "vnd.android.cursor.item/im"
        }).withValue("data1", getJsonString(s2, "value")).withValue("data2", Integer.valueOf(getContactType(getJsonString(s2, "type")))).build());
          goto _L49
        s1;
        Log.d("ContactsAccessor", "Could not get emails");
          goto _L18
_L24:
        i = 0;
_L60:
        if (i >= s1.length()) goto _L22; else goto _L50
_L50:
        s2 = (JSONObject)s1.get(i);
        obj = getJsonString(s2, "id");
        if (obj != null) goto _L52; else goto _L51
_L51:
        obj = new ContentValues();
        ((ContentValues) (obj)).put("raw_contact_id", Integer.valueOf(j));
        ((ContentValues) (obj)).put("mimetype", "vnd.android.cursor.item/website");
        ((ContentValues) (obj)).put("data1", getJsonString(s2, "value"));
        ((ContentValues) (obj)).put("data2", Integer.valueOf(getContactType(getJsonString(s2, "type"))));
        arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValues(((ContentValues) (obj))).build());
          goto _L53
_L52:
        arraylist.add(ContentProviderOperation.newUpdate(android.provider.ContactsContract.Data.CONTENT_URI).withSelection("_id=? AND mimetype=?", new String[] {
            obj, "vnd.android.cursor.item/website"
        }).withValue("data1", getJsonString(s2, "value")).withValue("data2", Integer.valueOf(getContactType(getJsonString(s2, "type")))).build());
          goto _L53
        s1;
        Log.d("ContactsAccessor", "Could not get websites");
          goto _L22
_L28:
        i = 0;
_L61:
        if (i >= jsonobject.length()) goto _L26; else goto _L54
_L54:
        s2 = (JSONObject)jsonobject.get(i);
        s1 = getJsonString(s2, "id");
        s2 = getPhotoBytes(getJsonString(s2, "value"));
label0:
        {
            if (s1 != null)
            {
                break label0;
            }
            try
            {
                s1 = new ContentValues();
                s1.put("raw_contact_id", Integer.valueOf(j));
                s1.put("mimetype", "vnd.android.cursor.item/photo");
                s1.put("is_super_primary", Integer.valueOf(1));
                s1.put("data15", s2);
                arraylist.add(ContentProviderOperation.newInsert(android.provider.ContactsContract.Data.CONTENT_URI).withValues(s1).build());
                break MISSING_BLOCK_LABEL_2810;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                Log.d("ContactsAccessor", "Could not get photos");
            }
        }
          goto _L26
        arraylist.add(ContentProviderOperation.newUpdate(android.provider.ContactsContract.Data.CONTENT_URI).withSelection("_id=? AND mimetype=?", new String[] {
            s1, "vnd.android.cursor.item/photo"
        }).withValue("is_super_primary", Integer.valueOf(1)).withValue("data15", s2).build());
        break MISSING_BLOCK_LABEL_2810;
_L33:
        i++;
          goto _L55
_L37:
        i++;
          goto _L56
_L41:
        i++;
          goto _L57
_L45:
        i++;
          goto _L58
_L49:
        i++;
          goto _L59
_L53:
        i++;
          goto _L60
        i++;
          goto _L61
    }

    private JSONObject nameQuery(Cursor cursor)
    {
        JSONObject jsonobject = new JSONObject();
        String s;
        String s1;
        String s2;
        String s3;
        StringBuffer stringbuffer;
        try
        {
            s = cursor.getString(cursor.getColumnIndex("data3"));
            s1 = cursor.getString(cursor.getColumnIndex("data2"));
            s2 = cursor.getString(cursor.getColumnIndex("data5"));
            s3 = cursor.getString(cursor.getColumnIndex("data4"));
            cursor = cursor.getString(cursor.getColumnIndex("data6"));
            stringbuffer = new StringBuffer("");
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            Log.e("ContactsAccessor", cursor.getMessage(), cursor);
            return jsonobject;
        }
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        stringbuffer.append((new StringBuilder()).append(s3).append(" ").toString());
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        stringbuffer.append((new StringBuilder()).append(s1).append(" ").toString());
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        stringbuffer.append((new StringBuilder()).append(s2).append(" ").toString());
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        stringbuffer.append(s);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        stringbuffer.append((new StringBuilder()).append(" ").append(cursor).toString());
        jsonobject.put("familyName", s);
        jsonobject.put("givenName", s1);
        jsonobject.put("middleName", s2);
        jsonobject.put("honorificPrefix", s3);
        jsonobject.put("honorificSuffix", cursor);
        jsonobject.put("formatted", stringbuffer);
        return jsonobject;
    }

    private JSONObject organizationQuery(Cursor cursor)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", cursor.getString(cursor.getColumnIndex("_id")));
            jsonobject.put("pref", false);
            jsonobject.put("type", getOrgType(cursor.getInt(cursor.getColumnIndex("data2"))));
            jsonobject.put("department", cursor.getString(cursor.getColumnIndex("data5")));
            jsonobject.put("name", cursor.getString(cursor.getColumnIndex("data1")));
            jsonobject.put("title", cursor.getString(cursor.getColumnIndex("data4")));
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            Log.e("ContactsAccessor", cursor.getMessage(), cursor);
            return jsonobject;
        }
        return jsonobject;
    }

    private JSONObject phoneQuery(Cursor cursor)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", cursor.getString(cursor.getColumnIndex("_id")));
            jsonobject.put("pref", false);
            jsonobject.put("value", cursor.getString(cursor.getColumnIndex("data1")));
            jsonobject.put("type", getPhoneType(cursor.getInt(cursor.getColumnIndex("data2"))));
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            Log.e("ContactsAccessor", cursor.getMessage(), cursor);
            return jsonobject;
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            Log.e("ContactsAccessor", cursor.getMessage(), cursor);
            return jsonobject;
        }
        return jsonobject;
    }

    private JSONObject photoQuery(Cursor cursor, String s)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", cursor.getString(cursor.getColumnIndex("_id")));
            jsonobject.put("pref", false);
            jsonobject.put("type", "url");
            jsonobject.put("value", Uri.withAppendedPath(ContentUris.withAppendedId(android.provider.ContactsContract.Contacts.CONTENT_URI, (new Long(s)).longValue()), "photo").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            Log.e("ContactsAccessor", cursor.getMessage(), cursor);
            return jsonobject;
        }
        return jsonobject;
    }

    private JSONObject populateContact(JSONObject jsonobject, JSONArray jsonarray, JSONArray jsonarray1, JSONArray jsonarray2, JSONArray jsonarray3, JSONArray jsonarray4, JSONArray jsonarray5, 
            JSONArray jsonarray6)
    {
        try
        {
            if (jsonarray.length() > 0)
            {
                jsonobject.put("organizations", jsonarray);
            }
            if (jsonarray1.length() > 0)
            {
                jsonobject.put("addresses", jsonarray1);
            }
            if (jsonarray2.length() > 0)
            {
                jsonobject.put("phoneNumbers", jsonarray2);
            }
            if (jsonarray3.length() > 0)
            {
                jsonobject.put("emails", jsonarray3);
            }
            if (jsonarray4.length() > 0)
            {
                jsonobject.put("ims", jsonarray4);
            }
            if (jsonarray5.length() > 0)
            {
                jsonobject.put("urls", jsonarray5);
            }
            if (jsonarray6.length() > 0)
            {
                jsonobject.put("photos", jsonarray6);
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            Log.e("ContactsAccessor", jsonarray.getMessage(), jsonarray);
            return jsonobject;
        }
        return jsonobject;
    }

    private JSONArray populateContactArray(int i, HashMap hashmap, Cursor cursor)
    {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj12;
        String s1;
        JSONArray jsonarray;
        boolean flag;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        s1 = "";
        obj = "";
        flag = true;
        jsonarray = new JSONArray();
        obj12 = new JSONObject();
        obj2 = new JSONArray();
        obj8 = new JSONArray();
        obj4 = new JSONArray();
        obj5 = new JSONArray();
        obj7 = new JSONArray();
        obj6 = new JSONArray();
        obj3 = new JSONArray();
        j = cursor.getColumnIndex("contact_id");
        k = cursor.getColumnIndex("raw_contact_id");
        l = cursor.getColumnIndex("mimetype");
        i1 = cursor.getColumnIndex("data1");
        j1 = cursor.getColumnIndex("data1");
        k1 = cursor.getColumnIndex("data1");
        l1 = cursor.getColumnIndex("data1");
        i2 = cursor.getColumnIndex("data2");
        if (cursor.getCount() <= 0) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToNext() || jsonarray.length() > i - 1) goto _L4; else goto _L3
_L3:
        Object obj16;
        Object obj17;
        Object obj18;
        Object obj19;
        Object obj20;
        Object obj21;
        Object obj22;
        Object obj23;
        String s2;
        boolean flag1;
        obj16 = obj12;
        obj17 = obj2;
        obj18 = obj8;
        obj19 = obj4;
        obj20 = obj5;
        obj21 = obj7;
        obj22 = obj6;
        obj23 = obj3;
        s2 = s1;
        flag1 = flag;
        String s = cursor.getString(j);
        obj16 = obj12;
        obj17 = obj2;
        obj18 = obj8;
        obj19 = obj4;
        obj20 = obj5;
        obj21 = obj7;
        obj22 = obj6;
        obj23 = obj3;
        s2 = s;
        flag1 = flag;
        Object obj24 = cursor.getString(k);
        s1 = ((String) (obj));
        obj16 = obj12;
        obj17 = obj2;
        obj18 = obj8;
        obj19 = obj4;
        obj20 = obj5;
        obj21 = obj7;
        obj22 = obj6;
        obj23 = obj3;
        s2 = s;
        flag1 = flag;
        Object obj1;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj13;
        Object obj14;
        Object obj15;
        boolean flag2;
        if (cursor.getPosition() == 0)
        {
            s1 = s;
        }
        obj15 = obj12;
        obj14 = obj2;
        obj13 = obj8;
        obj11 = obj4;
        obj10 = obj5;
        obj9 = obj7;
        obj1 = obj6;
        obj = obj3;
        flag2 = flag;
        obj16 = obj12;
        obj17 = obj2;
        obj18 = obj8;
        obj19 = obj4;
        obj20 = obj5;
        obj21 = obj7;
        obj22 = obj6;
        obj23 = obj3;
        s2 = s;
        flag1 = flag;
        if (s1.equals(s))
        {
            break MISSING_BLOCK_LABEL_669;
        }
        obj16 = obj12;
        obj17 = obj2;
        obj18 = obj8;
        obj19 = obj4;
        obj20 = obj5;
        obj21 = obj7;
        obj22 = obj6;
        obj23 = obj3;
        s2 = s;
        flag1 = flag;
        jsonarray.put(populateContact(((JSONObject) (obj12)), ((JSONArray) (obj2)), ((JSONArray) (obj8)), ((JSONArray) (obj4)), ((JSONArray) (obj5)), ((JSONArray) (obj7)), ((JSONArray) (obj6)), ((JSONArray) (obj3))));
        obj16 = obj12;
        obj17 = obj2;
        obj18 = obj8;
        obj19 = obj4;
        obj20 = obj5;
        obj21 = obj7;
        obj22 = obj6;
        obj23 = obj3;
        s2 = s;
        flag1 = flag;
        obj = new JSONObject();
        try
        {
            obj1 = new JSONArray();
        }
        catch (JSONException jsonexception)
        {
            obj1 = obj2;
            obj2 = obj8;
            obj23 = obj3;
            obj3 = jsonexception;
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj2 = new JSONArray();
        }
        catch (JSONException jsonexception1)
        {
            obj2 = obj8;
            obj23 = obj3;
            obj3 = jsonexception1;
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj8 = new JSONArray();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj8)
        {
            obj23 = obj3;
            obj3 = obj8;
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj4 = new JSONArray();
        }
        catch (JSONException jsonexception2)
        {
            obj4 = obj8;
            obj23 = obj3;
            obj3 = jsonexception2;
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj5 = new JSONArray();
        }
        catch (JSONException jsonexception3)
        {
            obj5 = obj4;
            obj4 = obj8;
            obj23 = obj3;
            obj3 = jsonexception3;
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj7 = new JSONArray();
        }
        catch (JSONException jsonexception4)
        {
            obj7 = obj5;
            obj5 = obj4;
            obj4 = obj8;
            obj23 = obj3;
            obj3 = jsonexception4;
            continue; /* Loop/switch isn't completed */
        }
        obj6 = new JSONArray();
        flag2 = true;
        obj3 = obj6;
        obj6 = obj7;
        obj14 = obj1;
        obj15 = obj;
        obj = obj3;
        obj1 = obj6;
        obj9 = obj5;
        obj10 = obj4;
        obj11 = obj8;
        obj13 = obj2;
        flag = flag2;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_785;
        }
        flag2 = false;
        flag = false;
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag2;
        ((JSONObject) (obj15)).put("id", s);
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag2;
        ((JSONObject) (obj15)).put("rawId", obj24);
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        obj2 = cursor.getString(l);
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!((String) (obj2)).equals("vnd.android.cursor.item/name"))
        {
            break MISSING_BLOCK_LABEL_942;
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        ((JSONObject) (obj15)).put("displayName", cursor.getString(i1));
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!((String) (obj2)).equals("vnd.android.cursor.item/name")) goto _L6; else goto _L5
_L5:
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!isRequired("name", hashmap)) goto _L6; else goto _L7
_L7:
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        ((JSONObject) (obj15)).put("name", nameQuery(cursor));
        obj12 = obj15;
        obj3 = obj14;
        obj8 = obj13;
        obj4 = obj11;
        obj5 = obj10;
        obj7 = obj9;
        obj6 = obj1;
        obj24 = obj;
        s1 = s;
        flag2 = flag;
          goto _L8
_L6:
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!((String) (obj2)).equals("vnd.android.cursor.item/phone_v2")) goto _L10; else goto _L9
_L9:
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!isRequired("phoneNumbers", hashmap)) goto _L10; else goto _L11
_L11:
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        ((JSONArray) (obj11)).put(phoneQuery(cursor));
        obj12 = obj15;
        obj3 = obj14;
        obj8 = obj13;
        obj4 = obj11;
        obj5 = obj10;
        obj7 = obj9;
        obj6 = obj1;
        obj24 = obj;
        s1 = s;
        flag2 = flag;
          goto _L8
        obj3;
        flag = flag1;
        s = s2;
        obj6 = obj22;
        obj7 = obj21;
        obj5 = obj20;
        obj4 = obj19;
        obj2 = obj18;
        obj1 = obj17;
        obj = obj16;
_L12:
        Log.e("ContactsAccessor", ((JSONException) (obj3)).getMessage(), ((Throwable) (obj3)));
        obj12 = obj;
        obj3 = obj1;
        obj8 = obj2;
        obj24 = obj23;
        s1 = s;
        flag2 = flag;
        break; /* Loop/switch isn't completed */
_L10:
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!((String) (obj2)).equals("vnd.android.cursor.item/email_v2"))
        {
            break MISSING_BLOCK_LABEL_1607;
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!isRequired("emails", hashmap))
        {
            break MISSING_BLOCK_LABEL_1607;
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        ((JSONArray) (obj10)).put(emailQuery(cursor));
        obj12 = obj15;
        obj3 = obj14;
        obj8 = obj13;
        obj4 = obj11;
        obj5 = obj10;
        obj7 = obj9;
        obj6 = obj1;
        obj24 = obj;
        s1 = s;
        flag2 = flag;
        break; /* Loop/switch isn't completed */
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!((String) (obj2)).equals("vnd.android.cursor.item/postal-address_v2"))
        {
            break MISSING_BLOCK_LABEL_1802;
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!isRequired("addresses", hashmap))
        {
            break MISSING_BLOCK_LABEL_1802;
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        ((JSONArray) (obj13)).put(addressQuery(cursor));
        obj12 = obj15;
        obj3 = obj14;
        obj8 = obj13;
        obj4 = obj11;
        obj5 = obj10;
        obj7 = obj9;
        obj6 = obj1;
        obj24 = obj;
        s1 = s;
        flag2 = flag;
        break; /* Loop/switch isn't completed */
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!((String) (obj2)).equals("vnd.android.cursor.item/organization"))
        {
            break MISSING_BLOCK_LABEL_1997;
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!isRequired("organizations", hashmap))
        {
            break MISSING_BLOCK_LABEL_1997;
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        ((JSONArray) (obj14)).put(organizationQuery(cursor));
        obj12 = obj15;
        obj3 = obj14;
        obj8 = obj13;
        obj4 = obj11;
        obj5 = obj10;
        obj7 = obj9;
        obj6 = obj1;
        obj24 = obj;
        s1 = s;
        flag2 = flag;
        break; /* Loop/switch isn't completed */
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!((String) (obj2)).equals("vnd.android.cursor.item/im"))
        {
            break MISSING_BLOCK_LABEL_2192;
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!isRequired("ims", hashmap))
        {
            break MISSING_BLOCK_LABEL_2192;
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        ((JSONArray) (obj9)).put(imQuery(cursor));
        obj12 = obj15;
        obj3 = obj14;
        obj8 = obj13;
        obj4 = obj11;
        obj5 = obj10;
        obj7 = obj9;
        obj6 = obj1;
        obj24 = obj;
        s1 = s;
        flag2 = flag;
        break; /* Loop/switch isn't completed */
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!((String) (obj2)).equals("vnd.android.cursor.item/note"))
        {
            break MISSING_BLOCK_LABEL_2392;
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!isRequired("note", hashmap))
        {
            break MISSING_BLOCK_LABEL_2392;
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        ((JSONObject) (obj15)).put("note", cursor.getString(j1));
        obj12 = obj15;
        obj3 = obj14;
        obj8 = obj13;
        obj4 = obj11;
        obj5 = obj10;
        obj7 = obj9;
        obj6 = obj1;
        obj24 = obj;
        s1 = s;
        flag2 = flag;
        break; /* Loop/switch isn't completed */
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!((String) (obj2)).equals("vnd.android.cursor.item/nickname"))
        {
            break MISSING_BLOCK_LABEL_2592;
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!isRequired("nickname", hashmap))
        {
            break MISSING_BLOCK_LABEL_2592;
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        ((JSONObject) (obj15)).put("nickname", cursor.getString(k1));
        obj12 = obj15;
        obj3 = obj14;
        obj8 = obj13;
        obj4 = obj11;
        obj5 = obj10;
        obj7 = obj9;
        obj6 = obj1;
        obj24 = obj;
        s1 = s;
        flag2 = flag;
        break; /* Loop/switch isn't completed */
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!((String) (obj2)).equals("vnd.android.cursor.item/website"))
        {
            break MISSING_BLOCK_LABEL_2787;
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!isRequired("urls", hashmap))
        {
            break MISSING_BLOCK_LABEL_2787;
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        ((JSONArray) (obj1)).put(websiteQuery(cursor));
        obj12 = obj15;
        obj3 = obj14;
        obj8 = obj13;
        obj4 = obj11;
        obj5 = obj10;
        obj7 = obj9;
        obj6 = obj1;
        obj24 = obj;
        s1 = s;
        flag2 = flag;
        break; /* Loop/switch isn't completed */
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        if (!((String) (obj2)).equals("vnd.android.cursor.item/contact_event"))
        {
            break MISSING_BLOCK_LABEL_3118;
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        obj12 = obj15;
        obj3 = obj14;
        obj8 = obj13;
        obj4 = obj11;
        obj5 = obj10;
        obj7 = obj9;
        obj6 = obj1;
        obj24 = obj;
        s1 = s;
        flag2 = flag;
        if (!isRequired("birthday", hashmap))
        {
            break; /* Loop/switch isn't completed */
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        obj12 = obj15;
        obj3 = obj14;
        obj8 = obj13;
        obj4 = obj11;
        obj5 = obj10;
        obj7 = obj9;
        obj6 = obj1;
        obj24 = obj;
        s1 = s;
        flag2 = flag;
        if (3 != cursor.getInt(i2))
        {
            break; /* Loop/switch isn't completed */
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        ((JSONObject) (obj15)).put("birthday", cursor.getString(l1));
        obj12 = obj15;
        obj3 = obj14;
        obj8 = obj13;
        obj4 = obj11;
        obj5 = obj10;
        obj7 = obj9;
        obj6 = obj1;
        obj24 = obj;
        s1 = s;
        flag2 = flag;
        break; /* Loop/switch isn't completed */
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        obj12 = obj15;
        obj3 = obj14;
        obj8 = obj13;
        obj4 = obj11;
        obj5 = obj10;
        obj7 = obj9;
        obj6 = obj1;
        obj24 = obj;
        s1 = s;
        flag2 = flag;
        if (!((String) (obj2)).equals("vnd.android.cursor.item/photo"))
        {
            break; /* Loop/switch isn't completed */
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        obj12 = obj15;
        obj3 = obj14;
        obj8 = obj13;
        obj4 = obj11;
        obj5 = obj10;
        obj7 = obj9;
        obj6 = obj1;
        obj24 = obj;
        s1 = s;
        flag2 = flag;
        if (!isRequired("photos", hashmap))
        {
            break; /* Loop/switch isn't completed */
        }
        obj16 = obj15;
        obj17 = obj14;
        obj18 = obj13;
        obj19 = obj11;
        obj20 = obj10;
        obj21 = obj9;
        obj22 = obj1;
        obj23 = obj;
        s2 = s;
        flag1 = flag;
        ((JSONArray) (obj)).put(photoQuery(cursor, s));
        obj12 = obj15;
        obj3 = obj14;
        obj8 = obj13;
        obj4 = obj11;
        obj5 = obj10;
        obj7 = obj9;
        obj6 = obj1;
        obj24 = obj;
        s1 = s;
        flag2 = flag;
        break; /* Loop/switch isn't completed */
_L4:
        if (jsonarray.length() < i)
        {
            jsonarray.put(populateContact(((JSONObject) (obj12)), ((JSONArray) (obj2)), ((JSONArray) (obj8)), ((JSONArray) (obj4)), ((JSONArray) (obj5)), ((JSONArray) (obj7)), ((JSONArray) (obj6)), ((JSONArray) (obj3))));
        }
_L2:
        cursor.close();
        return jsonarray;
        JSONException jsonexception5;
        jsonexception5;
        obj6 = obj7;
        obj7 = obj5;
        obj5 = obj4;
        obj4 = obj8;
        obj23 = obj3;
        obj3 = jsonexception5;
        if (true) goto _L12; else goto _L8
_L8:
        obj = s1;
        obj2 = obj3;
        obj3 = obj24;
        flag = flag2;
        if (true) goto _L1; else goto _L13
_L13:
    }

    private JSONObject websiteQuery(Cursor cursor)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", cursor.getString(cursor.getColumnIndex("_id")));
            jsonobject.put("pref", false);
            jsonobject.put("value", cursor.getString(cursor.getColumnIndex("data1")));
            jsonobject.put("type", getContactType(cursor.getInt(cursor.getColumnIndex("data2"))));
        }
        // Misplaced declaration of an exception variable
        catch (Cursor cursor)
        {
            Log.e("ContactsAccessor", cursor.getMessage(), cursor);
            return jsonobject;
        }
        return jsonobject;
    }

    public JSONObject getContactById(String s)
        throws JSONException
    {
        Object obj = null;
        s = mApp.getActivity().getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, null, "contact_id = ? ", new String[] {
            s
        }, "contact_id ASC");
        JSONArray jsonarray = new JSONArray();
        jsonarray.put("*");
        jsonarray = populateContactArray(1, buildPopulationSet(jsonarray), s);
        s = obj;
        if (jsonarray.length() == 1)
        {
            s = jsonarray.getJSONObject(0);
        }
        return s;
    }

    public boolean remove(String s)
    {
        int i = 0;
        s = mApp.getActivity().getContentResolver().query(android.provider.ContactsContract.Contacts.CONTENT_URI, null, "_id = ?", new String[] {
            s
        }, null);
        if (s.getCount() == 1)
        {
            s.moveToFirst();
            s = s.getString(s.getColumnIndex("lookup"));
            s = Uri.withAppendedPath(android.provider.ContactsContract.Contacts.CONTENT_LOOKUP_URI, s);
            i = mApp.getActivity().getContentResolver().delete(s, null, null);
        } else
        {
            Log.d("ContactsAccessor", "Could not find contact with ID");
        }
        return i > 0;
    }

    public String save(JSONObject jsonobject)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Account aaccount[];
        aaccount = AccountManager.get(mApp.getActivity()).getAccounts();
        obj2 = null;
        obj = null;
        obj3 = null;
        obj1 = null;
        if (aaccount.length != 1) goto _L2; else goto _L1
_L1:
        obj = aaccount[0].name;
        obj1 = aaccount[0].type;
_L4:
        obj2 = getJsonString(jsonobject, "id");
        int i;
        int j;
        if (obj2 == null)
        {
            return createNewContact(jsonobject, ((String) (obj1)), ((String) (obj)));
        } else
        {
            return modifyContact(((String) (obj2)), jsonobject, ((String) (obj1)), ((String) (obj)));
        }
_L2:
        if (aaccount.length <= 1) goto _L4; else goto _L3
_L3:
        j = aaccount.length;
        i = 0;
_L15:
        obj1 = obj2;
        obj = obj3;
        if (i >= j) goto _L6; else goto _L5
_L5:
        obj = aaccount[i];
        if (!((Account) (obj)).type.contains("eas") || !((Account) (obj)).name.matches(".+@.+\\.+.+")) goto _L8; else goto _L7
_L7:
        obj1 = ((Account) (obj)).name;
        obj = ((Account) (obj)).type;
_L6:
        obj3 = obj1;
        obj2 = obj;
        if (obj1 != null) goto _L10; else goto _L9
_L9:
        j = aaccount.length;
        i = 0;
_L16:
        obj3 = obj1;
        obj2 = obj;
        if (i >= j) goto _L10; else goto _L11
_L11:
        obj2 = aaccount[i];
        if (!((Account) (obj2)).type.contains("com.google") || !((Account) (obj2)).name.matches(".+@.+\\.+.+")) goto _L13; else goto _L12
_L12:
        obj3 = ((Account) (obj2)).name;
        obj2 = ((Account) (obj2)).type;
_L10:
        obj = obj3;
        obj1 = obj2;
        if (obj3 != null) goto _L4; else goto _L14
_L14:
        j = aaccount.length;
        i = 0;
_L17:
        obj = obj3;
        obj1 = obj2;
        if (i < j)
        {
            obj1 = aaccount[i];
            if (!((Account) (obj1)).name.matches(".+@.+\\.+.+"))
            {
                break MISSING_BLOCK_LABEL_301;
            }
            obj = ((Account) (obj1)).name;
            obj1 = ((Account) (obj1)).type;
        }
          goto _L4
_L8:
        i++;
          goto _L15
_L13:
        i++;
          goto _L16
        i++;
          goto _L17
    }

    public JSONArray search(JSONArray jsonarray, JSONObject jsonobject)
    {
        int i = 0x7fffffff;
        if (jsonobject == null) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = jsonobject.optString("filter");
        Uri uri;
        String s;
        ContactAccessor.WhereOptions whereoptions;
        String as[];
        int j;
        int k;
        boolean flag;
        if (((String) (obj)).length() == 0)
        {
            obj = "%";
        } else
        {
            obj = (new StringBuilder()).append("%").append(((String) (obj))).append("%").toString();
        }
        flag = jsonobject.getBoolean("multiple");
        jsonobject = ((JSONObject) (obj));
        if (!flag)
        {
            i = 1;
            jsonobject = ((JSONObject) (obj));
        }
        break MISSING_BLOCK_LABEL_48;
_L2:
        jsonobject = "%";
        continue; /* Loop/switch isn't completed */
_L4:
        obj = buildPopulationSet(jsonarray);
        whereoptions = buildWhereClause(jsonarray, jsonobject);
        jsonarray = mApp.getActivity().getContentResolver();
        uri = android.provider.ContactsContract.Data.CONTENT_URI;
        s = whereoptions.getWhere();
        as = whereoptions.getWhereArgs();
        jsonarray = jsonarray.query(uri, new String[] {
            "contact_id"
        }, s, as, "contact_id ASC");
        HashSet hashset = new HashSet();
        for (j = -1; jsonarray.moveToNext(); j = k)
        {
            k = j;
            if (j < 0)
            {
                k = jsonarray.getColumnIndex("contact_id");
            }
            hashset.add(jsonarray.getString(k));
        }

        jsonarray.close();
        jsonarray = buildIdClause(hashset, jsonobject);
        jsonobject = new HashSet();
        jsonobject.add("contact_id");
        jsonobject.add("raw_contact_id");
        jsonobject.add("mimetype");
        if (isRequired("displayName", ((HashMap) (obj))))
        {
            jsonobject.add("data1");
        }
        if (isRequired("name", ((HashMap) (obj))))
        {
            jsonobject.add("data3");
            jsonobject.add("data2");
            jsonobject.add("data5");
            jsonobject.add("data4");
            jsonobject.add("data6");
        }
        if (isRequired("phoneNumbers", ((HashMap) (obj))))
        {
            jsonobject.add("_id");
            jsonobject.add("data1");
            jsonobject.add("data2");
        }
        if (isRequired("emails", ((HashMap) (obj))))
        {
            jsonobject.add("_id");
            jsonobject.add("data1");
            jsonobject.add("data2");
        }
        if (isRequired("addresses", ((HashMap) (obj))))
        {
            jsonobject.add("_id");
            jsonobject.add("data2");
            jsonobject.add("data1");
            jsonobject.add("data4");
            jsonobject.add("data7");
            jsonobject.add("data8");
            jsonobject.add("data9");
            jsonobject.add("data10");
        }
        if (isRequired("organizations", ((HashMap) (obj))))
        {
            jsonobject.add("_id");
            jsonobject.add("data2");
            jsonobject.add("data5");
            jsonobject.add("data1");
            jsonobject.add("data4");
        }
        if (isRequired("ims", ((HashMap) (obj))))
        {
            jsonobject.add("_id");
            jsonobject.add("data1");
            jsonobject.add("data2");
        }
        if (isRequired("note", ((HashMap) (obj))))
        {
            jsonobject.add("data1");
        }
        if (isRequired("nickname", ((HashMap) (obj))))
        {
            jsonobject.add("data1");
        }
        if (isRequired("urls", ((HashMap) (obj))))
        {
            jsonobject.add("_id");
            jsonobject.add("data1");
            jsonobject.add("data2");
        }
        if (isRequired("birthday", ((HashMap) (obj))))
        {
            jsonobject.add("data1");
            jsonobject.add("data2");
        }
        if (isRequired("photos", ((HashMap) (obj))))
        {
            jsonobject.add("_id");
        }
        return populateContactArray(i, ((HashMap) (obj)), mApp.getActivity().getContentResolver().query(android.provider.ContactsContract.Data.CONTENT_URI, (String[])jsonobject.toArray(new String[0]), jsonarray.getWhere(), jsonarray.getWhereArgs(), "contact_id ASC"));
        jsonobject;
        jsonobject = ((JSONObject) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        dbMap = new HashMap();
        dbMap.put("id", "contact_id");
        dbMap.put("displayName", "display_name");
        dbMap.put("name", "data1");
        dbMap.put("name.formatted", "data1");
        dbMap.put("name.familyName", "data3");
        dbMap.put("name.givenName", "data2");
        dbMap.put("name.middleName", "data5");
        dbMap.put("name.honorificPrefix", "data4");
        dbMap.put("name.honorificSuffix", "data6");
        dbMap.put("nickname", "data1");
        dbMap.put("phoneNumbers", "data1");
        dbMap.put("phoneNumbers.value", "data1");
        dbMap.put("emails", "data1");
        dbMap.put("emails.value", "data1");
        dbMap.put("addresses", "data1");
        dbMap.put("addresses.formatted", "data1");
        dbMap.put("addresses.streetAddress", "data4");
        dbMap.put("addresses.locality", "data7");
        dbMap.put("addresses.region", "data8");
        dbMap.put("addresses.postalCode", "data9");
        dbMap.put("addresses.country", "data10");
        dbMap.put("ims", "data1");
        dbMap.put("ims.value", "data1");
        dbMap.put("organizations", "data1");
        dbMap.put("organizations.name", "data1");
        dbMap.put("organizations.department", "data5");
        dbMap.put("organizations.title", "data4");
        dbMap.put("birthday", "vnd.android.cursor.item/contact_event");
        dbMap.put("note", "data1");
        dbMap.put("photos.value", "vnd.android.cursor.item/photo");
        dbMap.put("urls", "data1");
        dbMap.put("urls.value", "data1");
    }
}
