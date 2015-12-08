.class final Lcom/google/android/gms/internal/em$ae;
.super Lcom/google/android/gms/internal/el;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/em;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "ae"
.end annotation


# instance fields
.field final synthetic mP:Lcom/google/android/gms/internal/em;

.field private final ne:Lcom/google/android/gms/games/OnPlayersLoadedListener;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/OnPlayersLoadedListener;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/em$ae;->mP:Lcom/google/android/gms/internal/em;

    invoke-direct {p0}, Lcom/google/android/gms/internal/el;-><init>()V

    const-string v0, "Listener must not be null"

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/dm;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/OnPlayersLoadedListener;

    iput-object v0, p0, Lcom/google/android/gms/internal/em$ae;->ne:Lcom/google/android/gms/games/OnPlayersLoadedListener;

    return-void
.end method


# virtual methods
.method public e(Lcom/google/android/gms/common/data/d;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/em$ae;->mP:Lcom/google/android/gms/internal/em;

    new-instance v1, Lcom/google/android/gms/internal/em$af;

    iget-object v2, p0, Lcom/google/android/gms/internal/em$ae;->mP:Lcom/google/android/gms/internal/em;

    iget-object v3, p0, Lcom/google/android/gms/internal/em$ae;->ne:Lcom/google/android/gms/games/OnPlayersLoadedListener;

    invoke-direct {v1, v2, v3, p1}, Lcom/google/android/gms/internal/em$af;-><init>(Lcom/google/android/gms/internal/em;Lcom/google/android/gms/games/OnPlayersLoadedListener;Lcom/google/android/gms/common/data/d;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/em;->a(Lcom/google/android/gms/internal/de$b;)V

    return-void
.end method
