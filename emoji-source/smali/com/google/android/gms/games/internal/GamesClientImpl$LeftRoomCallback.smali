.class final Lcom/google/android/gms/games/internal/GamesClientImpl$LeftRoomCallback;
.super Lcom/google/android/gms/internal/hb$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "LeftRoomCallback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/hb",
        "<",
        "Lcom/google/android/gms/games/internal/IGamesService;",
        ">.b<",
        "Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;",
        ">;"
    }
.end annotation


# instance fields
.field private final CT:I

.field final synthetic NE:Lcom/google/android/gms/games/internal/GamesClientImpl;

.field private final NS:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;ILjava/lang/String;)V
    .locals 0
    .param p2, "listener"    # Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;
    .param p3, "statusCode"    # I
    .param p4, "roomId"    # Ljava/lang/String;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LeftRoomCallback;->NE:Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/hb$b;-><init>(Lcom/google/android/gms/internal/hb;Ljava/lang/Object;)V

    iput p3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LeftRoomCallback;->CT:I

    iput-object p4, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LeftRoomCallback;->NS:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;)V
    .locals 2

    iget v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LeftRoomCallback;->CT:I

    iget-object v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$LeftRoomCallback;->NS:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;->onLeftRoom(ILjava/lang/String;)V

    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$LeftRoomCallback;->a(Lcom/google/android/gms/games/multiplayer/realtime/RoomUpdateListener;)V

    return-void
.end method

.method protected fu()V
    .locals 0

    return-void
.end method
