.class final Lcom/facebook/abtest/qe/protocol/sync/b;
.super Ljava/lang/Object;
.source "SyncQuickExperimentParams.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;
    .locals 1

    .prologue
    .line 49
    new-instance v0, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;

    invoke-direct {v0, p1}, Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;
    .locals 1

    .prologue
    .line 53
    new-array v0, p1, [Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 47
    invoke-virtual {p0, p1}, Lcom/facebook/abtest/qe/protocol/sync/b;->a(Landroid/os/Parcel;)Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 47
    invoke-virtual {p0, p1}, Lcom/facebook/abtest/qe/protocol/sync/b;->a(I)[Lcom/facebook/abtest/qe/protocol/sync/SyncQuickExperimentParams;

    move-result-object v0

    return-object v0
.end method
