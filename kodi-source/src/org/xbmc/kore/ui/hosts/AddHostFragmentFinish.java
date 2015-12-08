// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import org.xbmc.kore.service.LibrarySyncService;

public class AddHostFragmentFinish extends Fragment
{
    public static interface AddHostFinishListener
    {

        public abstract void onAddHostFinish();
    }


    private AddHostFinishListener listener;

    public AddHostFragmentFinish()
    {
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (getView() == null)
        {
            return;
        } else
        {
            bundle = (TextView)getView().findViewById(0x7f0e005d);
            bundle.setText(Html.fromHtml(getString(0x7f0700b0)));
            bundle.setMovementMethod(LinkMovementMethod.getInstance());
            bundle = (Button)getView().findViewById(0x7f0e009c);
            bundle.setText(0x7f070046);
            bundle.setOnClickListener(new android.view.View.OnClickListener() {

                final AddHostFragmentFinish this$0;

                public void onClick(View view)
                {
                    listener.onAddHostFinish();
                }

            
            {
                this$0 = AddHostFragmentFinish.this;
                super();
            }
            });
            bundle = (Button)getView().findViewById(0x7f0e0097);
            bundle.setText(null);
            bundle.setEnabled(false);
            bundle = new Intent(getActivity(), org/xbmc/kore/service/LibrarySyncService);
            bundle.putExtra("sync_all_movies", true);
            bundle.putExtra("sync_all_tvshows", true);
            bundle.putExtra("sync_all_music", true);
            bundle.putExtra("sync_all_music_videos", true);
            getActivity().startService(bundle);
            return;
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            listener = (AddHostFinishListener)activity;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement AddHostFinishListener interface.").toString());
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030022, viewgroup, false);
    }

}
