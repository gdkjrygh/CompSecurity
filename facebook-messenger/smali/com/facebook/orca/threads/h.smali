.class final Lcom/facebook/orca/threads/h;
.super Ljava/lang/Object;
.source "MessagesCollection.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/threads/MessagesCollection;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/threads/MessagesCollection;
    .locals 2

    .prologue
    .line 152
    new-instance v0, Lcom/facebook/orca/threads/MessagesCollection;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/threads/MessagesCollection;-><init>(Landroid/os/Parcel;Lcom/facebook/orca/threads/h;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/threads/MessagesCollection;
    .locals 1

    .prologue
    .line 156
    new-array v0, p1, [Lcom/facebook/orca/threads/MessagesCollection;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 150
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threads/h;->a(Landroid/os/Parcel;)Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 150
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threads/h;->a(I)[Lcom/facebook/orca/threads/MessagesCollection;

    move-result-object v0

    return-object v0
.end method
