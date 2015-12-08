.class abstract Lcom/google/android/gms/internal/em$b;
.super Lcom/google/android/gms/internal/de$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/em;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/de",
        "<",
        "Lcom/google/android/gms/internal/er;",
        ">.c<",
        "Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic mP:Lcom/google/android/gms/internal/em;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/common/data/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/em$b;->mP:Lcom/google/android/gms/internal/em;

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/de$c;-><init>(Lcom/google/android/gms/internal/de;Ljava/lang/Object;Lcom/google/android/gms/common/data/d;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/common/data/d;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/em$b;->mP:Lcom/google/android/gms/internal/em;

    invoke-static {v0, p2}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/common/data/d;)Lcom/google/android/gms/games/multiplayer/realtime/Room;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/common/data/d;->getStatusCode()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lcom/google/android/gms/internal/em$b;->a(Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/games/multiplayer/realtime/Room;I)V

    return-void
.end method

.method protected abstract a(Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/games/multiplayer/realtime/Room;I)V
.end method

.method protected bridge synthetic a(Ljava/lang/Object;Lcom/google/android/gms/common/data/d;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/em$b;->a(Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/common/data/d;)V

    return-void
.end method
