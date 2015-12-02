.class final Lcom/facebook/messages/model/threads/g;
.super Ljava/lang/Object;
.source "ParticipantInfo.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/messages/model/threads/ParticipantInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 2

    .prologue
    .line 63
    new-instance v0, Lcom/facebook/messages/model/threads/ParticipantInfo;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/messages/model/threads/ParticipantInfo;-><init>(Landroid/os/Parcel;Lcom/facebook/messages/model/threads/g;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 1

    .prologue
    .line 67
    new-array v0, p1, [Lcom/facebook/messages/model/threads/ParticipantInfo;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 61
    invoke-virtual {p0, p1}, Lcom/facebook/messages/model/threads/g;->a(Landroid/os/Parcel;)Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 61
    invoke-virtual {p0, p1}, Lcom/facebook/messages/model/threads/g;->a(I)[Lcom/facebook/messages/model/threads/ParticipantInfo;

    move-result-object v0

    return-object v0
.end method
