// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.cloudscan;

import android.util.Log;
import com.qihoo.security.engine.AdPluginInfo;
import com.qihoo.security.engine.ApkInfo;
import com.qihoo.security.engine.FileInfo;
import com.qihoo.security.engine.HipsActionRevise;
import com.qihoo.security.engine.cloudscan.a.a;
import com.qihoo.security.engine.cloudscan.a.d;
import com.qihoo.security.engine.cloudscan.a.e;
import com.qihoo.security.engine.cloudscan.a.g;
import com.qihoo.security.engine.cloudscan.a.h;
import com.qihoo.security.engine.cloudscan.a.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Vector;

// Referenced classes of package com.qihoo.security.engine.cloudscan:
//            QueryItem

public class b
{

    public static a a(com.qihoo.security.engine.AdPluginInfo.AdPlugin adplugin)
    {
        com.qihoo.security.engine.cloudscan.a.a.a a1 = com.qihoo.security.engine.cloudscan.a.a.a();
        a1.a(adplugin.name);
        if (adplugin.version != 0)
        {
            a1.a(adplugin.version);
        }
        return a1.a();
    }

    public static g a(FileInfo fileinfo, boolean flag)
    {
        k k1;
        com.qihoo.security.engine.cloudscan.a.g.a a1;
        k1 = null;
        if (fileinfo == null)
        {
            return null;
        }
        a1 = g.a();
        a1.a(fileinfo.filePath);
        a1.b(fileinfo.queryFlags);
        if (flag)
        {
            return a1.a();
        }
        if (fileinfo.fileType != 1) goto _L2; else goto _L1
_L1:
        k1 = a(fileinfo.apkInfo);
_L4:
        if (k1 != null)
        {
            a1.a(k1);
        }
        a1.a(fileinfo.scanType);
        return a1.a();
_L2:
        if (fileinfo.fileType == 2)
        {
            k1 = a(fileinfo.filePath);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static k a(ApkInfo apkinfo)
    {
        com.qihoo.security.engine.cloudscan.a.k.a a1;
        com.qihoo.security.engine.cloudscan.a.a a2;
        int i;
        i = 0;
        if (apkinfo == null)
        {
            return null;
        }
        a1 = k.a();
        a2 = com.qihoo.security.engine.cloudscan.a.b.a();
        a2.a(0).b("apk").b(apkinfo.versionCode).a(apkinfo.packageName).c(apkinfo.filePath).a(apkinfo.getFileSize()).d(apkinfo.maliceRank);
        if (apkinfo.upExts != null)
        {
            a2.g(apkinfo.upExts);
        }
        if (apkinfo.getSigHash() != null)
        {
            a2.c(net.jarlehansen.protobuf.javame.b.a(apkinfo.getSigHash()));
        }
        if (apkinfo.hipsAction != 0L)
        {
            a2.f(a(apkinfo.hipsAction));
        }
        if (apkinfo.adPlugins == null) goto _L2; else goto _L1
_L1:
        if (i < apkinfo.adPlugins.length) goto _L3; else goto _L2
_L2:
        return a1.a(a2.a()).a();
_L3:
        a2.a(a(apkinfo.adPlugins[i]));
        i++;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public static k a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            com.qihoo.security.engine.cloudscan.a.k.a a1 = k.a();
            com.qihoo.security.engine.cloudscan.a.a a2 = com.qihoo.security.engine.cloudscan.a.b.a();
            a2.a(0).b("elf").c(s);
            return a1.a(a2.a()).a();
        }
    }

    static net.jarlehansen.protobuf.javame.b a(long l)
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(8);
        bytebuffer.putLong(l);
        return net.jarlehansen.protobuf.javame.b.a(bytebuffer.array());
    }

    public static boolean a(g g1, FileInfo fileinfo)
    {
        byte byte0 = -1;
        if (g1 == null)
        {
            return false;
        }
        String s;
        int i;
        boolean flag;
        if (g1.d())
        {
            i = g1.c();
        } else
        {
            i = -1;
        }
        fileinfo.level = i;
        i = byte0;
        if (g1.f())
        {
            i = g1.e();
        }
        fileinfo.exLevel = i;
        if (g1.h())
        {
            s = g1.g();
        } else
        {
            s = "";
        }
        fileinfo.fileDescription = s;
        if (g1.j())
        {
            s = g1.i();
        } else
        {
            s = "";
        }
        fileinfo.softDescription = s;
        if (g1.l())
        {
            s = g1.k();
        } else
        {
            s = "";
        }
        fileinfo.trojanName = s;
        if (g1.n())
        {
            s = g1.m();
        } else
        {
            s = "";
        }
        fileinfo.extInfo = s;
        if (g1.p())
        {
            flag = g1.o();
        } else
        {
            flag = false;
        }
        fileinfo.shouldUpload = flag;
        if (g1.r())
        {
            fileinfo.SetDeleteType(g1.q());
        }
        if (g1.t())
        {
            fileinfo.canReplace = g1.s();
        }
        if (g1.M())
        {
            fileinfo.extIniInfo = g1.L();
        }
        if (g1.u().size() > 0)
        {
            fileinfo.hipsActionRevise = a(g1.u());
        }
        if (g1.x())
        {
            s = g1.w();
        } else
        {
            s = "";
        }
        fileinfo.hipsActionDescription = s;
        if (g1.v().size() > 0)
        {
            fileinfo.hipsPrivilegeRevise = a(g1.v());
        }
        if (g1.z())
        {
            s = g1.y();
        } else
        {
            s = "";
        }
        fileinfo.hipsPrivilegeDescription = s;
        if (g1.A().size() > 0)
        {
            fileinfo.adPluginInfo.AdPlugins = b(g1.A());
        }
        if (g1.C())
        {
            fileinfo.queryFrom = g1.B();
        }
        if (g1.E())
        {
            fileinfo.softClass = g1.D();
        }
        if (g1.G())
        {
            fileinfo.behavior = g1.F();
            if (fileinfo.apkInfo != null)
            {
                fileinfo.apkInfo.behavior = (int)fileinfo.behavior;
            }
        }
        if (g1.I())
        {
            fileinfo.copyright = g1.H();
        }
        if (g1.K())
        {
            fileinfo.whiteFlags = g1.J();
        }
        return true;
    }

