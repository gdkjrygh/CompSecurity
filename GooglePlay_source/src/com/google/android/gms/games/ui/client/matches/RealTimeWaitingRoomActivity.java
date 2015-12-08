// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.matches;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.data.ObjectDataBuffer;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.multiplayer.realtime.WaitingRoomListener;
import com.google.android.gms.games.service.statemachine.roomclient.RtmpWaitingRoomLog;
import com.google.android.gms.games.ui.GamesBaseAdapter;
import com.google.android.gms.games.ui.GamesViewHolder;
import com.google.android.gms.games.ui.MultiColumnDataBufferAdapter;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.ui.dialog.GamesDialogBuilder;
import com.google.android.gms.games.ui.dialog.PrebuiltDialogs;
import com.google.android.gms.games.ui.util.LoadingDataViewManager;
import java.util.ArrayList;

public final class RealTimeWaitingRoomActivity extends ClientFragmentActivity
    implements android.view.View.OnClickListener, android.view.animation.Animation.AnimationListener, WaitingRoomListener, com.google.android.gms.games.ui.util.LoadingDataViewManager.RetryListener
{
    private class _cls4
        implements android.content.DialogInterface.OnClickListener
    {

        final RealTimeWaitingRoomActivity this$0;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            setActiveDialog(0);
            if (i == -1)
            {
                startReturnToGameSequence();
                return;
            } else
            {
                scheduleAlertAfterWait();
                return;
            }
        }

        _cls4()
        {
            this$0 = RealTimeWaitingRoomActivity.this;
            super();
        }
    }

    private class _cls5
        implements android.content.DialogInterface.OnClickListener
    {

        final RealTimeWaitingRoomActivity this$0;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            setActiveDialog(0);
            if (i == -1)
            {
                updateActivityResult(10005);
                finish();
                return;
            } else
            {
                scheduleAlertAfterWait();
                return;
            }
        }

        _cls5()
        {
            this$0 = RealTimeWaitingRoomActivity.this;
            super();
        }
    }

    public static final class WaitingRoomParticipantListAdapter extends MultiColumnDataBufferAdapter
    {

        private final Context mContext;
        String mCreatorId;
        String mCurrentPlayerId;
        private final LayoutInflater mInflater;

        public final volatile void bindTileView$4098fe8c(View view, int i, Object obj)
        {
            obj = (Participant)obj;
            ViewHolder viewholder = (ViewHolder)view.getTag();
            Asserts.checkNotNull(viewholder._fld0.mCurrentPlayerId, "You must call setCurrentPlayerId() before any bindView() calls come in");
            view = viewholder._fld0.mContext.getResources();
            int j;
            boolean flag;
            int k;
            if (obj == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (obj != null)
            {
                Player player = ((Participant) (obj)).getPlayer();
                if (player != null && player.getPlayerId().equals(viewholder._fld0.mCurrentPlayerId))
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (player == null)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                k = i;
                i = j;
            } else
            {
                i = 0;
                k = 0;
            }
            if (k != 0)
            {
                viewholder.mPlayerNameMeView.setVisibility(0);
                viewholder.mPlayerNameView.setVisibility(8);
                viewholder.mPlayerNameMeView.setTypeface(viewholder.mPlayerNameMeView.getTypeface(), 1);
            } else
            if (flag)
            {
                viewholder.mPlayerNameMeView.setVisibility(8);
                viewholder.mPlayerNameView.setVisibility(0);
                DataUtils.copyStringToBuffer(view.getString(0x7f100264), viewholder.mPlayerNameViewBuffer);
            } else
            {
                viewholder.mPlayerNameMeView.setVisibility(8);
                viewholder.mPlayerNameView.setVisibility(0);
                ((Participant) (obj)).getDisplayName(viewholder.mPlayerNameViewBuffer);
            }
            viewholder.mPlayerNameView.setText(viewholder.mPlayerNameViewBuffer.data, 0, viewholder.mPlayerNameViewBuffer.sizeCopied);
            if (obj != null)
            {
                view = ((Participant) (obj)).getIconImageUri();
            } else
            {
                view = null;
            }
            viewholder.loadImage(viewholder.mPlayerImageView, view, 0x7f0200db);
            if (obj != null)
            {
                j = ((Participant) (obj)).getStatus();
            } else
            {
                j = 1;
            }
            if (obj != null)
            {
                ((Participant) (obj)).isConnectedToRoom();
            }
            if (k != 0)
            {
                i = 0;
                break MISSING_BLOCK_LABEL_220;
            } else
            {
                if (flag)
                {
                    i = 0;
                } else
                {
                    switch (j)
                    {
                    default:
                        GamesLog.w("WaitingRoomAdapter", (new StringBuilder("bindView: unexpected participant status: ")).append(j).toString());
                        Asserts.fail((new StringBuilder("bindView: unexpected participant status: ")).append(j).toString());
                        i = 0;
                        break;

                    case 1: // '\001'
                        i = 0x7f10030d;
                        break;

                    case 2: // '\002'
                        view = viewholder._fld0.mCreatorId;
                        if (((Participant) (obj)).getParticipantId().equals(view))
                        {
                            i = 0x7f10030b;
                        } else
                        if (i != 0)
                        {
                            i = 0x7f10030a;
                        } else
                        {
                            i = 0x7f10030f;
                        }
                        break;

                    case 3: // '\003'
                        i = 0x7f10030c;
                        break;

                    case 4: // '\004'
                        i = 0x7f10030e;
                        break;

                    case 0: // '\0'
                    case 5: // '\005'
                    case 6: // '\006'
                        i = 0;
                        break;
                    }
                }
                continue;
            }
            do
            {
                if (i > 0)
                {
                    viewholder.mStatusView.setText(i);
                    viewholder.mStatusView.setVisibility(0);
                } else
                {
                    viewholder.mStatusView.setVisibility(8);
                }
                if (j == 2)
                {
                    viewholder.mPlayerImageView.setTintColorId(0);
                    viewholder.mPlayerNameView.setTypeface(viewholder.mPlayerNameView.getTypeface(), 1);
                    viewholder.mPlayerNameView.setTextColor(viewholder._fld0.mContext.getResources().getColor(0x7f0b00c5));
                    viewholder.mStatusView.setTextColor(viewholder._fld0.mContext.getResources().getColor(0x7f0b00c7));
                    return;
                }
                if (j == 3 || j == 4 || j == -1)
                {
                    viewholder.mPlayerImageView.setTintColorId(0x7f0b00c3);
                    viewholder.mPlayerNameView.setTypeface(viewholder.mPlayerNameView.getTypeface(), 0);
                    viewholder.mPlayerNameView.setTextColor(viewholder._fld0.mContext.getResources().getColor(0x7f0b00c3));
                    viewholder.mStatusView.setTextColor(viewholder._fld0.mContext.getResources().getColor(0x7f0b00c3));
                    return;
                }
                viewholder.mPlayerImageView.setTintColorId(0x7f0b00c8);
                viewholder.mPlayerNameView.setTypeface(viewholder.mPlayerNameView.getTypeface(), 0);
                viewholder.mPlayerNameView.setTextColor(viewholder._fld0.mContext.getResources().getColor(0x7f0b00c5));
                viewholder.mStatusView.setTextColor(viewholder._fld0.mContext.getResources().getColor(0x7f0b00c7));
                break;
            } while (true);
            return;
        }

        public final boolean isEnabled(int i)
        {
            return false;
        }

        public final View newTileView$70777715()
        {
            View view = mInflater.inflate(0x7f0400ea, null);
            view.setTag(new ViewHolder(this, view));
            return view;
        }

        public final void setRoom(Room room)
        {
            ArrayList arraylist;
            ArrayList arraylist1;
            Preconditions.checkNotNull(room);
            mCreatorId = room.getCreatorId();
            arraylist = room.getParticipants();
            arraylist1 = new ArrayList(arraylist.size());
            if (mCurrentPlayerId == null) goto _L2; else goto _L1
_L1:
            int i = 0;
_L7:
            if (i >= arraylist.size()) goto _L2; else goto _L3
_L3:
            Participant participant;
            Player player;
            participant = (Participant)arraylist.get(i);
            player = participant.getPlayer();
            if (player == null || !player.getPlayerId().equals(mCurrentPlayerId)) goto _L5; else goto _L4
_L4:
            arraylist1.add(participant);
_L2:
            for (i = 0; i < arraylist.size(); i++)
            {
                Participant participant1 = (Participant)arraylist.get(i);
                Player player1 = participant1.getPlayer();
                if (mCurrentPlayerId == null || player1 == null || !player1.getPlayerId().equals(mCurrentPlayerId))
                {
                    arraylist1.add(participant1);
                }
            }

            break; /* Loop/switch isn't completed */
_L5:
            i++;
            if (true) goto _L7; else goto _L6
_L6:
            int k = Asserts.checkNotNull(room);
            int l = arraylist1.size();
            for (int j = 0; j < k - l; j++)
            {
                arraylist1.add(null);
            }

            setDataBuffer(new ObjectDataBuffer((Participant[])arraylist1.toArray(new Participant[arraylist1.size()])));
            return;
        }

        public WaitingRoomParticipantListAdapter(ClientFragmentActivity clientfragmentactivity)
        {
            super(clientfragmentactivity, 0x7f0e0013);
            mContext = clientfragmentactivity;
            mInflater = (LayoutInflater)clientfragmentactivity.getSystemService("layout_inflater");
        }
    }

    private final class WaitingRoomParticipantListAdapter.ViewHolder extends GamesViewHolder
    {

        final LoadingImageView mPlayerImageView;
        final TextView mPlayerNameMeView;
        final TextView mPlayerNameView;
        final CharArrayBuffer mPlayerNameViewBuffer = new CharArrayBuffer(64);
        final TextView mStatusView;
        final WaitingRoomParticipantListAdapter this$0;

        public WaitingRoomParticipantListAdapter.ViewHolder(GamesBaseAdapter gamesbaseadapter, View view)
        {
            this$0 = WaitingRoomParticipantListAdapter.this;
            super(gamesbaseadapter);
            mPlayerImageView = (LoadingImageView)view.findViewById(0x7f0d01d4);
            mPlayerNameMeView = (TextView)view.findViewById(0x7f0d02c5);
            mPlayerNameView = (TextView)view.findViewById(0x7f0d01d5);
            mStatusView = (TextView)view.findViewById(0x7f0d02c6);
        }
    }


    private static final int DIALOG_POPUP_AFTER_SECONDS[] = {
        120, 480, 1200
    };
    private static int DIALOG_TYPE_IMPOSSIBLE = 1;
    private static int DIALOG_TYPE_KEEP_WAITING_OR_CANCEL = 2;
    private static int DIALOG_TYPE_KEEP_WAITING_OR_START_EARLY = 3;
    private static int DIALOG_TYPE_NONE = 0;
    private AlertDialog mActiveDialog;
    private int mActiveDialogType;
    private WaitingRoomParticipantListAdapter mAdapter;
    private String mCurrentPlayerId;
    private Runnable mDialogRunnable;
    private Handler mHandler;
    private TextView mHeaderStatusView;
    private boolean mInForeground;
    private LoadingDataViewManager mLoadingDataViewManager;
    private int mMinParticipantsToStartEarly;
    private View mOverlay;
    private int mPendingResultCode;
    private Intent mPendingResultData;
    private Animation mPlaySlideInAnimation;
    private Animation mPlaySlideOutAnimation;
    private int mPopupDelayIndex;
    private View mProgressSpinner;
    private Room mRoom;
    private RtmpWaitingRoomLog mRtmpWaitingRoomLog;
    private Runnable mShowStartEarlyRunnable;
    private boolean mShowStartNow;
    private View mStartNowBarContainer;
    private TextView mStartNowButton;
    private TextView mStartNowButtonSubtitle;
    private boolean mStartNowIsAnimating;

    public RealTimeWaitingRoomActivity()
    {
        super(0, 0x7f120006);
        mPendingResultCode = 0;
        mInForeground = false;
    }

    private void cancelAlertAfterWait()
    {
        if (mHandler != null && mDialogRunnable != null)
        {
            mHandler.removeCallbacks(mDialogRunnable);
        }
        mDialogRunnable = null;
    }

    private void cancelShowStartEarly()
    {
        if (mHandler != null && mShowStartEarlyRunnable != null)
        {
            mHandler.removeCallbacks(mShowStartEarlyRunnable);
        }
        mShowStartEarlyRunnable = null;
    }

    private int getNumConnected()
    {
        Asserts.checkNotNull(mRoom);
        if (mRoom != null) goto _L2; else goto _L1
_L1:
        int k = 0;
_L4:
        return k;
_L2:
        ArrayList arraylist = mRoom.getParticipants();
        int l = arraylist.size();
        int i = 0;
        int j = 0;
        do
        {
            k = i;
            if (j >= l)
            {
                continue;
            }
            Participant participant = (Participant)arraylist.get(j);
            int i1 = participant.getStatus();
            k = i;
            if (participant.isConnectedToRoom())
            {
                k = i;
                if (i1 != 3)
                {
                    k = i;
                    if (i1 != 4)
                    {
                        k = i + 1;
                    }
                }
            }
            j++;
            i = k;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean isGameImpossible()
    {
        Asserts.checkNotNull(mRoom);
        int j = 0;
        ArrayList arraylist = mRoom.getParticipants();
        int l = arraylist.size();
        int i1 = Math.min(mMinParticipantsToStartEarly, l);
        for (int i = 0; i < l;)
        {
            int k;
label0:
            {
                int j1 = ((Participant)arraylist.get(i)).getStatus();
                if (j1 != 3)
                {
                    k = j;
                    if (j1 != 4)
                    {
                        break label0;
                    }
                }
                k = j + 1;
            }
            i++;
            j = k;
        }

        return l - j < i1;
    }

    private Animation loadAnimation(int i)
    {
        Animation animation = AnimationUtils.loadAnimation(this, i);
        animation.setFillAfter(true);
        animation.setAnimationListener(this);
        return animation;
    }

    private void logStaleRoomWarningAndFinish()
    {
        GamesLog.w("WaitingRoom", "Stale room! We're being restarted after having been previously stopped.");
        GamesLog.w("WaitingRoom", "We were disconnected from the games service while stopped, so our Room object may now be out of date.");
        GamesLog.w("WaitingRoom", "We can't display the room correctly any more, so bailing out with RESULT_CANCELED...");
        updateActivityResult(0);
        finish();
    }

    private boolean okToStartPlaying()
    {
        if (mRoom != null)
        {
            ArrayList arraylist = mRoom.getParticipants();
            int j = arraylist.size();
            int k = getNumConnected();
            boolean flag = false;
            for (int i = 0; i < j;)
            {
                Participant participant = (Participant)arraylist.get(i);
                Player player = participant.getPlayer();
                boolean flag1 = flag;
                if (player != null)
                {
                    flag1 = flag;
                    if (player.getPlayerId().equals(mCurrentPlayerId))
                    {
                        flag1 = participant.isConnectedToRoom();
                    }
                }
                i++;
                flag = flag1;
            }

            if (flag && k >= mMinParticipantsToStartEarly)
            {
                return true;
            }
        }
        return false;
    }

    private void replaceActiveDialog(AlertDialog alertdialog, int i)
    {
        if (mActiveDialog != null && mActiveDialog.isShowing())
        {
            mActiveDialog.dismiss();
        }
        if (alertdialog == null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        View view = alertdialog.findViewById(getResources().getIdentifier("android:id/titleDivider", null, null));
        if (view != null)
        {
            try
            {
                view.setVisibility(8);
            }
            catch (android.content.res.Resources.NotFoundException notfoundexception) { }
        }
        setActiveDialog(alertdialog, i);
        return;
    }

    private void scheduleAlertAfterWait()
    {
        if (mPopupDelayIndex >= 3 || mRoom == null)
        {
            return;
        } else
        {
            mDialogRunnable = new Runnable() {

                final RealTimeWaitingRoomActivity this$0;

                public final void run()
                {
                    if (mRoom == null || isFinishing())
                    {
                        return;
                    }
                    if (okToStartPlaying())
                    {
                        _cls4 _lcls4 = this. new _cls4();
                        return;
                    } else
                    {
                        _cls5 _lcls5 = this. new _cls5();
                        return;
                    }
                }

            
            {
                this$0 = RealTimeWaitingRoomActivity.this;
                super();
            }
            };
            Handler handler = mHandler;
            Runnable runnable = mDialogRunnable;
            int ai[] = DIALOG_POPUP_AFTER_SECONDS;
            int i = mPopupDelayIndex;
            mPopupDelayIndex = i + 1;
            handler.postDelayed(runnable, (long)ai[i] * 1000L);
            return;
        }
    }

    private void setActiveDialog(AlertDialog alertdialog, int i)
    {
        mActiveDialog = alertdialog;
        mActiveDialogType = i;
    }

    private void setResultLocal(int i)
    {
        mPendingResultCode = i;
        setResult(i);
    }

    private void setResultLocal(int i, Intent intent)
    {
        mPendingResultCode = i;
        setResult(i, intent);
    }

    private void setupLogContextIfNeeded(GoogleApiClient googleapiclient)
    {
        if (mRoom != null)
        {
            RtmpWaitingRoomLog rtmpwaitingroomlog = mRtmpWaitingRoomLog;
            String s = mRoom.getRoomId();
            rtmpwaitingroomlog.mLog.roomId = s;
        }
        if (!mRtmpWaitingRoomLog.hasContext() && googleapiclient.isConnected())
        {
            RtmpWaitingRoomLog rtmpwaitingroomlog1 = mRtmpWaitingRoomLog;
            Context context = getApplicationContext();
            String s1 = mClientPackageName;
            String s2 = Games.getCurrentAccountName(googleapiclient);
            googleapiclient = Games.getAppId(googleapiclient);
            rtmpwaitingroomlog1.mContext = context;
            rtmpwaitingroomlog1.mExternalGameId = s2;
            rtmpwaitingroomlog1.mCallingPackageName = s1;
            rtmpwaitingroomlog1.mResolvedAccountName = googleapiclient;
        }
    }

    private void showOrHideBottomBar()
    {
        if (!okToStartPlaying() && mShowStartNow)
        {
            if (!mStartNowIsAnimating)
            {
                mStartNowIsAnimating = true;
                mStartNowBarContainer.startAnimation(mPlaySlideOutAnimation);
            }
            mStartNowBarContainer.setVisibility(0);
            mShowStartNow = false;
        } else
        if (okToStartPlaying() && !mShowStartNow)
        {
            if (!mStartNowIsAnimating)
            {
                mStartNowIsAnimating = true;
                mStartNowBarContainer.startAnimation(mPlaySlideInAnimation);
            }
            mStartNowBarContainer.setVisibility(0);
            mShowStartNow = true;
            return;
        }
    }

    private void startReturnToGameSequence()
    {
        replaceActiveDialog(null, 0);
        getWindow().setFlags(1024, 1024);
        getDelegate().getSupportActionBar().hide();
        Object obj = (TextView)mOverlay.findViewById(0x7f0d0141);
        TextView textview = (TextView)mOverlay.findViewById(0x7f0d0142);
        Object obj1 = (TextView)mOverlay.findViewById(0x7f0d0143);
        View view = mOverlay.findViewById(0x7f0d01ba);
        LoadingImageView loadingimageview = (LoadingImageView)mOverlay.findViewById(0x7f0d0265);
        ((TextView) (obj1)).setText(0x7f100310);
        ((TextView) (obj1)).setVisibility(0);
        ((TextView) (obj)).setVisibility(8);
        textview.setVisibility(8);
        view.setVisibility(8);
        obj1 = super.mClientGame;
        if (obj1 != null)
        {
            android.net.Uri uri = ((Game) (obj1)).getHiResImageUri();
            obj = uri;
            if (uri == null)
            {
                obj = ((Game) (obj1)).getIconImageUri();
            }
            loadingimageview.loadUri$3329f911(((android.net.Uri) (obj)), 0x7f0200da, true);
            loadingimageview.setVisibility(0);
        } else
        {
            loadingimageview.setVisibility(4);
        }
        com.google.android.gms.games.ui.util.UiUtils.Fade.show(mOverlay);
        obj = new Runnable() {

            final RealTimeWaitingRoomActivity this$0;

            public final void run()
            {
                Asserts.checkMainThread("return to game sequence not on main thread");
                if (!mInForeground || !getGoogleApiClient().isConnected())
                {
                    updateActivityResult(0);
                } else
                {
                    updateActivityResult(-1);
                }
                finish();
            }

            
            {
                this$0 = RealTimeWaitingRoomActivity.this;
                super();
            }
        };
        mHandler.postDelayed(((Runnable) (obj)), 1000L);
    }

    private void updateActivityResult(int i)
    {
        setResultLocal(i, mPendingResultData);
    }

    private void updateActivityResult(Room room)
    {
        Context context = AndroidUtils.getCallingContext(this);
        Bundle bundle;
        if (room != null)
        {
            room = (RoomEntity)room.freeze();
        } else
        {
            room = null;
        }
        bundle = new Bundle();
        if (room == null)
        {
            bundle.putParcelable("room", null);
        } else
        if (!com.google.android.gms.common.internal.DowngradeableSafeParcel.DowngradeableSafeParcelHelper.putParcelable(bundle, "room", room, context, Integer.valueOf(mClientVersionCode)))
        {
            GamesLog.e("WaitingRoom", "Unable to return room to game. Something has gone very wrong.");
            setResultLocal(0);
            finish();
            return;
        }
        mPendingResultData = new Intent();
        mPendingResultData.putExtras(bundle);
        setResultLocal(mPendingResultCode, mPendingResultData);
    }

    private void updateBottomBar()
    {
label0:
        {
            if (mShowStartNow)
            {
                int i = getNumConnected();
                if (mRoom.getParticipants().size() - i <= 0)
                {
                    break label0;
                }
                mStartNowButton.setGravity(80);
                mStartNowButtonSubtitle.setText(getResources().getQuantityString(0x7f0f0012, i, new Object[] {
                    Integer.valueOf(i)
                }));
                mStartNowButtonSubtitle.setVisibility(0);
            }
            return;
        }
        mStartNowButton.setGravity(16);
        mStartNowButtonSubtitle.setVisibility(8);
    }

    private void updateHeader()
    {
        int i;
        boolean flag;
        flag = false;
        Asserts.checkNotNull(mRoom);
        if (mRoom == null)
        {
            mHeaderStatusView.setText(null);
            return;
        }
        i = 0;
        mRoom.getStatus();
        JVM INSTR tableswitch 0 4: default 72
    //                   0 152
    //                   1 208
    //                   2 224
    //                   3 240
    //                   4 254;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_254;
_L1:
        Object obj;
        GamesLog.w("WaitingRoom", (new StringBuilder("updateHeader: unexpected room status: ")).append(mRoom).toString());
        Asserts.fail((new StringBuilder("updateHeader: unexpected room status: ")).append(mRoom).toString());
        obj = null;
_L7:
        if (obj != null)
        {
            mHeaderStatusView.setText(((CharSequence) (obj)));
        } else
        {
            mHeaderStatusView.setText(null);
        }
        obj = mProgressSpinner;
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        return;
_L2:
        if (getNumConnected() > 1)
        {
            obj = getResources().getQuantityString(0x7f0f0011, getNumConnected(), new Object[] {
                Integer.valueOf(getNumConnected())
            });
        } else
        {
            obj = getResources().getString(0x7f100314);
        }
        i = 1;
          goto _L7
_L3:
        obj = getResources().getString(0x7f100312);
        i = 1;
          goto _L7
_L4:
        obj = getResources().getString(0x7f100313);
        i = 1;
          goto _L7
_L5:
        obj = getResources().getString(0x7f100311);
          goto _L7
        GamesLog.w("WaitingRoom", (new StringBuilder("updateHeader: unexpected DELETED status: ")).append(mRoom).toString());
        obj = null;
          goto _L7
    }

    private void updateLoadingDataView()
    {
        GoogleApiClient googleapiclient;
        try
        {
            googleapiclient = getGoogleApiClient();
        }
        catch (IllegalStateException illegalstateexception)
        {
            GamesLog.w("WaitingRoom", "updateLoadingDataView: couldn't get GoogleApiClient");
            return;
        }
        if (!googleapiclient.isConnected())
        {
            mLoadingDataViewManager.setViewState(1);
            return;
        }
        if (mRoom.getParticipants().size() == 0)
        {
            GamesLog.w("WaitingRoom", "displayParticipants: room has no participants!");
            mLoadingDataViewManager.setViewState(3);
            return;
        } else
        {
            mLoadingDataViewManager.setViewState(2);
            return;
        }
    }

    private void updateRoom(Room room, boolean flag)
    {
        Asserts.checkNotNull(room);
        if (mRoom != null && !mRoom.getRoomId().equals(room.getRoomId()))
        {
            GamesLog.w("WaitingRoom", "updateRoom: room changed out from under us!");
            GamesLog.w("WaitingRoom", (new StringBuilder("- previous: ")).append(mRoom).toString());
            GamesLog.w("WaitingRoom", (new StringBuilder("-      new: ")).append(room).toString());
            Asserts.fail("updateRoom: room changed out from under us!");
        }
        mRoom = room;
        updateActivityResult(mRoom);
        updateHeader();
        mAdapter.setRoom(mRoom);
        updateLoadingDataView();
        if (isGameImpossible())
        {
            cancelAlertAfterWait();
            room = new android.content.DialogInterface.OnClickListener() {

                final RealTimeWaitingRoomActivity this$0;

                public final void onClick(DialogInterface dialoginterface, int i)
                {
                    updateActivityResult(10005);
                    finish();
                }

            
            {
                this$0 = RealTimeWaitingRoomActivity.this;
                super();
            }
            };
            replaceActiveDialog(PrebuiltDialogs.getGamesThemedBuilder(this).setTitle(0x7f100306).setMessage(0x7f100307).setNeutralButton(0x104000a, room).show(), DIALOG_TYPE_IMPOSSIBLE);
        }
        if (okToStartPlaying())
        {
            replaceActiveDialog(null, 0);
            cancelShowStartEarly();
            mShowStartEarlyRunnable = new Runnable() {

                final RealTimeWaitingRoomActivity this$0;

                public final void run()
                {
                    if (mRoom == null || isFinishing())
                    {
                        return;
                    } else
                    {
                        showOrHideBottomBar();
                        updateBottomBar();
                        return;
                    }
                }

            
            {
                this$0 = RealTimeWaitingRoomActivity.this;
                super();
            }
            };
            mHandler.postDelayed(mShowStartEarlyRunnable, 10000L);
        } else
        {
            if (flag && (mActiveDialogType == DIALOG_TYPE_KEEP_WAITING_OR_CANCEL || mActiveDialogType == DIALOG_TYPE_KEEP_WAITING_OR_START_EARLY))
            {
                replaceActiveDialog(null, 0);
                mPopupDelayIndex = mPopupDelayIndex - 1;
                if (mPopupDelayIndex < 0)
                {
                    mPopupDelayIndex = 0;
                }
                scheduleAlertAfterWait();
            }
            cancelShowStartEarly();
            showOrHideBottomBar();
        }
        updateBottomBar();
    }

    public final int getHeaderMode()
    {
        return 2;
    }

    protected final int getLogEventType()
    {
        return 9;
    }

    protected final int getWrappableContentResId()
    {
        return 0x7f0400c6;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    public final void onAnimationEnd(Animation animation)
    {
        mStartNowIsAnimating = false;
        if (animation == mPlaySlideInAnimation && !mShowStartNow)
        {
            mStartNowIsAnimating = true;
            mStartNowBarContainer.startAnimation(mPlaySlideOutAnimation);
        } else
        if (animation == mPlaySlideOutAnimation && mShowStartNow)
        {
            mStartNowIsAnimating = true;
            mStartNowBarContainer.startAnimation(mPlaySlideInAnimation);
            return;
        }
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }

    public final void onClick(View view)
    {
        if (view.getId() == 0x7f0d0267)
        {
            view = mRtmpWaitingRoomLog;
            com.google.android.gms.games.proto.PlayGames.PlaylogRtmpWaitingRoomSession.RtmpWaitingRoomEvent rtmpwaitingroomevent = new com.google.android.gms.games.proto.PlayGames.PlaylogRtmpWaitingRoomSession.RtmpWaitingRoomEvent();
            rtmpwaitingroomevent.eventType = 1;
            rtmpwaitingroomevent.deltaMs = view.deltaNow();
            ((RtmpWaitingRoomLog) (view)).mEvents.add(rtmpwaitingroomevent);
            startReturnToGameSequence();
            return;
        } else
        {
            GamesLog.w("WaitingRoom", (new StringBuilder("onClick: unexpected view: ")).append(view).append(", id ").append(view.getId()).toString());
            return;
        }
    }

    public final void onConnected(Bundle bundle)
    {
        boolean flag1 = true;
        super.onConnected(bundle);
        if (mRoom == null)
        {
            GamesLog.w("WaitingRoom", "onConnected: no valid room; ignoring this callback...");
            return;
        }
        Object obj = getGoogleApiClient();
        setupLogContextIfNeeded(((GoogleApiClient) (obj)));
        Asserts.checkState(((GoogleApiClient) (obj)).isConnected());
        boolean flag;
        if (mRoom != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        mCurrentPlayerId = Games.Players.getCurrentPlayerId(((GoogleApiClient) (obj)));
        if (mCurrentPlayerId == null)
        {
            GamesLog.w("WaitingRoom", "We don't have a current player, something went wrong. Finishing the activity");
            setResultLocal(10001);
            finish();
            return;
        }
        Asserts.checkNotNull(mCurrentPlayerId);
        mAdapter.mCurrentPlayerId = (String)Preconditions.checkNotNull(mCurrentPlayerId);
        mAdapter.setRoom(mRoom);
        bundle = mRoom.getRoomId();
        if (!TextUtils.isEmpty(bundle))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        obj = Games.RealTimeMultiplayer.registerWaitingRoomListenerRestricted(((GoogleApiClient) (obj)), this, bundle);
        if (obj != null)
        {
            GamesLog.i("WaitingRoom", (new StringBuilder("Room status after registering listener: ")).append(((Room) (obj)).getStatus()).toString());
            updateRoom(((Room) (obj)), false);
            if (((Room) (obj)).getStatus() == 3)
            {
                startReturnToGameSequence();
            }
            updateLoadingDataView();
            return;
        } else
        {
            GamesLog.e("WaitingRoom", (new StringBuilder("Room ")).append(bundle).append(" invalid.  Finishing activity.").toString());
            updateActivityResult(10008);
            finish();
            return;
        }
    }

    public final void onConnectedToRoom(Room room)
    {
        updateRoom(room, false);
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mRtmpWaitingRoomLog = new RtmpWaitingRoomLog();
        Object obj = AndroidUtils.getCallingContext(this);
        if (obj == null)
        {
            GamesLog.e("WaitingRoom", "Could not find calling context. Aborting activity.");
            setResultLocal(0);
            finish();
            return;
        }
        Intent intent = getIntent();
        obj = (Room)com.google.android.gms.common.internal.DowngradeableSafeParcel.DowngradeableSafeParcelHelper.getParcelable(intent, "room", ((Context) (obj)), Integer.valueOf(mClientVersionCode));
        updateActivityResult(((Room) (obj)));
        if (obj == null)
        {
            GamesLog.e("WaitingRoom", "EXTRA_ROOM extra missing; bailing out...");
            setResultLocal(10008);
            finish();
            return;
        }
        getWindow().addFlags(128);
        if (bundle != null)
        {
            updateActivityResult(((Room) (obj)));
            logStaleRoomWarningAndFinish();
            return;
        }
        mMinParticipantsToStartEarly = intent.getIntExtra("com.google.android.gms.games.MIN_PARTICIPANTS_TO_START", -1);
        if (mMinParticipantsToStartEarly < 0)
        {
            GamesLog.e("WaitingRoom", "EXTRA_MIN_PARTICIPANTS_TO_START extra missing; bailing out...");
            setResultLocal(10004);
            finish();
            return;
        }
        if (mMinParticipantsToStartEarly < 2)
        {
            mMinParticipantsToStartEarly = 2;
        }
        mHeaderStatusView = (TextView)findViewById(0x7f0d026d);
        mProgressSpinner = findViewById(0x7f0d026e);
        mOverlay = findViewById(0x7f0d0263);
        mStartNowBarContainer = findViewById(0x7f0d0266);
        findViewById(0x7f0d0267).setOnClickListener(this);
        mStartNowButton = (TextView)findViewById(0x7f0d026a);
        mStartNowButtonSubtitle = (TextView)findViewById(0x7f0d026b);
        mPlaySlideInAnimation = loadAnimation(0x7f05000f);
        mPlaySlideOutAnimation = loadAnimation(0x7f050010);
        mStartNowBarContainer.setVisibility(8);
        mStartNowIsAnimating = false;
        mShowStartNow = false;
        mPopupDelayIndex = 0;
        bundle = findViewById(0x7f0d0262);
        mLoadingDataViewManager = new LoadingDataViewManager(bundle, this);
        mLoadingDataViewManager.setViewState(1);
        bundle = (ListView)bundle.findViewById(0x102000a);
        bundle.setFocusable(false);
        mAdapter = new WaitingRoomParticipantListAdapter(this);
        bundle.setAdapter(mAdapter);
        mHandler = new Handler(getMainLooper());
        updateRoom(((Room) (obj)), false);
        scheduleAlertAfterWait();
        bundle = findViewById(0x7f0d0053);
        obj = bundle.getLayoutParams();
        obj.height = getHeaderHeight(this);
        bundle.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
    }

    public final void onDestroy()
    {
        super.onDestroy();
    }

    public final void onDisconnectedFromRoom(Room room)
    {
        GamesLog.i("WaitingRoom", "CALLBACK: onDisconnectedFromRoom()...");
        updateRoom(room, false);
    }

    public final void onJoinedRoom$2623dbd5(Room room)
    {
        Asserts.fail((new StringBuilder("unexpected callback: onJoinedRoom: ")).append(room).toString());
    }

    public final void onLeftRoom$4f708078(String s)
    {
        Asserts.fail((new StringBuilder("unexpected callback: onLeftRoom: ")).append(s).toString());
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x7f0d0355)
        {
            GamesLog.d("WaitingRoom", (new StringBuilder("User explicitly asked to leave the room! item = ")).append(menuitem).toString());
            updateActivityResult(10005);
            finish();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public final void onPause()
    {
        mInForeground = false;
        super.onPause();
    }

    public final void onPeerDeclined$40879e9d(Room room)
    {
        updateRoom(room, false);
    }

    public final void onPeerInvitedToRoom$40879e9d(Room room)
    {
        updateRoom(room, false);
    }

    public final void onPeerJoined$40879e9d(Room room)
    {
        updateRoom(room, true);
    }

    public final void onPeerLeft$40879e9d(Room room)
    {
        updateRoom(room, false);
    }

    public final void onPeersConnected$40879e9d(Room room)
    {
        updateRoom(room, false);
    }

    public final void onPeersDisconnected$40879e9d(Room room)
    {
        updateRoom(room, false);
    }

    public final void onResume()
    {
        mInForeground = true;
        super.onResume();
        if (mRoom == null)
        {
            return;
        } else
        {
            updateHeader();
            return;
        }
    }

    public final void onRetry()
    {
    }

    public final void onRoomAutoMatching(Room room)
    {
        updateRoom(room, false);
    }

    public final void onRoomConnected(int i, Room room)
    {
        GamesLog.i("WaitingRoom", "CALLBACK: onRoomConnected()...");
        GamesLog.i("WaitingRoom", (new StringBuilder("onRoomConnected: statusCode = ")).append(i).append(" for room ID: ").append(room.getRoomId()).toString());
        cancelAlertAfterWait();
        cancelShowStartEarly();
        updateRoom(room, false);
        startReturnToGameSequence();
    }

    public final void onRoomConnecting(Room room)
    {
        updateRoom(room, false);
    }

    public final void onRoomCreated$2623dbd5(Room room)
    {
        Asserts.fail((new StringBuilder("unexpected callback: onRoomCreated: ")).append(room).toString());
    }

    protected final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("savedStateRecreatedFlag", true);
    }

    public final void onStart()
    {
        setupLogContextIfNeeded(getGoogleApiClient());
        if (mRoom == null)
        {
            logStaleRoomWarningAndFinish();
        }
        super.onStart();
    }

    public final void onStop()
    {
        int i = 0;
        if (mRtmpWaitingRoomLog.hasContext())
        {
            RtmpWaitingRoomLog rtmpwaitingroomlog = mRtmpWaitingRoomLog;
            int j = mPendingResultCode;
            boolean flag;
            if (!rtmpwaitingroomlog.mHasBeenDispatched)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag, " Cannot log the same log twice!");
            rtmpwaitingroomlog.mHasBeenDispatched = true;
            rtmpwaitingroomlog.mLog.resultCode = j;
            rtmpwaitingroomlog.mLog.onStopTimeMs = rtmpwaitingroomlog.deltaNow();
            rtmpwaitingroomlog.mLog.events = new com.google.android.gms.games.proto.PlayGames.PlaylogRtmpWaitingRoomSession.RtmpWaitingRoomEvent[rtmpwaitingroomlog.mEvents.size()];
            for (int k = rtmpwaitingroomlog.mEvents.size(); i < k; i++)
            {
                rtmpwaitingroomlog.mLog.events[i] = (com.google.android.gms.games.proto.PlayGames.PlaylogRtmpWaitingRoomSession.RtmpWaitingRoomEvent)rtmpwaitingroomlog.mEvents.get(i);
            }

            Asserts.checkState(rtmpwaitingroomlog.hasContext(), "Can't dispatch the log without calling setLoggingContext");
            GamesPlayLogger.logRtmpWaitingRoomEvent(rtmpwaitingroomlog.mContext, rtmpwaitingroomlog.mCallingPackageName, rtmpwaitingroomlog.mExternalGameId, rtmpwaitingroomlog.mResolvedAccountName, rtmpwaitingroomlog.mLog);
        }
        mRtmpWaitingRoomLog = new RtmpWaitingRoomLog();
        cancelAlertAfterWait();
        cancelShowStartEarly();
        if (mRoom == null)
        {
            super.onStop();
            return;
        }
        GoogleApiClient googleapiclient = getGoogleApiClient();
        if (googleapiclient.isConnected())
        {
            String s = mRoom.getRoomId();
            Games.RealTimeMultiplayer.unregisterWaitingRoomListenerRestricted(googleapiclient, s);
        }
        mRoom = null;
        super.onStop();
    }






/*
    static int access$1100(Room room)
    {
        Asserts.checkNotNull(room);
        ArrayList arraylist = room.getParticipants();
        int k = arraylist.size();
        int j = 0;
        int i = 0;
        for (; j < k; j++)
        {
            if (((Participant)arraylist.get(j)).getPlayer() != null)
            {
                i++;
            }
        }

        room = room.getAutoMatchCriteria();
        if (room != null)
        {
            j = room.getInt("max_automatch_players");
        } else
        {
            j = 0;
        }
        return j + i;
    }

*/



/*
    static void access$200(RealTimeWaitingRoomActivity realtimewaitingroomactivity)
    {
        _cls4 _lcls4 = realtimewaitingroomactivity. new _cls4();
        int i = realtimewaitingroomactivity.mRoom.getParticipants().size();
        int j = i - realtimewaitingroomactivity.getNumConnected();
        String s = realtimewaitingroomactivity.getResources().getQuantityString(0x7f0f0013, j, new Object[] {
            Integer.valueOf(j), Integer.valueOf(i)
        });
        realtimewaitingroomactivity.replaceActiveDialog(PrebuiltDialogs.getGamesThemedBuilder(realtimewaitingroomactivity).setTitle(0x7f100317).setMessage(s).setNegativeButton(0x7f100308, _lcls4).setPositiveButton(0x7f100315, _lcls4).show(), DIALOG_TYPE_KEEP_WAITING_OR_START_EARLY);
        return;
    }

*/


/*
    static void access$300(RealTimeWaitingRoomActivity realtimewaitingroomactivity)
    {
        _cls5 _lcls5 = realtimewaitingroomactivity. new _cls5();
        realtimewaitingroomactivity.replaceActiveDialog(PrebuiltDialogs.getGamesThemedBuilder(realtimewaitingroomactivity).setTitle(0x7f100317).setMessage(0x7f100316).setNegativeButton(0x7f100308, _lcls5).setPositiveButton(0x7f100305, _lcls5).show(), DIALOG_TYPE_KEEP_WAITING_OR_CANCEL);
        return;
    }

*/






}
