.class public Lcom/qihoo/security/engine/cloudscan/NetQuery;
.super Ljava/lang/Object;


# static fields
.field public static final APKQF_AD:J = 0x2L

.field public static final APKQF_CA:J = 0x80L

.field public static final APKQF_CLEAN:J = 0x10L

.field public static final APKQF_EC:J = 0x100L

.field public static final APKQF_HIPS:J = 0x1L

.field public static final APKQF_PAY:J = 0x40L

.field public static final APKQF_POWER:J = 0x8L

.field public static final APKQF_PREINSTALL:J = 0x20L

.field public static final APKQF_ROOT:J = 0x4L

.field public static final CLOUD_HDR_CHANNEL_ID:Ljava/lang/String; = "3"

.field public static final CLOUD_HDR_CLIENT_VER:Ljava/lang/String; = "4"

.field public static final CLOUD_HDR_CONNECT_TYPE:Ljava/lang/String; = "9"

.field public static final CLOUD_HDR_EXT:Ljava/lang/String; = "12"

.field public static final CLOUD_HDR_IMEI:Ljava/lang/String; = "1"

.field public static final CLOUD_HDR_LANG:Ljava/lang/String; = "10"

.field public static final CLOUD_HDR_MANUFACTURER:Ljava/lang/String; = "5"

.field public static final CLOUD_HDR_MODEL:Ljava/lang/String; = "6"

.field public static final CLOUD_HDR_OS_VER:Ljava/lang/String; = "8"

.field public static final CLOUD_HDR_PRODUCT_ID:Ljava/lang/String; = "11"

.field public static final CLOUD_HDR_RULE_GROUP_ID:Ljava/lang/String; = "13"

.field public static final CLOUD_HDR_SDK_VER:Ljava/lang/String; = "7"

.field public static final CLOUD_HDR_UIVERSION:Ljava/lang/String; = "2"

