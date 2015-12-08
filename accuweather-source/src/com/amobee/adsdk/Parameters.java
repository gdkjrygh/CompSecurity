// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.adsdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.amobee.adsdk:
//            AdManager, Log

public final class Parameters
{
    private static class AndroidAidClass
    {

        static void setAndroidAid(Parameters parameters, Context context)
        {
            try
            {
                context = AdvertisingIdClient.getAdvertisingIdInfo(parameters.mContext);
                parameters.advertisingId = context.getId();
                parameters.m_parameters.put("androidaid", parameters.advertisingId);
                if (context.isLimitAdTrackingEnabled())
                {
                    parameters.m_parameters.put("isLAT", "1");
                }
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Parameters parameters)
            {
                Log.d("Amobee Parameters", (new StringBuilder("getAdvertisingId - ")).append(parameters).toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Parameters parameters)
            {
                Log.d("Amobee Parameters", (new StringBuilder("getAdvertisingId - ")).append(parameters).toString());
            }
        }

        private AndroidAidClass()
        {
        }
    }

    public static final class Gender extends Enum
    {

        private static final Gender ENUM$VALUES[];
        public static final Gender Female;
        public static final Gender Male;

        public static Gender valueOf(String s)
        {
            return (Gender)Enum.valueOf(com/amobee/adsdk/Parameters$Gender, s);
        }

        public static Gender[] values()
        {
            Gender agender[] = ENUM$VALUES;
            int i = agender.length;
            Gender agender1[] = new Gender[i];
            System.arraycopy(agender, 0, agender1, 0, i);
            return agender1;
        }

        static 
        {
            Male = new Gender("Male", 0);
            Female = new Gender("Female", 1);
            ENUM$VALUES = (new Gender[] {
                Male, Female
            });
        }

        private Gender(String s, int i)
        {
            super(s, i);
        }
    }


    static final String ANDROID_ADVERTISING_ID_PARAMTER = "androidaid";
    static String EXCLUDE_KEYWORD = "nk";
    static final String GOOGLE_ADVERTISING_ID_PKG = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
    static String KEYWORD = "kw";
    private static final String SDK_VERSION = "3.7";
    private static final String TAG = "Amobee Parameters";
    private String ReservedWordsname[] = {
        "n", "as", "ua", "time", "t", "tp", "sver", "aid", "type", "test", 
        "ira", "i", "category", "null", "AmobeeIncNw", "androidaid"
    };
    private String advertisingId;
    Location lastKnownLocation;
    Context mContext;
    private Map m_parameters;
    private SharedPreferences prefs;
    boolean shouldSendAdvertisingId;

    Parameters(Context context)
    {
        advertisingId = null;
        shouldSendAdvertisingId = true;
        lastKnownLocation = null;
        mContext = context;
        m_parameters = new HashMap();
        prefs = mContext.getSharedPreferences("amobeePref", 0);
        String s = prefs.getString("amobeeId", "");
        if (s != null && s != "")
        {
            m_parameters.put("aid", s);
        }
        m_parameters.put("mu", "xhtml");
        context = (new WebView(context)).getSettings().getUserAgentString();
        m_parameters.put("ua", context);
        m_parameters.put("stype", "Android");
        m_parameters.put("sver", "3.7");
        if (AdManager.pulse3dSupport)
        {
            m_parameters.put("pulse3d", AdManager.pulse3dVersionString);
        }
    }

