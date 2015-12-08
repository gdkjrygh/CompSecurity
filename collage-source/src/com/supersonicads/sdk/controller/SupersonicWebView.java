// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonicads.sdk.controller;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.supersonicads.sdk.a.b;
import com.supersonicads.sdk.b.a;
import com.supersonicads.sdk.b.c;
import com.supersonicads.sdk.b.d;
import com.supersonicads.sdk.b.e;
import com.supersonicads.sdk.b.f;
import com.supersonicads.sdk.b.g;
import com.supersonicads.sdk.data.AdUnitsState;
import com.supersonicads.sdk.precache.DownloadManager;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.supersonicads.sdk.controller:
//            a, InterstitialActivity, ControllerActivity, OpenUrlActivity

public class SupersonicWebView extends WebView
    implements DownloadListener, com.supersonicads.sdk.precache.DownloadManager.b
{
    public class c
    {

        volatile int a;
        final SupersonicWebView b;

        private void a(String s1, JSONArray jsonarray)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("sendResults: ").append(a).toString());
            if (a <= 0)
            {
                b(s1, jsonarray);
            }
        }

        private void b(String s1, JSONArray jsonarray)
        {
            if (!TextUtils.isEmpty(s1))
            {
                s1 = com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, jsonarray.toString(), "onGetUDIASuccess", "onGetUDIAFail");
                com.supersonicads.sdk.controller.SupersonicWebView.c(b, s1);
            }
        }

        protected void a(boolean flag, String s1)
        {
            boolean flag1 = true;
            this;
            JVM INSTR monitorenter ;
            if (SupersonicWebView.J(b) != null) goto _L2; else goto _L1
_L1:
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, Boolean.valueOf(flag));
_L4:
            if (!flag1)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            if (com.supersonicads.sdk.controller.SupersonicWebView.e(b, s1))
            {
                SupersonicWebView.v(b).onInterstitialAvailability(SupersonicWebView.J(b).booleanValue());
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onInterstitialAvailability", String.valueOf(flag));
            }
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_116;
            }
            if (!SupersonicWebView.J(b).booleanValue())
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, Boolean.valueOf(true));
                continue; /* Loop/switch isn't completed */
            }
            break MISSING_BLOCK_LABEL_116;
            s1;
            throw s1;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_148;
            }
            if (SupersonicWebView.J(b).booleanValue())
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, Boolean.valueOf(false));
                continue; /* Loop/switch isn't completed */
            }
            flag1 = false;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void adClicked(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("adClicked(").append(s1).append(")").toString());
            if (com.supersonicads.sdk.controller.SupersonicWebView.e(b, com.supersonicads.sdk.data.c.d.c.toString()))
            {
                Context context = SupersonicWebView.j(b);
        /* block-local class not found */
        class JSInterface._cls9 {}

                if (context instanceof Activity)
                {
                    ((Activity)context).runOnUiThread(new JSInterface._cls9());
                }
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onInterstitialAdClicked", s1);
            }
        }

        public void adCredited(String s1)
        {
            String s2;
            String s3;
            String s4;
            String s5;
            Object obj;
            String s6;
            int i1;
            int j1;
            boolean flag;
            s4 = null;
            flag = false;
            Log.d(SupersonicWebView.I(b), (new StringBuilder()).append("adCredited(").append(s1).append(")").toString());
            obj = new com.supersonicads.sdk.data.e(s1);
            s2 = ((com.supersonicads.sdk.data.e) (obj)).i("credits");
            if (s2 != null)
            {
                i1 = Integer.parseInt(s2);
            } else
            {
                i1 = 0;
            }
            s6 = ((com.supersonicads.sdk.data.e) (obj)).i("total");
            if (s6 != null)
            {
                j1 = Integer.parseInt(s6);
            } else
            {
                j1 = 0;
            }
            s5 = ((com.supersonicads.sdk.data.e) (obj)).i("productType");
            if (((com.supersonicads.sdk.data.e) (obj)).j("externalPoll"))
            {
                s2 = SupersonicWebView.B(b);
                s3 = SupersonicWebView.C(b);
            } else
            {
                s2 = SupersonicWebView.x(b);
                s3 = SupersonicWebView.y(b);
            }
            if (!s5.equalsIgnoreCase(com.supersonicads.sdk.data.c.d.b.toString()))
            {
                break MISSING_BLOCK_LABEL_349;
            }
            if (!((com.supersonicads.sdk.data.e) (obj)).g("signature") && !((com.supersonicads.sdk.data.e) (obj)).g("timestamp") && !((com.supersonicads.sdk.data.e) (obj)).g("totalCreditsFlag")) goto _L2; else goto _L1
_L1:
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "One of the keys are missing: signature/timestamp/totalCreditsFlag", null);
_L4:
            return;
_L2:
            boolean flag1;
        /* block-local class not found */
        class JSInterface._cls2 {}

            if (((com.supersonicads.sdk.data.e) (obj)).i("signature").equalsIgnoreCase(com.supersonicads.sdk.b.d.c((new StringBuilder()).append(s6).append(s2).append(s3).toString())))
            {
                flag = true;
            } else
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "Controller signature is not equal to SDK signature", null);
            }
            flag1 = ((com.supersonicads.sdk.data.e) (obj)).j("totalCreditsFlag");
            s4 = ((com.supersonicads.sdk.data.e) (obj)).i("timestamp");
_L6:
            if (!com.supersonicads.sdk.controller.SupersonicWebView.e(b, s5)) goto _L4; else goto _L3
_L3:
            obj = SupersonicWebView.j(b);
            if (!(obj instanceof Activity)) goto _L4; else goto _L5
_L5:
            ((Activity)obj).runOnUiThread(new JSInterface._cls2(s5, i1, flag, j1, flag1, s4, s2, s3, s1));
            return;
            flag = false;
            flag1 = false;
              goto _L6
        }

        public void adUnitsReady(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("adUnitsReady(").append(s1).append(")").toString());
            com.supersonicads.sdk.data.a a1 = new com.supersonicads.sdk.data.a(s1);
            if (!a1.b())
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "Num Of Ad Units Do Not Exist", null);
            } else
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
                s1 = a1.c();
                if (com.supersonicads.sdk.controller.SupersonicWebView.e(b, s1))
                {
                    Context context = SupersonicWebView.j(b);
                    if (context instanceof Activity)
                    {
        /* block-local class not found */
        class JSInterface._cls1 {}

                        ((Activity)context).runOnUiThread(new JSInterface._cls1(a1, s1));
                        return;
                    }
                }
            }
        }

        public void alert(String s1)
        {
        }

        public void createCalendarEvent(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("createCalendarEvent(").append(s1).append(")").toString());
            try
            {
                s1 = new JSONObject();
                JSONObject jsonobject = new JSONObject();
                jsonobject.put("frequency", "weekly");
                s1.put("id", "testevent723GDf84");
                s1.put("description", "Watch this crazy show on cannel 5!");
                s1.put("start", "2014-02-01T20:00:00-8:00");
                s1.put("end", "2014-06-30T20:00:00-8:00");
                s1.put("status", "pending");
                s1.put("recurrence", jsonobject.toString());
                s1.put("reminder", "2014-02-01T19:50:00-8:00");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
            }
        }

        public void deleteFile(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("deleteFile(").append(s1).append(")").toString());
            com.supersonicads.sdk.data.d d1 = new com.supersonicads.sdk.data.d(s1);
            if (!com.supersonicads.sdk.b.g.b(com.supersonicads.sdk.controller.SupersonicWebView.g(b), d1.b()))
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "File not exist", "1");
                return;
            } else
            {
                boolean flag = com.supersonicads.sdk.b.g.a(com.supersonicads.sdk.controller.SupersonicWebView.g(b), d1.b(), d1.a());
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, flag, null, null);
                return;
            }
        }

        public void deleteFolder(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("deleteFolder(").append(s1).append(")").toString());
            com.supersonicads.sdk.data.d d1 = new com.supersonicads.sdk.data.d(s1);
            if (!com.supersonicads.sdk.b.g.b(com.supersonicads.sdk.controller.SupersonicWebView.g(b), d1.b()))
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "Folder not exist", "1");
                return;
            } else
            {
                boolean flag = com.supersonicads.sdk.b.g.c(com.supersonicads.sdk.controller.SupersonicWebView.g(b), d1.b());
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, flag, null, null);
                return;
            }
        }

        public void displayWebView(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("displayWebView(").append(s1).append(")").toString());
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            s1 = new com.supersonicads.sdk.data.e(s1);
            boolean flag1 = ((Boolean)s1.h("display")).booleanValue();
            String s3 = s1.i("productType");
            boolean flag = false;
            if (flag1)
            {
                if (b.getState() != com.supersonicads.sdk.controller.e.a)
                {
                    b.setState(com.supersonicads.sdk.controller.e.a);
                    com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("State: ").append(SupersonicWebView.F(b)).toString());
                    Context context = SupersonicWebView.j(b);
                    String s2 = b.getOrientationState();
                    int i1 = com.supersonicads.sdk.b.d.a(context);
                    if (s3.equalsIgnoreCase(com.supersonicads.sdk.data.c.d.c.toString()))
                    {
                        s1 = new Intent(context, com/supersonicads/sdk/controller/InterstitialActivity);
                    } else
                    {
                        s1 = new Intent(context, com/supersonicads/sdk/controller/ControllerActivity);
                        if (com.supersonicads.sdk.data.c.d.a.toString().equalsIgnoreCase(s3))
                        {
                            s1.putExtra("productType", com.supersonicads.sdk.data.c.d.a.toString());
                            SupersonicWebView.D(b).a(com.supersonicads.sdk.data.c.d.a.ordinal());
                            flag = true;
                        } else
                        {
                            s1.putExtra("productType", com.supersonicads.sdk.data.c.d.b.toString());
                            SupersonicWebView.D(b).a(com.supersonicads.sdk.data.c.d.b.ordinal());
                        }
                    }
                    if (flag && com.supersonicads.sdk.controller.SupersonicWebView.e(b, com.supersonicads.sdk.data.c.d.a.toString()))
                    {
                        SupersonicWebView.r(b).onRVAdOpened();
                    }
                    s1.putExtra("orientation_set_flag", s2);
                    s1.putExtra("rotation_set_flag", i1);
                    context.startActivity(s1);
                    return;
                } else
                {
                    com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("State: ").append(SupersonicWebView.F(b)).toString());
                    return;
                }
            } else
            {
                b.setState(com.supersonicads.sdk.controller.e.b);
                SupersonicWebView.G(b);
                return;
            }
        }

        public void getApplicationInfo(String s1)
        {
            String s2;
            String s3;
            String s4;
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("getApplicationInfo(").append(s1).append(")").toString());
            s2 = com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1);
            s3 = com.supersonicads.sdk.controller.SupersonicWebView.b(b, s1);
            s1 = (new com.supersonicads.sdk.data.e(s1)).i("productType");
            Object aobj[] = new Object[2];
            s1 = ((String) (com.supersonicads.sdk.controller.SupersonicWebView.d(b, s1)));
            s4 = (String)s1[0];
            if (!((Boolean)s1[1]).booleanValue()) goto _L2; else goto _L1
