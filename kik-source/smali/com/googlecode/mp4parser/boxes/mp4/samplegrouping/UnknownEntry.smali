.class public Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/UnknownEntry;
.super Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/GroupEntry;
.source "SourceFile"


# instance fields
.field private content:Ljava/nio/ByteBuffer;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/GroupEntry;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/UnknownEntry;->type:Ljava/lang/String;

    .line 32
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 70
    if-ne p0, p1, :cond_1

    .line 83
    :cond_0
    :goto_0
    return v0

    .line 73
    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    .line 74
    goto :goto_0

    .line 77
    :cond_3
    check-cast p1, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/UnknownEntry;

    .line 79
    iget-object v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/UnknownEntry;->content:Ljava/nio/ByteBuffer;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/UnknownEntry;->content:Ljava/nio/ByteBuffer;

    iget-object v3, p1, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/UnknownEntry;->content:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_1
    move v0, v1

    .line 80
    goto :goto_0

    .line 79
    :cond_4
    iget-object v2, p1, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/UnknownEntry;->content:Ljava/nio/ByteBuffer;

    if-eqz v2, :cond_0

    goto :goto_1
.end method

.method public get()Ljava/nio/ByteBuffer;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/UnknownEntry;->content:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public getContent()Ljava/nio/ByteBuffer;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/UnknownEntry;->content:Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/UnknownEntry;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/UnknownEntry;->content:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/UnknownEntry;->content:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hashCode()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public parse(Ljava/nio/ByteBuffer;)V
    .locals 1

    .prologue
    .line 49
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/UnknownEntry;->content:Ljava/nio/ByteBuffer;

    .line 50
    return-void
.end method

.method public setContent(Ljava/nio/ByteBuffer;)V
    .locals 1

    .prologue
    .line 44
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    iput-object v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/UnknownEntry;->content:Ljava/nio/ByteBuffer;

    .line 45
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 59
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/mp4/samplegrouping/UnknownEntry;->content:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->duplicate()Ljava/nio/ByteBuffer;

    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 61
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v1

    new-array v1, v1, [B

    .line 62
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "UnknownEntry{content="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    invoke-static {v1}, Lcom/coremedia/iso/Hex;->encodeHex([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 65
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
