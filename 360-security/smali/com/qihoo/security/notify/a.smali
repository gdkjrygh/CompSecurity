.class public Lcom/qihoo/security/notify/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/qihoo/security/service/a;

.field private d:Landroid/os/Handler;

.field private e:Ljava/lang/Thread;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 31
    const-class v0, Lcom/qihoo/security/notify/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/notify/a;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/qihoo/security/service/a;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object v0, p0, Lcom/qihoo/security/notify/a;->b:Landroid/content/Context;

    .line 41
    iput-object v0, p0, Lcom/qihoo/security/notify/a;->c:Lcom/qihoo/security/service/a;

    .line 42
    iput-object v0, p0, Lcom/qihoo/security/notify/a;->d:Landroid/os/Handler;

    .line 43
    iput-object v0, p0, Lcom/qihoo/security/notify/a;->e:Ljava/lang/Thread;

    .line 46
    iput-object p1, p0, Lcom/qihoo/security/notify/a;->b:Landroid/content/Context;

    .line 47
    iput-object p2, p0, Lcom/qihoo/security/notify/a;->c:Lcom/qihoo/security/service/a;

    .line 48
    new-instance v0, Lcom/qihoo/security/notify/a$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/notify/a$1;-><init>(Lcom/qihoo/security/notify/a;)V

    iput-object v0, p0, Lcom/qihoo/security/notify/a;->d:Landroid/os/Handler;

    .line 77
    return-void
.end method

.method private a(Ljava/util/Date;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 182
    const-string/jumbo v0, ""

    .line 183
    if-nez p1, :cond_0

    .line 199
    :goto_0
    return-object v0

    .line 189
    :cond_0
    :try_start_0
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string/jumbo v2, "yyyyMMdd"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 190
    invoke-virtual {v1, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 191
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/notify/a;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/qihoo/security/notify/a;->c()V

    return-void
.end method

.method private a(Ljava/util/Date;Ljava/util/Date;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 161
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 168
    :cond_0
    :goto_0
    return v0

    .line 164
    :cond_1
    invoke-direct {p0, p2}, Lcom/qihoo/security/notify/a;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, Lcom/qihoo/security/notify/a;->a(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 165
    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/notify/a;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/notify/a;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/notify/a;)Lcom/qihoo/security/service/a;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/notify/a;->c:Lcom/qihoo/security/service/a;

    return-object v0
.end method

.method private c()V
    .locals 6

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/notify/a;->b:Landroid/content/Context;

    const-string/jumbo v1, "sp_key_last_nofity_booster"

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v0

    .line 102
    new-instance v2, Ljava/util/Date;

    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 103
    new-instance v0, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-direct {v0, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 112
    invoke-direct {p0, v2, v0}, Lcom/qihoo/security/notify/a;->a(Ljava/util/Date;Ljava/util/Date;)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x8

    const/16 v1, 0x17

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/b/s;->a(II)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/qihoo/security/notify/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 113
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/notify/a$2;

    invoke-direct {v1, p0}, Lcom/qihoo/security/notify/a$2;-><init>(Lcom/qihoo/security/notify/a;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/qihoo/security/notify/a;->e:Ljava/lang/Thread;

    .line 130
    iget-object v0, p0, Lcom/qihoo/security/notify/a;->e:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 133
    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/notify/a;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 29
    iget-object v0, p0, Lcom/qihoo/security/notify/a;->d:Landroid/os/Handler;

    return-object v0
.end method

.method private d()Z
    .locals 2

    .prologue
    .line 142
    const/4 v0, 0x0

    .line 144
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/notify/a;->c:Lcom/qihoo/security/service/a;

    invoke-interface {v1}, Lcom/qihoo/security/service/a;->c()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    .line 150
    :goto_0
    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/r;->a(F)Z

    move-result v0

    return v0

    .line 145
    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 80
    iget-object v0, p0, Lcom/qihoo/security/notify/a;->d:Landroid/os/Handler;

    const/4 v1, 0x1

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 82
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 85
    iput-object v1, p0, Lcom/qihoo/security/notify/a;->b:Landroid/content/Context;

    .line 86
    iput-object v1, p0, Lcom/qihoo/security/notify/a;->c:Lcom/qihoo/security/service/a;

    .line 87
    iget-object v0, p0, Lcom/qihoo/security/notify/a;->e:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/notify/a;->e:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/qihoo/security/notify/a;->e:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->stop()V

    .line 90
    :cond_0
    iput-object v1, p0, Lcom/qihoo/security/notify/a;->e:Ljava/lang/Thread;

    .line 91
    return-void
.end method
