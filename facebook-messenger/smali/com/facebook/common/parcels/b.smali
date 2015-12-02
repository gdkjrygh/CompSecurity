.class final Lcom/facebook/common/parcels/b;
.super Ljava/lang/Object;
.source "ParcelableBoolean.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/common/parcels/ParcelableBoolean;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/common/parcels/ParcelableBoolean;
    .locals 2

    .prologue
    .line 36
    new-instance v1, Lcom/facebook/common/parcels/ParcelableBoolean;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-direct {v1, v0}, Lcom/facebook/common/parcels/ParcelableBoolean;-><init>(Z)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(I)[Lcom/facebook/common/parcels/ParcelableBoolean;
    .locals 1

    .prologue
    .line 41
    new-array v0, p1, [Lcom/facebook/common/parcels/ParcelableBoolean;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 32
    invoke-virtual {p0, p1}, Lcom/facebook/common/parcels/b;->a(Landroid/os/Parcel;)Lcom/facebook/common/parcels/ParcelableBoolean;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 32
    invoke-virtual {p0, p1}, Lcom/facebook/common/parcels/b;->a(I)[Lcom/facebook/common/parcels/ParcelableBoolean;

    move-result-object v0

    return-object v0
.end method