    public static boolean a(QueryItem aqueryitem[], byte abyte0[][])
    {
        if (aqueryitem.length == abyte0.length) goto _L2; else goto _L1
_L1:
        Log.e("SerializeUtil", "bad params! array size not equal");
_L4:
        return false;
_L2:
        int i = 0;
_L6:
        QueryItem queryitem;
        if (i >= aqueryitem.length)
        {
            return true;
        }
        queryitem = aqueryitem[i];
        if (abyte0[i] == null) goto _L4; else goto _L3
_L3:
        boolean flag;
        try
        {
            flag = a(h.a(abyte0[i]).c(), queryitem.a);
        }
        // Misplaced declaration of an exception variable
        catch (QueryItem aqueryitem[])
        {
            return false;
        }
        if (!flag) goto _L4; else goto _L5
_L5:
        i++;
          goto _L6
    }

    public static HipsActionRevise[] a(Vector vector)
    {
        HipsActionRevise ahipsactionrevise[];
        int i;
        if (vector == null || vector.size() == 0)
        {
            return null;
        }
        ahipsactionrevise = new HipsActionRevise[vector.size()];
        i = 0;
_L2:
        Object obj;
        if (i >= vector.size())
        {
            return ahipsactionrevise;
        }
        obj = (d)vector.get(i);
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        ahipsactionrevise[i] = new HipsActionRevise();
        ahipsactionrevise[i].level = ((d) (obj)).d();
        ahipsactionrevise[i].value = ((d) (obj)).c();
        HipsActionRevise hipsactionrevise = ahipsactionrevise[i];
        if (((d) (obj)).f())
        {
            obj = ((d) (obj)).e();
        } else
        {
            obj = null;
        }
        hipsactionrevise.description = ((String) (obj));
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static byte[][] a(QueryItem aqueryitem[], boolean flag)
    {
        if (aqueryitem == null)
        {
            return null;
        }
        byte abyte0[][] = new byte[aqueryitem.length][];
        int i = 0;
        do
        {
            if (i >= aqueryitem.length)
            {
                return abyte0;
            }
            Object obj = h.a();
            QueryItem queryitem = aqueryitem[i];
            obj = ((com.qihoo.security.engine.cloudscan.a.h.a) (obj)).a(queryitem.b).a(queryitem.c).a(a(queryitem.a, flag)).a();
            try
            {
                abyte0[i] = ((h) (obj)).N();
            }
            // Misplaced declaration of an exception variable
            catch (QueryItem aqueryitem[])
            {
                return null;
            }
            i++;
        } while (true);
    }

    public static com.qihoo.security.engine.AdPluginInfo.AdPlugin[] b(Vector vector)
    {
        com.qihoo.security.engine.AdPluginInfo.AdPlugin aadplugin[];
        int i;
        if (vector == null || vector.size() == 0)
        {
            return null;
        }
        aadplugin = new com.qihoo.security.engine.AdPluginInfo.AdPlugin[vector.size()];
        i = 0;
_L2:
        e e1;
        if (i >= aadplugin.length)
        {
            return aadplugin;
        }
        e1 = (e)vector.get(i);
        if (e1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        aadplugin[i] = new com.qihoo.security.engine.AdPluginInfo.AdPlugin();
        com.qihoo.security.engine.AdPluginInfo.AdPlugin adplugin = aadplugin[i];
        Object obj;
        int j;
        if (e1.d())
        {
            obj = e1.c();
        } else
        {
            obj = null;
        }
        adplugin.name = ((String) (obj));
        obj = aadplugin[i];
        if (e1.h())
        {
            j = e1.g();
        } else
        {
            j = -1;
        }
        obj.level = j;
        obj = aadplugin[i];
        if (e1.f())
        {
            j = e1.e();
        } else
        {
            j = 0;
        }
        obj.version = j;
        adplugin = aadplugin[i];
        if (e1.j())
        {
            obj = e1.i();
        } else
        {
            obj = null;
        }
        adplugin.description = ((String) (obj));
        adplugin = aadplugin[i];
        if (e1.l())
        {
            obj = e1.k();
        } else
        {
            obj = null;
        }
        adplugin.viewClassName = ((String) (obj));
        adplugin = aadplugin[i];
        if (e1.n())
        {
            obj = e1.m();
        } else
        {
            obj = null;
        }
        adplugin.hostNameList = ((String) (obj));
        obj = aadplugin[i];
        if (e1.p())
        {
            j = e1.o();
        } else
        {
            j = 0;
        }
        obj.type = j;
        obj = aadplugin[i];
        if (e1.r())
        {
            j = e1.q();
        } else
        {
            j = 0;
        }
        obj.suggestOption = j;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }
}
