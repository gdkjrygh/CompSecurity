// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.configuration.Sport;
import com.phunware.nbc.sochi.MainNavigationContentActivity;
import java.util.Collection;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;

public class SportFilterListFragment extends DialogFragment
{
    public static interface Callback
    {

        public abstract void onSportSelected(Sport sport);
    }


    private Callback callback;
    Configuration config;
    private List mNBCSportsList;

    public SportFilterListFragment()
    {
        callback = new Callback() {

            final SportFilterListFragment this$0;

            public void onSportSelected(Sport sport)
            {
            }

            
            {
                this$0 = SportFilterListFragment.this;
                super();
            }
        };
    }

    private String[] getSportsList()
    {
        return (String[])CollectionUtils.collect(mNBCSportsList, new Transformer() {

            final SportFilterListFragment this$0;

            public volatile Object transform(Object obj)
            {
                return transform((Sport)obj);
            }

            public String transform(Sport sport)
            {
                return sport.getName();
            }

            
            {
                this$0 = SportFilterListFragment.this;
                super();
            }
        }).toArray(new String[mNBCSportsList.size()]);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        MainNavigationContentActivity.component().inject(this);
        mNBCSportsList = config.getSports();
        callback = (Callback)activity;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        bundle.setItems(getSportsList(), new android.content.DialogInterface.OnClickListener() {

            final SportFilterListFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                callback.onSportSelected((Sport)mNBCSportsList.get(i));
                dismiss();
            }

            
            {
                this$0 = SportFilterListFragment.this;
                super();
            }
        });
        bundle = bundle.create();
        bundle.setCanceledOnTouchOutside(true);
        return bundle;
    }


}
