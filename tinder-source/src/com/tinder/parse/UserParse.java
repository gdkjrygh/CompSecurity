// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.parse;

import android.text.TextUtils;
import android.util.Pair;
import com.b.a.d;
import com.tinder.d.a;
import com.tinder.enums.Blend;
import com.tinder.enums.Gender;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.aa;
import com.tinder.managers.ab;
import com.tinder.managers.ad;
import com.tinder.managers.ae;
import com.tinder.managers.g;
import com.tinder.managers.i;
import com.tinder.managers.y;
import com.tinder.managers.z;
import com.tinder.model.CommonConnection;
import com.tinder.model.ConnectionsGroup;
import com.tinder.model.InstagramDataSet;
import com.tinder.model.Interest;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.ReportNotification;
import com.tinder.model.TinderLocation;
import com.tinder.model.User;
import com.tinder.utils.DateUtils;
import com.tinder.utils.Tinteg;
import com.tinder.utils.v;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.parse:
//            a, b, d, j, 
//            h

public final class UserParse
{
    public static final class RecsResponse extends Enum
    {

        public static final RecsResponse a;
        public static final RecsResponse b;
        public static final RecsResponse c;
        public static final RecsResponse d;
        public static final RecsResponse e;
        private static final RecsResponse f[];

        public static RecsResponse valueOf(String s)
        {
            return (RecsResponse)Enum.valueOf(com/tinder/parse/UserParse$RecsResponse, s);
        }

        public static RecsResponse[] values()
        {
            return (RecsResponse[])f.clone();
        }

        static 
        {
            a = new RecsResponse("STATUS_NOT_OK", 0);
            b = new RecsResponse("EXHAUSTED", 1);
            c = new RecsResponse("TIMEOUT", 2);
            d = new RecsResponse("NO_NEW_RECS", 3);
            e = new RecsResponse("RECS", 4);
            f = (new RecsResponse[] {
                a, b, c, d, e
            });
        }

        private RecsResponse(String s, int k)
        {
            super(s, k);
        }
    }

    public static final class a
        implements Comparator
    {

        public final int compare(Object obj, Object obj1)
        {
            obj = (ReportNotification)obj;
            obj1 = (ReportNotification)obj1;
            int l = ((ReportNotification) (obj1)).type.compareTo(((ReportNotification) (obj)).type);
            int k = l;
            if (l == 0)
            {
                k = ((ReportNotification) (obj1)).tier - ((ReportNotification) (obj)).tier;
            }
            return k;
        }

        public a()
        {
        }
    }


    private z a;
    private y b;
    private ae c;
    private ad d;
    private i e;

    public UserParse(z z1, y y1, ae ae1, ad ad1, i k)
    {
        a = z1;
        b = y1;
        c = ae1;
        d = ad1;
        e = k;
    }

