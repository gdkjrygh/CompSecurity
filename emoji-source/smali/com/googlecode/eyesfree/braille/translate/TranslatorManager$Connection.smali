.class Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;
.super Ljava/lang/Object;
.source "TranslatorManager.java"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "Connection"
.end annotation


# instance fields
.field private volatile mService:Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;

.field final synthetic this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;


# direct methods
.method private constructor <init>(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)V
    .locals 0

    .prologue
    .line 152
    iput-object p1, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;
    .param p2, "x1"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$1;

    .prologue
    .line 152
    invoke-direct {p0, p1}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;-><init>(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)V

    return-void
.end method

.method static synthetic access$300(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;)Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;

    .prologue
    .line 152
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;->mService:Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;

    return-object v0
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 5
    .param p1, "className"    # Landroid/content/ComponentName;
    .param p2, "binder"    # Landroid/os/IBinder;

    .prologue
    .line 159
    # getter for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->LOG_TAG:Ljava/lang/String;
    invoke-static {}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$400()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Connected to translation service"

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 160
    invoke-static {p2}, Lcom/googlecode/eyesfree/braille/translate/ITranslatorService$Stub;->asInterface(Landroid/os/IBinder;)Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;

    move-result-object v1

    .line 163
    .local v1, "localService":Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;
    :try_start_0
    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    # getter for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mServiceCallback:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$ServiceCallback;
    invoke-static {v2}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$500(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$ServiceCallback;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;->setCallback(Lcom/googlecode/eyesfree/braille/translate/ITranslatorServiceCallback;)V

    .line 164
    iput-object v1, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;->mService:Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;

    .line 165
    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    # getter for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mHandler:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;
    invoke-static {v2}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$600(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;

    move-result-object v3

    monitor-enter v3
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 166
    :try_start_1
    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    const/4 v4, 0x0

    # setter for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mNumFailedBinds:I
    invoke-static {v2, v4}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$702(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;I)I

    .line 167
    monitor-exit v3

    .line 173
    :goto_0
    return-void

    .line 167
    :catchall_0
    move-exception v2

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v2
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0

    .line 168
    :catch_0
    move-exception v0

    .line 171
    .local v0, "ex":Landroid/os/RemoteException;
    # getter for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->LOG_TAG:Ljava/lang/String;
    invoke-static {}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$400()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Error when setting callback"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2
    .param p1, "className"    # Landroid/content/ComponentName;

    .prologue
    .line 177
    # getter for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->LOG_TAG:Ljava/lang/String;
    invoke-static {}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$400()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Disconnected from translator service"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 178
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;->mService:Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;

    .line 180
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;->this$0:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    # getter for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mHandler:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->access$600(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->scheduleRebind()V

    .line 181
    return-void
.end method
