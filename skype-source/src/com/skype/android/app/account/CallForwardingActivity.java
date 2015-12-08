// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.Navigation;
import com.skype.android.app.data.DataAdapter;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.util.CallForwarding;
import com.skype.android.widget.NonScrollingListLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.app.account:
//            CallForwardingNumberActivity, DeleteCallForwardingNumberDialog

public class CallForwardingActivity extends SkypeActivity
{
    final class a extends DataAdapter
    {

        private final Context context;
        private ArrayList list;
        final CallForwardingActivity this$0;

        public final List getList()
        {
            return list;
        }

        public a(Context context1, int i, ArrayList arraylist)
        {
            this.this$0 = CallForwardingActivity.this;
            super();
            context = context1;
            list = arraylist;
            setItemViewAdapter(0, context1. new _cls1());
        }
    }

    final class b extends com.skype.android.app.data.DataAdapter.ItemViewHolder
    {

        ImageButton deleteButton;
        TextView phoneNumber;
        final CallForwardingActivity this$0;

        protected final void onSetData(com.skype.android.util.CallForwarding.Number number)
        {
            String s1 = number.c;
            phoneNumber.setText(s1);
            String s = "";
            int j = s1.length();
            for (int i = 0; i < j; i++)
            {
                s = (new StringBuilder()).append(s).append(s1.charAt(i)).append(" ").toString();
            }

            phoneNumber.setContentDescription(getResources().getString(0x7f08005f, new Object[] {
                s
            }));
            deleteButton.setContentDescription(getResources().getString(0x7f08005d, new Object[] {
                s
            }));
            deleteButton.setOnClickListener(number. new android.view.View.OnClickListener() {

                final b this$1;
                final com.skype.android.util.CallForwarding.Number val$number;

                public final void onClick(View view)
                {
                    view = new DeleteCallForwardingNumberDialog();
                    Bundle bundle = new Bundle();
                    bundle.putString("phone_num", number.c);
                    view.setArguments(bundle);
                    view.show(getSupportFragmentManager());
                }

            
            {
                this$1 = final_b1;
                number = com.skype.android.util.CallForwarding.Number.this;
                super();
            }
            });
        }

        protected final volatile void onSetData(Object obj)
        {
            onSetData((com.skype.android.util.CallForwarding.Number)obj);
        }

        public b(View view)
        {
            this$0 = CallForwardingActivity.this;
            super(view);
            phoneNumber = (TextView)view.findViewById(0x7f100250);
            deleteButton = (ImageButton)view.findViewById(0x7f100251);
        }
    }


    static final String EDIT_NUM_KEY = "edit_num";
    static final String PHONE_NUM_KEY = "phone_num";
    private static final int REQUEST_CODE_ADD_NUMBER_FROM_BUTTON = 13;
    private static final int REQUEST_CODE_ADD_NUMBER_FROM_CHECKBOX = 17;
    private static final int REQUEST_CODE_EDIT_NUMBER = 11;
    Account account;
    ActionBarCustomizer actionBarCustomizer;
    a adapter;
    Button addNumberButton;
    Analytics analytics;
    CallForwarding callForwarding;
    View forwardCallSwitchContainer;
    CompoundButton forwardCallsCheckBox;
    SkyLib lib;
    Navigation nav;
    NonScrollingListLayout numberList;

    public CallForwardingActivity()
    {
    }

