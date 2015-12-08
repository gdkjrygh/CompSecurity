// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.roidapp.imagelib.b.b;
import com.roidapp.imagelib.b.d;
import com.roidapp.imagelib.filter.filterinfo.CloudFilterInfo;
import com.roidapp.videolib.b.a.a.a;
import com.roidapp.videolib.c;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import jp.co.cyberagent.android.a.aa;
import jp.co.cyberagent.android.a.ab;
import jp.co.cyberagent.android.a.ac;
import jp.co.cyberagent.android.a.ad;
import jp.co.cyberagent.android.a.af;
import jp.co.cyberagent.android.a.ag;
import jp.co.cyberagent.android.a.aj;
import jp.co.cyberagent.android.a.e;
import jp.co.cyberagent.android.a.p;
import jp.co.cyberagent.android.a.q;
import jp.co.cyberagent.android.a.v;
import jp.co.cyberagent.android.a.w;
import jp.co.cyberagent.android.a.z;

public final class y
{

    private static Integer j[] = {
        Integer.valueOf(640), Integer.valueOf(320)
    };
    private int a;
    private b b;
    private Context c;
    private InputStream d;
    private Bitmap e;
    private Bitmap f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int k;
    private int l;
    private boolean m;
    private boolean n;

    public y(Context context)
    {
        a = 0;
        b = new b();
        g = false;
        h = true;
        i = false;
        k = 100;
        l = 0;
        m = false;
        n = false;
        c = context;
    }

    public static float a(int i1)
    {
        return 1.0F - (float)i1 / 100F;
    }

    private static jp.co.cyberagent.android.a.b a()
    {
        return new jp.co.cyberagent.android.a.b((byte)0);
    }

    private static float b(int i1)
    {
        float f1 = 1.0F;
        if (i1 > 0)
        {
            f1 = 1.0F + (float)i1 / 100F;
        } else
        if (i1 < 0)
        {
            return ((float)i1 + 100F) / 100F;
        }
        return f1;
    }

    public final List a(int i1, int j1, int k1)
    {
        ArrayList arraylist;
        int l1;
        arraylist = new ArrayList();
        l1 = Math.min(j1, k1);
        if (i)
        {
            v v1 = new v();
            v1.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.c, l1, l1 * l1));
            arraylist.add(v1);
        }
        i1;
        JVM INSTR tableswitch 0 46: default 272
    //                   0 420
    //                   1 3376
    //                   2 3460
    //                   3 3544
    //                   4 3628
    //                   5 3712
    //                   6 3814
    //                   7 3898
    //                   8 3982
    //                   9 4066
    //                   10 4166
    //                   11 4266
    //                   12 4366
    //                   13 4466
    //                   14 4566
    //                   15 4650
    //                   16 4752
    //                   17 4854
    //                   18 4938
    //                   19 5040
    //                   20 5060
    //                   21 5205
    //                   22 2488
    //                   23 2655
    //                   24 2739
    //                   25 2878
    //                   26 3058
    //                   27 3142
    //                   28 3281
    //                   29 1540
    //                   30 1653
    //                   31 1774
    //                   32 1939
    //                   33 2005
    //                   34 2144
    //                   35 2309
    //                   36 2393
    //                   37 694
    //                   38 815
    //                   39 936
    //                   40 1057
    //                   41 1169
    //                   42 1288
    //                   43 1471
    //                   44 581
    //                   45 449
    //                   46 282;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47 _L48
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        throw new IllegalStateException("No filter of that type!");
_L48:
        aa aa1 = new aa();
        aa1.a(b(-100));
        ag ag19 = new ag();
        ag19.a(c.getResources().openRawResource(com.roidapp.videolib.d.I));
        jp.co.cyberagent.android.a.y y9 = new jp.co.cyberagent.android.a.y();
        y9.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        w w2 = new w();
        w2.a("#ff63ce", 0.08F);
        arraylist.add(aa1);
        arraylist.add(ag19);
        arraylist.add(y9);
        arraylist.add(w2);
_L50:
        if (h)
        {
            arraylist.size();
            arraylist.add(a());
        }
        return arraylist;
