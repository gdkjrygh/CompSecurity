.class public Lkik/android/gifs/view/EmojiLruCache;
.super Landroid/support/v4/util/LruCache;
.source "SourceFile"

# interfaces
.implements Lcom/android/volley/toolbox/i$b;


# static fields
.field private static a:Lkik/android/gifs/view/EmojiLruCache;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    const/4 v0, 0x0

    sput-object v0, Lkik/android/gifs/view/EmojiLruCache;->a:Lkik/android/gifs/view/EmojiLruCache;

    return-void
.end method

.method private constructor <init>(I)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0, p1}, Landroid/support/v4/util/LruCache;-><init>(I)V

    .line 43
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 37
    const-string v0, "activity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    invoke-virtual {v0}, Landroid/app/ActivityManager;->getMemoryClass()I

    move-result v0

    mul-int/lit16 v0, v0, 0x400

    mul-int/lit16 v0, v0, 0x400

    div-int/lit8 v0, v0, 0x32

    invoke-direct {p0, v0}, Lkik/android/gifs/view/EmojiLruCache;-><init>(I)V

    .line 38
    return-void
.end method

.method public static a(Landroid/content/Context;)Lkik/android/gifs/view/EmojiLruCache;
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lkik/android/gifs/view/EmojiLruCache;->a:Lkik/android/gifs/view/EmojiLruCache;

    if-nez v0, :cond_0

    .line 21
    new-instance v0, Lkik/android/gifs/view/EmojiLruCache;

    invoke-direct {v0, p0}, Lkik/android/gifs/view/EmojiLruCache;-><init>(Landroid/content/Context;)V

    sput-object v0, Lkik/android/gifs/view/EmojiLruCache;->a:Lkik/android/gifs/view/EmojiLruCache;

    .line 24
    :cond_0
    sget-object v0, Lkik/android/gifs/view/EmojiLruCache;->a:Lkik/android/gifs/view/EmojiLruCache;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 54
    invoke-virtual {p0, p1}, Lkik/android/gifs/view/EmojiLruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final a(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 60
    invoke-virtual {p0, p1, p2}, Lkik/android/gifs/view/EmojiLruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    return-void
.end method

.method protected synthetic sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .prologue
    .line 13
    check-cast p2, Landroid/graphics/Bitmap;

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getRowBytes()I

    move-result v0

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    mul-int/2addr v0, v1

    return v0
.end method
