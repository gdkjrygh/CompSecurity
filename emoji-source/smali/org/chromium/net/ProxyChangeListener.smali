.class public Lorg/chromium/net/ProxyChangeListener;
.super Ljava/lang/Object;
.source "ProxyChangeListener.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/net/ProxyChangeListener$1;,
        Lorg/chromium/net/ProxyChangeListener$ProxyReceiver;,
        Lorg/chromium/net/ProxyChangeListener$Delegate;,
        Lorg/chromium/net/ProxyChangeListener$ProxyConfig;
    }
.end annotation

.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "net"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field private static final TAG:Ljava/lang/String; = "ProxyChangeListener"

.field private static sEnabled:Z


# instance fields
.field private mContext:Landroid/content/Context;

.field private mDelegate:Lorg/chromium/net/ProxyChangeListener$Delegate;

.field private mNativePtr:J

.field private mProxyReceiver:Lorg/chromium/net/ProxyChangeListener$ProxyReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 28
    const-class v0, Lorg/chromium/net/ProxyChangeListener;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    sput-boolean v0, Lorg/chromium/net/ProxyChangeListener;->$assertionsDisabled:Z

    .line 31
    sput-boolean v1, Lorg/chromium/net/ProxyChangeListener;->sEnabled:Z

    return-void

    .line 28
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lorg/chromium/net/ProxyChangeListener;->mContext:Landroid/content/Context;

    .line 55
    return-void
.end method

.method static synthetic access$000(Lorg/chromium/net/ProxyChangeListener;Lorg/chromium/net/ProxyChangeListener$ProxyConfig;)V
    .locals 0
    .param p0, "x0"    # Lorg/chromium/net/ProxyChangeListener;
    .param p1, "x1"    # Lorg/chromium/net/ProxyChangeListener$ProxyConfig;

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lorg/chromium/net/ProxyChangeListener;->proxySettingsChanged(Lorg/chromium/net/ProxyChangeListener$ProxyConfig;)V

    return-void
.end method

.method public static create(Landroid/content/Context;)Lorg/chromium/net/ProxyChangeListener;
    .locals 1
    .param p0, "context"    # Landroid/content/Context;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 67
    new-instance v0, Lorg/chromium/net/ProxyChangeListener;

    invoke-direct {v0, p0}, Lorg/chromium/net/ProxyChangeListener;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static getProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0, "property"    # Ljava/lang/String;
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 72
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private native nativeProxySettingsChanged(J)V
    .annotation runtime Lorg/chromium/base/NativeClassQualifiedName;
        value = "ProxyConfigServiceAndroid::JNIDelegate"
    .end annotation
.end method

.method private native nativeProxySettingsChangedTo(JLjava/lang/String;ILjava/lang/String;)V
    .annotation runtime Lorg/chromium/base/NativeClassQualifiedName;
        value = "ProxyConfigServiceAndroid::JNIDelegate"
    .end annotation
.end method

.method private proxySettingsChanged(Lorg/chromium/net/ProxyChangeListener$ProxyConfig;)V
    .locals 7
    .param p1, "cfg"    # Lorg/chromium/net/ProxyChangeListener$ProxyConfig;

    .prologue
    .line 166
    sget-boolean v0, Lorg/chromium/net/ProxyChangeListener;->sEnabled:Z

    if-nez v0, :cond_1

    .line 182
    :cond_0
    :goto_0
    return-void

    .line 169
    :cond_1
    iget-object v0, p0, Lorg/chromium/net/ProxyChangeListener;->mDelegate:Lorg/chromium/net/ProxyChangeListener$Delegate;

    if-eqz v0, :cond_2

    .line 170
    iget-object v0, p0, Lorg/chromium/net/ProxyChangeListener;->mDelegate:Lorg/chromium/net/ProxyChangeListener$Delegate;

    invoke-interface {v0}, Lorg/chromium/net/ProxyChangeListener$Delegate;->proxySettingsChanged()V

    .line 172
    :cond_2
    iget-wide v0, p0, Lorg/chromium/net/ProxyChangeListener;->mNativePtr:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 177
    if-eqz p1, :cond_3

    .line 178
    iget-wide v2, p0, Lorg/chromium/net/ProxyChangeListener;->mNativePtr:J

    iget-object v4, p1, Lorg/chromium/net/ProxyChangeListener$ProxyConfig;->mHost:Ljava/lang/String;

    iget v5, p1, Lorg/chromium/net/ProxyChangeListener$ProxyConfig;->mPort:I

    iget-object v6, p1, Lorg/chromium/net/ProxyChangeListener$ProxyConfig;->mPacUrl:Ljava/lang/String;

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lorg/chromium/net/ProxyChangeListener;->nativeProxySettingsChangedTo(JLjava/lang/String;ILjava/lang/String;)V

    goto :goto_0

    .line 180
    :cond_3
    iget-wide v0, p0, Lorg/chromium/net/ProxyChangeListener;->mNativePtr:J

    invoke-direct {p0, v0, v1}, Lorg/chromium/net/ProxyChangeListener;->nativeProxySettingsChanged(J)V

    goto :goto_0
