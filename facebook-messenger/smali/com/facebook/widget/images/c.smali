.class Lcom/facebook/widget/images/c;
.super Ljava/lang/Object;
.source "ImageViewTouchBase.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/widget/images/e;

.field final synthetic b:Z

.field final synthetic c:Lcom/facebook/widget/images/ImageViewTouchBase;


# direct methods
.method constructor <init>(Lcom/facebook/widget/images/ImageViewTouchBase;Lcom/facebook/widget/images/e;Z)V
    .locals 0

    .prologue
    .line 206
    iput-object p1, p0, Lcom/facebook/widget/images/c;->c:Lcom/facebook/widget/images/ImageViewTouchBase;

    iput-object p2, p0, Lcom/facebook/widget/images/c;->a:Lcom/facebook/widget/images/e;

    iput-boolean p3, p0, Lcom/facebook/widget/images/c;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 209
    iget-object v0, p0, Lcom/facebook/widget/images/c;->c:Lcom/facebook/widget/images/ImageViewTouchBase;

    iget-object v1, p0, Lcom/facebook/widget/images/c;->a:Lcom/facebook/widget/images/e;

    iget-boolean v2, p0, Lcom/facebook/widget/images/c;->b:Z

    invoke-virtual {v0, v1, v2}, Lcom/facebook/widget/images/ImageViewTouchBase;->a(Lcom/facebook/widget/images/e;Z)V

    .line 210
    return-void
.end method
