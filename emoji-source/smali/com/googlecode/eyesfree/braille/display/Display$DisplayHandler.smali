.class Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;
.super Landroid/os/Handler;
.source "Display.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/eyesfree/braille/display/Display;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DisplayHandler"
.end annotation


# static fields
.field private static final MSG_REBIND_SERVICE:I = 0x3

.field private static final MSG_REPORT_CONNECTION_STATE:I = 0x1

.field private static final MSG_REPORT_INPUT_EVENT:I = 0x2


# instance fields
.field final synthetic this$0:Lcom/googlecode/eyesfree/braille/display/Display;


# direct methods
.method public constructor <init>(Lcom/googlecode/eyesfree/braille/display/Display;)V
    .locals 0

    .prologue
    .line 248
    iput-object p1, p0, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 249
    return-void
.end method

.method public constructor <init>(Lcom/googlecode/eyesfree/braille/display/Display;Landroid/os/Handler;)V
    .locals 1
    .param p2, "handler"    # Landroid/os/Handler;

    .prologue
    .line 251
    iput-object p1, p0, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    .line 252
    invoke-virtual {p2}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 253
    return-void
.end method

.method private handleRebindService()V
    .locals 1

    .prologue
    .line 315
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # getter for: Lcom/googlecode/eyesfree/braille/display/Display;->mConnection:Lcom/googlecode/eyesfree/braille/display/Display$Connection;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/display/Display;->access$1100(Lcom/googlecode/eyesfree/braille/display/Display;)Lcom/googlecode/eyesfree/braille/display/Display$Connection;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 316
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # invokes: Lcom/googlecode/eyesfree/braille/display/Display;->doUnbindService()V
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/display/Display;->access$1200(Lcom/googlecode/eyesfree/braille/display/Display;)V

    .line 318
    :cond_0
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # invokes: Lcom/googlecode/eyesfree/braille/display/Display;->doBindService()V
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/display/Display;->access$1300(Lcom/googlecode/eyesfree/braille/display/Display;)V

    .line 319
    return-void
.end method

.method private handleReportConnectionState(ILcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;)V
    .locals 1
    .param p1, "newState"    # I
    .param p2, "displayProperties"    # Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;

    .prologue
    .line 298
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # setter for: Lcom/googlecode/eyesfree/braille/display/Display;->mDisplayProperties:Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;
    invoke-static {v0, p2}, Lcom/googlecode/eyesfree/braille/display/Display;->access$702(Lcom/googlecode/eyesfree/braille/display/Display;Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;)Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;

    .line 299
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # getter for: Lcom/googlecode/eyesfree/braille/display/Display;->currentConnectionState:I
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/display/Display;->access$800(Lcom/googlecode/eyesfree/braille/display/Display;)I

    move-result v0

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # getter for: Lcom/googlecode/eyesfree/braille/display/Display;->mConnectionStateChangeListener:Lcom/googlecode/eyesfree/braille/display/Display$OnConnectionStateChangeListener;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/display/Display;->access$900(Lcom/googlecode/eyesfree/braille/display/Display;)Lcom/googlecode/eyesfree/braille/display/Display$OnConnectionStateChangeListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 301
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # getter for: Lcom/googlecode/eyesfree/braille/display/Display;->mConnectionStateChangeListener:Lcom/googlecode/eyesfree/braille/display/Display$OnConnectionStateChangeListener;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/display/Display;->access$900(Lcom/googlecode/eyesfree/braille/display/Display;)Lcom/googlecode/eyesfree/braille/display/Display$OnConnectionStateChangeListener;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/googlecode/eyesfree/braille/display/Display$OnConnectionStateChangeListener;->onConnectionStateChanged(I)V

    .line 304
    :cond_0
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # setter for: Lcom/googlecode/eyesfree/braille/display/Display;->currentConnectionState:I
    invoke-static {v0, p1}, Lcom/googlecode/eyesfree/braille/display/Display;->access$802(Lcom/googlecode/eyesfree/braille/display/Display;I)I

    .line 305
    return-void
.end method

