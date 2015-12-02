// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.drm.mobile1;

import java.io.PrintStream;

// Referenced classes of package android_src.drm.mobile1:
//            a

public class DrmRights
{

    private String a;

    public DrmRights()
    {
        a = "";
    }

    private native int nativeConsumeRights(int i);

    private native int nativeGetConstraintInfo(int i, a a1);

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
