// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.details.DetailsActivity;
import com.netflix.mediaclient.util.LogUtils;
import java.util.HashMap;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            LoggingManagerCallback, ServiceManager, AddToListData

public class AddToMyListWrapper
{
    private static class AddToListDataHash extends HashMap
    {

        private AddToListDataHash()
        {
        }

    }

    private class TextViewWrapper
        implements AddToListData.StateListener
    {

        private final DetailsActivity activity;
        private final TextView textView;
        final AddToMyListWrapper this$0;

        public void update(AddToListData.AddToListState addtoliststate)
        {
            static class _cls1
            {

                static final int $SwitchMap$com$netflix$mediaclient$servicemgr$AddToListData$AddToListState[];

                static 
                {
                    $SwitchMap$com$netflix$mediaclient$servicemgr$AddToListData$AddToListState = new int[AddToListData.AddToListState.values().length];
                    try
                    {
                        $SwitchMap$com$netflix$mediaclient$servicemgr$AddToListData$AddToListState[AddToListData.AddToListState.IN_LIST.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$netflix$mediaclient$servicemgr$AddToListData$AddToListState[AddToListData.AddToListState.NOT_IN_LIST.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$netflix$mediaclient$servicemgr$AddToListData$AddToListState[AddToListData.AddToListState.LOADING.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            _cls1..SwitchMap.com.netflix.mediaclient.servicemgr.AddToListData.AddToListState[addtoliststate.ordinal()];
            JVM INSTR tableswitch 1 3: default 36
        //                       1 58
        //                       2 112
        //                       3 166;
               goto _L1 _L2 _L3 _L4
_L1:
            break; /* Loop/switch isn't completed */
_L4:
            break MISSING_BLOCK_LABEL_166;
_L5:
            if (serviceMan.isCurrentProfileIQEnabled())
            {
                textView.setVisibility(0);
                return;
            } else
            {
                textView.setVisibility(8);
                return;
            }
_L2:
            textView.setContentDescription(activity.getString(0x7f0c006b));
            textView.setCompoundDrawablesWithIntrinsicBounds(0x7f020157, 0, 0, 0);
            textView.setEnabled(true);
            textView.setOnClickListener(new android.view.View.OnClickListener() {

                final TextViewWrapper this$1;

                public void onClick(View view)
                {
                    LogUtils.reportRemoveFromQueueActionStarted(activity, null, activity.getUiScreen());
                    removeVideoFromMyList(activity.getVideoId());
                }

            
            {
                this$1 = TextViewWrapper.this;
                super();
            }
            });
              goto _L5
_L3:
            textView.setContentDescription(activity.getString(0x7f0c006a));
            textView.setCompoundDrawablesWithIntrinsicBounds(0x7f02005e, 0, 0, 0);
            textView.setEnabled(true);
            textView.setOnClickListener(new android.view.View.OnClickListener() {

                final TextViewWrapper this$1;

                public void onClick(View view)
                {
                    int i = -1;
                    view = activity.getPlayContext();
                    if (view != null)
                    {
                        i = view.getTrackId();
                    }
                    LogUtils.reportAddToQueueActionStarted(activity, null, activity.getUiScreen());
                    addVideoToMyList(activity.getVideoId(), i);
                }

            
            {
                this$1 = TextViewWrapper.this;
                super();
            }
            });
              goto _L5
            textView.setEnabled(false);
              goto _L5
        }


        public TextViewWrapper(DetailsActivity detailsactivity, TextView textview)
        {
            this$0 = AddToMyListWrapper.this;
            super();
            activity = detailsactivity;
            textView = textview;
        }
    }


    private static final String TAG = "AddToMyListWrapper";
    private final AddToListDataHash dataHash = new AddToListDataHash(null);
    private final ServiceManager serviceMan;

    public AddToMyListWrapper(ServiceManager servicemanager)
    {
        serviceMan = servicemanager;
    }

    private void addVideoToMyList(String s, int i)
    {
        serviceMan.addToQueue(s, i, new LoggingManagerCallback("AddToMyListWrapper"));
    }

    private void removeVideoFromMyList(String s)
    {
        serviceMan.removeFromQueue(s, new LoggingManagerCallback("AddToMyListWrapper"));
    }

    private void update(String s, AddToListData.AddToListState addtoliststate)
    {
        AddToListData addtolistdata = (AddToListData)dataHash.get(s);
        if (addtolistdata == null)
        {
            Log.v("AddToMyListWrapper", (new StringBuilder()).append("No listeners for video: ").append(s).toString());
            return;
        }
        if (Log.isLoggable("AddToMyListWrapper", 2))
        {
            Log.v("AddToMyListWrapper", (new StringBuilder()).append("Updating state for video: ").append(s).append(" to: ").append(addtoliststate).toString());
        }
        addtolistdata.setStateAndNotify(addtoliststate);
    }

    public TextViewWrapper createAddToMyListWrapper(DetailsActivity detailsactivity, TextView textview)
    {
        return new TextViewWrapper(detailsactivity, textview);
    }

    public void register(String s, AddToListData.StateListener statelistener)
    {
        AddToListData addtolistdata = (AddToListData)dataHash.get(s);
        if (addtolistdata == null)
        {
            Log.v("AddToMyListWrapper", (new StringBuilder()).append("Creating new state data for video: ").append(s).toString());
            addtolistdata = new AddToListData(statelistener);
            dataHash.put(s, addtolistdata);
            s = addtolistdata;
        } else
        {
            addtolistdata.addListener(statelistener);
            Log.v("AddToMyListWrapper", (new StringBuilder()).append("Found state data for video: ").append(s).append(", state: ").append(addtolistdata.getState()).toString());
            s = addtolistdata;
        }
        statelistener.update(s.getState());
    }

    public void unregister(String s, AddToListData.StateListener statelistener)
    {
        AddToListData addtolistdata = (AddToListData)dataHash.get(s);
        if (addtolistdata == null)
        {
            Log.w("AddToMyListWrapper", (new StringBuilder()).append("Unexpected case - can't find listener for video: ").append(s).toString());
            return;
        }
        if (Log.isLoggable("AddToMyListWrapper", 2))
        {
            Log.v("AddToMyListWrapper", (new StringBuilder()).append("Removing listener for video: ").append(s).append(", listener: ").append(statelistener).toString());
        }
        addtolistdata.removeListener(statelistener);
    }

    public void updateState(String s, boolean flag)
    {
        AddToListData.AddToListState addtoliststate;
        if (flag)
        {
            addtoliststate = AddToListData.AddToListState.IN_LIST;
        } else
        {
            addtoliststate = AddToListData.AddToListState.NOT_IN_LIST;
        }
        update(s, addtoliststate);
    }

    public void updateToError(int i, String s, boolean flag)
    {
        AddToListData addtolistdata = (AddToListData)dataHash.get(s);
        if (addtolistdata == null)
        {
            Log.v("AddToMyListWrapper", (new StringBuilder()).append("Could not revert state for video: ").append(s).toString());
        } else
        {
            if (Log.isLoggable("AddToMyListWrapper", 2))
            {
                Log.v("AddToMyListWrapper", (new StringBuilder()).append("Reverting state for video: ").append(s).toString());
            }
            addtolistdata.revertState();
            if (flag)
            {
                Toast.makeText(serviceMan.getActivity(), 0x7f0c014f, 1).show();
                return;
            }
        }
    }

    public void updateToLoading(String s)
    {
        update(s, AddToListData.AddToListState.LOADING);
    }



}
