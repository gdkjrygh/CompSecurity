// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.parse;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.tinder.enums.Gender;
import com.tinder.enums.UserPhotoSize;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.i;
import com.tinder.model.Badge;
import com.tinder.model.Match;
import com.tinder.model.Message;
import com.tinder.model.Person;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProfilePhoto;
import com.tinder.utils.DateUtils;
import com.tinder.utils.v;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.parse:
//            a, b

public final class e
{

    public static Match a(JsonReader jsonreader)
        throws IOException, ParseException
    {
        Object obj;
        String s;
        String s1;
        String s2;
        Person person;
        Object obj1;
        TreeSet treeset;
        DateFormat dateformat;
        boolean flag;
        boolean flag1;
        obj1 = null;
        dateformat = DateUtils.a();
        treeset = new TreeSet();
        ManagerApp.h().h();
        flag1 = i.l();
        jsonreader.beginObject();
        s = null;
        flag = false;
        person = null;
        s1 = null;
        s2 = null;
        obj = null;
_L17:
        String s3;
        byte byte0;
        if (!jsonreader.hasNext())
        {
            break MISSING_BLOCK_LABEL_455;
        }
        s3 = jsonreader.nextName();
        byte0 = -1;
        s3.hashCode();
        JVM INSTR lookupswitch 8: default 144
    //                   -1730523657: 312
    //                   -991716523: 279
    //                   -462094004: 263
    //                   3355: 215
    //                   94650: 199
    //                   492793077: 231
    //                   586987536: 295
    //                   2002664101: 247;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_312;
_L10:
        switch (byte0)
        {
        default:
            jsonreader.skipValue();
            break;

        case 0: // '\0'
            obj = jsonreader.nextString();
            break;

        case 1: // '\001'
            obj = jsonreader.nextString();
            break;

        case 2: // '\002'
            s2 = jsonreader.nextString();
            try
            {
                ManagerApp.h().h();
                i.b(dateformat.parse(s2));
            }
            catch (ParseException parseexception)
            {
                v.a("Failed to parse activity date for comparison", parseexception);
            }
            break;

        case 3: // '\003'
            s1 = jsonreader.nextString();
            break;

        case 4: // '\004'
            jsonreader.beginArray();
            for (; jsonreader.hasNext(); treeset.add(a(jsonreader, ((String) (obj)), flag1))) { }
            jsonreader.endArray();
            break;

        case 5: // '\005'
            person = a(jsonreader, dateformat);
            break;

        case 6: // '\006'
            flag = jsonreader.nextBoolean();
            break;

        case 7: // '\007'
            s = jsonreader.nextString();
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (s3.equals("_id"))
        {
            byte0 = 0;
        }
          goto _L10
_L5:
        if (s3.equals("id"))
        {
            byte0 = 1;
        }
          goto _L10
_L7:
        if (s3.equals("last_activity_date"))
        {
            byte0 = 2;
        }
          goto _L10
_L9:
        if (s3.equals("created_date"))
        {
            byte0 = 3;
        }
          goto _L10
_L4:
        if (s3.equals("messages"))
        {
            byte0 = 4;
        }
          goto _L10
_L3:
        if (s3.equals("person"))
        {
            byte0 = 5;
        }
          goto _L10
_L8:
        if (s3.equals("is_super_like"))
        {
            byte0 = 6;
        }
          goto _L10
        if (s3.equals("super_liker"))
        {
            byte0 = 7;
        }
          goto _L10
        if (obj != null) goto _L12; else goto _L11
_L11:
        jsonreader = obj1;
_L14:
        return jsonreader;
_L12:
        jsonreader.endObject();
        obj = new Match(person, ((String) (obj)), treeset, s2, s1, flag, s);
        ((Match) (obj)).setTouched(flag1);
        jsonreader = ((JsonReader) (obj));
        if (treeset.isEmpty()) goto _L14; else goto _L13
_L13:
        jsonreader = ((JsonReader) (obj));
        if (!((Message)treeset.last()).isFromMe()) goto _L14; else goto _L15
_L15:
        ((Match) (obj)).setTouched(true);
        return ((Match) (obj));
        if (true) goto _L17; else goto _L16
_L16:
    }

    public static Match a(JSONObject jsonobject, boolean flag)
        throws JSONException, ParseException
    {
        (new StringBuilder("jsonObjectMatch=")).append(jsonobject);
        Object obj1 = DateUtils.a();
        String s;
        Object obj;
        String s3;
        String s4;
        TreeSet treeset;
        String s5;
        if (jsonobject.has("_id"))
        {
            s = jsonobject.getString("_id");
        } else
        if (jsonobject.has("id"))
        {
            s = jsonobject.getString("id");
        } else
        {
            return null;
        }
        s3 = jsonobject.getString("last_activity_date");
        s4 = jsonobject.getString("created_date");
        s5 = jsonobject.optString("username", null);
        obj = jsonobject.getJSONArray("messages");
        treeset = new TreeSet();
        for (int j = 0; j < ((JSONArray) (obj)).length(); j++)
        {
            Object obj2 = ((JSONArray) (obj)).getJSONObject(j);
            String s1 = ((JSONObject) (obj2)).getString("message");
            String s2 = ((JSONObject) (obj2)).getString("from");
            obj2 = ((JSONObject) (obj2)).getString("created_date");
            treeset.add(new Message(s, ((String) (obj2)), s2, s1, flag, DateUtils.a(((String) (obj2)))));
        }

        obj = null;
        if (jsonobject.has("person"))
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("person");
            Gender gender = null;
            String s6 = jsonobject1.optString("birth_date");
            obj = gender;
            if (s6 != null)
            {
                obj = gender;
                if (!s6.isEmpty())
                {
                    obj = ((DateFormat) (obj1)).parse(s6);
                }
            }
            s6 = jsonobject1.getString("_id");
            String s7 = jsonobject1.getString("name");
            JSONArray jsonarray;
            ArrayList arraylist1;
            if (jsonobject1.optInt("gender", 0) == 0)
            {
                gender = Gender.MALE;
            } else
            {
                gender = Gender.FEMALE;
            }
            obj1 = jsonobject1.getJSONArray("photos");
            flag = jsonobject1.optBoolean("is_verified", false);
            jsonarray = jsonobject1.optJSONArray("badges");
            arraylist1 = new ArrayList(((JSONArray) (obj1)).length());
            for (int k = 0; k < ((JSONArray) (obj1)).length(); k++)
            {
                arraylist1.add(a(((JSONArray) (obj1)).getJSONObject(k), s6));
            }

            obj1 = null;
            if (jsonarray != null)
            {
                ArrayList arraylist = new ArrayList(jsonarray.length());
                int l = 0;
                do
                {
                    obj1 = arraylist;
                    if (l >= jsonarray.length())
                    {
                        break;
                    }
                    arraylist.add(com.tinder.parse.a.a(jsonarray.getJSONObject(l)));
                    l++;
                } while (true);
            }
            obj = new Person(s6, s7, arraylist1, gender, flag, ((List) (obj1)), s5, b.a(jsonobject), ((java.util.Date) (obj)));
        }
        return new Match(((Person) (obj)), s, treeset, s3, s4, jsonobject.optBoolean("is_super_like", false), jsonobject.optString("super_liker"));
    }

