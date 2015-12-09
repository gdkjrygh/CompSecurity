// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.dominos.nina.persona:
//            DominosNinaPersona, NinaView, NinaHintsAdapter

class this._cls0
    implements Runnable
{

    final LayoutInflater inflater;
    final DominosNinaPersona this$0;
    final List val$hints;

    public void run()
    {
        boolean flag = false;
        DominosNinaPersona.access$700(DominosNinaPersona.this).removeAllViews();
        if (val$hints.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_398;
        }
        Object obj = (String)val$hints.get(0);
        if ('{' != ((String) (obj)).charAt(0))
        {
            break MISSING_BLOCK_LABEL_398;
        }
        Object obj1;
        Object obj2;
        JSONArray jsonarray;
        TextView textview;
        int i;
        try
        {
            obj1 = new JSONObject(((String) (obj)));
            obj = inflater.inflate(_hints, DominosNinaPersona.access$700(DominosNinaPersona.this), false);
            ((TextView)((View) (obj)).findViewById(_text)).setText(((JSONObject) (obj1)).getString("title"));
            ((TextView)((View) (obj)).findViewById(header_text)).setText(((JSONObject) (obj1)).getString("task_header"));
            obj2 = (LinearLayout)((View) (obj)).findViewById(contents_container);
            jsonarray = ((JSONObject) (obj1)).optJSONArray("task_content");
        }
        catch (JSONException jsonexception)
        {
            Log.w("DominosNinaPersona", "JSONException parsing hints");
            return;
        }
        if (jsonarray == null) goto _L2; else goto _L1
_L1:
        if (jsonarray.length() <= 0) goto _L2; else goto _L3
_L3:
        i = 0;
_L5:
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        textview = (TextView)inflater.inflate(_hint_item, ((android.view.ViewGroup) (obj2)), false);
        textview.setText(jsonarray.getString(i));
        ((LinearLayout) (obj2)).addView(textview);
        i++;
        if (true) goto _L5; else goto _L4
_L2:
        ((LinearLayout) (obj2)).setVisibility(8);
_L4:
        ((TextView)((View) (obj)).findViewById(eader_text)).setText(((JSONObject) (obj1)).getString("nav_header"));
        obj2 = (LinearLayout)((View) (obj)).findViewById(ontents_container);
        jsonarray = ((JSONObject) (obj1)).optJSONArray("nav_content");
        if (jsonarray == null) goto _L7; else goto _L6
_L6:
        if (jsonarray.length() <= 0) goto _L7; else goto _L8
_L8:
        i = ((flag) ? 1 : 0);
_L10:
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        textview = (TextView)inflater.inflate(_hint_item, ((android.view.ViewGroup) (obj2)), false);
        textview.setText(jsonarray.getString(i));
        ((LinearLayout) (obj2)).addView(textview);
        i++;
        if (true) goto _L10; else goto _L9
_L7:
        ((LinearLayout) (obj2)).setVisibility(8);
_L9:
        obj2 = (TextView)((View) (obj)).findViewById(r_text);
        obj1 = ((JSONObject) (obj1)).optString("footer");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        if (!"".equals(obj1))
        {
            break MISSING_BLOCK_LABEL_380;
        }
        ((View) (obj)).findViewById(r_container).setVisibility(8);
_L12:
        DominosNinaPersona.access$700(DominosNinaPersona.this).addView(((View) (obj)));
        return;
        ((TextView) (obj2)).setText(((CharSequence) (obj1)));
        if (true) goto _L12; else goto _L11
_L11:
        NinaHintsAdapter ninahintsadapter = new NinaHintsAdapter(DominosNinaPersona.access$800(DominosNinaPersona.this).getContext(), new ArrayList(val$hints));
        DominosNinaPersona.access$800(DominosNinaPersona.this).setAdapter(ninahintsadapter);
        DominosNinaPersona.access$700(DominosNinaPersona.this).addView(DominosNinaPersona.access$800(DominosNinaPersona.this));
        return;
    }

    ()
    {
        this$0 = final_dominosninapersona;
        val$hints = List.this;
        super();
        inflater = LayoutInflater.from(DominosNinaPersona.access$000(DominosNinaPersona.this).getContext());
    }
}
