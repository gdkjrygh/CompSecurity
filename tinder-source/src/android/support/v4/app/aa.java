// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            y, af, z, ai, 
//            ab

public class aa
{
    public static final class a extends ad.a
    {

        public static final ad.a.a d = new ad.a.a() {

            public final ad.a a(int i1, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, ak.a aa1[])
            {
                return new a(i1, charsequence, pendingintent, bundle, (ai[])(ai[])aa1, (byte)0);
            }

        };
        public int a;
        public CharSequence b;
        public PendingIntent c;
        private final Bundle e;
        private final ai f[];

        public final int a()
        {
            return a;
        }

        public final CharSequence b()
        {
            return b;
        }

        public final PendingIntent c()
        {
            return c;
        }

        public final Bundle d()
        {
            return e;
        }

        public final volatile ak.a[] e()
        {
            return f;
        }


        public a(int i1, CharSequence charsequence, PendingIntent pendingintent)
        {
            this(i1, charsequence, pendingintent, new Bundle(), null);
        }

        private a(int i1, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, ai aai[])
        {
            a = i1;
            b = d.limitCharSequenceLength(charsequence);
            c = pendingintent;
            if (bundle == null)
            {
                bundle = new Bundle();
            }
            e = bundle;
            f = aai;
        }

        a(int i1, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, ai aai[], byte byte0)
        {
            this(i1, charsequence, pendingintent, bundle, aai);
        }
    }

    public static final class a.a
    {

        public final Bundle a;
        private final int b;
        private final CharSequence c;
        private final PendingIntent d;
        private ArrayList e;

        public final a.a a(ai ai1)
        {
            if (e == null)
            {
                e = new ArrayList();
            }
            e.add(ai1);
            return this;
        }

        public final a a()
        {
            ai aai[];
            if (e != null)
            {
                aai = (ai[])e.toArray(new ai[e.size()]);
            } else
            {
                aai = null;
            }
            return new a(b, c, d, a, aai, (byte)0);
        }

        public a.a(int i1, CharSequence charsequence, PendingIntent pendingintent)
        {
            this(i1, charsequence, pendingintent, new Bundle());
        }

        private a.a(int i1, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle)
        {
            b = i1;
            c = d.limitCharSequenceLength(charsequence);
            d = pendingintent;
            a = bundle;
        }
    }

    public static final class b extends q
    {

        public Bitmap a;
        Bitmap b;
        boolean c;

        public final b a(CharSequence charsequence)
        {
            mBigContentTitle = d.limitCharSequenceLength(charsequence);
            return this;
        }

        public final b b(CharSequence charsequence)
        {
            mSummaryText = d.limitCharSequenceLength(charsequence);
            mSummaryTextSet = true;
            return this;
        }

        public b()
        {
        }
    }

    public static final class c extends q
    {

        CharSequence a;

        public final c a(CharSequence charsequence)
        {
            mBigContentTitle = d.limitCharSequenceLength(charsequence);
            return this;
        }

        public final c b(CharSequence charsequence)
        {
            mSummaryText = d.limitCharSequenceLength(charsequence);
            mSummaryTextSet = true;
            return this;
        }

        public final c c(CharSequence charsequence)
        {
            a = d.limitCharSequenceLength(charsequence);
            return this;
        }

        public c()
        {
        }
    }

    public static class d
    {

        private static final int MAX_CHARSEQUENCE_LENGTH = 5120;
        public ArrayList mActions;
        String mCategory;
        int mColor;
        public CharSequence mContentInfo;
        PendingIntent mContentIntent;
        public CharSequence mContentText;
        public CharSequence mContentTitle;
        public Context mContext;
        Bundle mExtras;
        PendingIntent mFullScreenIntent;
        String mGroupKey;
        boolean mGroupSummary;
        public Bitmap mLargeIcon;
        boolean mLocalOnly;
        public Notification mNotification;
        public int mNumber;
        public ArrayList mPeople;
        int mPriority;
        int mProgress;
        boolean mProgressIndeterminate;
        int mProgressMax;
        Notification mPublicVersion;
        boolean mShowWhen;
        String mSortKey;
        public q mStyle;
        public CharSequence mSubText;
        RemoteViews mTickerView;
        public boolean mUseChronometer;
        int mVisibility;

