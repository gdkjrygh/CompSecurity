.class final Lcom/cleanmaster/func/process/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 4

    .prologue
    .line 2055
    new-instance v0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;

    invoke-direct {v0}, Lcom/cleanmaster/func/process/PhoneMemoryInfo;-><init>()V

    .line 2056
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->a:J

    .line 2057
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->b:J

    .line 2058
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->c:I

    .line 2059
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    iput v1, v0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->d:I

    .line 2060
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/cleanmaster/func/process/PhoneMemoryInfo;->e:J

    .line 52
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 1

    .prologue
    .line 52
    .line 1067
    new-array v0, p1, [Lcom/cleanmaster/func/process/PhoneMemoryInfo;

    .line 52
    return-object v0
.end method
