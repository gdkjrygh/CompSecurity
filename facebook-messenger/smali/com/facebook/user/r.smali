.class final Lcom/facebook/user/r;
.super Ljava/lang/Object;
.source "UserFbidIdentifier.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/user/UserFbidIdentifier;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/user/UserFbidIdentifier;
    .locals 2

    .prologue
    .line 53
    new-instance v0, Lcom/facebook/user/UserFbidIdentifier;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/user/UserFbidIdentifier;-><init>(Landroid/os/Parcel;Lcom/facebook/user/r;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/user/UserFbidIdentifier;
    .locals 1

    .prologue
    .line 57
    new-array v0, p1, [Lcom/facebook/user/UserFbidIdentifier;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 51
    invoke-virtual {p0, p1}, Lcom/facebook/user/r;->a(Landroid/os/Parcel;)Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 51
    invoke-virtual {p0, p1}, Lcom/facebook/user/r;->a(I)[Lcom/facebook/user/UserFbidIdentifier;

    move-result-object v0

    return-object v0
.end method
