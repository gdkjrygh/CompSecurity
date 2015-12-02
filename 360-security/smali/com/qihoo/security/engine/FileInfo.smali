.class public Lcom/qihoo/security/engine/FileInfo;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final CAN_DELETE:I = 0x0

.field public static final CAT_ADWARE:Ljava/lang/String; = "Adware"

.field public static final CAT_EXPLOIT:Ljava/lang/String; = "Exploit"

.field public static final CAT_INFOSTEALER:Ljava/lang/String; = "Infostealer"

.field public static final CAT_PUA:Ljava/lang/String; = "PUA"

.field public static final CAT_TROJAN:Ljava/lang/String; = "Trojan"

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/qihoo/security/engine/FileInfo;",
            ">;"
        }
    .end annotation
.end field

.field public static final FROM_3TUPLE:I = 0x2

.field public static final FROM_CLOUD:I = 0x64

.field public static final FROM_MFSHA1:I = 0x0

.field public static final FROM_NOT_INIT:I = -0x1

.field public static final FROM_SHA1:I = 0x1

.field public static final QF_CACHE_ALL_LEVEL:J = 0x1L

.field public static final QF_MFSHA1:J = 0x2L

.field public static final REASON_CLOUD:I = 0x4

.field public static final REASON_IME:I = 0x3

.field public static final REASON_LAUNCHER:I = 0x2

.field public static final REASON_SYSTEM_PACKAGE:I = 0x1

.field public static final REPLACE_3DR_APK:I = 0x2

.field public static final REPLACE_DISABLE:I = 0x0

.field public static final REPLACE_SYSTEM_APK:I = 0x1

.field public static final REPLACE_SYSTEM_FILE:I = 0x3

.field public static final TYPE_APK:I = 0x1

.field public static final TYPE_DIR:I = 0x0

.field public static final TYPE_ELF:I = 0x2

.field public static final TYPE_HTML:I = 0x3

.field public static final TYPE_JAR:I = 0x4

.field public static final TYPE_LOG:I = 0x5

.field public static final TYPE_XML:I = 0x6


# instance fields
.field private a:I

.field public adPluginInfo:Lcom/qihoo/security/engine/AdPluginInfo;

.field public final apkInfo:Lcom/qihoo/security/engine/ApkInfo;

.field private b:J

.field public behavior:J

