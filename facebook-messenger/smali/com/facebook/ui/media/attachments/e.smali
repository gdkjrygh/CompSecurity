.class final Lcom/facebook/ui/media/attachments/e;
.super Ljava/lang/Object;
.source "MediaResource.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/ui/media/attachments/MediaResource;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 298
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/ui/media/attachments/MediaResource;
    .locals 2

    .prologue
    .line 300
    new-instance v0, Lcom/facebook/ui/media/attachments/MediaResource;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/ui/media/attachments/MediaResource;-><init>(Landroid/os/Parcel;Lcom/facebook/ui/media/attachments/e;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/ui/media/attachments/MediaResource;
    .locals 1

    .prologue
    .line 304
    new-array v0, p1, [Lcom/facebook/ui/media/attachments/MediaResource;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 298
    invoke-virtual {p0, p1}, Lcom/facebook/ui/media/attachments/e;->a(Landroid/os/Parcel;)Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 298
    invoke-virtual {p0, p1}, Lcom/facebook/ui/media/attachments/e;->a(I)[Lcom/facebook/ui/media/attachments/MediaResource;

    move-result-object v0

    return-object v0
.end method
