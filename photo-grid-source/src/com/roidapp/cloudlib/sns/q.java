// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.roidapp.baselib.e.i;
import com.roidapp.baselib.e.k;
import com.roidapp.cloudlib.sns.b.a.a;
import com.roidapp.cloudlib.sns.b.a.b;
import com.roidapp.cloudlib.sns.b.a.c;
import com.roidapp.cloudlib.sns.b.a.d;
import com.roidapp.cloudlib.sns.b.a.e;
import com.roidapp.cloudlib.sns.b.a.f;
import com.roidapp.cloudlib.sns.b.a.g;
import com.roidapp.cloudlib.sns.b.a.h;
import com.roidapp.cloudlib.sns.b.n;
import com.roidapp.cloudlib.sns.b.p;
import com.roidapp.cloudlib.sns.b.w;
import com.roidapp.cloudlib.sns.b.x;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            af, n, x, r, 
//            o, l, s, t, 
//            w

public final class q
{

    private static final String A;
    private static final String B;
    private static final String C = (new StringBuilder()).append(a).append("/post/indexPost").toString();
    private static final String D;
    private static final String E = (new StringBuilder()).append(a).append("/user/indexUser").toString();
    private static final String F = (new StringBuilder()).append(a).append("/api/tagTop").toString();
    private static final String G = (new StringBuilder()).append(a).append("/tag/tagTop").toString();
    private static final String H = (new StringBuilder()).append(a).append("/post/report").toString();
    private static final String I = (new StringBuilder()).append(a).append("/api/shareTag").toString();
    private static final String J = (new StringBuilder()).append(a).append("/comment/report").toString();
    private static final String K = (new StringBuilder()).append(a).append("/user/searchName").toString();
    private static final String L = (new StringBuilder()).append(a).append("/tag/search").toString();
    private static final String M = (new StringBuilder()).append(a).append("/user/postBynickName").toString();
    private static final String N = (new StringBuilder()).append(a).append("/user/updateAvatar").toString();
    private static final String O;
    private static final String P = (new StringBuilder()).append(a).append("/user/getFirendsFromThird").toString();
    private static final String a = "http://api.adr.pt.ksmobile.com";
    private static final String b;
    private static final String c = (new StringBuilder()).append(a).append("/msg/get").toString();
    private static final String d = (new StringBuilder()).append(a).append("/like/delset").toString();
    private static final String e = (new StringBuilder()).append(a).append("/like/set").toString();
    private static final String f = (new StringBuilder()).append(a).append("/like/getList").toString();
    private static final String g = (new StringBuilder()).append(a).append("/comment/del").toString();
    private static final String h = (new StringBuilder()).append(a).append("/comment/create").toString();
    private static final String i = (new StringBuilder()).append(a).append("/comment/getList").toString();
    private static final String j = (new StringBuilder()).append(a).append("/user/getUserHotList").toString();
    private static final String k = (new StringBuilder()).append(a).append("/user/publicExplore").toString();
    private static final String l = (new StringBuilder()).append(a).append("/user/profile").toString();
    private static final String m = (new StringBuilder()).append(a).append("/user/unFollow").toString();
    private static final String n = (new StringBuilder()).append(a).append("/user/follow").toString();
    private static final String o = (new StringBuilder()).append(a).append("/post/info").toString();
    private static final String p = (new StringBuilder()).append(a).append("/post/delete").toString();
    private static final String q = (new StringBuilder()).append(a).append("/post/imgCreate").toString();
    private static final String r = (new StringBuilder()).append(a).append("/user/post").toString();
    private static final String s = (new StringBuilder()).append(a).append("/user/newFeedLogin").toString();
    private static final String t = (new StringBuilder()).append(a).append("/user/getFansList").toString();
    private static final String u = (new StringBuilder()).append(a).append("/user/getFollowList").toString();
    private static final String v = (new StringBuilder()).append(a).append("/user/signout").toString();
    private static final String w = (new StringBuilder()).append(a).append("/user/signup").toString();
    private static final String x = (new StringBuilder()).append(a).append("/user/otherPost").toString();
    private static final String y = (new StringBuilder()).append(a).append("/user/updateProfile").toString();
    private static final String z;

