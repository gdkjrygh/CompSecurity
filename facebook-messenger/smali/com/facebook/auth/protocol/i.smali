.class final Lcom/facebook/auth/protocol/i;
.super Ljava/lang/Object;
.source "GetLoggedInUserResult.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/auth/protocol/GetLoggedInUserResult;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/auth/protocol/GetLoggedInUserResult;
    .locals 2

    .prologue
    .line 39
    new-instance v0, Lcom/facebook/auth/protocol/GetLoggedInUserResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/auth/protocol/GetLoggedInUserResult;-><init>(Landroid/os/Parcel;Lcom/facebook/auth/protocol/i;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/auth/protocol/GetLoggedInUserResult;
    .locals 1

    .prologue
    .line 43
    new-array v0, p1, [Lcom/facebook/auth/protocol/GetLoggedInUserResult;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 37
    invoke-virtual {p0, p1}, Lcom/facebook/auth/protocol/i;->a(Landroid/os/Parcel;)Lcom/facebook/auth/protocol/GetLoggedInUserResult;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 37
    invoke-virtual {p0, p1}, Lcom/facebook/auth/protocol/i;->a(I)[Lcom/facebook/auth/protocol/GetLoggedInUserResult;

    move-result-object v0

    return-object v0
.end method
