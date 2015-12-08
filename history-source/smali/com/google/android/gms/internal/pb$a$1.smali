.class Lcom/google/android/gms/internal/pb$a$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/plus/Moments$LoadMomentsResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/pb$a;->aB(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/plus/Moments$LoadMomentsResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic DS:Lcom/google/android/gms/common/api/Status;

.field final synthetic aog:Lcom/google/android/gms/internal/pb$a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/pb$a;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/pb$a$1;->aog:Lcom/google/android/gms/internal/pb$a;

    iput-object p2, p0, Lcom/google/android/gms/internal/pb$a$1;->DS:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getMomentBuffer()Lcom/google/android/gms/plus/model/moments/MomentBuffer;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getNextPageToken()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getStatus()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/pb$a$1;->DS:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public getUpdated()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public release()V
    .locals 0

    return-void
.end method
