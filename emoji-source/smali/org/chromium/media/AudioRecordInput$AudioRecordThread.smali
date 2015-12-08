.class Lorg/chromium/media/AudioRecordInput$AudioRecordThread;
.super Ljava/lang/Thread;
.source "AudioRecordInput.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/media/AudioRecordInput;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "AudioRecordThread"
.end annotation


# instance fields
.field private volatile mKeepAlive:Z

.field final synthetic this$0:Lorg/chromium/media/AudioRecordInput;


# direct methods
.method private constructor <init>(Lorg/chromium/media/AudioRecordInput;)V
    .locals 1

    .prologue
    .line 45
    iput-object p1, p0, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;->this$0:Lorg/chromium/media/AudioRecordInput;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 50
    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;->mKeepAlive:Z

    return-void
.end method

.method synthetic constructor <init>(Lorg/chromium/media/AudioRecordInput;Lorg/chromium/media/AudioRecordInput$1;)V
    .locals 0
    .param p1, "x0"    # Lorg/chromium/media/AudioRecordInput;
    .param p2, "x1"    # Lorg/chromium/media/AudioRecordInput$1;

    .prologue
    .line 45
    invoke-direct {p0, p1}, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;-><init>(Lorg/chromium/media/AudioRecordInput;)V

    return-void
.end method


# virtual methods
.method public joinRecordThread()V
    .locals 1

    .prologue
    .line 85
    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;->mKeepAlive:Z

    .line 86
    :goto_0
    invoke-virtual {p0}, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    :try_start_0
    invoke-virtual {p0}, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 89
    :catch_0
    move-exception v0

    goto :goto_0

    .line 93
    :cond_0
    return-void
.end method

.method public run()V
    .locals 6

    .prologue
    .line 54
    const/16 v2, -0x13

    invoke-static {v2}, Landroid/os/Process;->setThreadPriority(I)V

    .line 56
    :try_start_0
    iget-object v2, p0, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;->this$0:Lorg/chromium/media/AudioRecordInput;

    # getter for: Lorg/chromium/media/AudioRecordInput;->mAudioRecord:Landroid/media/AudioRecord;
    invoke-static {v2}, Lorg/chromium/media/AudioRecordInput;->access$000(Lorg/chromium/media/AudioRecordInput;)Landroid/media/AudioRecord;

    move-result-object v2

    invoke-virtual {v2}, Landroid/media/AudioRecord;->startRecording()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 62
    :cond_0
    :goto_0
    iget-boolean v2, p0, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;->mKeepAlive:Z

    if-eqz v2, :cond_2

    .line 63
    iget-object v2, p0, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;->this$0:Lorg/chromium/media/AudioRecordInput;

    # getter for: Lorg/chromium/media/AudioRecordInput;->mAudioRecord:Landroid/media/AudioRecord;
    invoke-static {v2}, Lorg/chromium/media/AudioRecordInput;->access$000(Lorg/chromium/media/AudioRecordInput;)Landroid/media/AudioRecord;

    move-result-object v2

    iget-object v3, p0, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;->this$0:Lorg/chromium/media/AudioRecordInput;

    # getter for: Lorg/chromium/media/AudioRecordInput;->mBuffer:Ljava/nio/ByteBuffer;
    invoke-static {v3}, Lorg/chromium/media/AudioRecordInput;->access$100(Lorg/chromium/media/AudioRecordInput;)Ljava/nio/ByteBuffer;

    move-result-object v3

    iget-object v4, p0, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;->this$0:Lorg/chromium/media/AudioRecordInput;

    # getter for: Lorg/chromium/media/AudioRecordInput;->mBuffer:Ljava/nio/ByteBuffer;
    invoke-static {v4}, Lorg/chromium/media/AudioRecordInput;->access$100(Lorg/chromium/media/AudioRecordInput;)Ljava/nio/ByteBuffer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Landroid/media/AudioRecord;->read(Ljava/nio/ByteBuffer;I)I

    move-result v0

    .line 64
    .local v0, "bytesRead":I
    if-lez v0, :cond_1

    .line 65
    iget-object v2, p0, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;->this$0:Lorg/chromium/media/AudioRecordInput;

    iget-object v3, p0, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;->this$0:Lorg/chromium/media/AudioRecordInput;

    # getter for: Lorg/chromium/media/AudioRecordInput;->mNativeAudioRecordInputStream:J
    invoke-static {v3}, Lorg/chromium/media/AudioRecordInput;->access$200(Lorg/chromium/media/AudioRecordInput;)J

    move-result-wide v4

    iget-object v3, p0, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;->this$0:Lorg/chromium/media/AudioRecordInput;

    # getter for: Lorg/chromium/media/AudioRecordInput;->mHardwareDelayBytes:I
    invoke-static {v3}, Lorg/chromium/media/AudioRecordInput;->access$300(Lorg/chromium/media/AudioRecordInput;)I

    move-result v3

    # invokes: Lorg/chromium/media/AudioRecordInput;->nativeOnData(JII)V
    invoke-static {v2, v4, v5, v0, v3}, Lorg/chromium/media/AudioRecordInput;->access$400(Lorg/chromium/media/AudioRecordInput;JII)V

    goto :goto_0

    .line 57
    .end local v0    # "bytesRead":I
    :catch_0
    move-exception v1

    .line 58
    .local v1, "e":Ljava/lang/IllegalStateException;
    const-string v2, "AudioRecordInput"

    const-string v3, "startRecording failed"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 82
    .end local v1    # "e":Ljava/lang/IllegalStateException;
    :goto_1
    return-void

    .line 68
    .restart local v0    # "bytesRead":I
    :cond_1
    const-string v2, "AudioRecordInput"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "read failed: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 69
    const/4 v2, -0x3

    if-ne v0, v2, :cond_0

    .line 72
    const/4 v2, 0x0

    iput-boolean v2, p0, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;->mKeepAlive:Z

    goto :goto_0

    .line 78
    .end local v0    # "bytesRead":I
    :cond_2
    :try_start_1
    iget-object v2, p0, Lorg/chromium/media/AudioRecordInput$AudioRecordThread;->this$0:Lorg/chromium/media/AudioRecordInput;

    # getter for: Lorg/chromium/media/AudioRecordInput;->mAudioRecord:Landroid/media/AudioRecord;
    invoke-static {v2}, Lorg/chromium/media/AudioRecordInput;->access$000(Lorg/chromium/media/AudioRecordInput;)Landroid/media/AudioRecord;

    move-result-object v2

    invoke-virtual {v2}, Landroid/media/AudioRecord;->stop()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    .line 79
    :catch_1
    move-exception v1

    .line 80
    .restart local v1    # "e":Ljava/lang/IllegalStateException;
    const-string v2, "AudioRecordInput"

    const-string v3, "stop failed"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method
