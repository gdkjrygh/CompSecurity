.class Lcom/google/android/gms/internal/cj$a$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/cj$a;-><init>(Lcom/google/android/gms/internal/cj;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final oO:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/google/android/gms/internal/cj;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic oP:Lcom/google/android/gms/internal/cj;

.field final synthetic oQ:Lcom/google/android/gms/internal/cj$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/cj$a;Lcom/google/android/gms/internal/cj;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/cj$a$1;->oQ:Lcom/google/android/gms/internal/cj$a;

    iput-object p2, p0, Lcom/google/android/gms/internal/cj$a$1;->oP:Lcom/google/android/gms/internal/cj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/google/android/gms/internal/cj$a$1;->oP:Lcom/google/android/gms/internal/cj;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/cj$a$1;->oO:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/cj$a$1;->oO:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/cj;

    iget-object v1, p0, Lcom/google/android/gms/internal/cj$a$1;->oQ:Lcom/google/android/gms/internal/cj$a;

    invoke-static {v1}, Lcom/google/android/gms/internal/cj$a;->a(Lcom/google/android/gms/internal/cj$a;)Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cj;->bb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/cj$a$1;->oQ:Lcom/google/android/gms/internal/cj$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cj$a;->bc()V

    :cond_0
    return-void
.end method
