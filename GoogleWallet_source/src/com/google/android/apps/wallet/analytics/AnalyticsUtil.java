// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.analytics;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.gms.analytics.Tracker;
import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.wallet.analytics:
//            AnalyticsCustomDimension, ClientTimingReportingConfiguration, CsiManager

public class AnalyticsUtil
{

    private static final String TAG = com/google/android/apps/wallet/analytics/AnalyticsUtil.getSimpleName();
    private final CsiManager csi;
    private final AtomicReference previousScreen = new AtomicReference("");
    private final ClientTimingReportingConfiguration reportingConfig;
    private final AtomicBoolean shouldStartNewGaSession = new AtomicBoolean(false);
    private final HashMap timingsInProgress = new HashMap();
    private final Tracker tracker;

    AnalyticsUtil(Tracker tracker1, CsiManager csimanager, ClientTimingReportingConfiguration clienttimingreportingconfiguration)
    {
        tracker = tracker1;
        csi = csimanager;
        reportingConfig = clienttimingreportingconfiguration;
    }

    private void clearCustomDimensions()
    {
        for (int i = 1; i <= 200; i++)
        {
            tracker.set((new StringBuilder(14)).append("&cd").append(i).toString(), null);
        }

    }

    private void clearGaTiming(String s)
    {
        this;
        JVM INSTR monitorenter ;
        timingsInProgress.remove(s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    private void endGaTiming(String s)
    {
        this;
        JVM INSTR monitorenter ;
        Long long1 = (Long)timingsInProgress.get(s);
        if (long1 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        sendUxTiming(Long.valueOf(SystemClock.elapsedRealtime() - long1.longValue()), s);
        timingsInProgress.remove(s);
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    public static AnalyticsCustomDimension[] getCustomDimensions(com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsCustomDimension agoogleanalyticscustomdimension[])
    {
        ArrayList arraylist = new ArrayList();
        if (agoogleanalyticscustomdimension != null)
        {
            int j = agoogleanalyticscustomdimension.length;
            for (int i = 0; i < j; i++)
            {
                com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsCustomDimension googleanalyticscustomdimension = agoogleanalyticscustomdimension[i];
                arraylist.add(new AnalyticsCustomDimension(googleanalyticscustomdimension.id.intValue(), googleanalyticscustomdimension.value));
            }

        }
        agoogleanalyticscustomdimension = new AnalyticsCustomDimension[arraylist.size()];
        arraylist.toArray(agoogleanalyticscustomdimension);
        return agoogleanalyticscustomdimension;
    }

    private static List parseCustomDimensions(List list)
    {
        ArrayList arraylist = Lists.newArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s = (String)list.next();
            if (!Strings.isNullOrEmpty(s))
            {
                int i = s.indexOf(':');
                if (i <= 0)
                {
                    WLog.efmt(TAG, "Invalid custom dimension %s", new Object[] {
                        s
                    });
                } else
                {
                    Integer integer = Ints.tryParse(s.substring(0, i));
                    if (integer == null)
                    {
                        WLog.efmt(TAG, "Invalid custom dimension %s", new Object[] {
                            s
                        });
                    } else
                    {
                        String s1 = s.substring(i + 1);
                        if (Strings.isNullOrEmpty(s1))
                        {
                            WLog.efmt(TAG, "Invalid custom dimension %s", new Object[] {
                                s
                            });
                        } else
                        {
                            arraylist.add(new AnalyticsCustomDimension(integer.intValue(), s1));
                        }
                    }
                }
            }
        } while (true);
        return arraylist;
    }

    private void sendEventFromProto(com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsEvent googleanalyticsevent, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        if (googleanalyticsevent.customDimensions != null)
        {
            com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsCustomDimension agoogleanalyticscustomdimension[] = googleanalyticsevent.customDimensions;
            int j = agoogleanalyticscustomdimension.length;
            for (int i = 0; i < j; i++)
            {
                com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsCustomDimension googleanalyticscustomdimension = agoogleanalyticscustomdimension[i];
                arraylist.add(new AnalyticsCustomDimension(googleanalyticscustomdimension.id.intValue(), googleanalyticscustomdimension.value));
            }

        }
        Long long1;
        if (googleanalyticsevent.value == null)
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(googleanalyticsevent.value.intValue());
        }
        sendTrackerEvent(googleanalyticsevent.category, googleanalyticsevent.action, googleanalyticsevent.label, long1, flag, arraylist);
    }

    private void sendTrackerEvent(String s, String s1, String s2, Long long1, boolean flag, List list)
    {
        boolean flag1;
        if (s2 != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1, "We require the label, though GA doesn't");
        if (list.size() == 0)
        {
            WLog.dfmt(TAG, "Event category/action/label: %s, %s, %s", new Object[] {
                s, s1, s2
            });
        } else
        {
            WLog.dfmt(TAG, "Event category/action/label: %s, %s, %s with custom dimensions %s", new Object[] {
                s, s1, s2, list
            });
        }
        s = new com.google.android.gms.analytics.HitBuilders.EventBuilder(s, s1);
        s.setLabel(s2);
        if (long1 != null)
        {
            s.setValue(long1.longValue());
        }
        if (flag)
        {
            s.set("&ni", "1");
        }
        for (s1 = list.iterator(); s1.hasNext(); s.setCustomDimension(s2.getId(), s2.getValue()))
        {
            s2 = (AnalyticsCustomDimension)s1.next();
        }

        tracker.send(s.build());
    }

    private transient void sendTrackerEvent(String s, String s1, String s2, Long long1, boolean flag, AnalyticsCustomDimension aanalyticscustomdimension[])
    {
        sendTrackerEvent(s, s1, s2, long1, flag, ((List) (ImmutableList.copyOf(aanalyticscustomdimension))));
    }

    private void sendTrackerTiming(String s, Long long1, String s1)
    {
        WLog.dfmt(TAG, "Timing: %s took %d millis", new Object[] {
            s1, long1
        });
        if (reportingConfig.isTimingReportedEnabled())
        {
            tracker.send((new com.google.android.gms.analytics.HitBuilders.TimingBuilder(s, s1, long1.longValue())).build());
        }
    }

    private void sendUxTiming(Long long1, String s)
    {
        sendTrackerTiming("UX", long1, s);
    }

    private boolean setScreenName(String s)
    {
        if (!s.equals((String)previousScreen.getAndSet(s)))
        {
            tracker.setScreenName(s);
            return true;
        } else
        {
            return false;
        }
    }

    private void startGaTiming(String s)
    {
        this;
        JVM INSTR monitorenter ;
        timingsInProgress.put(s, Long.valueOf(SystemClock.elapsedRealtime()));
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public final void clearTiming(String s, String s1)
    {
        if (s != null)
        {
            clearGaTiming(s);
        }
        if (s1 != null)
        {
            csi.clear(s1);
        }
    }

    public final void endTiming(String s, String s1)
    {
        boolean flag;
        if (s != null || s1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "At least one of gaVariable or csiAction must be present");
        if (s != null)
        {
            endGaTiming(s);
        }
        if (s1 != null)
        {
            csi.endTiming(s1);
        }
    }

    public final transient void sendButtonTap(String s, AnalyticsCustomDimension aanalyticscustomdimension[])
    {
        sendTrackerEvent("UX", "buttonTap", s, null, false, aanalyticscustomdimension);
    }

    public final transient void sendChangeText(String s, AnalyticsCustomDimension aanalyticscustomdimension[])
    {
        sendTrackerEvent("UX", "changeText", s, null, false, aanalyticscustomdimension);
    }

    public final transient void sendDismissal(String s, AnalyticsCustomDimension aanalyticscustomdimension[])
    {
        sendTrackerEvent("UX", "dismiss", s, null, false, aanalyticscustomdimension);
    }

    public final transient void sendError(String s, AnalyticsCustomDimension aanalyticscustomdimension[])
    {
        sendTrackerEvent("UX", "error", s, null, false, aanalyticscustomdimension);
    }

    public final void sendEventFromProto(com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsEvent googleanalyticsevent)
    {
        sendEventFromProto(googleanalyticsevent, false);
    }

    public final void sendEventFromUri(String s)
    {
        s = Uri.parse(s);
        if (!s.isHierarchical())
        {
            WLog.wfmt(TAG, "Can't send event for non hierarchical uri: %s", new Object[] {
                s
            });
            return;
        }
        try
        {
            String s1 = s.getQueryParameter("gac");
            String s2 = s.getQueryParameter("gaa");
            String s3 = s.getQueryParameter("gal");
            if (!Strings.isNullOrEmpty(s1) && !Strings.isNullOrEmpty(s2) && !Strings.isNullOrEmpty(s3))
            {
                sendTrackerEvent(s1, s2, s3, null, false, parseCustomDimensions(s.getQueryParameters("gacd")));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.efmt(TAG, "Error sending event for tap uri", new Object[] {
                s
            });
        }
        return;
    }

    public final transient void sendImpression(String s, AnalyticsCustomDimension aanalyticscustomdimension[])
    {
        sendTrackerEvent("UX", "impression", s, null, true, aanalyticscustomdimension);
    }

    public final transient void sendKeyboardReturn(String s, AnalyticsCustomDimension aanalyticscustomdimension[])
    {
        sendTrackerEvent("UX", "keyboardReturn", s, null, false, aanalyticscustomdimension);
    }

    public final transient void sendKycState(String s, AnalyticsCustomDimension aanalyticscustomdimension[])
    {
        sendTrackerEvent("UX", "kycStateChange", s, null, false, aanalyticscustomdimension);
    }

    public final transient void sendLinkTap(String s, AnalyticsCustomDimension aanalyticscustomdimension[])
    {
        sendTrackerEvent("UX", "linkTap", s, null, false, aanalyticscustomdimension);
    }

    public final transient void sendListItemTap(String s, AnalyticsCustomDimension aanalyticscustomdimension[])
    {
        sendTrackerEvent("UX", "listItemTap", s, null, false, aanalyticscustomdimension);
    }

    public final transient void sendNavDrawerItemSelect(String s, AnalyticsCustomDimension aanalyticscustomdimension[])
    {
        sendTrackerEvent("UX", "navDrawerSelect", s, null, false, aanalyticscustomdimension);
    }

    public final transient void sendNfcEvent(String s, AnalyticsCustomDimension aanalyticscustomdimension[])
    {
        sendTrackerEvent("UX", "nfc", s, null, false, aanalyticscustomdimension);
    }

    public final void sendNonInteractionEventFromProto(com.google.wallet.proto.NanoWalletAnalytics.GoogleAnalyticsEvent googleanalyticsevent)
    {
        sendEventFromProto(googleanalyticsevent, true);
    }

    public final transient void sendOpenNotification(String s, AnalyticsCustomDimension aanalyticscustomdimension[])
    {
        setScreenName("Device Notifications");
        sendTrackerEvent("UX", "openNotification", s, null, false, aanalyticscustomdimension);
    }

    public final transient void sendScreen(String s, AnalyticsCustomDimension aanalyticscustomdimension[])
    {
        if (setScreenName(s))
        {
            int j;
            if (aanalyticscustomdimension.length == 0)
            {
                WLog.dfmt(TAG, "Screen: %s", new Object[] {
                    s
                });
            } else
            {
                WLog.dfmt(TAG, "Screen: %s with custom dimensions %s", new Object[] {
                    s, Arrays.toString(aanalyticscustomdimension)
                });
            }
            s = new com.google.android.gms.analytics.HitBuilders.ScreenViewBuilder();
            j = aanalyticscustomdimension.length;
            for (int i = 0; i < j; i++)
            {
                AnalyticsCustomDimension analyticscustomdimension = aanalyticscustomdimension[i];
                s.setCustomDimension(analyticscustomdimension.getId(), analyticscustomdimension.getValue());
            }

            if (shouldStartNewGaSession.compareAndSet(true, false))
            {
                s.setNewSession();
            }
            tracker.send(s.build());
        }
    }

    public final transient void sendSuccess(String s, AnalyticsCustomDimension aanalyticscustomdimension[])
    {
        sendTrackerEvent("UX", "success", s, null, false, aanalyticscustomdimension);
    }

    public final transient void sendSwipe(String s, AnalyticsCustomDimension aanalyticscustomdimension[])
    {
        sendTrackerEvent("UX", "swipe", s, null, false, aanalyticscustomdimension);
    }

    public final transient void sendToggleValue(boolean flag, String s, AnalyticsCustomDimension aanalyticscustomdimension[])
    {
        if (flag)
        {
            sendTrackerEvent("UX", "check", s, null, false, aanalyticscustomdimension);
            return;
        } else
        {
            sendTrackerEvent("UX", "uncheck", s, null, false, aanalyticscustomdimension);
            return;
        }
    }

    public final transient void sendUserError(String s, AnalyticsCustomDimension aanalyticscustomdimension[])
    {
        sendTrackerEvent("UX", "userError", s, null, false, aanalyticscustomdimension);
    }

    public final void setCustomDimensions(Iterable iterable)
    {
        clearCustomDimensions();
        AnalyticsCustomDimension analyticscustomdimension;
        Tracker tracker1;
        int i;
        for (iterable = iterable.iterator(); iterable.hasNext(); tracker1.set((new StringBuilder(14)).append("&cd").append(i).toString(), analyticscustomdimension.getValue()))
        {
            analyticscustomdimension = (AnalyticsCustomDimension)iterable.next();
            tracker1 = tracker;
            i = analyticscustomdimension.getId();
        }

    }

    public final void startNewGaSession()
    {
        previousScreen.set("");
        clearCustomDimensions();
        shouldStartNewGaSession.set(true);
    }

    public final void startTiming(String s, String s1)
    {
        boolean flag;
        if (s != null || s1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "At least one of gaVariable or csiAction must be present");
        if (s != null)
        {
            startGaTiming(s);
        }
        if (s1 != null)
        {
            csi.startTiming(s1);
        }
    }

}
