.class public Lcom/facebook/ads/internal/server/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/ads/internal/server/a$a;
    }
.end annotation


# static fields
.field private static final j:Lcom/facebook/ads/internal/util/q;

.field private static final k:Ljava/util/concurrent/ThreadPoolExecutor;


# instance fields
.field a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/ads/internal/server/b;

.field private c:Lcom/facebook/ads/internal/server/a$a;

.field private d:Landroid/content/Context;

.field private e:Lcom/facebook/ads/internal/d/d;

.field private f:Lcom/facebook/ads/internal/e/a;

.field private g:J

.field private h:Z

.field private final i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/facebook/ads/internal/util/q;

    invoke-direct {v0}, Lcom/facebook/ads/internal/util/q;-><init>()V

    sput-object v0, Lcom/facebook/ads/internal/server/a;->j:Lcom/facebook/ads/internal/util/q;

    sget-object v0, Lcom/facebook/ads/internal/server/a;->j:Lcom/facebook/ads/internal/util/q;

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newCachedThreadPool(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sput-object v0, Lcom/facebook/ads/internal/server/a;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/facebook/ads/internal/server/b;->a()Lcom/facebook/ads/internal/server/b;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/ads/internal/server/a;->b:Lcom/facebook/ads/internal/server/b;

    invoke-static {}, Lcom/facebook/ads/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ads/internal/util/t;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string/jumbo v0, "https://graph.facebook.com/network_ads_common/"

    :goto_0
    iput-object v0, p0, Lcom/facebook/ads/internal/server/a;->i:Ljava/lang/String;

    return-void

    :cond_0
    const-string/jumbo v1, "https://graph.%s.facebook.com/network_ads_common/"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/facebook/ads/internal/server/a;Lcom/facebook/ads/internal/e/a;)Lcom/facebook/ads/internal/e/a;
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/server/a;->f:Lcom/facebook/ads/internal/e/a;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/ads/internal/server/a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/server/a;->i:Ljava/lang/String;

    return-object v0
.end method

