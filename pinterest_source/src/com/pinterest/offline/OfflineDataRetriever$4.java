// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.offline;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.model.SyncJob;
import com.pinterest.kit.log.PLog;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.offline:
//            OfflineDataRetriever

class ponse extends com.pinterest.api.remote.se
{

    public List a;
    final OfflineDataRetriever b;

    public void onFailure(Throwable throwable, ApiResponse apiresponse)
    {
        super.onFailure(throwable, apiresponse);
        if (apiresponse != null && apiresponse.getCode() == 10)
        {
            throwable = OfflineDataRetriever.a(1, null, OfflineDataRetriever.d(b).getGroupUid());
            ModelHelper.setSyncJob(throwable);
            OfflineDataRetriever.c(b);
            OfflineDataRetriever.a(b, throwable);
            return;
        } else
        {
            OfflineDataRetriever.a(b, null);
            return;
        }
    }

    public void onStart()
    {
        super.onStart();
        a = ModelHelper.getBoardPins(OfflineDataRetriever.d(b).getGroupUid());
        Object obj;
        if (a != null)
        {
            obj = a;
        } else
        {
            obj = new ArrayList();
        }
        a = ((List) (obj));
    }

    public void onSuccess(Feed feed)
    {
        boolean flag2 = false;
        Board board = ModelHelper.getBoard(OfflineDataRetriever.d(b).getGroupUid());
        if (board == null)
        {
            OfflineDataRetriever.c(b);
            onFailure(null, new ApiResponse(null));
            return;
        }
        Object obj = board.getSyncedAt();
        Object obj1 = board.getLastModifiedAt();
        boolean flag;
        int i;
        if (obj == null || obj1 == null || ((Date) (obj1)).after(((Date) (obj))))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        PLog.log("OfflineDataRetriever", (new StringBuilder("Grabbed ")).append(feed.getCount()).append(" pins of ").append(board.getPinCount()).append(" for board \"").append(board.getName()).append("\"").toString(), new Object[0]);
        obj1 = (PinFeed)feed;
        obj = new ArrayList();
        obj1 = ((PinFeed) (obj1)).getItems();
        i = 0;
        do
        {
label0:
            {
label1:
                {
                    boolean flag1 = flag2;
                    Pin pin;
                    if (i < ((List) (obj1)).size())
                    {
                        pin = (Pin)((List) (obj1)).get(i);
                        if (pin == null)
                        {
                            break label0;
                        }
                        if (flag || !a.contains(pin))
                        {
                            break label1;
                        }
                        PLog.log("OfflineDataRetriever", (new StringBuilder("Found previously synced pin at index ")).append(i).append(" no need to update the rest of this board.").toString(), new Object[0]);
                        OfflineDataRetriever.a(board, ((List) (obj1)));
                        OfflineDataRetriever.a(board, a);
                        flag1 = true;
                    }
                    feed = feed.getNextUrl();
                    if (!flag1 && StringUtils.isNotBlank(feed))
                    {
                        feed = OfflineDataRetriever.a(1, feed, OfflineDataRetriever.d(b).getGroupUid());
                        ((List) (obj)).add(feed);
                    } else
                    {
                        board.setSyncedAt(Calendar.getInstance().getTime());
                        ModelHelper.setBoard(board);
                        feed = null;
                    }
                    ModelHelper.setSyncJobs(((List) (obj)));
                    OfflineDataRetriever.c(b);
                    OfflineDataRetriever.a(b, feed);
                    return;
                }
                ((List) (obj)).add(OfflineDataRetriever.a(2, pin.getImageMediumUrl(), board.getUid()));
            }
            i++;
        } while (true);
    }

    ponse(OfflineDataRetriever offlinedataretriever)
    {
        b = offlinedataretriever;
        super();
    }
}
