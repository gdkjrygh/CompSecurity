.class final Lcom/kik/cache/ContactImageView$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/cache/ContactImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field private static a:[Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 34
    const/16 v0, 0xa

    new-array v0, v0, [Landroid/graphics/Bitmap;

    invoke-static {v2}, Lkik/android/util/e;->a(I)Landroid/graphics/Bitmap;

    move-result-object v1

    aput-object v1, v0, v2

    invoke-static {v3}, Lkik/android/util/e;->a(I)Landroid/graphics/Bitmap;

    move-result-object v1

    aput-object v1, v0, v3

    invoke-static {v4}, Lkik/android/util/e;->a(I)Landroid/graphics/Bitmap;

    move-result-object v1

    aput-object v1, v0, v4

    invoke-static {v5}, Lkik/android/util/e;->a(I)Landroid/graphics/Bitmap;

    move-result-object v1

    aput-object v1, v0, v5

    invoke-static {v6}, Lkik/android/util/e;->a(I)Landroid/graphics/Bitmap;

    move-result-object v1

    aput-object v1, v0, v6

    const/4 v1, 0x5

    const/4 v2, 0x5

    invoke-static {v2}, Lkik/android/util/e;->a(I)Landroid/graphics/Bitmap;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const/4 v2, 0x6

    invoke-static {v2}, Lkik/android/util/e;->a(I)Landroid/graphics/Bitmap;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const/4 v2, 0x7

    invoke-static {v2}, Lkik/android/util/e;->a(I)Landroid/graphics/Bitmap;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const/16 v2, 0x8

    invoke-static {v2}, Lkik/android/util/e;->a(I)Landroid/graphics/Bitmap;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const/16 v2, 0x9

    invoke-static {v2}, Lkik/android/util/e;->a(I)Landroid/graphics/Bitmap;

    move-result-object v2

    aput-object v2, v0, v1

    sput-object v0, Lcom/kik/cache/ContactImageView$a;->a:[Landroid/graphics/Bitmap;

    return-void
.end method

.method public static a(I)Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    const/16 v0, 0xa

    .line 49
    if-ltz p0, :cond_0

    if-ge p0, v0, :cond_0

    .line 50
    sget-object v0, Lcom/kik/cache/ContactImageView$a;->a:[Landroid/graphics/Bitmap;

    aget-object v0, v0, p0

    .line 56
    :goto_0
    return-object v0

    .line 52
    :cond_0
    if-lt p0, v0, :cond_1

    .line 53
    sget-object v0, Lcom/kik/cache/ContactImageView$a;->a:[Landroid/graphics/Bitmap;

    const/16 v1, 0x9

    aget-object v0, v0, v1

    goto :goto_0

    .line 56
    :cond_1
    sget-object v0, Lcom/kik/cache/ContactImageView$a;->a:[Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    goto :goto_0
.end method
