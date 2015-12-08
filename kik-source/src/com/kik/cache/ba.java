// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;

// Referenced classes of package com.kik.cache:
//            SoftwareContactImageView

final class ba extends Paint
{

    final SoftwareContactImageView a;

    ba(SoftwareContactImageView softwarecontactimageview)
    {
        a = softwarecontactimageview;
        super();
        setAntiAlias(true);
        setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
    }
}
