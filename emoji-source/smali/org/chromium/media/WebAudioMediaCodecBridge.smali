.class Lorg/chromium/media/WebAudioMediaCodecBridge;
.super Ljava/lang/Object;
.source "WebAudioMediaCodecBridge.java"


# annotations
.annotation runtime Lorg/chromium/base/JNINamespace;
    value = "media"
.end annotation


# static fields
.field static final LOG_TAG:Ljava/lang/String; = "WebAudioMediaCodec"

.field static final TIMEOUT_MICROSECONDS:J = 0x1f4L


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static createTempFile(Landroid/content/Context;)Ljava/lang/String;
    .locals 4
    .param p0, "ctx"    # Landroid/content/Context;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 29
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    .line 30
    .local v0, "outputDirectory":Ljava/io/File;
    const-string v2, "webaudio"

    const-string v3, ".dat"

    invoke-static {v2, v3, v0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v1

    .line 31
    .local v1, "outputFile":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    return-object v2
.end method

.method private static decodeAudioFile(Landroid/content/Context;JIJ)Z
    .locals 36
    .param p0, "ctx"    # Landroid/content/Context;
    .param p1, "nativeMediaCodecBridge"    # J
    .param p3, "inputFD"    # I
    .param p4, "dataSize"    # J
    .annotation build Lorg/chromium/base/CalledByNative;
    .end annotation

    .prologue
    .line 41
    const-wide/16 v10, 0x0

    cmp-long v3, p4, v10

    if-ltz v3, :cond_0

    const-wide/32 v10, 0x7fffffff

    cmp-long v3, p4, v10

    if-lez v3, :cond_1

    .line 42
    :cond_0
    const/4 v3, 0x0

    .line 198
    :goto_0
    return v3

    .line 44
    :cond_1
    new-instance v2, Landroid/media/MediaExtractor;

    invoke-direct {v2}, Landroid/media/MediaExtractor;-><init>()V

    .line 47
    .local v2, "extractor":Landroid/media/MediaExtractor;
    invoke-static/range {p3 .. p3}, Landroid/os/ParcelFileDescriptor;->adoptFd(I)Landroid/os/ParcelFileDescriptor;

    move-result-object v27

    .line 49
    .local v27, "encodedFD":Landroid/os/ParcelFileDescriptor;
    :try_start_0
    invoke-virtual/range {v27 .. v27}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v3

    const-wide/16 v4, 0x0

    move-wide/from16 v6, p4

    invoke-virtual/range {v2 .. v7}, Landroid/media/MediaExtractor;->setDataSource(Ljava/io/FileDescriptor;JJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    invoke-virtual {v2}, Landroid/media/MediaExtractor;->getTrackCount()I

    move-result v3

    if-gtz v3, :cond_2

    .line 57
    invoke-virtual/range {v27 .. v27}, Landroid/os/ParcelFileDescriptor;->detachFd()I

    .line 58
    const/4 v3, 0x0

    goto :goto_0

    .line 50
    :catch_0
    move-exception v26

    .line 51
    .local v26, "e":Ljava/lang/Exception;
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Exception;->printStackTrace()V

    .line 52
    invoke-virtual/range {v27 .. v27}, Landroid/os/ParcelFileDescriptor;->detachFd()I

    .line 53
    const/4 v3, 0x0

    goto :goto_0

    .line 61
    .end local v26    # "e":Ljava/lang/Exception;
    :cond_2
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    move-result-object v28

    .line 64
    .local v28, "format":Landroid/media/MediaFormat;
    const-string v3, "channel-count"

    move-object/from16 v0, v28

    invoke-virtual {v0, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v12

    .line 69
    .local v12, "inputChannelCount":I
    move/from16 v21, v12

    .line 71
    .local v21, "outputChannelCount":I
    const-string v3, "sample-rate"

    move-object/from16 v0, v28

    invoke-virtual {v0, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v13

    .line 72
    .local v13, "sampleRate":I
    const-string v3, "mime"

    move-object/from16 v0, v28

    invoke-virtual {v0, v3}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v30

    .line 74
    .local v30, "mime":Ljava/lang/String;
    const-wide/16 v14, 0x0

    .line 75
    .local v14, "durationMicroseconds":J
    const-string v3, "durationUs"

    move-object/from16 v0, v28

    invoke-virtual {v0, v3}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 77
    :try_start_1
    const-string v3, "durationUs"

    move-object/from16 v0, v28

    invoke-virtual {v0, v3}, Landroid/media/MediaFormat;->getLong(Ljava/lang/String;)J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-wide v14

    .line 87
    :cond_3
    :goto_1
    const-wide/32 v10, 0x7fffffff

    cmp-long v3, v14, v10

    if-lez v3, :cond_4

    .line 88
    const-wide/16 v14, 0x0

    .line 91
    :cond_4
    const-string v3, "WebAudioMediaCodec"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Initial: Tracks: "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v2}, Landroid/media/MediaExtractor;->getTrackCount()I

    move-result v10

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v10, " Format: "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    move-object/from16 v0, v28

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 97
    :try_start_2
    invoke-static/range {v30 .. v30}, Landroid/media/MediaCodec;->createDecoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result-object v4

    .line 104
    .local v4, "codec":Landroid/media/MediaCodec;
    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    move-object/from16 v0, v28

    invoke-virtual {v4, v0, v3, v6, v10}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    .line 105
    invoke-virtual {v4}, Landroid/media/MediaCodec;->start()V

    .line 107
    invoke-virtual {v4}, Landroid/media/MediaCodec;->getInputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v22

    .line 108
    .local v22, "codecInputBuffers":[Ljava/nio/ByteBuffer;
    invoke-virtual {v4}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v23

    .line 111
    .local v23, "codecOutputBuffers":[Ljava/nio/ByteBuffer;
    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/media/MediaExtractor;->selectTrack(I)V

    .line 113
    const/16 v33, 0x0

    .line 114
    .local v33, "sawInputEOS":Z
    const/16 v34, 0x0

    .line 115
    .local v34, "sawOutputEOS":Z
    const/16 v24, 0x0

    .line 118
    .local v24, "destinationInitialized":Z
    :cond_5
    :goto_2
    if-nez v34, :cond_d

    .line 119
    if-nez v33, :cond_6

    .line 121
    const-wide/16 v10, 0x1f4

    invoke-virtual {v4, v10, v11}, Landroid/media/MediaCodec;->dequeueInputBuffer(J)I

    move-result v5

    .line 123
    .local v5, "inputBufIndex":I
    if-ltz v5, :cond_6

    .line 124
    aget-object v25, v22, v5

    .line 125
    .local v25, "dstBuf":Ljava/nio/ByteBuffer;
    const/4 v3, 0x0

    move-object/from16 v0, v25

    invoke-virtual {v2, v0, v3}, Landroid/media/MediaExtractor;->readSampleData(Ljava/nio/ByteBuffer;I)I

    move-result v7

    .line 126
    .local v7, "sampleSize":I
    const-wide/16 v8, 0x0

    .line 128
    .local v8, "presentationTimeMicroSec":J
    if-gez v7, :cond_9

    .line 129
    const/16 v33, 0x1

    .line 130
    const/4 v7, 0x0

    .line 135
    :goto_3
    const/4 v6, 0x0

    if-eqz v33, :cond_a

    const/4 v10, 0x4

    :goto_4
    invoke-virtual/range {v4 .. v10}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    .line 141
    if-nez v33, :cond_6

    .line 142
    invoke-virtual {v2}, Landroid/media/MediaExtractor;->advance()Z

    .line 148
    .end local v5    # "inputBufIndex":I
    .end local v7    # "sampleSize":I
    .end local v8    # "presentationTimeMicroSec":J
    .end local v25    # "dstBuf":Ljava/nio/ByteBuffer;
    :cond_6
    new-instance v29, Landroid/media/MediaCodec$BufferInfo;

    invoke-direct/range {v29 .. v29}, Landroid/media/MediaCodec$BufferInfo;-><init>()V

    .line 149
    .local v29, "info":Landroid/media/MediaCodec$BufferInfo;
    const-wide/16 v10, 0x1f4

    move-object/from16 v0, v29

    invoke-virtual {v4, v0, v10, v11}, Landroid/media/MediaCodec;->dequeueOutputBuffer(Landroid/media/MediaCodec$BufferInfo;J)I

    move-result v32

    .line 151
    .local v32, "outputBufIndex":I
    if-ltz v32, :cond_b

    .line 152
    aget-object v18, v23, v32

    .line 154
    .local v18, "buf":Ljava/nio/ByteBuffer;
    if-nez v24, :cond_7

    .line 159
    const-string v3, "WebAudioMediaCodec"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Final:  Rate: "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v10, " Channels: "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v10, " Mime: "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    move-object/from16 v0, v30

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v10, " Duration: "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v10, " microsec"

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    move-wide/from16 v10, p1

    .line 164
    invoke-static/range {v10 .. v15}, Lorg/chromium/media/WebAudioMediaCodecBridge;->nativeInitializeDestination(JIIJ)V

    .line 168
    const/16 v24, 0x1

    .line 171
    :cond_7
    if-eqz v24, :cond_8

    move-object/from16 v0, v29

    iget v3, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-lez v3, :cond_8

    .line 172
    move-object/from16 v0, v29

    iget v0, v0, Landroid/media/MediaCodec$BufferInfo;->size:I

    move/from16 v19, v0

    move-wide/from16 v16, p1

    move/from16 v20, v12

    invoke-static/range {v16 .. v21}, Lorg/chromium/media/WebAudioMediaCodecBridge;->nativeOnChunkDecoded(JLjava/nio/ByteBuffer;III)V

    .line 176
    :cond_8
    invoke-virtual/range {v18 .. v18}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    .line 177
    const/4 v3, 0x0

    move/from16 v0, v32

    invoke-virtual {v4, v0, v3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    .line 179
    move-object/from16 v0, v29

    iget v3, v0, Landroid/media/MediaCodec$BufferInfo;->flags:I

    and-int/lit8 v3, v3, 0x4

    if-eqz v3, :cond_5

    .line 180
    const/16 v34, 0x1

    goto/16 :goto_2

    .line 78
    .end local v4    # "codec":Landroid/media/MediaCodec;
    .end local v18    # "buf":Ljava/nio/ByteBuffer;
    .end local v22    # "codecInputBuffers":[Ljava/nio/ByteBuffer;
    .end local v23    # "codecOutputBuffers":[Ljava/nio/ByteBuffer;
    .end local v24    # "destinationInitialized":Z
    .end local v29    # "info":Landroid/media/MediaCodec$BufferInfo;
    .end local v32    # "outputBufIndex":I
    .end local v33    # "sawInputEOS":Z
    .end local v34    # "sawOutputEOS":Z
    :catch_1
    move-exception v26

    .line 79
    .restart local v26    # "e":Ljava/lang/Exception;
    const-string v3, "WebAudioMediaCodec"

    const-string v6, "Cannot get duration"

    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 98
    .end local v26    # "e":Ljava/lang/Exception;
    :catch_2
    move-exception v26

    .line 99
    .restart local v26    # "e":Ljava/lang/Exception;
    const-string v3, "WebAudioMediaCodec"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Failed to create MediaCodec for mime type: "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    move-object/from16 v0, v30

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 100
    invoke-virtual/range {v27 .. v27}, Landroid/os/ParcelFileDescriptor;->detachFd()I

    .line 101
    const/4 v3, 0x0

    goto/16 :goto_0

    .line 132
    .end local v26    # "e":Ljava/lang/Exception;
    .restart local v4    # "codec":Landroid/media/MediaCodec;
    .restart local v5    # "inputBufIndex":I
    .restart local v7    # "sampleSize":I
    .restart local v8    # "presentationTimeMicroSec":J
    .restart local v22    # "codecInputBuffers":[Ljava/nio/ByteBuffer;
    .restart local v23    # "codecOutputBuffers":[Ljava/nio/ByteBuffer;
    .restart local v24    # "destinationInitialized":Z
    .restart local v25    # "dstBuf":Ljava/nio/ByteBuffer;
    .restart local v33    # "sawInputEOS":Z
    .restart local v34    # "sawOutputEOS":Z
    :cond_9
    invoke-virtual {v2}, Landroid/media/MediaExtractor;->getSampleTime()J

    move-result-wide v8

    goto/16 :goto_3

    .line 135
    :cond_a
    const/4 v10, 0x0

    goto/16 :goto_4

    .line 182
    .end local v5    # "inputBufIndex":I
    .end local v7    # "sampleSize":I
    .end local v8    # "presentationTimeMicroSec":J
    .end local v25    # "dstBuf":Ljava/nio/ByteBuffer;
    .restart local v29    # "info":Landroid/media/MediaCodec$BufferInfo;
    .restart local v32    # "outputBufIndex":I
    :cond_b
    const/4 v3, -0x3

    move/from16 v0, v32

    if-ne v0, v3, :cond_c

    .line 183
    invoke-virtual {v4}, Landroid/media/MediaCodec;->getOutputBuffers()[Ljava/nio/ByteBuffer;

    move-result-object v23

    goto/16 :goto_2

    .line 184
    :cond_c
    const/4 v3, -0x2

    move/from16 v0, v32

    if-ne v0, v3, :cond_5

    .line 185
    invoke-virtual {v4}, Landroid/media/MediaCodec;->getOutputFormat()Landroid/media/MediaFormat;

    move-result-object v31

    .line 186
    .local v31, "newFormat":Landroid/media/MediaFormat;
    const-string v3, "channel-count"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v21

    .line 187
    const-string v3, "sample-rate"

    move-object/from16 v0, v31

    invoke-virtual {v0, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v13

    .line 188
    const-string v3, "WebAudioMediaCodec"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "output format changed to "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    move-object/from16 v0, v31

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_2

    .line 192
    .end local v29    # "info":Landroid/media/MediaCodec$BufferInfo;
    .end local v31    # "newFormat":Landroid/media/MediaFormat;
    .end local v32    # "outputBufIndex":I
    :cond_d
    invoke-virtual/range {v27 .. v27}, Landroid/os/ParcelFileDescriptor;->detachFd()I

    .line 194
    invoke-virtual {v4}, Landroid/media/MediaCodec;->stop()V

    .line 195
    invoke-virtual {v4}, Landroid/media/MediaCodec;->release()V

    .line 196
    const/4 v4, 0x0

    .line 198
    const/4 v3, 0x1

    goto/16 :goto_0
.end method

.method private static native nativeInitializeDestination(JIIJ)V
.end method

.method private static native nativeOnChunkDecoded(JLjava/nio/ByteBuffer;III)V
.end method
