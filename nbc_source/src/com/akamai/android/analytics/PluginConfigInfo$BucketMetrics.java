// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


// Referenced classes of package com.akamai.android.analytics:
//            PluginConfigInfo

class this._cls0
{

    int bucketCount;
    int bucketLength;
    final PluginConfigInfo this$0;

    public String debug()
    {
        return (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("BucketCount:").append(bucketCount).append(":\n").toString()))).append("BucketLength:").append(bucketLength).append(":\n").toString();
    }

    A()
    {
        this$0 = PluginConfigInfo.this;
        super();
    }
}
