.class public abstract Lcom/google/android/gms/internal/ff;
.super Lcom/google/android/gms/internal/gf;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ff$b;,
        Lcom/google/android/gms/internal/ff$a;
    }
.end annotation


# instance fields
.field private final qh:Lcom/google/android/gms/internal/fh;

.field private final tI:Lcom/google/android/gms/internal/fe$a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/fh;Lcom/google/android/gms/internal/fe$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/gf;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ff;->qh:Lcom/google/android/gms/internal/fh;

    iput-object p2, p0, Lcom/google/android/gms/internal/ff;->tI:Lcom/google/android/gms/internal/fe$a;

    return-void
.end method

.method private static a(Lcom/google/android/gms/internal/fl;Lcom/google/android/gms/internal/fh;)Lcom/google/android/gms/internal/fj;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/fl;->b(Lcom/google/android/gms/internal/fh;)Lcom/google/android/gms/internal/fj;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v1

    const-string v2, "Could not fetch ad response from ad request service."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/gr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_1
    move-exception v1

    const-string v2, "Could not fetch ad response from ad request service due to an Exception."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/gr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_2
    move-exception v1

    const-string v2, "Could not fetch ad response from ad request service due to an Exception."

    invoke-static {v2, v1}, Lcom/google/android/gms/internal/gr;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_3
    move-exception v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ga;->e(Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method public abstract cJ()V
.end method

.method public abstract cK()Lcom/google/android/gms/internal/fl;
.end method

.method public final cx()V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ff;->cK()Lcom/google/android/gms/internal/fl;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/fj;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/fj;-><init>(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ff;->cJ()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ff;->tI:Lcom/google/android/gms/internal/fe$a;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/fe$a;->a(Lcom/google/android/gms/internal/fj;)V

    return-void

    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ff;->qh:Lcom/google/android/gms/internal/fh;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ff;->a(Lcom/google/android/gms/internal/fl;Lcom/google/android/gms/internal/fh;)Lcom/google/android/gms/internal/fj;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/fj;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/fj;-><init>(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ff;->cJ()V

    throw v0
.end method

.method public final onStop()V
    .locals 0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ff;->cJ()V

    return-void
.end method
