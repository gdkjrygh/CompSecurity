.class public Lcom/qihoo/security/services/ScanProgress;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/qihoo/security/services/ScanProgress;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final percent:I

.field public final progress:I

.field public final result:Lcom/qihoo/security/services/ScanResult;

.field public final total:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/qihoo/security/services/ScanProgress$1;

    invoke-direct {v0}, Lcom/qihoo/security/services/ScanProgress$1;-><init>()V

    sput-object v0, Lcom/qihoo/security/services/ScanProgress;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/ScanResult;

    iput-object v0, p0, Lcom/qihoo/security/services/ScanProgress;->result:Lcom/qihoo/security/services/ScanResult;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/services/ScanProgress;->percent:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/services/ScanProgress;->progress:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/services/ScanProgress;->total:I

    return-void
.end method

.method public constructor <init>(Lcom/qihoo/security/services/ScanResult;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/qihoo/security/services/ScanProgress;->result:Lcom/qihoo/security/services/ScanResult;

    iput p2, p0, Lcom/qihoo/security/services/ScanProgress;->percent:I

    iput p3, p0, Lcom/qihoo/security/services/ScanProgress;->progress:I

    iput p4, p0, Lcom/qihoo/security/services/ScanProgress;->total:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget-object v0, p0, Lcom/qihoo/security/services/ScanProgress;->result:Lcom/qihoo/security/services/ScanResult;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget v0, p0, Lcom/qihoo/security/services/ScanProgress;->percent:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/qihoo/security/services/ScanProgress;->progress:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/qihoo/security/services/ScanProgress;->total:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
