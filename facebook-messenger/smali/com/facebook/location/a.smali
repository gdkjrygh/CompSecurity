.class final Lcom/facebook/location/a;
.super Ljava/lang/Object;
.source "Coordinates.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/location/Coordinates;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/location/Coordinates;
    .locals 2

    .prologue
    .line 126
    new-instance v0, Lcom/facebook/location/Coordinates;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/location/Coordinates;-><init>(Landroid/os/Parcel;Lcom/facebook/location/a;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/location/Coordinates;
    .locals 1

    .prologue
    .line 130
    new-array v0, p1, [Lcom/facebook/location/Coordinates;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 124
    invoke-virtual {p0, p1}, Lcom/facebook/location/a;->a(Landroid/os/Parcel;)Lcom/facebook/location/Coordinates;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 124
    invoke-virtual {p0, p1}, Lcom/facebook/location/a;->a(I)[Lcom/facebook/location/Coordinates;

    move-result-object v0

    return-object v0
.end method
