// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import org.json.JSONObject;

public class ak
{

    private final String a;
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;

    public ak(JSONObject jsonobject)
    {
        a = jsonobject.optString("vpeBackgroundedAudioUrl");
        b = jsonobject.optString("vpeCancelBtnText");
        c = jsonobject.optString("vpeCompletionText");
        d = jsonobject.optInt("vpeMaxBufferingSecs");
        e = jsonobject.optString("vpeResumeText");
        f = jsonobject.optString("vpeSkipBtnText");
        g = jsonobject.optString("vpeSkipWarningText");
        h = jsonobject.optString("vpeThresholdPassedText");
        i = jsonobject.optString("vpeThresholdText");
    }

    public String a()
    {
        return a;
    }

    public String a(int j)
    {
        return i.replace("__THRESHOLD_SECONDS__", String.valueOf(j));
    }

    public String b()
    {
        return b;
    }

    public int c()
    {
        return d;
    }

    public String d()
    {
        return e;
    }

    public String e()
    {
        return f;
    }

    public String f()
    {
        return g;
    }

    public String g()
    {
        return h;
    }

    public String toString()
    {
        return (new StringBuilder()).append("VideoProgressEnforcementConfigData{backgroundedAudioUrl=").append(a).append(", cancelBtnText=").append(b).append(", completionText=").append(c).append(", maxBufferingSecs=").append(d).append(", resumeText=").append(e).append(", skipBtnText=").append(f).append(", skipWarningText=").append(g).append(", thresholdPassedText=").append(h).append(", thresholdText=").append(i).append('}').toString();
    }
}
