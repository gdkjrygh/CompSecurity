.class Lcom/google/android/gms/games/internal/api/AchievementsImpl$8;
.super Lcom/google/android/gms/games/internal/api/AchievementsImpl$UpdateImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/api/AchievementsImpl;->setSteps(Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ZX:Lcom/google/android/gms/games/internal/api/AchievementsImpl;

.field final synthetic aaa:Ljava/lang/String;

.field final synthetic aab:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/api/AchievementsImpl;Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient;Ljava/lang/String;I)V
    .locals 0
    .param p2, "x0"    # Ljava/lang/String;
    .param p3, "x1"    # Lcom/google/android/gms/common/api/GoogleApiClient;

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/games/internal/api/AchievementsImpl$8;->ZX:Lcom/google/android/gms/games/internal/api/AchievementsImpl;

    iput-object p4, p0, Lcom/google/android/gms/games/internal/api/AchievementsImpl$8;->aaa:Ljava/lang/String;

    iput p5, p0, Lcom/google/android/gms/games/internal/api/AchievementsImpl$8;->aab:I

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/games/internal/api/AchievementsImpl$UpdateImpl;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/api/GoogleApiClient;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/android/gms/common/api/Api$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/api/AchievementsImpl$8;->a(Lcom/google/android/gms/games/internal/GamesClientImpl;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/games/internal/GamesClientImpl;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/games/internal/api/AchievementsImpl$8;->aaa:Ljava/lang/String;

    iget v2, p0, Lcom/google/android/gms/games/internal/api/AchievementsImpl$8;->aab:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/android/gms/games/internal/GamesClientImpl;->b(Lcom/google/android/gms/common/api/BaseImplementation$b;Ljava/lang/String;I)V

    return-void
.end method
