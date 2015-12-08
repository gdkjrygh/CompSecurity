// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.content.DialogInterface;
import android.widget.RadioButton;
import android.widget.ToggleButton;

// Referenced classes of package com.soundcloud.android.collections:
//            AutoValue_PlaylistsOptions, CollectionsPlaylistOptionsPresenter

class stener
    implements android.content.OptionsPresenter._cls1
{

    final CollectionsPlaylistOptionsPresenter this$0;
    final stener val$listener;
    final ToggleButton val$showLikes;
    final ToggleButton val$showPosts;
    final RadioButton val$sortByTitle;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = AutoValue_PlaylistsOptions.builder().stener(val$showLikes.isChecked()).showLikes(val$showPosts.isChecked()).showPosts(val$sortByTitle.isChecked()).sortByTitle();
        val$listener.onOptionsUpdated(dialoginterface);
    }

    stener()
    {
        this$0 = final_collectionsplaylistoptionspresenter;
        val$showLikes = togglebutton;
        val$showPosts = togglebutton1;
        val$sortByTitle = radiobutton;
        val$listener = stener.this;
        super();
    }
}
