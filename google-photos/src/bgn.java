// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.consumerphotoeditor.contentprovider.CachedFileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.CancellationException;

public final class bgn extends mtf
{

    private final orr a;
    private final Uri b;
    private final noz c;
    private final osu j;
    private final oti k;
    private Uri l;

    public bgn(Context context, orr orr1, Uri uri, Uri uri1, osu osu1)
    {
        super(context, "RenderVideoTask");
        a = orr1;
        b = uri;
        l = uri1;
        j = osu1;
        c = noz.a(context, "RenderVideoTask", new String[0]);
        k = new oti(osu1);
    }

    private void f()
    {
        Object obj;
        Object obj1;
        byte abyte0[];
        abyte0 = null;
        obj = null;
        obj1 = ouj.a(d(), b, a.e, a.f - 1L);
        oul oul1 = new oul(((ouj) (obj1)).a());
        obj1 = obj;
        if (!b.c(l)) goto _L2; else goto _L1
_L1:
        obj1 = obj;
        abyte0 = g();
        obj1 = obj;
        l = CachedFileProvider.a(d(), abyte0);
        obj1 = obj;
        obj = new FileOutputStream(abyte0);
_L5:
        obj1 = obj;
        abyte0 = new byte[4096];
_L4:
        obj1 = obj;
        if (super.g)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        int i = oul1.read(abyte0);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        ((OutputStream) (obj)).write(abyte0, 0, i);
        if (true) goto _L4; else goto _L3
        obj;
        abyte0 = ((byte []) (obj1));
        obj1 = oul1;
_L6:
        if (abyte0 != null)
        {
            abyte0.close();
        }
        p.a(((java.io.Closeable) (obj1)));
        throw obj;
_L2:
        obj1 = obj;
        if (!"file".equals(l.getScheme()))
        {
            break MISSING_BLOCK_LABEL_192;
        }
        obj1 = obj;
        obj = new FileOutputStream(l.getPath());
          goto _L5
        obj1 = obj;
        if (!"content".equals(l.getScheme()))
        {
            break MISSING_BLOCK_LABEL_229;
        }
        obj1 = obj;
        obj = d().getContentResolver().openOutputStream(l);
          goto _L5
        obj1 = obj;
        String s = String.valueOf(l);
        obj1 = obj;
        throw new UnsupportedOperationException((new StringBuilder(String.valueOf(s).length() + 24)).append("Unsupported output URI: ").append(s).toString());
_L3:
        obj1 = obj;
        if (!super.g)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        obj1 = obj;
        throw new CancellationException("Render cancelled");
        if (obj != null)
        {
            ((OutputStream) (obj)).close();
        }
        p.a(oul1);
        return;
        obj;
        obj1 = null;
          goto _L6
    }

    private String g()
    {
        String s;
        try
        {
            s = File.createTempFile("consumereditor_out", ".mp4", d().getCacheDir()).getAbsolutePath();
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return s;
    }

    protected final mue a()
    {
        j.a(k, 0x7fffffff);
_L2:
        boolean flag;
        if (super.g)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = k.c();
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        k.a(100L);
        continue; /* Loop/switch isn't completed */
        Object obj;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
        if (super.g)
        {
            throw new CancellationException("Render cancelled");
        }
        break MISSING_BLOCK_LABEL_99;
        obj;
        mue mue1 = new mue(0, ((Exception) (obj)), "Error saving video");
        k.d();
        j.c(k);
        return mue1;
        f();
        k.d();
        j.c(k);
        mue mue2 = new mue(true);
        mue2.a().putParcelable("result_output_uri", l);
        return mue2;
        mue2;
        k.d();
        j.c(k);
        throw mue2;
    }

    protected final void b()
    {
        super.h = true;
    }
}
