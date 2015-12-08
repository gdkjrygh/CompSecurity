.class final Lcom/google/android/gms/internal/ty;
.super Lcom/google/android/gms/common/internal/bd;


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/google/android/gms/internal/tu;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/tu;)V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/bd;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ty;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/internal/ResolveAccountResponse;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ty;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/tu;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    invoke-static {v0}, Lcom/google/android/gms/internal/tu;->c(Lcom/google/android/gms/internal/tu;)Lcom/google/android/gms/internal/uj;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/tz;

    invoke-direct {v2, p0, v0, v0, p1}, Lcom/google/android/gms/internal/tz;-><init>(Lcom/google/android/gms/internal/ty;Lcom/google/android/gms/internal/uu;Lcom/google/android/gms/internal/tu;Lcom/google/android/gms/common/internal/ResolveAccountResponse;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/uj;->a(Lcom/google/android/gms/internal/up;)V

    goto :goto_0
.end method
