.class final Lcom/google/android/gms/plus/internal/e$d;
.super Lcom/google/android/gms/internal/jl$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/plus/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/jl",
        "<",
        "Lcom/google/android/gms/plus/internal/d;",
        ">.b<",
        "Lcom/google/android/gms/common/api/BaseImplementation$b",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final Eb:Lcom/google/android/gms/common/api/Status;

.field final synthetic anJ:Lcom/google/android/gms/plus/internal/e;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/plus/internal/e;Lcom/google/android/gms/common/api/BaseImplementation$b;Lcom/google/android/gms/common/api/Status;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/common/api/Status;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/plus/internal/e$d;->anJ:Lcom/google/android/gms/plus/internal/e;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/jl$b;-><init>(Lcom/google/android/gms/internal/jl;Ljava/lang/Object;)V

    iput-object p3, p0, Lcom/google/android/gms/plus/internal/e$d;->Eb:Lcom/google/android/gms/common/api/Status;

    return-void
.end method


# virtual methods
.method protected synthetic g(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/common/api/BaseImplementation$b;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/plus/internal/e$d;->m(Lcom/google/android/gms/common/api/BaseImplementation$b;)V

    return-void
.end method

.method protected hx()V
    .locals 0

    return-void
.end method

.method protected m(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/e$d;->Eb:Lcom/google/android/gms/common/api/Status;

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
