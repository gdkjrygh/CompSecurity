// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


// Referenced classes of package com.akamai.android.analytics:
//            PluginConfigInfo

class this._cls0
{

    String key;
    String name;
    final PluginConfigInfo this$0;
    String type;
    String value;

    public String debug()
    {
        return (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("Key :").append(key).append(":\n").toString()))).append("Name:").append(name).append(":\n").toString()))).append("Type:").append(type).append(":\n").toString()))).append("Value:").append(value).append(":\n").toString();
    }

    ()
    {
        this$0 = PluginConfigInfo.this;
        super();
    }
}
