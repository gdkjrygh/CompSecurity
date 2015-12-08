.class public Lorg/chromium/content/browser/crypto/ByteArrayGenerator;
.super Ljava/lang/Object;
.source "ByteArrayGenerator.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBytes(I)[B
    .locals 5
    .param p1, "numBytes"    # I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .prologue
    .line 22
    const/4 v1, 0x0

    .line 24
    .local v1, "fis":Ljava/io/FileInputStream;
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    const-string v3, "/dev/urandom"

    invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 25
    .end local v1    # "fis":Ljava/io/FileInputStream;
    .local v2, "fis":Ljava/io/FileInputStream;
    :try_start_1
    new-array v0, p1, [B

    .line 26
    .local v0, "bytes":[B
    array-length v3, v0

    invoke-virtual {v2, v0}, Ljava/io/FileInputStream;->read([B)I

    move-result v4

    if-eq v3, v4, :cond_1

    .line 27
    new-instance v3, Ljava/security/GeneralSecurityException;

    const-string v4, "Not enough random data available"

    invoke-direct {v3, v4}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .end local v0    # "bytes":[B
    :catchall_0
    move-exception v3

    move-object v1, v2

    .end local v2    # "fis":Ljava/io/FileInputStream;
    .restart local v1    # "fis":Ljava/io/FileInputStream;
    :goto_0
    if-eqz v1, :cond_0

    .line 32
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    :cond_0
    throw v3

    .line 31
    .end local v1    # "fis":Ljava/io/FileInputStream;
    .restart local v0    # "bytes":[B
    .restart local v2    # "fis":Ljava/io/FileInputStream;
    :cond_1
    if-eqz v2, :cond_2

    .line 32
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    :cond_2
    return-object v0

    .line 31
    .end local v0    # "bytes":[B
    .end local v2    # "fis":Ljava/io/FileInputStream;
    .restart local v1    # "fis":Ljava/io/FileInputStream;
    :catchall_1
    move-exception v3

    goto :goto_0
.end method
