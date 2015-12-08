.class Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;
.super Ljava/lang/Object;
.source "SelfBrailleClient.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "Connection"
.end annotation


# instance fields
.field private volatile mService:Lcom/googlecode/eyesfree/braille/selfbraille/ISelfBrailleService;

.field final synthetic this$0:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;


# direct methods
.method private constructor <init>(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)V
    .locals 0

    .prologue
    .line 193
    iput-object p1, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;->this$0:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;
    .param p2, "x1"    # Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$1;

    .prologue
    .line 193
    invoke-direct {p0, p1}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;-><init>(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)V

    return-void
.end method

.method static synthetic access$200(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;)Lcom/googlecode/eyesfree/braille/selfbraille/ISelfBrailleService;
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;

    .prologue
    .line 193
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;->mService:Lcom/googlecode/eyesfree/braille/selfbraille/ISelfBrailleService;

    return-object v0
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 5
    .param p1, "className"    # Landroid/content/ComponentName;
    .param p2, "binder"    # Landroid/os/IBinder;

    .prologue
    const/4 v4, 0x0

    .line 200
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;->this$0:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    # invokes: Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->verifyPackage()Z
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->access$300(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 201
    # getter for: Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->LOG_TAG:Ljava/lang/String;
    invoke-static {}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->access$400()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Service certificate mismatch for %s, dropping connection"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "com.googlecode.eyesfree.brailleback"

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 204
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;->this$0:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    # getter for: Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mHandler:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->access$500(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;->unbindService()V

    .line 212
    :goto_0
    return-void

    .line 207
    :cond_0
    # getter for: Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->LOG_TAG:Ljava/lang/String;
    invoke-static {}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->access$400()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Connected to self braille service"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 208
    invoke-static {p2}, Lcom/googlecode/eyesfree/braille/selfbraille/ISelfBrailleService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/googlecode/eyesfree/braille/selfbraille/ISelfBrailleService;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;->mService:Lcom/googlecode/eyesfree/braille/selfbraille/ISelfBrailleService;

    .line 209
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;->this$0:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    # getter for: Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mHandler:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->access$500(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;

    move-result-object v1

    monitor-enter v1

    .line 210
    :try_start_0
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;->this$0:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    const/4 v2, 0x0

    # setter for: Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mNumFailedBinds:I
    invoke-static {v0, v2}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->access$602(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;I)I

    .line 211
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2
    .param p1, "className"    # Landroid/content/ComponentName;

    .prologue
    .line 216
    # getter for: Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->LOG_TAG:Ljava/lang/String;
    invoke-static {}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->access$400()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Disconnected from self braille service"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 217
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;->mService:Lcom/googlecode/eyesfree/braille/selfbraille/ISelfBrailleService;

    .line 219
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$Connection;->this$0:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;

    # getter for: Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->mHandler:Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;->access$500(Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient;)Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/eyesfree/braille/selfbraille/SelfBrailleClient$SelfBrailleHandler;->scheduleRebind()V

    .line 220
    return-void
.end method
