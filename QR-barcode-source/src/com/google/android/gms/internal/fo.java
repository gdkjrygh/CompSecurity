// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.o;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            gs, bq, fz, fi, 
//            fk, gk, ah, ai, 
//            gl, go, fp, fq, 
//            u, by, gv, jy

public class fo
    implements Callable
{
    public static interface a
    {

        public abstract bq.a a(fo fo1, JSONObject jsonobject)
            throws JSONException, InterruptedException, ExecutionException;
    }


    private final Context mContext;
    private final Object mw = new Object();
    private final u pw;
    private final go tX;
    private final ai tY;
    private boolean tZ;
    private int tc;
    private final fz.a tn;
    private List ua;

    public fo(Context context, u u, ai ai1, go go1, fz.a a1)
    {
        mContext = context;
        pw = u;
        tX = go1;
        tY = ai1;
        tn = a1;
        tZ = false;
        tc = -2;
        ua = null;
    }

    private bq.a a(ah ah1, a a1, JSONObject jsonobject)
        throws ExecutionException, InterruptedException, JSONException
    {
        if (cH())
        {
            return null;
        }
        List list = b(jsonobject.getJSONObject("tracking_urls_and_actions"), "impression_tracking_urls");
        if (list == null)
        {
            list = null;
        } else
        {
            list = Arrays.asList(list);
        }
        ua = list;
        a1 = a1.a(this, jsonobject);
        if (a1 == null)
        {
            gs.T("Failed to retrieve ad assets.");
            return null;
        } else
        {
            a1.a(new bq(pw, ah1, jsonobject));
            return a1;
        }
    }

    private fz a(bq.a a1)
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        int j = tc;
        int i;
        i = j;
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        i = j;
        if (tc == -2)
        {
            i = 0;
        }
        obj;
        JVM INSTR monitorexit ;
        if (i != -2)
        {
            a1 = null;
        }
        return new fz(tn.vv.tx, null, tn.vw.qf, i, tn.vw.qg, ua, tn.vw.orientation, tn.vw.qj, tn.vv.tA, false, null, null, null, null, null, 0L, tn.lH, tn.vw.tH, tn.vs, tn.vt, tn.vw.tN, tn.vp, a1);
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    private String[] b(JSONObject jsonobject, String s1)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONArray(s1);
        if (jsonobject == null)
        {
            return null;
        }
        s1 = new String[jsonobject.length()];
        for (int i = 0; i < jsonobject.length(); i++)
        {
            s1[i] = jsonobject.getString(i);
        }

        return s1;
    }

    private JSONObject c(ah ah1)
        throws TimeoutException, JSONException
    {
        if (cH())
        {
            return null;
        } else
        {
            gk gk1 = new gk();
            ah1.a("/nativeAdPreProcess", new by(ah1, gk1) {

                final ah ub;
                final gk uc;
                final fo ud;

                public void a(gv gv, Map map)
                {
                    ub.g("/nativeAdPreProcess");
                    try
                    {
                        gv = (String)map.get("success");
                        if (!TextUtils.isEmpty(gv))
                        {
                            uc.a((new JSONObject(gv)).getJSONArray("ads").getJSONObject(0));
                            return;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (gv gv)
                    {
                        gs.b("Malformed native JSON response.", gv);
                    }
                    ud.s(0);
                    o.a(ud.cH(), "Unable to set the ad state error!");
                    uc.a(null);
                }

            
            {
                ud = fo.this;
                ub = ah1;
                uc = gk1;
                super();
            }
            });
            ah1.a("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(tn.vw.tG));
            return (JSONObject)gk1.get();
        }
    }

    private ah cG()
        throws CancellationException, ExecutionException, InterruptedException, TimeoutException
    {
        if (cH())
        {
            return null;
        } else
        {
            ah ah1 = (ah)tY.a(mContext, tn.vv.lD, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html").get();
            ah1.a(pw, pw, pw, pw, false, pw);
            return ah1;
        }
    }

    public Future a(JSONObject jsonobject, String s1, boolean flag)
        throws JSONException
    {
        if (flag)
        {
            jsonobject = jsonobject.getJSONObject(s1);
        } else
        {
            jsonobject = jsonobject.optJSONObject(s1);
        }
        s1 = jsonobject;
        if (jsonobject == null)
        {
            s1 = new JSONObject();
        }
        if (flag)
        {
            jsonobject = s1.getString("url");
        } else
        {
            jsonobject = s1.optString("url");
        }
        if (TextUtils.isEmpty(jsonobject))
        {
            a(0, flag);
            return new gl(null);
        } else
        {
            return tX.a(jsonobject, new go.a(flag) {

                final fo ud;
                final boolean ue;

                public Drawable a(InputStream inputstream)
                {
                    try
                    {
                        inputstream = jy.d(inputstream);
                    }
                    // Misplaced declaration of an exception variable
                    catch (InputStream inputstream)
                    {
                        inputstream = null;
                    }
                    if (inputstream == null)
                    {
                        ud.a(2, ue);
                        return null;
                    }
                    inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
                    if (inputstream == null)
                    {
                        ud.a(2, ue);
                        return null;
                    } else
                    {
                        return new BitmapDrawable(Resources.getSystem(), inputstream);
                    }
                }

                public Object b(InputStream inputstream)
                {
                    return a(inputstream);
                }

                public Drawable cI()
                {
                    ud.a(2, ue);
                    return null;
                }

                public Object cJ()
                {
                    return cI();
                }

            
            {
                ud = fo.this;
                ue = flag;
                super();
            }
            });
        }
    }

    public void a(int i, boolean flag)
    {
        if (flag)
        {
            s(i);
        }
    }

    protected a b(JSONObject jsonobject)
        throws JSONException
    {
        if (cH())
        {
            return null;
        }
        jsonobject = jsonobject.getString("template_id");
        if ("2".equals(jsonobject))
        {
            return new fp();
        }
        if ("1".equals(jsonobject))
        {
            return new fq();
        } else
        {
            s(0);
            return null;
        }
    }

    public fz cF()
    {
        Object obj;
        obj = cG();
        JSONObject jsonobject = c(((ah) (obj)));
        obj = a(a(((ah) (obj)), b(jsonobject), jsonobject));
        return ((fz) (obj));
        Object obj1;
        obj1;
        gs.d("Malformed native JSON response.", ((Throwable) (obj1)));
_L2:
        if (!tZ)
        {
            s(0);
        }
        return a(null);
        obj1;
        gs.d("Timeout when loading native ad.", ((Throwable) (obj1)));
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean cH()
    {
        boolean flag;
        synchronized (mw)
        {
            flag = tZ;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Object call()
        throws Exception
    {
        return cF();
    }

    public void s(int i)
    {
        synchronized (mw)
        {
            tZ = true;
            tc = i;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
