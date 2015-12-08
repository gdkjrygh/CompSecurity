.class final Lcom/google/android/gms/internal/dw;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/dv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/dv;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/dw;->a:Lcom/google/android/gms/internal/dv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/dw;->a:Lcom/google/android/gms/internal/dv;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/dv;->a(Lcom/google/android/gms/internal/dv;Ljava/lang/Thread;)Ljava/lang/Thread;

    iget-object v0, p0, Lcom/google/android/gms/internal/dw;->a:Lcom/google/android/gms/internal/dv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dv;->a()V

    return-void
.end method
