.class final Lcom/google/android/gms/games/internal/GamesClientImpl$MessageReceivedCallback;
.super Lcom/google/android/gms/internal/hb$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "MessageReceivedCallback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/hb",
        "<",
        "Lcom/google/android/gms/games/internal/IGamesService;",
        ">.b<",
        "Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic NE:Lcom/google/android/gms/games/internal/GamesClientImpl;

.field private final Ol:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/GamesClientImpl;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;)V
    .locals 0
    .param p2, "listener"    # Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;
    .param p3, "message"    # Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$MessageReceivedCallback;->NE:Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/hb$b;-><init>(Lcom/google/android/gms/internal/hb;Ljava/lang/Object;)V

    iput-object p3, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$MessageReceivedCallback;->Ol:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$MessageReceivedCallback;->Ol:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;

    invoke-interface {p1, v0}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;->onRealTimeMessageReceived(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessage;)V

    :cond_0
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$MessageReceivedCallback;->a(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeMessageReceivedListener;)V

    return-void
.end method

.method protected fu()V
    .locals 0

    return-void
.end method
