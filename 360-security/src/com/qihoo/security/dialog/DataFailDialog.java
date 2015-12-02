// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog;

import android.os.Bundle;
import android.view.View;

// Referenced classes of package com.qihoo.security.dialog:
//            AbsDialogActivity

public class DataFailDialog extends AbsDialogActivity
{

    private static final String c = com/qihoo/security/dialog/DataFailDialog.getSimpleName();

    public DataFailDialog()
    {
    }

    protected View a()
    {
        return null;
    }

    public void onBackPressed()
    {
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setDialogTitle(0x7f0c018f);
        setDialogMessage(0x7f0c018d);
        setButtonText(new int[] {
            0x7f0c0156
        });
        setButtonOnClickListener(new android.view.View.OnClickListener[] {
            new android.view.View.OnClickListener() {

                final DataFailDialog a;

                public void onClick(View view)
                {
                    a.finish();
                }

            
            {
                a = DataFailDialog.this;
                super();
            }
            }
        });
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

}
