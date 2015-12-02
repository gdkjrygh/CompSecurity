// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.picker;

import com.facebook.auth.userscope.UserScoped;
import com.facebook.backgroundtasks.f;
import com.facebook.contacts.picker.n;
import com.facebook.contacts.picker.u;
import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;
import com.facebook.orca.annotations.ForAddressBook;
import com.facebook.orca.annotations.ForContactMultiPicker;
import com.facebook.orca.annotations.ForDivebarList;
import com.facebook.orca.annotations.ForFacebookList;
import com.facebook.orca.annotations.ForFavoritePickerList;
import com.facebook.orca.annotations.ForMergedComposer;
import com.facebook.orca.annotations.IsDisplayGroupsInDivebarEnabled;
import com.facebook.orca.annotations.IsDivebarContactsUploaderPermitted;
import com.facebook.orca.annotations.ShowPresenceInfoInContactPicker;
import com.facebook.orca.contacts.a.d;
import com.facebook.orca.contacts.a.j;
import com.facebook.orca.contacts.a.k;
import com.facebook.orca.contacts.annotations.IsGroupsMegaphoneEnabled;
import com.facebook.orca.contacts.divebar.ad;
import com.facebook.orca.contacts.divebar.ao;
import com.facebook.orca.contacts.divebar.ap;
import com.facebook.orca.contacts.divebar.bk;
import com.facebook.orca.contacts.divebar.bl;
import com.facebook.orca.contacts.divebar.e;
import com.facebook.orca.contacts.divebar.h;
import com.facebook.orca.contacts.favorites.SupportGroupsInFavorites;
import com.facebook.orca.contacts.favorites.aa;
import com.facebook.orca.contacts.favorites.ag;
import com.facebook.orca.contacts.favorites.ai;
import com.facebook.orca.contacts.favorites.ak;
import com.facebook.orca.protocol.methods.i;

// Referenced classes of package com.facebook.orca.contacts.picker:
//            bq, cd, by, cf, 
//            bz, bl, m, bk, 
//            ac, bm, bf, bp, 
//            be, bo, i, ak, 
//            az, bn, bx, bv, 
//            bu, cb, ca, bs, 
//            bg, cc, br, bt, 
//            bw

public class bi extends c
{

    public bi()
    {
    }

    protected void a()
    {
        f(com/facebook/backgroundtasks/f);
        a(com/facebook/orca/contacts/divebar/e).a(new bq(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/contacts/a/e).a(new cd(this, null)).d(com/facebook/auth/userscope/UserScoped);
        a(com/facebook/orca/contacts/favorites/aa).a(new by(this, null));
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsDisplayGroupsInDivebarEnabled).c(com/facebook/orca/contacts/a/d);
        a(java/lang/Boolean).a(com/facebook/orca/contacts/favorites/SupportGroupsInFavorites).c(com/facebook/orca/contacts/favorites/ak);
        a(java/lang/Boolean).a(com/facebook/orca/annotations/ShowPresenceInfoInContactPicker).c(com/facebook/orca/contacts/picker/cf);
        a(com/facebook/orca/protocol/methods/i).a(new bz(this, null));
        a(com/facebook/contacts/picker/n).a(new com.facebook.orca.contacts.picker.bl(this, null));
        a(com/facebook/orca/contacts/picker/m).a(new com.facebook.orca.contacts.picker.bk(this, null));
        a(com/facebook/orca/contacts/picker/ac).a(new bm(this, null));
        a(com/facebook/orca/contacts/picker/bf).a(new bp(this, null));
        a(com/facebook/orca/contacts/picker/be).a(new bo(this, null));
        a(com/facebook/contacts/picker/u).a(com/facebook/orca/annotations/ForDivebarList).a(new k());
        a(com/facebook/contacts/picker/u).a(com/facebook/orca/annotations/ForMergedComposer).a(new j());
        a(com/facebook/contacts/picker/u).a(com/facebook/orca/annotations/ForFacebookList).a(new com.facebook.orca.contacts.a.a());
        a(com/facebook/contacts/picker/u).a(com/facebook/orca/annotations/ForAddressBook).a(new com.facebook.orca.contacts.picker.bk(this, null));
        a(com/facebook/contacts/picker/u).a(com/facebook/orca/annotations/ForFavoritePickerList).c(com/facebook/orca/contacts/picker/i);
        a(com/facebook/contacts/picker/u).a(com/facebook/orca/annotations/ForContactMultiPicker).a(com.google.inject.b.a.a(null));
        a(((com.facebook.inject.ag) (new com.facebook.orca.contacts.picker.ak(com/facebook/orca/annotations/ForFacebookList))));
        a(((com.facebook.inject.ag) (new com.facebook.orca.contacts.picker.ak(com/facebook/orca/annotations/ForAddressBook))));
        a(((com.facebook.inject.ag) (new com.facebook.orca.contacts.picker.ak(com/facebook/orca/annotations/ForFavoritePickerList))));
        a(((com.facebook.inject.ag) (new com.facebook.orca.contacts.picker.ak(com/facebook/orca/annotations/ForDivebarList))));
        a(((com.facebook.inject.ag) (new com.facebook.orca.contacts.picker.ak(com/facebook/orca/annotations/ForMergedComposer))));
        a(((com.facebook.inject.ag) (new com.facebook.orca.contacts.picker.ak(com/facebook/orca/annotations/ForContactMultiPicker))));
        a(com/facebook/orca/contacts/picker/az).a(new bn(null));
        a(com/facebook/orca/contacts/divebar/bk).a(new bx(this, null));
        a(com/facebook/orca/contacts/divebar/ad).a(new bv(this, null));
        a(com/facebook/orca/contacts/divebar/ao).a(new bu(this, null)).a();
        a(com/facebook/orca/contacts/favorites/ag).a(new cb(this, null));
        a(com/facebook/orca/contacts/favorites/ai).a(new ca(this, null)).a();
        a(com/facebook/orca/common/ui/titlebar/a).a(new bs(this, null));
        a(com/facebook/orca/contacts/picker/bg).a(new cc(this, null));
        a(com/facebook/orca/contacts/divebar/h).a(new br(this, null));
        a(java/lang/Boolean).a(com/facebook/orca/annotations/IsDivebarContactsUploaderPermitted).c(com/facebook/orca/contacts/a/e);
        a(com/facebook/orca/contacts/divebar/aa).a(new bt(null)).a();
        a(java/lang/Boolean).a(com/facebook/orca/contacts/annotations/IsGroupsMegaphoneEnabled).c(com/facebook/orca/contacts/a/h);
        a(com/facebook/orca/contacts/divebar/ap).a(new bw(null));
        c(com/facebook/orca/contacts/divebar/bl);
        c(com/facebook/contacts/a/a).a(com/facebook/orca/contacts/divebar/e).a(com/facebook/contacts/a/d);
    }
}
