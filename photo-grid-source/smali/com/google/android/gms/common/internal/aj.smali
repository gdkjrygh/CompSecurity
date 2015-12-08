.class public final Lcom/google/android/gms/common/internal/aj;
.super Lcom/google/android/gms/common/internal/ab;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/aa",
        "<TT;>.com/google/android/gms/common/internal/ab;"
    }
.end annotation


# instance fields
.field final synthetic e:Lcom/google/android/gms/common/internal/aa;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/internal/aa;ILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/internal/aj;->e:Lcom/google/android/gms/common/internal/aa;

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/common/internal/ab;-><init>(Lcom/google/android/gms/common/internal/aa;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method protected final a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/internal/aj;->e:Lcom/google/android/gms/common/internal/aa;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/aa;->a(Lcom/google/android/gms/common/internal/aa;)Lcom/google/android/gms/common/api/o;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/common/api/o;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    invoke-static {}, Lcom/google/android/gms/common/internal/aa;->g_()V

    return-void
.end method

.method protected final a()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/common/internal/aj;->e:Lcom/google/android/gms/common/internal/aa;

    invoke-static {v0}, Lcom/google/android/gms/common/internal/aa;->a(Lcom/google/android/gms/common/internal/aa;)Lcom/google/android/gms/common/api/o;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/common/ConnectionResult;->a:Lcom/google/android/gms/common/ConnectionResult;

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/o;->b(Lcom/google/android/gms/common/ConnectionResult;)V

    const/4 v0, 0x1

    return v0
.end method
