.class Lcom/google/android/gms/internal/s$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/s;-><init>(Lcom/google/android/gms/internal/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final eo:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/google/android/gms/internal/r;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic ep:Lcom/google/android/gms/internal/r;

.field final synthetic eq:Lcom/google/android/gms/internal/s;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/s;Lcom/google/android/gms/internal/r;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/s$1;->eq:Lcom/google/android/gms/internal/s;

    iput-object p2, p0, Lcom/google/android/gms/internal/s$1;->ep:Lcom/google/android/gms/internal/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/google/android/gms/internal/s$1;->ep:Lcom/google/android/gms/internal/r;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/s$1;->eo:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/s$1;->eq:Lcom/google/android/gms/internal/s;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/s;->a(Lcom/google/android/gms/internal/s;Z)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/s$1;->eo:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/r;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/s$1;->eq:Lcom/google/android/gms/internal/s;

    invoke-static {v1}, Lcom/google/android/gms/internal/s;->a(Lcom/google/android/gms/internal/s;)Lcom/google/android/gms/internal/v;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/r;->b(Lcom/google/android/gms/internal/v;)V

    :cond_0
    return-void
.end method
