.class final Lcom/google/android/gms/internal/em$o;
.super Lcom/google/android/gms/internal/de$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/em;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "o"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/de",
        "<",
        "Lcom/google/android/gms/internal/er;",
        ">.c<",
        "Lcom/google/android/gms/games/multiplayer/OnInvitationsLoadedListener;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic mP:Lcom/google/android/gms/internal/em;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/OnInvitationsLoadedListener;Lcom/google/android/gms/common/data/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/em$o;->mP:Lcom/google/android/gms/internal/em;

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/de$c;-><init>(Lcom/google/android/gms/internal/de;Ljava/lang/Object;Lcom/google/android/gms/common/data/d;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/games/multiplayer/OnInvitationsLoadedListener;Lcom/google/android/gms/common/data/d;)V
    .locals 2

    invoke-virtual {p2}, Lcom/google/android/gms/common/data/d;->getStatusCode()I

    move-result v0

    new-instance v1, Lcom/google/android/gms/games/multiplayer/InvitationBuffer;

    invoke-direct {v1, p2}, Lcom/google/android/gms/games/multiplayer/InvitationBuffer;-><init>(Lcom/google/android/gms/common/data/d;)V

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/games/multiplayer/OnInvitationsLoadedListener;->onInvitationsLoaded(ILcom/google/android/gms/games/multiplayer/InvitationBuffer;)V

    return-void
.end method

.method protected bridge synthetic a(Ljava/lang/Object;Lcom/google/android/gms/common/data/d;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/multiplayer/OnInvitationsLoadedListener;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/em$o;->a(Lcom/google/android/gms/games/multiplayer/OnInvitationsLoadedListener;Lcom/google/android/gms/common/data/d;)V

    return-void
.end method
