.class final Lcom/google/android/gms/internal/pk;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/pj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/pj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/pk;->a:Lcom/google/android/gms/internal/pj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/pk;->a:Lcom/google/android/gms/internal/pj;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/pj;->a(Lcom/google/android/gms/internal/pj;Ljava/lang/Thread;)Ljava/lang/Thread;

    iget-object v0, p0, Lcom/google/android/gms/internal/pk;->a:Lcom/google/android/gms/internal/pj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/pj;->zzbn()V

    return-void
.end method
