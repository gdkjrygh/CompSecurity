.class public final Lcom/google/android/gms/games/leaderboard/e;
.super Lcom/google/android/gms/common/data/b;

# interfaces
.implements Lcom/google/android/gms/games/leaderboard/LeaderboardVariant;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/d;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/b;-><init>(Lcom/google/android/gms/common/data/d;I)V

    return-void
.end method


# virtual methods
.method public ce()Ljava/lang/String;
    .locals 1

    const-string v0, "top_page_token_next"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/e;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public cf()Ljava/lang/String;
    .locals 1

    const-string v0, "window_page_token_prev"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/e;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public cg()Ljava/lang/String;
    .locals 1

    const-string v0, "window_page_token_next"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/e;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getCollection()I
    .locals 1

    const-string v0, "collection"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/e;->getInteger(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public getDisplayPlayerRank()Ljava/lang/String;
    .locals 1

    const-string v0, "player_display_rank"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/e;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDisplayPlayerScore()Ljava/lang/String;
    .locals 1

    const-string v0, "player_display_score"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/e;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getNumScores()J
    .locals 2

    const-string v0, "total_scores"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/e;->v(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, -0x1

    :goto_0
    return-wide v0

    :cond_0
    const-string v0, "total_scores"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/e;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    goto :goto_0
.end method

.method public getPlayerRank()J
    .locals 2

    const-string v0, "player_rank"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/e;->v(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, -0x1

    :goto_0
    return-wide v0

    :cond_0
    const-string v0, "player_rank"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/e;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    goto :goto_0
.end method

.method public getPlayerScoreTag()Ljava/lang/String;
    .locals 1

    const-string v0, "player_score_tag"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/e;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getRawPlayerScore()J
    .locals 2

    const-string v0, "player_raw_score"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/e;->v(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, -0x1

    :goto_0
    return-wide v0

    :cond_0
    const-string v0, "player_raw_score"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/e;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    goto :goto_0
.end method

.method public getTimeSpan()I
    .locals 1

    const-string v0, "timespan"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/e;->getInteger(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public hasPlayerInfo()Z
    .locals 1

    const-string v0, "player_raw_score"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/e;->v(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    invoke-static {p0}, Lcom/google/android/gms/internal/dl;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/dl$a;

    move-result-object v0

    const-string v1, "TimeSpan"

    invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/e;->getTimeSpan()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/ev;->R(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/dl$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/dl$a;

    move-result-object v0

    const-string v1, "Collection"

    invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/e;->getCollection()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/eu;->R(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/dl$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/dl$a;

    move-result-object v1

    const-string v2, "RawPlayerScore"

    invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/e;->hasPlayerInfo()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/e;->getRawPlayerScore()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/dl$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/dl$a;

    move-result-object v1

    const-string v2, "DisplayPlayerScore"

    invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/e;->hasPlayerInfo()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/e;->getDisplayPlayerScore()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/dl$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/dl$a;

    move-result-object v1

    const-string v2, "PlayerRank"

    invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/e;->hasPlayerInfo()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/e;->getPlayerRank()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_2
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/dl$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/dl$a;

    move-result-object v1

    const-string v2, "DisplayPlayerRank"

    invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/e;->hasPlayerInfo()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/e;->getDisplayPlayerRank()Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/dl$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/dl$a;

    move-result-object v0

    const-string v1, "NumScores"

    invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/e;->getNumScores()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/dl$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/dl$a;

    move-result-object v0

    const-string v1, "TopPageNextToken"

    invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/e;->ce()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/dl$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/dl$a;

    move-result-object v0

    const-string v1, "WindowPageNextToken"

    invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/e;->cg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/dl$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/dl$a;

    move-result-object v0

    const-string v1, "WindowPagePrevToken"

    invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/e;->cf()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/dl$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/dl$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dl$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "none"

    goto :goto_0

    :cond_1
    const-string v0, "none"

    goto :goto_1

    :cond_2
    const-string v0, "none"

    goto :goto_2

    :cond_3
    const-string v0, "none"

    goto :goto_3
.end method
