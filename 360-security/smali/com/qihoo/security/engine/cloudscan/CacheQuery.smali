.class public Lcom/qihoo/security/engine/cloudscan/CacheQuery;
.super Ljava/lang/Object;


# static fields
.field public static CQERR_DB_NOT_OPEN:I = 0x0

.field public static CQERR_ERRNO:I = 0x0

.field public static CQERR_INVALID_ARGS:I = 0x0

.field public static CQERR_OK:I = 0x0

.field public static CQERR_OPEN_PRIVACY_FILE:I = 0x0

.field public static CQERR_PRVDATA_IMPORT_BASE:I = 0x0

.field public static CQERR_PRVDATA_IMPORT_INC:I = 0x0

.field public static CQERR_PRVDATA_UPTODATE:I = 0x0

.field public static CQERR_PRVDATA_VER_LOG:I = 0x0

.field public static CQERR_QUERY_FAIL:I = 0x0

.field public static final ERR_LOAD_JNI_FAIL:I = -0x6e

.field public static final G_OPTION_ANDROID_ID:Ljava/lang/String; = "3"

.field public static final G_OPTION_ANDROID_SERIAL:Ljava/lang/String; = "2"

.field public static final G_OPTION_CPUID:Ljava/lang/String; = "1"

.field public static final G_OPTION_IMEI:Ljava/lang/String; = "0"

.field public static final G_OPTION_IMSI:Ljava/lang/String; = "5"

.field public static final G_OPTION_MAC:Ljava/lang/String; = "4"

.field public static final OPTION_CLOUD_CONF_EXPIRED:Ljava/lang/String; = "2"

.field public static final OPTION_CLOUD_PLAN:Ljava/lang/String; = "1"

.field public static final OPTION_CLOUD_SCAN:Ljava/lang/String; = "0"

.field public static final OPTION_PRIVACY_DATA_VER:Ljava/lang/String; = "3"

.field private static final TAG:Ljava/lang/String; = "CacheQuery"


# instance fields
.field private final mContext:Landroid/content/Context;

.field private mHttpClient:Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;

.field private m_queryHandle:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput v0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->CQERR_OK:I

    const/4 v0, -0x1

    sput v0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->CQERR_DB_NOT_OPEN:I

    const/4 v0, -0x2

    sput v0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->CQERR_ERRNO:I

    const/4 v0, -0x3

    sput v0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->CQERR_OPEN_PRIVACY_FILE:I

    const/4 v0, -0x4

    sput v0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->CQERR_PRVDATA_UPTODATE:I

    const/4 v0, -0x5

    sput v0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->CQERR_PRVDATA_VER_LOG:I

    const/4 v0, -0x6

    sput v0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->CQERR_PRVDATA_IMPORT_BASE:I

    const/4 v0, -0x7

    sput v0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->CQERR_PRVDATA_IMPORT_INC:I

    const/4 v0, -0x8

    sput v0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->CQERR_INVALID_ARGS:I

    const/16 v0, -0x9

    sput v0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->CQERR_QUERY_FAIL:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->mHttpClient:Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;

    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->m_queryHandle:I

    iput-object p1, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->mContext:Landroid/content/Context;

    return-void
.end method

.method public static SetGlobalOption(Ljava/lang/String;Ljava/lang/Object;)I
    .locals 1

    :try_start_0
    invoke-static {p0, p1}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->nt9(Ljava/lang/String;Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    const/16 v0, -0x6e

    goto :goto_0
.end method

.method private native nt1(Ljava/lang/String;J)I
.end method

.method private native nt2(I)I
.end method

.method private native nt3(ILjava/lang/String;Ljava/lang/Object;)I
.end method

.method private native nt4(I[[B)I
.end method

.method private native nt5(ILjava/lang/String;)Ljava/lang/String;
.end method

.method private native nt6(ILjava/lang/String;)I
.end method

.method private native nt7(ILjava/lang/String;I)I
.end method

.method private native nt8(I[Ljava/lang/String;[J[J)I
.end method

.method private static native nt9(Ljava/lang/String;Ljava/lang/Object;)I
.end method


# virtual methods
.method public Create(Ljava/lang/String;J)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget v2, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->m_queryHandle:I

    if-eqz v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    :try_start_0
    invoke-direct {p0, p1, p2, p3}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->nt1(Ljava/lang/String;J)I

    move-result v2

    iput v2, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->m_queryHandle:I

    iget v2, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->m_queryHandle:I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0

    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_0
.end method

.method public Destroy()Z
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->m_queryHandle:I

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->m_queryHandle:I

    invoke-direct {p0, v1}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->nt2(I)I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public GetOption(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->m_queryHandle:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->m_queryHandle:I

    invoke-direct {p0, v0, p1}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->nt5(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public ImportPrivacyData(Ljava/lang/String;I)I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->m_queryHandle:I

    if-nez v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->m_queryHandle:I

    invoke-direct {p0, v0, p1, p2}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->nt7(ILjava/lang/String;I)I

    move-result v0

    goto :goto_0
.end method

.method public Query([Lcom/qihoo/security/engine/cloudscan/QueryItem;)I
    .locals 3

    const/4 v1, -0x1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->m_queryHandle:I

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return v1

    :cond_1
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/qihoo/security/engine/cloudscan/b;->a([Lcom/qihoo/security/engine/cloudscan/QueryItem;Z)[[B

    move-result-object v2

    if-eqz v2, :cond_0

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->m_queryHandle:I

    invoke-direct {p0, v0, v2}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->nt4(I[[B)I

    move-result v0

    if-lez v0, :cond_0

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

.method public QueryPrivacy([Ljava/lang/String;[J[J)I
    .locals 2

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->m_queryHandle:I

    if-nez v0, :cond_0

    sget v0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->CQERR_INVALID_ARGS:I

    :goto_0
    return v0

    :cond_0
    array-length v0, p1

    array-length v1, p2

    if-ne v0, v1, :cond_1

    array-length v0, p1

    array-length v1, p3

    if-eq v0, v1, :cond_2

    :cond_1
    sget v0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->CQERR_INVALID_ARGS:I

    goto :goto_0

    :cond_2
    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->m_queryHandle:I

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->nt8(I[Ljava/lang/String;[J[J)I

    move-result v0

    goto :goto_0
.end method

.method public RequestCallback(Ljava/lang/String;Ljava/lang/String;[BI[I)[B
    .locals 6

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->mHttpClient:Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;

    if-nez v0, :cond_0

    new-instance v0, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;

    iget-object v1, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo/security/engine/cloudscan/CloudHttpClient;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->mHttpClient:Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->mHttpClient:Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;->RequestCallback(Ljava/lang/String;Ljava/lang/String;[BI[I)[B

    move-result-object v0

    return-object v0
.end method

.method public Revoke(Ljava/lang/String;)I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->m_queryHandle:I

    if-nez v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->m_queryHandle:I

    invoke-direct {p0, v0, p1}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->nt6(ILjava/lang/String;)I

    move-result v0

    goto :goto_0
.end method

.method public SetOption(Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->m_queryHandle:I

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget v1, p0, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->m_queryHandle:I

    invoke-direct {p0, v1, p1, p2}, Lcom/qihoo/security/engine/cloudscan/CacheQuery;->nt3(ILjava/lang/String;Ljava/lang/Object;)I

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method
