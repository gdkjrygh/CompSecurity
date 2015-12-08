// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.g.g;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import com.tinder.enums.Environment;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerLiveRail;
import com.tinder.managers.ae;
import com.tinder.managers.d;
import com.tinder.model.GlobalConfig;
import com.tinder.model.UserMeta;
import com.tinder.utils.ad;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.tinder.views:
//            CustomEditText

public class DevControls extends FrameLayout
    implements android.widget.CompoundButton.OnCheckedChangeListener
{
    abstract class DevPanelStatusRunnable
        implements android.view.View.OnClickListener
    {

        final DevControls this$0;

        public void onClick(View view)
        {
            UPDATE_LOOP_RUNNABLE.run();
        }

        public abstract g run();

        DevPanelStatusRunnable()
        {
            this$0 = DevControls.this;
            super();
        }
    }


    private static final long UPDATE_LOOP_MS = 1000L;
    private final Runnable UPDATE_LOOP_RUNNABLE;
    Context mAppcontext;
    private CheckBox mCheckBoxFbApp;
    private CheckBox mCheckBoxLog;
    Environment mEnviroment;
    private Handler mHandler;
    private ListView mListViewStatus;
    private List mListViewStatusGenerators;
    d mManagerAuth;
    ManagerLiveRail mManagerLiveRail;
    ae mManagerPrefs;
    private RadioButton mRadioDev;
    private RadioButton mRadioProd;
    private RadioButton mRadioProdTest;
    private RadioButton mRadioSandbox;

    public DevControls(Context context)
    {
        super(context);
        mHandler = new Handler(Looper.getMainLooper());
        mListViewStatusGenerators = new ArrayList();
        UPDATE_LOOP_RUNNABLE = new Runnable() {

            final DevControls this$0;

            public void run()
            {
                mListViewStatusGenerators.clear();
                addStatusGenerators();
                BaseAdapter baseadapter = (BaseAdapter)mListViewStatus.getAdapter();
                baseadapter.notifyDataSetChanged();
                baseadapter.notifyDataSetInvalidated();
                if (ManagerApp.f())
                {
                    mHandler.postDelayed(UPDATE_LOOP_RUNNABLE, 1000L);
                }
            }

            
            {
                this$0 = DevControls.this;
                super();
            }
        };
        init();
    }

    public DevControls(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mHandler = new Handler(Looper.getMainLooper());
        mListViewStatusGenerators = new ArrayList();
        UPDATE_LOOP_RUNNABLE = new _cls1();
        init();
    }

    private void addStatusGenerators()
    {
        mListViewStatusGenerators.add(new DevPanelStatusRunnable() {

            final DevControls this$0;

            public void onClick(View view)
            {
                Object obj = mManagerLiveRail;
                boolean flag;
                if (!mManagerLiveRail.v)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj.v = flag;
                obj = (new StringBuilder("Changed to ")).append(String.valueOf(mManagerLiveRail.v)).toString();
                if (ManagerApp.a)
                {
                    Toast.makeText(ManagerApp.c(), ((CharSequence) (obj)), 0).show();
                }
                super.onClick(view);
            }

            public g run()
            {
                return new g("Mad Ave force enabled (tap to toggle)", String.valueOf(mManagerLiveRail.v));
            }

            
            {
                this$0 = DevControls.this;
                super();
            }
        });
        mListViewStatusGenerators.add(new DevPanelStatusRunnable() {

            final DevControls this$0;

            public g run()
            {
                return new g("Mad Ave swipe count", String.valueOf(ae.e()));
            }

            
            {
                this$0 = DevControls.this;
                super();
            }
        });
        mListViewStatusGenerators.add(new DevPanelStatusRunnable() {

            final DevControls this$0;

            public g run()
            {
                Object obj = d.c();
                int i;
                if (obj != null)
                {
                    i = ((UserMeta) (obj)).globalConfig.adSwipeLimit;
                } else
                {
                    i = -1;
                }
                if (i == -1)
                {
                    obj = "No meta";
                } else
                {
                    obj = String.valueOf(i);
                }
                return new g("Mad Ave swipe limit", obj);
            }

            
            {
                this$0 = DevControls.this;
                super();
            }
        });
    }

    private void init()
    {
        ManagerApp.h().a(this);
        inflate(getContext(), 0x7f030090, this);
        setVisibility(8);
        if (getParent() != null)
        {
            ((ViewGroup)getParent()).removeView(this);
        }
    }

    private void initStatusView()
    {
        addStatusGenerators();
        mListViewStatus.setAdapter(new BaseAdapter() {

            final DevControls this$0;

            public boolean areAllItemsEnabled()
            {
                return true;
            }

            public int getCount()
            {
                return mListViewStatusGenerators.size();
            }

            public DevPanelStatusRunnable getItem(int i)
            {
                return (DevPanelStatusRunnable)mListViewStatusGenerators.get(i);
            }

            public volatile Object getItem(int i)
            {
                return getItem(i);
            }

            public long getItemId(int i)
            {
                return (long)i;
            }

            public int getItemViewType(int i)
            {
                return 0;
            }

            public View getView(int i, View view, ViewGroup viewgroup)
            {
                DevPanelStatusRunnable devpanelstatusrunnable = getItem(i);
                View view1 = view;
                if (view == null)
                {
                    view1 = LayoutInflater.from(getContext()).inflate(0x7f03007f, viewgroup, false);
                    view1.setOnClickListener(devpanelstatusrunnable);
                }
                view = devpanelstatusrunnable.run();
                ((TextView)view1.findViewById(0x7f0e01fb)).setText((CharSequence)((g) (view)).a);
                ((TextView)view1.findViewById(0x7f0e01b3)).setText((CharSequence)((g) (view)).b);
                return view1;
            }

            public int getViewTypeCount()
            {
                return 1;
            }

            public boolean hasStableIds()
            {
                return false;
            }

            public boolean isEmpty()
            {
                return mListViewStatusGenerators.isEmpty();
            }

            public boolean isEnabled(int i)
            {
                return true;
            }

            
            {
                this$0 = DevControls.this;
                super();
            }
        });
        ad.a(mListViewStatus);
    }

    public void onCheckedChanged(final CompoundButton editText, boolean flag)
    {
        editText.getId();
        JVM INSTR tableswitch 2131624504 2131624509: default 44
    //                   2131624504 88
    //                   2131624505 50
    //                   2131624506 69
    //                   2131624507 107
    //                   2131624508 45
    //                   2131624509 181;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return;
_L6:
        ManagerApp.a(flag);
        return;
_L3:
        if (flag)
        {
            ((ManagerApp)mAppcontext).a(Environment.PRODTEST, true);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (flag)
        {
            ((ManagerApp)mAppcontext).a(Environment.DEV, true);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (flag)
        {
            ((ManagerApp)mAppcontext).a(Environment.PROD, true);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (flag)
        {
            editText = new CustomEditText(getContext(), null);
            int i = getResources().getDimensionPixelSize(0x7f090159);
            editText.setPadding(i, i, i, i);
            (new android.app.AlertDialog.Builder(getContext())).setView(editText).setTitle("Sandbox").setPositiveButton("Save", new android.content.DialogInterface.OnClickListener() {

                final DevControls this$0;
                final CustomEditText val$editText;

                public void onClick(DialogInterface dialoginterface, int j)
                {
                    dialoginterface = editText.getText().toString();
                    ae.b.putString("KEY_SANDBOX", dialoginterface).commit();
                    ((ManagerApp)mAppcontext).a(Environment.SANDBOX, true);
                }

            
            {
                this$0 = DevControls.this;
                editText = customedittext;
                super();
            }
            }).show();
            return;
        }
        if (true) goto _L1; else goto _L7
_L7:
        ManagerApp.b = flag;
        return;
    }





}
