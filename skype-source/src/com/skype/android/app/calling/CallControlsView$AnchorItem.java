// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import com.skype.android.widget.MenuImageButton;
import com.skype.android.widget.OnItemSelectionChanged;

// Referenced classes of package com.skype.android.app.calling:
//            CallControlsView, d

public class <init>
    implements OnItemSelectionChanged
{

    private MenuImageButton menuImgButton;
    final CallControlsView this$0;

    private void attachListeners()
    {
        menuImgButton.b(this);
        menuImgButton.a(this);
    }

    public void onSelected(boolean flag)
    {
        if (flag)
        {
            CallControlsView.access$100(CallControlsView.this).onControlsClicked(false);
            return;
        } else
        {
            CallControlsView.access$100(CallControlsView.this).onControlsClicked(true);
            return;
        }
    }

    private (MenuImageButton menuimagebutton)
    {
        this$0 = CallControlsView.this;
        super();
        menuImgButton = menuimagebutton;
        attachListeners();
    }

    attachListeners(MenuImageButton menuimagebutton, attachListeners attachlisteners)
    {
        this(menuimagebutton);
    }
}
