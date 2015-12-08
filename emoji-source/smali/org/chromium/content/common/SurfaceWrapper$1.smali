.class final Lorg/chromium/content/common/SurfaceWrapper$1;
.super Ljava/lang/Object;
.source "SurfaceWrapper.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/common/SurfaceWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lorg/chromium/content/common/SurfaceWrapper;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # Landroid/os/Parcel;

    .prologue
    .line 37
    invoke-virtual {p0, p1}, Lorg/chromium/content/common/SurfaceWrapper$1;->createFromParcel(Landroid/os/Parcel;)Lorg/chromium/content/common/SurfaceWrapper;

    move-result-object v0

    return-object v0
.end method

.method public createFromParcel(Landroid/os/Parcel;)Lorg/chromium/content/common/SurfaceWrapper;
    .locals 2
    .param p1, "in"    # Landroid/os/Parcel;

    .prologue
    .line 39
    sget-object v1, Landroid/view/Surface;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v1, p1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Surface;

    .line 40
    .local v0, "surface":Landroid/view/Surface;
    new-instance v1, Lorg/chromium/content/common/SurfaceWrapper;

    invoke-direct {v1, v0}, Lorg/chromium/content/common/SurfaceWrapper;-><init>(Landroid/view/Surface;)V

    return-object v1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # I

    .prologue
    .line 37
    invoke-virtual {p0, p1}, Lorg/chromium/content/common/SurfaceWrapper$1;->newArray(I)[Lorg/chromium/content/common/SurfaceWrapper;

    move-result-object v0

    return-object v0
.end method

.method public newArray(I)[Lorg/chromium/content/common/SurfaceWrapper;
    .locals 1
    .param p1, "size"    # I

    .prologue
    .line 44
    new-array v0, p1, [Lorg/chromium/content/common/SurfaceWrapper;

    return-object v0
.end method
