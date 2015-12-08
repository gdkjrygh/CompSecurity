.class public final Lcom/google/android/gms/ads/R$styleable;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final AdsAttrs:[I

.field public static final AdsAttrs_adSize:I = 0x0

.field public static final AdsAttrs_adSizes:I = 0x1

.field public static final AdsAttrs_adUnitId:I = 0x2

.field public static final LoadingImageView:[I

.field public static final LoadingImageView_circleCrop:I = 0x2

.field public static final LoadingImageView_imageAspectRatio:I = 0x1

.field public static final LoadingImageView_imageAspectRatioAdjust:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x3

    .line 123
    new-array v0, v1, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/ads/R$styleable;->AdsAttrs:[I

    .line 127
    new-array v0, v1, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/google/android/gms/ads/R$styleable;->LoadingImageView:[I

    return-void

    .line 123
    :array_0
    .array-data 4
        0x7f010006
        0x7f010007
        0x7f010008
    .end array-data

    .line 127
    :array_1
    .array-data 4
        0x7f010018
        0x7f010019
        0x7f01001a
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
