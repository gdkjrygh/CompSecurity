.class public Lcom/facebook/nativejpeg/b;
.super Landroid/graphics/BitmapFactory$Options;
.source "BitmapFactory.java"


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Ljava/io/OutputStream;

.field public h:I

.field public i:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    const/4 v0, -0x1

    .line 47
    invoke-direct {p0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 48
    iput v0, p0, Lcom/facebook/nativejpeg/b;->a:I

    .line 49
    iput v0, p0, Lcom/facebook/nativejpeg/b;->b:I

    .line 50
    iput-boolean v2, p0, Lcom/facebook/nativejpeg/b;->c:Z

    .line 51
    iput-boolean v1, p0, Lcom/facebook/nativejpeg/b;->d:Z

    .line 52
    iput-boolean v1, p0, Lcom/facebook/nativejpeg/b;->e:Z

    .line 53
    iput-object v3, p0, Lcom/facebook/nativejpeg/b;->i:Landroid/graphics/Bitmap;

    .line 54
    iput-object v3, p0, Lcom/facebook/nativejpeg/b;->g:Ljava/io/OutputStream;

    .line 55
    iput-boolean v2, p0, Lcom/facebook/nativejpeg/b;->f:Z

    .line 56
    const/16 v0, 0x50

    iput v0, p0, Lcom/facebook/nativejpeg/b;->h:I

    .line 57
    return-void
.end method
