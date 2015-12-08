// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.expresspay;

import android.view.View;
import com.lyft.scoop.Screen;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;

// Referenced classes of package me.lyft.android.ui.driver.expresspay:
//            ExpressPayDialogView

class val.targetScreen
    implements android.view..ExpressPayDialogView._cls2
{

    final ExpressPayDialogView this$0;
    final Screen val$targetScreen;

    public void onClick(View view)
    {
        dialogFlow.dismiss();
        if (val$targetScreen != null)
        {
            appFlow.goTo(val$targetScreen);
        }
    }

    A()
    {
        this$0 = final_expresspaydialogview;
        val$targetScreen = Screen.this;
        super();
    }
}
