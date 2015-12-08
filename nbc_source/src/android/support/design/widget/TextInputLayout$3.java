// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Handler;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            TextInputLayout

class this._cls0
    implements android.view.Listener
{

    final TextInputLayout this$0;

    public void onFocusChange(View view, boolean flag)
    {
        TextInputLayout.access$200(TextInputLayout.this).sendEmptyMessage(0);
    }

    ()
    {
        this$0 = TextInputLayout.this;
        super();
    }
}
