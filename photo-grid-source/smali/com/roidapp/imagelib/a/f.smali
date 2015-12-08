.class final Lcom/roidapp/imagelib/a/f;
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
.field final synthetic a:Lcom/roidapp/imagelib/a/a;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:I

.field private final f:Lcom/roidapp/imagelib/a/e;

.field private final g:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lcom/roidapp/imagelib/a/a;ILcom/roidapp/imagelib/a/e;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 336
    iput-object p1, p0, Lcom/roidapp/imagelib/a/f;->a:Lcom/roidapp/imagelib/a/a;

    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 337
    iput-object v0, p0, Lcom/roidapp/imagelib/a/f;->b:Ljava/lang/String;

    .line 338
    iput-object v0, p0, Lcom/roidapp/imagelib/a/f;->c:Ljava/lang/String;

    .line 339
    const/16 v0, 0x168

    iput v0, p0, Lcom/roidapp/imagelib/a/f;->d:I

    .line 340
    iput p2, p0, Lcom/roidapp/imagelib/a/f;->e:I

    .line 341
    iput-object p3, p0, Lcom/roidapp/imagelib/a/f;->f:Lcom/roidapp/imagelib/a/e;

    .line 342
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/a/f;->g:Landroid/os/Handler;

    .line 343
    return-void
.end method

.method private varargs a()Landroid/graphics/Bitmap;
    .locals 3

    .prologue
    .line 357
    :try_start_0
    iget v0, p0, Lcom/roidapp/imagelib/a/f;->d:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/a/f;->a:Lcom/roidapp/imagelib/a/a;

    iget v1, p0, Lcom/roidapp/imagelib/a/f;->d:I

    iget v2, p0, Lcom/roidapp/imagelib/a/f;->e:I

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/imagelib/a/a;->a(II)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 363
    :goto_0
    return-object v0

    .line 357
    :cond_0
    iget-object v0, p0, Lcom/roidapp/imagelib/a/f;->a:Lcom/roidapp/imagelib/a/a;

    invoke-virtual {v0}, Lcom/roidapp/imagelib/a/a;->h()Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 361
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    .line 363
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 322
    invoke-direct {p0}, Lcom/roidapp/imagelib/a/f;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 322
    check-cast p1, Landroid/graphics/Bitmap;

    .line 1368
    iget-object v0, p0, Lcom/roidapp/imagelib/a/f;->f:Lcom/roidapp/imagelib/a/e;

    invoke-interface {v0, p1}, Lcom/roidapp/imagelib/a/e;->a(Landroid/graphics/Bitmap;)V

    .line 322
    return-void
.end method
