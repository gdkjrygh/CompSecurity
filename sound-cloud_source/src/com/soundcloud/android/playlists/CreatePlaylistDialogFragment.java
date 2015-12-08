// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import a.a;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistOperations

public class CreatePlaylistDialogFragment extends DialogFragment
{

    private static final String CREATE_PLAYLIST_DIALOG_TAG = "create_new_set_dialog";
    private static final String KEY_CONTEXT_SCREEN = "ORIGIN_SCREEN";
    private static final String KEY_INVOKER_SCREEN = "INVOKER_SCREEN";
    private static final String KEY_TRACK_ID = "TRACK_ID";
    EventBus eventBus;
    FeatureOperations featureOperations;
    EditText input;
    CheckBox offline;
    PlaylistOperations playlistOperations;
    CheckBox privacy;
    ApplicationProperties properties;

    public CreatePlaylistDialogFragment()
    {
        SoundCloudApplication.getObjectGraph().a(this);
    }

    private static Bundle createBundle(long l, String s, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putLong("TRACK_ID", l);
        bundle.putString("INVOKER_SCREEN", s);
        bundle.putString("ORIGIN_SCREEN", s1);
        return bundle;
    }

    private static CreatePlaylistDialogFragment createFragment(Bundle bundle)
    {
        CreatePlaylistDialogFragment createplaylistdialogfragment = new CreatePlaylistDialogFragment();
        createplaylistdialogfragment.setArguments(bundle);
        return createplaylistdialogfragment;
    }

    private void createPlaylist(String s, boolean flag, boolean flag1)
    {
        long l = getArguments().getLong("TRACK_ID");
        if (flag1)
        {
            s = playlistOperations.createNewOfflinePlaylist(s, flag, Urn.forTrack(l));
        } else
        {
            s = playlistOperations.createNewPlaylist(s, flag, Urn.forTrack(l));
        }
        DefaultSubscriber.fireAndForget(s);
        trackAddingToPlaylistEvent(l);
    }

    public static CreatePlaylistDialogFragment from(long l, String s, String s1)
    {
        return createFragment(createBundle(l, s, s1));
    }

    private void setChecksVisibility()
    {
        if (!featureOperations.isOfflineContentEnabled())
        {
            offline.setVisibility(8);
        }
    }

    private void trackAddingToPlaylistEvent(long l)
    {
        String s = getArguments().getString("INVOKER_SCREEN");
        String s1 = getArguments().getString("ORIGIN_SCREEN");
        eventBus.publish(EventQueue.TRACKING, UIEvent.fromAddToPlaylist(s, s1, true, l));
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = View.inflate(getActivity(), 0x7f03005e, null);
        a.a(this, bundle);
        setChecksVisibility();
        return (new android.support.v7.app.AlertDialog.Builder(getActivity())).setTitle(0x7f0700fa).setView(bundle).setPositiveButton(0x7f0700a9, new _cls1()).setNegativeButton(0x7f0700a6, null).create();
    }

    public void show(FragmentManager fragmentmanager)
    {
        show(fragmentmanager, "create_new_set_dialog");
    }


    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final CreatePlaylistDialogFragment this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface = input.getText().toString().trim();
            if (TextUtils.isEmpty(dialoginterface))
            {
                Toast.makeText(getActivity(), 0x7f07012b, 0).show();
                return;
            } else
            {
                createPlaylist(dialoginterface, privacy.isChecked(), offline.isChecked());
                Toast.makeText(getActivity(), 0x7f070069, 0).show();
                dismiss();
                return;
            }
        }

        _cls1()
        {
            this$0 = CreatePlaylistDialogFragment.this;
            super();
        }
    }

}
