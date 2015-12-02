.class public Lcom/qihoo360/common/utils/PermissionUtil;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final a:[Ljava/lang/String;

.field private static final b:[Ljava/lang/String;

.field private static final c:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 23
    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/String;

    const-string/jumbo v1, "dc6dbd6e49682a57a8b82889043b93a8"

    aput-object v1, v0, v3

    .line 24
    const-string/jumbo v1, "2731710b7b726b51ab58e8ccbcfeb586"

    aput-object v1, v0, v4

    const-string/jumbo v1, "3bd87d5c8d98f7d711eff0d82d8fe7b9"

    aput-object v1, v0, v5

    const-string/jumbo v1, "1d4dcf3a79293e05fa9744444263d048"

    aput-object v1, v0, v6

    .line 25
    const-string/jumbo v1, "ca45263bc938da16ef1b069c95e61ba2"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string/jumbo v2, "85b6bfbb179f2467bd5e5e53577d8b15"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string/jumbo v2, "3093dc0f7ce2079d807d78a798231e9b"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    .line 26
    const-string/jumbo v2, "fec53268a38f029357056d46098c9384"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string/jumbo v2, "bb5cf8250d16d684a7b1e28b12780636"

    aput-object v2, v0, v1

    .line 23
    sput-object v0, Lcom/qihoo360/common/utils/PermissionUtil;->a:[Ljava/lang/String;

    .line 32
    const/16 v0, 0xd

    new-array v0, v0, [Ljava/lang/String;

    const-string/jumbo v1, "dc6dbd6e49682a57a8b82889043b93a8"

    aput-object v1, v0, v3

    .line 33
    const-string/jumbo v1, "2731710b7b726b51ab58e8ccbcfeb586"

    aput-object v1, v0, v4

    const-string/jumbo v1, "3bd87d5c8d98f7d711eff0d82d8fe7b9"

    aput-object v1, v0, v5

    const-string/jumbo v1, "1d4dcf3a79293e05fa9744444263d048"

    aput-object v1, v0, v6

    .line 34
    const-string/jumbo v1, "ca45263bc938da16ef1b069c95e61ba2"

    aput-object v1, v0, v7

    const/4 v1, 0x5

    const-string/jumbo v2, "85b6bfbb179f2467bd5e5e53577d8b15"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string/jumbo v2, "3093dc0f7ce2079d807d78a798231e9b"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    .line 35
    const-string/jumbo v2, "a281859a082fa0105c5324e37901db1e"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string/jumbo v2, "6a58ae93009f378a4d81d16b99084a1d"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string/jumbo v2, "5dc8201f7db1ba4b9c8fc44146c5bcc2"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    .line 36
    const-string/jumbo v2, "e89b158e4bcf988ebd09eb83f5378e87"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string/jumbo v2, "fec53268a38f029357056d46098c9384"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string/jumbo v2, "bb5cf8250d16d684a7b1e28b12780636"

    aput-object v2, v0, v1

    .line 32
    sput-object v0, Lcom/qihoo360/common/utils/PermissionUtil;->b:[Ljava/lang/String;

    .line 41
    new-array v0, v4, [Ljava/lang/String;

    const-string/jumbo v1, "com.qihoo360.messager"

    aput-object v1, v0, v3

    sput-object v0, Lcom/qihoo360/common/utils/PermissionUtil;->c:[Ljava/lang/String;

    .line 176
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a()Z
    .locals 4

    .prologue
    .line 179
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 180
    invoke-static {}, Lcom/qihoo360/common/utils/PermissionUtil;->b()J

    move-result-wide v2

    .line 181
    sub-long/2addr v0, v2

    const-wide/32 v2, 0x5265c00

    div-long/2addr v0, v2

    .line 182
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x3c

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z
    .locals 9

    .prologue
    const/4 v0, 0x0

    .line 228
    const/16 v1, 0x40

    :try_start_0
    invoke-virtual {p0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 229
    iget-object v3, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 230
    if-eqz v3, :cond_0

    array-length v1, v3

    if-lez v1, :cond_0

    .line 231
    array-length v4, v3

    move v2, v0

    :goto_0
    if-lt v2, v4, :cond_1

    .line 241
    :cond_0
    :goto_1
    return v0

    .line 231
    :cond_1
    aget-object v1, v3, v2

    .line 232
    invoke-virtual {v1}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo360/common/utils/Utils;->getMD5([B)Ljava/lang/String;

    move-result-object v5

    .line 233
    sget-object v6, Lcom/qihoo360/common/utils/PermissionUtil;->a:[Ljava/lang/String;

    array-length v7, v6

    move v1, v0

    :goto_2
    if-lt v1, v7, :cond_2

    .line 231
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_0

    .line 233
    :cond_2
    aget-object v8, v6, v1

    .line 234
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v8

    if-eqz v8, :cond_3

    .line 235
    const/4 v0, 0x1

    goto :goto_1

    .line 233
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 239
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method private static a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 254
    const/16 v1, 0x40

    :try_start_0
    invoke-virtual {p0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 255
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 256
    if-eqz v2, :cond_0

    array-length v1, v2

    if-lez v1, :cond_0

    .line 257
    array-length v3, v2

    move v1, v0

    :goto_0
    if-lt v1, v3, :cond_1

    .line 266
    :cond_0
    :goto_1
    return v0

    .line 257
    :cond_1
    aget-object v4, v2, v1

    .line 258
    invoke-virtual {v4}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v4

    invoke-static {v4}, Lcom/qihoo360/common/utils/Utils;->getMD5([B)Ljava/lang/String;

    move-result-object v4

    .line 259
    invoke-static {v4, p2}, Lcom/qihoo360/common/utils/PermissionUtil;->ensureCallerByKey(Ljava/lang/String;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v4

    if-eqz v4, :cond_2

    .line 260
    const/4 v0, 0x1

    goto :goto_1

    .line 257
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 264
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method private static a(Ljava/lang/String;)[Landroid/content/pm/Signature;
    .locals 6

    .prologue
    const/4 v0, 0x0

    const/4 v5, 0x0

    .line 320
    .line 321
    const/16 v1, 0x40

    .line 323
    new-instance v2, Landroid/content/pm/PackageParser;

    invoke-direct {v2, p0}, Landroid/content/pm/PackageParser;-><init>(Ljava/lang/String;)V

    .line 324
    new-instance v3, Landroid/util/DisplayMetrics;

    invoke-direct {v3}, Landroid/util/DisplayMetrics;-><init>()V

    .line 325
    invoke-virtual {v3}, Landroid/util/DisplayMetrics;->setToDefaults()V

    .line 327
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 328
    invoke-virtual {v2, v4, p0, v3, v5}, Landroid/content/pm/PackageParser;->parsePackage(Ljava/io/File;Ljava/lang/String;Landroid/util/DisplayMetrics;I)Landroid/content/pm/PackageParser$Package;

    move-result-object v3

    .line 329
    if-nez v3, :cond_1

    .line 346
    :cond_0
    :goto_0
    return-object v0

    .line 333
    :cond_1
    invoke-virtual {v2, v3, v1}, Landroid/content/pm/PackageParser;->collectCertificates(Landroid/content/pm/PackageParser$Package;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 337
    iget-object v1, v3, Landroid/content/pm/PackageParser$Package;->mSignatures:[Landroid/content/pm/Signature;

    array-length v1, v1

    .line 339
    if-lez v1, :cond_0

    .line 341
    new-array v0, v1, [Landroid/content/pm/Signature;

    .line 342
    iget-object v2, v3, Landroid/content/pm/PackageParser$Package;->mSignatures:[Landroid/content/pm/Signature;

    invoke-static {v2, v5, v0, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method

.method private static b()J
    .locals 3

    .prologue
    .line 187
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string/jumbo v0, "yyyyMMdd\'B\'"

    invoke-direct {v1, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 188
    const/4 v0, 0x0

    .line 190
    :try_start_0
    const-string/jumbo v2, "20121217B"

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 194
    :goto_0
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    return-wide v0

    .line 191
    :catch_0
    move-exception v1

    .line 192
    invoke-virtual {v1}, Ljava/text/ParseException;->printStackTrace()V

    goto :goto_0
.end method

.method private static b(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z
    .locals 9

    .prologue
    const/4 v0, 0x0

    .line 282
    const/16 v1, 0x40

    :try_start_0
    invoke-virtual {p0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 283
    iget-object v3, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    .line 284
    if-eqz v3, :cond_0

    array-length v1, v3

    if-lez v1, :cond_0

    .line 285
    array-length v4, v3

    move v2, v0

    :goto_0
    if-lt v2, v4, :cond_1

    .line 295
    :cond_0
    :goto_1
    return v0

    .line 285
    :cond_1
    aget-object v1, v3, v2

    .line 286
    invoke-virtual {v1}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo360/common/utils/Utils;->getMD5([B)Ljava/lang/String;

    move-result-object v5

    .line 287
    sget-object v6, Lcom/qihoo360/common/utils/PermissionUtil;->b:[Ljava/lang/String;

    array-length v7, v6

    move v1, v0

    :goto_2
    if-lt v1, v7, :cond_2

    .line 285
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_0

    .line 287
    :cond_2
    aget-object v8, v6, v1

    .line 288
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v8

    if-eqz v8, :cond_3

    .line 289
    const/4 v0, 0x1

    goto :goto_1

    .line 287
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 293
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method public static checkTargetUidPermissionBySignature(ILjava/lang/String;Landroid/content/pm/PackageManager;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/SecurityException;
        }
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 121
    invoke-virtual {p2, p0}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v2

    .line 122
    if-eqz v2, :cond_0

    array-length v1, v2

    if-lez v1, :cond_0

    .line 123
    array-length v3, v2

    move v1, v0

    :goto_0
    if-lt v1, v3, :cond_1

    .line 129
    :cond_0
    :goto_1
    return v0

    .line 123
    :cond_1
    aget-object v4, v2, v1

    .line 124
    invoke-static {p2, v4}, Lcom/qihoo360/common/utils/PermissionUtil;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 125
    const/4 v0, 0x1

    goto :goto_1

    .line 123
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public static ensureCallerByKey(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 142
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 143
    sget-object v0, Lcom/qihoo360/mobilesafe/support/NativeManager;->b:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/qihoo360/common/utils/Utils;->DES_encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 144
    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->getMD5(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 145
    const/4 v0, 0x1

    .line 148
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static ensureCallerPermissionByPackageName(Ljava/lang/String;Landroid/content/pm/PackageManager;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/SecurityException;
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 205
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    .line 206
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v2

    if-ne v0, v2, :cond_1

    .line 213
    :cond_0
    return-void

    .line 208
    :cond_1
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v3

    .line 209
    if-eqz v3, :cond_2

    array-length v0, v3

    if-lez v0, :cond_2

    .line 210
    array-length v4, v3

    move v2, v1

    :goto_0
    if-lt v2, v4, :cond_3

    .line 218
    :cond_2
    new-instance v0, Ljava/lang/SecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Permission denied: invoke this method of the "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 210
    :cond_3
    aget-object v5, v3, v2

    .line 211
    sget-object v6, Lcom/qihoo360/common/utils/PermissionUtil;->c:[Ljava/lang/String;

    array-length v7, v6

    move v0, v1

    :goto_1
    if-lt v0, v7, :cond_4

    .line 210
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 211
    :cond_4
    aget-object v8, v6, v0

    .line 212
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 211
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method public static ensureCallerPermissionBySignature(Ljava/lang/String;Landroid/content/pm/PackageManager;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/SecurityException;
        }
    .end annotation

    .prologue
    .line 64
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    .line 65
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 71
    :cond_0
    return-void

    .line 67
    :cond_1
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v1

    .line 68
    if-eqz v1, :cond_2

    array-length v0, v1

    if-lez v0, :cond_2

    .line 69
    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v2, :cond_3

    .line 75
    :cond_2
    new-instance v0, Ljava/lang/SecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Permission denied: invoke this method of the "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 69
    :cond_3
    aget-object v3, v1, v0

    .line 70
    invoke-static {p1, v3}, Lcom/qihoo360/common/utils/PermissionUtil;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 69
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static ensureCallerPermissionBySignature(Ljava/lang/String;Landroid/content/pm/PackageManager;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/SecurityException;
        }
    .end annotation

    .prologue
    .line 161
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    .line 162
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 168
    :cond_0
    return-void

    .line 164
    :cond_1
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v1

    .line 165
    if-eqz v1, :cond_2

    array-length v0, v1

    if-lez v0, :cond_2

    .line 166
    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v2, :cond_3

    .line 172
    :cond_2
    new-instance v0, Ljava/lang/SecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Permission denied: invoke this method of the "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 166
    :cond_3
    aget-object v3, v1, v0

    .line 167
    invoke-static {p1, v3, p2}, Lcom/qihoo360/common/utils/PermissionUtil;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 166
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static ensureCallerPermissionBySignatureForZTE(Ljava/lang/String;Landroid/content/pm/PackageManager;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/SecurityException;
        }
    .end annotation

    .prologue
    .line 86
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    .line 87
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 109
    :cond_0
    return-void

    .line 94
    :cond_1
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v1

    .line 95
    if-eqz v1, :cond_2

    array-length v0, v1

    if-lez v0, :cond_2

    .line 96
    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v2, :cond_3

    .line 102
    :cond_2
    new-instance v0, Ljava/lang/SecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Permission denied: invoke this method of the "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 96
    :cond_3
    aget-object v3, v1, v0

    .line 97
    invoke-static {p1, v3}, Lcom/qihoo360/common/utils/PermissionUtil;->b(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 96
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static ensureCallerPermissionByUid(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/SecurityException;
        }
    .end annotation

    .prologue
    .line 50
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    .line 51
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 52
    return-void

    .line 53
    :cond_0
    new-instance v0, Ljava/lang/SecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Permission denied: invoke this method of the "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static isArchievePkgMySignature(Ljava/lang/String;)Z
    .locals 9
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    const/4 v0, 0x0

    .line 303
    :try_start_0
    invoke-static {p0}, Lcom/qihoo360/common/utils/PermissionUtil;->a(Ljava/lang/String;)[Landroid/content/pm/Signature;

    move-result-object v3

    .line 304
    if-eqz v3, :cond_0

    array-length v1, v3

    if-lez v1, :cond_0

    .line 305
    array-length v4, v3

    move v2, v0

    :goto_0
    if-lt v2, v4, :cond_1

    .line 315
    :cond_0
    :goto_1
    return v0

    .line 305
    :cond_1
    aget-object v1, v3, v2

    .line 306
    invoke-virtual {v1}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo360/common/utils/Utils;->getMD5([B)Ljava/lang/String;

    move-result-object v5

    .line 307
    sget-object v6, Lcom/qihoo360/common/utils/PermissionUtil;->a:[Ljava/lang/String;

    array-length v7, v6

    move v1, v0

    :goto_2
    if-lt v1, v7, :cond_2

    .line 305
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_0

    .line 307
    :cond_2
    aget-object v8, v6, v1

    .line 308
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v8

    if-eqz v8, :cond_3

    .line 309
    const/4 v0, 0x1

    goto :goto_1

    .line 307
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 313
    :catch_0
    move-exception v1

    goto :goto_1
.end method

.method public static isPkgMySignature(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 270
    invoke-static {p0, p1}, Lcom/qihoo360/common/utils/PermissionUtil;->a(Landroid/content/pm/PackageManager;Ljava/lang/String;)Z

    move-result v0

    .line 271
    return v0
.end method
