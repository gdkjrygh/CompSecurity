// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.help;

import me.lyft.android.controls.MultiClickListener;
import me.lyft.android.development.DeveloperTools;

// Referenced classes of package me.lyft.android.ui.help:
//            HelpView

class Listener extends MultiClickListener
{

    final HelpView this$0;

    public void onMultiClick()
    {
        developerTools.toggleDeveloperMode();
    }

    erTools()
    {
        this$0 = HelpView.this;
        super();
    }
}
