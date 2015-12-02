.class final Lcom/facebook/messages/threads/model/a;
.super Ljava/lang/Object;
.source "ThreadViewSpec.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/messages/threads/model/ThreadViewSpec;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/messages/threads/model/ThreadViewSpec;
    .locals 2

    .prologue
    .line 270
    new-instance v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;-><init>(Landroid/os/Parcel;Lcom/facebook/messages/threads/model/a;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/messages/threads/model/ThreadViewSpec;
    .locals 1

    .prologue
    .line 274
    new-array v0, p1, [Lcom/facebook/messages/threads/model/ThreadViewSpec;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 268
    invoke-virtual {p0, p1}, Lcom/facebook/messages/threads/model/a;->a(Landroid/os/Parcel;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 268
    invoke-virtual {p0, p1}, Lcom/facebook/messages/threads/model/a;->a(I)[Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    return-object v0
.end method
