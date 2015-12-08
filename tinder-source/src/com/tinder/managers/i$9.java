// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.content.ContentValues;
import android.os.AsyncTask;
import com.tinder.b.l;

// Referenced classes of package com.tinder.managers:
//            i

public final class it> extends AsyncTask
{

    final i a;

    protected final Object doInBackground(Object aobj[])
    {
        String as[] = (String[])aobj;
        aobj = as[0];
        String s = as[1];
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("draft_msg", s);
        l.a().a("matches", contentvalues, (new StringBuilder("id='")).append(((String) (aobj))).append('\'').toString());
        return null;
    }

    public alues(i j)
    {
        a = j;
        super();
    }
}
