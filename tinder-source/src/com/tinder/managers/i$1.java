// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.os.AsyncTask;
import com.tinder.b.g;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.tinder.managers:
//            i

final class it> extends AsyncTask
{

    final i a;

    protected final Object doInBackground(Object aobj[])
    {
        i.a(a);
        aobj = g.e();
        Collections.sort(((List) (aobj)));
        return ((Object) (aobj));
    }

    public final void onPostExecute(Object obj)
    {
        obj = (List)obj;
        a.a(((List) (obj)), new i.c() {

            final i._cls1 a;

            public final void a()
            {
                i.b(a.a);
            }

            
            {
                a = i._cls1.this;
                super();
            }
        });
    }

    _cls1.a(i j)
    {
        a = j;
        super();
    }
}
