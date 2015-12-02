.class final Lcom/facebook/orca/server/p;
.super Ljava/lang/Object;
.source "FetchMoreMessagesResult.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/server/FetchMoreMessagesResult;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/server/FetchMoreMessagesResult;
    .locals 2

    .prologue
    .line 44
    new-instance v0, Lcom/facebook/orca/server/FetchMoreMessagesResult;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/server/FetchMoreMessagesResult;-><init>(Landroid/os/Parcel;Lcom/facebook/orca/server/p;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/server/FetchMoreMessagesResult;
    .locals 1

    .prologue
    .line 48
    new-array v0, p1, [Lcom/facebook/orca/server/FetchMoreMessagesResult;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 42
    invoke-virtual {p0, p1}, Lcom/facebook/orca/server/p;->a(Landroid/os/Parcel;)Lcom/facebook/orca/server/FetchMoreMessagesResult;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 42
    invoke-virtual {p0, p1}, Lcom/facebook/orca/server/p;->a(I)[Lcom/facebook/orca/server/FetchMoreMessagesResult;

    move-result-object v0

    return-object v0
.end method
