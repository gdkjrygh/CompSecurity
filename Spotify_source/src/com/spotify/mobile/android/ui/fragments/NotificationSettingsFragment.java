// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.fragments;

import am;
import an;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import cu;
import da;
import dme;
import dmg;
import dmj;
import dmz;
import dtw;
import dtx;
import fsz;
import fxy;
import fyb;
import fys;
import fyw;
import gag;
import ggc;
import ggl;
import ggn;
import ggq;
import ggt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import u;

public final class NotificationSettingsFragment extends Fragment
    implements fxy, ggt
{

    public final dmg Y = new dmg() {

        private NotificationSettingsFragment a;

        private void a()
        {
            NotificationSettingsFragment.b(a);
            if (NotificationSettingsFragment.c(a).isEmpty())
            {
                dmz.a(ggc);
                ggc.a(NotificationSettingsFragment.d(a), 0x7f080560, 1, new Object[0]);
            } else
            {
                dmz.a(ggc);
                ggc.a(NotificationSettingsFragment.d(a), 0x7f080561, 0, new Object[0]);
            }
            NotificationSettingsFragment.a(a, null);
        }

        public final void a(int i, Object obj)
        {
            obj = (JSONArray)obj;
            if (i >= 200 && i < 300)
            {
                int j = ((JSONArray) (obj)).length();
                LinkedHashMap linkedhashmap = new LinkedHashMap(j);
                i = 0;
                while (i < j) 
                {
                    try
                    {
                        Notification notification = Notification.a(((JSONArray) (obj)).getJSONObject(i));
                        linkedhashmap.put(notification.a, notification);
                    }
                    catch (JSONException jsonexception)
                    {
                        Logger.a(jsonexception, "Error parsing item %d", new Object[] {
                            Integer.valueOf(i)
                        });
                    }
                    i++;
                }
                NotificationSettingsFragment.a(a, linkedhashmap);
                return;
            } else
            {
                a();
                return;
            }
        }

        public final void a(Throwable throwable, String s)
        {
            Logger.a(throwable, s, new Object[0]);
            a();
        }

            
            {
                a = NotificationSettingsFragment.this;
                super();
            }
    };
    private ggl Z;
    public Uri a;
    private ggq aa;
    private View ab;
    private ListView ac;
    private fyb ad;
    private final LinkedHashMap ae = new LinkedHashMap();
    private boolean af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private boolean aj;
    private EmptyView ak;
    private Context al;
    private an am;
    private an an;
    public ArrayList b;

    public NotificationSettingsFragment()
    {
        af = true;
        b = new ArrayList();
        am = new an() {

            private final String a[] = {
                "connected"
            };
            private NotificationSettingsFragment b;

            public final da a(Bundle bundle)
            {
                bundle = dtw.a;
                return new cu(b.k(), bundle, a, null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                boolean flag = false;
                obj = (Cursor)obj;
                if (((Cursor) (obj)).moveToFirst())
                {
                    NotificationSettingsFragment.e(b);
                    NotificationSettingsFragment notificationsettingsfragment = b;
                    if (((Cursor) (obj)).getInt(0) != 0)
                    {
                        flag = true;
                    }
                    NotificationSettingsFragment.a(notificationsettingsfragment, flag);
                    NotificationSettingsFragment.f(b);
                }
            }

            
            {
                b = NotificationSettingsFragment.this;
                super();
            }
        };
        an = new an() {

            private final String a[] = {
                "send_email"
            };
            private NotificationSettingsFragment b;

            public final da a(Bundle bundle)
            {
                bundle = dtx.a;
                return new cu(b.k(), bundle, a, null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (((Cursor) (obj)).moveToFirst())
                {
                    u u1 = b.k();
                    int i = ((Cursor) (obj)).getInt(((Cursor) (obj)).getColumnIndexOrThrow("send_email"));
                    obj = new Notification("send_email", u1.getString(0x7f080371), i, Notification.Type.b, (byte)0);
                    NotificationSettingsFragment.c(b).put(((Notification) (obj)).a, obj);
                    if (NotificationSettingsFragment.a(b) != null)
                    {
                        NotificationSettingsFragment.a(b).a(NotificationSettingsFragment.c(b).values());
                    }
                    NotificationSettingsFragment.g(b);
                    NotificationSettingsFragment.f(b);
                }
            }

            
            {
                b = NotificationSettingsFragment.this;
                super();
            }

            private class Notification
                implements Parcelable
            {

                public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                    public final Object createFromParcel(Parcel parcel)
                    {
                        return new Notification(parcel);
                    }

                    public final volatile Object[] newArray(int i)
                    {
                        return new Notification[i];
                    }

                };
                public String a;
                public String b;
                public int c;
                public Type d;

                static Notification a(JSONObject jsonobject)
                {
                    String s = jsonobject.getString("name");
                    String s1 = jsonobject.getString("translation");
                    int i = jsonobject.getInt("value");
                    return new Notification(s, s1, i, Type.a);
                }

                public int describeContents()
                {
                    return 0;
                }

                public void writeToParcel(Parcel parcel, int i)
                {
                    parcel.writeString(a);
                    parcel.writeString(b);
                    parcel.writeInt(c);
                    parcel.writeString(d.name());
                }


                public Notification(Parcel parcel)
                {
                    a = parcel.readString();
                    b = parcel.readString();
                    c = parcel.readInt();
                    class Type extends Enum
                    {

                        public static final Type a;
                        public static final Type b;
                        private static final Type c[];

                        public static Type valueOf(String s)
                        {
                            return (Type)Enum.valueOf(com/spotify/mobile/android/ui/fragments/NotificationSettingsFragment$Notification$Type, s);
                        }

                        public static Type[] values()
                        {
                            return (Type[])c.clone();
                        }

                        static 
                        {
                            a = new Type("PUSH", 0);
                            b = new Type("MARKETING", 1);
                            c = (new Type[] {
                                a, b
                            });
                        }

                        private Type(String s, int i)
                        {
                            super(s, i);
                        }
                    }

                    d = Type.valueOf(parcel.readString());
                }

                private Notification(String s, String s1, int i, Type type)
                {
                    a = s;
                    b = s1;
                    c = i;
                    d = type;
                }

                Notification(String s, String s1, int i, Type type, byte byte0)
                {
                    this(s, s1, i, type);
                }
            }

        };
    }

    public static NotificationSettingsFragment a(Flags flags)
    {
        NotificationSettingsFragment notificationsettingsfragment = new NotificationSettingsFragment();
        fyw.a(notificationsettingsfragment, flags);
        return notificationsettingsfragment;
    }

    static fyb a(NotificationSettingsFragment notificationsettingsfragment)
    {
        return notificationsettingsfragment.ad;
    }

    private void a()
    {
        byte byte0 = 4;
        int i;
        if (ac != null)
        {
            Object obj = ac;
            if (af)
            {
                i = 0;
            } else
            {
                i = 4;
            }
            ((ListView) (obj)).setVisibility(i);
        }
        if (ab != null)
        {
            if (af && (!ai || !ag || !ah) && !aj)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            obj = ab;
            if (i != 0)
            {
                i = 0;
            } else
            {
                i = 4;
            }
            ((View) (obj)).setVisibility(i);
        }
        if (ak != null)
        {
            obj = ak;
            if (af)
            {
                i = byte0;
            } else
            {
                i = 0;
            }
            ((EmptyView) (obj)).setVisibility(i);
        }
    }

    static void a(NotificationSettingsFragment notificationsettingsfragment, Map map)
    {
        notificationsettingsfragment.a(map);
    }

    private void a(Map map)
    {
        if (map != null)
        {
            if (!b.isEmpty())
            {
                Iterator iterator = map.values().iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    Notification notification = (Notification)iterator.next();
                    if (b.remove(notification.a) && b.contains(notification.a))
                    {
                        iterator.remove();
                    }
                } while (true);
            }
            if (!map.isEmpty())
            {
                ae.putAll(map);
                if (ad != null)
                {
                    ad.a(ae.values());
                }
            }
        } else
        {
            b.clear();
        }
        ai = true;
        a();
    }

    static boolean a(NotificationSettingsFragment notificationsettingsfragment, boolean flag)
    {
        notificationsettingsfragment.af = flag;
        return flag;
    }

    static boolean b(NotificationSettingsFragment notificationsettingsfragment)
    {
        notificationsettingsfragment.aj = true;
        return true;
    }

    static LinkedHashMap c(NotificationSettingsFragment notificationsettingsfragment)
    {
        return notificationsettingsfragment.ae;
    }

    static Context d(NotificationSettingsFragment notificationsettingsfragment)
    {
        return notificationsettingsfragment.al;
    }

    static boolean e(NotificationSettingsFragment notificationsettingsfragment)
    {
        notificationsettingsfragment.ah = true;
        return true;
    }

    static void f(NotificationSettingsFragment notificationsettingsfragment)
    {
        notificationsettingsfragment.a();
    }

    static boolean g(NotificationSettingsFragment notificationsettingsfragment)
    {
        notificationsettingsfragment.ag = true;
        return true;
    }

    public final void A()
    {
        super.A();
        Z.b();
    }

    public final void B()
    {
        super.B();
        if (aa != null)
        {
            aa.b();
            aa = null;
        }
        u().a(0x7f11009e);
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "internal:preferences_push_notification";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03008e, viewgroup, false);
        viewgroup = k();
        ab = layoutinflater.findViewById(0x7f110341);
        ac = (ListView)layoutinflater.findViewById(0x7f110398);
        ad = new fyb(this, viewgroup);
        ad.a(ae.values());
        bundle = new fsz(viewgroup, ad) {

            private NotificationSettingsFragment b;

            public final int a(int i)
            {
                return NotificationSettingsFragment.a(b).getItemViewType(i);
            }

            
            {
                b = NotificationSettingsFragment.this;
                super(context, listadapter);
            }
        };
        bundle.a(new String[] {
            viewgroup.getString(0x7f080373), viewgroup.getString(0x7f080372)
        });
        ac.setAdapter(bundle);
        ak = (EmptyView)layoutinflater.findViewById(0x7f110399);
        gag.a(viewgroup, ak, b(0x7f080431));
        a();
        return layoutinflater;
    }

    public final String a(Context context, Flags flags)
    {
        return context.getString(0x7f080494);
    }

    public final void a(Bundle bundle)
    {
        int i = 1;
        boolean flag = false;
        super.a(bundle);
        Flags flags = fyw.a(this);
        s();
        a(true);
        u u1 = k();
        al = k().getApplicationContext();
        int j = GooglePlayServicesUtil.isGooglePlayServicesAvailable(u1);
        Parcelable aparcelable[];
        if (j != 0)
        {
            Logger.b("Google Play Services not available, push messages disabled: %d", new Object[] {
                Integer.valueOf(j)
            });
            i = 0;
        }
        if (i != 0 && ((Boolean)flags.a(fys.m)).booleanValue())
        {
            a = Uri.parse(b(0x7f080432));
            aa = ggq.a(u1, u1.S_());
            aa.a(a.toString(), this);
        } else
        {
            a(((Map) (null)));
        }
        if (bundle == null)
        {
            aparcelable = null;
        } else
        {
            aparcelable = bundle.getParcelableArray("notifications");
        }
        if (aparcelable != null)
        {
            j = aparcelable.length;
            for (i = ((flag) ? 1 : 0); i < j; i++)
            {
                Notification notification = (Notification)aparcelable[i];
                ae.put(notification.a, notification);
            }

        }
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            af = bundle.getBoolean("connected");
            ag = bundle.getBoolean("key_settings_loaded");
            ah = bundle.getBoolean("key_session_loaded");
            ai = bundle.getBoolean("push_notifications_received");
        }
        u().a(0x7f11009e, null, am);
        u().a(0x7f11007a, null, an);
        Z = ggn.a(u1, ViewUri.bD);
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
    }

    public final void a_(Uri uri)
    {
        a = uri;
        ((dmj)dmz.a(dmj)).a(a.toString()).a("", Y);
    }

    public final void e()
    {
        super.e();
        ab = null;
        ac = null;
        ad = null;
        ak = null;
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putParcelableArray("notifications", ad.a);
        bundle.putBoolean("connected", af);
        bundle.putBoolean("push_notifications_received", ai);
        bundle.putBoolean("key_settings_loaded", ag);
        bundle.putBoolean("key_session_loaded", ah);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.ax;
    }

    public final void z()
    {
        super.z();
        Z.a();
    }

    // Unreferenced inner class com/spotify/mobile/android/ui/fragments/NotificationSettingsFragment$5

/* anonymous class */
    public final class _cls5
    {

        public static final int a[];

        static 
        {
            a = new int[Notification.Type.values().length];
            try
            {
                a[Notification.Type.b.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[Notification.Type.a.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
