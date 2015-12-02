.class final Lcom/facebook/zero/server/a;
.super Ljava/lang/Object;
.source "FetchZeroTokenParams.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/zero/server/FetchZeroTokenParams;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/zero/server/FetchZeroTokenParams;
    .locals 2

    .prologue
    .line 41
    new-instance v0, Lcom/facebook/zero/server/FetchZeroTokenParams;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/zero/server/FetchZeroTokenParams;-><init>(Landroid/os/Parcel;Lcom/facebook/zero/server/a;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/zero/server/FetchZeroTokenParams;
    .locals 1

    .prologue
    .line 46
    new-array v0, p1, [Lcom/facebook/zero/server/FetchZeroTokenParams;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 38
    invoke-virtual {p0, p1}, Lcom/facebook/zero/server/a;->a(Landroid/os/Parcel;)Lcom/facebook/zero/server/FetchZeroTokenParams;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 38
    invoke-virtual {p0, p1}, Lcom/facebook/zero/server/a;->a(I)[Lcom/facebook/zero/server/FetchZeroTokenParams;

    move-result-object v0

    return-object v0
.end method
