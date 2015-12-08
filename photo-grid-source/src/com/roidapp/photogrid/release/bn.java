// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.DialogInterface;
import android.view.View;
import com.roidapp.photogrid.common.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.photogrid.release:
//            bj, ImageSelector

final class bn
    implements android.content.DialogInterface.OnClickListener
{

    final View a;
    final bj b;

    bn(bj bj1, View view)
    {
        b = bj1;
        a = view;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        int j;
        j = 0;
        dialoginterface = a.getTag().toString();
        JSONArray jsonarray;
        JSONArray jsonarray1;
        jsonarray = new JSONArray();
        jsonarray1 = m.a(bj.d(b));
        i = 0;
_L2:
        String s;
        if (i >= jsonarray1.length())
        {
            break MISSING_BLOCK_LABEL_108;
        }
        s = jsonarray1.getJSONObject(i).getString("folder");
        int k = j;
        if (s.equals(dialoginterface))
        {
            break MISSING_BLOCK_LABEL_160;
        }
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("folder", s);
        jsonarray.put(j, jsonobject);
        k = j + 1;
        break MISSING_BLOCK_LABEL_160;
        try
        {
            dialoginterface = (new StringBuilder("#")).append(jsonarray.toString()).toString();
            m.a(bj.d(b), dialoginterface);
            ((ImageSelector)bj.d(b)).d();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            dialoginterface.printStackTrace();
        }
        return;
        i++;
        j = k;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
