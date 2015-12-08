// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.SkyLib;

// Referenced classes of package com.skype.android.gen:
//            SkyLibListener

public static class _xmlDetails
{

    private String _details;
    private SkyLib _sender;
    private com.skype.yTestResult._xmlDetails _testResult;
    private com.skype.yTestResult._xmlDetails _testType;
    private String _withUser;
    private String _xmlDetails;

    public String getDetails()
    {
        return _details;
    }

    public SkyLib getSender()
    {
        return _sender;
    }

    public com.skype.yTestResult getTestResult()
    {
        return _testResult;
    }

    public com.skype.yTestResult getTestType()
    {
        return _testType;
    }

    public String getWithUser()
    {
        return _withUser;
    }

    public String getXmlDetails()
    {
        return _xmlDetails;
    }

    public (SkyLib skylib, com.skype.yTestResult ytestresult, com.skype.yTestResult ytestresult1, String s, String s1, String s2)
    {
        _sender = skylib;
        _testType = ytestresult;
        _testResult = ytestresult1;
        _withUser = s;
        _details = s1;
        _xmlDetails = s2;
    }
}
