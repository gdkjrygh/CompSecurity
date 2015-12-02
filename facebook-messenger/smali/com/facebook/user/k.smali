.class final Lcom/facebook/user/k;
.super Ljava/lang/Object;
.source "PicCropInfo.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/user/PicCropInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/user/PicCropInfo;
    .locals 2

    .prologue
    .line 144
    new-instance v0, Lcom/facebook/user/PicCropInfo;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/user/PicCropInfo;-><init>(Landroid/os/Parcel;Lcom/facebook/user/k;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/user/PicCropInfo;
    .locals 1

    .prologue
    .line 148
    new-array v0, p1, [Lcom/facebook/user/PicCropInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 142
    invoke-virtual {p0, p1}, Lcom/facebook/user/k;->a(Landroid/os/Parcel;)Lcom/facebook/user/PicCropInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 142
    invoke-virtual {p0, p1}, Lcom/facebook/user/k;->a(I)[Lcom/facebook/user/PicCropInfo;

    move-result-object v0

    return-object v0
.end method
