// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.content.DialogInterface;

// Referenced classes of package com.skype.android.app.vim:
//            VideoMessageRecorderActivity

final class this._cls0
    implements android.content.
{

    final VideoMessageRecorderActivity this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            VideoMessageRecorderActivity.access$500(VideoMessageRecorderActivity.this, PRERECORD);
            return;

        case 1: // '\001'
            VideoMessageRecorderActivity.access$500(VideoMessageRecorderActivity.this, CANCELED);
            break;
        }
    }

    ()
    {
        this$0 = VideoMessageRecorderActivity.this;
        super();
    }
}
