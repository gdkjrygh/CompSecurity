.class final Lcom/facebook/mqtt/messages/t;
.super Ljava/lang/Object;
.source "SubscribeTopic.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/mqtt/messages/SubscribeTopic;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/mqtt/messages/SubscribeTopic;
    .locals 3

    .prologue
    .line 68
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 69
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 70
    new-instance v2, Lcom/facebook/mqtt/messages/SubscribeTopic;

    invoke-direct {v2, v0, v1}, Lcom/facebook/mqtt/messages/SubscribeTopic;-><init>(Ljava/lang/String;I)V

    return-object v2
.end method

.method public a(I)[Lcom/facebook/mqtt/messages/SubscribeTopic;
    .locals 1

    .prologue
    .line 75
    new-array v0, p1, [Lcom/facebook/mqtt/messages/SubscribeTopic;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 65
    invoke-virtual {p0, p1}, Lcom/facebook/mqtt/messages/t;->a(Landroid/os/Parcel;)Lcom/facebook/mqtt/messages/SubscribeTopic;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 65
    invoke-virtual {p0, p1}, Lcom/facebook/mqtt/messages/t;->a(I)[Lcom/facebook/mqtt/messages/SubscribeTopic;

    move-result-object v0

    return-object v0
.end method
