.class Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 199
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;
    .locals 2

    .prologue
    .line 202
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;-><init>(Landroid/os/Parcel;Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;)V

    return-object v0
.end method

.method public a(I)[Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;
    .locals 1

    .prologue
    .line 207
    new-array v0, p1, [Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo$1;->a(Landroid/os/Parcel;)Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo$1;->a(I)[Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;

    move-result-object v0

    return-object v0
.end method