        protected static CharSequence limitCharSequenceLength(CharSequence charsequence)
        {
            while (charsequence == null || charsequence.length() <= 5120) 
            {
                return charsequence;
            }
            return charsequence.subSequence(0, 5120);
        }

        private void setFlag(int i1, boolean flag)
        {
            if (flag)
            {
                Notification notification = mNotification;
                notification.flags = notification.flags | i1;
                return;
            } else
            {
                Notification notification1 = mNotification;
                notification1.flags = notification1.flags & ~i1;
                return;
            }
        }

        public d addAction(int i1, CharSequence charsequence, PendingIntent pendingintent)
        {
            mActions.add(new a(i1, charsequence, pendingintent));
            return this;
        }

        public d addAction(a a1)
        {
            mActions.add(a1);
            return this;
        }

        public d addExtras(Bundle bundle)
        {
label0:
            {
                if (bundle != null)
                {
                    if (mExtras != null)
                    {
                        break label0;
                    }
                    mExtras = new Bundle(bundle);
                }
                return this;
            }
            mExtras.putAll(bundle);
            return this;
        }

        public d addPerson(String s)
        {
            mPeople.add(s);
            return this;
        }

        public Notification build()
        {
            return aa.IMPL.a(this, getExtender());
        }

        public d extend(f f1)
        {
            f1.a(this);
            return this;
        }

        public e getExtender()
        {
            return new e();
        }

        public Bundle getExtras()
        {
            if (mExtras == null)
            {
                mExtras = new Bundle();
            }
            return mExtras;
        }

        public Notification getNotification()
        {
            return build();
        }

        public d setAutoCancel(boolean flag)
        {
            setFlag(16, flag);
            return this;
        }

        public d setCategory(String s)
        {
            mCategory = s;
            return this;
        }

        public d setColor(int i1)
        {
            mColor = i1;
            return this;
        }

        public d setContent(RemoteViews remoteviews)
        {
            mNotification.contentView = remoteviews;
            return this;
        }

        public d setContentInfo(CharSequence charsequence)
        {
            mContentInfo = limitCharSequenceLength(charsequence);
            return this;
        }

        public d setContentIntent(PendingIntent pendingintent)
        {
            mContentIntent = pendingintent;
            return this;
        }

        public d setContentText(CharSequence charsequence)
        {
            mContentText = limitCharSequenceLength(charsequence);
            return this;
        }

        public d setContentTitle(CharSequence charsequence)
        {
            mContentTitle = limitCharSequenceLength(charsequence);
            return this;
        }

        public d setDefaults(int i1)
        {
            mNotification.defaults = i1;
            if ((i1 & 4) != 0)
            {
                Notification notification = mNotification;
                notification.flags = notification.flags | 1;
            }
            return this;
        }

        public d setDeleteIntent(PendingIntent pendingintent)
        {
            mNotification.deleteIntent = pendingintent;
            return this;
        }

        public d setExtras(Bundle bundle)
        {
            mExtras = bundle;
            return this;
        }

        public d setFullScreenIntent(PendingIntent pendingintent, boolean flag)
        {
            mFullScreenIntent = pendingintent;
            setFlag(128, flag);
            return this;
        }

        public d setGroup(String s)
        {
            mGroupKey = s;
            return this;
        }

        public d setGroupSummary(boolean flag)
        {
            mGroupSummary = flag;
            return this;
        }

        public d setLargeIcon(Bitmap bitmap)
        {
            mLargeIcon = bitmap;
            return this;
        }

