.class Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;
.super Landroid/view/View$BaseSavedState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field a:I

.field b:I

.field c:I

.field d:I

.field e:I

.field f:Landroid/util/SparseIntArray;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 528
    new-instance v0, Lcom/github/ksoichiro/android/observablescrollview/c;

    invoke-direct {v0}, Lcom/github/ksoichiro/android/observablescrollview/c;-><init>()V

    sput-object v0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 5

    .prologue
    .line 493
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 476
    const/4 v0, -0x1

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->b:I

    .line 494
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->a:I

    .line 495
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->b:I

    .line 496
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->c:I

    .line 497
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->d:I

    .line 498
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->e:I

    .line 499
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->f:Landroid/util/SparseIntArray;

    .line 500
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 501
    if-lez v1, :cond_0

    .line 502
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    .line 503
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 504
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 505
    iget-object v4, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->f:Landroid/util/SparseIntArray;

    invoke-virtual {v4, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    .line 502
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 508
    :cond_0
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;B)V
    .locals 0

    .prologue
    .line 474
    invoke-direct {p0, p1}, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .locals 1

    .prologue
    .line 486
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 476
    const/4 v0, -0x1

    iput v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->b:I

    .line 487
    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 512
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 513
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 514
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 515
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 516
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 517
    iget v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->e:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 518
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->f:Landroid/util/SparseIntArray;

    if-nez v0, :cond_0

    move v0, v1

    .line 519
    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 520
    if-lez v0, :cond_1

    .line 521
    :goto_1
    if-ge v1, v0, :cond_1

    .line 522
    iget-object v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->f:Landroid/util/SparseIntArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 523
    iget-object v2, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->f:Landroid/util/SparseIntArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 521
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 518
    :cond_0
    iget-object v0, p0, Lcom/github/ksoichiro/android/observablescrollview/ObservableGridView$SavedState;->f:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->size()I

    move-result v0

    goto :goto_0

    .line 526
    :cond_1
    return-void
.end method
