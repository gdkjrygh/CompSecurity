// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class dkk
{

    private noz a;

    public dkk(Context context)
    {
        a = noz.a(context, "AllDreamProvider", new String[0]);
    }

    public final String a(Set set)
    {
        JSONArray jsonarray;
        jsonarray = new JSONArray();
        set = set.iterator();
_L8:
        if (!set.hasNext()) goto _L2; else goto _L1
_L1:
        ekq ekq1;
        JSONObject jsonobject;
        ekq1 = (ekq)set.next();
        jsonobject = new JSONObject();
        if (!(ekq1 instanceof dke)) goto _L4; else goto _L3
_L3:
        jsonobject.put("type", "all");
_L7:
        jsonarray.put(jsonobject);
          goto _L5
_L4:
        if (!(ekq1 instanceof dnd))
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject.put("type", "album");
        jsonobject.put("media_key", ((dnd)ekq1).b);
        if (true) goto _L7; else goto _L6
_L6:
        try
        {
            throw new IllegalArgumentException("Cannot read collection for anything other than an AllPhotosCollection or AlbumMediaCollection.");
        }
        catch (JSONException jsonexception) { }
_L5:
        if (true) goto _L8; else goto _L2
_L2:
        return jsonarray.toString();
    }

    public final Set a(String s, int i)
    {
        HashSet hashset;
        JSONObject jsonobject;
        String s1;
        if (TextUtils.isEmpty(s))
        {
            return new HashSet();
        }
        int j;
        try
        {
            s = new JSONArray(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return new HashSet();
        }
        hashset = new HashSet();
        j = 0;
label0:
        {
            if (j >= s.length())
            {
                break label0;
            }
            try
            {
                jsonobject = s.getJSONObject(j);
                s1 = (String)jsonobject.get("type");
                if (!s1.equals("all"))
                {
                    break; /* Loop/switch isn't completed */
                }
                hashset.add(new dke(i, elm.a));
            }
            catch (JSONException jsonexception) { }
        }
        j++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_35;
_L1:
        if (s1.equals("album"))
        {
            hashset.add(new dnd(i, (String)jsonobject.get("media_key"), false, elm.a));
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_92;
        } else
        {
            return hashset;
        }
    }
}
