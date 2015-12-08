.class final Lcom/roidapp/photogrid/video/bn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/graphics/drawable/AnimationDrawable;

.field final synthetic b:Lcom/roidapp/photogrid/video/VideoPictureEditActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/VideoPictureEditActivity;Landroid/graphics/drawable/AnimationDrawable;)V
    .locals 0

    .prologue
    .line 120
    iput-object p1, p0, Lcom/roidapp/photogrid/video/bn;->b:Lcom/roidapp/photogrid/video/VideoPictureEditActivity;

    iput-object p2, p0, Lcom/roidapp/photogrid/video/bn;->a:Landroid/graphics/drawable/AnimationDrawable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 123
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bn;->a:Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v0, :cond_0

    .line 124
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bn;->a:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 126
    :cond_0
    return-void
.end method
