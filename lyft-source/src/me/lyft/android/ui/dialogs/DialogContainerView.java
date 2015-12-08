// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.dialogs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.lyft.scoop.IHandleBack;

public class DialogContainerView extends FrameLayout
    implements IHandleBack
{

    public DialogContainerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setClickable(true);
        setOnClickListener(new android.view.View.OnClickListener() {

            final DialogContainerView this$0;

            public void onClick(View view)
            {
                onClickOutside();
            }

            
            {
                this$0 = DialogContainerView.this;
                super();
            }
        });
    }

    public boolean onBack()
    {
        onCancel();
        return false;
    }

    protected void onCancel()
    {
    }

    protected void onClickOutside()
    {
    }
}
