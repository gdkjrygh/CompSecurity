.class Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/mp4parser/authoring/Sample;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "EncryptedSampleImpl"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private final cek:Ljavax/crypto/SecretKey;

.field private final cencSampleAuxiliaryDataFormat:Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;

.field private final cipher:Ljavax/crypto/Cipher;

.field private final clearSample:Lcom/googlecode/mp4parser/authoring/Sample;

.field final synthetic this$0:Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 94
    const-class v0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;Lcom/googlecode/mp4parser/authoring/Sample;Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;Ljavax/crypto/Cipher;Ljavax/crypto/SecretKey;)V
    .locals 0

    .prologue
    .line 105
    iput-object p1, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->this$0:Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    iput-object p2, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->clearSample:Lcom/googlecode/mp4parser/authoring/Sample;

    .line 108
    iput-object p3, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->cencSampleAuxiliaryDataFormat:Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;

    .line 109
    iput-object p4, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->cipher:Ljavax/crypto/Cipher;

    .line 110
    iput-object p5, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->cek:Ljavax/crypto/SecretKey;

    .line 111
    return-void
.end method

.method synthetic constructor <init>(Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;Lcom/googlecode/mp4parser/authoring/Sample;Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;Ljavax/crypto/Cipher;Ljavax/crypto/SecretKey;Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;)V
    .locals 0

    .prologue
    .line 101
    invoke-direct/range {p0 .. p5}, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;-><init>(Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;Lcom/googlecode/mp4parser/authoring/Sample;Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;Ljavax/crypto/Cipher;Ljavax/crypto/SecretKey;)V

    return-void
.end method


