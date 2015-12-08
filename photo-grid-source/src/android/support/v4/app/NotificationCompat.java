// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            NotificationBuilderWithActions, NotificationCompatJellybean, NotificationBuilderWithBuilderAccessor

public class NotificationCompat
{

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
    private static final NotificationCompatImpl IMPL;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    public NotificationCompat()
    {
    }

    private static void addActionsToBuilder(NotificationBuilderWithActions notificationbuilderwithactions, ArrayList arraylist)
    {
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); notificationbuilderwithactions.addAction((Action)arraylist.next())) { }
    }

    private static void addStyleToBuilderJellybean(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, Style style)
    {
        if (style != null)
        {
            if (style instanceof BigTextStyle)
            {
                style = (BigTextStyle)style;
                NotificationCompatJellybean.addBigTextStyle(notificationbuilderwithbuilderaccessor, ((BigTextStyle) (style)).mBigContentTitle, ((BigTextStyle) (style)).mSummaryTextSet, ((BigTextStyle) (style)).mSummaryText, ((BigTextStyle) (style)).mBigText);
            } else
            {
                if (style instanceof InboxStyle)
                {
                    style = (InboxStyle)style;
                    NotificationCompatJellybean.addInboxStyle(notificationbuilderwithbuilderaccessor, ((InboxStyle) (style)).mBigContentTitle, ((InboxStyle) (style)).mSummaryTextSet, ((InboxStyle) (style)).mSummaryText, ((InboxStyle) (style)).mTexts);
                    return;
                }
                if (style instanceof BigPictureStyle)
                {
                    style = (BigPictureStyle)style;
                    NotificationCompatJellybean.addBigPictureStyle(notificationbuilderwithbuilderaccessor, ((BigPictureStyle) (style)).mBigContentTitle, ((BigPictureStyle) (style)).mSummaryTextSet, ((BigPictureStyle) (style)).mSummaryText, ((BigPictureStyle) (style)).mPicture, ((BigPictureStyle) (style)).mBigLargeIcon, ((BigPictureStyle) (style)).mBigLargeIconSet);
                    return;
                }
            }
        }
    }

    public static Action getAction(Notification notification, int i)
    {
        return IMPL.getAction(notification, i);
    }

    public static int getActionCount(Notification notification)
    {
        return IMPL.getActionCount(notification);
    }

    public static String getCategory(Notification notification)
    {
        return IMPL.getCategory(notification);
    }

    public static Bundle getExtras(Notification notification)
    {
        return IMPL.getExtras(notification);
    }

    public static String getGroup(Notification notification)
    {
        return IMPL.getGroup(notification);
    }

    public static boolean getLocalOnly(Notification notification)
    {
        return IMPL.getLocalOnly(notification);
    }

    private static Notification[] getNotificationArrayFromBundle(Bundle bundle, String s)
    {
        android.os.Parcelable aparcelable[] = bundle.getParcelableArray(s);
        if ((aparcelable instanceof Notification[]) || aparcelable == null)
        {
            return (Notification[])aparcelable;
        }
        Notification anotification[] = new Notification[aparcelable.length];
        for (int i = 0; i < aparcelable.length; i++)
        {
            anotification[i] = (Notification)aparcelable[i];
        }

        bundle.putParcelableArray(s, anotification);
        return anotification;
    }

    public static String getSortKey(Notification notification)
    {
        return IMPL.getSortKey(notification);
    }

    public static boolean isGroupSummary(Notification notification)
    {
        return IMPL.isGroupSummary(notification);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            IMPL = new NotificationCompatImplApi21();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 20)
        {
            IMPL = new NotificationCompatImplApi20();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            IMPL = new NotificationCompatImplKitKat();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            IMPL = new NotificationCompatImplJellybean();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            IMPL = new NotificationCompatImplIceCreamSandwich();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            IMPL = new NotificationCompatImplHoneycomb();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            IMPL = new NotificationCompatImplGingerbread();
        } else
        {
            IMPL = new NotificationCompatImplBase();
        }
    }





    private class Action extends NotificationCompatBase.Action
    {
        private class Builder
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
            public Style mStyle;
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

            private void setFlag(int i, boolean flag)
            {
                if (flag)
                {
                    Notification notification = mNotification;
                    notification.flags = notification.flags | i;
                    return;
                } else
                {
                    Notification notification1 = mNotification;
                    notification1.flags = notification1.flags & ~i;
                    return;
                }
            }

            public Builder addAction(int i, CharSequence charsequence, PendingIntent pendingintent)
            {
                mActions.add(new Action(i, charsequence, pendingintent));
                return this;
            }

            public Builder addAction(Action action)
            {
                mActions.add(action);
                return this;
            }

            public Builder addExtras(Bundle bundle)
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

            public Builder addPerson(String s)
            {
                mPeople.add(s);
                return this;
            }

            public Notification build()
            {
                return NotificationCompat.IMPL.build(this, getExtender());
            }

            public Builder extend(Extender extender)
            {
                extender.extend(this);
                return this;
            }

            protected BuilderExtender getExtender()
            {
                return new BuilderExtender();
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

            public Builder setAutoCancel(boolean flag)
            {
                setFlag(16, flag);
                return this;
            }

            public Builder setCategory(String s)
            {
                mCategory = s;
                return this;
            }

            public Builder setColor(int i)
            {
                mColor = i;
                return this;
            }

            public Builder setContent(RemoteViews remoteviews)
            {
                mNotification.contentView = remoteviews;
                return this;
            }

            public Builder setContentInfo(CharSequence charsequence)
            {
                mContentInfo = limitCharSequenceLength(charsequence);
                return this;
            }

            public Builder setContentIntent(PendingIntent pendingintent)
            {
                mContentIntent = pendingintent;
                return this;
            }

            public Builder setContentText(CharSequence charsequence)
            {
                mContentText = limitCharSequenceLength(charsequence);
                return this;
            }

            public Builder setContentTitle(CharSequence charsequence)
            {
                mContentTitle = limitCharSequenceLength(charsequence);
                return this;
            }

            public Builder setDefaults(int i)
            {
                mNotification.defaults = i;
                if ((i & 4) != 0)
                {
                    Notification notification = mNotification;
                    notification.flags = notification.flags | 1;
                }
                return this;
            }

            public Builder setDeleteIntent(PendingIntent pendingintent)
            {
                mNotification.deleteIntent = pendingintent;
                return this;
            }

            public Builder setExtras(Bundle bundle)
            {
                mExtras = bundle;
                return this;
            }

            public Builder setFullScreenIntent(PendingIntent pendingintent, boolean flag)
            {
                mFullScreenIntent = pendingintent;
                setFlag(128, flag);
                return this;
            }

            public Builder setGroup(String s)
            {
                mGroupKey = s;
                return this;
            }

            public Builder setGroupSummary(boolean flag)
            {
                mGroupSummary = flag;
                return this;
            }

            public Builder setLargeIcon(Bitmap bitmap)
            {
                mLargeIcon = bitmap;
                return this;
            }

            public Builder setLights(int i, int j, int k)
            {
                boolean flag = true;
                mNotification.ledARGB = i;
                mNotification.ledOnMS = j;
                mNotification.ledOffMS = k;
                Notification notification;
                if (mNotification.ledOnMS != 0 && mNotification.ledOffMS != 0)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                notification = mNotification;
                j = mNotification.flags;
                if (i != 0)
                {
                    i = ((flag) ? 1 : 0);
                } else
                {
                    i = 0;
                }
                notification.flags = j & -2 | i;
                return this;
            }

            public Builder setLocalOnly(boolean flag)
            {
                mLocalOnly = flag;
                return this;
            }

            public Builder setNumber(int i)
            {
                mNumber = i;
                return this;
            }

            public Builder setOngoing(boolean flag)
            {
                setFlag(2, flag);
                return this;
            }

            public Builder setOnlyAlertOnce(boolean flag)
            {
                setFlag(8, flag);
                return this;
            }

            public Builder setPriority(int i)
            {
                mPriority = i;
                return this;
            }

            public Builder setProgress(int i, int j, boolean flag)
            {
                mProgressMax = i;
                mProgress = j;
                mProgressIndeterminate = flag;
                return this;
            }

            public Builder setPublicVersion(Notification notification)
            {
                mPublicVersion = notification;
                return this;
            }

            public Builder setShowWhen(boolean flag)
            {
                mShowWhen = flag;
                return this;
            }

            public Builder setSmallIcon(int i)
            {
                mNotification.icon = i;
                return this;
            }

            public Builder setSmallIcon(int i, int j)
            {
                mNotification.icon = i;
                mNotification.iconLevel = j;
                return this;
            }

            public Builder setSortKey(String s)
            {
                mSortKey = s;
                return this;
            }

            public Builder setSound(Uri uri)
            {
                mNotification.sound = uri;
                mNotification.audioStreamType = -1;
                return this;
            }

            public Builder setSound(Uri uri, int i)
            {
                mNotification.sound = uri;
                mNotification.audioStreamType = i;
                return this;
            }

            public Builder setStyle(Style style)
            {
                if (mStyle != style)
                {
                    mStyle = style;
                    if (mStyle != null)
                    {
                        mStyle.setBuilder(this);
                    }
                }
                return this;
            }

            public Builder setSubText(CharSequence charsequence)
            {
                mSubText = limitCharSequenceLength(charsequence);
                return this;
            }

            public Builder setTicker(CharSequence charsequence)
            {
                mNotification.tickerText = limitCharSequenceLength(charsequence);
                return this;
            }

            public Builder setTicker(CharSequence charsequence, RemoteViews remoteviews)
            {
                mNotification.tickerText = limitCharSequenceLength(charsequence);
                mTickerView = remoteviews;
                return this;
            }

            public Builder setUsesChronometer(boolean flag)
            {
                mUseChronometer = flag;
                return this;
            }

            public Builder setVibrate(long al[])
            {
                mNotification.vibrate = al;
                return this;
            }

            public Builder setVisibility(int i)
            {
                mVisibility = i;
                return this;
            }

            public Builder setWhen(long l)
            {
                mNotification.when = l;
                return this;
            }

            public Builder(Context context)
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

            private class Extender
            {

                public abstract Builder extend(Builder builder);
            }


            private class BuilderExtender
            {

                public Notification build(Builder builder, NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
                {
                    return notificationbuilderwithbuilderaccessor.build();
                }

                protected BuilderExtender()
                {
                }
            }

        }


        public static final NotificationCompatBase.Action.Factory FACTORY = new _cls1();
        public PendingIntent actionIntent;
        public int icon;
        private final Bundle mExtras;
        private final RemoteInput mRemoteInputs[];
        public CharSequence title;

        public PendingIntent getActionIntent()
        {
            return actionIntent;
        }

        public Bundle getExtras()
        {
            return mExtras;
        }

        public int getIcon()
        {
            return icon;
        }

        public RemoteInput[] getRemoteInputs()
        {
            return mRemoteInputs;
        }

        public volatile RemoteInputCompatBase.RemoteInput[] getRemoteInputs()
        {
            return getRemoteInputs();
        }

        public CharSequence getTitle()
        {
            return title;
        }



        public Action(int i, CharSequence charsequence, PendingIntent pendingintent)
        {
            this(i, charsequence, pendingintent, new Bundle(), null);
        }

        private Action(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[])
        {
            icon = i;
            title = Builder.limitCharSequenceLength(charsequence);
            actionIntent = pendingintent;
            if (bundle == null)
            {
                bundle = new Bundle();
            }
            mExtras = bundle;
            mRemoteInputs = aremoteinput;
        }

        Action(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInput aremoteinput[], _cls1 _pcls1)
        {
            this(i, charsequence, pendingintent, bundle, aremoteinput);
        }

        class _cls1
            implements NotificationCompatBase.Action.Factory
        {

            public final Action build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInputCompatBase.RemoteInput aremoteinput[])
            {
                return new Action(i, charsequence, pendingintent, bundle, (RemoteInput[])aremoteinput, null);
            }

            public final volatile NotificationCompatBase.Action build(int i, CharSequence charsequence, PendingIntent pendingintent, Bundle bundle, RemoteInputCompatBase.RemoteInput aremoteinput[])
            {
                return build(i, charsequence, pendingintent, bundle, aremoteinput);
            }

            public final Action[] newArray(int i)
            {
                return new Action[i];
            }

            public final volatile NotificationCompatBase.Action[] newArray(int i)
            {
                return newArray(i);
            }

                _cls1()
                {
                }
        }

    }


    private class BigTextStyle extends Style
    {
        private class Style
        {

            CharSequence mBigContentTitle;
            Builder mBuilder;
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

            public void setBuilder(Builder builder)
            {
                if (mBuilder != builder)
                {
                    mBuilder = builder;
                    if (mBuilder != null)
                    {
                        mBuilder.setStyle(this);
                    }
                }
            }

            public Style()
            {
                mSummaryTextSet = false;
            }
        }


        CharSequence mBigText;

        public BigTextStyle bigText(CharSequence charsequence)
        {
            mBigText = Builder.limitCharSequenceLength(charsequence);
            return this;
        }

        public BigTextStyle setBigContentTitle(CharSequence charsequence)
        {
            mBigContentTitle = Builder.limitCharSequenceLength(charsequence);
            return this;
        }

        public BigTextStyle setSummaryText(CharSequence charsequence)
        {
            mSummaryText = Builder.limitCharSequenceLength(charsequence);
            mSummaryTextSet = true;
            return this;
        }

        public BigTextStyle()
        {
        }

        public BigTextStyle(Builder builder)
        {
            setBuilder(builder);
        }
    }


    private class InboxStyle extends Style
    {

        ArrayList mTexts;

        public InboxStyle addLine(CharSequence charsequence)
        {
            mTexts.add(Builder.limitCharSequenceLength(charsequence));
            return this;
        }

        public InboxStyle setBigContentTitle(CharSequence charsequence)
        {
            mBigContentTitle = Builder.limitCharSequenceLength(charsequence);
            return this;
        }

        public InboxStyle setSummaryText(CharSequence charsequence)
        {
            mSummaryText = Builder.limitCharSequenceLength(charsequence);
            mSummaryTextSet = true;
            return this;
        }

        public InboxStyle()
        {
            mTexts = new ArrayList();
        }

        public InboxStyle(Builder builder)
        {
            mTexts = new ArrayList();
            setBuilder(builder);
        }
    }


    private class BigPictureStyle extends Style
    {

        Bitmap mBigLargeIcon;
        boolean mBigLargeIconSet;
        Bitmap mPicture;

        public BigPictureStyle bigLargeIcon(Bitmap bitmap)
        {
            mBigLargeIcon = bitmap;
            mBigLargeIconSet = true;
            return this;
        }

        public BigPictureStyle bigPicture(Bitmap bitmap)
        {
            mPicture = bitmap;
            return this;
        }

        public BigPictureStyle setBigContentTitle(CharSequence charsequence)
        {
            mBigContentTitle = Builder.limitCharSequenceLength(charsequence);
            return this;
        }

        public BigPictureStyle setSummaryText(CharSequence charsequence)
        {
            mSummaryText = Builder.limitCharSequenceLength(charsequence);
            mSummaryTextSet = true;
            return this;
        }

        public BigPictureStyle()
        {
        }

        public BigPictureStyle(Builder builder)
        {
            setBuilder(builder);
        }
    }


    private class NotificationCompatImpl
    {

        public abstract Notification build(Builder builder, BuilderExtender builderextender);

        public abstract Action getAction(Notification notification, int i);

        public abstract int getActionCount(Notification notification);

        public abstract Action[] getActionsFromParcelableArrayList(ArrayList arraylist);

        public abstract Bundle getBundleForUnreadConversation(NotificationCompatBase.UnreadConversation unreadconversation);

        public abstract String getCategory(Notification notification);

        public abstract Bundle getExtras(Notification notification);

        public abstract String getGroup(Notification notification);

        public abstract boolean getLocalOnly(Notification notification);

        public abstract ArrayList getParcelableArrayListForActions(Action aaction[]);

        public abstract String getSortKey(Notification notification);

        public abstract NotificationCompatBase.UnreadConversation getUnreadConversationFromBundle(Bundle bundle, NotificationCompatBase.UnreadConversation.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1);

        public abstract boolean isGroupSummary(Notification notification);
    }


    private class NotificationCompatImplApi21 extends NotificationCompatImplApi20
    {
        private class NotificationCompatImplApi20 extends NotificationCompatImplKitKat
        {
            private class NotificationCompatImplKitKat extends NotificationCompatImplJellybean
            {
                private class NotificationCompatImplJellybean extends NotificationCompatImplBase
                {
                    private class NotificationCompatImplBase
                        implements NotificationCompatImpl
                    {

                        public Notification build(Builder builder, BuilderExtender builderextender)
                        {
                            builderextender = builder.mNotification;
                            builderextender.setLatestEventInfo(builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentIntent);
                            if (builder.mPriority > 0)
                            {
                                builderextender.flags = ((Notification) (builderextender)).flags | 0x80;
                            }
                            return builderextender;
                        }

                        public Action getAction(Notification notification, int i)
                        {
                            return null;
                        }

                        public int getActionCount(Notification notification)
                        {
                            return 0;
                        }

                        public Action[] getActionsFromParcelableArrayList(ArrayList arraylist)
                        {
                            return null;
                        }

                        public Bundle getBundleForUnreadConversation(NotificationCompatBase.UnreadConversation unreadconversation)
                        {
                            return null;
                        }

                        public String getCategory(Notification notification)
                        {
                            return null;
                        }

                        public Bundle getExtras(Notification notification)
                        {
                            return null;
                        }

                        public String getGroup(Notification notification)
                        {
                            return null;
                        }

                        public boolean getLocalOnly(Notification notification)
                        {
                            return false;
                        }

                        public ArrayList getParcelableArrayListForActions(Action aaction[])
                        {
                            return null;
                        }

                        public String getSortKey(Notification notification)
                        {
                            return null;
                        }

                        public NotificationCompatBase.UnreadConversation getUnreadConversationFromBundle(Bundle bundle, NotificationCompatBase.UnreadConversation.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
                        {
                            return null;
                        }

                        public boolean isGroupSummary(Notification notification)
                        {
                            return false;
                        }

                        NotificationCompatImplBase()
                        {
                        }
                    }


                    public Notification build(Builder builder, BuilderExtender builderextender)
                    {
                        NotificationCompatJellybean.Builder builder1 = new NotificationCompatJellybean.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey);
                        NotificationCompat.addActionsToBuilder(builder1, builder.mActions);
                        NotificationCompat.addStyleToBuilderJellybean(builder1, builder.mStyle);
                        return builderextender.build(builder, builder1);
                    }

                    public Action getAction(Notification notification, int i)
                    {
                        return (Action)NotificationCompatJellybean.getAction(notification, i, Action.FACTORY, RemoteInput.FACTORY);
                    }

                    public int getActionCount(Notification notification)
                    {
                        return NotificationCompatJellybean.getActionCount(notification);
                    }

                    public Action[] getActionsFromParcelableArrayList(ArrayList arraylist)
                    {
                        return (Action[])NotificationCompatJellybean.getActionsFromParcelableArrayList(arraylist, Action.FACTORY, RemoteInput.FACTORY);
                    }

                    public Bundle getExtras(Notification notification)
                    {
                        return NotificationCompatJellybean.getExtras(notification);
                    }

                    public String getGroup(Notification notification)
                    {
                        return NotificationCompatJellybean.getGroup(notification);
                    }

                    public boolean getLocalOnly(Notification notification)
                    {
                        return NotificationCompatJellybean.getLocalOnly(notification);
                    }

                    public ArrayList getParcelableArrayListForActions(Action aaction[])
                    {
                        return NotificationCompatJellybean.getParcelableArrayListForActions(aaction);
                    }

                    public String getSortKey(Notification notification)
                    {
                        return NotificationCompatJellybean.getSortKey(notification);
                    }

                    public boolean isGroupSummary(Notification notification)
                    {
                        return NotificationCompatJellybean.isGroupSummary(notification);
                    }

                    NotificationCompatImplJellybean()
                    {
                    }
                }


                public Notification build(Builder builder, BuilderExtender builderextender)
                {
                    NotificationCompatKitKat.Builder builder1 = new NotificationCompatKitKat.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mPeople, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey);
                    NotificationCompat.addActionsToBuilder(builder1, builder.mActions);
                    NotificationCompat.addStyleToBuilderJellybean(builder1, builder.mStyle);
                    return builderextender.build(builder, builder1);
                }

                public Action getAction(Notification notification, int i)
                {
                    return (Action)NotificationCompatKitKat.getAction(notification, i, Action.FACTORY, RemoteInput.FACTORY);
                }

                public int getActionCount(Notification notification)
                {
                    return NotificationCompatKitKat.getActionCount(notification);
                }

                public Bundle getExtras(Notification notification)
                {
                    return NotificationCompatKitKat.getExtras(notification);
                }

                public String getGroup(Notification notification)
                {
                    return NotificationCompatKitKat.getGroup(notification);
                }

                public boolean getLocalOnly(Notification notification)
                {
                    return NotificationCompatKitKat.getLocalOnly(notification);
                }

                public String getSortKey(Notification notification)
                {
                    return NotificationCompatKitKat.getSortKey(notification);
                }

                public boolean isGroupSummary(Notification notification)
                {
                    return NotificationCompatKitKat.isGroupSummary(notification);
                }

                NotificationCompatImplKitKat()
                {
                }
            }


            public Notification build(Builder builder, BuilderExtender builderextender)
            {
                NotificationCompatApi20.Builder builder1 = new NotificationCompatApi20.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mPeople, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey);
                NotificationCompat.addActionsToBuilder(builder1, builder.mActions);
                NotificationCompat.addStyleToBuilderJellybean(builder1, builder.mStyle);
                return builderextender.build(builder, builder1);
            }

            public Action getAction(Notification notification, int i)
            {
                return (Action)NotificationCompatApi20.getAction(notification, i, Action.FACTORY, RemoteInput.FACTORY);
            }

            public Action[] getActionsFromParcelableArrayList(ArrayList arraylist)
            {
                return (Action[])NotificationCompatApi20.getActionsFromParcelableArrayList(arraylist, Action.FACTORY, RemoteInput.FACTORY);
            }

            public String getGroup(Notification notification)
            {
                return NotificationCompatApi20.getGroup(notification);
            }

            public boolean getLocalOnly(Notification notification)
            {
                return NotificationCompatApi20.getLocalOnly(notification);
            }

            public ArrayList getParcelableArrayListForActions(Action aaction[])
            {
                return NotificationCompatApi20.getParcelableArrayListForActions(aaction);
            }

            public String getSortKey(Notification notification)
            {
                return NotificationCompatApi20.getSortKey(notification);
            }

            public boolean isGroupSummary(Notification notification)
            {
                return NotificationCompatApi20.isGroupSummary(notification);
            }

            NotificationCompatImplApi20()
            {
            }
        }


        public Notification build(Builder builder, BuilderExtender builderextender)
        {
            NotificationCompatApi21.Builder builder1 = new NotificationCompatApi21.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mCategory, builder.mPeople, builder.mExtras, builder.mColor, builder.mVisibility, builder.mPublicVersion, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey);
            NotificationCompat.addActionsToBuilder(builder1, builder.mActions);
            NotificationCompat.addStyleToBuilderJellybean(builder1, builder.mStyle);
            return builderextender.build(builder, builder1);
        }

        public Bundle getBundleForUnreadConversation(NotificationCompatBase.UnreadConversation unreadconversation)
        {
            return NotificationCompatApi21.getBundleForUnreadConversation(unreadconversation);
        }

        public String getCategory(Notification notification)
        {
            return NotificationCompatApi21.getCategory(notification);
        }

        public NotificationCompatBase.UnreadConversation getUnreadConversationFromBundle(Bundle bundle, NotificationCompatBase.UnreadConversation.Factory factory, RemoteInputCompatBase.RemoteInput.Factory factory1)
        {
            return NotificationCompatApi21.getUnreadConversationFromBundle(bundle, factory, factory1);
        }

        NotificationCompatImplApi21()
        {
        }
    }


    private class NotificationCompatImplIceCreamSandwich extends NotificationCompatImplBase
    {

        public Notification build(Builder builder, BuilderExtender builderextender)
        {
            return builderextender.build(builder, new NotificationCompatIceCreamSandwich.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate));
        }

        NotificationCompatImplIceCreamSandwich()
        {
        }
    }


    private class NotificationCompatImplHoneycomb extends NotificationCompatImplBase
    {

        public Notification build(Builder builder, BuilderExtender builderextender)
        {
            return NotificationCompatHoneycomb.add(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon);
        }

        NotificationCompatImplHoneycomb()
        {
        }
    }


    private class NotificationCompatImplGingerbread extends NotificationCompatImplBase
    {

        public Notification build(Builder builder, BuilderExtender builderextender)
        {
            builderextender = builder.mNotification;
            builderextender.setLatestEventInfo(builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentIntent);
            builderextender = NotificationCompatGingerbread.add(builderextender, builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentIntent, builder.mFullScreenIntent);
            if (builder.mPriority > 0)
            {
                builderextender.flags = ((Notification) (builderextender)).flags | 0x80;
            }
            return builderextender;
        }

        NotificationCompatImplGingerbread()
        {
        }
    }

}
