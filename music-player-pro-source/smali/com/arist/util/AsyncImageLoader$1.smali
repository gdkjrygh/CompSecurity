.class Lcom/arist/util/AsyncImageLoader$1;
.super Landroid/os/Handler;
.source "AsyncImageLoader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/util/AsyncImageLoader;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/util/AsyncImageLoader;


# direct methods
.method constructor <init>(Lcom/arist/util/AsyncImageLoader;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/util/AsyncImageLoader$1;->this$0:Lcom/arist/util/AsyncImageLoader;

    .line 22
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 25
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 34
    :goto_0
    return-void

    .line 27
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;

    .line 28
    .local v0, "task":Lcom/arist/util/AsyncImageLoader$ImageLoadTask;
    # getter for: Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->callback:Lcom/arist/util/AsyncImageLoader$Callback;
    invoke-static {v0}, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->access$0(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;)Lcom/arist/util/AsyncImageLoader$Callback;

    move-result-object v1

    # getter for: Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->netPath:Ljava/lang/String;
    invoke-static {v0}, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->access$1(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;)Ljava/lang/String;

    move-result-object v2

    # getter for: Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;
    invoke-static {v0}, Lcom/arist/util/AsyncImageLoader$ImageLoadTask;->access$2(Lcom/arist/util/AsyncImageLoader$ImageLoadTask;)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lcom/arist/util/AsyncImageLoader$Callback;->imageLoaded(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
