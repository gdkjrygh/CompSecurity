// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;


// Referenced classes of package com.amobee.adsdk:
//            AmobeeAdPlaceholder

public interface IAmobeeListener
{

    public abstract void amobeeOnAdFailed(AmobeeAdPlaceholder amobeeadplaceholder);

    public abstract void amobeeOnAdRecieved(AmobeeAdPlaceholder amobeeadplaceholder);

    public abstract void amobeeOnError();

    public abstract void amobeeOnLeavingApplication(AmobeeAdPlaceholder amobeeadplaceholder);

    public abstract void amobeeOnOverlay(AmobeeAdPlaceholder amobeeadplaceholder);

    public abstract void amobeeOnOverlayDismissed(AmobeeAdPlaceholder amobeeadplaceholder);
}
