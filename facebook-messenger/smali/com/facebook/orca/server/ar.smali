.class final Lcom/facebook/orca/server/ar;
.super Ljava/lang/Object;
.source "ReadReceiptParams.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/server/ReadReceiptParams;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/server/ReadReceiptParams;
    .locals 2

    .prologue
    .line 46
    new-instance v0, Lcom/facebook/orca/server/ReadReceiptParams;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/server/ReadReceiptParams;-><init>(Landroid/os/Parcel;Lcom/facebook/orca/server/ar;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/server/ReadReceiptParams;
    .locals 1

    .prologue
    .line 50
    new-array v0, p1, [Lcom/facebook/orca/server/ReadReceiptParams;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 44
    invoke-virtual {p0, p1}, Lcom/facebook/orca/server/ar;->a(Landroid/os/Parcel;)Lcom/facebook/orca/server/ReadReceiptParams;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 44
    invoke-virtual {p0, p1}, Lcom/facebook/orca/server/ar;->a(I)[Lcom/facebook/orca/server/ReadReceiptParams;

    move-result-object v0

    return-object v0
.end method
