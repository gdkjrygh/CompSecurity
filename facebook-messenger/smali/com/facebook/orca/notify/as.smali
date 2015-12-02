.class public Lcom/facebook/orca/notify/as;
.super Ljava/lang/Object;
.source "NotificationSettingsUtil.java"


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/facebook/orca/notify/as;->a:Lcom/facebook/prefs/shared/d;

    .line 22
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/notify/NotificationSetting;
    .locals 4

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/orca/notify/as;->a:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->o:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/facebook/orca/notify/NotificationSetting;->b(J)Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Lcom/facebook/orca/notify/NotificationSetting;
    .locals 4

    .prologue
    .line 30
    invoke-static {p1}, Lcom/facebook/orca/prefs/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    .line 31
    iget-object v1, p0, Lcom/facebook/orca/notify/as;->a:Lcom/facebook/prefs/shared/d;

    const-wide/16 v2, 0x0

    invoke-interface {v1, v0, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/facebook/orca/notify/NotificationSetting;->b(J)Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/orca/notify/NotificationSetting;)Z
    .locals 6

    .prologue
    .line 36
    invoke-virtual {p1}, Lcom/facebook/orca/notify/NotificationSetting;->b()J

    move-result-wide v0

    .line 37
    invoke-virtual {p1}, Lcom/facebook/orca/notify/NotificationSetting;->a()Z

    move-result v2

    if-eqz v2, :cond_1

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Ljava/util/Date;
    .locals 4

    .prologue
    const/16 v3, 0xa

    const/4 v2, 0x0

    .line 48
    invoke-static {}, Ljava/util/GregorianCalendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 49
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 50
    const/16 v1, 0xc

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 51
    const/16 v1, 0xd

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 52
    const/16 v1, 0xe

    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 53
    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    .line 54
    const/16 v2, 0x8

    if-ge v1, v2, :cond_0

    .line 55
    rsub-int/lit8 v1, v1, 0x8

    invoke-virtual {v0, v3, v1}, Ljava/util/Calendar;->add(II)V

    .line 59
    :goto_0
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    return-object v0

    .line 57
    :cond_0
    rsub-int/lit8 v1, v1, 0x20

    invoke-virtual {v0, v3, v1}, Ljava/util/Calendar;->add(II)V

    goto :goto_0
.end method

.method public b(Lcom/facebook/orca/notify/NotificationSetting;)Z
    .locals 6

    .prologue
    .line 42
    invoke-virtual {p1}, Lcom/facebook/orca/notify/NotificationSetting;->b()J

    move-result-wide v0

    .line 43
    invoke-virtual {p1}, Lcom/facebook/orca/notify/NotificationSetting;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