_L47:
        af af1 = new af();
        ag ag20 = new ag();
        ag20.a(c.getResources().openRawResource(com.roidapp.videolib.d.w));
        jp.co.cyberagent.android.a.y y10 = new jp.co.cyberagent.android.a.y();
        y10.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        aa aa20 = new aa();
        aa20.a(b(-100));
        arraylist.add(aa20);
        arraylist.add(y10);
        arraylist.add(ag20);
        arraylist.add(af1);
        continue; /* Loop/switch isn't completed */
_L46:
        ag ag1 = new ag();
        ag1.a(c.getResources().openRawResource(com.roidapp.videolib.d.M));
        aa aa7 = new aa();
        aa7.a(b(-100));
        ab ab5 = new ab();
        ab5.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.n, l1, l1 * l1));
        arraylist.add(ag1);
        arraylist.add(aa7);
        arraylist.add(ab5);
        continue; /* Loop/switch isn't completed */
_L39:
        ag ag2 = new ag();
        ag2.a(c.getResources().openRawResource(com.roidapp.videolib.d.A));
        aa aa8 = new aa();
        aa8.a(b(-20));
        p p6 = new p();
        p6.a(3F);
        q q7 = new q();
        q7.a(27);
        arraylist.add(ag2);
        arraylist.add(q7);
        arraylist.add(aa8);
        arraylist.add(p6);
        continue; /* Loop/switch isn't completed */
_L40:
        ag ag3 = new ag();
        ag3.a(c.getResources().openRawResource(com.roidapp.videolib.d.q));
        aa aa9 = new aa();
        aa9.a(b(-17));
        p p7 = new p();
        p7.a(3F);
        q q8 = new q();
        q8.a(20);
        arraylist.add(q8);
        arraylist.add(aa9);
        arraylist.add(p7);
        arraylist.add(ag3);
        continue; /* Loop/switch isn't completed */
_L41:
        ag ag4 = new ag();
        ag4.a(c.getResources().openRawResource(com.roidapp.videolib.d.Q));
        aa aa10 = new aa();
        aa10.a(b(-22));
        p p8 = new p();
        p8.a(3F);
        q q9 = new q();
        q9.a(27);
        arraylist.add(q9);
        arraylist.add(aa10);
        arraylist.add(p8);
        arraylist.add(ag4);
        continue; /* Loop/switch isn't completed */
_L42:
        ag ag5 = new ag();
        ag5.a(c.getResources().openRawResource(com.roidapp.videolib.d.i));
        jp.co.cyberagent.android.a.y y4 = new jp.co.cyberagent.android.a.y();
        y4.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.m, l1, l1 * l1));
        w w1 = new w();
        w1.a("#773d0a", 0.12F);
        arraylist.add(ag5);
        arraylist.add(w1);
        arraylist.add(y4);
        continue; /* Loop/switch isn't completed */
_L43:
        ag ag6 = new ag();
        ag6.a(c.getResources().openRawResource(com.roidapp.videolib.d.D));
        aa aa11 = new aa();
        aa11.a(b(2));
        p p9 = new p();
        p9.a(18F);
        q q10 = new q();
        q10.a(2);
        arraylist.add(q10);
        arraylist.add(aa11);
        arraylist.add(p9);
        arraylist.add(ag6);
        continue; /* Loop/switch isn't completed */
_L44:
        aa aa2 = new aa();
        aa2.a(b(20));
        p p2 = new p();
        p2.a(10F);
        ag ag26 = new ag();
        ag26.a(c.getResources().openRawResource(com.roidapp.videolib.d.f));
        jp.co.cyberagent.android.a.y y12 = new jp.co.cyberagent.android.a.y();
        y12.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        ab ab7 = new ab();
        ab7.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.l, l1, l1 * l1));
        arraylist.add(aa2);
        arraylist.add(p2);
        arraylist.add(ag26);
        arraylist.add(ab7);
        arraylist.add(y12);
        continue; /* Loop/switch isn't completed */
_L45:
        aa aa3 = new aa();
        aa3.a(b(-100));
        ag ag21 = new ag();
        ag21.a(c.getResources().openRawResource(com.roidapp.videolib.d.c));
        arraylist.add(ag21);
        arraylist.add(aa3);
        continue; /* Loop/switch isn't completed */
_L31:
        aa aa4 = new aa();
        aa4.a(b(30));
        ag ag22 = new ag();
        ag22.a(c.getResources().openRawResource(com.roidapp.videolib.d.z));
        jp.co.cyberagent.android.a.y y11 = new jp.co.cyberagent.android.a.y();
        y11.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        arraylist.add(aa4);
        arraylist.add(ag22);
        arraylist.add(y11);
        continue; /* Loop/switch isn't completed */
