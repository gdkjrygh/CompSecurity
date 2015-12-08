.class final Lcom/google/android/gms/internal/nl;
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
.field final synthetic a:Lcom/google/android/gms/internal/dk;

.field final synthetic b:Lcom/google/android/gms/internal/nk;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/nk;Lcom/google/android/gms/internal/dk;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/nl;->b:Lcom/google/android/gms/internal/nk;

    iput-object p2, p0, Lcom/google/android/gms/internal/nl;->a:Lcom/google/android/gms/internal/dk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 5

    .prologue
    .line 0
    check-cast p1, Lcom/google/android/gms/internal/bs;

    .line 1000
    iget-object v0, p0, Lcom/google/android/gms/internal/nl;->b:Lcom/google/android/gms/internal/nk;

    iget-object v0, v0, Lcom/google/android/gms/internal/nk;->c:Lcom/google/android/gms/internal/dm;

    iget-object v1, p0, Lcom/google/android/gms/internal/nl;->a:Lcom/google/android/gms/internal/dk;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "jsf"

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/dm;->a(Lcom/google/android/gms/internal/dk;[Ljava/lang/String;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/nl;->b:Lcom/google/android/gms/internal/nk;

    iget-object v0, v0, Lcom/google/android/gms/internal/nk;->c:Lcom/google/android/gms/internal/dm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dm;->b()V

    const-string v0, "/invalidRequest"

    iget-object v1, p0, Lcom/google/android/gms/internal/nl;->b:Lcom/google/android/gms/internal/nk;

    iget-object v1, v1, Lcom/google/android/gms/internal/nk;->b:Lcom/google/android/gms/internal/nt;

    iget-object v1, v1, Lcom/google/android/gms/internal/nt;->c:Lcom/google/android/gms/internal/fz;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/bs;->a(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    const-string v0, "/loadAdURL"

    iget-object v1, p0, Lcom/google/android/gms/internal/nl;->b:Lcom/google/android/gms/internal/nk;

    iget-object v1, v1, Lcom/google/android/gms/internal/nk;->b:Lcom/google/android/gms/internal/nt;

    iget-object v1, v1, Lcom/google/android/gms/internal/nt;->d:Lcom/google/android/gms/internal/fz;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/bs;->a(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    :try_start_0
    const-string v0, "AFMA_buildAdURL"

    iget-object v1, p0, Lcom/google/android/gms/internal/nl;->b:Lcom/google/android/gms/internal/nk;

    iget-object v1, v1, Lcom/google/android/gms/internal/nk;->e:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/bs;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Error requesting an ad url"

    invoke-static {v1, v0}, Lcom/google/android/gms/ads/internal/util/client/zzb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method
