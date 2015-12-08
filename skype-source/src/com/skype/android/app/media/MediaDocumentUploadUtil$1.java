// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.Conversation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentUploadUtil

final class val.legacyMessage
    implements Callable
{

    final MediaDocumentUploadUtil this$0;
    final Conversation val$conversation;
    final String val$legacyMessage;
    final List val$paths;
    final com.skype.E val$type;

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    public final Map call()
        throws Exception
    {
        HashMap hashmap = new HashMap(val$paths.size());
        String s;
        for (Iterator iterator = val$paths.iterator(); iterator.hasNext(); hashmap.put(s, Boolean.valueOf(MediaDocumentUploadUtil.access$000(MediaDocumentUploadUtil.this, val$conversation, val$type, val$legacyMessage, s))))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    ()
    {
        this$0 = final_mediadocumentuploadutil;
        val$paths = list;
        val$conversation = conversation1;
        val$type = e;
        val$legacyMessage = String.this;
        super();
    }
}
