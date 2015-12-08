// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.akamai.android.analytics:
//            States, CSMAKEYS, InternalCodes, VisitMetrics

class AdState extends States
{

    private final String ADKEY_ADCATEGORY = "adcategory";
    private final String ADKEY_ADDAYPART = "addaypart";
    private final String ADKEY_ADDURATION = "adduration";
    private final String ADKEY_ADEVENT = "adevent";
    private final String ADKEY_ADINDUSTRYCATEGORY = "adindustrycategory";
    private final String ADKEY_ADPARTNERID = "adpartnerid";
    private final String ADKEY_ADSERVER = "adserver";
    private final String ADKEY_ADSTARTUPTIME = "adstartuptime";
    private final String ADKEY_ADTITLE = "adtitle";
    private final String ADKEY_ENDSTATUS = "endstatus";
    private final String ADKEY_ID = "id";
    private final String ADKEY_PLAYBUCKET = "playbucket";
    private final String ADKEY_PLAYTIME = "playtime";
    private final String ADKEY_STARTPOS = "startpos";
    private final String ADKEY_TYPE = "type";
    String adSessionKeysDefault[][];
    String adSessionTillNow;
    boolean adStarted;
    int adabandons;
    int adcount;
    int adpausetime;
    int adplaytime;
    int adstartcount;
    int adstartuptime;
    HashMap currentAdSession;
    boolean isAdSessionActive;
    int totaladabandoncount;
    int totaladplayclocktime;
    int totaladstartcount;

    public AdState(int i)
    {
        super(i);
        String as[] = {
            "adtitle", ""
        };
        adSessionKeysDefault = (new String[][] {
            new String[] {
                "id", ""
            }, new String[] {
                "type", "0"
            }, new String[] {
                "startpos", "0"
            }, new String[] {
                "adstartuptime", "0"
            }, new String[] {
                "playtime", "0"
            }, new String[] {
                "playbucket", "-1"
            }, new String[] {
                "endstatus", "2"
            }, new String[] {
                "adduration", "0"
            }, as, new String[] {
                "adcategory", ""
            }, new String[] {
                "adpartnerid", ""
            }, new String[] {
                "adserver", ""
            }, new String[] {
                "addaypart", ""
            }, new String[] {
                "adindustrycategory", ""
            }, new String[] {
                "adevent", ""
            }
        });
        adSessionTillNow = "";
        adStarted = false;
        currentAdSession = null;
        adcount = 0;
        adstartcount = 0;
        adplaytime = 0;
        adstartuptime = 0;
        adpausetime = 0;
        adabandons = 0;
        totaladplayclocktime = 0;
        totaladstartcount = 0;
        totaladabandoncount = 0;
        isAdSessionActive = false;
    }

