.class final Lcom/facebook/user/q;
.super Ljava/lang/Object;
.source "UserEmailAddress.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/user/UserEmailAddress;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/user/UserEmailAddress;
    .locals 2

    .prologue
    .line 66
    new-instance v0, Lcom/facebook/user/UserEmailAddress;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/user/UserEmailAddress;-><init>(Landroid/os/Parcel;Lcom/facebook/user/q;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/user/UserEmailAddress;
    .locals 1

    .prologue
    .line 70
    new-array v0, p1, [Lcom/facebook/user/UserEmailAddress;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 64
    invoke-virtual {p0, p1}, Lcom/facebook/user/q;->a(Landroid/os/Parcel;)Lcom/facebook/user/UserEmailAddress;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 64
    invoke-virtual {p0, p1}, Lcom/facebook/user/q;->a(I)[Lcom/facebook/user/UserEmailAddress;

    move-result-object v0

    return-object v0
.end method
