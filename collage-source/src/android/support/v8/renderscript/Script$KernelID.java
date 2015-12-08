// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            BaseObj, Script, RenderScript

public static final class mSig extends BaseObj
{

    android.renderscript.bj mN;
    Script mScript;
    int mSig;
    int mSlot;

    (long l, RenderScript renderscript, Script script, int i, int j)
    {
        super(l, renderscript);
        mScript = script;
        mSlot = i;
        mSig = j;
    }
}
