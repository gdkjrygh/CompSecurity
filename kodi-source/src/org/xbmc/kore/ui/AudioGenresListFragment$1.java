// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package org.xbmc.kore.ui:
//            AudioGenresListFragment

class this._cls0
    implements android.widget.tener
{

    final AudioGenresListFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (ewHolder)view.getTag();
        AudioGenresListFragment.access$000(AudioGenresListFragment.this).onAudioGenreSelected(((ewHolder) (adapterview)).genreId, ((ewHolder) (adapterview)).genreTitle);
    }

    AudioGenreSelectedListener()
    {
        this$0 = AudioGenresListFragment.this;
        super();
    }
}
