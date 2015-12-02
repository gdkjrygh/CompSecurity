// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol;

import com.facebook.analytics.cn;
import com.facebook.http.protocol.i;
import com.facebook.inject.d;
import com.facebook.orca.annotations.IsNewPhotoUploadEnabled;
import com.facebook.orca.j.c;
import com.facebook.orca.protocol.methods.SendBroadcastMethod;
import com.facebook.orca.protocol.methods.SendWebrtcMessageMethod;
import com.facebook.orca.protocol.methods.a;
import com.facebook.orca.protocol.methods.ab;
import com.facebook.orca.protocol.methods.ae;
import com.facebook.orca.protocol.methods.af;
import com.facebook.orca.protocol.methods.al;
import com.facebook.orca.protocol.methods.ao;
import com.facebook.orca.protocol.methods.aw;
import com.facebook.orca.protocol.methods.ax;
import com.facebook.orca.protocol.methods.ay;
import com.facebook.orca.protocol.methods.az;
import com.facebook.orca.protocol.methods.e;
import com.facebook.orca.protocol.methods.g;
import com.facebook.orca.protocol.methods.h;
import com.facebook.orca.protocol.methods.j;
import com.facebook.orca.protocol.methods.k;
import com.facebook.orca.protocol.methods.l;
import com.facebook.orca.protocol.methods.n;
import com.facebook.orca.protocol.methods.o;
import com.facebook.orca.protocol.methods.s;
import com.facebook.orca.protocol.methods.v;
import com.facebook.orca.protocol.methods.w;
import com.facebook.push.mqtt.bx;

// Referenced classes of package com.facebook.orca.protocol:
//            a, d, e

class ai extends d
{

    final com.facebook.orca.protocol.d a;

    private ai(com.facebook.orca.protocol.d d1)
    {
        a = d1;
        super();
    }

    ai(com.facebook.orca.protocol.d d1, com.facebook.orca.protocol.e e1)
    {
        this(d1);
    }

    public com.facebook.orca.protocol.a a()
    {
        return new com.facebook.orca.protocol.a((i)a(com/facebook/http/protocol/i), (n)a(com/facebook/orca/protocol/methods/n), (l)a(com/facebook/orca/protocol/methods/l), (j)a(com/facebook/orca/protocol/methods/j), (o)a(com/facebook/orca/protocol/methods/o), (s)a(com/facebook/orca/protocol/methods/s), (com.facebook.orca.protocol.methods.i)a(com/facebook/orca/protocol/methods/i), (al)a(com/facebook/orca/protocol/methods/al), (SendWebrtcMessageMethod)a(com/facebook/orca/protocol/methods/SendWebrtcMessageMethod), (k)a(com/facebook/orca/protocol/methods/k), (a)a(com/facebook/orca/protocol/methods/a), (e)a(com/facebook/orca/protocol/methods/e), (SendBroadcastMethod)a(com/facebook/orca/protocol/methods/SendBroadcastMethod), (ab)a(com/facebook/orca/protocol/methods/ab), (af)a(com/facebook/orca/protocol/methods/af), (w)a(com/facebook/orca/protocol/methods/w), (h)a(com/facebook/orca/protocol/methods/h), (g)a(com/facebook/orca/protocol/methods/g), (ay)a(com/facebook/orca/protocol/methods/ay), (aw)a(com/facebook/orca/protocol/methods/aw), (v)a(com/facebook/orca/protocol/methods/v), (ax)a(com/facebook/orca/protocol/methods/ax), (ao)a(com/facebook/orca/protocol/methods/ao), (az)a(com/facebook/orca/protocol/methods/az), (ae)a(com/facebook/orca/protocol/methods/ae), (cn)a(com/facebook/analytics/cn), (bx)a(com/facebook/push/mqtt/bx), b(com/facebook/orca/a/j), (com.facebook.common.time.a)a(com/facebook/common/time/a), (com.facebook.ui.media.b.a)a(com/facebook/ui/media/b/a), (c)a(com/facebook/orca/j/c), (com.facebook.orca.photos.b.k)a(com/facebook/orca/photos/b/k), b(java/lang/Boolean, com/facebook/orca/annotations/IsNewPhotoUploadEnabled));
    }

    public Object b()
    {
        return a();
    }
}
