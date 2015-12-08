.class final Lcom/roidapp/imagelib/a/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:[I

.field final synthetic d:Ljava/util/concurrent/Semaphore;

.field final synthetic e:Lcom/roidapp/imagelib/a/a;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/a/a;II[ILjava/util/concurrent/Semaphore;)V
    .locals 0

    .prologue
    .line 298
    iput-object p1, p0, Lcom/roidapp/imagelib/a/d;->e:Lcom/roidapp/imagelib/a/a;

    iput p2, p0, Lcom/roidapp/imagelib/a/d;->a:I

    iput p3, p0, Lcom/roidapp/imagelib/a/d;->b:I

    iput-object p4, p0, Lcom/roidapp/imagelib/a/d;->c:[I

    iput-object p5, p0, Lcom/roidapp/imagelib/a/d;->d:Ljava/util/concurrent/Semaphore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 301
    iget v1, p0, Lcom/roidapp/imagelib/a/d;->a:I

    iget v2, p0, Lcom/roidapp/imagelib/a/d;->b:I

    mul-int/2addr v1, v2

    invoke-static {v1}, Ljava/nio/IntBuffer;->allocate(I)Ljava/nio/IntBuffer;

    move-result-object v6

    .line 302
    iget v2, p0, Lcom/roidapp/imagelib/a/d;->a:I

    iget v3, p0, Lcom/roidapp/imagelib/a/d;->b:I

    const/16 v4, 0x1908

    const/16 v5, 0x1401

    move v1, v0

    invoke-static/range {v0 .. v6}, Landroid/opengl/GLES20;->glReadPixels(IIIIIILjava/nio/Buffer;)V

    .line 303
    invoke-virtual {v6}, Ljava/nio/IntBuffer;->array()[I

    move-result-object v3

    move v1, v0

    .line 306
    :goto_0
    iget v2, p0, Lcom/roidapp/imagelib/a/d;->b:I

    if-ge v1, v2, :cond_1

    move v2, v0

    .line 307
    :goto_1
    iget v4, p0, Lcom/roidapp/imagelib/a/d;->a:I

    if-ge v2, v4, :cond_0

    .line 308
    iget-object v4, p0, Lcom/roidapp/imagelib/a/d;->c:[I

    iget v5, p0, Lcom/roidapp/imagelib/a/d;->b:I

    sub-int/2addr v5, v1

    add-int/lit8 v5, v5, -0x1

    iget v6, p0, Lcom/roidapp/imagelib/a/d;->a:I

    mul-int/2addr v5, v6

    add-int/2addr v5, v2

    iget v6, p0, Lcom/roidapp/imagelib/a/d;->a:I

    mul-int/2addr v6, v1

    add-int/2addr v6, v2

    aget v6, v3, v6

    aput v6, v4, v5

    .line 307
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 306
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 311
    :cond_1
    iget-object v0, p0, Lcom/roidapp/imagelib/a/d;->d:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->release()V

    .line 312
    return-void
.end method
