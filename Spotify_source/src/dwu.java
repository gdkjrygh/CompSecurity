// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.service.feature.AbbaFlagModel;
import com.spotify.mobile.android.service.feature.AbbaModel;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class dwu
{

    private static gip c = gip.b("feature-service-cached-abba-values");
    public Context a;
    public Resolver b;

    public dwu(Context context)
    {
        a = context;
    }

    static void a(dwu dwu1, AbbaModel abbamodel)
    {
        dwu1 = ((giq)dmz.a(giq)).b(dwu1.a);
        JSONObject jsonobject = new JSONObject();
        abbamodel = abbamodel.getFlags();
        int j = abbamodel.length;
        for (int i = 0; i < j; i++)
        {
            AbbaFlagModel abbaflagmodel = abbamodel[i];
            jsonobject.put(abbaflagmodel.getFeatureName(), abbaflagmodel.getCell());
        }

        dwu1.b().a(c, jsonobject).b();
    }

    public final void a(List list, dwv dwv1, dww dww1)
    {
        fyu fyu1;
        boolean flag;
        Object obj = ((giq)dmz.a(giq)).b(a);
        boolean flag1;
        try
        {
            obj = ((gin) (obj)).a(c, new JSONObject());
        }
        catch (JSONException jsonexception)
        {
            jsonexception = new JSONObject();
        }
        list = list.iterator();
        flag = false;
_L2:
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        fyu1 = (fyu)list.next();
        if (!((JSONObject) (obj)).has(((fym)fyu1.c).a))
        {
            break MISSING_BLOCK_LABEL_140;
        }
        flag1 = dwv1.a(fyu1, fyu1.b_(((JSONObject) (obj)).getString(((fym)fyu1.c).a)));
        flag = flag1 | flag;
        continue; /* Loop/switch isn't completed */
        JSONException jsonexception1;
        jsonexception1;
        flag = dwv1.a(fyu1, fyu1.a()) | flag;
        if (true) goto _L2; else goto _L1
_L1:
        dww1.a(flag);
        return;
    }


    // Unreferenced inner class dwu$1

/* anonymous class */
    public final class _cls1 extends JsonCallbackReceiver
    {

        private List a;
        private dwv b;
        private dww c;
        private dwu d;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
        }

        protected final void onResolved(Response response, Object obj)
        {
            obj = (AbbaModel)obj;
            HashMap hashmap = new HashMap(((AbbaModel) (obj)).getFlags().length);
            response = ((AbbaModel) (obj)).getFlags();
            int j = response.length;
            for (int i = 0; i < j; i++)
            {
                AbbaFlagModel abbaflagmodel = response[i];
                hashmap.put(abbaflagmodel.getFeatureName(), abbaflagmodel);
            }

            Iterator iterator = a.iterator();
            boolean flag = false;
            while (iterator.hasNext()) 
            {
                fyu fyu1 = (fyu)iterator.next();
                response = (AbbaFlagModel)hashmap.get(((fym)fyu1.c).a);
                if (response != null)
                {
                    response = fyu1.b_(response.getCell());
                } else
                {
                    response = fyu1.a();
                }
                flag = b.a(fyu1, response) | flag;
            }
            try
            {
                dwu.a(d, ((AbbaModel) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Response response)
            {
                Logger.b(response, "Could not cache ABBA values", new Object[0]);
            }
            c.a(flag);
        }

            public 
            {
                d = dwu.this;
                a = list;
                b = dwv1;
                c = dww1;
                super(handler, class1);
            }
    }

}
