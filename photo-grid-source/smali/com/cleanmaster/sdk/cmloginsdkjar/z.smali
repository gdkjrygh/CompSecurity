.class final Lcom/cleanmaster/sdk/cmloginsdkjar/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator",
        "<",
        "Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 2468
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    .prologue
    .line 4470
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;-><init>(Landroid/os/Parcel;B)V

    .line 2468
    return-object v0
.end method

.method public final bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 2468
    .line 3474
    new-array v0, p1, [Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;

    .line 2468
    return-object v0
.end method
