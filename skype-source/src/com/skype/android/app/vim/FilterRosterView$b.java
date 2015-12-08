// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.content.res.Resources;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;

// Referenced classes of package com.skype.android.app.vim:
//            FilterRosterView

private final class _cls1 extends android.support.v7.widget._cls1
{

    ImageView preview;
    final FilterRosterView this$0;

    public _cls1.val.this._cls0(View view)
    {
        this.this$0 = FilterRosterView.this;
        super(view);
        preview = (ImageView)view.findViewById(0x7f100378);
        if (android.os.NT >= 21)
        {
            ((ViewGroup)view).setClipChildren(false);
            preview.setElevation(getResources().getDimensionPixelSize(0x7f0c00bc));
            preview.setOutlineProvider(new ViewOutlineProvider() {

                final FilterRosterView.b this$1;
                final FilterRosterView val$this$0;

                public final void getOutline(View view1, Outline outline)
                {
                    outline.setOval(0, 0, view1.getWidth(), view1.getHeight());
                }

            
            {
                this$1 = FilterRosterView.b.this;
                this$0 = filterrosterview;
                super();
            }
            });
        }
    }
}
