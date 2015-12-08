.class Lkik/android/widget/ProgressWheel$WheelSavedState;
.super Landroid/view/View$BaseSavedState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/widget/ProgressWheel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "WheelSavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field a:F

.field b:F

.field c:Z

.field d:F

.field e:I

.field f:I

.field g:I

.field h:I

.field i:I

.field j:Z

.field k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 758
    new-instance v0, Lkik/android/widget/da;

    invoke-direct {v0}, Lkik/android/widget/da;-><init>()V

    sput-object v0, Lkik/android/widget/ProgressWheel$WheelSavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 726
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 727
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->a:F

    .line 728
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->b:F

    .line 729
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->c:Z

    .line 730
    invoke-virtual {p1}, Landroid/os/Parcel;->readFloat()F

    move-result v0

    iput v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->d:F

    .line 731
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->e:I

    .line 732
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->f:I

    .line 733
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->g:I

    .line 734
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->h:I

    .line 735
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->i:I

    .line 736
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    iput-boolean v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->j:Z

    .line 737
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_2

    :goto_2
    iput-boolean v1, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->k:Z

    .line 738
    return-void

    :cond_0
    move v0, v2

    .line 729
    goto :goto_0

    :cond_1
    move v0, v2

    .line 736
    goto :goto_1

    :cond_2
    move v1, v2

    .line 737
    goto :goto_2
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;B)V
    .locals 0

    .prologue
    .line 705
    invoke-direct {p0, p1}, Lkik/android/widget/ProgressWheel$WheelSavedState;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method constructor <init>(Landroid/os/Parcelable;)V
    .locals 0

    .prologue
    .line 721
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 722
    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 743
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 744
    iget v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->a:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 745
    iget v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->b:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 746
    iget-boolean v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->c:Z

    if-eqz v0, :cond_0

    move v0, v1

    :goto_0
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 747
    iget v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->d:F

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 748
    iget v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->e:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 749
    iget v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->f:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 750
    iget v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->g:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 751
    iget v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->h:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 752
    iget v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->i:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 753
    iget-boolean v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->j:Z

    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 754
    iget-boolean v0, p0, Lkik/android/widget/ProgressWheel$WheelSavedState;->k:Z

    if-eqz v0, :cond_2

    :goto_2
    int-to-byte v0, v1

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 755
    return-void

    :cond_0
    move v0, v2

    .line 746
    goto :goto_0

    :cond_1
    move v0, v2

    .line 753
    goto :goto_1

    :cond_2
    move v1, v2

    .line 754
    goto :goto_2
.end method
