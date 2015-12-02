.class public Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;
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
            "Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public apkIconID:I

.field public apkVersionCode:I

.field public apkVersionName:Ljava/lang/String;

.field public clearType:I

.field public dataType:I

.field public desc:Ljava/lang/String;

.field public modifyTime:J

.field public packageName:Ljava/lang/String;

.field public path:Ljava/lang/String;

.field public size:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 77
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo$1;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo$1;-><init>()V

    sput-object v0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 87
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->readFromParcel(Landroid/os/Parcel;)V

    .line 48
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 91
    const/4 v0, 0x0

    return v0
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->desc:Ljava/lang/String;

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->path:Ljava/lang/String;

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->size:J

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->dataType:I

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->clearType:I

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->apkVersionName:Ljava/lang/String;

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->apkVersionCode:I

    .line 58
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->apkIconID:I

    .line 59
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->packageName:Ljava/lang/String;

    .line 60
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->modifyTime:J

    .line 61
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .prologue
    .line 65
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->desc:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 66
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->path:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 67
    iget-wide v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->size:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 68
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->dataType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 69
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->clearType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 70
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->apkVersionName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 71
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->apkVersionCode:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 72
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->apkIconID:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 73
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 74
    iget-wide v0, p0, Lcom/qihoo360/mobilesafe/opti/i/plugins/ApkInfo;->modifyTime:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 75
    return-void
.end method
