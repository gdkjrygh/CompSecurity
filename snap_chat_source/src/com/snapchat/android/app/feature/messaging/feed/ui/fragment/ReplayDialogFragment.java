// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.app.feature.messaging.feed.ui.fragment;

import IC;
import LY;
import Mf;
import NT;
import Oi;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.snapchat.android.util.emoji.Emoji;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import qr;

// Referenced classes of package com.snapchat.android.app.feature.messaging.feed.ui.fragment:
//            InAppPurchaseTermsFragment

public class ReplayDialogFragment extends DialogFragment
{
    public static final class ReplayDialogResult extends Enum
    {

        private static final ReplayDialogResult $VALUES[];
        public static final ReplayDialogResult CANCEL;
        public static final ReplayDialogResult CREDIT_REPLAY;
        public static final ReplayDialogResult FREE_REPLAY;
        public static final ReplayDialogResult PAID_REPLAY;

        public static ReplayDialogResult valueOf(String s)
        {
            return (ReplayDialogResult)Enum.valueOf(com/snapchat/android/app/feature/messaging/feed/ui/fragment/ReplayDialogFragment$ReplayDialogResult, s);
        }

        public static ReplayDialogResult[] values()
        {
            return (ReplayDialogResult[])$VALUES.clone();
        }

        static 
        {
            CANCEL = new ReplayDialogResult("CANCEL", 0);
            FREE_REPLAY = new ReplayDialogResult("FREE_REPLAY", 1);
            PAID_REPLAY = new ReplayDialogResult("PAID_REPLAY", 2);
            CREDIT_REPLAY = new ReplayDialogResult("CREDIT_REPLAY", 3);
            $VALUES = (new ReplayDialogResult[] {
                CANCEL, FREE_REPLAY, PAID_REPLAY, CREDIT_REPLAY
            });
        }

        private ReplayDialogResult(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface a
    {

        public abstract void a(ReplayDialogResult replaydialogresult, String s);
    }

