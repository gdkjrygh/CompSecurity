.class final Lcom/facebook/user/ab;
.super Ljava/lang/Object;
.source "UserPhoneNumber.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/user/UserPhoneNumber;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/user/UserPhoneNumber;
    .locals 2

    .prologue
    .line 107
    new-instance v0, Lcom/facebook/user/UserPhoneNumber;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/user/UserPhoneNumber;-><init>(Landroid/os/Parcel;Lcom/facebook/user/ab;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/user/UserPhoneNumber;
    .locals 1

    .prologue
    .line 111
    new-array v0, p1, [Lcom/facebook/user/UserPhoneNumber;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 105
    invoke-virtual {p0, p1}, Lcom/facebook/user/ab;->a(Landroid/os/Parcel;)Lcom/facebook/user/UserPhoneNumber;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 105
    invoke-virtual {p0, p1}, Lcom/facebook/user/ab;->a(I)[Lcom/facebook/user/UserPhoneNumber;

    move-result-object v0

    return-object v0
.end method
