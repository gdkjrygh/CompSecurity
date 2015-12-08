.class public final La/a/a/a/a/g/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final d:I


# direct methods
.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, La/a/a/a/a/g/n;->a:Ljava/lang/String;

    .line 39
    iput p2, p0, La/a/a/a/a/g/n;->b:I

    .line 40
    iput p3, p0, La/a/a/a/a/g/n;->c:I

    .line 41
    iput p4, p0, La/a/a/a/a/g/n;->d:I

    .line 42
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)La/a/a/a/a/g/n;
    .locals 5

    .prologue
    .line 50
    const/4 v1, 0x0

    .line 54
    if-eqz p1, :cond_0

    .line 56
    :try_start_0
    invoke-static {p0}, La/a/a/a/a/b/l;->k(Landroid/content/Context;)I

    move-result v2

    .line 57
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 62
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 63
    const/4 v0, 0x1

    iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 65
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-static {v0, v2, v3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 67
    new-instance v0, La/a/a/a/a/g/n;

    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v3, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-direct {v0, p1, v2, v4, v3}, La/a/a/a/a/g/n;-><init>(Ljava/lang/String;III)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    :goto_0
    return-object v0

    .line 69
    :catch_0
    move-exception v0

    .line 70
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Failed to load icon"

    invoke-interface {v2, v3, v4, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    move-object v0, v1

    goto :goto_0
.end method
