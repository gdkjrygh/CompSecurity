.class Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$1;
.super Landroid/os/Handler;
.source "AsyncGiftImageLoader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;


# direct methods
.method constructor <init>(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$1;->this$0:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader;

    .line 26
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 29
    iget v1, p1, Landroid/os/Message;->what:I

    packed-switch v1, :pswitch_data_0

    .line 51
    :goto_0
    return-void

    .line 32
    :pswitch_0
    :try_start_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;

    .line 33
    .local v0, "task":Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;
    # getter for: Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->callback:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;
    invoke-static {v0}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->access$0(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;)Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;

    move-result-object v1

    # getter for: Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;
    invoke-static {v0}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->access$1(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;)Ljava/lang/String;

    move-result-object v2

    .line 34
    # getter for: Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;
    invoke-static {v0}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->access$2(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 33
    invoke-interface {v1, v2, v3}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;->imageLoaded(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 39
    .end local v0    # "task":Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;
    :goto_1
    :try_start_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;

    .line 40
    .restart local v0    # "task":Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;
    # getter for: Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->callback:Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;
    invoke-static {v0}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->access$0(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;)Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;

    move-result-object v1

    # getter for: Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->icon_netPath:Ljava/lang/String;
    invoke-static {v0}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->access$1(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;)Ljava/lang/String;

    move-result-object v2

    .line 41
    # getter for: Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->bitmap:Landroid/graphics/Bitmap;
    invoke-static {v0}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;->access$2(Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 40
    invoke-interface {v1, v2, v3}, Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$Callback;->imageLoaded(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 42
    .end local v0    # "task":Lnet/coocent/android/xmlparser/AsyncGiftImageLoader$ImageLoadTask;
    :catch_0
    move-exception v1

    goto :goto_0

    .line 35
    :catch_1
    move-exception v1

    goto :goto_1

    .line 29
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
