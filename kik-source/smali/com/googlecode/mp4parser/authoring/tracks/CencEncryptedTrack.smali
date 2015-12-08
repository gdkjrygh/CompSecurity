.class public interface abstract Lcom/googlecode/mp4parser/authoring/tracks/CencEncryptedTrack;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/mp4parser/authoring/Track;


# virtual methods
.method public abstract getDefaultKeyId()Ljava/util/UUID;
.end method

.method public abstract getSampleEncryptionEntries()Ljava/util/List;
.end method

.method public abstract hasSubSampleEncryption()Z
.end method
