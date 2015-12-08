.class public Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field public static final DATA_APPLICATION_SID:Ljava/lang/String; = "com.cleanmaster.sdk.cmloginsdk.data.APPLICATION_SID"

.field public static final EXTRA_APPLICATION_PID:Ljava/lang/String; = "com.cleanmaster.sdk.cmloginsdk.extra.APPLICATION_PID"

.field public static final EXTRA_APPLICATION_SID:Ljava/lang/String; = "com.cleanmaster.sdk.cmloginsdk.extra.APPLICATION_SID"

.field public static final EXTRA_APPLICATION_SSOTOKEN:Ljava/lang/String; = "com.cleanmaster.sdk.cmloginsdk.extra.APPLICATION_SSOTOKEN"

.field public static final MESSAGE_GET_SID_ACCESS_TOKEN_REPLY:I = 0x10001

.field public static final MESSAGE_GET_SID_ACCESS_TOKEN_REQUEST:I = 0x10000

.field public static final MESSAGE_SET_CM_SID:I = 0x1

.field private static cm_sid:Ljava/lang/String;

.field private static isRunning:Z


# instance fields
.field final mMessenger:Landroid/os/Messenger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x0

    sput-boolean v0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->isRunning:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 36
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 58
    new-instance v0, Landroid/os/Messenger;

    new-instance v1, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/a;

    invoke-direct {v1, p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/a;-><init>(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;)V

    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->mMessenger:Landroid/os/Messenger;

    .line 155
    return-void
.end method

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->cm_sid:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$002(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 36
    sput-object p0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->cm_sid:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$100(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->findName(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic access$200(Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0, p1}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->findHash(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private findHash(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 86
    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 87
    const/4 v0, 0x0

    .line 89
    const/16 v2, 0x40

    :try_start_0
    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 90
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    invoke-virtual {p0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->getPkgSignatureMD5([Landroid/content/pm/Signature;)[Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 94
    :goto_0
    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private findName(I)Ljava/lang/String;
    .locals 4

    .prologue
    .line 66
    invoke-virtual {p0}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 67
    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 68
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v0

    .line 70
    const/4 v1, 0x0

    .line 71
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 72
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 73
    iget v3, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    if-ne v3, p1, :cond_0

    .line 74
    iget-object v3, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->pkgList:[Ljava/lang/String;

    array-length v3, v3

    if-lez v3, :cond_0

    .line 75
    iget-object v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->pkgList:[Ljava/lang/String;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    .line 82
    :goto_0
    return-object v0

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method

.method public static isRunning()Z
    .locals 1

    .prologue
    .line 226
    sget-boolean v0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->isRunning:Z

    return v0
.end method

.method private toHexString([BLjava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    .line 98
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    array-length v2, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    aget-byte v3, p1, v0

    .line 100
    and-int/lit16 v3, v3, 0xff

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    .line 101
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    .line 102
    const/16 v4, 0x30

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 104
    :cond_0
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 106
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getMD5String([B)Ljava/lang/String;
    .locals 2

    .prologue
    .line 111
    :try_start_0
    const-string v0, "MD5"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    .line 112
    invoke-virtual {v0}, Ljava/security/MessageDigest;->reset()V

    .line 113
    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 114
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    const-string v1, ""

    invoke-direct {p0, v0, v1}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->toHexString([BLjava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 117
    :goto_0
    return-object v0

    .line 116
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    .line 117
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public getPkgSignatureMD5([Landroid/content/pm/Signature;)[Ljava/lang/String;
    .locals 4

    .prologue
    const/4 v3, 0x2

    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 122
    array-length v1, p1

    if-nez v1, :cond_1

    .line 152
    :cond_0
    :goto_0
    return-object v0

    .line 125
    :cond_1
    aget-object v1, p1, v2

    if-eqz v1, :cond_0

    .line 128
    aget-object v1, p1, v2

    invoke-virtual {v1}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v1

    .line 129
    array-length v2, v1

    if-lez v2, :cond_0

    .line 132
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 136
    new-array v1, v3, [Ljava/lang/String;

    .line 138
    :try_start_0
    const-string v2, "X509"

    invoke-static {v2}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v2

    .line 140
    invoke-virtual {v2, v0}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 141
    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getEncoded()[B

    move-result-object v2

    .line 143
    const/4 v3, 0x2

    invoke-static {v2, v3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v2

    .line 144
    const/4 v3, 0x0

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->getMD5String([B)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v3

    .line 145
    const/4 v2, 0x1

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getIssuerDN()Ljava/security/Principal;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/Principal;->toString()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    move-object v0, v1

    .line 152
    goto :goto_0

    .line 149
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->mMessenger:Landroid/os/Messenger;

    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method public onCreate()V
    .locals 2

    .prologue
    .line 213
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 214
    const-string v0, "SSOService"

    const-string v1, "Service Started."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 215
    const/4 v0, 0x1

    sput-boolean v0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->isRunning:Z

    .line 216
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 232
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 233
    const-string v0, "SSOService"

    const-string v1, "Service Stopped."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 234
    const/4 v0, 0x0

    sput-boolean v0, Lcom/cleanmaster/sdk/cmloginsdkjar/sdk/ssologin/SsoService;->isRunning:Z

    .line 235
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 3

    .prologue
    .line 220
    const-string v0, "SSOService"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Received start id "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 221
    const/4 v0, 0x1

    return v0
.end method
