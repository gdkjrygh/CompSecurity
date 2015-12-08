// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.widget.EditText;
import com.google.android.apps.photos.remotemedia.ui.AlbumTitleCard;

final class hne
    implements hno
{

    private Bundle a;

    hne(hnd hnd, Bundle bundle)
    {
        a = bundle;
        super();
    }

    public final void a(AlbumTitleCard albumtitlecard)
    {
        albumtitlecard.a.setText(a.getString("edit_text"));
    }
}
