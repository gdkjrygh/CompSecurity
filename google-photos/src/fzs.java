// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

final class fzs
    implements fzj
{

    private final ContentResolver a;
    private final fzl b;
    private final noz c;

    public fzs(Context context)
    {
        this(context, context.getContentResolver());
    }

    private fzs(Context context, ContentResolver contentresolver)
    {
        a = contentresolver;
        b = (fzl)olm.a(context, fzl);
        c = noz.a(context, 3, "ExifInfoFetcher", new String[0]);
    }

    private Long a(Uri uri)
    {
        ParcelFileDescriptor parcelfiledescriptor = a.openFileDescriptor(uri, "r");
        if (parcelfiledescriptor != null) goto _L2; else goto _L1
_L1:
        Object obj = parcelfiledescriptor;
        long l;
        try
        {
            throw new FileNotFoundException("Got null FileDescriptor from ContentResolver");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally { }
_L4:
        obj = parcelfiledescriptor;
        if (!c.a())
        {
            break MISSING_BLOCK_LABEL_49;
        }
        obj = parcelfiledescriptor;
        noy.a("uri", uri);
        p.a(parcelfiledescriptor);
        return null;
_L2:
        obj = parcelfiledescriptor;
        l = parcelfiledescriptor.getStatSize();
        p.a(parcelfiledescriptor);
        return Long.valueOf(l);
        uri;
        obj = null;
        p.a(((ParcelFileDescriptor) (obj)));
        throw uri;
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        parcelfiledescriptor = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private mxm b(Uri uri)
    {
        java.io.InputStream inputstream;
        mxm mxm1;
        mxm1 = new mxm();
        inputstream = null;
        java.io.InputStream inputstream1 = a.openInputStream(uri);
        if (inputstream1 != null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        inputstream = inputstream1;
        Object obj = inputstream1;
        try
        {
            throw new FileNotFoundException("Got null InputStream from ContentResolver");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = inputstream;
        }
        finally { }
        if (!c.a())
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj = inputstream;
        noy.a("uri", uri);
        p.a(inputstream);
        return mxm1;
        inputstream = inputstream1;
        obj = inputstream1;
        mxm1.a(inputstream1);
        p.a(inputstream1);
        return mxm1;
        uri;
        obj = null;
        p.a(((java.io.Closeable) (obj)));
        throw uri;
    }

    private Point c(Uri uri)
    {
        Point point;
        try
        {
            point = b.a(a, uri);
        }
        catch (IOException ioexception)
        {
            if (c.a())
            {
                noy.a("uri", uri);
            }
            return null;
        }
        return point;
    }

    public final fzw a(fzi fzi1, int i)
    {
        Uri uri = Uri.parse(fzi1.b);
        fzy fzy1 = new fzy();
        fzi1 = b;
        mxm mxm1 = b(uri);
        fzi1 = mxm1.c();
        if (fzi1 != null)
        {
            if (b.a(Double.valueOf(fzi1[0])) > 0.0D)
            {
                fzy1.a = Double.valueOf(fzi1[0]);
            }
            if (b.a(Double.valueOf(fzi1[1])) > 0.0D)
            {
                fzy1.b = Double.valueOf(fzi1[1]);
            }
        }
        i = mxm.g;
        fzi1 = mxm1.a(i, mxm1.f(i));
        if (fzi1 != null && (((mxx) (fzi1)).f instanceof byte[]))
        {
            fzi1 = (byte[])((mxx) (fzi1)).f;
        } else
        {
            fzi1 = null;
        }
        if (fzi1 == null || fzi1.length <= 0)
        {
            fzi1 = null;
        } else
        {
            fzi1 = new Byte(fzi1[0]);
        }
        if (fzi1 == null)
        {
            fzi1 = null;
        } else
        {
            fzi1 = Integer.valueOf(fzi1.byteValue());
        }
        fzy1.f = fzi1;
        fzy1.c = fzt.a(mxm1);
        fzy1.s = Long.valueOf(0L);
        fzy1.d = mxm1.c(mxm.a);
        fzy1.e = mxm1.c(mxm.b);
        fzy1.j = fzl.a(mxm1.e(mxm.t));
        fzy1.k = fzl.a(mxm1.e(mxm.r));
        fzy1.l = fzl.a(mxm1.e(mxm.o));
        fzy1.m = mxm1.d(mxm.p);
        fzy1.n = mxm1.b(mxm.d);
        fzy1.o = mxm1.b(mxm.e);
        fzy1.p = mxm1.d(mxm.s);
        fzl.a(fzy1, c(uri));
        fzy1.i = a(uri);
        return fzy1.a();
    }

    public final boolean a(fzi fzi1)
    {
        return false;
    }
}
