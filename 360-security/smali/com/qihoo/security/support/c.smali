.class public final Lcom/qihoo/security/support/c;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final a:Ljava/lang/String;

.field private static b:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 35
    const-string/jumbo v0, "http://securityuninstall.data.360safe.com/?"

    sput-object v0, Lcom/qihoo/security/support/c;->a:Ljava/lang/String;

    .line 38
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo/security/support/c;->b:Landroid/os/Bundle;

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Landroid/os/Bundle;
    .locals 4

    .prologue
    .line 41
    const-class v1, Lcom/qihoo/security/support/c;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/support/c;->b:Landroid/os/Bundle;

    if-nez v0, :cond_0

    .line 42
    invoke-static {p0}, Lcom/qihoo/security/support/c;->b(Landroid/content/Context;)Landroid/os/Bundle;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/support/c;->b:Landroid/os/Bundle;

    .line 45
    :cond_0
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/locale/d;->f()Ljava/lang/String;

    move-result-object v0

    .line 46
    const-string/jumbo v2, ""

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 47
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 48
    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    .line 50
    :cond_1
    sget-object v2, Lcom/qihoo/security/support/c;->b:Landroid/os/Bundle;

    const-string/jumbo v3, "lang"

    invoke-virtual {v2, v3, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    sget-object v0, Lcom/qihoo/security/support/c;->b:Landroid/os/Bundle;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 41
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private static b(Landroid/content/Context;)Landroid/os/Bundle;
    .locals 4

    .prologue
    .line 55
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 56
    new-instance v0, Lcom/qihoo/security/d/a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/d/a;-><init>(Landroid/content/Context;)V

    .line 57
    const-string/jumbo v2, "unistat"

    const-string/jumbo v3, "host"

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/security/d/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 58
    if-nez v0, :cond_0

    sget-object v0, Lcom/qihoo/security/support/c;->a:Ljava/lang/String;

    .line 59
    :cond_0
    const-string/jumbo v2, ""

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    const-string/jumbo v0, "client"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    const-string/jumbo v0, "version"

    const-string/jumbo v2, "1.0.8.3742"

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    const-string/jumbo v0, "deviceModel"

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    const-string/jumbo v0, "sysVersion"

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    const-string/jumbo v2, "isRoot"

    invoke-static {}, Lcom/qihoo360/mobilesafe/support/a;->a()Z

    move-result v0

    if-eqz v0, :cond_5

    const-string/jumbo v0, "0"

    :goto_0
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    const-string/jumbo v2, "gp"

    const-string/jumbo v0, "com.google.android.gms"

    invoke-static {p0, v0}, Lcom/qihoo360/mobilesafe/b/o;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {p0}, Lcom/qihoo360/mobilesafe/b/o;->h(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string/jumbo v0, "1"

    :goto_1
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const-string/jumbo v0, "email"

    invoke-static {p0}, Lcom/qihoo360/mobilesafe/b/o;->i(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    if-eqz p0, :cond_1

    .line 70
    const-string/jumbo v0, "deviceId"

    invoke-static {p0}, Lcom/qihoo360/mobilesafe/b/o;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v2, "phone"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 73
    const-string/jumbo v2, "district"

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    :cond_1
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/locale/d;->f()Ljava/lang/String;

    move-result-object v0

    .line 76
    const-string/jumbo v2, ""

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 77
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget-object v2, v2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    .line 78
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    .line 80
    :cond_2
    const-string/jumbo v2, "g_subcid"

    const-string/jumbo v3, ""

    invoke-static {p0, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 81
    if-eqz v2, :cond_3

    const-string/jumbo v3, ""

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 82
    const-string/jumbo v3, "subChannel"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    :cond_3
    const-string/jumbo v2, "lang"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    const-string/jumbo v0, "channel"

    invoke-static {p0}, Lcom/qihoo/security/env/a;->a(Landroid/content/Context;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/support/NativeManager;->getCodePS(J)Ljava/lang/String;

    move-result-object v0

    .line 94
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/qihoo360/mobilesafe/support/NativeManager;->getCodePD(J)Ljava/lang/String;

    move-result-object v2

    .line 96
    if-eqz v0, :cond_4

    if-eqz v2, :cond_4

    .line 97
    const-string/jumbo v3, "dk"

    invoke-virtual {v1, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    const-string/jumbo v2, "sk"

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    :cond_4
    :goto_2
    return-object v1

    .line 64
    :cond_5
    const-string/jumbo v0, "1"

    goto/16 :goto_0

    .line 65
    :cond_6
    const-string/jumbo v0, "0"

    goto/16 :goto_1

    .line 100
    :catch_0
    move-exception v0

    goto :goto_2
.end method
