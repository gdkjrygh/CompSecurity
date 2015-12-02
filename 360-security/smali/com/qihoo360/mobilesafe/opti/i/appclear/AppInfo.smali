.class public Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public appType:I

.field public bundle:Landroid/os/Bundle;

.field public packageName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo$1;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo$1;-><init>()V

    sput-object v0, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->bundle:Landroid/os/Bundle;

    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->bundle:Landroid/os/Bundle;

    .line 25
    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->readFromParcel(Landroid/os/Parcel;)V

    .line 26
    return-void
.end method


# virtual methods
.method public clone()Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;
    .locals 2

    .prologue
    .line 60
    new-instance v1, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;

    invoke-direct {v1}, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;-><init>()V

    .line 61
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->appType:I

    iput v0, v1, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->appType:I

    .line 62
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->packageName:Ljava/lang/String;

    iput-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->packageName:Ljava/lang/String;

    .line 63
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->bundle:Landroid/os/Bundle;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->bundle:Landroid/os/Bundle;

    .line 65
    return-object v1

    .line 63
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->bundle:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    goto :goto_0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->clone()Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;

    move-result-object v0

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x0

    return v0
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 29
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->appType:I

    .line 30
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->packageName:Ljava/lang/String;

    .line 31
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->bundle:Landroid/os/Bundle;

    .line 32
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 82
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 36
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->appType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 37
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 38
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/appclear/AppInfo;->bundle:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 39
    return-void
.end method