_L32:
        ag ag7 = new ag();
        ag7.a(c.getResources().openRawResource(com.roidapp.videolib.d.F));
        aa aa12 = new aa();
        aa12.a(b(10));
        p p10 = new p();
        p10.a(-10F);
        z z1 = new z();
        z1.a("#957574");
        arraylist.add(ag7);
        arraylist.add(aa12);
        arraylist.add(p10);
        arraylist.add(z1);
        continue; /* Loop/switch isn't completed */
_L33:
        aa aa5 = new aa();
        aa5.a(b(20));
        p p3 = new p();
        p3.a(10F);
        ag ag27 = new ag();
        ag27.a(c.getResources().openRawResource(com.roidapp.videolib.d.P));
        z z2 = new z();
        z2.a("#8c8168");
        jp.co.cyberagent.android.a.y y13 = new jp.co.cyberagent.android.a.y();
        y13.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        arraylist.add(aa5);
        arraylist.add(p3);
        arraylist.add(ag27);
        arraylist.add(z2);
        arraylist.add(y13);
        continue; /* Loop/switch isn't completed */
_L34:
        p p1 = new p();
        p1.a(-2F);
        ag ag23 = new ag();
        ag23.a(c.getResources().openRawResource(com.roidapp.videolib.d.h));
        arraylist.add(p1);
        arraylist.add(ag23);
        continue; /* Loop/switch isn't completed */
_L35:
        jp.co.cyberagent.android.a.y y1 = new jp.co.cyberagent.android.a.y();
        y1.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        aa aa13 = new aa();
        aa13.a(b(13));
        p p11 = new p();
        p11.a(18F);
        ag ag29 = new ag();
        ag29.a(c.getResources().openRawResource(com.roidapp.videolib.d.e));
        arraylist.add(y1);
        arraylist.add(p11);
        arraylist.add(aa13);
        arraylist.add(ag29);
        continue; /* Loop/switch isn't completed */
_L36:
        q q1 = new q();
        q1.a(6);
        p p4 = new p();
        p4.a(-10F);
        aa aa15 = new aa();
        aa15.a(b(-10));
        ag ag30 = new ag();
        ag30.a(c.getResources().openRawResource(com.roidapp.videolib.d.p));
        ab ab8 = new ab();
        ab8.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.e, l1, l1 * l1));
        arraylist.add(q1);
        arraylist.add(aa15);
        arraylist.add(p4);
        arraylist.add(ag30);
        arraylist.add(ab8);
        continue; /* Loop/switch isn't completed */
_L37:
        jp.co.cyberagent.android.a.y y2 = new jp.co.cyberagent.android.a.y();
        y2.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.h, l1, l1 * l1));
        ag ag24 = new ag();
        ag24.a(c.getResources().openRawResource(com.roidapp.videolib.d.C));
        arraylist.add(y2);
        arraylist.add(ag24);
        continue; /* Loop/switch isn't completed */
_L38:
        ag ag8 = new ag();
        ag8.a(c.getResources().openRawResource(com.roidapp.videolib.d.a));
        q q2 = new q();
        q2.a(-10);
        aa aa16 = new aa();
        aa16.a(b(-100));
        arraylist.add(ag8);
        arraylist.add(q2);
        arraylist.add(aa16);
        continue; /* Loop/switch isn't completed */
_L24:
        ag ag9 = new ag();
        ag9.a(c.getResources().openRawResource(com.roidapp.videolib.d.y));
        q q3 = new q();
        q3.a(-5);
        aa aa17 = new aa();
        aa17.a(b(14));
        w w3 = new w();
        w3.a("#fcc5b5", 0.27F);
        jp.co.cyberagent.android.a.y y14 = new jp.co.cyberagent.android.a.y();
        y14.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.f, l1, l1 * l1));
        arraylist.add(ag9);
        arraylist.add(q3);
        arraylist.add(aa17);
        arraylist.add(w3);
        arraylist.add(y14);
        continue; /* Loop/switch isn't completed */
