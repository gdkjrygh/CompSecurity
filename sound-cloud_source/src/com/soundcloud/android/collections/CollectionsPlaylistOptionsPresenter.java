// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import a.a;
import android.content.Context;
import android.view.View;
import android.widget.RadioButton;
import android.widget.ToggleButton;

// Referenced classes of package com.soundcloud.android.collections:
//            PlaylistsOptions

public class CollectionsPlaylistOptionsPresenter
{
    public static interface Listener
    {

        public abstract void onOptionsUpdated(PlaylistsOptions playlistsoptions);
    }


    public CollectionsPlaylistOptionsPresenter()
    {
    }

    private android.content.DialogInterface.OnClickListener buildCancelListener()
    {
        return new _cls2();
    }

    private android.content.DialogInterface.OnClickListener buildFilterListener(final Listener listener, final ToggleButton showLikes, final ToggleButton showPosts, final RadioButton sortByTitle)
    {
        return new _cls1();
    }

    public void showOptions(Context context, Listener listener, PlaylistsOptions playlistsoptions)
    {
        View view = View.inflate(context, 0x7f03005d, null);
        ToggleButton togglebutton = (ToggleButton)a.a(view, 0x7f0f0157);
        ToggleButton togglebutton1 = (ToggleButton)a.a(view, 0x7f0f0156);
        RadioButton radiobutton = (RadioButton)a.a(view, 0x7f0f015a);
        togglebutton.setChecked(playlistsoptions.showLikes());
        togglebutton1.setChecked(playlistsoptions.showPosts());
        radiobutton.setChecked(playlistsoptions.sortByTitle());
        (new android.support.v7.app.AlertDialog.Builder(context)).setView(view).setPositiveButton(0x7f0700a9, buildFilterListener(listener, togglebutton, togglebutton1, radiobutton)).setNegativeButton(0x1040000, buildCancelListener()).show();
    }

    private class _cls2
        implements android.content.DialogInterface.OnClickListener
    {

        final CollectionsPlaylistOptionsPresenter this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface.cancel();
        }

        _cls2()
        {
            this$0 = CollectionsPlaylistOptionsPresenter.this;
            super();
        }
    }


    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final CollectionsPlaylistOptionsPresenter this$0;
        final Listener val$listener;
        final ToggleButton val$showLikes;
        final ToggleButton val$showPosts;
        final RadioButton val$sortByTitle;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface = AutoValue_PlaylistsOptions.builder().showLikes(showLikes.isChecked()).showPosts(showPosts.isChecked()).sortByTitle(sortByTitle.isChecked()).build();
            listener.onOptionsUpdated(dialoginterface);
        }

        _cls1()
        {
            this$0 = CollectionsPlaylistOptionsPresenter.this;
            showLikes = togglebutton;
            showPosts = togglebutton1;
            sortByTitle = radiobutton;
            listener = listener1;
            super();
        }
    }

}
