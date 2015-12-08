.class final Lcom/roidapp/cloudlib/facebook/n;
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
        "Lcom/roidapp/cloudlib/facebook/FbFriend;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 2053
    new-instance v0, Lcom/roidapp/cloudlib/facebook/FbFriend;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/facebook/FbFriend;-><init>()V

    .line 2054
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/facebook/FbFriend;->a(Lcom/roidapp/cloudlib/facebook/FbFriend;Ljava/lang/String;)Ljava/lang/String;

    .line 2055
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/facebook/FbFriend;->b(Lcom/roidapp/cloudlib/facebook/FbFriend;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    return-object v0
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 50
    .line 1061
    new-array v0, p1, [Lcom/roidapp/cloudlib/facebook/FbFriend;

    .line 50
    return-object v0
.end method
