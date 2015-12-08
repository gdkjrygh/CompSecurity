// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.api;


// Referenced classes of package com.adobe.adobepass.accessenabler.api:
//            AccessEnablerService

private class cachedFromStorage
{

    public Boolean cachedFromStorage;
    public String errorCode;
    public int statusCode;
    final AccessEnablerService this$0;

    public ()
    {
        this$0 = AccessEnablerService.this;
        super();
    }

    public this._cls0(int i, String s, Boolean boolean1)
    {
        this$0 = AccessEnablerService.this;
        super();
        statusCode = i;
        errorCode = s;
        cachedFromStorage = boolean1;
    }
}
