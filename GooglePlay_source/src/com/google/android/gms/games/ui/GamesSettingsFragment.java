// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.app.ActivityManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.audience.dialogs.AudienceSelectionIntentBuilder;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.people.data.AudienceMemberConversions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.client.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesIntents;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.constants.NotificationChannel;
import com.google.android.gms.games.internal.game.Acls;
import com.google.android.gms.games.logging.GamesLogflowLogger;
import com.google.android.gms.games.ui.api.GamesDestinationApi;
import com.google.android.gms.games.ui.dialog.GamesDialogBuilder;
import com.google.android.gms.games.ui.dialog.GamesDialogFragment;
import com.google.android.gms.games.ui.dialog.ProfileVisibilityDialogFragment;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.LoadingDataViewManager;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.util.AccountUtils;
import com.google.android.gms.people.internal.PeopleUtils;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.InvalidProtocolBufferMicroException;
import com.google.protobuf.micro.MessageMicro;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesListFragment, MergedAdapter, GamesSettingsActivity, DataBufferAdapter, 
//            GamesSettingsDebugActivity, G

public final class GamesSettingsFragment extends GamesListFragment
    implements DataBufferAdapter.OnEndOfWindowReachedListener, com.google.android.gms.games.ui.util.BaseGamesProfileVisibilityHelper.ProfileVisibilityInformer
{
    private final class AboutListItem extends ListItem
    {

        final GamesSettingsFragment this$0;

        public final void onBindView(View view)
        {
            ((TextView)view.findViewById(0x7f0d0075)).setText(getString(0x7f100169, new Object[] {
                getString(0x7f100030)
            }));
            ((TextView)view.findViewById(0x7f0d024a)).setText(mDestAppVersion);
        }

        public AboutListItem()
        {
            this$0 = GamesSettingsFragment.this;
            super(6, 1, false);
        }
    }

    private final class DebugSettingsListItem extends ListItem
    {

        final GamesSettingsFragment this$0;

        public final void onBindView(View view)
        {
            ((TextView)view.findViewById(0x7f0d0075)).setText(0x7f100282);
            ((TextView)view.findViewById(0x7f0d024a)).setText("");
            view.findViewById(0x7f0d0292).setVisibility(8);
        }

        public DebugSettingsListItem()
        {
            this$0 = GamesSettingsFragment.this;
            super(5, 1, true);
        }
    }

    private final class GamesSettingsAdapter extends BaseAdapter
    {

        private ArrayList mListItems;
        final GamesSettingsFragment this$0;

        public final boolean areAllItemsEnabled()
        {
            return false;
        }

        public final int getCount()
        {
            return mListItems.size();
        }

        public final Object getItem(int i)
        {
            return mListItems.get(i);
        }

        public final long getItemId(int i)
        {
            return (long)((ListItem)getItem(i)).mId;
        }

        public final int getItemViewType(int i)
        {
            return ((ListItem)getItem(i)).mType;
        }

        public final View getView(int i, View view, ViewGroup viewgroup)
        {
            ListItem listitem = (ListItem)getItem(i);
            if (view == null)
            {
                view = LayoutInflater.from(((Fragment) (listitem._fld0)).mActivity).inflate(listitem.mLayoutId, viewgroup, false);
            }
            listitem.onBindView(view);
            return view;
        }

        public final int getViewTypeCount()
        {
            return 3;
        }

        public final boolean isEnabled(int i)
        {
            return ((ListItem)mListItems.get(i)).mIsEnabled;
        }

        public GamesSettingsAdapter(ArrayList arraylist)
        {
            this$0 = GamesSettingsFragment.this;
            super();
            Asserts.checkNotNull(arraylist);
            mListItems = arraylist;
        }
    }

    private final class HeaderListItem extends ListItem
    {

        private int mTitle;
        final GamesSettingsFragment this$0;

        public final void onBindView(View view)
        {
            ((TextView)view).setText(mTitle);
        }

        public HeaderListItem(int i)
        {
            this$0 = GamesSettingsFragment.this;
            super(0, 0, false);
            mTitle = i;
        }
    }

    private final class LearnMoreListItem extends ListItem
    {

        private final int mLearnMoreStringResId = 0x7f10016a;
        final GamesSettingsFragment this$0;

        public final void onBindView(View view)
        {
            ((TextView)view.findViewById(0x7f0d0075)).setText(0x7f10016a);
            ((TextView)view.findViewById(0x7f0d024a)).setText("");
        }

        public LearnMoreListItem()
        {
            this$0 = GamesSettingsFragment.this;
            super(7, 1, true);
        }
    }

    private abstract class ListItem
    {

        int mId;
        boolean mIsEnabled;
        int mLayoutId;
        int mType;
        final GamesSettingsFragment this$0;

        public void onBindView(View view)
        {
        }

        public ListItem(int i, int j, boolean flag)
        {
            this$0 = GamesSettingsFragment.this;
            super();
            mId = i;
            mType = j;
            j;
            JVM INSTR tableswitch 0 4: default 56
        //                       0 68
        //                       1 77
        //                       2 86
        //                       3 56
        //                       4 95;
               goto _L1 _L2 _L3 _L4 _L1 _L5
_L1:
            Asserts.fail("Invalid view type");
_L7:
            mIsEnabled = flag;
            return;
_L2:
            mLayoutId = 0x7f0400ba;
            continue; /* Loop/switch isn't completed */
_L3:
            mLayoutId = 0x7f0400d0;
            continue; /* Loop/switch isn't completed */
_L4:
            mLayoutId = 0x7f0400d1;
            continue; /* Loop/switch isn't completed */
_L5:
            mLayoutId = 0x7f040085;
            if (true) goto _L7; else goto _L6
_L6:
        }
    }

    private final class LocalNotificationListItem extends ListItem
    {

        private CheckBox mBox;
        private final int mNotificationId = 3;
        private Boolean mSetChecked;
        final GamesSettingsFragment this$0;

        public final void onBindView(View view)
        {
            TextView textview = (TextView)view.findViewById(0x7f0d0075);
            TextView textview1 = (TextView)view.findViewById(0x7f0d024a);
            view.findViewById(0x7f0d0292).setVisibility(0);
            mBox = (CheckBox)view.findViewById(0x7f0d00c3);
            if (mSetChecked != null)
            {
                setChecked(mSetChecked.booleanValue());
                mSetChecked = null;
            }
            textview.setText(0x7f10016b);
            textview1.setText(0x7f10016c);
        }

        public final void setChecked(boolean flag)
        {
            if (mBox != null)
            {
                mBox.setChecked(flag);
                mBox.setVisibility(0);
                return;
            } else
            {
                GamesLog.d("GamesSettings", "LocalNotificationListItem setChecked was called before onBindView, saving requested checked state for later.");
                mSetChecked = Boolean.valueOf(flag);
                return;
            }
        }

        public LocalNotificationListItem()
        {
            this$0 = GamesSettingsFragment.this;
            super(3, 1, true);
            mSetChecked = null;
        }
    }

    private final class MutedGamesAdapter extends DataBufferAdapter
    {

        final GamesSettingsFragment this$0;

        public final volatile void bindView$675318ec(View view, Object obj)
        {
            obj = (GameFirstParty)obj;
            if (obj != null)
            {
                ((TextView)view.findViewById(0x7f0d01f7)).setText(((GameFirstParty) (obj)).getGame().getDisplayName());
                ((LoadingImageView)view.findViewById(0x7f0d01f6)).loadUri$3329f911(((GameFirstParty) (obj)).getGame().getIconImageUri(), 0x7f0200da, true);
            }
        }

        public final volatile View newView$6591d710(Context context, ViewGroup viewgroup)
        {
            return LayoutInflater.from(context).inflate(0x7f0400a0, viewgroup, false);
        }

        public MutedGamesAdapter(Context context)
        {
            this$0 = GamesSettingsFragment.this;
            super(context);
        }
    }

    private final class NotificationChannelListItem extends ListItem
    {

        private final int mChannelType;
        final GamesSettingsFragment this$0;

        public final void onBindView(View view)
        {
            Object obj;
            Object obj1;
            obj = (TextView)view.findViewById(0x7f0d0075);
            obj1 = (TextView)view.findViewById(0x7f0d024a);
            mChannelType;
            JVM INSTR tableswitch 0 2: default 52
        //                       0 79
        //                       1 177
        //                       2 162;
               goto _L1 _L2 _L3 _L4
_L3:
            break MISSING_BLOCK_LABEL_177;
_L1:
            throw new IllegalArgumentException((new StringBuilder("Unknown channel type ")).append(mChannelType).toString());
_L2:
            ((TextView) (obj)).setText(0x7f10016d);
            ((TextView) (obj1)).setText(0x7f10016e);
_L5:
            view.findViewById(0x7f0d0292).setVisibility(0);
            obj = (CheckBox)view.findViewById(0x7f0d00c3);
            view = view.findViewById(0x7f0d0073);
            if (mIsDataLoaded)
            {
                obj1 = NotificationChannel.fromInt(mChannelType);
                ((CheckBox) (obj)).setVisibility(0);
                ((CheckBox) (obj)).setChecked(mNotificationChannels.getBoolean(((String) (obj1))));
                view.setVisibility(4);
                return;
            } else
            {
                ((CheckBox) (obj)).setVisibility(4);
                view.setVisibility(0);
                return;
            }
_L4:
            ((TextView) (obj)).setText(0x7f100175);
            ((TextView) (obj1)).setText(0x7f100176);
              goto _L5
            ((TextView) (obj)).setText(0x7f100179);
            ((TextView) (obj1)).setText(0x7f10017a);
              goto _L5
        }

        public NotificationChannelListItem(int i)
        {
            this$0 = GamesSettingsFragment.this;
            super(GamesSettingsFragment.getIdForChannel(i), 1, true);
            mChannelType = i;
        }
    }

    private final class NotificationScopeListItem extends ListItem
    {

        final GamesSettingsFragment this$0;

        public final void onBindView(View view)
        {
            ((TextView)view.findViewById(0x7f0d0075)).setText(0x7f100171);
            TextView textview = (TextView)view.findViewById(0x7f0d024a);
            if (mIsDataLoaded)
            {
                if (mNotifyAcl == null)
                {
                    textview.setText("");
                } else
                if (mNotifyAcl.size() == 0)
                {
                    textview.setText(0x7f100028);
                } else
                {
                    int j = mNotifyAcl.size();
                    String as[] = new String[j];
                    for (int i = 0; i < j; i++)
                    {
                        as[i] = ((AudienceMember)mNotifyAcl.get(i)).mDisplayName;
                    }

                    textview.setText(TextUtils.join(", ", as));
                }
                view.findViewById(0x7f0d0292).setVisibility(8);
                return;
            } else
            {
                view.findViewById(0x7f0d0292).setVisibility(0);
                view.findViewById(0x7f0d00c3).setVisibility(4);
                view.findViewById(0x7f0d0073).setVisibility(0);
                return;
            }
        }

        public NotificationScopeListItem()
        {
            this$0 = GamesSettingsFragment.this;
            super(4, 1, true);
        }
    }

    private final class PublicProfileListItem extends ListItem
    {

        private TextView mStatusView;
        final GamesSettingsFragment this$0;

        public final void onBindView(View view)
        {
            TextView textview = (TextView)view.findViewById(0x7f0d0075);
            mStatusView = (TextView)view.findViewById(0x7f0d024b);
            textview.setText(0x7f100172);
            setProfileVisibility(mPublicProfile);
        }

        public final void setProfileVisibility(boolean flag)
        {
            Object obj = mParent.getResources();
            boolean flag1;
            if (flag)
            {
                mStatusView.setText(0x7f100174);
                mStatusView.setTextColor(((Resources) (obj)).getColor(0x7f0b008f));
            } else
            {
                mStatusView.setText(0x7f100173);
                mStatusView.setTextColor(((Resources) (obj)).getColor(0x7f0b008e));
            }
            flag1 = mPublicProfile;
            mPublicProfile = flag;
            if (flag1 != flag)
            {
                obj = mEventLog;
                if (!flag)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ((GamesLogflowLogger) (obj)).logSettingChangeEvent(104, flag1, flag, true);
            }
        }

        private PublicProfileListItem()
        {
            this$0 = GamesSettingsFragment.this;
            super(10, 2, true);
        }

        PublicProfileListItem(byte byte0)
        {
            this();
        }
    }

    private final class ServerListItem extends ListItem
    {

        final GamesSettingsFragment this$0;

        public final void onBindView(View view)
        {
            ((TextView)view.findViewById(0x7f0d0075)).setText(getString(0x7f100279));
            ((TextView)view.findViewById(0x7f0d024a)).setText(GamesSettingsDebugActivity.getSelectedServerFromG());
        }

        public ServerListItem()
        {
            this$0 = GamesSettingsFragment.this;
            super(8, 1, false);
        }
    }

    private final class SpacerListItem extends ListItem
    {

        private int mSize;
        final GamesSettingsFragment this$0;

        public final void onBindView(View view)
        {
            view = view.getLayoutParams();
            view.width = -1;
            view.height = mSize;
        }

        public SpacerListItem(int i)
        {
            this$0 = GamesSettingsFragment.this;
            super(11, 4, false);
            mSize = i;
        }
    }


    String mAccountName;
    private boolean mCanShowAclEditor;
    private CountDownLatch mCountDownLatch;
    private String mDestAppVersion;
    private GamesLogflowLogger mEventLog;
    private boolean mIsDataLoaded;
    private LocalNotificationListItem mLevelsNotificationsListItem;
    private MergedAdapter mMergedAdapter;
    private MutedGamesAdapter mMutedGamesAdapter;
    Bundle mNotificationChannels;
    boolean mNotificationsEnabled;
    private ArrayList mNotifyAcl;
    GamesSettingsActivity mParent;
    boolean mPublicProfile;
    private PublicProfileListItem mPublicProfileListItem;
    ArrayMap mUnmutedGamesMap;

    public GamesSettingsFragment()
    {
        mUnmutedGamesMap = new ArrayMap();
        mCanShowAclEditor = false;
    }

    static int getIdForChannel(int i)
    {
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown channel type ")).append(i).toString());

        case 0: // '\0'
            return 1;

        case 2: // '\002'
            return 9;

        case 1: // '\001'
            return 2;
        }
    }

    public static GamesSettingsFragment newInstance(String s, String s1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("accountName", s);
        bundle.putString("destAppVersion", s1);
        s = new GamesSettingsFragment();
        s.setArguments(bundle);
        return s;
    }

    public static void onContactSettingsUpdated$e184e5d()
    {
    }

    private void toggleNotificationChannel(GoogleApiClient googleapiclient, final int actionType)
    {
        String s = NotificationChannel.fromInt(actionType);
        final boolean previousValue = mNotificationChannels.getBoolean(s);
        Bundle bundle = mNotificationChannels;
        boolean flag;
        boolean flag1;
        if (!previousValue)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        bundle.putBoolean(s, flag1);
        flag = false;
        actionType;
        JVM INSTR tableswitch 0 2: default 68
    //                   0 116
    //                   1 128
    //                   2 122;
           goto _L1 _L2 _L3 _L4
_L1:
        actionType = ((flag) ? 1 : 0);
_L6:
        Games.Notifications.updateContactSettingsInternal(googleapiclient, mNotificationsEnabled, mNotificationChannels).setResultCallback(new ResultCallback() {

            final GamesSettingsFragment this$0;
            final int val$actionType;
            final boolean val$previousValue;

            public final volatile void onResult(Result result)
            {
                boolean flag3 = true;
                result = (Status)result;
                GamesSettingsFragment.onContactSettingsUpdated$e184e5d();
                GamesLogflowLogger gameslogflowlogger = mEventLog;
                int i = actionType;
                boolean flag4 = previousValue;
                boolean flag2;
                if (!previousValue)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (((Status) (result)).mStatusCode != 0)
                {
                    flag3 = false;
                }
                gameslogflowlogger.logSettingChangeEvent(i, flag4, flag2, flag3);
            }

            
            {
                this$0 = GamesSettingsFragment.this;
                actionType = i;
                previousValue = flag;
                super();
            }
        });
        mMergedAdapter.notifyDataSetInvalidated();
        return;
_L2:
        actionType = 100;
        continue; /* Loop/switch isn't completed */
_L4:
        actionType = 101;
        continue; /* Loop/switch isn't completed */
_L3:
        actionType = 102;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void updateNotifyAcl()
    {
        Object obj;
        ArrayList arraylist;
        obj = mParent.getGoogleApiClient();
        arraylist = mParent.mNotifyAcl;
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        if (!((GoogleApiClient) (obj)).isConnected()) goto _L4; else goto _L3
_L3:
        com.google.android.gms.common.people.proto.AclProto.SharingRoster sharingroster;
        sharingroster = new com.google.android.gms.common.people.proto.AclProto.SharingRoster();
        arraylist = arraylist.iterator();
_L17:
        if (!arraylist.hasNext()) goto _L6; else goto _L5
_L5:
        com.google.android.gms.common.people.proto.AclProto.SharingTargetId sharingtargetid;
        Object obj1;
        obj1 = (AudienceMember)arraylist.next();
        sharingtargetid = new com.google.android.gms.common.people.proto.AclProto.SharingTargetId();
        ((AudienceMember) (obj1)).mType;
        JVM INSTR tableswitch 1 2: default 100
    //                   1 129
    //                   2 271;
           goto _L7 _L8 _L9
_L7:
        throw new IllegalArgumentException((new StringBuilder("Unknown member type: ")).append(((AudienceMember) (obj1)).mType).toString());
_L8:
        ((AudienceMember) (obj1)).mCircleType;
        JVM INSTR tableswitch -1 -1: default 152
    //                   -1 218;
           goto _L10 _L11
_L10:
        int i = ((AudienceMember) (obj1)).mCircleType;
        i;
        JVM INSTR tableswitch 1 4: default 192
    //                   1 239
    //                   2 253
    //                   3 259
    //                   4 265;
           goto _L12 _L13 _L14 _L15 _L16
_L12:
        throw new IllegalArgumentException((new StringBuilder("Unknown system group type: ")).append(i).toString());
_L11:
        sharingtargetid.setCircleId(((AudienceMember) (obj1)).mCircleId);
_L18:
        sharingroster.addSharingTargetId(sharingtargetid);
          goto _L17
_L13:
        i = 1;
_L19:
        sharingtargetid.setGroupType(i);
          goto _L18
_L14:
        i = 2;
          goto _L19
_L15:
        i = 3;
          goto _L19
_L16:
        i = 4;
          goto _L19
_L9:
        obj1 = ((AudienceMember) (obj1)).mPeopleQualifiedId;
        com.google.android.gms.common.people.proto.AclProtoData.data.CircleMemberId circlememberid = new com.google.android.gms.common.people.proto.AclProtoData.data.CircleMemberId();
        if (PeopleUtils.isQualifiedIdFromEmail(((String) (obj1))))
        {
            circlememberid.setEmail(PeopleUtils.peopleQualifiedIdToEmailAddress(((String) (obj1))));
        } else
        {
            circlememberid.setObfuscatedGaiaId(PeopleUtils.peopleQualifiedIdToGaiaId(((String) (obj1))));
        }
        sharingtargetid.setPersonId(circlememberid);
          goto _L18
_L6:
        arraylist = new byte[sharingroster.getSerializedSize()];
        int j = arraylist.length;
        try
        {
            CodedOutputStreamMicro codedoutputstreammicro = new CodedOutputStreamMicro(arraylist, 0, j);
            sharingroster.writeTo(codedoutputstreammicro);
            if (codedoutputstreammicro.limit - codedoutputstreammicro.position != 0)
            {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
        Games.Acls.updateNotifyAclInternal(((GoogleApiClient) (obj)), Base64Utils.encodeUrlSafe(arraylist)).setResultCallback(new ResultCallback() {

            final GamesSettingsFragment this$0;

            public final volatile void onResult(Result result)
            {
                Object obj2 = (Status)result;
                result = GamesSettingsFragment.this;
                int k = ((Status) (obj2)).mStatusCode;
                obj2 = ((GamesSettingsFragment) (result)).mParent.getGoogleApiClient();
                Games.Acls.loadNotifyAclInternal(((GoogleApiClient) (obj2))).setResultCallback(result. new ResultCallback() {

                    final GamesSettingsFragment this$0;

                    public final volatile void onResult(Result result)
                    {
                        result = (com.google.android.gms.games.internal.game.Acls.LoadAclResult)result;
                        onNotifyAclLoaded(result);
                    }

            
            {
                this$0 = GamesSettingsFragment.this;
                super();
            }
                });
            }

            
            {
                this$0 = GamesSettingsFragment.this;
                super();
            }
        });
        mParent.mNotifyAcl = null;
_L2:
        return;
_L4:
        mParent.mNotifyAcl = arraylist;
        return;
    }

    public final boolean getProfileVisibility()
    {
        return mPublicProfile;
    }

    final void loadMutedGames(boolean flag)
    {
        GoogleApiClient googleapiclient = mParent.getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mParent))
        {
            return;
        } else
        {
            PlayGames.GamesMetadata.loadGames(googleapiclient, 7, 25, flag).setResultCallback(new ResultCallback() {

                final GamesSettingsFragment this$0;

                public final volatile void onResult(Result result)
                {
                    result = (com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)result;
                    onGamesLoaded(result);
                }

            
            {
                this$0 = GamesSettingsFragment.this;
                super();
            }
            });
            return;
        }
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        mParent = (GamesSettingsActivity)super.mActivity;
        mAccountName = super.mArguments.getString("accountName");
        mDestAppVersion = super.mArguments.getString("destAppVersion");
        mNotificationsEnabled = mParent.mNotificationsEnabled;
        mNotificationChannels = mParent.mNotificationChannelSettings;
        bundle = new ArrayList();
        mPublicProfileListItem = new PublicProfileListItem((byte)0);
        bundle.add(new SpacerListItem(mParent.getHeaderHeight(super.mActivity)));
        bundle.add(mPublicProfileListItem);
        bundle.add(new NotificationChannelListItem(0));
        bundle.add(new NotificationChannelListItem(2));
        bundle.add(new NotificationChannelListItem(1));
        LocalNotificationListItem localnotificationlistitem = new LocalNotificationListItem();
        mLevelsNotificationsListItem = localnotificationlistitem;
        bundle.add(localnotificationlistitem);
        bundle.add(new NotificationScopeListItem());
        bundle.add(new LearnMoreListItem());
        if (ActivityManager.isUserAMonkey()) goto _L2; else goto _L1
_L1:
        if (!AccountUtils.hasGooglerAccount(mParent)) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        if (flag)
        {
            bundle.add(new DebugSettingsListItem());
        }
        bundle.add(new HeaderListItem(0x7f10016f));
        bundle = new GamesSettingsAdapter(bundle);
        mMutedGamesAdapter = new MutedGamesAdapter(super.mActivity);
        mMutedGamesAdapter.mOnEndOfWindowReachedListener = this;
        mMutedGamesAdapter._mth1385ff();
        Object obj = (TextView)View.inflate(mParent, 0x7f040080, null);
        ((TextView) (obj)).setText(0x7f100170);
        MutedGamesAdapter mutedgamesadapter = mMutedGamesAdapter;
        mutedgamesadapter.mEmptyView = ((View) (obj));
        if (((DataBufferAdapter) (mutedgamesadapter)).mCount == 0 && !((DataBufferAdapter) (mutedgamesadapter)).mShowLoadingView)
        {
            mutedgamesadapter.notifyDataSetChanged();
        }
        mMutedGamesAdapter._mth1385ff();
        obj = new ArrayList();
        if (!TextUtils.isEmpty(mDestAppVersion))
        {
            ((ArrayList) (obj)).add(new HeaderListItem(0x7f100168));
            ((ArrayList) (obj)).add(new AboutListItem());
            if (!GamesSettingsDebugActivity.isProdServer())
            {
                ((ArrayList) (obj)).add(new ServerListItem());
            }
        }
        obj = new GamesSettingsAdapter(((ArrayList) (obj)));
        mMergedAdapter = new MergedAdapter(new BaseAdapter[] {
            bundle, mMutedGamesAdapter, obj
        });
        setListAdapter(mMergedAdapter);
        mEventLog = new GamesLogflowLogger(mParent, mAccountName);
        return;
_L4:
        if ("8.2.83 (2379351-000)".contains("eng"))
        {
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        i;
        JVM INSTR tableswitch 1 1: default 20
    //                   1 28;
           goto _L1 _L2
_L1:
        super.onActivityResult(i, j, intent);
_L4:
        return;
_L2:
        if (j == -1)
        {
            intent = (new AudienceSelectionIntentBuilder(intent)).getSelectedAudienceMembers();
            mParent.mNotifyAcl = intent;
            updateNotifyAcl();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        viewgroup = layoutinflater.findViewById(0x102000a);
        int i = getResources().getDimensionPixelSize(0x7f0c01da);
        viewgroup.setPadding(i, 0, i, 0);
        viewgroup.setScrollBarStyle(0x2000000);
        mLoadingDataViewManager.setViewState(2);
        return layoutinflater;
    }

    public final void onDestroyView()
    {
        mMutedGamesAdapter.setDataBuffer(null);
        super.onDestroyView();
    }

    public final void onEndOfWindowReached$13462e()
    {
        GoogleApiClient googleapiclient = mParent.getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mParent))
        {
            GamesLog.w("GamesSettings", "onEndOfWindowReached: not connected; ignoring...");
            return;
        } else
        {
            PlayGames.GamesMetadata.loadMoreGames(googleapiclient, 7, 25).setResultCallback(new ResultCallback() {

                final GamesSettingsFragment this$0;

                public final volatile void onResult(Result result)
                {
                    result = (com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult)result;
                    onGamesLoaded(result);
                }

            
            {
                this$0 = GamesSettingsFragment.this;
                super();
            }
            });
            return;
        }
    }

    public final void onGamesLoaded(com.google.android.gms.games.client.games.GamesMetadata.LoadGamesResult loadgamesresult)
    {
        int i = loadgamesresult.getStatus().mStatusCode;
        loadgamesresult = loadgamesresult.getGames();
        if (UiUtils.isNetworkError(i))
        {
            mMutedGamesAdapter.showFooterErrorState();
        }
        mMutedGamesAdapter.setDataBuffer(loadgamesresult);
    }

    public final void onGoogleApiClientConnected(GoogleApiClient googleapiclient)
    {
        updateNotifyAcl();
        mCountDownLatch = new CountDownLatch(3);
        mIsDataLoaded = false;
        Games.Players.loadProfileSettingsInternal$4b6585cf(googleapiclient).setResultCallback(new ResultCallback() {

            final GamesSettingsFragment this$0;

            public final volatile void onResult(Result result)
            {
                result = (com.google.android.gms.games.Players.LoadProfileSettingsResult)result;
                GamesSettingsFragment gamessettingsfragment = GamesSettingsFragment.this;
                if (result.getStatus().mStatusCode == 2)
                {
                    gamessettingsfragment.showErrorView();
                    gamessettingsfragment.onSectionLoaded();
                    return;
                } else
                {
                    gamessettingsfragment.mPublicProfile = result.isProfileVisible();
                    gamessettingsfragment.onSectionLoaded();
                    return;
                }
            }

            
            {
                this$0 = GamesSettingsFragment.this;
                super();
            }
        });
        Games.Notifications.loadContactSettingsInternalV2$4b6585cf(googleapiclient).setResultCallback(new ResultCallback() {

            final GamesSettingsFragment this$0;

            public final volatile void onResult(Result result)
            {
                Object obj;
                int i;
                obj = (com.google.android.gms.games.Notifications.ContactSettingLoadResult)result;
                result = GamesSettingsFragment.this;
                i = ((com.google.android.gms.games.Notifications.ContactSettingLoadResult) (obj)).getStatus().mStatusCode;
                obj = ((com.google.android.gms.games.Notifications.ContactSettingLoadResult) (obj)).getDataHolder();
                if (i != 2) goto _L2; else goto _L1
_L1:
                result.showErrorView();
                result.onSectionLoaded();
_L4:
                return;
_L2:
                if (i != 0) goto _L4; else goto _L3
_L3:
                int j = ((DataHolder) (obj)).getWindowIndex(0);
                result.mNotificationsEnabled = ((DataHolder) (obj)).getBoolean("mobile_notifications_enabled", 0, j);
                boolean flag = ((DataHolder) (obj)).getBoolean("match_notifications_enabled", 0, j);
                boolean flag1 = ((DataHolder) (obj)).getBoolean("quest_notifications_enabled", 0, j);
                boolean flag2 = ((DataHolder) (obj)).getBoolean("request_notifications_enabled", 0, j);
                ((GamesSettingsFragment) (result)).mNotificationChannels.putBoolean(NotificationChannel.fromInt(0), flag);
                ((GamesSettingsFragment) (result)).mNotificationChannels.putBoolean(NotificationChannel.fromInt(2), flag1);
                ((GamesSettingsFragment) (result)).mNotificationChannels.putBoolean(NotificationChannel.fromInt(1), flag2);
                result.onSectionLoaded();
                ((DataHolder) (obj)).close();
                return;
                result;
                ((DataHolder) (obj)).close();
                throw result;
            }

            
            {
                this$0 = GamesSettingsFragment.this;
                super();
            }
        });
        loadMutedGames(false);
        Games.Acls.loadNotifyAclInternal(googleapiclient).setResultCallback(new ResultCallback() {

            final GamesSettingsFragment this$0;

            public final volatile void onResult(Result result)
            {
                result = (com.google.android.gms.games.internal.game.Acls.LoadAclResult)result;
                onNotifyAclLoaded(result);
            }

            
            {
                this$0 = GamesSettingsFragment.this;
                super();
            }
        });
        if (mLevelsNotificationsListItem != null)
        {
            mLevelsNotificationsListItem.setChecked(Games.Notifications.shouldAllowLevelUpNotificationsFirstParty(googleapiclient));
        }
    }

    public final void onListItemClick$42a3bb55(int i)
    {
        Object obj = mParent.getGoogleApiClient();
        if (!UiUtils.checkClientDisconnected(((GoogleApiClient) (obj)), mParent)) goto _L2; else goto _L1
_L1:
        GamesLog.w("GamesSettings", "onListItemClick: not connected; ignoring...");
_L4:
        return;
_L2:
        Object obj1;
        obj1 = mMergedAdapter.getItem(i);
        if (!(obj1 instanceof ListItem))
        {
            continue; /* Loop/switch isn't completed */
        }
        switch (((ListItem)obj1).mId)
        {
        case 6: // '\006'
        case 8: // '\b'
        default:
            return;

        case 1: // '\001'
            toggleNotificationChannel(((GoogleApiClient) (obj)), 0);
            return;

        case 10: // '\n'
            DialogFragmentUtil.show(mParent, new ProfileVisibilityDialogFragment(), "profileVisDialog");
            return;

        case 9: // '\t'
            toggleNotificationChannel(((GoogleApiClient) (obj)), 2);
            return;

        case 2: // '\002'
            toggleNotificationChannel(((GoogleApiClient) (obj)), 1);
            return;

        case 3: // '\003'
            obj1 = (LocalNotificationListItem)obj1;
            boolean flag1 = Games.Notifications.shouldAllowLevelUpNotificationsFirstParty(((GoogleApiClient) (obj)));
            Notifications notifications = Games.Notifications;
            boolean flag;
            if (!flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            notifications.setAllowLevelUpNotificationsFirstParty(((GoogleApiClient) (obj)), flag);
            if (!flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((LocalNotificationListItem) (obj1)).setChecked(flag);
            obj = mEventLog;
            if (!flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((GamesLogflowLogger) (obj)).logSettingChangeEvent(103, flag1, flag, true);
            return;

        case 4: // '\004'
            if (mCanShowAclEditor)
            {
                obj1 = new AudienceSelectionIntentBuilder("com.google.android.gms.common.acl.CHOOSE_ACL");
                ArrayList arraylist;
                if (mNotifyAcl != null)
                {
                    arraylist = mNotifyAcl;
                } else
                {
                    arraylist = new ArrayList();
                }
                startActivityForResult(((com.google.android.gms.common.audience.dialogs.AclSelection.Builder) (obj1)).setAccountName(mAccountName).setInitialAcl(arraylist).setTitleText(" ").build(), 1);
                return;
            }
            break;

        case 5: // '\005'
            Intent intent = new Intent("com.google.android.gms.games.SHOW_GOOGLE_DEBUG_SETTINGS");
            intent.putExtra("com.google.android.gms.games.ACCOUNT_NAME", mAccountName);
            startActivityForResult(intent, 2);
            return;

        case 7: // '\007'
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)G.learnMoreNotificationsUrl.get())));
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!(obj1 instanceof GameFirstParty)) goto _L4; else goto _L5
_L5:
        GamesDialogFragment gamesdialogfragment = new GamesDialogFragment() {

            final GamesSettingsFragment this$0;
            final GameFirstParty val$game;

            protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
            {
                return gamesdialogbuilder.setTitle(0x7f100289).setMessage(mParent.getString(0x7f100287, new Object[] {
                    game.getGame().getDisplayName()
                })).setPositiveButton(0x7f100288, new android.content.DialogInterface.OnClickListener() {

                    final _cls10 this$1;

                    public final void onClick(DialogInterface dialoginterface, int i)
                    {
                        Object obj = mParent;
                        GameFirstParty gamefirstparty = game;
                        obj = ((FragmentActivity) (obj)).mFragments.findFragmentById(0x7f0d0287);
                        if (obj instanceof GamesSettingsFragment)
                        {
                            obj = (GamesSettingsFragment)obj;
                        } else
                        {
                            obj = null;
                        }
                        if (obj != null)
                        {
                            GoogleApiClient googleapiclient = ((GamesSettingsFragment) (obj)).mParent.getGoogleApiClient();
                            if (!UiUtils.checkClientDisconnected(googleapiclient, ((GamesSettingsFragment) (obj)).mParent))
                            {
                                ((GamesSettingsFragment) (obj)).mUnmutedGamesMap.put(gamefirstparty.getGame().getApplicationId(), gamefirstparty.getGame().getDisplayName());
                                Games.Notifications.unmuteGameInternal(googleapiclient, gamefirstparty.getGame().getApplicationId()).setResultCallback(((_cls7) (obj)). new ResultCallback() {

                                    final GamesSettingsFragment this$0;

                                    public final volatile void onResult(Result result)
                                    {
                                        Object obj = (com.google.android.gms.games.Notifications.GameMuteStatusChangeResult)result;
                                        result = GamesSettingsFragment.this;
                                        int i = ((com.google.android.gms.games.Notifications.GameMuteStatusChangeResult) (obj)).getStatus().mStatusCode;
                                        String s = ((com.google.android.gms.games.Notifications.GameMuteStatusChangeResult) (obj)).getExternalGameId();
                                        boolean flag = ((com.google.android.gms.games.Notifications.GameMuteStatusChangeResult) (obj)).isMuted();
                                        obj = (String)((GamesSettingsFragment) (result)).mUnmutedGamesMap.get(s);
                                        if (flag)
                                        {
                                            GamesLog.e("GamesSettings", (new StringBuilder("Application was not unmuted as it should have been. (status: ")).append(i).append(", externalGameId: ").append(s).toString());
                                        } else
                                        if (obj != null)
                                        {
                                            s = result.getString(0x7f1002c5, new Object[] {
                                                obj
                                            });
                                            Toast.makeText(((Fragment) (result)).mActivity.getApplicationContext(), s, 0).show();
                                        } else
                                        {
                                            GamesLog.w("GamesSettings", (new StringBuilder("Display name of unmuted game with externalGameId: ")).append(s).append(" was not found!").toString());
                                        }
                                        result.loadMutedGames(true);
                                    }

            
            {
                this$0 = GamesSettingsFragment.this;
                super();
            }
                                });
                            }
                        }
                        dialoginterface.dismiss();
                    }

            
            {
                this$1 = _cls10.this;
                super();
            }
                }).setNegativeButton(0x1040000, null);
            }

            
            {
                this$0 = GamesSettingsFragment.this;
                game = gamefirstparty;
                super();
            }
        };
        DialogFragmentUtil.show(super.mActivity, gamesdialogfragment, "unmuteDialog");
        return;
    }

    public final void onNotifyAclLoaded(com.google.android.gms.games.internal.game.Acls.LoadAclResult loadaclresult)
    {
        int i;
        i = loadaclresult.getStatus().mStatusCode;
        loadaclresult = loadaclresult.getDataHolder();
        if (i != 2) goto _L2; else goto _L1
_L1:
        showErrorView();
        mCanShowAclEditor = false;
        onSectionLoaded();
_L4:
        return;
_L2:
        mCanShowAclEditor = true;
        if (i != 0) goto _L4; else goto _L3
_L3:
        byte abyte0[] = Base64Utils.decodeUrlSafe(loadaclresult.getString("pacl", 0, loadaclresult.getWindowIndex(0)));
        mNotifyAcl = new ArrayList(AudienceMemberConversions.toAudienceMembersFromRenderedSharingRosters(abyte0));
        onSectionLoaded();
_L6:
        loadaclresult.close();
        return;
        Object obj;
        obj;
        GamesLog.e("GamesSettings", "Unable to parse ACL data.");
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        loadaclresult.close();
        throw obj;
    }

    void onSectionLoaded()
    {
        mCountDownLatch.countDown();
        if (mCountDownLatch.getCount() == 0L)
        {
            mIsDataLoaded = true;
            mMergedAdapter.notifyDataSetInvalidated();
        }
    }

    public final void onStart()
    {
        super.onStart();
        mCanShowAclEditor = false;
    }

    public final void onStop()
    {
        GamesSettingsActivity gamessettingsactivity = mParent;
        boolean flag = mNotificationsEnabled;
        Bundle bundle = mNotificationChannels;
        gamessettingsactivity.mNotificationsEnabled = flag;
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); gamessettingsactivity.mNotificationChannelSettings.putBoolean(s, bundle.getBoolean(s)))
        {
            s = (String)iterator.next();
        }

        super.onStop();
    }

    void showErrorView()
    {
        mLoadingDataViewManager.setViewState(6);
        Object obj = mLoadingDataViewManager;
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

            final GamesSettingsFragment this$0;

            public final void onClick(View view)
            {
                view = mActivity;
                String s = mAccountName;
                GamesDestinationApi.checkClientUi(view);
                Bundle bundle = new Bundle();
                GamesIntents.addObfuscatedAccount(bundle, s);
                bundle.putBoolean("com.google.android.gms.games.FORCE_RESOLVE_ACCOUNT_KEY", true);
                Intent intent = new Intent("com.google.android.gms.games.destination.MAIN_ACTIVITY");
                intent.putExtras(bundle);
                GamesDestinationApi.startIntent(view, intent, s);
            }

            
            {
                this$0 = GamesSettingsFragment.this;
                super();
            }
        };
        ((TextView)((LoadingDataViewManager) (obj)).mErrorView.findViewById(0x7f0d01a8)).setText(0x7f100285);
        obj = (TextView)((LoadingDataViewManager) (obj)).mErrorView.findViewById(0x7f0d01a9);
        ((TextView) (obj)).setVisibility(0);
        ((TextView) (obj)).setText(0x7f100284);
        ((TextView) (obj)).setOnClickListener(onclicklistener);
    }

    public final void updateProfileVisibility(boolean flag)
    {
        if (mPublicProfileListItem != null)
        {
            mPublicProfileListItem.setProfileVisibility(flag);
        }
    }




/*
    static boolean access$102(GamesSettingsFragment gamessettingsfragment, boolean flag)
    {
        gamessettingsfragment.mPublicProfile = flag;
        return flag;
    }

*/






}
