.class public abstract Lcom/google/android/gms/internal/bs;
.super Lcom/google/android/gms/internal/cg;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/bs$b;,
        Lcom/google/android/gms/internal/bs$a;
    }
.end annotation


# instance fields
.field private final eI:Lcom/google/android/gms/internal/bu;

.field private final gx:Lcom/google/android/gms/internal/br$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/bu;Lcom/google/android/gms/internal/br$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/cg;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/bs;->eI:Lcom/google/android/gms/internal/bu;

    iput-object p2, p0, Lcom/google/android/gms/internal/bs;->gx:Lcom/google/android/gms/internal/br$a;

    return-void
.end method

.method private static a(Lcom/google/android/gms/internal/by;Lcom/google/android/gms/internal/bu;)Lcom/google/android/gms/internal/bw;
    .locals 2

    :try_start_0
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/by;->a(Lcom/google/android/gms/internal/bu;)Lcom/google/android/gms/internal/bw;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Could not fetch ad response from ad request service."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cn;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final ac()V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/bs;->af()Lcom/google/android/gms/internal/by;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/bw;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/bw;-><init>(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/bs;->ae()V

    iget-object v1, p0, Lcom/google/android/gms/internal/bs;->gx:Lcom/google/android/gms/internal/br$a;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/br$a;->a(Lcom/google/android/gms/internal/bw;)V

    return-void

    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/bs;->eI:Lcom/google/android/gms/internal/bu;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/bs;->a(Lcom/google/android/gms/internal/by;Lcom/google/android/gms/internal/bu;)Lcom/google/android/gms/internal/bw;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/bw;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/bw;-><init>(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/bs;->ae()V

    throw v0
.end method

.method public abstract ae()V
.end method

.method public abstract af()Lcom/google/android/gms/internal/by;
.end method

.method public final onStop()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/bs;->ae()V

    return-void
.end method
