.class public Lcom/facebook/orca/prefs/q;
.super Landroid/preference/CheckBoxPreference;
.source "NotificationEnabledPreference.java"


# instance fields
.field private a:Lcom/facebook/prefs/shared/d;

.field private b:Lcom/facebook/orca/notify/as;

.field private c:Lcom/facebook/orca/notify/NotificationSetting;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 28
    invoke-direct {p0, p1}, Landroid/preference/CheckBoxPreference;-><init>(Landroid/content/Context;)V

    .line 30
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 31
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/orca/prefs/q;->a:Lcom/facebook/prefs/shared/d;

    .line 32
    const-class v0, Lcom/facebook/orca/notify/as;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/as;

    iput-object v0, p0, Lcom/facebook/orca/prefs/q;->b:Lcom/facebook/orca/notify/as;

    .line 33
    iget-object v0, p0, Lcom/facebook/orca/prefs/q;->b:Lcom/facebook/orca/notify/as;

    invoke-virtual {v0}, Lcom/facebook/orca/notify/as;->a()Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/prefs/q;->c:Lcom/facebook/orca/notify/NotificationSetting;

    .line 34
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/q;->setDefaultValue(Ljava/lang/Object;)V

    .line 35
    sget-object v0, Lcom/facebook/orca/prefs/n;->n:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/ae;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/q;->setKey(Ljava/lang/String;)V

    .line 36
    invoke-direct {p0}, Lcom/facebook/orca/prefs/q;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/q;->setSummary(Ljava/lang/CharSequence;)V

    .line 37
    return-void
.end method

.method private a()Ljava/lang/String;
    .locals 6

    .prologue
    .line 40
    invoke-virtual {p0}, Lcom/facebook/orca/prefs/q;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 41
    iget-object v1, p0, Lcom/facebook/orca/prefs/q;->b:Lcom/facebook/orca/notify/as;

    iget-object v2, p0, Lcom/facebook/orca/prefs/q;->c:Lcom/facebook/orca/notify/NotificationSetting;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/notify/as;->b(Lcom/facebook/orca/notify/NotificationSetting;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 42
    new-instance v1, Ljava/util/Date;

    iget-object v2, p0, Lcom/facebook/orca/prefs/q;->c:Lcom/facebook/orca/notify/NotificationSetting;

    invoke-virtual {v2}, Lcom/facebook/orca/notify/NotificationSetting;->b()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 43
    invoke-static {v0}, Landroid/text/format/DateFormat;->getTimeFormat(Landroid/content/Context;)Ljava/text/DateFormat;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 44
    sget v2, Lcom/facebook/o;->preference_notifications_muted_until:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 48
    :goto_0
    return-object v0

    .line 45
    :cond_0
    iget-object v1, p0, Lcom/facebook/orca/prefs/q;->c:Lcom/facebook/orca/notify/NotificationSetting;

    invoke-virtual {v1}, Lcom/facebook/orca/notify/NotificationSetting;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 46
    const/4 v0, 0x0

    goto :goto_0

    .line 48
    :cond_1
    sget v1, Lcom/facebook/o;->preference_notifications_disabled:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected onSetInitialValue(ZLjava/lang/Object;)V
    .locals 2

    .prologue
    .line 54
    iget-object v0, p0, Lcom/facebook/orca/prefs/q;->b:Lcom/facebook/orca/notify/as;

    iget-object v1, p0, Lcom/facebook/orca/prefs/q;->c:Lcom/facebook/orca/notify/NotificationSetting;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/notify/as;->b(Lcom/facebook/orca/notify/NotificationSetting;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/q;->setChecked(Z)V

    .line 55
    return-void

    .line 54
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setChecked(Z)V
    .locals 4

    .prologue
    .line 59
    invoke-super {p0, p1}, Landroid/preference/CheckBoxPreference;->setChecked(Z)V

    .line 60
    if-eqz p1, :cond_0

    .line 61
    sget-object v0, Lcom/facebook/orca/notify/NotificationSetting;->a:Lcom/facebook/orca/notify/NotificationSetting;

    iput-object v0, p0, Lcom/facebook/orca/prefs/q;->c:Lcom/facebook/orca/notify/NotificationSetting;

    .line 66
    :goto_0
    sget-object v0, Lcom/facebook/orca/prefs/n;->o:Lcom/facebook/prefs/shared/ae;

    .line 67
    iget-object v1, p0, Lcom/facebook/orca/prefs/q;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    .line 68
    iget-object v2, p0, Lcom/facebook/orca/prefs/q;->c:Lcom/facebook/orca/notify/NotificationSetting;

    invoke-virtual {v2}, Lcom/facebook/orca/notify/NotificationSetting;->d()J

    move-result-wide v2

    invoke-interface {v1, v0, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    .line 69
    invoke-interface {v1}, Lcom/facebook/prefs/shared/e;->a()V

    .line 70
    invoke-direct {p0}, Lcom/facebook/orca/prefs/q;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/prefs/q;->setSummary(Ljava/lang/CharSequence;)V

    .line 71
    return-void

    .line 63
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    const-wide/16 v2, 0x7080

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Lcom/facebook/orca/notify/NotificationSetting;->a(J)Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/prefs/q;->c:Lcom/facebook/orca/notify/NotificationSetting;

    goto :goto_0
.end method
