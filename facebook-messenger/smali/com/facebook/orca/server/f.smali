.class final Lcom/facebook/orca/server/f;
.super Ljava/lang/Object;
.source "DeleteMessagesResult.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/server/DeleteMessagesResult;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/server/DeleteMessagesResult;
    .locals 1

    .prologue
    .line 50
    new-instance v0, Lcom/facebook/orca/server/DeleteMessagesResult;

    invoke-direct {v0, p1}, Lcom/facebook/orca/server/DeleteMessagesResult;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/server/DeleteMessagesResult;
    .locals 1

    .prologue
    .line 54
    new-array v0, p1, [Lcom/facebook/orca/server/DeleteMessagesResult;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 48
    invoke-virtual {p0, p1}, Lcom/facebook/orca/server/f;->a(Landroid/os/Parcel;)Lcom/facebook/orca/server/DeleteMessagesResult;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 48
    invoke-virtual {p0, p1}, Lcom/facebook/orca/server/f;->a(I)[Lcom/facebook/orca/server/DeleteMessagesResult;

    move-result-object v0

    return-object v0
.end method
