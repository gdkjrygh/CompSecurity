// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class mks
{

    private final Context a;

    public mks(Context context)
    {
        a = context;
    }

    private JSONObject a(String s)
    {
        Object obj;
        try
        {
            obj = a.getAssets().open(s);
            byte abyte0[] = new byte[((InputStream) (obj)).available()];
            ((InputStream) (obj)).read(abyte0);
            ((InputStream) (obj)).close();
            obj = new JSONObject(new String(abyte0, "UTF-8"));
        }
        catch (IOException ioexception)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Error loading butterfly file ".concat(s);
            } else
            {
                s = new String("Error loading butterfly file ");
            }
            Log.e("ButterflyAssetsLoader", s, ioexception);
            return null;
        }
        catch (JSONException jsonexception)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Error parsing json in butterfly file ".concat(s);
            } else
            {
                s = new String("Error parsing json in butterfly file ");
            }
            Log.e("ButterflyAssetsLoader", s, jsonexception);
            return null;
        }
        return ((JSONObject) (obj));
    }

    public final mlc a(String s, mld mld)
    {
        Object obj;
        mld = new mkt(mld);
        obj = a(s);
        String s1 = ((JSONObject) (obj)).optString("type");
        if (s1.equals("stage"))
        {
            break MISSING_BLOCK_LABEL_104;
        }
        mld = String.valueOf(s1);
        if (mld.length() == 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        mld = "Unexpected stage type: ".concat(mld);
_L1:
        throw new mlb(mld);
        try
        {
            mld = new String("Unexpected stage type: ");
        }
        // Misplaced declaration of an exception variable
        catch (mld mld)
        {
            s = String.valueOf(s);
            JSONObject jsonobject;
            ArrayList arraylist;
            JSONObject jsonobject1;
            int i;
            if (s.length() != 0)
            {
                s = "Error parsing butterfly file ".concat(s);
            } else
            {
                s = new String("Error parsing butterfly file ");
            }
            Log.e("ButterflyAssetsLoader", s, mld);
            return null;
        }
          goto _L1
        jsonobject = ((JSONObject) (obj)).optJSONObject("size");
        if (jsonobject != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        throw new mlb("Stage is missing size.");
        obj = ((JSONObject) (obj)).optJSONArray("animations");
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        throw new mlb("Stage is missing animations.");
        arraylist = new ArrayList(((JSONArray) (obj)).length());
        i = 0;
_L3:
        if (i >= ((JSONArray) (obj)).length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject1 = ((JSONArray) (obj)).optJSONObject(i);
        if (jsonobject1 != null)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        mld = String.valueOf(Integer.toString(i));
        if (mld.length() != 0)
        {
            mld = "Unexpected animation at index ".concat(mld);
        } else
        {
            mld = new String("Unexpected animation at index ");
        }
        throw new mlb(mld);
        arraylist.add(mld.a(jsonobject1));
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        mld = new mlc(mkt.b(jsonobject), arraylist);
        return mld;
    }
}
