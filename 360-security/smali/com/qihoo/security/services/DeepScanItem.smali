.class public Lcom/qihoo/security/services/DeepScanItem;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/qihoo/security/services/DeepScanItem;",
            ">;"
        }
    .end annotation
.end field

.field public static final ENUM_AUTORUN:I = 0x1

.field public static final ENUM_DUMMY:I = 0x63

.field public static final ENUM_FILEPATH:I = 0x4

.field public static final ENUM_INSTALLED_APK:I = 0x3

.field public static final ENUM_MEMORY:I = 0x2


# instance fields
.field public final content:Ljava/lang/String;

.field public final enumeratorId:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/qihoo/security/services/DeepScanItem$1;

    invoke-direct {v0}, Lcom/qihoo/security/services/DeepScanItem$1;-><init>()V

    sput-object v0, Lcom/qihoo/security/services/DeepScanItem;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/qihoo/security/services/DeepScanItem;->enumeratorId:I

    iput-object p2, p0, Lcom/qihoo/security/services/DeepScanItem;->content:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/services/DeepScanItem;->enumeratorId:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/services/DeepScanItem;->content:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget v0, p0, Lcom/qihoo/security/services/DeepScanItem;->enumeratorId:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/qihoo/security/services/DeepScanItem;->content:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
