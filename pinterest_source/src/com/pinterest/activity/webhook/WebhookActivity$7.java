// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.webhook;

import android.content.Intent;
import android.net.Uri;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Board;
import com.pinterest.kit.utils.NetworkUtils;
import com.pinterest.kit.utils.OcfUtils;
import java.util.List;

// Referenced classes of package com.pinterest.activity.webhook:
//            WebhookActivity

class e extends com.pinterest.api.remote.esponse
{

    final WebhookActivity this$0;
    final List val$segments;
    final Uri val$uri;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        if (!NetworkUtils.getInstance().hasInternet())
        {
            super.onFailure(throwable, apiresponse);
            finish();
            return;
        } else
        {
            WebhookActivity.access$500(WebhookActivity.this, val$uri, val$segments);
            return;
        }
    }

    public void onFinish()
    {
    }

    public void onSuccess(Board board)
    {
        super.onSuccess(board);
        if (board != null)
        {
            board = new Navigation(Location.BOARD, board);
            Intent intent = ActivityHelper.getHomeIntent(WebhookActivity.this);
            intent.putExtra("com.pinterest.EXTRA_PENDING_TASK", board);
            OcfUtils.addOcfFlag(intent, WebhookActivity.access$400(WebhookActivity.this));
            WebhookActivity.access$402(WebhookActivity.this, false);
            WebhookActivity.access$100("board");
            startActivity(intent);
        }
        finish();
    }

    e(List list)
    {
        this$0 = final_webhookactivity;
        val$uri = Uri.this;
        val$segments = list;
        super(final_flag);
    }
}
