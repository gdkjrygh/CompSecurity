.class public Lcom/facebook/vvm/datasms/DataSmsReceiver;
.super Landroid/app/IntentService;
.source "DataSmsReceiver.java"


# instance fields
.field private a:Lcom/facebook/analytics/av;

.field private b:Landroid/telephony/TelephonyManager;

.field private c:Lcom/facebook/prefs/shared/d;

.field private d:Z

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 50
    const-string v0, "DataSmsReceiver"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 51
    return-void
.end method

.method private a(Lcom/facebook/vvm/a/a;)V
    .locals 4

    .prologue
    .line 90
    iget-boolean v0, p0, Lcom/facebook/vvm/datasms/DataSmsReceiver;->d:Z

    if-nez v0, :cond_1

    .line 116
    :cond_0
    :goto_0
    return-void

    .line 95
    :cond_1
    iget-object v0, p0, Lcom/facebook/vvm/datasms/DataSmsReceiver;->c:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/vvm/a/c;->b:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 99
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "vvm_sms_reporting_data"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "country_iso_code"

    iget-object v2, p0, Lcom/facebook/vvm/datasms/DataSmsReceiver;->b:Landroid/telephony/TelephonyManager;

    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "carrier"

    iget-object v2, p0, Lcom/facebook/vvm/datasms/DataSmsReceiver;->b:Landroid/telephony/TelephonyManager;

    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 104
    iget-boolean v1, p0, Lcom/facebook/vvm/datasms/DataSmsReceiver;->e:Z

    if-eqz v1, :cond_2

    .line 105
    const-string v1, "application_directed_string"

    invoke-virtual {p1}, Lcom/facebook/vvm/a/a;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v1

    const-string v2, "telephonenumber"

    iget-object v3, p0, Lcom/facebook/vvm/datasms/DataSmsReceiver;->b:Landroid/telephony/TelephonyManager;

    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getLine1Number()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    .line 109
    :cond_2
    iget-object v1, p0, Lcom/facebook/vvm/datasms/DataSmsReceiver;->a:Lcom/facebook/analytics/av;

    invoke-interface {v1, v0}, Lcom/facebook/analytics/av;->b(Lcom/facebook/analytics/ca;)V

    .line 113
    iget-object v0, p0, Lcom/facebook/vvm/datasms/DataSmsReceiver;->c:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/vvm/a/c;->b:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    goto :goto_0
.end method


# virtual methods
.method public onCreate()V
    .locals 3

    .prologue
    .line 55
    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    .line 57
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 58
    const-class v0, Lcom/facebook/analytics/av;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/analytics/av;

    iput-object v0, p0, Lcom/facebook/vvm/datasms/DataSmsReceiver;->a:Lcom/facebook/analytics/av;

    .line 59
    const-class v0, Landroid/telephony/TelephonyManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    iput-object v0, p0, Lcom/facebook/vvm/datasms/DataSmsReceiver;->b:Landroid/telephony/TelephonyManager;

    .line 60
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/vvm/datasms/DataSmsReceiver;->c:Lcom/facebook/prefs/shared/d;

    .line 62
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/vvm/annotations/IsVvmSmsReportingEnabledForUser;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    .line 64
    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/vvm/datasms/DataSmsReceiver;->d:Z

    .line 66
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/vvm/annotations/IsVvmSmsDetailedReportingEnabledForUser;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    .line 68
    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/vvm/datasms/DataSmsReceiver;->e:Z

    .line 69
    return-void
.end method

.method public final onHandleIntent(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 73
    if-nez p1, :cond_1

    .line 86
    :cond_0
    :goto_0
    return-void

    .line 77
    :cond_1
    const-string v0, "application_directed_string"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/facebook/vvm/a/a;

    .line 81
    if-eqz v0, :cond_0

    .line 85
    invoke-direct {p0, v0}, Lcom/facebook/vvm/datasms/DataSmsReceiver;->a(Lcom/facebook/vvm/a/a;)V

    goto :goto_0
.end method
