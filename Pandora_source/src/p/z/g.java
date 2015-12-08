// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.z;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import p.r.c;
import p.r.h;
import p.r.i;
import p.x.d;
import p.x.j;
import p.x.k;
import p.x.o;

// Referenced classes of package p.z:
//            d

public class g extends o
    implements p.z.d
{
    public static class a
        implements k
    {

        public j a(Context context, p.x.c c1)
        {
            return new g(context, c1.a(p/x/d, java/io/InputStream));
        }

        public void a()
        {
        }

        public a()
        {
        }
    }


    public g(Context context, j j)
    {
        super(context, j);
    }

    protected c a(Context context, Uri uri)
    {
        return new i(context, uri);
    }

    protected c a(Context context, String s)
    {
        return new h(context.getApplicationContext().getAssets(), s);
    }
}
