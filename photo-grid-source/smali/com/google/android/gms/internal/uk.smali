.class final Lcom/google/android/gms/internal/uk;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/us;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/uj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/uj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/uk;->a:Lcom/google/android/gms/internal/uj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ut;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ut",
            "<*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/uk;->a:Lcom/google/android/gms/internal/uj;

    iget-object v0, v0, Lcom/google/android/gms/internal/uj;->j:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-interface {p1}, Lcom/google/android/gms/internal/ut;->a()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/uk;->a:Lcom/google/android/gms/internal/uj;

    invoke-static {v0}, Lcom/google/android/gms/internal/uj;->a(Lcom/google/android/gms/internal/uj;)Lcom/google/android/gms/common/api/u;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/uk;->a:Lcom/google/android/gms/internal/uj;

    invoke-static {v0}, Lcom/google/android/gms/internal/uj;->a(Lcom/google/android/gms/internal/uj;)Lcom/google/android/gms/common/api/u;

    move-result-object v0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ut;->a()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/u;->a()V

    :cond_0
    return-void
.end method
