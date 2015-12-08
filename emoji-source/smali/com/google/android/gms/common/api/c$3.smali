.class Lcom/google/android/gms/common/api/c$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/hc$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/api/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Ek:Lcom/google/android/gms/common/api/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/c$3;->Ek:Lcom/google/android/gms/common/api/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public eO()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/c$3;->Ek:Lcom/google/android/gms/common/api/c;

    invoke-static {v0}, Lcom/google/android/gms/common/api/c;->g(Lcom/google/android/gms/common/api/c;)Z

    move-result v0

    return v0
.end method

.method public ef()Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public isConnected()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/c$3;->Ek:Lcom/google/android/gms/common/api/c;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/c;->isConnected()Z

    move-result v0

    return v0
.end method