_L1:
            if (TextUtils.isEmpty(s3)) goto _L4; else goto _L3
_L3:
            s1 = s3;
_L6:
            if (!TextUtils.isEmpty(s1))
            {
                s1 = com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, s4, "onGetApplicationInfoSuccess", "onGetApplicationInfoFail");
                com.supersonicads.sdk.controller.SupersonicWebView.c(b, s1);
            }
            return;
_L2:
            if (!TextUtils.isEmpty(s2))
            {
                s1 = s2;
                continue; /* Loop/switch isn't completed */
            }
_L4:
            s1 = null;
            if (true) goto _L6; else goto _L5
_L5:
        }

        public void getCachedFilesMap(String s1)
        {
            String s2;
            Object obj;
label0:
            {
                com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("getCachedFilesMap(").append(s1).append(")").toString());
                s2 = com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1);
                if (!TextUtils.isEmpty(s2))
                {
                    obj = new com.supersonicads.sdk.data.e(s1);
                    if (((com.supersonicads.sdk.data.e) (obj)).f("path"))
                    {
                        break label0;
                    }
                    com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "path key does not exist", null);
                }
                return;
            }
            obj = (String)((com.supersonicads.sdk.data.e) (obj)).h("path");
            if (!com.supersonicads.sdk.b.g.b(com.supersonicads.sdk.controller.SupersonicWebView.g(b), ((String) (obj))))
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "path file does not exist on disk", null);
                return;
            } else
            {
                s1 = com.supersonicads.sdk.b.g.d(com.supersonicads.sdk.controller.SupersonicWebView.g(b), ((String) (obj)));
                s1 = com.supersonicads.sdk.controller.SupersonicWebView.a(b, s2, s1, "onGetCachedFilesMapSuccess", "onGetCachedFilesMapFail");
                com.supersonicads.sdk.controller.SupersonicWebView.c(b, s1);
                return;
            }
        }

        public void getDeviceStatus(String s1)
        {
            String s2;
            String s3;
            String s4;
            boolean flag;
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("getDeviceStatus(").append(s1).append(")").toString());
            s2 = com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1);
            s3 = com.supersonicads.sdk.controller.SupersonicWebView.b(b, s1);
            s1 = ((String) (new Object[2]));
            s1 = ((String) (com.supersonicads.sdk.controller.SupersonicWebView.a(b, SupersonicWebView.j(b))));
            s4 = (String)s1[0];
            flag = ((Boolean)s1[1]).booleanValue();
            s1 = null;
            if (!flag) goto _L2; else goto _L1
_L1:
            if (!TextUtils.isEmpty(s3))
            {
                s1 = s3;
            }
_L4:
            if (!TextUtils.isEmpty(s1))
            {
                s1 = com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, s4, "onGetDeviceStatusSuccess", "onGetDeviceStatusFail");
                com.supersonicads.sdk.controller.SupersonicWebView.c(b, s1);
            }
            return;
