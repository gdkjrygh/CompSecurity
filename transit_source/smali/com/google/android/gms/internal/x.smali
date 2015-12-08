.class public final Lcom/google/android/gms/internal/x;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcom/google/android/gms/internal/y;


# instance fields
.field public final ew:Ljava/lang/String;

.field public final ex:Z

.field public final height:I

.field public final heightPixels:I

.field public final versionCode:I

.field public final width:I

.field public final widthPixels:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/y;

    invoke-direct {v0}, Lcom/google/android/gms/internal/y;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/x;->CREATOR:Lcom/google/android/gms/internal/y;

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    const/4 v1, 0x1

    const/4 v3, 0x0

    const-string v2, "interstitial_mb"

    move-object v0, p0

    move v4, v3

    move v5, v1

    move v6, v3

    move v7, v3

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/x;-><init>(ILjava/lang/String;IIZII)V

    return-void
.end method

.method constructor <init>(ILjava/lang/String;IIZII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/x;->versionCode:I

    iput-object p2, p0, Lcom/google/android/gms/internal/x;->ew:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/internal/x;->height:I

    iput p4, p0, Lcom/google/android/gms/internal/x;->heightPixels:I

    iput-boolean p5, p0, Lcom/google/android/gms/internal/x;->ex:Z

    iput p6, p0, Lcom/google/android/gms/internal/x;->width:I

    iput p7, p0, Lcom/google/android/gms/internal/x;->widthPixels:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/AdSize;)V
    .locals 5

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v1, p0, Lcom/google/android/gms/internal/x;->versionCode:I

    iput-boolean v2, p0, Lcom/google/android/gms/internal/x;->ex:Z

    invoke-virtual {p2}, Lcom/google/android/gms/ads/AdSize;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/x;->width:I

    invoke-virtual {p2}, Lcom/google/android/gms/ads/AdSize;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/x;->height:I

    iget v0, p0, Lcom/google/android/gms/internal/x;->width:I

    const/4 v3, -0x1

    if-ne v0, v3, :cond_1

    move v0, v1

    :goto_0
    iget v3, p0, Lcom/google/android/gms/internal/x;->height:I

    const/4 v4, -0x2

    if-ne v3, v4, :cond_2

    :goto_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    if-eqz v0, :cond_3

    invoke-static {v4}, Lcom/google/android/gms/internal/x;->a(Landroid/util/DisplayMetrics;)I

    move-result v2

    iput v2, p0, Lcom/google/android/gms/internal/x;->widthPixels:I

    iget v2, p0, Lcom/google/android/gms/internal/x;->widthPixels:I

    int-to-float v2, v2

    iget v3, v4, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v2, v3

    float-to-int v2, v2

    move v3, v2

    :goto_2
    if-eqz v1, :cond_4

    invoke-static {v4}, Lcom/google/android/gms/internal/x;->c(Landroid/util/DisplayMetrics;)I

    move-result v2

    :goto_3
    invoke-static {v4, v2}, Lcom/google/android/gms/internal/cm;->a(Landroid/util/DisplayMetrics;I)I

    move-result v4

    iput v4, p0, Lcom/google/android/gms/internal/x;->heightPixels:I

    if-nez v0, :cond_0

    if-eqz v1, :cond_5

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_as"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/x;->ew:Ljava/lang/String;

    :goto_4
    return-void

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    move v1, v2

    goto :goto_1

    :cond_3
    iget v2, p0, Lcom/google/android/gms/internal/x;->width:I

    iget v3, p0, Lcom/google/android/gms/internal/x;->width:I

    invoke-static {v4, v3}, Lcom/google/android/gms/internal/cm;->a(Landroid/util/DisplayMetrics;I)I

    move-result v3

    iput v3, p0, Lcom/google/android/gms/internal/x;->widthPixels:I

    move v3, v2

    goto :goto_2

    :cond_4
    iget v2, p0, Lcom/google/android/gms/internal/x;->height:I

    goto :goto_3

    :cond_5
    invoke-virtual {p2}, Lcom/google/android/gms/ads/AdSize;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/x;->ew:Ljava/lang/String;

    goto :goto_4
.end method

.method public static a(Landroid/util/DisplayMetrics;)I
    .locals 1

    iget v0, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    return v0
.end method

.method public static b(Landroid/util/DisplayMetrics;)I
    .locals 2

    invoke-static {p0}, Lcom/google/android/gms/internal/x;->c(Landroid/util/DisplayMetrics;)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method private static c(Landroid/util/DisplayMetrics;)I
    .locals 2

    iget v0, p0, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v0, v0

    iget v1, p0, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v0, v1

    float-to-int v0, v0

    const/16 v1, 0x190

    if-gt v0, v1, :cond_0

    const/16 v0, 0x20

    :goto_0
    return v0

    :cond_0
    const/16 v1, 0x2d0

    if-gt v0, v1, :cond_1

    const/16 v0, 0x32

    goto :goto_0

    :cond_1
    const/16 v0, 0x5a

    goto :goto_0
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
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/internal/y;->a(Lcom/google/android/gms/internal/x;Landroid/os/Parcel;I)V

    return-void
.end method
