.class final Lcom/google/android/gms/internal/no;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/nt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/nt;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/no;->a:Lcom/google/android/gms/internal/nt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lcom/google/android/gms/internal/no;->a:Lcom/google/android/gms/internal/nt;

    .line 1000
    iget-object v1, v0, Lcom/google/android/gms/internal/nt;->a:Lcom/google/android/gms/internal/ry;

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/google/android/gms/internal/nt;->a:Lcom/google/android/gms/internal/ry;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ry;->destroy()V

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/google/android/gms/internal/nt;->a:Lcom/google/android/gms/internal/ry;

    .line 0
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/no;->a:Lcom/google/android/gms/internal/nt;

    .line 2000
    iget-object v0, v0, Lcom/google/android/gms/internal/nt;->b:Lcom/google/android/gms/internal/ho;

    .line 0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/no;->a:Lcom/google/android/gms/internal/nt;

    .line 3000
    iget-object v0, v0, Lcom/google/android/gms/internal/nt;->b:Lcom/google/android/gms/internal/ho;

    .line 0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/ho;->a()V

    :cond_1
    return-void
.end method
