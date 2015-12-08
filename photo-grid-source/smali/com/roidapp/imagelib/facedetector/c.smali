.class final Lcom/roidapp/imagelib/facedetector/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/Throwable;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/roidapp/imagelib/facedetector/a;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/facedetector/a;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 248
    iput-object p1, p0, Lcom/roidapp/imagelib/facedetector/c;->c:Lcom/roidapp/imagelib/facedetector/a;

    iput-object p2, p0, Lcom/roidapp/imagelib/facedetector/c;->a:Ljava/lang/Throwable;

    iput-object p3, p0, Lcom/roidapp/imagelib/facedetector/c;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 252
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/c;->c:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/facedetector/a;->b(Lcom/roidapp/imagelib/facedetector/a;)Lcom/roidapp/imagelib/facedetector/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 253
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/c;->c:Lcom/roidapp/imagelib/facedetector/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/facedetector/a;->b(Lcom/roidapp/imagelib/facedetector/a;)Lcom/roidapp/imagelib/facedetector/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/c;->a:Ljava/lang/Throwable;

    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/c;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/roidapp/imagelib/facedetector/e;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 255
    :cond_0
    return-void
.end method
