.class final Lorg/spongycastle/jce/provider/JDKKeyStore$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/spongycastle/jce/provider/JDKKeyStore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field a:I

.field b:Ljava/lang/String;

.field c:Ljava/lang/Object;

.field d:[Ljava/security/cert/Certificate;

.field e:Ljava/util/Date;

.field final synthetic f:Lorg/spongycastle/jce/provider/JDKKeyStore;


# direct methods
.method constructor <init>(Lorg/spongycastle/jce/provider/JDKKeyStore;Ljava/lang/String;Ljava/security/Key;[C[Ljava/security/cert/Certificate;)V
    .locals 6

    .prologue
    const/16 v4, 0x14

    .line 127
    iput-object p1, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->f:Lorg/spongycastle/jce/provider/JDKKeyStore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->e:Ljava/util/Date;

    .line 128
    const/4 v0, 0x4

    iput v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->a:I

    .line 129
    iput-object p2, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->b:Ljava/lang/String;

    .line 130
    iput-object p5, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->d:[Ljava/security/cert/Certificate;

    .line 132
    new-array v0, v4, [B

    .line 134
    iget-object v1, p1, Lorg/spongycastle/jce/provider/JDKKeyStore;->b:Ljava/security/SecureRandom;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/security/SecureRandom;->setSeed(J)V

    .line 135
    iget-object v1, p1, Lorg/spongycastle/jce/provider/JDKKeyStore;->b:Ljava/security/SecureRandom;

    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 137
    iget-object v1, p1, Lorg/spongycastle/jce/provider/JDKKeyStore;->b:Ljava/security/SecureRandom;

    invoke-virtual {v1}, Ljava/security/SecureRandom;->nextInt()I

    move-result v1

    and-int/lit16 v1, v1, 0x3ff

    add-int/lit16 v1, v1, 0x400

    .line 140
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 141
    new-instance v3, Ljava/io/DataOutputStream;

    invoke-direct {v3, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 143
    invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 144
    invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 145
    invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 147
    const-string v4, "PBEWithSHAAnd3-KeyTripleDES-CBC"

    const/4 v5, 0x1

    invoke-static {v4, v5, p4, v0, v1}, Lorg/spongycastle/jce/provider/JDKKeyStore;->a(Ljava/lang/String;I[C[BI)Ljavax/crypto/Cipher;

    move-result-object v0

    .line 148
    new-instance v1, Ljavax/crypto/CipherOutputStream;

    invoke-direct {v1, v3, v0}, Ljavax/crypto/CipherOutputStream;-><init>(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V

    .line 150
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 152
    invoke-static {p3, v0}, Lorg/spongycastle/jce/provider/JDKKeyStore;->a(Ljava/security/Key;Ljava/io/DataOutputStream;)V

    .line 154
    invoke-virtual {v0}, Ljava/io/DataOutputStream;->close()V

    .line 156
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    .line 157
    return-void
.end method

.method constructor <init>(Lorg/spongycastle/jce/provider/JDKKeyStore;Ljava/lang/String;Ljava/security/cert/Certificate;)V
    .locals 1

    .prologue
    .line 103
    iput-object p1, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->f:Lorg/spongycastle/jce/provider/JDKKeyStore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->e:Ljava/util/Date;

    .line 104
    const/4 v0, 0x1

    iput v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->a:I

    .line 105
    iput-object p2, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->b:Ljava/lang/String;

    .line 106
    iput-object p3, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    .line 107
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->d:[Ljava/security/cert/Certificate;

    .line 108
    return-void
.end method

.method constructor <init>(Lorg/spongycastle/jce/provider/JDKKeyStore;Ljava/lang/String;Ljava/util/Date;ILjava/lang/Object;[Ljava/security/cert/Certificate;)V
    .locals 1

    .prologue
    .line 177
    iput-object p1, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->f:Lorg/spongycastle/jce/provider/JDKKeyStore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->e:Ljava/util/Date;

    .line 178
    iput-object p2, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->b:Ljava/lang/String;

    .line 179
    iput-object p3, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->e:Ljava/util/Date;

    .line 180
    iput p4, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->a:I

    .line 181
    iput-object p5, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    .line 182
    iput-object p6, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->d:[Ljava/security/cert/Certificate;

    .line 183
    return-void
.end method

.method constructor <init>(Lorg/spongycastle/jce/provider/JDKKeyStore;Ljava/lang/String;Ljava/util/Date;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 164
    iput-object p1, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->f:Lorg/spongycastle/jce/provider/JDKKeyStore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->e:Ljava/util/Date;

    .line 165
    iput-object p2, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->b:Ljava/lang/String;

    .line 166
    iput-object p3, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->e:Ljava/util/Date;

    .line 167
    const/4 v0, 0x1

    iput v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->a:I

    .line 168
    iput-object p4, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    .line 169
    return-void
.end method

.method constructor <init>(Lorg/spongycastle/jce/provider/JDKKeyStore;Ljava/lang/String;[B[Ljava/security/cert/Certificate;)V
    .locals 1

    .prologue
    .line 114
    iput-object p1, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->f:Lorg/spongycastle/jce/provider/JDKKeyStore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->e:Ljava/util/Date;

    .line 115
    const/4 v0, 0x3

    iput v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->a:I

    .line 116
    iput-object p2, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->b:Ljava/lang/String;

    .line 117
    iput-object p3, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    .line 118
    iput-object p4, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->d:[Ljava/security/cert/Certificate;

    .line 119
    return-void
.end method


# virtual methods
.method final a([C)Ljava/lang/Object;
    .locals 8

    .prologue
    .line 204
    if-eqz p1, :cond_0

    array-length v0, p1

    if-nez v0, :cond_1

    .line 206
    :cond_0
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    instance-of v0, v0, Ljava/security/Key;

    if-eqz v0, :cond_1

    .line 208
    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    .line 295
    :goto_0
    return-object v0

    .line 212
    :cond_1
    iget v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->a:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 214
    new-instance v1, Ljava/io/ByteArrayInputStream;

    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    check-cast v0, [B

    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 215
    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 219
    :try_start_0
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    new-array v1, v1, [B

    .line 221
    invoke-virtual {v0, v1}, Ljava/io/DataInputStream;->readFully([B)V

    .line 223
    invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I

    move-result v2

    .line 225
    const-string v3, "PBEWithSHAAnd3-KeyTripleDES-CBC"

    const/4 v4, 0x2

    invoke-static {v3, v4, p1, v1, v2}, Lorg/spongycastle/jce/provider/JDKKeyStore;->a(Ljava/lang/String;I[C[BI)Ljavax/crypto/Cipher;

    move-result-object v1

    .line 227
    new-instance v2, Ljavax/crypto/CipherInputStream;

    invoke-direct {v2, v0, v1}, Ljavax/crypto/CipherInputStream;-><init>(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 231
    :try_start_1
    new-instance v0, Ljava/io/DataInputStream;

    invoke-direct {v0, v2}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {v0}, Lorg/spongycastle/jce/provider/JDKKeyStore;->a(Ljava/io/DataInputStream;)Ljava/security/Key;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto :goto_0

    .line 235
    :catch_0
    move-exception v0

    :try_start_2
    new-instance v1, Ljava/io/ByteArrayInputStream;

    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    check-cast v0, [B

    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 236
    new-instance v2, Ljava/io/DataInputStream;

    invoke-direct {v2, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 238
    invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    new-array v1, v0, [B

    .line 240
    invoke-virtual {v2, v1}, Ljava/io/DataInputStream;->readFully([B)V

    .line 242
    invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    .line 244
    const-string v3, "BrokenPBEWithSHAAnd3-KeyTripleDES-CBC"

    const/4 v4, 0x2

    invoke-static {v3, v4, p1, v1, v0}, Lorg/spongycastle/jce/provider/JDKKeyStore;->a(Ljava/lang/String;I[C[BI)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 246
    new-instance v4, Ljavax/crypto/CipherInputStream;

    invoke-direct {v4, v2, v3}, Ljavax/crypto/CipherInputStream;-><init>(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 248
    :try_start_3
    new-instance v2, Ljava/io/DataInputStream;

    invoke-direct {v2, v4}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {v2}, Lorg/spongycastle/jce/provider/JDKKeyStore;->a(Ljava/io/DataInputStream;)Ljava/security/Key;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    move-result-object v2

    move v7, v0

    move-object v0, v2

    move-object v2, v1

    move v1, v7

    .line 275
    :goto_1
    if-eqz v0, :cond_2

    .line 277
    :try_start_4
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 278
    new-instance v4, Ljava/io/DataOutputStream;

    invoke-direct {v4, v3}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 280
    array-length v5, v2

    invoke-virtual {v4, v5}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 281
    invoke-virtual {v4, v2}, Ljava/io/DataOutputStream;->write([B)V

    .line 282
    invoke-virtual {v4, v1}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 284
    const-string v5, "PBEWithSHAAnd3-KeyTripleDES-CBC"

    const/4 v6, 0x1

    invoke-static {v5, v6, p1, v2, v1}, Lorg/spongycastle/jce/provider/JDKKeyStore;->a(Ljava/lang/String;I[C[BI)Ljavax/crypto/Cipher;

    move-result-object v1

    .line 285
    new-instance v2, Ljavax/crypto/CipherOutputStream;

    invoke-direct {v2, v4, v1}, Ljavax/crypto/CipherOutputStream;-><init>(Ljava/io/OutputStream;Ljavax/crypto/Cipher;)V

    .line 287
    new-instance v1, Ljava/io/DataOutputStream;

    invoke-direct {v1, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 289
    invoke-static {v0, v1}, Lorg/spongycastle/jce/provider/JDKKeyStore;->a(Ljava/security/Key;Ljava/io/DataOutputStream;)V

    .line 291
    invoke-virtual {v1}, Ljava/io/DataOutputStream;->close()V

    .line 293
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    iput-object v1, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto/16 :goto_0

    .line 305
    :catch_1
    move-exception v0

    new-instance v0, Ljava/security/UnrecoverableKeyException;

    const-string v1, "no match"

    invoke-direct {v0, v1}, Ljava/security/UnrecoverableKeyException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 256
    :catch_2
    move-exception v0

    :try_start_5
    new-instance v1, Ljava/io/ByteArrayInputStream;

    iget-object v0, p0, Lorg/spongycastle/jce/provider/JDKKeyStore$a;->c:Ljava/lang/Object;

    check-cast v0, [B

    invoke-direct {v1, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 257
    new-instance v2, Ljava/io/DataInputStream;

    invoke-direct {v2, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    .line 259
    invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    new-array v1, v0, [B

    .line 261
    invoke-virtual {v2, v1}, Ljava/io/DataInputStream;->readFully([B)V

    .line 263
    invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    .line 265
    const-string v3, "OldPBEWithSHAAnd3-KeyTripleDES-CBC"

    const/4 v4, 0x2

    invoke-static {v3, v4, p1, v1, v0}, Lorg/spongycastle/jce/provider/JDKKeyStore;->a(Ljava/lang/String;I[C[BI)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 267
    new-instance v4, Ljavax/crypto/CipherInputStream;

    invoke-direct {v4, v2, v3}, Ljavax/crypto/CipherInputStream;-><init>(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V

    .line 269
    new-instance v2, Ljava/io/DataInputStream;

    invoke-direct {v2, v4}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {v2}, Lorg/spongycastle/jce/provider/JDKKeyStore;->a(Ljava/io/DataInputStream;)Ljava/security/Key;

    move-result-object v2

    move v7, v0

    move-object v0, v2

    move-object v2, v1

    move v1, v7

    goto :goto_1

    .line 299
    :cond_2
    new-instance v0, Ljava/security/UnrecoverableKeyException;

    const-string v1, "no match"

    invoke-direct {v0, v1}, Ljava/security/UnrecoverableKeyException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 310
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "forget something!"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
