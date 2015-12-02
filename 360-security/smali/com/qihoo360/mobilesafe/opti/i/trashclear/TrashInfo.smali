.class public Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;
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
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public bundle:Landroid/os/Bundle;

.field public clearAdvice:Ljava/lang/String;

.field public clearType:I

.field public count:J

.field public dataType:I

.field public desc:Ljava/lang/String;

.field public isInWhiteList:Z

.field public isSelected:Z

.field public packageName:Ljava/lang/String;

.field public path:Ljava/lang/String;

.field public size:J

.field public type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 86
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo$1;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo$1;-><init>()V

    sput-object v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 96
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    .line 49
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    .line 52
    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->readFromParcel(Landroid/os/Parcel;)V

    .line 53
    return-void
.end method


# virtual methods
.method public clone()Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;
    .locals 4

    .prologue
    .line 105
    new-instance v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-direct {v1}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;-><init>()V

    .line 106
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->desc:Ljava/lang/String;

    iput-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->desc:Ljava/lang/String;

    .line 107
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    iput-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    .line 108
    iget-wide v2, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    iput-wide v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    .line 109
    iget-wide v2, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->count:J

    iput-wide v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->count:J

    .line 110
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    iput-boolean v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    .line 111
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isInWhiteList:Z

    iput-boolean v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isInWhiteList:Z

    .line 112
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    iput v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    .line 113
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    iput v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    .line 114
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    iput v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    .line 115
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearAdvice:Ljava/lang/String;

    iput-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearAdvice:Ljava/lang/String;

    .line 116
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    iput-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    .line 117
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    .line 119
    return-object v1

    .line 117
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

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
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clone()Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    move-result-object v0

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 100
    const/4 v0, 0x0

    return v0
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->desc:Ljava/lang/String;

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    .line 58
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    .line 59
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->count:J

    .line 60
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    .line 61
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_1

    :goto_1
    iput-boolean v1, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isInWhiteList:Z

    .line 62
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    .line 63
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    .line 64
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    .line 65
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearAdvice:Ljava/lang/String;

    .line 66
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    .line 67
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    .line 68
    return-void

    :cond_0
    move v0, v2

    .line 60
    goto :goto_0

    :cond_1
    move v1, v2

    .line 61
    goto :goto_1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 153
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 72
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->desc:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 73
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->path:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 74
    iget-wide v4, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    .line 75
    iget-wide v4, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->count:J

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    .line 76
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isSelected:Z

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 77
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->isInWhiteList:Z

    if-eqz v0, :cond_1

    :goto_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 78
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 79
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->dataType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 80
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 81
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->clearAdvice:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 83
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->bundle:Landroid/os/Bundle;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 84
    return-void

    :cond_0
    move v0, v2

    .line 76
    goto :goto_0

    :cond_1
    move v1, v2

    .line 77
    goto :goto_1
.end method
