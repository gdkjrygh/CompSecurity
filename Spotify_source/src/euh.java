// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;

public final class euh
{

    private static final ObjectMapper a;

    public static Object a(gin gin1, gip gip, Class class1, Object obj)
    {
        gip = gin1.a(gip, null);
        gin1 = ((gin) (obj));
        if (gip != null)
        {
            try
            {
                gin1 = ((gin) (a.readValue(gip, class1)));
            }
            // Misplaced declaration of an exception variable
            catch (gin gin1)
            {
                Logger.c("Failed to read the object : %s", new Object[] {
                    gin1.getMessage()
                });
                return obj;
            }
        }
        return gin1;
    }

    public static void a(gin gin1, gip gip, Object obj)
    {
        try
        {
            gin1.b(gip, a.writeValueAsString(obj));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (gin gin1)
        {
            Logger.c("Failed to save the object : %s", new Object[] {
                gin1.getMessage()
            });
        }
    }

    static 
    {
        a = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }
}
