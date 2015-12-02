.class final Lcom/facebook/user/m;
.super Ljava/lang/Object;
.source "User.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/user/User;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 317
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/user/User;
    .locals 2

    .prologue
    .line 319
    new-instance v0, Lcom/facebook/user/User;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/user/User;-><init>(Landroid/os/Parcel;Lcom/facebook/user/m;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/user/User;
    .locals 1

    .prologue
    .line 323
    new-array v0, p1, [Lcom/facebook/user/User;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 317
    invoke-virtual {p0, p1}, Lcom/facebook/user/m;->a(Landroid/os/Parcel;)Lcom/facebook/user/User;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 317
    invoke-virtual {p0, p1}, Lcom/facebook/user/m;->a(I)[Lcom/facebook/user/User;

    move-result-object v0

    return-object v0
.end method
