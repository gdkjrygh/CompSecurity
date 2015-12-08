// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.debug;

import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.snapchat.android.util.debug:
//            BugReportFragment

final class this._cls1
    implements android.content.kListener
{

    final is._cls0 this$1;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (BugReportFragment.g(_fld0))
        {
            BugReportFragment.b(_fld0, false);
            BugReportFragment.h(_fld0).setVisibility(0);
        }
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/snapchat/android/util/debug/BugReportFragment$5

/* anonymous class */
    final class BugReportFragment._cls5
        implements android.view.View.OnClickListener
    {

        final BugReportFragment this$0;

        public final void onClick(View view)
        {
            view = new ImageView(BugReportFragment.d(BugReportFragment.this));
            view.setImageBitmap(BugReportFragment.e(BugReportFragment.this));
            (new android.app.AlertDialog.Builder(BugReportFragment.d(BugReportFragment.this))).setTitle("Included Screenshot").setView(view).setPositiveButton("Include", new BugReportFragment._cls5._cls3()).setNegativeButton("Remove", new BugReportFragment._cls5._cls2()).setNeutralButton("Choose from Gallery", new BugReportFragment._cls5._cls1()).show();
        }

            
            {
                this$0 = BugReportFragment.this;
                super();
            }

        // Unreferenced inner class com/snapchat/android/util/debug/BugReportFragment$5$1

/* anonymous class */
        final class BugReportFragment._cls5._cls1
            implements android.content.DialogInterface.OnClickListener
        {

            final BugReportFragment._cls5 this$1;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                BugReportFragment.f(this$0);
            }

                    
                    {
                        this$1 = BugReportFragment._cls5.this;
                        super();
                    }
        }


        // Unreferenced inner class com/snapchat/android/util/debug/BugReportFragment$5$3

/* anonymous class */
        final class BugReportFragment._cls5._cls3
            implements android.content.DialogInterface.OnClickListener
        {

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
        }

    }

}
