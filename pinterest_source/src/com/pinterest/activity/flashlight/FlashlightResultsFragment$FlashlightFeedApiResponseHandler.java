// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.flashlight;

import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.education.EducationHelper;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.experiences.Placement;
import com.pinterest.ui.progress.LoadingView;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.flashlight:
//            FlashlightResultsFragment

public class _isAnnotationRequest extends FeedApiResponseHandler
{

    private boolean _isAnnotationRequest;
    final FlashlightResultsFragment this$0;

    private void handleAnnotations(PinterestJsonObject pinterestjsonobject)
    {
        FlashlightResultsFragment.access$202(FlashlightResultsFragment.this, new ArrayList());
        PinterestJsonArray pinterestjsonarray = pinterestjsonobject.d("annotations");
        FlashlightResultsFragment.access$902(FlashlightResultsFragment.this, pinterestjsonobject.a("search_identifier", null));
        FlashlightResultsFragment.access$1000(FlashlightResultsFragment.this);
        if (pinterestjsonarray != null)
        {
            if (pinterestjsonarray.a() > 0)
            {
                for (int i = 0; i < pinterestjsonarray.a(); i++)
                {
                    pinterestjsonobject = pinterestjsonarray.a(i);
                    if (pinterestjsonobject != null && !StringUtils.isEmpty(pinterestjsonobject) && !FlashlightResultsFragment.access$300(FlashlightResultsFragment.this).contains(pinterestjsonobject))
                    {
                        FlashlightResultsFragment.access$200(FlashlightResultsFragment.this).add(pinterestjsonobject);
                    }
                }

            }
            if (_isAnnotationRequest)
            {
                if (FlashlightResultsFragment.access$300(FlashlightResultsFragment.this).size() < 3)
                {
                    FlashlightResultsFragment.access$200(FlashlightResultsFragment.this).addAll(0, FlashlightResultsFragment.access$300(FlashlightResultsFragment.this));
                } else
                {
                    FlashlightResultsFragment.access$200(FlashlightResultsFragment.this).clear();
                    FlashlightResultsFragment.access$200(FlashlightResultsFragment.this).addAll(FlashlightResultsFragment.access$300(FlashlightResultsFragment.this));
                }
            } else
            {
                FlashlightResultsFragment.access$300(FlashlightResultsFragment.this).clear();
            }
            if (_annotationsView != null && FlashlightResultsFragment.access$100(FlashlightResultsFragment.this) != null)
            {
                FlashlightResultsFragment.access$400(FlashlightResultsFragment.this, true);
            }
        }
    }

    public void onFinish()
    {
        super.onFinish();
        if (_loadingView != null)
        {
            _loadingView.setState(2);
        }
        if (FlashlightResultsFragment.access$1300(FlashlightResultsFragment.this) && !FlashlightResultsFragment.access$600(FlashlightResultsFragment.this))
        {
            FlashlightResultsFragment.access$1302(FlashlightResultsFragment.this, false);
            FlashlightResultsFragment.access$1402(FlashlightResultsFragment.this, EducationHelper.a(Placement.ANDROID_FLASHLIGHT_TAKEOVER, FlashlightResultsFragment.this));
        }
    }

    public void onStart()
    {
        if (FlashlightResultsFragment.access$1100(FlashlightResultsFragment.this) != null)
        {
            ((PinGridAdapter)FlashlightResultsFragment.access$1200(FlashlightResultsFragment.this)).setLoading(true);
        }
        if (_loadingView != null)
        {
            _loadingView.setState(0);
        }
    }

    public void onSuccess(final PinterestJsonObject response)
    {
        super.onSuccess(response);
        if (FlashlightResultsFragment.access$600(FlashlightResultsFragment.this))
        {
            return;
        } else
        {
            class _cls1 extends BackgroundTask
            {

                private Feed _feed;
                final FlashlightResultsFragment.FlashlightFeedApiResponseHandler this$1;
                final PinterestJsonObject val$response;

                public void onFinish()
                {
                    super.onFinish();
                    onSuccess(_feed);
                    handleAnnotations(response);
                }

                public void run()
                {
                    _feed = new PinFeed(response, 
// JavaClassFileOutputException: get_constant: invalid tag

            _cls1()
            {
                this$1 = FlashlightResultsFragment.FlashlightFeedApiResponseHandler.this;
                response = pinterestjsonobject;
                super();
            }
            }

            (new _cls1()).execute();
            return;
        }
    }



    public _cls1()
    {
        this$0 = FlashlightResultsFragment.this;
        super();
    }

    public this._cls0(FeedApiResponseHandler feedapiresponsehandler, boolean flag)
    {
        this$0 = FlashlightResultsFragment.this;
        super(feedapiresponsehandler);
        _isAnnotationRequest = flag;
    }
}
