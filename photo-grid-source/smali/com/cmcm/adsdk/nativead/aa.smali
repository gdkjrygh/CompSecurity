.class public final Lcom/cmcm/adsdk/nativead/aa;
.super Lcom/cmcm/adsdk/nativead/w;
.source "SourceFile"

# interfaces
.implements Lcom/cmcm/adsdk/nativead/h;
.implements Ljava/util/Observer;


# instance fields
.field private a:I

.field private b:Z

.field private c:Landroid/os/Handler;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/cmcm/adsdk/b/a/c;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/lang/Object;

.field private f:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector",
            "<",
            "Lcom/cmcm/a/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private volatile g:Z

.field private h:Lcom/cmcm/a/a/d;

.field private i:Z

.field private j:Ljava/util/Timer;

.field private k:Z

.field private l:Z

.field private m:I

.field private n:J

.field private o:Z

.field private p:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/cmcm/adsdk/nativead/w;",
            ">;"
        }
    .end annotation
.end field

.field private q:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/cmcm/adsdk/k;",
            ">;"
        }
    .end annotation
.end field

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/cmcm/adsdk/nativead/w;",
            ">;"
        }
    .end annotation
.end field

.field private s:Ljava/lang/Runnable;

.field private t:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 118
    const-string v0, "ad"

    invoke-direct {p0, p1, p2, v0}, Lcom/cmcm/adsdk/nativead/w;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    iput-boolean v2, p0, Lcom/cmcm/adsdk/nativead/aa;->b:Z

    .line 48
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->e:Ljava/lang/Object;

    .line 49
    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->f:Ljava/util/Vector;

    .line 51
    iput-boolean v2, p0, Lcom/cmcm/adsdk/nativead/aa;->g:Z

    .line 53
    iput-boolean v1, p0, Lcom/cmcm/adsdk/nativead/aa;->i:Z

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->j:Ljava/util/Timer;

    .line 55
    iput-boolean v1, p0, Lcom/cmcm/adsdk/nativead/aa;->k:Z

    .line 56
    iput-boolean v1, p0, Lcom/cmcm/adsdk/nativead/aa;->l:Z

    .line 59
    iput-boolean v1, p0, Lcom/cmcm/adsdk/nativead/aa;->o:Z

    .line 60
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->p:Ljava/util/Map;

    .line 61
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->q:Ljava/util/Map;

    .line 62
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->r:Ljava/util/List;

    .line 274
    new-instance v0, Lcom/cmcm/adsdk/nativead/ad;

    invoke-direct {v0, p0}, Lcom/cmcm/adsdk/nativead/ad;-><init>(Lcom/cmcm/adsdk/nativead/aa;)V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->s:Ljava/lang/Runnable;

    .line 392
    new-instance v0, Lcom/cmcm/adsdk/nativead/ae;

    invoke-direct {v0, p0}, Lcom/cmcm/adsdk/nativead/ae;-><init>(Lcom/cmcm/adsdk/nativead/aa;)V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->t:Ljava/lang/Runnable;

    .line 119
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->c:Landroid/os/Handler;

    .line 120
    invoke-static {}, Lcom/cmcm/adsdk/b;->j()I

    move-result v0

    iput v0, p0, Lcom/cmcm/adsdk/nativead/aa;->a:I

    .line 122
    invoke-static {}, Lcom/cmcm/adsdk/a;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cmcm/adsdk/b/a;->a(Ljava/lang/String;)Lcom/cmcm/adsdk/b/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/cmcm/adsdk/b/a;->addObserver(Ljava/util/Observer;)V

    .line 123
    return-void
.end method

.method private a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/cmcm/adsdk/nativead/w;
    .locals 2

    .prologue
    .line 241
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 242
    const/4 v0, 0x0

    .line 251
    :goto_0
    return-object v0

    .line 243
    :cond_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->p:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 244
    invoke-static {p1, p2, p3, p4}, Lcom/cmcm/adsdk/nativead/x;->a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/cmcm/adsdk/nativead/w;

    move-result-object v0

    .line 245
    if-eqz v0, :cond_1

    .line 246
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/aa;->p:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    invoke-virtual {v0, p0}, Lcom/cmcm/adsdk/nativead/w;->setLoadCallBack(Lcom/cmcm/adsdk/nativead/h;)V

    .line 248
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/aa;->requestParams:Lcom/cmcm/adsdk/e;

    invoke-virtual {v0, v1}, Lcom/cmcm/adsdk/nativead/w;->setRequestParams(Lcom/cmcm/adsdk/e;)V

    .line 251
    :cond_1
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->p:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/nativead/w;

    goto :goto_0
