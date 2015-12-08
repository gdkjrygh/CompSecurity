// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.Pair;
import com.mixpanel.android.mpmetrics.l;
import com.mixpanel.android.util.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            ImageStore, a, f, k, 
//            l

class EditProtocol
{
    public static class BadInstructionsException extends Exception
    {

        private static final long serialVersionUID = 0xc7a0dc29b5edfa61L;

        public BadInstructionsException(String s)
        {
            super(s);
        }

        public BadInstructionsException(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }

    public static class CantGetEditAssetsException extends Exception
    {

        public CantGetEditAssetsException(String s)
        {
            super(s);
        }

        public CantGetEditAssetsException(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }

    public static class InapplicableInstructionsException extends BadInstructionsException
    {

        private static final long serialVersionUID = 0x37315801d3e28970L;

        public InapplicableInstructionsException(String s)
        {
            super(s);
        }
    }

    public static class a
    {

        public final com.mixpanel.android.viewcrawler.l a;
        public final List b;

        private a(com.mixpanel.android.viewcrawler.l l1, List list)
        {
            a = l1;
            b = list;
        }

    }


    private static final Class d[] = new Class[0];
    private static final List e = Collections.emptyList();
    private static final String f = "MixpanelAPI.EProtocol";
    private final l a;
    private final ImageStore b;
    private final l.i c;

    public EditProtocol(l l1, ImageStore imagestore, l.i i)
    {
        a = l1;
        b = imagestore;
        c = i;
    }

    private Drawable a(JSONObject jsonobject, List list)
        throws BadInstructionsException, CantGetEditAssetsException
    {
        int i;
        i = 0;
        try
        {
            if (jsonobject.isNull("url"))
            {
                throw new BadInstructionsException("Can't construct a BitmapDrawable with a null url");
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadInstructionsException("Couldn't read drawable description", jsonobject);
        }
        String s;
        boolean flag1;
        s = jsonobject.getString("url");
        flag1 = jsonobject.isNull("dimensions");
        if (!flag1) goto _L2; else goto _L1
_L1:
        int j;
        int i1;
        int j1;
        boolean flag;
        j = 0;
        i1 = 0;
        j1 = 0;
        flag = false;
_L4:
        jsonobject = b.a(s);
        list.add(s);
        jsonobject = new BitmapDrawable(Resources.getSystem(), jsonobject);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject.setBounds(j1, j, i1, i);
        return jsonobject;
_L2:
        jsonobject = jsonobject.getJSONObject("dimensions");
        j1 = jsonobject.getInt("left");
        i1 = jsonobject.getInt("right");
        j = jsonobject.getInt("top");
        i = jsonobject.getInt("bottom");
        flag = true;
        if (true) goto _L4; else goto _L3
        jsonobject;
        throw new CantGetEditAssetsException(jsonobject.getMessage(), jsonobject.getCause());
_L3:
        return jsonobject;
    }

    private f a(Class class1, JSONObject jsonobject)
        throws BadInstructionsException
    {
        String s = null;
        Object obj;
        String s1;
        s1 = jsonobject.getString("name");
        if (!jsonobject.has("get"))
        {
            break MISSING_BLOCK_LABEL_142;
        }
        Object obj1 = jsonobject.getJSONObject("get");
        obj = ((JSONObject) (obj1)).getString("selector");
        obj1 = Class.forName(((JSONObject) (obj1)).getJSONObject("result").getString("type"));
        obj = new com.mixpanel.android.viewcrawler.a(class1, ((String) (obj)), d, ((Class) (obj1)));
_L1:
        if (jsonobject.has("set"))
        {
            s = jsonobject.getJSONObject("set").getString("selector");
        }
        class1 = new f(s1, class1, ((com.mixpanel.android.viewcrawler.a) (obj)), s);
        return class1;
        class1;
        throw new BadInstructionsException("Can't create property reader", class1);
        class1;
        throw new BadInstructionsException("Can't read property JSON", class1);
        class1;
        throw new BadInstructionsException("Can't read property JSON, relevant arg/return class not found", class1);
        obj = null;
          goto _L1
    }

    private Integer a(int i, String s, l l1)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        if (!l1.a(s)) goto _L4; else goto _L3
_L3:
        int j = l1.b(s);
_L6:
        if (-1 != j && -1 != i && j != i)
        {
            Log.e("MixpanelAPI.EProtocol", "Path contains both a named and an explicit id, and they don't match. No views will be matched.");
            return null;
        }
        break; /* Loop/switch isn't completed */
_L4:
        Log.w("MixpanelAPI.EProtocol", (new StringBuilder()).append("Path element contains an id name not known to the system. No views will be matched.\nMake sure that you're not stripping your packages R class out with proguard.\nid name was \"").append(s).append("\"").toString());
        return null;
_L2:
        j = -1;
        if (true) goto _L6; else goto _L5
_L5:
        if (-1 != j)
        {
            return Integer.valueOf(j);
        } else
        {
            return Integer.valueOf(i);
        }
    }