# virtual methods
.method public asByteBuffer()Ljava/nio/ByteBuffer;
    .locals 10

    .prologue
    const/4 v1, 0x0

    .line 162
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->clearSample:Lcom/googlecode/mp4parser/authoring/Sample;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Sample;->asByteBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v0

    check-cast v0, Ljava/nio/ByteBuffer;

    .line 163
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v2

    invoke-static {v2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 165
    iget-object v3, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->cencSampleAuxiliaryDataFormat:Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;

    .line 166
    iget-object v4, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->this$0:Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;

    iget-object v5, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->cencSampleAuxiliaryDataFormat:Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;

    iget-object v5, v5, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;->iv:[B

    iget-object v6, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->cek:Ljavax/crypto/SecretKey;

    invoke-virtual {v4, v5, v6}, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->initCipher([BLjavax/crypto/SecretKey;)V

    .line 168
    :try_start_0
    iget-object v4, v3, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;->pairs:[Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat$Pair;

    if-eqz v4, :cond_5

    .line 169
    iget-object v3, v3, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;->pairs:[Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat$Pair;

    array-length v4, v3

    :goto_0
    if-lt v1, v4, :cond_1

    .line 195
    :cond_0
    :goto_1
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;
    :try_end_0
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_1

    .line 201
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 202
    return-object v2

    .line 169
    :cond_1
    :try_start_1
    aget-object v5, v3, v1

    .line 170
    invoke-interface {v5}, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat$Pair;->clear()I

    move-result v6

    new-array v6, v6, [B

    .line 171
    invoke-virtual {v0, v6}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 172
    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 173
    invoke-interface {v5}, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat$Pair;->encrypted()J

    move-result-wide v6

    const-wide/16 v8, 0x0

    cmp-long v6, v6, v8

    if-lez v6, :cond_4

    .line 174
    invoke-interface {v5}, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat$Pair;->encrypted()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v5

    new-array v5, v5, [B

    .line 175
    invoke-virtual {v0, v5}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 176
    sget-boolean v6, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->$assertionsDisabled:Z

    if-nez v6, :cond_2

    array-length v6, v5

    rem-int/lit8 v6, v6, 0x10

    if-eqz v6, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
    :try_end_1
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_1 .. :try_end_1} :catch_1

    .line 196
    :catch_0
    move-exception v0

    .line 197
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 177
    :cond_2
    :try_start_2
    iget-object v6, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->cipher:Ljavax/crypto/Cipher;

    invoke-virtual {v6, v5}, Ljavax/crypto/Cipher;->update([B)[B

    move-result-object v6

    .line 178
    sget-boolean v7, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->$assertionsDisabled:Z

    if-nez v7, :cond_3

    array-length v7, v6

    array-length v5, v5

    if-eq v7, v5, :cond_3

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
    :try_end_2
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_2 .. :try_end_2} :catch_1

    .line 198
    :catch_1
    move-exception v0

    .line 199
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 179
    :cond_3
    :try_start_3
    invoke-virtual {v2, v6}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 169
    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 185
    :cond_5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->limit()I

    move-result v1

    new-array v1, v1, [B

    .line 186
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 187
    const-string v3, "cbc1"

    iget-object v4, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->this$0:Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;

    # getter for: Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->encryptionAlgo:Ljava/lang/String;
    invoke-static {v4}, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->access$1(Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 188
    array-length v3, v1

    div-int/lit8 v3, v3, 0x10

    mul-int/lit8 v3, v3, 0x10

    .line 189
    iget-object v4, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->cipher:Ljavax/crypto/Cipher;

    const/4 v5, 0x0

    invoke-virtual {v4, v1, v5, v3}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 190
    array-length v4, v1

    sub-int/2addr v4, v3

    invoke-virtual {v2, v1, v3, v4}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    goto/16 :goto_1

    .line 191
    :cond_6
    const-string v3, "cenc"

    iget-object v4, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->this$0:Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;

    # getter for: Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->encryptionAlgo:Ljava/lang/String;
    invoke-static {v4}, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->access$1(Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 192
    iget-object v3, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->cipher:Ljavax/crypto/Cipher;

    invoke-virtual {v3, v1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;
    :try_end_3
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_1
.end method

.method public getSize()J
    .locals 2

    .prologue
    .line 157
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->clearSample:Lcom/googlecode/mp4parser/authoring/Sample;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Sample;->getSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public writeTo(Ljava/nio/channels/WritableByteChannel;)V
    .locals 14

    .prologue
    const/4 v2, 0x0

    .line 114
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->clearSample:Lcom/googlecode/mp4parser/authoring/Sample;

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Sample;->asByteBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/nio/ByteBuffer;

    .line 115
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->this$0:Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;

    iget-object v1, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->cencSampleAuxiliaryDataFormat:Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;

    iget-object v1, v1, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;->iv:[B

    iget-object v3, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->cek:Ljavax/crypto/SecretKey;

    invoke-virtual {v0, v1, v3}, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->initCipher([BLjavax/crypto/SecretKey;)V

    .line 117
    :try_start_0
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->cencSampleAuxiliaryDataFormat:Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;

    iget-object v0, v0, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;->pairs:[Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat$Pair;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->cencSampleAuxiliaryDataFormat:Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;

    iget-object v0, v0, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;->pairs:[Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat$Pair;

    array-length v0, v0

    if-lez v0, :cond_3

    .line 118
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    new-array v1, v0, [B

    .line 119
    invoke-virtual {v6, v1}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 122
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->cencSampleAuxiliaryDataFormat:Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;

    iget-object v8, v0, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat;->pairs:[Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat$Pair;

    array-length v9, v8

    move v7, v2

    :goto_0
    if-lt v7, v9, :cond_1

    .line 133
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 145
    :cond_0
    :goto_1
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 146
    return-void

    .line 122
    :cond_1
    aget-object v10, v8, v7

    .line 123
    invoke-interface {v10}, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat$Pair;->clear()I

    move-result v0

    add-int/2addr v2, v0

    .line 124
    invoke-interface {v10}, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat$Pair;->encrypted()J

    move-result-wide v4

    const-wide/16 v12, 0x0

    cmp-long v0, v4, v12

    if-lez v0, :cond_2

    .line 125
    iget-object v0, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->cipher:Ljavax/crypto/Cipher;

    .line 127
    invoke-interface {v10}, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat$Pair;->encrypted()J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/googlecode/mp4parser/util/CastUtils;->l2i(J)I

    move-result v3

    move-object v4, v1

    move v5, v2

    .line 125
    invoke-virtual/range {v0 .. v5}, Ljavax/crypto/Cipher;->update([BII[BI)I

    .line 130
    int-to-long v2, v2

    invoke-interface {v10}, Lcom/mp4parser/iso23001/part7/CencSampleAuxiliaryDataFormat$Pair;->encrypted()J

    move-result-wide v4

    add-long/2addr v2, v4

    long-to-int v2, v2

    .line 122
    :cond_2
    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto :goto_0

    .line 135
    :cond_3
    invoke-virtual {v6}, Ljava/nio/ByteBuffer;->limit()I

    move-result v0

    new-array v0, v0, [B

    .line 136
    invoke-virtual {v6, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 137
    const-string v1, "cbc1"

    iget-object v2, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->this$0:Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;

    # getter for: Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->encryptionAlgo:Ljava/lang/String;
    invoke-static {v2}, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->access$1(Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 138
    array-length v1, v0

    div-int/lit8 v1, v1, 0x10

    mul-int/lit8 v1, v1, 0x10

    .line 139
    iget-object v2, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->cipher:Ljavax/crypto/Cipher;

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3, v1}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    move-result-object v2

    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I

    .line 140
    array-length v2, v0

    sub-int/2addr v2, v1

    invoke-static {v0, v1, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I
    :try_end_0
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljavax/crypto/ShortBufferException; {:try_start_0 .. :try_end_0} :catch_2

    goto :goto_1

    .line 146
    :catch_0
    move-exception v0

    .line 147
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 141
    :cond_4
    :try_start_1
    const-string v1, "cenc"

    iget-object v2, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->this$0:Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;

    # getter for: Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->encryptionAlgo:Ljava/lang/String;
    invoke-static {v2}, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;->access$1(Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 142
    iget-object v1, p0, Lcom/googlecode/mp4parser/boxes/cenc/CencEncryptingSampleList$EncryptedSampleImpl;->cipher:Ljavax/crypto/Cipher;

    invoke-virtual {v1, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/nio/channels/WritableByteChannel;->write(Ljava/nio/ByteBuffer;)I
    :try_end_1
    .catch Ljavax/crypto/IllegalBlockSizeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljavax/crypto/BadPaddingException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljavax/crypto/ShortBufferException; {:try_start_1 .. :try_end_1} :catch_2

    goto/16 :goto_1

    .line 148
    :catch_1
    move-exception v0

    .line 149
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 150
    :catch_2
    move-exception v0

    .line 151
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
