// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.drm.mobile1;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.PrintStream;

// Referenced classes of package android_src.drm.mobile1:
//            b

public class DrmRawContent
{

    private BufferedInputStream a;
    private int b;
    private int c;
    private String d;
    private String e;
    private int f;

    public DrmRawContent(InputStream inputstream, int i, String s)
    {
        c = -1;
        a = new BufferedInputStream(inputstream, 1024);
        b = i;
        byte byte0;
        if ("application/vnd.oma.drm.message".equals(s))
        {
            byte0 = 1;
        } else
        if ("application/vnd.oma.drm.content".equals(s))
        {
            byte0 = 2;
        } else
        {
            throw new IllegalArgumentException("mimeType must be DRM_MIMETYPE_MESSAGE or DRM_MIMETYPE_CONTENT");
        }
        if (i <= 0)
        {
            throw new IllegalArgumentException("len must be > 0");
        }
        c = nativeConstructDrmContent(a, b, byte0);
        if (-1 == c)
        {
            throw new b("nativeConstructDrmContent() returned JNI_DRM_FAILURE");
        }
        d = nativeGetRightsAddress();
        f = nativeGetDeliveryMethod();
        if (-1 == f)
        {
            throw new b("nativeGetDeliveryMethod() returned JNI_DRM_FAILURE");
        }
        e = nativeGetContentType();
        if (e == null)
        {
            throw new b("nativeGetContentType() returned null");
        } else
        {
            return;
        }
    }

    private native int nativeConstructDrmContent(InputStream inputstream, int i, int j);

    private native int nativeGetContentLength();

    private native String nativeGetContentType();

    private native int nativeGetDeliveryMethod();

    private native String nativeGetRightsAddress();

    private native int nativeReadContent(byte abyte0[], int i, int j, int k);

    public String a()
    {
        return e;
    }

    protected native void finalize();

    static 
    {
        try
        {
            System.loadLibrary("drm1_jni");
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            System.err.println("WARNING: Could not load libdrm1_jni.so");
        }
    }
}
