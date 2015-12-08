.class final Lcom/google/android/gms/internal/cw$h;
.super Lcom/google/android/gms/internal/de$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/cw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/de",
        "<",
        "Lcom/google/android/gms/internal/cy;",
        ">.b<",
        "Lcom/google/android/gms/appstate/OnSignOutCompleteListener;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic iB:Lcom/google/android/gms/internal/cw;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/cw;Lcom/google/android/gms/appstate/OnSignOutCompleteListener;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/cw$h;->iB:Lcom/google/android/gms/internal/cw;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/de$b;-><init>(Lcom/google/android/gms/internal/de;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/appstate/OnSignOutCompleteListener;)V
    .locals 0

    invoke-interface {p1}, Lcom/google/android/gms/appstate/OnSignOutCompleteListener;->onSignOutComplete()V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/appstate/OnSignOutCompleteListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/cw$h;->a(Lcom/google/android/gms/appstate/OnSignOutCompleteListener;)V

    return-void
.end method

.method protected aF()V
    .locals 0

    return-void
.end method
