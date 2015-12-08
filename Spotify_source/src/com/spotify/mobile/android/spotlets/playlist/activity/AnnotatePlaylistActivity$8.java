// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.activity;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.activity:
//            AnnotatePlaylistActivity

final class a
    implements TextWatcher
{

    private AnnotatePlaylistActivity a;

    public final void afterTextChanged(Editable editable)
    {
        Button button = AnnotatePlaylistActivity.o(a);
        boolean flag;
        if (AnnotatePlaylistActivity.b(a) != com.spotify.mobile.android.spotlets.collection.service. || editable.toString().trim().length() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        button.setEnabled(flag);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    (AnnotatePlaylistActivity annotateplaylistactivity)
    {
        a = annotateplaylistactivity;
        super();
    }
}
