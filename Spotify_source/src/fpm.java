// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.ui.activity.dialog.artistlove.model.FeedbackChannelDialogModel;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

public final class fpm
{

    public static final long a;
    static final gip b = gip.b("last-artist-feedback-dialog-timestamp");
    private static gip e = gip.b("artist-feedback-dialog-seen-ids");
    final gin c;
    final Context d;

    public fpm(Context context)
    {
        d = context;
        c = ((giq)dmz.a(giq)).b(context);
    }

    final boolean a(FeedbackChannelDialogModel feedbackchanneldialogmodel)
    {
        if (c.f(e)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        JSONArray jsonarray;
        int i;
        int j;
        boolean flag;
        try
        {
            jsonarray = c.d(e);
            j = jsonarray.length();
        }
        // Misplaced declaration of an exception variable
        catch (FeedbackChannelDialogModel feedbackchanneldialogmodel)
        {
            return false;
        }
        i = 0;
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = feedbackchanneldialogmodel.isIdentifiedBy(jsonarray.getString(i));
        if (flag)
        {
            return true;
        }
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_61;
_L4:
        break MISSING_BLOCK_LABEL_34;
        if (true) goto _L1; else goto _L5
_L5:
    }

    final FeedbackChannelDialogModel b(FeedbackChannelDialogModel feedbackchanneldialogmodel)
    {
        JSONArray jsonarray1 = null;
        JSONArray jsonarray = jsonarray1;
        if (c.f(e))
        {
            try
            {
                jsonarray = c.a(e, new JSONArray());
            }
            catch (JSONException jsonexception)
            {
                Logger.b("Failed to fetch seen nag dialog ids.", new Object[0]);
                jsonexception = jsonarray1;
            }
        }
        jsonarray1 = jsonarray;
        if (jsonarray == null)
        {
            jsonarray1 = new JSONArray();
        }
        jsonarray1.put(feedbackchanneldialogmodel.getId());
        c.b().a(e, jsonarray1).b();
        return feedbackchanneldialogmodel;
    }

    static 
    {
        a = TimeUnit.DAYS.toMillis(1L);
    }
}
