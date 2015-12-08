.class public final Lcom/google/android/gms/games/leaderboard/a;
.super Lcom/google/android/gms/common/data/b;

# interfaces
.implements Lcom/google/android/gms/games/leaderboard/Leaderboard;


# instance fields
.field private final nu:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/data/d;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/common/data/b;-><init>(Lcom/google/android/gms/common/data/d;I)V

    iput p3, p0, Lcom/google/android/gms/games/leaderboard/a;->nu:I

    return-void
.end method


# virtual methods
.method public getDisplayName()Ljava/lang/String;
    .locals 1

    const-string v0, "name"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/a;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getDisplayName(Landroid/database/CharArrayBuffer;)V
    .locals 1
    .param p1, "dataOut"    # Landroid/database/CharArrayBuffer;

    .prologue
    const-string v0, "name"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/games/leaderboard/a;->a(Ljava/lang/String;Landroid/database/CharArrayBuffer;)V

    return-void
.end method

.method public getIconImageUri()Landroid/net/Uri;
    .locals 1

    const-string v0, "board_icon_image_uri"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/a;->u(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public getLeaderboardId()Ljava/lang/String;
    .locals 1

    const-string v0, "external_leaderboard_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/a;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getScoreOrder()I
    .locals 1

    const-string v0, "score_order"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/leaderboard/a;->getInteger(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public getVariants()Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/games/leaderboard/LeaderboardVariant;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    iget v0, p0, Lcom/google/android/gms/games/leaderboard/a;->nu:I

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v0, 0x0

    :goto_0
    iget v2, p0, Lcom/google/android/gms/games/leaderboard/a;->nu:I

    if-ge v0, v2, :cond_0

    new-instance v2, Lcom/google/android/gms/games/leaderboard/e;

    iget-object v3, p0, Lcom/google/android/gms/games/leaderboard/a;->jf:Lcom/google/android/gms/common/data/d;

    iget v4, p0, Lcom/google/android/gms/games/leaderboard/a;->ji:I

    add-int/2addr v4, v0

    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/games/leaderboard/e;-><init>(Lcom/google/android/gms/common/data/d;I)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/internal/dl;->d(Ljava/lang/Object;)Lcom/google/android/gms/internal/dl$a;

    move-result-object v0

    const-string v1, "ID"

    invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/a;->getLeaderboardId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/dl$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/dl$a;

    move-result-object v0

    const-string v1, "DisplayName"

    invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/a;->getDisplayName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/dl$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/dl$a;

    move-result-object v0

    const-string v1, "IconImageURI"

    invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/a;->getIconImageUri()Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/dl$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/dl$a;

    move-result-object v0

    const-string v1, "ScoreOrder"

    invoke-virtual {p0}, Lcom/google/android/gms/games/leaderboard/a;->getScoreOrder()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/dl$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/internal/dl$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dl$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
