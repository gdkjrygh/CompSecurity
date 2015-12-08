.class final Lcom/roidapp/imagelib/d/c;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/d/b;

.field private final b:Ljava/lang/String;

.field private final c:Landroid/graphics/Bitmap;

.field private final d:I

.field private e:Lcom/roidapp/imagelib/d/d;


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/d/b;Ljava/lang/String;Landroid/graphics/Bitmap;ILcom/roidapp/imagelib/d/d;)V
    .locals 0

    .prologue
    .line 43
    iput-object p1, p0, Lcom/roidapp/imagelib/d/c;->a:Lcom/roidapp/imagelib/d/b;

    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 44
    iput-object p2, p0, Lcom/roidapp/imagelib/d/c;->b:Ljava/lang/String;

    .line 45
    iput p4, p0, Lcom/roidapp/imagelib/d/c;->d:I

    .line 46
    iput-object p5, p0, Lcom/roidapp/imagelib/d/c;->e:Lcom/roidapp/imagelib/d/d;

    .line 47
    iput-object p3, p0, Lcom/roidapp/imagelib/d/c;->c:Landroid/graphics/Bitmap;

    .line 48
    return-void
.end method

.method private varargs a()Landroid/graphics/Bitmap;
    .locals 2

    .prologue
    .line 54
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/imagelib/d/c;->c:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/d/c;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 55
    iget-object v0, p0, Lcom/roidapp/imagelib/d/c;->c:Landroid/graphics/Bitmap;

    iget v1, p0, Lcom/roidapp/imagelib/d/c;->d:I

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/b/c;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 63
    :goto_0
    return-object v0

    .line 57
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/d/c;->b:Ljava/lang/String;

    iget v1, p0, Lcom/roidapp/imagelib/d/c;->d:I

    invoke-static {v0, v1}, Lcom/roidapp/imagelib/b/c;->a(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 61
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 63
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/roidapp/imagelib/d/c;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 37
    check-cast p1, Landroid/graphics/Bitmap;

    .line 1068
    if-nez p1, :cond_0

    .line 1069
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    const-string v1, "Do blur out of memory"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 1071
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/d/c;->e:Lcom/roidapp/imagelib/d/d;

    if-eqz v0, :cond_1

    .line 1072
    iget-object v0, p0, Lcom/roidapp/imagelib/d/c;->e:Lcom/roidapp/imagelib/d/d;

    invoke-interface {v0, p1}, Lcom/roidapp/imagelib/d/d;->a(Landroid/graphics/Bitmap;)V

    .line 37
    :cond_1
    return-void
.end method
