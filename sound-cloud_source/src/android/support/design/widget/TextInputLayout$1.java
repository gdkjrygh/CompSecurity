// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Message;

// Referenced classes of package android.support.design.widget:
//            TextInputLayout

class this._cls0
    implements android.os..TextInputLayout._cls1
{

    final TextInputLayout this$0;

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            TextInputLayout.access$000(TextInputLayout.this, true);
            break;
        }
        return true;
    }

    ()
    {
        this$0 = TextInputLayout.this;
        super();
    }
}
