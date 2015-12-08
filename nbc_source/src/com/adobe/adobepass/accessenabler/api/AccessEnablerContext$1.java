// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.api;

import java.util.HashMap;

// Referenced classes of package com.adobe.adobepass.accessenabler.api:
//            AccessEnablerContext

class val.genericData extends HashMap
{

    final AccessEnablerContext this$0;
    final String val$genericData;
    final String val$resourceId;

    ()
    {
        this$0 = final_accessenablercontext;
        val$resourceId = s;
        val$genericData = String.this;
        super();
        put("resource_id", val$resourceId);
        put("generic_data", val$genericData);
    }
}
