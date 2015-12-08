// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.n;
import android.view.ViewGroup;
import com.skype.Conversation;
import com.skype.android.app.chat.ChatFragment;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.calling:
//            CallActivity, InCallFragment, CallPagerAdapterState

public class CallPagerAdapter extends n
{

    public static final int PAGE_CALL = 0;
    public static final int PAGE_CHAT = 1;
    private static final int SIZE = 2;
    private static final Logger log = Logger.getLogger("CallPagerAdapter");
    private CallActivity callActivity;
    private Conversation conversation;
    private String tags[];

    public CallPagerAdapter(CallActivity callactivity, Conversation conversation1)
    {
        super(callactivity.getSupportFragmentManager());
        callActivity = callactivity;
        conversation = conversation1;
        tags = new String[2];
    }

    public int getCount()
    {
        return 2;
    }

    public Fragment getItem(int i)
    {
        Object obj = null;
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 68
    //                   1 79;
           goto _L1 _L2 _L3
_L1:
        if (obj != null)
        {
            Bundle bundle = new Bundle(callActivity.getIntent().getExtras());
            bundle.putInt("com.skype.objId", conversation.getObjectID());
            ((Fragment) (obj)).setArguments(bundle);
        }
        return ((Fragment) (obj));
_L2:
        obj = new InCallFragment();
        continue; /* Loop/switch isn't completed */
_L3:
        obj = new ChatFragment();
        if (true) goto _L1; else goto _L4
_L4:
    }

    public String getTag(int i)
    {
        return tags[i];
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        viewgroup = (Fragment)super.instantiateItem(viewgroup, i);
        tags[i] = viewgroup.getTag();
        return viewgroup;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classloader)
    {
        classloader = (CallPagerAdapterState)parcelable;
        log.info((new StringBuilder("restoredState: ")).append(parcelable).toString());
        tags = classloader.getTags();
    }

    public Parcelable saveState()
    {
        CallPagerAdapterState callpageradapterstate = new CallPagerAdapterState(tags);
        log.info((new StringBuilder("savedState: ")).append(callpageradapterstate).toString());
        return callpageradapterstate;
    }

}
