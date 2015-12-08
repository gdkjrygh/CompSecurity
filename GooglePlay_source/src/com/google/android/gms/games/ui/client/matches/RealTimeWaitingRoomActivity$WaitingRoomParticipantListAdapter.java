// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.matches;

import android.content.Context;
import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.data.ObjectDataBuffer;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.ui.GamesBaseAdapter;
import com.google.android.gms.games.ui.GamesViewHolder;
import com.google.android.gms.games.ui.MultiColumnDataBufferAdapter;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.client.matches:
//            RealTimeWaitingRoomActivity

public static final class mInflater extends MultiColumnDataBufferAdapter
{
    private final class ViewHolder extends GamesViewHolder
    {

        final LoadingImageView mPlayerImageView;
        final TextView mPlayerNameMeView;
        final TextView mPlayerNameView;
        final CharArrayBuffer mPlayerNameViewBuffer = new CharArrayBuffer(64);
        final TextView mStatusView;
        final RealTimeWaitingRoomActivity.WaitingRoomParticipantListAdapter this$0;

        public ViewHolder(GamesBaseAdapter gamesbaseadapter, View view)
        {
            this$0 = RealTimeWaitingRoomActivity.WaitingRoomParticipantListAdapter.this;
            super(gamesbaseadapter);
            mPlayerImageView = (LoadingImageView)view.findViewById(0x7f0d01d4);
            mPlayerNameMeView = (TextView)view.findViewById(0x7f0d02c5);
            mPlayerNameView = (TextView)view.findViewById(0x7f0d01d5);
            mStatusView = (TextView)view.findViewById(0x7f0d02c6);
        }
    }


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
        int k = RealTimeWaitingRoomActivity.access$1100(room);
        int l = arraylist1.size();
        for (int j = 0; j < k - l; j++)
        {
            arraylist1.add(null);
        }

        setDataBuffer(new ObjectDataBuffer((Participant[])arraylist1.toArray(new Participant[arraylist1.size()])));
        return;
    }

    public ViewHolder.mStatusView(ClientFragmentActivity clientfragmentactivity)
    {
        super(clientfragmentactivity, 0x7f0e0013);
        mContext = clientfragmentactivity;
        mInflater = (LayoutInflater)clientfragmentactivity.getSystemService("layout_inflater");
    }
}
