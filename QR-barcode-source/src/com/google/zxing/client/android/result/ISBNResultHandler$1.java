// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import android.view.View;
import com.google.zxing.client.result.ISBNParsedResult;

// Referenced classes of package com.google.zxing.client.android.result:
//            ISBNResultHandler

class this._cls0
    implements android.view.
{

    final ISBNResultHandler this$0;

    public void onClick(View view)
    {
        view = (ISBNParsedResult)getResult();
        openGoogleShopper(view.getISBN());
    }

    ()
    {
        this$0 = ISBNResultHandler.this;
        super();
    }
}