_L2:
            if (!TextUtils.isEmpty(s2))
            {
                s1 = s2;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void getOrientation(String s1)
        {
            s1 = com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1);
            String s2 = com.supersonicads.sdk.b.d.c(SupersonicWebView.j(b)).toString();
            if (!TextUtils.isEmpty(s1))
            {
                s1 = com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, s2, "onGetOrientationSuccess", "onGetOrientationFail");
                com.supersonicads.sdk.controller.SupersonicWebView.c(b, s1);
            }
        }

        public void getUDIA(String s1)
        {
            a = 0;
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("getUDIA(").append(s1).append(")").toString());
            String s2 = com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1);
            com.supersonicads.sdk.data.e e1 = new com.supersonicads.sdk.data.e(s1);
            if (!e1.f("getByFlag"))
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "getByFlag key does not exist", null);
            } else
            {
                int i1 = Integer.parseInt(e1.i("getByFlag"));
                if (i1 != 0)
                {
                    String s3 = Integer.toBinaryString(i1);
                    if (TextUtils.isEmpty(s3))
                    {
                        com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "fialed to convert getByFlag", null);
                        return;
                    }
                    char ac1[] = (new StringBuilder(s3)).reverse().toString().toCharArray();
                    s1 = new JSONArray();
                    if (ac1[3] == '0')
                    {
                        JSONObject jsonobject = new JSONObject();
                        Location location;
                        try
                        {
                            jsonobject.put("sessions", com.supersonicads.sdk.b.f.a().e());
                            com.supersonicads.sdk.b.f.a().f();
                            s1.put(jsonobject);
                        }
                        catch (JSONException jsonexception) { }
                    }
                    if (ac1[2] == '1')
                    {
                        a = a + 1;
                        location = com.supersonicads.sdk.b.b.a(SupersonicWebView.j(b));
                        if (location != null)
                        {
                            jsonobject = new JSONObject();
                            try
                            {
                                jsonobject.put("latitude", location.getLatitude());
                                jsonobject.put("longitude", location.getLongitude());
                                s1.put(jsonobject);
                                a = a - 1;
                                a(s2, s1);
                                com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), "done location");
                                return;
                            }
                            // Misplaced declaration of an exception variable
                            catch (String s1)
                            {
                                return;
                            }
                        } else
                        {
                            a = a - 1;
                            return;
                        }
                    }
                }
            }
        }

        public void getUserData(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("getUserData(").append(s1).append(")").toString());
            Object obj = new com.supersonicads.sdk.data.e(s1);
            if (!((com.supersonicads.sdk.data.e) (obj)).f("key"))
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "key does not exist", null);
                return;
            } else
            {
                s1 = com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1);
                obj = ((com.supersonicads.sdk.data.e) (obj)).i("key");
                String s2 = com.supersonicads.sdk.b.f.a().c(((String) (obj)));
                obj = com.supersonicads.sdk.controller.SupersonicWebView.a(b, ((String) (obj)), s2, null, null, null, null, null, null, null, false);
                s1 = com.supersonicads.sdk.controller.SupersonicWebView.b(b, s1, ((String) (obj)));
                com.supersonicads.sdk.controller.SupersonicWebView.c(b, s1);
                return;
            }
        }

        public void getUserUniqueId(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("getUserUniqueId(").append(s1).append(")").toString());
            Object obj = new com.supersonicads.sdk.data.e(s1);
            if (!((com.supersonicads.sdk.data.e) (obj)).f("productType"))
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "productType does not exist", null);
            } else
            {
                s1 = com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1);
                if (!TextUtils.isEmpty(s1))
                {
                    obj = ((com.supersonicads.sdk.data.e) (obj)).i("productType");
                    String s2 = com.supersonicads.sdk.b.f.a().d(((String) (obj)));
                    obj = com.supersonicads.sdk.controller.SupersonicWebView.a(b, "userUniqueId", s2, "productType", ((String) (obj)), null, null, null, null, null, false);
                    s1 = com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, ((String) (obj)), "onGetUserUniqueIdSuccess", "onGetUserUniqueIdFail");
                    com.supersonicads.sdk.controller.SupersonicWebView.c(b, s1);
                    return;
                }
            }
        }

        public void initController(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("initController(").append(s1).append(")").toString());
            s1 = new com.supersonicads.sdk.data.e(s1);
            if (s1.f("stage"))
            {
                s1 = s1.i("stage");
                if ("ready".equalsIgnoreCase(s1))
                {
                    com.supersonicads.sdk.controller.SupersonicWebView.a(b, com.supersonicads.sdk.data.c.b.e);
                    SupersonicWebView.l(b).cancel();
                    SupersonicWebView.m(b).cancel();
                    if (SupersonicWebView.n(b))
                    {
                        b.a(SupersonicWebView.o(b), SupersonicWebView.p(b), SupersonicWebView.q(b), SupersonicWebView.r(b));
                    }
                    if (SupersonicWebView.s(b))
                    {
                        b.a(SupersonicWebView.t(b), SupersonicWebView.u(b), SupersonicWebView.q(b), SupersonicWebView.v(b));
                    }
                    if (SupersonicWebView.w(b))
                    {
                        b.a(SupersonicWebView.x(b), SupersonicWebView.y(b), SupersonicWebView.q(b), SupersonicWebView.z(b));
                    }
                    if (SupersonicWebView.A(b))
                    {
                        b.a(SupersonicWebView.B(b), SupersonicWebView.C(b), SupersonicWebView.z(b));
                    }
                    b.a(SupersonicWebView.D(b));
                } else
                {
                    if ("loaded".equalsIgnoreCase(s1))
                    {
                        com.supersonicads.sdk.controller.SupersonicWebView.a(b, com.supersonicads.sdk.data.c.b.d);
                        return;
                    }
                    if ("failed".equalsIgnoreCase(s1))
                    {
                        com.supersonicads.sdk.controller.SupersonicWebView.a(b, com.supersonicads.sdk.data.c.b.f);
                        if (SupersonicWebView.n(b))
                        {
                            com.supersonicads.sdk.controller.SupersonicWebView.a(b, com.supersonicads.sdk.data.c.d.a);
                        }
                        if (SupersonicWebView.s(b))
                        {
                            com.supersonicads.sdk.controller.SupersonicWebView.a(b, com.supersonicads.sdk.data.c.d.c);
                        }
                        if (SupersonicWebView.w(b))
                        {
                            com.supersonicads.sdk.controller.SupersonicWebView.a(b, com.supersonicads.sdk.data.c.d.b);
                        }
                        if (SupersonicWebView.A(b))
                        {
                            com.supersonicads.sdk.controller.SupersonicWebView.a(b, com.supersonicads.sdk.data.c.d.d);
                            return;
                        }
                    } else
                    {
                        com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), "No STAGE mentioned! Should not get here!");
                        return;
                    }
                }
            }
        }

        public void interstitialAvailability(String s1)
        {
            Log.d(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("interstitialAvailability(").append(s1).append(")").toString());
            a(Boolean.parseBoolean((new com.supersonicads.sdk.data.e(s1)).i("available")), com.supersonicads.sdk.data.c.d.c.toString());
        }

        public void onAdWindowsClosed(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onAdWindowsClosed(").append(s1).append(")").toString());
            SupersonicWebView.D(b).l();
            s1 = (new com.supersonicads.sdk.data.e(s1)).i("productType");
            if (!s1.equalsIgnoreCase(com.supersonicads.sdk.data.c.d.a.toString())) goto _L2; else goto _L1
_L1:
            Log.d(SupersonicWebView.I(b), "onRVAdClosed()");
_L4:
            if (com.supersonicads.sdk.controller.SupersonicWebView.e(b, s1) && s1 != null)
            {
                Context context = SupersonicWebView.j(b);
        /* block-local class not found */
        class JSInterface._cls15 {}

                if (context instanceof Activity)
                {
                    ((Activity)context).runOnUiThread(new JSInterface._cls15(s1));
                }
            }
            return;
_L2:
            if (s1.equalsIgnoreCase(com.supersonicads.sdk.data.c.d.c.toString()))
            {
                Log.d(SupersonicWebView.I(b), "onISAdClosed()");
            } else
            if (s1.equalsIgnoreCase(com.supersonicads.sdk.data.c.d.b.toString()))
            {
                Log.d(SupersonicWebView.I(b), "onOWAdClosed()");
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void onGenericFunctionFail(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onGenericFunctionFail(").append(s1).append(")").toString());
            if (SupersonicWebView.K(b) == null)
            {
                com.supersonicads.sdk.b.c.c(com.supersonicads.sdk.controller.SupersonicWebView.a(b), "genericFunctionListener was not found");
                return;
            }
            String s2 = (new com.supersonicads.sdk.data.e(s1)).i("errMsg");
            Context context = SupersonicWebView.j(b);
        /* block-local class not found */
        class JSInterface._cls13 {}

            if (context instanceof Activity)
            {
                ((Activity)context).runOnUiThread(new JSInterface._cls13(s2));
            }
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onGenericFunctionFail", s1);
        }

        public void onGenericFunctionSuccess(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onGenericFunctionSuccess(").append(s1).append(")").toString());
            if (SupersonicWebView.K(b) == null)
            {
                com.supersonicads.sdk.b.c.c(com.supersonicads.sdk.controller.SupersonicWebView.a(b), "genericFunctionListener was not found");
                return;
            }
            Context context = SupersonicWebView.j(b);
        /* block-local class not found */
        class JSInterface._cls12 {}

            if (context instanceof Activity)
            {
                ((Activity)context).runOnUiThread(new JSInterface._cls12());
            }
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
        }

        public void onGetApplicationInfoFail(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onGetApplicationInfoFail(").append(s1).append(")").toString());
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onGetApplicationInfoFail", s1);
        }

        public void onGetApplicationInfoSuccess(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onGetApplicationInfoSuccess(").append(s1).append(")").toString());
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onGetApplicationInfoSuccess", s1);
        }

        public void onGetCachedFilesMapFail(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onGetCachedFilesMapFail(").append(s1).append(")").toString());
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onGetCachedFilesMapFail", s1);
        }

        public void onGetCachedFilesMapSuccess(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onGetCachedFilesMapSuccess(").append(s1).append(")").toString());
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onGetCachedFilesMapSuccess", s1);
        }

        public void onGetDeviceStatusFail(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onGetDeviceStatusFail(").append(s1).append(")").toString());
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onGetDeviceStatusFail", s1);
        }

        public void onGetDeviceStatusSuccess(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onGetDeviceStatusSuccess(").append(s1).append(")").toString());
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onGetDeviceStatusSuccess", s1);
        }

        public void onGetUDIAFail(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onGetUDIAFail(").append(s1).append(")").toString());
        }

        public void onGetUDIASuccess(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onGetUDIASuccess(").append(s1).append(")").toString());
        }

        public void onGetUserCreditsFail(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onGetUserCreditsFail(").append(s1).append(")").toString());
            String s2 = (new com.supersonicads.sdk.data.e(s1)).i("errMsg");
            if (com.supersonicads.sdk.controller.SupersonicWebView.e(b, com.supersonicads.sdk.data.c.d.b.toString()))
            {
                Context context = SupersonicWebView.j(b);
        /* block-local class not found */
        class JSInterface._cls14 {}

                if (context instanceof Activity)
                {
                    ((Activity)context).runOnUiThread(new JSInterface._cls14(s2));
                }
            }
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onGetUserCreditsFail", s1);
        }

        public void onGetUserUniqueIdFail(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onGetUserUniqueIdFail(").append(s1).append(")").toString());
        }

        public void onGetUserUniqueIdSuccess(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onGetUserUniqueIdSuccess(").append(s1).append(")").toString());
        }

        public void onInitBrandConnectFail(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onInitBrandConnectFail(").append(s1).append(")").toString());
            String s2 = (new com.supersonicads.sdk.data.e(s1)).i("errMsg");
            SupersonicWebView.D(b).a(false);
            if (com.supersonicads.sdk.controller.SupersonicWebView.e(b, com.supersonicads.sdk.data.c.d.a.toString()))
            {
                Context context = SupersonicWebView.j(b);
        /* block-local class not found */
        class JSInterface._cls3 {}

                if (context instanceof Activity)
                {
                    ((Activity)context).runOnUiThread(new JSInterface._cls3(s2));
                }
            }
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onInitBrandConnectFail", s1);
        }

        public void onInitBrandConnectSuccess(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onInitBrandConnectSuccess(").append(s1).append(")").toString());
            com.supersonicads.sdk.data.b b1 = new com.supersonicads.sdk.data.b(s1);
            com.supersonicads.sdk.b.f.a().a(b1);
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onInitBrandConnectSuccess", s1);
        }

        public void onInitInterstitialFail(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onInitInterstitialFail(").append(s1).append(")").toString());
            SupersonicWebView.D(b).b(false);
            String s2 = (new com.supersonicads.sdk.data.e(s1)).i("errMsg");
            if (SupersonicWebView.D(b).i())
            {
                SupersonicWebView.D(b).c(false);
                if (com.supersonicads.sdk.controller.SupersonicWebView.e(b, com.supersonicads.sdk.data.c.d.c.toString()))
                {
                    Context context = SupersonicWebView.j(b);
        /* block-local class not found */
        class JSInterface._cls8 {}

                    if (context instanceof Activity)
                    {
                        ((Activity)context).runOnUiThread(new JSInterface._cls8(s2));
                    }
                }
            }
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onInitInterstitialFail", s1);
        }

        public void onInitInterstitialSuccess(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), "onInitInterstitialSuccess()");
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onInitInterstitialSuccess", "true");
            SupersonicWebView.D(b).b(true);
            if (SupersonicWebView.D(b).i())
            {
                SupersonicWebView.D(b).c(false);
                if (com.supersonicads.sdk.controller.SupersonicWebView.e(b, com.supersonicads.sdk.data.c.d.c.toString()))
                {
                    s1 = SupersonicWebView.j(b);
        /* block-local class not found */
        class JSInterface._cls7 {}

                    if (s1 instanceof Activity)
                    {
                        ((Activity)s1).runOnUiThread(new JSInterface._cls7());
                    }
                }
            }
        }

        public void onOfferWallGeneric(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onOfferWallGeneric(").append(s1).append(")").toString());
            if (com.supersonicads.sdk.controller.SupersonicWebView.e(b, com.supersonicads.sdk.data.c.d.b.toString()))
            {
                SupersonicWebView.z(b).onOWGeneric("", "");
            }
        }

        public void onRewardedVideoGeneric(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onRewardedVideoGeneric(").append(s1).append(")").toString());
            if (com.supersonicads.sdk.controller.SupersonicWebView.e(b, com.supersonicads.sdk.data.c.d.a.toString()))
            {
                SupersonicWebView.r(b).onRVGeneric("", "");
            }
        }

        public void onShowBrandConnectFail(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onShowBrandConnectFail(").append(s1).append(")").toString());
            String s2 = (new com.supersonicads.sdk.data.e(s1)).i("errMsg");
            if (com.supersonicads.sdk.controller.SupersonicWebView.e(b, com.supersonicads.sdk.data.c.d.a.toString()))
            {
                Context context = SupersonicWebView.j(b);
        /* block-local class not found */
        class JSInterface._cls4 {}

                if (context instanceof Activity)
                {
                    ((Activity)context).runOnUiThread(new JSInterface._cls4(s2));
                }
            }
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onShowBrandConnectFail", s1);
        }

        public void onShowBrandConnectSuccess(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onShowBrandConnectSuccess(").append(s1).append(")").toString());
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onShowBrandConnectSuccess", s1);
        }

        public void onShowInterstitialFail(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onShowInterstitialFail(").append(s1).append(")").toString());
            String s2 = (new com.supersonicads.sdk.data.e(s1)).i("errMsg");
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            if (com.supersonicads.sdk.controller.SupersonicWebView.e(b, com.supersonicads.sdk.data.c.d.c.toString()))
            {
                Context context = SupersonicWebView.j(b);
        /* block-local class not found */
        class JSInterface._cls11 {}

                if (context instanceof Activity)
                {
                    ((Activity)context).runOnUiThread(new JSInterface._cls11(s2));
                }
            }
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onShowInterstitialFail", s1);
        }

        public void onShowInterstitialSuccess(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onShowInterstitialSuccess(").append(s1).append(")").toString());
            SupersonicWebView.D(b).a(com.supersonicads.sdk.data.c.d.c.ordinal());
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            if (com.supersonicads.sdk.controller.SupersonicWebView.e(b, com.supersonicads.sdk.data.c.d.c.toString()))
            {
                Context context = SupersonicWebView.j(b);
        /* block-local class not found */
        class JSInterface._cls10 {}

                if (context instanceof Activity)
                {
                    ((Activity)context).runOnUiThread(new JSInterface._cls10());
                }
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onShowInterstitialSuccess", s1);
            }
        }

        public void onShowOfferWallFail(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onShowOfferWallFail(").append(s1).append(")").toString());
            String s2 = (new com.supersonicads.sdk.data.e(s1)).i("errMsg");
            if (com.supersonicads.sdk.controller.SupersonicWebView.e(b, com.supersonicads.sdk.data.c.d.b.toString()))
            {
                Context context = SupersonicWebView.j(b);
        /* block-local class not found */
        class JSInterface._cls6 {}

                if (context instanceof Activity)
                {
                    ((Activity)context).runOnUiThread(new JSInterface._cls6(s2));
                }
            }
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onShowOfferWallFail", s1);
        }

        public void onShowOfferWallSuccess(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onShowOfferWallSuccess(").append(s1).append(")").toString());
            SupersonicWebView.D(b).a(com.supersonicads.sdk.data.c.d.b.ordinal());
            if (com.supersonicads.sdk.controller.SupersonicWebView.e(b, com.supersonicads.sdk.data.c.d.b.toString()))
            {
                Context context = SupersonicWebView.j(b);
        /* block-local class not found */
        class JSInterface._cls5 {}

                if (context instanceof Activity)
                {
                    ((Activity)context).runOnUiThread(new JSInterface._cls5());
                }
            }
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, "onShowOfferWallSuccess", s1);
        }

        public void onUDIAFail(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onUDIAFail(").append(s1).append(")").toString());
        }

        public void onUDIASuccess(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onUDIASuccess(").append(s1).append(")").toString());
        }

        public void onVideoStatusChanged(String s1)
        {
label0:
            {
                Log.d(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onVideoStatusChanged(").append(s1).append(")").toString());
                s1 = new com.supersonicads.sdk.data.e(s1);
                String s2 = s1.i("productType");
                if (SupersonicWebView.L(b) != null && !TextUtils.isEmpty(s2) && com.supersonicads.sdk.data.c.d.a.toString().equalsIgnoreCase(s2))
                {
                    s1 = s1.i("status");
                    if (!"started".equalsIgnoreCase(s1))
                    {
                        break label0;
                    }
                    SupersonicWebView.L(b).b();
                }
                return;
            }
            if ("paused".equalsIgnoreCase(s1))
            {
                SupersonicWebView.L(b).c();
                return;
            }
            if ("playing".equalsIgnoreCase(s1))
            {
                SupersonicWebView.L(b).d();
                return;
            }
            if ("ended".equalsIgnoreCase(s1))
            {
                SupersonicWebView.L(b).e();
                return;
            }
            if ("stopped".equalsIgnoreCase(s1))
            {
                SupersonicWebView.L(b).f();
                return;
            } else
            {
                com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("onVideoStatusChanged: unknown status: ").append(s1).toString());
                return;
            }
        }

        public void openUrl(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("openUrl(").append(s1).append(")").toString());
            Object obj = new com.supersonicads.sdk.data.e(s1);
            s1 = ((com.supersonicads.sdk.data.e) (obj)).i("url");
            Object obj1 = ((com.supersonicads.sdk.data.e) (obj)).i("method");
            obj = SupersonicWebView.j(b);
            if (((String) (obj1)).equalsIgnoreCase("external_browser"))
            {
                ((Context) (obj)).startActivity((new Intent("android.intent.action.VIEW")).setData(Uri.parse(s1)));
            } else
            {
                if (((String) (obj1)).equalsIgnoreCase("webview"))
                {
                    obj1 = new Intent(((Context) (obj)), com/supersonicads/sdk/controller/OpenUrlActivity);
                    ((Intent) (obj1)).putExtra(com.supersonicads.sdk.controller.SupersonicWebView.f, s1);
                    ((Intent) (obj1)).putExtra(com.supersonicads.sdk.controller.SupersonicWebView.g, true);
                    ((Context) (obj)).startActivity(((Intent) (obj1)));
                    return;
                }
                if (((String) (obj1)).equalsIgnoreCase("store"))
                {
                    Intent intent = new Intent(((Context) (obj)), com/supersonicads/sdk/controller/OpenUrlActivity);
                    intent.putExtra(com.supersonicads.sdk.controller.SupersonicWebView.f, s1);
                    intent.putExtra(com.supersonicads.sdk.controller.SupersonicWebView.c, true);
                    intent.putExtra(com.supersonicads.sdk.controller.SupersonicWebView.g, true);
                    ((Context) (obj)).startActivity(intent);
                    return;
                }
            }
        }

        public void removeCloseEventHandler(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("removeCloseEventHandler(").append(s1).append(")").toString());
            if (com.supersonicads.sdk.controller.SupersonicWebView.e(b) != null)
            {
                com.supersonicads.sdk.controller.SupersonicWebView.e(b).cancel();
            }
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, true);
        }

        public void saveFile(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("saveFile(").append(s1).append(")").toString());
            com.supersonicads.sdk.data.d d1 = new com.supersonicads.sdk.data.d(s1);
            if (com.supersonicads.sdk.b.d.a(SupersonicWebView.j(b), com.supersonicads.sdk.controller.SupersonicWebView.g(b)) <= 0L)
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "no_disk_space", null);
                return;
            }
            if (!com.supersonicads.sdk.b.g.a())
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "sotrage_unavailable", null);
                return;
            }
            if (com.supersonicads.sdk.b.g.a(com.supersonicads.sdk.controller.SupersonicWebView.g(b), d1))
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "file_already_exist", null);
                return;
            }
            if (!com.supersonicads.sdk.b.d.f(SupersonicWebView.j(b)))
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "no_network_connection", null);
                return;
            }
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
            s1 = d1.d();
            if (s1 != null)
            {
                String s3 = String.valueOf(s1);
                if (!TextUtils.isEmpty(s3))
                {
                    String s2 = d1.b();
                    s1 = s2;
                    if (s2.contains("/"))
                    {
                        s1 = d1.b().split("/");
                        s1 = s1[s1.length - 1];
                    }
                    com.supersonicads.sdk.b.f.a().c(s1, s3);
                }
            }
            SupersonicWebView.E(b).a(d1);
        }

        public void setBackButtonState(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("setBackButtonState(").append(s1).append(")").toString());
            s1 = (new com.supersonicads.sdk.data.e(s1)).i("state");
            com.supersonicads.sdk.b.f.a().a(s1);
        }

        public void setForceClose(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("setForceClose(").append(s1).append(")").toString());
            s1 = new com.supersonicads.sdk.data.e(s1);
            String s2 = s1.i("width");
            String s3 = s1.i("height");
            com.supersonicads.sdk.controller.SupersonicWebView.a(b, Integer.parseInt(s2));
            com.supersonicads.sdk.controller.SupersonicWebView.b(b, Integer.parseInt(s3));
            com.supersonicads.sdk.controller.SupersonicWebView.f(b, s1.i("position"));
        }

        public void setOrientation(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("setOrientation(").append(s1).append(")").toString());
            s1 = (new com.supersonicads.sdk.data.e(s1)).i("orientation");
            b.setOrientationState(s1);
            int i1 = com.supersonicads.sdk.b.d.a(SupersonicWebView.j(b));
            if (SupersonicWebView.H(b) != null)
            {
                SupersonicWebView.H(b).a(s1, i1);
            }
        }

        public void setStoreSearchKeys(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("setStoreSearchKeys(").append(s1).append(")").toString());
            com.supersonicads.sdk.b.f.a().b(s1);
        }

        public void setUserData(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("setUserData(").append(s1).append(")").toString());
            Object obj = new com.supersonicads.sdk.data.e(s1);
            if (!((com.supersonicads.sdk.data.e) (obj)).f("key"))
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "key does not exist", null);
                return;
            }
            if (!((com.supersonicads.sdk.data.e) (obj)).f("value"))
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "value does not exist", null);
                return;
            }
            String s2 = ((com.supersonicads.sdk.data.e) (obj)).i("key");
            obj = ((com.supersonicads.sdk.data.e) (obj)).i("value");
            if (com.supersonicads.sdk.b.f.a().a(s2, ((String) (obj))))
            {
                s1 = com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1);
                s2 = com.supersonicads.sdk.controller.SupersonicWebView.a(b, s2, ((String) (obj)), null, null, null, null, null, null, null, false);
                s1 = com.supersonicads.sdk.controller.SupersonicWebView.b(b, s1, s2);
                com.supersonicads.sdk.controller.SupersonicWebView.c(b, s1);
                return;
            } else
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "SetUserData failed writing to shared preferences", null);
                return;
            }
        }

        public void setUserUniqueId(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("setUserUniqueId(").append(s1).append(")").toString());
            Object obj = new com.supersonicads.sdk.data.e(s1);
            if (!((com.supersonicads.sdk.data.e) (obj)).f("userUniqueId") || !((com.supersonicads.sdk.data.e) (obj)).f("productType"))
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "uniqueId or productType does not exist", null);
                return;
            }
            String s2 = ((com.supersonicads.sdk.data.e) (obj)).i("userUniqueId");
            obj = ((com.supersonicads.sdk.data.e) (obj)).i("productType");
            if (com.supersonicads.sdk.b.f.a().b(s2, ((String) (obj))))
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, true, null, null);
                return;
            } else
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "setUserUniqueId failed", null);
                return;
            }
        }

        public void setWebviewBackgroundColor(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("setWebviewBackgroundColor(").append(s1).append(")").toString());
            com.supersonicads.sdk.controller.SupersonicWebView.g(b, s1);
        }

        public void toggleUDIA(String s1)
        {
            com.supersonicads.sdk.b.c.a(com.supersonicads.sdk.controller.SupersonicWebView.a(b), (new StringBuilder()).append("toggleUDIA(").append(s1).append(")").toString());
            com.supersonicads.sdk.data.e e1 = new com.supersonicads.sdk.data.e(s1);
            if (!e1.f("toggle"))
            {
                com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "toggle key does not exist", null);
            } else
            {
                int i1 = Integer.parseInt(e1.i("toggle"));
                if (i1 != 0)
                {
                    String s2 = Integer.toBinaryString(i1);
                    if (TextUtils.isEmpty(s2))
                    {
                        com.supersonicads.sdk.controller.SupersonicWebView.a(b, s1, false, "fialed to convert toggle", null);
                        return;
                    }
                    if (s2.toCharArray()[3] == '0')
                    {
                        com.supersonicads.sdk.b.f.a().a(true);
                        return;
                    } else
                    {
                        com.supersonicads.sdk.b.f.a().a(false);
                        return;
                    }
                }
            }
        }

        public c(Context context)
        {
            b = SupersonicWebView.this;
            super();
            a = 0;
        }
    }

    public static interface d
    {

        public abstract void a();

        public abstract void a(String s1, int i1);
    }

    public static final class e extends Enum
    {

        public static final e a;
        public static final e b;
        private static final e c[];

        public static e valueOf(String s1)
        {
            return (e)Enum.valueOf(com/supersonicads/sdk/controller/SupersonicWebView$e, s1);
        }

        public static e[] values()
        {
            return (e[])c.clone();
        }

        static 
        {
            a = new e("Display", 0);
            b = new e("Gone", 1);
            c = (new e[] {
                a, b
            });
        }

        private e(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    public static String a = "http://s.ssacdn.com/";
    private static String ah = "success";
    private static String ai = "fail";
    public static int b = 0;
    public static String c = "is_store";
    public static String d = "is_store_close";
    public static String e = "webview_type";
    public static String f = "external_url";
    public static String g = "secondary_web_view";
    public static int h = 0;
    public static int i = 1;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private Uri E;
    private String F;
    private String G;
    private CountDownTimer H;
    private CountDownTimer I;
    private CountDownTimer J;
    private int K;
    private int L;
    private String M;
    private a N;
    private View O;
    private FrameLayout P;
    private android.webkit.WebChromeClient.CustomViewCallback Q;
    private FrameLayout R;
    private e S;
    private String T;
    private com.supersonicads.sdk.a.d U;
    private com.supersonicads.sdk.a.a V;
    private b W;
    private com.supersonicads.sdk.a.c aa;
    private com.supersonicads.sdk.data.c.b ab;
    private Boolean ac;
    private String ad;
    private com.supersonicads.sdk.controller.a ae;
    private AdUnitsState af;
    private Object ag;
    private BroadcastReceiver aj;
    private d ak;
    private String j;
    private String k;
    private final String l = "We're sorry, some error occurred. we will investigate it";
    private String m;
    private String n;
    private Map o;
    private String p;
    private String q;
    private Boolean r;
    private String s;
    private String t;
    private Map u;
    private String v;
    private String w;
    private DownloadManager x;
    private boolean y;
    private boolean z;

    public SupersonicWebView(Context context)
    {
        super(context);
        j = com/supersonicads/sdk/controller/SupersonicWebView.getSimpleName();
        k = "Supersonic";
        r = null;
        G = "interrupt";
        K = 50;
        L = 50;
        M = "top-right";
        ab = com.supersonicads.sdk.data.c.b.a;
        ac = null;
        ag = new Object();
        aj = new _cls6();
        af = new AdUnitsState();
        com.supersonicads.sdk.b.c.a(j, "C'tor");
        c(context);
        ad = com.supersonicads.sdk.b.g.a(context);
        x = DownloadManager.a(ad);
        x.a(this);
    /* block-local class not found */
    class a {}

        N = new a(null);
    /* block-local class not found */
    class g {}

        setWebViewClient(new g(null));
        setWebChromeClient(N);
        n();
        addJavascriptInterface(new c(context), "Android");
        setDownloadListener(this);
    /* block-local class not found */
    class f {}

        setOnTouchListener(new f(null));
    }

    static boolean A(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.B;
    }

    static String B(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.v;
    }

    static String C(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.w;
    }

    static AdUnitsState D(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.af;
    }

    static DownloadManager E(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.x;
    }

    static e F(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.S;
    }

    static void G(SupersonicWebView supersonicwebview)
    {
        supersonicwebview.o();
    }

    static d H(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.ak;
    }

    static String I(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.k;
    }

    static Boolean J(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.r;
    }

    static com.supersonicads.sdk.a.a K(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.V;
    }

    static com.supersonicads.sdk.controller.a L(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.ae;
    }

    static Boolean M(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.ac;
    }

    static com.supersonicads.sdk.data.c.b N(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.ab;
    }

    static int a(SupersonicWebView supersonicwebview, int i1)
    {
        supersonicwebview.K = i1;
        return i1;
    }

    static CountDownTimer a(SupersonicWebView supersonicwebview, CountDownTimer countdowntimer)
    {
        supersonicwebview.H = countdowntimer;
        return countdowntimer;
    }

    static View a(SupersonicWebView supersonicwebview, View view)
    {
        supersonicwebview.O = view;
        return view;
    }

    static android.webkit.WebChromeClient.CustomViewCallback a(SupersonicWebView supersonicwebview, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        supersonicwebview.Q = customviewcallback;
        return customviewcallback;
    }

    static com.supersonicads.sdk.data.c.b a(SupersonicWebView supersonicwebview, com.supersonicads.sdk.data.c.b b1)
    {
        supersonicwebview.ab = b1;
        return b1;
    }

    static Boolean a(SupersonicWebView supersonicwebview, Boolean boolean1)
    {
        supersonicwebview.r = boolean1;
        return boolean1;
    }

    static String a(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.j;
    }

    static String a(SupersonicWebView supersonicwebview, String s1)
    {
        return supersonicwebview.g(s1);
    }

    static String a(SupersonicWebView supersonicwebview, String s1, String s2, String s3, String s4)
    {
        return supersonicwebview.a(s1, s2, s3, s4);
    }

    static String a(SupersonicWebView supersonicwebview, String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
            String s8, String s9, boolean flag)
    {
        return supersonicwebview.a(s1, s2, s3, s4, s5, s6, s7, s8, s9, flag);
    }

    private String a(String s1, String s2, String s3, String s4)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("SSA_CORE.SDKController.runFunction('").append(s1).append("?parameters=").append(s2).append("','").append(s3).append("','").append(s4).append("');");
        return stringbuilder.toString();
    }

    private String a(String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
            String s8, String s9, boolean flag)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            if (!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2))
            {
                jsonobject.put(s1, com.supersonicads.sdk.b.d.b(s2));
            }
            if (!TextUtils.isEmpty(s3) && !TextUtils.isEmpty(s4))
            {
                jsonobject.put(s3, com.supersonicads.sdk.b.d.b(s4));
            }
            if (!TextUtils.isEmpty(s5) && !TextUtils.isEmpty(s6))
            {
                jsonobject.put(s5, com.supersonicads.sdk.b.d.b(s6));
            }
            if (!TextUtils.isEmpty(s7) && !TextUtils.isEmpty(s8))
            {
                jsonobject.put(s7, com.supersonicads.sdk.b.d.b(s8));
            }
            if (!TextUtils.isEmpty(s9))
            {
                jsonobject.put(s9, flag);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            (new com.supersonicads.sdk.b.e()).execute(new String[] {
                (new StringBuilder()).append("https://www.supersonicads.com/mobile/sdk5/log?method=").append(s1.getStackTrace()[0].getMethodName()).toString()
            });
        }
        return jsonobject.toString();
    }

    private String a(Map map)
    {
        JSONObject jsonobject = new JSONObject();
        if (map != null)
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                try
                {
                    jsonobject.putOpt((String)entry.getKey(), com.supersonicads.sdk.b.d.b((String)entry.getValue()));
                }
                catch (JSONException jsonexception)
                {
                    com.supersonicads.sdk.b.c.a(j, (new StringBuilder()).append("flatMapToJsonAsStringfailed ").append(jsonexception.toString()).toString());
                }
                map.remove();
            }
        }
        return jsonobject.toString();
    }

    static void a(SupersonicWebView supersonicwebview, com.supersonicads.sdk.data.c.d d1)
    {
        supersonicwebview.b(d1);
    }

    static void a(SupersonicWebView supersonicwebview, String s1, String s2)
    {
        supersonicwebview.b(s1, s2);
    }

    static void a(SupersonicWebView supersonicwebview, String s1, boolean flag, String s2, String s3)
    {
        supersonicwebview.a(s1, flag, s2, s3);
    }

    private void a(com.supersonicads.sdk.data.c.d d1)
    {
        String s1 = null;
        if (d1 != com.supersonicads.sdk.data.c.d.a) goto _L2; else goto _L1
_L1:
        s1 = b("initBrandConnect", "onInitBrandConnectSuccess", "onInitBrandConnectFail");
_L4:
        if (s1 != null)
        {
            e(s1);
        }
        return;
_L2:
        if (d1 == com.supersonicads.sdk.data.c.d.c)
        {
            d1 = new HashMap();
            d1.put("applicationKey", s);
            d1.put("applicationUserId", t);
            if (u != null)
            {
                d1.putAll(u);
            }
            s1 = a("initInterstitial", a(((Map) (d1))), "onInitInterstitialSuccess", "onInitInterstitialFail");
        } else
        if (d1 == com.supersonicads.sdk.data.c.d.b)
        {
            s1 = b("showOfferWall", "onShowOfferWallSuccess", "onShowOfferWallFail");
        } else
        if (d1 == com.supersonicads.sdk.data.c.d.d)
        {
            s1 = a("getUserCredits", a("productType", "OfferWall", "applicationKey", v, "applicationUserId", w, null, null, null, false), "null", "onGetUserCreditsFail");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(String s1, com.supersonicads.sdk.data.c.d d1)
    {
        if (d(d1.toString()))
        {
            Context context = getBaseContext();
            if (context instanceof Activity)
            {
                ((Activity)context).runOnUiThread(new _cls3(d1, s1));
            }
        }
    }

    private void a(String s1, String s2, Map map, com.supersonicads.sdk.data.c.d d1, String s3)
    {
        if (TextUtils.isEmpty(s2) || TextUtils.isEmpty(s1))
        {
            a("User id or Application key are missing", d1);
        } else
        {
            if (ab == com.supersonicads.sdk.data.c.b.e)
            {
                com.supersonicads.sdk.b.f.a().a(s1, d1);
                com.supersonicads.sdk.b.f.a().b(s2, d1);
                a(d1);
                return;
            }
            setMissProduct(d1);
            if (ab == com.supersonicads.sdk.data.c.b.f)
            {
                a(com.supersonicads.sdk.b.d.a(s3, "Initiating Controller"), d1);
                return;
            }
            if (C)
            {
                a();
                return;
            }
        }
    }

    private void a(String s1, boolean flag, String s2, String s3)
    {
        String s4;
        Object obj;
        obj = new com.supersonicads.sdk.data.e(s1);
        s4 = ((com.supersonicads.sdk.data.e) (obj)).i(ah);
        obj = ((com.supersonicads.sdk.data.e) (obj)).i(ai);
        if (!flag) goto _L2; else goto _L1
_L1:
        if (TextUtils.isEmpty(s4)) goto _L4; else goto _L3
_L3:
        if (!TextUtils.isEmpty(s4))
        {
            obj = s1;
            if (!TextUtils.isEmpty(s2))
            {
                try
                {
                    obj = (new JSONObject(s1)).put("errMsg", s2).toString();
                }
                // Misplaced declaration of an exception variable
                catch (String s2)
                {
                    obj = s1;
                }
            }
            s1 = ((String) (obj));
            if (!TextUtils.isEmpty(s3))
            {
                try
                {
                    s1 = (new JSONObject(((String) (obj)))).put("errCode", s3).toString();
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s1 = ((String) (obj));
                }
            }
            e(c(s4, s1));
        }
        return;
_L2:
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            s4 = ((String) (obj));
            continue; /* Loop/switch isn't completed */
        }
_L4:
        s4 = null;
        if (true) goto _L3; else goto _L5
_L5:
    }

    static boolean a(SupersonicWebView supersonicwebview, boolean flag)
    {
        supersonicwebview.D = flag;
        return flag;
    }

    static Object[] a(SupersonicWebView supersonicwebview, Context context)
    {
        return supersonicwebview.d(context);
    }

    static int b(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.K;
    }

    static int b(SupersonicWebView supersonicwebview, int i1)
    {
        supersonicwebview.L = i1;
        return i1;
    }

    static Boolean b(SupersonicWebView supersonicwebview, Boolean boolean1)
    {
        supersonicwebview.ac = boolean1;
        return boolean1;
    }

    static String b(SupersonicWebView supersonicwebview, String s1)
    {
        return supersonicwebview.h(s1);
    }

    static String b(SupersonicWebView supersonicwebview, String s1, String s2)
    {
        return supersonicwebview.c(s1, s2);
    }

    private String b(String s1, String s2, String s3)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("SSA_CORE.SDKController.runFunction('").append(s1).append("','").append(s2).append("','").append(s3).append("');");
        return stringbuilder.toString();
    }

    private void b(com.supersonicads.sdk.data.c.d d1)
    {
        String s1 = "";
    /* anonymous class not found */
    class _anm7 {}

        com.supersonicads.sdk.controller._cls7.a[d1.ordinal()];
        JVM INSTR tableswitch 1 4: default 44
    //                   1 57
    //                   2 64
    //                   3 71
    //                   4 78;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        a(com.supersonicads.sdk.b.d.a(s1, "Initiating Controller"), d1);
        return;
_L2:
        s1 = "Init BC";
        continue; /* Loop/switch isn't completed */
_L3:
        s1 = "Init IS";
        continue; /* Loop/switch isn't completed */
_L4:
        s1 = "Show OW";
        continue; /* Loop/switch isn't completed */
_L5:
        s1 = "Show OW Credits";
        if (true) goto _L1; else goto _L6
_L6:
    }

    private void b(String s1, String s2)
    {
        s2 = (new com.supersonicads.sdk.data.e(s2)).i("errMsg");
        if (!TextUtils.isEmpty(s2))
        {
            Context context = getBaseContext();
            if (context instanceof Activity)
            {
                ((Activity)context).runOnUiThread(new _cls5(s1, s2));
            }
        }
    }

    static boolean b(SupersonicWebView supersonicwebview, boolean flag)
    {
        supersonicwebview.C = flag;
        return flag;
    }

    static int c(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.L;
    }

    private String c(String s1, String s2)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("SSA_CORE.SDKController.runFunction('").append(s1).append("?parameters=").append(s2).append("');");
        return stringbuilder.toString();
    }

    private void c(Context context)
    {
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        R = new FrameLayout(context);
        P = new FrameLayout(context);
        android.widget.FrameLayout.LayoutParams layoutparams1 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        P.setLayoutParams(layoutparams1);
        P.setVisibility(8);
        context = new FrameLayout(context);
        context.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        context.addView(this);
        R.addView(P, layoutparams);
        R.addView(context);
    }

    static void c(SupersonicWebView supersonicwebview, String s1)
    {
        supersonicwebview.e(s1);
    }

    static String d(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.M;
    }

    private boolean d(String s1)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag3 = true;
        flag1 = true;
        flag = true;
        flag4 = false;
        flag2 = false;
        if (s1 != null) goto _L2; else goto _L1
