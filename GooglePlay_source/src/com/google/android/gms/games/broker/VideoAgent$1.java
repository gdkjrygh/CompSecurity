// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import com.google.android.gms.games.internal.GamesLog;
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.games.broker:
//            VideoAgent

final class this._cls0
    implements FileFilter
{

    final VideoAgent this$0;

    public final boolean accept(File file)
    {
        boolean flag = VideoAgent.access$000().matcher(file.getName()).matches();
        if (!flag)
        {
            GamesLog.e("VideoAgent", (new StringBuilder("Invalid video filename: ")).append(file.getName()).toString());
        }
        return flag;
    }

    ()
    {
        this$0 = VideoAgent.this;
        super();
    }
}