    public static void a(JSONArray jsonarray)
    {
        if (jsonarray == null) goto _L2; else goto _L1
_L1:
        int k = 0;
_L7:
        if (k >= jsonarray.length()) goto _L2; else goto _L3
_L3:
        JSONObject jsonobject = jsonarray.getJSONObject(k);
        if (!jsonobject.has("product_id") || !aa.a(jsonobject.getString("product_id"))) goto _L5; else goto _L4
_L4:
        ae.c(true);
_L2:
        return;
        JSONException jsonexception;
        jsonexception;
        v.b(jsonexception.toString());
_L5:
        k++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static void a(JSONArray jsonarray, List list, String s)
        throws Exception
    {
        for (int k = 0; k < jsonarray.length(); k++)
        {
            Object obj1 = jsonarray.getJSONObject(k);
            Object obj = ((JSONObject) (obj1)).getString("id");
            String s2 = ((JSONObject) (obj1)).optString("url");
            String s1 = ((JSONObject) (obj1)).optString("fbId");
            obj1 = ((JSONObject) (obj1)).getJSONArray("processedFiles");
            ArrayList arraylist = new ArrayList(((JSONArray) (obj1)).length());
            for (int l = 0; l < ((JSONArray) (obj1)).length(); l++)
            {
                JSONObject jsonobject = ((JSONArray) (obj1)).getJSONObject(l);
                arraylist.add(new ProcessedPhoto(((String) (obj)), s, jsonobject.getString("url"), jsonobject.getInt("width"), jsonobject.getInt("height")));
            }

            obj = new ProfilePhoto(s2, ((String) (obj)), 0, 0, 0.0F, 0.0F, 0.0F, 0.0F, 0, 0, arraylist);
            obj.facebookId = s1;
            list.add(obj);
        }

    }

    public static List c(JSONObject jsonobject)
    {
        JSONArray jsonarray = jsonobject.optJSONArray("notifications");
        if (jsonarray == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = new ArrayList(jsonarray.length());
        int k = 0;
_L8:
        jsonobject = arraylist;
        ReportNotification reportnotification;
        JSONArray jsonarray1;
        if (k >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        reportnotification = new ReportNotification();
        JSONObject jsonobject1 = jsonarray.getJSONObject(k);
        jsonobject = jsonobject1.optString("type");
        reportnotification.type = jsonobject;
        jsonobject1 = jsonobject1.optJSONObject("meta");
        if (!TextUtils.equals("warning", jsonobject))
        {
            break MISSING_BLOCK_LABEL_175;
        }
        reportnotification.tier = jsonobject1.optInt("tier");
        jsonarray1 = jsonobject1.optJSONArray("reasons");
        if (jsonarray1 == null) goto _L4; else goto _L3
_L3:
        ArrayList arraylist1 = new ArrayList(jsonarray1.length());
        int l = 0;
_L6:
        jsonobject = arraylist1;
        if (l >= jsonarray1.length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist1.add(Integer.valueOf(jsonarray1.getInt(l)));
        l++;
        if (true) goto _L6; else goto _L5
_L4:
        jsonobject = new ArrayList(0);
_L5:
        reportnotification.reasons = jsonobject;
        (new StringBuilder("found notification: ")).append(reportnotification.toString());
        arraylist.add(reportnotification);
        k++;
        if (true) goto _L8; else goto _L7
_L2:
        try
        {
            jsonobject = new ArrayList(jsonarray.length());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            v.b(jsonobject.getMessage());
            jsonobject = new ArrayList(0);
        }
_L7:
        Collections.sort(jsonobject, new a());
        return jsonobject;
    }

    private static Pair d(JSONObject jsonobject)
        throws JSONException
    {
        boolean flag = false;
        Object obj = jsonobject.optJSONArray("common_interests");
        ArrayList arraylist;
        int k;
        if (obj == null)
        {
            k = 0;
        } else
        {
            k = ((JSONArray) (obj)).length();
        }
        arraylist = new ArrayList(k);
        if (obj != null)
        {
            for (k = 0; k < ((JSONArray) (obj)).length(); k++)
            {
                JSONObject jsonobject1 = ((JSONArray) (obj)).getJSONObject(k);
                arraylist.add(new Interest(jsonobject1.optString("id"), jsonobject1.optString("name")));
            }

        }
        jsonobject = jsonobject.optJSONArray("uncommon_interests");
        if (jsonobject == null)
        {
            k = 0;
        } else
        {
            k = jsonobject.length();
        }
        obj = new ArrayList(k);
        if (jsonobject != null)
        {
            for (k = ((flag) ? 1 : 0); k < jsonobject.length(); k++)
            {
                JSONObject jsonobject2 = jsonobject.getJSONObject(k);
                ((List) (obj)).add(new Interest(jsonobject2.getString("id"), jsonobject2.getString("name")));
            }

        }
        return new Pair(arraylist, obj);
    }

    private static List e(JSONObject jsonobject)
        throws JSONException
    {
        boolean flag = false;
        jsonobject = jsonobject.optJSONArray("interests");
        ArrayList arraylist;
        int k;
        if (jsonobject == null)
        {
            k = 0;
        } else
        {
            k = jsonobject.length();
        }
        arraylist = new ArrayList(k);
        if (jsonobject != null)
        {
            for (k = ((flag) ? 1 : 0); k < jsonobject.length(); k++)
            {
                JSONObject jsonobject1 = jsonobject.getJSONObject(k);
                arraylist.add(new Interest(jsonobject1.getString("id"), jsonobject1.getString("name")));
            }

        }
        return arraylist;
    }

    public final Pair a(JSONObject jsonobject, Map map)
        throws JSONException, OutOfMemoryError
    {
        DateFormat dateformat;
        dateformat = DateUtils.a();
        if (jsonobject.has("message"))
        {
            String s = jsonobject.getString("message");
            if (s.equals("recs exhausted"))
            {
                return new Pair(RecsResponse.b, null);
            }
            if (s.equals("recs timeout"))
            {
                return new Pair(RecsResponse.c, null);
            }
        }
        if (!jsonobject.has("status") || jsonobject.getInt("status") != 200) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        HashSet hashset;
        int k;
        int k1;
        (new StringBuilder("recs: ")).append(jsonobject.toString());
        jsonobject = jsonobject.getJSONArray("results");
        k1 = jsonobject.length();
        arraylist = new ArrayList(k1);
        hashset = new HashSet(k1);
        k = 0;
_L20:
        if (k >= k1) goto _L4; else goto _L3
_L3:
        JSONObject jsonobject1;
        Object obj;
        boolean flag2;
        jsonobject1 = jsonobject.getJSONObject(k);
        obj = jsonobject1.getString("_id");
        flag2 = jsonobject1.optBoolean("is_super_like", false);
        if (map.get(obj) != null && !flag2) goto _L6; else goto _L5
_L5:
        if (!hashset.contains(obj))
        {
            break MISSING_BLOCK_LABEL_1031;
        }
          goto _L6
_L19:
        boolean flag;
        boolean flag1;
        flag1 = flag;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        flag1 = Tinteg.tintegH(obj);
        if (flag1) goto _L8; else goto _L7
_L7:
        if (!hashset.contains(obj)) goto _L9; else goto _L8
_L9:
        String s1;
        String s2;
        java.util.Date date;
        String s3;
        String s4;
        String s5;
        Gender gender;
        String s6;
        String s7;
        String s8;
        Object obj1;
        int l1;
        int i2;
        hashset.add(obj);
        date = dateformat.parse(jsonobject1.getString("birth_date"));
        s3 = jsonobject1.optString("bio", "");
        s4 = jsonobject1.getString("name");
        s5 = jsonobject1.optString("username", "");
        gender = Gender.values()[jsonobject1.getInt("gender")];
        l1 = jsonobject1.optInt("distance_mi", 1);
        s6 = jsonobject1.optString("ping_time", "");
        flag = jsonobject1.optBoolean("is_traveling");
        s1 = jsonobject1.optString("travel_location_name");
        i2 = jsonobject1.optInt("travel_distance_mi");
        s2 = jsonobject1.optString("location_name");
        s7 = jsonobject1.optString("location_name");
        s8 = jsonobject1.optString("location_proximity");
        obj1 = jsonobject1.optJSONArray("photos");
        if (obj1 != null) goto _L11; else goto _L10
_L10:
        int l = 0;
_L14:
        ArrayList arraylist1 = new ArrayList(l);
        int i1;
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_604;
        }
        i1 = 0;
_L15:
        if (i1 >= l)
        {
            break MISSING_BLOCK_LABEL_604;
        }
        Object obj2;
        Object obj3;
        Object obj4;
        ArrayList arraylist2;
        int j2;
        obj4 = ((JSONArray) (obj1)).getJSONObject(i1);
        obj2 = ((JSONObject) (obj4)).getString("id");
        obj3 = ((JSONObject) (obj4)).getString("url");
        obj4 = ((JSONObject) (obj4)).getJSONArray("processedFiles");
        j2 = ((JSONArray) (obj4)).length();
        arraylist2 = new ArrayList(j2);
        int j1 = 0;
_L13:
        if (j1 >= j2)
        {
            break; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject2 = ((JSONArray) (obj4)).getJSONObject(j1);
        arraylist2.add(new ProcessedPhoto(((String) (obj2)), ((String) (obj)), jsonobject2.getString("url"), jsonobject2.getInt("width"), jsonobject2.getInt("height")));
        j1++;
        if (true) goto _L13; else goto _L12
_L11:
        l = ((JSONArray) (obj1)).length();
          goto _L14
_L12:
        arraylist1.add(new ProfilePhoto(((String) (obj3)), ((String) (obj2)), arraylist2));
        i1++;
          goto _L15
        boolean flag3;
        flag1 = jsonobject1.optBoolean("is_brand", false);
        obj1 = d(jsonobject1);
        obj2 = a(jsonobject1, false);
        flag3 = jsonobject1.optBoolean("is_verified", false);
        obj3 = jsonobject1.optJSONArray("badges");
        obj4 = new ArrayList();
        if (obj3 == null) goto _L17; else goto _L16
_L16:
        l = 0;
_L18:
        if (l >= ((JSONArray) (obj3)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        ((ArrayList) (obj4)).add(com.tinder.parse.a.a(((JSONArray) (obj3)).getJSONObject(k)));
        l++;
        if (true) goto _L18; else goto _L17
_L17:
        try
        {
            obj = new User(s4, s3, date, ((String) (obj)), null, gender, null, null, l1, arraylist1, s6, s7, s8, flag3, flag2, flag1, ((List) (obj4)), s5, com.tinder.parse.b.a(jsonobject1));
            ((User) (obj)).setRecAndPassporting(flag);
            ((User) (obj)).setTravelLocationName(s1);
            ((User) (obj)).setTravelDistanceMiles(i2);
            ((User) (obj)).setPingLocationName(s2);
            ((User) (obj)).setCommonInterests((List)((Pair) (obj1)).first);
            ((User) (obj)).setUncommonInterests((List)((Pair) (obj1)).second);
            ((User) (obj)).setNumConnections(((Integer)((Pair) (obj2)).first).intValue());
            ((User) (obj)).setConnections((ConnectionsGroup)((Pair) (obj2)).second);
            ((User) (obj)).setInstagramDataSet(com.tinder.parse.d.a(jsonobject1));
            arraylist.add(obj);
        }
        catch (JSONException jsonexception)
        {
            v.b((new StringBuilder("Parse recs : ")).append(jsonexception.toString()).toString());
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            v.b((new StringBuilder("Parse recs : ")).append(outofmemoryerror.toString()).toString());
        }
        catch (ParseException parseexception)
        {
            v.b((new StringBuilder("Parse recs : ")).append(parseexception.toString()).toString());
        }
          goto _L8
_L4:
        (new StringBuilder("newRecIds ")).append(hashset).append(" listRec ").append(arraylist);
        if (hashset.isEmpty())
        {
            return new Pair(com.tinder.parse.RecsResponse.d, null);
        } else
        {
            return new Pair(RecsResponse.e, arraylist);
        }
_L2:
        return new Pair(com.tinder.parse.RecsResponse.a, null);
_L6:
        flag = true;
          goto _L19
_L8:
        k++;
          goto _L20
        flag = false;
          goto _L19
    }

    public final Pair a(JSONObject jsonobject, boolean flag)
    {
        int i1 = 0;
        int k = i1;
        if (flag)
        {
            User user = a.b();
            k = i1;
            if (user != null)
            {
                k = user.getNumConnections();
            }
        }
        i1 = jsonobject.optInt("connection_count", k);
        Object obj = null;
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        JSONArray jsonarray = jsonobject.optJSONArray("common_connections");
        jsonobject = obj;
        if (jsonarray != null)
        {
            int l = 0;
            while (l < jsonarray.length()) 
            {
                jsonobject = jsonarray.optJSONObject(l);
                if (jsonobject != null)
                {
                    String s2 = jsonobject.optString("id", null);
                    String s3 = jsonobject.optString("name", null);
                    int j1 = jsonobject.optInt("degree", 1);
                    if (TextUtils.isEmpty(s3))
                    {
                        arraylist1.add(new CommonConnection(s2, j1, null, null, null, null));
                    } else
                    {
                        JSONObject jsonobject1 = jsonobject.optJSONObject("photo");
                        jsonobject = null;
                        String s = null;
                        String s1 = null;
                        if (jsonobject1 != null)
                        {
                            jsonobject = jsonobject1.optString("small", null);
                            s = jsonobject1.optString("medium", null);
                            s1 = jsonobject1.optString("large", null);
                        }
                        arraylist.add(new CommonConnection(s2, j1, s3, jsonobject, s, s1));
                    }
                }
                l++;
            }
            jsonobject = new ConnectionsGroup(arraylist, arraylist1);
        }
        return new Pair(Integer.valueOf(i1), jsonobject);
    }

    public final User a(JSONObject jsonobject)
        throws Exception
    {
        Object obj1 = DateUtils.a();
        String s = jsonobject.getString("bio");
        java.util.Date date = ((DateFormat) (obj1)).parse(jsonobject.getString("birth_date"));
        Object obj = null;
        java.util.Date date1;
        Gender gender;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        Object obj2;
        Object obj3;
        int l;
        if (jsonobject.has("_id"))
        {
            obj = jsonobject.getString("_id");
        } else
        if (jsonobject.has("id"))
        {
            obj = jsonobject.getString("id");
        }
        date1 = ((DateFormat) (obj1)).parse(jsonobject.getString("ping_time"));
        gender = Gender.values()[jsonobject.getInt("gender")];
        s1 = jsonobject.getString("name");
        s2 = jsonobject.optString("username", "");
        l = (int)jsonobject.getDouble("distance_mi");
        s3 = jsonobject.optString("location_name");
        s4 = jsonobject.optString("location_proximity");
        obj2 = jsonobject.optJSONArray("photos");
        s5 = jsonobject.optString("ping_time", "");
        if (obj2 != null)
        {
            obj1 = new ArrayList(((JSONArray) (obj2)).length());
            a(((JSONArray) (obj2)), ((List) (obj1)), ((String) (obj)));
        } else
        {
            obj1 = new ArrayList(0);
        }
        obj3 = jsonobject.optJSONArray("badges");
        obj2 = new ArrayList();
        if (obj3 != null)
        {
            for (int k = 0; k < ((JSONArray) (obj3)).length(); k++)
            {
                ((ArrayList) (obj2)).add(com.tinder.parse.a.a(((JSONArray) (obj3)).getJSONObject(k)));
            }

        }
        obj3 = d(jsonobject);
        Pair pair = a(jsonobject, false);
        obj = new User(s1, s, date, ((String) (obj)), date1, gender, null, null, l, ((ArrayList) (obj1)), s5, s3, s4, jsonobject.optBoolean("is_verified", false), jsonobject.optBoolean("is_super_like", false), jsonobject.optBoolean("is_brand", false), ((List) (obj2)), s2, com.tinder.parse.b.a(jsonobject));
        ((User) (obj)).setCommonInterests((List)((Pair) (obj3)).first);
        ((User) (obj)).setUncommonInterests((List)((Pair) (obj3)).second);
        ((User) (obj)).setNumConnections(((Integer)pair.first).intValue());
        ((User) (obj)).setConnections((ConnectionsGroup)pair.second);
        ((User) (obj)).setInstagramDataSet(com.tinder.parse.d.a(jsonobject));
        return ((User) (obj));
    }

    public final void a(com.tinder.d.a a1, JSONObject jsonobject)
        throws Exception
    {
        String s = jsonobject.optString("_id");
        int l = jsonobject.optInt("gender");
        String s1 = jsonobject.optString("bio");
        int i1 = jsonobject.optInt("gender_filter");
        int j1 = jsonobject.optInt("age_filter_min");
        int k1 = jsonobject.optInt("age_filter_max");
        int l1 = jsonobject.optInt("distance_filter");
        Object obj = jsonobject.optJSONArray("jobs");
        JSONArray jsonarray = jsonobject.optJSONArray("schools");
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (obj != null && ((JSONArray) (obj)).length() > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (jsonarray != null && jsonarray.length() > 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        obj = jsonobject.optJSONArray("purchases");
        flag3 = false;
        flag = false;
        if (obj != null)
        {
            int k = 0;
            do
            {
                flag3 = flag;
                if (k >= ((JSONArray) (obj)).length())
                {
                    break;
                }
                JSONObject jsonobject1 = ((JSONArray) (obj)).getJSONObject(k);
                flag3 = flag;
                if (jsonobject1.has("product_id"))
                {
                    flag3 = flag;
                    if (aa.a(jsonobject1.getString("product_id")))
                    {
                        flag3 = true;
                    }
                }
                k++;
                flag = flag3;
            } while (true);
        }
        obj = jsonobject.optString("create_date");
        jsonobject = jsonobject.optJSONObject("instagram");
        long l2;
        if (jsonobject != null)
        {
            jsonobject = jsonobject.optString("username");
        } else
        {
            jsonobject = "";
        }
        if (s1 != null && s1.trim().length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l2 = com.b.a.d.a(e.b()).a(com.tinder.parse.j.a()).a();
        a1.a(s);
        a1.a(flag);
        a1.a(l);
        a1.b(i1);
        a1.a(l1);
        a1.c(j1);
        a1.d(k1);
        a1.b(flag3);
        a1.b(((String) (obj)));
        a1.e(e.j());
        a1.f(a.b().getPhotoCount());
        a1.g((int)l2);
        a1.d(jsonobject);
        a1.c(flag2);
        a1.d(flag1);
        a1 = new StringBuilder();
        a1.append("crm tracked: ");
        a1.append((new StringBuilder(" \nsetUserId:")).append(s).toString());
        a1.append((new StringBuilder(" \nsetBio:")).append(flag).toString());
        a1.append((new StringBuilder(" \nsetGenderFromTinder:")).append(l).toString());
        a1.append((new StringBuilder(" \nsetSeekGender:")).append(i1).toString());
        a1.append((new StringBuilder(" \nsetSeekDistance:")).append(l1).toString());
        a1.append((new StringBuilder(" \nsetSeekMinAge:")).append(j1).toString());
        a1.append((new StringBuilder(" \nsetSeekMaxAge:")).append(k1).toString());
        a1.append((new StringBuilder(" \nsetTinderPlusSubscriber:")).append(flag3).toString());
        a1.append((new StringBuilder(" \nsetCreationDate:")).append(((String) (obj))).toString());
        a1.append((new StringBuilder(" \nsetMatchesCount:")).append(e.j()).toString());
        a1.append((new StringBuilder(" \nsetProfilePhotosCount:")).append(a.b().getPhotoCount()).toString());
        a1.append((new StringBuilder(" \nsetUnreadMessages:")).append(l2).toString());
        a1.append((new StringBuilder(" \nsetInstagram:")).append(jsonobject).toString());
        a1.append((new StringBuilder(" \nsetSchool:")).append(flag2).toString());
        a1.append((new StringBuilder(" \nsetWork:")).append(flag1).toString());
    }

    public final void a(User user, JSONObject jsonobject)
    {
        boolean flag = jsonobject.optBoolean("is_traveling");
        user.setRecAndPassporting(flag);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        user = jsonobject.optJSONArray("travel_location_info");
        if (user == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        try
        {
            user = h.b(user.getJSONObject(0));
            jsonobject = jsonobject.getJSONObject("travel_pos");
        }
        // Misplaced declaration of an exception variable
        catch (User user)
        {
            b.a(null);
            v.b(user.toString());
            return;
        }
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        user.setLatitude(jsonobject.optDouble("lat"));
        user.setLongitude(jsonobject.optDouble("lon"));
        b.a(user);
        return;
        b.a(null);
        return;
        b.a(null);
        return;
    }

    public final com.tinder.managers.z.a b(JSONObject jsonobject)
    {
        Object obj2;
        com.tinder.managers.z.a a1;
        a1 = new com.tinder.managers.z.a();
        obj2 = DateUtils.a();
        Object obj;
        Blend blend;
        int l;
        int i1;
        int j1;
        if (!jsonobject.isNull("pos"))
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("pos");
            double d1 = jsonobject1.getDouble("lat");
            double d2 = jsonobject1.getDouble("lon");
            ManagerApp.h().l();
            g.a(d1, d2);
        }
        blend = ab.c(jsonobject.optString("blend"));
        l = jsonobject.getInt("distance_filter");
        i1 = jsonobject.getInt("age_filter_min");
        j1 = jsonobject.getInt("age_filter_max");
        obj = jsonobject.optJSONArray("purchases");
        if (obj == null) goto _L2; else goto _L1
_L1:
        int k;
        boolean flag;
        flag = false;
        k = 0;
_L25:
        if (k >= ((JSONArray) (obj)).length()) goto _L4; else goto _L3
_L3:
        Object obj1 = ((JSONArray) (obj)).getJSONObject(k);
        boolean flag1 = flag;
        if (!((JSONObject) (obj1)).has("product_id")) goto _L6; else goto _L5
_L5:
        flag1 = flag;
        if (aa.a(((JSONObject) (obj1)).getString("product_id")))
        {
            flag1 = true;
        }
          goto _L6
_L4:
        ae.c(flag);
_L2:
        obj = jsonobject.getString("birth_date");
        flag1 = ((String) (obj)).equals("-1");
        if (!flag1) goto _L8; else goto _L7
_L7:
        obj = null;
_L16:
        Object obj3 = jsonobject.optString("ping_time");
        obj1 = null;
        if (!TextUtils.isEmpty(((CharSequence) (obj3))))
        {
            obj1 = ((DateFormat) (obj2)).parse(jsonobject.getString("ping_time"));
        }
        k = jsonobject.getInt("gender");
        Gender gender;
        String s;
        String s1;
        String s2;
        String s3;
        Object obj4;
        ArrayList arraylist;
        JSONArray jsonarray;
        boolean flag2;
        if (k == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gender = Gender.values()[Math.abs(k)];
        obj3 = jsonobject.optString("bio", "");
        obj2 = obj3;
        if (((String) (obj3)).length() > 500)
        {
            obj2 = ((String) (obj3)).substring(0, 500);
        }
        s = jsonobject.getString("_id");
        s1 = jsonobject.getString("name");
        s2 = jsonobject.optString("username", "");
        s3 = jsonobject.optString("facebook_id", "");
        flag2 = jsonobject.optBoolean("discoverable", true);
        obj4 = jsonobject.optJSONArray("photos");
        if (obj4 == null) goto _L10; else goto _L9
_L9:
        obj3 = new ArrayList(((JSONArray) (obj4)).length());
        a(((JSONArray) (obj4)), ((List) (obj3)), s);
_L17:
        obj4 = new ArrayList(2);
        k = jsonobject.getInt("gender_filter");
        if (k != -1) goto _L12; else goto _L11
_L11:
        ((ArrayList) (obj4)).add(Gender.MALE);
        ((ArrayList) (obj4)).add(Gender.FEMALE);
_L20:
        jsonarray = jsonobject.optJSONArray("badges");
        arraylist = new ArrayList();
        if (jsonarray == null) goto _L14; else goto _L13
_L13:
        k = 0;
_L15:
        if (k >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(com.tinder.parse.a.a(jsonarray.getJSONObject(k)));
        k++;
        if (true) goto _L15; else goto _L14
_L8:
        obj = ((DateFormat) (obj2)).parse(((String) (obj)));
          goto _L16
_L10:
        obj3 = new ArrayList(0);
          goto _L17
_L21:
        if (TextUtils.isEmpty(((CharSequence) (obj))) || TextUtils.equals(((CharSequence) (obj)), "null")) goto _L19; else goto _L18
_L18:
        jsonobject.isTokenRevoked = true;
_L23:
        return a1;
_L12:
        if (k != 0)
        {
            break MISSING_BLOCK_LABEL_635;
        }
        ((ArrayList) (obj4)).add(Gender.MALE);
          goto _L20
        ((ArrayList) (obj4)).add(Gender.FEMALE);
          goto _L20
_L14:
        try
        {
            String s4 = jsonobject.optString("ping_time", "");
            boolean flag3 = jsonobject.optBoolean("banned", false);
            obj = new User(((String) (obj2)), ((java.util.Date) (obj)), s, s1, ((java.util.Date) (obj1)), l, s3, gender, ((ArrayList) (obj4)), ((ArrayList) (obj3)), s4, jsonobject.optBoolean("is_verified", false), jsonobject.optBoolean("is_super_like", false), jsonobject.optBoolean("is_brand", false), arraylist, s2, com.tinder.parse.b.a(jsonobject));
            obj1 = e(jsonobject);
            obj2 = a(jsonobject, true);
            ((User) (obj)).setCommonInterests(((List) (obj1)));
            ((User) (obj)).setNumConnections(((Integer)((Pair) (obj2)).first).intValue());
            ((User) (obj)).setConnections((ConnectionsGroup)((Pair) (obj2)).second);
            a(jsonobject.optJSONArray("purchases"));
            a1.d = ((User) (obj));
            a1.a = l;
            a1.b = i1;
            a1.c = j1;
            a1.e = flag3;
            a1.f = flag1;
            a1.g = flag;
            a1.h = flag2;
            ae.b.putString("KEY_BLEND", blend.name).commit();
            d.c(flag2);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            v.a("Failed to parse birthday or ping time for rec", ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            v.a("Failed to parse JSON for recs response", ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            v.a("Unknown exception in rec parsing", ((Throwable) (obj)));
        }
        obj = jsonobject.optString("instagram_disconnected");
        (new StringBuilder("setInstagramDataSet UserParse.ParseMyProfile: expiredTime: [")).append(((String) (obj))).append("]");
        jsonobject = com.tinder.parse.d.a(jsonobject);
          goto _L21
_L19:
        ManagerApp.h().g();
        if (com.tinder.managers.d.c() == null) goto _L23; else goto _L22
_L22:
        a1.d.setInstagramDataSet(jsonobject);
        return a1;
_L6:
        k++;
        flag = flag1;
        if (true) goto _L25; else goto _L24
_L24:
    }
}
