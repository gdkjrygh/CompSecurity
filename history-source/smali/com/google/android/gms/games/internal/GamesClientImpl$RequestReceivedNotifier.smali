.class final Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedNotifier;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/d$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "RequestReceivedNotifier"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/d$b",
        "<",
        "Lcom/google/android/gms/games/request/OnRequestReceivedListener;",
        ">;"
    }
.end annotation


# instance fields
.field private final Zs:Lcom/google/android/gms/games/request/GameRequest;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/request/GameRequest;)V
    .locals 0
    .param p1, "request"    # Lcom/google/android/gms/games/request/GameRequest;

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedNotifier;->Zs:Lcom/google/android/gms/games/request/GameRequest;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/games/request/OnRequestReceivedListener;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedNotifier;->Zs:Lcom/google/android/gms/games/request/GameRequest;

    invoke-interface {p1, v0}, Lcom/google/android/gms/games/request/OnRequestReceivedListener;->onRequestReceived(Lcom/google/android/gms/games/request/GameRequest;)V

    return-void
.end method

.method public synthetic c(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/request/OnRequestReceivedListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$RequestReceivedNotifier;->a(Lcom/google/android/gms/games/request/OnRequestReceivedListener;)V

    return-void
.end method

.method public gG()V
    .locals 0

    return-void
.end method
