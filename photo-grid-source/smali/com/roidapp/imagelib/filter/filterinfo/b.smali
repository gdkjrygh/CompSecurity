.class final Lcom/roidapp/imagelib/filter/filterinfo/b;
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
        "Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 2049
    new-instance v0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;

    invoke-direct {v0}, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;-><init>()V

    .line 2050
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;->a:I

    .line 2051
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;->b:I

    .line 2052
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;->c:Ljava/lang/String;

    .line 2053
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Lcom/roidapp/imagelib/filter/filterinfo/LocalFilterInfo;->d:I

    .line 45
    return-object v0
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 45
    .line 1059
    new-array v0, p1, [Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    .line 45
    return-object v0
.end method