    private static Message a(JsonReader jsonreader, String s, boolean flag)
        throws IOException
    {
        String s1;
        String s2;
        String s3;
        s3 = null;
        jsonreader.beginObject();
        s2 = null;
        s1 = null;
_L7:
        String s4;
        byte byte0;
        if (!jsonreader.hasNext())
        {
            break MISSING_BLOCK_LABEL_178;
        }
        s4 = jsonreader.nextName();
        byte0 = -1;
        s4.hashCode();
        JVM INSTR lookupswitch 3: default 68
    //                   3151786: 119
    //                   484300789: 135
    //                   954925063: 103;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_135;
_L5:
        switch (byte0)
        {
        default:
            jsonreader.skipValue();
            break;

        case 0: // '\0'
            s1 = jsonreader.nextString();
            break;

        case 1: // '\001'
            s2 = jsonreader.nextString();
            break;

        case 2: // '\002'
            s3 = jsonreader.nextString();
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (s4.equals("message"))
        {
            byte0 = 0;
        }
          goto _L5
_L2:
        if (s4.equals("from"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s4.equals("sent_date"))
        {
            byte0 = 2;
        }
          goto _L5
        jsonreader.endObject();
        return new Message(s, s3, s2, s1, flag, DateUtils.a(s3));
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static Person a(JsonReader jsonreader, DateFormat dateformat)
        throws IOException, ParseException
    {
        Gender gender;
        java.util.Date date;
        String s;
        ArrayList arraylist;
        String s1;
        String s2;
        Object obj;
        boolean flag;
        date = null;
        s2 = null;
        s1 = null;
        s = null;
        gender = null;
        flag = false;
        arraylist = null;
        obj = null;
        jsonreader.beginObject();
_L32:
        Object obj1;
        byte byte0;
        if (!jsonreader.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = jsonreader.nextName();
        byte0 = -1;
        ((String) (obj1)).hashCode();
        JVM INSTR lookupswitch 10: default 136
    //                   -1396647632: 287
    //                   -1249512767: 239
    //                   -989034367: 223
    //                   -265713450: 271
    //                   94650: 191
    //                   3267670: 321
    //                   3373707: 207
    //                   1168724782: 304
    //                   1565553213: 255
    //                   1917457279: 339;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        byte0;
        JVM INSTR tableswitch 0 7: default 184
    //                   0 357
    //                   1 366
    //                   2 375
    //                   3 419
    //                   4 440
    //                   5 449
    //                   6 458
    //                   7 706;
           goto _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20
_L12:
        jsonreader.skipValue();
        continue; /* Loop/switch isn't completed */
_L6:
        if (((String) (obj1)).equals("_id"))
        {
            byte0 = 0;
        }
          goto _L1
_L8:
        if (((String) (obj1)).equals("name"))
        {
            byte0 = 1;
        }
          goto _L1
_L4:
        if (((String) (obj1)).equals("photos"))
        {
            byte0 = 2;
        }
          goto _L1
_L3:
        if (((String) (obj1)).equals("gender"))
        {
            byte0 = 3;
        }
          goto _L1
_L10:
        if (((String) (obj1)).equals("is_verified"))
        {
            byte0 = 4;
        }
          goto _L1
_L5:
        if (((String) (obj1)).equals("username"))
        {
            byte0 = 5;
        }
          goto _L1
_L2:
        if (((String) (obj1)).equals("badges"))
        {
            byte0 = 6;
        }
          goto _L1
_L9:
        if (((String) (obj1)).equals("birth_date"))
        {
            byte0 = 7;
        }
          goto _L1
_L7:
        if (((String) (obj1)).equals("jobs"))
        {
            byte0 = 8;
        }
          goto _L1
_L11:
        if (((String) (obj1)).equals("schools"))
        {
            byte0 = 9;
        }
          goto _L1
_L13:
        s2 = jsonreader.nextString();
        continue; /* Loop/switch isn't completed */
_L14:
        s1 = jsonreader.nextString();
        continue; /* Loop/switch isn't completed */
_L15:
        arraylist = new ArrayList(6);
        jsonreader.beginArray();
        for (; jsonreader.hasNext(); arraylist.add(a(jsonreader, s2))) { }
        jsonreader.endArray();
        continue; /* Loop/switch isn't completed */
_L16:
        if (jsonreader.nextInt() == 0)
        {
            gender = Gender.MALE;
        } else
        {
            gender = Gender.FEMALE;
        }
        continue; /* Loop/switch isn't completed */
_L17:
        flag = jsonreader.nextBoolean();
        continue; /* Loop/switch isn't completed */
_L18:
        s = jsonreader.nextString();
        continue; /* Loop/switch isn't completed */
_L19:
        ArrayList arraylist1;
        arraylist1 = new ArrayList();
        jsonreader.beginArray();
_L30:
        String s3;
        if (!jsonreader.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!jsonreader.peek().equals(JsonToken.BEGIN_OBJECT))
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonreader.beginObject();
        obj = null;
        obj1 = null;
        s3 = null;
_L28:
        if (!jsonreader.hasNext()) goto _L22; else goto _L21
_L21:
        String s4;
        s4 = jsonreader.nextName();
        byte0 = -1;
        s4.hashCode();
        JVM INSTR lookupswitch 3: default 560
    //                   -1724546052: 617
    //                   3575610: 600
    //                   94842723: 634;
           goto _L23 _L24 _L25 _L26
_L23:
        switch (byte0)
        {
        case 0: // '\0'
            obj = jsonreader.nextString();
            break;

        case 1: // '\001'
            obj1 = jsonreader.nextString();
            break;

        case 2: // '\002'
            s3 = jsonreader.nextString();
            break;
        }
        continue; /* Loop/switch isn't completed */
_L25:
        if (s4.equals("type"))
        {
            byte0 = 0;
        }
          goto _L23
_L24:
        if (s4.equals("description"))
        {
            byte0 = 1;
        }
          goto _L23
_L26:
        if (s4.equals("color"))
        {
            byte0 = 2;
        }
          goto _L23
        if (true) goto _L28; else goto _L27
_L27:
_L22:
        jsonreader.endObject();
        arraylist1.add(new Badge(((String) (obj)), ((String) (obj1)), s3));
        if (true) goto _L30; else goto _L29
_L29:
        jsonreader.endArray();
        obj = arraylist1;
        continue; /* Loop/switch isn't completed */
_L20:
        obj1 = dateformat.parse(jsonreader.nextString());
        date = ((java.util.Date) (obj1));
        continue; /* Loop/switch isn't completed */
        ParseException parseexception;
        parseexception;
        v.a("Failed to parse birthday", parseexception);
        if (true) goto _L32; else goto _L31
_L31:
        jsonreader.endObject();
        if (arraylist != null)
        {
            for (jsonreader = arraylist.iterator(); jsonreader.hasNext();)
            {
                dateformat = ((ProfilePhoto)jsonreader.next()).processedPhotos.iterator();
                while (dateformat.hasNext()) 
                {
                    ((ProcessedPhoto)dateformat.next()).ownerUserId = s2;
                }
            }

        }
        return new Person(s2, s1, arraylist, gender, flag, ((List) (obj)), s, null, date);
    }

    private static ProcessedPhoto a(JsonReader jsonreader, String s, String s1)
        throws IOException
    {
        String s2;
        int j;
        int k;
        s2 = null;
        jsonreader.beginObject();
        k = 0;
        j = 0;
_L7:
        int l = j;
        if (!jsonreader.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = jsonreader.nextName();
        j = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 3: default 205
    //                   -1221029593: 146
    //                   116079: 112
    //                   113126854: 129;
           goto _L3 _L4 _L5 _L6
_L8:
        jsonreader.skipValue();
        j = l;
          goto _L7
        obj;
        v.b(((OutOfMemoryError) (obj)).getMessage());
_L2:
        jsonreader.endObject();
        return new ProcessedPhoto(s1, s, s2, l, k);
_L5:
        if (((String) (obj)).equals("url"))
        {
            j = 0;
        }
          goto _L3
_L6:
        if (((String) (obj)).equals("width"))
        {
            j = 1;
        }
          goto _L3
_L4:
        if (((String) (obj)).equals("height"))
        {
            j = 2;
        }
          goto _L3
_L9:
        obj = jsonreader.nextString();
        s2 = ((String) (obj));
        j = l;
          goto _L7
_L10:
        j = jsonreader.nextInt();
          goto _L7
_L11:
        j = jsonreader.nextInt();
        k = j;
        j = l;
          goto _L7
_L3:
        j;
        JVM INSTR tableswitch 0 2: default 232
    //                   0 163
    //                   1 179
    //                   2 188;
           goto _L8 _L9 _L10 _L11
    }

    private static ProfilePhoto a(JsonReader jsonreader, String s)
        throws IOException
    {
        String s1;
        ArrayList arraylist;
        arraylist = new ArrayList(UserPhotoSize.values().length);
        jsonreader.beginObject();
        s1 = null;
_L6:
        String s2;
        byte byte0;
        if (!jsonreader.hasNext())
        {
            break MISSING_BLOCK_LABEL_168;
        }
        s2 = jsonreader.nextName();
        byte0 = -1;
        s2.hashCode();
        JVM INSTR lookupswitch 2: default 64
    //                   3355: 95
    //                   624779209: 111;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_111;
_L4:
        switch (byte0)
        {
        default:
            jsonreader.skipValue();
            break;

        case 0: // '\0'
            s1 = jsonreader.nextString();
            break;

        case 1: // '\001'
            jsonreader.beginArray();
            for (; jsonreader.hasNext(); arraylist.add(a(jsonreader, s, s1))) { }
            jsonreader.endArray();
            break;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (s2.equals("id"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s2.equals("processedFiles"))
        {
            byte0 = 1;
        }
          goto _L4
        jsonreader.endObject();
        for (jsonreader = arraylist.iterator(); jsonreader.hasNext();)
        {
            ((ProcessedPhoto)jsonreader.next()).id = s1;
        }

        return new ProfilePhoto(s1, arraylist);
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static ProfilePhoto a(JSONObject jsonobject, String s)
        throws JSONException
    {
        String s1 = jsonobject.getString("id");
        jsonobject = jsonobject.getJSONArray("processedFiles");
        ArrayList arraylist = new ArrayList(jsonobject.length());
        for (int j = 0; j < jsonobject.length(); j++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(j);
            arraylist.add(new ProcessedPhoto(s1, s, jsonobject1.getString("url"), jsonobject1.getInt("width"), jsonobject1.getInt("height")));
        }

        return new ProfilePhoto(null, s1, 0, 0, 0.0F, 0.0F, 0.0F, 0.0F, 0, 0, arraylist);
    }
}