    private Object a(Object obj, String s, List list)
        throws BadInstructionsException, CantGetEditAssetsException
    {
        if ("java.lang.CharSequence".equals(s))
        {
            return obj;
        }
        try
        {
            if (!"boolean".equals(s) && !"java.lang.Boolean".equals(s))
            {
                if ("int".equals(s) || "java.lang.Integer".equals(s))
                {
                    return Integer.valueOf(((Number)obj).intValue());
                }
                if ("float".equals(s) || "java.lang.Float".equals(s))
                {
                    return Float.valueOf(((Number)obj).floatValue());
                }
                if ("android.graphics.drawable.Drawable".equals(s))
                {
                    return a((JSONObject)obj, list);
                }
                if ("android.graphics.drawable.BitmapDrawable".equals(s))
                {
                    return a((JSONObject)obj, list);
                }
                if ("android.graphics.drawable.ColorDrawable".equals(s))
                {
                    return new ColorDrawable(((Number)obj).intValue());
                } else
                {
                    throw new BadInstructionsException((new StringBuilder()).append("Don't know how to interpret type ").append(s).append(" (arg was ").append(obj).append(")").toString());
                }
            }
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new BadInstructionsException((new StringBuilder()).append("Couldn't interpret <").append(obj).append("> as ").append(s).toString());
        }
        return obj;
    }

