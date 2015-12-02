.class public Lcom/mobvista/sdk/m/core/MobvistaAdNative;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/mobvista/sdk/m/a/a/c/d;


# instance fields
.field private a:Lcom/mobvista/sdk/m/core/ac;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/util/List;

.field private f:Lcom/mobvista/sdk/m/core/c/d;

.field private g:Lcom/mobvista/sdk/m/core/entity/b;

.field private h:Ljava/util/List;

.field private i:Lcom/mobvista/sdk/m/core/c/f;

.field private j:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

.field private k:Lcom/mobvista/sdk/m/core/entity/Campaign;

.field private final l:I

.field private final m:I

.field private n:Lcom/mobvista/sdk/m/core/AdListener;

.field private o:Lcom/mobvista/sdk/m/core/a/b;

.field private p:Landroid/os/Handler;

.field private q:Ljava/lang/Runnable;


# direct methods
.method protected constructor <init>(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->e:Ljava/util/List;

    .line 37
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->f:Lcom/mobvista/sdk/m/core/c/d;

    .line 38
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->g:Lcom/mobvista/sdk/m/core/entity/b;

    .line 39
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->h:Ljava/util/List;

    .line 40
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->i:Lcom/mobvista/sdk/m/core/c/f;

    .line 41
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->j:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    .line 42
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->k:Lcom/mobvista/sdk/m/core/entity/Campaign;

    .line 45
    const/16 v0, 0x2710

    iput v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->l:I

    .line 46
    const/16 v0, 0x2713

    iput v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->m:I

    .line 48
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->n:Lcom/mobvista/sdk/m/core/AdListener;

    .line 49
    iput-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->o:Lcom/mobvista/sdk/m/core/a/b;

    .line 55
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->b:Landroid/content/Context;

    .line 56
    iput-object p2, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->c:Ljava/lang/String;

    .line 57
    iput-object p3, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->d:Ljava/lang/String;

    .line 58
    new-instance v0, Lcom/mobvista/sdk/m/core/ac;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->b:Landroid/content/Context;

    invoke-direct {v0, v1, p2}, Lcom/mobvista/sdk/m/core/ac;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->a:Lcom/mobvista/sdk/m/core/ac;

    .line 59
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->i:Lcom/mobvista/sdk/m/core/c/f;

    if-nez v0, :cond_0

    .line 60
    invoke-static {p1}, Lcom/mobvista/sdk/m/core/c/f;->a(Landroid/content/Context;)Lcom/mobvista/sdk/m/core/c/f;

    move-result-object v0

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->i:Lcom/mobvista/sdk/m/core/c/f;

    .line 63
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->p:Landroid/os/Handler;

    .line 64
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->a()V

    .line 65
    return-void
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->p:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic a(Lcom/mobvista/sdk/m/core/MobvistaAdNative;Lcom/mobvista/sdk/m/core/entity/Campaign;)Lcom/mobvista/sdk/m/core/entity/Campaign;
    .locals 0

    .prologue
    .line 27
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->k:Lcom/mobvista/sdk/m/core/entity/Campaign;

    return-object p1
.end method

.method private a()V
    .locals 2

    .prologue
    .line 73
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->f:Lcom/mobvista/sdk/m/core/c/d;

    if-nez v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->i:Lcom/mobvista/sdk/m/core/c/f;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/c/d;->a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/d;

    move-result-object v0

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->f:Lcom/mobvista/sdk/m/core/c/d;

    .line 76
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->f:Lcom/mobvista/sdk/m/core/c/d;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/c/d;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->e:Ljava/util/List;

    .line 77
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->b()V

    .line 78
    return-void
.end method

.method static synthetic b(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->q:Ljava/lang/Runnable;

    return-object v0
.end method

.method private b()V
    .locals 3

    .prologue
    .line 86
    new-instance v0, Lcom/mobvista/sdk/m/core/loader/l;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/core/loader/l;-><init>()V

    .line 87
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->b:Landroid/content/Context;

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/core/loader/l;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 88
    const/16 v1, 0x2713

    invoke-virtual {v0, v1, p0}, Lcom/mobvista/sdk/m/core/loader/l;->a(ILcom/mobvista/sdk/m/a/a/c/d;)V

    .line 89
    const-string/jumbo v0, "MobvistaAdNative"

    const-string/jumbo v1, "start to load profile..."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 91
    return-void
.end method

.method private c()V
    .locals 6

    .prologue
    .line 131
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->i:Lcom/mobvista/sdk/m/core/c/f;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/c/b;->a(Lcom/mobvista/sdk/m/a/a/a/a;)Lcom/mobvista/sdk/m/core/c/b;

    move-result-object v0

    .line 132
    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/c/b;->b()V

    .line 165
    new-instance v0, Lcom/mobvista/sdk/m/core/loader/a;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/core/loader/a;-><init>()V

    .line 166
    const/4 v1, 0x1

    sget-object v2, Lcom/mobvista/sdk/m/a/f/d;->a:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->i:Lcom/mobvista/sdk/m/core/c/f;

    iget-object v4, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->b:Landroid/content/Context;

    iget-object v5, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->c:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lcom/mobvista/sdk/m/core/loader/a;->a(ILjava/util/List;Lcom/mobvista/sdk/m/core/c/f;Landroid/content/Context;Ljava/lang/String;)V

    .line 167
    const/16 v1, 0x2710

    invoke-virtual {v0, v1, p0}, Lcom/mobvista/sdk/m/core/loader/a;->a(ILcom/mobvista/sdk/m/a/a/c/d;)V

    .line 168
    const-string/jumbo v0, "MobvistaAdNative"

    const-string/jumbo v1, "start to load ads..."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 172
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->o:Lcom/mobvista/sdk/m/core/a/b;

    .line 173
    return-void
.end method

.method static synthetic c(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Z
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->f()Z

    move-result v0

    return v0
.end method

.method private d()V
    .locals 4

    .prologue
    .line 176
    new-instance v0, Lcom/mobvista/sdk/m/core/a/b;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/core/a/b;-><init>()V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->o:Lcom/mobvista/sdk/m/core/a/b;

    .line 177
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->o:Lcom/mobvista/sdk/m/core/a/b;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->b:Landroid/content/Context;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->d:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/a/b;->a([Ljava/lang/Object;)V

    .line 178
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->o:Lcom/mobvista/sdk/m/core/a/b;

    new-instance v1, Lcom/mobvista/sdk/m/core/t;

    invoke-direct {v1, p0}, Lcom/mobvista/sdk/m/core/t;-><init>(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)V

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/a/b;->a(Lcom/mobvista/sdk/m/core/a/a;)V

    .line 224
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->q:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    .line 225
    new-instance v0, Lcom/mobvista/sdk/m/core/u;

    invoke-direct {v0, p0}, Lcom/mobvista/sdk/m/core/u;-><init>(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->q:Ljava/lang/Runnable;

    .line 234
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->p:Landroid/os/Handler;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->q:Ljava/lang/Runnable;

    const-wide/16 v2, 0x1f40

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 236
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->j:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    .line 237
    return-void
.end method

.method static synthetic d(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Z
    .locals 1

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->e()Z

    move-result v0

    return v0
.end method

.method static synthetic e(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Lcom/mobvista/sdk/m/core/a/b;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->o:Lcom/mobvista/sdk/m/core/a/b;

    return-object v0
.end method

.method private e()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 291
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->g:Lcom/mobvista/sdk/m/core/entity/b;

    invoke-virtual {v1}, Lcom/mobvista/sdk/m/core/entity/b;->a()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "facebook"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 292
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->d()V

    .line 301
    :goto_0
    return v0

    .line 296
    :cond_0
    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->g:Lcom/mobvista/sdk/m/core/entity/b;

    invoke-virtual {v1}, Lcom/mobvista/sdk/m/core/entity/b;->a()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "mobvista"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 297
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->c()V

    goto :goto_0

    .line 301
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic f(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Lcom/mobvista/sdk/m/core/entity/Campaign;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->k:Lcom/mobvista/sdk/m/core/entity/Campaign;

    return-object v0
.end method

.method private f()Z
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 307
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->h:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move v0, v3

    .line 329
    :goto_0
    return v0

    .line 311
    :cond_1
    const/4 v2, 0x0

    .line 312
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/entity/b;

    .line 313
    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/entity/b;->h()Ljava/util/Map;

    move-result-object v1

    const-string/jumbo v5, "native"

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_5

    .line 314
    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/entity/b;->h()Ljava/util/Map;

    move-result-object v1

    const-string/jumbo v5, "native"

    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mobvista/sdk/m/core/entity/c;

    invoke-virtual {v1}, Lcom/mobvista/sdk/m/core/entity/c;->b()I

    move-result v5

    .line 315
    if-nez v2, :cond_2

    move v1, v3

    .line 317
    :goto_2
    if-le v5, v1, :cond_5

    :goto_3
    move-object v2, v0

    .line 321
    goto :goto_1

    .line 315
    :cond_2
    invoke-virtual {v2}, Lcom/mobvista/sdk/m/core/entity/b;->h()Ljava/util/Map;

    move-result-object v1

    const-string/jumbo v6, "native"

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mobvista/sdk/m/core/entity/c;

    invoke-virtual {v1}, Lcom/mobvista/sdk/m/core/entity/c;->b()I

    move-result v1

    goto :goto_2

    .line 323
    :cond_3
    if-eqz v2, :cond_4

    .line 324
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->h:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 325
    iput-object v2, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->g:Lcom/mobvista/sdk/m/core/entity/b;

    .line 326
    const/4 v0, 0x1

    goto :goto_0

    :cond_4
    move v0, v3

    .line 329
    goto :goto_0

    :cond_5
    move-object v0, v2

    goto :goto_3
.end method

.method static synthetic g(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Lcom/mobvista/sdk/m/core/AdListener;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->n:Lcom/mobvista/sdk/m/core/AdListener;

    return-object v0
.end method

.method static synthetic h(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->c()V

    return-void
.end method

.method static synthetic i(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Lcom/mobvista/sdk/m/core/entity/CampaignEx;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->j:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    return-object v0
.end method

.method static synthetic j(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)Lcom/mobvista/sdk/m/core/ac;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->a:Lcom/mobvista/sdk/m/core/ac;

    return-object v0
.end method


# virtual methods
.method public OnLoadCanceled(I)V
    .locals 0

    .prologue
    .line 414
    return-void
.end method

.method public OnLoadError(ILjava/lang/String;)V
    .locals 1

    .prologue
    .line 406
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->n:Lcom/mobvista/sdk/m/core/AdListener;

    if-eqz v0, :cond_0

    .line 407
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->n:Lcom/mobvista/sdk/m/core/AdListener;

    invoke-interface {v0, p2}, Lcom/mobvista/sdk/m/core/AdListener;->onAdLoadError(Ljava/lang/String;)V

    .line 409
    :cond_0
    return-void
.end method

.method public OnLoadFinish(ILjava/lang/Object;)V
    .locals 4

    .prologue
    .line 348
    const/16 v0, 0x2710

    if-ne p1, v0, :cond_1

    .line 349
    if-eqz p2, :cond_3

    move-object v0, p2

    .line 350
    check-cast v0, Ljava/util/List;

    .line 351
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 352
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->j:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    .line 353
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->n:Lcom/mobvista/sdk/m/core/AdListener;

    if-eqz v0, :cond_0

    .line 354
    new-instance v0, Lcom/mobvista/sdk/m/core/entity/Campaign;

    invoke-direct {v0}, Lcom/mobvista/sdk/m/core/entity/Campaign;-><init>()V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->k:Lcom/mobvista/sdk/m/core/entity/Campaign;

    .line 355
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->k:Lcom/mobvista/sdk/m/core/entity/Campaign;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->j:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->setId(Ljava/lang/String;)V

    .line 356
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->k:Lcom/mobvista/sdk/m/core/entity/Campaign;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->j:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getAppName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->setAppName(Ljava/lang/String;)V

    .line 358
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->k:Lcom/mobvista/sdk/m/core/entity/Campaign;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->j:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getAppDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->setAppDesc(Ljava/lang/String;)V

    .line 360
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->k:Lcom/mobvista/sdk/m/core/entity/Campaign;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->j:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getIconUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->setIconUrl(Ljava/lang/String;)V

    .line 362
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->k:Lcom/mobvista/sdk/m/core/entity/Campaign;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->j:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->setImageUrl(Ljava/lang/String;)V

    .line 364
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->k:Lcom/mobvista/sdk/m/core/entity/Campaign;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->j:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v1}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->getBgImage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->setBgImage(Ljava/lang/String;)V

    .line 366
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->k:Lcom/mobvista/sdk/m/core/entity/Campaign;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/mobvista/sdk/m/core/entity/Campaign;->setTimestamp(J)V

    .line 368
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->k:Lcom/mobvista/sdk/m/core/entity/Campaign;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/entity/Campaign;->setType(I)V

    .line 370
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->n:Lcom/mobvista/sdk/m/core/AdListener;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->k:Lcom/mobvista/sdk/m/core/entity/Campaign;

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/core/AdListener;->onAdLoaded(Lcom/mobvista/sdk/m/core/entity/Campaign;)V

    .line 372
    :cond_0
    const-string/jumbo v0, "MobvistaAdNative"

    const-string/jumbo v1, "Load Ads success."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 382
    :cond_1
    :goto_0
    const/16 v0, 0x2713

    if-ne p1, v0, :cond_2

    .line 383
    check-cast p2, Lcom/mobvista/sdk/m/core/loader/m;

    .line 384
    if-eqz p2, :cond_5

    .line 385
    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/m;->a()I

    move-result v0

    sget v1, Lcom/mobvista/sdk/m/core/loader/m;->a:I

    if-ne v0, v1, :cond_4

    .line 387
    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/m;->c()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/m;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 390
    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/m;->c()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->e:Ljava/util/List;

    .line 391
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->f:Lcom/mobvista/sdk/m/core/c/d;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->e:Ljava/util/List;

    iget-object v2, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/core/c/d;->a(Ljava/util/List;Ljava/lang/String;)Z

    .line 402
    :cond_2
    :goto_1
    return-void

    .line 375
    :cond_3
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->n:Lcom/mobvista/sdk/m/core/AdListener;

    if-eqz v0, :cond_1

    .line 376
    const-string/jumbo v0, "MobvistaAdNative"

    const-string/jumbo v1, "Load ads failed: No fill."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 377
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->n:Lcom/mobvista/sdk/m/core/AdListener;

    const-string/jumbo v1, "No fill"

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/core/AdListener;->onAdLoadError(Ljava/lang/String;)V

    goto :goto_0

    .line 395
    :cond_4
    const-string/jumbo v0, "MobvistaAdNative"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "load profile failed: ["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/m;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "]   "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p2}, Lcom/mobvista/sdk/m/core/loader/m;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 399
    :cond_5
    const-string/jumbo v0, "MobvistaAdNative"

    const-string/jumbo v1, "profile is empty."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1
.end method

.method public OnLoadStart(I)V
    .locals 0

    .prologue
    .line 344
    return-void
.end method

.method public loadAd(Lcom/mobvista/sdk/m/core/AdListener;)V
    .locals 0

    .prologue
    .line 68
    invoke-virtual {p0, p1}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->loadAds(Lcom/mobvista/sdk/m/core/AdListener;)V

    .line 69
    return-void
.end method

.method public loadAds(Lcom/mobvista/sdk/m/core/AdListener;)V
    .locals 2

    .prologue
    .line 98
    iput-object p1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->n:Lcom/mobvista/sdk/m/core/AdListener;

    .line 100
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/mobvista/sdk/m/core/MobvistaAd;->popPreloadedNativeAd(Ljava/lang/String;)Lcom/mobvista/sdk/m/core/MobvistaAdNative;

    move-result-object v0

    .line 101
    if-eqz v0, :cond_1

    iget-object v1, v0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->k:Lcom/mobvista/sdk/m/core/entity/Campaign;

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->j:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->o:Lcom/mobvista/sdk/m/core/a/b;

    if-eqz v1, :cond_1

    .line 104
    :cond_0
    iget-object v1, v0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->k:Lcom/mobvista/sdk/m/core/entity/Campaign;

    iput-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->k:Lcom/mobvista/sdk/m/core/entity/Campaign;

    .line 105
    iget-object v1, v0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->j:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    iput-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->j:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    .line 106
    iget-object v0, v0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->o:Lcom/mobvista/sdk/m/core/a/b;

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->o:Lcom/mobvista/sdk/m/core/a/b;

    .line 107
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->n:Lcom/mobvista/sdk/m/core/AdListener;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->k:Lcom/mobvista/sdk/m/core/entity/Campaign;

    invoke-interface {v0, v1}, Lcom/mobvista/sdk/m/core/AdListener;->onAdLoaded(Lcom/mobvista/sdk/m/core/entity/Campaign;)V

    .line 127
    :goto_0
    return-void

    .line 111
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->e:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 113
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->h:Ljava/util/List;

    .line 114
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->h:Ljava/util/List;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->e:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 117
    :cond_2
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 118
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    .line 125
    :cond_3
    invoke-direct {p0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->c()V

    goto :goto_0
.end method

.method public registerView(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 243
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->registerView(Landroid/view/View;Lcom/mobvista/sdk/m/core/AdTrackingListener;)V

    .line 244
    return-void
.end method

.method public registerView(Landroid/view/View;Lcom/mobvista/sdk/m/core/AdTrackingListener;)V
    .locals 3

    .prologue
    .line 251
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->k:Lcom/mobvista/sdk/m/core/entity/Campaign;

    if-nez v0, :cond_0

    .line 252
    const-string/jumbo v0, "MobvistaAdNative"

    const-string/jumbo v1, "No ad loaded, call loadAds() to get ad first"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 286
    :goto_0
    return-void

    .line 256
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->a:Lcom/mobvista/sdk/m/core/ac;

    invoke-virtual {v0, p2}, Lcom/mobvista/sdk/m/core/ac;->a(Lcom/mobvista/sdk/m/core/AdTrackingListener;)V

    .line 259
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->o:Lcom/mobvista/sdk/m/core/a/b;

    if-eqz v0, :cond_1

    .line 260
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->o:Lcom/mobvista/sdk/m/core/a/b;

    invoke-virtual {v0, p1}, Lcom/mobvista/sdk/m/core/a/b;->a(Landroid/view/View;)V

    goto :goto_0

    .line 265
    :cond_1
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->j:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    if-nez v0, :cond_2

    .line 266
    const-string/jumbo v0, "MobvistaAdNative"

    const-string/jumbo v1, "No ad loaded, call loadAds() to get ad first"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 271
    :cond_2
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->j:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/entity/CampaignEx;->isPreClick()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 272
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->a:Lcom/mobvista/sdk/m/core/ac;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->j:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/mobvista/sdk/m/core/ac;->a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;Z)V

    .line 276
    :cond_3
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->a:Lcom/mobvista/sdk/m/core/ac;

    iget-object v1, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->j:Lcom/mobvista/sdk/m/core/entity/CampaignEx;

    invoke-virtual {v0, v1}, Lcom/mobvista/sdk/m/core/ac;->a(Lcom/mobvista/sdk/m/core/entity/CampaignEx;)V

    .line 278
    new-instance v0, Lcom/mobvista/sdk/m/core/v;

    invoke-direct {v0, p0}, Lcom/mobvista/sdk/m/core/v;-><init>(Lcom/mobvista/sdk/m/core/MobvistaAdNative;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0
.end method

.method public release()V
    .locals 1

    .prologue
    .line 333
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->o:Lcom/mobvista/sdk/m/core/a/b;

    if-eqz v0, :cond_0

    .line 334
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->o:Lcom/mobvista/sdk/m/core/a/b;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/a/b;->a()V

    .line 336
    :cond_0
    iget-object v0, p0, Lcom/mobvista/sdk/m/core/MobvistaAdNative;->a:Lcom/mobvista/sdk/m/core/ac;

    invoke-virtual {v0}, Lcom/mobvista/sdk/m/core/ac;->a()V

    .line 337
    return-void
.end method
