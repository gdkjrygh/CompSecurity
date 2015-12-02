.class final Lcom/facebook/auth/protocol/g;
.super Ljava/lang/Object;
.source "AuthenticationResultImpl.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/auth/protocol/AuthenticationResult;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/auth/protocol/AuthenticationResult;
    .locals 2

    .prologue
    .line 52
    new-instance v0, Lcom/facebook/auth/protocol/AuthenticationResultImpl;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/auth/protocol/AuthenticationResultImpl;-><init>(Landroid/os/Parcel;Lcom/facebook/auth/protocol/g;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/auth/protocol/AuthenticationResult;
    .locals 1

    .prologue
    .line 57
    new-array v0, p1, [Lcom/facebook/auth/protocol/AuthenticationResult;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 49
    invoke-virtual {p0, p1}, Lcom/facebook/auth/protocol/g;->a(Landroid/os/Parcel;)Lcom/facebook/auth/protocol/AuthenticationResult;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 49
    invoke-virtual {p0, p1}, Lcom/facebook/auth/protocol/g;->a(I)[Lcom/facebook/auth/protocol/AuthenticationResult;

    move-result-object v0

    return-object v0
.end method
