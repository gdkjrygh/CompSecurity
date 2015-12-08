.class final Lcom/google/android/gms/signin/internal/o;
.super Lcom/google/android/gms/signin/internal/e;


# instance fields
.field private final a:Lcom/google/android/gms/internal/xj;

.field private final b:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/xj;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/signin/internal/e;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/signin/internal/o;->a:Lcom/google/android/gms/internal/xj;

    iput-object p2, p0, Lcom/google/android/gms/signin/internal/o;->b:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/signin/internal/o;)Lcom/google/android/gms/common/api/m;
    .locals 1

    .prologue
    .line 0
    .line 1000
    iget-object v0, p0, Lcom/google/android/gms/signin/internal/o;->a:Lcom/google/android/gms/internal/xj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/xj;->d()Lcom/google/android/gms/common/api/m;

    move-result-object v0

    .line 0
    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/signin/internal/i;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/signin/internal/o;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/google/android/gms/signin/internal/q;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/google/android/gms/signin/internal/q;-><init>(Lcom/google/android/gms/signin/internal/o;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/signin/internal/i;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/signin/internal/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;",
            "Lcom/google/android/gms/signin/internal/i;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/signin/internal/o;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/google/android/gms/signin/internal/p;

    invoke-direct {v1, p0, p2, p1, p3}, Lcom/google/android/gms/signin/internal/p;-><init>(Lcom/google/android/gms/signin/internal/o;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/signin/internal/i;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method
