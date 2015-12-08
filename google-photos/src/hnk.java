// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.photos.remotemedia.ui.AlbumTitleCard;

final class hnk
    implements hno
{

    private String a;

    hnk(hnd hnd, String s)
    {
        a = s;
        super();
    }

    public final void a(AlbumTitleCard albumtitlecard)
    {
        albumtitlecard.b.setText(a);
        albumtitlecard.a.setText(a);
    }
}
