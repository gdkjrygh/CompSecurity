.class public abstract Lcom/googlecode/mp4parser/contentprotection/PlayReadyHeader$PlayReadyRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/mp4parser/contentprotection/PlayReadyHeader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "PlayReadyRecord"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/googlecode/mp4parser/contentprotection/PlayReadyHeader$PlayReadyRecord$DefaulPlayReadyRecord;,
        Lcom/googlecode/mp4parser/contentprotection/PlayReadyHeader$PlayReadyRecord$EmeddedLicenseStore;,
        Lcom/googlecode/mp4parser/contentprotection/PlayReadyHeader$PlayReadyRecord$RMHeader;
    }
.end annotation


# instance fields
.field type:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .prologue
    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    iput p1, p0, Lcom/googlecode/mp4parser/contentprotection/PlayReadyHeader$PlayReadyRecord;->type:I

    .line 113
    return-void
.end method

.method public static createFor(Ljava/nio/ByteBuffer;I)Ljava/util/List;
    .locals 5

    .prologue
    .line 116
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 118
    const/4 v0, 0x0

    move v2, v0

    :goto_0
    if-lt v2, p1, :cond_0

    .line 140
    return-object v3

    .line 120
    :cond_0
    invoke-static {p0}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16BE(Ljava/nio/ByteBuffer;)I

    move-result v1

    .line 121
    invoke-static {p0}, Lcom/coremedia/iso/IsoTypeReader;->readUInt16BE(Ljava/nio/ByteBuffer;)I

    move-result v4

    .line 122
    packed-switch v1, :pswitch_data_0

    .line 133
    new-instance v0, Lcom/googlecode/mp4parser/contentprotection/PlayReadyHeader$PlayReadyRecord$DefaulPlayReadyRecord;

    invoke-direct {v0, v1}, Lcom/googlecode/mp4parser/contentprotection/PlayReadyHeader$PlayReadyRecord$DefaulPlayReadyRecord;-><init>(I)V

    move-object v1, v0

    .line 135
    :goto_1
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Lcom/googlecode/mp4parser/contentprotection/PlayReadyHeader$PlayReadyRecord;->parse(Ljava/nio/ByteBuffer;)V

    .line 136
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->position()I

    move-result v0

    add-int/2addr v0, v4

    invoke-virtual {p0, v0}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 137
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 124
    :pswitch_0
    new-instance v0, Lcom/googlecode/mp4parser/contentprotection/PlayReadyHeader$PlayReadyRecord$RMHeader;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/contentprotection/PlayReadyHeader$PlayReadyRecord$RMHeader;-><init>()V

    move-object v1, v0

    .line 125
    goto :goto_1

    .line 127
    :pswitch_1
    new-instance v0, Lcom/googlecode/mp4parser/contentprotection/PlayReadyHeader$PlayReadyRecord$DefaulPlayReadyRecord;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lcom/googlecode/mp4parser/contentprotection/PlayReadyHeader$PlayReadyRecord$DefaulPlayReadyRecord;-><init>(I)V

    move-object v1, v0

    .line 128
    goto :goto_1

    .line 130
    :pswitch_2
    new-instance v0, Lcom/googlecode/mp4parser/contentprotection/PlayReadyHeader$PlayReadyRecord$EmeddedLicenseStore;

    invoke-direct {v0}, Lcom/googlecode/mp4parser/contentprotection/PlayReadyHeader$PlayReadyRecord$EmeddedLicenseStore;-><init>()V

    move-object v1, v0

    .line 131
    goto :goto_1

    .line 122
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method public abstract getValue()Ljava/nio/ByteBuffer;
.end method

.method public abstract parse(Ljava/nio/ByteBuffer;)V
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 147
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    const-string v1, "PlayReadyRecord"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    const-string v1, "{type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/googlecode/mp4parser/contentprotection/PlayReadyHeader$PlayReadyRecord;->type:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 150
    const-string v1, ", length="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/googlecode/mp4parser/contentprotection/PlayReadyHeader$PlayReadyRecord;->getValue()Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->limit()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 152
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 153
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
