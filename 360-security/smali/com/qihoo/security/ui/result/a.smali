.class public Lcom/qihoo/security/ui/result/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:Lcom/qihoo/security/ui/result/a;


# instance fields
.field private final b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x0

    sput-object v0, Lcom/qihoo/security/ui/result/a;->a:Lcom/qihoo/security/ui/result/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/ui/result/a;->b:Landroid/content/Context;

    .line 43
    return-void
.end method

.method public static declared-synchronized a()Lcom/qihoo/security/ui/result/a;
    .locals 2

    .prologue
    .line 35
    const-class v1, Lcom/qihoo/security/ui/result/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/ui/result/a;->a:Lcom/qihoo/security/ui/result/a;

    if-nez v0, :cond_0

    .line 36
    new-instance v0, Lcom/qihoo/security/ui/result/a;

    invoke-direct {v0}, Lcom/qihoo/security/ui/result/a;-><init>()V

    sput-object v0, Lcom/qihoo/security/ui/result/a;->a:Lcom/qihoo/security/ui/result/a;

    .line 38
    :cond_0
    sget-object v0, Lcom/qihoo/security/ui/result/a;->a:Lcom/qihoo/security/ui/result/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 35
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private static a(Ljava/lang/String;Landroid/content/Intent;Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 143
    const-string/jumbo v1, ""

    .line 144
    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v2}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 145
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 146
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 147
    iget-object v3, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v3, v3, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v3, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 148
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    :goto_1
    move-object v1, v0

    .line 150
    goto :goto_0

    .line 151
    :cond_0
    return-object v1

    :cond_1
    move-object v0, v1

    goto :goto_1
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 105
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 106
    new-instance v0, Lcom/qihoo/security/ui/result/e;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/qihoo/security/ui/result/e;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    invoke-virtual {v0}, Lcom/qihoo/security/ui/result/e;->a()V

    .line 109
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/ui/result/AdvData;)V
    .locals 3

    .prologue
    .line 53
    if-nez p1, :cond_0

    .line 72
    :goto_0
    return-void

    .line 60
    :cond_0
    const/4 v0, 0x1

    :try_start_0
    iget v1, p1, Lcom/qihoo/security/ui/result/AdvData;->openType:I

    if-ne v0, v1, :cond_1

    .line 61
    invoke-virtual {p0, p1}, Lcom/qihoo/security/ui/result/a;->b(Lcom/qihoo/security/ui/result/AdvData;)V

    goto :goto_0

    .line 67
    :catch_0
    move-exception v0

    goto :goto_0

    .line 62
    :cond_1
    const/4 v0, 0x2

    iget v1, p1, Lcom/qihoo/security/ui/result/AdvData;->openType:I

    if-ne v0, v1, :cond_2

    .line 63
    iget-object v0, p0, Lcom/qihoo/security/ui/result/a;->b:Landroid/content/Context;

    iget-object v1, p1, Lcom/qihoo/security/ui/result/AdvData;->pkg:Ljava/lang/String;

    iget-object v2, p1, Lcom/qihoo/security/ui/result/AdvData;->openUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 65
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/result/a;->b:Landroid/content/Context;

    iget-object v1, p1, Lcom/qihoo/security/ui/result/AdvData;->pkg:Ljava/lang/String;

    iget-object v2, p1, Lcom/qihoo/security/ui/result/AdvData;->openUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/a;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Z)V
    .locals 4

    .prologue
    .line 116
    :try_start_0
    const-string/jumbo v0, "sp_name_adv_referrer"

    const-string/jumbo v1, ""

    invoke-static {v0, p1, v1}, Lcom/qihoo360/mobilesafe/share/d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 117
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 118
    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v2, "com.android.vending.INSTALL_REFERRER"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 119
    iget-object v2, p0, Lcom/qihoo/security/ui/result/a;->b:Landroid/content/Context;

    invoke-static {p1, v1, v2}, Lcom/qihoo/security/ui/result/a;->a(Ljava/lang/String;Landroid/content/Intent;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 120
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 121
    invoke-virtual {v1, p1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 129
    :goto_0
    const-string/jumbo v2, "referrer"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 130
    iget-object v0, p0, Lcom/qihoo/security/ui/result/a;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 131
    if-eqz p2, :cond_0

    .line 132
    const-string/jumbo v0, "sp_name_adv_referrer"

    invoke-static {v0, p1}, Lcom/qihoo360/mobilesafe/share/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    :cond_0
    :goto_1
    return-void

    .line 123
    :cond_1
    invoke-virtual {v1, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 135
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public a(Ljava/lang/String;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 156
    .line 158
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 159
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 160
    if-eqz v1, :cond_1

    .line 161
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    .line 162
    invoke-virtual {v1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v1

    .line 163
    const-string/jumbo v3, "market"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string/jumbo v2, "play.google.com"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const-string/jumbo v2, "market.android.com"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 176
    :cond_1
    :goto_0
    return v0

    .line 171
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public b(Lcom/qihoo/security/ui/result/AdvData;)V
    .locals 3

    .prologue
    .line 75
    invoke-static {}, Lcom/qihoo/security/ui/result/card/a/a;->a()Lcom/qihoo/security/ui/result/card/a/a;

    move-result-object v0

    const-string/jumbo v1, "advcard"

    const-string/jumbo v2, "parsetype"

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/ui/result/card/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 79
    const-string/jumbo v1, "1"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 80
    iget-object v0, p0, Lcom/qihoo/security/ui/result/a;->b:Landroid/content/Context;

    iget-object v1, p1, Lcom/qihoo/security/ui/result/AdvData;->pkg:Ljava/lang/String;

    iget-object v2, p1, Lcom/qihoo/security/ui/result/AdvData;->openUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/qihoo/security/support/a;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    :goto_0
    return-void

    .line 82
    :cond_0
    const-string/jumbo v1, "2"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 83
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/ui/result/a;->b:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/ui/result/view/AdvLoadingActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 84
    const-string/jumbo v1, "adv_data"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 85
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 86
    iget-object v1, p0, Lcom/qihoo/security/ui/result/a;->b:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 88
    :cond_1
    invoke-static {}, Lcom/qihoo/security/ui/result/a;->a()Lcom/qihoo/security/ui/result/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/qihoo/security/ui/result/a;->c(Lcom/qihoo/security/ui/result/AdvData;)V

    goto :goto_0
.end method

.method public c(Lcom/qihoo/security/ui/result/AdvData;)V
    .locals 4

    .prologue
    .line 98
    iget-object v0, p0, Lcom/qihoo/security/ui/result/a;->b:Landroid/content/Context;

    iget-object v1, p1, Lcom/qihoo/security/ui/result/AdvData;->pkg:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo/security/support/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/result/a;->b:Landroid/content/Context;

    iget-object v1, p1, Lcom/qihoo/security/ui/result/AdvData;->openUrl:Ljava/lang/String;

    iget-object v2, p1, Lcom/qihoo/security/ui/result/AdvData;->adid:Ljava/lang/String;

    iget-object v3, p1, Lcom/qihoo/security/ui/result/AdvData;->pkg:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo/security/ui/result/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    return-void
.end method
