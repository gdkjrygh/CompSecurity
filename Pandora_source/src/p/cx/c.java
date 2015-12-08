// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.pandora.radio.data.ArtistSearchData;
import com.pandora.radio.data.GenreStationSearchData;
import com.pandora.radio.data.MusicSearchData;
import com.pandora.radio.data.SongSearchData;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.af;
import com.pandora.radio.data.f;
import com.pandora.radio.data.v;
import com.pandora.radio.data.y;
import com.pandora.radio.provider.h;
import com.pandora.radio.provider.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import org.json.JSONException;
import p.an.g;
import p.cw.b;
import p.dd.ab;
import p.dd.ac;
import p.dd.ak;
import p.dd.al;
import p.dd.ap;
import p.dd.aq;
import p.dd.at;
import p.dd.bb;
import p.dd.bc;
import p.dd.bd;
import p.dd.bg;
import p.dd.bh;
import p.dd.w;
import p.dm.l;
import p.dm.m;
import p.dm.n;
import p.dn.ad;
import p.dn.ae;
import p.dn.ag;
import p.dn.ah;
import p.dn.ai;
import p.dn.aj;
import p.dn.am;
import p.dn.an;
import p.dn.ao;
import p.dn.ar;
import p.dn.as;
import p.dn.au;
import p.dn.av;
import p.dn.aw;
import p.dn.ax;
import p.dn.ay;
import p.dn.bv;
import p.dn.bw;
import p.dn.bx;
import p.dn.k;
import p.dn.o;
import p.dn.p;
import p.dn.q;
import p.dn.r;
import p.dn.s;
import p.dn.t;
import p.dn.u;
import p.dn.x;
import p.dn.z;
import p.ds.e;
import p.l.a;
import p.l.d;
import p.l.j;

// Referenced classes of package p.cx:
//            k, x, ac, e, 
//            d, q, y, n, 
//            h

public class p.cx.c extends m
    implements p.cx.k
{
    public static class a extends p.cx.d
    {

        public transient void a(Exception exception, Object aobj[])
        {
            p.df.a.b("PandoraLink", "API call to accessory.accessoryConnect failed", exception);
        }

        public void a(Hashtable hashtable)
        {
            p.dm.m.a(hashtable);
        }

        public Object b(Object aobj[])
            throws JSONException, p.cx.q, p.cx.y, p.cx.n, RemoteException, OperationApplicationException
        {
            return c(aobj);
        }

        public transient Hashtable c(Object aobj[])
            throws JSONException, p.cx.q, p.cx.y, p.cx.n, RemoteException
        {
            return ((p.cx.x)aobj[0]).r();
        }

        public void onPostExecute(Object obj)
        {
            a((Hashtable)obj);
        }

        public a()
        {
        }
    }

    private class b extends p.cx.h
    {

        final p.cx.c a;

        public b a()
        {
            return a. new b();
        }

        public transient Object b(Object aobj[])
            throws JSONException, p.cx.q, p.cx.y, p.cx.n, RemoteException, OperationApplicationException
        {
            a.m();
            return null;
        }

        public p.cx.h b()
        {
            return a();
        }

        public void onPostExecute(Object obj)
        {
            super.onPostExecute(obj);
            a.T();
        }

        private b()
        {
            a = p.cx.c.this;
            super();
        }

    }

    private static class c extends Thread
    {

        m a;
        String b;
        int c;

        public void run()
        {
            try
            {
                p.dm.m.l((new StringBuilder()).append("Attempting Interceptor Connection to ").append(b).append(":").append(c).toString());
                p.dm.b b1 = p.dr.a.a((new StringBuilder()).append("Interceptor Client