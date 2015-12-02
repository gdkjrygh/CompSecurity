.class public Lcom/facebook/orca/app/LoginReminderManager;
.super Ljava/lang/Object;
.source "LoginReminderManager.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/prefs/shared/ae;

.field private final c:Landroid/content/Context;

.field private final d:Lcom/facebook/prefs/shared/d;

.field private final e:Lcom/facebook/auth/b/b;

.field private final f:Lcom/facebook/orca/notify/an;

.field private final g:Lcom/facebook/analytics/av;

.field private final h:Landroid/app/AlarmManager;

.field private final i:Landroid/app/NotificationManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 40
    const-class v0, Lcom/facebook/orca/app/LoginReminderManager;

    sput-object v0, Lcom/facebook/orca/app/LoginReminderManager;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/auth/b/b;Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/notify/an;Lcom/facebook/analytics/av;)V
    .locals 2

    .prologue
    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    const-string v0, "messenger_logout_notify_android"

    invoke-static {v0}, Lcom/facebook/f/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/app/LoginReminderManager;->b:Lcom/facebook/prefs/shared/ae;

    .line 63
    iput-object p1, p0, Lcom/facebook/orca/app/LoginReminderManager;->c:Landroid/content/Context;

    .line 64
    iput-object p2, p0, Lcom/facebook/orca/app/LoginReminderManager;->e:Lcom/facebook/auth/b/b;

    .line 65
    iput-object p3, p0, Lcom/facebook/orca/app/LoginReminderManager;->d:Lcom/facebook/prefs/shared/d;

    .line 66
    iput-object p4, p0, Lcom/facebook/orca/app/LoginReminderManager;->f:Lcom/facebook/orca/notify/an;

    .line 67
    iput-object p5, p0, Lcom/facebook/orca/app/LoginReminderManager;->g:Lcom/facebook/analytics/av;

    .line 68
    const-string v0, "alarm"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    iput-object v0, p0, Lcom/facebook/orca/app/LoginReminderManager;->h:Landroid/app/AlarmManager;

    .line 69
    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    iput-object v0, p0, Lcom/facebook/orca/app/LoginReminderManager;->i:Landroid/app/NotificationManager;

    .line 73
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 74
    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.SHOWING_LOGIN_UI"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 75
    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.LOGIN_COMPLETE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 76
    const-string v1, "com.facebook.orca.login.AuthStateMachineMonitor.LOGOUT_COMPLETE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 78
    new-instance v1, Lcom/facebook/orca/app/d;

    invoke-direct {v1, p0, p1, v0}, Lcom/facebook/orca/app/d;-><init>(Lcom/facebook/orca/app/LoginReminderManager;Landroid/content/Context;Landroid/content/IntentFilter;)V

    .line 92
    invoke-virtual {v1}, Lcom/facebook/base/broadcast/q;->a()V

    .line 93
    return-void
.end method

