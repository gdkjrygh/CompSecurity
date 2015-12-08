// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.addfriends;

import Mf;
import NH;
import OC;
import Pp;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.emilsjolander.components.stickylistheaders.StickyListHeadersListView;
import com.snapchat.android.model.Friend;
import com.snapchat.android.model.FriendAction;
import com.snapchat.android.model.FriendManager;
import com.snapchat.android.ui.listeners.SwipeableListItemTouchListener;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lX;
import ll;
import wN;
import wR;
import wS;

// Referenced classes of package com.snapchat.android.fragments.addfriends:
//            FriendListProperty

public abstract class SwipeableFriendsFragment extends SnapchatFragment
    implements com.snapchat.android.fragments.MiniProfileFragment.a, LeftSwipeContainerFragment.a, com.snapchat.android.ui.listeners.SwipeableListItemTouchListener.b, wN.a
{
