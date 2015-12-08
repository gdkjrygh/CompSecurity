.class Lcom/splunk/mint/UidManager;
.super Ljava/lang/Object;
.source "UidManager.java"


# static fields
.field private static final DIGITS:[C

.field private static final UID_CORRECT_LENTH:I = 0x20

.field private static final UID_ERROR_ID:Ljava/lang/String; = "12345678901234567890123456789012"

.field private static final UID_FIELD:Ljava/lang/String; = "UID_FIELD"

.field private static final UID_NOSAVED:Ljava/lang/String; = "UID_NOSAVED"

.field private static final UID_PREFERENCES:Ljava/lang/String; = "UIDPREFERENCES"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 121
    const/16 v0, 0x10

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lcom/splunk/mint/UidManager;->DIGITS:[C

    return-void

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final encodeHex([B)[C
    .locals 7
    .param p0, "data"    # [B

    .prologue
    .line 131
    array-length v3, p0

    .line 132
    .local v3, "l":I
    shl-int/lit8 v5, v3, 0x1

    new-array v4, v5, [C

    .line 135
    .local v4, "out":[C
    const/4 v0, 0x0

    .local v0, "i":I
    const/4 v1, 0x0

    .local v1, "j":I
    move v2, v1

    .end local v1    # "j":I
    .local v2, "j":I
    :goto_0
    if-ge v0, v3, :cond_0

    .line 136
    add-int/lit8 v1, v2, 0x1

    .end local v2    # "j":I
    .restart local v1    # "j":I
    sget-object v5, Lcom/splunk/mint/UidManager;->DIGITS:[C

    aget-byte v6, p0, v0

    and-int/lit16 v6, v6, 0xf0

    ushr-int/lit8 v6, v6, 0x4

    aget-char v5, v5, v6

    aput-char v5, v4, v2

    .line 137
    add-int/lit8 v2, v1, 0x1

    .end local v1    # "j":I
    .restart local v2    # "j":I
    sget-object v5, Lcom/splunk/mint/UidManager;->DIGITS:[C

    aget-byte v6, p0, v0

    and-int/lit8 v6, v6, 0xf

    aget-char v5, v5, v6

    aput-char v5, v4, v1

    .line 135
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 140
    :cond_0
    return-object v4
.end method

.method private static final generateUid()Ljava/lang/String;
    .locals 16

    .prologue
    .line 76
    new-instance v12, Ljava/util/Date;

    invoke-direct {v12}, Ljava/util/Date;-><init>()V

    invoke-virtual {v12}, Ljava/util/Date;->getTime()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v5

    .line 82
    .local v5, "s1":Ljava/lang/String;
    new-instance v12, Ljava/lang/Object;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    .line 85
    .local v6, "s2":Ljava/lang/String;
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    .line 86
    .local v2, "dat1":J
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    .line 97
    .local v7, "s3":Ljava/lang/String;
    new-instance v12, Ljava/util/Random;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    invoke-direct {v12, v14, v15}, Ljava/util/Random;-><init>(J)V

    invoke-virtual {v12}, Ljava/util/Random;->nextDouble()D

    move-result-wide v12

    const-wide v14, 0x40efffe000000000L    # 65535.0

    mul-double/2addr v12, v14

    double-to-int v12, v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v8

    .line 99
    .local v8, "s4":Ljava/lang/String;
    const-string v9, "android_id"

    .line 102
    .local v9, "s5":Ljava/lang/String;
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    const-string v13, "android_id"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 105
    .local v10, "sall":Ljava/lang/String;
    const/4 v11, 0x0

    .line 107
    .local v11, "thedigest":[B
    :try_start_0
    const-string v12, "UTF-8"

    invoke-virtual {v10, v12}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    .line 108
    .local v0, "bytesOfMessage":[B
    const-string v12, "MD5"

    invoke-static {v12}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v4

    .line 109
    .local v4, "md":Ljava/security/MessageDigest;
    invoke-virtual {v4, v0}, Ljava/security/MessageDigest;->digest([B)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v11

    .line 117
    .end local v0    # "bytesOfMessage":[B
    .end local v4    # "md":Ljava/security/MessageDigest;
    :goto_0
    new-instance v12, Ljava/lang/String;

    invoke-static {v11}, Lcom/splunk/mint/UidManager;->encodeHex([B)[C

    move-result-object v13

    invoke-direct {v12, v13}, Ljava/lang/String;-><init>([C)V

    return-object v12

    .line 110
    :catch_0
    move-exception v1

    .line 111
    .local v1, "e":Ljava/io/UnsupportedEncodingException;
    invoke-virtual {v1}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V

    goto :goto_0

    .line 112
    .end local v1    # "e":Ljava/io/UnsupportedEncodingException;
    :catch_1
    move-exception v1

    .line 113
    .local v1, "e":Ljava/security/NoSuchAlgorithmException;
    invoke-virtual {v1}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    goto :goto_0
.end method

.method protected static final getUid(Landroid/content/Context;)Ljava/lang/String;
    .locals 4
    .param p0, "ctx"    # Landroid/content/Context;

    .prologue
    .line 27
    sget-object v2, Lcom/splunk/mint/Properties;->UID:Ljava/lang/String;

    if-eqz v2, :cond_1

    sget-object v2, Lcom/splunk/mint/Properties;->UID:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x20

    if-ne v2, v3, :cond_1

    .line 28
    sget-object v1, Lcom/splunk/mint/Properties;->UID:Ljava/lang/String;

    .line 43
    :cond_0
    :goto_0
    return-object v1

    .line 31
    :cond_1
    const-string v1, "12345678901234567890123456789012"

    .line 32
    .local v1, "uid":Ljava/lang/String;
    if-eqz p0, :cond_2

    .line 33
    const-string v2, "UIDPREFERENCES"

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 34
    .local v0, "sharedPrefs":Landroid/content/SharedPreferences;
    if-eqz v0, :cond_2

    .line 35
    const-string v2, "UID_FIELD"

    const-string v3, "UID_NOSAVED"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 39
    .end local v0    # "sharedPrefs":Landroid/content/SharedPreferences;
    :cond_2
    const-string v2, "UID_NOSAVED"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "12345678901234567890123456789012"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 40
    :cond_3
    invoke-static {}, Lcom/splunk/mint/UidManager;->generateUid()Ljava/lang/String;

    move-result-object v1

    .line 41
    invoke-static {p0, v1}, Lcom/splunk/mint/UidManager;->saveUid(Landroid/content/Context;Ljava/lang/String;)Z

    goto :goto_0
.end method

.method protected static saveUid(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 4
    .param p0, "ctx"    # Landroid/content/Context;
    .param p1, "uid"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x0

    .line 48
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x20

    if-ne v2, v3, :cond_0

    .line 49
    sput-object p1, Lcom/splunk/mint/Properties;->UID:Ljava/lang/String;

    .line 50
    const-string v2, "UIDPREFERENCES"

    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 51
    .local v0, "sharedPrefs":Landroid/content/SharedPreferences;
    if-eqz v0, :cond_0

    .line 52
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "UID_FIELD"

    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v1

    .line 57
    .end local v0    # "sharedPrefs":Landroid/content/SharedPreferences;
    :cond_0
    return v1
.end method
