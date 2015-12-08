// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search.suggestions;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.api.legacy.Request;
import com.soundcloud.android.api.legacy.model.SearchSuggestions;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

// Referenced classes of package com.soundcloud.android.search.suggestions:
//            SuggestionsAdapter

private static final class api extends Handler
{

    private final WeakReference adapterRef;
    private final PublicApi api;

    public final void handleMessage(Message message)
    {
        SuggestionsAdapter suggestionsadapter;
        suggestionsadapter = (SuggestionsAdapter)adapterRef.get();
        if (suggestionsadapter == null)
        {
            return;
        }
        message = (CharSequence)message.obj;
        Object obj;
        obj = api.get(Request.to("/search/suggest", new Object[0]).with(new Object[] {
            "q", message, "highlight_mode", "offsets", "limit", Integer.valueOf(5)
        }));
        if (((HttpResponse) (obj)).getStatusLine().getStatusCode() == 200)
        {
            SuggestionsAdapter.access$400(suggestionsadapter, message, (SearchSuggestions)api.getMapper().readValue(((HttpResponse) (obj)).getEntity().getContent(), com/soundcloud/android/api/legacy/model/SearchSuggestions));
            return;
        }
          goto _L1
_L3:
        SuggestionsAdapter.access$400(suggestionsadapter, message, SearchSuggestions.EMPTY);
        return;
_L1:
        try
        {
            String s = SoundCloudApplication.TAG;
            (new StringBuilder("invalid status code returned: ")).append(((HttpResponse) (obj)).getStatusLine());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = SoundCloudApplication.TAG;
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    public (SuggestionsAdapter suggestionsadapter, PublicApi publicapi, Looper looper)
    {
        super(looper);
        adapterRef = new WeakReference(suggestionsadapter);
        api = publicapi;
    }
}
