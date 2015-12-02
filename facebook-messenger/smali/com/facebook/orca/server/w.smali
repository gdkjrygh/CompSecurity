.class final Lcom/facebook/orca/server/w;
.super Ljava/lang/Object;
.source "FetchStickerPacksResult.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/server/FetchStickerPacksResult;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/server/FetchStickerPacksResult;
    .locals 2

    .prologue
    .line 66
    new-instance v0, Lcom/facebook/orca/server/FetchStickerPacksResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/server/FetchStickerPacksResult;-><init>(Landroid/os/Parcel;Lcom/facebook/orca/server/w;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/server/FetchStickerPacksResult;
    .locals 1

    .prologue
    .line 71
    new-array v0, p1, [Lcom/facebook/orca/server/FetchStickerPacksResult;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 63
    invoke-virtual {p0, p1}, Lcom/facebook/orca/server/w;->a(Landroid/os/Parcel;)Lcom/facebook/orca/server/FetchStickerPacksResult;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 63
    invoke-virtual {p0, p1}, Lcom/facebook/orca/server/w;->a(I)[Lcom/facebook/orca/server/FetchStickerPacksResult;

    move-result-object v0

    return-object v0
.end method
