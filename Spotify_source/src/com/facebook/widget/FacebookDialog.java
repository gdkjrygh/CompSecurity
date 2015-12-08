// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import aoj;
import arc;
import arp;
import arq;
import arx;
import ary;
import arz;
import com.facebook.AppEventsLogger;
import com.facebook.FacebookException;
import java.util.Iterator;

public final class FacebookDialog
{

    private static aoj a;
    private Activity b;
    private PendingCall c;
    private arz d;

    private FacebookDialog(Activity activity, PendingCall pendingcall, arz arz1)
    {
        b = activity;
        c = pendingcall;
        d = arz1;
    }

    public FacebookDialog(Activity activity, PendingCall pendingcall, arz arz1, byte byte0)
    {
        this(activity, pendingcall, arz1);
    }

    public static String a(Iterable iterable)
    {
        Object obj = null;
        Iterator iterator = iterable.iterator();
        iterable = obj;
        if (iterator.hasNext())
        {
            iterable = ((ary)iterator.next()).a();
        }
        return iterable;
    }

    public static String a(String s, boolean flag)
    {
        if (s.equals("com.facebook.platform.action.request.FEED_DIALOG"))
        {
            if (flag)
            {
                return "fb_dialogs_present_share_photo";
            } else
            {
                return "fb_dialogs_present_share";
            }
        }
        if (s.equals("com.facebook.platform.action.request.MESSAGE_DIALOG"))
        {
            if (flag)
            {
                return "fb_dialogs_present_message_photo";
            } else
            {
                return "fb_dialogs_present_message";
            }
        }
        if (s.equals("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG"))
        {
            return "fb_dialogs_present_share_og";
        }
        if (s.equals("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG"))
        {
            return "fb_dialogs_present_message_og";
        }
        if (s.equals("com.facebook.platform.action.request.LIKE_DIALOG"))
        {
            return "fb_dialogs_present_like";
        } else
        {
            throw new FacebookException("An unspecified action was presented");
        }
    }

    public static void a(Activity activity, Fragment fragment, String s, String s1)
    {
        activity = AppEventsLogger.b(activity);
        fragment = new Bundle();
        fragment.putString("fb_dialog_outcome", s1);
        activity.b(s, fragment);
    }

    public static boolean a(PendingCall pendingcall, int i, Intent intent, arx arx1)
    {
        if (i != pendingcall.c)
        {
            return false;
        }
        if (a != null)
        {
            arp.a(aoj.a(pendingcall.a, false));
        }
        if (arx1 != null)
        {
            if (arc.c(intent))
            {
                intent = arc.d(intent);
                arx1.a(pendingcall, arc.a(intent), intent);
            } else
            {
                arx1.a(pendingcall, arc.b(intent));
            }
        }
        return true;
    }

    public static int[] a(String s, String s1, Iterable iterable)
    {
        Iterator iterator = iterable.iterator();
        iterable = null;
        while (iterator.hasNext()) 
        {
            int ai[] = (ary)iterator.next();
            arq arq1 = arp.a(s, s1, ai.name());
            if (arq1 != null)
            {
                ai = arq1.d;
            } else
            {
                ai = (new int[] {
                    ai.b()
                });
            }
            iterable = arp.a(iterable, ai);
        }
        return iterable;
    }

    public static aoj b()
    {
        if (a == null)
        {
            a = new aoj();
        }
        return a;
    }

    public final PendingCall a()
    {
        Activity activity = b;
        Intent intent = c.b;
        a(activity, ((Fragment) (null)), a(intent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION"), intent.hasExtra("com.facebook.platform.extra.PHOTOS")), "Completed");
        if (d != null)
        {
            try
            {
                d.a(b);
            }
            catch (Exception exception)
            {
                throw new FacebookException(exception);
            }
        }
        b.startActivityForResult(c.b, c.c);
        return c;
    }

    private class PendingCall
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new PendingCall(parcel, (byte)0);
            }

            public final volatile Object[] newArray(int i)
            {
                return new PendingCall[i];
            }

        };
        public UUID a;
        public Intent b;
        public int c;

        public static void a(PendingCall pendingcall, Intent intent)
        {
            pendingcall.b = intent;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(a.toString());
            parcel.writeParcelable(b, 0);
            parcel.writeInt(c);
        }


        public PendingCall()
        {
            a = UUID.randomUUID();
            c = 64207;
        }

        private PendingCall(Parcel parcel)
        {
            a = UUID.fromString(parcel.readString());
            b = (Intent)parcel.readParcelable(null);
            c = parcel.readInt();
        }

        PendingCall(Parcel parcel, byte byte0)
        {
            this(parcel);
        }
    }

}
