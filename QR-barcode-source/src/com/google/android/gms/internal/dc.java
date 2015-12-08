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
//            gv, gj, bl, gs, 
//            gb

public class dc
{

    private final Context mContext;
    private final gv md;
    private final Map qM;
    private String qN;
    private long qO;
    private long qP;
    private String qQ;
    private String qR;

    public dc(gv gv1, Map map)
    {
        md = gv1;
        qM = map;
        mContext = gv1.dz();
        bG();
    }

    private String A(String s)
    {
        if (TextUtils.isEmpty((CharSequence)qM.get(s)))
        {
            return "";
        } else
        {
            return (String)qM.get(s);
        }
    }

    static Context a(dc dc1)
    {
        return dc1.mContext;
    }

    static gv b(dc dc1)
    {
        return dc1.md;
    }

    private void bG()
    {
        qN = A("description");
        qQ = A("summary");
        qO = gj.O((String)qM.get("start"));
        qP = gj.O((String)qM.get("end"));
        qR = A("location");
    }

    Intent createIntent()
    {
        Intent intent = (new Intent("android.intent.action.EDIT")).setData(android.provider.CalendarContract.Events.CONTENT_URI);
        intent.putExtra("title", qQ);
        intent.putExtra("eventLocation", qR);
        intent.putExtra("description", qN);
        intent.putExtra("beginTime", qO);
        intent.putExtra("endTime", qP);
        intent.setFlags(0x10000000);
        return intent;
    }

    public void execute()
    {
        if (!(new bl(mContext)).bo())
        {
            gs.W("This feature is not available on this version of the device.");
            return;
        } else
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(mContext);
            builder.setTitle(gb.c(com.google.android.gms.R.string.create_calendar_title, "Create calendar event"));
            builder.setMessage(gb.c(com.google.android.gms.R.string.create_calendar_message, "Allow Ad to create a calendar event?"));
            builder.setPositiveButton(gb.c(com.google.android.gms.R.string.accept, "Accept"), new android.content.DialogInterface.OnClickListener() {

                final dc qS;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = qS.createIntent();
                    dc.a(qS).startActivity(dialoginterface);
                }

            
            {
                qS = dc.this;
                super();
            }
            });
            builder.setNegativeButton(gb.c(com.google.android.gms.R.string.decline, "Decline"), new android.content.DialogInterface.OnClickListener() {

                final dc qS;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dc.b(qS).b("onCalendarEventCanceled", new JSONObject());
                }

            
            {
                qS = dc.this;
                super();
            }
            });
            builder.create().show();
            return;
        }
    }
}
