.class final Lcom/facebook/orca/protocol/methods/av;
.super Ljava/lang/Object;
.source "SendWebrtcMessageMethod.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;
    .locals 1

    .prologue
    .line 55
    new-instance v0, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;

    invoke-direct {v0, p1}, Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;
    .locals 1

    .prologue
    .line 59
    new-array v0, p1, [Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 53
    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/av;->a(Landroid/os/Parcel;)Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 53
    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/av;->a(I)[Lcom/facebook/orca/protocol/methods/SendWebrtcMessageMethod$Params;

    move-result-object v0

    return-object v0
.end method
