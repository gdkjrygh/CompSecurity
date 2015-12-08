// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class cmv extends Fragment
    implements android.content.DialogInterface.OnCancelListener
{

    private static final bqi Z = bqi.a();
    public final SparseArray Y = new SparseArray();
    public boolean a;
    private int aa;
    private ConnectionResult ab;
    private final Handler ac = new Handler(Looper.getMainLooper());
    private cmt ad;
    public boolean b;

    public cmv()
    {
        aa = -1;
    }

    public static cmv F()
    {
        a();
        throw new NullPointerException();
    }

    static bqi G()
    {
        return Z;
    }

    private void H()
    {
        b = false;
        aa = -1;
        ab = null;
        if (ad != null)
        {
            ad.b();
            ad = null;
        }
        for (int i = 0; i < Y.size(); i++)
        {
            ((cmw)Y.valueAt(i)).b.b();
        }

    }

    static int a(cmv cmv1, int i)
    {
        cmv1.aa = i;
        return i;
    }

    static cmt a(cmv cmv1, cmt cmt1)
    {
        cmv1.ad = cmt1;
        return cmt1;
    }

    public static cmv a()
    {
        btl.b("Must be called from main thread of process");
        throw new NullPointerException();
    }

    static ConnectionResult a(cmv cmv1, ConnectionResult connectionresult)
    {
        cmv1.ab = connectionresult;
        return connectionresult;
    }

    static boolean a(cmv cmv1)
    {
        return cmv1.a;
    }

    static void b(cmv cmv1, int i)
    {
        cmv1.c(i);
    }

    static boolean b(cmv cmv1)
    {
        return cmv1.b;
    }

    private void c(int i)
    {
        Log.w("GmsSupportLifecycleFragment", "Unresolved error while connecting client. Stopping auto-manage.");
        if ((cmw)Y.get(i) != null)
        {
            cmw cmw1 = (cmw)Y.get(i);
            Y.remove(i);
            if (cmw1 != null)
            {
                cmw1.b.b(cmw1);
                cmw1.b.c();
            }
        }
        H();
    }

    static boolean c(cmv cmv1)
    {
        cmv1.b = true;
        return true;
    }

    static void d(cmv cmv1)
    {
        cmv1.H();
    }

    static Handler e(cmv cmv1)
    {
        return cmv1.ac;
    }

    public final void a(int i, int j, Intent intent)
    {
        boolean flag = true;
        i;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 55
    //                   2 39;
           goto _L1 _L2 _L3
_L1:
        i = 0;
_L4:
        if (i != 0)
        {
            H();
            return;
        } else
        {
            c(aa);
            return;
        }
_L3:
        if (bqi.a(k()) != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i = ((flag) ? 1 : 0);
          goto _L4
_L2:
        i = ((flag) ? 1 : 0);
        if (j == -1) goto _L4; else goto _L5
_L5:
        if (j == 0)
        {
            ab = new ConnectionResult(13, null);
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            b = bundle.getBoolean("resolving_error", false);
            aa = bundle.getInt("failed_client_id", -1);
            if (aa >= 0)
            {
                ab = new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent)bundle.getParcelable("failed_resolution"));
            }
        }
    }

    public final void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.a(s, filedescriptor, printwriter, as);
        for (int i = 0; i < Y.size(); i++)
        {
            filedescriptor = (cmw)Y.valueAt(i);
            printwriter.append(s).append("GoogleApiClient #").print(((cmw) (filedescriptor)).a);
            printwriter.println(":");
            ((cmw) (filedescriptor)).b.a((new StringBuilder()).append(s).append("  ").toString(), printwriter);
        }

    }

    public final void c()
    {
        super.c();
        a = true;
        if (!b)
        {
            for (int i = 0; i < Y.size(); i++)
            {
                ((cmw)Y.valueAt(i)).b.b();
            }

        }
    }

    public final void d()
    {
        super.d();
        a = false;
        for (int i = 0; i < Y.size(); i++)
        {
            ((cmw)Y.valueAt(i)).b.c();
        }

    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("resolving_error", b);
        if (aa >= 0)
        {
            bundle.putInt("failed_client_id", aa);
            bundle.putInt("failed_status", ab.c);
            bundle.putParcelable("failed_resolution", ab.d);
        }
    }

    public final void onCancel(DialogInterface dialoginterface)
    {
        int i = aa;
        new ConnectionResult(13, null);
        c(i);
    }

}
