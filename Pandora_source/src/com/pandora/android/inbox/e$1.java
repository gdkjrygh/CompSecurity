// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.inbox;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;

// Referenced classes of package com.pandora.android.inbox:
//            e

class r extends AsyncQueryHandler
{

    final e a;

    protected void onDeleteComplete(int i, Object obj, int j)
    {
        if (i == 0)
        {
            startDelete(1, null, a, null, null);
            a.a(null);
        }
    }

    r(e e1, ContentResolver contentresolver)
    {
        a = e1;
        super(contentresolver);
    }
}
