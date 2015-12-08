// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import android.content.Context;
import android.net.Uri;
import com.kik.g.p;
import com.kik.sdkutils.y;
import java.io.File;
import kik.android.util.bf;
import kik.android.util.e;

// Referenced classes of package kik.android:
//            r

public final class q
{
    private static final class a extends bf
    {

        private Uri a;
        private Context b;
        private p c;

        protected final Object doInBackground(Object aobj[])
        {
            b.grantUriPermission(b.getApplicationContext().getPackageName(), a, 1);
            aobj = e.a(a, b);
            if (y.a(21))
            {
                b.revokeUriPermission(a, 1);
            }
            return ((Object) (aobj));
        }

        protected final void onCancelled(Object obj)
        {
            obj = (File)obj;
            super.onCancelled(obj);
            if (obj != null)
            {
                ((File) (obj)).delete();
            }
        }

        protected final void onPostExecute(Object obj)
        {
            obj = (File)obj;
            c.a(obj);
        }

        public a(Context context, Uri uri, p p1)
        {
            b = context;
            a = uri;
            c = p1;
        }
    }


    private static q a;
    private a b;
    private p c;
    private String d;

    public q()
    {
    }

    static String a(q q1)
    {
        q1.d = null;
        return null;
    }

    public static q a()
    {
        if (a == null)
        {
            a = new q();
        }
        return a;
    }

    public final p a(Uri uri, Context context)
    {
        if (d != null && d.equals(uri.toString()))
        {
            return c;
        } else
        {
            b();
            c = new p();
            c.a(new r(this));
            b = new a(context, uri, c);
            b.a(new String[0]);
            d = uri.toString();
            return c;
        }
    }

    public final void b()
    {
        if (d != null)
        {
            d = null;
            b.cancel(true);
            c.a(new Throwable("task canceled"));
        }
    }
}
