.class public abstract Lcom/google/android/gms/internal/cv;
.super Lcom/google/android/gms/internal/do;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/cv$b;,
        Lcom/google/android/gms/internal/cv$a;
    }
.end annotation


# instance fields
.field private final mQ:Lcom/google/android/gms/internal/cx;

.field private final pc:Lcom/google/android/gms/internal/cu$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/cx;Lcom/google/android/gms/internal/cu$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/do;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/cv;->mQ:Lcom/google/android/gms/internal/cx;

    iput-object p2, p0, Lcom/google/android/gms/internal/cv;->pc:Lcom/google/android/gms/internal/cu$a;

    return-void
.end method

.method private static a(Lcom/google/android/gms/internal/db;Lcom/google/android/gms/internal/cx;)Lcom/google/android/gms/internal/cz;
    .locals 2

    :try_start_0
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/db;->b(Lcom/google/android/gms/internal/cx;)Lcom/google/android/gms/internal/cz;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Could not fetch ad response from ad request service."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/dw;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final aY()V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/cv;->bf()Lcom/google/android/gms/internal/db;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/cz;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/cz;-><init>(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/cv;->be()V

    iget-object v1, p0, Lcom/google/android/gms/internal/cv;->pc:Lcom/google/android/gms/internal/cu$a;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/cu$a;->a(Lcom/google/android/gms/internal/cz;)V

    return-void

    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/cv;->mQ:Lcom/google/android/gms/internal/cx;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/cv;->a(Lcom/google/android/gms/internal/db;Lcom/google/android/gms/internal/cx;)Lcom/google/android/gms/internal/cz;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/cz;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/cz;-><init>(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/cv;->be()V

    throw v0
.end method

.method public abstract be()V
.end method

.method public abstract bf()Lcom/google/android/gms/internal/db;
.end method

.method public final onStop()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/cv;->be()V

    return-void
.end method
