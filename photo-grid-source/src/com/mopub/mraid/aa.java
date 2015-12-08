// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.content.Context;
import android.widget.Toast;
import com.mopub.common.logging.MoPubLog;

// Referenced classes of package com.mopub.mraid:
//            ad, h, af, MraidNativeCommandHandler

final class aa
    implements ad
{

    final Context a;
    final af b;
    final MraidNativeCommandHandler c;

    aa(MraidNativeCommandHandler mraidnativecommandhandler, Context context, af af1)
    {
        c = mraidnativecommandhandler;
        a = context;
        b = af1;
        super();
    }

    public final void onFailure()
    {
        Toast.makeText(a, "Image failed to download.", 0).show();
        MoPubLog.d("Error downloading and saving image file.");
        b.onFailure(new h("Error downloading and saving image file."));
    }

    public final void onSuccess()
    {
        MoPubLog.d("Image successfully saved.");
    }
}
