.class final Lcom/roidapp/videolib/gl/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/videolib/gl/GPUVideoView;


# direct methods
.method constructor <init>(Lcom/roidapp/videolib/gl/GPUVideoView;)V
    .locals 0

    .prologue
    .line 29
    iput-object p1, p0, Lcom/roidapp/videolib/gl/c;->a:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/roidapp/videolib/gl/c;->a:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-static {v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->a(Lcom/roidapp/videolib/gl/GPUVideoView;)Lcom/roidapp/videolib/b/i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/i;->a()V

    .line 33
    iget-object v0, p0, Lcom/roidapp/videolib/gl/c;->a:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-virtual {v0}, Lcom/roidapp/videolib/gl/GPUVideoView;->requestRender()V

    .line 34
    return-void
.end method
