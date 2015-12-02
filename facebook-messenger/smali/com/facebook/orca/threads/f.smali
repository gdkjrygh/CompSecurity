.class final Lcom/facebook/orca/threads/f;
.super Ljava/lang/Object;
.source "FolderType.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/threads/FolderType;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/threads/FolderType;
    .locals 2

    .prologue
    .line 107
    new-instance v0, Lcom/facebook/orca/threads/FolderType;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/threads/FolderType;-><init>(Landroid/os/Parcel;Lcom/facebook/orca/threads/f;)V

    invoke-static {v0}, Lcom/facebook/orca/threads/FolderType;->a(Lcom/facebook/orca/threads/FolderType;)Lcom/facebook/orca/threads/FolderType;

    move-result-object v0

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/threads/FolderType;
    .locals 1

    .prologue
    .line 111
    new-array v0, p1, [Lcom/facebook/orca/threads/FolderType;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 105
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threads/f;->a(Landroid/os/Parcel;)Lcom/facebook/orca/threads/FolderType;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 105
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threads/f;->a(I)[Lcom/facebook/orca/threads/FolderType;

    move-result-object v0

    return-object v0
.end method