.end method

.method static synthetic a(Lcom/cmcm/adsdk/nativead/aa;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->e:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/cmcm/adsdk/nativead/aa;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    return-object p1
.end method

.method private static a()V
    .locals 1

    .prologue
    .line 132
    invoke-static {}, Lcom/cmcm/adsdk/b;->k()Lcom/cmcm/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 133
    invoke-static {}, Lcom/cmcm/adsdk/b;->k()Lcom/cmcm/a/a;

    .line 135
    :cond_0
    return-void
.end method

.method private a(I)V
    .locals 2

    .prologue
    .line 518
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/a/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 519
    const-string v0, "CMCMADSDK"

    const-string v1, "notifyAdFailed"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->h:Lcom/cmcm/a/a/d;

    if-eqz v0, :cond_0

    .line 521
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->h:Lcom/cmcm/a/a/d;

    invoke-interface {v0, p1}, Lcom/cmcm/a/a/d;->a(I)V

    .line 523
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;ZLjava/lang/String;)V
    .locals 4

    .prologue
    .line 307
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/aa;->q:Ljava/util/Map;

    monitor-enter v1

    .line 308
    :try_start_0
    const-string v0, "CMCMADSDK"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "push "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " to result map ,is scuccess:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->q:Ljava/util/Map;

    new-instance v2, Lcom/cmcm/adsdk/k;

    invoke-direct {v2, p2, p3}, Lcom/cmcm/adsdk/k;-><init>(ZLjava/lang/String;)V

    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private a(Lcom/cmcm/adsdk/b/a/c;)Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 219
    .line 3065
    iget-object v2, p1, Lcom/cmcm/adsdk/b/a/c;->e:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lez v2, :cond_0

    move v2, v1

    .line 219
    :goto_0
    if-nez v2, :cond_1

    .line 220
    const-string v1, "CMCMADSDK"

    const-string v2, "skip weight<=0 config"

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    :goto_1
    return v0

    :cond_0
    move v2, v0

    .line 3065
    goto :goto_0

    .line 4061
    :cond_1
    iget-object v2, p1, Lcom/cmcm/adsdk/b/a/c;->d:Ljava/lang/String;

    .line 224
    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/aa;->mContext:Landroid/content/Context;

    iget-object v4, p0, Lcom/cmcm/adsdk/nativead/aa;->mPositionId:Ljava/lang/String;

    iget-object v5, p1, Lcom/cmcm/adsdk/b/a/c;->c:Ljava/lang/String;

    invoke-direct {p0, v2, v3, v4, v5}, Lcom/cmcm/adsdk/nativead/aa;->a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/cmcm/adsdk/nativead/w;

    move-result-object v3

    .line 225
    if-eqz v3, :cond_2

    .line 226
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->r:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 227
    const-string v0, "CMCMADSDK"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "to load "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    iget v0, p0, Lcom/cmcm/adsdk/nativead/aa;->m:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/cmcm/adsdk/nativead/aa;->m:I

    .line 231
    invoke-virtual {v3}, Lcom/cmcm/adsdk/nativead/w;->loadAd()V

    move v0, v1

    .line 232
    goto :goto_1

    .line 235
    :cond_2
    const-string v1, "10005"

    invoke-direct {p0, v2, v0, v1}, Lcom/cmcm/adsdk/nativead/aa;->a(Ljava/lang/String;ZLjava/lang/String;)V

    goto :goto_1
.end method

.method private b(Lcom/cmcm/adsdk/b/a/c;)Lcom/cmcm/a/a/a;
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 493
    .line 6061
    iget-object v3, p1, Lcom/cmcm/adsdk/b/a/c;->d:Ljava/lang/String;

    .line 495
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, v2

    .line 504
    :cond_0
    :goto_0
    return-object v0

    .line 498
    :cond_1
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->f:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 499
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->f:Ljava/util/Vector;

    invoke-virtual {v0, v1}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/a;

    .line 500
    invoke-interface {v0}, Lcom/cmcm/a/a/a;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 498
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_2
    move-object v0, v2

    .line 504
    goto :goto_0