.method private a(I)V
    .locals 6

    .prologue
    const/16 v5, 0xb

    const/4 v3, 0x0

    const/16 v4, 0xa

    .line 130
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/app/LoginReminderManager;->c:Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/app/LoginReminderManager$AlarmBroadcastReceiver;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 131
    const-string v1, "com.facebook.orca.app.ACTION_ALARM"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 132
    iget-object v1, p0, Lcom/facebook/orca/app/LoginReminderManager;->c:Landroid/content/Context;

    invoke-static {v1, v3, v0, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 133
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 134
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 136
    packed-switch p1, :pswitch_data_0

    .line 159
    :goto_0
    return-void

    .line 138
    :pswitch_0
    const/4 v2, 0x3

    invoke-virtual {v1, v4, v2}, Ljava/util/Calendar;->add(II)V

    .line 153
    :goto_1
    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/16 v3, 0x14

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v1, v5, v2}, Ljava/util/Calendar;->set(II)V

    .line 154
    iget-object v2, p0, Lcom/facebook/orca/app/LoginReminderManager;->h:Landroid/app/AlarmManager;

    const/4 v3, 0x1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v4

    invoke-virtual {v2, v3, v4, v5, v0}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 156
    iget-object v0, p0, Lcom/facebook/orca/app/LoginReminderManager;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 157
    sget-object v1, Lcom/facebook/orca/prefs/o;->e:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, p1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    .line 158
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    goto :goto_0

    .line 141
    :pswitch_1
    const/16 v2, 0x12

    invoke-virtual {v1, v4, v2}, Ljava/util/Calendar;->add(II)V

    goto :goto_1

    .line 144
    :pswitch_2
    const/16 v2, 0x24

    invoke-virtual {v1, v4, v2}, Ljava/util/Calendar;->add(II)V

    goto :goto_1

    .line 147
    :pswitch_3
    const/16 v2, 0x48

    invoke-virtual {v1, v4, v2}, Ljava/util/Calendar;->add(II)V

    goto :goto_1

    .line 136
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static synthetic a(Lcom/facebook/orca/app/LoginReminderManager;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/facebook/orca/app/LoginReminderManager;->e()V

    return-void
.end method

.method static synthetic b(Lcom/facebook/orca/app/LoginReminderManager;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/facebook/orca/app/LoginReminderManager;->f()V

    return-void
.end method

.method private d()V
    .locals 3

    .prologue
    .line 123
    iget-object v0, p0, Lcom/facebook/orca/app/LoginReminderManager;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 124
    sget-object v1, Lcom/facebook/orca/prefs/o;->e:Lcom/facebook/prefs/shared/ae;

    const/4 v2, -0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    .line 125
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 126
    return-void
.end method

.method private e()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 163
    iget-object v0, p0, Lcom/facebook/orca/app/LoginReminderManager;->e:Lcom/facebook/auth/b/b;

    invoke-interface {v0}, Lcom/facebook/auth/b/b;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 208
    :cond_0
    :goto_0
    return-void

    .line 167
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/app/LoginReminderManager;->f:Lcom/facebook/orca/notify/an;

    invoke-interface {v0}, Lcom/facebook/orca/notify/an;->e()I

    move-result v0

    .line 168
    new-instance v1, Landroid/app/Notification;

    iget-object v2, p0, Lcom/facebook/orca/app/LoginReminderManager;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/facebook/o;->notifications_login_reminder_description:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-direct {v1, v0, v2, v3, v4}, Landroid/app/Notification;-><init>(ILjava/lang/CharSequence;J)V

    .line 174
    new-instance v0, Landroid/content/Intent;

    iget-object v2, p0, Lcom/facebook/orca/app/LoginReminderManager;->c:Landroid/content/Context;

    const-class v3, Lcom/facebook/orca/app/LoginReminderManager$NotificationBroadcastReceiver;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 176
    const-string v2, "com.facebook.orca.app.ACTION_NOTIFICATION_ALARM"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 178
    iget-object v2, p0, Lcom/facebook/orca/app/LoginReminderManager;->c:Landroid/content/Context;

    invoke-static {v2, v5, v0, v5}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 184
    iget-object v2, p0, Lcom/facebook/orca/app/LoginReminderManager;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/facebook/o;->app_name:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 185
    iget-object v3, p0, Lcom/facebook/orca/app/LoginReminderManager;->c:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/facebook/o;->notifications_login_reminder_description:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 188
    iget-object v4, p0, Lcom/facebook/orca/app/LoginReminderManager;->c:Landroid/content/Context;

    invoke-virtual {v1, v4, v2, v3, v0}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 194
    iget-object v0, p0, Lcom/facebook/orca/app/LoginReminderManager;->i:Landroid/app/NotificationManager;

    const/16 v2, 0x2712

    invoke-virtual {v0, v2, v1}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 198
    iget-object v0, p0, Lcom/facebook/orca/app/LoginReminderManager;->d:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/o;->e:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v5}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v0

    .line 201
    iget-object v1, p0, Lcom/facebook/orca/app/LoginReminderManager;->g:Lcom/facebook/analytics/av;

    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v3, "login_reminder_notification_created"

    invoke-direct {v2, v3}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v3, "trigger_state"

    invoke-virtual {v2, v3, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 205
    if-ltz v0, :cond_0

    .line 206
    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lcom/facebook/orca/app/LoginReminderManager;->a(I)V

    goto :goto_0
.end method

.method private f()V
    .locals 4

    .prologue
    .line 212
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/orca/app/LoginReminderManager;->c:Landroid/content/Context;

    const-class v2, Lcom/facebook/orca/auth/StartScreenActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 213
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 214
    iget-object v1, p0, Lcom/facebook/orca/app/LoginReminderManager;->c:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 216
    iget-object v0, p0, Lcom/facebook/orca/app/LoginReminderManager;->d:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/o;->e:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v0

    .line 219
    iget-object v1, p0, Lcom/facebook/orca/app/LoginReminderManager;->g:Lcom/facebook/analytics/av;

    new-instance v2, Lcom/facebook/analytics/cb;

    const-string v3, "login_reminder_notification_clicked"

    invoke-direct {v2, v3}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v3, "trigger_state"

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {v2, v3, v0}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 222
    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 96
    iget-object v0, p0, Lcom/facebook/orca/app/LoginReminderManager;->d:Lcom/facebook/prefs/shared/d;

    iget-object v1, p0, Lcom/facebook/orca/app/LoginReminderManager;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    invoke-direct {p0, v2}, Lcom/facebook/orca/app/LoginReminderManager;->a(I)V

    .line 99
    :cond_0
    return-void
.end method

.method public b()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 102
    iget-object v0, p0, Lcom/facebook/orca/app/LoginReminderManager;->e:Lcom/facebook/auth/b/b;

    invoke-interface {v0}, Lcom/facebook/auth/b/b;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 103
    iget-object v0, p0, Lcom/facebook/orca/app/LoginReminderManager;->d:Lcom/facebook/prefs/shared/d;

    iget-object v1, p0, Lcom/facebook/orca/app/LoginReminderManager;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/facebook/orca/app/LoginReminderManager;->d:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/o;->e:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v0

    .line 108
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 109
    invoke-direct {p0, v2}, Lcom/facebook/orca/app/LoginReminderManager;->a(I)V

    .line 115
    :cond_0
    :goto_0
    return-void

    .line 113
    :cond_1
    invoke-direct {p0}, Lcom/facebook/orca/app/LoginReminderManager;->d()V

    goto :goto_0
.end method

.method public c()V
    .locals 2

    .prologue
    .line 118
    iget-object v0, p0, Lcom/facebook/orca/app/LoginReminderManager;->i:Landroid/app/NotificationManager;

    const/16 v1, 0x2712

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 119
    invoke-direct {p0}, Lcom/facebook/orca/app/LoginReminderManager;->d()V

    .line 120
    return-void
.end method
