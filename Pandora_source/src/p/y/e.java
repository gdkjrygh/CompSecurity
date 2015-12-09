// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.y;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import p.r.c;
import p.r.d;
import p.x.j;
import p.x.k;
import p.x.o;

// Referenced classes of package p.y:
//            b

public class e extends o
    implements b
{
    public static class a
        implements k
    {

        public j a(Context context, p.x.c c1)
        {
            return new e(context, c1.a(p/x/d, android/os/ParcelFileDescriptor));
        }

        public void a()
        {
        }

        public a()
        {
        }
    }


    public e(Context context, j j)
    {
        super(context, j);
    }

    protected c a(Context context, Uri uri)
    {
        return new p.r.e(context, uri);
    }

    protected c a(Context context, String s)
    {
        return new d(context.getApplicationContext().getAssets(), s);
    }
}
