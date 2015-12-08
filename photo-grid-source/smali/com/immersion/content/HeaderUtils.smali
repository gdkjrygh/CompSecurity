.class public abstract Lcom/immersion/content/HeaderUtils;
.super Ljava/lang/Object;


# static fields
.field public static b044Aъъ044A044Aъ:I = 0x1

.field public static bъ044Aъ044A044Aъ:I = 0x2

.field public static bъъъ044A044Aъ:I = 0x56


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b044A044Aъ044A044Aъ()I
    .locals 1

    const/16 v0, 0x22

    return v0
.end method


# virtual methods
.method public abstract calculateBlockRate()I
.end method

.method public abstract calculateBlockSize()I
.end method

.method public abstract calculateByteOffsetIntoHapticData(I)I
.end method

.method public abstract dispose()V
.end method

.method public abstract getContentUUID()Ljava/lang/String;
.end method

.method public abstract getEncryption()I
.end method

.method public abstract getMajorVersionNumber()I
.end method

.method public abstract getMinorVersionNumber()I
.end method

.method public abstract getNumChannels()I
.end method

.method public abstract setEncryptedHSI(Ljava/nio/ByteBuffer;I)V
.end method