_L1:
        com.supersonicads.sdk.b.c.c(j, "Trying to trigger a listener - no product was found");
        flag1 = flag2;
_L4:
        return flag1;
_L2:
        if (!s1.equalsIgnoreCase(com.supersonicads.sdk.data.c.d.c.toString()))
        {
            break; /* Loop/switch isn't completed */
        }
        if (W == null)
        {
            flag = false;
        }
_L5:
        flag1 = flag;
        if (!flag)
        {
            com.supersonicads.sdk.b.c.c(j, (new StringBuilder()).append("Trying to trigger a listener - no listener was found for product ").append(s1).toString());
            return flag;
        }
        if (true) goto _L4; else goto _L3
_L3:
label0:
        {
            if (!s1.equalsIgnoreCase(com.supersonicads.sdk.data.c.d.a.toString()))
            {
                break label0;
            }
            if (U != null)
            {
                flag = flag3;
            } else
            {
                flag = false;
            }
        }
          goto _L5
        if (s1.equalsIgnoreCase(com.supersonicads.sdk.data.c.d.b.toString())) goto _L7; else goto _L6
_L6:
        flag = flag4;
        if (!s1.equalsIgnoreCase(com.supersonicads.sdk.data.c.d.d.toString())) goto _L5; else goto _L7
