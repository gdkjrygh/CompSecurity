.class final Lcom/facebook/common/bundle/b;
.super Ljava/lang/Object;
.source "ImmutableBundle.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/common/bundle/ImmutableBundle;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 354
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/common/bundle/ImmutableBundle;
    .locals 2

    .prologue
    .line 356
    new-instance v0, Lcom/facebook/common/bundle/ImmutableBundle;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/common/bundle/ImmutableBundle;-><init>(Landroid/os/Parcel;Lcom/facebook/common/bundle/b;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/common/bundle/ImmutableBundle;
    .locals 1

    .prologue
    .line 360
    new-array v0, p1, [Lcom/facebook/common/bundle/ImmutableBundle;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 354
    invoke-virtual {p0, p1}, Lcom/facebook/common/bundle/b;->a(Landroid/os/Parcel;)Lcom/facebook/common/bundle/ImmutableBundle;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 354
    invoke-virtual {p0, p1}, Lcom/facebook/common/bundle/b;->a(I)[Lcom/facebook/common/bundle/ImmutableBundle;

    move-result-object v0

    return-object v0
.end method
