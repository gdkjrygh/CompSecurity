.class public Lcom/google/android/gms/wearable/internal/as;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/wearable/internal/as;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final amb:J

.field public final amd:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/wearable/internal/ak;",
            ">;"
        }
    .end annotation
.end field

.field public final statusCode:I

.field public final versionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/wearable/internal/at;

    invoke-direct {v0}, Lcom/google/android/gms/wearable/internal/at;-><init>()V

    sput-object v0, Lcom/google/android/gms/wearable/internal/as;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(IIJLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIJ",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/wearable/internal/ak;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/wearable/internal/as;->versionCode:I

    iput p2, p0, Lcom/google/android/gms/wearable/internal/as;->statusCode:I

    iput-wide p3, p0, Lcom/google/android/gms/wearable/internal/as;->amb:J

    iput-object p5, p0, Lcom/google/android/gms/wearable/internal/as;->amd:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/wearable/internal/at;->a(Lcom/google/android/gms/wearable/internal/as;Landroid/os/Parcel;I)V

    return-void
.end method
