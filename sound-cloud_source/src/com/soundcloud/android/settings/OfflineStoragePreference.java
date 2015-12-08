// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import a.a;
import android.content.Context;
import android.content.res.Resources;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;

// Referenced classes of package com.soundcloud.android.settings:
//            OfflineUsage, UsageBarView

public final class OfflineStoragePreference extends Preference
{

    private static final double ONE_GIGABYTE = 1073741824D;
    private OfflineUsage offlineUsage;
    private final android.widget.SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = new _cls1();
    private android.preference.Preference.OnPreferenceChangeListener onStorageLimitChangeListener;
    private final Resources resources;
    TextView storageFreeTextView;
    TextView storageLimitLabelTextView;
    SeekBar storageLimitSeekBar;
    TextView storageLimitTextView;
    TextView storageOtherLabelTextView;
    TextView storageUsedLabelTextView;
    UsageBarView usageBarView;

    public OfflineStoragePreference(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setPersistent(false);
        setLayoutResource(0x7f03008b);
        resources = context.getResources();
    }

    private double bytesToGB(long l)
    {
        return (double)l / 1073741824D;
    }

    private String formatFreeGigabytes()
    {
        return String.format(resources.getString(0x7f0702fc), new Object[] {
            Double.valueOf(bytesToGB(offlineUsage.getDeviceAvailable())), Double.valueOf(bytesToGB(offlineUsage.getDeviceTotal()))
        });
    }

    private String formatGigabytes(long l)
    {
        return String.format(resources.getString(0x7f0702ff), new Object[] {
            Double.valueOf(bytesToGB(l))
        });
    }

    private String formatLimitGigabytes()
    {
        if (offlineUsage.isUnlimited())
        {
            return resources.getString(0x7f070216);
        } else
        {
            return formatGigabytes(offlineUsage.getActualOfflineLimit());
        }
    }

    private void updateLabels()
    {
        storageLimitSeekBar.setProgress(offlineUsage.getOfflineLimitPercentage());
        storageLimitTextView.setText(formatLimitGigabytes());
        storageFreeTextView.setText(formatFreeGigabytes());
        storageOtherLabelTextView.setText(formatGigabytes(offlineUsage.getUsedOthers()));
        storageUsedLabelTextView.setText(formatGigabytes(offlineUsage.getOfflineUsed()));
        storageLimitLabelTextView.setText(formatGigabytes(offlineUsage.getUsableOfflineLimit()));
    }

    private void updateUsageBarView()
    {
        usageBarView.reset().addBar(0x7f0e00e9, offlineUsage.getUsedOthers()).addBar(0x7f0e00ea, offlineUsage.getOfflineUsed()).addBar(0x7f0e00e8, offlineUsage.getOfflineAvailable()).addBar(0x7f0e00e7, offlineUsage.getUnused());
    }

    private void updateView()
    {
        updateUsageBarView();
        updateLabels();
    }

    protected final View onCreateView(ViewGroup viewgroup)
    {
        viewgroup = super.onCreateView(viewgroup);
        a.a(this, viewgroup);
        storageLimitSeekBar.setOnSeekBarChangeListener(onSeekBarChangeListener);
        updateAndRefresh();
        return viewgroup;
    }

    protected final void onPrepareForRemoval()
    {
        super.onPrepareForRemoval();
        onStorageLimitChangeListener = null;
    }

    public final void setOfflineUsage(OfflineUsage offlineusage)
    {
        offlineUsage = offlineusage;
    }

    public final void setOnPreferenceChangeListener(android.preference.Preference.OnPreferenceChangeListener onpreferencechangelistener)
    {
        onStorageLimitChangeListener = onpreferencechangelistener;
    }

    public final void updateAndRefresh()
    {
        if (offlineUsage != null)
        {
            offlineUsage.update();
        }
        updateView();
    }




    private class _cls1
        implements android.widget.SeekBar.OnSeekBarChangeListener
    {

        private boolean showLimitToast;
        final OfflineStoragePreference this$0;

        public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
        {
            if (flag)
            {
                if (!offlineUsage.setOfflineLimitPercentage(i))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                showLimitToast = flag;
                updateView();
            }
        }

        public void onStartTrackingTouch(SeekBar seekbar)
        {
        }

        public void onStopTrackingTouch(SeekBar seekbar)
        {
            if (onStorageLimitChangeListener != null)
            {
                seekbar = onStorageLimitChangeListener;
                OfflineStoragePreference offlinestoragepreference = OfflineStoragePreference.this;
                long l;
                if (offlineUsage.isUnlimited())
                {
                    l = 0x7fffffffffffffffL;
                } else
                {
                    l = offlineUsage.getActualOfflineLimit();
                }
                seekbar.onPreferenceChange(offlinestoragepreference, Long.valueOf(l));
                if (showLimitToast)
                {
                    Toast.makeText(getContext(), 0x7f0702d7, 0).show();
                    showLimitToast = false;
                }
            }
        }

        _cls1()
        {
            this$0 = OfflineStoragePreference.this;
            super();
            showLimitToast = false;
        }
    }

}
