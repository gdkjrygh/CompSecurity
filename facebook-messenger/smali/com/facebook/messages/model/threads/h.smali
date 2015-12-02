.class final Lcom/facebook/messages/model/threads/h;
.super Ljava/lang/Object;
.source "SendError.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/messages/model/threads/SendError;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/messages/model/threads/SendError;
    .locals 2

    .prologue
    .line 81
    new-instance v0, Lcom/facebook/messages/model/threads/SendError;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/messages/model/threads/SendError;-><init>(Landroid/os/Parcel;Lcom/facebook/messages/model/threads/h;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/messages/model/threads/SendError;
    .locals 1

    .prologue
    .line 86
    new-array v0, p1, [Lcom/facebook/messages/model/threads/SendError;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 78
    invoke-virtual {p0, p1}, Lcom/facebook/messages/model/threads/h;->a(Landroid/os/Parcel;)Lcom/facebook/messages/model/threads/SendError;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 78
    invoke-virtual {p0, p1}, Lcom/facebook/messages/model/threads/h;->a(I)[Lcom/facebook/messages/model/threads/SendError;

    move-result-object v0

    return-object v0
.end method
