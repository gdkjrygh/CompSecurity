.class Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadExtendedPlayersImpl$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/games/Players$LoadExtendedPlayersResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadExtendedPlayersImpl;->K(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/games/Players$LoadExtendedPlayersResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic KL:Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadExtendedPlayersImpl;

.field final synthetic wz:Lcom/google/android/gms/common/api/Status;


# direct methods
.method constructor <init>(Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadExtendedPlayersImpl;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadExtendedPlayersImpl$1;->KL:Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadExtendedPlayersImpl;

    iput-object p2, p0, Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadExtendedPlayersImpl$1;->wz:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/games/internal/api/PlayersImpl$LoadExtendedPlayersImpl$1;->wz:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public release()V
    .locals 0

    return-void
.end method
