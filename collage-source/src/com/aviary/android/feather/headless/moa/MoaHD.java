// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.moa;

import com.aviary.android.feather.headless.a;
import com.aviary.android.feather.headless.filters.NativeFilterProxy;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.Serializable;
import org.json.JSONException;

// Referenced classes of package com.aviary.android.feather.headless.moa:
//            d

public class MoaHD
    implements Serializable
{

    private long a;
    private boolean b;

    public MoaHD()
    {
        a = m_nativeCtor();
        b = false;
    }

    static int a(android.graphics.Bitmap.CompressFormat compressformat)
    {
        static class _cls1
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[android.graphics.Bitmap.Config.values().length];
                try
                {
                    b[android.graphics.Bitmap.Config.ARGB_8888.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[android.graphics.Bitmap.Config.RGB_565.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[android.graphics.Bitmap.Config.ALPHA_8.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    b[android.graphics.Bitmap.Config.ARGB_4444.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                a = new int[android.graphics.Bitmap.CompressFormat.values().length];
                try
                {
                    a[android.graphics.Bitmap.CompressFormat.JPEG.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[android.graphics.Bitmap.CompressFormat.PNG.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.aviary.android.feather.headless.moa._cls1.a[compressformat.ordinal()])
        {
        case 1: // '\001'
        default:
            return 0;

        case 2: // '\002'
            return 1;
        }
    }

    private native int m_height(long l);

    private native void m_nativeApplyActions(long l, String s);

    private native long m_nativeCtor();

    private native void m_nativeDispose(long l);

    private native boolean m_nativeIsLoaded(long l);

    private native boolean m_nativeIsValid(long l);

    private native int m_nativeLoad(long l, int i);

    private native int m_nativeLoad(long l, FileDescriptor filedescriptor);

    private native int m_nativeLoad(long l, InputStream inputstream, byte abyte0[]);

    private native int m_nativeLoad(long l, String s);

    private native int m_nativeSave(long l, String s);

    private native int m_nativeSaveWithQualityAndConfig(long l, String s, int i, int j);

    private native int m_nativeUnload(long l);

    static native void m_setMaxMegaPixels(long l, int i);

    private native int m_width(long l);

    public void a(d d)
        throws JSONException
    {
        b(NativeFilterProxy.a(d));
    }

    public void a(FileDescriptor filedescriptor)
        throws a
    {
        int i = m_nativeLoad(a, filedescriptor);
        if (i > 0)
        {
            throw com.aviary.android.feather.headless.a.a(i);
        } else
        {
            return;
        }
    }

    public void a(InputStream inputstream)
        throws a
    {
        if (inputstream == null)
        {
            throw com.aviary.android.feather.headless.a.a(1);
        }
        Object obj = inputstream;
        if (!inputstream.markSupported())
        {
            obj = new BufferedInputStream(inputstream, 0x20000);
        }
        ((InputStream) (obj)).mark(0x20000);
        inputstream = new byte[0x10000];
        int i = m_nativeLoad(a, ((InputStream) (obj)), inputstream);
        if (i > 0)
        {
            throw com.aviary.android.feather.headless.a.a(i);
        } else
        {
            return;
        }
    }

    public void a(String s)
        throws a
    {
        int i = m_nativeLoad(a, s);
        if (i > 0)
        {
            throw com.aviary.android.feather.headless.a.a(i);
        } else
        {
            return;
        }
    }

    public void a(String s, int i, android.graphics.Bitmap.CompressFormat compressformat)
        throws a
    {
        i = m_nativeSaveWithQualityAndConfig(a, s, i, a(compressformat));
        if (i > 0)
        {
            throw com.aviary.android.feather.headless.a.a(i);
        } else
        {
            return;
        }
    }

    public boolean a()
    {
        return m_nativeIsLoaded(a);
    }

    public void b()
        throws a
    {
        int i = m_nativeUnload(a);
        if (i > 0)
        {
            throw com.aviary.android.feather.headless.a.a(i);
        } else
        {
            return;
        }
    }

    public void b(String s)
    {
        m_nativeApplyActions(a, s);
    }

    public void c()
    {
        m_nativeDispose(a);
        a = 0L;
        b = true;
    }
}
