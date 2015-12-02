.class public Lcom/qihoo/security/appbox/core/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/appbox/core/a$c;,
        Lcom/qihoo/security/appbox/core/a$b;,
        Lcom/qihoo/security/appbox/core/a$a;
    }
.end annotation


# static fields
.field private static final a:Lcom/qihoo/security/appbox/core/a$b;

.field private static h:Lcom/qihoo/security/appbox/core/a;


# instance fields
.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/appbox/core/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/appbox/core/c;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroid/os/Handler;

.field private e:Landroid/os/Handler;

.field private f:Landroid/content/Context;

.field private g:J

.field private i:Lcom/qihoo/security/appbox/core/AppBoxResponse;

.field private j:Lcom/qihoo/security/appbox/core/AppBoxResponse;

.field private k:Lcom/qihoo/security/appbox/core/AppBoxResponse;

.field private l:Lcom/qihoo/security/appbox/core/AppBoxResponse;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 56
    new-instance v0, Lcom/qihoo/security/appbox/core/a$b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/appbox/core/a$b;-><init>(ZI)V

    sput-object v0, Lcom/qihoo/security/appbox/core/a;->a:Lcom/qihoo/security/appbox/core/a$b;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    .line 311
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/appbox/core/a;->g:J

    .line 312
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/a;->b:Ljava/util/Map;

    .line 313
    new-instance v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;

    invoke-direct {v0}, Lcom/qihoo/security/appbox/core/AppBoxResponse;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/a;->i:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    .line 314
    new-instance v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;

    invoke-direct {v0}, Lcom/qihoo/security/appbox/core/AppBoxResponse;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/a;->j:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    .line 315
    new-instance v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;

    invoke-direct {v0}, Lcom/qihoo/security/appbox/core/AppBoxResponse;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/a;->k:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    .line 316
    new-instance v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;

    invoke-direct {v0}, Lcom/qihoo/security/appbox/core/AppBoxResponse;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/a;->l:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    .line 317
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/a;->c:Ljava/util/Map;

    .line 318
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/a;->d:Landroid/os/Handler;

    .line 319
    new-instance v0, Landroid/os/HandlerThread;

    const-string/jumbo v1, "appbox"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 320
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 321
    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/qihoo/security/appbox/core/a;->e:Landroid/os/Handler;

    .line 322
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/a;->f:Landroid/content/Context;

    .line 323
    invoke-direct {p0}, Lcom/qihoo/security/appbox/core/a;->h()V

    .line 324
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/appbox/core/a;)Lcom/qihoo/security/appbox/core/AppBoxResponse;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a;->i:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    return-object v0
.end method

