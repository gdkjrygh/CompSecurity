// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.config;


// Referenced classes of package com.google.android.gms.common.config:
//            GservicesValue

static final class nit> extends GservicesValue
{

    protected final volatile Object retrieve$9543ced()
    {
        return GservicesValue.sGservicesReader.getInt(mKey, (Integer)mDefaultValue);
    }

    ervicesReader(String s, Integer integer)
    {
        super(s, integer);
    }
}
