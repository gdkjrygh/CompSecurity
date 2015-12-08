.class public final Lcom/cmcm/adsdk/nativead/y;
.super Lcom/cmcm/adsdk/nativead/w;
.source "SourceFile"


# instance fields
.field a:Lcom/picksinit/ICallBack;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/cmcm/adsdk/nativead/m;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/Object;

.field private d:I

.field private e:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method protected constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 31
    const-string v0, "cm"

    invoke-direct {p0, p1, p2, v0}, Lcom/cmcm/adsdk/nativead/w;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->b:Ljava/util/List;

    .line 25
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->c:Ljava/lang/Object;

    .line 26
    iput v1, p0, Lcom/cmcm/adsdk/nativead/y;->d:I

    .line 28
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 111
    new-instance v0, Lcom/cmcm/adsdk/nativead/z;

    invoke-direct {v0, p0}, Lcom/cmcm/adsdk/nativead/z;-><init>(Lcom/cmcm/adsdk/nativead/y;)V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->a:Lcom/picksinit/ICallBack;

    .line 32
    const-string v0, "CMCMADSDK"

    const-string v1, "CmPicksNative"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->b:Ljava/util/List;

    .line 34
    return-void
.end method

.method static synthetic a(Lcom/cmcm/adsdk/nativead/y;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method static synthetic a(Lcom/cmcm/adsdk/nativead/y;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1}, Lcom/cmcm/adsdk/nativead/y;->a(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 183
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    if-eqz v0, :cond_0

    .line 184
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    invoke-virtual {p0}, Lcom/cmcm/adsdk/nativead/y;->getAdName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/cmcm/adsdk/nativead/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    const-string v0, "PicksNativeLoader"

    const-string v1, "CMPicks onNativeFailed"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    :cond_0
    return-void
.end method

.method private a()Z
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 38
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/y;->c:Ljava/lang/Object;

    monitor-enter v2

    .line 39
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->b:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 40
    :cond_0
    monitor-exit v2

    move v0, v1

    .line 55
    :goto_0
    return v0

    .line 44
    :cond_1
    const-string v0, "PicksNativeLoader"

    const-string v3, "to remove has installed ad"

    invoke-static {v0, v3}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 47
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 48
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/nativead/m;

    .line 49
    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/m;->n()Z

    move-result v4

    if-nez v4, :cond_2

    .line 50
    const-string v4, "PicksNativeLoader"

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "adpool remove invalid ad title:"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/m;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 56
    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 54
    :cond_3
    :try_start_1
    const-string v0, "PicksNativeLoader"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "adpool size:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/cmcm/adsdk/nativead/y;->b:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4

    const/4 v0, 0x1

    :goto_2
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_4
    move v0, v1

    goto :goto_2
.end method

.method static synthetic b(Lcom/cmcm/adsdk/nativead/y;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->c:Ljava/lang/Object;

    return-object v0
.end method

.method private static b()Z
    .locals 1

    .prologue
    .line 64
    :try_start_0
    const-string v0, "com.cleanmaster.ui.app.market.Ad"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 65
    const-string v0, "com.picksinit.ICallBack"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 66
    const-string v0, "com.picksinit.PicksMob"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    const/4 v0, 0x1

    :goto_0
    return v0

    .line 68
    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic c(Lcom/cmcm/adsdk/nativead/y;)Ljava/util/List;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->b:Ljava/util/List;

    return-object v0
.end method

.method private c()V
    .locals 6

    .prologue
    const/16 v4, 0xa

    const/4 v5, 0x0

    .line 92
    invoke-static {}, Lcom/cmcm/adsdk/a;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 93
    const-string v0, "PicksNativeLoader"

    const-string v1, "sdk has stop work"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    :goto_0
    return-void

    .line 96
    :cond_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 97
    const-string v0, "PicksNativeLoader"

    const-string v1, "isLoading ,avoid repeat load"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 100
    :cond_1
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 101
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->requestParams:Lcom/cmcm/adsdk/e;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->requestParams:Lcom/cmcm/adsdk/e;

    invoke-virtual {v0}, Lcom/cmcm/adsdk/e;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 103
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    iget v1, p0, Lcom/cmcm/adsdk/nativead/y;->d:I

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/y;->mPositionId:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/y;->a:Lcom/picksinit/ICallBack;

    invoke-virtual/range {v0 .. v5}, Lcom/picksinit/b;->loadad(IILcom/picksinit/ICallBack;II)V

    .line 104
    iget v0, p0, Lcom/cmcm/adsdk/nativead/y;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/cmcm/adsdk/nativead/y;->d:I

    goto :goto_0

    .line 106
    :cond_2
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/y;->mPositionId:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/y;->a:Lcom/picksinit/ICallBack;

    invoke-virtual {v0, v1, v2, v4, v5}, Lcom/picksinit/b;->loadad(ILcom/picksinit/ICallBack;II)V

    .line 107
    iput v5, p0, Lcom/cmcm/adsdk/nativead/y;->d:I

    goto :goto_0
.end method

.method private d()V
    .locals 4

    .prologue
    .line 154
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/y;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 155
    const-string v0, "PicksNativeLoader"

    const-string v1, "candidate mAdPool empty "

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    const-string v0, "10002"

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/y;->a(Ljava/lang/String;)V

    .line 165
    :goto_0
    return-void

    .line 158
    :cond_0
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/y;->c:Ljava/lang/Object;

    monitor-enter v1

    .line 159
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/nativead/m;

    .line 160
    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/m;->n()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1170
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    if-eqz v0, :cond_2

    .line 1171
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/y;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1173
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/y;->c:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1174
    :try_start_1
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->b:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/nativead/d;

    .line 1175
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1176
    :try_start_2
    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/y;->mNativeAdListener:Lcom/cmcm/adsdk/nativead/h;

    invoke-interface {v2, v0}, Lcom/cmcm/adsdk/nativead/h;->a(Lcom/cmcm/a/a/a;)V

    .line 165
    :cond_2
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    .line 1175
    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0
.end method

.method static synthetic d(Lcom/cmcm/adsdk/nativead/y;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/y;->d()V

    return-void
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
    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 229
    const-string v1, "PicksNativeLoader"

    const-string v3, "getAdList"

    invoke-static {v1, v3}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    invoke-static {}, Lcom/cmcm/adsdk/a;->d()Z

    move-result v1

    if-nez v1, :cond_1

    .line 231
    const-string v1, "PicksNativeLoader"

    const-string v2, "sdk has stop work"

    invoke-static {v1, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    :cond_0
    :goto_0
    return-object v0

    .line 234
    :cond_1
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/y;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 237
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 238
    iget-object v3, p0, Lcom/cmcm/adsdk/nativead/y;->c:Ljava/lang/Object;

    monitor-enter v3

    .line 239
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    .line 240
    :goto_1
    invoke-static {p1, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ge v2, v0, :cond_2

    .line 241
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->b:Ljava/util/List;

    const/4 v5, 0x0

    invoke-interface {v0, v5}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cmcm/adsdk/nativead/d;

    .line 242
    invoke-virtual {v0}, Lcom/cmcm/adsdk/nativead/d;->a()V

    .line 243
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_1

    .line 246
    :cond_2
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 247
    const-string v0, "PicksNativeLoader"

    const-string v2, "adpool is empty,preload Ad"

    invoke-static {v0, v2}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 248
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/y;->c()V

    .line 250
    :cond_3
    monitor-exit v3

    move-object v0, v1

    .line 251
    goto :goto_0

    .line 250
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final loadAd()V
    .locals 2

    .prologue
    .line 75
    const-string v0, "PicksNativeLoader"

    const-string v1, "loadAd"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/y;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    const-string v0, "PicksNativeLoader"

    const-string v1, "adpool has valid ad"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/y;->d()V

    .line 87
    :goto_0
    return-void

    .line 80
    :cond_0
    const-string v0, "PicksNativeLoader"

    const-string v1, "PicksMob request"

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    invoke-static {}, Lcom/cmcm/adsdk/nativead/y;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 82
    invoke-direct {p0}, Lcom/cmcm/adsdk/nativead/y;->c()V

    goto :goto_0

    .line 84
    :cond_1
    const-string v0, "10003"

    invoke-direct {p0, v0}, Lcom/cmcm/adsdk/nativead/y;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected final removeAdFromPool(Lcom/cmcm/a/a/a;)V
    .locals 3

    .prologue
    .line 217
    const-string v0, "PicksNativeLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Picsk ad title:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/cmcm/a/a/a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 219
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->requestParams:Lcom/cmcm/adsdk/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->requestParams:Lcom/cmcm/adsdk/e;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->requestParams:Lcom/cmcm/adsdk/e;

    invoke-virtual {v0}, Lcom/cmcm/adsdk/e;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 220
    :cond_0
    const-string v0, "PicksNativeLoader"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "adpool remove ad title:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/cmcm/a/a/a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", adpool size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/cmcm/adsdk/nativead/y;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/cmcm/adsdk/b/c/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    iget-object v1, p0, Lcom/cmcm/adsdk/nativead/y;->c:Ljava/lang/Object;

    monitor-enter v1

    .line 222
    :try_start_0
    iget-object v0, p0, Lcom/cmcm/adsdk/nativead/y;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 223
    monitor-exit v1

    .line 225
    :cond_1
    return-void

    .line 223
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
