.class public Lcom/facebook/config/server/q;
.super Ljava/lang/Object;
.source "UserAgentFactory.java"


# instance fields
.field private final a:Lcom/facebook/config/b/a;

.field private final b:Landroid/telephony/TelephonyManager;

.field private final c:Ljava/util/Locale;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/facebook/config/b/a;Landroid/telephony/TelephonyManager;Ljava/util/Locale;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lcom/facebook/config/server/q;->a:Lcom/facebook/config/b/a;

    .line 41
    iput-object p2, p0, Lcom/facebook/config/server/q;->b:Landroid/telephony/TelephonyManager;

    .line 42
    iput-object p3, p0, Lcom/facebook/config/server/q;->c:Ljava/util/Locale;

    .line 43
    iput-object p4, p0, Lcom/facebook/config/server/q;->d:Ljava/lang/String;

    .line 44
    return-void
.end method

.method private static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 67
    invoke-static {p0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 68
    const-string v0, "null"

    .line 70
    :goto_0
    return-object v0

    :cond_0
    const-string v0, "/"

    const-string v1, "-"

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ";"

    const-string v2, "-"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 5

    .prologue
    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    const-string v1, "http.agent"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    const-string v1, "%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;%s/%s;%s/%s"

    const/16 v2, 0x12

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    const-string v4, "FBAN"

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/facebook/config/server/q;->d:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x2

    const-string v4, "FBAV"

    aput-object v4, v2, v3

    const/4 v3, 0x3

    iget-object v4, p0, Lcom/facebook/config/server/q;->a:Lcom/facebook/config/b/a;

    invoke-interface {v4}, Lcom/facebook/config/b/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/config/server/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x4

    const-string v4, "FBLC"

    aput-object v4, v2, v3

    const/4 v3, 0x5

    iget-object v4, p0, Lcom/facebook/config/server/q;->c:Ljava/util/Locale;

    invoke-virtual {v4}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/config/server/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x6

    const-string v4, "FBBV"

    aput-object v4, v2, v3

    const/4 v3, 0x7

    iget-object v4, p0, Lcom/facebook/config/server/q;->a:Lcom/facebook/config/b/a;

    invoke-interface {v4}, Lcom/facebook/config/b/a;->b()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/16 v3, 0x8

    const-string v4, "FBCR"

    aput-object v4, v2, v3

    const/16 v3, 0x9

    iget-object v4, p0, Lcom/facebook/config/server/q;->b:Landroid/telephony/TelephonyManager;

    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/facebook/config/server/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/16 v3, 0xa

    const-string v4, "FBMF"

    aput-object v4, v2, v3

    const/16 v3, 0xb

    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-static {v4}, Lcom/facebook/config/server/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/16 v3, 0xc

    const-string v4, "FBBD"

    aput-object v4, v2, v3

    const/16 v3, 0xd

    sget-object v4, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-static {v4}, Lcom/facebook/config/server/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/16 v3, 0xe

    const-string v4, "FBDV"

    aput-object v4, v2, v3

    const/16 v3, 0xf

    sget-object v4, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {v4}, Lcom/facebook/config/server/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/16 v3, 0x10

    const-string v4, "FBSV"

    aput-object v4, v2, v3

    const/16 v3, 0x11

    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-static {v4}, Lcom/facebook/config/server/q;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Lcom/facebook/common/w/m;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
