.class public Lcom/qihoo/security/receiver/PlayReceiver;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 169
    const/4 v1, 0x0

    .line 171
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1, p2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v1

    .line 200
    :goto_0
    return-object v0

    .line 178
    :cond_1
    const-string/jumbo v0, "&"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 184
    if-eqz v2, :cond_3

    array-length v0, v2

    if-lez v0, :cond_3

    .line 185
    const/4 v0, 0x0

    :goto_1
    array-length v3, v2

    if-ge v0, v3, :cond_3

    .line 186
    aget-object v3, v2, v0

    .line 187
    if-eqz v3, :cond_2

    invoke-virtual {v3, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 188
    const-string/jumbo v4, "="

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 192
    if-eqz v3, :cond_2

    array-length v4, v3

    if-le v4, v5, :cond_2

    .line 193
    aget-object v0, v3, v5

    goto :goto_0

    .line 185
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    move-object v0, v1

    .line 200
    goto :goto_0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 26
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "package_source"

    const-string/jumbo v2, "google play"

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    if-nez p2, :cond_1

    .line 166
    :cond_0
    :goto_0
    return-void

    .line 32
    :cond_1
    const-string/jumbo v0, "referrer"

    const/4 v1, 0x0

    invoke-static {p2, v0, v1}, Lcom/qihoo360/mobilesafe/b/h;->a(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 64
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 69
    invoke-static {p1, v1}, Lcom/qihoo/security/env/a;->a(Landroid/content/Context;I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 73
    :catch_0
    move-exception v1

    .line 79
    if-eqz v0, :cond_2

    const-string/jumbo v1, "qihoo_id"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 90
    :try_start_1
    const-string/jumbo v1, "qihoo_id"

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/receiver/PlayReceiver;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 97
    invoke-static {p1, v1}, Lcom/qihoo/security/env/a;->a(Landroid/content/Context;I)V

    .line 100
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string/jumbo v2, "gp_url"

    invoke-static {v1, v2, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 104
    :try_start_2
    const-string/jumbo v1, "qihoo_subid"

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/receiver/PlayReceiver;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 109
    invoke-static {p1, v0}, Lcom/qihoo/security/env/a;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    .line 110
    :catch_1
    move-exception v0

    goto :goto_0

    .line 121
    :cond_2
    if-eqz v0, :cond_3

    const-string/jumbo v1, "af_tranid"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 129
    :try_start_3
    const-string/jumbo v1, "reg"

    const/4 v2, 0x0

    invoke-static {p1, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_0

    .line 131
    const v1, 0x497eb

    invoke-static {p1, v1}, Lcom/qihoo/security/env/a;->a(Landroid/content/Context;I)V

    .line 133
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string/jumbo v2, "gp_url"

    invoke-static {v1, v2, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    invoke-static {}, Lcom/appsflyer/AppsFlyerProperties;->getInstance()Lcom/appsflyer/AppsFlyerProperties;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/appsflyer/AppsFlyerProperties;->disableLogOutput(Z)V

    .line 139
    new-instance v0, Lcom/appsflyer/AppsFlyerLib;

    invoke-direct {v0}, Lcom/appsflyer/AppsFlyerLib;-><init>()V

    invoke-virtual {v0, p1, p2}, Lcom/appsflyer/AppsFlyerLib;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_0

    .line 141
    :catch_2
    move-exception v0

    goto/16 :goto_0

    .line 146
    :cond_3
    if-eqz v0, :cond_4

    const-string/jumbo v1, "AppFlyer_TEST"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    :cond_4
    if-eqz v0, :cond_0

    const-string/jumbo v1, "AppsFlyer_Test"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_0

    .line 116
    :catch_3
    move-exception v0

    goto/16 :goto_0
.end method
