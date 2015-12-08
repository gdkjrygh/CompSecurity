.class public Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;
.super Landroid/view/View$BaseSavedState;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field a:I

.field b:I

.field c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 1469
    new-instance v0, Lcom/roidapp/baselib/view/k;

    invoke-direct {v0}, Lcom/roidapp/baselib/view/k;-><init>()V

    sput-object v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 1455
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    .line 1450
    iput v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;->a:I

    .line 1451
    iput v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;->b:I

    .line 1452
    iput v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;->c:I

    .line 1456
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;->a:I

    .line 1457
    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 1460
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1450
    iput v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;->a:I

    .line 1451
    iput v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;->b:I

    .line 1452
    iput v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;->c:I

    .line 1461
    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 1465
    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    .line 1466
    iget v0, p0, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;->a:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1467
    return-void
.end method
