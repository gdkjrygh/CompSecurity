// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import com.QRBS.QuickAction.QuickActionPopup;
import com.QRBS.activity.Visualizza;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;
import com.scannerfire.model.CustomListAdapter;

// Referenced classes of package com.scannerfire.utils:
//            Utils, ResultUtils, EncodeUtils

class this._cls1
    implements android.content.rface.OnClickListener
{

    final dismiss this$1;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }

    l.position()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/scannerfire/utils/Utils$2

/* anonymous class */
    class Utils._cls2
        implements com.QRBS.QuickAction.QuickActionPopup.OnActionItemClickListener
    {

        private final CustomListAdapter val$arrayAdapter;
        private final Utils.MODE val$mode;
        private final ParsedResult val$parsed;
        private final int val$position;
        private final Result val$result;
        private final ResultUtils val$ru;
        private final Activity val$startA;

        public void onItemClick(QuickActionPopup quickactionpopup, int i, int j)
        {
            switch (j)
            {
            default:
                return;

            case 1: // '\001'
                quickactionpopup = new android.app.AlertDialog.Builder(startA);
                quickactionpopup.setTitle(startA.getResources().getString(0x7f080142));
                quickactionpopup.setMessage(startA.getResources().getString(0x7f08015a));
                quickactionpopup.setPositiveButton(startA.getResources().getString(0x7f0800b8), new Utils._cls2._cls1());
                quickactionpopup.setNegativeButton(startA.getResources().getString(0x7f0800b7), new Utils._cls2._cls2());
                quickactionpopup.create().show();
                return;

            case 0: // '\0'
                quickactionpopup = Utils.makeBundle(result);
                Intent intent = new Intent(startA, com/QRBS/activity/Visualizza);
                intent.putExtra("bundle", quickactionpopup);
                startA.startActivity(intent);
                return;

            case 2: // '\002'
                ru.makeAction(parsed.getType().toString(), result.getBarcodeFormat().toString(), result.getText(), result);
                return;

            case 3: // '\003'
                quickactionpopup = Utils.getTextFromResult(mode, result);
                (new EncodeUtils(startA)).start(result.getText(), quickactionpopup);
                return;

            case 4: // '\004'
                quickactionpopup = Utils.getTextFromResult(mode, result);
                break;
            }
            Utils.copyToClipboard(startA.getApplicationContext(), quickactionpopup);
        }

            
            {
                startA = activity;
                result = result1;
                ru = resultutils;
                parsed = parsedresult;
                mode = mode1;
                arrayAdapter = customlistadapter;
                position = i;
                super();
            }

        // Unreferenced inner class com/scannerfire/utils/Utils$2$1

/* anonymous class */
        class Utils._cls2._cls1
            implements android.content.DialogInterface.OnClickListener
        {

            final Utils._cls2 this$1;
            private final CustomListAdapter val$arrayAdapter;
            private final int val$position;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                arrayAdapter.remove(position);
                arrayAdapter.notifyDataSetChanged();
                dialoginterface.dismiss();
            }

                    
                    {
                        this$1 = Utils._cls2.this;
                        arrayAdapter = customlistadapter;
                        position = i;
                        super();
                    }
        }

    }

}
