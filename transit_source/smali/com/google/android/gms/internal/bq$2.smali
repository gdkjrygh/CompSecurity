.class Lcom/google/android/gms/internal/bq$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/bq;->ac()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic gu:Lcom/google/android/gms/internal/bq;

.field final synthetic gv:Lcom/google/android/gms/internal/ce;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/bq;Lcom/google/android/gms/internal/ce;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/bq$2;->gu:Lcom/google/android/gms/internal/bq;

    iput-object p2, p0, Lcom/google/android/gms/internal/bq$2;->gv:Lcom/google/android/gms/internal/ce;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/bq$2;->gu:Lcom/google/android/gms/internal/bq;

    invoke-static {v0}, Lcom/google/android/gms/internal/bq;->a(Lcom/google/android/gms/internal/bq;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/bq$2;->gu:Lcom/google/android/gms/internal/bq;

    invoke-static {v0}, Lcom/google/android/gms/internal/bq;->b(Lcom/google/android/gms/internal/bq;)Lcom/google/android/gms/internal/bp$a;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/bq$2;->gv:Lcom/google/android/gms/internal/ce;

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/bp$a;->a(Lcom/google/android/gms/internal/ce;)V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
