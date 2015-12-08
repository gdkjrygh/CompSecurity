.class public interface abstract Lcom/google/android/gms/games/leaderboard/Leaderboard;
.super Ljava/lang/Object;


# static fields
.field public static final SCORE_ORDER_LARGER_IS_BETTER:I = 0x1

.field public static final SCORE_ORDER_SMALLER_IS_BETTER:I


# virtual methods
.method public abstract getDisplayName()Ljava/lang/String;
.end method

.method public abstract getDisplayName(Landroid/database/CharArrayBuffer;)V
.end method

.method public abstract getIconImageUri()Landroid/net/Uri;
.end method

.method public abstract getLeaderboardId()Ljava/lang/String;
.end method

.method public abstract getScoreOrder()I
.end method

.method public abstract getVariants()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/games/leaderboard/LeaderboardVariant;",
            ">;"
        }
    .end annotation
.end method
