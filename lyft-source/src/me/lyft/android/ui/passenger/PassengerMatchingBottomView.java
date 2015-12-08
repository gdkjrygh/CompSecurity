// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.lyft.android.controls.TimedProgressBar;
import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;

public class PassengerMatchingBottomView extends LinearLayout
{

    private static final int COUNTDOWN_TIMEOUT_SECONDS = 10;
    View emptyPassengerView;
    private List matchingMessages;
    TextView messageTextView;
    TimedProgressBar progressBar;
    private int visibleMatchingMessageIndex;
    final rx.Scheduler.Worker worker = AndroidSchedulers.mainThread().createWorker();

    public PassengerMatchingBottomView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        matchingMessages = Collections.emptyList();
        visibleMatchingMessageIndex = 0;
        Scoop.a(this).a(getContext()).inflate(0x7f0300ba, this, true);
        ButterKnife.a(this);
    }

    private String getNextMatchingMessage()
    {
        if (matchingMessages.isEmpty())
        {
            return getResources().getString(0x7f070220);
        } else
        {
            visibleMatchingMessageIndex = (visibleMatchingMessageIndex + 1) % matchingMessages.size();
            return (String)matchingMessages.get(visibleMatchingMessageIndex);
        }
    }

    private void startMatchingMessagesTimer()
    {
        worker.schedule(new Action0() {

            final PassengerMatchingBottomView this$0;

            public void call()
            {
                String s = getNextMatchingMessage();
                messageTextView.setText(s);
                if (!worker.isUnsubscribed())
                {
                    worker.schedule(this, 10L, TimeUnit.SECONDS);
                }
                return;
                Exception exception;
                exception;
                if (!worker.isUnsubscribed())
                {
                    worker.schedule(this, 10L, TimeUnit.SECONDS);
                }
                throw exception;
            }

            
            {
                this$0 = PassengerMatchingBottomView.this;
                super();
            }
        });
    }

    public void hideEmptyPassengerView()
    {
        emptyPassengerView.setVisibility(8);
    }

    public void hideProgressBar()
    {
        progressBar.setVisibility(8);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        worker.unsubscribe();
    }

    public void setRotatingMessages(List list)
    {
        matchingMessages = list;
        startMatchingMessagesTimer();
    }

    public void setStartTime(long l)
    {
        progressBar.setStartTime(l);
    }

    public void setWaitTime(long l)
    {
        progressBar.setVisibility(0);
        progressBar.setTotalWaitTime(l);
        progressBar.startProgressAnimation();
    }

    public void showEmptyPassengerView()
    {
        emptyPassengerView.setVisibility(0);
    }

}
