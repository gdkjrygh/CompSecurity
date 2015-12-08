// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            Script, RSRuntimeException, RenderScript

public abstract class ScriptIntrinsic extends Script
{

    ScriptIntrinsic(long l, RenderScript renderscript)
    {
        super(l, renderscript);
        if (l == 0L)
        {
            throw new RSRuntimeException("Loading of ScriptIntrinsic failed.");
        } else
        {
            return;
        }
    }
}
