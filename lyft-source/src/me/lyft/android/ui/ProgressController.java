// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.view.View;
import android.view.ViewGroup;
import me.lyft.android.map.lyft.LyftMapView;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui:
//            IProgressController, ProgressView

public class ProgressController
    implements IProgressController
{

    private Binder binder;
    private String progressMessage;
    private ProgressView progressView;
    ReactiveProperty progressVisibleSubject;
    private ViewGroup rootView;
    ReactiveProperty uiEnabledSubject;

    public ProgressController()
    {
        binder = new Binder();
        uiEnabledSubject = ReactiveProperty.create(Boolean.valueOf(true));
        progressVisibleSubject = ReactiveProperty.create(Boolean.valueOf(false));
    }

    private void enableUI(View view, boolean flag)
    {
        if ((view instanceof ViewGroup) && !(view instanceof LyftMapView))
        {
            ViewGroup viewgroup = (ViewGroup)view;
            for (int i = 0; i < viewgroup.getChildCount(); i++)
            {
                enableUI(viewgroup.getChildAt(i), flag);
            }

        }
        view.setEnabled(flag);
    }

    public void disableUI()
    {
        enableUI(false);
    }

    public void dropView()
    {
        binder.detach();
    }

    public void enableUI()
    {
        enableUI(true);
    }

    public void enableUI(boolean flag)
    {
        uiEnabledSubject.onNext(Boolean.valueOf(flag));
    }

    public void hideProgress()
    {
        progressVisibleSubject.onNext(Boolean.valueOf(false));
    }

    public boolean isActive()
    {
        return ((Boolean)progressVisibleSubject.get()).booleanValue();
    }

    public boolean isUIEnabled()
    {
        return ((Boolean)uiEnabledSubject.get()).booleanValue();
    }

    public void showProgress()
    {
        progressMessage = "";
        progressVisibleSubject.onNext(Boolean.valueOf(true));
    }

    public void showProgress(String s)
    {
        progressMessage = s;
        progressVisibleSubject.onNext(Boolean.valueOf(true));
    }

    public void takeView(ProgressView progressview, final ViewGroup rootView)
    {
        progressView = progressview;
        this.rootView = rootView;
        binder.bind(uiEnabledSubject, new Action1() {

            final ProgressController this$0;
            final ViewGroup val$rootView;

            public void call(Boolean boolean1)
            {
                enableUI(rootView, boolean1.booleanValue());
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$0 = ProgressController.this;
                rootView = viewgroup;
                super();
            }
        });
        binder.bind(progressVisibleSubject, new Action1() {

            final ProgressController this$0;

            public void call(Boolean boolean1)
            {
                ProgressView progressview1 = progressView;
                int i;
                if (boolean1.booleanValue())
                {
                    i = 0;
                } else
                {
                    i = 8;
                }
                progressview1.setVisibility(i);
                progressView.setMessage(progressMessage);
            }

            public volatile void call(Object obj)
            {
                call((Boolean)obj);
            }

            
            {
                this$0 = ProgressController.this;
                super();
            }
        });
        hideProgress();
    }



}