    public static o a(int i1, int j1, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new com.roidapp.cloudlib.sns.n(String.format(B, new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1)
        }), com/roidapp/cloudlib/sns/b/a/e, new com.roidapp.cloudlib.sns.x(w1));
        a(i1, ((o) (w1)));
        return w1;
    }

    public static o a(Context context, String s1, int i1, com.roidapp.cloudlib.sns.w w1)
    {
        context = new com.roidapp.cloudlib.sns.n(w, i.b, com/roidapp/cloudlib/sns/b/p, new r(w1, context));
        w1 = new ArrayList();
        w1.add(new k("accesstoken", s1));
        w1.add(new k("type", String.valueOf(i1)));
        context.a(w1);
        context.a(false);
        return context;
    }

    public static o a(com.roidapp.cloudlib.sns.w w1)
    {
        return new com.roidapp.cloudlib.sns.n(A, com/roidapp/cloudlib/sns/b/a/f, new com.roidapp.cloudlib.sns.x(w1));
    }

    public static o a(String s1, int i1, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new com.roidapp.cloudlib.sns.n(F, i.b, com/roidapp/cloudlib/sns/b/w, new com.roidapp.cloudlib.sns.x(w1));
        ArrayList arraylist = new ArrayList();
        arraylist.add(new k("tag", s1));
        arraylist.add(new k("minst", String.valueOf(i1)));
        arraylist.add(new k("maxst", "0"));
        arraylist.add(new k("pagesize", "20"));
        w1.a(arraylist);
        boolean flag;
        if (i1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        w1.a(flag);
        return w1;
    }

    public static o a(String s1, long l1)
    {
        l l2 = new l(v, i.b, new com.roidapp.cloudlib.sns.x(null));
        l2.a(b(s1, l1));
        l2.a(false);
        return l2;
    }

    public static o a(String s1, long l1, int i1, int j1, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new com.roidapp.cloudlib.sns.n(C, i.b, com/roidapp/cloudlib/sns/b/a/e, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("page", String.valueOf(i1)));
        s1.add(new k("pagesize", String.valueOf(j1)));
        w1.a(s1);
        a(i1, ((o) (w1)));
        return w1;
    }

    public static o a(String s1, long l1, int i1, long l2, long l3, 
            com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new com.roidapp.cloudlib.sns.n(i, i.b, com/roidapp/cloudlib/sns/b/a/a, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("pid", String.valueOf(i1)));
        s1.add(new k("limit", "20"));
        s1.add(new k("lastcid", String.valueOf(l2)));
        s1.add(new k("minst", String.valueOf(l3)));
        w1.a(s1);
        w1.a(false);
        return w1;
    }

    public static o a(String s1, long l1, int i1, long l2, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new l(g, i.b, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("pid", String.valueOf(i1)));
        s1.add(new k("cid", String.valueOf(l2)));
        w1.a(s1);
        w1.a(false);
        return w1;
    }

    public static o a(String s1, long l1, int i1, long l2, String s2, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new l(J, i.b, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("pid", String.valueOf(i1)));
        s1.add(new k("cid", String.valueOf(l2)));
        s1.add(new k("content", s2));
        w1.a(s1);
        w1.a(false);
        return w1;
    }

    public static o a(String s1, long l1, int i1, com.roidapp.cloudlib.sns.w w1)
    {
        a(i1);
        w1 = new com.roidapp.cloudlib.sns.n(u, i.b, com/roidapp/cloudlib/sns/b/a/b, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("page", String.valueOf(i1)));
        s1.add(new k("pagesize", "20"));
        w1.a(s1);
        w1.a(false);
        return w1;
    }

    public static o a(String s1, long l1, int i1, String s2, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new com.roidapp.cloudlib.sns.n(h, i.b, com/roidapp/cloudlib/sns/b/a, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("pid", String.valueOf(i1)));
        s1.add(new k("content", s2));
        w1.a(s1);
        w1.a(false);
        return w1;
    }

    public static o a(String s1, long l1, long l2, int i1, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new com.roidapp.cloudlib.sns.n(x, i.b, com/roidapp/cloudlib/sns/b/a/e, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("userid", String.valueOf(l2)));
        s1.add(new k("page", String.valueOf(i1)));
        s1.add(new k("pagesize", "10"));
        w1.a(s1);
        a(i1, ((o) (w1)));
        return w1;
    }

    public static o a(String s1, long l1, long l2, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new l(n, i.b, new s(w1));
        s1 = b(s1, l1);
        s1.add(new k("toid", String.valueOf(l2)));
        w1.a(s1);
        w1.a(false);
        return w1;
    }

    public static o a(String s1, long l1, Bundle bundle, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new l(y, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        String s2 = bundle.getString("nickname");
        if (s2 != null && !s2.isEmpty())
        {
            s1.add(new k("nickname", s2));
        }
        s2 = bundle.getString("email");
        if (s2 != null && !s2.isEmpty())
        {
            s1.add(new k("email", s2));
        }
        s2 = bundle.getString("gender");
        if (s2 != null && !s2.isEmpty())
        {
            s1.add(new k("gender", s2));
        }
        bundle = bundle.getString("birthday");
        if (bundle != null && !bundle.isEmpty())
        {
            s1.add(new k("birthday", bundle));
        }
        w1.a(s1);
        w1.a(false);
        return w1;
    }

    public static o a(String s1, long l1, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new com.roidapp.cloudlib.sns.n(c, i.b, com/roidapp/cloudlib/sns/b/a/c, new com.roidapp.cloudlib.sns.x(w1));
        w1.a(b(s1, l1));
        return w1;
    }

    public static o a(String s1, long l1, String s2, int i1, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new com.roidapp.cloudlib.sns.n(M, i.b, com/roidapp/cloudlib/sns/b/a/e, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("nickname", s2));
        s1.add(new k("page", String.valueOf(i1)));
        s1.add(new k("pagesize", "10"));
        w1.a(s1);
        w1.a(false);
        return w1;
    }

    public static o a(String s1, long l1, String s2, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new com.roidapp.cloudlib.sns.n(P, i.b, com/roidapp/cloudlib/sns/b/a/d, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("uidstr", s2));
        s1.add(new k("type", "1"));
        w1.a(s1);
        w1.a(false);
        return w1;
    }

    public static o a(String s1, long l1, String s2, String s3, String s4, String s5, com.roidapp.cloudlib.sns.w w1, 
            int i1, com.roidapp.baselib.e.d d1)
    {
        w1 = new l(q, i.b, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new com.roidapp.baselib.e.c("file", s2, s3, d1));
        s1.add(new k("content", s5));
        if (!TextUtils.isEmpty(s4))
        {
            s1.add(new k("tag", s4));
        }
        w1.a(s1);
        w1.a(false);
        w1.a(i1);
        return w1;
    }

    public static o a(String s1, long l1, boolean flag, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new com.roidapp.cloudlib.sns.n(E, i.b, com/roidapp/cloudlib/sns/b/a/d, new com.roidapp.cloudlib.sns.x(w1));
        List list = b(s1, l1);
        if (flag)
        {
            s1 = "1";
        } else
        {
            s1 = "0";
        }
        list.add(new k("official", s1));
        w1.a(list);
        return w1;
    }

    public static o a(String s1, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new com.roidapp.cloudlib.sns.n(L, i.b, com/roidapp/cloudlib/sns/b/a/g, new com.roidapp.cloudlib.sns.x(w1));
        ArrayList arraylist = new ArrayList();
        arraylist.add(new k("tag", s1));
        w1.a(arraylist);
        w1.a(false);
        return w1;
    }

    public static o a(boolean flag, String s1, com.roidapp.cloudlib.sns.w w1)
    {
        com.roidapp.cloudlib.sns.n n1 = new com.roidapp.cloudlib.sns.n(K, i.b, com/roidapp/cloudlib/sns/b/a/h, new com.roidapp.cloudlib.sns.x(w1));
        ArrayList arraylist = new ArrayList();
        if (flag)
        {
            w1 = "1";
        } else
        {
            w1 = "0";
        }
        arraylist.add(new k("isat", w1));
        arraylist.add(new k("name", s1));
        n1.a(arraylist);
        n1.a(false);
        return n1;
    }

    private static void a(int i1)
    {
        if (i1 <= 0)
        {
            throw new IllegalArgumentException("page cannot less than 1");
        } else
        {
            return;
        }
    }

    private static void a(int i1, o o1)
    {
        boolean flag = true;
        if (i1 > 1)
        {
            flag = false;
        }
        o1.a(flag);
    }

    public static o b(com.roidapp.cloudlib.sns.w w1)
    {
        return new com.roidapp.cloudlib.sns.n(z, com/roidapp/cloudlib/sns/b/a/f, new com.roidapp.cloudlib.sns.x(w1));
    }

    public static o b(String s1, long l1, int i1, com.roidapp.cloudlib.sns.w w1)
    {
        a(i1);
        w1 = new com.roidapp.cloudlib.sns.n(t, i.b, com/roidapp/cloudlib/sns/b/a/b, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("page", String.valueOf(i1)));
        s1.add(new k("pagesize", "20"));
        w1.a(s1);
        w1.a(false);
        return w1;
    }

    public static o b(String s1, long l1, long l2, int i1, com.roidapp.cloudlib.sns.w w1)
    {
        a(i1);
        w1 = new com.roidapp.cloudlib.sns.n(u, i.b, com/roidapp/cloudlib/sns/b/a/b, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("page", String.valueOf(i1)));
        s1.add(new k("pagesize", "20"));
        s1.add(new k("userid", String.valueOf(l2)));
        w1.a(s1);
        w1.a(false);
        return w1;
    }

    public static o b(String s1, long l1, long l2, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new l(m, i.b, new t(w1));
        s1 = b(s1, l1);
        s1.add(new k("toid", String.valueOf(l2)));
        w1.a(s1);
        w1.a(false);
        return w1;
    }

    public static o b(String s1, long l1, String s2, int i1, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new com.roidapp.cloudlib.sns.n(G, i.b, com/roidapp/cloudlib/sns/b/w, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("tag", s2));
        s1.add(new k("minst", String.valueOf(i1)));
        s1.add(new k("maxst", "0"));
        s1.add(new k("pagesize", "20"));
        w1.a(s1);
        boolean flag;
        if (i1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        w1.a(flag);
        return w1;
    }

    public static o b(String s1, long l1, String s2, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new com.roidapp.cloudlib.sns.n(N, i.b, com/roidapp/cloudlib/sns/b/x, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new com.roidapp.baselib.e.c("image", s2, "image/jpeg", null));
        w1.a(s1);
        w1.a(false);
        return w1;
    }

    private static List b(String s1, long l1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new k("token", s1));
        arraylist.add(new k("uid", String.valueOf(l1)));
        return arraylist;
    }

    public static o c(com.roidapp.cloudlib.sns.w w1)
    {
        return new com.roidapp.cloudlib.sns.n(D, com/roidapp/cloudlib/sns/b/a/d, new com.roidapp.cloudlib.sns.x(w1));
    }

    public static o c(String s1, long l1, int i1, com.roidapp.cloudlib.sns.w w1)
    {
        a(i1);
        w1 = new com.roidapp.cloudlib.sns.n(s, i.b, com/roidapp/cloudlib/sns/b/a/e, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("page", String.valueOf(i1)));
        s1.add(new k("pagesize", "10"));
        w1.a(s1);
        a(i1, w1);
        return w1;
    }

    public static o c(String s1, long l1, long l2, int i1, com.roidapp.cloudlib.sns.w w1)
    {
        a(i1);
        w1 = new com.roidapp.cloudlib.sns.n(t, i.b, com/roidapp/cloudlib/sns/b/a/b, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("page", String.valueOf(i1)));
        s1.add(new k("pagesize", "20"));
        s1.add(new k("userid", String.valueOf(l2)));
        w1.a(s1);
        w1.a(false);
        return w1;
    }

    public static o c(String s1, long l1, long l2, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new com.roidapp.cloudlib.sns.n(l, i.b, com/roidapp/cloudlib/sns/b/x, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("userid", String.valueOf(l2)));
        w1.a(s1);
        return w1;
    }

    public static o d(com.roidapp.cloudlib.sns.w w1)
    {
        return new com.roidapp.cloudlib.sns.n(I, com/roidapp/cloudlib/sns/b/a/f, new com.roidapp.cloudlib.sns.x(w1));
    }

    public static o d(String s1, long l1, int i1, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new com.roidapp.cloudlib.sns.n(o, i.b, com/roidapp/cloudlib/sns/b/n, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("pid", String.valueOf(i1)));
        w1.a(s1);
        return w1;
    }

    public static o e(com.roidapp.cloudlib.sns.w w1)
    {
        return new com.roidapp.cloudlib.sns.n(O, com/roidapp/cloudlib/sns/b/a/e, new com.roidapp.cloudlib.sns.x(w1));
    }

    public static o e(String s1, long l1, int i1, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new l(p, i.b, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("pid", String.valueOf(i1)));
        w1.a(s1);
        w1.a(false);
        return w1;
    }

    public static o f(String s1, long l1, int i1, com.roidapp.cloudlib.sns.w w1)
    {
        return a(s1, l1, l1, i1, w1);
    }

    public static o g(String s1, long l1, int i1, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new l(e, i.b, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("pid", String.valueOf(i1)));
        s1.add(new k("xaid", com.roidapp.baselib.d.a.c((new StringBuilder("xaid:")).append(System.currentTimeMillis()).toString())));
        w1.a(s1);
        w1.a(false);
        return w1;
    }

    public static o h(String s1, long l1, int i1, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new l(d, i.b, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("pid", String.valueOf(i1)));
        s1.add(new k("xaid", com.roidapp.baselib.d.a.c((new StringBuilder("xaid:")).append(System.currentTimeMillis()).toString())));
        w1.a(s1);
        w1.a(false);
        return w1;
    }

    public static o i(String s1, long l1, int i1, com.roidapp.cloudlib.sns.w w1)
    {
        w1 = new l(H, i.b, new com.roidapp.cloudlib.sns.x(w1));
        s1 = b(s1, l1);
        s1.add(new k("pid", String.valueOf(i1)));
        w1.a(s1);
        w1.a(false);
        return w1;
    }

    static 
    {
        String s1;
        if (com.roidapp.cloudlib.sns.af.a())
        {
            s1 = "http://d1n0nt1uck27u7.cloudfront.net/area/us";
        } else
        {
            s1 = "http://d1n0nt1uck27u7.cloudfront.net/api";
        }
        b = s1;
        z = (new StringBuilder()).append(b).append("/indexPic").toString();
        A = (new StringBuilder()).append(b).append("/indexTag").toString();
        B = (new StringBuilder()).append(b).append("/indexPost?page=%s&pagesize=%s").toString();
        D = (new StringBuilder()).append(b).append("/indexUser").toString();
        O = (new StringBuilder()).append(b).append("/newFeedNoLogin").toString();
    }
}
