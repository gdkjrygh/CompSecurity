// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


// Referenced classes of package com.akamai.android.analytics:
//            PluginConfigInfo

class output_bytes
{

    int no_of_iterations;
    int output_bytes;
    String salt_value;
    String salt_version;
    final PluginConfigInfo this$0;

    ()
    {
        this$0 = PluginConfigInfo.this;
        super();
        salt_version = "0.0";
        salt_value = "";
        no_of_iterations = 50;
        output_bytes = 16;
    }
}