_L7:
        if (aa != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
          goto _L5
    }

    private Object[] d(Context context)
    {
        JSONObject jsonobject;
        Object obj;
        obj = com.supersonicads.sdk.b.a.a(context);
        jsonobject = new JSONObject();
        String s1;
        jsonobject.put("appOrientation", "none");
        s1 = ((a) (obj)).a();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        jsonobject.put(com.supersonicads.sdk.b.d.b("deviceOEM"), com.supersonicads.sdk.b.d.b(s1));
        s1 = ((a) (obj)).b();
        if (s1 == null) goto _L2; else goto _L1
_L1:
        jsonobject.put(com.supersonicads.sdk.b.d.b("deviceModel"), com.supersonicads.sdk.b.d.b(s1));
        boolean flag1 = false;
_L15:
        boolean flag = flag1;
        com.supersonicads.sdk.b.d.h(context);
        flag = flag1;
        s1 = com.supersonicads.sdk.b.d.e();
        flag = flag1;
        boolean flag2 = com.supersonicads.sdk.b.d.f();
        flag = flag1;
        if (TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_198;
        }
        flag = flag1;
        com.supersonicads.sdk.b.c.a(j, "add AID and LAT");
        flag = flag1;
        jsonobject.put("isLimitAdTrackingEnabled", Boolean.valueOf(flag2));
        flag = flag1;
        jsonobject.put((new StringBuilder()).append("deviceIds").append("[").append("AID").append("]").toString(), com.supersonicads.sdk.b.d.b(s1));
        flag = flag1;
        s1 = ((a) (obj)).c();
        if (s1 == null) goto _L4; else goto _L3
_L3:
        flag = flag1;
        jsonobject.put(com.supersonicads.sdk.b.d.b("deviceOs"), com.supersonicads.sdk.b.d.b(s1));
_L16:
        flag = flag1;
        s1 = Integer.toString(((a) (obj)).d());
        if (s1 == null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        jsonobject.put(com.supersonicads.sdk.b.d.b("deviceOSVersion"), s1);
_L17:
        flag = flag1;
        s1 = ((a) (obj)).f();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        flag = flag1;
        jsonobject.put(com.supersonicads.sdk.b.d.b("SDKVersion"), com.supersonicads.sdk.b.d.b(s1));
        flag = flag1;
        if (((a) (obj)).e() == null)
        {
            break MISSING_BLOCK_LABEL_350;
        }
        flag = flag1;
        if (((a) (obj)).e().length() <= 0)
        {
            break MISSING_BLOCK_LABEL_350;
        }
        flag = flag1;
        jsonobject.put(com.supersonicads.sdk.b.d.b("mobileCarrier"), com.supersonicads.sdk.b.d.b(((a) (obj)).e()));
        flag = flag1;
        obj = com.supersonicads.sdk.b.d.g(context);
        flag = flag1;
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L8; else goto _L7
_L7:
        flag = flag1;
        jsonobject.put(com.supersonicads.sdk.b.d.b("connectionType"), com.supersonicads.sdk.b.d.b(((String) (obj))));
_L18:
        flag = flag1;
        obj = context.getResources().getConfiguration().locale.getLanguage();
        flag = flag1;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_440;
        }
        flag = flag1;
        jsonobject.put(com.supersonicads.sdk.b.d.b("deviceLanguage"), com.supersonicads.sdk.b.d.b(((String) (obj)).toUpperCase()));
        flag = flag1;
        if (!com.supersonicads.sdk.b.g.a()) goto _L10; else goto _L9
_L9:
        flag = flag1;
        long l1 = com.supersonicads.sdk.b.d.a(context, ad);
        flag = flag1;
        jsonobject.put(com.supersonicads.sdk.b.d.b("diskFreeSize"), com.supersonicads.sdk.b.d.b(String.valueOf(l1)));
_L19:
        flag = flag1;
        context = String.valueOf(com.supersonicads.sdk.b.d.a());
        if (context == null) goto _L12; else goto _L11
_L11:
        flag = flag1;
        obj = new StringBuilder();
        flag = flag1;
        ((StringBuilder) (obj)).append(com.supersonicads.sdk.b.d.b("deviceScreenSize")).append("[").append(com.supersonicads.sdk.b.d.b("width")).append("]");
        flag = flag1;
        jsonobject.put(((StringBuilder) (obj)).toString(), com.supersonicads.sdk.b.d.b(context));
_L20:
        flag = flag1;
        context = String.valueOf(com.supersonicads.sdk.b.d.b());
        if (context == null) goto _L14; else goto _L13
_L13:
        flag = flag1;
        obj = new StringBuilder();
        flag = flag1;
        ((StringBuilder) (obj)).append(com.supersonicads.sdk.b.d.b("deviceScreenSize")).append("[").append(com.supersonicads.sdk.b.d.b("height")).append("]");
        flag = flag1;
        jsonobject.put(((StringBuilder) (obj)).toString(), com.supersonicads.sdk.b.d.b(context));
        flag = flag1;
_L21:
        context = com.supersonicads.sdk.b.d.e(getBaseContext());
        if (!TextUtils.isEmpty(context))
        {
            jsonobject.put(com.supersonicads.sdk.b.d.b("bundleId"), com.supersonicads.sdk.b.d.b(context));
        }
        context = String.valueOf(com.supersonicads.sdk.b.d.d());
        flag1 = flag;
        if (TextUtils.isEmpty(context))
        {
            break MISSING_BLOCK_LABEL_718;
        }
        jsonobject.put(com.supersonicads.sdk.b.d.b("deviceScreenScale"), com.supersonicads.sdk.b.d.b(context));
        flag1 = flag;
_L22:
        return (new Object[] {
            jsonobject.toString(), Boolean.valueOf(flag1)
        });
_L2:
        flag1 = true;
          goto _L15
_L4:
        flag1 = true;
          goto _L16
_L6:
        flag1 = true;
          goto _L17
_L8:
        flag1 = true;
          goto _L18
_L10:
        flag1 = true;
          goto _L19
_L12:
        flag1 = true;
          goto _L20
_L14:
        flag = true;
          goto _L21
        context;
        flag = false;
_L23:
        context.printStackTrace();
        (new com.supersonicads.sdk.b.e()).execute(new String[] {
            (new StringBuilder()).append("https://www.supersonicads.com/mobile/sdk5/log?method=").append(context.getStackTrace()[0].getMethodName()).toString()
        });
        flag1 = flag;
          goto _L22
        context;
          goto _L23
        context;
          goto _L23
    }

    static Object[] d(SupersonicWebView supersonicwebview, String s1)
    {
        return supersonicwebview.i(s1);
    }

    static CountDownTimer e(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.H;
    }

    private void e(String s1)
    {
        Object obj1 = "empty";
        Object obj;
        if (getDebugMode() == com.supersonicads.sdk.data.c.c.a.a())
        {
            obj = "console.log(\"JS exeption: \" + JSON.stringify(e));";
        } else
        {
            obj = obj1;
            if (getDebugMode() >= com.supersonicads.sdk.data.c.c.b.a())
            {
                obj = obj1;
                if (getDebugMode() <= com.supersonicads.sdk.data.c.c.d.a())
                {
                    obj = "console.log(\"JS exeption: \" + JSON.stringify(e));";
                }
            }
        }
        obj1 = new StringBuilder();
        ((StringBuilder) (obj1)).append("try{").append(s1).append("}catch(e){").append(((String) (obj))).append("}");
        s1 = (new StringBuilder()).append("javascript:").append(((StringBuilder) (obj1)).toString()).toString();
        obj = getBaseContext();
        if (obj instanceof Activity)
        {
            ((Activity)obj).runOnUiThread(new _cls4(s1, ((StringBuilder) (obj1))));
            return;
        } else
        {
            (new com.supersonicads.sdk.b.e()).execute(new String[] {
                "https://www.supersonicads.com/mobile/sdk5/log?method=contextIsNotActivity"
            });
            return;
        }
    }

    static boolean e(SupersonicWebView supersonicwebview, String s1)
    {
        return supersonicwebview.d(s1);
    }

    static String f(SupersonicWebView supersonicwebview, String s1)
    {
        supersonicwebview.M = s1;
        return s1;
    }

    private void f(String s1)
    {
        evaluateJavascript(s1, null);
    }

    static boolean f(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.D;
    }

    static String g(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.ad;
    }

    private String g(String s1)
    {
        return (new com.supersonicads.sdk.data.e(s1)).i(ah);
    }

    static void g(SupersonicWebView supersonicwebview, String s1)
    {
        supersonicwebview.setWebviewBackground(s1);
    }

    private Context getBaseContext()
    {
        return ((MutableContextWrapper)getContext()).getBaseContext();
    }

    private String getRequestParameters()
    {
        Object obj = com.supersonicads.sdk.b.a.a(getBaseContext());
        StringBuilder stringbuilder = new StringBuilder();
        String s2 = ((a) (obj)).f();
        if (!TextUtils.isEmpty(s2))
        {
            stringbuilder.append("SDKVersion").append("=").append(s2).append("&");
        }
        obj = ((a) (obj)).c();
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            stringbuilder.append("deviceOs").append("=").append(((String) (obj)));
        }
        boolean flag = false;
        if (getDebugMode() != 0)
        {
            flag = true;
            stringbuilder.append("&").append("debug").append("=").append(getDebugMode());
        }
        if (!"http://s.ssacdn.com/".equalsIgnoreCase(com.supersonicads.sdk.b.f.a().i()) && getUri() != null)
        {
            String s4 = (new StringBuilder()).append(getUri().getScheme()).append(":").toString();
            String s3 = getUri().getHost();
            int i1 = getUri().getPort();
            String s1 = s3;
            if (i1 != -1)
            {
                s1 = (new StringBuilder()).append(s3).append(":").append(i1).toString();
            }
            if (!flag)
            {
                stringbuilder.append("&").append("debug").append("=").append(getDebugMode());
            }
            stringbuilder.append("&").append("protocol").append("=").append(s4).append("&").append("domain").append("=").append(s1);
        }
        return stringbuilder.toString();
    }

    private Uri getUri()
    {
        return E;
    }

    static View h(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.O;
    }

    private String h(String s1)
    {
        return (new com.supersonicads.sdk.data.e(s1)).i(ai);
    }

    static void h(SupersonicWebView supersonicwebview, String s1)
    {
        supersonicwebview.f(s1);
    }

    static FrameLayout i(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.P;
    }

    private Object[] i(String s1)
    {
        Object obj;
        String s2;
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        s2 = "";
        obj = "";
        if (TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        if (!s1.equalsIgnoreCase(com.supersonicads.sdk.data.c.d.a.toString())) goto _L4; else goto _L3
_L3:
        s2 = m;
        obj = n;
_L7:
        jsonobject.put("productType", s1);
        boolean flag;
        flag = false;
        break MISSING_BLOCK_LABEL_60;
_L4:
        if (s1.equalsIgnoreCase(com.supersonicads.sdk.data.c.d.c.toString()))
        {
            s2 = s;
            obj = t;
        } else
        if (s1.equalsIgnoreCase(com.supersonicads.sdk.data.c.d.b.toString()))
        {
            s2 = p;
            obj = q;
        }
        continue; /* Loop/switch isn't completed */
        s1;
        s1.printStackTrace();
        (new com.supersonicads.sdk.b.e()).execute(new String[] {
            "https://www.supersonicads.com/mobile/sdk5/log?method=noProductType"
        });
        flag = false;
          goto _L5
_L2:
        flag = true;
_L5:
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            try
            {
                jsonobject.put(com.supersonicads.sdk.b.d.b("applicationUserId"), com.supersonicads.sdk.b.d.b(((String) (obj))));
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
                (new com.supersonicads.sdk.b.e()).execute(new String[] {
                    "https://www.supersonicads.com/mobile/sdk5/log?method=encodeAppUserId"
                });
            }
        } else
        {
            flag = true;
        }
        if (!TextUtils.isEmpty(s2))
        {
            try
            {
                jsonobject.put(com.supersonicads.sdk.b.d.b("applicationKey"), com.supersonicads.sdk.b.d.b(s2));
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                s1.printStackTrace();
                (new com.supersonicads.sdk.b.e()).execute(new String[] {
                    "https://www.supersonicads.com/mobile/sdk5/log?method=encodeAppKey"
                });
            }
        } else
        {
            flag = true;
        }
        if (o != null && !o.isEmpty())
        {
            for (s1 = o.entrySet().iterator(); s1.hasNext();)
            {
                obj = (java.util.Map.Entry)s1.next();
                if (((String)((java.util.Map.Entry) (obj)).getKey()).equalsIgnoreCase("sdkWebViewCache"))
                {
                    setWebviewCache((String)((java.util.Map.Entry) (obj)).getValue());
                }
                try
                {
                    jsonobject.put(com.supersonicads.sdk.b.d.b((String)((java.util.Map.Entry) (obj)).getKey()), com.supersonicads.sdk.b.d.b((String)((java.util.Map.Entry) (obj)).getValue()));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    ((JSONException) (obj)).printStackTrace();
                    (new com.supersonicads.sdk.b.e()).execute(new String[] {
                        "https://www.supersonicads.com/mobile/sdk5/log?method=extraParametersToJson"
                    });
                }
            }

        }
        return (new Object[] {
            jsonobject.toString(), Boolean.valueOf(flag)
        });
        if (true) goto _L7; else goto _L6
_L6:
    }

    static Context j(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.getBaseContext();
    }

    private String j(String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("SSA_CORE.SDKController.runFunction('").append(s1).append("');");
        return stringbuilder.toString();
    }

    static android.webkit.WebChromeClient.CustomViewCallback k(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.Q;
    }

    static CountDownTimer l(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.J;
    }

    static CountDownTimer m(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.I;
    }

    private void n()
    {
        WebSettings websettings = getSettings();
        websettings.setLoadWithOverviewMode(true);
        websettings.setUseWideViewPort(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        websettings.setBuiltInZoomControls(false);
        websettings.setJavaScriptEnabled(true);
        websettings.setSupportMultipleWindows(true);
        websettings.setJavaScriptCanOpenWindowsAutomatically(true);
        websettings.setGeolocationEnabled(true);
        websettings.setGeolocationDatabasePath("/data/data/org.itri.html5webview/databases/");
        websettings.setDomStorageEnabled(true);
        try
        {
            setDisplayZoomControls(websettings);
            setMediaPlaybackJellyBean(websettings);
            return;
        }
        catch (Throwable throwable)
        {
            com.supersonicads.sdk.b.c.b(j, (new StringBuilder()).append("setWebSettings - ").append(throwable.toString()).toString());
        }
        (new com.supersonicads.sdk.b.e()).execute(new String[] {
            "https://www.supersonicads.com/mobile/sdk5/log?method=setWebViewSettings"
        });
    }

    static boolean n(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.y;
    }

    static String o(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.m;
    }

    private void o()
    {
        if (ak != null)
        {
            ak.a();
        }
    }

    static String p(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.n;
    }

    static Map q(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.o;
    }

    static com.supersonicads.sdk.a.d r(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.U;
    }

    static boolean s(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.z;
    }

    private void setDisplayZoomControls(WebSettings websettings)
    {
        if (android.os.Build.VERSION.SDK_INT > 11)
        {
            websettings.setDisplayZoomControls(false);
        }
    }

    public static void setEXTERNAL_URL(String s1)
    {
        f = s1;
    }

    private void setMediaPlaybackJellyBean(WebSettings websettings)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            websettings.setMediaPlaybackRequiresUserGesture(false);
        }
    }

    private void setMissProduct(com.supersonicads.sdk.data.c.d d1)
    {
        if (d1 != com.supersonicads.sdk.data.c.d.a) goto _L2; else goto _L1
_L1:
        y = true;
_L4:
        com.supersonicads.sdk.b.c.a(j, (new StringBuilder()).append("setMissProduct(").append(d1).append(")").toString());
        return;
_L2:
        if (d1 == com.supersonicads.sdk.data.c.d.c)
        {
            z = true;
        } else
        if (d1 == com.supersonicads.sdk.data.c.d.b)
        {
            A = true;
        } else
        if (d1 == com.supersonicads.sdk.data.c.d.d)
        {
            B = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void setUri(Uri uri)
    {
        E = uri;
    }

    private void setWebviewBackground(String s1)
    {
        s1 = (new com.supersonicads.sdk.data.e(s1)).i("color");
        int i1 = 0;
        if (!"transparent".equalsIgnoreCase(s1))
        {
            i1 = Color.parseColor(s1);
        }
        setBackgroundColor(i1);
    }

    private void setWebviewCache(String s1)
    {
        if (s1.equalsIgnoreCase("0"))
        {
            getSettings().setCacheMode(2);
            return;
        } else
        {
            getSettings().setCacheMode(-1);
            return;
        }
    }

    static String t(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.s;
    }

    static String u(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.t;
    }

    static b v(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.W;
    }

    static boolean w(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.A;
    }

    static String x(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.p;
    }

    static String y(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.q;
    }

    static com.supersonicads.sdk.a.c z(SupersonicWebView supersonicwebview)
    {
        return supersonicwebview.aa;
    }

    public void a()
    {
        com.supersonicads.sdk.b.g.a(ad, "", "mobileController.html");
        setUri(Uri.parse(com.supersonicads.sdk.b.f.a().i()));
        String s1 = com.supersonicads.sdk.b.f.a().h();
        if (TextUtils.isEmpty(s1))
        {
            s1 = "http://s.ssacdn.com/mobileSDKController/mobileController.html";
        }
        com.supersonicads.sdk.data.d d1 = new com.supersonicads.sdk.data.d(s1, "");
        J = (new _cls1(40000L, 1000L)).start();
        if (!x.b())
        {
            com.supersonicads.sdk.b.c.a(j, (new StringBuilder()).append("Download Mobile Controller: ").append(s1).toString());
            x.b(d1);
            return;
        } else
        {
            com.supersonicads.sdk.b.c.a(j, "Download Mobile Controller: already alive");
            return;
        }
    }

    public void a(int i1)
    {
        String s1;
        try
        {
            loadUrl("about:blank");
        }
        catch (Throwable throwable)
        {
            com.supersonicads.sdk.b.c.b(j, (new StringBuilder()).append("WebViewController:: load: ").append(throwable.toString()).toString());
            (new com.supersonicads.sdk.b.e()).execute(new String[] {
                "https://www.supersonicads.com/mobile/sdk5/log?method=webviewLoadBlank"
            });
        }
        s1 = (new StringBuilder()).append("file://").append(ad).append(File.separator).append("mobileController.html").toString();
        if ((new File((new StringBuilder()).append(ad).append(File.separator).append("mobileController.html").toString())).exists())
        {
            F = getRequestParameters();
            s1 = (new StringBuilder()).append(s1).append("?").append(F).toString();
            I = (new _cls2(10000L, 1000L, i1)).start();
            try
            {
                loadUrl(s1);
            }
            catch (Throwable throwable1)
            {
                com.supersonicads.sdk.b.c.b(j, (new StringBuilder()).append("WebViewController:: load: ").append(throwable1.toString()).toString());
                (new com.supersonicads.sdk.b.e()).execute(new String[] {
                    "https://www.supersonicads.com/mobile/sdk5/log?method=webviewLoadWithPath"
                });
            }
            com.supersonicads.sdk.b.c.a(j, (new StringBuilder()).append("load(): ").append(s1).toString());
            return;
        } else
        {
            com.supersonicads.sdk.b.c.a(j, "load(): Mobile Controller HTML Does not exist");
            (new com.supersonicads.sdk.b.e()).execute(new String[] {
                "https://www.supersonicads.com/mobile/sdk5/log?method=htmlControllerDoesNotExistOnFileSystem"
            });
            return;
        }
    }

    public void a(Context context)
    {
        context.registerReceiver(aj, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void a(AdUnitsState adunitsstate)
    {
        Object obj = ag;
        obj;
        JVM INSTR monitorenter ;
        if (!adunitsstate.j() || !ab.equals(com.supersonicads.sdk.data.c.b.e)) goto _L2; else goto _L1
_L1:
        int i1;
        Log.d(j, (new StringBuilder()).append("restoreState(state:").append(adunitsstate).append(")").toString());
        i1 = adunitsstate.k();
        if (i1 == -1)
        {
            break MISSING_BLOCK_LABEL_457;
        }
        if (i1 != com.supersonicads.sdk.data.c.d.a.ordinal()) goto _L4; else goto _L3
_L3:
        Log.d(j, "onRVAdClosed()");
        if (U != null)
        {
            U.onRVAdClosed();
        }
_L7:
        adunitsstate.a(-1);
_L9:
        if (adunitsstate.e())
        {
            Log.d(j, "onInterstitialAvailability(false)");
            if (W != null)
            {
                W.onInterstitialAvailability(false);
            }
            String s1 = adunitsstate.f();
            String s3 = adunitsstate.g();
            Map map = adunitsstate.h();
            Log.d(j, (new StringBuilder()).append("initInterstitial(appKey:").append(s1).append(", userId:").append(s3).append(", extraParam:").append(map).append(")").toString());
            a(s1, s3, map, W);
        }
        if (adunitsstate.a())
        {
            Log.d(j, "onRVNoMoreOffers()");
            if (U != null)
            {
                U.onRVNoMoreOffers();
            }
            String s2 = adunitsstate.b();
            String s4 = adunitsstate.c();
            Map map1 = adunitsstate.d();
            Log.d(j, (new StringBuilder()).append("initRewardedVideo(appKey:").append(s2).append(", userId:").append(s4).append(", extraParam:").append(map1).append(")").toString());
            a(s2, s4, map1, U);
        }
        adunitsstate.d(false);
_L2:
        af = adunitsstate;
        obj;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (i1 != com.supersonicads.sdk.data.c.d.c.ordinal()) goto _L6; else goto _L5
_L5:
        Log.d(j, "onInterstitialAdClosed()");
        if (W != null)
        {
            W.onInterstitialAdClosed();
        }
          goto _L7
        adunitsstate;
        obj;
        JVM INSTR monitorexit ;
        throw adunitsstate;
_L6:
        if (i1 != com.supersonicads.sdk.data.c.d.b.ordinal()) goto _L7; else goto _L8
_L8:
        Log.d(j, "onOWAdClosed()");
        if (aa != null)
        {
            aa.onOWAdClosed();
        }
          goto _L7
        Log.d(j, "No ad was opened");
          goto _L9
    }

    public void a(com.supersonicads.sdk.data.d d1)
    {
        if (d1.a().contains("mobileController.html"))
        {
            a(1);
            return;
        } else
        {
            a(d1.a(), d1.b());
            return;
        }
    }

    public void a(String s1)
    {
        e(c("nativeNavigationPressed", a("action", s1, null, null, null, null, null, null, null, false)));
    }

    public void a(String s1, String s2)
    {
        e(c("assetCached", a("file", s1, "path", s2, null, null, null, null, null, false)));
    }

    public void a(String s1, String s2, com.supersonicads.sdk.a.c c1)
    {
        v = s1;
        w = s2;
        aa = c1;
        a(v, w, ((Map) (null)), com.supersonicads.sdk.data.c.d.d, "Show OW Credits");
    }

    public void a(String s1, String s2, String s3)
    {
        e(c("assetCachedFailed", a("file", s1, "path", s2, "errMsg", s3, null, null, null, false)));
    }

    public void a(String s1, String s2, Map map, b b1)
    {
        s = s1;
        t = s2;
        u = map;
        W = b1;
        af.c(s);
        af.d(t);
        af.b(u);
        af.c(true);
        a(s, t, o, com.supersonicads.sdk.data.c.d.c, "Init IS");
    }

    public void a(String s1, String s2, Map map, com.supersonicads.sdk.a.c c1)
    {
        p = s1;
        q = s2;
        o = map;
        aa = c1;
        a(p, q, o, com.supersonicads.sdk.data.c.d.b, "Show OW");
    }

    public void a(String s1, String s2, Map map, com.supersonicads.sdk.a.d d1)
    {
        m = s1;
        n = s2;
        o = map;
        U = d1;
        af.a(m);
        af.b(n);
        af.a(o);
        a(m, n, o, com.supersonicads.sdk.data.c.d.a, "Init BC");
    }

    public void a(boolean flag, String s1)
    {
        e(c("viewableChange", a("webview", s1, null, null, null, null, null, null, "isViewable", flag)));
    }

    public void a(boolean flag, boolean flag1)
    {
        String s1 = "none";
        if (!flag) goto _L2; else goto _L1
_L1:
        s1 = "wifi";
_L4:
        e(c("deviceStatusChanged", a("connectionType", s1, null, null, null, null, null, null, null, false)));
        return;
_L2:
        if (flag1)
        {
            s1 = "3g";
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b()
    {
        ae = null;
    }

    public void b(Context context)
    {
        try
        {
            context.unregisterReceiver(aj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            (new com.supersonicads.sdk.b.e()).execute(new String[] {
                "https://www.supersonicads.com/mobile/sdk5/log?method=unregisterConnectionReceiverIllegal"
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e(j, (new StringBuilder()).append("unregisterConnectionReceiver - ").append(context).toString());
        }
        (new com.supersonicads.sdk.b.e()).execute(new String[] {
            (new StringBuilder()).append("https://www.supersonicads.com/mobile/sdk5/log?method=").append(context.getStackTrace()[0].getMethodName()).toString()
        });
    }

    public void b(com.supersonicads.sdk.data.d d1)
    {
        if (d1.a().contains("mobileController.html"))
        {
            J.cancel();
            if (y)
            {
                b(com.supersonicads.sdk.data.c.d.a);
            }
            if (z)
            {
                b(com.supersonicads.sdk.data.c.d.c);
            }
            if (A)
            {
                b(com.supersonicads.sdk.data.c.d.b);
            }
            if (B)
            {
                b(com.supersonicads.sdk.data.c.d.d);
            }
            return;
        } else
        {
            a(d1.a(), d1.b(), d1.c());
            return;
        }
    }

    public void b(String s1)
    {
        if (s1.equals("forceClose"))
        {
            o();
        }
        e(c("engageEnd", a("action", s1, null, null, null, null, null, null, null, false)));
    }

    public boolean c()
    {
        if (r == null)
        {
            return false;
        } else
        {
            return r.booleanValue();
        }
    }

    public boolean c(String s1)
    {
label0:
        {
            Object obj = com.supersonicads.sdk.b.f.a().d();
            if (obj == null || ((List) (obj)).isEmpty())
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (!s1.contains((String)((Iterator) (obj)).next()));
            s1 = new Intent("android.intent.action.VIEW", Uri.parse(s1));
            getBaseContext().startActivity(s1);
            return true;
        }
        return false;
    }

    public void d()
    {
        e(b("showInterstitial", "onShowInterstitialSuccess", "onShowInterstitialFail"));
    }

    public void destroy()
    {
        super.destroy();
        if (x != null)
        {
            x.a();
        }
        if (aj != null)
        {
            aj = null;
        }
    }

    public void e()
    {
        e(b("showBrandConnect", "onShowBrandConnectSuccess", "onShowBrandConnectFail"));
    }

    public void f()
    {
        if (ab == com.supersonicads.sdk.data.c.b.e)
        {
            e(j("enterBackground"));
        }
    }

    public void g()
    {
        if (ab == com.supersonicads.sdk.data.c.b.e)
        {
            e(j("enterForeground"));
        }
    }

    public String getControllerKeyPressed()
    {
        String s1 = G;
        setControllerKeyPressed("interrupt");
        return s1;
    }

    public int getDebugMode()
    {
        return b;
    }

    public String getDownloadDomain()
    {
        return a;
    }

    public FrameLayout getLayout()
    {
        return R;
    }

    public String getOrientationState()
    {
        return T;
    }

    public AdUnitsState getSavedState()
    {
        return af;
    }

    public e getState()
    {
        return S;
    }

    public void h()
    {
        e(j("pageFinished"));
    }

    public void i()
    {
        e(j("interceptedUrlToStore"));
    }

    public void j()
    {
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        onPause();
        return;
        Throwable throwable;
        throwable;
        com.supersonicads.sdk.b.c.a(j, (new StringBuilder()).append("WebViewController: pause() - ").append(throwable).toString());
        (new com.supersonicads.sdk.b.e()).execute(new String[] {
            "https://www.supersonicads.com/mobile/sdk5/log?method=webviewPause"
        });
        return;
    }

    public void k()
    {
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        onResume();
        return;
        Throwable throwable;
        throwable;
        com.supersonicads.sdk.b.c.a(j, (new StringBuilder()).append("WebViewController: onResume() - ").append(throwable).toString());
        (new com.supersonicads.sdk.b.e()).execute(new String[] {
            "https://www.supersonicads.com/mobile/sdk5/log?method=webviewResume"
        });
        return;
    }

    public boolean l()
    {
        return O != null;
    }

    public void m()
    {
        N.onHideCustomView();
    }

    public void onDownloadStart(String s1, String s2, String s3, String s4, long l1)
    {
        com.supersonicads.sdk.b.c.a(j, (new StringBuilder()).append(s1).append(" ").append(s4).toString());
    }

    public WebBackForwardList saveState(Bundle bundle)
    {
        return super.saveState(bundle);
    }

    public void setControllerKeyPressed(String s1)
    {
        G = s1;
    }

    public void setDebugMode(int i1)
    {
        b = i1;
    }

    public void setDownloadDomain(String s1)
    {
        a = s1;
    }

    public void setOnWebViewControllerChangeListener(d d1)
    {
        ak = d1;
    }

    public void setOrientationState(String s1)
    {
        T = s1;
    }

    public void setState(e e1)
    {
        S = e1;
    }

    public void setVideoEventsListener(com.supersonicads.sdk.controller.a a1)
    {
        ae = a1;
    }


    // Unreferenced inner class com/supersonicads/sdk/controller/SupersonicWebView$b
    /* block-local class not found */
    class b {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}

}
