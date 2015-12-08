.class Lcom/google/android/gms/games/internal/api/GamesMetadataImpl$8;
.super Lcom/google/android/gms/games/internal/api/GamesMetadataImpl$LoadExtendedGamesImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/api/GamesMetadataImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic JQ:Z

.field final synthetic Kb:I

.field final synthetic Ke:I

.field final synthetic Kf:Z


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/Api$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/api/GamesMetadataImpl$8;->a(Lcom/google/android/gms/games/internal/GamesClientImpl;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/GamesClientImpl;)V
    .locals 6

    iget v2, p0, Lcom/google/android/gms/games/internal/api/GamesMetadataImpl$8;->Kb:I

    iget v3, p0, Lcom/google/android/gms/games/internal/api/GamesMetadataImpl$8;->Ke:I

    iget-boolean v4, p0, Lcom/google/android/gms/games/internal/api/GamesMetadataImpl$8;->Kf:Z

    iget-boolean v5, p0, Lcom/google/android/gms/games/internal/api/GamesMetadataImpl$8;->JQ:Z

    move-object v0, p1

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/api/a$d;IIZZ)V

    return-void
.end method
