.class public Lcom/facebook/j/a/a/d;
.super Ljava/lang/Object;
.source "JavaImageResizer.java"

# interfaces
.implements Lcom/facebook/j/a/a/a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/a/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/a/a;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/facebook/j/a/a/d;->a:Landroid/content/Context;

    .line 25
    iput-object p2, p0, Lcom/facebook/j/a/a/d;->b:Lcom/facebook/a/a;

    .line 26
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/j/a/a/c;)Lcom/facebook/j/a/a/c;
    .locals 7

    .prologue
    .line 45
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 47
    :try_start_0
    iget-object v0, p0, Lcom/facebook/j/a/a/d;->b:Lcom/facebook/a/a;

    iget-object v1, p0, Lcom/facebook/j/a/a/d;->a:Landroid/content/Context;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget v4, p3, Lcom/facebook/j/a/a/c;->a:I

    iget v5, p3, Lcom/facebook/j/a/a/c;->b:I

    iget v6, p3, Lcom/facebook/j/a/a/c;->c:I

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/a/a;->a(Landroid/content/Context;Ljava/io/File;Ljava/io/File;III)Z
    :try_end_0
    .catch Lcom/facebook/a/c; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    new-instance v0, Lcom/facebook/nativejpeg/b;

    invoke-direct {v0}, Lcom/facebook/nativejpeg/b;-><init>()V

    .line 59
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/facebook/nativejpeg/b;->inJustDecodeBounds:Z

    .line 60
    invoke-static {p2, v0}, Lcom/facebook/nativejpeg/BitmapFactory;->a(Ljava/lang/String;Lcom/facebook/nativejpeg/b;)Landroid/graphics/Bitmap;

    .line 62
    new-instance v1, Lcom/facebook/j/a/a/c;

    iget v2, v0, Lcom/facebook/nativejpeg/b;->outWidth:I

    iget v0, v0, Lcom/facebook/nativejpeg/b;->outHeight:I

    iget v3, p3, Lcom/facebook/j/a/a/c;->c:I

    invoke-direct {v1, v2, v0, v3}, Lcom/facebook/j/a/a/c;-><init>(III)V

    return-object v1

    .line 54
    :catch_0
    move-exception v0

    .line 55
    new-instance v1, Lcom/facebook/j/a/a/b;

    const-string v2, "Couldn\'t resize image"

    invoke-direct {v1, v2, v0}, Lcom/facebook/j/a/a/b;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
