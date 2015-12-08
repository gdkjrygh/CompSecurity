.class final Lcom/google/android/gms/internal/hw;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/bg;

.field final synthetic b:Lcom/google/android/gms/internal/hv;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/hv;Lcom/google/android/gms/internal/bg;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hw;->b:Lcom/google/android/gms/internal/hv;

    iput-object p2, p0, Lcom/google/android/gms/internal/hw;->a:Lcom/google/android/gms/internal/bg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/hw;->b:Lcom/google/android/gms/internal/hv;

    iget-object v0, v0, Lcom/google/android/gms/internal/hv;->a:Lcom/google/android/gms/internal/hs;

    invoke-static {v0}, Lcom/google/android/gms/internal/hs;->a(Lcom/google/android/gms/internal/hs;)Lcom/google/android/gms/internal/hm;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/hw;->a:Lcom/google/android/gms/internal/bg;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/hm;->zzc(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hw;->a:Lcom/google/android/gms/internal/bg;

    invoke-interface {v0}, Lcom/google/android/gms/internal/bg;->a()V

    return-void
.end method
