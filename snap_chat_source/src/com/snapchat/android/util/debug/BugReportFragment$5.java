// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.snapchat.android.util.debug:
//            BugReportFragment

final class this._cls0
    implements android.view.
{

    final BugReportFragment this$0;

    public final void onClick(View view)
    {
        view = new ImageView(BugReportFragment.d(BugReportFragment.this));
        view.setImageBitmap(BugReportFragment.e(BugReportFragment.this));
        (new android.app.<init>(BugReportFragment.d(BugReportFragment.this))).setTitle("Included Screenshot").setView(view).setPositiveButton("Include", new android.content.DialogInterface.OnClickListener() {

            final BugReportFragment._cls5 this$1;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (!BugReportFragment.g(this$0))
                {
                    BugReportFragment.b(this$0, true);
                    BugReportFragment.h(this$0).setVisibility(8);
                }
            }

            
            {
                this$1 = BugReportFragment._cls5.this;
                super();
            }
        }).setNegativeButton("Remove", new android.content.DialogInterface.OnClickListener() {

            final BugReportFragment._cls5 this$1;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (BugReportFragment.g(this$0))
                {
                    BugReportFragment.b(this$0, false);
                    BugReportFragment.h(this$0).setVisibility(0);
                }
            }

            
            {
                this$1 = BugReportFragment._cls5.this;
                super();
            }
        }).setNeutralButton("Choose from Gallery", new android.content.DialogInterface.OnClickListener() {

            final BugReportFragment._cls5 this$1;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                BugReportFragment.f(this$0);
            }

            
            {
                this$1 = BugReportFragment._cls5.this;
                super();
            }
        }).show();
    }

    _cls3.this._cls1()
    {
        this$0 = BugReportFragment.this;
        super();
    }
}
