// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.QRBS.activity:
//            MyResultActivity

class val.text
    implements android.view.
{

    final MyResultActivity this$0;
    private final String val$text;

    public void onClick(View view)
    {
        String as[];
        int i;
        view = new Intent("android.intent.action.EDIT");
        view.setType("vnd.android.cursor.item/event");
        as = val$text.split("\n|(:)");
        i = 0;
_L5:
        if (i >= as.length)
        {
            startActivity(view);
            return;
        }
        if (!as[i].contains("DTSTART")) goto _L2; else goto _L1
_L1:
        Object obj = as[i + 1];
        if (obj != null) goto _L4; else goto _L3
_L3:
        i++;
          goto _L5
_L4:
        obj = ((String) (obj)).replace("T", "").replace("00Z", "");
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyyMMddHHmm", Locale.getDefault());
        try
        {
            obj = simpledateformat.parse(((String) (obj)));
            Log.d("", (new StringBuilder("START ")).append(((Date) (obj)).getTime()).toString());
            view.putExtra("beginTime", ((Date) (obj)).getTime());
        }
        catch (ParseException parseexception)
        {
            parseexception.printStackTrace();
        }
_L2:
        if (!as[i].contains("DTEND"))
        {
            break MISSING_BLOCK_LABEL_247;
        }
        obj = as[i + 1];
        if (obj == null) goto _L3; else goto _L6
_L6:
        obj = ((String) (obj)).replace("T", "").replace("00Z", "");
        simpledateformat = new SimpleDateFormat("yyyyMMddHHmm", Locale.getDefault());
        try
        {
            obj = simpledateformat.parse(((String) (obj)));
            Log.d("", (new StringBuilder("END ")).append(((Date) (obj)).getTime()).toString());
            view.putExtra("endTime", ((Date) (obj)).getTime());
        }
        catch (ParseException parseexception1)
        {
            parseexception1.printStackTrace();
        }
        if (as[i].contains("LOCATION"))
        {
            Log.d("", (new StringBuilder("Luogo ")).append(as[i + 1]).toString());
            if (as[i + 1] != null)
            {
                view.putExtra("eventLocation", as[i + 1]);
            }
        }
        if (as[i].contains("DESCRIPTION"))
        {
            Log.d("", (new StringBuilder("Descrizione ")).append(as[i + 1]).toString());
            if (as[i + 1] != null)
            {
                view.putExtra("description", as[i + 1]);
            }
        }
        if (as[i].contains("SUMMARY"))
        {
            Log.d("", (new StringBuilder("Titolo ")).append(as[i + 1]).toString());
            if (as[i + 1] != null)
            {
                view.putExtra("title", as[i + 1]);
            }
        }
          goto _L3
    }

    ()
    {
        this$0 = final_myresultactivity;
        val$text = String.this;
        super();
    }
}
