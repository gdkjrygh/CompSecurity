.class final Lcom/google/android/gms/internal/em$d;
.super Lcom/google/android/gms/internal/el;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/em;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "d"
.end annotation


# instance fields
.field final synthetic mP:Lcom/google/android/gms/internal/em;

.field private final mQ:Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/em$d;->mP:Lcom/google/android/gms/internal/em;

    invoke-direct {p0}, Lcom/google/android/gms/internal/el;-><init>()V

    const-string v0, "Listener must not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/dm;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;

    iput-object v0, p0, Lcom/google/android/gms/internal/em$d;->mQ:Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;

    return-void
.end method


# virtual methods
.method public onAchievementUpdated(ILjava/lang/String;)V
    .locals 4
    .param p1, "statusCode"    # I
    .param p2, "achievementId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/em$d;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$e;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$d;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$d;->mQ:Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;

    invoke-direct {v1, v2, v3, p1, p2}, Lcom/google/android/gms/internal/em$e;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/achievement/OnAchievementUpdatedListener;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method
