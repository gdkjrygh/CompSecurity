// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ct;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.os.AsyncTask;
import com.pandora.android.data.e;
import com.pandora.android.provider.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import p.bg.bv;
import p.bg.cd;
import p.bh.i;
import p.cw.c;
import p.cx.l;
import p.cx.x;

// Referenced classes of package p.ct:
//            b, e

public class a
    implements android.bluetooth.BluetoothProfile.ServiceListener, l
{

    public static a a = null;
    boolean b;
    String c[] = {
        "Ford", "Lincoln"
    };
    ArrayList d;
    private Vector e;
    private int f;

    public a()
    {
        e = new Vector();
        f = 0;
        b = false;
        a = this;
        d = new ArrayList(Arrays.asList(c));
        b.a.b().e().a(this);
    }

    public static a a()
    {
        return a;
    }

    private void a(int j)
    {
        Vector vector;
        int k;
        vector = g();
        k = 0;
_L5:
        p.ct.b b1;
        if (k >= vector.size())
        {
            break; /* Loop/switch isn't completed */
        }
        b1 = (p.ct.b)vector.elementAt(k);
        j;
        JVM INSTR tableswitch 0 0: default 48
    //                   0 57;
           goto _L1 _L2
_L1:
        k++;
        break; /* Loop/switch isn't completed */
_L2:
        b1.a();
        if (true) goto _L1; else goto _L3
_L3:
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(String s)
    {
        p.df.a.c("AppLink [AppLinkAgent]", s);
    }

    public void a(p.ct.b b1)
    {
        if (!e.contains(b1))
        {
            e.addElement(b1);
        }
    }

    public void a(p.ct.e e1)
    {
        if (!c() && e1.e())
        {
            b(true);
        }
    }

    protected void a(boolean flag)
    {
        boolean flag1 = true;
        BluetoothAdapter bluetoothadapter = BluetoothAdapter.getDefaultAdapter();
        boolean flag2 = bluetoothadapter.getProfileProxy(b.a.h(), this, 2);
        if (!bluetoothadapter.getProfileProxy(b.a.h(), this, 1) || !flag2)
        {
            flag1 = false;
        }
        a((new StringBuilder()).append("Successfully retrieved bt profile proxys: ").append(flag1).toString());
        if (flag)
        {
            (new AsyncTask() {

                final a a;

                public transient Void a(Void avoid[])
                {
                    try
                    {
                        Thread.sleep(1000L);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Void avoid[])
                    {
                        p.df.a.c("AppLink", "Thread interrupted during retry sleep", avoid);
                    }
                    a.a(false);
                    return null;
                }

                public Object doInBackground(Object aobj[])
                {
                    return a((Void[])aobj);
                }

            
            {
                a = a.this;
                super();
            }
            }).execute(new Void[0]);
        }
    }

    public void b()
    {
        a(true);
    }

    public void b(p.ct.b b1)
    {
        int j = 0;
        do
        {
label0:
            {
                if (j < e.size())
                {
                    if (!((p.ct.b)e.elementAt(j)).equals(b1))
                    {
                        break label0;
                    }
                    e.removeElementAt(j);
                }
                return;
            }
            j++;
        } while (true);
    }

    public void b(p.ct.e e1)
    {
        a(e1);
    }

    public void b(boolean flag)
    {
        com.pandora.android.fordsync.a a1;
        boolean flag1;
        flag1 = true;
        a1 = com.pandora.android.fordsync.a.a();
        if (a1 == null) goto _L2; else goto _L1
_L1:
        boolean flag2 = (new e(b.a.h())).a();
        String s;
        int j;
        boolean flag3;
        try
        {
            j = a1.ak().a().intValue();
        }
        catch (Exception exception)
        {
            p.df.a.b("FORD", "Error determining whether proxy is permitted.", exception);
            continue; /* Loop/switch isn't completed */
        }
        if (j > 1) goto _L4; else goto _L3
_L3:
        flag2 = true;
_L9:
        if (flag2) goto _L2; else goto _L5
_L5:
        a1.k();
_L7:
        return;
_L4:
        s = a1.al().a();
        flag3 = d.contains(s);
        if (flag3)
        {
            flag2 = true;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (flag)
        {
            if (f == 3)
            {
                flag1 = false;
            }
            f = 3;
        } else
        {
            f = 0;
            flag1 = false;
        }
        if (!flag1) goto _L7; else goto _L6
_L6:
        a(0);
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public boolean c()
    {
        return d() == 3;
    }

    public int d()
    {
        return f;
    }

    public void e()
    {
        a("refreshProxy");
        if (!com.pandora.android.fordsync.a.a().G())
        {
            f();
            com.pandora.android.fordsync.a.a().H();
            if (!b)
            {
                b();
            }
        }
    }

    public void f()
    {
        a("dispose");
        com.pandora.android.fordsync.a.a().k();
    }

    public Vector g()
    {
        return e;
    }

    public Map o()
    {
        Object obj;
        Object obj2;
        obj = null;
        obj2 = com.pandora.android.fordsync.a.a();
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        return ((Map) (obj));
_L2:
        Exception exception;
        Object obj1;
        if (((com.pandora.android.fordsync.a) (obj2)).am() != null)
        {
            obj1 = ((com.pandora.android.fordsync.a) (obj2)).am().toString();
        } else
        {
            obj1 = null;
        }
        if (obj1 == null) goto _L1; else goto _L3
_L3:
        obj = new HashMap();
        ((Map) (obj)).put("HMIStatus", obj1);
        obj1 = new HashMap();
        ((Map) (obj1)).put("fordInfo", obj);
        obj = obj1;
        if (((com.pandora.android.fordsync.a) (obj2)).ak() == null) goto _L1; else goto _L4
_L4:
        obj = obj1;
        if (((com.pandora.android.fordsync.a) (obj2)).ak().a().intValue() <= 1) goto _L1; else goto _L5
_L5:
        obj2 = ((com.pandora.android.fordsync.a) (obj2)).al();
        if (((cd) (obj2)).a() != null)
        {
            ((Map) (obj1)).put("vehicleMake", ((cd) (obj2)).a());
        }
        if (((cd) (obj2)).b() != null)
        {
            ((Map) (obj1)).put("vehicleModel", ((cd) (obj2)).b());
        }
        obj = obj1;
        if (((cd) (obj2)).c() == null) goto _L1; else goto _L6
_L6:
        ((Map) (obj1)).put("vehicleYear", ((cd) (obj2)).c());
        return ((Map) (obj1));
        exception;
        p.df.a.b("AppLink", "Issue configuring device properties", exception);
        return ((Map) (obj1));
    }

    public void onServiceConnected(int j, BluetoothProfile bluetoothprofile)
    {
        bluetoothprofile = bluetoothprofile.getConnectedDevices().iterator();
        do
        {
            if (!bluetoothprofile.hasNext())
            {
                break;
            }
            BluetoothDevice bluetoothdevice = (BluetoothDevice)bluetoothprofile.next();
            if (bluetoothdevice.getName() != null && bluetoothdevice.getName().contains("SYNC"))
            {
                j = 1;
            } else
            {
                j = 0;
            }
            if (j == 0)
            {
                continue;
            }
            f = 1;
            break;
        } while (true);
    }

    public void onServiceDisconnected(int j)
    {
    }

}
