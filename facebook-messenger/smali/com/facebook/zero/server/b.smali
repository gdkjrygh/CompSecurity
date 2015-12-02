.class final Lcom/facebook/zero/server/b;
.super Ljava/lang/Object;
.source "FetchZeroTokenResult.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/zero/server/FetchZeroTokenResult;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/zero/server/FetchZeroTokenResult;
    .locals 1

    .prologue
    .line 77
    new-instance v0, Lcom/facebook/zero/server/FetchZeroTokenResult;

    invoke-direct {v0, p1}, Lcom/facebook/zero/server/FetchZeroTokenResult;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/zero/server/FetchZeroTokenResult;
    .locals 1

    .prologue
    .line 82
    const/4 v0, 0x0

    new-array v0, v0, [Lcom/facebook/zero/server/FetchZeroTokenResult;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 74
    invoke-virtual {p0, p1}, Lcom/facebook/zero/server/b;->a(Landroid/os/Parcel;)Lcom/facebook/zero/server/FetchZeroTokenResult;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 74
    invoke-virtual {p0, p1}, Lcom/facebook/zero/server/b;->a(I)[Lcom/facebook/zero/server/FetchZeroTokenResult;

    move-result-object v0

    return-object v0
.end method
