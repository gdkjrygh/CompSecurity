.class final Lcom/google/android/gms/games/internal/GamesClientImpl$AchievementsLoadedBinderCallback;
.super Lcom/google/android/gms/games/internal/AbstractGamesCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/GamesClientImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "AchievementsLoadedBinderCallback"
.end annotation


# instance fields
.field private final Ea:Lcom/google/android/gms/common/api/BaseImplementation$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/achievement/Achievements$LoadAchievementsResult;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/BaseImplementation$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/BaseImplementation$b",
            "<",
            "Lcom/google/android/gms/games/achievement/Achievements$LoadAchievementsResult;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p1, "resultHolder":Lcom/google/android/gms/common/api/BaseImplementation$b;, "Lcom/google/android/gms/common/api/BaseImplementation$b<Lcom/google/android/gms/games/achievement/Achievements$LoadAchievementsResult;>;"
    invoke-direct {p0}, Lcom/google/android/gms/games/internal/AbstractGamesCallbacks;-><init>()V

    const-string v0, "Holder must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/jx;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/BaseImplementation$b;

    iput-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$AchievementsLoadedBinderCallback;->Ea:Lcom/google/android/gms/common/api/BaseImplementation$b;

    return-void
.end method


# virtual methods
.method public c(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/games/internal/GamesClientImpl$AchievementsLoadedBinderCallback;->Ea:Lcom/google/android/gms/common/api/BaseImplementation$b;

    new-instance v1, Lcom/google/android/gms/games/internal/GamesClientImpl$LoadAchievementsResultImpl;

    invoke-direct {v1, p1}, Lcom/google/android/gms/games/internal/GamesClientImpl$LoadAchievementsResultImpl;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/api/BaseImplementation$b;->b(Ljava/lang/Object;)V

    return-void
.end method
