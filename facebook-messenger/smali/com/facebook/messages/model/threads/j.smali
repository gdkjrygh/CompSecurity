.class final Lcom/facebook/messages/model/threads/j;
.super Ljava/lang/Object;
.source "TitanAttachmentInfo.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;
    .locals 1

    .prologue
    .line 41
    new-instance v0, Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    invoke-direct {v0, p1}, Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;
    .locals 1

    .prologue
    .line 45
    new-array v0, p1, [Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 39
    invoke-virtual {p0, p1}, Lcom/facebook/messages/model/threads/j;->a(Landroid/os/Parcel;)Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 39
    invoke-virtual {p0, p1}, Lcom/facebook/messages/model/threads/j;->a(I)[Lcom/facebook/messages/model/threads/TitanAttachmentInfo$ImageData;

    move-result-object v0

    return-object v0
.end method
