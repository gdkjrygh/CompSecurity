// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.os.Bundle;

// Referenced classes of package org.apache.cordova:
//            DroidGap

public class StandAlone extends DroidGap
{

    public StandAlone()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}