_L25:
        ag ag10 = new ag();
        ag10.a(c.getResources().openRawResource(com.roidapp.videolib.d.E));
        ab ab4 = new ab();
        ab4.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.i, l1, l1 * l1));
        arraylist.add(ag10);
        arraylist.add(ab4);
        continue; /* Loop/switch isn't completed */
_L26:
        ag ag11 = new ag();
        ag11.a(c.getResources().openRawResource(com.roidapp.videolib.d.O));
        q q4 = new q();
        q4.a(-3);
        aa aa18 = new aa();
        aa18.a(b(12));
        ab ab6 = new ab();
        ab6.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.o, l1, l1 * l1));
        arraylist.add(ag11);
        arraylist.add(q4);
        arraylist.add(aa18);
        arraylist.add(ab6);
        continue; /* Loop/switch isn't completed */
_L27:
        (new q()).a(9);
        aa aa6 = new aa();
        aa6.a(b(-12));
        p p5 = new p();
        p5.a(10F);
        ag ag28 = new ag();
        ag28.a(c.getResources().openRawResource(com.roidapp.videolib.d.d));
        w w4 = new w();
        w4.a("#85ecff", 0.12F);
        jp.co.cyberagent.android.a.y y15 = new jp.co.cyberagent.android.a.y();
        y15.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.b, l1, l1 * l1));
        arraylist.add(aa6);
        arraylist.add(p5);
        arraylist.add(ag28);
        arraylist.add(w4);
        arraylist.add(y15);
        continue; /* Loop/switch isn't completed */
_L28:
        ab ab1 = new ab();
        ab1.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.d, l1, l1 * l1));
        ag ag25 = new ag();
        ag25.a(c.getResources().openRawResource(com.roidapp.videolib.d.o));
        arraylist.add(ab1);
        arraylist.add(ag25);
        continue; /* Loop/switch isn't completed */
_L29:
        ab ab2 = new ab();
        ab2.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.g, l1, l1 * l1));
        q q5 = new q();
        q5.a(14);
        aa aa19 = new aa();
        aa19.a(b(-20));
        ag ag31 = new ag();
        ag31.a(c.getResources().openRawResource(com.roidapp.videolib.d.B));
        arraylist.add(ab2);
        arraylist.add(q5);
        arraylist.add(aa19);
        arraylist.add(ag31);
        continue; /* Loop/switch isn't completed */
_L30:
        ag ag12 = new ag();
        ag12.a(c.getResources().openRawResource(com.roidapp.videolib.d.b));
        aa aa14 = new aa();
        aa14.a(b(-100));
        q q6 = new q();
        q6.a(33);
        arraylist.add(q6);
        arraylist.add(aa14);
        arraylist.add(ag12);
        continue; /* Loop/switch isn't completed */
_L3:
        ag ag13 = new ag();
        ag13.a(c.getResources().openRawResource(com.roidapp.videolib.d.m));
        jp.co.cyberagent.android.a.y y5 = new jp.co.cyberagent.android.a.y();
        y5.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        arraylist.add(y5);
        arraylist.add(ag13);
        continue; /* Loop/switch isn't completed */
_L4:
        ag ag14 = new ag();
        ag14.a(c.getResources().openRawResource(com.roidapp.videolib.d.N));
        jp.co.cyberagent.android.a.y y6 = new jp.co.cyberagent.android.a.y();
        y6.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        arraylist.add(y6);
        arraylist.add(ag14);
        continue; /* Loop/switch isn't completed */
_L5:
        ag ag15 = new ag();
        ag15.a(c.getResources().openRawResource(com.roidapp.videolib.d.K));
        jp.co.cyberagent.android.a.y y7 = new jp.co.cyberagent.android.a.y();
        y7.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        arraylist.add(y7);
        arraylist.add(ag15);
        continue; /* Loop/switch isn't completed */
_L6:
        ag ag16 = new ag();
        ag16.a(c.getResources().openRawResource(com.roidapp.videolib.d.L));
        jp.co.cyberagent.android.a.y y8 = new jp.co.cyberagent.android.a.y();
        y8.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.k, l1, l1 * l1));
        arraylist.add(y8);
        arraylist.add(ag16);
        continue; /* Loop/switch isn't completed */
_L7:
        Object obj = new jp.co.cyberagent.android.a.y();
        ((aj) (obj)).a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        arraylist.add(obj);
        obj = new ag();
        ((ag) (obj)).a(c.getResources().openRawResource(com.roidapp.videolib.d.t));
        arraylist.add(obj);
        arraylist.add(new aa(0.5F));
        continue; /* Loop/switch isn't completed */
