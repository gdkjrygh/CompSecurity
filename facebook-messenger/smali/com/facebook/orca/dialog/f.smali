.class final Lcom/facebook/orca/dialog/f;
.super Ljava/lang/Object;
.source "MenuDialogItem.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/dialog/MenuDialogItem;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/dialog/MenuDialogItem;
    .locals 2

    .prologue
    .line 67
    new-instance v0, Lcom/facebook/orca/dialog/MenuDialogItem;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/dialog/MenuDialogItem;-><init>(Landroid/os/Parcel;Lcom/facebook/orca/dialog/f;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/dialog/MenuDialogItem;
    .locals 1

    .prologue
    .line 72
    new-array v0, p1, [Lcom/facebook/orca/dialog/MenuDialogItem;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 64
    invoke-virtual {p0, p1}, Lcom/facebook/orca/dialog/f;->a(Landroid/os/Parcel;)Lcom/facebook/orca/dialog/MenuDialogItem;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 64
    invoke-virtual {p0, p1}, Lcom/facebook/orca/dialog/f;->a(I)[Lcom/facebook/orca/dialog/MenuDialogItem;

    move-result-object v0

    return-object v0
.end method
