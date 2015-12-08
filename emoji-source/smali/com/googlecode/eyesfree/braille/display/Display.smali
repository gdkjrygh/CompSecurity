.class public Lcom/googlecode/eyesfree/braille/display/Display;
.super Ljava/lang/Object;
.source "Display.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/eyesfree/braille/display/Display$1;,
        Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;,
        Lcom/googlecode/eyesfree/braille/display/Display$ServiceCallback;,
        Lcom/googlecode/eyesfree/braille/display/Display$Connection;,
        Lcom/googlecode/eyesfree/braille/display/Display$OnInputEventListener;,
        Lcom/googlecode/eyesfree/braille/display/Display$OnConnectionStateChangeListener;
    }
.end annotation


# static fields
.field public static final ACTION_DISPLAY_SERVICE:Ljava/lang/String; = "com.googlecode.eyesfree.braille.service.ACTION_DISPLAY_SERVICE"

.field private static final LOG_TAG:Ljava/lang/String;

.field private static final MAX_REBIND_ATTEMPTS:I = 0x5

.field private static final REBIND_DELAY_MILLIS:I = 0x1f4

.field public static final STATE_CONNECTED:I = 0x1

.field public static final STATE_ERROR:I = -0x1

.field public static final STATE_NOT_CONNECTED:I = 0x0

.field private static final STATE_UNKNOWN:I = -0x2

.field private static final mServiceIntent:Landroid/content/Intent;


# instance fields
.field private currentConnectionState:I

.field private mConnection:Lcom/googlecode/eyesfree/braille/display/Display$Connection;

.field private final mConnectionStateChangeListener:Lcom/googlecode/eyesfree/braille/display/Display$OnConnectionStateChangeListener;

.field private final mContext:Landroid/content/Context;

.field private mDisplayProperties:Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;

.field private final mHandler:Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;

.field private volatile mInputEventListener:Lcom/googlecode/eyesfree/braille/display/Display$OnInputEventListener;

.field private mNumFailedBinds:I

.field private mServiceCallback:Lcom/googlecode/eyesfree/braille/display/Display$ServiceCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 33
    const-class v0, Lcom/googlecode/eyesfree/braille/display/Display;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/googlecode/eyesfree/braille/display/Display;->LOG_TAG:Ljava/lang/String;

    .line 49
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.googlecode.eyesfree.braille.service.ACTION_DISPLAY_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/googlecode/eyesfree/braille/display/Display;->mServiceIntent:Landroid/content/Intent;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/googlecode/eyesfree/braille/display/Display$OnConnectionStateChangeListener;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "listener"    # Lcom/googlecode/eyesfree/braille/display/Display$OnConnectionStateChangeListener;

    .prologue
    .line 84
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/googlecode/eyesfree/braille/display/Display;-><init>(Landroid/content/Context;Lcom/googlecode/eyesfree/braille/display/Display$OnConnectionStateChangeListener;Landroid/os/Handler;)V

    .line 85
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/googlecode/eyesfree/braille/display/Display$OnConnectionStateChangeListener;Landroid/os/Handler;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "listener"    # Lcom/googlecode/eyesfree/braille/display/Display$OnConnectionStateChangeListener;
    .param p3, "handler"    # Landroid/os/Handler;

    .prologue
    .line 96
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    const/4 v0, -0x2

    iput v0, p0, Lcom/googlecode/eyesfree/braille/display/Display;->currentConnectionState:I

    .line 54
    new-instance v0, Lcom/googlecode/eyesfree/braille/display/Display$ServiceCallback;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/googlecode/eyesfree/braille/display/Display$ServiceCallback;-><init>(Lcom/googlecode/eyesfree/braille/display/Display;Lcom/googlecode/eyesfree/braille/display/Display$1;)V

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mServiceCallback:Lcom/googlecode/eyesfree/braille/display/Display$ServiceCallback;

    .line 61
    const/4 v0, 0x0

    iput v0, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mNumFailedBinds:I

    .line 97
    iput-object p1, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mContext:Landroid/content/Context;

    .line 98
    iput-object p2, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mConnectionStateChangeListener:Lcom/googlecode/eyesfree/braille/display/Display$OnConnectionStateChangeListener;

    .line 99
    if-nez p3, :cond_0

    .line 100
    new-instance v0, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;

    invoke-direct {v0, p0}, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;-><init>(Lcom/googlecode/eyesfree/braille/display/Display;)V

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mHandler:Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;

    .line 105
    :goto_0
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/display/Display;->doBindService()V

    .line 106
    return-void

    .line 102
    :cond_0
    new-instance v0, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;

    invoke-direct {v0, p0, p3}, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;-><init>(Lcom/googlecode/eyesfree/braille/display/Display;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mHandler:Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;

    goto :goto_0
.end method

.method static synthetic access$100()Ljava/lang/String;
    .locals 1

    .prologue
    .line 32
    sget-object v0, Lcom/googlecode/eyesfree/braille/display/Display;->LOG_TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/googlecode/eyesfree/braille/display/Display;)Lcom/googlecode/eyesfree/braille/display/Display$OnInputEventListener;
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/display/Display;

    .prologue
    .line 32
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mInputEventListener:Lcom/googlecode/eyesfree/braille/display/Display$OnInputEventListener;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/googlecode/eyesfree/braille/display/Display;)Lcom/googlecode/eyesfree/braille/display/Display$Connection;
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/display/Display;

    .prologue
    .line 32
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mConnection:Lcom/googlecode/eyesfree/braille/display/Display$Connection;

    return-object v0
