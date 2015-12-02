.class final Lcom/facebook/messages/ipc/b;
.super Ljava/lang/Object;
.source "FrozenNewMessageNotification.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/messages/ipc/FrozenNewMessageNotification;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 221
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/messages/ipc/FrozenNewMessageNotification;
    .locals 1

    .prologue
    .line 224
    const-class v0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;

    invoke-static {p1, v0}, Lcom/facebook/ipc/annotation/b;->a(Landroid/os/Parcel;Ljava/lang/Class;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/ipc/FrozenNewMessageNotification;

    return-object v0
.end method

.method public a(I)[Lcom/facebook/messages/ipc/FrozenNewMessageNotification;
    .locals 1

    .prologue
    .line 231
    new-array v0, p1, [Lcom/facebook/messages/ipc/FrozenNewMessageNotification;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 221
    invoke-virtual {p0, p1}, Lcom/facebook/messages/ipc/b;->a(Landroid/os/Parcel;)Lcom/facebook/messages/ipc/FrozenNewMessageNotification;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 221
    invoke-virtual {p0, p1}, Lcom/facebook/messages/ipc/b;->a(I)[Lcom/facebook/messages/ipc/FrozenNewMessageNotification;

    move-result-object v0

    return-object v0
.end method
