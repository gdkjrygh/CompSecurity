// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave.drm;


// Referenced classes of package com.adobe.ave.drm:
//            DRMOperationErrorCallback, DRMError

public interface DRMOperationErrorWithErrorObjectCallback
    extends DRMOperationErrorCallback
{

    public abstract void OperationError(DRMError drmerror);
}
