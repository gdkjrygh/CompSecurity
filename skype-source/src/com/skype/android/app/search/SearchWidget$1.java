// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.view.ViewGroup;
import com.skype.ContactImpl;
import com.skype.SkyLib;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.skype.android.app.search:
//            SearchWidget, AgentProvisioningServiceResponse, AgentInfo, SuggestedAgentsAdapter

final class this._cls0
    implements AsyncCallback
{

    final SearchWidget this$0;

    public final void done(AsyncResult asyncresult)
    {
        byte byte0 = 8;
        if (asyncresult.e())
        {
            Object obj = (AgentProvisioningServiceResponse)asyncresult.a();
            if (obj != null && !((AgentProvisioningServiceResponse) (obj)).getAgentInfo().isEmpty())
            {
                asyncresult = new ArrayList();
                obj = ((AgentProvisioningServiceResponse) (obj)).getAgentInfo().iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    AgentInfo agentinfo = (AgentInfo)((Iterator) (obj)).next();
                    ContactImpl contactimpl = new ContactImpl();
                    SearchWidget.access$000(SearchWidget.this).getContact(agentinfo.getIdentity(), contactimpl);
                    if (!contactimpl.isMemberOfHardwiredGroup(com.skype.PE.BOT_BUDDIES))
                    {
                        asyncresult.add(agentinfo);
                    }
                } while (asyncresult.size() != 2);
                obj = SearchWidget.access$100(SearchWidget.this);
                if (!asyncresult.isEmpty())
                {
                    byte0 = 0;
                }
                ((ViewGroup) (obj)).setVisibility(byte0);
                SearchWidget.access$200(SearchWidget.this).setData(asyncresult);
            }
            return;
        } else
        {
            SearchWidget.access$100(SearchWidget.this).setVisibility(8);
            return;
        }
    }

    Adapter()
    {
        this$0 = SearchWidget.this;
        super();
    }
}
