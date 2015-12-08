// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            AppContentFragment

final class this._cls0
    implements FileFilter
{

    final this._cls0 this$0;

    public final boolean accept(File file)
    {
        return Pattern.matches("cpu[0-9]+", file.getName());
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
