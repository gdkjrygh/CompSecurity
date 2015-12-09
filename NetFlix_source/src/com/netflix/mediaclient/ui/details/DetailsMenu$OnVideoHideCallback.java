// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.view.MenuItem;
import android.widget.Toast;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            DetailsMenu

private class this._cls0 extends LoggingManagerCallback
{

    final DetailsMenu this$0;

    public void onVideoHide(int i)
    {
        super.onVideoHide(i);
        DetailsMenu.access$000(DetailsMenu.this).setEnabled(true);
        if (i != 0)
        {
            Log.w("DetailsMenu", "Invalid status code");
            Toast.makeText(DetailsMenu.access$100(DetailsMenu.this), 0x7f0c010b, 1).show();
            return;
        } else
        {
            Toast.makeText(DetailsMenu.access$100(DetailsMenu.this), 0x7f0c0108, 1).show();
            DetailsMenu.access$200(DetailsMenu.this);
            return;
        }
    }

    public ()
    {
        this$0 = DetailsMenu.this;
        super("DetailsMenu");
    }
}
