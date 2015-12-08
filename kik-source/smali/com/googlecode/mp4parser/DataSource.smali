.class public interface abstract Lcom/googlecode/mp4parser/DataSource;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# virtual methods
.method public abstract close()V
.end method

.method public abstract map(JJ)Ljava/nio/ByteBuffer;
.end method

.method public abstract position()J
.end method

.method public abstract position(J)V
.end method

.method public abstract read(Ljava/nio/ByteBuffer;)I
.end method

.method public abstract size()J
.end method

.method public abstract transferTo(JJLjava/nio/channels/WritableByteChannel;)J
.end method
