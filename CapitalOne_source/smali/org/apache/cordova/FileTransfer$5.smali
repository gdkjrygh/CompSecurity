.class Lorg/apache/cordova/FileTransfer$5;
.super Ljava/lang/Object;
.source "FileTransfer.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/apache/cordova/FileTransfer;->abort(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/apache/cordova/FileTransfer;

.field final synthetic val$context:Lorg/apache/cordova/FileTransfer$RequestContext;


# direct methods
.method constructor <init>(Lorg/apache/cordova/FileTransfer;Lorg/apache/cordova/FileTransfer$RequestContext;)V
    .locals 0

    .prologue
    .line 816
    iput-object p1, p0, Lorg/apache/cordova/FileTransfer$5;->this$0:Lorg/apache/cordova/FileTransfer;

    iput-object p2, p0, Lorg/apache/cordova/FileTransfer$5;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 818
    iget-object v1, p0, Lorg/apache/cordova/FileTransfer$5;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    monitor-enter v1

    .line 819
    :try_start_0
    iget-object v0, p0, Lorg/apache/cordova/FileTransfer$5;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$RequestContext;->currentInputStream:Ljava/io/InputStream;

    # invokes: Lorg/apache/cordova/FileTransfer;->safeClose(Ljava/io/Closeable;)V
    invoke-static {v0}, Lorg/apache/cordova/FileTransfer;->access$300(Ljava/io/Closeable;)V

    .line 820
    iget-object v0, p0, Lorg/apache/cordova/FileTransfer$5;->val$context:Lorg/apache/cordova/FileTransfer$RequestContext;

    iget-object v0, v0, Lorg/apache/cordova/FileTransfer$RequestContext;->currentOutputStream:Ljava/io/OutputStream;

    # invokes: Lorg/apache/cordova/FileTransfer;->safeClose(Ljava/io/Closeable;)V
    invoke-static {v0}, Lorg/apache/cordova/FileTransfer;->access$300(Ljava/io/Closeable;)V

    .line 821
    monitor-exit v1

    .line 822
    return-void

    .line 821
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
