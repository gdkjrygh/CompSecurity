.class final Lcom/google/android/gms/internal/hq;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/rq;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/rq",
        "<",
        "Lcom/google/android/gms/internal/bs;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ho;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ho;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hq;->a:Lcom/google/android/gms/internal/ho;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 0
    .line 1000
    const-string v0, "Releasing engine reference."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->v(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hq;->a:Lcom/google/android/gms/internal/ho;

    invoke-static {v0}, Lcom/google/android/gms/internal/ho;->a(Lcom/google/android/gms/internal/ho;)Lcom/google/android/gms/internal/hs;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hs;->b()V

    .line 0
    return-void
.end method
