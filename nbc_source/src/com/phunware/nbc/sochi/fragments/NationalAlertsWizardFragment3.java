// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.phunware.nbc.sochi.content.AlertOption;
import com.phunware.nbc.sochi.data.AlertOptionAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NationalAlertsWizardFragment3 extends Fragment
{
    public static interface NaWizardCallback3
    {

        public abstract void onNationalAlertOptionsChosen(List list, List list1);

        public abstract void onRegionalAlertOptionsChosen(List list, List list1);
    }


    private static final String ARG_ALERT_OPTIONS = "ARG_ALERT_OPTIONS";
    private static final String ARG_IS_ALERT_SECTION = "ARG_IS_ALERT_SECTION";
    private static final String ARG_RSNDMAMODEL = "ARG_RSNDMAMODEL";
    private static final String ARG_RSNDMAS = "ARG_RSNDMAS";
    private static final String ARG_SHOW_ALL = "ARG_SHOW_ALL";
    private AlertOptionAdapter mAdapter;
    private ExpandableListView mAlertOptionsListView;
    private List mAllAlertOptions;
    private NaWizardCallback3 mCallback;
    private air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel mData;
    private TextView mHeader;
    private boolean mIsAlertSection;
    private Button mNext;
    private List mRsnDmas;
    private List mSelectedOptions;
    private boolean mShowAllAlertOptions;

    public NationalAlertsWizardFragment3()
    {
    }

    private List getMatchingAlertOptions()
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        for (Iterator iterator = mRsnDmas.iterator(); iterator.hasNext(); arraylist1.add(((air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel.RsnDma)iterator.next()).rsn)) { }
        Iterator iterator1 = mAllAlertOptions.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            AlertOption alertoption = (AlertOption)iterator1.next();
            if (arraylist1.contains(alertoption.getRsn()))
            {
                arraylist.add(alertoption);
            }
        } while (true);
        return arraylist;
    }

    public static NationalAlertsWizardFragment3 newInstance(air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel rsndmamodel, List list, List list1, boolean flag, boolean flag1)
    {
        NationalAlertsWizardFragment3 nationalalertswizardfragment3 = new NationalAlertsWizardFragment3();
        Bundle bundle = new Bundle();
        Gson gson = new Gson();
        bundle.putBoolean("ARG_SHOW_ALL", flag);
        bundle.putString("ARG_ALERT_OPTIONS", gson.toJson(list));
        bundle.putString("ARG_RSNDMAMODEL", gson.toJson(rsndmamodel));
        bundle.putString("ARG_RSNDMAS", gson.toJson(list1));
        bundle.putBoolean("ARG_IS_ALERT_SECTION", flag1);
        nationalalertswizardfragment3.setArguments(bundle);
        return nationalalertswizardfragment3;
    }

    private void setupAlertOptionsList(LayoutInflater layoutinflater)
    {
        mAdapter = new AlertOptionAdapter(getActivity());
        if (!mShowAllAlertOptions) goto _L2; else goto _L1
_L1:
        mAdapter.setData(getNationalOptions());
_L4:
        mAlertOptionsListView.setAdapter(mAdapter);
        mAlertOptionsListView.setOnGroupClickListener(new android.widget.ExpandableListView.OnGroupClickListener() {

            final NationalAlertsWizardFragment3 this$0;

            public boolean onGroupClick(ExpandableListView expandablelistview, View view, int i, long l)
            {
                expandablelistview = ((ExpandableListView) (expandablelistview.getExpandableListAdapter().getGroup(i)));
                if (expandablelistview instanceof AlertOption)
                {
                    expandablelistview = (AlertOption)expandablelistview;
                    if (expandablelistview.getSubsections() == null || expandablelistview.getSubsections().size() <= 0)
                    {
                        expandablelistview.toggleSelected();
                    }
                }
                return false;
            }

            
            {
                this$0 = NationalAlertsWizardFragment3.this;
                super();
            }
        });
        mAlertOptionsListView.setOnChildClickListener(new android.widget.ExpandableListView.OnChildClickListener() {

            final NationalAlertsWizardFragment3 this$0;

            public boolean onChildClick(ExpandableListView expandablelistview, View view, int i, int j, long l)
            {
                expandablelistview = ((ExpandableListView) (expandablelistview.getExpandableListAdapter().getChild(i, j)));
                if (expandablelistview instanceof AlertOption)
                {
                    ((AlertOption)expandablelistview).toggleSelected();
                }
                mAdapter.notifyDataSetChanged();
                return false;
            }

            
            {
                this$0 = NationalAlertsWizardFragment3.this;
                super();
            }
        });
        mAlertOptionsListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final NationalAlertsWizardFragment3 this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
label0:
                {
                    adapterview = ((AdapterView) (adapterview.getAdapter().getItem(i)));
                    if (adapterview instanceof AlertOption)
                    {
                        adapterview = (AlertOption)adapterview;
                        if (adapterview.getSubsections() == null || adapterview.getSubsections().size() <= 0)
                        {
                            break label0;
                        }
                    }
                    return;
                }
                mAlertOptionsListView.setItemChecked(i, true);
            }

            
            {
                this$0 = NationalAlertsWizardFragment3.this;
                super();
            }
        });
        mAlertOptionsListView.setVisibility(0);
        mNext.setVisibility(8);
        return;
