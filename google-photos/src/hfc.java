// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ClipData;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;

final class hfc
{

    private static final String b[] = {
        "text/uri-list"
    };
    final ArrayList a = new ArrayList();

    public hfc()
    {
    }

    public final ClipData a()
    {
        ClipData clipdata;
        Iterator iterator;
        boolean flag;
        if (!a.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "Cannot build empty ClipData.");
        iterator = a.iterator();
        clipdata = null;
        while (iterator.hasNext()) 
        {
            android.content.ClipData.Item item = new android.content.ClipData.Item((Uri)iterator.next());
            if (clipdata == null)
            {
                clipdata = new ClipData(null, b, item);
            } else
            {
                clipdata.addItem(item);
            }
        }
        return clipdata;
    }

}