.end method

.method private registerReceiver()V
    .locals 3

    .prologue
    .line 185
    iget-object v1, p0, Lorg/chromium/net/ProxyChangeListener;->mProxyReceiver:Lorg/chromium/net/ProxyChangeListener$ProxyReceiver;

    if-eqz v1, :cond_0

    .line 192
    :goto_0
    return-void

    .line 188
    :cond_0
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 189
    .local v0, "filter":Landroid/content/IntentFilter;
    const-string v1, "android.intent.action.PROXY_CHANGE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 190
    new-instance v1, Lorg/chromium/net/ProxyChangeListener$ProxyReceiver;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lorg/chromium/net/ProxyChangeListener$ProxyReceiver;-><init>(Lorg/chromium/net/ProxyChangeListener;Lorg/chromium/net/ProxyChangeListener$1;)V

    iput-object v1, p0, Lorg/chromium/net/ProxyChangeListener;->mProxyReceiver:Lorg/chromium/net/ProxyChangeListener$ProxyReceiver;

    .line 191
    iget-object v1, p0, Lorg/chromium/net/ProxyChangeListener;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lorg/chromium/net/ProxyChangeListener;->mProxyReceiver:Lorg/chromium/net/ProxyChangeListener$ProxyReceiver;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    goto :goto_0
.end method

.method public static setEnabled(Z)V
    .locals 0
    .param p0, "enabled"    # Z

    .prologue
    .line 58
    sput-boolean p0, Lorg/chromium/net/ProxyChangeListener;->sEnabled:Z

    .line 59
    return-void
.end method

.method private unregisterReceiver()V
    .locals 2

    .prologue
    .line 195
    iget-object v0, p0, Lorg/chromium/net/ProxyChangeListener;->mProxyReceiver:Lorg/chromium/net/ProxyChangeListener$ProxyReceiver;

    if-nez v0, :cond_0

    .line 200
    :goto_0
    return-void

    .line 198
    :cond_0
    iget-object v0, p0, Lorg/chromium/net/ProxyChangeListener;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lorg/chromium/net/ProxyChangeListener;->mProxyReceiver:Lorg/chromium/net/ProxyChangeListener$ProxyReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 199
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/chromium/net/ProxyChangeListener;->mProxyReceiver:Lorg/chromium/net/ProxyChangeListener$ProxyReceiver;

    goto :goto_0
.end method


# virtual methods
.method public setDelegateForTesting(Lorg/chromium/net/ProxyChangeListener$Delegate;)V
    .locals 0
    .param p1, "delegate"    # Lorg/chromium/net/ProxyChangeListener$Delegate;

    .prologue
    .line 62
    iput-object p1, p0, Lorg/chromium/net/ProxyChangeListener;->mDelegate:Lorg/chromium/net/ProxyChangeListener$Delegate;

    .line 63
    return-void
.end method

.method public start(J)V
    .locals 5
    .param p1, "nativePtr"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 77
    sget-boolean v0, Lorg/chromium/net/ProxyChangeListener;->$assertionsDisabled:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Lorg/chromium/net/ProxyChangeListener;->mNativePtr:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    .line 78
    :cond_0
    iput-wide p1, p0, Lorg/chromium/net/ProxyChangeListener;->mNativePtr:J

    .line 79
    invoke-direct {p0}, Lorg/chromium/net/ProxyChangeListener;->registerReceiver()V

    .line 80
    return-void
.end method

.method public stop()V
    .locals 2
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 84
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/chromium/net/ProxyChangeListener;->mNativePtr:J

    .line 85
    invoke-direct {p0}, Lorg/chromium/net/ProxyChangeListener;->unregisterReceiver()V

    .line 86
    return-void
.end method
