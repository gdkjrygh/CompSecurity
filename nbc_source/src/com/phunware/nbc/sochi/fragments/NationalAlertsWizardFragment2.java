// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.google.gson.Gson;
import com.phunware.nbc.sochi.data.RsnDmaAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NationalAlertsWizardFragment2 extends Fragment
{
    public static interface NaWizardCallback2
    {

        public abstract void onNoClicked();

        public abstract void onNoneOfTheseClicked();

        public abstract void onRsnDmasChosen(List list);
    }


    private NaWizardCallback2 mCallback;
    private air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel mData;
    private TextView mHeader;
    private TextView mInstructions;
    private Button mNext;
    private Button mNoButton;
    private LinearLayout mRsnContainer;
    private ListView mRsnListView;
    private List mSelectedRsnDmas;

    public NationalAlertsWizardFragment2()
    {
    }

    public static NationalAlertsWizardFragment2 newInstance(air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel rsndmamodel)
    {
        NationalAlertsWizardFragment2 nationalalertswizardfragment2 = new NationalAlertsWizardFragment2();
        Bundle bundle = new Bundle();
        bundle.putString("ARGS_RSNDMAMODEL", (new Gson()).toJson(rsndmamodel));
        nationalalertswizardfragment2.setArguments(bundle);
        return nationalalertswizardfragment2;
    }

    private void setupAllRsnDmaList(LayoutInflater layoutinflater)
    {
        layoutinflater = (TextView)layoutinflater.inflate(0x7f04005e, mRsnListView, false);
        mHeader.setText(0x7f070175);
        layoutinflater.setText("None of these");
        mRsnListView.addFooterView(layoutinflater, "none", true);
        layoutinflater = new RsnDmaAdapter(getActivity());
        HashMap hashmap = new HashMap();
        air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel.RsnDma rsndma;
        for (Iterator iterator = mData.allRsns.iterator(); iterator.hasNext(); hashmap.put(rsndma.rsn, rsndma))
        {
            rsndma = (air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel.RsnDma)iterator.next();
        }

        layoutinflater.setData(new ArrayList(hashmap.values()));
        mRsnListView.setAdapter(layoutinflater);
        mRsnListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final NationalAlertsWizardFragment2 this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                adapterview = ((AdapterView) (adapterview.getAdapter().getItem(i)));
                if (adapterview instanceof air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel.RsnDma)
                {
                    mSelectedRsnDmas.clear();
                    mSelectedRsnDmas.add((air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel.RsnDma)adapterview);
                    mCallback.onRsnDmasChosen(mSelectedRsnDmas);
                    return;
                } else
                {
                    mCallback.onNoneOfTheseClicked();
                    return;
                }
            }

            
            {
                this$0 = NationalAlertsWizardFragment2.this;
                super();
            }
        });
        mRsnListView.setVisibility(0);
        mRsnContainer.setVisibility(8);
        mNext.setVisibility(8);
    }

    private void setupMatchingRsnDmaList(LayoutInflater layoutinflater)
    {
        for (Iterator iterator = mData.matchingRsns.iterator(); iterator.hasNext(); mRsnContainer.setVisibility(0))
        {
            air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel.RsnDma rsndma = (air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel.RsnDma)iterator.next();
            CheckedTextView checkedtextview = (CheckedTextView)layoutinflater.inflate(0x7f04005f, mRsnContainer, false);
            checkedtextview.setTag(rsndma);
            checkedtextview.setText(rsndma.rsn);
            checkedtextview.setOnClickListener(new android.view.View.OnClickListener() {

                final NationalAlertsWizardFragment2 this$0;

                public void onClick(View view)
                {
                    ((Checkable)view).toggle();
                    if (((Checkable)view).isChecked())
                    {
                        mSelectedRsnDmas.add((air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel.RsnDma)view.getTag());
                    } else
                    {
                        mSelectedRsnDmas.remove((air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel.RsnDma)view.getTag());
                    }
                    if (mSelectedRsnDmas.size() > 0)
                    {
                        mNext.setVisibility(0);
                        mNext.setEnabled(true);
                        return;
                    } else
                    {
                        mNext.setVisibility(8);
                        mNext.setEnabled(false);
                        return;
                    }
                }

            
            {
                this$0 = NationalAlertsWizardFragment2.this;
                super();
            }
            });
            mRsnContainer.addView(checkedtextview, 0);
            mRsnListView.setVisibility(8);
        }

    }

    private void setupSingleRsnDma(LayoutInflater layoutinflater)
    {
        layoutinflater = (TextView)layoutinflater.inflate(0x7f04005e, mRsnContainer, false);
        layoutinflater.setTag(mData.matchingRsns.get(0));
        layoutinflater.setText(((air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel.RsnDma)mData.matchingRsns.get(0)).rsn);
        layoutinflater.setOnClickListener(new android.view.View.OnClickListener() {

            final NationalAlertsWizardFragment2 this$0;

            public void onClick(View view)
            {
                mSelectedRsnDmas.add(mData.matchingRsns.get(0));
                mCallback.onRsnDmasChosen(mSelectedRsnDmas);
            }

            
            {
                this$0 = NationalAlertsWizardFragment2.this;
                super();
            }
        });
        mRsnContainer.addView(layoutinflater, 0);
        mRsnListView.setVisibility(8);
        mRsnContainer.setVisibility(0);
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        try
        {
            mCallback = (NaWizardCallback2)activity;
            return;
        }
        catch (ClassCastException classcastexception)
        {
            throw new ClassCastException((new StringBuilder()).append(activity.toString()).append(" must implement NaWizardCallback2").toString());
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mData = (air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel)(new Gson()).fromJson(getArguments().getString("ARGS_RSNDMAMODEL"), air/com/nbcuni/com/nbcsports/liveextra/NationalAlertsWizardActivity$RsnDmaModel);
        mSelectedRsnDmas = new ArrayList();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040030, viewgroup, false);
        mNext = (Button)layoutinflater.findViewById(0x7f0f0098);
        mNoButton = (Button)layoutinflater.findViewById(0x7f0f009b);
        mRsnContainer = (LinearLayout)layoutinflater.findViewById(0x7f0f009a);
        mRsnListView = (ListView)layoutinflater.findViewById(0x7f0f0099);
        mHeader = (TextView)layoutinflater.findViewById(0x7f0f0096);
        mInstructions = (TextView)layoutinflater.findViewById(0x7f0f0097);
        return layoutinflater;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = LayoutInflater.from(getActivity());
        mNext.setVisibility(8);
        if (mData.matchingRsns.size() == 0)
        {
            mHeader.setText(0x7f070175);
            mInstructions.setText(0x7f07017b);
            setupAllRsnDmaList(view);
        } else
        if (mData.matchingRsns.size() > 1)
        {
            mHeader.setText(getActivity().getString(0x7f070176, new Object[] {
                ((air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel.RsnDma)mData.matchingRsns.get(0)).market
            }));
            mInstructions.setText(0x7f07017b);
            setupMatchingRsnDmaList(view);
        } else
        {
            mHeader.setText(getActivity().getString(0x7f070176, new Object[] {
                ((air.com.nbcuni.com.nbcsports.liveextra.NationalAlertsWizardActivity.RsnDmaModel.RsnDma)mData.matchingRsns.get(0)).market
            }));
            mInstructions.setText(0x7f07017c);
            setupSingleRsnDma(view);
        }
        mNext.setOnClickListener(new android.view.View.OnClickListener() {

            final NationalAlertsWizardFragment2 this$0;

            public void onClick(View view1)
            {
                mCallback.onRsnDmasChosen(mSelectedRsnDmas);
            }

            
            {
                this$0 = NationalAlertsWizardFragment2.this;
                super();
            }
        });
        mNoButton.setOnClickListener(new android.view.View.OnClickListener() {

            final NationalAlertsWizardFragment2 this$0;

            public void onClick(View view1)
            {
                mCallback.onNoClicked();
            }

            
            {
                this$0 = NationalAlertsWizardFragment2.this;
                super();
            }
        });
    }

    public void setNextButtonEnabled(boolean flag)
    {
        if (mNext != null)
        {
            mNext.setEnabled(flag);
        }
    }

    public void showAllRsnDmas()
    {
        setupAllRsnDmaList(LayoutInflater.from(getActivity()));
    }




}
