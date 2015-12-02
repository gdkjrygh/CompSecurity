.class Lcom/facebook/orca/camera/t;
.super Ljava/lang/Object;
.source "ImageViewTouchBase.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/widget/images/e;

.field final synthetic b:Z

.field final synthetic c:Lcom/facebook/orca/camera/s;


# direct methods
.method constructor <init>(Lcom/facebook/orca/camera/s;Lcom/facebook/widget/images/e;Z)V
    .locals 0

    .prologue
    .line 165
    iput-object p1, p0, Lcom/facebook/orca/camera/t;->c:Lcom/facebook/orca/camera/s;

    iput-object p2, p0, Lcom/facebook/orca/camera/t;->a:Lcom/facebook/widget/images/e;

    iput-boolean p3, p0, Lcom/facebook/orca/camera/t;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 167
    iget-object v0, p0, Lcom/facebook/orca/camera/t;->c:Lcom/facebook/orca/camera/s;

    iget-object v1, p0, Lcom/facebook/orca/camera/t;->a:Lcom/facebook/widget/images/e;

    iget-boolean v2, p0, Lcom/facebook/orca/camera/t;->b:Z

    invoke-virtual {v0, v1, v2}, Lcom/facebook/orca/camera/s;->a(Lcom/facebook/widget/images/e;Z)V

    .line 168
    return-void
.end method
