.class final Lcom/roidapp/imagelib/crop/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/crop/t;

.field final synthetic b:Z

.field final synthetic c:Lcom/roidapp/imagelib/crop/ImageViewTouchBase;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/crop/ImageViewTouchBase;Lcom/roidapp/imagelib/crop/t;Z)V
    .locals 0

    .prologue
    .line 163
    iput-object p1, p0, Lcom/roidapp/imagelib/crop/r;->c:Lcom/roidapp/imagelib/crop/ImageViewTouchBase;

    iput-object p2, p0, Lcom/roidapp/imagelib/crop/r;->a:Lcom/roidapp/imagelib/crop/t;

    iput-boolean p3, p0, Lcom/roidapp/imagelib/crop/r;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    .line 165
    iget-object v0, p0, Lcom/roidapp/imagelib/crop/r;->c:Lcom/roidapp/imagelib/crop/ImageViewTouchBase;

    iget-object v1, p0, Lcom/roidapp/imagelib/crop/r;->a:Lcom/roidapp/imagelib/crop/t;

    iget-boolean v2, p0, Lcom/roidapp/imagelib/crop/r;->b:Z

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/imagelib/crop/ImageViewTouchBase;->a(Lcom/roidapp/imagelib/crop/t;Z)V

    .line 166
    return-void
.end method
