.class final Lcom/roidapp/baselib/hlistview/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1439
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 3443
    new-instance v0, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;-><init>(Landroid/os/Parcel;B)V

    .line 1439
    return-object v0
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1439
    .line 2448
    new-array v0, p1, [Lcom/roidapp/baselib/hlistview/AbsHListView$SavedState;

    .line 1439
    return-object v0
.end method