_L8:
        Object obj1 = new jp.co.cyberagent.android.a.y();
        ((aj) (obj1)).a(com.roidapp.imagelib.b.d.a(c.getResources(), c.k, l1, l1 * l1));
        arraylist.add(obj1);
        obj1 = new ag();
        ((ag) (obj1)).a(c.getResources().openRawResource(com.roidapp.videolib.d.k));
        arraylist.add(obj1);
        continue; /* Loop/switch isn't completed */
_L9:
        Object obj2 = new jp.co.cyberagent.android.a.y();
        ((aj) (obj2)).a(com.roidapp.imagelib.b.d.a(c.getResources(), c.k, l1, l1 * l1));
        arraylist.add(obj2);
        obj2 = new ag();
        ((ag) (obj2)).a(c.getResources().openRawResource(com.roidapp.videolib.d.s));
        arraylist.add(obj2);
        continue; /* Loop/switch isn't completed */
_L10:
        Object obj3 = new jp.co.cyberagent.android.a.y();
        ((aj) (obj3)).a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        arraylist.add(obj3);
        obj3 = new ag();
        ((ag) (obj3)).a(c.getResources().openRawResource(com.roidapp.videolib.d.n));
        arraylist.add(obj3);
        continue; /* Loop/switch isn't completed */
_L11:
        arraylist.add(new aa(0.0F));
        Object obj4 = new jp.co.cyberagent.android.a.y();
        ((aj) (obj4)).a(com.roidapp.imagelib.b.d.a(c.getResources(), c.k, l1, l1 * l1));
        arraylist.add(obj4);
        obj4 = new ag();
        ((ag) (obj4)).a(c.getResources().openRawResource(com.roidapp.videolib.d.H));
        arraylist.add(obj4);
        continue; /* Loop/switch isn't completed */
_L12:
        arraylist.add(new aa(0.0F));
        Object obj5 = new jp.co.cyberagent.android.a.y();
        ((aj) (obj5)).a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        arraylist.add(obj5);
        obj5 = new ag();
        ((ag) (obj5)).a(c.getResources().openRawResource(com.roidapp.videolib.d.g));
        arraylist.add(obj5);
        continue; /* Loop/switch isn't completed */
_L13:
        arraylist.add(new aa(0.0F));
        Object obj6 = new jp.co.cyberagent.android.a.y();
        ((aj) (obj6)).a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        arraylist.add(obj6);
        obj6 = new ag();
        ((ag) (obj6)).a(c.getResources().openRawResource(com.roidapp.videolib.d.G));
        arraylist.add(obj6);
        continue; /* Loop/switch isn't completed */
_L14:
        arraylist.add(new aa(0.0F));
        Object obj7 = new jp.co.cyberagent.android.a.y();
        ((aj) (obj7)).a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        arraylist.add(obj7);
        obj7 = new ag();
        ((ag) (obj7)).a(c.getResources().openRawResource(com.roidapp.videolib.d.x));
        arraylist.add(obj7);
        continue; /* Loop/switch isn't completed */
_L15:
        arraylist.add(new aa(0.0F));
        Object obj8 = new jp.co.cyberagent.android.a.y();
        ((aj) (obj8)).a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        arraylist.add(obj8);
        obj8 = new ag();
        ((ag) (obj8)).a(c.getResources().openRawResource(com.roidapp.videolib.d.r));
        arraylist.add(obj8);
        continue; /* Loop/switch isn't completed */
_L16:
        Object obj9 = new jp.co.cyberagent.android.a.y();
        ((aj) (obj9)).a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        arraylist.add(obj9);
        obj9 = new ag();
        ((ag) (obj9)).a(c.getResources().openRawResource(com.roidapp.videolib.d.u));
        arraylist.add(obj9);
        continue; /* Loop/switch isn't completed */
_L17:
        arraylist.add(new aa(1.4F));
        Object obj10 = new jp.co.cyberagent.android.a.y();
        ((aj) (obj10)).a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        arraylist.add(obj10);
        obj10 = new ag();
        ((ag) (obj10)).a(c.getResources().openRawResource(com.roidapp.videolib.d.l));
        arraylist.add(obj10);
        continue; /* Loop/switch isn't completed */
