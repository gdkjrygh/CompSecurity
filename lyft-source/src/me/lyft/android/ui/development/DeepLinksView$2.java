// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;

// Referenced classes of package me.lyft.android.ui.development:
//            DeepLinksView

class val.adapter
    implements android.widget.emClickListener
{

    final DeepLinksView this$0;
    final ArrayAdapter val$adapter;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        deepLinkEditText.setText("");
        deepLinkEditText.append((CharSequence)val$adapter.getItem(i));
    }

    ()
    {
        this$0 = final_deeplinksview;
        val$adapter = ArrayAdapter.this;
        super();
    }
}