    private HashMap adSessionInit()
    {
        HashMap hashmap = new HashMap();
        String as[][] = adSessionKeysDefault;
        int j = as.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return hashmap;
            }
            String as1[] = as[i];
            hashmap.put(as1[0], as1[1]);
            i++;
        } while (true);
    }

    private String adSessionObjToStr(HashMap hashmap)
    {
        if (hashmap != null) goto _L2; else goto _L1
_L1:
        hashmap = "";
_L4:
        return hashmap;
_L2:
        String s = "";
        String s1;
        String as[][];
        String as1[];
        int i;
        int j;
        try
        {
            as = adSessionKeysDefault;
            j = as.length;
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            return "";
        }
        i = 0;
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        hashmap = s;
        if (s.length() <= 0) goto _L4; else goto _L3
_L3:
        return s.substring(0, s.length() - 1);
        as1 = as[i];
        s1 = s;
        if (hashmap.containsKey(as1[0]))
        {
            s1 = (new StringBuilder(String.valueOf(s))).append((String)hashmap.get(as1[0])).toString();
        }
        s = (new StringBuilder(String.valueOf(s1))).append(":").toString();
        i++;
        break MISSING_BLOCK_LABEL_26;
    }

    private void updateAdPlayTime(int i, int j, float f)
    {
label0:
        {
            if (isAdSessionActive && currentAdSession != null)
            {
                if (!adStarted)
                {
                    break label0;
                }
                currentAdSession.put("playtime", Integer.toString(timeSpent(i, j)));
            }
            return;
        }
        currentAdSession.put("adstartuptime", Integer.toString(timeSpent(i, j)));
    }

    private void updateAdSessionInfo()
    {
        if (isAdSessionActive)
        {
            String s = adSessionObjToStr(currentAdSession);
            if (s.length() > 0)
            {
                if (adSessionTillNow.length() > 0)
                {
                    adSessionTillNow = (new StringBuilder(String.valueOf(adSessionTillNow))).append(",").toString();
                }
                adSessionTillNow = (new StringBuilder(String.valueOf(adSessionTillNow))).append(s).toString();
            }
            try
            {
                adcount = adcount + 1;
                int i = adplaytime;
                adplaytime = Integer.parseInt((String)currentAdSession.get("playtime")) + i;
                i = adstartuptime;
                adstartuptime = Integer.parseInt((String)currentAdSession.get("adstartuptime")) + i;
                String s1 = (String)currentAdSession.get("playbucket");
                if (!s1.equals("-1") && !s1.equals("4"))
                {
                    adabandons = adabandons + 1;
                }
                if (!s1.equals("-1"))
                {
                    adstartcount = adstartcount + 1;
                }
            }
            catch (Exception exception) { }
        }
        currentAdSession = null;
        isAdSessionActive = false;
    }

    public int enter_state(int i, int j, int k, float f)
    {
        if (!isAdSessionActive && currentAdSession == null)
        {
            currentAdSession = adSessionInit();
        }
        if (currentAdSession != null && currentAdSession.containsKey("startpos"))
        {
            currentAdSession.put("startpos", Float.toString(f));
        }
        isAdSessionActive = true;
        adStarted = false;
        return super.enter_state(i, j, k, f);
    }

    public int exit_state(int i, int j, int k, float f)
    {
        updateAdSessionInfo();
        super.exit_state(i, j, k, f);
        super.reset(j, k, f, null);
        adStarted = false;
        return 0;
    }

    public void getMetrics(HashMap hashmap, int i, int j, float f, VisitMetrics visitmetrics)
    {
        try
        {
            if (hashmap.containsKey(CSMAKEYS.playerstate.toString()) && _stateActive)
            {
                hashmap.put(CSMAKEYS.playerstate.toString(), "AP");
            }
            if (hashmap.containsKey(CSMAKEYS.adsession.toString()))
            {
                hashmap.put(CSMAKEYS.adsession.toString(), adSessionTillNow);
            }
            hashmap.put(CSMAKEYS.adcount.toString(), Integer.toString(adcount));
            hashmap.put(CSMAKEYS.adstartcount.toString(), Integer.toString(adstartcount));
            hashmap.put(CSMAKEYS.adplayclocktime.toString(), Integer.toString(adplaytime));
            hashmap.put(CSMAKEYS.adabandoncount.toString(), Integer.toString(adabandons));
            hashmap.put(CSMAKEYS.totaladabandoncount.toString(), Integer.toString(adabandons + totaladabandoncount));
            hashmap.put(CSMAKEYS.totaladplayclocktime.toString(), Integer.toString(adplaytime + totaladplayclocktime));
            hashmap.put(CSMAKEYS.totaladstartcount.toString(), Integer.toString(adstartcount + totaladstartcount));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            return;
        }
    }

    public void handleAdComplete(int i, int j, float f)
    {
        try
        {
            if (isAdSessionActive)
            {
                currentAdSession.put("playbucket", "4");
                currentAdSession.put("endstatus", "0");
                updateAdPlayTime(i, j, f);
                updateAdSessionInfo();
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void handleAdEnd(int i, int j, int k, float f)
    {
        if (!isAdSessionActive)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        if (i == InternalCodes.ADENDEDNORMALLY)
        {
            handleAdComplete(j, k, f);
            return;
        }
        try
        {
            if (i == InternalCodes.ADENDEDWITHUSERSTOP)
            {
                handleAdStopped(j, k, f);
                return;
            }
        }
        catch (Exception exception)
        {
            return;
        }
        currentAdSession.put("endstatus", Integer.toString(i));
        updateAdPlayTime(j, k, f);
        updateAdSessionInfo();
    }

    public void handleAdError(HashMap hashmap, int i, int j, float f)
    {
        try
        {
            if (isAdSessionActive)
            {
                currentAdSession.put("endstatus", Integer.toString(InternalCodes.ADENDEDWITHERROR));
                updateAdPlayTime(i, j, f);
                updateAdSessionInfo();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HashMap hashmap)
        {
            return;
        }
    }

    public void handleAdFirstQuartile(int i, int j, float f)
    {
        try
        {
            if (isAdSessionActive)
            {
                currentAdSession.put("playbucket", "1");
                adStarted = true;
                updateAdPlayTime(i, j, f);
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void handleAdLoaded(int i, HashMap hashmap, int j, int k, float f)
    {
        super.reset(j, k, f, null);
        if (!isAdSessionActive || hashmap == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        Iterator iterator = hashmap.keySet().iterator();
_L2:
        if (!iterator.hasNext())
        {
            currentAdSession.put("type", Integer.toString(i));
            return;
        }
        String s = (String)iterator.next();
        String s1 = s.toLowerCase();
        if (currentAdSession.containsKey(s1))
        {
            currentAdSession.put(s1, ((String)hashmap.get(s)).replace(":", "*@*").replace(",", "*@*"));
        }
        if (true) goto _L2; else goto _L1
_L1:
        hashmap;
    }

    public void handleAdMidPoint(int i, int j, float f)
    {
        try
        {
            if (isAdSessionActive)
            {
                currentAdSession.put("playbucket", "2");
                adStarted = true;
                updateAdPlayTime(i, j, f);
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void handleAdStarted(int i, int j, float f)
    {
        try
        {
            if (isAdSessionActive)
            {
                int k = timeSpent(i, j);
                currentAdSession.put("adstartuptime", Integer.toString(k));
                currentAdSession.put("playbucket", "0");
                super.reset(i, j, f, null);
                adStarted = true;
                updateAdPlayTime(i, j, f);
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void handleAdStopped(int i, int j, float f)
    {
        try
        {
            if (isAdSessionActive)
            {
                currentAdSession.put("endstatus", Integer.toString(InternalCodes.ADENDEDWITHUSERSTOP));
                updateAdPlayTime(i, j, f);
                updateAdSessionInfo();
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void handleAdThirdQuartile(int i, int j, float f)
    {
        try
        {
            if (isAdSessionActive)
            {
                currentAdSession.put("playbucket", "3");
                adStarted = true;
                updateAdPlayTime(i, j, f);
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public boolean reset(int i, int j, float f, VisitMetrics visitmetrics)
    {
        if (!isAdSessionActive)
        {
            adSessionTillNow = "";
        }
        if (visitmetrics != null)
        {
            synchronized (visitmetrics.visitLock)
            {
                visitmetrics.visitAdAbandonCount = visitmetrics.visitAdAbandonCount + adabandons;
                visitmetrics.visitAdPlayClockTime = visitmetrics.visitAdPlayClockTime + adplaytime;
                visitmetrics.visitAdStartCount = visitmetrics.visitAdStartCount + adstartcount;
            }
        }
        totaladabandoncount = totaladabandoncount + adabandons;
        totaladplayclocktime = totaladplayclocktime + adplaytime;
        totaladstartcount = totaladstartcount + adstartcount;
        adstartcount = 0;
        adcount = 0;
        adplaytime = 0;
        adabandons = 0;
        return true;
        visitmetrics;
        obj;
        JVM INSTR monitorexit ;
        throw visitmetrics;
    }

    public void updateTimesDueToBg(int i)
    {
        super.updateTimesDueToBg(i);
    }
}
