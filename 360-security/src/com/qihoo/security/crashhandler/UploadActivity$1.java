// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.crashhandler;

import android.view.View;
import com.qihoo.security.dialog.k;
import com.qihoo.security.locale.d;

// Referenced classes of package com.qihoo.security.crashhandler:
//            UploadActivity

class a
    implements android.view.ner
{

    final UploadActivity a;

    public void onClick(View view)
    {
        UploadActivity.a(a).a(0x7f0c015b);
        UploadActivity.a(a).setButtonText(new CharSequence[] {
            a.a.a(0x7f0c0153)
        });
        UploadActivity.a(a).setButtonOnClickListener(new android.view.ner[] {
            new android.view.View.OnClickListener() {

                final UploadActivity._cls1 a;

                public void onClick(View view1)
                {
                    a.a.finish();
                }

            
            {
                a = UploadActivity._cls1.this;
                super();
            }
            }
        });
        (new <init>(a, null)).execute(new Void[0]);
    }

    _cls1.a(UploadActivity uploadactivity)
    {
        a = uploadactivity;
        super();
    }
}
