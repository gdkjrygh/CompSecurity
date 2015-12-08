// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.TimeZone;

public final class guz
{

    public InputStream a;
    public InputStream b;
    public boolean c;
    public boolean d;
    public boolean e;
    public OutputStream f;
    public gvm g;
    public String h;
    public Long i;
    public TimeZone j;
    private final muz k;
    private final noz l;

    public guz(Context context)
    {
        k = (muz)olm.a(context, muz);
        l = noz.a(context, "JpegExifWriter", new String[0]);
        j = TimeZone.getDefault();
    }

    public final void a()
    {
        boolean flag1 = true;
        Object obj;
        InputStream inputstream;
        OutputStream outputstream;
        boolean flag;
        if (b != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "must specify a jpegImageSource");
        if (f != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.b(flag, "must specify an outputStream");
        obj = new mxm();
        if (a != null)
        {
            try
            {
                ((mxm) (obj)).a(a);
                if (c)
                {
                    ((mxm) (obj)).b();
                }
                if (d)
                {
                    int i1 = mxm.g;
                    ((mxm) (obj)).b(i1, ((mxm) (obj)).f(i1));
                }
                if (e)
                {
                    ((mxm) (obj)).v.d = null;
                }
            }
            catch (IOException ioexception) { }
        }
        if (g != null)
        {
            ((mxm) (obj)).a(((mxm) (obj)).a(mxm.a, Integer.valueOf(g.a)));
            ((mxm) (obj)).a(((mxm) (obj)).a(mxm.b, Integer.valueOf(g.b)));
        }
        if (!TextUtils.isEmpty(h))
        {
            ((mxm) (obj)).a(((mxm) (obj)).a(mxm.i, h));
        }
        ((mxm) (obj)).a(mxm.j, k.a(), TimeZone.getDefault());
        if (i != null)
        {
            ((mxm) (obj)).a(mxm.q, i.longValue(), j);
        }
        inputstream = b;
        outputstream = f;
        if (inputstream == null || outputstream == null)
        {
            throw new IllegalArgumentException("Argument is null");
        } else
        {
            obj = ((mxm) (obj)).a(outputstream);
            mxm.a(inputstream, ((OutputStream) (obj)));
            ((OutputStream) (obj)).flush();
            return;
        }
    }
}
