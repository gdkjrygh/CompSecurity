// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.v4.g.a;
import com.google.android.gms.wearable.Asset;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import com.tinder.e.g;
import com.tinder.enums.UserPhotoSize;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.f;
import com.tinder.managers.z;
import com.tinder.model.CommonConnection;
import com.tinder.model.ConnectionsGroup;
import com.tinder.model.Interest;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.User;
import com.tinder.model.WearUser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.tinder.utils:
//            ag, v

public final class ae
{
    public static interface a
    {

        public abstract void a(List list);
    }

    protected static final class b
    {

        List a;
        List b;
        Asset c;

        public final void a(Bitmap bitmap)
        {
            try
            {
                c = com.tinder.utils.ag.a(bitmap);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap)
            {
                v.b(bitmap.toString());
            }
        }

        public b()
        {
            c = null;
            a = new ArrayList();
            b = new ArrayList();
        }
    }

    private final class c
        implements x, g
    {

        public User a;
        public String b;
        public boolean c;
        public final ae d;
        private final UserPhotoSize e;
        private b f;
        private boolean g;

        public final void a()
        {
            boolean flag1 = true;
            boolean flag;
            if (f.c != null || g)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && c)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                ae ae1 = d;
                User user = a;
                b b1 = f;
                ae1.c.put(user, b1);
                (new StringBuilder("ENTER ")).append(ae1.c.size()).append(" of ").append(ae1.e);
                if (ae1.c.size() == ae1.e)
                {
                    ArrayList arraylist = new ArrayList();
                    Object obj;
                    for (Iterator iterator = ae1.c.keySet().iterator(); iterator.hasNext(); arraylist.add(obj))
                    {
                        obj = (User)iterator.next();
                        b b2 = (b)ae1.c.get(obj);
                        obj = new WearUser(((User) (obj)).getId(), ((User) (obj)).getName(), ((User) (obj)).getAge(), ((User) (obj)).getBio(), b2.b, b2.a);
                        ((WearUser) (obj)).setAsset(b2.c);
                    }

                    if (ae1.f != null)
                    {
                        ae1.f.a(arraylist);
                    }
                }
            }
        }

        public final void a(ConnectionsGroup connectionsgroup)
        {
            ArrayList arraylist = new ArrayList(connectionsgroup.getCompleteConnections().size());
            connectionsgroup = connectionsgroup.getCompleteConnections().iterator();
            do
            {
                if (!connectionsgroup.hasNext())
                {
                    break;
                }
                CommonConnection commonconnection = (CommonConnection)connectionsgroup.next();
                if (commonconnection.name != null)
                {
                    arraylist.add(commonconnection.name);
                }
            } while (true);
            f.a = arraylist;
        }

        public final void a(ConnectionsGroup connectionsgroup, int i)
        {
            if (i != 0) goto _L2; else goto _L1
_L1:
            if (connectionsgroup == null) goto _L4; else goto _L3
_L3:
            if (!connectionsgroup.needsFill()) goto _L6; else goto _L5
_L5:
            com.tinder.managers.f.a(connectionsgroup, 100, this);
_L8:
            return;
_L6:
            a(connectionsgroup);
            c = true;
            a();
            return;
_L4:
            c = true;
            a();
            return;
_L2:
            if (i == 1)
            {
                c = true;
                if (connectionsgroup != null)
                {
                    connectionsgroup.setIgnoreUnresolvableIds(true);
                    a(connectionsgroup);
                    a();
                    return;
                }
            }
            if (true) goto _L8; else goto _L7
_L7:
        }

        public final void b()
        {
            Object obj = a.getCommonInterests();
            ArrayList arraylist = new ArrayList(((List) (obj)).size());
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(((Interest)((Iterator) (obj)).next()).name)) { }
            f.b = arraylist;
        }

        public final void c(int i)
        {
            c = true;
            a();
        }

        public final void onBitmapFailed(Drawable drawable)
        {
            g = true;
            f.a(BitmapFactory.decodeResource(ManagerApp.c().getResources(), 0x7f020169));
            a();
        }

        public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
        {
            g = true;
            f.a(bitmap);
            a();
        }

        public final void onPrepareLoad(Drawable drawable)
        {
        }

        public c(User user)
        {
            d = ae.this;
            super();
            e = UserPhotoSize.MED;
            f = new b();
            a = user;
            b = a.getMainPhoto().getProcessedPhoto(e).imageUrl;
        }
    }


    com.tinder.managers.ae a;
    public z b;
    public android.support.v4.g.a c;
    public List d;
    public int e;
    a f;

    public ae(a a1)
    {
        ManagerApp.h().a(this);
        c = new android.support.v4.g.a();
        d = new ArrayList();
        f = a1;
    }

    public final void a(List list)
    {
        (new StringBuilder("ENTER with")).append(list);
        e = list.size();
        d.clear();
        c.clear();
        list = list.iterator();
        while (list.hasNext()) 
        {
            c c1 = new c((User)list.next());
            d.add(c1);
            c1.b();
            ConnectionsGroup connectionsgroup = c1.a.getConnections();
            if (com.tinder.managers.ae.x())
            {
                c1.d.b.a(c1.a.getId(), c1);
            } else
            if (connectionsgroup != null)
            {
                if (connectionsgroup.needsFill())
                {
                    com.tinder.managers.f.a(connectionsgroup, 100, c1);
                } else
                {
                    c1.a(connectionsgroup);
                    c1.c = true;
                    c1.a();
                }
            } else
            {
                c1.c = true;
            }
            Picasso.a(ManagerApp.c()).a(c1.b).a(c1);
        }
    }
}
