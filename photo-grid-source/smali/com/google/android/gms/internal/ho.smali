.class public final Lcom/google/android/gms/internal/ho;
.super Lcom/google/android/gms/internal/rr;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/rr",
        "<",
        "Lcom/google/android/gms/internal/bs;",
        ">;"
    }
.end annotation


# instance fields
.field private final d:Ljava/lang/Object;

.field private final e:Lcom/google/android/gms/internal/hs;

.field private f:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/hs;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/rr;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ho;->d:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/ho;->e:Lcom/google/android/gms/internal/hs;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ho;)Lcom/google/android/gms/internal/hs;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ho;->e:Lcom/google/android/gms/internal/hs;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/ho;->d:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ho;->f:Z

    if-eqz v0, :cond_0

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ho;->f:Z

    new-instance v0, Lcom/google/android/gms/internal/hp;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/hp;-><init>(Lcom/google/android/gms/internal/ho;)V

    new-instance v2, Lcom/google/android/gms/internal/rp;

    invoke-direct {v2}, Lcom/google/android/gms/internal/rp;-><init>()V

    invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/internal/ho;->a(Lcom/google/android/gms/internal/rq;Lcom/google/android/gms/internal/ro;)V

    new-instance v0, Lcom/google/android/gms/internal/hq;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/hq;-><init>(Lcom/google/android/gms/internal/ho;)V

    new-instance v2, Lcom/google/android/gms/internal/hr;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/hr;-><init>(Lcom/google/android/gms/internal/ho;)V

    invoke-virtual {p0, v0, v2}, Lcom/google/android/gms/internal/ho;->a(Lcom/google/android/gms/internal/rq;Lcom/google/android/gms/internal/ro;)V

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
