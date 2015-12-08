.class public Lcom/flurry/sdk/ld;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/flurry/sdk/lh$a;


# static fields
.field private static a:Lcom/flurry/sdk/ld;

.field private static final b:Ljava/lang/String;


# instance fields
.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/content/Context;",
            "Lcom/flurry/sdk/lb;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/flurry/sdk/le;

.field private final e:Ljava/lang/Object;

.field private f:J

.field private g:J

.field private h:Lcom/flurry/sdk/lb;

.field private i:Lcom/flurry/sdk/jx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/jx",
            "<",
            "Lcom/flurry/sdk/lf;",
            ">;"
        }
    .end annotation
.end field

.field private j:Lcom/flurry/sdk/jx;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/flurry/sdk/jx",
            "<",
            "Lcom/flurry/sdk/jr;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    const-class v0, Lcom/flurry/sdk/ld;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 6

    .prologue
    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/ld;->c:Ljava/util/Map;

    .line 53
    new-instance v0, Lcom/flurry/sdk/le;

    invoke-direct {v0}, Lcom/flurry/sdk/le;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/ld;->d:Lcom/flurry/sdk/le;

    .line 54
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/flurry/sdk/ld;->e:Ljava/lang/Object;

    .line 60
    new-instance v0, Lcom/flurry/sdk/ld$1;

    invoke-direct {v0, p0}, Lcom/flurry/sdk/ld$1;-><init>(Lcom/flurry/sdk/ld;)V

    iput-object v0, p0, Lcom/flurry/sdk/ld;->i:Lcom/flurry/sdk/jx;

    .line 67
    new-instance v0, Lcom/flurry/sdk/ld$2;

    invoke-direct {v0, p0}, Lcom/flurry/sdk/ld$2;-><init>(Lcom/flurry/sdk/ld;)V

    iput-object v0, p0, Lcom/flurry/sdk/ld;->j:Lcom/flurry/sdk/jx;

    .line 97
    invoke-static {}, Lcom/flurry/sdk/lg;->a()Lcom/flurry/sdk/lg;

    move-result-object v1

    .line 99
    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/flurry/sdk/ld;->f:J

    .line 100
    const-string v0, "ContinueSessionMillis"

    invoke-virtual {v1, v0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/flurry/sdk/ld;->g:J

    .line 102
    const-string v0, "ContinueSessionMillis"

    invoke-virtual {v1, v0, p0}, Lcom/flurry/sdk/lh;->a(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)V

    .line 103
    const/4 v0, 0x4

    sget-object v1, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "initSettings, ContinueSessionMillis = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Lcom/flurry/sdk/ld;->g:J

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 106
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    const-string v1, "com.flurry.android.sdk.ActivityLifecycleEvent"

    iget-object v2, p0, Lcom/flurry/sdk/ld;->j:Lcom/flurry/sdk/jx;

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/jy;->a(Ljava/lang/String;Lcom/flurry/sdk/jx;)V

    .line 107
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    const-string v1, "com.flurry.android.sdk.FlurrySessionTimerEvent"

    iget-object v2, p0, Lcom/flurry/sdk/ld;->i:Lcom/flurry/sdk/jx;

    invoke-virtual {v0, v1, v2}, Lcom/flurry/sdk/jy;->a(Ljava/lang/String;Lcom/flurry/sdk/jx;)V

    .line 108
    return-void
.end method

.method public static declared-synchronized a()Lcom/flurry/sdk/ld;
    .locals 2

    .prologue
    .line 29
    const-class v1, Lcom/flurry/sdk/ld;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/flurry/sdk/ld;->a:Lcom/flurry/sdk/ld;

    if-nez v0, :cond_0

    .line 30
    new-instance v0, Lcom/flurry/sdk/ld;

    invoke-direct {v0}, Lcom/flurry/sdk/ld;-><init>()V

    sput-object v0, Lcom/flurry/sdk/ld;->a:Lcom/flurry/sdk/ld;

    .line 33
    :cond_0
    sget-object v0, Lcom/flurry/sdk/ld;->a:Lcom/flurry/sdk/ld;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 29
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private a(Lcom/flurry/sdk/lb;)V
    .locals 2

    .prologue
    .line 129
    iget-object v1, p0, Lcom/flurry/sdk/ld;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 130
    :try_start_0
    iput-object p1, p0, Lcom/flurry/sdk/ld;->h:Lcom/flurry/sdk/lb;

    .line 131
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic a(Lcom/flurry/sdk/ld;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/flurry/sdk/ld;->i()V

    return-void
.end method

.method static synthetic a(Lcom/flurry/sdk/ld;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/flurry/sdk/ld;->e(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic a(Lcom/flurry/sdk/ld;Lcom/flurry/sdk/lb;)V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0, p1}, Lcom/flurry/sdk/ld;->b(Lcom/flurry/sdk/lb;)V

    return-void
.end method

.method public static declared-synchronized b()V
    .locals 4

    .prologue
    .line 38
    const-class v1, Lcom/flurry/sdk/ld;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/flurry/sdk/ld;->a:Lcom/flurry/sdk/ld;

    if-eqz v0, :cond_0

    .line 39
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    sget-object v2, Lcom/flurry/sdk/ld;->a:Lcom/flurry/sdk/ld;

    iget-object v2, v2, Lcom/flurry/sdk/ld;->i:Lcom/flurry/sdk/jx;

    invoke-virtual {v0, v2}, Lcom/flurry/sdk/jy;->a(Lcom/flurry/sdk/jx;)V

    .line 40
    invoke-static {}, Lcom/flurry/sdk/jy;->a()Lcom/flurry/sdk/jy;

    move-result-object v0

    sget-object v2, Lcom/flurry/sdk/ld;->a:Lcom/flurry/sdk/ld;

    iget-object v2, v2, Lcom/flurry/sdk/ld;->j:Lcom/flurry/sdk/jx;

    invoke-virtual {v0, v2}, Lcom/flurry/sdk/jy;->a(Lcom/flurry/sdk/jx;)V

    .line 42
    invoke-static {}, Lcom/flurry/sdk/lg;->a()Lcom/flurry/sdk/lg;

    move-result-object v0

    .line 44
    const-string v2, "ContinueSessionMillis"

    sget-object v3, Lcom/flurry/sdk/ld;->a:Lcom/flurry/sdk/ld;

    invoke-virtual {v0, v2, v3}, Lcom/flurry/sdk/lh;->b(Ljava/lang/String;Lcom/flurry/sdk/lh$a;)Z

    .line 47
    :cond_0
    const/4 v0, 0x0

    sput-object v0, Lcom/flurry/sdk/ld;->a:Lcom/flurry/sdk/ld;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    monitor-exit v1

    return-void

    .line 38
    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method

.method private b(Lcom/flurry/sdk/lb;)V
    .locals 2

    .prologue
    .line 135
    iget-object v1, p0, Lcom/flurry/sdk/ld;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 136
    :try_start_0
    iget-object v0, p0, Lcom/flurry/sdk/ld;->h:Lcom/flurry/sdk/lb;

    if-ne v0, p1, :cond_0

    .line 137
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/flurry/sdk/ld;->h:Lcom/flurry/sdk/lb;

    .line 139
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

.method private declared-synchronized e(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 212
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/flurry/sdk/ld;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/lb;

    .line 213
    if-eqz v0, :cond_1

    .line 214
    invoke-static {}, Lcom/flurry/sdk/js;->a()Lcom/flurry/sdk/js;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/js;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 215
    const/4 v0, 0x3

    sget-object v1, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Session already started with context:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 253
    :goto_0
    monitor-exit p0

    return-void

    .line 217
    :cond_0
    :try_start_1
    sget-object v0, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Session already started with context:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 212
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 223
    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/flurry/sdk/ld;->d:Lcom/flurry/sdk/le;

    invoke-virtual {v0}, Lcom/flurry/sdk/le;->a()V

    .line 226
    invoke-virtual {p0}, Lcom/flurry/sdk/ld;->e()Lcom/flurry/sdk/lb;

    move-result-object v0

    .line 228
    if-nez v0, :cond_2

    .line 229
    new-instance v0, Lcom/flurry/sdk/lb;

    invoke-direct {v0}, Lcom/flurry/sdk/lb;-><init>()V

    .line 231
    sget-object v1, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Flurry session started for context:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    new-instance v1, Lcom/flurry/sdk/lc;

    invoke-direct {v1}, Lcom/flurry/sdk/lc;-><init>()V

    .line 234
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lcom/flurry/sdk/lc;->a:Ljava/lang/ref/WeakReference;

    .line 235
    iput-object v0, v1, Lcom/flurry/sdk/lc;->b:Lcom/flurry/sdk/lb;

    .line 236
    sget-object v2, Lcom/flurry/sdk/lc$a;->a:Lcom/flurry/sdk/lc$a;

    iput-object v2, v1, Lcom/flurry/sdk/lc;->c:Lcom/flurry/sdk/lc$a;

    .line 237
    invoke-virtual {v1}, Lcom/flurry/sdk/lc;->b()V

    .line 240
    :cond_2
    iget-object v1, p0, Lcom/flurry/sdk/ld;->c:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    invoke-direct {p0, v0}, Lcom/flurry/sdk/ld;->a(Lcom/flurry/sdk/lb;)V

    .line 243
    sget-object v1, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Flurry session resumed for context:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    new-instance v1, Lcom/flurry/sdk/lc;

    invoke-direct {v1}, Lcom/flurry/sdk/lc;-><init>()V

    .line 246
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lcom/flurry/sdk/lc;->a:Ljava/lang/ref/WeakReference;

    .line 247
    iput-object v0, v1, Lcom/flurry/sdk/lc;->b:Lcom/flurry/sdk/lb;

    .line 248
    sget-object v0, Lcom/flurry/sdk/lc$a;->c:Lcom/flurry/sdk/lc$a;

    iput-object v0, v1, Lcom/flurry/sdk/lc;->c:Lcom/flurry/sdk/lc$a;

    .line 249
    invoke-virtual {v1}, Lcom/flurry/sdk/lc;->b()V

    .line 252
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/flurry/sdk/ld;->f:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0
.end method

.method static synthetic h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    return-object v0
.end method

.method private declared-synchronized i()V
    .locals 5

    .prologue
    .line 289
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/flurry/sdk/ld;->d()I

    move-result v0

    .line 290
    if-lez v0, :cond_0

    .line 291
    const/4 v1, 0x5

    sget-object v2, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Session cannot be finalized, sessionContextCount:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 318
    :goto_0
    monitor-exit p0

    return-void

    .line 295
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/flurry/sdk/ld;->e()Lcom/flurry/sdk/lb;

    move-result-object v0

    .line 297
    if-nez v0, :cond_1

    .line 298
    const/4 v0, 0x5

    sget-object v1, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    const-string v2, "Session cannot be finalized, current session not found"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 289
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 302
    :cond_1
    :try_start_2
    sget-object v1, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    const-string v2, "Flurry session ended"

    invoke-static {v1, v2}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 304
    new-instance v1, Lcom/flurry/sdk/lc;

    invoke-direct {v1}, Lcom/flurry/sdk/lc;-><init>()V

    .line 305
    iput-object v0, v1, Lcom/flurry/sdk/lc;->b:Lcom/flurry/sdk/lb;

    .line 306
    sget-object v2, Lcom/flurry/sdk/lc$a;->e:Lcom/flurry/sdk/lc$a;

    iput-object v2, v1, Lcom/flurry/sdk/lc;->c:Lcom/flurry/sdk/lc$a;

    .line 307
    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v2

    invoke-virtual {v2}, Lcom/flurry/sdk/jb;->d()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/flurry/sdk/lc;->d:J

    .line 308
    invoke-virtual {v1}, Lcom/flurry/sdk/lc;->b()V

    .line 312
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v1

    new-instance v2, Lcom/flurry/sdk/ld$4;

    invoke-direct {v2, p0, v0}, Lcom/flurry/sdk/ld$4;-><init>(Lcom/flurry/sdk/ld;Lcom/flurry/sdk/lb;)V

    invoke-virtual {v1, v2}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method


# virtual methods
.method public declared-synchronized a(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 144
    monitor-enter p0

    :try_start_0
    instance-of v0, p1, Landroid/app/Activity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    .line 156
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 149
    :cond_1
    :try_start_1
    invoke-static {}, Lcom/flurry/sdk/js;->a()Lcom/flurry/sdk/js;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/js;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    const/4 v0, 0x3

    sget-object v1, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "bootstrap for context:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 155
    invoke-direct {p0, p1}, Lcom/flurry/sdk/ld;->e(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 144
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 6

    .prologue
    .line 322
    const-string v0, "ContinueSessionMillis"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 323
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/flurry/sdk/ld;->g:J

    .line 324
    const/4 v0, 0x4

    sget-object v1, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onSettingUpdate, ContinueSessionMillis = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Lcom/flurry/sdk/ld;->g:J

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 328
    :goto_0
    return-void

    .line 326
    :cond_0
    const/4 v0, 0x6

    sget-object v1, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    const-string v2, "onSettingUpdate internal error!"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public declared-synchronized b(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 160
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/flurry/sdk/js;->a()Lcom/flurry/sdk/js;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/js;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of v0, p1, Landroid/app/Activity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 166
    :goto_0
    monitor-exit p0

    return-void

    .line 164
    :cond_0
    const/4 v0, 0x3

    :try_start_1
    sget-object v1, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Manual onStartSession for context:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 165
    invoke-direct {p0, p1}, Lcom/flurry/sdk/ld;->e(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 160
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public c()J
    .locals 2

    .prologue
    .line 111
    iget-wide v0, p0, Lcom/flurry/sdk/ld;->f:J

    return-wide v0
.end method

.method public declared-synchronized c(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 170
    monitor-enter p0

    :try_start_0
    invoke-static {}, Lcom/flurry/sdk/js;->a()Lcom/flurry/sdk/js;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/js;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of v0, p1, Landroid/app/Activity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 176
    :goto_0
    monitor-exit p0

    return-void

    .line 174
    :cond_0
    const/4 v0, 0x3

    :try_start_1
    sget-object v1, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Manual onEndSession for context:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 175
    invoke-virtual {p0, p1}, Lcom/flurry/sdk/ld;->d(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 170
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d()I
    .locals 1

    .prologue
    .line 119
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/flurry/sdk/ld;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method declared-synchronized d(Landroid/content/Context;)V
    .locals 4

    .prologue
    .line 257
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/flurry/sdk/ld;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/lb;

    .line 259
    if-nez v0, :cond_1

    .line 260
    invoke-static {}, Lcom/flurry/sdk/js;->a()Lcom/flurry/sdk/js;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/js;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 261
    const/4 v0, 0x3

    sget-object v1, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Session cannot be ended, session not found for context:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 286
    :goto_0
    monitor-exit p0

    return-void

    .line 263
    :cond_0
    :try_start_1
    sget-object v0, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Session cannot be ended, session not found for context:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 257
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 269
    :cond_1
    :try_start_2
    sget-object v1, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Flurry session paused for context:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/flurry/sdk/kc;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    new-instance v1, Lcom/flurry/sdk/lc;

    invoke-direct {v1}, Lcom/flurry/sdk/lc;-><init>()V

    .line 272
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v2, v1, Lcom/flurry/sdk/lc;->a:Ljava/lang/ref/WeakReference;

    .line 273
    iput-object v0, v1, Lcom/flurry/sdk/lc;->b:Lcom/flurry/sdk/lb;

    .line 274
    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jb;->d()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/flurry/sdk/lc;->d:J

    .line 275
    sget-object v0, Lcom/flurry/sdk/lc$a;->d:Lcom/flurry/sdk/lc$a;

    iput-object v0, v1, Lcom/flurry/sdk/lc;->c:Lcom/flurry/sdk/lc$a;

    .line 276
    invoke-virtual {v1}, Lcom/flurry/sdk/lc;->b()V

    .line 280
    invoke-virtual {p0}, Lcom/flurry/sdk/ld;->d()I

    move-result v0

    if-nez v0, :cond_2

    .line 281
    iget-object v0, p0, Lcom/flurry/sdk/ld;->d:Lcom/flurry/sdk/le;

    iget-wide v2, p0, Lcom/flurry/sdk/ld;->g:J

    invoke-virtual {v0, v2, v3}, Lcom/flurry/sdk/le;->a(J)V

    .line 282
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/flurry/sdk/ld;->f:J

    goto :goto_0

    .line 284
    :cond_2
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/flurry/sdk/ld;->f:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public e()Lcom/flurry/sdk/lb;
    .locals 2

    .prologue
    .line 123
    iget-object v1, p0, Lcom/flurry/sdk/ld;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 124
    :try_start_0
    iget-object v0, p0, Lcom/flurry/sdk/ld;->h:Lcom/flurry/sdk/lb;

    monitor-exit v1

    return-object v0

    .line 125
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public declared-synchronized f()Z
    .locals 3

    .prologue
    .line 180
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/flurry/sdk/ld;->e()Lcom/flurry/sdk/lb;

    move-result-object v0

    .line 181
    if-nez v0, :cond_0

    .line 182
    const/4 v0, 0x2

    sget-object v1, Lcom/flurry/sdk/ld;->b:Ljava/lang/String;

    const-string v2, "Session not found. No active session"

    invoke-static {v0, v1, v2}, Lcom/flurry/sdk/kc;->a(ILjava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    const/4 v0, 0x0

    .line 185
    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    .line 180
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized g()V
    .locals 6

    .prologue
    .line 190
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/flurry/sdk/ld;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    .line 191
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 192
    new-instance v2, Lcom/flurry/sdk/lc;

    invoke-direct {v2}, Lcom/flurry/sdk/lc;-><init>()V

    .line 193
    new-instance v3, Ljava/lang/ref/WeakReference;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v3, v2, Lcom/flurry/sdk/lc;->a:Ljava/lang/ref/WeakReference;

    .line 194
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/flurry/sdk/lb;

    iput-object v0, v2, Lcom/flurry/sdk/lc;->b:Lcom/flurry/sdk/lb;

    .line 195
    sget-object v0, Lcom/flurry/sdk/lc$a;->d:Lcom/flurry/sdk/lc$a;

    iput-object v0, v2, Lcom/flurry/sdk/lc;->c:Lcom/flurry/sdk/lc$a;

    .line 196
    invoke-static {}, Lcom/flurry/sdk/jb;->a()Lcom/flurry/sdk/jb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/flurry/sdk/jb;->d()J

    move-result-wide v4

    iput-wide v4, v2, Lcom/flurry/sdk/lc;->d:J

    .line 197
    invoke-virtual {v2}, Lcom/flurry/sdk/lc;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 190
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 199
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/flurry/sdk/ld;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 202
    invoke-static {}, Lcom/flurry/sdk/jo;->a()Lcom/flurry/sdk/jo;

    move-result-object v0

    new-instance v1, Lcom/flurry/sdk/ld$3;

    invoke-direct {v1, p0}, Lcom/flurry/sdk/ld$3;-><init>(Lcom/flurry/sdk/ld;)V

    invoke-virtual {v0, v1}, Lcom/flurry/sdk/jo;->b(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 208
    monitor-exit p0

    return-void
.end method
