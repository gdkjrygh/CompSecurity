// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.instagram;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.roidapp.cloudlib.instagram:
//            InstagramListCloud

final class i
    implements android.widget.AdapterView.OnItemClickListener
{

    final InstagramListCloud a;

    i(InstagramListCloud instagramlistcloud)
    {
        a = instagramlistcloud;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int j, long l)
    {
        switch (j)
        {
        default:
            return;

        case 0: // '\0'
            InstagramListCloud.a(a, true);
            return;

        case 1: // '\001'
            InstagramListCloud.a(a, false);
            break;
        }
    }
}
