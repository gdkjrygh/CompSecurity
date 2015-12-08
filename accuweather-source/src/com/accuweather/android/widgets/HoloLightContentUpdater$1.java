// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.widgets;

import android.content.Context;
import java.util.List;

// Referenced classes of package com.accuweather.android.widgets:
//            HoloLightContentUpdater

class val.context
    implements com.accuweather.android.services.ocationConverterListener
{

    final HoloLightContentUpdater this$0;
    final Context val$context;

    public void onConversionCompleted(List list)
    {
        HoloLightContentUpdater.access$000(HoloLightContentUpdater.this, val$context);
    }

    public void onConversionError(Exception exception)
    {
    }

    LocationConverterListener()
    {
        this$0 = final_hololightcontentupdater;
        val$context = Context.this;
        super();
    }
}
