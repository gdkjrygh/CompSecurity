// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.widget.ListView;

// Referenced classes of package kik.android.util:
//            bv

public final class bu
{

    public static void a(ListView listview, int i)
    {
        if (listview != null)
        {
            listview.setTranscriptMode(0);
            if (i != 0)
            {
                listview.post(new bv(listview, i));
                return;
            }
        }
    }
}
