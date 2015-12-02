.class final Lcom/facebook/messages/ipc/a;
.super Ljava/lang/Object;
.source "FrozenGroupMessageInfo.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/messages/ipc/FrozenGroupMessageInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/messages/ipc/FrozenGroupMessageInfo;
    .locals 1

    .prologue
    .line 120
    const-class v0, Lcom/facebook/messages/ipc/FrozenGroupMessageInfo;

    invoke-static {p1, v0}, Lcom/facebook/ipc/annotation/b;->a(Landroid/os/Parcel;Ljava/lang/Class;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/ipc/FrozenGroupMessageInfo;

    return-object v0
.end method

.method public a(I)[Lcom/facebook/messages/ipc/FrozenGroupMessageInfo;
    .locals 1

    .prologue
    .line 125
    new-array v0, p1, [Lcom/facebook/messages/ipc/FrozenGroupMessageInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 117
    invoke-virtual {p0, p1}, Lcom/facebook/messages/ipc/a;->a(Landroid/os/Parcel;)Lcom/facebook/messages/ipc/FrozenGroupMessageInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 117
    invoke-virtual {p0, p1}, Lcom/facebook/messages/ipc/a;->a(I)[Lcom/facebook/messages/ipc/FrozenGroupMessageInfo;

    move-result-object v0

    return-object v0
.end method
