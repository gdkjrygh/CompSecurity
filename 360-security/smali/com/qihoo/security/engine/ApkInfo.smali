.class public Lcom/qihoo/security/engine/ApkInfo;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;
.implements Ljava/lang/Cloneable;


# static fields
.field public static final ADWARE:I = 0x5

.field public static final CLEAR:I = 0x0

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/qihoo/security/engine/ApkInfo;",
            ">;"
        }
    .end annotation
.end field

.field public static final DANGER:I = 0x1

.field public static final FLAG_SKIP_ODEX:I = 0x1

.field public static final PUA:I = 0x4

.field public static final TROJAN:I = 0x3

.field public static final UNKNOWN:I = -0x1

.field public static final WARNING:I = 0x2

.field private static final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static final h:Z


# instance fields
.field protected a:[B

.field public adPlugins:[Lcom/qihoo/security/engine/AdPluginInfo$AdPlugin;

.field public behavior:I

.field private c:[B

.field private d:J

.field private final e:Lcom/qihoo/security/engine/ClassesDexInfo;

.field public extraInfo:Ljava/lang/String;

.field private f:Landroid/content/pm/PackageParser$Package;

.field public final filePath:Ljava/lang/String;

.field public flags:I

.field private g:Ljava/lang/String;

.field public hipsAction:J

.field private i:I

.field public iconRes:I

.field public final isInstalled:Z

.field public mDexHash:[B

.field public mFileHash:[B

.field public maliceRank:I

.field public final packageName:Ljava/lang/String;

.field public timestamp:I

.field public upExts:Ljava/lang/String;

.field public final versionCode:I

.field public versionName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lcom/qihoo/security/engine/ApkInfo;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Lcom/qihoo/security/engine/ApkInfo$1;

    invoke-direct {v0}, Lcom/qihoo/security/engine/ApkInfo$1;-><init>()V

    sput-object v0, Lcom/qihoo/security/engine/ApkInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {}, Lcom/qihoo360/common/utils/SysInfo;->isRunningART()Z

    move-result v0

    sput-boolean v0, Lcom/qihoo/security/engine/ApkInfo;->h:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;)V
    .locals 4

    const/4 v0, -0x1

    const/4 v3, 0x0

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->iconRes:I

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    iput v3, p0, Lcom/qihoo/security/engine/ApkInfo;->behavior:I

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->extraInfo:Ljava/lang/String;

    iput v3, p0, Lcom/qihoo/security/engine/ApkInfo;->timestamp:I

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->c:[B

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->a:[B

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/engine/ApkInfo;->d:J

    new-instance v0, Lcom/qihoo/security/engine/ClassesDexInfo;

    invoke-direct {v0}, Lcom/qihoo/security/engine/ClassesDexInfo;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->f:Landroid/content/pm/PackageParser$Package;

    iget-object v0, p2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->packageName:Ljava/lang/String;

    iget v0, p2, Landroid/content/pm/PackageInfo;->versionCode:I

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->versionCode:I

    iget-object v0, p2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    if-eqz v0, :cond_0

    const-string/jumbo v0, "MD5"

    iget-object v1, p2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    aget-object v1, v1, v3

    invoke-virtual {v1}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/HashUtil;->getHash(Ljava/lang/String;[B)[B

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->a:[B

    :goto_0
    iget-object v0, p2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    iget-object v0, p2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->iconRes:I

    iget-object v0, p2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->flags:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/ApkInfo;->isInstalled:Z

    return-void

    :cond_0
    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->a:[B

    goto :goto_0
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 4

    const/4 v0, -0x1

    const/4 v3, 0x0

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->iconRes:I

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    iput v3, p0, Lcom/qihoo/security/engine/ApkInfo;->behavior:I

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->extraInfo:Ljava/lang/String;

    iput v3, p0, Lcom/qihoo/security/engine/ApkInfo;->timestamp:I

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->c:[B

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->a:[B

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/engine/ApkInfo;->d:J

    new-instance v0, Lcom/qihoo/security/engine/ClassesDexInfo;

    invoke-direct {v0}, Lcom/qihoo/security/engine/ClassesDexInfo;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->f:Landroid/content/pm/PackageParser$Package;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->i:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->versionCode:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->a:[B

    :cond_0
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->behavior:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->versionName:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->g:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->flags:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->iconRes:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->timestamp:I

    invoke-virtual {p1}, Landroid/os/Parcel;->createBooleanArray()[Z

    move-result-object v0

    aget-boolean v0, v0, v3

    iput-boolean v0, p0, Lcom/qihoo/security/engine/ApkInfo;->isInstalled:Z

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->filePath:Ljava/lang/String;

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->memoryPtr:J

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->memorySize:J

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B

    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p1}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    :cond_2
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->upExts:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, -0x1

    const/4 v3, 0x0

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->iconRes:I

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    iput v3, p0, Lcom/qihoo/security/engine/ApkInfo;->behavior:I

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->extraInfo:Ljava/lang/String;

    iput v3, p0, Lcom/qihoo/security/engine/ApkInfo;->timestamp:I

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->c:[B

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->a:[B

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/engine/ApkInfo;->d:J

    new-instance v0, Lcom/qihoo/security/engine/ClassesDexInfo;

    invoke-direct {v0}, Lcom/qihoo/security/engine/ClassesDexInfo;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->f:Landroid/content/pm/PackageParser$Package;

    iput-object p1, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    iput-boolean v3, p0, Lcom/qihoo/security/engine/ApkInfo;->isInstalled:Z

    invoke-virtual {p0}, Lcom/qihoo/security/engine/ApkInfo;->getParserInfo()Landroid/content/pm/PackageParser$Package;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, v0, Landroid/content/pm/PackageParser$Package;->packageName:Ljava/lang/String;

    iput-object v1, p0, Lcom/qihoo/security/engine/ApkInfo;->packageName:Ljava/lang/String;

    iget v1, v0, Landroid/content/pm/PackageParser$Package;->mVersionCode:I

    iput v1, p0, Lcom/qihoo/security/engine/ApkInfo;->versionCode:I

    iget-object v0, v0, Landroid/content/pm/PackageParser$Package;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->icon:I

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->iconRes:I

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "Can not parse "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public constructor <init>(Ljava/lang/String;I[BLjava/lang/String;Z)V
    .locals 3

    const/4 v1, 0x0

    const/4 v0, -0x1

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->iconRes:I

    iput v0, p0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    iput v1, p0, Lcom/qihoo/security/engine/ApkInfo;->behavior:I

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->extraInfo:Ljava/lang/String;

    iput v1, p0, Lcom/qihoo/security/engine/ApkInfo;->timestamp:I

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->c:[B

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->a:[B

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/engine/ApkInfo;->d:J

    new-instance v0, Lcom/qihoo/security/engine/ClassesDexInfo;

    invoke-direct {v0}, Lcom/qihoo/security/engine/ClassesDexInfo;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->f:Landroid/content/pm/PackageParser$Package;

    iput-object p1, p0, Lcom/qihoo/security/engine/ApkInfo;->packageName:Ljava/lang/String;

    iput p2, p0, Lcom/qihoo/security/engine/ApkInfo;->versionCode:I

    iput-object p3, p0, Lcom/qihoo/security/engine/ApkInfo;->a:[B

    iput-object p4, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    iput-boolean p5, p0, Lcom/qihoo/security/engine/ApkInfo;->isInstalled:Z

    return-void
.end method

.method private a(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 4

    iget v1, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget v2, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    const/4 v0, 0x1

    if-gt v1, p3, :cond_0

    if-le v2, p2, :cond_1

    :cond_0
    div-int/lit8 v1, v1, 0x2

    div-int/lit8 v2, v2, 0x2

    :goto_0
    div-int v3, v1, v0

    if-le v3, p3, :cond_1

    div-int v3, v2, v0

    if-gt v3, p2, :cond_2

    :cond_1
    return v0

    :cond_2
    mul-int/lit8 v0, v0, 0x2

    goto :goto_0
.end method

.method private a(Ljava/lang/String;)Lcom/qihoo/security/engine/ClassesDexInfo;
    .locals 4

    const-wide/16 v2, 0x0

    sget-object v0, Lcom/qihoo/security/engine/ApkInfo;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/16 v1, 0x1e

    if-gt v0, v1, :cond_0

    invoke-direct {p0}, Lcom/qihoo/security/engine/ApkInfo;->a()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iput-wide v2, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->memorySize:J

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iput-wide v2, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->memoryPtr:J

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    const-string/jumbo v1, "classes.dex"

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Lcom/qihoo360/common/utils/ZipUtil;->extract(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iput-object p1, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->filePath:Ljava/lang/String;

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    return-object v0

    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    const-string/jumbo v1, "classes.dex"

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, v2}, Lcom/qihoo360/common/utils/ZipUtil;->extract(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iput-object p1, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->filePath:Ljava/lang/String;

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    const-string/jumbo v1, ""

    iput-object v1, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->filePath:Ljava/lang/String;

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string/jumbo v2, "ApkInfo"

    const-string/jumbo v3, ""

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :goto_0
    :try_start_0
    invoke-virtual {v0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object p1

    :goto_1
    return-object p1

    :cond_0
    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1, p3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private a(Ljava/util/ArrayList;Landroid/content/Intent;Z)Ljava/util/LinkedList;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/content/pm/PackageParser$Activity;",
            ">;",
            "Landroid/content/Intent;",
            "Z)",
            "Ljava/util/LinkedList",
            "<",
            "Landroid/content/pm/ActivityInfo;",
            ">;"
        }
    .end annotation

    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Landroid/content/Intent;->getCategories()Ljava/util/Set;

    move-result-object v4

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    return-object v2

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageParser$Activity;

    iget-object v1, v0, Landroid/content/pm/PackageParser$Activity;->intents:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/PackageParser$ActivityIntentInfo;

    if-eqz v3, :cond_3

    invoke-virtual {v1, v3}, Landroid/content/pm/PackageParser$ActivityIntentInfo;->hasAction(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    :cond_3
    if-eqz v4, :cond_4

    invoke-static {v4, v1}, Lcom/qihoo/security/engine/ApkInfo;->a(Ljava/util/Set;Landroid/content/pm/PackageParser$ActivityIntentInfo;)Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_4
    iget-object v1, v0, Landroid/content/pm/PackageParser$Activity;->info:Landroid/content/pm/ActivityInfo;

    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    if-eqz p3, :cond_2

    goto :goto_0
.end method

.method private a()Z
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    const/4 v3, 0x0

    const-wide/32 v4, 0x100000

    invoke-static {v2, v3, v4, v5}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->CreateCodeMapping(Ljava/lang/String;Ljava/lang/String;J)[J

    move-result-object v2

    if-eqz v2, :cond_0

    array-length v3, v2

    if-nez v3, :cond_1

    :cond_0
    move v0, v1

    :goto_0
    return v0

    :cond_1
    aget-wide v4, v2, v1

    const-wide/16 v6, 0x0

    cmp-long v3, v4, v6

    if-lez v3, :cond_2

    sget-object v3, Lcom/qihoo/security/engine/ApkInfo;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iget-object v3, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    const-string/jumbo v4, ""

    iput-object v4, v3, Lcom/qihoo/security/engine/ClassesDexInfo;->filePath:Ljava/lang/String;

    iget-object v3, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    aget-wide v4, v2, v1

    iput-wide v4, v3, Lcom/qihoo/security/engine/ClassesDexInfo;->memorySize:J

    iget-object v1, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    aget-wide v2, v2, v0

    iput-wide v2, v1, Lcom/qihoo/security/engine/ClassesDexInfo;->memoryPtr:J

    goto :goto_0

    :cond_2
    move v0, v1

    goto :goto_0
.end method

.method private static a(Ljava/util/Set;Landroid/content/pm/PackageParser$ActivityIntentInfo;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/pm/PackageParser$ActivityIntentInfo;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/content/pm/PackageParser$ActivityIntentInfo;->hasCategory(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public addUpExts(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->upExts:Ljava/lang/String;

    invoke-direct {p0, v0, p1, p2}, Lcom/qihoo/security/engine/ApkInfo;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->upExts:Ljava/lang/String;

    return-void
.end method

.method public clone()Lcom/qihoo/security/engine/ApkInfo;
    .locals 1

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/engine/ApkInfo;
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

    invoke-virtual {p0}, Lcom/qihoo/security/engine/ApkInfo;->clone()Lcom/qihoo/security/engine/ApkInfo;

    move-result-object v0

    return-object v0
.end method

.method public closeClassesDex()V
    .locals 4

    const-wide/16 v2, 0x0

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iget-wide v0, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->memoryPtr:J

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iget-wide v0, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->memoryPtr:J

    invoke-static {v0, v1}, Lcom/qihoo/security/engine/cloudscan/SampleDetector;->CloseMappingHandle(J)V

    sget-object v0, Lcom/qihoo/security/engine/ApkInfo;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iput-wide v2, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->memoryPtr:J

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->filePath:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string/jumbo v1, "/sys"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string/jumbo v1, "/data"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->filePath:Ljava/lang/String;

    :cond_2
    return-void
.end method

.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAppKey()[B
    .locals 4

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->c:[B

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/engine/ApkInfo;->getSigHash()[B

    move-result-object v0

    if-eqz v0, :cond_0

    const-string/jumbo v1, "MD5"

    new-instance v2, Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/qihoo/security/engine/ApkInfo;->packageName:Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v3, "_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/qihoo/security/engine/ApkInfo;->versionCode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v0}, Lcom/qihoo360/common/utils/HexUtil;->bytes2HexStr([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v1, v0}, Lcom/qihoo360/common/utils/HashUtil;->getHash(Ljava/lang/String;[B)[B

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->c:[B

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->c:[B

    return-object v0
.end method

.method public getDexHash()[B
    .locals 6

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/qihoo/security/engine/ApkInfo;->isBuiltin()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Lcom/qihoo360/common/unzip/a;

    iget-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/qihoo360/common/unzip/a;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v1}, Lcom/qihoo360/common/unzip/a;->a()Ljava/util/Enumeration;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Enumeration;->hasMoreElements()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v0

    if-nez v0, :cond_2

    :goto_0
    if-eqz v1, :cond_1

    :try_start_2
    invoke-virtual {v1}, Lcom/qihoo360/common/unzip/a;->b()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B

    return-object v0

    :cond_2
    :try_start_3
    invoke-interface {v2}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/common/unzip/a$a;

    const-string/jumbo v3, "classes.dex"

    invoke-virtual {v0}, Lcom/qihoo360/common/unzip/a$a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Lcom/qihoo360/common/unzip/a$a;->b()Ljava/io/InputStream;

    move-result-object v0

    const-string/jumbo v2, "MD5"

    invoke-static {v2, v0}, Lcom/qihoo360/common/utils/HashUtil;->getInputStreamHash(Ljava/lang/String;Ljava/io/InputStream;)[B

    move-result-object v2

    iput-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_1

    :try_start_4
    invoke-virtual {v0}, Lcom/qihoo360/common/unzip/a;->b()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_1

    :catchall_0
    move-exception v1

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    :goto_3
    if-eqz v1, :cond_3

    :try_start_5
    invoke-virtual {v1}, Lcom/qihoo360/common/unzip/a;->b()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    :cond_3
    :goto_4
    throw v0

    :catch_2
    move-exception v1

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_3

    :catch_4
    move-exception v1

    goto :goto_2
.end method

.method public getExtra(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->extraInfo:Ljava/lang/String;

    invoke-direct {p0, v0, p1}, Lcom/qihoo/security/engine/ApkInfo;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getExtra(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->extraInfo:Ljava/lang/String;

    invoke-direct {p0, v0, p1, p2}, Lcom/qihoo/security/engine/ApkInfo;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getFileHash()[B
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    if-nez v0, :cond_0

    const-string/jumbo v0, "MD5"

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/HashUtil;->getFileHash(Ljava/lang/String;Ljava/io/File;)[B

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    if-nez v0, :cond_0

    const/4 v0, 0x1

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    aput-byte v3, v0, v3

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    return-object v0
.end method

.method public getFileSize()J
    .locals 4

    iget-wide v0, p0, Lcom/qihoo/security/engine/ApkInfo;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/engine/ApkInfo;->d:J

    :cond_0
    iget-wide v0, p0, Lcom/qihoo/security/engine/ApkInfo;->d:J

    return-wide v0
.end method

.method public getParserInfo()Landroid/content/pm/PackageParser$Package;
    .locals 4

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->f:Landroid/content/pm/PackageParser$Package;

    if-nez v0, :cond_0

    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    invoke-virtual {v0}, Landroid/util/DisplayMetrics;->setToDefaults()V

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, Lcom/qihoo360/common/utils/PortPackageParser;->parsePackage(Ljava/io/File;Ljava/lang/String;Landroid/util/DisplayMetrics;I)Landroid/content/pm/PackageParser$Package;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->f:Landroid/content/pm/PackageParser$Package;

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->f:Landroid/content/pm/PackageParser$Package;

    if-nez v0, :cond_0

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->f:Landroid/content/pm/PackageParser$Package;

    return-object v0
.end method

.method public getSigHash()[B
    .locals 4

    const/16 v3, 0x10

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->a:[B

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/qihoo/security/engine/ApkInfo;->isInstalled:Z

    if-eqz v0, :cond_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->a:[B

    return-object v0

    :cond_1
    const/16 v0, 0x50

    new-array v0, v0, [B

    iget-object v1, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/qihoo/security/engine/cloudscan/NetQuery;->GetFgprint(Ljava/lang/String;[B)I

    move-result v1

    if-lez v1, :cond_0

    new-array v1, v3, [B

    iput-object v1, p0, Lcom/qihoo/security/engine/ApkInfo;->a:[B

    iget-object v1, p0, Lcom/qihoo/security/engine/ApkInfo;->a:[B

    invoke-static {v0, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0
.end method

.method public isAdWare()Z
    .locals 2

    const/4 v0, 0x0

    iget v1, p0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    packed-switch v1, :pswitch_data_0

    :cond_0
    :goto_0
    return v0

    :pswitch_0
    sget-boolean v1, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public isBuiltin()Z
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Lcom/qihoo/security/engine/ApkInfo;->flags:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    iget v1, p0, Lcom/qihoo/security/engine/ApkInfo;->flags:I

    and-int/lit16 v1, v1, 0x80

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isDanger()Z
    .locals 3

    const/4 v0, 0x0

    iget v1, p0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    packed-switch v1, :pswitch_data_0

    :cond_0
    :goto_0
    return v0

    :pswitch_0
    iget v1, p0, Lcom/qihoo/security/engine/ApkInfo;->behavior:I

    const/high16 v2, 0x40000

    and-int/2addr v1, v2

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public isMalware()Z
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_1
    const/4 v0, 0x1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public isSystem()Z
    .locals 2

    const/4 v0, 0x1

    iget v1, p0, Lcom/qihoo/security/engine/ApkInfo;->flags:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isTrojan()Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget v2, p0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    move v0, v1

    :cond_0
    :goto_0
    :pswitch_1
    return v0

    :pswitch_2
    iget v2, p0, Lcom/qihoo/security/engine/ApkInfo;->behavior:I

    const/high16 v3, 0x40000

    and-int/2addr v2, v3

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public isUpdatedSystem()Z
    .locals 2

    iget v0, p0, Lcom/qihoo/security/engine/ApkInfo;->flags:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public isWarning()Z
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget v2, p0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    packed-switch v2, :pswitch_data_0

    :pswitch_0
    move v0, v1

    :cond_0
    :goto_0
    :pswitch_1
    return v0

    :pswitch_2
    sget-boolean v2, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public loadIcon(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 1

    sget-boolean v0, Lcom/qihoo/security/env/QVSEnv;->bEvalMode:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/pm/PackageManager;->getDefaultActivityIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/qihoo/security/engine/ApkInfo;->loadIconImpl(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0
.end method

.method public loadIconImpl(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
    .locals 6

    const/4 v4, 0x1

    const/4 v1, 0x0

    iget v0, p0, Lcom/qihoo/security/engine/ApkInfo;->iconRes:I

    if-lez v0, :cond_2

    iget-boolean v0, p0, Lcom/qihoo/security/engine/ApkInfo;->isInstalled:Z

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/ApkInfo;->packageName:Ljava/lang/String;

    iget v2, p0, Lcom/qihoo/security/engine/ApkInfo;->iconRes:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/pm/PackageManager;->getDrawable(Ljava/lang/String;ILandroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/pm/PackageManager;->getDefaultActivityIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :cond_0
    :goto_1
    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/pm/PackageManager;->getDefaultActivityIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v2, Landroid/content/res/AssetManager;

    invoke-direct {v2}, Landroid/content/res/AssetManager;-><init>()V

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v2, v0}, Landroid/content/res/AssetManager;->addAssetPath(Ljava/lang/String;)I

    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    const/high16 v3, 0x3f400000    # 0.75f

    iput v3, v0, Landroid/util/DisplayMetrics;->density:F

    const/16 v3, 0x1e0

    iput v3, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    const/16 v3, 0x140

    iput v3, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    const/high16 v3, 0x43b40000    # 360.0f

    iput v3, v0, Landroid/util/DisplayMetrics;->xdpi:F

    const/high16 v3, 0x43700000    # 240.0f

    iput v3, v0, Landroid/util/DisplayMetrics;->ydpi:F

    const/16 v3, 0x78

    iput v3, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    new-instance v3, Landroid/content/res/Configuration;

    invoke-direct {v3}, Landroid/content/res/Configuration;-><init>()V

    iput v4, v3, Landroid/content/res/Configuration;->screenLayout:I

    new-instance v4, Landroid/content/res/Resources;

    invoke-direct {v4, v2, v0, v3}, Landroid/content/res/Resources;-><init>(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V

    :try_start_1
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    iget v0, p0, Lcom/qihoo/security/engine/ApkInfo;->iconRes:I

    invoke-static {v4, v0, v3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    const/16 v0, 0x20

    const/16 v5, 0x20

    invoke-direct {p0, v3, v0, v5}, Lcom/qihoo/security/engine/ApkInfo;->a(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v0

    iput v0, v3, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 v0, 0x0

    iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    iget v5, p0, Lcom/qihoo/security/engine/ApkInfo;->iconRes:I

    invoke-static {v4, v5, v3}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v3

    invoke-direct {v0, v4, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v2}, Landroid/content/res/AssetManager;->close()V

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {v2}, Landroid/content/res/AssetManager;->close()V

    move-object v0, v1

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Landroid/content/res/AssetManager;->close()V

    throw v0

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method public loadLabel(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->g:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/qihoo/security/engine/ApkInfo;->getParserInfo()Landroid/content/pm/PackageParser$Package;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v2, Landroid/content/res/AssetManager;

    invoke-direct {v2}, Landroid/content/res/AssetManager;-><init>()V

    iget-object v3, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/content/res/AssetManager;->addAssetPath(Ljava/lang/String;)I

    new-instance v3, Landroid/content/res/Resources;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-direct {v3, v2, v4, v0}, Landroid/content/res/Resources;-><init>(Landroid/content/res/AssetManager;Landroid/util/DisplayMetrics;Landroid/content/res/Configuration;)V

    const/4 v0, 0x0

    iget-object v4, v1, Landroid/content/pm/PackageParser$Package;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v4, v4, Landroid/content/pm/ApplicationInfo;->labelRes:I

    if-eqz v4, :cond_0

    :try_start_0
    iget-object v4, v1, Landroid/content/pm/PackageParser$Package;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v4, v4, Landroid/content/pm/ApplicationInfo;->labelRes:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :cond_0
    :goto_0
    invoke-virtual {v2}, Landroid/content/res/AssetManager;->close()V

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v0, v1, Landroid/content/pm/PackageParser$Package;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    if-eqz v0, :cond_2

    iget-object v0, v1, Landroid/content/pm/PackageParser$Package;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->g:Ljava/lang/String;

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->g:Ljava/lang/String;

    return-object v0

    :cond_2
    iget-object v0, v1, Landroid/content/pm/PackageParser$Package;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->g:Ljava/lang/String;

    goto :goto_1

    :cond_3
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->g:Ljava/lang/String;

    goto :goto_1

    :catch_0
    move-exception v3

    goto :goto_0
.end method

.method public openClassesDex()Lcom/qihoo/security/engine/ClassesDexInfo;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/engine/ApkInfo;->openClassesDex(Z)Lcom/qihoo/security/engine/ClassesDexInfo;

    move-result-object v0

    return-object v0
.end method

.method public openClassesDex(Z)Lcom/qihoo/security/engine/ClassesDexInfo;
    .locals 8

    const/16 v7, 0x2e

    const/4 v6, 0x0

    const/16 v5, 0x40

    const/16 v4, 0x2f

    const/4 v3, 0x1

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->filePath:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/qihoo/security/engine/ApkInfo;->isInstalled:Z

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/qihoo/security/engine/ApkInfo;->isBuiltin()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-lez v0, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v1, v6, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, ".odex"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iput-object v0, v1, Lcom/qihoo/security/engine/ClassesDexInfo;->filePath:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->filePath:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_3

    sget-boolean v0, Lcom/qihoo/security/engine/ApkInfo;->h:Z

    if-eqz v0, :cond_1

    new-instance v0, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "@classes.dex"

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/ApkInfo;->a(Ljava/lang/String;)Lcom/qihoo/security/engine/ClassesDexInfo;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "/data/dalvik-cache/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "@classes.dex"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->canRead()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    const-wide/16 v2, 0x0

    iput-wide v2, v1, Lcom/qihoo/security/engine/ClassesDexInfo;->memorySize:J

    iget-object v1, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    const-wide/16 v2, 0x0

    iput-wide v2, v1, Lcom/qihoo/security/engine/ClassesDexInfo;->memoryPtr:J

    iget-object v1, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iput-object v0, v1, Lcom/qihoo/security/engine/ClassesDexInfo;->filePath:Ljava/lang/String;

    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "@classes.dex"

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/ApkInfo;->a(Ljava/lang/String;)Lcom/qihoo/security/engine/ClassesDexInfo;

    move-result-object v0

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    iget-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v2, v7}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    invoke-virtual {v1, v6, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, "_classes.dex"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/ApkInfo;->a(Ljava/lang/String;)Lcom/qihoo/security/engine/ClassesDexInfo;

    move-result-object v0

    goto/16 :goto_0
.end method

.method public queryActivityForIntent(Landroid/content/Intent;)Landroid/content/pm/ActivityInfo;
    .locals 2

    invoke-virtual {p0}, Lcom/qihoo/security/engine/ApkInfo;->getParserInfo()Landroid/content/pm/PackageParser$Package;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroid/content/pm/PackageParser$Package;->activities:Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {p0, v0, p1, v1}, Lcom/qihoo/security/engine/ApkInfo;->a(Ljava/util/ArrayList;Landroid/content/Intent;Z)Ljava/util/LinkedList;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ActivityInfo;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setExtra(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->extraInfo:Ljava/lang/String;

    invoke-direct {p0, v0, p1, p2}, Lcom/qihoo/security/engine/ApkInfo;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->extraInfo:Ljava/lang/String;

    return-void
.end method

.method public toShortString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/engine/ApkInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/engine/ApkInfo;->versionCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->a:[B

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->a:[B

    invoke-static {v0}, Lcom/qihoo360/common/utils/HexUtil;->bytes2HexStr([B)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    invoke-static {v1}, Lcom/qihoo360/common/utils/HexUtil;->bytes2HexStr([B)Ljava/lang/String;

    move-result-object v1

    :goto_1
    iget-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B

    invoke-static {v2}, Lcom/qihoo360/common/utils/HexUtil;->bytes2HexStr([B)Ljava/lang/String;

    move-result-object v2

    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/qihoo/security/engine/ApkInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lcom/qihoo/security/engine/ApkInfo;->versionCode:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, "|"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v3, "|"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/qihoo/security/engine/ApkInfo;->g:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v3, "|"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/engine/ApkInfo;->timestamp:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string/jumbo v0, "<cert>"

    goto/16 :goto_0

    :cond_1
    const-string/jumbo v1, "<file>"

    goto/16 :goto_1

    :cond_2
    const-string/jumbo v2, "<dex>"

    goto :goto_2
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const/4 v2, 0x0

    iget v0, p0, Lcom/qihoo/security/engine/ApkInfo;->i:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/qihoo/security/engine/ApkInfo;->versionCode:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->a:[B

    if-nez v0, :cond_0

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_0
    iget v0, p0, Lcom/qihoo/security/engine/ApkInfo;->maliceRank:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/qihoo/security/engine/ApkInfo;->behavior:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->versionName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/qihoo/security/engine/ApkInfo;->flags:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/qihoo/security/engine/ApkInfo;->iconRes:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/qihoo/security/engine/ApkInfo;->timestamp:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x1

    new-array v0, v0, [Z

    iget-boolean v1, p0, Lcom/qihoo/security/engine/ApkInfo;->isInstalled:Z

    aput-boolean v1, v0, v2

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeBooleanArray([Z)V

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->filePath:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iget-object v0, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->filePath:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iget-wide v0, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->memoryPtr:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->e:Lcom/qihoo/security/engine/ClassesDexInfo;

    iget-wide v0, v0, Lcom/qihoo/security/engine/ClassesDexInfo;->memorySize:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B

    if-nez v0, :cond_1

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    if-nez v0, :cond_2

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->upExts:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->a:[B

    array-length v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->a:[B

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByteArray([B)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B

    array-length v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->mDexHash:[B

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByteArray([B)V

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    array-length v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/qihoo/security/engine/ApkInfo;->mFileHash:[B

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByteArray([B)V

    goto :goto_2
.end method
