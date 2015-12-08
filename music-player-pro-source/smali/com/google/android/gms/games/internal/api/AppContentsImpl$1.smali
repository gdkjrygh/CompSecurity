.class Lcom/google/android/gms/games/internal/api/AppContentsImpl$1;
.super Lcom/google/android/gms/games/internal/api/AppContentsImpl$LoadsImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/games/internal/api/AppContentsImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ZW:Z

.field final synthetic aaf:I

.field final synthetic aag:Ljava/lang/String;

.field final synthetic aah:[Ljava/lang/String;


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/Api$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    check-cast p1, Lcom/google/android/gms/games/internal/GamesClientImpl;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/games/internal/api/AppContentsImpl$1;->a(Lcom/google/android/gms/games/internal/GamesClientImpl;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/games/internal/GamesClientImpl;)V
    .locals 6

    iget v2, p0, Lcom/google/android/gms/games/internal/api/AppContentsImpl$1;->aaf:I

    iget-object v3, p0, Lcom/google/android/gms/games/internal/api/AppContentsImpl$1;->aag:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/games/internal/api/AppContentsImpl$1;->aah:[Ljava/lang/String;

    iget-boolean v5, p0, Lcom/google/android/gms/games/internal/api/AppContentsImpl$1;->ZW:Z

    move-object v0, p1

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/games/internal/GamesClientImpl;->a(Lcom/google/android/gms/common/api/BaseImplementation$b;ILjava/lang/String;[Ljava/lang/String;Z)V

    return-void
.end method
