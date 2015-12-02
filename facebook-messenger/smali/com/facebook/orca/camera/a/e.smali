.class public Lcom/facebook/orca/camera/a/e;
.super Lcom/facebook/orca/camera/a/a;
.source "Image.java"

# interfaces
.implements Lcom/facebook/orca/camera/a/c;


# static fields
.field private static final i:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static final k:[Ljava/lang/String;


# instance fields
.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 39
    const-class v0, Lcom/facebook/orca/camera/a/a;

    sput-object v0, Lcom/facebook/orca/camera/a/e;->i:Ljava/lang/Class;

    .line 147
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "_id"

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/orca/camera/a/e;->k:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/orca/camera/a/b;Landroid/content/ContentResolver;JILandroid/net/Uri;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 49
    invoke-direct/range {p0 .. p14}, Lcom/facebook/orca/camera/a/a;-><init>(Lcom/facebook/orca/camera/a/b;Landroid/content/ContentResolver;JILandroid/net/Uri;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    .line 51
    iput p15, p0, Lcom/facebook/orca/camera/a/e;->j:I

    .line 52
    return-void
.end method


# virtual methods
.method public a(Z)Landroid/graphics/Bitmap;
    .locals 5

    .prologue
    .line 152
    .line 153
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 154
    const/4 v1, 0x0

    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inDither:Z

    .line 155
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    iput-object v1, v0, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 156
    iget-object v1, p0, Lcom/facebook/orca/camera/a/e;->a:Landroid/content/ContentResolver;

    iget-wide v2, p0, Lcom/facebook/orca/camera/a/e;->c:J

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4, v0}, Landroid/provider/MediaStore$Images$Thumbnails;->getThumbnail(Landroid/content/ContentResolver;JILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 159
    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 160
    invoke-virtual {p0}, Lcom/facebook/orca/camera/a/e;->c()I

    move-result v1

    invoke-static {v0, v1}, Lcom/facebook/orca/camera/aa;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 163
    :cond_0
    return-object v0
.end method

.method public c()I
    .locals 1

    .prologue
    .line 56
    iget v0, p0, Lcom/facebook/orca/camera/a/e;->j:I

    return v0
.end method