    private void initializeViews()
    {
        forwardCallsCheckBox.setChecked(callForwarding.b());
        forwardCallsCheckBox.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final CallForwardingActivity this$0;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                callForwarding.a(flag);
                Analytics analytics1;
                if (flag && adapter.getCount() <= 0)
                {
                    startAddNumberIntent(17, false, null);
                } else
                if (!flag)
                {
                    callForwarding.c();
                    adapter.clear();
                    adapter.notifyDataSetChanged();
                }
                setSwitchContentDescription();
                analytics1 = analytics;
                if (flag)
                {
                    compoundbutton = AnalyticsEvent.aA;
                } else
                {
                    compoundbutton = AnalyticsEvent.aB;
                }
                analytics1.c(compoundbutton);
            }

            
            {
                this$0 = CallForwardingActivity.this;
                super();
            }
        });
        addNumberButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CallForwardingActivity this$0;

            public final void onClick(View view)
            {
                if (!forwardCallsCheckBox.isChecked())
                {
                    forwardCallsCheckBox.setChecked(true);
                    return;
                } else
                {
                    startAddNumberIntent(13, false, null);
                    return;
                }
            }

            
            {
                this$0 = CallForwardingActivity.this;
                super();
            }
        });
        TextView textview = new TextView(this);
        Resources resources = getResources();
        textview.setText(0x7f08046e);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutparams.gravity = 17;
        layoutparams.topMargin = (int)resources.getDimension(0x7f0c00c8);
        layoutparams.bottomMargin = (int)resources.getDimension(0x7f0c00c7);
        textview.setLayoutParams(layoutparams);
        numberList.setEmptyView(textview);
        adapter = new a(this, 0x7f100250, new ArrayList());
        numberList.setAdapter(adapter);
        numberList.setItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final CallForwardingActivity this$0;

            public final void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                startAddNumberIntent(11, true, ((com.skype.android.util.CallForwarding.Number)adapter.getItem(i)).c);
            }

            
            {
                this$0 = CallForwardingActivity.this;
                super();
            }
        });
    }

    private boolean isListContentDifferent(ArrayList arraylist)
    {
        List list = adapter.getList();
        return list.size() != arraylist.size() || !list.containsAll(arraylist);
    }

    private void setSwitchContentDescription()
    {
        View view = forwardCallSwitchContainer;
        Resources resources = getResources();
        String s;
        if (callForwarding.b())
        {
            s = getResources().getString(0x7f080061);
        } else
        {
            s = getResources().getString(0x7f080060);
        }
        view.setContentDescription(resources.getString(0x7f08005c, new Object[] {
            s
        }));
    }

    private void startAddNumberIntent(int i, boolean flag, String s)
    {
        Intent intent = nav.intentFor(account, com/skype/android/app/account/CallForwardingNumberActivity);
        intent.putExtra("edit_num", flag);
        if (flag)
        {
            intent.putExtra("phone_num", s);
        }
        startActivityForResult(intent, i);
    }

    private void updateNumberList()
    {
        ArrayList arraylist = (ArrayList)callForwarding.a();
        if (isListContentDifferent(arraylist))
        {
            adapter.setNotifyOnChange(false);
            adapter.clear();
            com.skype.android.util.CallForwarding.Number number;
            for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); adapter.add(number))
            {
                number = (com.skype.android.util.CallForwarding.Number)iterator.next();
            }

            adapter.setNotifyOnChange(true);
            adapter.notifyDataSetChanged();
            if (arraylist.isEmpty() && forwardCallsCheckBox.isChecked())
            {
                forwardCallsCheckBox.setChecked(false);
            }
        }
        setSwitchContentDescription();
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        boolean flag;
        flag = false;
        super.onActivityResult(i, j, intent);
        i;
        JVM INSTR lookupswitch 2: default 36
    //                   13: 71
    //                   17: 117;
           goto _L1 _L2 _L3
_L1:
        if (i == 13 || i == 17)
        {
            flag = true;
        }
        if (flag && j != 0)
        {
            analytics.c(AnalyticsEvent.aC);
        }
        return;
_L2:
        if (adapter.getCount() <= 0 && j == 0)
        {
            if (forwardCallsCheckBox.isChecked())
            {
                forwardCallsCheckBox.setChecked(false);
            }
        } else
        {
            forwardCallsCheckBox.setChecked(true);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (j == 0 && forwardCallsCheckBox.isChecked())
        {
            forwardCallsCheckBox.setChecked(false);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport.addListener(actionBarCustomizer);
        actionBarCustomizer.setTitle(0x7f080232);
        setTitle(0x7f08005b);
        callForwarding = new CallForwarding(lib, account);
        initializeViews();
        updateNumberList();
    }

    public void onEvent(com.skype.android.gen.AccountListener.OnPropertyChange onpropertychange)
    {
        updateNumberList();
    }



    // Unreferenced inner class com/skype/android/app/account/CallForwardingActivity$a$1

/* anonymous class */
    final class a._cls1 extends com.skype.android.app.data.DataAdapter.ItemViewAdapter
    {

        final a this$1;
        final Context val$context;
        final CallForwardingActivity val$this$0;

        protected final int getItemId(com.skype.android.util.CallForwarding.Number number)
        {
            return number.a;
        }

        protected final volatile int getItemId(Object obj)
        {
            return getItemId((com.skype.android.util.CallForwarding.Number)obj);
        }

        protected final View onCreateView(ViewGroup viewgroup)
        {
            return LayoutInflater.from(context).inflate(0x7f03002c, viewgroup, false);
        }

        protected final b onCreateViewHolder(View view)
        {
            return new b(view);
        }

        protected final volatile com.skype.android.app.data.DataAdapter.ItemViewHolder onCreateViewHolder(View view)
        {
            return onCreateViewHolder(view);
        }

            
            {
                this$1 = final_a1;
                this$0 = callforwardingactivity;
                context = Context.this;
                super();
            }
    }

}