_L18:
        Object obj11 = new jp.co.cyberagent.android.a.y();
        ((aj) (obj11)).a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        arraylist.add(obj11);
        arraylist.add(new aa(0.8F));
        obj11 = new ag();
        ((ag) (obj11)).a(c.getResources().openRawResource(com.roidapp.videolib.d.J));
        arraylist.add(obj11);
        continue; /* Loop/switch isn't completed */
_L19:
        Object obj12 = new jp.co.cyberagent.android.a.y();
        ((aj) (obj12)).a(com.roidapp.imagelib.b.d.a(c.getResources(), c.j, l1, l1 * l1));
        arraylist.add(obj12);
        obj12 = new ag();
        ((ag) (obj12)).a(c.getResources().openRawResource(com.roidapp.videolib.d.j));
        arraylist.add(obj12);
        continue; /* Loop/switch isn't completed */
_L20:
        arraylist.add(new aa(0.5F));
        Object obj13 = new jp.co.cyberagent.android.a.y();
        ((aj) (obj13)).a(com.roidapp.imagelib.b.d.a(c.getResources(), c.k, l1, l1 * l1));
        arraylist.add(obj13);
        obj13 = new ag();
        ((ag) (obj13)).a(c.getResources().openRawResource(com.roidapp.videolib.d.v));
        arraylist.add(obj13);
        continue; /* Loop/switch isn't completed */
_L21:
        arraylist.add(new ad(j1, k1));
        continue; /* Loop/switch isn't completed */
_L22:
        arraylist.add(new ac(j1, k1));
        if (d != null)
        {
            ag ag17 = new ag();
            ag17.a(d);
            arraylist.add(ag17);
        }
        if (f != null && !f.isRecycled())
        {
            ab ab3 = new ab();
            ab3.a(f);
            arraylist.add(ab3);
        }
        if (e != null && !e.isRecycled())
        {
            v v2 = new v();
            v2.a(e);
            arraylist.add(v2);
        }
        continue; /* Loop/switch isn't completed */
_L23:
        if (e != null && !e.isRecycled())
        {
            jp.co.cyberagent.android.a.y y3 = new jp.co.cyberagent.android.a.y();
            y3.a(e);
            arraylist.add(y3);
        }
        if (d != null)
        {
            ag ag18 = new ag();
            ag18.a(d);
            arraylist.add(ag18);
        }
        if (true) goto _L50; else goto _L49
_L49:
    }

    public final List a(CloudFilterInfo cloudfilterinfo, int i1, int j1)
    {
        Object obj;
        i1 = Math.min(i1, j1);
        obj = new com.roidapp.videolib.b.a.b();
        ((com.roidapp.videolib.b.a.b) (obj)).a(0, Integer.valueOf(i1));
        ((com.roidapp.videolib.b.a.b) (obj)).a(1, Integer.valueOf(i1 * i1));
        cloudfilterinfo.b;
        JVM INSTR tableswitch 1021 1023: default 68
    //                   1021 76
    //                   1022 92
    //                   1023 108;
           goto _L1 _L2 _L3 _L4
_L1:
        cloudfilterinfo = null;
_L6:
        if (cloudfilterinfo == null)
        {
            return null;
        }
        break; /* Loop/switch isn't completed */
_L2:
        cloudfilterinfo = new com.roidapp.videolib.b.a.a.b(c, cloudfilterinfo);
        continue; /* Loop/switch isn't completed */
_L3:
        cloudfilterinfo = new a(c, cloudfilterinfo);
        continue; /* Loop/switch isn't completed */
_L4:
        cloudfilterinfo = new com.roidapp.videolib.b.a.a.c(c, cloudfilterinfo);
        if (true) goto _L6; else goto _L5
_L5:
        obj = cloudfilterinfo.(((com.roidapp.videolib.b.a.b) (obj)));
        if (i)
        {
            cloudfilterinfo = new v();
            cloudfilterinfo.a(com.roidapp.imagelib.b.d.a(c.getResources(), c.c, i1, i1 * i1));
            ((List) (obj)).add(0, cloudfilterinfo);
        }
        if (g)
        {
            new e();
            throw new NullPointerException();
        }
        if (h)
        {
            ((List) (obj)).size();
            ((List) (obj)).add(a());
        }
        return ((List) (obj));
    }

}