.end method

.method static synthetic access$1200(Lcom/googlecode/eyesfree/braille/display/Display;)V
    .locals 0
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/display/Display;

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/display/Display;->doUnbindService()V

    return-void
.end method

.method static synthetic access$1300(Lcom/googlecode/eyesfree/braille/display/Display;)V
    .locals 0
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/display/Display;

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/display/Display;->doBindService()V

    return-void
.end method

.method static synthetic access$200(Lcom/googlecode/eyesfree/braille/display/Display;)Lcom/googlecode/eyesfree/braille/display/Display$ServiceCallback;
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/display/Display;

    .prologue
    .line 32
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mServiceCallback:Lcom/googlecode/eyesfree/braille/display/Display$ServiceCallback;

    return-object v0
.end method

.method static synthetic access$300(Lcom/googlecode/eyesfree/braille/display/Display;)Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/display/Display;

    .prologue
    .line 32
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mHandler:Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;

    return-object v0
.end method

.method static synthetic access$400(Lcom/googlecode/eyesfree/braille/display/Display;)I
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/display/Display;

    .prologue
    .line 32
    iget v0, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mNumFailedBinds:I

    return v0
.end method

.method static synthetic access$402(Lcom/googlecode/eyesfree/braille/display/Display;I)I
    .locals 0
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/display/Display;
    .param p1, "x1"    # I

    .prologue
    .line 32
    iput p1, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mNumFailedBinds:I

    return p1
.end method

.method static synthetic access$404(Lcom/googlecode/eyesfree/braille/display/Display;)I
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/display/Display;

    .prologue
    .line 32
    iget v0, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mNumFailedBinds:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mNumFailedBinds:I

    return v0
.end method

.method static synthetic access$702(Lcom/googlecode/eyesfree/braille/display/Display;Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;)Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;
    .locals 0
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/display/Display;
    .param p1, "x1"    # Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;

    .prologue
    .line 32
    iput-object p1, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mDisplayProperties:Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;

    return-object p1
.end method

.method static synthetic access$800(Lcom/googlecode/eyesfree/braille/display/Display;)I
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/display/Display;

    .prologue
    .line 32
    iget v0, p0, Lcom/googlecode/eyesfree/braille/display/Display;->currentConnectionState:I

    return v0
.end method

.method static synthetic access$802(Lcom/googlecode/eyesfree/braille/display/Display;I)I
    .locals 0
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/display/Display;
    .param p1, "x1"    # I

    .prologue
    .line 32
    iput p1, p0, Lcom/googlecode/eyesfree/braille/display/Display;->currentConnectionState:I

    return p1
.end method

.method static synthetic access$900(Lcom/googlecode/eyesfree/braille/display/Display;)Lcom/googlecode/eyesfree/braille/display/Display$OnConnectionStateChangeListener;
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/display/Display;

    .prologue
    .line 32
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mConnectionStateChangeListener:Lcom/googlecode/eyesfree/braille/display/Display$OnConnectionStateChangeListener;

    return-object v0
.end method

