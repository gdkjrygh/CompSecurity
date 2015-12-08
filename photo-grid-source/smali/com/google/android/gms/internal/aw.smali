.class final Lcom/google/android/gms/internal/aw;
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
.field final synthetic a:Lcom/google/android/gms/internal/at;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/at;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aw;->a:Lcom/google/android/gms/internal/at;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 0
    check-cast p1, Lcom/google/android/gms/internal/bs;

    .line 1000
    iget-object v0, p0, Lcom/google/android/gms/internal/aw;->a:Lcom/google/android/gms/internal/at;

    invoke-static {v0}, Lcom/google/android/gms/internal/at;->a(Lcom/google/android/gms/internal/at;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/aw;->a:Lcom/google/android/gms/internal/at;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/at;->a(Lcom/google/android/gms/internal/bs;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aw;->a:Lcom/google/android/gms/internal/at;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/at;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/aw;->a:Lcom/google/android/gms/internal/at;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/at;->b(Z)V

    .line 0
    return-void
.end method
