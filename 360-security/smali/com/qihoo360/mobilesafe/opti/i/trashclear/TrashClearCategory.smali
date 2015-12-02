.class public Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;
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
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public count:J

.field public desc:Ljava/lang/String;

.field public iconResId:I

.field public isClearMediaFile:Z

.field public isSelectedAll:Z

.field public selectedCount:J

.field public selectedSize:J

.field public size:J

.field public trashInfoList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
            ">;"
        }
    .end annotation
.end field

.field public type:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 85
    new-instance v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory$1;

    invoke-direct {v0}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory$1;-><init>()V

    sput-object v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 95
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->isClearMediaFile:Z

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    .line 42
    iput p1, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->type:I

    .line 43
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->isClearMediaFile:Z

    .line 39
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    .line 46
    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->readFromParcel(Landroid/os/Parcel;)V

    .line 47
    return-void
.end method


# virtual methods
.method public clone()Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;
    .locals 4

    .prologue
    .line 100
    new-instance v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->type:I

    invoke-direct {v1, v0}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;-><init>(I)V

    .line 101
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->iconResId:I

    iput v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->iconResId:I

    .line 102
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->desc:Ljava/lang/String;

    iput-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->desc:Ljava/lang/String;

    .line 103
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->type:I

    iput v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->type:I

    .line 104
    iget-wide v2, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->count:J

    iput-wide v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->count:J

    .line 105
    iget-wide v2, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->size:J

    iput-wide v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->size:J

    .line 106
    iget-wide v2, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->selectedCount:J

    iput-wide v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->selectedCount:J

    .line 107
    iget-wide v2, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->selectedSize:J

    iput-wide v2, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->selectedSize:J

    .line 108
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->isSelectedAll:Z

    iput-boolean v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->isSelectedAll:Z

    .line 109
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->isClearMediaFile:Z

    iput-boolean v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->isClearMediaFile:Z

    .line 110
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, v1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    .line 111
    return-object v1

    .line 110
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

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
    invoke-virtual {p0}, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->clone()Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;

    move-result-object v0

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 82
    const/4 v0, 0x0

    return v0
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 51
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->iconResId:I

    .line 52
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->desc:Ljava/lang/String;

    .line 53
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->type:I

    .line 54
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->count:J

    .line 55
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->size:J

    .line 56
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->selectedCount:J

    .line 57
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->selectedSize:J

    .line 58
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->isSelectedAll:Z

    .line 59
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_1

    :goto_1
    iput-boolean v1, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->isClearMediaFile:Z

    .line 61
    :try_start_0
    const-class v0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    :goto_2
    return-void

    :cond_0
    move v0, v2

    .line 58
    goto :goto_0

    :cond_1
    move v1, v2

    .line 59
    goto :goto_1

    .line 62
    :catch_0
    move-exception v0

    goto :goto_2
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 68
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->iconResId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 69
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->desc:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 70
    iget v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 71
    iget-wide v4, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->count:J

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    .line 72
    iget-wide v4, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->size:J

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    .line 73
    iget-wide v4, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->selectedCount:J

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    .line 74
    iget-wide v4, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->selectedSize:J

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    .line 75
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->isSelectedAll:Z

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 76
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->isClearMediaFile:Z

    if-eqz v0, :cond_1

    :goto_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 77
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashClearCategory;->trashInfoList:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 78
    return-void

    :cond_0
    move v0, v2

    .line 75
    goto :goto_0

    :cond_1
    move v1, v2

    .line 76
    goto :goto_1
.end method