.method private doBindService()V
    .locals 4

    .prologue
    .line 209
    new-instance v0, Lcom/googlecode/eyesfree/braille/display/Display$Connection;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/googlecode/eyesfree/braille/display/Display$Connection;-><init>(Lcom/googlecode/eyesfree/braille/display/Display;Lcom/googlecode/eyesfree/braille/display/Display$1;)V

    .line 210
    .local v0, "localConnection":Lcom/googlecode/eyesfree/braille/display/Display$Connection;
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mContext:Landroid/content/Context;

    sget-object v2, Lcom/googlecode/eyesfree/braille/display/Display;->mServiceIntent:Landroid/content/Intent;

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 212
    sget-object v1, Lcom/googlecode/eyesfree/braille/display/Display;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Failed to bind Service"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 213
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mHandler:Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;

    invoke-virtual {v1}, Lcom/googlecode/eyesfree/braille/display/Display$DisplayHandler;->scheduleRebind()V

    .line 218
    :goto_0
    return-void

    .line 216
    :cond_0
    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mConnection:Lcom/googlecode/eyesfree/braille/display/Display$Connection;

    .line 217
    sget-object v1, Lcom/googlecode/eyesfree/braille/display/Display;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Bound to braille service"

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private doUnbindService()V
    .locals 3

    .prologue
    .line 221
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/display/Display;->getBrailleService()Lcom/googlecode/eyesfree/braille/display/IBrailleService;

    move-result-object v0

    .line 222
    .local v0, "localService":Lcom/googlecode/eyesfree/braille/display/IBrailleService;
    if-eqz v0, :cond_0

    .line 224
    :try_start_0
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mServiceCallback:Lcom/googlecode/eyesfree/braille/display/Display$ServiceCallback;

    invoke-interface {v0, v1}, Lcom/googlecode/eyesfree/braille/display/IBrailleService;->unregisterCallback(Lcom/googlecode/eyesfree/braille/display/IBrailleServiceCallback;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 229
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mConnection:Lcom/googlecode/eyesfree/braille/display/Display$Connection;

    if-eqz v1, :cond_1

    .line 230
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mConnection:Lcom/googlecode/eyesfree/braille/display/Display$Connection;

    invoke-virtual {v1, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 231
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mConnection:Lcom/googlecode/eyesfree/braille/display/Display$Connection;

    .line 233
    :cond_1
    return-void

    .line 225
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private getBrailleService()Lcom/googlecode/eyesfree/braille/display/IBrailleService;
    .locals 2

    .prologue
    .line 236
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mConnection:Lcom/googlecode/eyesfree/braille/display/Display$Connection;

    .line 237
    .local v0, "localConnection":Lcom/googlecode/eyesfree/braille/display/Display$Connection;
    if-eqz v0, :cond_0

    .line 238
    # getter for: Lcom/googlecode/eyesfree/braille/display/Display$Connection;->mService:Lcom/googlecode/eyesfree/braille/display/IBrailleService;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/display/Display$Connection;->access$600(Lcom/googlecode/eyesfree/braille/display/Display$Connection;)Lcom/googlecode/eyesfree/braille/display/IBrailleService;

    move-result-object v1

    .line 240
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method


# virtual methods
.method public displayDots([B)V
    .locals 4
    .param p1, "patterns"    # [B

    .prologue
    .line 129
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/display/Display;->getBrailleService()Lcom/googlecode/eyesfree/braille/display/IBrailleService;

    move-result-object v1

    .line 130
    .local v1, "localService":Lcom/googlecode/eyesfree/braille/display/IBrailleService;
    if-eqz v1, :cond_0

    .line 132
    :try_start_0
    invoke-interface {v1, p1}, Lcom/googlecode/eyesfree/braille/display/IBrailleService;->displayDots([B)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    :goto_0
    return-void

    .line 133
    :catch_0
    move-exception v0

    .line 134
    .local v0, "ex":Landroid/os/RemoteException;
    sget-object v2, Lcom/googlecode/eyesfree/braille/display/Display;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Error in displayDots"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 137
    .end local v0    # "ex":Landroid/os/RemoteException;
    :cond_0
    sget-object v2, Lcom/googlecode/eyesfree/braille/display/Display;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Error in displayDots: service not connected"

    invoke-static {v2, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method public getDisplayProperties()Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mDisplayProperties:Lcom/googlecode/eyesfree/braille/display/BrailleDisplayProperties;

    return-object v0
.end method

.method public setOnInputEventListener(Lcom/googlecode/eyesfree/braille/display/Display$OnInputEventListener;)V
    .locals 0
    .param p1, "listener"    # Lcom/googlecode/eyesfree/braille/display/Display$OnInputEventListener;

    .prologue
    .line 113
    iput-object p1, p0, Lcom/googlecode/eyesfree/braille/display/Display;->mInputEventListener:Lcom/googlecode/eyesfree/braille/display/Display$OnInputEventListener;

    .line 114
    return-void
.end method

.method public shutdown()V
    .locals 0

    .prologue
    .line 147
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/display/Display;->doUnbindService()V

    .line 148
    return-void
.end method
