// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.cast;

import android.support.v7.media.MediaRouter;
import android.widget.Toast;
import com.google.android.gms.cast.CastMediaControlIntent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.configuration.CastConfiguration;
import java.util.ArrayList;

// Referenced classes of package com.netflix.mediaclient.service.mdx.cast:
//            CastManager

class this._cls0
    implements Runnable
{

    final CastManager this$0;

    public void run()
    {
        (new ArrayList()).add("urn:x-cast:mdx-netflix-com:service:target:2");
        CastManager.access$002(CastManager.this, MediaRouter.getInstance(CastManager.access$100(CastManager.this)));
        try
        {
            CastManager.access$202(CastManager.this, (new android.support.v7.media.ctor.Builder()).addControlCategory(CastMediaControlIntent.categoryForCast(CastManager.access$300(CastManager.this))).build());
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.e(CastManager.access$400(), (new StringBuilder()).append("MediaRouteSelector: ").append(illegalargumentexception).toString());
            CastConfiguration.setCastApplicationId(CastManager.access$100(CastManager.this), "==invalid ApplicationId==");
            Toast.makeText(CastManager.access$100(CastManager.this), "Invalid ApplicationId, Enter New One", 1).show();
            return;
        }
        CastManager.access$500(CastManager.this);
    }

    guration()
    {
        this$0 = CastManager.this;
        super();
    }
}
