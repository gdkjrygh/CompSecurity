// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.drm.mobile1;

import java.io.InputStream;
import java.io.PrintStream;

// Referenced classes of package android_src.drm.mobile1:
//            DrmRights, b, DrmRawContent

public class DrmRightsManager
{

    private static DrmRightsManager a = null;

    protected DrmRightsManager()
    {
    }

    public static DrmRightsManager a()
    {
        android_src/drm/mobile1/DrmRightsManager;
        JVM INSTR monitorenter ;
        DrmRightsManager drmrightsmanager;
        if (a == null)
        {
            a = new DrmRightsManager();
        }
        drmrightsmanager = a;
        android_src/drm/mobile1/DrmRightsManager;
        JVM INSTR monitorexit ;
        return drmrightsmanager;
        Exception exception;
        exception;
        throw exception;
    }

    private native int nativeDeleteRights(DrmRights drmrights);

    private native int nativeGetNumOfRights();

    private native int nativeGetRightsList(DrmRights adrmrights[], int i);

    private native int nativeInstallDrmRights(InputStream inputstream, int i, int j, DrmRights drmrights);

    private native int nativeQueryRights(DrmRawContent drmrawcontent, DrmRights drmrights);

    public DrmRights a(DrmRawContent drmrawcontent)
    {
        this;
        JVM INSTR monitorenter ;
        DrmRights drmrights;
        int i;
        drmrights = new DrmRights();
        i = nativeQueryRights(drmrawcontent, drmrights);
        drmrawcontent = drmrights;
        if (-1 == i)
        {
            drmrawcontent = null;
        }
        this;
        JVM INSTR monitorexit ;
        return drmrawcontent;
        drmrawcontent;
        throw drmrawcontent;
    }

    public DrmRights a(InputStream inputstream, int i, String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = "application/vnd.oma.drm.rights+xml".equals(s);
        if (!flag) goto _L2; else goto _L1
_L1:
        byte byte0 = 3;
_L5:
        if (i > 0) goto _L4; else goto _L3
_L3:
        s = null;
_L7:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        if (!"application/vnd.oma.drm.rights+wbxml".equals(s))
        {
            break MISSING_BLOCK_LABEL_43;
        }
        byte0 = 4;
          goto _L5
        if (!"application/vnd.oma.drm.message".equals(s))
        {
            break MISSING_BLOCK_LABEL_58;
        }
        byte0 = 1;
          goto _L5
        throw new IllegalArgumentException("mimeType must be DRM_MIMETYPE_RIGHTS_XML or DRM_MIMETYPE_RIGHTS_WBXML or DRM_MIMETYPE_MESSAGE");
        inputstream;
        this;
        JVM INSTR monitorexit ;
        throw inputstream;
_L4:
        DrmRights drmrights = new DrmRights();
        s = drmrights;
        if (-1 != nativeInstallDrmRights(inputstream, i, byte0, drmrights)) goto _L7; else goto _L6
_L6:
        throw new b("nativeInstallDrmRights() returned JNI_DRM_FAILURE");
          goto _L5
    }

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
