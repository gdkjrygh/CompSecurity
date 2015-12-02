.class final Lcom/facebook/orca/threads/e;
.super Ljava/lang/Object;
.source "FolderName.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/threads/FolderName;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 186
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/threads/FolderName;
    .locals 2

    .prologue
    .line 188
    new-instance v0, Lcom/facebook/orca/threads/FolderName;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/threads/FolderName;-><init>(Landroid/os/Parcel;Lcom/facebook/orca/threads/e;)V

    invoke-static {v0}, Lcom/facebook/orca/threads/FolderName;->a(Lcom/facebook/orca/threads/FolderName;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/threads/FolderName;
    .locals 1

    .prologue
    .line 192
    new-array v0, p1, [Lcom/facebook/orca/threads/FolderName;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 186
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threads/e;->a(Landroid/os/Parcel;)Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 186
    invoke-virtual {p0, p1}, Lcom/facebook/orca/threads/e;->a(I)[Lcom/facebook/orca/threads/FolderName;

    move-result-object v0

    return-object v0
.end method
