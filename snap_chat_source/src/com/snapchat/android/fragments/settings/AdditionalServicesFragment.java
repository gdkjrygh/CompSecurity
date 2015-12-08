// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import AJ;
import Aa;
import Ac;
import Ak;
import Am;
import An;
import Bj;
import Bt;
import IC;
import JY;
import Mf;
import Nt;
import Oi;
import android.app.AlertDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.fragments.settings.customfriendmoji.FriendmojiLegendFragment;
import com.squareup.otto.Bus;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mP;
import rd;
import re;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            LeftSwipeSettingFragment, PermissionsExplanationFragment

public class AdditionalServicesFragment extends LeftSwipeSettingFragment
{