    static boolean doesClassExist(String s)
    {
        try
        {
            Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    private boolean reservedWord(String s)
    {
        int i = 0;
        do
        {
            if (i >= ReservedWordsname.length)
            {
                return false;
            }
            if (ReservedWordsname[i].equalsIgnoreCase(s))
            {
                Log.d("[a\u2022mo\u2022bee]", (new StringBuilder("setTargetingParameter: Can't set ")).append(s).append(", as it is a reserved word.").toString());
                return true;
            }
            i++;
        } while (true);
    }

    private int searchKeyword(String s, String s1)
    {
        if (getKeywords(s1) == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L7:
        if (i < getKeywords(s1).length) goto _L3; else goto _L2
_L2:
        int j = -1;
_L5:
        return j;
_L3:
        j = i;
        if (getKeywords(s1)[i].equals(s)) goto _L5; else goto _L4
_L4:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void addKeyword(String s)
    {
        if (m_parameters.containsKey("kw"))
        {
            if (searchKeyword(s, KEYWORD) == -1)
            {
                m_parameters.put("kw", (new StringBuilder(String.valueOf((String)m_parameters.get("kw")))).append("|").append(s).toString());
            }
            return;
        } else
        {
            m_parameters.put("kw", s);
            return;
        }
    }

    public void excludeKeyword(String s)
    {
        if (m_parameters.containsKey("nk"))
        {
            if (searchKeyword(s, EXCLUDE_KEYWORD) == -1)
            {
                m_parameters.put("nk", (new StringBuilder(String.valueOf((String)m_parameters.get("nk")))).append("|").append(s).toString());
            }
            return;
        } else
        {
            m_parameters.put("nk", s);
            return;
        }
    }

    public String getAdSpace()
    {
        return (String)m_parameters.get("as");
    }

    public String getAge()
    {
        return (String)m_parameters.get("age");
    }

    public String getContentUrl()
    {
        return (String)m_parameters.get("contenturl");
    }

    public String getCountryCode()
    {
        return (String)m_parameters.get("co");
    }

    public String getDma()
    {
        return (String)m_parameters.get("dma");
    }

    public Date getDob()
    {
        Object obj = (String)m_parameters.get("dob");
        if (obj == null)
        {
            return null;
        }
        SimpleDateFormat simpledateformat = new SimpleDateFormat("ddMMyyyy");
        try
        {
            obj = simpledateformat.parse(((String) (obj)));
        }
        catch (ParseException parseexception)
        {
            return null;
        }
        return ((Date) (obj));
    }

    public String getGender()
    {
        return (String)m_parameters.get("ge");
    }

    public String[] getKeywords(String s)
    {
        s = (String)m_parameters.get(s);
        if (s == null || s.equals(""))
        {
            return null;
        } else
        {
            return s.split("\\|");
        }
    }

    public String getLat()
    {
        return (String)m_parameters.get("lat");
    }

    public Location getLocation()
    {
        Location location = new Location("admob");
        try
        {
            location.setLatitude(Double.parseDouble((String)m_parameters.get("lat")));
            location.setLongitude(Double.parseDouble((String)m_parameters.get("long")));
        }
        catch (Exception exception)
        {
            return null;
        }
        return location;
    }

    public String getLong()
    {
        return (String)m_parameters.get("long");
    }

    public Map getParameters()
    {
        return m_parameters;
    }

    public String getPartner()
    {
        return (String)m_parameters.get("prt");
    }

    public String getStateCode()
    {
        return (String)m_parameters.get("st");
    }

    public String getZip()
    {
        return (String)m_parameters.get("zip");
    }

    public void removeExcludeKeyword(String s)
    {
label0:
        {
            if (m_parameters.containsKey("nk") && getKeywords("nk") != null)
            {
                if (getKeywords(EXCLUDE_KEYWORD).length != 1 || !getKeywords(EXCLUDE_KEYWORD)[0].equals(s))
                {
                    break label0;
                }
                m_parameters.remove("nk");
            }
            return;
        }
        if (getKeywords(EXCLUDE_KEYWORD)[getKeywords(EXCLUDE_KEYWORD).length - 1].equals(s))
        {
            m_parameters.put("nk", ((String)m_parameters.get("nk")).replace((new StringBuilder("|")).append(s).toString(), ""));
            return;
        } else
        {
            m_parameters.put("nk", ((String)m_parameters.get("nk")).replace((new StringBuilder(String.valueOf(s))).append("|").toString(), ""));
            return;
        }
    }

    public void removeKeyword(String s)
    {
label0:
        {
            if (m_parameters.containsKey("kw") && getKeywords("kw") != null)
            {
                if (getKeywords(KEYWORD).length != 1 || !getKeywords(KEYWORD)[0].equals(s))
                {
                    break label0;
                }
                m_parameters.remove("kw");
            }
            return;
        }
        if (getKeywords(KEYWORD)[getKeywords(KEYWORD).length - 1].equals(s))
        {
            m_parameters.put("kw", ((String)m_parameters.get("kw")).replace((new StringBuilder("|")).append(s).toString(), ""));
            return;
        } else
        {
            m_parameters.put("kw", ((String)m_parameters.get("kw")).replace((new StringBuilder(String.valueOf(s))).append("|").toString(), ""));
            return;
        }
    }

    public void setAdSpace(String s)
    {
        m_parameters.put("as", s);
    }

    void setAdvertisingdId()
    {
        this;
        JVM INSTR monitorenter ;
        if (shouldSendAdvertisingId) goto _L2; else goto _L1
_L1:
        m_parameters.remove("androidaid");
        m_parameters.remove("isLAT");
        advertisingId = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (advertisingId == null)
        {
            AndroidAidClass.setAndroidAid(this, mContext);
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void setAge(int i)
    {
        m_parameters.put("age", Integer.toString(i));
    }

    void setAmobeeId(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (!s.equals(m_parameters.get("aid")))
        {
            prefs.edit().putString("amobeeId", s).commit();
            if (m_parameters.get("aid") != null)
            {
                m_parameters.remove("aid");
            }
            m_parameters.put("aid", s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void setContentUrl(String s)
    {
        if (s != null)
        {
            m_parameters.put("contenturl", s);
        }
    }

    public void setCountryCode(String s)
    {
        m_parameters.put("co", s);
    }

    public void setDma(String s)
    {
        m_parameters.put("dma", s);
    }

    public void setDob(Date date)
    {
        if (date != null)
        {
            date = (new SimpleDateFormat("ddMMyyyy")).format(date);
            if (date != null && !date.equals(""))
            {
                m_parameters.put("dob", date);
            }
        }
    }

    public void setGender(Gender gender)
    {
        Map map = m_parameters;
        if (gender == Gender.Male)
        {
            gender = "m";
        } else
        {
            gender = "f";
        }
        map.put("ge", gender);
    }

    public void setLocation(Location location)
    {
        lastKnownLocation = location;
        m_parameters.put("lat", Double.toString(location.getLatitude()));
        m_parameters.put("long", Double.toString(location.getLongitude()));
    }

    public void setPartner(String s)
    {
        m_parameters.put("prt", s);
    }

    public void setStateCode(String s)
    {
        m_parameters.put("st", s);
    }

    public void setTargetingParameter(String s, String s1)
    {
        if (!reservedWord(s) && !s.equals(""))
        {
            m_parameters.put(s, s1);
        }
    }

    public void setTest(boolean flag)
    {
        Map map = m_parameters;
        String s;
        if (flag)
        {
            s = "1";
        } else
        {
            s = "0";
        }
        map.put("ts", s);
    }

    public void setZip(String s)
    {
        m_parameters.put("zip", s);
    }




}
