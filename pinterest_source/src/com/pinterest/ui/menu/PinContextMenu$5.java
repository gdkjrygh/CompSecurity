// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.menu;

import android.view.View;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.remote.PinApi;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.ui.menu:
//            PinContextMenu

class this._cls0
    implements android.view.ner
{

    final PinContextMenu this$0;

    public void onClick(View view)
    {
        int i = 1;
        view = ModelHelper.getPin(PinContextMenu.access$000(PinContextMenu.this).getUid());
        boolean flag;
        if (!Constants.isTrue(view.getLiked()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (view != null)
        {
            Pinalytics.a(ElementType.PIN_LIKE_BUTTON, ComponentType.CONTEXTUAL_MENU, PinContextMenu.access$000(PinContextMenu.this).getUid());
            view.setLiked(Boolean.valueOf(flag));
            int j = view.getLikeCountDisplay();
            class _cls1 extends com.pinterest.api.remote.PinApi.PinLikeApiResponse
            {

                final PinContextMenu._cls5 this$1;

                public void onFailure(Throwable throwable, ApiResponse apiresponse)
                {
                    super.onFailure(throwable, apiresponse);
                    if (PinContextMenu.access$000(this$0) != null)
                    {
                        throwable = PinContextMenu.access$000(this$0);
                        int k;
                        boolean flag1;
                        if (!PinContextMenu.access$000(this$0).getLiked().booleanValue())
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        throwable.setLiked(Boolean.valueOf(flag1));
                        throwable = PinContextMenu.access$000(this$0);
                        if (PinContextMenu.access$000(this$0).getLiked().booleanValue())
                        {
                            k = PinContextMenu.access$000(this$0).getLikeCountDisplay() + 1;
                        } else
                        {
                            k = PinContextMenu.access$000(this$0).getLikeCountDisplay() - 1;
                        }
                        throwable.setLikeCount(Integer.valueOf(k));
                        ModelHelper.setPin(PinContextMenu.access$000(this$0));
                    }
                }

                public void onSuccess(ApiResponse apiresponse)
                {
                    super.onSuccess(apiresponse);
                    if (PinContextMenu.access$000(this$0) != null)
                    {
                        if (PinContextMenu.access$000(this$0).getLiked().booleanValue())
                        {
                            apiresponse = EventType.PIN_LIKE;
                        } else
                        {
                            apiresponse = EventType.PIN_UNLIKE;
                        }
                        Pinalytics.a(apiresponse, PinContextMenu.access$000(this$0).getUid(), PinContextMenu.access$000(this$0).getLoggingAuxData());
                        ModelHelper.setPin(PinContextMenu.access$000(this$0));
                    }
                }

            _cls1(Pin pin)
            {
                this$1 = PinContextMenu._cls5.this;
                super(pin);
            }
            }

            if (!flag)
            {
                i = -1;
            }
            view.setLikeCount(Integer.valueOf(i + j));
            Events.post(new com.pinterest.api.model.init>(view));
            PinApi.a(view.getUid(), flag, new _cls1(view));
        }
    }

    _cls1()
    {
        this$0 = PinContextMenu.this;
        super();
    }
}
