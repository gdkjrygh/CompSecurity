.class final Lcom/google/android/gms/internal/xf;
.super Lcom/google/android/gms/common/api/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/api/b",
        "<",
        "Lcom/google/android/gms/signin/internal/n;",
        "Lcom/google/android/gms/internal/xj;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/common/api/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/w;Ljava/lang/Object;Lcom/google/android/gms/common/api/k;Lcom/google/android/gms/common/api/l;)Lcom/google/android/gms/common/api/c;
    .locals 9

    .prologue
    .line 0
    check-cast p4, Lcom/google/android/gms/internal/xj;

    .line 1000
    if-nez p4, :cond_0

    sget-object v5, Lcom/google/android/gms/internal/xj;->a:Lcom/google/android/gms/internal/xj;

    :goto_0
    new-instance v0, Lcom/google/android/gms/signin/internal/n;

    const/4 v3, 0x1

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v8

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/signin/internal/n;-><init>(Landroid/content/Context;Landroid/os/Looper;ZLcom/google/android/gms/common/internal/w;Lcom/google/android/gms/internal/xj;Lcom/google/android/gms/common/api/k;Lcom/google/android/gms/common/api/l;Ljava/util/concurrent/ExecutorService;)V

    .line 0
    return-object v0

    :cond_0
    move-object v5, p4

    goto :goto_0
.end method
