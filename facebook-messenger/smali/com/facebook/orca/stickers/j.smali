.class final Lcom/facebook/orca/stickers/j;
.super Ljava/lang/Object;
.source "StickerPack.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/stickers/StickerPack;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/stickers/StickerPack;
    .locals 2

    .prologue
    .line 127
    new-instance v0, Lcom/facebook/orca/stickers/StickerPack;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/stickers/StickerPack;-><init>(Landroid/os/Parcel;Lcom/facebook/orca/stickers/j;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/stickers/StickerPack;
    .locals 1

    .prologue
    .line 132
    new-array v0, p1, [Lcom/facebook/orca/stickers/StickerPack;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 124
    invoke-virtual {p0, p1}, Lcom/facebook/orca/stickers/j;->a(Landroid/os/Parcel;)Lcom/facebook/orca/stickers/StickerPack;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 124
    invoke-virtual {p0, p1}, Lcom/facebook/orca/stickers/j;->a(I)[Lcom/facebook/orca/stickers/StickerPack;

    move-result-object v0

    return-object v0
.end method