        public d setLights(int i1, int j1, int k1)
        {
            boolean flag = true;
            mNotification.ledARGB = i1;
            mNotification.ledOnMS = j1;
            mNotification.ledOffMS = k1;
            Notification notification;
            if (mNotification.ledOnMS != 0 && mNotification.ledOffMS != 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            notification = mNotification;
            j1 = mNotification.flags;
            if (i1 != 0)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            notification.flags = j1 & -2 | i1;
            return this;
        }

        public d setLocalOnly(boolean flag)
        {
            mLocalOnly = flag;
            return this;
        }

        public d setNumber(int i1)
        {
            mNumber = i1;
            return this;
        }

        public d setOngoing(boolean flag)
        {
            setFlag(2, flag);
            return this;
        }

        public d setOnlyAlertOnce(boolean flag)
        {
            setFlag(8, flag);
            return this;
        }

        public d setPriority(int i1)
        {
            mPriority = i1;
            return this;
        }

        public d setProgress(int i1, int j1, boolean flag)
        {
            mProgressMax = i1;
            mProgress = j1;
            mProgressIndeterminate = flag;
            return this;
        }

        public d setPublicVersion(Notification notification)
        {
            mPublicVersion = notification;
            return this;
        }

        public d setShowWhen(boolean flag)
        {
            mShowWhen = flag;
            return this;
        }

        public d setSmallIcon(int i1)
        {
            mNotification.icon = i1;
            return this;
        }

        public d setSmallIcon(int i1, int j1)
        {
            mNotification.icon = i1;
            mNotification.iconLevel = j1;
            return this;
        }

        public d setSortKey(String s)
        {
            mSortKey = s;
            return this;
        }

        public d setSound(Uri uri)
        {
            mNotification.sound = uri;
            mNotification.audioStreamType = -1;
            return this;
        }

        public d setSound(Uri uri, int i1)
        {
            mNotification.sound = uri;
            mNotification.audioStreamType = i1;
            return this;
        }

        public d setStyle(q q1)
        {
            if (mStyle != q1)
            {
                mStyle = q1;
                if (mStyle != null)
                {
                    mStyle.setBuilder(this);
                }
            }
            return this;
        }

        public d setSubText(CharSequence charsequence)
        {
            mSubText = limitCharSequenceLength(charsequence);
            return this;
        }

        public d setTicker(CharSequence charsequence)
        {
            mNotification.tickerText = limitCharSequenceLength(charsequence);
            return this;
        }

        public d setTicker(CharSequence charsequence, RemoteViews remoteviews)
        {
            mNotification.tickerText = limitCharSequenceLength(charsequence);
            mTickerView = remoteviews;
            return this;
        }

        public d setUsesChronometer(boolean flag)
        {
            mUseChronometer = flag;
            return this;
        }

        public d setVibrate(long al[])
        {
            mNotification.vibrate = al;
            return this;
        }

        public d setVisibility(int i1)
        {
            mVisibility = i1;
            return this;
        }

        public d setWhen(long l1)
        {
            mNotification.when = l1;
            return this;
        }

        public d(Context context)
        {
            mShowWhen = true;
            mActions = new ArrayList();
            mLocalOnly = false;
            mColor = 0;
            mVisibility = 0;
            mNotification = new Notification();
            mContext = context;
            mNotification.when = System.currentTimeMillis();
            mNotification.audioStreamType = -1;
            mPriority = 0;
            mPeople = new ArrayList();
        }
    }

    protected static class e
    {

        public Notification build(d d1, z z1)
        {
            return z1.b();
        }

        public e()
        {
        }
    }

    public static interface f
    {

        public abstract d a(d d1);
    }

    public static final class g extends q
    {

        ArrayList a;

        public g()
        {
            a = new ArrayList();
        }
    }

    static interface h
    {

        public abstract Notification a(d d1, e e1);

        public abstract Bundle a(Notification notification);

        public abstract a a(Notification notification, int i1);

        public abstract ArrayList a(a aa1[]);

        public abstract int b(Notification notification);

        public abstract String c(Notification notification);

        public abstract boolean d(Notification notification);

        public abstract String e(Notification notification);

        public abstract boolean f(Notification notification);

        public abstract String g(Notification notification);
    }

    static class i extends p
    {

        public Notification a(d d1, e e1)
        {
            ab.a a1 = new ab.a(d1.mContext, d1.mNotification, d1.mContentTitle, d1.mContentText, d1.mContentInfo, d1.mTickerView, d1.mNumber, d1.mContentIntent, d1.mFullScreenIntent, d1.mLargeIcon, d1.mProgressMax, d1.mProgress, d1.mProgressIndeterminate, d1.mShowWhen, d1.mUseChronometer, d1.mPriority, d1.mSubText, d1.mLocalOnly, d1.mPeople, d1.mExtras, d1.mGroupKey, d1.mGroupSummary, d1.mSortKey);
            aa.addActionsToBuilder(a1, d1.mActions);
            aa.addStyleToBuilderJellybean(a1, d1.mStyle);
            return e1.build(d1, a1);
        }

