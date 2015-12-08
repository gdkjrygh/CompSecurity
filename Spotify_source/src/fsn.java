// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

public final class fsn
    implements fsl
{

    private static gip d = gip.b("CURRENT_OFFER");
    private static gip e = gip.b("CURRENT_OFFER_TTL");
    private long b;
    private WeakReference c;
    private ObjectMapper f;

    public fsn(Context context)
    {
        b = -1L;
        c = new WeakReference(context);
        f = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(DeserializationFeature.UNWRAP_ROOT_VALUE, true).a(SerializationFeature.WRAP_ROOT_VALUE, true).a(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL).a();
    }

    public final void a()
    {
        Context context = (Context)c.get();
        if (context == null)
        {
            return;
        } else
        {
            ((giq)dmz.a(giq)).b(context).b().a(d).a(e).a();
            return;
        }
    }

    public final void a(Offer offer)
    {
        Context context;
        context = (Context)c.get();
        if (context == null)
        {
            return;
        }
        long l;
        long l1;
        offer = f.writeValueAsString(offer);
        l1 = System.currentTimeMillis();
        if (b <= -1L)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        l = b;
_L1:
        ((giq)dmz.a(giq)).b(context).b().a(d, offer).a(e, l + l1).a();
        return;
        try
        {
            l = a;
        }
        // Misplaced declaration of an exception variable
        catch (Offer offer)
        {
            Logger.b(offer, "Error caching offer", new Object[0]);
            return;
        }
          goto _L1
    }

    public final void a(fsm fsm1)
    {
        Object obj;
        obj = (Context)c.get();
        if (obj == null)
        {
            fsm1.a();
            return;
        }
        if (b())
        {
            fsm1.a();
            return;
        }
        obj = ((giq)dmz.a(giq)).b(((Context) (obj)));
        obj = ((gin) (obj)).c(d);
        obj = (Offer)f.readValue(((String) (obj)).getBytes(), com/spotify/mobile/android/ui/activity/upsell/model/Offer);
_L1:
        JsonMappingException jsonmappingexception;
        if (obj != null)
        {
            fsm1.a(((Offer) (obj)));
            return;
        } else
        {
            fsm1.a();
            return;
        }
        jsonmappingexception;
_L3:
        Logger.b(jsonmappingexception, "SharedPrefsOfferCache", new Object[0]);
        jsonmappingexception = null;
          goto _L1
        jsonmappingexception;
_L2:
        Logger.b(jsonmappingexception, "SharedPrefsOfferCache", new Object[0]);
        jsonmappingexception = null;
          goto _L1
        jsonmappingexception;
          goto _L2
        jsonmappingexception;
          goto _L3
    }

    public final boolean b()
    {
        Context context = (Context)c.get();
        long l;
        if (context == null)
        {
            l = -1L;
        } else
        {
            l = ((giq)dmz.a(giq)).b(context).a(e, -1L);
        }
        return l - System.currentTimeMillis() < 0L;
    }

}
