.class public interface abstract Lcom/immersion/hapticmediasdk/controllers/IHapticFileReader;
.super Ljava/lang/Object;


# virtual methods
.method public abstract bufferAtPlaybackPosition(I)Z
.end method

.method public abstract close()V
.end method

.method public abstract getBlockOffset(J)J
.end method

.method public abstract getBlockSizeMS()I
.end method

.method public abstract getBufferForPlaybackPosition(I)[B
.end method

.method public abstract getEncryptedHapticHeader()[B
.end method

.method public abstract getHapticBlockIndex(J)I
.end method

.method public abstract getHapticFileInformation()Lcom/immersion/hapticmediasdk/models/HapticFileInformation;
.end method

.method public abstract setBlockSizeMS(I)V
.end method

.method public abstract setBytesAvailable(I)V
.end method
