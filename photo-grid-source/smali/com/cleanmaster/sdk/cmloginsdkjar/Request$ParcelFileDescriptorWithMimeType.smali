.class Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Landroid/os/ParcelFileDescriptor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 2467
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/z;

    invoke-direct {v0}, Lcom/cleanmaster/sdk/cmloginsdkjar/z;-><init>()V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .prologue
    .line 2483
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2484
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;->a:Ljava/lang/String;

    .line 2485
    invoke-virtual {p1}, Landroid/os/Parcel;->readFileDescriptor()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;->b:Landroid/os/ParcelFileDescriptor;

    .line 2486
    return-void
.end method

.method synthetic constructor <init>(Landroid/os/Parcel;B)V
    .locals 0

    .prologue
    .line 2445
    invoke-direct {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;-><init>(Landroid/os/Parcel;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 2450
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final b()Landroid/os/ParcelFileDescriptor;
    .locals 1

    .prologue
    .line 2454
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;->b:Landroid/os/ParcelFileDescriptor;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .prologue
    .line 2458
    const/4 v0, 0x1

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .prologue
    .line 2462
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 2463
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/Request$ParcelFileDescriptorWithMimeType;->b:Landroid/os/ParcelFileDescriptor;

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeFileDescriptor(Ljava/io/FileDescriptor;)V

    .line 2464
    return-void
.end method