.field public static final COMMON_OPTIONS:[Ljava/lang/String;

.field public static ERR_LOAD_JNI_FAIL:I = 0x0

.field private static final FEATURE_TYPE_MFSHA1:I = 0x1

.field public static final OPT_CACHE_DB:Ljava/lang/String; = "202"

.field public static final OPT_CHECK_MASTER_KEY:Ljava/lang/String; = "205"

.field public static final OPT_CLEAN_URL:Ljava/lang/String; = "300"

.field public static final OPT_CLOUDENG_TIMEOUT_MS:Ljava/lang/String; = "5000"

.field public static final OPT_CLOUD_SERVER:Ljava/lang/String; = "201"

.field public static final OPT_EVAL_MD5:Ljava/lang/String; = "209"

.field public static final OPT_MASTKEY_ZIP_ITEMS:Ljava/lang/String; = "206"

.field public static final OPT_MASTKEY_ZIP_SIZE:Ljava/lang/String; = "207"

.field public static final OPT_REQUEST_FLAGS:Ljava/lang/String; = "210"

.field public static final OPT_SECONDARY_URL:Ljava/lang/String; = "208"

.field public static final OPT_USER_INFO:Ljava/lang/String; = "204"

.field public static final OPT_V5_SERVER:Ljava/lang/String; = "200"

.field public static final REGISTER_ACITVED:I = 0x1

.field public static final REGISTER_CONFIG_ERROR:I = -0x1

.field public static final REGISTER_EXPIRED:I = 0x2

.field public static final REGISTER_NOT_ACITVED:I = 0x0

.field public static final REGISTER_UNKNOWN_ERROR:I = -0x2

.field private static final TAG:Ljava/lang/String; = "NetQuery"

.field public static final V5UPDATE_BAD_ERRCODE:I = -0x9

.field public static final V5UPDATE_BAD_INI_FORMAT:I = -0x5

.field public static final V5UPDATE_BAD_INI_LEN:I = -0x6

.field public static final V5UPDATE_BAD_NEW_V5HDR:I = -0x4

.field public static final V5UPDATE_BAD_PARAMS:I = -0x2

.field public static final V5UPDATE_BAD_UV_VER:I = -0x7

.field public static final V5UPDATE_EMPTY_INI:I = -0x8

.field public static final V5UPDATE_JNI_ERROR:I = -0xa

.field public static final V5UPDATE_NET_ERROR:I = -0x3

.field public static final V5UPDATE_OK:I = 0x0

.field public static final V5UPDATE_UNKNOWN_ERROR:I = -0x1


# instance fields
.field final mContext:Landroid/content/Context;

.field private mHttpClient:Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;

.field private m_queryHandle:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x11

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string/jumbo v2, "1"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string/jumbo v2, "2"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string/jumbo v2, "3"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string/jumbo v2, "4"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string/jumbo v2, "5"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string/jumbo v2, "6"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string/jumbo v2, "7"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string/jumbo v2, "8"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string/jumbo v2, "10"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string/jumbo v2, "11"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string/jumbo v2, "201"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string/jumbo v2, "208"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string/jumbo v2, "13"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string/jumbo v2, "5000"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string/jumbo v2, "200"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string/jumbo v2, "300"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string/jumbo v2, "12"

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->COMMON_OPTIONS:[Ljava/lang/String;

    const/16 v0, -0x6e

    sput v0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->ERR_LOAD_JNI_FAIL:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->mHttpClient:Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;

    iput-object p1, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->mContext:Landroid/content/Context;

    :try_start_0
    invoke-direct {p0}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->nt1()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->m_queryHandle:I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->m_queryHandle:I

    goto :goto_0
.end method

.method public static GetFgprint(Ljava/lang/String;[B)I
    .locals 1

    :try_start_0
    invoke-static {p0, p1}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->nt10(Ljava/lang/String;[B)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    sget v0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->ERR_LOAD_JNI_FAIL:I

    goto :goto_0
.end method

.method public static GetMfsha1(Ljava/lang/String;)[B
    .locals 4

    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p0, v2, v0}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->nt12(Ljava/lang/String;I[Ljava/lang/Object;)I

    move-result v2

    if-eqz v2, :cond_1

    move-object v0, v1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    const/4 v2, 0x0

    aget-object v0, v0, v2

    check-cast v0, [B

    if-eqz v0, :cond_2

    array-length v2, v0

    const/16 v3, 0x14

    if-eq v2, v3, :cond_0

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method private native nt1()I
.end method

.method private static native nt10(Ljava/lang/String;[B)I
.end method

.method private static native nt12(Ljava/lang/String;I[Ljava/lang/Object;)I
.end method

.method private native nt2(I)I
.end method

.method private native nt3(ILjava/lang/String;Ljava/lang/Object;)I
.end method

.method private native nt4(I[[BI)I
.end method

.method private native nt5(I)I
.end method

.method private native nt6(ILjava/lang/String;I[Ljava/lang/String;)I
.end method

.method private native nt7(ILjava/lang/String;I)I
.end method

.method private native nt8()I
.end method

.method private native nt9(ILjava/lang/String;I)I
.end method


# virtual methods
.method public Cancel()I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->m_queryHandle:I

    if-nez v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->mHttpClient:Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->mHttpClient:Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;

    invoke-interface {v0}, Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;->Cancel()Z

    :cond_1
    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->m_queryHandle:I

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->nt5(I)I

    move-result v0

    goto :goto_0
.end method

.method public Destroy()Z
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->m_queryHandle:I

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->m_queryHandle:I

    invoke-direct {p0, v1}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->nt2(I)I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public GetCloudConfig(Ljava/lang/String;I)I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->m_queryHandle:I

    if-nez v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->m_queryHandle:I

    invoke-direct {p0, v0, p1, p2}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->nt9(ILjava/lang/String;I)I

    move-result v0

    goto :goto_0
.end method

.method public IsRegister()I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->m_queryHandle:I

    if-nez v0, :cond_0

    const/4 v0, -0x2

    :goto_0
    return v0

    :cond_0
    invoke-direct {p0}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->nt8()I

    move-result v0

    goto :goto_0
.end method

.method public Query([Lcom/qihoo/security/engine/cloudscan/QueryItem;I)I
    .locals 3

    const/4 v1, -0x1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->m_queryHandle:I

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return v1

    :cond_1
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/qihoo/security/engine/cloudscan/b;->a([Lcom/qihoo/security/engine/cloudscan/QueryItem;Z)[[B

    move-result-object v2

    if-eqz v2, :cond_0

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->m_queryHandle:I

    invoke-direct {p0, v0, v2, p2}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->nt4(I[[BI)I

    move-result v0

    if-eq v0, v1, :cond_0

    invoke-static {p1, v2}, Lcom/qihoo/security/engine/cloudscan/b;->a([Lcom/qihoo/security/engine/cloudscan/QueryItem;[[B)Z

    move-result v2

    if-eqz v2, :cond_2

    :goto_1
    move v1, v0

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_1
.end method

.method public Register(Ljava/lang/String;I)I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->m_queryHandle:I

    if-nez v0, :cond_0

    const/4 v0, -0x2

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->m_queryHandle:I

    invoke-direct {p0, v0, p1, p2}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->nt7(ILjava/lang/String;I)I

    move-result v0

    goto :goto_0
.end method

.method public RequestCallback(Ljava/lang/String;Ljava/lang/String;[BI[I)[B
    .locals 6

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->mHttpClient:Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;

    if-nez v0, :cond_0

    new-instance v0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->mHttpClient:Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->mHttpClient:Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;->RequestCallback(Ljava/lang/String;Ljava/lang/String;[BI[I)[B

    move-result-object v0

    return-object v0
.end method

.method public SetOption(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->m_queryHandle:I

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->m_queryHandle:I

    invoke-direct {p0, v1, p1, p2}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->nt3(ILjava/lang/String;Ljava/lang/Object;)I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public SetRequestCallback(Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;)V
    .locals 0

    iput-object p1, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->mHttpClient:Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;

    return-void
.end method

.method public V5Update(Ljava/lang/String;I[Ljava/lang/String;)I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->m_queryHandle:I

    if-nez v0, :cond_0

    const/4 v0, -0x2

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/NetQuery;->m_queryHandle:I

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->nt6(ILjava/lang/String;I[Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method
