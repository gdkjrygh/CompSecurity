.class final Lcom/facebook/orca/photos/picking/j;
.super Ljava/lang/Object;
.source "PickMediaParams.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/orca/photos/picking/PickMediaParams;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/orca/photos/picking/PickMediaParams;
    .locals 2

    .prologue
    .line 138
    new-instance v0, Lcom/facebook/orca/photos/picking/PickMediaParams;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/orca/photos/picking/PickMediaParams;-><init>(Landroid/os/Parcel;Lcom/facebook/orca/photos/picking/j;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/orca/photos/picking/PickMediaParams;
    .locals 1

    .prologue
    .line 142
    new-array v0, p1, [Lcom/facebook/orca/photos/picking/PickMediaParams;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 136
    invoke-virtual {p0, p1}, Lcom/facebook/orca/photos/picking/j;->a(Landroid/os/Parcel;)Lcom/facebook/orca/photos/picking/PickMediaParams;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 136
    invoke-virtual {p0, p1}, Lcom/facebook/orca/photos/picking/j;->a(I)[Lcom/facebook/orca/photos/picking/PickMediaParams;

    move-result-object v0

    return-object v0
.end method
