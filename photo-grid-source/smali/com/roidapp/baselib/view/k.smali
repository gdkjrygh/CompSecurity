.class final Lcom/roidapp/baselib/view/k;
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
        "Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1470
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 3473
    new-instance v0, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;

    invoke-direct {v0, p1}, Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;-><init>(Landroid/os/Parcel;)V

    .line 1470
    return-object v0
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1470
    .line 2478
    new-array v0, p1, [Lcom/roidapp/baselib/view/FixedDrawerLayout$SavedState;

    .line 1470
    return-object v0
.end method
