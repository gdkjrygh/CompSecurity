.class public Lcom/google/android/gms/ads/internal/zzi;
.super Lcom/google/android/gms/ads/internal/client/zzp$zza;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/ads/internal/client/zzo;

.field private final c:Lcom/google/android/gms/internal/ip;

.field private final d:Lcom/google/android/gms/internal/es;

.field private final e:Lcom/google/android/gms/internal/ev;

.field private final f:Lcom/google/android/gms/internal/wb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/wb",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/fb;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lcom/google/android/gms/internal/wb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/wb",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ey;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

.field private final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Ljava/lang/String;

.field private final k:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

.field private l:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/google/android/gms/ads/internal/zzn;",
            ">;"
        }
    .end annotation
.end field

.field private m:Ljava/lang/Object;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/ads/internal/client/zzo;Lcom/google/android/gms/internal/es;Lcom/google/android/gms/internal/ev;Lcom/google/android/gms/internal/wb;Lcom/google/android/gms/internal/wb;Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ip;",
            "Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;",
            "Lcom/google/android/gms/ads/internal/client/zzo;",
            "Lcom/google/android/gms/internal/es;",
            "Lcom/google/android/gms/internal/ev;",
            "Lcom/google/android/gms/internal/wb",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/fb;",
            ">;",
            "Lcom/google/android/gms/internal/wb",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ey;",
            ">;",
            "Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/zzp$zza;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzi;->m:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzi;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/ads/internal/zzi;->j:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/zzi;->c:Lcom/google/android/gms/internal/ip;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/zzi;->k:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/zzi;->b:Lcom/google/android/gms/ads/internal/client/zzo;

    iput-object p7, p0, Lcom/google/android/gms/ads/internal/zzi;->e:Lcom/google/android/gms/internal/ev;

    iput-object p6, p0, Lcom/google/android/gms/ads/internal/zzi;->d:Lcom/google/android/gms/internal/es;

    iput-object p8, p0, Lcom/google/android/gms/ads/internal/zzi;->f:Lcom/google/android/gms/internal/wb;

    iput-object p9, p0, Lcom/google/android/gms/ads/internal/zzi;->g:Lcom/google/android/gms/internal/wb;

    iput-object p10, p0, Lcom/google/android/gms/ads/internal/zzi;->h:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/zzi;->b()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzi;->i:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/ads/internal/zzi;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzi;->m:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/ads/internal/zzi;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzi;->l:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic b(Lcom/google/android/gms/ads/internal/zzi;)Lcom/google/android/gms/internal/es;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzi;->d:Lcom/google/android/gms/internal/es;

    return-object v0
.end method

.method private b()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzi;->e:Lcom/google/android/gms/internal/ev;

    if-eqz v1, :cond_0

    const-string v1, "1"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzi;->d:Lcom/google/android/gms/internal/es;

    if-eqz v1, :cond_1

    const-string v1, "2"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzi;->f:Lcom/google/android/gms/internal/wb;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/wb;->size()I

    move-result v1

    if-lez v1, :cond_2

    const-string v1, "3"

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/ads/internal/zzi;)Lcom/google/android/gms/internal/ev;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzi;->e:Lcom/google/android/gms/internal/ev;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/ads/internal/zzi;)Lcom/google/android/gms/internal/wb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzi;->f:Lcom/google/android/gms/internal/wb;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/ads/internal/zzi;)Lcom/google/android/gms/ads/internal/client/zzo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzi;->b:Lcom/google/android/gms/ads/internal/client/zzo;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/ads/internal/zzi;)Lcom/google/android/gms/internal/wb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzi;->g:Lcom/google/android/gms/internal/wb;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/ads/internal/zzi;)Ljava/util/List;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/zzi;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method static synthetic h(Lcom/google/android/gms/ads/internal/zzi;)Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzi;->h:Lcom/google/android/gms/ads/internal/formats/NativeAdOptionsParcel;

    return-object v0
.end method


# virtual methods
.method protected final a()Lcom/google/android/gms/ads/internal/zzn;
    .locals 6

    new-instance v0, Lcom/google/android/gms/ads/internal/zzn;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzi;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzi;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/google/android/gms/ads/internal/client/AdSizeParcel;->zzs(Landroid/content/Context;)Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzi;->j:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/zzi;->c:Lcom/google/android/gms/internal/ip;

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/zzi;->k:Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/zzn;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/AdSizeParcel;Ljava/lang/String;Lcom/google/android/gms/internal/ip;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;)V

    return-object v0
.end method

.method public getMediationAdapterClassName()Ljava/lang/String;
    .locals 3

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzi;->m:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzi;->l:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzi;->l:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/internal/zzn;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzn;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object v0

    :goto_0
    monitor-exit v2

    :goto_1
    return-object v0

    :cond_0
    move-object v0, v1

    goto :goto_0

    :cond_1
    monitor-exit v2

    move-object v0, v1

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public isLoading()Z
    .locals 3

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzi;->m:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzi;->l:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzi;->l:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/internal/zzn;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/zzn;->isLoading()Z

    move-result v0

    :goto_0
    monitor-exit v2

    :goto_1
    return v0

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    monitor-exit v2

    move v0, v1

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public zzf(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V
    .locals 2

    .prologue
    .line 0
    new-instance v0, Lcom/google/android/gms/ads/internal/h;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/ads/internal/h;-><init>(Lcom/google/android/gms/ads/internal/zzi;Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V

    .line 1000
    sget-object v1, Lcom/google/android/gms/internal/qa;->a:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 0
    return-void
.end method
