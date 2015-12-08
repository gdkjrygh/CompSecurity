.class final Lcom/roidapp/imagelib/filter/groupinfo/c;
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
        "Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 2048
    new-instance v0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;-><init>(Landroid/os/Parcel;B)V

    .line 2049
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;->b:I

    .line 2050
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;->c:I

    .line 2051
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;->d:I

    .line 44
    return-object v0
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 44
    .line 1057
    new-array v0, p1, [Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 44
    return-object v0
.end method
