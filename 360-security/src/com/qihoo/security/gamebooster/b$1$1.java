// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.qihoo.security.gamebooster:
//            b, g, h, LocalGamePkg

class a
    implements Runnable
{

    final lean.set a;

    public void run()
    {
        b.a(a.a, false);
        b.i(a.a).set(false);
    }

    ref(ref ref)
    {
        a = ref;
        super();
    }

    // Unreferenced inner class com/qihoo/security/gamebooster/b$1

/* anonymous class */
    class b._cls1 extends Handler
    {

        final b a;

        public void handleMessage(Message message)
        {
            boolean flag;
            boolean flag2;
            boolean flag3;
            boolean flag4;
            flag3 = true;
            flag2 = true;
            flag4 = false;
            flag = false;
            if (message != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            message.what;
            JVM INSTR tableswitch 1 12: default 84
        //                       1 85
        //                       2 102
        //                       3 248
        //                       4 256
        //                       5 456
        //                       6 307
        //                       7 180
        //                       8 571
        //                       9 579
        //                       10 630
        //                       11 788
        //                       12 976;
               goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L15:
            continue; /* Loop/switch isn't completed */
_L3:
            return;
_L4:
            message = (b.b)message.obj;
            a.a(message);
            return;
_L5:
            if (b.a(a) == null)
            {
                b.b(a).sendMessage(b.b(a).obtainMessage(7, message.obj));
                return;
            }
            b.c(a);
            g g1 = b.a(a).e();
            message = (h)message.obj;
            if (message != null)
            {
                b.a(a, message, g1);
                return;
            }
            continue; /* Loop/switch isn't completed */
_L10:
            b.a(a, b.d(a));
            if (b.a(a) == null)
            {
                b.e(a);
            }
            if (message.obj != null)
            {
                g g2 = b.a(a).e();
                message = (h)message.obj;
                b.a(a, message, g2);
                return;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            b.f(a);
            return;
_L7:
            b.a(a, (g)message.obj);
            b.b(a, b.a(a));
            message = new Intent("com.qihoo.security.gamebooster.LocalGamePackageUpdate");
            b.g(a).sendBroadcast(message);
            return;
_L9:
            Object obj = (String)message.obj;
            message = b.d(a);
            if (message != null)
            {
                Object obj1 = new HashSet();
                ((Set) (obj1)).add(obj);
                obj1 = b.a(a, ((Set) (obj1)));
                if (((List) (obj1)).size() > 0)
                {
                    obj1 = (LocalGamePkg)((List) (obj1)).get(0);
                    List list2 = message.c();
                    if (b.a(list2, ((String) (obj))) == null)
                    {
                        list2.add(obj1);
                    }
                    obj1 = message.a();
                    obj = b.a(((List) (obj1)), ((String) (obj)));
                    if (obj != null)
                    {
                        ((List) (obj1)).remove(obj);
                    }
                    b.a(a, message);
                    b.b(a, message);
                    b.g(a).sendBroadcast(new Intent("com.qihoo.security.gamebooster.LocalGamePackageUpdate"));
                    return;
                }
            }
            continue; /* Loop/switch isn't completed */
_L8:
            List list1;
            Object obj2;
            obj2 = (String)message.obj;
            message = b.d(a);
            if (message == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            List list = message.c();
            list1 = message.a();
            LocalGamePkg localgamepkg2 = b.a(list, ((String) (obj2)));
            obj2 = b.a(list1, ((String) (obj2)));
            if (localgamepkg2 == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            list.remove(localgamepkg2);
_L17:
            b.a(a, message);
            b.b(a, message);
            b.g(a).sendBroadcast(new Intent("com.qihoo.security.gamebooster.LocalGamePackageUpdate"));
            return;
            if (obj2 == null) goto _L1; else goto _L16
_L16:
            list1.remove(obj2);
              goto _L17
_L11:
            b.h(a);
            return;
_L12:
            if (b.i(a).compareAndSet(false, true))
            {
                (new Thread(new b._cls1._cls1(this))).start();
                return;
            } else
            {
                b.b(a).sendEmptyMessageDelayed(9, 3000L);
                return;
            }
_L13:
            message = (String)message.obj;
            if (b.a(a) == null)
            {
                b.e(a);
            }
            LocalGamePkg localgamepkg = new LocalGamePkg(message, LocalGamePkg.State.UserAdd, System.currentTimeMillis());
            if (b.a(b.a(a).c(), message) == null)
            {
                b.a(a).c().add(localgamepkg);
                flag = true;
            }
            message = b.a(b.a(a).a(), message);
            if (message != null)
            {
                b.a(a).a().remove(message);
                flag = flag2;
            }
            if (flag)
            {
                b.b(a, b.a(a));
                message = new Intent("com.qihoo.security.gamebooster.LocalGamePackageUpdate");
                b.g(a).sendBroadcast(message);
                return;
            }
            continue; /* Loop/switch isn't completed */
_L14:
            message = (String)message.obj;
            if (b.a(a) == null)
            {
                b.e(a);
            }
            LocalGamePkg localgamepkg1 = b.a(b.a(a).c(), message);
            boolean flag1 = flag4;
            if (localgamepkg1 != null)
            {
                b.a(a).c().remove(localgamepkg1);
                flag1 = true;
            }
            if (b.a(b.a(a).a(), message) == null)
            {
                if (localgamepkg1 != null)
                {
                    b.a(a).a().add(localgamepkg1);
                    flag1 = flag3;
                } else
                {
                    b.a(a).a().add(new LocalGamePkg(message, LocalGamePkg.State.UserAdd, System.currentTimeMillis()));
                    flag1 = flag3;
                }
            }
            if (flag1)
            {
                b.b(a, b.a(a));
                message = new Intent("com.qihoo.security.gamebooster.LocalGamePackageUpdate");
                b.g(a).sendBroadcast(message);
                return;
            }
            continue; /* Loop/switch isn't completed */
            if (!SharedPref.b(b.g(a), "game_booster_first_exit_home_actvity", false)) goto _L1; else goto _L18
_L18:
            message = SharedPref.b(b.g(a), "sp_key_has_create_game_booster_shortcut", "");
            if (TextUtils.isEmpty(message) || !"1.0.8.3742".equals(message))
            {
                b.h(a);
                return;
            }
            if (true) goto _L1; else goto _L19
_L19:
        }

            
            {
                a = b1;
                super(looper);
            }
    }

}
