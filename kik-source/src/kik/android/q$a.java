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
//            q

private static final class c extends bf
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

    public Context(Context context, Uri uri, p p1)
    {
        b = context;
        a = uri;
        c = p1;
    }
}
