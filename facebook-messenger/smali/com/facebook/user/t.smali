.class final Lcom/facebook/user/t;
.super Ljava/lang/Object;
.source "UserIdentifierKey.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/user/UserIdentifierKey;",
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
.method public a(Landroid/os/Parcel;)Lcom/facebook/user/UserIdentifierKey;
    .locals 2

    .prologue
    .line 52
    new-instance v0, Lcom/facebook/user/UserIdentifierKey;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/user/UserIdentifierKey;-><init>(Landroid/os/Parcel;Lcom/facebook/user/t;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/user/UserIdentifierKey;
    .locals 1

    .prologue
    .line 56
    new-array v0, p1, [Lcom/facebook/user/UserIdentifierKey;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 50
    invoke-virtual {p0, p1}, Lcom/facebook/user/t;->a(Landroid/os/Parcel;)Lcom/facebook/user/UserIdentifierKey;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 50
    invoke-virtual {p0, p1}, Lcom/facebook/user/t;->a(I)[Lcom/facebook/user/UserIdentifierKey;

    move-result-object v0

    return-object v0
.end method
