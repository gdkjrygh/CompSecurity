.class public final Lcom/google/android/gms/internal/ai;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/aj;


# instance fields
.field public final extras:Landroid/os/Bundle;

.field public final lS:J

.field public final lT:I

.field public final lU:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final lV:Z

.field public final lW:I

.field public final lX:Z

.field public final lY:Ljava/lang/String;

.field public final lZ:Lcom/google/android/gms/internal/aw;

.field public final ma:Landroid/location/Location;

.field public final mb:Ljava/lang/String;

.field public final mc:Landroid/os/Bundle;

.field public final versionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/aj;

    invoke-direct {v0}, Lcom/google/android/gms/internal/aj;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ai;->CREATOR:Lcom/google/android/gms/internal/aj;

    return-void
.end method

.method public constructor <init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lcom/google/android/gms/internal/aw;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Landroid/os/Bundle;",
            "I",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;ZIZ",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/aw;",
            "Landroid/location/Location;",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ai;->versionCode:I

    iput-wide p2, p0, Lcom/google/android/gms/internal/ai;->lS:J

    iput-object p4, p0, Lcom/google/android/gms/internal/ai;->extras:Landroid/os/Bundle;

    iput p5, p0, Lcom/google/android/gms/internal/ai;->lT:I

    iput-object p6, p0, Lcom/google/android/gms/internal/ai;->lU:Ljava/util/List;

    iput-boolean p7, p0, Lcom/google/android/gms/internal/ai;->lV:Z

    iput p8, p0, Lcom/google/android/gms/internal/ai;->lW:I

    iput-boolean p9, p0, Lcom/google/android/gms/internal/ai;->lX:Z

    iput-object p10, p0, Lcom/google/android/gms/internal/ai;->lY:Ljava/lang/String;

    iput-object p11, p0, Lcom/google/android/gms/internal/ai;->lZ:Lcom/google/android/gms/internal/aw;

    iput-object p12, p0, Lcom/google/android/gms/internal/ai;->ma:Landroid/location/Location;

    iput-object p13, p0, Lcom/google/android/gms/internal/ai;->mb:Ljava/lang/String;

    iput-object p14, p0, Lcom/google/android/gms/internal/ai;->mc:Landroid/os/Bundle;

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/aj;->a(Lcom/google/android/gms/internal/ai;Landroid/os/Parcel;I)V

    return-void
.end method
