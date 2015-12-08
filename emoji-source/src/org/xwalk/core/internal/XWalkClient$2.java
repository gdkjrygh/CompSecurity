// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.content.DialogInterface;
import android.widget.EditText;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkClient, XWalkHttpAuthHandler

class andler
    implements android.content.e.OnClickListener
{

    final XWalkClient this$0;
    final XWalkHttpAuthHandler val$haHandler;
    final EditText val$passwordEditText;
    final EditText val$userNameEditText;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        String s = val$userNameEditText.getText().toString();
        String s1 = val$passwordEditText.getText().toString();
        val$haHandler.proceed(s, s1);
        dialoginterface.dismiss();
    }

    andler()
    {
        this$0 = final_xwalkclient;
        val$userNameEditText = edittext;
        val$passwordEditText = edittext1;
        val$haHandler = XWalkHttpAuthHandler.this;
        super();
    }
}
