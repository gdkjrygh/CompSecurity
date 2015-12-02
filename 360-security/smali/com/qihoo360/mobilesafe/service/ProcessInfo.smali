.class public final Lcom/qihoo360/mobilesafe/service/ProcessInfo;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CATE_ACCOUNT:I = 0x66

.field public static final CATE_ADJ:I = 0x67

.field public static final CATE_BLUETHOOTH:I = 0x68

.field public static final CATE_COLOCK:I = 0x64

.field public static final CATE_MUSIC:I = 0x65

.field public static final CATE_NONE:I = 0x0

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;"
        }
    .end annotation
.end field

.field public static final FLAG_HIDE:I = 0x1

.field public static final FLAG_NONE:I = 0x0

.field public static final FLAG_NOT_RECOMMENDED_TO_KILL:I = 0x3

.field public static final FLAG_SPECAIL:I = 0x4

.field public static final FLAG_WHITE_LIST:I = 0x2

.field public static final STATUS_KILLING:I = 0x2

.field public static final STATUS_RUNNING:I = 0x1

.field public static final STATUS_STOPED:I = 0x3


# instance fields
.field public category:I

.field public components:[Ljava/lang/String;

.field public flag:I

.field public importance:I

.field public isSystem:Z

.field public packageName:Ljava/lang/String;

.field public pids:[I

.field public processName:Ljava/lang/String;

.field public services:[Ljava/lang/String;

.field public status:B

.field public useMemory:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 143
    new-instance v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo$1;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/service/ProcessInfo$1;-><init>()V

    sput-object v0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 151
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput v1, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->useMemory:I

    .line 59
    const/16 v0, 0x1f4

    iput v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->importance:I

    .line 61
    iput v1, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    .line 62
    iput v1, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->category:I

    .line 68
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->status:B

    .line 79
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput v1, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->useMemory:I

    .line 59
    const/16 v0, 0x1f4

    iput v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->importance:I

    .line 61
    iput v1, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    .line 62
    iput v1, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->category:I

    .line 68
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->status:B

    .line 82
    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->readFromParcel(Landroid/os/Parcel;)V

    .line 83
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/qihoo360/mobilesafe/service/ProcessInfo;)V
    .locals 0

    .prologue
    .line 81
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/service/ProcessInfo;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 135
    const/4 v0, 0x0

    return v0
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 104
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    .line 105
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->useMemory:I

    .line 106
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->importance:I

    .line 107
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    .line 110
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    iput-byte v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->status:B

    .line 111
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->components:[Ljava/lang/String;

    .line 112
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->services:[Ljava/lang/String;

    .line 113
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->pids:[I

    .line 114
    const/4 v0, 0x1

    new-array v0, v0, [Z

    .line 115
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readBooleanArray([Z)V

    .line 116
    const/4 v1, 0x0

    aget-boolean v0, v0, v1

    iput-boolean v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->isSystem:Z

    .line 117
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 155
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "ProcessInfo [packageName="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", useMemory="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->useMemory:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", importance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->importance:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 156
    const-string/jumbo v1, ", flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 157
    const-string/jumbo v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-byte v1, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->status:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", components="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->components:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 158
    const-string/jumbo v1, ", services="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->services:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", pid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->pids:[I

    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", isSystem="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 159
    iget-boolean v1, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->isSystem:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;)V
    .locals 3

    .prologue
    .line 120
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 121
    iget v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->useMemory:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 122
    iget v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->importance:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 123
    iget v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->flag:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 126
    iget-byte v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->status:B

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 127
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->components:[Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 128
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->services:[Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 129
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->pids:[I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 130
    const/4 v0, 0x1

    new-array v0, v0, [Z

    const/4 v1, 0x0

    iget-boolean v2, p0, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->isSystem:Z

    aput-boolean v2, v0, v1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBooleanArray([Z)V

    .line 131
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .prologue
    .line 140
    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/service/ProcessInfo;->writeToParcel(Landroid/os/Parcel;)V

    .line 141
    return-void
.end method
