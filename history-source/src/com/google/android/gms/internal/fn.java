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
//            gr, bv, fy, fh, 
//            fj, gj, ah, ai, 
//            gk, gn, fo, fp, 
//            u, cd, jx, gu, 
//            lh

public class fn
    implements Callable
{
    public static interface a
    {

        public abstract bv.a a(fn fn1, JSONObject jsonobject)
            throws JSONException, InterruptedException, ExecutionException;
    }


    private final Context mContext;
    private final Object mH = new Object();
    private final u pM;
    private final fy.a tB;
    private int tq;
    private final gn ul;
    private final ai um;
    private boolean un;
    private List uo;

    public fn(Context context, u u, ai ai1, gn gn1, fy.a a1)
    {
        mContext = context;
        pM = u;
        ul = gn1;
        um = ai1;
        tB = a1;
        un = false;
        tq = -2;
        uo = null;
    }

    private bv.a a(ah ah1, a a1, JSONObject jsonobject)
        throws ExecutionException, InterruptedException, JSONException
    {
        if (cO())
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
        uo = list;
        a1 = a1.a(this, jsonobject);
        if (a1 == null)
        {
            gr.T("Failed to retrieve ad assets.");
            return null;
        } else
        {
            a1.a(new bv(pM, ah1, jsonobject));
            return a1;
        }
    }

    private fy a(bv.a a1)
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        int j = tq;
        int i;
        i = j;
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        i = j;
        if (tq == -2)
        {
            i = 0;
        }
        obj;
        JVM INSTR monitorexit ;
        if (i != -2)
        {
            a1 = null;
        }
        return new fy(tB.vJ.tL, null, tB.vK.qw, i, tB.vK.qx, uo, tB.vK.orientation, tB.vK.qA, tB.vJ.tO, false, null, null, null, null, null, 0L, tB.lS, tB.vK.tV, tB.vG, tB.vH, tB.vK.ub, tB.vD, a1);
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    private String[] b(JSONObject jsonobject, String s)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONArray(s);
        if (jsonobject == null)
        {
            return null;
        }
        s = new String[jsonobject.length()];
        for (int i = 0; i < jsonobject.length(); i++)
        {
            s[i] = jsonobject.getString(i);
        }

        return s;
    }

    private JSONObject c(ah ah1)
        throws TimeoutException, JSONException
    {
        if (cO())
        {
            return null;
        } else
        {
            gj gj1 = new gj();
            ah1.a("/nativeAdPreProcess", new cd(ah1, gj1) {

                final ah up;
                final gj uq;
                final fn ur;

                public void a(gu gu, Map map)
                {
                    up.g("/nativeAdPreProcess");
                    try
                    {
                        gu = (String)map.get("success");
                        if (!TextUtils.isEmpty(gu))
                        {
                            uq.a((new JSONObject(gu)).getJSONArray("ads").getJSONObject(0));
                            return;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (gu gu)
                    {
                        gr.b("Malformed native JSON response.", gu);
                    }
                    ur.t(0);
                    jx.a(ur.cO(), "Unable to set the ad state error!");
                    uq.a(null);
                }

            
            {
                ur = fn.this;
                up = ah1;
                uq = gj1;
                super();
            }
            });
            ah1.a("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(tB.vK.tU));
            return (JSONObject)gj1.get();
        }
    }

    private ah cN()
        throws CancellationException, ExecutionException, InterruptedException, TimeoutException
    {
        if (cO())
        {
            return null;
        } else
        {
            ah ah1 = (ah)um.a(mContext, tB.vJ.lO, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html").get();
            ah1.a(pM, pM, pM, pM, false, pM);
            return ah1;
        }
    }

    public Future a(JSONObject jsonobject, String s, boolean flag)
        throws JSONException
    {
        if (flag)
        {
            jsonobject = jsonobject.getJSONObject(s);
        } else
        {
            jsonobject = jsonobject.optJSONObject(s);
        }
        s = jsonobject;
        if (jsonobject == null)
        {
            s = new JSONObject();
        }
        if (flag)
        {
            jsonobject = s.getString("url");
        } else
        {
            jsonobject = s.optString("url");
        }
        if (TextUtils.isEmpty(jsonobject))
        {
            a(0, flag);
            return new gk(null);
        } else
        {
            return ul.a(jsonobject, new gn.a(flag) {

                final fn ur;
                final boolean us;

                public Drawable a(InputStream inputstream)
                {
                    try
                    {
                        inputstream = lh.d(inputstream);
                    }
                    // Misplaced declaration of an exception variable
                    catch (InputStream inputstream)
                    {
                        inputstream = null;
                    }
                    if (inputstream == null)
                    {
                        ur.a(2, us);
                        return null;
                    }
                    inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
                    if (inputstream == null)
                    {
                        ur.a(2, us);
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

                public Drawable cP()
                {
                    ur.a(2, us);
                    return null;
                }

                public Object cQ()
                {
                    return cP();
                }

            
            {
                ur = fn.this;
                us = flag;
                super();
            }
            });
        }
    }

    public void a(int i, boolean flag)
    {
        if (flag)
        {
            t(i);
        }
    }

    protected a b(JSONObject jsonobject)
        throws JSONException
    {
        if (cO())
        {
            return null;
        }
        jsonobject = jsonobject.getString("template_id");
        if ("2".equals(jsonobject))
        {
            return new fo();
        }
        if ("1".equals(jsonobject))
        {
            return new fp();
        } else
        {
            t(0);
            return null;
        }
    }

    public fy cM()
    {
        Object obj;
        obj = cN();
        JSONObject jsonobject = c(((ah) (obj)));
        obj = a(a(((ah) (obj)), b(jsonobject), jsonobject));
        return ((fy) (obj));
        Object obj1;
        obj1;
        gr.d("Malformed native JSON response.", ((Throwable) (obj1)));
_L2:
        if (!un)
        {
            t(0);
        }
        return a(null);
        obj1;
        gr.d("Timeout when loading native ad.", ((Throwable) (obj1)));
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean cO()
    {
        boolean flag;
        synchronized (mH)
        {
            flag = un;
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
        return cM();
    }

    public void t(int i)
    {
        synchronized (mH)
        {
            un = true;
            tq = i;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