.method public static declared-synchronized a()Lcom/qihoo/security/appbox/core/a;
    .locals 2

    .prologue
    .line 120
    const-class v1, Lcom/qihoo/security/appbox/core/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/qihoo/security/appbox/core/a;->h:Lcom/qihoo/security/appbox/core/a;

    if-nez v0, :cond_0

    .line 121
    new-instance v0, Lcom/qihoo/security/appbox/core/a;

    invoke-direct {v0}, Lcom/qihoo/security/appbox/core/a;-><init>()V

    sput-object v0, Lcom/qihoo/security/appbox/core/a;->h:Lcom/qihoo/security/appbox/core/a;

    .line 123
    :cond_0
    sget-object v0, Lcom/qihoo/security/appbox/core/a;->h:Lcom/qihoo/security/appbox/core/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 120
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method static synthetic a(Lcom/qihoo/security/appbox/core/a;Ljava/lang/String;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 54
    invoke-direct {p0, p1}, Lcom/qihoo/security/appbox/core/a;->c(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 306
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "_qihoo_AppBox_APPLICATION_REFRESH"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 307
    invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 308
    return-void
.end method

.method private a(Landroid/content/Context;Lcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;)V
    .locals 2

    .prologue
    .line 485
    if-nez p4, :cond_0

    .line 496
    :goto_0
    return-void

    .line 488
    :cond_0
    if-eqz p2, :cond_1

    iget v0, p2, Lcom/qihoo/security/appbox/core/AppBoxResponse;->errno:I

    if-eqz v0, :cond_3

    .line 489
    :cond_1
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    const v1, 0x7f0c01c0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 491
    if-nez p2, :cond_2

    const/4 v0, -0x1

    .line 492
    :goto_1
    invoke-interface {p4, v0, v1}, Lcom/qihoo/security/appbox/b/c;->a(ILjava/lang/String;)V

    goto :goto_0

    .line 491
    :cond_2
    iget v0, p2, Lcom/qihoo/security/appbox/core/AppBoxResponse;->errno:I

    goto :goto_1

    .line 494
    :cond_3
    invoke-interface {p4, p2}, Lcom/qihoo/security/appbox/b/c;->a(Lcom/qihoo/security/appbox/core/AppBoxResponse;)V

    goto :goto_0
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;J)V
    .locals 1

    .prologue
    .line 407
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/qihoo/security/appbox/b/b;->a(Landroid/content/Context;Lorg/json/JSONObject;)Lcom/qihoo/security/appbox/core/AppBoxResponse;

    move-result-object v0

    .line 409
    iput-wide p5, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->lastRequestTime:J

    .line 410
    if-eqz p4, :cond_0

    .line 411
    invoke-direct {p0, p4, v0}, Lcom/qihoo/security/appbox/core/a;->a(Lcom/qihoo/security/appbox/b/c;Lcom/qihoo/security/appbox/core/AppBoxResponse;)V

    .line 413
    :cond_0
    invoke-direct {p0, v0, p2}, Lcom/qihoo/security/appbox/core/a;->a(Lcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 420
    :goto_0
    return-void

    .line 415
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 290
    if-eqz p2, :cond_0

    .line 291
    invoke-static {p1}, Lcom/qihoo/security/appbox/bi/a;->a(Ljava/lang/String;)V

    .line 293
    :cond_0
    new-instance v1, Landroid/content/Intent;

    if-eqz p2, :cond_1

    const-string/jumbo v0, "_qihoo_AppBox_APPLICATION_INSTALL"

    :goto_0
    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 295
    const-string/jumbo v0, "packageName"

    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 297
    invoke-virtual {p0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 298
    return-void

    .line 293
    :cond_1
    const-string/jumbo v0, "_qihoo_AppBox_APPLICATION_UNINSTALL"

    goto :goto_0
.end method

.method private a(Lcom/qihoo/security/appbox/b/c;Lcom/qihoo/security/appbox/core/AppBoxResponse;)V
    .locals 1

    .prologue
    .line 335
    if-nez p1, :cond_0

    .line 345
    :goto_0
    return-void

    .line 338
    :cond_0
    new-instance v0, Lcom/qihoo/security/appbox/core/a$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/qihoo/security/appbox/core/a$2;-><init>(Lcom/qihoo/security/appbox/core/a;Lcom/qihoo/security/appbox/b/c;Lcom/qihoo/security/appbox/core/AppBoxResponse;)V

    invoke-direct {p0, v0}, Lcom/qihoo/security/appbox/core/a;->b(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method private a(Lcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 578
    const-string/jumbo v0, "1"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 579
    iput-object p1, p0, Lcom/qihoo/security/appbox/core/a;->j:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    .line 585
    :goto_0
    return-void

    .line 580
    :cond_0
    const-string/jumbo v0, "0"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 581
    iput-object p1, p0, Lcom/qihoo/security/appbox/core/a;->i:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    goto :goto_0

    .line 583
    :cond_1
    iput-object p1, p0, Lcom/qihoo/security/appbox/core/a;->k:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/appbox/core/a;Landroid/content/Context;Lcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/qihoo/security/appbox/core/a;->a(Landroid/content/Context;Lcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/appbox/core/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;J)V
    .locals 1

    .prologue
    .line 54
    invoke-direct/range {p0 .. p6}, Lcom/qihoo/security/appbox/core/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;J)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/appbox/core/a;Lcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/appbox/core/a;->a(Lcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/util/Map;Ljava/lang/String;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/appbox/core/a$b;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 134
    :try_start_0
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, p2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    move v1, v0

    .line 135
    :goto_0
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 136
    invoke-virtual {v2, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    .line 137
    const-string/jumbo v3, "country"

    const-string/jumbo v4, "default"

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 138
    const-string/jumbo v4, "facebook_index"

    const/4 v5, 0x0

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    .line 139
    const-string/jumbo v5, "show_facebook"

    const/4 v6, 0x1

    invoke-virtual {v0, v5, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 140
    new-instance v5, Lcom/qihoo/security/appbox/core/a$b;

    invoke-direct {v5, v0, v4}, Lcom/qihoo/security/appbox/core/a$b;-><init>(ZI)V

    .line 141
    invoke-interface {p1, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 147
    :catch_0
    move-exception v0

    .line 149
    :cond_0
    return-void
.end method

.method public static a(Lcom/qihoo/security/appbox/core/c;Z)Z
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 771
    if-nez p0, :cond_1

    move v0, v1

    .line 785
    :cond_0
    :goto_0
    return v0

    .line 774
    :cond_1
    if-eqz p1, :cond_3

    .line 775
    iget-boolean v2, p0, Lcom/qihoo/security/appbox/core/c;->p:Z

    if-nez v2, :cond_0

    iget-boolean v2, p0, Lcom/qihoo/security/appbox/core/c;->q:Z

    if-nez v2, :cond_0

    .line 783
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    .line 784
    iget-wide v4, p0, Lcom/qihoo/security/appbox/core/c;->r:J

    sub-long/2addr v2, v4

    .line 785
    const-wide/32 v4, 0x2932e0

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    move v0, v1

    goto :goto_0

    .line 779
    :cond_3
    iget-boolean v2, p0, Lcom/qihoo/security/appbox/core/c;->q:Z

    if-eqz v2, :cond_2

    goto :goto_0
.end method

.method private b(Ljava/lang/String;)Lcom/qihoo/security/appbox/core/AppBoxResponse;
    .locals 2

    .prologue
    .line 563
    const/4 v0, 0x0

    .line 564
    const-string/jumbo v1, "1"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 566
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a;->j:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    .line 574
    :cond_0
    :goto_0
    return-object v0

    .line 567
    :cond_1
    const-string/jumbo v1, "0"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 568
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a;->i:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    goto :goto_0

    .line 569
    :cond_2
    const-string/jumbo v1, "2"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 570
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a;->k:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    goto :goto_0

    .line 571
    :cond_3
    const-string/jumbo v1, "3"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 572
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a;->l:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    goto :goto_0
.end method

.method private b(Lcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;)V
    .locals 8

    .prologue
    .line 669
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 671
    :try_start_0
    const-string/jumbo v0, "error"

    iget v1, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->errno:I

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 672
    const-string/jumbo v0, "end_state"

    iget v1, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->end_state:I

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 673
    const-string/jumbo v0, "updateTime"

    iget-wide v4, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->updateTime:J

    invoke-virtual {v2, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 674
    const-string/jumbo v0, "total"

    iget v1, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->total:I

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 675
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 676
    iget-object v0, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 677
    iget-object v0, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/appbox/core/c;

    .line 678
    invoke-static {v0}, Lcom/qihoo/security/appbox/b/a;->a(Lcom/qihoo/security/appbox/core/c;)Lorg/json/JSONObject;

    move-result-object v0

    .line 679
    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 684
    :catch_0
    move-exception v0

    .line 687
    :cond_0
    :goto_1
    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a;->f:Landroid/content/Context;

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    iget-wide v4, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->lastRequestTime:J

    iget-wide v6, p1, Lcom/qihoo/security/appbox/core/AppBoxResponse;->updateTime:J

    move-object v3, p2

    invoke-static/range {v1 .. v7}, Lcom/qihoo/security/appbox/core/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JJ)V

    .line 688
    return-void

    .line 681
    :cond_1
    :try_start_1
    const-string/jumbo v0, "data"

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1
.end method

.method static synthetic b(Lcom/qihoo/security/appbox/core/a;Lcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 54
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/appbox/core/a;->b(Lcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;)V

    return-void
.end method

.method private b(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 327
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a;->d:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 328
    return-void
.end method

.method private c(Ljava/lang/String;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/appbox/core/c;",
            ">;"
        }
    .end annotation

    .prologue
    .line 763
    const/4 v0, 0x0

    .line 764
    const-string/jumbo v1, "3"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 765
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a;->c:Ljava/util/Map;

    .line 767
    :cond_0
    return-object v0
.end method

.method private d(Ljava/lang/String;)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    const-wide/16 v4, 0x0

    .line 912
    invoke-direct {p0, p1}, Lcom/qihoo/security/appbox/core/a;->b(Ljava/lang/String;)Lcom/qihoo/security/appbox/core/AppBoxResponse;

    move-result-object v0

    .line 913
    iget-object v1, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    .line 918
    iput-wide v4, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->lastRequestTime:J

    .line 919
    iput-object v2, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->appItems:Ljava/util/ArrayList;

    .line 921
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a;->f:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/qihoo/security/appbox/core/b;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/qihoo/security/appbox/core/a$a;

    move-result-object v0

    .line 922
    iget-object v0, v0, Lcom/qihoo/security/appbox/core/a$a;->a:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 927
    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a;->f:Landroid/content/Context;

    move-object v3, p1

    move-wide v6, v4

    invoke-static/range {v1 .. v7}, Lcom/qihoo/security/appbox/core/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JJ)V

    .line 929
    :cond_1
    return-void
.end method

.method private g()Lcom/qihoo/security/appbox/core/a$b;
    .locals 2

    .prologue
    .line 152
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a;->f:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/locale/c;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 154
    monitor-enter p0

    .line 155
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/appbox/core/a$b;

    .line 156
    if-nez v0, :cond_0

    .line 157
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a;->b:Ljava/util/Map;

    const-string/jumbo v1, "default"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/appbox/core/a$b;

    .line 158
    if-eqz v0, :cond_0

    .line 164
    :cond_0
    if-eqz v0, :cond_1

    .line 165
    monitor-exit p0

    .line 168
    :goto_0
    return-object v0

    .line 167
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    sget-object v0, Lcom/qihoo/security/appbox/core/a;->a:Lcom/qihoo/security/appbox/core/a$b;

    goto :goto_0

    .line 167
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private h()V
    .locals 4

    .prologue
    .line 172
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a;->f:Landroid/content/Context;

    const-string/jumbo v1, "f_c.dat"

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/b/s;->e(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v0

    .line 173
    iget-wide v2, p0, Lcom/qihoo/security/appbox/core/a;->g:J

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    .line 174
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a;->e:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/appbox/core/a$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/appbox/core/a$1;-><init>(Lcom/qihoo/security/appbox/core/a;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 182
    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 932
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 933
    const-string/jumbo v1, "3"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 934
    const-string/jumbo v1, "521616881325172_523325181154342"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 935
    const-string/jumbo v1, "521616881325172_523325277820999"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 936
    const-string/jumbo v1, "521616881325172_523325364487657"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 937
    const-string/jumbo v1, "521616881325172_523325437820983"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 938
    const-string/jumbo v1, "521616881325172_523325644487629"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 939
    const-string/jumbo v1, "521616881325172_523329817820545"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 940
    const-string/jumbo v1, "521616881325172_523325784487615"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 942
    :cond_0
    return-object v0
.end method

.method public a(Landroid/content/Context;Lcom/qihoo/security/appbox/b/c;)V
    .locals 4

    .prologue
    .line 351
    if-eqz p2, :cond_0

    .line 352
    invoke-interface {p2}, Lcom/qihoo/security/appbox/b/c;->a()V

    .line 355
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a;->i:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    iget-wide v0, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->lastRequestTime:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 356
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a;->i:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    invoke-interface {p2, v0}, Lcom/qihoo/security/appbox/b/c;->a(Lcom/qihoo/security/appbox/core/AppBoxResponse;)V

    .line 357
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/qihoo/security/appbox/core/a;->i:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    iget-wide v2, v2, Lcom/qihoo/security/appbox/core/AppBoxResponse;->lastRequestTime:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 361
    const-string/jumbo v0, "appbox"

    invoke-virtual {p0, p1, v0, p2}, Lcom/qihoo/security/appbox/core/a;->a(Landroid/content/Context;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;)V

    .line 395
    :cond_1
    :goto_0
    return-void

    .line 372
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a;->e:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/appbox/core/a$3;

    invoke-direct {v1, p0, p1, p2}, Lcom/qihoo/security/appbox/core/a$3;-><init>(Lcom/qihoo/security/appbox/core/a;Landroid/content/Context;Lcom/qihoo/security/appbox/b/c;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public a(Landroid/content/Context;Lcom/qihoo/security/appbox/b/c;Ljava/lang/String;ILjava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 9

    .prologue
    .line 500
    if-eqz p2, :cond_0

    .line 501
    invoke-interface {p2}, Lcom/qihoo/security/appbox/b/c;->a()V

    .line 508
    :cond_0
    invoke-direct {p0, p3}, Lcom/qihoo/security/appbox/core/a;->b(Ljava/lang/String;)Lcom/qihoo/security/appbox/core/AppBoxResponse;

    move-result-object v0

    .line 509
    iget-wide v2, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->lastRequestTime:J

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-lez v1, :cond_2

    .line 513
    invoke-interface {p2, v0}, Lcom/qihoo/security/appbox/b/c;->a(Lcom/qihoo/security/appbox/core/AppBoxResponse;)V

    .line 515
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->lastRequestTime:J

    sub-long/2addr v2, v4

    const-wide/32 v4, 0x5265c00

    cmp-long v1, v2, v4

    if-lez v1, :cond_1

    .line 519
    const/4 v1, 0x0

    iget-wide v6, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->updateTime:J

    move-object v0, p0

    move-object v2, p1

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move-object v8, p2

    invoke-virtual/range {v0 .. v8}, Lcom/qihoo/security/appbox/core/a;->a(ZLandroid/content/Context;Ljava/lang/String;ILjava/util/concurrent/atomic/AtomicBoolean;JLcom/qihoo/security/appbox/b/c;)V

    .line 560
    :cond_1
    :goto_0
    return-void

    .line 532
    :cond_2
    iget-object v7, p0, Lcom/qihoo/security/appbox/core/a;->e:Landroid/os/Handler;

    new-instance v0, Lcom/qihoo/security/appbox/core/a$6;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move-object v4, p2

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/qihoo/security/appbox/core/a$6;-><init>(Lcom/qihoo/security/appbox/core/a;Landroid/content/Context;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;ILjava/util/concurrent/atomic/AtomicBoolean;)V

    invoke-virtual {v7, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public a(Landroid/content/Context;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;)V
    .locals 11

    .prologue
    .line 431
    const-string/jumbo v0, "0"

    invoke-static {p1, v0}, Lcom/qihoo/security/appbox/core/b;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/qihoo/security/appbox/core/a$a;

    move-result-object v0

    .line 432
    new-instance v3, Lcom/qihoo/security/appbox/b/d;

    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a;->i:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    iget-wide v4, v0, Lcom/qihoo/security/appbox/core/a$a;->b:J

    invoke-direct {v3, p1, v1, v4, v5}, Lcom/qihoo/security/appbox/b/d;-><init>(Landroid/content/Context;Lcom/qihoo/security/appbox/core/AppBoxResponse;J)V

    .line 438
    new-instance v5, Ljava/lang/ref/WeakReference;

    invoke-direct {v5, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 440
    new-instance v7, Lcom/android/volley/toolbox/i;

    const/4 v8, 0x1

    const-string/jumbo v9, "http://ifappbox.msafe.data.360safe.com/index/getPicksPageApps"

    invoke-virtual {v3}, Lcom/qihoo/security/appbox/b/d;->a()Ljava/lang/String;

    move-result-object v10

    new-instance v0, Lcom/qihoo/security/appbox/core/a$4;

    move-object v1, p0

    move-object v2, p2

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/qihoo/security/appbox/core/a$4;-><init>(Lcom/qihoo/security/appbox/core/a;Ljava/lang/String;Lcom/qihoo/security/appbox/b/d;Landroid/content/Context;Ljava/lang/ref/WeakReference;)V

    new-instance v6, Lcom/qihoo/security/appbox/core/a$5;

    invoke-direct {v6, p0, v5}, Lcom/qihoo/security/appbox/core/a$5;-><init>(Lcom/qihoo/security/appbox/core/a;Ljava/lang/ref/WeakReference;)V

    move-object v1, v7

    move v2, v8

    move-object v3, v9

    move-object v4, v10

    move-object v5, v0

    invoke-direct/range {v1 .. v6}, Lcom/android/volley/toolbox/i;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/android/volley/k$b;Lcom/android/volley/k$a;)V

    .line 475
    invoke-static {v7, p2}, Lcom/qihoo/security/appbox/c/b/a;->a(Lcom/android/volley/Request;Ljava/lang/Object;)V

    .line 476
    return-void
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 331
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a;->e:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 332
    return-void
.end method

.method public a(Ljava/util/ArrayList;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/qihoo/security/appbox/b/c;",
            ")V"
        }
    .end annotation

    .prologue
    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 691
    if-eqz p3, :cond_0

    .line 692
    invoke-interface {p3}, Lcom/qihoo/security/appbox/b/c;->a()V

    .line 697
    :cond_0
    if-nez p1, :cond_1

    .line 698
    const/16 v0, 0x194

    const-string/jumbo v1, "no ids"

    invoke-interface {p3, v0, v1}, Lcom/qihoo/security/appbox/b/c;->a(ILjava/lang/String;)V

    .line 700
    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 701
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 702
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 703
    invoke-direct {p0, p2}, Lcom/qihoo/security/appbox/core/a;->c(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    .line 704
    monitor-enter p0

    .line 705
    :try_start_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_2
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 709
    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/appbox/core/c;

    .line 710
    if-eqz v1, :cond_5

    .line 711
    iget-object v2, v1, Lcom/qihoo/security/appbox/core/c;->j:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    .line 712
    iget-object v2, v1, Lcom/qihoo/security/appbox/core/c;->j:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 713
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 720
    :goto_1
    if-nez p3, :cond_4

    move v2, v7

    :goto_2
    invoke-static {v1, v2}, Lcom/qihoo/security/appbox/core/a;->a(Lcom/qihoo/security/appbox/core/c;Z)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 724
    invoke-interface {v4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 725
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 739
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 718
    :cond_3
    :try_start_1
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    move v2, v8

    .line 720
    goto :goto_2

    .line 736
    :cond_5
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 739
    :cond_6
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 740
    if-eqz p3, :cond_7

    .line 741
    invoke-direct {p0, p2}, Lcom/qihoo/security/appbox/core/a;->b(Ljava/lang/String;)Lcom/qihoo/security/appbox/core/AppBoxResponse;

    move-result-object v0

    .line 742
    iput-object v3, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->faceBookItems:Ljava/util/ArrayList;

    .line 743
    invoke-interface {p3, v0}, Lcom/qihoo/security/appbox/b/c;->a(Lcom/qihoo/security/appbox/core/AppBoxResponse;)V

    .line 745
    :cond_7
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 746
    new-instance v2, Lcom/facebook/ads/NativeAd;

    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v2, v0, v5}, Lcom/facebook/ads/NativeAd;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 747
    new-instance v0, Lcom/qihoo/security/appbox/core/a$c;

    if-nez p3, :cond_8

    move v4, v7

    :goto_4
    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p2

    invoke-direct/range {v0 .. v6}, Lcom/qihoo/security/appbox/core/a$c;-><init>(Lcom/qihoo/security/appbox/core/a;Lcom/facebook/ads/NativeAd;Ljava/lang/String;ZLjava/lang/String;Lcom/qihoo/security/appbox/core/a$1;)V

    .line 748
    invoke-virtual {v2, v0}, Lcom/facebook/ads/NativeAd;->a(Lcom/facebook/ads/d;)V

    .line 750
    :try_start_2
    invoke-virtual {v2}, Lcom/facebook/ads/NativeAd;->a()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    .line 751
    :catch_0
    move-exception v0

    goto :goto_3

    :cond_8
    move v4, v8

    .line 747
    goto :goto_4

    .line 760
    :cond_9
    return-void
.end method

.method public a(ZLandroid/content/Context;Ljava/lang/String;ILjava/util/concurrent/atomic/AtomicBoolean;JLcom/qihoo/security/appbox/b/c;)V
    .locals 18

    .prologue
    .line 601
    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-direct {v0, v1}, Lcom/qihoo/security/appbox/core/a;->b(Ljava/lang/String;)Lcom/qihoo/security/appbox/core/AppBoxResponse;

    move-result-object v4

    .line 602
    new-instance v2, Lcom/qihoo/security/appbox/b/b;

    move-object/from16 v3, p2

    move-object/from16 v5, p3

    move-wide/from16 v6, p6

    invoke-direct/range {v2 .. v7}, Lcom/qihoo/security/appbox/b/b;-><init>(Landroid/content/Context;Lcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;J)V

    .line 604
    move/from16 v0, p4

    invoke-virtual {v2, v0}, Lcom/qihoo/security/appbox/b/b;->a(I)V

    .line 608
    new-instance v13, Ljava/lang/ref/WeakReference;

    move-object/from16 v0, p8

    invoke-direct {v13, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 610
    new-instance v3, Lcom/android/volley/toolbox/i;

    const/4 v15, 0x1

    const-string/jumbo v16, "http://ifappbox.msafe.data.360safe.com/index/getrecommendappsbytype"

    invoke-virtual {v2}, Lcom/qihoo/security/appbox/b/b;->a()Ljava/lang/String;

    move-result-object v17

    new-instance v5, Lcom/qihoo/security/appbox/core/a$7;

    move-object/from16 v6, p0

    move-object/from16 v7, p5

    move-object v8, v2

    move/from16 v9, p1

    move-object v10, v4

    move-object/from16 v11, p3

    move-object/from16 v12, p2

    invoke-direct/range {v5 .. v13}, Lcom/qihoo/security/appbox/core/a$7;-><init>(Lcom/qihoo/security/appbox/core/a;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/qihoo/security/appbox/b/b;ZLcom/qihoo/security/appbox/core/AppBoxResponse;Ljava/lang/String;Landroid/content/Context;Ljava/lang/ref/WeakReference;)V

    new-instance v9, Lcom/qihoo/security/appbox/core/a$8;

    move-object/from16 v10, p0

    move-object/from16 v11, p5

    move-object/from16 v12, p3

    move-object v14, v4

    invoke-direct/range {v9 .. v14}, Lcom/qihoo/security/appbox/core/a$8;-><init>(Lcom/qihoo/security/appbox/core/a;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/lang/String;Ljava/lang/ref/WeakReference;Lcom/qihoo/security/appbox/core/AppBoxResponse;)V

    move-object v10, v3

    move v11, v15

    move-object/from16 v12, v16

    move-object/from16 v13, v17

    move-object v14, v5

    move-object v15, v9

    invoke-direct/range {v10 .. v15}, Lcom/android/volley/toolbox/i;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/android/volley/k$b;Lcom/android/volley/k$a;)V

    .line 665
    move-object/from16 v0, p3

    invoke-static {v3, v0}, Lcom/qihoo/security/appbox/c/b/a;->a(Lcom/android/volley/Request;Ljava/lang/Object;)V

    .line 666
    return-void
.end method

.method public b()Z
    .locals 1

    .prologue
    .line 127
    invoke-direct {p0}, Lcom/qihoo/security/appbox/core/a;->g()Lcom/qihoo/security/appbox/core/a$b;

    move-result-object v0

    .line 128
    invoke-direct {p0}, Lcom/qihoo/security/appbox/core/a;->h()V

    .line 129
    invoke-static {v0}, Lcom/qihoo/security/appbox/core/a$b;->a(Lcom/qihoo/security/appbox/core/a$b;)Z

    move-result v0

    return v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 185
    invoke-direct {p0}, Lcom/qihoo/security/appbox/core/a;->g()Lcom/qihoo/security/appbox/core/a$b;

    move-result-object v0

    .line 186
    invoke-direct {p0}, Lcom/qihoo/security/appbox/core/a;->h()V

    .line 187
    invoke-static {v0}, Lcom/qihoo/security/appbox/core/a$b;->b(Lcom/qihoo/security/appbox/core/a$b;)I

    move-result v0

    return v0
.end method

.method public d()V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 191
    .line 194
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a;->f:Landroid/content/Context;

    const-string/jumbo v2, "f_c.dat"

    invoke-static {v1, v2}, Lcom/qihoo360/mobilesafe/b/s;->e(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/qihoo/security/appbox/core/a;->g:J

    .line 195
    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a;->f:Landroid/content/Context;

    const-string/jumbo v2, "f_c.dat"

    invoke-static {v1, v2}, Lcom/qihoo360/mobilesafe/b/s;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_7
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    move-result-object v1

    .line 196
    if-eqz v1, :cond_7

    .line 197
    :try_start_1
    sget-object v2, Lcom/qihoo360/mobilesafe/support/NativeManager;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/qihoo360/mobilesafe/b/s;->a(Ljava/io/InputStream;Ljava/lang/String;)Ljava/io/InputStream;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_8
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-result-object v2

    .line 199
    if-eqz v2, :cond_3

    .line 200
    :try_start_2
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-direct {v3, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_9
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 201
    :try_start_3
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    .line 202
    const-string/jumbo v3, ""

    .line 203
    const-string/jumbo v3, ""

    .line 204
    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 205
    invoke-virtual {v0, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    .line 214
    :catch_0
    move-exception v0

    move-object v0, v1

    move-object v1, v2

    .line 219
    :goto_1
    if-eqz v0, :cond_0

    .line 221
    :try_start_4
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 225
    :cond_0
    :goto_2
    if-eqz v1, :cond_1

    .line 227
    :try_start_5
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 232
    :cond_1
    :goto_3
    return-void

    .line 207
    :cond_2
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    .line 208
    monitor-enter p0
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 209
    :try_start_7
    iget-object v3, p0, Lcom/qihoo/security/appbox/core/a;->b:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->clear()V

    .line 210
    iget-object v3, p0, Lcom/qihoo/security/appbox/core/a;->b:Ljava/util/Map;

    invoke-direct {p0, v3, v0}, Lcom/qihoo/security/appbox/core/a;->a(Ljava/util/Map;Ljava/lang/String;)V

    .line 211
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-object v0, v1

    .line 219
    :cond_3
    :goto_4
    if-eqz v0, :cond_4

    .line 221
    :try_start_8
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    .line 225
    :cond_4
    :goto_5
    if-eqz v2, :cond_1

    .line 227
    :try_start_9
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1

    goto :goto_3

    .line 228
    :catch_1
    move-exception v0

    goto :goto_3

    .line 211
    :catchall_0
    move-exception v0

    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :try_start_b
    throw v0
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 219
    :catchall_1
    move-exception v0

    :goto_6
    if-eqz v1, :cond_5

    .line 221
    :try_start_c
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_5

    .line 225
    :cond_5
    :goto_7
    if-eqz v2, :cond_6

    .line 227
    :try_start_d
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_6

    .line 229
    :cond_6
    :goto_8
    throw v0

    .line 222
    :catch_2
    move-exception v0

    goto :goto_5

    :catch_3
    move-exception v0

    goto :goto_2

    .line 228
    :catch_4
    move-exception v0

    goto :goto_3

    .line 222
    :catch_5
    move-exception v1

    goto :goto_7

    .line 228
    :catch_6
    move-exception v1

    goto :goto_8

    .line 219
    :catchall_2
    move-exception v1

    move-object v2, v0

    move-object v4, v0

    move-object v0, v1

    move-object v1, v4

    goto :goto_6

    :catchall_3
    move-exception v2

    move-object v4, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_6

    :catchall_4
    move-exception v1

    move-object v4, v1

    move-object v1, v0

    move-object v0, v4

    goto :goto_6

    .line 214
    :catch_7
    move-exception v1

    move-object v1, v0

    goto :goto_1

    :catch_8
    move-exception v2

    goto :goto_1

    :catch_9
    move-exception v1

    move-object v1, v2

    goto :goto_1

    :cond_7
    move-object v2, v1

    goto :goto_4
.end method

.method public e()V
    .locals 2

    .prologue
    .line 897
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a;->l:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    iget-object v0, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->faceBookItems:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 901
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a;->l:Lcom/qihoo/security/appbox/core/AppBoxResponse;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/qihoo/security/appbox/core/AppBoxResponse;->faceBookItems:Ljava/util/ArrayList;

    .line 903
    :cond_0
    return-void
.end method

.method public f()V
    .locals 1

    .prologue
    .line 906
    const-string/jumbo v0, "0"

    invoke-direct {p0, v0}, Lcom/qihoo/security/appbox/core/a;->d(Ljava/lang/String;)V

    .line 907
    const-string/jumbo v0, "1"

    invoke-direct {p0, v0}, Lcom/qihoo/security/appbox/core/a;->d(Ljava/lang/String;)V

    .line 908
    const-string/jumbo v0, "2"

    invoke-direct {p0, v0}, Lcom/qihoo/security/appbox/core/a;->d(Ljava/lang/String;)V

    .line 909
    return-void
.end method
