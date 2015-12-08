// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;


// Referenced classes of package android.support.v8.renderscript:
//            ScriptGroup, Allocation, Type

static class mAllocationType
{

    Allocation mAllocation;
    Type mAllocationType;
    mAllocationType mFrom;
    mAllocationType mToF;
    mAllocationType mToK;

    (Type type,  ,  1)
    {
        mFrom = ;
        mToF = 1;
        mAllocationType = type;
    }

    mAllocationType(Type type, mAllocationType mallocationtype, mAllocationType mallocationtype1)
    {
        mFrom = mallocationtype;
        mToK = mallocationtype1;
        mAllocationType = type;
    }
}
