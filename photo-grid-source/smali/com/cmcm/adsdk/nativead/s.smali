.class public final Lcom/cmcm/adsdk/nativead/s;
.super Lcom/cmcm/adsdk/nativead/w;
.source "SourceFile"


# instance fields
.field public a:[Ljava/lang/String;

.field private final b:I

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/cmcm/a/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/cmcm/a/a/a;",
            ">;"
        }
    .end annotation
.end field

.field private final e:I

.field private final f:Ljava/lang/String;

.field private g:Landroid/content/Context;

.field private h:I

.field private i:Ljava/util/concurrent/atomic/AtomicInteger;

.field private j:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private k:Ljava/lang/Object;

.field private l:Ljava/util/Timer;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 64
    const-string v0, "fb"

    invoke-direct {p0, p1, p2, v0}, Lcom/cmcm/adsdk/nativead/w;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    const/16 v0, 0x1f40

    iput v0, p0, Lcom/cmcm/adsdk/nativead/s;->b:I

    .line 32
    iput-object v1, p0, Lcom/cmcm/adsdk/nativead/s;->a:[Ljava/lang/String;

    .line 33
    iput-object v1, p0, Lcom/cmcm/adsdk/nativead/s;->c:Ljava/util/List;

    .line 34
    iput-object v1, p0, Lcom/cmcm/adsdk/nativead/s;->d:Ljava/util/List;

    .line 35
    const/16 v0, 0xbb8

    iput v0, p0, Lcom/cmcm/adsdk/nativead/s;->e:I

    .line 36
    const-string v0, "com.facebook.ad"

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->f:Ljava/lang/String;

    .line 38
    iput v2, p0, Lcom/cmcm/adsdk/nativead/s;->h:I

    .line 39
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 40
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 42
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->k:Ljava/lang/Object;

    .line 65
    iput-object p1, p0, Lcom/cmcm/adsdk/nativead/s;->g:Landroid/content/Context;

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->c:Ljava/util/List;

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->d:Ljava/util/List;

    .line 69
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 70
    const-string v0, ","

    invoke-virtual {p3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->a:[Ljava/lang/String;

    .line 72
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/cmcm/adsdk/nativead/s;)V
    .locals 3

    .prologue
    .line 27
    .line 2053
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/s;->k:Ljava/lang/Object;

    monitor-enter v1

    .line 2054
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 2055
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->l:Ljava/util/Timer;

    if-eqz v0, :cond_0

    .line 2056
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->l:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    .line 2057
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->l:Ljava/util/Timer;

    .line 2059
    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic a(Lcom/cmcm/adsdk/nativead/s;Lcom/cmcm/adsdk/nativead/d;)V
    .locals 2

    .prologue
    .line 2194
    const-string v0, "FBNativeLoader"

    const-string v1, "FB notifyClick"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2195
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    invoke-interface {v0, p1}, Lcom/cmcm/adsdk/nativead/h;->b(Lcom/cmcm/a/a/a;)V

    .line 27
    return-void
.end method

.method static synthetic a(Lcom/cmcm/adsdk/nativead/s;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0, p1}, Lcom/cmcm/adsdk/nativead/s;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 222
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    .line 228
    :goto_0
    return-void

    .line 225
    :cond_0
    const-string v0, "FBNativeLoader"

    const-string v1, "FB adFailedToLoad"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 226
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 227
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    invoke-virtual {p0}, Lcom/cmcm/adsdk/nativead/s;->getAdName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/cmcm/adsdk/nativead/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private static a()Z
    .locals 1

    .prologue
    .line 77
    :try_start_0
    const-string v0, "com.facebook.ads.Ad"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 78
    const-string v0, "com.facebook.ads.AdError"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 79
    const-string v0, "com.facebook.ads.AdListener"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 80
    const-string v0, "com.facebook.ads.NativeAd"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 82
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/cmcm/a/a/a;",
            ">;)Z"
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 264
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 268
    :cond_0
    :goto_0
    return v0

    .line 267
    :cond_1
    invoke-virtual {p0, p1}, Lcom/cmcm/adsdk/nativead/s;->removeExpiredAds(Ljava/util/List;)V

    .line 268
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method private b()I
    .locals 2

    .prologue
    .line 112
    const/4 v1, 0x3

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->a:[Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/s;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v0, v1

    return v0

    :cond_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->a:[Ljava/lang/String;

    array-length v0, v0

    goto :goto_0
.end method

.method static synthetic b(Lcom/cmcm/adsdk/nativead/s;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method

.method static synthetic c(Lcom/cmcm/adsdk/nativead/s;)Ljava/util/List;
    .locals 1

    .prologue
    .line 27
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->c:Ljava/util/List;

    return-object v0
.end method

.method private c()V
    .locals 6

    .prologue
    .line 117
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-lez v0, :cond_0

    .line 118
    const-string v0, "FBNativeLoader"

    const-string v1, "isLoading avoid repeat load"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 144
    :goto_0
    return-void

    .line 121
    :cond_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->a:[Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->a:[Ljava/lang/String;

    array-length v0, v0

    if-nez v0, :cond_2

    .line 122
    :cond_1
    const-string v0, "FBNativeLoader"

    const-string v1, "no placementid"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    const-string v0, "10003"

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/s;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 126
    :cond_2
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->mContext:Landroid/content/Context;

    if-nez v0, :cond_3

    .line 127
    const-string v0, "FBNativeLoader"

    const-string v1, "Context is null"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    const-string v0, "10003"

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/s;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 131
    :cond_3
    const/4 v0, 0x0

    :goto_1
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/s;->b()I

    move-result v1

    if-ge v0, v1, :cond_4

    .line 132
    iget v1, p0, Lcom/cmcm/adsdk/nativead/s;->h:I

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/s;->a:[Ljava/lang/String;

    array-length v2, v2

    rem-int/2addr v1, v2

    iput v1, p0, Lcom/cmcm/adsdk/nativead/s;->h:I

    .line 133
    new-instance v1, Lcom/facebook/ads/NativeAd;

    new-instance v2, Lcom/cleanmaster/ui/app/utils/MarketContext;

    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/s;->g:Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/cleanmaster/ui/app/utils/MarketContext;-><init>(Landroid/content/Context;)V

    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/s;->a:[Ljava/lang/String;

    aget-object v3, v3, v0

    invoke-direct {v1, v2, v3}, Lcom/facebook/ads/NativeAd;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 134
    new-instance v2, Lcom/cmcm/adsdk/nativead/t;

    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/s;->a:[Ljava/lang/String;

    aget-object v3, v3, v0

    invoke-direct {v2, p0, v3}, Lcom/cmcm/adsdk/nativead/t;-><init>(Lcom/cmcm/adsdk/nativead/s;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/facebook/ads/NativeAd;->setAdListener(Lcom/facebook/ads/AdListener;)V

    .line 135
    invoke-virtual {v1}, Lcom/facebook/ads/NativeAd;->loadAd()V

    .line 136
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/s;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 137
    iget v1, p0, Lcom/cmcm/adsdk/nativead/s;->h:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/cmcm/adsdk/nativead/s;->h:I

    .line 131
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 139
    :cond_4
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/s;->k:Ljava/lang/Object;

    monitor-enter v1

    .line 140
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->l:Ljava/util/Timer;

    if-nez v0, :cond_5

    .line 141
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->l:Ljava/util/Timer;

    .line 143
    :cond_5
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->l:Ljava/util/Timer;

    new-instance v2, Lcom/cmcm/adsdk/nativead/u;

    invoke-direct {v2, p0}, Lcom/cmcm/adsdk/nativead/u;-><init>(Lcom/cmcm/adsdk/nativead/s;)V

    const-wide/16 v4, 0x1f40

    invoke-virtual {v0, v2, v4, v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 144
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private d()V
    .locals 0

    .prologue
    .line 200
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/s;->c()V

    .line 201
    return-void
.end method

.method static synthetic d(Lcom/cmcm/adsdk/nativead/s;)V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/s;->e()V

    return-void
.end method

.method private e()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 205
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1

    .line 219
    :cond_0
    :goto_0
    return-void

    .line 208
    :cond_1
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    if-eqz v0, :cond_0

    .line 209
    const/4 v0, 0x0

    .line 210
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/s;->c:Ljava/util/List;

    invoke-direct {p0, v1}, Lcom/cmcm/adsdk/nativead/s;->a(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 211
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->c:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/a;

    .line 213
    :cond_2
    if-nez v0, :cond_3

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/s;->d:Ljava/util/List;

    invoke-direct {p0, v1}, Lcom/cmcm/adsdk/nativead/s;->a(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 214
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/a;

    .line 216
    :cond_3
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/s;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 217
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/s;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    invoke-interface {v1, v0}, Lcom/cmcm/adsdk/nativead/h;->a(Lcom/cmcm/a/a/a;)V

    goto :goto_0
.end method


# virtual methods
.method protected final getAdList(I)Ljava/util/List;
    .locals 6
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
    const/4 v2, 0x0

    .line 290
    const-string v0, "FBNativeLoader"

    const-string v1, "getAd"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 291
    invoke-static {}, Lcom/cmcm/adsdk/a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 292
    const-string v0, "FBNativeLoader"

    const-string v1, "sdk has stop work"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 293
    const/4 v0, 0x0

    .line 325
    :goto_0
    return-object v0

    .line 295
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 297
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 298
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->c:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/s;->a(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v1, v2

    .line 299
    :goto_1
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 300
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->c:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/a;

    .line 301
    instance-of v5, v0, Lcom/cmcm/adsdk/nativead/d;

    if-eqz v5, :cond_1

    .line 302
    invoke-interface {v0}, Lcom/cmcm/a/a/a;->a()V

    .line 304
    :cond_1
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 299
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 308
    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v0, p1, :cond_4

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->d:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/s;->a(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_4

    move v1, v2

    .line 309
    :goto_2
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ge v1, v0, :cond_4

    .line 310
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/a/a/a;

    .line 311
    instance-of v5, v0, Lcom/cmcm/adsdk/nativead/d;

    if-eqz v5, :cond_3

    .line 312
    invoke-interface {v0}, Lcom/cmcm/a/a/a;->a()V

    .line 314
    :cond_3
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 309
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    .line 317
    :cond_4
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 319
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->d:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 321
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->c:Ljava/util/List;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/s;->b()I

    move-result v1

    if-ge v0, v1, :cond_5

    .line 322
    const-string v0, "FBNativeLoader"

    const-string v1, "Adpool is Empty ,to preload Ad"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/s;->d()V

    :cond_5
    move-object v0, v3

    .line 325
    goto/16 :goto_0
.end method

.method public final loadAd()V
    .locals 2

    .prologue
    .line 92
    invoke-static {}, Lcom/cmcm/adsdk/a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 93
    const-string v0, "FBNativeLoader"

    const-string v1, "sdk has stop work"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    :goto_0
    return-void

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->j:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 98
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->c:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/s;->a(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/s;->d:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/s;->a(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 99
    :cond_1
    const-string v0, "FBNativeLoader"

    const-string v1, "adpool has valid ad "

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/s;->e()V

    goto :goto_0

    .line 102
    :cond_2
    invoke-static {}, Lcom/cmcm/adsdk/nativead/s;->a()Z

    move-result v0

    if-nez v0, :cond_3

    .line 103
    const-string v0, "FBNativeLoader"

    const-string v1, "fb sdk non-exist "

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    const-string v0, "10003"

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/s;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 107
    :cond_3
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/s;->c()V

    goto :goto_0
.end method

.method protected final removeAdFromPool(Lcom/cmcm/a/a/a;)V
    .locals 0

    .prologue
    .line 286
    return-void
.end method
