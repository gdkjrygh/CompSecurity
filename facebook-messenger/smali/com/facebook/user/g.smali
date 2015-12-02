.class final Lcom/facebook/user/g;
.super Ljava/lang/Object;
.source "MobileAppData.java"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/facebook/user/MobileAppData;",
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
.method public a(Landroid/os/Parcel;)Lcom/facebook/user/MobileAppData;
    .locals 1

    .prologue
    .line 67
    new-instance v0, Lcom/facebook/user/MobileAppData;

    invoke-direct {v0, p1}, Lcom/facebook/user/MobileAppData;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public a(I)[Lcom/facebook/user/MobileAppData;
    .locals 1

    .prologue
    .line 72
    new-array v0, p1, [Lcom/facebook/user/MobileAppData;

    return-object v0
.end method

.method public synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 64
    invoke-virtual {p0, p1}, Lcom/facebook/user/g;->a(Landroid/os/Parcel;)Lcom/facebook/user/MobileAppData;

    move-result-object v0

    return-object v0
.end method

.method public synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 64
    invoke-virtual {p0, p1}, Lcom/facebook/user/g;->a(I)[Lcom/facebook/user/MobileAppData;

    move-result-object v0

    return-object v0
.end method
