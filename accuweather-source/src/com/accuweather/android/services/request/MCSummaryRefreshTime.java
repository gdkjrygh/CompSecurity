// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;

import android.os.Handler;
import android.os.SystemClock;
import android.widget.TextView;
import com.accuweather.android.models.minutecast.Summaries;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MCSummaryRefreshTime
{
    private class UpdateTimerTask extends TimerTask
    {

        final MCSummaryRefreshTime this$0;

        public void run()
        {
label0:
            {
                if (processObject != null)
                {
                    if (processObject.getEndMinute().intValue() >= 119)
                    {
                        break label0;
                    }
                    int i = (int)((SystemClock.elapsedRealtime() - startTime) / MCSummaryRefreshTime.oneMinute);
                    if (i > processObject.getEndMinute().intValue())
                    {
                        int i = ((List) (this)).size;
                        if (index < listSummaries.size())
                        {
                            processObject = (Summaries)listSummaries.get(index);
                        }
                    }
                    if (minuteCastSummaryTextView != null)
                    {
                        i = (processObject.getEndMinute().intValue() + 1) - i;
                        Object obj;
                        if (i > 1)
                        {
                            obj = processObject.getMinutesText();
                        } else
                        {
                            obj = processObject.getMinuteText();
                        }
                        obj = setRemainMinuteToString(((String) (obj)), i). new Runnable() {

                            final UpdateTimerTask this$1;
                            final String val$minuteCastText;

                            public void run()
                            {
                                minuteCastSummaryTextView.setText(minuteCastText);
                            }

            
            {
                this$1 = final_updatetimertask;
                minuteCastText = String.this;
                super();
            }
                        };
                        MCSummaryRefreshTime.mHandler.post(((Runnable) (obj)));
                    }
                }
                return;
            }
            stop();
        }

        private UpdateTimerTask()
        {
            this$0 = MCSummaryRefreshTime.this;
            super();
        }

    }


    private static MCSummaryRefreshTime instance = null;
    private static final Handler mHandler = new Handler();
    private static long oneMinute = 60000L;
    private int index;
    private long initialExecutionDelayMillis;
    private List listSummaries;
    private TextView minuteCastSummaryTextView;
    private Summaries processObject;
    private long refreshIntervalMillis;
    private long startTime;
    private Timer timer;

    protected MCSummaryRefreshTime()
    {
        initialExecutionDelayMillis = oneMinute;
        refreshIntervalMillis = oneMinute;
    }

    public static MCSummaryRefreshTime getInstance()
    {
        if (instance == null)
        {
            instance = new MCSummaryRefreshTime();
        }
        return instance;
    }

    private String setRemainMinuteToString(String s, int i)
    {
        StringBuffer stringbuffer = null;
        if (s.toLowerCase().contains("%minute_value"))
        {
            int j = s.toLowerCase().indexOf("%minute_value");
            stringbuffer = (new StringBuffer(s)).replace(j, "%minute_value".length() + j, (new StringBuilder()).append(i).append("").toString());
        }
        return (new StringBuilder()).append(stringbuffer).append("").toString();
    }

    public String getSummaryFromNowTimer()
    {
        String s = "";
        if (processObject != null)
        {
            if (processObject.getCountMinute().intValue() != 1)
            {
                s = processObject.getMinutesText();
            } else
            {
                s = processObject.getMinuteText();
            }
            s = setRemainMinuteToString(s, processObject.getCountMinute().intValue());
        }
        return s;
    }

    public boolean isEqualWithCurrentData(List list)
    {
        if (listSummaries != null)
        {
            return listSummaries.equals(list);
        } else
        {
            return false;
        }
    }

    public void setListSummaries(List list)
    {
        listSummaries = list;
    }

    public void setTextView(TextView textview)
    {
        minuteCastSummaryTextView = textview;
    }

    public void start()
    {
        if (timer != null)
        {
            timer.cancel();
        }
        timer = new Timer();
        index = 0;
        if (listSummaries != null && listSummaries.size() > 0)
        {
            processObject = (Summaries)listSummaries.get(index);
        }
        Date date = new Date(System.currentTimeMillis() + initialExecutionDelayMillis);
        timer.schedule(new UpdateTimerTask(), date, refreshIntervalMillis);
        startTime = SystemClock.elapsedRealtime();
    }

    public void stop()
    {
        if (timer != null)
        {
            timer.cancel();
        }
    }




/*
    static Summaries access$102(MCSummaryRefreshTime mcsummaryrefreshtime, Summaries summaries)
    {
        mcsummaryrefreshtime.processObject = summaries;
        return summaries;
    }

*/





/*
    static int access$408(MCSummaryRefreshTime mcsummaryrefreshtime)
    {
        int i = mcsummaryrefreshtime.index;
        mcsummaryrefreshtime.index = i + 1;
        return i;
    }

*/




}
