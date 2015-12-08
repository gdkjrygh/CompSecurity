.class public Lkik/android/gifs/view/GifView;
.super Lkik/android/widget/ClampedContentPreviewView;
.source "SourceFile"


# instance fields
.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lkik/android/gifs/view/GifView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 38
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 42
    invoke-direct {p0, p1, p2}, Lkik/android/widget/ClampedContentPreviewView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/gifs/view/GifView;->i:Ljava/lang/String;

    .line 44
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 45
    const v1, -0x333334

    invoke-virtual {v0, v1}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 46
    invoke-virtual {p0, v0}, Lkik/android/gifs/view/GifView;->a(Landroid/graphics/Bitmap;)V

    .line 47
    return-void
.end method

.method static synthetic a(Lkik/android/gifs/view/GifView;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lkik/android/gifs/view/GifView;->h:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lkik/android/gifs/view/GifView;Lkik/android/gifs/view/a;)V
    .locals 2

    .prologue
    .line 30
    invoke-static {}, Lkik/android/gifs/b;->a()Lkik/android/gifs/b;

    move-result-object v0

    new-instance v1, Lkik/android/gifs/view/d;

    invoke-direct {v1, p0, p1}, Lkik/android/gifs/view/d;-><init>(Lkik/android/gifs/view/GifView;Lkik/android/gifs/view/a;)V

    invoke-virtual {v0, v1}, Lkik/android/gifs/b;->a(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lkik/android/gifs/a/f$a;)Lcom/kik/g/p;
    .locals 3

    .prologue
    .line 56
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 57
    iput-object p1, p0, Lkik/android/gifs/view/GifView;->h:Ljava/lang/String;

    .line 58
    invoke-static {}, Lkik/android/gifs/b;->a()Lkik/android/gifs/b;

    move-result-object v1

    invoke-virtual {v1, p1, p2, p0}, Lkik/android/gifs/b;->a(Ljava/lang/String;Lkik/android/gifs/a/f$a;Lkik/android/gifs/view/GifView;)Lcom/kik/g/p;

    move-result-object v1

    new-instance v2, Lkik/android/gifs/view/c;

    invoke-direct {v2, p0, v0}, Lkik/android/gifs/view/c;-><init>(Lkik/android/gifs/view/GifView;Lcom/kik/g/p;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 72
    return-object v0
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lkik/android/gifs/view/GifView;->i:Ljava/lang/String;

    return-object v0
.end method

.method protected final a(Landroid/graphics/Bitmap;Ljava/lang/String;)Lkik/android/widget/w;
    .locals 1

    .prologue
    .line 102
    new-instance v0, Lkik/android/widget/cs;

    invoke-direct {v0, p1, p2}, Lkik/android/widget/cs;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 110
    iput-object v0, p0, Lkik/android/gifs/view/GifView;->h:Ljava/lang/String;

    .line 111
    invoke-virtual {p0, v0}, Lkik/android/gifs/view/GifView;->b(Landroid/graphics/drawable/Drawable;)V

    .line 112
    invoke-virtual {p0}, Lkik/android/gifs/view/GifView;->f()V

    .line 113
    return-void
.end method
