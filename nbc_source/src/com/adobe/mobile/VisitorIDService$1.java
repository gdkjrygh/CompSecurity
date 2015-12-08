// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.content.SharedPreferences;

// Referenced classes of package com.adobe.mobile:
//            VisitorIDService, StaticMethods

class this._cls0
    implements Runnable
{

    final VisitorIDService this$0;

    public void run()
    {
        try
        {
            VisitorIDService.access$002(VisitorIDService.this, StaticMethods.getSharedPreferences().getString("ADBMOBILE_PERSISTED_MID", null));
            VisitorIDService.access$102(VisitorIDService.this, StaticMethods.getSharedPreferences().getString("ADBMOBILE_PERSISTED_MID_HINT", null));
            VisitorIDService.access$202(VisitorIDService.this, StaticMethods.getSharedPreferences().getString("ADBMOBILE_PERSISTED_MID_BLOB", null));
            VisitorIDService.access$302(VisitorIDService.this, StaticMethods.getSharedPreferences().getLong("ADBMOBILE_VISITORID_TTL", 0L));
            VisitorIDService.access$402(VisitorIDService.this, StaticMethods.getSharedPreferences().getLong("ADBMOBILE_VISITORID_SYNC", 0L));
            return;
        }
        catch (ontextException ontextexception)
        {
            VisitorIDService.access$002(VisitorIDService.this, null);
            VisitorIDService.access$102(VisitorIDService.this, null);
            VisitorIDService.access$202(VisitorIDService.this, null);
            StaticMethods.logErrorFormat("Visitor - Unable to check for stored visitor ID due to context error (%s)", new Object[] {
                ontextexception.getMessage()
            });
            return;
        }
    }

    ontextException()
    {
        this$0 = VisitorIDService.this;
        super();
    }
}
