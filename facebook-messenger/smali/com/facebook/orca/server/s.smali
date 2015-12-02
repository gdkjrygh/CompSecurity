.class final Lcom/facebook/orca/server/s;
.super Ljava/lang/Object;
.source "FetchMultipleThreadsParams.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/server/FetchMultipleThreadsParams;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/server/FetchMultipleThreadsParams;
    .locals 2

    .prologue
    .line 104
    new-instance v0, Lcom/facebook/orca/server/FetchMultipleThreadsParams;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/server/FetchMultipleThreadsParams;-><init>(Landroid/os/Parcel;Lcom/facebook/orca/server/s;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/server/FetchMultipleThreadsParams;
    .locals 1

    .prologue
    .line 108
    new-array v0, p1, [Lcom/facebook/orca/server/FetchMultipleThreadsParams;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 102
    invoke-virtual {p0, p1}, Lcom/facebook/orca/server/s;->a(Landroid/os/Parcel;)Lcom/facebook/orca/server/FetchMultipleThreadsParams;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 102
    invoke-virtual {p0, p1}, Lcom/facebook/orca/server/s;->a(I)[Lcom/facebook/orca/server/FetchMultipleThreadsParams;

    move-result-object v0

    return-object v0
.end method
