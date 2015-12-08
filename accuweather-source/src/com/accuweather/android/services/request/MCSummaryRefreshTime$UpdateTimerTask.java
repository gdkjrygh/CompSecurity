// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;

import android.os.Handler;
import android.os.SystemClock;
import android.widget.TextView;
import com.accuweather.android.models.minutecast.Summaries;
import java.util.List;
import java.util.TimerTask;

// Referenced classes of package com.accuweather.android.services.request:
//            MCSummaryRefreshTime

private class <init> extends TimerTask
{

    final MCSummaryRefreshTime this$0;

    public void run()
    {
label0:
        {
            if (MCSummaryRefreshTime.access$100(MCSummaryRefreshTime.this) != null)
            {
                if (MCSummaryRefreshTime.access$100(MCSummaryRefreshTime.this).getEndMinute().intValue() >= 119)
                {
                    break label0;
                }
                int i = (int)((SystemClock.elapsedRealtime() - MCSummaryRefreshTime.access$200(MCSummaryRefreshTime.this)) / MCSummaryRefreshTime.access$300());
                if (i > MCSummaryRefreshTime.access$100(MCSummaryRefreshTime.this).getEndMinute().intValue())
                {
                    int _tmp = MCSummaryRefreshTime.access$408(MCSummaryRefreshTime.this);
                    if (MCSummaryRefreshTime.access$400(MCSummaryRefreshTime.this) < MCSummaryRefreshTime.access$500(MCSummaryRefreshTime.this).size())
                    {
                        MCSummaryRefreshTime.access$102(MCSummaryRefreshTime.this, (Summaries)MCSummaryRefreshTime.access$500(MCSummaryRefreshTime.this).get(MCSummaryRefreshTime.access$400(MCSummaryRefreshTime.this)));
                    }
                }
                if (MCSummaryRefreshTime.access$600(MCSummaryRefreshTime.this) != null)
                {
                    i = (MCSummaryRefreshTime.access$100(MCSummaryRefreshTime.this).getEndMinute().intValue() + 1) - i;
                    Object obj;
                    if (i > 1)
                    {
                        obj = MCSummaryRefreshTime.access$100(MCSummaryRefreshTime.this).getMinutesText();
                    } else
                    {
                        obj = MCSummaryRefreshTime.access$100(MCSummaryRefreshTime.this).getMinuteText();
                    }
                    obj = new Runnable() {

                        final MCSummaryRefreshTime.UpdateTimerTask this$1;
                        final String val$minuteCastText;

                        public void run()
                        {
                            MCSummaryRefreshTime.access$600(this$0).setText(minuteCastText);
                        }

            
            {
                this$1 = MCSummaryRefreshTime.UpdateTimerTask.this;
                minuteCastText = s;
                super();
            }
                    };
                    MCSummaryRefreshTime.access$800().post(((Runnable) (obj)));
                }
            }
            return;
        }
        stop();
    }

    private _cls1.val.minuteCastText()
    {
        this$0 = MCSummaryRefreshTime.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
