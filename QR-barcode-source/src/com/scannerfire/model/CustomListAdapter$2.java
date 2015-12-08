// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.scannerfire.model;

import android.app.Activity;
import android.util.Log;
import android.widget.Filter;
import com.google.zxing.Result;
import com.scannerfire.db.DbAdapter;
import java.util.ArrayList;
import java.util.Locale;

// Referenced classes of package com.scannerfire.model:
//            CustomListAdapter, QRModel

class this._cls0 extends Filter
{

    ArrayList original;
    final CustomListAdapter this$0;

    protected android.widget. performFiltering(CharSequence charsequence)
    {
        Log.d("", (new StringBuilder("filtering.....")).append(charsequence).toString());
        Object obj = new DbAdapter(a.getApplicationContext());
        ((DbAdapter) (obj)).open();
        original = ((DbAdapter) (obj)).getValues();
        ((DbAdapter) (obj)).close();
        obj = new android.widget.();
        ArrayList arraylist = new ArrayList();
        if (charsequence == null || charsequence.length() == 0)
        {
            obj.values = original;
            obj.count = original.size();
            return ((android.widget.) (obj));
        }
        int i = 0;
        do
        {
            if (i >= original.size())
            {
                obj.values = arraylist;
                obj.count = arraylist.size();
                return ((android.widget.) (obj));
            }
            QRModel qrmodel = (QRModel)original.get(i);
            if (qrmodel.getResult().getText().toLowerCase(Locale.US).contains(charsequence.toString().toLowerCase(Locale.US)))
            {
                Log.d("", (new StringBuilder("DATA ")).append(i).append(" -> ").append(qrmodel.getResult().getText()).toString());
                arraylist.add(qrmodel);
            }
            i++;
        } while (true);
    }

    protected void publishResults(CharSequence charsequence, android.widget. )
    {
        Log.d("", "PUBLISH RESULT");
        m = (ArrayList).values;
        notifyDataSetChanged();
    }

    ()
    {
        this$0 = CustomListAdapter.this;
        super();
    }
}