.end method

.method static synthetic b(Lcom/cmcm/adsdk/nativead/aa;)Ljava/util/List;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    return-object v0
.end method

.method private b()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v1, 0x0

    .line 180
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/aa;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 181
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 183
    :cond_0
    invoke-static {}, Lcom/cmcm/adsdk/a;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 184
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/cmcm/adsdk/nativead/aa;->k:Z

    .line 185
    const-string v0, "CMCMADSDK"

    const-string v1, "the cloud config is loading,to suspend this request"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    :goto_0
    monitor-exit v2

    .line 205
    :goto_1
    return-void

    .line 187
    :cond_1
    const-string v0, "CMCMADSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "the posid:"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/aa;->mPositionId:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "no config, may be has closed"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    const/16 v0, 0x2711

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/aa;->a(I)V

    .line 189
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/cmcm/adsdk/nativead/aa;->g:Z

    goto :goto_0

    .line 193
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1526
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->f:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->clear()V

    .line 1527
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 1528
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1529
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/cmcm/adsdk/nativead/aa;->n:J

    .line 1530
    iput v1, p0, Lcom/cmcm/adsdk/nativead/aa;->m:I

    .line 1531
    iput-boolean v1, p0, Lcom/cmcm/adsdk/nativead/aa;->l:Z

    .line 2209
    iput-boolean v1, p0, Lcom/cmcm/adsdk/nativead/aa;->i:Z

    .line 2211
    :try_start_2
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->j:Ljava/util/Timer;

    .line 2212
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->j:Ljava/util/Timer;

    new-instance v2, Lcom/cmcm/adsdk/nativead/af;

    invoke-direct {v2, p0}, Lcom/cmcm/adsdk/nativead/af;-><init>(Lcom/cmcm/adsdk/nativead/aa;)V

    const-wide/16 v4, 0x1f40

    invoke-virtual {v0, v2, v4, v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 197
    :goto_2
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v6, :cond_3

    .line 198
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->c:Landroid/os/Handler;

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/aa;->s:Ljava/lang/Runnable;

    const-wide/16 v4, 0xfa0

    invoke-virtual {v0, v2, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 199
    iput-boolean v6, p0, Lcom/cmcm/adsdk/nativead/aa;->o:Z

    .line 201
    :cond_3
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/aa;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 202
    :goto_3
    :try_start_3
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v3, 0x2

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 203
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/b/a/c;

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/aa;->a(Lcom/cmcm/adsdk/b/a/c;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 202
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    .line 2214
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2

    .line 205
    :cond_4
    :try_start_4
    monitor-exit v2

    goto/16 :goto_1

    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw v0
.end method

.method static synthetic c(Lcom/cmcm/adsdk/nativead/aa;)V
    .locals 7

    .prologue
    .line 37
    .line 8096
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/aa;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 8097
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->p:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 8098
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/b/a/c;

    .line 8099
    iget-object v3, v0, Lcom/cmcm/adsdk/b/a/c;->d:Ljava/lang/String;

    iget-object v4, p0, Lcom/cmcm/adsdk/nativead/aa;->mContext:Landroid/content/Context;

    iget-object v5, p0, Lcom/cmcm/adsdk/nativead/aa;->mPositionId:Ljava/lang/String;

    iget-object v6, v0, Lcom/cmcm/adsdk/b/a/c;->c:Ljava/lang/String;

    invoke-direct {p0, v3, v4, v5, v6}, Lcom/cmcm/adsdk/nativead/aa;->a(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/cmcm/adsdk/nativead/w;

    move-result-object v3

    .line 8100
    iget-object v4, p0, Lcom/cmcm/adsdk/nativead/aa;->p:Ljava/util/Map;

    iget-object v0, v0, Lcom/cmcm/adsdk/b/a/c;->d:Ljava/lang/String;

    invoke-interface {v4, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 8104
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 8102
    :cond_0
    :try_start_1
    const-string v0, "CMCMADSDK"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "mConfigBeans size:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 8103
    const-string v0, "CMCMADSDK"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "mLoaderCache size:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/aa;->p:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 8104
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method private c()Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 258
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/aa;->p:Ljava/util/Map;

    const-string v2, "cm"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 259
    const-string v1, "CMCMADSDK"

    const-string v2, "now loaders no picks, no need to delay"

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    :cond_0
    :goto_0
    return v0

    .line 263
    :cond_1
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/aa;->q:Ljava/util/Map;

    monitor-enter v1

    .line 264
    :try_start_0
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/aa;->q:Ljava/util/Map;

    const-string v3, "cm"

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 265
    const-string v2, "CMCMADSDK"

    const-string v3, "result map has picks, no need to delay"

    invoke-static {v2, v3}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    monitor-exit v1

    goto :goto_0

    .line 268
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 269
    const-string v1, "CMCMADSDK"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "has delay to check finish :"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v3, p0, Lcom/cmcm/adsdk/nativead/aa;->l:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 270
    iget-boolean v1, p0, Lcom/cmcm/adsdk/nativead/aa;->l:Z

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method private d()V
    .locals 4

    .prologue
    .line 293
    const-string v0, "CMCMADSDK"

    const-string v1, "issue to load low priority ad"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 294
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/aa;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 295
    :try_start_0
    const-string v0, "CMCMADSDK"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "next load index :"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, Lcom/cmcm/adsdk/nativead/aa;->m:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",config size:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    iget v0, p0, Lcom/cmcm/adsdk/nativead/aa;->m:I

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 298
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    iget v2, p0, Lcom/cmcm/adsdk/nativead/aa;->m:I

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/b/a/c;

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/aa;->a(Lcom/cmcm/adsdk/b/a/c;)Z

    .line 303
    :goto_0
    monitor-exit v1

    return-void

    .line 300
    :cond_0
    const-string v0, "CMCMADSDK"

    const-string v2, "the load index is last one,remove no callback task"

    invoke-static {v0, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->c:Landroid/os/Handler;

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/aa;->t:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 303
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic d(Lcom/cmcm/adsdk/nativead/aa;)Z
    .locals 1

    .prologue
    .line 37
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/aa;->k:Z

    return v0
.end method

.method private e()V
    .locals 2

    .prologue
    .line 400
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/aa;->t:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 401
    return-void
.end method

.method static synthetic e(Lcom/cmcm/adsdk/nativead/aa;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/aa;->b()V

    return-void
.end method

.method private f()Z
    .locals 3

    .prologue
    .line 470
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/aa;->q:Ljava/util/Map;

    monitor-enter v1

    .line 471
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/aa;->q:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 472
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic f(Lcom/cmcm/adsdk/nativead/aa;)Z
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/cmcm/adsdk/nativead/aa;->k:Z

    return v0
.end method

.method private g()V
    .locals 6

    .prologue
    .line 476
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/aa;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 477
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 478
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/b/a/c;

    .line 479
    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/aa;->b(Lcom/cmcm/adsdk/b/a/c;)Lcom/cmcm/a/a/a;

    move-result-object v3

    .line 480
    if-eqz v3, :cond_0

    .line 481
    const-string v2, "CMCMADSDK"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "match ad:"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 5061
    iget-object v0, v0, Lcom/cmcm/adsdk/b/a/c;->d:Ljava/lang/String;

    .line 481
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, " "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v3}, Lcom/cmcm/a/a/a;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/aa;->h()V

    .line 483
    monitor-exit v1

    .line 490
    :goto_0
    return-void

    .line 487
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 488
    const-string v0, "CMCMADSDK"

    const-string v1, " fatal config or adtype"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 489
    const/16 v0, 0x2713

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/aa;->a(I)V

    goto :goto_0

    .line 487
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic g(Lcom/cmcm/adsdk/nativead/aa;)Z
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/cmcm/adsdk/nativead/aa;->i:Z

    return v0
.end method

.method private h()V
    .locals 2

    .prologue
    .line 508
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->c:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/a/b/a;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 509
    const-string v0, "CMCMADSDK"

    const-string v1, "notifyAdLoaded"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->h:Lcom/cmcm/a/a/d;

    if-eqz v0, :cond_0

    .line 513
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->h:Lcom/cmcm/a/a/d;

    invoke-interface {v0}, Lcom/cmcm/a/a/d;->a()V

    .line 515
    :cond_0
    return-void
.end method

.method static synthetic h(Lcom/cmcm/adsdk/nativead/aa;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/aa;->e()V

    return-void
.end method

.method static synthetic i(Lcom/cmcm/adsdk/nativead/aa;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->q:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic j(Lcom/cmcm/adsdk/nativead/aa;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->c:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic k(Lcom/cmcm/adsdk/nativead/aa;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/aa;->d()V

    return-void
.end method

.method static synthetic l(Lcom/cmcm/adsdk/nativead/aa;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    const/16 v5, 0x2714

    const/4 v4, 0x1

    .line 8416
    const-string v0, "CMCMADSDK"

    const-string v2, "check finish"

    invoke-static {v0, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 8417
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/aa;->g:Z

    if-eqz v0, :cond_1

    .line 8418
    const-string v0, "CMCMADSDK"

    const-string v1, "already finished"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 8431
    :cond_0
    :goto_0
    return-void

    .line 9404
    :cond_1
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/aa;->l:Z

    if-eqz v0, :cond_2

    .line 9405
    const-string v0, "CMCMADSDK"

    const-string v2, "remove delay task"

    invoke-static {v0, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 9406
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->c:Landroid/os/Handler;

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/aa;->t:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 9409
    :cond_2
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/aa;->o:Z

    if-eqz v0, :cond_3

    .line 9410
    const-string v0, "CMCMADSDK"

    const-string v2, "remove no callback task"

    invoke-static {v0, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 9411
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->c:Landroid/os/Handler;

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/aa;->s:Ljava/lang/Runnable;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8423
    :cond_3
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/aa;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 8424
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    move-object v0, v1

    .line 8425
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8427
    if-nez v0, :cond_6

    .line 8429
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/aa;->i:Z

    if-nez v0, :cond_6

    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/aa;->f()Z

    move-result v0

    if-nez v0, :cond_6

    .line 8430
    const-string v0, "CMCMADSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "is timeout:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Lcom/cmcm/adsdk/nativead/aa;->i:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 8424
    :cond_5
    :try_start_1
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/b/a/c;

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/aa;->b(Lcom/cmcm/adsdk/b/a/c;)Lcom/cmcm/a/a/a;

    move-result-object v0

    goto :goto_1

    .line 8425
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 8436
    :cond_6
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->f:Ljava/util/Vector;

    invoke-virtual {v0}, Ljava/util/Vector;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 8438
    iput-boolean v4, p0, Lcom/cmcm/adsdk/nativead/aa;->g:Z

    .line 8439
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/aa;->g()V

    .line 8460
    :cond_7
    :goto_2
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/aa;->g:Z

    if-nez v0, :cond_8

    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/aa;->i:Z

    if-eqz v0, :cond_0

    .line 8461
    :cond_8
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->j:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 8462
    iput-boolean v4, p0, Lcom/cmcm/adsdk/nativead/aa;->g:Z

    .line 8463
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->j:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 8464
    iput-object v1, p0, Lcom/cmcm/adsdk/nativead/aa;->j:Ljava/util/Timer;

    goto/16 :goto_0

    .line 8442
    :cond_9
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/aa;->f()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 8443
    iput-boolean v4, p0, Lcom/cmcm/adsdk/nativead/aa;->g:Z

    .line 8444
    const/16 v0, 0x2712

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/aa;->a(I)V

    goto :goto_2

    .line 8445
    :cond_a
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 8446
    iput-boolean v4, p0, Lcom/cmcm/adsdk/nativead/aa;->g:Z

    .line 8447
    invoke-direct {p0, v5}, Lcom/cmcm/adsdk/nativead/aa;->a(I)V

    goto :goto_2

    .line 8449
    :cond_b
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->q:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 8450
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 8451
    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/aa;->q:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/k;

    invoke-virtual {v0}, Lcom/cmcm/adsdk/k;->a()Z

    move-result v0

    if-nez v0, :cond_c

    .line 8452
    invoke-direct {p0, v5}, Lcom/cmcm/adsdk/nativead/aa;->a(I)V

    goto :goto_2
.end method


# virtual methods
.method public final a(Lcom/cmcm/a/a/a;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 323
    if-nez p1, :cond_1

    .line 357
    :cond_0
    :goto_0
    return-void

    .line 326
    :cond_1
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/aa;->q:Ljava/util/Map;

    monitor-enter v1

    .line 327
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->q:Ljava/util/Map;

    invoke-interface {p1}, Lcom/cmcm/a/a/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 328
    monitor-exit v1

    goto :goto_0

    .line 330
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 331
    const-string v0, "CMCMADSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p1}, Lcom/cmcm/a/a/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " load success"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    invoke-interface {p1}, Lcom/cmcm/a/a/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v3, v4}, Lcom/cmcm/adsdk/nativead/aa;->a(Ljava/lang/String;ZLjava/lang/String;)V

    .line 333
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/aa;->g:Z

    if-nez v0, :cond_0

    .line 336
    if-eqz p1, :cond_3

    .line 337
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->f:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 339
    :cond_3
    instance-of v0, p1, Lcom/cmcm/adsdk/nativead/m;

    if-eqz v0, :cond_4

    .line 341
    check-cast p1, Lcom/cmcm/adsdk/nativead/m;

    invoke-virtual {p1}, Lcom/cmcm/adsdk/nativead/m;->o()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 342
    const-string v0, "CMCMADSDK"

    const-string v1, "picks ad is priority"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/aa;->h()V

    .line 344
    iput-boolean v3, p0, Lcom/cmcm/adsdk/nativead/aa;->g:Z

    .line 345
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->j:Ljava/util/Timer;

    if-eqz v0, :cond_4

    .line 346
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->j:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 347
    iput-object v4, p0, Lcom/cmcm/adsdk/nativead/aa;->j:Ljava/util/Timer;

    .line 351
    :cond_4
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/aa;->c()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 352
    iput-boolean v3, p0, Lcom/cmcm/adsdk/nativead/aa;->l:Z

    .line 4360
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/cmcm/adsdk/nativead/aa;->n:J

    sub-long/2addr v0, v2

    .line 4361
    const-string v2, "CMCMADSDK"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "load spend time: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ",picks protect time :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lcom/cmcm/adsdk/nativead/aa;->a:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 4362
    iget v2, p0, Lcom/cmcm/adsdk/nativead/aa;->a:I

    int-to-long v2, v2

    cmp-long v2, v0, v2

    if-lez v2, :cond_5

    const-wide/16 v0, 0x0

    .line 4363
    :goto_1
    const-string v2, "CMCMADSDK"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "delay to check finish , need delay time :"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 4364
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/aa;->c:Landroid/os/Handler;

    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/aa;->t:Ljava/lang/Runnable;

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_0

    .line 4362
    :cond_5
    iget v2, p0, Lcom/cmcm/adsdk/nativead/aa;->a:I

    int-to-long v2, v2

    sub-long v0, v2, v0

    goto :goto_1

    .line 355
    :cond_6
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/aa;->e()V

    goto/16 :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 369
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/aa;->q:Ljava/util/Map;

    monitor-enter v1

    .line 370
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->q:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 371
    monitor-exit v1

    .line 381
    :cond_0
    :goto_0
    return-void

    .line 373
    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 374
    const-string v0, "CMCMADSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " load fail"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 375
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/cmcm/adsdk/nativead/aa;->a(Ljava/lang/String;ZLjava/lang/String;)V

    .line 376
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/aa;->g:Z

    if-nez v0, :cond_0

    .line 379
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/aa;->d()V

    .line 380
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/aa;->e()V

    goto :goto_0

    .line 373
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final b(Lcom/cmcm/a/a/a;)V
    .locals 1

    .prologue
    .line 386
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->h:Lcom/cmcm/a/a/d;

    if-eqz v0, :cond_0

    .line 387
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->h:Lcom/cmcm/a/a/d;

    invoke-interface {v0, p1}, Lcom/cmcm/a/a/d;->a(Lcom/cmcm/a/a/a;)V

    .line 389
    :cond_0
    return-void
.end method

.method public final getAdList(I)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Lcom/cmcm/a/a/a;",
            ">;"
        }
    .end annotation

    .prologue
    .line 585
    const-string v0, "CMCMADSDK"

    const-string v1, "getAdList"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 586
    invoke-static {}, Lcom/cmcm/adsdk/a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 587
    const-string v0, "CMCMADSDK"

    const-string v1, "sdk has stop work"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 588
    const/4 v0, 0x0

    .line 608
    :goto_0
    return-object v0

    .line 590
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 591
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/aa;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 592
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->p:Ljava/util/Map;

    if-eqz v0, :cond_3

    .line 593
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/b/a/c;

    .line 594
    iget-object v4, p0, Lcom/cmcm/adsdk/nativead/aa;->p:Ljava/util/Map;

    .line 8061
    iget-object v0, v0, Lcom/cmcm/adsdk/b/a/c;->d:Ljava/lang/String;

    .line 594
    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/nativead/w;

    .line 595
    if-eqz v0, :cond_2

    .line 596
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    sub-int v4, p1, v4

    .line 597
    invoke-virtual {v0, v4}, Lcom/cmcm/adsdk/nativead/w;->getAdList(I)Ljava/util/List;

    move-result-object v0

    .line 598
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    .line 599
    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 602
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-lt v0, p1, :cond_1

    .line 607
    :cond_3
    monitor-exit v2

    move-object v0, v1

    .line 608
    goto :goto_0

    .line 607
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final loadAd()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 139
    invoke-static {}, Lcom/cmcm/adsdk/nativead/aa;->a()V

    .line 140
    const-string v0, "CMCMADSDK"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "posid "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/aa;->mPositionId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " loadAd..."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    invoke-static {}, Lcom/cmcm/adsdk/a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 142
    const-string v0, "CMCMADSDK"

    const-string v1, "sdk has stop work"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    :goto_0
    return-void

    .line 145
    :cond_0
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/aa;->g:Z

    if-nez v0, :cond_1

    .line 146
    invoke-static {}, Lcom/cmcm/adsdk/nativead/aa;->a()V

    .line 147
    const-string v0, "CMCMADSDK"

    const-string v1, "wait and reuse for last result"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 150
    :cond_1
    iput-boolean v3, p0, Lcom/cmcm/adsdk/nativead/aa;->g:Z

    .line 151
    iget-boolean v0, p0, Lcom/cmcm/adsdk/nativead/aa;->b:Z

    if-eqz v0, :cond_2

    .line 1161
    new-instance v0, Lcom/cmcm/adsdk/nativead/ac;

    invoke-direct {v0, p0}, Lcom/cmcm/adsdk/nativead/ac;-><init>(Lcom/cmcm/adsdk/nativead/aa;)V

    new-array v1, v3, [Ljava/lang/Void;

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/c/a;->a(Landroid/os/AsyncTask;[Ljava/lang/Object;)V

    .line 153
    iput-boolean v3, p0, Lcom/cmcm/adsdk/nativead/aa;->b:Z

    goto :goto_0

    .line 155
    :cond_2
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/aa;->b()V

    goto :goto_0
.end method

.method protected final removeAdFromPool(Lcom/cmcm/a/a/a;)V
    .locals 2

    .prologue
    .line 575
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->p:Ljava/util/Map;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 576
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/aa;->p:Ljava/util/Map;

    invoke-interface {p1}, Lcom/cmcm/a/a/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/nativead/w;

    .line 577
    if-eqz v0, :cond_0

    .line 578
    invoke-virtual {v0, p1}, Lcom/cmcm/adsdk/nativead/w;->removeAdFromPool(Lcom/cmcm/a/a/a;)V

    .line 581
    :cond_0
    return-void
.end method

.method public final setAdListener(Lcom/cmcm/a/a/d;)V
    .locals 0

    .prologue
    .line 127
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/aa;->h:Lcom/cmcm/a/a/d;

    .line 129
    return-void
.end method

.method public final update(Ljava/util/Observable;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 68
    const-string v0, "CMCMADSDK"

    const-string v1, "config has update"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    new-instance v0, Lcom/cmcm/adsdk/nativead/ab;

    invoke-direct {v0, p0}, Lcom/cmcm/adsdk/nativead/ab;-><init>(Lcom/cmcm/adsdk/nativead/aa;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/c/a;->a(Landroid/os/AsyncTask;[Ljava/lang/Object;)V

    .line 92
    return-void
.end method
