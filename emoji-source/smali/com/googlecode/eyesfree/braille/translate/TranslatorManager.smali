.class public Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;
.super Ljava/lang/Object;
.source "TranslatorManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$1;,
        Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;,
        Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$ServiceCallback;,
        Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$BrailleTranslatorImpl;,
        Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;,
        Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;
    }
.end annotation


# static fields
.field private static final ACTION_TRANSLATOR_SERVICE:Ljava/lang/String; = "com.googlecode.eyesfree.braille.service.ACTION_TRANSLATOR_SERVICE"

.field public static final ERROR:I = -0x1

.field private static final LOG_TAG:Ljava/lang/String;

.field private static final MAX_REBIND_ATTEMPTS:I = 0x5

.field private static final REBIND_DELAY_MILLIS:I = 0x1f4

.field public static final SUCCESS:I

.field private static final mServiceIntent:Landroid/content/Intent;


# instance fields
.field private mConnection:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;

.field private final mContext:Landroid/content/Context;

.field private final mHandler:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;

.field private mNumFailedBinds:I

.field private mOnInitListener:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;

.field private final mServiceCallback:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$ServiceCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 46
    const-class v0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->LOG_TAG:Ljava/lang/String;

    .line 50
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.googlecode.eyesfree.braille.service.ACTION_TRANSLATOR_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mServiceIntent:Landroid/content/Intent;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "onInitListener"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;

    .prologue
    const/4 v1, 0x0

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    new-instance v0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;

    invoke-direct {v0, p0, v1}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;-><init>(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$1;)V

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mHandler:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;

    .line 78
    new-instance v0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$ServiceCallback;

    invoke-direct {v0, p0, v1}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$ServiceCallback;-><init>(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$1;)V

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mServiceCallback:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$ServiceCallback;

    .line 82
    const/4 v0, 0x0

    iput v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mNumFailedBinds:I

    .line 91
    iput-object p1, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mContext:Landroid/content/Context;

    .line 92
    iput-object p2, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mOnInitListener:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;

    .line 93
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->doBindService()V

    .line 94
    return-void
.end method

.method static synthetic access$1000(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mConnection:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)V
    .locals 0
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->doUnbindService()V

    return-void
.end method

.method static synthetic access$1200(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)V
    .locals 0
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->doBindService()V

    return-void
.end method

.method static synthetic access$400()Ljava/lang/String;
    .locals 1

    .prologue
    .line 45
    sget-object v0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->LOG_TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$500(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$ServiceCallback;
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mServiceCallback:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$ServiceCallback;

    return-object v0
.end method

.method static synthetic access$600(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mHandler:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;

    return-object v0
.end method

.method static synthetic access$700(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)I
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    .prologue
    .line 45
    iget v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mNumFailedBinds:I

    return v0
.end method

.method static synthetic access$702(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;I)I
    .locals 0
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;
    .param p1, "x1"    # I

    .prologue
    .line 45
    iput p1, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mNumFailedBinds:I

    return p1
.end method

.method static synthetic access$704(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)I
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    .prologue
    .line 45
    iget v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mNumFailedBinds:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mNumFailedBinds:I

    return v0
.end method

.method static synthetic access$800(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->getTranslatorService()Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$900(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;)Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;
    .locals 1
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mOnInitListener:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;

    return-object v0
.end method

.method static synthetic access$902(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;)Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;
    .locals 0
    .param p0, "x0"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;
    .param p1, "x1"    # Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;

    .prologue
    .line 45
    iput-object p1, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mOnInitListener:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$OnInitListener;

    return-object p1
.end method

.method private doBindService()V
    .locals 4

    .prologue
    .line 126
    new-instance v0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;-><init>(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$1;)V

    .line 127
    .local v0, "localConnection":Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mContext:Landroid/content/Context;

    sget-object v2, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mServiceIntent:Landroid/content/Intent;

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 129
    sget-object v1, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Failed to bind to service"

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 130
    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mHandler:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;

    invoke-virtual {v1}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->scheduleRebind()V

    .line 135
    :goto_0
    return-void

    .line 133
    :cond_0
    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mConnection:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;

    .line 134
    sget-object v1, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Bound to translator service"

    invoke-static {v1, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method

.method private doUnbindService()V
    .locals 2

    .prologue
    .line 138
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mConnection:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;

    if-eqz v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mConnection:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 140
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mConnection:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;

    .line 142
    :cond_0
    return-void
.end method

.method private getTranslatorService()Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;
    .locals 2

    .prologue
    .line 145
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mConnection:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;

    .line 146
    .local v0, "localConnection":Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;
    if-eqz v0, :cond_0

    .line 147
    # getter for: Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;->mService:Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;
    invoke-static {v0}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;->access$300(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$Connection;)Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;

    move-result-object v1

    .line 149
    :goto_0
    return-object v1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .prologue
    .line 102
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->doUnbindService()V

    .line 103
    iget-object v0, p0, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->mHandler:Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;

    invoke-virtual {v0}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$TranslatorManagerHandler;->destroy()V

    .line 104
    return-void
.end method

.method public getTranslator(Ljava/lang/String;)Lcom/googlecode/eyesfree/braille/translate/BrailleTranslator;
    .locals 4
    .param p1, "tableName"    # Ljava/lang/String;

    .prologue
    .line 112
    invoke-direct {p0}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->getTranslatorService()Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;

    move-result-object v1

    .line 113
    .local v1, "localService":Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;
    if-eqz v1, :cond_0

    .line 115
    :try_start_0
    invoke-interface {v1, p1}, Lcom/googlecode/eyesfree/braille/translate/ITranslatorService;->checkTable(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 116
    new-instance v2, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$BrailleTranslatorImpl;

    invoke-direct {v2, p0, p1}, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager$BrailleTranslatorImpl;-><init>(Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    :goto_0
    return-object v2

    .line 118
    :catch_0
    move-exception v0

    .line 119
    .local v0, "ex":Landroid/os/RemoteException;
    sget-object v2, Lcom/googlecode/eyesfree/braille/translate/TranslatorManager;->LOG_TAG:Ljava/lang/String;

    const-string v3, "Error in getTranslator"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 122
    .end local v0    # "ex":Landroid/os/RemoteException;
    :cond_0
    const/4 v2, 0x0

    goto :goto_0
.end method
