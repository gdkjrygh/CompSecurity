.class final Lcom/roidapp/imagelib/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/imagelib/a/a;


# direct methods
.method constructor <init>(Lcom/roidapp/imagelib/a/a;)V
    .locals 0

    .prologue
    .line 252
    iput-object p1, p0, Lcom/roidapp/imagelib/a/b;->a:Lcom/roidapp/imagelib/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 258
    iget-object v0, p0, Lcom/roidapp/imagelib/a/b;->a:Lcom/roidapp/imagelib/a/a;

    invoke-static {v0}, Lcom/roidapp/imagelib/a/a;->a(Lcom/roidapp/imagelib/a/a;)Landroid/opengl/GLSurfaceView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/opengl/GLSurfaceView;->requestLayout()V

    .line 259
    return-void
.end method
