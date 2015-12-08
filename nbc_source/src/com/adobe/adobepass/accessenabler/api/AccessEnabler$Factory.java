// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.api;

import android.content.Context;

// Referenced classes of package com.adobe.adobepass.accessenabler.api:
//            AccessEnabler, AccessEnablerException

public static class 
{

    private static AccessEnabler instance;

    public static AccessEnabler getInstance(Context context)
        throws AccessEnablerException
    {
        com/adobe/adobepass/accessenabler/api/AccessEnabler;
        JVM INSTR monitorenter ;
        if (instance == null)
        {
            instance = new AccessEnabler(context, null);
        }
        context = instance;
        com/adobe/adobepass/accessenabler/api/AccessEnabler;
        JVM INSTR monitorexit ;
        return context;
        context;
        com/adobe/adobepass/accessenabler/api/AccessEnabler;
        JVM INSTR monitorexit ;
        throw context;
    }


    public ()
    {
    }
}
