// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.inbox;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.content.f;
import android.support.v4.content.i;
import com.pandora.android.provider.b;

// Referenced classes of package com.pandora.android.inbox:
//            c, a, b

class a
    implements android.support.v4.app.._cls1
{

    final c a;

    public void a(i i, Cursor cursor)
    {
        if (cursor == null || cursor.getCount() == 0)
        {
            c.a(a).changeCursor(null);
            c.a(a, true);
            return;
        } else
        {
            c.a(a, false);
            c.a(a).changeCursor(cursor);
            return;
        }
    }

    public i onCreateLoader(int i, Bundle bundle)
    {
        return new f(b.a.h(), b.a, null, b.q, null, b.t);
    }

    public void onLoadFinished(i i, Object obj)
    {
        a(i, (Cursor)obj);
    }

    public void onLoaderReset(i i)
    {
        c.a(a, true);
        c.a(a).changeCursor(null);
    }

    (c c1)
    {
        a = c1;
        super();
    }
}
