.class final Lcom/roidapp/imagelib/filter/filterinfo/a;
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
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 2033
    new-instance v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    invoke-direct {v0}, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;-><init>()V

    .line 2034
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->a:I

    .line 2035
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->b:I

    .line 2036
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->c:Ljava/lang/String;

    .line 2037
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->d:Ljava/lang/String;

    .line 2038
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->e:Ljava/lang/String;

    .line 2039
    invoke-virtual {p1}, Landroid/os/Parcel;->readBundle()Landroid/os/Bundle;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;->f:Landroid/os/Bundle;

    .line 29
    return-object v0
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 29
    .line 1045
    new-array v0, p1, [Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    .line 29
    return-object v0
.end method
