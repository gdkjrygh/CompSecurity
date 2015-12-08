.class final Lcom/google/android/gms/plus/internal/e$h;
.super Lcom/google/android/gms/internal/ff$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/plus/internal/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ff",
        "<",
        "Lcom/google/android/gms/plus/internal/d;",
        ">.b<",
        "Lcom/google/android/gms/common/api/a$d",
        "<",
        "Lcom/google/android/gms/common/api/Status;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic Ud:Lcom/google/android/gms/plus/internal/e;

.field private final wJ:Lcom/google/android/gms/common/api/Status;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/plus/internal/e;Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/api/Status;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;",
            "Lcom/google/android/gms/common/api/Status;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/plus/internal/e$h;->Ud:Lcom/google/android/gms/plus/internal/e;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ff$b;-><init>(Lcom/google/android/gms/internal/ff;Ljava/lang/Object;)V

    iput-object p3, p0, Lcom/google/android/gms/plus/internal/e$h;->wJ:Lcom/google/android/gms/common/api/Status;

    return-void
.end method


# virtual methods
.method protected synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/common/api/a$d;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/plus/internal/e$h;->c(Lcom/google/android/gms/common/api/a$d;)V

    return-void
.end method

.method protected c(Lcom/google/android/gms/common/api/a$d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/a$d",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/e$h;->Ud:Lcom/google/android/gms/plus/internal/e;

    invoke-virtual {v0}, Lcom/google/android/gms/plus/internal/e;->disconnect()V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/plus/internal/e$h;->wJ:Lcom/google/android/gms/common/api/Status;

    invoke-interface {p1, v0}, Lcom/google/android/gms/common/api/a$d;->b(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method protected dx()V
    .locals 0

    return-void
.end method
