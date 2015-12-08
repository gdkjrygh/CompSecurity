.class Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;
.super Landroid/os/Handler;
.source "TranslatorManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TranslatorManagerHandler"
.end annotation


# static fields
.field private static final MSG_ON_INIT:I = 0x1

.field private static final MSG_REBIND_SERVICE:I = 0x2


# instance fields
.field final synthetic this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;


# direct methods
.method private constructor <init>(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)V
    .locals 0

    .prologue
    .line 225
    iput-object p1, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;
    .param p2, "x1"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$1;

    .prologue
    .line 225
    invoke-direct {p0, p1}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;-><init>(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)V

    return-void
.end method

.method private handleOnInit(I)V
    .locals 2
    .param p1, "status"    # I

    .prologue
    .line 265
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    # getter for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mOnInitListener:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$900(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 266
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    # getter for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mOnInitListener:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$900(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;->onInit(I)V

    .line 267
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    const/4 v1, 0x0

    # setter for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mOnInitListener:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;
    invoke-static {v0, v1}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$902(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;)Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;

    .line 269
    :cond_0
    return-void
.end method

.method private handleRebindService()V
    .locals 1

    .prologue
    .line 272
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    # getter for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mConnection:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$1000(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 273
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    # invokes: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->doUnbindService()V
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$1100(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)V

    .line 275
    :cond_0
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    # invokes: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->doBindService()V
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$1200(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)V

    .line 276
    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 234
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    # setter for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mOnInitListener:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;
    invoke-static {v0, v1}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$902(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;)Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;

    .line 237
    invoke-virtual {p0, v1}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 238
    return-void
.end method

.method public handleMessage(Landroid/os/Message;)V
    .locals 1
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 254
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 262
    :goto_0
    return-void

    .line 256
    :pswitch_0
    iget v0, p1, Landroid/os/Message;->arg1:I

    invoke-direct {p0, v0}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->handleOnInit(I)V

    goto :goto_0

    .line 259
    :pswitch_1
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->handleRebindService()V

    goto :goto_0

    .line 254
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onInit(I)V
    .locals 2
    .param p1, "status"    # I

    .prologue
    .line 230
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->obtainMessage(III)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 231
    return-void
.end method

.method public scheduleRebind()V
    .locals 4

    .prologue
    .line 241
    monitor-enter p0

    .line 242
    :try_start_0
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    # getter for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mNumFailedBinds:I
    invoke-static {v1}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$700(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)I

    move-result v1

    const/4 v2, 0x5

    if-ge v1, v2, :cond_0

    .line 243
    const/16 v1, 0x1f4

    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    # getter for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mNumFailedBinds:I
    invoke-static {v2}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$700(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)I

    move-result v2

    shl-int v0, v1, v2

    .line 244
    .local v0, "delay":I
    const/4 v1, 0x2

    int-to-long v2, v0

    invoke-virtual {p0, v1, v2, v3}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 245
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    # ++operator for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mNumFailedBinds:I
    invoke-static {v1}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$704(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)I

    .line 249
    .end local v0    # "delay":I
    :goto_0
    monitor-exit p0

    .line 250
    return-void

    .line 247
    :cond_0
    const/4 v1, -0x1

    invoke-virtual {p0, v1}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->onInit(I)V

    goto :goto_0

    .line 249
    :catchall_0
    move-exception v1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
