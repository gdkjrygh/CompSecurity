.class Lcom/google/android/gms/internal/cg$a$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/cg$a;-><init>(Lcom/google/android/gms/internal/cg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic oA:Lcom/google/android/gms/internal/cg$a;

.field private final oy:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/google/android/gms/internal/cg;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic oz:Lcom/google/android/gms/internal/cg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/cg$a;Lcom/google/android/gms/internal/cg;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/cg$a$1;->oA:Lcom/google/android/gms/internal/cg$a;

    iput-object p2, p0, Lcom/google/android/gms/internal/cg$a$1;->oz:Lcom/google/android/gms/internal/cg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/google/android/gms/internal/cg$a$1;->oz:Lcom/google/android/gms/internal/cg;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/cg$a$1;->oy:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/cg$a$1;->oy:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/cg;

    iget-object v1, p0, Lcom/google/android/gms/internal/cg$a$1;->oA:Lcom/google/android/gms/internal/cg$a;

    invoke-static {v1}, Lcom/google/android/gms/internal/cg$a;->a(Lcom/google/android/gms/internal/cg$a;)Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cg;->aV()V

    iget-object v0, p0, Lcom/google/android/gms/internal/cg$a$1;->oA:Lcom/google/android/gms/internal/cg$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/cg$a;->aW()V

    :cond_0
    return-void
.end method
