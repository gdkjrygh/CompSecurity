// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.partner;

import android.content.Intent;

// Referenced classes of package com.netflix.mediaclient.partner:
//            PartnerRequest

public interface PartnerCommunicationHandler
{

    public abstract void launchWithIntent(PartnerRequest partnerrequest, Intent intent);
}