.method private a(Lcom/facebook/ads/internal/b;)V
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "AdProvider failed in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/facebook/ads/internal/server/a;->g:J

    sub-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "ms"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ads/internal/c/a;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/server/a;->c:Lcom/facebook/ads/internal/server/a$a;

    if-eqz v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/facebook/ads/internal/server/a$4;

    invoke-direct {v1, p0, p1}, Lcom/facebook/ads/internal/server/a$4;-><init>(Lcom/facebook/ads/internal/server/a;Lcom/facebook/ads/internal/b;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/ads/internal/server/a;->a()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/ads/internal/server/a;Lcom/facebook/ads/internal/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/ads/internal/server/a;->a(Lcom/facebook/ads/internal/b;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/ads/internal/server/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/facebook/ads/internal/server/a;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Lcom/facebook/ads/internal/server/d;)V
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "AdProvider completed in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/facebook/ads/internal/server/a;->g:J

    sub-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "ms"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ads/internal/c/a;->c(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/server/a;->c:Lcom/facebook/ads/internal/server/a$a;

    if-eqz v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/facebook/ads/internal/server/a$3;

    invoke-direct {v1, p0, p1}, Lcom/facebook/ads/internal/server/a$3;-><init>(Lcom/facebook/ads/internal/server/a;Lcom/facebook/ads/internal/server/d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/ads/internal/server/a;->a()V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lcom/facebook/ads/internal/server/a;->b:Lcom/facebook/ads/internal/server/b;

    invoke-virtual {v0, p1}, Lcom/facebook/ads/internal/server/b;->a(Ljava/lang/String;)Lcom/facebook/ads/internal/server/c;

    move-result-object v0

    sget-object v1, Lcom/facebook/ads/internal/server/a$5;->a:[I

    invoke-virtual {v0}, Lcom/facebook/ads/internal/server/c;->a()Lcom/facebook/ads/internal/server/c$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/facebook/ads/internal/server/c$a;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    const-string/jumbo v0, "Facebook Ads SDK unknown response."

    invoke-static {v0}, Lcom/facebook/ads/internal/c/a;->d(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/facebook/ads/internal/c/a;->a(Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/ads/internal/AdErrorType;->UNKNOWN_RESPONSE:Lcom/facebook/ads/internal/AdErrorType;

    invoke-virtual {v0, p1}, Lcom/facebook/ads/internal/AdErrorType;->getAdErrorWrapper(Ljava/lang/String;)Lcom/facebook/ads/internal/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/ads/internal/server/a;->a(Lcom/facebook/ads/internal/b;)V

    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/ads/internal/server/a;->h:Z

    :goto_1
    return-void

    :pswitch_0
    check-cast v0, Lcom/facebook/ads/internal/server/d;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/server/d;->b()Lcom/facebook/ads/internal/d/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/internal/d/b;->a()Lcom/facebook/ads/internal/d/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/internal/d/c;->c()J

    move-result-wide v2

    iget-object v4, p0, Lcom/facebook/ads/internal/server/a;->e:Lcom/facebook/ads/internal/d/d;

    invoke-static {v2, v3, v4}, Lcom/facebook/ads/internal/util/f;->a(JLcom/facebook/ads/internal/d/d;)V

    invoke-virtual {v1}, Lcom/facebook/ads/internal/d/c;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/facebook/ads/internal/server/a;->e:Lcom/facebook/ads/internal/d/d;

    invoke-static {p1, v1}, Lcom/facebook/ads/internal/util/f;->a(Ljava/lang/String;Lcom/facebook/ads/internal/d/d;)V

    :cond_0
    invoke-direct {p0, v0}, Lcom/facebook/ads/internal/server/a;->a(Lcom/facebook/ads/internal/server/d;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :catch_0
    move-exception v0

    const-string/jumbo v1, "Failed to parse Facebook Ads SDK response"

    invoke-static {v1}, Lcom/facebook/ads/internal/c/a;->d(Ljava/lang/String;)V

    sget-object v1, Lcom/facebook/ads/internal/AdErrorType;->PARSER_FAILURE:Lcom/facebook/ads/internal/AdErrorType;

    invoke-virtual {v0}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/ads/internal/AdErrorType;->getAdErrorWrapper(Ljava/lang/String;)Lcom/facebook/ads/internal/b;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/ads/internal/server/a;->a(Lcom/facebook/ads/internal/b;)V

    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    goto :goto_1

    :pswitch_1
    :try_start_1
    check-cast v0, Lcom/facebook/ads/internal/server/e;

    invoke-virtual {v0}, Lcom/facebook/ads/internal/server/e;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "Facebook Ads SDK response error message. "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/ads/internal/c/a;->d(Ljava/lang/String;)V

    sget-object v1, Lcom/facebook/ads/internal/AdErrorType;->ERROR_MESSAGE:Lcom/facebook/ads/internal/AdErrorType;

    if-eqz v0, :cond_1

    move-object p1, v0

    :cond_1
    invoke-virtual {v1, p1}, Lcom/facebook/ads/internal/AdErrorType;->getAdErrorWrapper(Ljava/lang/String;)Lcom/facebook/ads/internal/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/ads/internal/server/a;->a(Lcom/facebook/ads/internal/b;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    const-string/jumbo v1, "Failed to parse Facebook Ads SDK response"

    invoke-static {v1}, Lcom/facebook/ads/internal/c/a;->d(Ljava/lang/String;)V

    sget-object v1, Lcom/facebook/ads/internal/AdErrorType;->PARSER_FAILURE:Lcom/facebook/ads/internal/AdErrorType;

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/ads/internal/AdErrorType;->getAdErrorWrapper(Ljava/lang/String;)Lcom/facebook/ads/internal/b;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/facebook/ads/internal/server/a;->a(Lcom/facebook/ads/internal/b;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private b()Lcom/facebook/ads/internal/e/c;
    .locals 1

    new-instance v0, Lcom/facebook/ads/internal/server/a$2;

    invoke-direct {v0, p0}, Lcom/facebook/ads/internal/server/a$2;-><init>(Lcom/facebook/ads/internal/server/a;)V

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/ads/internal/server/a;)Lcom/facebook/ads/internal/e/c;
    .locals 1

    invoke-direct {p0}, Lcom/facebook/ads/internal/server/a;->b()Lcom/facebook/ads/internal/e/c;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/ads/internal/server/a;)Lcom/facebook/ads/internal/e/a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/server/a;->f:Lcom/facebook/ads/internal/e/a;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/ads/internal/server/a;)J
    .locals 2

    iget-wide v0, p0, Lcom/facebook/ads/internal/server/a;->g:J

    return-wide v0
.end method

.method static synthetic e(Lcom/facebook/ads/internal/server/a;)Lcom/facebook/ads/internal/d/d;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/server/a;->e:Lcom/facebook/ads/internal/d/d;

    return-object v0
.end method

.method static synthetic f(Lcom/facebook/ads/internal/server/a;)Lcom/facebook/ads/internal/server/a$a;
    .locals 1

    iget-object v0, p0, Lcom/facebook/ads/internal/server/a;->c:Lcom/facebook/ads/internal/server/a$a;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/facebook/ads/internal/server/a;->f:Lcom/facebook/ads/internal/e/a;

    if-eqz v0, :cond_0

    const-string/jumbo v0, "AdProvider clean up Facebook Ads SDK client"

    invoke-static {v0}, Lcom/facebook/ads/internal/c/a;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/facebook/ads/internal/server/a;->f:Lcom/facebook/ads/internal/e/a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/ads/internal/e/a;->a(Z)V

    iput-object v2, p0, Lcom/facebook/ads/internal/server/a;->f:Lcom/facebook/ads/internal/e/a;

    :cond_0
    iput-object v2, p0, Lcom/facebook/ads/internal/server/a;->d:Landroid/content/Context;

    return-void
.end method

.method public a(Landroid/content/Context;Lcom/facebook/ads/internal/d/d;)V
    .locals 2

    invoke-virtual {p0}, Lcom/facebook/ads/internal/server/a;->a()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/facebook/ads/internal/server/a;->g:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/ads/internal/server/a;->h:Z

    iput-object p1, p0, Lcom/facebook/ads/internal/server/a;->d:Landroid/content/Context;

    iput-object p2, p0, Lcom/facebook/ads/internal/server/a;->e:Lcom/facebook/ads/internal/d/d;

    invoke-static {p2}, Lcom/facebook/ads/internal/util/f;->a(Lcom/facebook/ads/internal/d/d;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p2}, Lcom/facebook/ads/internal/util/f;->c(Lcom/facebook/ads/internal/d/d;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lcom/facebook/ads/internal/server/a;->a(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    sget-object v0, Lcom/facebook/ads/internal/AdErrorType;->LOAD_TOO_FREQUENTLY:Lcom/facebook/ads/internal/AdErrorType;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/ads/internal/AdErrorType;->getAdErrorWrapper(Ljava/lang/String;)Lcom/facebook/ads/internal/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/ads/internal/server/a;->a(Lcom/facebook/ads/internal/b;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/facebook/ads/internal/server/a;->k:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance v1, Lcom/facebook/ads/internal/server/a$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/facebook/ads/internal/server/a$1;-><init>(Lcom/facebook/ads/internal/server/a;Landroid/content/Context;Lcom/facebook/ads/internal/d/d;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_0
.end method

.method public a(Lcom/facebook/ads/internal/server/a$a;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/ads/internal/server/a;->c:Lcom/facebook/ads/internal/server/a$a;

    return-void
.end method
