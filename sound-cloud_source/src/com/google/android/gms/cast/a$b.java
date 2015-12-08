// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.internal.e;
import com.google.android.gms.cast.internal.j;
import com.google.android.gms.cast.internal.m;
import com.google.android.gms.cast.internal.o;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.google.android.gms.cast:
//            a, d, c, f, 
//            e

public static interface a
{
    public static final class a
        implements a.b
    {

        public final PendingResult a(GoogleApiClient googleapiclient, String s)
        {
            return googleapiclient.zzb(new d(this, googleapiclient, s));
        }

        public final PendingResult a(GoogleApiClient googleapiclient, String s, String s1)
        {
            return googleapiclient.zzb(new c(this, googleapiclient, s, s1));
        }

        public final void a(GoogleApiClient googleapiclient)
            throws IOException, IllegalStateException
        {
            try
            {
                ((m)((e)googleapiclient.zza(o.a)).zzoA()).c();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (GoogleApiClient googleapiclient)
            {
                throw new IOException("service error");
            }
        }

        public final void a(GoogleApiClient googleapiclient, double d1)
            throws IOException, IllegalArgumentException, IllegalStateException
        {
            try
            {
                googleapiclient = (e)googleapiclient.zza(o.a);
                if (Double.isInfinite(d1) || Double.isNaN(d1))
                {
                    throw new IllegalArgumentException((new StringBuilder("Volume cannot be ")).append(d1).toString());
                }
            }
            // Misplaced declaration of an exception variable
            catch (GoogleApiClient googleapiclient)
            {
                throw new IOException("service error");
            }
            ((m)googleapiclient.zzoA()).a(d1, ((e) (googleapiclient)).d, ((e) (googleapiclient)).c);
            return;
        }

        public final void a(GoogleApiClient googleapiclient, String s, a.e e1)
            throws IOException, IllegalStateException
        {
            e e2;
            try
            {
                e2 = (e)googleapiclient.zza(o.a);
                j.a(s);
                e2.a(s);
            }
            // Misplaced declaration of an exception variable
            catch (GoogleApiClient googleapiclient)
            {
                throw new IOException("service error");
            }
            if (e1 == null)
            {
                break MISSING_BLOCK_LABEL_65;
            }
            synchronized (e2.a)
            {
                e2.a.put(s, e1);
            }
            ((m)e2.zzoA()).b(s);
            return;
            s;
            googleapiclient;
            JVM INSTR monitorexit ;
            throw s;
        }

        public final void a(GoogleApiClient googleapiclient, boolean flag)
            throws IOException, IllegalStateException
        {
            try
            {
                googleapiclient = (e)googleapiclient.zza(o.a);
                ((m)googleapiclient.zzoA()).a(flag, ((e) (googleapiclient)).d, ((e) (googleapiclient)).c);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (GoogleApiClient googleapiclient)
            {
                throw new IOException("service error");
            }
        }

        public final double b(GoogleApiClient googleapiclient)
            throws IllegalStateException
        {
            googleapiclient = (e)googleapiclient.zza(o.a);
            googleapiclient.a();