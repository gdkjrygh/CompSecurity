// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.e;
import com.skype.android.SkypeFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.app.location.LocationUtil;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.FileUtil;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.async.UiCallback;
import java.util.concurrent.Callable;

public class AttributionsFragment extends SkypeFragment
{

    private static final String GOOGLE_PLAY_TITLE = "\n----------------------------------------------\n\nGoogle Play Services attribution\n\n\n";
    AsyncService asyncService;
    EcsConfiguration configuration;

    public AttributionsFragment()
    {
    }

    private boolean isLocationSharingEnabled()
    {
        return (new LocationUtil()).isLocationSharingEnabled(getActivity(), configuration);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030119, viewgroup, false);
    }

    public void onViewCreated(final View textView, Bundle bundle)
    {
        super.onViewCreated(textView, bundle);
        textView = (TextView)textView.findViewById(0x7f10054c);
        final boolean isLocationSharingEnabled = isLocationSharingEnabled();
        asyncService.a(new Callable() {

            final AttributionsFragment this$0;
            final boolean val$isLocationSharingEnabled;

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            public final String call()
                throws android.content.res.Resources.NotFoundException
            {
                StringBuilder stringbuilder = new StringBuilder(FileUtil.inputStreamToString(getResources().openRawResource(0x7f070020)));
                if (isLocationSharingEnabled)
                {
                    stringbuilder.append("\n----------------------------------------------\n\nGoogle Play Services attribution\n\n\n").append(e.d(getActivity()));
                }
                return stringbuilder.toString();
            }

            
            {
                this$0 = AttributionsFragment.this;
                isLocationSharingEnabled = flag;
                super();
            }
        }, new UiCallback(this, new AsyncCallback() {

            final AttributionsFragment this$0;
            final TextView val$textView;

            public final void done(AsyncResult asyncresult)
            {
                textView.setText((CharSequence)asyncresult.a());
            }

            
            {
                this$0 = AttributionsFragment.this;
                textView = textview;
                super();
            }
        }));
    }
}