.method private handleReportInputEvent(Lcom/googlecode/eyesfree/braille/display/BrailleInputEvent;)V
    .locals 2
    .param p1, "event"    # Lcom/googlecode/eyesfree/braille/display/BrailleInputEvent;

    .prologue
    .line 308
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # getter for: Lcom/googlecode/eyesfree/braille/display/Display;->mInputEventListener:Lcom/googlecode/eyesfree/braille/display/Display$OnInputEventListener;
    invoke-static {v1}, Lcom/googlecode/eyesfree/braille/display/Display;->access$1000(Lcom/googlecode/eyesfree/braille/display/Display;)Lcom/googlecode/eyesfree/braille/display/Display$OnInputEventListener;

    move-result-object v0

    .line 309
    .local v0, "localListener":Lcom/googlecode/eyesfree/braille/display/Display$OnInputEventListener;
    if-eqz v0, :cond_0

    .line 310
    invoke-interface {v0, p1}, Lcom/googlecode/eyesfree/braille/display/Display$OnInputEventListener;->onInputEvent(Lcom/googlecode/eyesfree/braille/display/BrailleInputEvent;)V

    .line 312
    :cond_0
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2
    .param p1, "msg"    # Landroid/os/Message;

    .prologue
    .line 282
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 294
    :goto_0
    return-void

    .line 284
    :pswitch_0
    iget v1, p1, Landroid/os/Message;->arg1:I

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;

    invoke-direct {p0, v1, v0}, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->handleReportConnectionState(ILcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;)V

    goto :goto_0

    .line 288
    :pswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Lcom/googlecode/eyesfree/braille/display/BrailleInputEvent;

    invoke-direct {p0, v0}, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->handleReportInputEvent(Lcom/googlecode/eyesfree/braille/display/BrailleInputEvent;)V

    goto :goto_0

    .line 291
    :pswitch_2
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->handleRebindService()V

    goto :goto_0

    .line 282
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public reportConnectionState(ILcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;)V
    .locals 2
    .param p1, "newState"    # I
    .param p2, "displayProperties"    # Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;

    .prologue
    .line 257
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1, p2}, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 260
    return-void
.end method

.method public reportInputEvent(Lcom/googlecode/eyesfree/braille/display/BrailleInputEvent;)V
    .locals 1
    .param p1, "event"    # Lcom/googlecode/eyesfree/braille/display/BrailleInputEvent;

    .prologue
    .line 263
    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 264
    return-void
.end method

.method public scheduleRebind()V
    .locals 6

    .prologue
    .line 267
    monitor-enter p0

    .line 268
    :try_start_0
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # getter for: Lcom/googlecode/eyesfree/braille/display/Display;->mNumFailedBinds:I
    invoke-static {v1}, Lcom/googlecode/eyesfree/braille/display/Display;->access$400(Lcom/googlecode/eyesfree/braille/display/Display;)I

    move-result v1

    const/4 v2, 0x5

    if-ge v1, v2, :cond_0

    .line 269
    const/16 v1, 0x1f4

    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # getter for: Lcom/googlecode/eyesfree/braille/display/Display;->mNumFailedBinds:I
    invoke-static {v2}, Lcom/googlecode/eyesfree/braille/display/Display;->access$400(Lcom/googlecode/eyesfree/braille/display/Display;)I

    move-result v2

    shl-int v0, v1, v2

    .line 270
    .local v0, "delay":I
    const/4 v1, 0x3

    int-to-long v2, v0

    invoke-virtual {p0, v1, v2, v3}, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 271
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # ++operator for: Lcom/googlecode/eyesfree/braille/display/Display;->mNumFailedBinds:I
    invoke-static {v1}, Lcom/googlecode/eyesfree/braille/display/Display;->access$404(Lcom/googlecode/eyesfree/braille/display/Display;)I

    .line 272
    # getter for: Lcom/googlecode/eyesfree/braille/display/Display;->LOG_TAG:Ljava/lang/String;
    invoke-static {}, Lcom/googlecode/eyesfree/braille/display/Display;->access$100()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Will rebind to braille service in %d ms."

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 277
    .end local v0    # "delay":I
    :goto_0
    monitor-exit p0

    .line 278
    return-void

    .line 275
    :cond_0
    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2}, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->reportConnectionState(ILcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;)V

    goto :goto_0

    .line 277
    :catchall_0
    move-exception v1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