_L2:
        mAdapter.setData(getMatchingAlertOptions());
        if (mAdapter.getGroupCount() == 0)
        {
            mHeader.setText(0x7f0700df);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public List getNationalOptions()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = mAllAlertOptions.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            AlertOption alertoption = (AlertOption)iterator.next();
            if (alertoption.getRsn() == null)
            {
                arraylist.add(alertoption);
            }
        } while (true);
        return arraylist;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            mCallback = (NaWizardCallback3)activity;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement NaWizardCallback3").toString());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new Gson();
        mData = (air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel)bundle.fromJson(getArguments().getString("ARG_RSNDMAMODEL"), air/com/nbcuni/com/nbcsports/liveextra/NationalAlertsWizardActivity$RsnDmaModel);
        mRsnDmas = (List)bundle.fromJson(getArguments().getString("ARG_RSNDMAS"), (new TypeToken() {

            final NationalAlertsWizardFragment3 this$0;

            
            {
                this$0 = NationalAlertsWizardFragment3.this;
                super();
            }
        }).getType());
        mAllAlertOptions = (List)bundle.fromJson(getArguments().getString("ARG_ALERT_OPTIONS"), (new TypeToken() {

            final NationalAlertsWizardFragment3 this$0;

            
            {
                this$0 = NationalAlertsWizardFragment3.this;
                super();
            }
        }).getType());
        mShowAllAlertOptions = getArguments().getBoolean("ARG_SHOW_ALL");
        mIsAlertSection = getArguments().getBoolean("ARG_IS_ALERT_SECTION");
        mSelectedOptions = new ArrayList();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040031, viewgroup, false);
        mNext = (Button)layoutinflater.findViewById(0x7f0f0098);
        mAlertOptionsListView = (ExpandableListView)layoutinflater.findViewById(0x7f0f009d);
        mHeader = (TextView)layoutinflater.findViewById(0x7f0f0096);
        return layoutinflater;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = LayoutInflater.from(getActivity());
        if (mShowAllAlertOptions)
        {
            mHeader.setText(0x7f070181);
        } else
        {
            mHeader.setText(0x7f070183);
        }
        setupAlertOptionsList(view);
        mNext.setVisibility(0);
        mNext.setEnabled(true);
        mNext.setOnClickListener(new android.view.View.OnClickListener() {

            final NationalAlertsWizardFragment3 this$0;

            public void onClick(View view1)
            {
                view1 = mAdapter.getSelectedAlertOptions();
                if (mShowAllAlertOptions)
                {
                    mCallback.onNationalAlertOptionsChosen((List)((Pair) (view1)).first, (List)((Pair) (view1)).second);
                    return;
                } else
                {
                    mCallback.onRegionalAlertOptionsChosen((List)((Pair) (view1)).first, (List)((Pair) (view1)).second);
                    return;
                }
            }

            
            {
                this$0 = NationalAlertsWizardFragment3.this;
                super();
            }
        });
        if (mIsAlertSection)
        {
            mNext.setText("Save");
        }
    }

    public void setNextButtonEnabled(boolean flag)
    {
        if (mNext != null)
        {
            mNext.setEnabled(flag);
        }
    }

    public void showAllAlertOptions()
    {
        mShowAllAlertOptions = true;
        mAdapter.setData(getNationalOptions());
        mHeader.setText(0x7f070181);
    }




}
