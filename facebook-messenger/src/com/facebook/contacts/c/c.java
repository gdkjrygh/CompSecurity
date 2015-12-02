// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.c;

import com.facebook.g.a.a;
import com.facebook.g.a.b;

// Referenced classes of package com.facebook.contacts.c:
//            b

public class c
    implements com.facebook.contacts.c.b
{

    private final com.facebook.contacts.f.a a;

    public c(com.facebook.contacts.f.a a1)
    {
        a = a1;
    }

    public void a(b b1)
    {
        a a1 = com.facebook.g.a.a.b("parts").c("offset").c("length").c("part").f();
        b1.c("id").c("graph_api_write_id").a(com.facebook.g.a.a.b("represented_profile").c("id").c("birthday").a(com.facebook.g.a.a.b("rank").a("coeff_rank", new Object[] {
            "communication"
        }).f()).c("can_message").c("is_mobile_pushable").c("is_memorialized").a(com.facebook.g.a.a.b("timeline_cover_photo").a(com.facebook.g.a.a.b("focus").c("x").c("y").f()).a(com.facebook.g.a.a.b("photo").c("image.size(180) as image_lowres{uri,width,height}").f()).f()).c("name_search_tokens").c("__type__").f()).a(com.facebook.g.a.a.b("structured_name").a(a1).c("text").f()).a(com.facebook.g.a.a.b("phonetic_name").a(a1).c("text").f()).a(com.facebook.g.a.a.b("phones").c("is_verified").a(com.facebook.g.a.a.b("primary_field").c("id").c("label").a(com.facebook.g.a.a.b("phone").c("display_number").c("universal_number").f()).f()).f()).a(com.facebook.g.a.a.b("emails").a(com.facebook.g.a.a.b("primary_field").c("id").c("label").c("value").f()).f()).a(com.facebook.g.a.a.b("profile_picture").a("size", new Object[] {
            Integer.valueOf(a.a(com.facebook.contacts.f.b.SMALL))
        }).c("uri").d("small_picture_url").f()).a(com.facebook.g.a.a.b("profile_picture").a("size", new Object[] {
            Integer.valueOf(a.a(com.facebook.contacts.f.b.BIG))
        }).c("uri").d("big_picture_url").f()).a(com.facebook.g.a.a.b("profile_picture").a("size", new Object[] {
            Integer.valueOf(a.a(com.facebook.contacts.f.b.HUGE))
        }).c("uri").d("huge_picture_url").f());
    }
}