.field private c:[B

.field public canReplace:I

.field public category:Ljava/lang/String;

.field public copyright:I

.field public exLevel:I

.field public extInfo:Ljava/lang/String;

.field public extIniInfo:Lcom/qihoo/security/engine/cloudscan/a/f;

.field public fileDescription:Ljava/lang/String;

.field public final filePath:Ljava/lang/String;

.field public final fileType:I

.field public final fromPid:I

.field public hipsActionDescription:Ljava/lang/String;

.field public hipsActionRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

.field public hipsPrivilegeDescription:Ljava/lang/String;

.field public hipsPrivilegeRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

.field public level:I

.field public netErrCode:I

.field public queryFlags:J

.field public queryFrom:I

.field public resultFrom:I

.field public scanType:I

.field public shouldUpload:Z

.field public softClass:Ljava/lang/String;

.field public softDescription:Ljava/lang/String;

.field public trojanName:Ljava/lang/String;

.field public whiteFlags:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/qihoo/security/engine/FileInfo$1;

    invoke-direct {v0}, Lcom/qihoo/security/engine/FileInfo$1;-><init>()V

    sput-object v0, Lcom/qihoo/security/engine/FileInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;)V
    .locals 6

    const-wide/16 v4, 0x0

    const/4 v3, -0x1

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v3, p0, Lcom/qihoo/security/engine/FileInfo;->level:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->canReplace:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->resultFrom:I

    iput-object v2, p0, Lcom/qihoo/security/engine/FileInfo;->hipsActionRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    iput-object v2, p0, Lcom/qihoo/security/engine/FileInfo;->hipsPrivilegeRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    new-instance v0, Lcom/qihoo/security/engine/AdPluginInfo;

    invoke-direct {v0}, Lcom/qihoo/security/engine/AdPluginInfo;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->adPluginInfo:Lcom/qihoo/security/engine/AdPluginInfo;

    iput-wide v4, p0, Lcom/qihoo/security/engine/FileInfo;->behavior:J

    iput v3, p0, Lcom/qihoo/security/engine/FileInfo;->queryFrom:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->copyright:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->whiteFlags:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->netErrCode:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->a:I

    iput-wide v4, p0, Lcom/qihoo/security/engine/FileInfo;->b:J

    iput-object v2, p0, Lcom/qihoo/security/engine/FileInfo;->c:[B

    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/engine/FileInfo;->fileType:I

    iget-object v0, p2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    iput-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    new-instance v0, Lcom/qihoo/security/engine/ApkInfo;

    invoke-direct {v0, p1, p2}, Lcom/qihoo/security/engine/ApkInfo;-><init>(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->fromPid:I

    return-void
.end method

.method constructor <init>(Landroid/os/Parcel;)V
    .locals 6

    const-wide/16 v4, 0x0

    const/4 v3, -0x1

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v3, p0, Lcom/qihoo/security/engine/FileInfo;->level:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->canReplace:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->resultFrom:I

    iput-object v2, p0, Lcom/qihoo/security/engine/FileInfo;->hipsActionRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    iput-object v2, p0, Lcom/qihoo/security/engine/FileInfo;->hipsPrivilegeRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    new-instance v0, Lcom/qihoo/security/engine/AdPluginInfo;

    invoke-direct {v0}, Lcom/qihoo/security/engine/AdPluginInfo;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->adPluginInfo:Lcom/qihoo/security/engine/AdPluginInfo;

    iput-wide v4, p0, Lcom/qihoo/security/engine/FileInfo;->behavior:J

    iput v3, p0, Lcom/qihoo/security/engine/FileInfo;->queryFrom:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->copyright:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->whiteFlags:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->netErrCode:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->a:I

    iput-wide v4, p0, Lcom/qihoo/security/engine/FileInfo;->b:J

    iput-object v2, p0, Lcom/qihoo/security/engine/FileInfo;->c:[B

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/FileInfo;->fileType:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/ApkInfo;

    iput-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/FileInfo;->fromPid:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/FileInfo;->level:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/qihoo/security/engine/FileInfo;->behavior:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/qihoo/security/engine/FileInfo;->b:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->c:[B

    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->trojanName:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->category:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->fileDescription:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->softDescription:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Lcom/qihoo/security/engine/FileInfo;->shouldUpload:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/FileInfo;->a([B)Z

    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/engine/FileInfo;->queryFlags:J

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/AdPluginInfo;

    iput-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->adPluginInfo:Lcom/qihoo/security/engine/AdPluginInfo;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-lez v0, :cond_2

    sget-object v0, Lcom/qihoo/security/engine/HipsActionRevise;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->createTypedArray(Landroid/os/Parcelable$Creator;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/engine/HipsActionRevise;

    iput-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->hipsActionRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/FileInfo;->whiteFlags:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/FileInfo;->queryFrom:I

    return-void

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public constructor <init>(Lcom/qihoo/security/engine/ApkInfo;)V
    .locals 6

    const-wide/16 v4, 0x0

    const/4 v3, -0x1

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v3, p0, Lcom/qihoo/security/engine/FileInfo;->level:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->canReplace:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->resultFrom:I

    iput-object v2, p0, Lcom/qihoo/security/engine/FileInfo;->hipsActionRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    iput-object v2, p0, Lcom/qihoo/security/engine/FileInfo;->hipsPrivilegeRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    new-instance v0, Lcom/qihoo/security/engine/AdPluginInfo;

    invoke-direct {v0}, Lcom/qihoo/security/engine/AdPluginInfo;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->adPluginInfo:Lcom/qihoo/security/engine/AdPluginInfo;

    iput-wide v4, p0, Lcom/qihoo/security/engine/FileInfo;->behavior:J

    iput v3, p0, Lcom/qihoo/security/engine/FileInfo;->queryFrom:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->copyright:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->whiteFlags:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->netErrCode:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->a:I

    iput-wide v4, p0, Lcom/qihoo/security/engine/FileInfo;->b:J

    iput-object v2, p0, Lcom/qihoo/security/engine/FileInfo;->c:[B

    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/engine/FileInfo;->fileType:I

    iget-object v0, p1, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    iput-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    iput-object p1, p0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->fromPid:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-wide/16 v4, 0x0

    const/4 v3, -0x1

    const/4 v2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v3, p0, Lcom/qihoo/security/engine/FileInfo;->level:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->canReplace:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->resultFrom:I

    iput-object v2, p0, Lcom/qihoo/security/engine/FileInfo;->hipsActionRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    iput-object v2, p0, Lcom/qihoo/security/engine/FileInfo;->hipsPrivilegeRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    new-instance v0, Lcom/qihoo/security/engine/AdPluginInfo;

    invoke-direct {v0}, Lcom/qihoo/security/engine/AdPluginInfo;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->adPluginInfo:Lcom/qihoo/security/engine/AdPluginInfo;

    iput-wide v4, p0, Lcom/qihoo/security/engine/FileInfo;->behavior:J

    iput v3, p0, Lcom/qihoo/security/engine/FileInfo;->queryFrom:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->copyright:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->whiteFlags:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->netErrCode:I

    iput v1, p0, Lcom/qihoo/security/engine/FileInfo;->a:I

    iput-wide v4, p0, Lcom/qihoo/security/engine/FileInfo;->b:J

    iput-object v2, p0, Lcom/qihoo/security/engine/FileInfo;->c:[B

    iput-object p1, p0, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    iput p2, p0, Lcom/qihoo/security/engine/FileInfo;->fileType:I

    iget v0, p0, Lcom/qihoo/security/engine/FileInfo;->fileType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance v0, Lcom/qihoo/security/engine/ApkInfo;

    invoke-direct {v0, p1}, Lcom/qihoo/security/engine/ApkInfo;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    :goto_0
    iput p3, p0, Lcom/qihoo/security/engine/FileInfo;->fromPid:I

    return-void

    :cond_0
    iput-object v2, p0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    goto :goto_0
.end method

.method private a([B)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    :goto_0
    return v0

    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/qihoo/security/engine/cloudscan/a/f;->a([B)Lcom/qihoo/security/engine/cloudscan/a/f;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo/security/engine/FileInfo;->extIniInfo:Lcom/qihoo/security/engine/cloudscan/a/f;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method


# virtual methods
.method public SetDeleteType(I)V
    .locals 0

    iput p1, p0, Lcom/qihoo/security/engine/FileInfo;->a:I

    return-void
.end method

.method public checkDeletable(Landroid/content/Context;)I
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget v0, p0, Lcom/qihoo/security/engine/FileInfo;->a:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/qihoo/security/engine/FileInfo;->a:I

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget-boolean v0, v0, Lcom/qihoo/security/engine/ApkInfo;->isInstalled:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/ApkInfo;->isBuiltin()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string/jumbo v3, "com.android.settings"

    const/16 v4, 0x40

    invoke-virtual {v0, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    iget-object v4, p0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget-object v4, v4, Lcom/qihoo/security/engine/ApkInfo;->packageName:Ljava/lang/String;

    const/16 v5, 0x40

    invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v4, 0x0

    aget-object v0, v0, v4

    iget-object v3, v3, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v4, 0x0

    aget-object v3, v3, v4

    invoke-virtual {v0, v3}, Landroid/content/pm/Signature;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_0

    :catch_0
    move-exception v0

    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v3, "android.intent.action.MAIN"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const-string/jumbo v3, "android.intent.category.HOME"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v3, p0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    invoke-virtual {v3, v0}, Lcom/qihoo/security/engine/ApkInfo;->queryActivityForIntent(Landroid/content/Intent;)Landroid/content/pm/ActivityInfo;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const/high16 v4, 0x10000

    invoke-virtual {v3, v0, v4}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v1, :cond_2

    const/4 v0, 0x2

    goto :goto_0

    :cond_2
    const-string/jumbo v0, "input_method"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v0}, Landroid/view/inputmethod/InputMethodManager;->getEnabledInputMethodList()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-ne v3, v1, :cond_3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodInfo;

    iget-object v1, p0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    iget-object v1, v1, Lcom/qihoo/security/engine/ApkInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0}, Landroid/view/inputmethod/InputMethodInfo;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x3

    goto/16 :goto_0

    :cond_3
    move v0, v2

    goto/16 :goto_0
.end method

.method public clone()Lcom/qihoo/security/engine/FileInfo;
    .locals 1

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/FileInfo;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/qihoo/security/engine/FileInfo;->clone()Lcom/qihoo/security/engine/FileInfo;

    move-result-object v0

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    instance-of v1, p1, Lcom/qihoo/security/engine/FileInfo;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/qihoo/security/engine/FileInfo;

    iget v1, p1, Lcom/qihoo/security/engine/FileInfo;->level:I

    iget v2, p0, Lcom/qihoo/security/engine/FileInfo;->level:I

    if-ne v1, v2, :cond_0

    iget-object v0, p1, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    iget-object v1, p0, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public extIniToBytes()[B
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/qihoo/security/engine/FileInfo;->extIniInfo:Lcom/qihoo/security/engine/cloudscan/a/f;

    if-nez v1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/engine/FileInfo;->extIniInfo:Lcom/qihoo/security/engine/cloudscan/a/f;

    invoke-virtual {v1}, Lcom/qihoo/security/engine/cloudscan/a/f;->N()[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public getCloudConfig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/engine/FileInfo;->getExIniValue(Ljava/lang/String;Ljava/lang/String;)Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v0

    sget-object v1, Lnet/jarlehansen/protobuf/javame/b;->a:Lnet/jarlehansen/protobuf/javame/b;

    if-ne v0, v1, :cond_0

    :goto_0
    return-object p3

    :cond_0
    invoke-virtual {v0}, Lnet/jarlehansen/protobuf/javame/b;->c()Ljava/lang/String;

    move-result-object p3

    goto :goto_0
.end method

.method public getExIniValue(Ljava/lang/String;Ljava/lang/String;)Lnet/jarlehansen/protobuf/javame/b;
    .locals 4

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->extIniInfo:Lcom/qihoo/security/engine/cloudscan/a/f;

    if-eqz v0, :cond_0

    if-nez p2, :cond_1

    :cond_0
    sget-object v0, Lnet/jarlehansen/protobuf/javame/b;->a:Lnet/jarlehansen/protobuf/javame/b;

    :goto_0
    return-object v0

    :cond_1
    if-nez p1, :cond_5

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->extIniInfo:Lcom/qihoo/security/engine/cloudscan/a/f;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/f;->d()Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    sget-object v0, Lnet/jarlehansen/protobuf/javame/b;->a:Lnet/jarlehansen/protobuf/javame/b;

    goto :goto_0

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/cloudscan/a/j;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/j;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/j;->d()Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v0

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->extIniInfo:Lcom/qihoo/security/engine/cloudscan/a/f;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/f;->c()Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/cloudscan/a/i;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/i;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/i;->d()Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/cloudscan/a/j;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/j;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v0}, Lcom/qihoo/security/engine/cloudscan/a/j;->d()Lnet/jarlehansen/protobuf/javame/b;

    move-result-object v0

    goto :goto_0
.end method

.method public getFileSha1()[B
    .locals 3

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->c:[B

    if-nez v0, :cond_0

    const-string/jumbo v0, "SHA1"

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/HashUtil;->getFileHash(Ljava/lang/String;Ljava/io/File;)[B

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->c:[B

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->c:[B

    return-object v0
.end method

.method public getFileSize()J
    .locals 4

    iget-wide v0, p0, Lcom/qihoo/security/engine/FileInfo;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/engine/FileInfo;->b:J

    :cond_0
    iget-wide v0, p0, Lcom/qihoo/security/engine/FileInfo;->b:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 2

    const/16 v0, 0xd

    iget-object v1, p0, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0xdd

    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    if-eqz v1, :cond_1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    invoke-virtual {v1}, Lcom/qihoo/security/engine/ApkInfo;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/engine/FileInfo;->level:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/engine/FileInfo;->whiteFlags:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/engine/FileInfo;->level:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/engine/FileInfo;->whiteFlags:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget v0, p0, Lcom/qihoo/security/engine/FileInfo;->fileType:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->filePath:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->apkInfo:Lcom/qihoo/security/engine/ApkInfo;

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget v0, p0, Lcom/qihoo/security/engine/FileInfo;->fromPid:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/qihoo/security/engine/FileInfo;->level:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-wide v4, p0, Lcom/qihoo/security/engine/FileInfo;->behavior:J

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    iget-wide v4, p0, Lcom/qihoo/security/engine/FileInfo;->b:J

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->c:[B

    if-nez v0, :cond_1

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->trojanName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->category:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->fileDescription:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->softDescription:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/qihoo/security/engine/FileInfo;->shouldUpload:Z

    if-eqz v0, :cond_2

    move v0, v1

    :goto_1
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->extIniInfo:Lcom/qihoo/security/engine/cloudscan/a/f;

    if-nez v0, :cond_3

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_2
    iget-wide v4, p0, Lcom/qihoo/security/engine/FileInfo;->queryFlags:J

    invoke-virtual {p1, v4, v5}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->adPluginInfo:Lcom/qihoo/security/engine/AdPluginInfo;

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->hipsActionRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->hipsActionRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    array-length v0, v0

    if-nez v0, :cond_4

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_3
    iget v0, p0, Lcom/qihoo/security/engine/FileInfo;->whiteFlags:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/qihoo/security/engine/FileInfo;->queryFrom:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->c:[B

    array-length v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->c:[B

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByteArray([B)V

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/qihoo/security/engine/FileInfo;->extIniToBytes()[B

    move-result-object v0

    array-length v3, v0

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByteArray([B)V

    goto :goto_2

    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->hipsActionRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    array-length v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/qihoo/security/engine/FileInfo;->hipsActionRevise:[Lcom/qihoo/security/engine/HipsActionRevise;

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V

    goto :goto_3
.end method
