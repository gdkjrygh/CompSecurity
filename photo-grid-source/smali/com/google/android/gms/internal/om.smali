.class public final Lcom/google/android/gms/internal/om;
.super Lcom/google/android/gms/internal/pj;

# interfaces
.implements Lcom/google/android/gms/internal/op;
.implements Lcom/google/android/gms/internal/os;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/pb;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/ol;

.field private final d:Lcom/google/android/gms/internal/os;

.field private final e:Ljava/lang/Object;

.field private final f:Ljava/lang/String;

.field private final g:Ljava/lang/String;

.field private final h:Ljava/lang/String;

.field private i:I

.field private j:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/pb;Lcom/google/android/gms/internal/ol;Lcom/google/android/gms/internal/os;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/pj;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/internal/om;->i:I

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/internal/om;->j:I

    iput-object p1, p0, Lcom/google/android/gms/internal/om;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/om;->f:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/om;->h:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/om;->g:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/om;->a:Lcom/google/android/gms/internal/pb;

    iput-object p6, p0, Lcom/google/android/gms/internal/om;->c:Lcom/google/android/gms/internal/ol;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/om;->e:Ljava/lang/Object;

    iput-object p7, p0, Lcom/google/android/gms/internal/om;->d:Lcom/google/android/gms/internal/os;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/om;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/om;->g:Ljava/lang/String;

    return-object v0
.end method

.method private a(J)Z
    .locals 7

    const/4 v0, 0x0

    const-wide/16 v2, 0x4e20

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbz()Lcom/google/android/gms/internal/wg;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/internal/wg;->b()J

    move-result-wide v4

    sub-long/2addr v4, p1

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-gtz v1, :cond_0

    :goto_0
    return v0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/om;->e:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/om;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/om;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/om;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/om;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/om;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/om;->h:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/om;->a:Lcom/google/android/gms/internal/pb;

    iget-object v0, v0, Lcom/google/android/gms/internal/pb;->a:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEn:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iget-object v1, p0, Lcom/google/android/gms/internal/om;->c:Lcom/google/android/gms/internal/ol;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ol;->a()Lcom/google/android/gms/internal/is;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, Lcom/google/android/gms/internal/om;->g:Ljava/lang/String;

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/is;->a(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Fail to load ad from adapter."

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/om;->a(I)V

    goto :goto_0
.end method

.method public final a(I)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/om;->e:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x2

    :try_start_0
    iput v0, p0, Lcom/google/android/gms/internal/om;->i:I

    iput p1, p0, Lcom/google/android/gms/internal/om;->j:I

    iget-object v0, p0, Lcom/google/android/gms/internal/om;->e:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/om;->e:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x1

    :try_start_0
    iput v0, p0, Lcom/google/android/gms/internal/om;->i:I

    iget-object v0, p0, Lcom/google/android/gms/internal/om;->e:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/om;->a(I)V

    return-void
.end method

.method public final onStop()V
    .locals 0

    return-void
.end method

.method public final zzbn()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 0
    iget-object v0, p0, Lcom/google/android/gms/internal/om;->c:Lcom/google/android/gms/internal/ol;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/om;->c:Lcom/google/android/gms/internal/ol;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ol;->b()Lcom/google/android/gms/internal/or;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/om;->c:Lcom/google/android/gms/internal/ol;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ol;->a()Lcom/google/android/gms/internal/is;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/om;->c:Lcom/google/android/gms/internal/ol;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ol;->b()Lcom/google/android/gms/internal/or;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/or;->a(Lcom/google/android/gms/internal/os;)V

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/or;->a(Lcom/google/android/gms/internal/op;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/om;->a:Lcom/google/android/gms/internal/pb;

    iget-object v0, v0, Lcom/google/android/gms/internal/pb;->a:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzEn:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    iget-object v2, p0, Lcom/google/android/gms/internal/om;->c:Lcom/google/android/gms/internal/ol;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ol;->a()Lcom/google/android/gms/internal/is;

    move-result-object v2

    :try_start_0
    invoke-interface {v2}, Lcom/google/android/gms/internal/is;->g()Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, Lcom/google/android/gms/ads/internal/util/client/zza;->zzJt:Landroid/os/Handler;

    new-instance v4, Lcom/google/android/gms/internal/on;

    invoke-direct {v4, p0, v2, v0}, Lcom/google/android/gms/internal/on;-><init>(Lcom/google/android/gms/internal/om;Lcom/google/android/gms/internal/is;Lcom/google/android/gms/ads/internal/client/AdRequestParcel;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbz()Lcom/google/android/gms/internal/wg;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/wg;->b()J

    move-result-wide v2

    .line 1000
    :goto_2
    iget-object v4, p0, Lcom/google/android/gms/internal/om;->e:Ljava/lang/Object;

    monitor-enter v4

    :try_start_1
    iget v0, p0, Lcom/google/android/gms/internal/om;->i:I

    if-eqz v0, :cond_3

    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 0
    :goto_3
    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/or;->a(Lcom/google/android/gms/internal/os;)V

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/or;->a(Lcom/google/android/gms/internal/op;)V

    iget v0, p0, Lcom/google/android/gms/internal/om;->i:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/om;->d:Lcom/google/android/gms/internal/os;

    iget-object v1, p0, Lcom/google/android/gms/internal/om;->f:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/os;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    :try_start_2
    sget-object v3, Lcom/google/android/gms/ads/internal/util/client/zza;->zzJt:Landroid/os/Handler;

    new-instance v4, Lcom/google/android/gms/internal/oo;

    invoke-direct {v4, p0, v2, v0, v1}, Lcom/google/android/gms/internal/oo;-><init>(Lcom/google/android/gms/internal/om;Lcom/google/android/gms/internal/is;Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/internal/or;)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v2, "Fail to check if adapter is initialized."

    invoke-static {v2, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/om;->a(I)V

    goto :goto_1

    .line 1000
    :cond_3
    :try_start_3
    invoke-direct {p0, v2, v3}, Lcom/google/android/gms/internal/om;->a(J)Z

    move-result v0

    if-nez v0, :cond_4

    monitor-exit v4

    goto :goto_3

    :catchall_0
    move-exception v0

    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :cond_4
    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_2

    .line 0
    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/om;->d:Lcom/google/android/gms/internal/os;

    iget v1, p0, Lcom/google/android/gms/internal/om;->j:I

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/os;->a(I)V

    goto :goto_0
.end method
