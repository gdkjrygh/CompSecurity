// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.util.Pair;
import com.google.android.apps.wallet.api.Sound;
import com.google.android.apps.wallet.ui.dialog.alert.AlertDialogFragment;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import java.util.List;

public final class NotificationSoundPicker
{

    private final FragmentActivity mActivity;
    private android.view.View.OnClickListener mOnSelectionCompleteListener;
    private List mRingtoneData;
    private String mRingtoneLocation;
    private String mRingtoneNames[];
    private String mRingtoneTitle;
    private int mSelectSoundIndex;
    private AlertDialogFragment mSoundPickerDialog;

    public NotificationSoundPicker(FragmentActivity fragmentactivity)
    {
        mActivity = fragmentactivity;
    }

    private static String getDefaultRingToneUriLocation()
    {
        Uri uri = RingtoneManager.getDefaultUri(2);
        if (uri == null)
        {
            return "";
        } else
        {
            return uri.toString();
        }
    }

    public static String getRingtoneTitle(Context context, String s)
    {
        if (isSilentSound(s))
        {
            return context.getString(com.google.android.apps.walletnfcrel.R.string.notification_settings_sound_silent);
        }
        if (isWalletSound(s))
        {
            return context.getString(com.google.android.apps.walletnfcrel.R.string.notification_settings_sound_wallet);
        }
        if (isDefaultRingtone(s))
        {
            return context.getString(com.google.android.apps.walletnfcrel.R.string.notification_settings_sound_default);
        }
        s = RingtoneManager.getRingtone(context, Uri.parse(s));
        if (s == null)
        {
            return "";
        } else
        {
            return s.getTitle(context);
        }
    }

    private void handleRingtoneSelected(int i)
    {
        if (i == -1)
        {
            saveRingtoneSelection();
            if (mOnSelectionCompleteListener != null)
            {
                mOnSelectionCompleteListener.onClick(null);
            }
        } else
        {
            if (i == 0)
            {
                Sound.playPaymentSuccessSound(mActivity);
                mSelectSoundIndex = i;
                return;
            }
            if (i == 1)
            {
                Object obj = RingtoneManager.getDefaultUri(2);
                if (obj != null)
                {
                    obj = RingtoneManager.getRingtone(mActivity, ((Uri) (obj)));
                    if (obj != null)
                    {
                        ((Ringtone) (obj)).play();
                    }
                }
                mSelectSoundIndex = i;
                return;
            }
            if (i == 2)
            {
                mSelectSoundIndex = i;
                return;
            }
            if (i > 2 && i < mRingtoneNames.length)
            {
                ((Ringtone)((Pair)mRingtoneData.get(i - 3)).first).play();
                mSelectSoundIndex = i;
                return;
            }
        }
    }

    private static boolean isDefaultRingtone(String s)
    {
        return getDefaultRingToneUriLocation().equals(s);
    }

    private static boolean isSilentSound(String s)
    {
        return Strings.isNullOrEmpty(s);
    }

    private static boolean isWalletSound(String s)
    {
        return "content://settings/wallet/notification_sound".equals(s);
    }

    private void saveRingtoneSelection()
    {
        if (mSelectSoundIndex == 0)
        {
            mRingtoneLocation = "content://settings/wallet/notification_sound";
            mRingtoneTitle = mActivity.getString(com.google.android.apps.walletnfcrel.R.string.notification_settings_sound_wallet);
        } else
        {
            if (mSelectSoundIndex == 1)
            {
                mRingtoneLocation = getDefaultRingToneUriLocation();
                mRingtoneTitle = mActivity.getString(com.google.android.apps.walletnfcrel.R.string.notification_settings_sound_default);
                return;
            }
            if (mSelectSoundIndex == 2)
            {
                mRingtoneLocation = "";
                mRingtoneTitle = mActivity.getString(com.google.android.apps.walletnfcrel.R.string.silent_notification);
                return;
            }
            if (mSelectSoundIndex > 2 && mSelectSoundIndex < mRingtoneNames.length)
            {
                Pair pair = (Pair)mRingtoneData.get(mSelectSoundIndex - 3);
                mRingtoneLocation = ((Uri)pair.second).toString();
                mRingtoneTitle = ((Ringtone)pair.first).getTitle(mActivity);
                return;
            }
        }
    }

    private void setSelectedSoundIndex()
    {
        mSelectSoundIndex = 0;
        if (isSilentSound(mRingtoneLocation))
        {
            mSelectSoundIndex = 2;
        } else
        {
            if (isWalletSound(mRingtoneLocation))
            {
                mSelectSoundIndex = 0;
                return;
            }
            if (isDefaultRingtone(mRingtoneLocation))
            {
                mSelectSoundIndex = 1;
                return;
            }
            Uri uri = Uri.parse(mRingtoneLocation);
            int i = 0;
            while (i < mRingtoneData.size()) 
            {
                if (((Uri)((Pair)mRingtoneData.get(i)).second).equals(uri))
                {
                    mSelectSoundIndex = i + 3;
                    return;
                }
                i++;
            }
        }
    }

    public final String getRingtoneLocation()
    {
        return mRingtoneLocation;
    }

    public final String getRingtoneTitle()
    {
        return mRingtoneTitle;
    }

    public final void initialize()
    {
        if (mRingtoneData == null)
        {
            RingtoneManager ringtonemanager = new RingtoneManager(mActivity);
            ringtonemanager.setType(2);
            mRingtoneData = Lists.newArrayList();
            int i;
            for (Cursor cursor = ringtonemanager.getCursor(); cursor.moveToNext(); mRingtoneData.add(new Pair(ringtonemanager.getRingtone(i), ringtonemanager.getRingtoneUri(i))))
            {
                i = cursor.getPosition();
            }

            mRingtoneNames = new String[mRingtoneData.size() + 3];
            mRingtoneNames[0] = mActivity.getString(com.google.android.apps.walletnfcrel.R.string.notification_settings_sound_wallet);
            mRingtoneNames[1] = mActivity.getString(com.google.android.apps.walletnfcrel.R.string.notification_settings_sound_default);
            mRingtoneNames[2] = mActivity.getString(com.google.android.apps.walletnfcrel.R.string.notification_settings_sound_silent);
            int j = 0;
            while (j < mRingtoneData.size()) 
            {
                mRingtoneNames[j + 3] = ((Ringtone)((Pair)mRingtoneData.get(j)).first).getTitle(mActivity);
                j++;
            }
        }
    }

    public final void setOnSelectionCompleteListener(android.view.View.OnClickListener onclicklistener)
    {
        mOnSelectionCompleteListener = onclicklistener;
    }

    public final void setRingtoneLocation(String s)
    {
        mRingtoneLocation = s;
    }

    public final void showPicker()
    {
        setSelectedSoundIndex();
        mSoundPickerDialog = AlertDialogFragment.newBuilder().setTitle(com.google.android.apps.walletnfcrel.R.string.notification_settings_sounds_picker_title).setSingleChoiceItems(mRingtoneNames, mSelectSoundIndex).setPositiveButton(com.google.android.apps.walletnfcrel.R.string.button_ok).setNegativeButton(com.google.android.apps.walletnfcrel.R.string.button_cancel).build();
        mSoundPickerDialog.setOnClickListener(new android.content.DialogInterface.OnClickListener() {

            final NotificationSoundPicker this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                handleRingtoneSelected(i);
            }

            
            {
                this$0 = NotificationSoundPicker.this;
                super();
            }
        });
        mSoundPickerDialog.show(mActivity.getSupportFragmentManager(), "DIALOG_NOTIFICATIONS_SOUND");
    }

}
