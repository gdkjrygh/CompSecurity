// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.tracks.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;
import com.google.android.gms.cast.m;
import com.google.android.gms.cast.q;
import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.google.android.libraries.cast.companionlibrary.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.tracks.ui:
//            TracksListAdapter

public class TracksChooserDialog extends DialogFragment
{

    private static final long TEXT_TRACK_NONE_ID = -1L;
    private long mActiveTracks[];
    private List mAudioTracks;
    private TracksListAdapter mAudioVideoAdapter;
    private VideoCastManager mCastManager;
    private m mMediaInfo;
    private int mSelectedAudioPosition;
    private int mSelectedTextPosition;
    private TracksListAdapter mTextAdapter;
    private List mTextTracks;

    public TracksChooserDialog()
    {
        mActiveTracks = null;
        mTextTracks = new ArrayList();
        mAudioTracks = new ArrayList();
        mSelectedTextPosition = 0;
        mSelectedAudioPosition = -1;
    }

    private q buildNoneTrack()
    {
        return (new com.google.android.gms.cast.q.a(-1L, 1)).b(getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_none)).a(2).a("").a;
    }

    public static TracksChooserDialog newInstance(m m1)
    {
        TracksChooserDialog trackschooserdialog = new TracksChooserDialog();
        Bundle bundle = new Bundle();
        bundle.putBundle("media", Utils.mediaInfoToBundle(m1));
        trackschooserdialog.setArguments(bundle);
        return trackschooserdialog;
    }

    private void partitionTracks()
    {
        Object obj = mMediaInfo.f;
        mAudioTracks.clear();
        mTextTracks.clear();
        mTextTracks.add(buildNoneTrack());
        mSelectedTextPosition = 0;
        mSelectedAudioPosition = -1;
        if (obj != null)
        {
            obj = ((List) (obj)).iterator();
            int i = 0;
            int j = 1;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                q q1 = (q)((Iterator) (obj)).next();
                switch (q1.b)
                {
                case 1: // '\001'
                    mTextTracks.add(q1);
                    if (mActiveTracks != null)
                    {
                        long al[] = mActiveTracks;
                        int i1 = al.length;
                        for (int k = 0; k < i1; k++)
                        {
                            if (al[k] == q1.a)
                            {
                                mSelectedTextPosition = j;
                            }
                        }

                    }
                    j++;
                    break;

                case 2: // '\002'
                    mAudioTracks.add(q1);
                    if (mActiveTracks != null)
                    {
                        long al1[] = mActiveTracks;
                        int j1 = al1.length;
                        for (int l = 0; l < j1; l++)
                        {
                            if (al1[l] == q1.a)
                            {
                                mSelectedAudioPosition = i;
                            }
                        }

                    }
                    i++;
                    break;
                }
            } while (true);
        }
    }

    private void setUpView(View view)
    {
        Object obj = (ListView)view.findViewById(com.google.android.libraries.cast.companionlibrary.R.id.listview1);
        ListView listview = (ListView)view.findViewById(com.google.android.libraries.cast.companionlibrary.R.id.listview2);
        TextView textview1 = (TextView)view.findViewById(com.google.android.libraries.cast.companionlibrary.R.id.text_empty_message);
        TextView textview = (TextView)view.findViewById(com.google.android.libraries.cast.companionlibrary.R.id.audio_empty_message);
        partitionTracks();
        mTextAdapter = new TracksListAdapter(getActivity(), com.google.android.libraries.cast.companionlibrary.R.layout.tracks_row_layout, mTextTracks, mSelectedTextPosition);
        mAudioVideoAdapter = new TracksListAdapter(getActivity(), com.google.android.libraries.cast.companionlibrary.R.layout.tracks_row_layout, mAudioTracks, mSelectedAudioPosition);
        ((ListView) (obj)).setAdapter(mTextAdapter);
        listview.setAdapter(mAudioVideoAdapter);
        view = (TabHost)view.findViewById(com.google.android.libraries.cast.companionlibrary.R.id.tabhost);
        view.setup();
        android.widget.TabHost.TabSpec tabspec = view.newTabSpec("tab1");
        if (mTextTracks == null || mTextTracks.isEmpty())
        {
            ((ListView) (obj)).setVisibility(4);
            tabspec.setContent(com.google.android.libraries.cast.companionlibrary.R.id.text_empty_message);
        } else
        {
            textview1.setVisibility(4);
            tabspec.setContent(com.google.android.libraries.cast.companionlibrary.R.id.listview1);
        }
        tabspec.setIndicator(getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_caption_subtitles));
        view.addTab(tabspec);
        obj = view.newTabSpec("tab2");
        if (mAudioTracks == null || mAudioTracks.isEmpty())
        {
            listview.setVisibility(4);
            ((android.widget.TabHost.TabSpec) (obj)).setContent(com.google.android.libraries.cast.companionlibrary.R.id.audio_empty_message);
        } else
        {
            textview.setVisibility(4);
            ((android.widget.TabHost.TabSpec) (obj)).setContent(com.google.android.libraries.cast.companionlibrary.R.id.listview2);
        }
        ((android.widget.TabHost.TabSpec) (obj)).setIndicator(getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_caption_audio));
        view.addTab(((android.widget.TabHost.TabSpec) (obj)));
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setRetainInstance(true);
        mMediaInfo = Utils.bundleToMediaInfo(getArguments().getBundle("media"));
        mCastManager = VideoCastManager.getInstance();
        mActiveTracks = mCastManager.getActiveTrackIds();
        bundle = mMediaInfo.f;
        if (bundle == null || bundle.isEmpty())
        {
            Utils.showToast(getActivity(), com.google.android.libraries.cast.companionlibrary.R.string.ccl_caption_no_tracks_available);
            dismiss();
        }
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(com.google.android.libraries.cast.companionlibrary.R.layout.custom_tracks_dialog_layout, null);
        setUpView(view);
        bundle.setView(view).setPositiveButton(getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_ok), new _cls3()).setNegativeButton(com.google.android.libraries.cast.companionlibrary.R.string.ccl_cancel, new _cls2()).setOnCancelListener(new _cls1());
        return bundle.create();
    }

    public void onDestroyView()
    {
        if (getDialog() != null && getRetainInstance())
        {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }




    private class _cls3
        implements android.content.DialogInterface.OnClickListener
    {

        final TracksChooserDialog this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            dialoginterface = new ArrayList();
            q q1 = mTextAdapter.getSelectedTrack();
            if (q1.a != -1L)
            {
                dialoginterface.add(q1);
            }
            q1 = mAudioVideoAdapter.getSelectedTrack();
            if (q1 != null)
            {
                dialoginterface.add(q1);
            }
            mCastManager.notifyTracksSelectedListeners(dialoginterface);
            getDialog().cancel();
        }

        _cls3()
        {
            this$0 = TracksChooserDialog.this;
            super();
        }
    }


    private class _cls2
        implements android.content.DialogInterface.OnClickListener
    {

        final TracksChooserDialog this$0;

        public void onClick(DialogInterface dialoginterface, int i)
        {
            getDialog().cancel();
        }

        _cls2()
        {
            this$0 = TracksChooserDialog.this;
            super();
        }
    }


    private class _cls1
        implements android.content.DialogInterface.OnCancelListener
    {

        final TracksChooserDialog this$0;

        public void onCancel(DialogInterface dialoginterface)
        {
            getDialog().cancel();
        }

        _cls1()
        {
            this$0 = TracksChooserDialog.this;
            super();
        }
    }

}
