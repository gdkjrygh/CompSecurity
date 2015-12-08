// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.adapters;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.infrastructure.s3.ConfigDTO;

// Referenced classes of package me.lyft.android.adapters:
//            ConfigAdapter

class this._cls0 extends Filter
{

    final ConfigAdapter this$0;

    protected android.widget.ults performFiltering(CharSequence charsequence)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = ConfigAdapter.access$000(ConfigAdapter.this).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ConfigDTO configdto = (ConfigDTO)iterator.next();
            if (configdto.getDisplayName().toLowerCase().contains(charsequence.toString().toLowerCase()))
            {
                arraylist.add(configdto);
            }
        } while (true);
        charsequence = new android.widget.ults();
        charsequence.count = arraylist.size();
        charsequence.values = arraylist;
        return charsequence;
    }

    protected void publishResults(CharSequence charsequence, android.widget.ults ults)
    {
        ConfigAdapter.access$102(ConfigAdapter.this, (List)ults.values);
        notifyDataSetChanged();
    }

    TO()
    {
        this$0 = ConfigAdapter.this;
        super();
    }
}
