.class public final Lcom/google/android/gms/internal/ah;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/ai;


# instance fields
.field public final extras:Landroid/os/Bundle;

.field public final lH:J

.field public final lI:I

.field public final lJ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final lK:Z

.field public final lL:I

.field public final lM:Z

.field public final lN:Ljava/lang/String;

.field public final lO:Lcom/google/android/gms/internal/av;

.field public final lP:Landroid/location/Location;

.field public final lQ:Ljava/lang/String;

.field public final versionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ai;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ai;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ah;->CREATOR:Lcom/google/android/gms/internal/ai;

    return-void
.end method

.method public constructor <init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lcom/google/android/gms/internal/av;Landroid/location/Location;Ljava/lang/String;)V
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
            "Lcom/google/android/gms/internal/av;",
            "Landroid/location/Location;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ah;->versionCode:I

    iput-wide p2, p0, Lcom/google/android/gms/internal/ah;->lH:J

    iput-object p4, p0, Lcom/google/android/gms/internal/ah;->extras:Landroid/os/Bundle;

    iput p5, p0, Lcom/google/android/gms/internal/ah;->lI:I

    iput-object p6, p0, Lcom/google/android/gms/internal/ah;->lJ:Ljava/util/List;

    iput-boolean p7, p0, Lcom/google/android/gms/internal/ah;->lK:Z

    iput p8, p0, Lcom/google/android/gms/internal/ah;->lL:I

    iput-boolean p9, p0, Lcom/google/android/gms/internal/ah;->lM:Z

    iput-object p10, p0, Lcom/google/android/gms/internal/ah;->lN:Ljava/lang/String;

    iput-object p11, p0, Lcom/google/android/gms/internal/ah;->lO:Lcom/google/android/gms/internal/av;

    iput-object p12, p0, Lcom/google/android/gms/internal/ah;->lP:Landroid/location/Location;

    iput-object p13, p0, Lcom/google/android/gms/internal/ah;->lQ:Ljava/lang/String;

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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/ai;->a(Lcom/google/android/gms/internal/ah;Landroid/os/Parcel;I)V

    return-void
.end method
