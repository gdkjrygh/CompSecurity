.class final Lcom/google/android/gms/internal/em$ag;
.super Lcom/google/android/gms/internal/de$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/em;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "ag"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/de",
        "<",
        "Lcom/google/android/gms/internal/er;",
        ">.b<",
        "Lcom/google/android/gms/games/multiplayer/realtime/RealTimeReliableMessageSentListener;",
        ">;"
    }
.end annotation


# instance fields
.field private final iC:I

.field final synthetic mP:Lcom/google/android/gms/internal/em;

.field private final nf:Ljava/lang/String;

.field private final ng:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeReliableMessageSentListener;IILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/em$ag;->mP:Lcom/google/android/gms/internal/em;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/de$b;-><init>(Lcom/google/android/gms/internal/de;Ljava/lang/Object;)V

    iput p3, p0, Lcom/google/android/gms/internal/em$ag;->iC:I

    iput p4, p0, Lcom/google/android/gms/internal/em$ag;->ng:I

    iput-object p5, p0, Lcom/google/android/gms/internal/em$ag;->nf:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeReliableMessageSentListener;)V
    .locals 3

    if-eqz p1, :cond_0

    iget v0, p0, Lcom/google/android/gms/internal/em$ag;->iC:I

    iget v1, p0, Lcom/google/android/gms/internal/em$ag;->ng:I

    iget-object v2, p0, Lcom/google/android/gms/internal/em$ag;->nf:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeReliableMessageSentListener;->onRealTimeMessageSent(IILjava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/multiplayer/realtime/RealTimeReliableMessageSentListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/em$ag;->a(Lcom/google/android/gms/games/multiplayer/realtime/RealTimeReliableMessageSentListener;)V

    return-void
.end method

.method protected aF()V
    .locals 0

    return-void
.end method
