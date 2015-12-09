// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.speech;

import com.dominos.App;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.nuance.b.a.i;
import com.nuance.b.a.r;
import com.nuance.b.b.a;
import com.nuance.b.b.dw;
import com.nuance.b.b.dx;
import com.nuance.b.b.v;
import com.nuance.b.e.z;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.androidannotations.api.c;

// Referenced classes of package com.dominos.nina.speech:
//            SpeechManager_, SpeechManager, SpeechContext

final class val.agentsAndMeanings extends c
{

    final String val$agentsAndMeanings[];

    public final void execute()
    {
        SpeechManager_ speechmanager_ = SpeechManager_.getInstance_(App.getInstance().getBaseContext());
        if (!speechmanager_.isNinaConnected() || val$agentsAndMeanings == null || val$agentsAndMeanings.length % 2 != 0)
        {
            LogUtil.d("NinaX", "Unable to externally update agents", new Object[0]);
        } else
        {
            ArrayList arraylist = new ArrayList();
            com.nuance.b.a.ae ae = speechmanager_.getDialogModel();
            LogUtil.d("NinaX", "----------------", new Object[0]);
            int k = 0;
            int l = 0;
            while (k < val$agentsAndMeanings.length) 
            {
                String s = val$agentsAndMeanings[k];
                String s1 = val$agentsAndMeanings[k + 1];
                int j;
                if (StringHelper.equals(s1, "RESET"))
                {
                    LogUtil.d("NinaX", (new StringBuilder("Agent/Agency: ")).append(s).append("  Value: RESET").toString(), new Object[0]);
                    arraylist.add(new dw(s, ae));
                    j = l + 1;
                } else
                {
                    com.dominos.nina.dialog.agent.BaseAgent baseagent = SpeechContext.access$000(s);
                    j = l;
                    if (baseagent != null)
                    {
                        LogUtil.d("NinaX", (new StringBuilder("Agent/Agency: ")).append(s).append("  Value: ").append(s1).toString(), new Object[0]);
                        arraylist.add(new dx(((i) (baseagent)).concept.name, s1));
                        j = l + 1;
                    }
                }
                k += 2;
                l = j;
            }
            LogUtil.d("NinaX", "----------------", new Object[0]);
            if (l > 0)
            {
                if (((SpeechManager) (speechmanager_)).isNinaBusy)
                {
                    LogUtil.d("NinaX", "Unable to externally update agents, nina is busy", new Object[0]);
                    a aa[];
                    try
                    {
                        LogUtil.d("NinaX", "Waiting nina to get ready", new Object[0]);
                        if (SpeechContext.access$100() != null)
                        {
                            SpeechContext.access$100().await();
                        }
                    }
                    catch (InterruptedException interruptedexception)
                    {
                        LogUtil.d("NinaX", "Waiting interrupted.", new Object[0]);
                    }
                    LogUtil.d("NinaX", "Nina is ready, continuing.", new Object[0]);
                }
                com.nuance.b.e.c.l().n();
                aa = (a[])arraylist.toArray(new a[0]);
                v.r().a(aa);
                speechmanager_.setShouldRepeat(false);
                LogUtil.d("NinaX", (new StringBuilder("Sent ")).append(aa.length).append(" commands").toString(), new Object[0]);
                return;
            }
        }
    }

    per(int j, String s1, String as[])
    {
        val$agentsAndMeanings = as;
        super(final_s, j, s1);
    }
}
