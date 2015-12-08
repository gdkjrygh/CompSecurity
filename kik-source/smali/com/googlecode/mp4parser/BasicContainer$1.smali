.class Lcom/googlecode/mp4parser/BasicContainer$1;
.super Lcom/googlecode/mp4parser/AbstractBox;
.source "SourceFile"


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0, p1}, Lcom/googlecode/mp4parser/AbstractBox;-><init>(Ljava/lang/String;)V

    .line 1
    return-void
.end method


# virtual methods
.method protected _parseDetails(Ljava/nio/ByteBuffer;)V
    .locals 0

    .prologue
    .line 37
    return-void
.end method

.method protected getContent(Ljava/nio/ByteBuffer;)V
    .locals 0

    .prologue
    .line 33
    return-void
.end method

.method protected getContentSize()J
    .locals 2

    .prologue
    .line 28
    const-wide/16 v0, 0x0

    return-wide v0
.end method
