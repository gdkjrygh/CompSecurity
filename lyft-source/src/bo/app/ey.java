// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import com.appboy.AppboyUser;
import com.appboy.Constants;
import com.appboy.IAppboy;
import com.appboy.enums.Gender;
import com.appboy.enums.Month;
import com.appboy.enums.SocialNetwork;
import com.appboy.models.outgoing.AppboyProperties;
import com.appboy.support.AppboyLogger;
import com.google.android.gms.wearable.DataMap;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            as, di, ez

public class ey
{

    private static final String a;

    public ey()
    {
    }

    public static di a(DataMap datamap)
    {
        di di1 = null;
        if (b(datamap) == as.y)
        {
            try
            {
                di1 = di.a(new JSONObject(datamap.h("v0")));
            }
            // Misplaced declaration of an exception variable
            catch (DataMap datamap)
            {
                AppboyLogger.e(a, "Wear device couldn't be recreated.", datamap);
                return null;
            }
        }
        return di1;
    }

    private static AppboyProperties a(String s)
    {
        AppboyProperties appboyproperties;
        try
        {
            appboyproperties = new AppboyProperties(new JSONObject(s));
        }
        catch (JSONException jsonexception)
        {
            AppboyLogger.e(a, (new StringBuilder("Failed to create properties object from string: ")).append(s).toString(), jsonexception);
            return null;
        }
        return appboyproperties;
    }

    public static boolean a(DataMap datamap, IAppboy iappboy)
    {
        as as1 = b(datamap);
        boolean flag = datamap.c("h");
        Object obj;
        if (flag)
        {
            obj = a(datamap.h("p"));
        } else
        {
            obj = null;
        }
        switch (ez.a[as1.ordinal()])
        {
        default:
            AppboyLogger.i(a, (new StringBuilder("No current implementation for action in DataMap: ")).append(datamap.toString()).toString());
            return false;

        case 1: // '\001'
            datamap = datamap.h("v0");
            if (flag && obj != null)
            {
                return iappboy.logCustomEvent(datamap, ((AppboyProperties) (obj)));
            } else
            {
                return iappboy.logCustomEvent(datamap);
            }

        case 2: // '\002'
            String s = datamap.h("v0");
            String s1 = datamap.h("v1");
            datamap = new BigDecimal(datamap.h("v2"));
            if (flag && obj != null)
            {
                return iappboy.logPurchase(s, s1, datamap, ((AppboyProperties) (obj)));
            } else
            {
                return iappboy.logPurchase(s, s1, datamap);
            }

        case 3: // '\003'
            return iappboy.logShare(SocialNetwork.valueOf(datamap.h("v0")));

        case 4: // '\004'
            return iappboy.logPushNotificationOpened(datamap.h("v0"));

        case 5: // '\005'
            return iappboy.submitFeedback(datamap.h("v0"), datamap.h("v1"), datamap.c("v2"));

        case 6: // '\006'
            obj = datamap.h("k");
            datamap = datamap.h("v0");
            return iappboy.getCurrentUser().addToCustomAttributeArray(((String) (obj)), datamap);

        case 7: // '\007'
            obj = datamap.h("k");
            int i = datamap.d("v0");
            return iappboy.getCurrentUser().incrementCustomUserAttribute(((String) (obj)), i);

        case 8: // '\b'
            obj = datamap.h("k");
            datamap = datamap.i("v0");
            return iappboy.getCurrentUser().setCustomAttributeArray(((String) (obj)), datamap);

        case 9: // '\t'
            obj = datamap.h("k");
            int j = datamap.d("v1");
            if (j == 1)
            {
                return iappboy.getCurrentUser().setCustomUserAttribute(((String) (obj)), datamap.c("v0"));
            }
            if (j == 3)
            {
                return iappboy.getCurrentUser().setCustomUserAttribute(((String) (obj)), datamap.f("v0"));
            }
            if (j == 4)
            {
                return iappboy.getCurrentUser().setCustomUserAttribute(((String) (obj)), datamap.d("v0"));
            }
            if (j == 5)
            {
                return iappboy.getCurrentUser().setCustomUserAttribute(((String) (obj)), datamap.e("v0"));
            }
            double d;
            double d1;
            int k;
            long l;
            if (j == 2)
            {
                return iappboy.getCurrentUser().setCustomUserAttribute(((String) (obj)), datamap.h("v0"));
            } else
            {
                return false;
            }

        case 10: // '\n'
            datamap = datamap.h("k");
            return iappboy.getCurrentUser().setCustomUserAttributeToNow(datamap);

        case 11: // '\013'
            datamap = datamap.h("k");
            return iappboy.getCurrentUser().unsetCustomUserAttribute(datamap);

        case 12: // '\f'
            obj = datamap.h("k");
            l = datamap.e("v0");
            return iappboy.getCurrentUser().setCustomUserAttributeToSecondsFromEpoch(((String) (obj)), l);

        case 13: // '\r'
            d = datamap.g("v0");
            d1 = datamap.g("v1");
            if (datamap.a("v2"))
            {
                obj = Double.valueOf(datamap.g("v2"));
            } else
            {
                obj = null;
            }
            if (datamap.a("v3"))
            {
                datamap = Double.valueOf(datamap.g("v3"));
            } else
            {
                datamap = null;
            }
            iappboy.getCurrentUser().setLastKnownLocation(d, d1, datamap, ((Double) (obj)));
            return true;

        case 14: // '\016'
            return iappboy.getCurrentUser().setAvatarImageUrl(datamap.h("v0"));

        case 15: // '\017'
            return iappboy.getCurrentUser().setBio(datamap.h("v0"));

        case 16: // '\020'
            return iappboy.getCurrentUser().setCountry(datamap.h("v0"));

        case 17: // '\021'
            return iappboy.getCurrentUser().setEmail(datamap.h("v0"));

        case 18: // '\022'
            return iappboy.getCurrentUser().setFirstName(datamap.h("v0"));

        case 19: // '\023'
            return iappboy.getCurrentUser().setHomeCity(datamap.h("v0"));

        case 20: // '\024'
            return iappboy.getCurrentUser().setLastName(datamap.h("v0"));

        case 21: // '\025'
            return iappboy.getCurrentUser().setPhoneNumber(datamap.h("v0"));

        case 22: // '\026'
            datamap = Gender.valueOf(datamap.h("v0"));
            return iappboy.getCurrentUser().setGender(datamap);

        case 23: // '\027'
            j = datamap.d("v0");
            obj = Month.valueOf(datamap.h("v1"));
            k = datamap.d("v2");
            return iappboy.getCurrentUser().setDateOfBirth(j, ((Month) (obj)), k);

        case 24: // '\030'
            AppboyLogger.i(a, (new StringBuilder("Got an unsupported wearable sdk action. DataMap: ")).append(datamap.toString()).toString());
            return false;
        }
    }

    public static as b(DataMap datamap)
    {
        return as.a(datamap.h("t"));
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/ey.getName()
        });
    }
}
