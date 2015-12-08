.class public interface abstract Lcom/coremedia/iso/boxes/Container;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getBoxes()Ljava/util/List;
.end method

.method public abstract getBoxes(Ljava/lang/Class;)Ljava/util/List;
.end method

.method public abstract getBoxes(Ljava/lang/Class;Z)Ljava/util/List;
.end method

.method public abstract getByteBuffer(JJ)Ljava/nio/ByteBuffer;
.end method

.method public abstract setBoxes(Ljava/util/List;)V
.end method

.method public abstract writeContainer(Ljava/nio/channels/WritableByteChannel;)V
.end method
