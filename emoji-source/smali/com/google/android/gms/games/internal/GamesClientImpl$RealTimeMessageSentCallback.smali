.class final Lcom/google/android/gms/games/internal/GamesClientImpl$RealTimeMessageSentCallback;
.super Lcom/google/android/gms/internal/hb$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "RealTimeMessageSentCallback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/hb",
        "<",
        "Lcom/google/android/gms/games/internal/IGamesService;",
        ">.b<",
        "Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer$ReliableMessageSentCallback;",
        ">;"
    }
.end annotation


# instance fields
.field private final CT:I

.field final synthetic NE:Lcom/google/android/gms/games/internal/GamesClientImpl;

.field private final Ow:Ljava/lang/String;

.field private final Ox:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer$ReliableMessageSentCallback;IILjava/lang/String;)V
    .locals 0
    .param p2, "listener"    # Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer$ReliableMessageSentCallback;
    .param p3, "statusCode"    # I
    .param p4, "token"    # I
    .param p5, "recipientParticipantId"    # Ljava/lang/String;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RealTimeMessageSentCallback;->NE:Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/hb$b;-><init>(Lcom/google/android/gms/internal/hb;Ljava/lang/Object;)V

    iput p3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RealTimeMessageSentCallback;->CT:I

    iput p4, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RealTimeMessageSentCallback;->Ox:I

    iput-object p5, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RealTimeMessageSentCallback;->Ow:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer$ReliableMessageSentCallback;)V
    .locals 3

    if-eqz p1, :cond_0

    iget v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RealTimeMessageSentCallback;->CT:I

    iget v1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RealTimeMessageSentCallback;->Ox:I

    iget-object v2, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RealTimeMessageSentCallback;->Ow:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer$ReliableMessageSentCallback;->onRealTimeMessageSent(IILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer$ReliableMessageSentCallback;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RealTimeMessageSentCallback;->a(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMultiplayer$ReliableMessageSentCallback;)V

    return-void
.end method

.method protected fu()V
    .locals 0

    return-void
.end method
