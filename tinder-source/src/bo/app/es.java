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
import com.google.android.gms.wearable.i;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            an, dc, et

public class es
{

    private static final String a;

    public es()
    {
    }

    public static dc a(i j)
    {
        dc dc1 = null;
        if (b(j) == an.y)
        {
            try
            {
                dc1 = dc.a(new JSONObject(j.i("v0")));
            }
            // Misplaced declaration of an exception variable
            catch (i j)
            {
                AppboyLogger.e(a, "Wear device couldn't be recreated.", j);
                return null;
            }
        }
        return dc1;
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

    public static boolean a(i j, IAppboy iappboy)
    {
        an an1 = b(j);
        boolean flag = j.c("h");
        Object obj;
        if (flag)
        {
            obj = a(j.i("p"));
        } else
        {
            obj = null;
        }
        switch (et.a[an1.ordinal()])
        {
        default:
            AppboyLogger.i(a, (new StringBuilder("No current implementation for action in DataMap: ")).append(j.toString()).toString());
            return false;

        case 1: // '\001'
            j = j.i("v0");
            if (flag && obj != null)
            {
                return iappboy.logCustomEvent(j, ((AppboyProperties) (obj)));
            } else
            {
                return iappboy.logCustomEvent(j);
            }

        case 2: // '\002'
            String s = j.i("v0");
            String s1 = j.i("v1");
            j = new BigDecimal(j.i("v2"));
            if (flag && obj != null)
            {
                return iappboy.logPurchase(s, s1, j, ((AppboyProperties) (obj)));
            } else
            {
                return iappboy.logPurchase(s, s1, j);
            }

        case 3: // '\003'
            return iappboy.logShare(SocialNetwork.valueOf(j.i("v0")));

        case 4: // '\004'
            return iappboy.logPushNotificationOpened(j.i("v0"));

        case 5: // '\005'
            return iappboy.submitFeedback(j.i("v0"), j.i("v1"), j.c("v2"));

        case 6: // '\006'
            obj = j.i("k");
            j = j.i("v0");
            return iappboy.getCurrentUser().addToCustomAttributeArray(((String) (obj)), j);

        case 7: // '\007'
            obj = j.i("k");
            int k = j.d("v0");
            return iappboy.getCurrentUser().incrementCustomUserAttribute(((String) (obj)), k);

        case 8: // '\b'
            obj = j.i("k");
            j = j.j("v0");
            return iappboy.getCurrentUser().setCustomAttributeArray(((String) (obj)), j);

        case 9: // '\t'
            obj = j.i("k");
            int l = j.d("v1");
            if (l == 1)
            {
                return iappboy.getCurrentUser().setCustomUserAttribute(((String) (obj)), j.c("v0"));
            }
            if (l == 3)
            {
                return iappboy.getCurrentUser().setCustomUserAttribute(((String) (obj)), j.g("v0"));
            }
            if (l == 4)
            {
                return iappboy.getCurrentUser().setCustomUserAttribute(((String) (obj)), j.d("v0"));
            }
            if (l == 5)
            {
                return iappboy.getCurrentUser().setCustomUserAttribute(((String) (obj)), j.e("v0"));
            }
            double d;
            double d1;
            int i1;
            long l1;
            if (l == 2)
            {
                return iappboy.getCurrentUser().setCustomUserAttribute(((String) (obj)), j.i("v0"));
            } else
            {
                return false;
            }

        case 10: // '\n'
            j = j.i("k");
            return iappboy.getCurrentUser().setCustomUserAttributeToNow(j);

        case 11: // '\013'
            j = j.i("k");
            return iappboy.getCurrentUser().unsetCustomUserAttribute(j);

        case 12: // '\f'
            obj = j.i("k");
            l1 = j.e("v0");
            return iappboy.getCurrentUser().setCustomUserAttributeToSecondsFromEpoch(((String) (obj)), l1);

        case 13: // '\r'
            d = j.h("v0");
            d1 = j.h("v1");
            if (j.a("v2"))
            {
                obj = Double.valueOf(j.h("v2"));
            } else
            {
                obj = null;
            }
            if (j.a("v3"))
            {
                j = Double.valueOf(j.h("v3"));
            } else
            {
                j = null;
            }
            iappboy.getCurrentUser().setLastKnownLocation(d, d1, j, ((Double) (obj)));
            return true;

        case 14: // '\016'
            return iappboy.getCurrentUser().setAvatarImageUrl(j.i("v0"));

        case 15: // '\017'
            return iappboy.getCurrentUser().setBio(j.i("v0"));

        case 16: // '\020'
            return iappboy.getCurrentUser().setCountry(j.i("v0"));

        case 17: // '\021'
            return iappboy.getCurrentUser().setEmail(j.i("v0"));

        case 18: // '\022'
            return iappboy.getCurrentUser().setFirstName(j.i("v0"));

        case 19: // '\023'
            return iappboy.getCurrentUser().setHomeCity(j.i("v0"));

        case 20: // '\024'
            return iappboy.getCurrentUser().setLastName(j.i("v0"));

        case 21: // '\025'
            return iappboy.getCurrentUser().setPhoneNumber(j.i("v0"));

        case 22: // '\026'
            j = Gender.valueOf(j.i("v0"));
            return iappboy.getCurrentUser().setGender(j);

        case 23: // '\027'
            l = j.d("v0");
            obj = Month.valueOf(j.i("v1"));
            i1 = j.d("v2");
            return iappboy.getCurrentUser().setDateOfBirth(l, ((Month) (obj)), i1);

        case 24: // '\030'
            AppboyLogger.i(a, (new StringBuilder("Got an unsupported wearable sdk action. DataMap: ")).append(j.toString()).toString());
            return false;
        }
    }

    public static an b(i j)
    {
        return an.a(j.i("t"));
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/es.getName()
        });
    }
}
