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

final class a
    implements a
{

    final a a;

    public final void a()
    {
        i.b(a.a);
    }

    >(> >)
    {
        a = >;
        super();
    }

    // Unreferenced inner class com/tinder/managers/i$1

/* anonymous class */
    final class i._cls1 extends AsyncTask
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
            a.a(((List) (obj)), new i._cls1._cls1(this));
        }

            
            {
                a = j;
                super();
            }
    }

}
