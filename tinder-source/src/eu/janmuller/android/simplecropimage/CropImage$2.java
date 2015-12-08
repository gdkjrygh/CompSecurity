// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package eu.janmuller.android.simplecropimage;

import android.view.View;

// Referenced classes of package eu.janmuller.android.simplecropimage:
//            CropImage

final class a
    implements android.view.Listener
{

    final CropImage a;

    public final void onClick(View view)
    {
        a.setResult(0);
        a.finish();
    }

    (CropImage cropimage)
    {
        a = cropimage;
        super();
    }
}
