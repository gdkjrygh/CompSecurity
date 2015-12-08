// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.signin:
//            SignUpActivity

final class this._cls0
    implements Callable
{

    final SignUpActivity this$0;

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    public final String call()
        throws Exception
    {
        Cursor cursor;
        String s;
        cursor = null;
        s = "";
        Cursor cursor1 = getContentResolver().query(android.provider.Profile.CONTENT_URI, SignUpActivity.access$000(), null, null, null);
        cursor = cursor1;
        if (!cursor1.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_46;
        }
        cursor = cursor1;
        s = cursor1.getString(0);
        if (cursor1 != null && !cursor1.isClosed())
        {
            cursor1.close();
        }
        return s;
        Exception exception;
        exception;
        if (cursor != null && !cursor.isClosed())
        {
            cursor.close();
        }
        throw exception;
    }

    ()
    {
        this$0 = SignUpActivity.this;
        super();
    }
}
