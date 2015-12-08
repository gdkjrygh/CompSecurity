// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.chained;

import android.text.TextUtils;

// Referenced classes of package com.skype.android.util.chained:
//            AbstractChainedRetriever

public abstract class AbstractChainedStringRetriever extends AbstractChainedRetriever
{

    public AbstractChainedStringRetriever()
    {
    }

    protected volatile boolean needFurtherInquiry(Object obj)
    {
        return needFurtherInquiry((String)obj);
    }

    protected boolean needFurtherInquiry(String s)
    {
        return TextUtils.isEmpty(s);
    }
}
