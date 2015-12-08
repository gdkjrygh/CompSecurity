// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.transfer;

import android.graphics.Bitmap;
import android.net.Uri;

// Referenced classes of package com.skype.android.app.transfer:
//            TransferThumbnails, TransferType

final class type
{

    int scanAttempts;
    boolean scanning;
    final TransferThumbnails this$0;
    Bitmap thumb;
    Uri thumbUri;
    TransferType type;

    _cls9()
    {
        this$0 = TransferThumbnails.this;
        super();
        type = TransferType.UNKNOWN;
    }
}
