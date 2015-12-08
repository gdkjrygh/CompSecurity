// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.CellRendererBinding;
import com.soundcloud.android.presentation.ListItemAdapter;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;
import java.util.Iterator;
import java.util.List;
import rx.Y;
import rx.a.b.a;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistOperations, CreatePlaylistDialogFragment, AddTrackToPlaylistItem

public class AddToPlaylistDialogFragment extends DialogFragment
{
    static class MyPlaylistsAdapter extends ListItemAdapter
    {

        private final Context context;
        private final FeatureOperations featureOperations;
        ImageView offlineIcon;
        ImageView privateIcon;
        TextView titleView;
        TextView trackCountView;

        private void setIconsVisibility(boolean flag, boolean flag1)
        {
            boolean flag2 = false;
            ImageView imageview = privateIcon;
            int i;
            if (flag)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            imageview.setVisibility(i);
            if (featureOperations.isOfflineContentEnabled() && flag1)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            imageview = offlineIcon;
            if (i != 0)
            {
                i = ((flag2) ? 1 : 0);
            } else
            {
                i = 8;
            }
            imageview.setVisibility(i);
        }

        private void setTitleText(AddTrackToPlaylistItem addtracktoplaylistitem)
        {
            if (addtracktoplaylistitem.playlistUrn == Urn.NOT_SET)
            {
                titleView.setText(context.getString(0x7f0700fa));
                return;
            } else
            {
                titleView.setText(addtracktoplaylistitem.title);
                return;
            }
        }

        private void setTrackCountView(int i)
        {
            if (i == -1)
            {
                trackCountView.setCompoundDrawablesWithIntrinsicBounds(null, null, context.getResources().getDrawable(0x7f02018a), null);
                trackCountView.setText(null);
                return;
            } else
            {
                trackCountView.setCompoundDrawablesWithIntrinsicBounds(context.getResources().getDrawable(0x7f020245), null, null, null);
                trackCountView.setText(String.valueOf(i));
                return;
            }
        }

        public AddTrackToPlaylistItem getItem(int i)
        {
            return (AddTrackToPlaylistItem)items.get(i);
        }

        public volatile Object getItem(int i)
        {
            return getItem(i);
        }

        public int getItemCount()
        {
            return items.size();
        }

        public long getItemId(int i)
        {
            return getItem(i).playlistUrn.getNumericId();
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            viewgroup = view;
            if (view == null)
            {
                viewgroup = View.inflate(context, 0x7f03001c, null);
            }
            a.a.a(this, viewgroup);
            view = getItem(i);
            titleView.setEnabled(isEnabled(i));
            setTitleText(view);
            setTrackCountView(((AddTrackToPlaylistItem) (view)).trackCount);
            setIconsVisibility(((AddTrackToPlaylistItem) (view)).isPrivate, ((AddTrackToPlaylistItem) (view)).isOffline);
            return viewgroup;
        }

        public boolean isEnabled(int i)
        {
            return !getItem(i).isTrackAdded;
        }

        public MyPlaylistsAdapter(Context context1, FeatureOperations featureoperations)
        {
            super(new CellRendererBinding[0]);
            context = context1;
            featureOperations = featureoperations;
        }
    }

    private class PlaylistsLoadedSubscriber extends DefaultSubscriber
    {

        final AddToPlaylistDialogFragment this$0;

        public volatile void onNext(Object obj)
        {
            onNext((List)obj);
        }

        public void onNext(List list)
        {
            adapter.addItem(AddTrackToPlaylistItem.createNewPlaylistItem());
            AddTrackToPlaylistItem addtracktoplaylistitem;
            for (list = list.iterator(); list.hasNext(); adapter.addItem(addtracktoplaylistitem))
            {
                addtracktoplaylistitem = (AddTrackToPlaylistItem)list.next();
            }

            adapter.notifyDataSetChanged();
        }

        private PlaylistsLoadedSubscriber()
        {
            this$0 = AddToPlaylistDialogFragment.this;
            super();
        }

        PlaylistsLoadedSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class TrackAddedSubscriber extends DefaultSubscriber
    {

        final AddToPlaylistDialogFragment this$0;

        public final void onNext(PropertySet propertyset)
        {
            propertyset = getDialog();
            Toast.makeText(getActivity(), 0x7f070069, 0).show();
            if (propertyset != null)
            {
                propertyset.dismiss();
            }
        }

        public final volatile void onNext(Object obj)
        {
            onNext((PropertySet)obj);
        }

        private TrackAddedSubscriber()
        {
            this$0 = AddToPlaylistDialogFragment.this;
            super();
        }

        TrackAddedSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final String KEY_CONTEXT_SCREEN = "CONTEXT_SCREEN";
    private static final String KEY_INVOKER_SCREEN = "INVOKER_LOCATION";
    private static final String KEY_TRACK_ID = "TRACK_ID";
    private static final String KEY_TRACK_TITLE = "TRACK_TITLE";
    private static final String PLAYLIST_DIALOG_TAG = "create_playlist_dialog";
    private MyPlaylistsAdapter adapter;
    private Y addTrackSubscription;
    EventBus eventBus;
    FeatureOperations featureOperations;
    private Y loadPlaylistSubscription;
    private rx.b loadPlaylists;
    PlaylistOperations playlistOperations;

    public AddToPlaylistDialogFragment()
    {
        addTrackSubscription = RxUtils.invalidSubscription();
        loadPlaylistSubscription = RxUtils.invalidSubscription();
        SoundCloudApplication.getObjectGraph().a(this);
        setRetainInstance(true);
    }

    private static Bundle createBundle(Urn urn, String s, String s1, String s2)
    {
        Bundle bundle = new Bundle();
        bundle.putLong("TRACK_ID", urn.getNumericId());
        bundle.putString("TRACK_TITLE", s);
        bundle.putString("INVOKER_LOCATION", s1);
        bundle.putString("CONTEXT_SCREEN", s2);
        return bundle;
    }

    private static AddToPlaylistDialogFragment createFragment(Bundle bundle)
    {
        AddToPlaylistDialogFragment addtoplaylistdialogfragment = new AddToPlaylistDialogFragment();
        addtoplaylistdialogfragment.setArguments(bundle);
        return addtoplaylistdialogfragment;
    }

    public static AddToPlaylistDialogFragment from(Urn urn, String s, String s1, String s2)
    {
        return createFragment(createBundle(urn, s, s1, s2));
    }

    private void onAddTrackToSet(long l)
    {
        long l1 = getArguments().getLong("TRACK_ID");
        addTrackSubscription = playlistOperations.addTrackToPlaylist(Urn.forPlaylist(l), Urn.forTrack(l1)).observeOn(a.a()).subscribe(new TrackAddedSubscriber(null));
        trackAddingToPlaylistEvent(l1);
    }

    private void showPlaylistCreationScreen()
    {
        String s = getArguments().getString("INVOKER_LOCATION");
        String s1 = getArguments().getString("CONTEXT_SCREEN");
        CreatePlaylistDialogFragment.from(getArguments().getLong("TRACK_ID"), s, s1).show(getFragmentManager());
    }

    private void trackAddingToPlaylistEvent(long l)
    {
        String s = getArguments().getString("INVOKER_LOCATION");
        String s1 = getArguments().getString("CONTEXT_SCREEN");
        eventBus.publish(EventQueue.TRACKING, UIEvent.fromAddToPlaylist(s, s1, false, l));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = Urn.forTrack(getArguments().getLong("TRACK_ID"));
        loadPlaylists = playlistOperations.loadPlaylistForAddingTrack(bundle).observeOn(a.a()).cache();
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        adapter = new MyPlaylistsAdapter(getActivity(), featureOperations);
        loadPlaylistSubscription = loadPlaylists.subscribe(new PlaylistsLoadedSubscriber(null));
        return (new android.support.v7.app.AlertDialog.Builder(getActivity())).setTitle(0x7f070068).setAdapter(adapter, new _cls1()).setPositiveButton(0x7f0700a6, null).create();
    }

    public void onDestroy()
    {
        addTrackSubscription.unsubscribe();
        loadPlaylistSubscription.unsubscribe();
        super.onDestroy();
    }

    public void show(FragmentManager fragmentmanager)
    {
        show(fragmentmanager, "create_playlist_dialog");
    }




    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final AddToPlaylistDialogFragment this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            long l = adapter.getItemId(i);
            if (l == Urn.NOT_SET.getNumericId())
            {
                showPlaylistCreationScreen();
                getDialog().dismiss();
            } else
            if (getActivity() != null)
            {
                onAddTrackToSet(l);
                return;
            }
        }

        _cls1()
        {
            this$0 = AddToPlaylistDialogFragment.this;
            super();
        }
    }

}
