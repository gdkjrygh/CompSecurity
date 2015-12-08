// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.roidapp.photogrid.release.ParentActivity;

// Referenced classes of package com.roidapp.photogrid.common:
//            cc

public class Eula extends ParentActivity
{

    private WebView a;

    public Eula()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        try
        {
            setContentView(0x7f030096);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            bundle.printStackTrace();
            v = true;
            (new cc(this)).a();
        }
        if (v)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        a = (WebView)findViewById(0x7f0d0266);
        a.getSettings().setDisplayZoomControls(false);
        a.loadUrl("file:///android_asset/eula.html");
        return;
        bundle;
    }

    public final void x()
    {
    }
}
