.class final Lcom/facebook/orca/server/am;
.super Ljava/lang/Object;
.source "ModifyThreadParams.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/server/ModifyThreadParams;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/server/ModifyThreadParams;
    .locals 2

    .prologue
    .line 79
    new-instance v0, Lcom/facebook/orca/server/ModifyThreadParams;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/server/ModifyThreadParams;-><init>(Landroid/os/Parcel;Lcom/facebook/orca/server/am;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/server/ModifyThreadParams;
    .locals 1

    .prologue
    .line 83
    new-array v0, p1, [Lcom/facebook/orca/server/ModifyThreadParams;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 77
    invoke-virtual {p0, p1}, Lcom/facebook/orca/server/am;->a(Landroid/os/Parcel;)Lcom/facebook/orca/server/ModifyThreadParams;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 77
    invoke-virtual {p0, p1}, Lcom/facebook/orca/server/am;->a(I)[Lcom/facebook/orca/server/ModifyThreadParams;

    move-result-object v0

    return-object v0
.end method
