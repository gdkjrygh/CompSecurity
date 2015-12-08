// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.model;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.scannerfire.model:
//            ListenerObjects

class this._cls0
    implements android.view.er
{

    final ListenerObjects this$0;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.EDIT");
        view.setType("vnd.android.cursor.item/event");
        String as[] = value.split("\n|(:)");
        int i = 0;
        do
        {
            if (i >= as.length)
            {
                context.startActivity(view);
                return;
            }
            if (as[i].contains("DTSTART"))
            {
                Object obj = as[i + 1].replace("T", "").replace("00Z", "");
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
            }
            if (as[i].contains("DTEND"))
            {
                obj = as[i + 1].replace("T", "").replace("00Z", "");
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
            }
            if (as[i].contains("LOCATION"))
            {
                Log.d("", (new StringBuilder("Luogo ")).append(as[i + 1]).toString());
                view.putExtra("eventLocation", as[i + 1]);
            }
            if (as[i].contains("DESCRIPTION"))
            {
                Log.d("", (new StringBuilder("Descrizione ")).append(as[i + 1]).toString());
                view.putExtra("description", as[i + 1]);
            }
            if (as[i].contains("SUMMARY"))
            {
                Log.d("", (new StringBuilder("Titolo ")).append(as[i + 1]).toString());
                view.putExtra("title", as[i + 1]);
            }
            i++;
        } while (true);
    }

    ()
    {
        this$0 = ListenerObjects.this;
        super();
    }
}
