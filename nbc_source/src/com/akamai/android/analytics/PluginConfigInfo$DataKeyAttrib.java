// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;


// Referenced classes of package com.akamai.android.analytics:
//            PluginConfigInfo

class this._cls0
{

    boolean doLog;
    String fallback;
    String regExpJVPattern;
    String regExpJVReplace;
    boolean sendOnce;
    int size;
    final PluginConfigInfo this$0;
    String value;

    public String debug()
    {
        return (new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf((new StringBuilder(String.valueOf(""))).append("Value:").append(value).append(":\n").toString()))).append("size:").append(size).append(":\n").toString()))).append("doLog:").append(doLog).append(":\n").toString()))).append("sendOnce:").append(sendOnce).append(":\n").toString()))).append("fallback:").append(fallback).append(":\n").toString();
    }

    A()
    {
        this$0 = PluginConfigInfo.this;
        super();
    }
}
