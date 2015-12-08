// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.internal.U;
import com.facebook.p;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.share.internal:
//            G

public final class N
{

    public static Bundle a(ShareOpenGraphContent shareopengraphcontent)
    {
        Bundle bundle = new Bundle();
        U.a(bundle, "action_type", shareopengraphcontent.a.a());
        try
        {
            shareopengraphcontent = G.a(G.a(shareopengraphcontent), false);
        }
        // Misplaced declaration of an exception variable
        catch (ShareOpenGraphContent shareopengraphcontent)
        {
            throw new p("Unable to serialize the ShareOpenGraphContent to JSON", shareopengraphcontent);
        }
        if (shareopengraphcontent == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        U.a(bundle, "action_properties", shareopengraphcontent.toString());
        return bundle;
    }
}
