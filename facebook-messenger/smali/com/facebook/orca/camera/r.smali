.class final Lcom/facebook/orca/camera/r;
.super Ljava/lang/Object;
.source "ImageManager.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/camera/ImageManager$ImageListParam;
    .locals 2

    .prologue
    .line 108
    new-instance v0, Lcom/facebook/orca/camera/ImageManager$ImageListParam;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/camera/ImageManager$ImageListParam;-><init>(Landroid/os/Parcel;Lcom/facebook/orca/camera/o;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/camera/ImageManager$ImageListParam;
    .locals 1

    .prologue
    .line 112
    new-array v0, p1, [Lcom/facebook/orca/camera/ImageManager$ImageListParam;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 106
    invoke-virtual {p0, p1}, Lcom/facebook/orca/camera/r;->a(Landroid/os/Parcel;)Lcom/facebook/orca/camera/ImageManager$ImageListParam;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 106
    invoke-virtual {p0, p1}, Lcom/facebook/orca/camera/r;->a(I)[Lcom/facebook/orca/camera/ImageManager$ImageListParam;

    move-result-object v0

    return-object v0
.end method
