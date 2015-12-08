.class Lcom/google/android/gms/internal/dt$a$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/dt$a;-><init>(Lcom/google/android/gms/internal/dt;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private final su:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/google/android/gms/internal/dt;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic sv:Lcom/google/android/gms/internal/dt;

.field final synthetic sw:Lcom/google/android/gms/internal/dt$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/dt$a;Lcom/google/android/gms/internal/dt;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/dt$a$1;->sw:Lcom/google/android/gms/internal/dt$a;

    iput-object p2, p0, Lcom/google/android/gms/internal/dt$a$1;->sv:Lcom/google/android/gms/internal/dt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/google/android/gms/internal/dt$a$1;->sv:Lcom/google/android/gms/internal/dt;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/dt$a$1;->su:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/dt$a$1;->su:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/dt;

    iget-object v1, p0, Lcom/google/android/gms/internal/dt$a$1;->sw:Lcom/google/android/gms/internal/dt$a;

    invoke-static {v1}, Lcom/google/android/gms/internal/dt$a;->a(Lcom/google/android/gms/internal/dt$a;)Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dt;->cr()V

    iget-object v0, p0, Lcom/google/android/gms/internal/dt$a$1;->sw:Lcom/google/android/gms/internal/dt$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dt$a;->cs()V

    :cond_0
    return-void
.end method
