.class final Lcom/google/android/gms/internal/em$f;
.super Lcom/google/android/gms/internal/el;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/em;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "f"
.end annotation


# instance fields
.field final synthetic mP:Lcom/google/android/gms/internal/em;

.field private final mS:Lcom/google/android/gms/games/achievement/OnAchievementsLoadedListener;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/achievement/OnAchievementsLoadedListener;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/em$f;->mP:Lcom/google/android/gms/internal/em;

    invoke-direct {p0}, Lcom/google/android/gms/internal/el;-><init>()V

    const-string v0, "Listener must not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/dm;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/achievement/OnAchievementsLoadedListener;

    iput-object v0, p0, Lcom/google/android/gms/internal/em$f;->mS:Lcom/google/android/gms/games/achievement/OnAchievementsLoadedListener;

    return-void
.end method


# virtual methods
.method public b(Lcom/google/android/gms/common/data/d;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/em$f;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$g;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$f;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$f;->mS:Lcom/google/android/gms/games/achievement/OnAchievementsLoadedListener;

    invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/internal/em$g;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/achievement/OnAchievementsLoadedListener;Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method
