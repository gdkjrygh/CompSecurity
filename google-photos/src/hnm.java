// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.remotemedia.ui.AlbumTitleCard;
import com.google.android.apps.photos.remotemedia.ui.Facepile;
import java.util.Collections;
import java.util.List;

final class hnm
    implements hno
{

    private List a;

    hnm(hnd hnd, List list)
    {
        a = list;
        super();
    }

    public final void a(AlbumTitleCard albumtitlecard)
    {
        Facepile facepile = albumtitlecard.d;
        List list = a;
        albumtitlecard = list;
        if (list == null)
        {
            albumtitlecard = Collections.emptyList();
        }
        facepile.a = albumtitlecard;
        facepile.a();
    }
}