        public final a a(Notification notification, int i1)
        {
            ad.a.a a1 = a.d;
            ak.a.a a2 = ai.a;
            android.app.Notification.Action action = notification.actions[i1];
            RemoteInput aremoteinput[] = action.getRemoteInputs();
            if (aremoteinput == null)
            {
                notification = null;
            } else
            {
                notification = a2.a(aremoteinput.length);
                i1 = 0;
                while (i1 < aremoteinput.length) 
                {
                    RemoteInput remoteinput = aremoteinput[i1];
                    notification[i1] = a2.a(remoteinput.getResultKey(), remoteinput.getLabel(), remoteinput.getChoices(), remoteinput.getAllowFreeFormInput(), remoteinput.getExtras());
                    i1++;
                }
            }
            return (a)a1.a(action.icon, action.title, action.actionIntent, action.getExtras(), notification);
        }

        public final ArrayList a(a aa1[])
        {
            if (aa1 != null) goto _L2; else goto _L1
_L1:
            ArrayList arraylist = null;
_L4:
            return arraylist;
_L2:
            ArrayList arraylist1 = new ArrayList(aa1.length);
            int j1 = aa1.length;
            int i1 = 0;
            do
            {
                arraylist = arraylist1;
                if (i1 >= j1)
                {
                    continue;
                }
                arraylist1.add(ab.a(aa1[i1]));
                i1++;
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final boolean d(Notification notification)
        {
            return (notification.flags & 0x100) != 0;
        }

        public final String e(Notification notification)
        {
            return notification.getGroup();
        }

        public final boolean f(Notification notification)
        {
            return (notification.flags & 0x200) != 0;
        }

        public final String g(Notification notification)
        {
            return notification.getSortKey();
        }

        i()
        {
        }
    }

    static final class j extends i
    {

        public final Notification a(d d1, e e1)
        {
            ac.a a1 = new ac.a(d1.mContext, d1.mNotification, d1.mContentTitle, d1.mContentText, d1.mContentInfo, d1.mTickerView, d1.mNumber, d1.mContentIntent, d1.mFullScreenIntent, d1.mLargeIcon, d1.mProgressMax, d1.mProgress, d1.mProgressIndeterminate, d1.mShowWhen, d1.mUseChronometer, d1.mPriority, d1.mSubText, d1.mLocalOnly, d1.mCategory, d1.mPeople, d1.mExtras, d1.mColor, d1.mVisibility, d1.mPublicVersion, d1.mGroupKey, d1.mGroupSummary, d1.mSortKey);
            aa.addActionsToBuilder(a1, d1.mActions);
            aa.addStyleToBuilderJellybean(a1, d1.mStyle);
            return e1.build(d1, a1);
        }

        public final String c(Notification notification)
        {
            return notification.category;
        }

        j()
        {
        }
    }

    static class k
        implements h
    {

        public Notification a(d d1, e e1)
        {
            e1 = d1.mNotification;
            e1.setLatestEventInfo(d1.mContext, d1.mContentTitle, d1.mContentText, d1.mContentIntent);
            if (d1.mPriority > 0)
            {
                e1.flags = ((Notification) (e1)).flags | 0x80;
            }
            return e1;
        }

        public Bundle a(Notification notification)
        {
            return null;
        }

        public a a(Notification notification, int i1)
        {
            return null;
        }

        public ArrayList a(a aa1[])
        {
            return null;
        }

        public int b(Notification notification)
        {
            return 0;
        }

        public String c(Notification notification)
        {
            return null;
        }

        public boolean d(Notification notification)
        {
            return false;
        }

        public String e(Notification notification)
        {
            return null;
        }

        public boolean f(Notification notification)
        {
            return false;
        }

        public String g(Notification notification)
        {
            return null;
        }

        k()
        {
        }
    }

    static final class l extends k
    {

        public final Notification a(d d1, e e1)
        {
            e1 = d1.mNotification;
            e1.setLatestEventInfo(d1.mContext, d1.mContentTitle, d1.mContentText, d1.mContentIntent);
            Context context = d1.mContext;
            CharSequence charsequence = d1.mContentTitle;
            CharSequence charsequence1 = d1.mContentText;
            PendingIntent pendingintent = d1.mContentIntent;
            PendingIntent pendingintent1 = d1.mFullScreenIntent;
            e1.setLatestEventInfo(context, charsequence, charsequence1, pendingintent);
            e1.fullScreenIntent = pendingintent1;
            if (d1.mPriority > 0)
            {
                e1.flags = ((Notification) (e1)).flags | 0x80;
            }
            return e1;
        }

        l()
        {
        }
    }

    static final class m extends k
    {

        public final Notification a(d d1, e e1)
        {
            Object obj1 = d1.mContext;
            e1 = d1.mNotification;
            Object obj = d1.mContentTitle;
            CharSequence charsequence = d1.mContentText;
            CharSequence charsequence1 = d1.mContentInfo;
            RemoteViews remoteviews = d1.mTickerView;
            int i1 = d1.mNumber;
            PendingIntent pendingintent1 = d1.mContentIntent;
            PendingIntent pendingintent = d1.mFullScreenIntent;
            d1 = d1.mLargeIcon;
            obj1 = (new android.app.Notification.Builder(((Context) (obj1)))).setWhen(((Notification) (e1)).when).setSmallIcon(((Notification) (e1)).icon, ((Notification) (e1)).iconLevel).setContent(((Notification) (e1)).contentView).setTicker(((Notification) (e1)).tickerText, remoteviews).setSound(((Notification) (e1)).sound, ((Notification) (e1)).audioStreamType).setVibrate(((Notification) (e1)).vibrate).setLights(((Notification) (e1)).ledARGB, ((Notification) (e1)).ledOnMS, ((Notification) (e1)).ledOffMS);
            boolean flag;
            if ((((Notification) (e1)).flags & 2) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj1 = ((android.app.Notification.Builder) (obj1)).setOngoing(flag);
            if ((((Notification) (e1)).flags & 8) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj1 = ((android.app.Notification.Builder) (obj1)).setOnlyAlertOnce(flag);
            if ((((Notification) (e1)).flags & 0x10) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = ((android.app.Notification.Builder) (obj1)).setAutoCancel(flag).setDefaults(((Notification) (e1)).defaults).setContentTitle(((CharSequence) (obj))).setContentText(charsequence).setContentInfo(charsequence1).setContentIntent(pendingintent1).setDeleteIntent(((Notification) (e1)).deleteIntent);
            if ((((Notification) (e1)).flags & 0x80) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return ((android.app.Notification.Builder) (obj)).setFullScreenIntent(pendingintent, flag).setLargeIcon(d1).setNumber(i1).getNotification();
        }

        m()
        {
        }
    }

    static final class n extends k
    {

        public final Notification a(d d1, e e1)
        {
            return e1.build(d1, new ae.a(d1.mContext, d1.mNotification, d1.mContentTitle, d1.mContentText, d1.mContentInfo, d1.mTickerView, d1.mNumber, d1.mContentIntent, d1.mFullScreenIntent, d1.mLargeIcon, d1.mProgressMax, d1.mProgress, d1.mProgressIndeterminate));
        }

        n()
        {
        }
    }

    static class o extends k
    {

        public Notification a(d d1, e e1)
        {
            af.a a1 = new af.a(d1.mContext, d1.mNotification, d1.mContentTitle, d1.mContentText, d1.mContentInfo, d1.mTickerView, d1.mNumber, d1.mContentIntent, d1.mFullScreenIntent, d1.mLargeIcon, d1.mProgressMax, d1.mProgress, d1.mProgressIndeterminate, d1.mUseChronometer, d1.mPriority, d1.mSubText, d1.mLocalOnly, d1.mExtras, d1.mGroupKey, d1.mGroupSummary, d1.mSortKey);
            aa.addActionsToBuilder(a1, d1.mActions);
            aa.addStyleToBuilderJellybean(a1, d1.mStyle);
            return e1.build(d1, a1);
        }

        public Bundle a(Notification notification)
        {
            return af.a(notification);
        }

        public a a(Notification notification, int i1)
        {
            return (a)af.a(notification, i1, a.d, ai.a);
        }

        public ArrayList a(a aa1[])
        {
            return af.a(aa1);
        }

        public int b(Notification notification)
        {
            return af.b(notification);
        }

        public boolean d(Notification notification)
        {
            return af.c(notification);
        }

        public String e(Notification notification)
        {
            return af.d(notification);
        }

        public boolean f(Notification notification)
        {
            return af.e(notification);
        }

        public String g(Notification notification)
        {
            return af.f(notification);
        }

        o()
        {
        }
    }

    static class p extends o
    {

        public Notification a(d d1, e e1)
        {
            ag.a a1 = new ag.a(d1.mContext, d1.mNotification, d1.mContentTitle, d1.mContentText, d1.mContentInfo, d1.mTickerView, d1.mNumber, d1.mContentIntent, d1.mFullScreenIntent, d1.mLargeIcon, d1.mProgressMax, d1.mProgress, d1.mProgressIndeterminate, d1.mShowWhen, d1.mUseChronometer, d1.mPriority, d1.mSubText, d1.mLocalOnly, d1.mPeople, d1.mExtras, d1.mGroupKey, d1.mGroupSummary, d1.mSortKey);
            aa.addActionsToBuilder(a1, d1.mActions);
            aa.addStyleToBuilderJellybean(a1, d1.mStyle);
            return e1.build(d1, a1);
        }

        public final Bundle a(Notification notification)
        {
            return notification.extras;
        }

        public a a(Notification notification, int i1)
        {
            ad.a.a a1 = a.d;
            ak.a.a a2 = ai.a;
            android.app.Notification.Action action = notification.actions[i1];
            Object obj = null;
            SparseArray sparsearray = notification.extras.getSparseParcelableArray("android.support.actionExtras");
            notification = obj;
            if (sparsearray != null)
            {
                notification = (Bundle)sparsearray.get(i1);
            }
            return (a)af.a(a1, a2, action.icon, action.title, action.actionIntent, notification);
        }

        public final int b(Notification notification)
        {
            if (notification.actions != null)
            {
                return notification.actions.length;
            } else
            {
                return 0;
            }
        }

        public boolean d(Notification notification)
        {
            return notification.extras.getBoolean("android.support.localOnly");
        }

        public String e(Notification notification)
        {
            return notification.extras.getString("android.support.groupKey");
        }

        public boolean f(Notification notification)
        {
            return notification.extras.getBoolean("android.support.isGroupSummary");
        }

        public String g(Notification notification)
        {
            return notification.extras.getString("android.support.sortKey");
        }

        p()
        {
        }
    }

    public static abstract class q
    {

        CharSequence mBigContentTitle;
        d mBuilder;
        CharSequence mSummaryText;
        boolean mSummaryTextSet;

        public Notification build()
        {
            Notification notification = null;
            if (mBuilder != null)
            {
                notification = mBuilder.build();
            }
            return notification;
        }

        public void setBuilder(d d1)
        {
            if (mBuilder != d1)
            {
                mBuilder = d1;
                if (mBuilder != null)
                {
                    mBuilder.setStyle(this);
                }
            }
        }

        public q()
        {
            mSummaryTextSet = false;
        }
    }

    public static final class r
        implements f
    {

        public int a;
        public ArrayList b;
        public Bitmap c;
        private ArrayList d;
        private PendingIntent e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;

        public final d a(d d1)
        {
            Bundle bundle = new Bundle();
            if (!d.isEmpty())
            {
                bundle.putParcelableArrayList("actions", aa.IMPL.a((a[])d.toArray(new a[d.size()])));
            }
            if (a != 1)
            {
                bundle.putInt("flags", a);
            }
            if (e != null)
            {
                bundle.putParcelable("displayIntent", e);
            }
            if (!b.isEmpty())
            {
                bundle.putParcelableArray("pages", (android.os.Parcelable[])b.toArray(new Notification[b.size()]));
            }
            if (c != null)
            {
                bundle.putParcelable("background", c);
            }
            if (f != 0)
            {
                bundle.putInt("contentIcon", f);
            }
            if (g != 0x800005)
            {
                bundle.putInt("contentIconGravity", g);
            }
            if (h != -1)
            {
                bundle.putInt("contentActionIndex", h);
            }
            if (i != 0)
            {
                bundle.putInt("customSizePreset", i);
            }
            if (j != 0)
            {
                bundle.putInt("customContentHeight", j);
            }
            if (k != 80)
            {
                bundle.putInt("gravity", k);
            }
            if (l != 0)
            {
                bundle.putInt("hintScreenTimeout", l);
            }
            d1.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
            return d1;
        }

        public final r a(a a1)
        {
            d.add(a1);
            return this;
        }

        public final Object clone()
            throws CloneNotSupportedException
        {
            r r1 = new r();
            r1.d = new ArrayList(d);
            r1.a = a;
            r1.e = e;
            r1.b = new ArrayList(b);
            r1.c = c;
            r1.f = f;
            r1.g = g;
            r1.h = h;
            r1.i = i;
            r1.j = j;
            r1.k = k;
            r1.l = l;
            return r1;
        }

        public r()
        {
            d = new ArrayList();
            a = 1;
            b = new ArrayList();
            g = 0x800005;
            h = -1;
            i = 0;
            k = 80;
        }
    }


    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final String EXTRA_PEOPLE = "android.people";
    public static final String EXTRA_PICTURE = "android.picture";
    public static final String EXTRA_PROGRESS = "android.progress";
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final String EXTRA_SMALL_ICON = "android.icon";
    public static final String EXTRA_SUB_TEXT = "android.subText";
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final String EXTRA_TEMPLATE = "android.template";
    public static final String EXTRA_TEXT = "android.text";
    public static final String EXTRA_TEXT_LINES = "android.textLines";
    public static final String EXTRA_TITLE = "android.title";
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    private static final h IMPL;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    public aa()
    {
    }

    private static void addActionsToBuilder(y y1, ArrayList arraylist)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); y1.a((a)arraylist.next())) { }
    }

    private static void addStyleToBuilderJellybean(z z, q q1)
    {
        if (q1 != null)
        {
            if (q1 instanceof c)
            {
                q1 = (c)q1;
                af.a(z, ((c) (q1)).mBigContentTitle, ((c) (q1)).mSummaryTextSet, ((c) (q1)).mSummaryText, ((c) (q1)).a);
            } else
            {
                if (q1 instanceof g)
                {
                    q1 = (g)q1;
                    af.a(z, ((g) (q1)).mBigContentTitle, ((g) (q1)).mSummaryTextSet, ((g) (q1)).mSummaryText, ((g) (q1)).a);
                    return;
                }
                if (q1 instanceof b)
                {
                    q1 = (b)q1;
                    af.a(z, ((b) (q1)).mBigContentTitle, ((b) (q1)).mSummaryTextSet, ((b) (q1)).mSummaryText, ((b) (q1)).a, ((b) (q1)).b, ((b) (q1)).c);
                    return;
                }
            }
        }
    }

    public static a getAction(Notification notification, int i1)
    {
        return IMPL.a(notification, i1);
    }

    public static int getActionCount(Notification notification)
    {
        return IMPL.b(notification);
    }

    public static String getCategory(Notification notification)
    {
        return IMPL.c(notification);
    }

    public static Bundle getExtras(Notification notification)
    {
        return IMPL.a(notification);
    }

    public static String getGroup(Notification notification)
    {
        return IMPL.e(notification);
    }

    public static boolean getLocalOnly(Notification notification)
    {
        return IMPL.d(notification);
    }

    private static Notification[] getNotificationArrayFromBundle(Bundle bundle, String s)
    {
        android.os.Parcelable aparcelable[] = bundle.getParcelableArray(s);
        if ((aparcelable instanceof Notification[]) || aparcelable == null)
        {
            return (Notification[])(Notification[])aparcelable;
        }
        Notification anotification[] = new Notification[aparcelable.length];
        for (int i1 = 0; i1 < aparcelable.length; i1++)
        {
            anotification[i1] = (Notification)aparcelable[i1];
        }

        bundle.putParcelableArray(s, anotification);
        return anotification;
    }

    public static String getSortKey(Notification notification)
    {
        return IMPL.g(notification);
    }

    public static boolean isGroupSummary(Notification notification)
    {
        return IMPL.f(notification);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            IMPL = new j();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            IMPL = new i();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            IMPL = new p();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            IMPL = new o();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new n();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            IMPL = new m();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            IMPL = new l();
        } else
        {
            IMPL = new k();
        }
    }




}
