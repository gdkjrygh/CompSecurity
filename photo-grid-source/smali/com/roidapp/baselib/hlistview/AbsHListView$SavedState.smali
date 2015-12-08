.class Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;
.super Landroid/view/View$BaseSavedState;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:J

.field b:J

.field c:I

.field d:I

.field e:I

.field f:Ljava/lang/String;

.field g:Z

.field h:I

.field i:Landroid/support/v4/util/SparseArrayCompat;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/SparseArrayCompat",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field j:Landroid/support/v4/util/LongSparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/util/LongSparseArray",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 1439
    new-instance v0, Lcom/roidapp/baselib/hlistview/o;

    invoke-direct {v0}, Lcom/roidapp/baselib/hlistview/o;-><init>()V

    sput-object v0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 1309
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 1310
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->a:J

    .line 1311
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->b:J

    .line 1312
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->c:I

    .line 1313
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->d:I

    .line 1314
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->e:I

    .line 1315
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->f:Ljava/lang/String;

    .line 1316
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->g:Z

    .line 1317
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->h:I

    .line 2339
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 2340
    if-gez v2, :cond_1

    move-object v0, v1

    .line 1318
    :goto_1
    iput-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->i:Landroid/support/v4/util/SparseArrayCompat;

    .line 3326
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    .line 3327
    if-gtz v0, :cond_2

    .line 1319
    :goto_2
    iput-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->j:Landroid/support/v4/util/LongSparseArray;

    .line 1320
    return-void

    .line 1316
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 2343
    :cond_1
    new-instance v0, Landroid/support/v4/util/SparseArrayCompat;

    invoke-direct {v0, v2}, Landroid/support/v4/util/SparseArrayCompat;-><init>(I)V

    .line 2344
    invoke-static {v0, p1, v2}, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->a(Landroid/support/v4/util/SparseArrayCompat;Landroid/os/Parcel;I)V

    goto :goto_1

    .line 3330
    :cond_2
    new-instance v1, Landroid/support/v4/util/LongSparseArray;

    invoke-direct {v1, v0}, Landroid/support/v4/util/LongSparseArray;-><init>(I)V

    .line 3331
    invoke-static {v1, p1, v0}, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->a(Landroid/support/v4/util/LongSparseArray;Landroid/os/Parcel;I)V

    goto :goto_2
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;B)V
    .locals 0

    .prologue
    .line 1285
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .locals 0

    .prologue
    .line 1302
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1303
    return-void
.end method

.method private static a(Landroid/support/v4/util/LongSparseArray;Landroid/os/Parcel;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/util/LongSparseArray",
            "<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroid/os/Parcel;",
            "I)V"
        }
    .end annotation

    .prologue
    .line 1349
    :goto_0
    if-lez p2, :cond_0

    .line 1350
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    .line 1351
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 1355
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 1356
    add-int/lit8 p2, p2, -0x1

    .line 1357
    goto :goto_0

    .line 1358
    :cond_0
    return-void
.end method

.method private static a(Landroid/support/v4/util/SparseArrayCompat;Landroid/os/Parcel;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/util/SparseArrayCompat",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroid/os/Parcel;",
            "I)V"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    .line 1361
    :goto_0
    if-lez p2, :cond_1

    .line 1362
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 1363
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-ne v0, v1, :cond_0

    move v0, v1

    .line 1367
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Landroid/support/v4/util/SparseArrayCompat;->append(ILjava/lang/Object;)V

    .line 1368
    add-int/lit8 p2, p2, -0x1

    .line 1369
    goto :goto_0

    .line 1363
    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    .line 1370
    :cond_1
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 1428
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AbsListView.SavedState{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " selectedId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->a:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " firstId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->b:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " viewLeft="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " position="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " filter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " checkState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->i:Landroid/support/v4/util/SparseArrayCompat;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1407
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 1408
    iget-wide v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->a:J

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    .line 1409
    iget-wide v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->b:J

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    .line 1410
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1411
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1412
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->e:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1413
    iget-object v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1414
    iget-boolean v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->g:Z

    if-eqz v0, :cond_1

    move v0, v1

    :goto_0
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1415
    iget v0, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->h:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1422
    iget-object v4, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->i:Landroid/support/v4/util/SparseArrayCompat;

    .line 3388
    if-nez v4, :cond_2

    .line 3389
    const/4 v0, -0x1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1423
    :cond_0
    iget-object v3, p0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;->j:Landroid/support/v4/util/LongSparseArray;

    .line 4376
    if-eqz v3, :cond_4

    invoke-virtual {v3}, Landroid/support/v4/util/LongSparseArray;->size()I

    move-result v0

    move v1, v0

    .line 4377
    :goto_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 4378
    :goto_2
    if-ge v2, v1, :cond_5

    .line 4379
    invoke-virtual {v3, v2}, Landroid/support/v4/util/LongSparseArray;->keyAt(I)J

    move-result-wide v4

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    .line 4380
    invoke-virtual {v3, v2}, Landroid/support/v4/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 4378
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_1
    move v0, v2

    .line 1414
    goto :goto_0

    .line 3392
    :cond_2
    invoke-virtual {v4}, Landroid/support/v4/util/SparseArrayCompat;->size()I

    move-result v5

    .line 3393
    invoke-virtual {p1, v5}, Landroid/os/Parcel;->writeInt(I)V

    move v3, v2

    .line 3395
    :goto_3
    if-ge v3, v5, :cond_0

    .line 3396
    invoke-virtual {v4, v3}, Landroid/support/v4/util/SparseArrayCompat;->keyAt(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 3397
    invoke-virtual {v4, v3}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v1

    :goto_4
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 3398
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_3

    :cond_3
    move v0, v2

    .line 3397
    goto :goto_4

    :cond_4
    move v1, v2

    .line 4376
    goto :goto_1

    .line 1424
    :cond_5
    return-void
.end method
