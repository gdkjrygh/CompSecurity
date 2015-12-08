// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins;

import android.app.AlertDialog;
import android.view.View;
import android.widget.ImageButton;
import com.EnterpriseMobileBanking.Utils.Log;

// Referenced classes of package com.EnterpriseMobileBanking.Plugins:
//            COFBusy

class this._cls0
    implements Runnable
{

    final COFBusy this$0;

    public void run()
    {
        Log.d("COFBusy", "show spinner");
        if (COFBusy.access$300(COFBusy.this) != null)
        {
            if (COFBusy.access$100(COFBusy.this))
            {
                COFBusy.access$600(COFBusy.this);
            } else
            {
                COFBusy.access$300(COFBusy.this).show();
                COFBusy.access$400(COFBusy.this).setVisibility(4);
                if (COFBusy.access$700(COFBusy.this))
                {
                    COFBusy.access$1000(COFBusy.this).postDelayed(COFBusy.access$800(COFBusy.this), COFBusy.access$900(COFBusy.this) * 1000);
                    return;
                }
            }
        }
    }

    ()
    {
        this$0 = COFBusy.this;
        super();
    }
}
