.class final Lcom/roidapp/imagelib/filter/groupinfo/a;
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
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 2043
    new-instance v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    invoke-direct {v0, p1}, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;-><init>(Landroid/os/Parcel;)V

    .line 2044
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->b:Ljava/lang/String;

    .line 2045
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    .line 2046
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->d:Ljava/lang/String;

    .line 2047
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->g:I

    .line 2048
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->e:I

    .line 39
    return-object v0
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 39
    .line 1054
    new-array v0, p1, [Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 39
    return-object v0
.end method
