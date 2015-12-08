// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            gu, gi, bl, gr, 
//            ga

public class dh
{

    private final Context mContext;
    private final gu mo;
    private final Map rd;
    private String re;
    private long rf;
    private long rg;
    private String rh;
    private String ri;

    public dh(gu gu1, Map map)
    {
        mo = gu1;
        rd = map;
        mContext = gu1.dI();
        bQ();
    }

    private String A(String s)
    {
        if (TextUtils.isEmpty((CharSequence)rd.get(s)))
        {
            return "";
        } else
        {
            return (String)rd.get(s);
        }
    }

    static Context a(dh dh1)
    {
        return dh1.mContext;
    }

    static gu b(dh dh1)
    {
        return dh1.mo;
    }

    private void bQ()
    {
        re = A("description");
        rh = A("summary");
        rf = gi.O((String)rd.get("start"));
        rg = gi.O((String)rd.get("end"));
        ri = A("location");
    }

    Intent createIntent()
    {
        Intent intent = (new Intent("android.intent.action.EDIT")).setData(android.provider.CalendarContract.Events.CONTENT_URI);
        intent.putExtra("title", rh);
        intent.putExtra("eventLocation", ri);
        intent.putExtra("description", re);
        intent.putExtra("beginTime", rf);
        intent.putExtra("endTime", rg);
        intent.setFlags(0x10000000);
        return intent;
    }

    public void execute()
    {
        if (!(new bl(mContext)).bt())
        {
            gr.W("This feature is not available on this version of the device.");
            return;
        } else
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(mContext);
            builder.setTitle(ga.c(com.google.android.gms.R.string.create_calendar_title, "Create calendar event"));
            builder.setMessage(ga.c(com.google.android.gms.R.string.create_calendar_message, "Allow Ad to create a calendar event?"));
            builder.setPositiveButton(ga.c(com.google.android.gms.R.string.accept, "Accept"), new android.content.DialogInterface.OnClickListener() {

                final dh rj;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = rj.createIntent();
                    dh.a(rj).startActivity(dialoginterface);
                }

            
            {
                rj = dh.this;
                super();
            }
            });
            builder.setNegativeButton(ga.c(com.google.android.gms.R.string.decline, "Decline"), new android.content.DialogInterface.OnClickListener() {

                final dh rj;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dh.b(rj).b("onCalendarEventCanceled", new JSONObject());
                }

            
            {
                rj = dh.this;
                super();
            }
            });
            builder.create().show();
            return;
        }
    }
}
