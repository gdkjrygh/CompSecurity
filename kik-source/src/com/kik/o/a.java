// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.o;

import com.c.b.ap;
import java.util.List;

// Referenced classes of package com.kik.o:
//            b

public final class a
{

    static com.c.b.ak.a a;
    static com.c.b.as.g b;
    static com.c.b.ak.a c;
    static com.c.b.as.g d;
    static com.c.b.ak.a e;
    static com.c.b.as.g f;
    static com.c.b.ak.a g;
    static com.c.b.as.g h;
    static com.c.b.ak.a i;
    static com.c.b.as.g j;
    static com.c.b.ak.a k;
    static com.c.b.as.g l;
    static com.c.b.ak.a m;
    static com.c.b.as.g n;
    static com.c.b.ak.a o;
    static com.c.b.as.g p;
    static com.c.b.ak.a q;
    static com.c.b.as.g r;
    private static com.c.b.ak.g s;

    public static com.c.b.ak.g a()
    {
        return s;
    }

    static com.c.b.ak.g a(com.c.b.ak.g g1)
    {
        s = g1;
        return g1;
    }

    static 
    {
        Object obj = new b();
        com.c.b.ak.g g1 = com.kik.k.a.a();
        com.c.b.ak.g.a(new String[] {
            "\n\022common_model.proto\022\006common\032\031protobuf_validation.proto\"\"\n\006XiUuid\022\013\n\003msb\030\001 \001(\020\022\013\n\003lsb\030\002 \001(\020\"M\n\rXiBareUserJid\022<\n\nlocal_part\030\001 \001(\tB(\312\235%$\b\001\022 ^[\\w\\.]{2,30}(_[A-Za-z0-9]{3})?$\"N\n\tXiUserJid\022/\n\bbare_jid\030\001 \001(\0132\025.common.XiBareUserJidB\006\312\235%\002\b\001\022\020\n\bresource\030\002 \001(\t\"\036\n\nXiUsername\022\020\n\busername\030\001 \001(\t\",\n\005XiUid\022#\n\003uid\030\001 \001(\004B\026\312\235%\0229\001\000\000\000\000\000\000\000A\377\377\377\377\377\000\000\000\",\n\005XiGid\022#\n\003gid\030\001 \001(\004B\026\312\235%\0229\000\000\000\000\000\001\000\000A\377\377\377\377\377\001\000\000\"4\n\nXiGroupJid\022&\n\nlocal_pa", "rt\030\001 \001(\tB\022\312\235%\016\b\001\022\n^\\d{13}_g$\"V\n\nXiUidOrGid\022\034\n\003uid\030\001 \001(\0132\r.common.XiUidH\000\022\034\n\003gid\030\002 \001(\0132\r.common.XiGidH\000B\f\n\nuid_or_gid\"\177\n\024XiBareUserOrGroupJid\022)\n\buser_jid\030\001 \001(\0132\025.common.XiBareUserJidH\000\022'\n\tgroup_jid\030\002 \001(\0132\022.common.XiGroupJidH\000B\023\n\021user_or_group_jidB%\n\017com.kik.ximodelB\020CommonModelProtoP\001b\006proto3"
        }, new com.c.b.ak.g[] {
            g1
        }, ((com.c.b.ak.g.a) (obj)));
        a = (com.c.b.ak.a)s.g().get(0);
        b = new com.c.b.as.g(a, new String[] {
            "Msb", "Lsb"
        });
        c = (com.c.b.ak.a)s.g().get(1);
        d = new com.c.b.as.g(c, new String[] {
            "LocalPart"
        });
        e = (com.c.b.ak.a)s.g().get(2);
        f = new com.c.b.as.g(e, new String[] {
            "BareJid", "Resource"
        });
        g = (com.c.b.ak.a)s.g().get(3);
        h = new com.c.b.as.g(g, new String[] {
            "Username"
        });
        i = (com.c.b.ak.a)s.g().get(4);
        j = new com.c.b.as.g(i, new String[] {
            "Uid"
        });
        k = (com.c.b.ak.a)s.g().get(5);
        l = new com.c.b.as.g(k, new String[] {
            "Gid"
        });
        m = (com.c.b.ak.a)s.g().get(6);
        n = new com.c.b.as.g(m, new String[] {
            "LocalPart"
        });
        o = (com.c.b.ak.a)s.g().get(7);
        p = new com.c.b.as.g(o, new String[] {
            "Uid", "Gid", "UidOrGid"
        });
        q = (com.c.b.ak.a)s.g().get(8);
        r = new com.c.b.as.g(q, new String[] {
            "UserJid", "GroupJid", "UserOrGroupJid"
        });
        obj = ap.a();
        ((ap) (obj)).a(com.kik.k.a.a);
        com.c.b.ak.g.a(s, ((ap) (obj)));
        com.kik.k.a.a();
    }
}
