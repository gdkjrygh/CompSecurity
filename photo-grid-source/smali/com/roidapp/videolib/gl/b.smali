.class final Lcom/roidapp/videolib/gl/b;
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
    .line 22
    iput-object p1, p0, Lcom/roidapp/videolib/gl/b;->a:Lcom/roidapp/videolib/gl/GPUVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 25
    iget-object v0, p0, Lcom/roidapp/videolib/gl/b;->a:Lcom/roidapp/videolib/gl/GPUVideoView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/gl/GPUVideoView;->setRenderMode(I)V

    .line 26
    return-void
.end method
