.class final Lcom/google/android/gms/internal/em$n;
.super Lcom/google/android/gms/internal/el;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/em;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "n"
.end annotation


# instance fields
.field final synthetic mP:Lcom/google/android/gms/internal/em;

.field private final mW:Lcom/google/android/gms/games/multiplayer/OnInvitationsLoadedListener;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/OnInvitationsLoadedListener;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/em$n;->mP:Lcom/google/android/gms/internal/em;

    invoke-direct {p0}, Lcom/google/android/gms/internal/el;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/em$n;->mW:Lcom/google/android/gms/games/multiplayer/OnInvitationsLoadedListener;

    return-void
.end method


# virtual methods
.method public j(Lcom/google/android/gms/common/data/d;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/em$n;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$o;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$n;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$n;->mW:Lcom/google/android/gms/games/multiplayer/OnInvitationsLoadedListener;

    invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/internal/em$o;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/OnInvitationsLoadedListener;Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method
