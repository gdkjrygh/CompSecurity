.class public Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;
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
            "Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public appName:Ljava/lang/String;

.field public bundle:Landroid/os/Bundle;

.field public clearMemory:I

.field public clearablePids:[I

.field public componentsToForbit:[Ljava/lang/String;

.field public flag:I

.field public importance:I

.field public isDefaultChoosen:B

.field public packageName:Ljava/lang/String;

.field public pids:[I

.field public services:[Ljava/lang/String;

.field public status:B

.field public type:I

.field public uid:I

.field public usedMemory:I

.field public userSelection:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 199
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo$1;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo$1;-><init>()V

    sput-object v0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 209
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput v2, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->usedMemory:I

    .line 26
    const/16 v0, 0x1f4

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->importance:I

    .line 29
    iput v2, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->flag:I

    .line 32
    iput-byte v1, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->isDefaultChoosen:B

    .line 35
    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->userSelection:I

    .line 38
    iput-byte v1, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->status:B

    .line 56
    iput v1, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->type:I

    .line 62
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->bundle:Landroid/os/Bundle;

    .line 66
    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput v2, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->usedMemory:I

    .line 26
    const/16 v0, 0x1f4

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->importance:I

    .line 29
    iput v2, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->flag:I

    .line 32
    iput-byte v1, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->isDefaultChoosen:B

    .line 35
    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->userSelection:I

    .line 38
    iput-byte v1, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->status:B

    .line 56
    iput v1, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->type:I

    .line 62
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->bundle:Landroid/os/Bundle;

    .line 69
    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->readFromParcel(Landroid/os/Parcel;)V

    .line 70
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;)V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0, p1}, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .prologue
    .line 191
    const/4 v0, 0x0

    return v0
.end method

.method public getClearType()I
    .locals 5

    .prologue
    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v0, 0x1

    .line 128
    .line 129
    iget v3, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->userSelection:I

    if-ne v0, v3, :cond_1

    .line 148
    :cond_0
    :goto_0
    return v0

    .line 131
    :cond_1
    iget v3, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->userSelection:I

    if-nez v3, :cond_3

    .line 132
    iget v3, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->flag:I

    if-ne v0, v3, :cond_2

    move v0, v1

    .line 134
    goto :goto_0

    :cond_2
    move v0, v2

    .line 137
    goto :goto_0

    :cond_3
    const/4 v3, -0x1

    iget v4, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->userSelection:I

    if-ne v3, v4, :cond_5

    .line 138
    iget v3, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->flag:I

    if-ne v0, v3, :cond_4

    move v0, v1

    .line 140
    goto :goto_0

    .line 141
    :cond_4
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->shouldSelect()Z

    move-result v1

    if-nez v1, :cond_0

    move v0, v2

    .line 144
    goto :goto_0

    :cond_5
    move v0, v2

    goto :goto_0
.end method

.method public initSelected()V
    .locals 1

    .prologue
    .line 83
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->isWhiteList()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    const/4 v0, 0x0

    iput-byte v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->isDefaultChoosen:B

    .line 88
    :goto_0
    return-void

    .line 86
    :cond_0
    const/4 v0, 0x1

    iput-byte v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->isDefaultChoosen:B

    goto :goto_0
.end method

.method public isInternalWhiteList()Z
    .locals 2

    .prologue
    .line 115
    .line 116
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->flag:I

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    iget v1, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->flag:I

    if-ne v0, v1, :cond_1

    .line 117
    :cond_0
    const/4 v0, 0x0

    .line 121
    :goto_0
    return v0

    .line 119
    :cond_1
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public isWhiteList()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 94
    .line 95
    iget v2, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->userSelection:I

    packed-switch v2, :pswitch_data_0

    .line 103
    iget v2, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->flag:I

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    iget v3, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->flag:I

    if-ne v2, v3, :cond_1

    :cond_0
    move v0, v1

    .line 110
    :cond_1
    :goto_0
    :pswitch_0
    return v0

    :pswitch_1
    move v0, v1

    .line 101
    goto :goto_0

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 152
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->packageName:Ljava/lang/String;

    .line 153
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->appName:Ljava/lang/String;

    .line 154
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->usedMemory:I

    .line 155
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->importance:I

    .line 156
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->flag:I

    .line 157
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    iput-byte v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->isDefaultChoosen:B

    .line 158
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->userSelection:I

    .line 159
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    iput-byte v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->status:B

    .line 160
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->componentsToForbit:[Ljava/lang/String;

    .line 161
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->services:[Ljava/lang/String;

    .line 162
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->pids:[I

    .line 163
    invoke-virtual {p1}, Landroid/os/Parcel;->createIntArray()[I

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->clearablePids:[I

    .line 164
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->uid:I

    .line 165
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->type:I

    .line 166
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->clearMemory:I

    .line 167
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->bundle:Landroid/os/Bundle;

    .line 168
    return-void
.end method

.method public shouldSelect()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 78
    iget-byte v1, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->isDefaultChoosen:B

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 171
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 172
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->appName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 173
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->usedMemory:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 174
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->importance:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 175
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->flag:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 176
    iget-byte v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->isDefaultChoosen:B

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 177
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->userSelection:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 178
    iget-byte v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->status:B

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 179
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->componentsToForbit:[Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 180
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->services:[Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 181
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->pids:[I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 182
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->clearablePids:[I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeIntArray([I)V

    .line 183
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->uid:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 184
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 185
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->clearMemory:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 186
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->bundle:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 187
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .prologue
    .line 196
    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/opti/i/processclear/AppPackageInfo;->writeToParcel(Landroid/os/Parcel;)V

    .line 197
    return-void
.end method
