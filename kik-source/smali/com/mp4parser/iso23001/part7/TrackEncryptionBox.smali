.class public Lcom/mp4parser/iso23001/part7/TrackEncryptionBox;
.super Lcom/googlecode/mp4parser/boxes/AbstractTrackEncryptionBox;
.source "SourceFile"


# static fields
.field public static final TYPE:Ljava/lang/String; = "tenc"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 12
    const-string v0, "tenc"

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/boxes/AbstractTrackEncryptionBox;-><init>(Ljava/lang/String;)V

    .line 13
    return-void
.end method
