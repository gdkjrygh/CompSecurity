.class final Lcom/google/android/gms/internal/em$ao;
.super Lcom/google/android/gms/internal/de$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/em;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "ao"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/de",
        "<",
        "Lcom/google/android/gms/internal/er;",
        ">.b<",
        "Lcom/google/android/gms/games/OnSignOutCompleteListener;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic mP:Lcom/google/android/gms/internal/em;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/OnSignOutCompleteListener;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/em$ao;->mP:Lcom/google/android/gms/internal/em;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/de$b;-><init>(Lcom/google/android/gms/internal/de;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/games/OnSignOutCompleteListener;)V
    .locals 0

    invoke-interface {p1}, Lcom/google/android/gms/games/OnSignOutCompleteListener;->onSignOutComplete()V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/OnSignOutCompleteListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/em$ao;->a(Lcom/google/android/gms/games/OnSignOutCompleteListener;)V

    return-void
.end method

.method protected aF()V
    .locals 0

    return-void
.end method
