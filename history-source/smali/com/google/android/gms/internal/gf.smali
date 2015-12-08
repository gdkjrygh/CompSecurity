.class public abstract Lcom/google/android/gms/internal/gf;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation


# instance fields
.field private final mv:Ljava/lang/Runnable;

.field private volatile wu:Ljava/lang/Thread;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/gf$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/gf$1;-><init>(Lcom/google/android/gms/internal/gf;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/gf;->mv:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/gf;Ljava/lang/Thread;)Ljava/lang/Thread;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gf;->wu:Ljava/lang/Thread;

    return-object p1
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/gf;->onStop()V

    iget-object v0, p0, Lcom/google/android/gms/internal/gf;->wu:Ljava/lang/Thread;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/gf;->wu:Ljava/lang/Thread;

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    return-void
.end method

.method public abstract cx()V
.end method

.method public abstract onStop()V
.end method

.method public final start()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gf;->mv:Ljava/lang/Runnable;

    invoke-static {v0}, Lcom/google/android/gms/internal/gh;->a(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method
