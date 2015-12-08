.class final Lcom/google/android/gms/internal/ht;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/rq;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/rq",
        "<",
        "Lcom/google/android/gms/internal/bg;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ho;

.field final synthetic b:Lcom/google/android/gms/internal/hs;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/hs;Lcom/google/android/gms/internal/ho;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ht;->b:Lcom/google/android/gms/internal/hs;

    iput-object p2, p0, Lcom/google/android/gms/internal/ht;->a:Lcom/google/android/gms/internal/ho;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 0
    check-cast p1, Lcom/google/android/gms/internal/bg;

    .line 1000
    const-string v0, "Getting a new session for JS Engine."

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->v(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ht;->a:Lcom/google/android/gms/internal/ho;

    invoke-interface {p1}, Lcom/google/android/gms/internal/bg;->b()Lcom/google/android/gms/internal/bt;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ho;->a(Ljava/lang/Object;)V

    .line 0
    return-void
.end method
