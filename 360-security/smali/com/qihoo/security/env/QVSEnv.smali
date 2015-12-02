.class public Lcom/qihoo/security/env/QVSEnv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/env/QVSEnv$a;
    }
.end annotation


# static fields
.field public static final ENG_VERSION:I = 0x13351f2

.field public static final LAST_UPDATE_FILE:Ljava/lang/String; = "qvsupdate"

.field public static LAST_UPDATE_TIME_STAMP:Ljava/lang/String; = null

.field public static final LIB_CLOUDSCAN:Ljava/lang/String; = "cloudscan-jni-1.0.5.2002"

.field public static final LIB_CLOUDSCAN_PREFIX:Ljava/lang/String; = "cloudscan"

.field public static final LIB_DEJAVU:Ljava/lang/String; = "dejavu-2.1.0"

.field public static final LIB_DEJAVU_PREFIX:Ljava/lang/String; = "dejavu"

.field public static final LIB_WRAPPER_PREFIX:Ljava/lang/String; = "qvmwrapper"

.field public static final NETERR_TRY_COUNT:I = 0x3

.field public static final QVM_WRAPPER:Ljava/lang/String; = "qvmwrapper-1.0.2"

.field public static final bAutoReconnect:Z = true

.field public static final bCrashLog:Z = false

.field public static final bCrashProtect:Z = false

.field public static final bDebug:Z = false

.field public static final bEvalLog:Z = false

.field public static bEvalMode:Z = false

.field public static final bPUA:Z = true

.field public static final bReportAdware:Z = true


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    const-string/jumbo v0, ""

    sput-object v0, Lcom/qihoo/security/env/QVSEnv;->LAST_UPDATE_TIME_STAMP:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
