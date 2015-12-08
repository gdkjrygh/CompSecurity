// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.arsenal.auth.DevicesResponse;
import com.spotify.mobile.android.arsenal.data.CodeRegistrationException;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public final class dku
{

    private final Context a;

    public dku(Context context)
    {
        a = context;
    }

    public static transient Object a(Class class1, String s, dmm admm[])
    {
        s = a(s, admm);
        if (s.getResponseCode() != 200) goto _L2; else goto _L1
_L1:
        admm = s.getInputStream();
        s = admm;
        class1 = ((Class) (((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a().readValue(admm, class1)));
        if (admm != null)
        {
            try
            {
                admm.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Logger.c("Error closing stream", new Object[] {
                    s
                });
                return class1;
            }
        }
        return class1;
        class1;
        admm = null;
_L6:
        s = admm;
        Logger.b(class1, "Failed Performing HTTP call for Arsenal.", new Object[0]);
        if (admm != null)
        {
            try
            {
                admm.close();
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                Logger.c("Error closing stream", new Object[] {
                    class1
                });
            }
        }
_L2:
        return null;
        class1;
        s = null;
_L4:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Logger.c("Error closing stream", new Object[] {
                    s
                });
            }
        }
        throw class1;
        class1;
        if (true) goto _L4; else goto _L3
_L3:
        class1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static transient HttpURLConnection a(String s, dmm admm[])
    {
        s = (new grp(new gro())).a(new URL(s));
        s.setRequestMethod("POST");
        s.addRequestProperty("Accept", "application/json");
        PrintWriter printwriter = new PrintWriter(s.getOutputStream());
        printwriter.print(dmt.a(Arrays.asList(admm), "UTF-8"));
        gdv.a(printwriter);
        return s;
        s;
        admm = null;
_L2:
        gdv.a(admm);
        throw s;
        s;
        admm = printwriter;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final DevicesResponse a(DevicesResponse devicesresponse)
    {
        Object obj = devicesresponse.getUserCode();
        ctz.a(obj);
        obj = new dkv(a, ((String) (obj)));
        ((dkv) (obj)).start();
        try
        {
            ((dkv) (obj)).a.await();
        }
        catch (InterruptedException interruptedexception) { }
        obj = (Optional)((dkv) (obj)).b.get();
        if (((Optional) (obj)).b() && ((Response)((Optional) (obj)).c()).getStatus() == 200)
        {
            return devicesresponse;
        } else
        {
            throw new CodeRegistrationException();
        }
    }
}
