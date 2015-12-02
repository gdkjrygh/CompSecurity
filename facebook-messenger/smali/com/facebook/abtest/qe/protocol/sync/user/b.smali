.class final Lcom/facebook/abtest/qe/protocol/sync/user/b;
.super Ljava/lang/Object;
.source "SyncQuickExperimentUserInfoResult.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;
    .locals 1

    .prologue
    .line 60
    new-instance v0, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;

    invoke-direct {v0, p1}, Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;
    .locals 1

    .prologue
    .line 65
    new-array v0, p1, [Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0, p1}, Lcom/facebook/abtest/qe/protocol/sync/user/b;->a(Landroid/os/Parcel;)Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0, p1}, Lcom/facebook/abtest/qe/protocol/sync/user/b;->a(I)[Lcom/facebook/abtest/qe/protocol/sync/user/SyncQuickExperimentUserInfoResult;

    move-result-object v0

    return-object v0
.end method
