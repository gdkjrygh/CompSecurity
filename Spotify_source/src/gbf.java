// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.spotify.mobile.android.ui.stuff.BadgesFactory;

public final class gbf
    implements dfv
{

    private final Context a;

    public gbf(Context context)
    {
        a = (Context)ctz.a(context);
    }

    public final Drawable a(Bitmap bitmap)
    {
        dmz.a(com/spotify/mobile/android/ui/stuff/BadgesFactory);
        return BadgesFactory.a(a, dfo.a().a(bitmap), a.getResources().getDimensionPixelSize(0x7f0c0008), a.getResources().getDimensionPixelSize(0x7f0c0007));
    }
}
