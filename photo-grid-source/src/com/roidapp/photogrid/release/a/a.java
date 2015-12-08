// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release.a;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.a.k;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.t;
import com.roidapp.baselib.e.r;
import com.roidapp.baselib.e.s;
import com.roidapp.cloudlib.al;
import com.roidapp.photogrid.release.StickerInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a
    implements s
{

    public static final String a = (new StringBuilder("Jamin + ")).append(com/roidapp/photogrid/release/a/a.getSimpleName()).toString();
    private r b;
    private File c;

    public a()
    {
    }

    private static List a(String s1)
    {
        if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        ArrayList arraylist = new ArrayList();
        JSONObject jsonobject;
        int i;
        try
        {
            s1 = (new JSONObject(s1)).optJSONArray("data");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return null;
        }
        if (s1 == null) goto _L1; else goto _L3
_L3:
        i = 0;
_L5:
        if (i >= s1.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = s1.optJSONObject(i);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        arraylist.add(new StickerInfo(jsonobject));
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        return arraylist;
    }

    public final void a(int i, Exception exception)
    {
    }

    public final void a(File file)
    {
        c = file;
        b = new r(al.f, this);
        t.a().execute(b);
    }

    public final void a(Object obj)
    {
        obj = (String)obj;
        if (c != null)
        {
            obj = a(((String) (obj)));
            (new StringBuilder("stickerInfoList.toJson ------------- ")).append((new k()).a(obj));
            com.roidapp.baselib.d.a.a((new k()).a(obj), c, "UTF-8");
            long l = System.currentTimeMillis();
            PreferenceManager.getDefaultSharedPreferences(aj.a()).edit().putLong("sticker_check_cycle", l).apply();
        }
    }

}
