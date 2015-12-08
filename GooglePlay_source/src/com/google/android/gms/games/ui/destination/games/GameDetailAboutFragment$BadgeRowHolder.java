// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailAboutFragment

private static final class badgeDescription
{

    public final TextView badgeDescription;
    public final LoadingImageView badgeThumbnail;
    public final TextView badgeTitle;

    public (View view)
    {
        badgeThumbnail = (LoadingImageView)view.findViewById(0x7f0d0116);
        badgeTitle = (TextView)view.findViewById(0x7f0d0117);
        badgeDescription = (TextView)view.findViewById(0x7f0d0118);
        view.setTag(this);
    }
}
