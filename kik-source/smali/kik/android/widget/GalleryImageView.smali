.class public Lkik/android/widget/GalleryImageView;
.super Lkik/android/widget/KikNetworkedImageView;
.source "SourceFile"


# static fields
.field private static a:Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 14
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 16
    sput-object v0, Lkik/android/widget/GalleryImageView;->a:Landroid/graphics/Bitmap;

    const v1, -0x333334

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 21
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkik/android/widget/GalleryImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 22
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 26
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/android/widget/GalleryImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 27
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .prologue
    .line 31
    invoke-direct {p0, p1, p2, p3}, Lkik/android/widget/KikNetworkedImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    sget-object v0, Lkik/android/widget/GalleryImageView;->a:Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, Lkik/android/widget/GalleryImageView;->a(Landroid/graphics/Bitmap;)V

    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {p0, v0}, Lkik/android/widget/GalleryImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 33
    return-void
.end method


# virtual methods
.method protected final a(Landroid/graphics/Bitmap;Ljava/lang/String;)Lkik/android/widget/w;
    .locals 1

    .prologue
    .line 44
    new-instance v0, Lkik/android/widget/cs;

    invoke-direct {v0, p1, p2}, Lkik/android/widget/cs;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    return-object v0
.end method
