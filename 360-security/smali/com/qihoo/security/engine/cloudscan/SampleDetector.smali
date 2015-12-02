.class public Lcom/qihoo/security/engine/cloudscan/SampleDetector;
.super Ljava/lang/Object;


# static fields
.field public static final E_DETECTION_CANCELLED:I = -0x3

.field public static final E_DETECTION_OK:I = 0x0

.field public static final E_DETECTION_UNINITTED:I = -0x2

.field public static final E_DETECTION_UNKNOWN:I = -0x1

.field public static final E_LOAD_JNI:I = -0x6e

.field public static final E_UPLOAD_TOKEN_REJECT:I = -0x13

.field public static final OPT_DETECTION_CLINET_ID:Ljava/lang/String; = "806"

.field public static final OPT_DETECTION_FILE_TYPE:Ljava/lang/String; = "804"

.field public static final OPT_DETECTION_SERVER:Ljava/lang/String; = "800"

.field public static final OPT_DETECTION_TIMEOUT:Ljava/lang/String; = "802"

.field public static final OPT_DETECTION_TMP_PATH:Ljava/lang/String; = "805"

.field public static final OPT_DETECTION_TOKEN_SERVER:Ljava/lang/String; = "801"

.field public static final OPT_DETECTION_TOKEN_TIMEOUT:Ljava/lang/String; = "803"

.field public static final OPT_LIMIT:Ljava/lang/String; = "701"

.field public static final OPT_SYSTEM:Ljava/lang/String; = "702"

.field public static final OPT_UPLOAD_APP_FLAGS:Ljava/lang/String; = "813"

.field public static final OPT_UPLOAD_APP_LABEL:Ljava/lang/String; = "811"

.field public static final OPT_UPLOAD_EVAL_MODE:Ljava/lang/String; = "807"

.field public static final OPT_UPLOAD_EVAL_THRESHOLD:Ljava/lang/String; = "808"

.field public static final OPT_UPLOAD_LOG_SERVER:Ljava/lang/String; = "814"

.field public static final OPT_UPLOAD_PKG_NAME:Ljava/lang/String; = "810"

.field public static final OPT_UPLOAD_SIGN_CORP:Ljava/lang/String; = "812"

.field public static final OPT_UPLOAD_VERSION_CODE:Ljava/lang/String; = "809"


# instance fields
.field private mDetectorHandle:I

.field private mHttpClient:Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->mHttpClient:Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;

    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->mDetectorHandle:I

    return-void
.end method

.method public static CloseMappingHandle(J)V
    .locals 2

    :try_start_0
    invoke-static {p0, p1}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->ntCloseMappingHandle(J)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static CreateCodeMapping(Ljava/lang/String;Ljava/lang/String;J)[J
    .locals 2

    :try_start_0
    invoke-static {p0, p1, p2, p3}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->ntCreateCodeMapping(Ljava/lang/String;Ljava/lang/String;J)[J
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static OpenDatabase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    :try_start_0
    invoke-static {p0, p1, p2}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->ntOpenDatabase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
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

.method private native ntCancel(I)I
.end method

.method private static native ntCloseMappingHandle(J)V
.end method

.method private native ntCreate(Ljava/lang/String;)I
.end method

.method private static native ntCreateCodeMapping(Ljava/lang/String;Ljava/lang/String;J)[J
.end method

.method private native ntDestroy(I)V
.end method

.method private native ntDoDetection(I)I
.end method

.method private static native ntOpenDatabase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
.end method

.method private native ntSetHttpClient(ILjava/lang/Object;)I
.end method

.method private native ntSetOption(ILjava/lang/String;Ljava/lang/String;)I
.end method


# virtual methods
.method public Cancel()I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->mDetectorHandle:I

    if-nez v0, :cond_0

    const/4 v0, -0x2

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->mHttpClient:Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->mHttpClient:Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;

    invoke-interface {v0}, Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;->Cancel()Z

    :cond_1
    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->mDetectorHandle:I

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->ntCancel(I)I

    move-result v0

    goto :goto_0
.end method

.method public Create(Ljava/lang/String;)I
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->ntCreate(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :catch_0
    move-exception v1

    iput v0, p0, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->mDetectorHandle:I

    const/16 v0, -0x6e

    goto :goto_0

    :cond_0
    iput v1, p0, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->mDetectorHandle:I

    goto :goto_0
.end method

.method public Destroy()V
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->mDetectorHandle:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->mDetectorHandle:I

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->ntDestroy(I)V

    :cond_0
    return-void
.end method

.method public DoDetection()I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->mDetectorHandle:I

    if-nez v0, :cond_0

    const/4 v0, -0x2

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->mDetectorHandle:I

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->ntDoDetection(I)I

    move-result v0

    goto :goto_0
.end method

.method public SetHttpClient(Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;)I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->mDetectorHandle:I

    if-nez v0, :cond_1

    const/4 v0, -0x2

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->mDetectorHandle:I

    invoke-direct {p0, v0, p1}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->ntSetHttpClient(ILjava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->mHttpClient:Lcom/qihoo/security/engine/cloudscan/ICloudHttpClient;

    goto :goto_0
.end method

.method public SetOption(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->mDetectorHandle:I

    if-nez v0, :cond_0

    const/4 v0, -0x2

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->mDetectorHandle:I

    invoke-direct {p0, v0, p1, p2}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->ntSetOption(ILjava/lang/String;Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method
