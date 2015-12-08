// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.mopub.mraid:
//            MraidNativeCommandHandler, af

final class ab
    implements android.content.DialogInterface.OnClickListener
{

    final Context a;
    final String b;
    final af c;
    final MraidNativeCommandHandler d;

    ab(MraidNativeCommandHandler mraidnativecommandhandler, Context context, String s, af af)
    {
        d = mraidnativecommandhandler;
        a = context;
        b = s;
        c = af;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        d.a(a, b, c);
    }
}
