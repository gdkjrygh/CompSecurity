// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.preview;

import PI;
import android.view.View;
import android.widget.ImageButton;

// Referenced classes of package com.snapchat.android.preview:
//            SnapPreviewFragment

final class a
    implements android.view.ewFragment._cls27._cls2
{

    private a a;

    public final void onClick(View view)
    {
        SnapPreviewFragment.m(a.a);
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/snapchat/android/preview/SnapPreviewFragment$27

/* anonymous class */
    final class SnapPreviewFragment._cls27
        implements PI.a
    {

        final SnapPreviewFragment a;

        public final void a(View view)
        {
            ((ImageButton)SnapPreviewFragment.l(a).a()).setOnClickListener(new SnapPreviewFragment._cls27._cls1());
            ((ImageButton)SnapPreviewFragment.n(a).a()).setOnClickListener(new SnapPreviewFragment._cls27._cls2(this));
        }

            
            {
                a = snappreviewfragment;
                super();
            }

        // Unreferenced inner class com/snapchat/android/preview/SnapPreviewFragment$27$1

/* anonymous class */
        final class SnapPreviewFragment._cls27._cls1
            implements android.view.View.OnClickListener
        {

            private SnapPreviewFragment._cls27 a;

            public final void onClick(View view)
            {
                SnapPreviewFragment.k(a.a);
            }

                    
                    {
                        a = SnapPreviewFragment._cls27.this;
                        super();
                    }
        }

    }

}
