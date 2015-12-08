// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.model;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;

// Referenced classes of package com.scannerfire.model:
//            ListenerObjects, BizCard

class this._cls0
    implements android.view.er
{

    final ListenerObjects this$0;

    public void onClick(View view)
    {
        if (value == null) goto _L2; else goto _L1
_L1:
        view = value;
        if (!view.startsWith("MECARD")) goto _L4; else goto _L3
_L3:
        Intent intent;
        int i;
        Log.d("", "MECARD");
        intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/raw_contact");
        view = view.split("(;)|(:)");
        i = 0;
_L10:
        if (i < view.length) goto _L6; else goto _L5
_L5:
        context.startActivity(intent);
_L8:
        return;
_L6:
        Log.d("", (new StringBuilder(String.valueOf(view[i]))).append("\n").toString());
        if (view[i].contains("N"))
        {
            intent.putExtra("name", view[i + 1]);
        }
        if (view[i].contains("TEL"))
        {
            intent.putExtra("phone", view[i + 1]);
        }
        if (view[i].contains("EMAIL"))
        {
            intent.putExtra("email", view[i + 1]);
        }
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (!view.startsWith("BEGIN:VCARD")) goto _L8; else goto _L7
_L7:
        Log.d("", "VCARD");
        Intent intent1 = new Intent("android.intent.action.INSERT");
        intent1.setType("vnd.android.cursor.dir/raw_contact");
        view = view.split("\n|(:)");
        int j = 0;
        do
        {
            if (j >= view.length)
            {
                context.startActivity(intent1);
                return;
            }
            Log.d("", (new StringBuilder(String.valueOf(view[j]))).append("\n").toString());
            if (view[j].contains("N"))
            {
                intent1.putExtra("name", view[j + 1]);
            }
            if (view[j].contains("TEL"))
            {
                intent1.putExtra("phone", view[j + 1]);
            }
            if (view[j].contains("EMAIL"))
            {
                intent1.putExtra("email", view[j + 1]);
            }
            j++;
        } while (true);
_L2:
        view = new Intent("android.intent.action.INSERT");
        view.setType("vnd.android.cursor.dir/contact");
        view.putExtra("phone", BizCard.getB());
        view.putExtra("name", (new StringBuilder(String.valueOf(BizCard.getN()))).append(" ").append(BizCard.getX()).toString());
        context.startActivity(view);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    ()
    {
        this$0 = ListenerObjects.this;
        super();
    }
}
