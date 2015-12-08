.class public Lcom/worklight/androidgap/plugin/SecurityPlugin;
.super Lorg/apache/cordova/api/Plugin;
.source "SecurityPlugin.java"


# static fields
.field protected static final ACTION_DECRYPT:Ljava/lang/String; = "decrypt"

.field protected static final ACTION_ENCRYPT:Ljava/lang/String; = "encrypt"

.field protected static final ACTION_HASH_DATA:Ljava/lang/String; = "hashData"

.field protected static final ACTION_KEYGEN:Ljava/lang/String; = "keygen"


# instance fields
.field private myactivity:Landroid/app/Activity;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Lorg/apache/cordova/api/Plugin;-><init>()V

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/worklight/androidgap/plugin/SecurityPlugin;->myactivity:Landroid/app/Activity;

    .line 42
    return-void
.end method

.method private decrypt(Lorg/json/JSONArray;)[B
    .locals 9
    .param p1, "arguments"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;,
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljavax/crypto/BadPaddingException;
        }
    .end annotation

    .prologue
    const/4 v8, 0x2

    .line 111
    const/4 v6, 0x0

    invoke-virtual {p1, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 112
    .local v3, "key":Ljava/lang/String;
    const/4 v6, 0x1

    invoke-virtual {p1, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 113
    .local v5, "value":Ljava/lang/String;
    invoke-virtual {p1, v8}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 115
    .local v2, "iv":Ljava/lang/String;
    invoke-static {v3}, Lcom/worklight/common/WLUtils;->hexStringToByteArray(Ljava/lang/String;)[B

    move-result-object v6

    invoke-static {v2}, Lcom/worklight/common/WLUtils;->hexStringToByteArray(Ljava/lang/String;)[B

    move-result-object v7

    invoke-static {v8, v6, v7}, Lcom/worklight/androidgap/plugin/SecurityPlugin;->initCipher(I[B[B)Ljavax/crypto/Cipher;

    move-result-object v1

    .line 117
    .local v1, "cipher":Ljavax/crypto/Cipher;
    invoke-static {v5}, Lcom/worklight/common/WLUtils;->hexStringToByteArray(Ljava/lang/String;)[B

    move-result-object v0

    .line 118
    .local v0, "bytes":[B
    invoke-virtual {v1, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v4

    .line 119
    .local v4, "original":[B
    return-object v4
.end method

.method private encrypt(Lorg/json/JSONArray;)Ljava/lang/String;
    .locals 9
    .param p1, "arguments"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;,
            Ljavax/crypto/IllegalBlockSizeException;,
            Ljavax/crypto/BadPaddingException;
        }
    .end annotation

    .prologue
    const/4 v8, 0x1

    .line 133
    const/4 v6, 0x0

    invoke-virtual {p1, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 134
    .local v4, "key":Ljava/lang/String;
    invoke-virtual {p1, v8}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 135
    .local v5, "value":Ljava/lang/String;
    const/4 v6, 0x2

    invoke-virtual {p1, v6}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 136
    .local v2, "iv":Ljava/lang/String;
    invoke-static {v4}, Lcom/worklight/common/WLUtils;->hexStringToByteArray(Ljava/lang/String;)[B

    move-result-object v6

    invoke-static {v2}, Lcom/worklight/common/WLUtils;->hexStringToByteArray(Ljava/lang/String;)[B

    move-result-object v7

    invoke-static {v8, v6, v7}, Lcom/worklight/androidgap/plugin/SecurityPlugin;->initCipher(I[B[B)Ljavax/crypto/Cipher;

    move-result-object v0

    .line 138
    .local v0, "cipher":Ljavax/crypto/Cipher;
    invoke-virtual {v5}, Ljava/lang/String;->getBytes()[B

    move-result-object v6

    invoke-virtual {v0, v6}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v1

    .line 140
    .local v1, "encrypted":[B
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 141
    .local v3, "json":Lorg/json/JSONObject;
    const-string v6, "ct"

    invoke-static {v1}, Lcom/worklight/common/WLUtils;->byteArrayToHexString([B)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 142
    const-string v6, "iv"

    invoke-virtual {v3, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 144
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    return-object v6
.end method

.method private generateKey(Lorg/json/JSONArray;)[B
    .locals 7
    .param p1, "arguments"    # Lorg/json/JSONArray;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Lorg/json/JSONException;,
            Ljava/security/InvalidKeyException;,
            Ljava/security/spec/InvalidKeySpecException;,
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .prologue
    .line 158
    const/4 v5, 0x0

    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 159
    .local v3, "pass":Ljava/lang/String;
    const/4 v5, 0x1

    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 160
    .local v4, "salt":Ljava/lang/String;
    const/4 v5, 0x2

    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 161
    .local v1, "iter":I
    const/4 v5, 0x3

    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 163
    .local v2, "len":I
    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    move-result-object v5

    const-string v6, "UTF-8"

    invoke-virtual {v4, v6}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v6

    invoke-static {v5, v6, v1, v2}, Lcom/worklight/utils/SecurityUtils$PBKDF2;->genKey([C[BII)Ljava/security/Key;

    move-result-object v5

    .line 164
    invoke-interface {v5}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    .line 165
    .local v0, "generatedKey":[B
    return-object v0
.end method

.method private static initCipher(I[B[B)Ljavax/crypto/Cipher;
    .locals 4
    .param p0, "mode"    # I
    .param p1, "key"    # [B
    .param p2, "iv"    # [B
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 171
    new-instance v1, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v1, p2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 172
    .local v1, "ivspec":Ljavax/crypto/spec/IvParameterSpec;
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    const-string v3, "AES"

    invoke-direct {v2, p1, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 175
    .local v2, "skeySpec":Ljavax/crypto/spec/SecretKeySpec;
    const-string v3, "AES/CBC/PKCS5Padding"

    invoke-static {v3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    .line 176
    .local v0, "cipher":Ljavax/crypto/Cipher;
    invoke-virtual {v0, p0, v2, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 178
    return-object v0
.end method


# virtual methods
.method public execute(Ljava/lang/String;Lorg/json/JSONArray;Ljava/lang/String;)Lorg/apache/cordova/api/PluginResult;
    .locals 13
    .param p1, "action"    # Ljava/lang/String;
    .param p2, "arguments"    # Lorg/json/JSONArray;
    .param p3, "callbackId"    # Ljava/lang/String;

    .prologue
    .line 55
    const/4 v6, 0x0

    .line 59
    .local v6, "result":Lorg/apache/cordova/api/PluginResult;
    :try_start_0
    const-string v9, "keygen"

    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 60
    new-instance v6, Lorg/apache/cordova/api/PluginResult;

    .end local v6    # "result":Lorg/apache/cordova/api/PluginResult;
    sget-object v9, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {p0, p2}, Lcom/worklight/androidgap/plugin/SecurityPlugin;->generateKey(Lorg/json/JSONArray;)[B

    move-result-object v10

    invoke-static {v10}, Lcom/worklight/common/WLUtils;->byteArrayToHexString([B)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v6, v9, v10}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .restart local v6    # "result":Lorg/apache/cordova/api/PluginResult;
    :cond_0
    :goto_0
    move-object v9, v6

    .line 98
    :goto_1
    return-object v9

    .line 62
    :cond_1
    const-string v9, "encrypt"

    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    .line 63
    new-instance v6, Lorg/apache/cordova/api/PluginResult;

    .end local v6    # "result":Lorg/apache/cordova/api/PluginResult;
    sget-object v9, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {p0, p2}, Lcom/worklight/androidgap/plugin/SecurityPlugin;->encrypt(Lorg/json/JSONArray;)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v6, v9, v10}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .restart local v6    # "result":Lorg/apache/cordova/api/PluginResult;
    goto :goto_0

    .line 65
    :cond_2
    const-string v9, "decrypt"

    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 66
    new-instance v1, Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/worklight/androidgap/plugin/SecurityPlugin;->decrypt(Lorg/json/JSONArray;)[B

    move-result-object v9

    invoke-direct {v1, v9}, Ljava/lang/String;-><init>([B)V

    .line 73
    .local v1, "decrypted":Ljava/lang/String;
    new-instance v6, Lorg/apache/cordova/api/PluginResult;

    .end local v6    # "result":Lorg/apache/cordova/api/PluginResult;
    sget-object v9, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v6, v9, v1}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .restart local v6    # "result":Lorg/apache/cordova/api/PluginResult;
    goto :goto_0

    .line 75
    .end local v1    # "decrypted":Ljava/lang/String;
    :cond_3
    const-string v9, "hashData"

    invoke-virtual {p1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    .line 77
    const/4 v9, 0x0

    invoke-virtual {p2, v9}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    const-string v10, ","

    invoke-virtual {v9, v10}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    .line 78
    .local v8, "sArray":[Ljava/lang/String;
    const/4 v9, 0x0

    aget-object v0, v8, v9

    .line 79
    .local v0, "chall":Ljava/lang/String;
    const/4 v9, 0x1

    invoke-virtual {p2, v9}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lorg/json/JSONArray;

    .line 81
    .local v4, "jsonArray":Lorg/json/JSONArray;
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .local v5, "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    const/4 v3, 0x0

    .local v3, "i":I
    :goto_2
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v9

    if-lt v3, v9, :cond_4

    .line 86
    iget-object v10, p0, Lcom/worklight/androidgap/plugin/SecurityPlugin;->myactivity:Landroid/app/Activity;

    const/4 v9, 0x0

    new-array v9, v9, [Ljava/lang/String;

    invoke-interface {v5, v9}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v9

    check-cast v9, [Ljava/lang/String;

    invoke-static {v10, v9}, Lcom/worklight/utils/SecurityUtils;->kpg(Landroid/content/Context;[Ljava/lang/String;)[B

    move-result-object v9

    const-string v10, "UTF-8"

    invoke-static {v9, v10}, Lcom/worklight/utils/Base64;->encode([BLjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "\n"

    const-string v11, ""

    invoke-virtual {v9, v10, v11}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 87
    .local v7, "s":Ljava/lang/String;
    new-instance v9, Lorg/apache/cordova/api/PluginResult;

    sget-object v10, Lorg/apache/cordova/api/PluginResult$Status;->OK:Lorg/apache/cordova/api/PluginResult$Status;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v12, "SHA-1"

    invoke-static {v11, v12}, Lcom/worklight/utils/SecurityUtils;->hashData(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v9, v10, v11}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto/16 :goto_1

    .line 90
    .end local v0    # "chall":Ljava/lang/String;
    .end local v3    # "i":I
    .end local v4    # "jsonArray":Lorg/json/JSONArray;
    .end local v5    # "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v6    # "result":Lorg/apache/cordova/api/PluginResult;
    .end local v7    # "s":Ljava/lang/String;
    .end local v8    # "sArray":[Ljava/lang/String;
    :catch_0
    move-exception v2

    .line 91
    .local v2, "e":Lorg/json/JSONException;
    invoke-virtual {v2}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v2}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    new-instance v6, Lorg/apache/cordova/api/PluginResult;

    sget-object v9, Lorg/apache/cordova/api/PluginResult$Status;->JSON_EXCEPTION:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-direct {v6, v9}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;)V

    .restart local v6    # "result":Lorg/apache/cordova/api/PluginResult;
    goto/16 :goto_0

    .line 83
    .end local v2    # "e":Lorg/json/JSONException;
    .restart local v0    # "chall":Ljava/lang/String;
    .restart local v3    # "i":I
    .restart local v4    # "jsonArray":Lorg/json/JSONArray;
    .restart local v5    # "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .restart local v8    # "sArray":[Ljava/lang/String;
    :cond_4
    :try_start_1
    invoke-virtual {v4, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v5, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 82
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 93
    .end local v0    # "chall":Ljava/lang/String;
    .end local v3    # "i":I
    .end local v4    # "jsonArray":Lorg/json/JSONArray;
    .end local v5    # "list":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
    .end local v6    # "result":Lorg/apache/cordova/api/PluginResult;
    .end local v8    # "sArray":[Ljava/lang/String;
    :catch_1
    move-exception v2

    .line 94
    .local v2, "e":Ljava/lang/Exception;
    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v2}, Lcom/worklight/common/WLUtils;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 95
    new-instance v6, Lorg/apache/cordova/api/PluginResult;

    sget-object v9, Lorg/apache/cordova/api/PluginResult$Status;->ERROR:Lorg/apache/cordova/api/PluginResult$Status;

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v6, v9, v10}, Lorg/apache/cordova/api/PluginResult;-><init>(Lorg/apache/cordova/api/PluginResult$Status;Ljava/lang/String;)V

    .restart local v6    # "result":Lorg/apache/cordova/api/PluginResult;
    goto/16 :goto_0
.end method

.method public setContext(Lorg/apache/cordova/api/CordovaInterface;)V
    .locals 0
    .param p1, "cordovaInterface"    # Lorg/apache/cordova/api/CordovaInterface;

    .prologue
    .line 190
    check-cast p1, Landroid/app/Activity;

    .end local p1    # "cordovaInterface":Lorg/apache/cordova/api/CordovaInterface;
    iput-object p1, p0, Lcom/worklight/androidgap/plugin/SecurityPlugin;->myactivity:Landroid/app/Activity;

    .line 191
    return-void
.end method
