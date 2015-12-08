// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import com.google.a.k;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.gl.c;
import com.roidapp.photogrid.release.ao;
import com.roidapp.photogrid.release.ap;
import com.roidapp.photogrid.release.ig;
import com.roidapp.photogrid.release.ih;
import com.roidapp.photogrid.release.lc;
import com.roidapp.photogrid.release.ln;
import com.roidapp.photogrid.release.pr;
import com.roidapp.photogrid.release.ps;
import com.roidapp.photogrid.release.qz;
import com.roidapp.photogrid.release.ra;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

// Referenced classes of package com.roidapp.photogrid.common:
//            az, a, p, b

public final class bk
    implements Thread.UncaughtExceptionHandler
{

    private Context a;
    private boolean b;
    private boolean c;
    private Thread.UncaughtExceptionHandler d;

    public bk(Activity activity)
    {
        b = false;
        c = false;
        a = activity.getApplicationContext();
        d = Thread.getDefaultUncaughtExceptionHandler();
    }

    private static void a()
    {
        Object obj1;
        Object obj2;
        String s;
        HashMap hashmap;
        k k1;
        s = ap.a();
        hashmap = new HashMap();
        k1 = new k();
        hashmap.put("mode", Integer.valueOf(az.q));
        hashmap.put("folderPath", ih.C().L());
        hashmap.put("imageCount", Integer.valueOf(ih.C().K()));
        hashmap.put("layoutIndex", Integer.valueOf(ih.C().I()));
        hashmap.put("bgShapeIndex", Integer.valueOf(ih.C().A()));
        hashmap.put("bgPattenIndex0", Integer.valueOf(ih.C().y()));
        hashmap.put("bgPattenIndex1", Integer.valueOf(ih.C().z()));
        hashmap.put("bgColorPosition", Integer.valueOf(ih.C().x()));
        hashmap.put("scale", Float.valueOf(ih.C().t()));
        hashmap.put("proportion", Integer.valueOf(ih.C().u()));
        hashmap.put("proportionMode", Boolean.valueOf(ih.C().v()));
        hashmap.put("isFreeFull", Boolean.valueOf(ih.C().r()));
        hashmap.put("useBgImage", Boolean.valueOf(az.C));
        hashmap.put("customRatio", ih.C().Z());
        hashmap.put("bgImagePath", ih.C().aB());
        hashmap.put("bgImageSrcPath", ih.C().aC());
        hashmap.put("isPicBorder", Boolean.valueOf(ih.C().aD()));
        obj1 = ih.C().w();
        obj2 = pr.a().b();
        if (obj1 != null && ((List) (obj1)).size() != 0) goto _L2; else goto _L1
_L1:
        if (obj2 == null || ((List) (obj2)).size() <= 0) goto _L4; else goto _L3
_L3:
        Object obj = obj2;
_L6:
        Object obj3;
        ig aig2[];
        aig2 = new ig[ih.C().M().length];
        if (obj == null || ((List) (obj)).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_936;
        }
        obj1 = null;
        Iterator iterator = ((List) (obj)).iterator();
        obj2 = null;
        int i = 0;
        obj3 = null;
        obj = obj1;
        while (iterator.hasNext()) 
        {
            ao ao1 = (ao)iterator.next();
            if (ao1 instanceof ra)
            {
                obj1 = obj2;
                if (obj2 == null)
                {
                    obj1 = new ArrayList();
                }
                obj2 = new HashMap();
                a(((Map) (obj2)), (ra)ao1);
                a(((Map) (obj2)), ao1);
                ((ArrayList) (obj1)).add(obj2);
                obj2 = obj1;
            } else
            if (ao1 instanceof qz)
            {
                obj1 = obj3;
                if (obj3 == null)
                {
                    obj1 = new ArrayList();
                }
                obj3 = new HashMap();
                a(((Map) (obj3)), (qz)ao1);
                a(((Map) (obj3)), ao1);
                ((ArrayList) (obj1)).add(obj3);
                obj3 = obj1;
            } else
            if (ao1 instanceof ps)
            {
                obj1 = obj;
                if (obj == null)
                {
                    obj1 = new ArrayList();
                }
                obj = (ps)ao1;
                HashMap hashmap1 = new HashMap();
                hashmap1.put("baseScale", Float.valueOf(((ps) (obj)).u));
                hashmap1.put("baseOffsetX", Float.valueOf(((ps) (obj)).v));
                hashmap1.put("baseOffsetY", Float.valueOf(((ps) (obj)).w));
                hashmap1.put("mirrorH", Integer.valueOf(((ps) (obj)).K));
                hashmap1.put("bBorder", Boolean.valueOf(((ps) (obj)).g()));
                hashmap1.put("ShadowInsetNormal", Float.valueOf(((ps) (obj)).L));
                hashmap1.put("ShadowInsetBorder", Float.valueOf(((ps) (obj)).M));
                hashmap1.put("x", Float.valueOf(((ps) (obj)).I.j));
                hashmap1.put("y", Float.valueOf(((ps) (obj)).I.k));
                hashmap1.put("width", Float.valueOf(((ps) (obj)).I.l));
                hashmap1.put("height", Float.valueOf(((ps) (obj)).I.m));
                hashmap1.put("maxEdge", Float.valueOf(((ps) (obj)).I.n));
                hashmap1.put("rotate", Integer.valueOf(((ps) (obj)).I.o));
                a(((Map) (hashmap1)), ao1);
                ((ArrayList) (obj1)).add(hashmap1);
                aig2[i] = ((ps) (obj)).H;
                i++;
                obj = obj1;
            }
        }
        break MISSING_BLOCK_LABEL_900;
_L2:
        if (obj2 == null || ((List) (obj2)).size() <= 0) goto _L4; else goto _L5
_L5:
        obj = obj2;
        if (((List) (obj2)).size() > ((List) (obj1)).size()) goto _L6; else goto _L4
_L4:
        obj = obj1;
          goto _L6
        hashmap.put("textItem", obj2);
        hashmap.put("decoItem", obj3);
        hashmap.put("picItem", obj);
        ig aig1[] = ih.C().M();
        ig aig[] = aig1;
        if (aig2.length > 0)
        {
            aig = aig1;
            if (aig2[0] != null)
            {
                aig = aig2;
            }
        }
        a(aig, s);
        ih.C().a(aig);
        hashmap.put("imageStates", aig);
        obj2 = k1.a(hashmap);
        aig = new File((new StringBuilder()).append(s).append("/Content").toString());
        if (!aig.exists())
        {
            aig.mkdirs();
        }
        aig = new File(aig, "workspace_info");
        aig1 = new FileOutputStream(aig);
        aig = aig1;
        aig1.write(((String) (obj2)).getBytes());
        aig1.close();
_L8:
        return;
        aig;
        aig.printStackTrace();
        return;
        IOException ioexception1;
        ioexception1;
        aig1 = null;
_L11:
        aig = aig1;
        ioexception1.printStackTrace();
        if (aig1 == null) goto _L8; else goto _L7
_L7:
        try
        {
            aig1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ig aig[])
        {
            aig.printStackTrace();
        }
        return;
        Exception exception;
        exception;
        aig = null;
_L10:
        if (aig != null)
        {
            try
            {
                aig.close();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        throw exception;
        exception;
        if (true) goto _L10; else goto _L9
_L9:
        ioexception1;
          goto _L11
    }

    private static void a(String s, String s1)
    {
        s = new File(s);
        s1 = new File(s1);
        if (!s.exists()) goto _L2; else goto _L1
_L1:
        BufferedInputStream bufferedinputstream;
        BufferedOutputStream bufferedoutputstream;
        byte abyte0[];
        s = new FileInputStream(s);
        s1 = new FileOutputStream(s1);
        bufferedinputstream = new BufferedInputStream(s);
        bufferedoutputstream = new BufferedOutputStream(s1);
        abyte0 = new byte[1024];
_L5:
        int i = bufferedinputstream.read(abyte0);
        if (i == -1) goto _L4; else goto _L3
_L3:
        bufferedoutputstream.write(abyte0, 0, i);
          goto _L5
_L2:
        return;
_L4:
        try
        {
            bufferedoutputstream.flush();
            bufferedoutputstream.close();
            bufferedinputstream.close();
            s.close();
            s1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    private void a(StringBuffer stringbuffer, Throwable throwable, Throwable throwable1)
    {
        Object obj;
        for (; throwable != null && !b; throwable = ((Throwable) (obj)))
        {
            stringbuffer.append("Caused by:");
            stringbuffer.append(throwable.getClass().getName());
            obj = (new StringBuilder()).append(throwable.getMessage()).toString();
            if (obj != null && !((String) (obj)).equals(""))
            {
                stringbuffer.append(":").append(((String) (obj)));
            }
            stringbuffer.append("\n");
            a(stringbuffer, throwable.getStackTrace(), throwable1.getStackTrace());
            obj = throwable.getCause();
            throwable1 = throwable;
        }

    }

    private void a(StringBuffer stringbuffer, StackTraceElement astacktraceelement[], StackTraceElement astacktraceelement1[])
    {
        int i;
        int l;
        if (astacktraceelement1 == null)
        {
            break MISSING_BLOCK_LABEL_348;
        }
        l = astacktraceelement1.length;
        int j1 = astacktraceelement.length;
        i = 0;
        do
        {
            int k1 = j1 - 1;
            if (k1 < 0)
            {
                break;
            }
            int l1 = l - 1;
            if (l1 < 0)
            {
                break;
            }
            j1 = k1;
            l = l1;
            if (astacktraceelement[k1].equals(astacktraceelement1[l1]))
            {
                i++;
                j1 = k1;
                l = l1;
            }
        } while (true);
        l = 0;
_L8:
        if (l >= astacktraceelement.length - i) goto _L2; else goto _L1
_L1:
        astacktraceelement1 = astacktraceelement[l].getClassName();
        if (!c) goto _L4; else goto _L3
_L3:
        if (!astacktraceelement1.contains("zo.a(SourceFile:172)")) goto _L6; else goto _L5
_L5:
        com.roidapp.photogrid.common.a.a();
        if (!com.roidapp.photogrid.common.a.a(a)) goto _L6; else goto _L7
_L7:
        com.roidapp.photogrid.common.a.a();
        com.roidapp.photogrid.common.a.b(a);
        b = true;
_L9:
        return;
_L6:
        if (astacktraceelement1.contains("zo.a(SourceFile:172)") || astacktraceelement1.contains("java.util.concurrent.ThreadPoolExecutor.runWorker") || astacktraceelement1.contains("android.webkit.WebViewClassic") || astacktraceelement1.contains("com.google.android.gms.ads.AdActivity.onCreate") || astacktraceelement1.contains("aem.a(SourceFile:44)"))
        {
            b = true;
            return;
        }
_L4:
        StringBuilder stringbuilder = (new StringBuilder("at ")).append(astacktraceelement[l].getClassName()).append(".").append(astacktraceelement[l].getMethodName()).append("(").append(astacktraceelement[l].getFileName());
        if (astacktraceelement[l].getLineNumber() > 0)
        {
            astacktraceelement1 = (new StringBuilder(":")).append(astacktraceelement[l].getLineNumber()).toString();
        } else
        {
            astacktraceelement1 = "";
        }
        stringbuffer.append(stringbuilder.append(astacktraceelement1).append(")\n").toString());
        l++;
          goto _L8
_L2:
        stringbuffer.append("\t... ").append(Integer.toString(i)).append(" more\n");
        return;
        int i1 = astacktraceelement.length;
        int j = 0;
        while (j < i1) 
        {
            astacktraceelement1 = astacktraceelement[j];
            Object obj = astacktraceelement1.getClassName();
            if (c)
            {
                if (((String) (obj)).contains("zo.a(SourceFile:172)"))
                {
                    com.roidapp.photogrid.common.a.a();
                    if (com.roidapp.photogrid.common.a.a(a))
                    {
                        com.roidapp.photogrid.common.a.a();
                        com.roidapp.photogrid.common.a.b(a);
                        b = true;
                        return;
                    }
                }
                if (((String) (obj)).contains("zo.a(SourceFile:172)") || ((String) (obj)).contains("java.util.concurrent.ThreadPoolExecutor.runWorker") || ((String) (obj)).contains("android.webkit.WebViewClassic") || ((String) (obj)).contains("com.google.android.gms.ads.AdActivity.onCreate") || ((String) (obj)).contains("aem.a(SourceFile:44)"))
                {
                    b = true;
                    return;
                }
            }
            obj = (new StringBuilder("at ")).append(astacktraceelement1.getClassName()).append(".").append(astacktraceelement1.getMethodName()).append("(").append(astacktraceelement1.getFileName());
            if (astacktraceelement1.getLineNumber() > 0)
            {
                astacktraceelement1 = (new StringBuilder(":")).append(astacktraceelement1.getLineNumber()).toString();
            } else
            {
                astacktraceelement1 = "";
            }
            stringbuffer.append(((StringBuilder) (obj)).append(astacktraceelement1).append(")\n").toString());
            j++;
        }
          goto _L9
    }

    private static void a(Map map, ao ao1)
    {
        map.put("srcPs", ao1.n);
        map.put("dstPs", ao1.o);
        map.put("offsetDegree", Float.valueOf(ao1.l));
        map.put("offsetX", Float.valueOf(ao1.j));
        map.put("offsetY", Float.valueOf(ao1.k));
        map.put("scale", Float.valueOf(ao1.h));
        map.put("layoutWidth", Integer.valueOf(ao1.c));
        map.put("layoutHeight", Integer.valueOf(ao1.d));
        map.put("initWidth", Integer.valueOf(ao1.s));
        map.put("initHeight", Integer.valueOf(ao1.t));
        float af[] = new float[9];
        ao1.b.getValues(af);
        map.put("matrix", af);
        if (ao1 instanceof ra)
        {
            float af1[] = new float[9];
            ((ra)ao1).G.getValues(af1);
            map.put("bmMatrix", af1);
            af1 = new float[9];
            ((ra)ao1).H.getValues(af1);
            map.put("bgMatrix", af1);
            af1 = new float[9];
            ((ra)ao1).I.getValues(af1);
            map.put("tMatrix", af1);
        }
    }

    private static void a(Map map, qz qz1)
    {
        qz1.V;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 66
    //                   1 86
    //                   2 134;
           goto _L1 _L2 _L3 _L4
_L1:
        map.put("type", Integer.valueOf(qz1.V));
        map.put("mirrorH", Integer.valueOf(qz1.P));
        return;
_L2:
        map.put("imgId", Integer.valueOf(qz1.L));
        continue; /* Loop/switch isn't completed */
_L3:
        map.put("packageName", qz1.R);
        map.put("fileName", qz1.Q);
        map.put("position", Integer.valueOf(qz1.U));
        continue; /* Loop/switch isn't completed */
_L4:
        map.put("stickterPath", qz1.K);
        map.put("x", Float.valueOf(qz1.M));
        map.put("y", Float.valueOf(qz1.N));
        map.put("initScale", Float.valueOf(qz1.O));
        if (true) goto _L1; else goto _L5
_L5:
    }

    private static void a(Map map, ra ra1)
    {
        map.put("mText", ra1.r());
        map.put("mPattenScale", Float.valueOf(ra1.y()));
        map.put("mFontType", Integer.valueOf(ra1.o()));
        map.put("mTextFColor", Integer.valueOf(ra1.s()));
        map.put("mTextSColor", Integer.valueOf(ra1.t()));
        map.put("mTextShadowColor", Integer.valueOf(ra1.ax));
        map.put("mBgColorPos", Integer.valueOf(ra1.m()));
        map.put("mPattenIndex", ra1.n());
        map.put("mStrokeScale", Float.valueOf(ra1.z()));
        map.put("dx", Float.valueOf(ra1.av));
        map.put("alpha", Integer.valueOf(ra1.q()));
        map.put("radius", Float.valueOf(ra1.au));
        map.put("showShadowLayout", Boolean.valueOf(ra1.w()));
        if (ra1.E())
        {
            map.put("isTemplateTextItem", Boolean.valueOf(ra1.E()));
            map.put("bgType", Boolean.valueOf(ra1.aq));
            map.put("bgColor", Integer.valueOf(ra1.ar));
            map.put("fixedWidth", Integer.valueOf(ra1.as));
            map.put("savedWidth", Float.valueOf(ra1.at));
            map.put("bgRepeat", Integer.valueOf(ra1.ap));
            map.put("bgName", ra1.ao);
            map.put("textSize", Float.valueOf(ra1.ad));
        }
    }

    private static void a(ig aig[], String s)
    {
        for (int i = 0; i < aig.length; i++)
        {
            String s3 = aig[i].b;
            Object obj = aig[i].c;
            String s2 = aig[i].f;
            String s1 = aig[i].a;
            if (s3 != null && !s3.contains(".Workspace/Filter"))
            {
                String s5 = s3.substring(s3.lastIndexOf("/") + 1);
                File file2 = new File((new StringBuilder()).append(s).append("/Filter").toString());
                if (!file2.exists())
                {
                    file2.mkdirs();
                }
                s5 = (new StringBuilder()).append(s).append("/Filter/").append(s5).toString();
                a(s3, s5);
                aig[i].b = s5;
            }
            if (obj != null && !((String) (obj)).contains(".Workspace/Crop"))
            {
                String s4 = ((String) (obj)).substring(((String) (obj)).lastIndexOf("/") + 1);
                File file1 = new File((new StringBuilder()).append(s).append("/Crop").toString());
                if (!file1.exists())
                {
                    file1.mkdirs();
                }
                s4 = (new StringBuilder()).append(s).append("/Crop/").append(s4).toString();
                a(((String) (obj)), s4);
                aig[i].c = s4;
            }
            if (s2 != null && !s2.contains(".Workspace/VideoTemp"))
            {
                obj = s2.substring(s2.lastIndexOf("/") + 1);
                File file = new File((new StringBuilder()).append(s).append("/VideoTemp").toString());
                if (!file.exists())
                {
                    file.mkdirs();
                }
                obj = (new StringBuilder()).append(s).append("/VideoTemp/").append(((String) (obj))).toString();
                a(s2, ((String) (obj)));
                aig[i].f = ((String) (obj));
            }
            if (s1 == null || s1.contains(".Workspace/Beatuify"))
            {
                continue;
            }
            s2 = s1.substring(s1.lastIndexOf("/") + 1);
            obj = new File((new StringBuilder()).append(s).append("/Beatuify").toString());
            if (!((File) (obj)).exists())
            {
                ((File) (obj)).mkdirs();
            }
            s2 = (new StringBuilder()).append(s).append("/Beatuify/").append(s2).toString();
            a(s1, s2);
            aig[i].a = s2;
        }

    }

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        thread.getName();
        if (!ih.C().aN()) goto _L2; else goto _L1
_L1:
        az.q;
        JVM INSTR tableswitch 0 5: default 56
    //                   0 310
    //                   1 1802
    //                   2 56
    //                   3 56
    //                   4 310
    //                   5 310;
           goto _L3 _L4 _L5 _L3 _L3 _L4 _L4
_L3:
        pr.a();
        pr.c();
_L2:
        Object obj;
        Object obj1;
        Object obj2;
        obj1 = new StringBuffer();
        obj2 = n.d(a);
        ((StringBuffer) (obj1)).append((new StringBuilder("App v")).append(((String) (obj2))).append(",Model ").append(Build.MODEL).append(",OS v").append(android.os.Build.VERSION.RELEASE).append(", ").append(TimeZone.getDefault().getDisplayName(false, 0)).toString()).append("\n");
        ((StringBuffer) (obj1)).append((new StringBuilder("GPU Model ")).append(com.roidapp.baselib.gl.c.a().d(a)).toString()).append("\n");
        ((StringBuffer) (obj1)).append((new StringBuilder("Available Capacity: ")).append(p.a(a)).toString()).append("\n");
        obj = "";
        if (throwable.getClass() != null)
        {
            obj = (new StringBuilder()).append("").append(throwable.getClass().getName()).toString();
        }
        if (((String) (obj)).equals("java.lang.NullPointerException")) goto _L7; else goto _L6
_L6:
        if (!((String) (obj)).equals("java.lang.SecurityException")) goto _L9; else goto _L8
_L8:
        if (!(new StringBuilder()).append(throwable.getMessage()).toString().contains("READ_GSERVICES")) goto _L7; else goto _L10
_L10:
        return;
_L4:
        String s1 = ap.a();
        HashMap hashmap = new HashMap();
        k k1 = new k();
        hashmap.put("mode", Integer.valueOf(az.q));
        hashmap.put("folderPath", ih.C().L());
        hashmap.put("imageCount", Integer.valueOf(ih.C().K()));
        ig aig[] = ih.C().M();
        if (az.q != 3 && az.q != 2)
        {
            obj = new StringBuffer();
            if (aig != null)
            {
                for (int i = 0; i < aig.length; i++)
                {
                    obj1 = aig[i];
                    if (obj1 != null && ((ig) (obj1)).y != null && ((ig) (obj1)).y.c != null)
                    {
                        for (int j = 0; j < ((ig) (obj1)).y.c.size(); j++)
                        {
                            obj2 = (PointF)((ig) (obj1)).y.c.get(j);
                            if (obj2 != null)
                            {
                                ((StringBuffer) (obj)).append((new StringBuilder()).append(((PointF) (obj2)).x).append("#").append(((PointF) (obj2)).y).append("_").toString());
                            }
                        }

                    }
                    ((StringBuffer) (obj)).append("@");
                }

            }
            hashmap.put("points", ((StringBuffer) (obj)).toString());
            hashmap.put("layoutIndex", Integer.valueOf(ih.C().I()));
            hashmap.put("bgShapeIndex", Integer.valueOf(ih.C().A()));
            hashmap.put("bgPattenIndex0", Integer.valueOf(ih.C().y()));
            hashmap.put("bgPattenIndex1", Integer.valueOf(ih.C().z()));
            hashmap.put("bgColorPosition", Integer.valueOf(ih.C().x()));
            hashmap.put("innerspace", Float.valueOf(ih.C().R()));
            hashmap.put("outerspace", Float.valueOf(ih.C().S()));
            hashmap.put("corner_radious", Float.valueOf(ih.C().V()));
            hashmap.put("mIsNoBg", Boolean.valueOf(ih.C().B()));
            hashmap.put("scale", Float.valueOf(ih.C().t()));
            hashmap.put("proportion", Integer.valueOf(ih.C().u()));
            hashmap.put("proportionMode", Boolean.valueOf(ih.C().v()));
            hashmap.put("gridMode", Integer.valueOf(ih.C().W()));
            hashmap.put("isFitVideoEdit", Boolean.valueOf(ih.C().ax()));
            hashmap.put("customRatio", ih.C().Z());
            hashmap.put("Outer_spaceSaved", Float.valueOf(ih.C().aO()));
            hashmap.put("Inner_spaceSaved", Float.valueOf(ih.C().aQ()));
            hashmap.put("Corner_radiousSaved", Float.valueOf(ih.C().aP()));
            if (az.q == 4)
            {
                hashmap.put("bgImage", ih.C().e());
                hashmap.put("bgImageTemp", ih.C().Y());
                hashmap.put("isBgRepeat", Boolean.valueOf(ih.C().f()));
                hashmap.put("isSupportScale", Boolean.valueOf(ih.C().g()));
                hashmap.put("isSupportLayout", Boolean.valueOf(ih.C().h()));
                hashmap.put("gridPoints", ih.C().i());
                hashmap.put("maskImages", ih.C().n());
                hashmap.put("stickerImages", ih.C().p());
                hashmap.put("stikerPos", ih.C().q());
                hashmap.put("textItemsTM", ih.C().X());
                hashmap.put("gridScaleList", ih.C().j());
                hashmap.put("gridRotateList", ih.C().k());
                hashmap.put("gridOffsetList", ih.C().l());
                hashmap.put("filterInfos", ih.C().o());
                if (ih.C().W() == 4)
                {
                    hashmap.put("templateName", ln.a().d());
                }
            } else
            if (ih.C().W() == 4)
            {
                hashmap.put("gridPoints", ih.C().i());
                hashmap.put("gridScaleList", ih.C().j());
                hashmap.put("gridRotateList", ih.C().k());
                hashmap.put("gridOffsetList", ih.C().l());
                hashmap.put("maskImages", ih.C().n());
                hashmap.put("Outer_spaceSaved", Float.valueOf(ih.C().aO()));
                hashmap.put("Inner_spaceSaved", Float.valueOf(ih.C().aQ()));
                hashmap.put("Corner_radiousSaved", Float.valueOf(ih.C().aP()));
                hashmap.put("templateName", ln.a().d());
            }
            obj = pr.a().b();
            if (obj == null || ((List) (obj)).size() == 0)
            {
                obj = ih.C().w();
            }
            if (obj != null && ((List) (obj)).size() > 0)
            {
                obj1 = null;
                Iterator iterator = ((List) (obj)).iterator();
                obj = null;
                while (iterator.hasNext()) 
                {
                    ao ao1 = (ao)iterator.next();
                    if (ao1 instanceof ra)
                    {
                        obj2 = obj;
                        if (obj == null)
                        {
                            obj2 = new ArrayList();
                        }
                        obj = new HashMap();
                        a(((Map) (obj)), (ra)ao1);
                        a(((Map) (obj)), ao1);
                        ((ArrayList) (obj2)).add(obj);
                        obj = obj2;
                    } else
                    if (ao1 instanceof qz)
                    {
                        obj2 = obj1;
                        if (obj1 == null)
                        {
                            obj2 = new ArrayList();
                        }
                        obj1 = new HashMap();
                        a(((Map) (obj1)), (qz)ao1);
                        a(((Map) (obj1)), ao1);
                        ((ArrayList) (obj2)).add(obj1);
                        obj1 = obj2;
                    }
                }
                hashmap.put("textItem", obj);
                hashmap.put("decoItem", obj1);
            }
        }
        a(aig, s1);
        ih.C().a(aig);
        hashmap.put("imageStates", aig);
        obj2 = k1.a(hashmap);
        obj = new File((new StringBuilder()).append(s1).append("/Content").toString());
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).mkdirs();
        }
        obj = new File(((File) (obj)), "workspace_info");
        obj1 = new FileOutputStream(((File) (obj)));
        obj = obj1;
        ((OutputStream) (obj1)).write(((String) (obj2)).getBytes());
        try
        {
            ((OutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
          goto _L3
        obj2;
        obj1 = null;
_L13:
        obj = obj1;
        ((IOException) (obj2)).printStackTrace();
        if (obj1 != null)
        {
            try
            {
                ((OutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
          goto _L3
        thread;
        obj = null;
_L12:
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                throwable.printStackTrace();
            }
        }
        throw thread;
_L5:
        a();
          goto _L3
_L7:
        c = true;
_L9:
        String s = (new StringBuilder()).append(throwable.getMessage()).toString();
        ((StringBuffer) (obj1)).append((new StringBuilder()).append(throwable.getClass().getName()).append(":").append(s).toString()).append("\n");
        a(((StringBuffer) (obj1)), throwable.getStackTrace(), ((StackTraceElement []) (null)));
        a(((StringBuffer) (obj1)), throwable.getCause(), throwable);
        c = false;
        if (b) goto _L10; else goto _L11
_L11:
        ((StringBuffer) (obj1)).append("\n");
        ((StringBuffer) (obj1)).append(com.roidapp.photogrid.common.b.a());
        ((StringBuffer) (obj1)).append("\n\n");
        ((StringBuffer) (obj1)).append("It will be grateful if you can describe the steps which created the problem.\n\n \uFF1A) \n\n");
        ((StringBuffer) (obj1)).append("Steps:");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.EMAIL", new String[] {
            "roidappservice@gmail.com"
        });
        intent.putExtra("android.intent.extra.SUBJECT", (new StringBuilder("PhotoGrid Crash Log V")).append(((String) (obj2))).toString());
        intent.putExtra("android.intent.extra.TEXT", ((StringBuffer) (obj1)).toString());
        if (n.a(a, "com.google.android.gm"))
        {
            intent.setPackage("com.google.android.gm");
        }
        intent.setFlags(0x10000000);
        try
        {
            a.startActivity(intent);
        }
        catch (Exception exception)
        {
            intent.setPackage(null);
            a.startActivity(intent);
        }
        d.uncaughtException(thread, throwable);
        return;
        thread;
          goto _L12
        obj2;
          goto _L13
    }
}
