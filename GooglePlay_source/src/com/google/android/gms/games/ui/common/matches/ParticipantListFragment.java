// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.matches;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.audience.dialogs.CircleSelection;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.ui.GamesFragment;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.util.ManageCirclesHelper;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.common.matches:
//            ParticipantListMetaDataProvider

public class ParticipantListFragment extends GamesFragment
    implements android.view.View.OnClickListener
{
    private final class ParticipantListAdapter extends ArrayAdapter
    {

        private final Context mContext;
        private final LayoutInflater mInflater;
        final ParticipantListFragment this$0;

        public final View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1 = view;
            if (view == null)
            {
                view1 = mInflater.inflate(0x7f0400b5, viewgroup, false);
                view1.setTag(new ViewHolder(view1));
            }
            view = (ViewHolder)view1.getTag();
            Object obj = mContext;
            viewgroup = mParticipants[i];
            if (viewgroup == null)
            {
                ((ViewHolder) (view)).mParticipantNameView.setText(0x7f100210);
                ((ViewHolder) (view)).mAvatarView.setData(null, 0x7f0200db, -1);
                ((ViewHolder) (view)).mInCirclesImageView.setVisibility(4);
                ((ViewHolder) (view)).mInCirclesImageView.setOnClickListener(null);
                ((ViewHolder) (view)).mContentView.setOnClickListener(null);
                ((ViewHolder) (view)).mContentView.setContentDescription(((Context) (obj)).getString(0x7f100210));
            } else
            {
                Object obj1 = viewgroup.getPlayer();
                if (obj1 == null)
                {
                    ((ViewHolder) (view)).mParticipantNameView.setText(viewgroup.getDisplayName());
                    ((ViewHolder) (view)).mAvatarView.setData(null, 0x7f0200db, -1);
                    ((ViewHolder) (view)).mInCirclesImageView.setVisibility(4);
                    ((ViewHolder) (view)).mInCirclesImageView.setOnClickListener(null);
                    ((ViewHolder) (view)).mContentView.setOnClickListener(null);
                    ((ViewHolder) (view)).mContentView.setContentDescription(viewgroup.getDisplayName());
                } else
                {
                    ((ViewHolder) (view)).mAvatarView.setData(((Player) (obj1)));
                    obj1 = ((Player) (obj1)).getPlayerId();
                    boolean flag = ((String) (obj1)).equals(((ViewHolder) (view))._fld0.mCurrentPlayerId);
                    if (flag)
                    {
                        ((ViewHolder) (view)).mParticipantNameView.setText(0x7f10021c);
                        ((ViewHolder) (view)).mContentView.setContentDescription(((Context) (obj)).getString(0x7f10021c));
                    } else
                    {
                        ((ViewHolder) (view)).mParticipantNameView.setText(viewgroup.getDisplayName());
                        ((ViewHolder) (view)).mContentView.setContentDescription(viewgroup.getDisplayName());
                    }
                    ((ViewHolder) (view)).mContentView.setOnClickListener(((ViewHolder) (view))._fld0);
                    ((ViewHolder) (view)).mContentView.setTag(0x7f0d0051, viewgroup);
                    obj = (Integer)((ViewHolder) (view))._fld0.mIsInCircles.get(obj1);
                    if (flag || obj != null && ((Integer) (obj)).intValue() == 1)
                    {
                        ((ViewHolder) (view)).mInCirclesImageView.setVisibility(4);
                        ((ViewHolder) (view)).mInCirclesImageView.setOnClickListener(null);
                    } else
                    {
                        ((ViewHolder) (view)).mInCirclesImageView.setVisibility(0);
                        ((ViewHolder) (view)).mInCirclesImageView.setOnClickListener(((ViewHolder) (view))._fld0);
                        ((ViewHolder) (view)).mInCirclesImageView.setTag(0x7f0d0051, viewgroup);
                    }
                }
            }
            ParticipantListMetaDataProvider _tmp = ((ViewHolder) (view))._fld0.mMetaDataProvider;
            ((ViewHolder) (view)).mParticipantNameView.setTextColor(((ViewHolder) (view))._fld0.getResources().getColor(0x7f0b0082));
            return view1;
        }

        public ParticipantListAdapter(Context context, Participant aparticipant[])
        {
            this$0 = ParticipantListFragment.this;
            super(context, 0, aparticipant);
            mContext = context;
            mInflater = (LayoutInflater)context.getSystemService("layout_inflater");
        }
    }

    public static interface ParticipantListListener
    {

        public abstract void onParticipantClicked(Participant participant);
    }

    private final class ViewHolder
    {

        final MetagameAvatarView mAvatarView;
        final View mContentView;
        final ImageView mInCirclesImageView;
        final TextView mParticipantNameView;
        final ParticipantListFragment this$0;

        public ViewHolder(View view)
        {
            this$0 = ParticipantListFragment.this;
            super();
            mParticipantNameView = (TextView)view.findViewById(0x7f0d022f);
            mAvatarView = (MetagameAvatarView)view.findViewById(0x7f0d01ba);
            mAvatarView.setOutlineStrokeWidth(0);
            mAvatarView.setShadowStrokeWidth(0);
            mInCirclesImageView = (ImageView)view.findViewById(0x7f0d022e);
            mContentView = view;
        }
    }


    private String mCurrentAccountName;
    private String mCurrentApplicationId;
    private String mCurrentPlayerId;
    private ArrayMap mIsInCircles;
    private ListView mListView;
    private Participant mManagedParticipant;
    private ParticipantListMetaDataProvider mMetaDataProvider;
    private ParticipantListAdapter mParticipantListAdapter;
    private ParticipantListListener mParticipantListListener;
    private Participant mParticipants[];

    public ParticipantListFragment()
    {
        super(0x7f0400b4);
        mIsInCircles = new ArrayMap();
    }

    protected final int getPlaylogElementType()
    {
        return 43;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        Object obj;
label0:
        {
            super.onActivityCreated(bundle);
            Asserts.checkState(mParent instanceof ParticipantListMetaDataProvider, "Parent activity did not implement ParticipantListMetaDataProvider");
            mMetaDataProvider = (ParticipantListMetaDataProvider)mParent;
            Asserts.checkState(mParent instanceof ParticipantListListener, "Parent activity did not implement ParticipantListListener");
            mParticipantListListener = (ParticipantListListener)mParent;
            mParticipants = mMetaDataProvider.getParticipants();
            mCurrentAccountName = mMetaDataProvider.getAccountName();
            mCurrentApplicationId = mMetaDataProvider.getApplicationId();
            mCurrentPlayerId = mMetaDataProvider.getCurrentPlayerId();
            android.net.Uri uri = mMetaDataProvider.getFeaturedUri();
            for (int i = 0; i < mParticipants.length; i++)
            {
                bundle = mParticipants[i];
                if (bundle == null)
                {
                    continue;
                }
                bundle = bundle.getPlayer();
                if (bundle != null)
                {
                    mIsInCircles.put(bundle.getPlayerId(), Integer.valueOf(bundle.isInCircles()));
                }
            }

            bundle = (TextView)mParent.findViewById(0x7f0d0229);
            obj = getResources().getString(0x7f100211, new Object[] {
                Integer.valueOf(mParticipants.length)
            });
            bundle.setText(((CharSequence) (obj)));
            bundle.setContentDescription(((String) (obj)).toLowerCase());
            mListView = (ListView)mParent.findViewById(0x7f0d022b);
            mListView.setItemsCanFocus(true);
            mListView.setBackgroundColor(0);
            mParticipantListAdapter = new ParticipantListAdapter(mParent, mParticipants);
            obj = (LoadingImageView)mParent.findViewById(0x7f0d022c);
            if (obj != null)
            {
                bundle = mParent;
                ParticipantListAdapter participantlistadapter = mParticipantListAdapter;
                FrameLayout framelayout = new FrameLayout(bundle);
                int i1 = participantlistadapter.getCount();
                bundle = null;
                int j = 0;
                for (int k = 0; k < i1; k++)
                {
                    bundle = participantlistadapter.getView(k, bundle, framelayout);
                    bundle.measure(0, 0);
                    int l = bundle.getMeasuredWidth();
                    if (l > j)
                    {
                        j = l;
                    }
                }

                j = (int)((double)j * 1.05D);
                bundle = mListView.getLayoutParams();
                bundle.width = Math.max(j, ((LoadingImageView) (obj)).getLayoutParams().width);
                mListView.setLayoutParams(bundle);
                mListView.setDivider(null);
                if (uri == null)
                {
                    break label0;
                }
                ((LoadingImageView) (obj)).loadUri$3329f911(uri, 0, true);
            }
            return;
        }
        ((LoadingImageView) (obj)).setVisibility(8);
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 1)
        {
            if (mManagedParticipant == null || mManagedParticipant.getPlayer() == null || intent == null)
            {
                GamesLog.w("ParticipantListFrag", "no mManagedParticipant or data for manage circles operation.");
            } else
            if (j == -1)
            {
                intent = CircleSelection.getResults(intent);
                boolean flag;
                if (!intent.getAddedCirclesDelta().isEmpty() || !intent.getRemovedCirclesDelta().isEmpty())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                GamesPlayLogger.logAddToCirclesAction(mParent, mCurrentApplicationId, mCurrentAccountName, 1, flag);
                if (intent.getSelectedCircles().size() > 0)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                mIsInCircles.put(mManagedParticipant.getPlayer().getPlayerId(), Integer.valueOf(i));
                if (intent.getAddedCirclesDelta().size() > 0)
                {
                    intent = getResources().getString(0x7f1002c7, new Object[] {
                        mManagedParticipant.getDisplayName()
                    });
                    Toast.makeText(mParent, intent, 0).show();
                }
                mParticipantListAdapter.notifyDataSetChanged();
                return;
            }
        }
    }

    public void onClick(View view)
    {
        Participant participant = (Participant)view.getTag(0x7f0d0051);
        Player player = participant.getPlayer();
        int i = view.getId();
        if (i == 0x7f0d022e)
        {
            Asserts.checkNotNull(player);
            mManagedParticipant = participant;
            ManageCirclesHelper.startHelperFromFragment(player, null, this, getGoogleApiClient(), mCurrentAccountName, 1);
        } else
        if (i == 0x7f0d022d)
        {
            mParticipantListListener.onParticipantClicked(participant);
            return;
        }
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        super.onGoogleApiClientConnected(googleapiclient);
        mListView.setAdapter(mParticipantListAdapter);
    }




}
