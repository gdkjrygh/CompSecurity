.class public Lcom/qihoo/security/services/ScanResult;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/qihoo/security/services/ScanResult;",
            ">;"
        }
    .end annotation
.end field

.field public static final RID_AVEM_AVE:B = 0x61t

.field public static final RID_AVEM_AVEX:B = 0x60t

.field public static final RID_AVEM_HEURMOD:B = 0x63t

.field public static final RID_AVEM_PRESCAN:B = 0x62t

.field public static final RID_AVEM_VSIG:B = 0x1t

.field public static final STATE_ADSCAN:I = 0xb

.field public static final STATE_AVE:I = 0x7

.field public static final STATE_BITDEFENDER:I = 0x6

.field public static final STATE_CLOUD:I = 0x1

.field public static final STATE_CLOUDRULE:I = 0x2

.field public static final STATE_CLOUD_QVM:I = 0x9

.field public static final STATE_FIN:I = 0x7f

.field public static final STATE_INIT:I = 0x0

.field public static final STATE_LOCAL_QVM:I = 0x8

.field public static final STATE_POPSOFT:I = 0x3

.field public static final STATE_QEX:I = 0xa


# instance fields
.field public fileInfo:Lcom/qihoo/security/engine/FileInfo;

.field public notifyMessage:Ljava/lang/String;

.field public notifyResult:I

.field public operatinType:I

.field public rescan:I

.field public riskClass:I

.field public riskDescription:Ljava/lang/String;

.field public ruleid:I

.field public state:I

.field public tipsInfo:Ljava/lang/String;

.field public trusted:I

.field public type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/qihoo/security/services/ScanResult$1;

    invoke-direct {v0}, Lcom/qihoo/security/services/ScanResult$1;-><init>()V

    sput-object v0, Lcom/qihoo/security/services/ScanResult;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/services/ScanResult;->riskClass:I

    iput v1, p0, Lcom/qihoo/security/services/ScanResult;->rescan:I

    iput v1, p0, Lcom/qihoo/security/services/ScanResult;->ruleid:I

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/FileInfo;

    iput-object v0, p0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/services/ScanResult;->riskClass:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/services/ScanResult;->riskDescription:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/services/ScanResult;->state:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/services/ScanResult;->ruleid:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/services/ScanResult;->rescan:I

    return-void
.end method

.method public constructor <init>(Lcom/qihoo/security/engine/FileInfo;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/services/ScanResult;->riskClass:I

    iput v1, p0, Lcom/qihoo/security/services/ScanResult;->rescan:I

    iput v1, p0, Lcom/qihoo/security/services/ScanResult;->ruleid:I

    iput-object p1, p0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iput v1, p0, Lcom/qihoo/security/services/ScanResult;->state:I

    return-void
.end method

.method public constructor <init>(Lcom/qihoo/security/engine/d/b;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/services/ScanResult;->riskClass:I

    iput v1, p0, Lcom/qihoo/security/services/ScanResult;->rescan:I

    iput v1, p0, Lcom/qihoo/security/services/ScanResult;->ruleid:I

    iget-object v0, p1, Lcom/qihoo/security/engine/d/b;->c:Lcom/qihoo/security/engine/FileInfo;

    iput-object v0, p0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iput v1, p0, Lcom/qihoo/security/services/ScanResult;->state:I

    return-void
.end method


# virtual methods
.method a(Landroid/os/Parcel;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/FileInfo;

    iput-object v0, p0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/services/ScanResult;->riskClass:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/services/ScanResult;->riskDescription:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/services/ScanResult;->state:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/services/ScanResult;->ruleid:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/services/ScanResult;->rescan:I

    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v1, p1, Lcom/qihoo/security/services/ScanResult;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/qihoo/security/services/ScanResult;

    iget v1, p1, Lcom/qihoo/security/services/ScanResult;->state:I

    iget v2, p0, Lcom/qihoo/security/services/ScanResult;->state:I

    if-ne v1, v2, :cond_0

    iget v1, p1, Lcom/qihoo/security/services/ScanResult;->riskClass:I

    iget v2, p0, Lcom/qihoo/security/services/ScanResult;->riskClass:I

    if-ne v1, v2, :cond_0

    iget v1, p1, Lcom/qihoo/security/services/ScanResult;->ruleid:I

    iget v2, p0, Lcom/qihoo/security/services/ScanResult;->ruleid:I

    if-ne v1, v2, :cond_0

    iget-object v0, p1, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    iget-object v1, p0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/engine/FileInfo;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/FileInfo;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget-object v0, p0, Lcom/qihoo/security/services/ScanResult;->fileInfo:Lcom/qihoo/security/engine/FileInfo;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget v0, p0, Lcom/qihoo/security/services/ScanResult;->riskClass:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/qihoo/security/services/ScanResult;->riskDescription:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/qihoo/security/services/ScanResult;->state:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/qihoo/security/services/ScanResult;->ruleid:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/qihoo/security/services/ScanResult;->rescan:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
