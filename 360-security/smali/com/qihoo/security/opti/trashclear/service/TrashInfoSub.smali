.class public Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final CLEAR_TYPE_KEEP:I = 0x1

.field public static final CLEAR_TYPE_ONEKEY:I = 0x2

.field public static final CLEAR_TYPE_OTHER:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public appType:I

.field public appTypeFromDB:I

.field public argInt1:I

.field public argInt2:I

.field public argStr1:Ljava/lang/String;

.field public argStr2:Ljava/lang/String;

.field public clearAdvice:Ljava/lang/String;

.field public clearType:I

.field public dateNum:I

.field public desc:Ljava/lang/String;

.field public fileLength:J

.field public fileNum:J

.field public filePath:Ljava/lang/String;

.field public floderType:I

.field public hasMediaFile:Z

.field public id:I

.field public isChecked:Z

.field public isInDate:Z

.field public isWhiteList:Z

.field public list:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;",
            ">;"
        }
    .end annotation
.end field

.field public modifyTime:J

.field public multiPathList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public overlapList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;",
            ">;"
        }
    .end annotation
.end field

.field public parentInfo:Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;

.field public stringList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    new-instance v0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub$1;

    invoke-direct {v0}, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub$1;-><init>()V

    sput-object v0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    invoke-virtual {p0, p1}, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->readFromParcel(Landroid/os/Parcel;)V

    .line 54
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 69
    if-nez p1, :cond_1

    .line 79
    :cond_0
    return-void

    .line 73
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;

    .line 74
    if-eqz v0, :cond_2

    .line 77
    iget-boolean v2, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isChecked:Z

    invoke-virtual {v0, v2}, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->onChecked(Z)V

    goto :goto_0
.end method


# virtual methods
.method public clone()Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;
    .locals 4

    .prologue
    .line 150
    new-instance v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;

    invoke-direct {v1}, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;-><init>()V

    .line 151
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->id:I

    iput v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->id:I

    .line 152
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->desc:Ljava/lang/String;

    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->desc:Ljava/lang/String;

    .line 153
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->filePath:Ljava/lang/String;

    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->filePath:Ljava/lang/String;

    .line 154
    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->fileLength:J

    iput-wide v2, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->fileLength:J

    .line 155
    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->fileNum:J

    iput-wide v2, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->fileNum:J

    .line 156
    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->modifyTime:J

    iput-wide v2, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->modifyTime:J

    .line 157
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->hasMediaFile:Z

    iput-boolean v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->hasMediaFile:Z

    .line 158
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isChecked:Z

    iput-boolean v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isChecked:Z

    .line 159
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isWhiteList:Z

    iput-boolean v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isWhiteList:Z

    .line 160
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->appType:I

    iput v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->appType:I

    .line 161
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->appTypeFromDB:I

    iput v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->appTypeFromDB:I

    .line 162
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->floderType:I

    iput v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->floderType:I

    .line 163
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->clearType:I

    iput v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->clearType:I

    .line 164
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->clearAdvice:Ljava/lang/String;

    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->clearAdvice:Ljava/lang/String;

    .line 165
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argStr1:Ljava/lang/String;

    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argStr1:Ljava/lang/String;

    .line 166
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argStr2:Ljava/lang/String;

    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argStr2:Ljava/lang/String;

    .line 167
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argInt1:I

    iput v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argInt1:I

    .line 168
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argInt2:I

    iput v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argInt2:I

    .line 169
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->list:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->list:Ljava/util/List;

    .line 170
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->stringList:Ljava/util/List;

    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->stringList:Ljava/util/List;

    .line 171
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->parentInfo:Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->parentInfo:Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;

    .line 172
    new-instance v0, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->overlapList:Ljava/util/List;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->overlapList:Ljava/util/List;

    .line 173
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->multiPathList:Ljava/util/List;

    iput-object v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->multiPathList:Ljava/util/List;

    .line 174
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->dateNum:I

    iput v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->dateNum:I

    .line 175
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isInDate:Z

    iput-boolean v0, v1, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isInDate:Z

    .line 176
    return-object v1

    .line 171
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->parentInfo:Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->clone()Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;

    move-result-object v0

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
    .line 10
    invoke-virtual {p0}, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->clone()Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;

    move-result-object v0

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 180
    const/4 v0, 0x0

    return v0
.end method

.method public initChecked()V
    .locals 2

    .prologue
    .line 57
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->clearType:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isWhiteList:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isChecked:Z

    .line 58
    return-void

    .line 57
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onChecked(Z)V
    .locals 1

    .prologue
    .line 61
    iput-boolean p1, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isChecked:Z

    .line 63
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->list:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->a(Ljava/util/List;)V

    .line 65
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->overlapList:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->a(Ljava/util/List;)V

    .line 66
    return-void
.end method

