.class public Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;
.super Ljava/io/IOException;
.source "360Security"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 46
    return-void
.end method

.method static a()Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;
    .locals 2

    .prologue
    .line 49
    new-instance v0, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;

    const-string/jumbo v1, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length."

    invoke-direct {v0, v1}, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static b()Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;
    .locals 2

    .prologue
    .line 57
    new-instance v0, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;

    const-string/jumbo v1, "CodedInputStream encountered an embedded string or message which claimed to have negative size."

    invoke-direct {v0, v1}, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static c()Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;
    .locals 2

    .prologue
    .line 63
    new-instance v0, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;

    const-string/jumbo v1, "CodedInputStream encountered a malformed varint."

    invoke-direct {v0, v1}, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static d()Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;
    .locals 2

    .prologue
    .line 68
    new-instance v0, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;

    const-string/jumbo v1, "Protocol message contained an invalid tag (zero)."

    invoke-direct {v0, v1}, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method static e()Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;
    .locals 2

    .prologue
    .line 73
    new-instance v0, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;

    const-string/jumbo v1, "Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit."

    invoke-direct {v0, v1}, Lnet/jarlehansen/protobuf/javame/original/input/InvalidProtocolBufferException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
