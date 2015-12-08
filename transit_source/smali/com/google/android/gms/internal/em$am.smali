.class final Lcom/google/android/gms/internal/em$am;
.super Lcom/google/android/gms/internal/em$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/em;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "am"
.end annotation


# instance fields
.field final synthetic mP:Lcom/google/android/gms/internal/em;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/common/data/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/em$am;->mP:Lcom/google/android/gms/internal/em;

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/em$b;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/common/data/d;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;Lcom/google/android/gms/games/multiplayer/realtime/Room;I)V
    .locals 0

    invoke-interface {p1, p3, p2}, Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;->onRoomCreated(ILcom/google/android/gms/games/multiplayer/realtime/Room;)V

    return-void
.end method
