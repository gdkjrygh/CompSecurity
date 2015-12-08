.class Lcom/yong/gift/AsyncGiftImageLoader$1;
.super Landroid/os/Handler;
.source "AsyncGiftImageLoader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yong/gift/AsyncGiftImageLoader;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/yong/gift/AsyncGiftImageLoader;


# direct methods
.method constructor <init>(Lcom/yong/gift/AsyncGiftImageLoader;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/yong/gift/AsyncGiftImageLoader$1;->this$0:Lcom/yong/gift/AsyncGiftImageLoader;

    .line 29
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 32
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 41
    :goto_0
    return-void

    .line 34
    :pswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;

    .line 35
    .local v0, "task":Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;
    # getter for: Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->callback:Lcom/yong/gift/AsyncGiftImageLoader$Callback;
    invoke-static {v0}, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->access$0(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;)Lcom/yong/gift/AsyncGiftImageLoader$Callback;

    move-result-object v1

    # getter for: Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;
    invoke-static {v0}, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->access$1(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;)Ljava/lang/String;

    move-result-object v2

    # getter for: Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;
    invoke-static {v0}, Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;->access$2(Lcom/yong/gift/AsyncGiftImageLoader$ImageLoadTask;)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lcom/yong/gift/AsyncGiftImageLoader$Callback;->imageLoaded(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 32
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
