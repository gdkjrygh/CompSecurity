.class public final Lcom/google/android/gms/games/multiplayer/InvitationBuffer;
.super Lcom/google/android/gms/common/data/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/data/f",
        "<",
        "Lcom/google/android/gms/games/multiplayer/Invitation;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/d;)V
    .locals 0
    .param p1, "dataHolder"    # Lcom/google/android/gms/common/data/d;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/common/data/f;-><init>(Lcom/google/android/gms/common/data/d;)V

    return-void
.end method


# virtual methods
.method protected synthetic a(II)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/games/multiplayer/InvitationBuffer;->getEntry(II)Lcom/google/android/gms/games/multiplayer/Invitation;

    move-result-object v0

    return-object v0
.end method

.method protected getEntry(II)Lcom/google/android/gms/games/multiplayer/Invitation;
    .locals 2
    .param p1, "rowIndex"    # I
    .param p2, "numChildren"    # I

    .prologue
    new-instance v0, Lcom/google/android/gms/games/multiplayer/b;

    iget-object v1, p0, Lcom/google/android/gms/games/multiplayer/InvitationBuffer;->jf:Lcom/google/android/gms/common/data/d;

    invoke-direct {v0, v1, p1, p2}, Lcom/google/android/gms/games/multiplayer/b;-><init>(Lcom/google/android/gms/common/data/d;II)V

    return-object v0
.end method

.method protected getPrimaryDataMarkerColumn()Ljava/lang/String;
    .locals 1

    const-string v0, "external_invitation_id"

    return-object v0
.end method
