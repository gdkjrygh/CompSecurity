.class final Lcom/google/android/gms/internal/em$ah;
.super Lcom/google/android/gms/internal/el;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/em;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "ah"
.end annotation


# instance fields
.field final synthetic mP:Lcom/google/android/gms/internal/em;

.field final nh:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeReliableMessageSentListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeReliableMessageSentListener;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/em$ah;->mP:Lcom/google/android/gms/internal/em;

    invoke-direct {p0}, Lcom/google/android/gms/internal/el;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/em$ah;->nh:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeReliableMessageSentListener;

    return-void
.end method


# virtual methods
.method public a(IILjava/lang/String;)V
    .locals 7

    iget-object v6, p0, Lcom/google/android/gms/internal/em$ah;->mP:Lcom/google/android/gms/internal/em;

    new-instance v0, Lcom/google/android/gms/internal/em$ag;

    iget-object v1, p0, Lcom/google/android/gms/internal/em$ah;->mP:Lcom/google/android/gms/internal/em;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$ah;->nh:Lcom/google/android/gms/games/multiplayer/realtime/RealTimeReliableMessageSentListener;

    move v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/em$ag;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/multiplayer/realtime/RealTimeReliableMessageSentListener;IILjava/lang/String;)V

    invoke-virtual {v6, v0}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method
