.class final Lcom/facebook/orca/threads/y;
.super Ljava/lang/Object;
.source "ThreadsCollection.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/threads/ThreadsCollection;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/threads/ThreadsCollection;
    .locals 2

    .prologue
    .line 147
    new-instance v0, Lcom/facebook/orca/threads/ThreadsCollection;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/threads/ThreadsCollection;-><init>(Landroid/os/Parcel;Lcom/facebook/orca/threads/y;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/threads/ThreadsCollection;
    .locals 1

    .prologue
    .line 151
    new-array v0, p1, [Lcom/facebook/orca/threads/ThreadsCollection;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 145
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threads/y;->a(Landroid/os/Parcel;)Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 145
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threads/y;->a(I)[Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v0

    return-object v0
.end method
