.class Lcom/googlecode/eyesfree/braille/display/Display$Connection;
.super Ljava/lang/Object;
.source "Display.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/eyesfree/braille/display/Display;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "Connection"
.end annotation


# instance fields
.field private volatile mService:Lcom/googlecode/eyesfree/braille/display/IBrailleService;

.field final synthetic this$0:Lcom/googlecode/eyesfree/braille/display/Display;


# direct methods
.method private constructor <init>(Lcom/googlecode/eyesfree/braille/display/Display;)V
    .locals 0

    .prologue
    .line 152
    iput-object p1, p0, Lcom/googlecode/eyesfree/braille/display/Display$Connection;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/googlecode/eyesfree/braille/display/Display;Lcom/googlecode/eyesfree/braille/display/Display$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/googlecode/eyesfree/braille/display/Display;
    .param p2, "x1"    # Lcom/googlecode/eyesfree/braille/display/Display$1;

    .prologue
    .line 152
    invoke-direct {p0, p1}, Lcom/googlecode/eyesfree/braille/display/Display$Connection;-><init>(Lcom/googlecode/eyesfree/braille/display/Display;)V

    return-void
.end method

.method static synthetic access$600(Lcom/googlecode/eyesfree/braille/display/Display$Connection;)Lcom/googlecode/eyesfree/braille/display/IBrailleService;
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/display/Display$Connection;

    .prologue
    .line 152
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display$Connection;->mService:Lcom/googlecode/eyesfree/braille/display/IBrailleService;

    return-object v0
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 5
    .param p1, "className"    # Landroid/content/ComponentName;
    .param p2, "binder"    # Landroid/os/IBinder;

    .prologue
    .line 158
    # getter for: Lcom/googlecode/eyesfree/braille/display/Display;->LOG_TAG:Ljava/lang/String;
    invoke-static {}, Lcom/googlecode/eyesfree/braille/display/Display;->access$100()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Connected to braille service"

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 159
    invoke-static {p2}, Lcom/googlecode/eyesfree/braille/display/IBrailleService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/googlecode/eyesfree/braille/display/IBrailleService;

    move-result-object v1

    .line 162
    .local v1, "localService":Lcom/googlecode/eyesfree/braille/display/IBrailleService;
    :try_start_0
    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/display/Display$Connection;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # getter for: Lcom/googlecode/eyesfree/braille/display/Display;->mServiceCallback:Lcom/googlecode/eyesfree/braille/display/Display$ServiceCallback;
    invoke-static {v2}, Lcom/googlecode/eyesfree/braille/display/Display;->access$200(Lcom/googlecode/eyesfree/braille/display/Display;)Lcom/googlecode/eyesfree/braille/display/Display$ServiceCallback;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/googlecode/eyesfree/braille/display/IBrailleService;->registerCallback(Lcom/googlecode/eyesfree/braille/display/IBrailleServiceCallback;)Z

    .line 163
    iput-object v1, p0, Lcom/googlecode/eyesfree/braille/display/Display$Connection;->mService:Lcom/googlecode/eyesfree/braille/display/IBrailleService;

    .line 164
    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/display/Display$Connection;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # getter for: Lcom/googlecode/eyesfree/braille/display/Display;->mHandler:Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;
    invoke-static {v2}, Lcom/googlecode/eyesfree/braille/display/Display;->access$300(Lcom/googlecode/eyesfree/braille/display/Display;)Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;

    move-result-object v3

    monitor-enter v3
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 165
    :try_start_1
    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/display/Display$Connection;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    const/4 v4, 0x0

    # setter for: Lcom/googlecode/eyesfree/braille/display/Display;->mNumFailedBinds:I
    invoke-static {v2, v4}, Lcom/googlecode/eyesfree/braille/display/Display;->access$402(Lcom/googlecode/eyesfree/braille/display/Display;I)I

    .line 166
    monitor-exit v3

    .line 174
    :goto_0
    return-void

    .line 166
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v2
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 167
    :catch_0
    move-exception v0

    .line 170
    .local v0, "e":Landroid/os/RemoteException;
    # getter for: Lcom/googlecode/eyesfree/braille/display/Display;->LOG_TAG:Ljava/lang/String;
    invoke-static {}, Lcom/googlecode/eyesfree/braille/display/Display;->access$100()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Failed to register callback on service"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3
    .param p1, "className"    # Landroid/content/ComponentName;

    .prologue
    const/4 v2, 0x0

    .line 178
    iput-object v2, p0, Lcom/googlecode/eyesfree/braille/display/Display$Connection;->mService:Lcom/googlecode/eyesfree/braille/display/IBrailleService;

    .line 179
    # getter for: Lcom/googlecode/eyesfree/braille/display/Display;->LOG_TAG:Ljava/lang/String;
    invoke-static {}, Lcom/googlecode/eyesfree/braille/display/Display;->access$100()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Disconnected from braille service"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 183
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display$Connection;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # getter for: Lcom/googlecode/eyesfree/braille/display/Display;->mHandler:Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/display/Display;->access$300(Lcom/googlecode/eyesfree/braille/display/Display;)Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->reportConnectionState(ILcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;)V

    .line 184
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display$Connection;->this$0:Lcom/googlecode/eyesfree/braille/display/Display;

    # getter for: Lcom/googlecode/eyesfree/braille/display/Display;->mHandler:Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/display/Display;->access$300(Lcom/googlecode/eyesfree/braille/display/Display;)Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->scheduleRebind()V

    .line 185
    return-void
.end method