    public a a(JSONObject jsonobject)
        throws BadInstructionsException, CantGetEditAssetsException
    {
        Object obj;
        ArrayList arraylist;
        List list;
        int i;
        i = 0;
        arraylist = new ArrayList();
        try
        {
            list = a(jsonobject.getJSONArray("path"), a);
            if (list.size() == 0)
            {
                throw new InapplicableInstructionsException("Edit will not be bound to any element in the UI.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadInstructionsException("Can't create property mutator", jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadInstructionsException("Can't interpret instructions due to JSONException", jsonobject);
        }
        if (!jsonobject.getString("change_type").equals("property")) goto _L2; else goto _L1
_L1:
        obj = jsonobject.getJSONObject("property").getString("classname");
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        throw new BadInstructionsException("Can't bind an edit property without a target class");
        Object obj1 = Class.forName(((String) (obj)));
        Object aobj[];
        obj = a(((Class) (obj1)), jsonobject.getJSONObject("property"));
        jsonobject = jsonobject.getJSONArray("args");
        aobj = new Object[jsonobject.length()];
_L3:
        if (i >= jsonobject.length())
        {
            break MISSING_BLOCK_LABEL_235;
        }
        JSONArray jsonarray = jsonobject.getJSONArray(i);
        aobj[i] = a(jsonarray.get(0), jsonarray.getString(1), ((List) (arraylist)));
        i++;
          goto _L3
        jsonobject;
        throw new BadInstructionsException((new StringBuilder()).append("Can't find class for visit path: ").append(((String) (obj))).toString(), jsonobject);
        jsonobject = ((f) (obj)).a(aobj);
        if (jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_283;
        }
        throw new BadInstructionsException((new StringBuilder()).append("Can't update a read-only property ").append(((f) (obj)).a).append(" (add a mutator to make this work)").toString());
        jsonobject = new l.j(list, jsonobject, ((f) (obj)).c);
_L14:
        return new a(jsonobject, arraylist);
_L2:
        if (!jsonobject.getString("change_type").equals("layout")) goto _L5; else goto _L4
_L4:
        ArrayList arraylist1;
        int j;
        aobj = jsonobject.getJSONArray("args");
        arraylist1 = new ArrayList();
        j = ((JSONArray) (aobj)).length();
        i = 0;
_L17:
        if (i >= j) goto _L7; else goto _L6
_L6:
        JSONObject jsonobject1;
        String s;
        String s1;
        Integer integer;
        jsonobject1 = ((JSONArray) (aobj)).optJSONObject(i);
        s = jsonobject1.getString("view_id_name");
        s1 = jsonobject1.getString("anchor_id_name");
        integer = a(-1, s, a);
        if (!s1.equals("0")) goto _L9; else goto _L8
_L8:
        obj = Integer.valueOf(0);
          goto _L10
_L15:
        Log.w("MixpanelAPI.EProtocol", (new StringBuilder()).append("View (").append(s).append(") or anchor (").append(s1).append(") not found.").toString());
          goto _L11
_L9:
        if (!s1.equals("-1")) goto _L13; else goto _L12
_L12:
        obj = Integer.valueOf(-1);
          goto _L10
_L13:
        obj = a(-1, s1, a);
          goto _L10
_L16:
        arraylist1.add(new l.f(integer.intValue(), jsonobject1.getInt("verb"), ((Integer) (obj)).intValue()));
          goto _L11
_L7:
        jsonobject = new l.g(list, arraylist1, jsonobject.getString("name"), c);
          goto _L14
_L5:
        throw new BadInstructionsException("Can't figure out the edit type");
_L10:
        if (integer != null && obj != null) goto _L16; else goto _L15
_L11:
        i++;
          goto _L17
    }

    public com.mixpanel.android.viewcrawler.l a(JSONObject jsonobject, l.h h)
        throws BadInstructionsException
    {
        String s;
        String s1;
        try
        {
            s = jsonobject.getString("event_name");
            s1 = jsonobject.getString("event_type");
            jsonobject = a(jsonobject.getJSONArray("path"), a);
            if (jsonobject.size() == 0)
            {
                throw new InapplicableInstructionsException((new StringBuilder()).append("event '").append(s).append("' will not be bound to any element in the UI.").toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadInstructionsException("Can't interpret instructions due to JSONException", jsonobject);
        }
        if ("click".equals(s1))
        {
            return new l.a(jsonobject, 1, s, h);
        }
        if ("selected".equals(s1))
        {
            return new l.a(jsonobject, 4, s, h);
        }
        if ("text_changed".equals(s1))
        {
            return new l.b(jsonobject, s, h);
        }
        if ("detected".equals(s1))
        {
            return new l.k(jsonobject, s, h);
        } else
        {
            throw new BadInstructionsException((new StringBuilder()).append("Mixpanel can't track event type \"").append(s1).append("\"").toString());
        }
    }

    List a(JSONArray jsonarray, l l1)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            Object obj1 = jsonarray.getJSONObject(i);
            Object obj = com.mixpanel.android.util.d.a(((JSONObject) (obj1)), "prefix");
            String s = com.mixpanel.android.util.d.a(((JSONObject) (obj1)), "view_class");
            int i1 = ((JSONObject) (obj1)).optInt("index", -1);
            String s1 = com.mixpanel.android.util.d.a(((JSONObject) (obj1)), "contentDescription");
            int j1 = ((JSONObject) (obj1)).optInt("id", -1);
            String s2 = com.mixpanel.android.util.d.a(((JSONObject) (obj1)), "mp_id_name");
            obj1 = com.mixpanel.android.util.d.a(((JSONObject) (obj1)), "tag");
            int j;
            if ("shortest".equals(obj))
            {
                j = 1;
            } else
            if (obj == null)
            {
                j = 0;
            } else
            {
                Log.w("MixpanelAPI.EProtocol", (new StringBuilder()).append("Unrecognized prefix type \"").append(((String) (obj))).append("\". No views will be matched").toString());
                return e;
            }
            obj = a(j1, s2, l1);
            if (obj == null)
            {
                return e;
            }
            arraylist.add(new e.c(j, s, i1, ((Integer) (obj)).intValue(), s1, ((String) (obj1))));
        }

        return arraylist;
    }

    public k b(JSONObject jsonobject)
        throws BadInstructionsException
    {
        int i;
        ArrayList arraylist = new ArrayList();
        Class class1;
        Object obj;
        int j;
        try
        {
            jsonobject = jsonobject.getJSONObject("config").getJSONArray("classes");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadInstructionsException("Can't read snapshot configuration", jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadInstructionsException("Can't resolve types for snapshot configuration", jsonobject);
        }
        i = 0;
_L6:
        if (i >= jsonobject.length()) goto _L2; else goto _L1
_L1:
        obj = jsonobject.getJSONObject(i);
        class1 = Class.forName(((JSONObject) (obj)).getString("name"));
        obj = ((JSONObject) (obj)).getJSONArray("properties");
        j = 0;
_L4:
        if (j >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(a(class1, ((JSONArray) (obj)).getJSONObject(j)));
        j++;
        if (true) goto _L4; else goto _L3
_L2:
        jsonobject = new k(arraylist, a);
        return jsonobject;
_L3:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Pair c(JSONObject jsonobject)
        throws BadInstructionsException
    {
        String s;
        String s1;
        s = jsonobject.getString("name");
        s1 = jsonobject.getString("type");
        if (!"number".equals(s1)) goto _L2; else goto _L1
_L1:
        s1 = jsonobject.getString("encoding");
        if (!"d".equals(s1)) goto _L4; else goto _L3
_L3:
        jsonobject = Double.valueOf(jsonobject.getDouble("value"));
_L7:
        return new Pair(s, jsonobject);
_L4:
        if (!"l".equals(s1)) goto _L6; else goto _L5
_L5:
        jsonobject = Long.valueOf(jsonobject.getLong("value"));
          goto _L7
_L6:
        try
        {
            throw new BadInstructionsException((new StringBuilder()).append("number must have encoding of type \"l\" for long or \"d\" for double in: ").append(jsonobject).toString());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadInstructionsException("Can't read tweak update", jsonobject);
        }
_L2:
label0:
        {
            if (!"boolean".equals(s1))
            {
                break label0;
            }
            jsonobject = Boolean.valueOf(jsonobject.getBoolean("value"));
        }
          goto _L7
label1:
        {
            if (!"string".equals(s1))
            {
                break label1;
            }
            jsonobject = jsonobject.getString("value");
        }
          goto _L7
        throw new BadInstructionsException((new StringBuilder()).append("Unrecognized tweak type ").append(s1).append(" in: ").append(jsonobject).toString());
    }

}
