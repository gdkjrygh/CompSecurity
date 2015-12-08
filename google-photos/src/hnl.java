// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.TextView;
import com.google.android.apps.photos.remotemedia.ui.AlbumTitleCard;

final class hnl
    implements hno
{

    private String a;

    hnl(hnd hnd, String s)
    {
        a = s;
        super();
    }

    public final void a(AlbumTitleCard albumtitlecard)
    {
        albumtitlecard.c.setText(a);
    }
}
