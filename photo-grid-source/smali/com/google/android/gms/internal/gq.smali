.class public final Lcom/google/android/gms/internal/gq;
.super Lcom/google/android/gms/internal/pj;


# annotations
.annotation runtime Lcom/google/android/gms/internal/nh;
.end annotation


# instance fields
.field final a:Lcom/google/android/gms/internal/ry;

.field final b:Lcom/google/android/gms/internal/gt;

.field private final c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ry;Lcom/google/android/gms/internal/gt;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/pj;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/gq;->a:Lcom/google/android/gms/internal/ry;

    iput-object p2, p0, Lcom/google/android/gms/internal/gq;->b:Lcom/google/android/gms/internal/gt;

    iput-object p3, p0, Lcom/google/android/gms/internal/gq;->c:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzp;->zzbI()Lcom/google/android/gms/internal/gs;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/gs;->a(Lcom/google/android/gms/internal/gq;)V

    return-void
.end method


# virtual methods
.method public final onStop()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gq;->b:Lcom/google/android/gms/internal/gt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gt;->a()V

    return-void
.end method

.method public final zzbn()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/gq;->b:Lcom/google/android/gms/internal/gt;

    iget-object v1, p0, Lcom/google/android/gms/internal/gq;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/gt;->a(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v0, Lcom/google/android/gms/internal/qa;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/gr;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/gr;-><init>(Lcom/google/android/gms/internal/gq;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/internal/qa;->a:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/internal/gr;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/gr;-><init>(Lcom/google/android/gms/internal/gq;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    throw v0
.end method
