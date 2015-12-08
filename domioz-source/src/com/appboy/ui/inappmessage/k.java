// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.app.Activity;
import android.os.AsyncTask;
import com.appboy.d;
import com.appboy.f.a;
import com.appboy.ui.d.b;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.appboy.ui.inappmessage:
//            a, l

final class k extends AsyncTask
{

    final com.appboy.ui.inappmessage.a a;

    private k(com.appboy.ui.inappmessage.a a1)
    {
        a = a1;
        super();
    }

    k(com.appboy.ui.inappmessage.a a1, byte byte0)
    {
        this(a1);
    }

    protected final Object doInBackground(Object aobj[])
    {
        aobj = (com.appboy.d.a[])aobj;
        com.appboy.f.a.a(com.appboy.ui.inappmessage.a.c(), "Starting asynchronous in-app message preparation.");
        aobj = ((Object []) (aobj[0]));
        if (!b.a(((com.appboy.d.a) (aobj)).j()) && ((com.appboy.d.a) (aobj)).o() == null)
        {
            ((com.appboy.d.a) (aobj)).a(d.a(((com.appboy.d.a) (aobj)).j()));
            return ((Object) (aobj));
        } else
        {
            com.appboy.f.a.a(com.appboy.ui.inappmessage.a.c(), "In-app message already contains image bitmap or has no image URL.  Not downloading image from URL.");
            return ((Object) (aobj));
        }
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (com.appboy.d.a)obj;
        com.appboy.f.a.a(com.appboy.ui.inappmessage.a.c(), "Finished asycnhronous in-app message preparation. Attempting to display in-app message.");
        if (obj != null)
        {
            com.appboy.ui.inappmessage.a.a(a).runOnUiThread(new l(this, ((com.appboy.d.a) (obj))));
            return;
        } else
        {
            com.appboy.f.a.d(com.appboy.ui.inappmessage.a.c(), "Cannot display the in-app message because the in-app message was null.");
            com.appboy.ui.inappmessage.a.b(a).set(false);
            return;
        }
    }
}
