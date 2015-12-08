// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.ScSchedulers;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.waveform.WaveformOperations;
import dagger.b;
import rx.Y;
import rx.a.b.a;

public class ClearCacheDialog extends DialogFragment
{
    private class ClearCompleteSubscriber extends DefaultSubscriber
    {

        final ClearCacheDialog this$0;

        public void onCompleted()
        {
            Toast.makeText(appContext, 0x7f0700b7, 0).show();
            dismiss();
        }

        private ClearCompleteSubscriber()
        {
            this$0 = ClearCacheDialog.this;
            super();
        }

        ClearCompleteSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final String TAG = "clear_cache";
    Context appContext;
    ImageOperations imageOperations;
    private Y subscription;
    WaveformOperations waveformOperations;

    public ClearCacheDialog()
    {
        subscription = RxUtils.invalidSubscription();
        SoundCloudApplication.getObjectGraph().a(this);
    }

    private rx.b clearCache()
    {
        return rx.b.create(new _cls1());
    }

    public static void show(FragmentManager fragmentmanager)
    {
        (new ClearCacheDialog()).show(fragmentmanager, "clear_cache");
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new ProgressDialog(getActivity());
        bundle.setTitle(0x7f0700b8);
        bundle.setMessage(getString(0x7f0700b9));
        bundle.setIndeterminate(true);
        bundle.setCancelable(false);
        subscription.unsubscribe();
        subscription = clearCache().subscribeOn(ScSchedulers.LOW_PRIO_SCHEDULER).observeOn(a.a()).subscribe(new ClearCompleteSubscriber(null));
        return bundle;
    }

    private class _cls1
        implements rx.b.f
    {

        final ClearCacheDialog this$0;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            waveformOperations.clearWaveforms();
            imageOperations.clearDiskCache();
            IOUtils.cleanDirs(new File[] {
                Consts.EXTERNAL_MEDIAPLAYER_STREAM_DIRECTORY, Consts.EXTERNAL_SKIPPY_STREAM_DIRECTORY
            });
            x.onCompleted();
        }

        _cls1()
        {
            this$0 = ClearCacheDialog.this;
            super();
        }
    }

}
