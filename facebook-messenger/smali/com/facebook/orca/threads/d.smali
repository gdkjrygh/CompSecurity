.class final Lcom/facebook/orca/threads/d;
.super Ljava/lang/Object;
.source "FolderCounts.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/threads/FolderCounts;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/threads/FolderCounts;
    .locals 2

    .prologue
    .line 55
    new-instance v0, Lcom/facebook/orca/threads/FolderCounts;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/threads/FolderCounts;-><init>(Landroid/os/Parcel;Lcom/facebook/orca/threads/d;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/threads/FolderCounts;
    .locals 1

    .prologue
    .line 59
    new-array v0, p1, [Lcom/facebook/orca/threads/FolderCounts;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 53
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threads/d;->a(Landroid/os/Parcel;)Lcom/facebook/orca/threads/FolderCounts;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 53
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threads/d;->a(I)[Lcom/facebook/orca/threads/FolderCounts;

    move-result-object v0

    return-object v0
.end method
