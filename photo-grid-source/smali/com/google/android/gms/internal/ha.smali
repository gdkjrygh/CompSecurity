.class public final Lcom/google/android/gms/internal/ha;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Landroid/content/Context;

.field private final c:Ljava/lang/String;

.field private final d:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field private e:Lcom/google/android/gms/internal/hm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/hm",
            "<",
            "Lcom/google/android/gms/internal/bg;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lcom/google/android/gms/internal/hm;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/hm",
            "<",
            "Lcom/google/android/gms/internal/bg;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lcom/google/android/gms/internal/hs;

.field private h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ha;->a:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ha;->h:I

    iput-object p3, p0, Lcom/google/android/gms/internal/ha;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ha;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ha;->d:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    new-instance v0, Lcom/google/android/gms/internal/hn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/hn;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ha;->e:Lcom/google/android/gms/internal/hm;

    new-instance v0, Lcom/google/android/gms/internal/hn;

    invoke-direct {v0}, Lcom/google/android/gms/internal/hn;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ha;->f:Lcom/google/android/gms/internal/hm;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/String;Lcom/google/android/gms/internal/hm;Lcom/google/android/gms/internal/hm;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/hm",
            "<",
            "Lcom/google/android/gms/internal/bg;",
            ">;",
            "Lcom/google/android/gms/internal/hm",
            "<",
            "Lcom/google/android/gms/internal/bg;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/ha;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Ljava/lang/String;)V

    iput-object p4, p0, Lcom/google/android/gms/internal/ha;->e:Lcom/google/android/gms/internal/hm;

    iput-object p5, p0, Lcom/google/android/gms/internal/ha;->f:Lcom/google/android/gms/internal/hm;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ha;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ha;->h:I

    return p1
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ha;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ha;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ha;Lcom/google/android/gms/internal/hs;)Lcom/google/android/gms/internal/hs;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ha;->g:Lcom/google/android/gms/internal/hs;

    return-object p1
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ha;)Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ha;->d:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/ha;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ha;->a:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/ha;)Lcom/google/android/gms/internal/hm;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ha;->e:Lcom/google/android/gms/internal/hm;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/ha;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ha;->h:I

    return v0
.end method

.method static synthetic f(Lcom/google/android/gms/internal/ha;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ha;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/internal/ha;)Lcom/google/android/gms/internal/hs;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ha;->g:Lcom/google/android/gms/internal/hs;

    return-object v0
.end method


# virtual methods
.method protected final a()Lcom/google/android/gms/internal/hs;
    .locals 3

    .prologue
    .line 0
    .line 1000
    new-instance v0, Lcom/google/android/gms/internal/hs;

    iget-object v1, p0, Lcom/google/android/gms/internal/ha;->f:Lcom/google/android/gms/internal/hm;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/hs;-><init>(Lcom/google/android/gms/internal/hm;)V

    new-instance v1, Lcom/google/android/gms/internal/hb;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/hb;-><init>(Lcom/google/android/gms/internal/ha;Lcom/google/android/gms/internal/hs;)V

    invoke-static {v1}, Lcom/google/android/gms/internal/qa;->a(Ljava/lang/Runnable;)V

    .line 0
    new-instance v1, Lcom/google/android/gms/internal/hj;

    invoke-direct {v1, p0, v0}, Lcom/google/android/gms/internal/hj;-><init>(Lcom/google/android/gms/internal/ha;Lcom/google/android/gms/internal/hs;)V

    new-instance v2, Lcom/google/android/gms/internal/hk;

    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/internal/hk;-><init>(Lcom/google/android/gms/internal/ha;Lcom/google/android/gms/internal/hs;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/hs;->a(Lcom/google/android/gms/internal/rq;Lcom/google/android/gms/internal/ro;)V

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/ho;
    .locals 4

    const/4 v3, 0x2

    iget-object v1, p0, Lcom/google/android/gms/internal/ha;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ha;->g:Lcom/google/android/gms/internal/hs;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ha;->g:Lcom/google/android/gms/internal/hs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs;->e()I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    :cond_0
    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/ha;->h:I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ha;->a()Lcom/google/android/gms/internal/hs;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ha;->g:Lcom/google/android/gms/internal/hs;

    iget-object v0, p0, Lcom/google/android/gms/internal/ha;->g:Lcom/google/android/gms/internal/hs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs;->a()Lcom/google/android/gms/internal/ho;

    move-result-object v0

    monitor-exit v1

    :goto_0
    return-object v0

    :cond_1
    iget v0, p0, Lcom/google/android/gms/internal/ha;->h:I

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ha;->g:Lcom/google/android/gms/internal/hs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs;->a()Lcom/google/android/gms/internal/ho;

    move-result-object v0

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :try_start_1
    iget v0, p0, Lcom/google/android/gms/internal/ha;->h:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_3

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/internal/ha;->h:I

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ha;->a()Lcom/google/android/gms/internal/hs;

    iget-object v0, p0, Lcom/google/android/gms/internal/ha;->g:Lcom/google/android/gms/internal/hs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs;->a()Lcom/google/android/gms/internal/ho;

    move-result-object v0

    monitor-exit v1

    goto :goto_0

    :cond_3
    iget v0, p0, Lcom/google/android/gms/internal/ha;->h:I

    if-ne v0, v3, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/ha;->g:Lcom/google/android/gms/internal/hs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs;->a()Lcom/google/android/gms/internal/ho;

    move-result-object v0

    monitor-exit v1

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ha;->g:Lcom/google/android/gms/internal/hs;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs;->a()Lcom/google/android/gms/internal/ho;

    move-result-object v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method
