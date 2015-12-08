.class final Lorg/apache/cordova/FileTransfer$RequestContext;
.super Ljava/lang/Object;
.source "FileTransfer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/cordova/FileTransfer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "RequestContext"
.end annotation


# instance fields
.field aborted:Z

.field callbackContext:Lorg/apache/cordova/api/CallbackContext;

.field currentInputStream:Ljava/io/InputStream;

.field currentOutputStream:Ljava/io/OutputStream;

.field source:Ljava/lang/String;

.field target:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lorg/apache/cordova/api/CallbackContext;)V
    .locals 0
    .param p1, "source"    # Ljava/lang/String;
    .param p2, "target"    # Ljava/lang/String;
    .param p3, "callbackContext"    # Lorg/apache/cordova/api/CallbackContext;

    .prologue
    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    iput-object p1, p0, Lorg/apache/cordova/FileTransfer$RequestContext;->source:Ljava/lang/String;

    .line 86
    iput-object p2, p0, Lorg/apache/cordova/FileTransfer$RequestContext;->target:Ljava/lang/String;

    .line 87
    iput-object p3, p0, Lorg/apache/cordova/FileTransfer$RequestContext;->callbackContext:Lorg/apache/cordova/api/CallbackContext;

    .line 88
    return-void
.end method


# virtual methods
.method sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V
    .locals 1
    .param p1, "pluginResult"    # Lorg/apache/cordova/api/PluginResult;

    .prologue
    .line 90
    monitor-enter p0

    .line 91
    :try_start_0
    iget-boolean v0, p0, Lorg/apache/cordova/FileTransfer$RequestContext;->aborted:Z

    if-nez v0, :cond_0

    .line 92
    iget-object v0, p0, Lorg/apache/cordova/FileTransfer$RequestContext;->callbackContext:Lorg/apache/cordova/api/CallbackContext;

    invoke-virtual {v0, p1}, Lorg/apache/cordova/api/CallbackContext;->sendPluginResult(Lorg/apache/cordova/api/PluginResult;)V

    .line 94
    :cond_0
    monitor-exit p0

    .line 95
    return-void

    .line 94
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
