.class final Lcom/google/android/gms/internal/em$aq;
.super Lcom/google/android/gms/internal/de$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/em;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "aq"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/de",
        "<",
        "Lcom/google/android/gms/internal/er;",
        ">.b<",
        "Lcom/google/android/gms/games/leaderboard/OnScoreSubmittedListener;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic mP:Lcom/google/android/gms/internal/em;

.field private final nn:Lcom/google/android/gms/games/leaderboard/SubmitScoreResult;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/leaderboard/OnScoreSubmittedListener;Lcom/google/android/gms/games/leaderboard/SubmitScoreResult;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/em$aq;->mP:Lcom/google/android/gms/internal/em;

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/de$b;-><init>(Lcom/google/android/gms/internal/de;Ljava/lang/Object;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/em$aq;->nn:Lcom/google/android/gms/games/leaderboard/SubmitScoreResult;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/games/leaderboard/OnScoreSubmittedListener;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/em$aq;->nn:Lcom/google/android/gms/games/leaderboard/SubmitScoreResult;

    invoke-virtual {v0}, Lcom/google/android/gms/games/leaderboard/SubmitScoreResult;->getStatusCode()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/gms/internal/em$aq;->nn:Lcom/google/android/gms/games/leaderboard/SubmitScoreResult;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/games/leaderboard/OnScoreSubmittedListener;->onScoreSubmitted(ILcom/google/android/gms/games/leaderboard/SubmitScoreResult;)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/games/leaderboard/OnScoreSubmittedListener;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/em$aq;->a(Lcom/google/android/gms/games/leaderboard/OnScoreSubmittedListener;)V

    return-void
.end method

.method protected aF()V
    .locals 0

    return-void
.end method
