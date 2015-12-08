// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.Conversation;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentUploadUtil

final class val.legacyText
    implements Callable
{

    final MediaDocumentUploadUtil this$0;
    final Conversation val$conversation;
    final String val$fileName;
    final String val$legacyText;
    final String val$path;

    public final Boolean call()
        throws Exception
    {
        return Boolean.valueOf(MediaDocumentUploadUtil.access$300(MediaDocumentUploadUtil.this, val$conversation, val$fileName, val$path, val$legacyText));
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_mediadocumentuploadutil;
        val$conversation = conversation1;
        val$fileName = s;
        val$path = s1;
        val$legacyText = String.this;
        super();
    }
}
