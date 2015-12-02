.class final Lcom/facebook/location/n;
.super Ljava/lang/Object;
.source "GetDeviceLocationParams.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/location/GetDeviceLocationParams;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Parcel;)Lcom/facebook/location/GetDeviceLocationParams;
    .locals 2

    .prologue
    .line 132
    new-instance v0, Lcom/facebook/location/GetDeviceLocationParams;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/facebook/location/GetDeviceLocationParams;-><init>(Landroid/os/Parcel;Lcom/facebook/location/n;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/location/GetDeviceLocationParams;
    .locals 1

    .prologue
    .line 136
    new-array v0, p1, [Lcom/facebook/location/GetDeviceLocationParams;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 130
    invoke-virtual {p0, p1}, Lcom/facebook/location/n;->a(Landroid/os/Parcel;)Lcom/facebook/location/GetDeviceLocationParams;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 130
    invoke-virtual {p0, p1}, Lcom/facebook/location/n;->a(I)[Lcom/facebook/location/GetDeviceLocationParams;

    move-result-object v0

    return-object v0
.end method
