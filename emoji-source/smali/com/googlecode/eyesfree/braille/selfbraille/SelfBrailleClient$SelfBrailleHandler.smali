.class Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;
.super Landroid/os/Handler;
.source "SelfBrailleClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SelfBrailleHandler"
.end annotation


# static fields
.field private static final MSG_REBIND_SERVICE:I = 0x1

.field private static final MSG_UNBIND_SERVICE:I = 0x2


# instance fields
.field final synthetic this$0:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;


# direct methods
.method private constructor <init>(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)V
    .locals 0

    .prologue
    .line 223
    iput-object p1, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;->this$0:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;
    .param p2, "x1"    # Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$1;

    .prologue
    .line 223
    invoke-direct {p0, p1}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;-><init>(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)V

    return-void
.end method

.method private handleRebindService()V
    .locals 1

    .prologue
    .line 254
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;->this$0:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    # getter for: Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mShutdown:Z
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->access$700(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 261
    :goto_0
    return-void

    .line 257
    :cond_0
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;->this$0:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    # getter for: Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mConnection:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->access$800(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 258
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;->this$0:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    # invokes: Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->doUnbindService()V
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->access$900(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)V

    .line 260
    :cond_1
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;->this$0:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    # invokes: Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->doBindService()V
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->access$1000(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)V

    goto :goto_0
.end method

.method private handleUnbindService()V
    .locals 1

    .prologue
    .line 264
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;->this$0:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    # invokes: Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->doUnbindService()V
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->access$900(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)V

    .line 265
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 243
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 251
    :goto_0
    return-void

    .line 245
    :pswitch_0
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;->handleRebindService()V

    goto :goto_0

    .line 248
    :pswitch_1
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;->handleUnbindService()V

    goto :goto_0

    .line 243
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public scheduleRebind()V
    .locals 4

    .prologue
    .line 228
    monitor-enter p0

    .line 229
    :try_start_0
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;->this$0:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    # getter for: Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mNumFailedBinds:I
    invoke-static {v1}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->access$600(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)I

    move-result v1

    const/4 v2, 0x5

    if-ge v1, v2, :cond_0

    .line 230
    const/16 v1, 0x1f4

    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;->this$0:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    # getter for: Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mNumFailedBinds:I
    invoke-static {v2}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->access$600(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)I

    move-result v2

    shl-int v0, v1, v2

    .line 231
    .local v0, "delay":I
    const/4 v1, 0x1

    int-to-long v2, v0

    invoke-virtual {p0, v1, v2, v3}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 232
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;->this$0:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    # ++operator for: Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mNumFailedBinds:I
    invoke-static {v1}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->access$604(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)I

    .line 234
    .end local v0    # "delay":I
    :cond_0
    monitor-exit p0

    .line 235
    return-void

    .line 234
    :catchall_0
    move-exception v1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public unbindService()V
    .locals 1

    .prologue
    .line 238
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;->sendEmptyMessage(I)Z

    .line 239
    return-void
.end method