.method public readFromParcel(Landroid/os/Parcel;)V
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 82
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->id:I

    .line 83
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->desc:Ljava/lang/String;

    .line 84
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->filePath:Ljava/lang/String;

    .line 85
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->fileLength:J

    .line 86
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->fileNum:J

    .line 87
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->modifyTime:J

    .line 88
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->hasMediaFile:Z

    .line 89
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_1

    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isChecked:Z

    .line 90
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_2

    move v0, v1

    :goto_2
    iput-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isWhiteList:Z

    .line 91
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->appType:I

    .line 92
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->appTypeFromDB:I

    .line 93
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->floderType:I

    .line 94
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->clearType:I

    .line 95
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->clearAdvice:Ljava/lang/String;

    .line 96
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argStr1:Ljava/lang/String;

    .line 97
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argStr2:Ljava/lang/String;

    .line 98
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argInt1:I

    .line 99
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argInt2:I

    .line 101
    :try_start_0
    const-class v0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->list:Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_3

    .line 105
    :goto_3
    :try_start_1
    const-class v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->stringList:Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2

    .line 108
    :goto_4
    const-class v0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->parentInfo:Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;

    .line 110
    :try_start_2
    const-class v0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->overlapList:Ljava/util/List;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    .line 114
    :goto_5
    :try_start_3
    const-class v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readArrayList(Ljava/lang/ClassLoader;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->multiPathList:Ljava/util/List;
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    .line 117
    :goto_6
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->dateNum:I

    .line 118
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-ne v0, v1, :cond_3

    :goto_7
    iput-boolean v1, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isInDate:Z

    .line 119
    return-void

    :cond_0
    move v0, v2

    .line 88
    goto/16 :goto_0

    :cond_1
    move v0, v2

    .line 89
    goto/16 :goto_1

    :cond_2
    move v0, v2

    .line 90
    goto/16 :goto_2

    :cond_3
    move v1, v2

    .line 118
    goto :goto_7

    .line 115
    :catch_0
    move-exception v0

    goto :goto_6

    .line 111
    :catch_1
    move-exception v0

    goto :goto_5

    .line 106
    :catch_2
    move-exception v0

    goto :goto_4

    .line 102
    :catch_3
    move-exception v0

    goto :goto_3
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 184
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    const-string/jumbo v0, "TrashInfo [id="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->id:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 187
    const-string/jumbo v0, ", desc="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->desc:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    const-string/jumbo v0, ", filePath="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->filePath:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    const-string/jumbo v0, ", fileLength="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->fileLength:J

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 193
    const-string/jumbo v0, ", fileNum="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->fileNum:J

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 195
    const-string/jumbo v0, ", modifyTime="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->modifyTime:J

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 197
    const-string/jumbo v0, ", hasMediaFile="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->hasMediaFile:Z

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 199
    const-string/jumbo v0, ", isChecked="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isChecked:Z

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 201
    const-string/jumbo v0, ", isWhiteList="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isWhiteList:Z

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 203
    const-string/jumbo v0, ", appType="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->appType:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 205
    const-string/jumbo v0, ", appTypeFromDB="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->appTypeFromDB:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 207
    const-string/jumbo v0, ", floderType="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->floderType:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 209
    const-string/jumbo v0, ", clearType="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->clearType:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 211
    const-string/jumbo v0, ", clearAdvice="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->clearAdvice:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    const-string/jumbo v0, ", argStr1="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argStr1:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 215
    const-string/jumbo v0, ", argStr2="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argStr2:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    const-string/jumbo v0, ", argInt1="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argInt1:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 219
    const-string/jumbo v0, ", argInt2="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argInt2:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 221
    const-string/jumbo v0, ", list="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->list:Ljava/util/List;

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 223
    const-string/jumbo v0, ", stringList="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->stringList:Ljava/util/List;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 225
    const-string/jumbo v0, ", parentInfo="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->parentInfo:Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 227
    const-string/jumbo v0, ", overlapList="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->overlapList:Ljava/util/List;

    if-nez v0, :cond_2

    :goto_2
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 229
    const-string/jumbo v0, ", multiPathList="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->multiPathList:Ljava/util/List;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 231
    const-string/jumbo v0, ", dayNum="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->dateNum:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 233
    const-string/jumbo v0, ", isInDay="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isInDate:Z

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 235
    const-string/jumbo v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 222
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->list:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v1

    .line 226
    goto :goto_1

    .line 228
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->overlapList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    goto :goto_2
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 122
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->id:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 123
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->desc:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 124
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->filePath:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 125
    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->fileLength:J

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    .line 126
    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->fileNum:J

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    .line 127
    iget-wide v4, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->modifyTime:J

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    .line 128
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->hasMediaFile:Z

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 129
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isChecked:Z

    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 130
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isWhiteList:Z

    if-eqz v0, :cond_2

    move v0, v1

    :goto_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 131
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->appType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 132
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->appTypeFromDB:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 133
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->floderType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 134
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->clearType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 135
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->clearAdvice:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 136
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argStr1:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 137
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argStr2:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 138
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argInt1:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 139
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->argInt2:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 140
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->list:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 141
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->stringList:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 142
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->parentInfo:Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 143
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->overlapList:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 144
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->multiPathList:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 145
    iget v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->dateNum:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 146
    iget-boolean v0, p0, Lcom/qihoo/security/opti/trashclear/service/TrashInfoSub;->isInDate:Z

    if-eqz v0, :cond_3

    :goto_3
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 147
    return-void

    :cond_0
    move v0, v2

    .line 128
    goto :goto_0

    :cond_1
    move v0, v2

    .line 129
    goto :goto_1

    :cond_2
    move v0, v2

    .line 130
    goto :goto_2

    :cond_3
    move v1, v2

    .line 146
    goto :goto_3
.end method
