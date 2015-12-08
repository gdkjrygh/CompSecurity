// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;

public final class fpz
    implements fpt
{

    private static gip a = gip.b("dynamic_upsell_cache_entry_data");
    private final gin b;
    private final ObjectMapper c;
    private final Object d;

    private fpz(gin gin1)
    {
        d = new Object();
        b = gin1;
        c = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    fpz(gin gin1, byte byte0)
    {
        this(gin1);
    }

    public static dna a(Context context)
    {
        return new dna(context) {

            private Context a;

            public final Object a()
            {
                return new fpz(((giq)dmz.a(giq)).b(a), (byte)0);
            }

            
            {
                a = context;
                super();
            }
        };
    }

    public final Optional a()
    {
        Object obj = b.a(a, "");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return Optional.e();
        }
        try
        {
            obj = Optional.b((DynamicUpsellConfig)c.reader(com/spotify/mobile/android/ui/activity/dynamicupsell/DynamicUpsellConfig).readValue(((String) (obj))));
        }
        catch (IOException ioexception)
        {
            Logger.b(ioexception, "(upsell) Failed to read dynamic upsell configuration from cache", new Object[0]);
            return Optional.e();
        }
        return ((Optional) (obj));
    }

    public final DynamicUpsellConfig a(DynamicUpsellConfig dynamicupsellconfig, com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup reasongroup)
    {
        Object obj1 = d;
        obj1;
        JVM INSTR monitorenter ;
        Object obj = a();
        DynamicUpsellConfig dynamicupsellconfig1 = dynamicupsellconfig;
        if (!((Optional) (obj)).b()) goto _L2; else goto _L1
_L1:
        Reason areason[];
        int j;
        dynamicupsellconfig1 = (DynamicUpsellConfig)((Optional) (obj)).c();
        areason = reasongroup.mReasons;
        j = areason.length;
        int i = 0;
_L3:
        Reason reason;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        reason = areason[i];
        obj = dynamicupsellconfig.getConfigForType(reason);
        reasongroup = ((com.spotify.mobile.android.ui.activity.upsell.Reason.ReasonGroup) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        reasongroup = com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration.EMPTY;
        dynamicupsellconfig1.put(reason.mMappedReason, reasongroup);
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        dynamicupsellconfig = c.writer().writeValueAsString(dynamicupsellconfig1);
        b.b().a(a, dynamicupsellconfig).b();
_L4:
        obj1;
        JVM INSTR monitorexit ;
        return dynamicupsellconfig1;
        dynamicupsellconfig;
        Logger.b(dynamicupsellconfig, "Failed to cache upsell configuration", new Object[0]);
          goto _L4
        dynamicupsellconfig;
        obj1;
        JVM INSTR monitorexit ;
        throw dynamicupsellconfig;
    }

    public final void b()
    {
        b.g(a);
    }

}
