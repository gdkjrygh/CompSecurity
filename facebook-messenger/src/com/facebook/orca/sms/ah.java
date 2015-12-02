// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import com.facebook.common.init.NeedsHighPriorityInitOnBackgroundThread;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.orca.annotations.IsCallLogEnabled;
import com.facebook.orca.annotations.IsClientSmsEnabled;
import com.facebook.orca.annotations.IsClientSmsPossible;
import com.facebook.orca.annotations.IsMmsReadPermitted;
import com.facebook.orca.annotations.IsMmsReceivePermitted;
import com.facebook.orca.annotations.IsMmsSendPermitted;
import com.facebook.orca.annotations.IsSmsNotifyEnabled;
import com.facebook.orca.annotations.IsSmsReadPermitted;
import com.facebook.orca.annotations.IsSmsReceivePermitted;
import com.facebook.orca.annotations.IsSmsSendPermitted;
import com.facebook.orca.push.sms.b;
import com.facebook.sms.a;
import com.facebook.sms.annotation.HighPriHandler;
import com.facebook.sms.annotation.LowPriHandler;

// Referenced classes of package com.facebook.orca.sms:
//            ba, az, bj, aw, 
//            aa, ar, z, aq, 
//            y, ap, bk, ax, 
//            bi, av, af, au, 
//            bo, bc, a, aj, 
//            r, al, u, an, 
//            t, am, bm, ay, 
//            bn, bb, br, bf, 
//            bq, be, bd, bg, 
//            ak, ac, at, h, 
//            n, i, g, o, 
//            p, q, k, l, 
//            m, ab, as, x, 
//            ao

public class ah extends c
{

    public ah()
    {
    }

    protected void a()
    {
        a(((com.facebook.inject.ag) (new a())));
        a(com/facebook/orca/push/sms/b).a(new ba(this, null));
        a(com/facebook/sms/a/a, com/facebook/sms/annotation/HighPriHandler).a(com/facebook/orca/push/sms/b);
        a(com/facebook/orca/push/sms/a).a(new az(this, null));
        a(com/facebook/sms/a/a, com/facebook/sms/annotation/LowPriHandler).a(com/facebook/orca/push/sms/a);
        a(com/facebook/orca/sms/bj).a(new aw(this, null));
        a(com/facebook/orca/sms/aa).a(new ar(this, null));
        a(com/facebook/orca/sms/z).a(new aq(this, null));
        a(com/facebook/orca/sms/y).a(new ap(this, null));
        a(com/facebook/orca/sms/bk).a(new ax(this, null));
        a(com/facebook/orca/sms/bi).a(new av(this, null));
        a(com/facebook/orca/sms/af).a(new au(this, null)).a();
        a(com/facebook/orca/sms/bo).a(new bc(this, null));
        a(com/facebook/orca/sms/a).a(new com.facebook.orca.sms.aj(this, null));
        a(com/facebook/orca/sms/r).a(new al(this, null));
        a(com/facebook/orca/sms/u).a(new an(this, null));
        a(com/facebook/orca/sms/t).a(new am(this, null)).a();
        a(com/facebook/orca/sms/bm).a(new ay(this, null)).a();
        a(com/facebook/orca/sms/bn).a(new bb(this, null));
        a(com/facebook/orca/sms/br).a(new bf(this, null));
        a(com/facebook/orca/sms/bq).a(new be(this, null)).a();
        a(com/facebook/orca/sms/a/c).a(new bd(this, null)).a();
        a(com/facebook/orca/sms/a/b).a(new bg(this, null)).a();
        a(com/facebook/orca/sms/a/a).a(new ak(this, null)).a();
        a(com/facebook/orca/sms/ac).a(new at(this, null)).a();
        c(com/facebook/backgroundtasks/c).a(com/facebook/orca/sms/ac);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsClientSmsEnabled).c(com/facebook/orca/sms/h);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsSmsNotifyEnabled).c(com/facebook/orca/sms/n);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsClientSmsPossible).c(com/facebook/orca/sms/i);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsCallLogEnabled).c(com/facebook/orca/sms/g);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsSmsReadPermitted).c(com/facebook/orca/sms/o);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsSmsReceivePermitted).c(com/facebook/orca/sms/p);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsSmsSendPermitted).c(com/facebook/orca/sms/q);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsMmsReadPermitted).c(com/facebook/orca/sms/k);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsMmsReceivePermitted).c(com/facebook/orca/sms/l);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsMmsSendPermitted).c(com/facebook/orca/sms/m);
        a(com/facebook/orca/sms/ab).a(new as(this, null));
        a(com/facebook/base/c, com/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread).a(com/facebook/orca/sms/ab);
        a(com/facebook/orca/sms/x).a(new ao(null));
        c(com/facebook/auth/broadcast/c).a(com/facebook/orca/sms/x);
    }
}
