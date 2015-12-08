// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.widget.SeekBar;
import android.widget.Toast;

// Referenced classes of package com.soundcloud.android.settings:
//            OfflineStoragePreference, OfflineUsage

class showLimitToast
    implements android.widget.ener
{

    private boolean showLimitToast;
    final OfflineStoragePreference this$0;

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (flag)
        {
            if (!OfflineStoragePreference.access$000(OfflineStoragePreference.this).setOfflineLimitPercentage(i))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            showLimitToast = flag;
            OfflineStoragePreference.access$100(OfflineStoragePreference.this);
        }
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        if (OfflineStoragePreference.access$200(OfflineStoragePreference.this) != null)
        {
            seekbar = OfflineStoragePreference.access$200(OfflineStoragePreference.this);
            OfflineStoragePreference offlinestoragepreference = OfflineStoragePreference.this;
            long l;
            if (OfflineStoragePreference.access$000(OfflineStoragePreference.this).isUnlimited())
            {
                l = 0x7fffffffffffffffL;
            } else
            {
                l = OfflineStoragePreference.access$000(OfflineStoragePreference.this).getActualOfflineLimit();
            }
            seekbar.onPreferenceChange(offlinestoragepreference, Long.valueOf(l));
            if (showLimitToast)
            {
                Toast.makeText(getContext(), 0x7f0702d7, 0).show();
                showLimitToast = false;
            }
        }
    }

    ()
    {
        this$0 = OfflineStoragePreference.this;
        super();
        showLimitToast = false;
    }
}
