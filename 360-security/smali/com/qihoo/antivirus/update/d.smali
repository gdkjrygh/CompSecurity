.class public Lcom/qihoo/antivirus/update/d;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/antivirus/update/d$a;
    }
.end annotation


# static fields
.field static b:Ljava/lang/String;

.field private static i:Ljava/lang/String;


# instance fields
.field volatile a:Ljava/lang/String;

.field private final c:Landroid/content/Context;

.field private final d:Lcom/qihoo/antivirus/update/ad;

.field private e:Lcom/qihoo/antivirus/update/u;

.field private f:Z

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private j:Ljava/lang/String;

.field private k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/antivirus/update/s;",
            ">;"
        }
    .end annotation
.end field

.field private l:J

.field private m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/antivirus/update/q;",
            ">;"
        }
    .end annotation
.end field

.field private n:Lcom/qihoo/antivirus/update/o;

.field private o:Lcom/qihoo/antivirus/update/v;

.field private p:Lcom/qihoo/antivirus/update/c;

.field private q:Lcom/qihoo/antivirus/update/ac;

.field private r:Lcom/qihoo/antivirus/update/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 869
    sput-object v0, Lcom/qihoo/antivirus/update/d;->b:Ljava/lang/String;

    .line 872
    sput-object v0, Lcom/qihoo/antivirus/update/d;->i:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 860
    iput-object v2, p0, Lcom/qihoo/antivirus/update/d;->e:Lcom/qihoo/antivirus/update/u;

    .line 861
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/antivirus/update/d;->f:Z

    .line 863
    iput-object v2, p0, Lcom/qihoo/antivirus/update/d;->g:Ljava/lang/String;

    .line 866
    iput-object v2, p0, Lcom/qihoo/antivirus/update/d;->a:Ljava/lang/String;

    .line 870
    iput-object v2, p0, Lcom/qihoo/antivirus/update/d;->h:Ljava/lang/String;

    .line 874
    iput-object v2, p0, Lcom/qihoo/antivirus/update/d;->j:Ljava/lang/String;

    .line 880
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/antivirus/update/d;->l:J

    .line 884
    iput-object v2, p0, Lcom/qihoo/antivirus/update/d;->n:Lcom/qihoo/antivirus/update/o;

    .line 886
    iput-object v2, p0, Lcom/qihoo/antivirus/update/d;->o:Lcom/qihoo/antivirus/update/v;

    .line 888
    iput-object v2, p0, Lcom/qihoo/antivirus/update/d;->p:Lcom/qihoo/antivirus/update/c;

    .line 889
    iput-object v2, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    .line 890
    iput-object v2, p0, Lcom/qihoo/antivirus/update/d;->r:Lcom/qihoo/antivirus/update/y;

    .line 48
    iput-object p1, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    .line 49
    new-instance v0, Lcom/qihoo/antivirus/update/ad;

    invoke-direct {v0}, Lcom/qihoo/antivirus/update/ad;-><init>()V

    iput-object v0, p0, Lcom/qihoo/antivirus/update/d;->d:Lcom/qihoo/antivirus/update/ad;

    .line 50
    invoke-direct {p0, p1}, Lcom/qihoo/antivirus/update/d;->b(Landroid/content/Context;)V

    .line 51
    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 104
    const-string/jumbo v0, "timestamp"

    invoke-static {p0, v0}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 535
    invoke-static {p0}, Lcom/qihoo/antivirus/update/af;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Ljava/io/File;I)Z
    .locals 1

    .prologue
    .line 622
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->canRead()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 623
    new-instance v0, Lcom/qihoo/antivirus/update/f;

    invoke-direct {v0, p1}, Lcom/qihoo/antivirus/update/f;-><init>(Ljava/io/File;)V

    .line 624
    iget v0, v0, Lcom/qihoo/antivirus/update/f;->d:I

    if-ne v0, p2, :cond_0

    .line 625
    const/4 v0, 0x1

    .line 628
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Ljava/io/File;)[Ljava/io/File;
    .locals 2

    .prologue
    .line 652
    new-instance v0, Lcom/qihoo/antivirus/update/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qihoo/antivirus/update/d$a;-><init>(Lcom/qihoo/antivirus/update/d$a;)V

    invoke-virtual {p1, v0}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private b(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 57
    new-instance v0, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string/jumbo v2, "Update"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 58
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 59
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 64
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/antivirus/update/d;->i:Ljava/lang/String;

    .line 65
    invoke-static {p1}, Lcom/qihoo/antivirus/update/af;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/antivirus/update/d;->b:Ljava/lang/String;

    .line 66
    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/antivirus/update/d;->j:Ljava/lang/String;

    .line 67
    return-void

    .line 60
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_0

    .line 61
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 62
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    goto :goto_0
.end method

.method private c(Lcom/qihoo/antivirus/update/ab;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 357
    .line 358
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 359
    invoke-interface {p1}, Lcom/qihoo/antivirus/update/ab;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v1

    .line 363
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 364
    invoke-interface {p1}, Lcom/qihoo/antivirus/update/ab;->c()Ljava/lang/String;

    move-result-object v1

    .line 368
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    iget-object v1, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo/antivirus/update/x;->g(Landroid/content/Context;)Ljava/lang/String;

    .line 377
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private g(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 109
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    const-string/jumbo v1, "timestamp"

    invoke-static {v0, v1, p1}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    return-void
.end method

.method private h(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 531
    invoke-static {p1}, Lcom/qihoo/antivirus/update/af;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private l()V
    .locals 2

    .prologue
    .line 184
    new-instance v0, Lcom/qihoo/antivirus/update/v;

    invoke-direct {v0, p0}, Lcom/qihoo/antivirus/update/v;-><init>(Lcom/qihoo/antivirus/update/d;)V

    iput-object v0, p0, Lcom/qihoo/antivirus/update/d;->o:Lcom/qihoo/antivirus/update/v;

    .line 185
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->o:Lcom/qihoo/antivirus/update/v;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/antivirus/update/v;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 186
    return-void
.end method

.method private m()Z
    .locals 2

    .prologue
    .line 263
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->e:Lcom/qihoo/antivirus/update/u;

    if-eqz v0, :cond_0

    .line 264
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->g:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 265
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->d:Lcom/qihoo/antivirus/update/ad;

    const-string/jumbo v1, "version"

    invoke-virtual {v0, v1}, Lcom/qihoo/antivirus/update/ad;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 266
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 270
    iget-object v1, p0, Lcom/qihoo/antivirus/update/d;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    .line 271
    const/4 v0, 0x1

    .line 281
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private n()V
    .locals 2

    .prologue
    .line 523
    const-string/jumbo v0, "Update"

    const-string/jumbo v1, "version"

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 525
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 526
    invoke-virtual {p0}, Lcom/qihoo/antivirus/update/d;->k()V

    .line 528
    :cond_0
    return-void
.end method

.method private o()Ljava/lang/String;
    .locals 2

    .prologue
    .line 832
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string/jumbo v1, "yyyy.MM.dd HH:mm:ss"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .prologue
    .line 74
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    const-string/jumbo v1, "product"

    invoke-static {v0, v1}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 75
    if-nez v0, :cond_0

    .line 76
    const-string/jumbo v0, "MyUpdate"

    .line 78
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    const-string/jumbo v0, "_"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    const-string/jumbo v0, "%s"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    const-string/jumbo v0, ".apk"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 84
    new-instance v1, Ljava/io/File;

    sget-object v2, Lcom/qihoo/antivirus/update/d;->b:Ljava/lang/String;

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->j:Ljava/lang/String;

    return-object v0
.end method

.method public a(I)Ljava/lang/String;
    .locals 11

    .prologue
    .line 658
    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v0, 0x100

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 661
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 662
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->a:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 665
    :cond_0
    const-string/jumbo v0, "sdk="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 666
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 667
    const-string/jumbo v0, "\r\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 668
    const-string/jumbo v0, "updscene="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 669
    sget v0, Lcom/qihoo/antivirus/update/UpdateService;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_11

    .line 670
    const-string/jumbo v0, "2"

    .line 674
    :goto_0
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 675
    const-string/jumbo v0, "\r\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 676
    const-string/jumbo v0, "updsetting=1\r\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 679
    sget-object v0, Lcom/qihoo/antivirus/update/UpdateService;->e:Ljava/lang/String;

    sput-object v0, Lcom/qihoo/antivirus/update/a;->a:Ljava/lang/String;

    .line 681
    const-string/jumbo v0, "pkg="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 682
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 683
    const-string/jumbo v0, "\r\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 685
    const-string/jumbo v0, "connect_type="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 686
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 687
    const-string/jumbo v0, "\r\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 689
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    const-string/jumbo v1, "local_pkg_version"

    invoke-static {v0, v1}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/antivirus/update/d;->g:Ljava/lang/String;

    .line 690
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->g:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 691
    const-string/jumbo v0, "ver="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 692
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->g:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 693
    const-string/jumbo v0, "\r\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 697
    :cond_1
    const/4 v0, 0x0

    .line 698
    iget-object v1, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 699
    if-eqz v1, :cond_3

    .line 701
    :try_start_0
    iget-object v2, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    .line 702
    iget-object v2, p0, Lcom/qihoo/antivirus/update/d;->g:Ljava/lang/String;

    if-nez v2, :cond_2

    .line 703
    const-string/jumbo v2, "ver="

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 704
    iget-object v2, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v2, p0, Lcom/qihoo/antivirus/update/d;->g:Ljava/lang/String;

    .line 705
    iget-object v2, p0, Lcom/qihoo/antivirus/update/d;->g:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 706
    const-string/jumbo v2, "\r\n"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 709
    :cond_2
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->publicSourceDir:Ljava/lang/String;

    .line 710
    invoke-direct {p0, v1}, Lcom/qihoo/antivirus/update/d;->h(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 725
    :cond_3
    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 726
    const/4 v1, 0x0

    .line 727
    iget-object v2, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/qihoo/antivirus/update/d;->a(Ljava/io/File;)[Ljava/io/File;

    move-result-object v5

    .line 728
    if-eqz v5, :cond_4

    array-length v2, v5

    if-lez v2, :cond_4

    .line 729
    array-length v6, v5

    const/4 v2, 0x0

    :goto_2
    if-lt v2, v6, :cond_12

    :cond_4
    move v2, v1

    .line 751
    if-gtz v2, :cond_5

    if-eqz v0, :cond_9

    .line 752
    :cond_5
    const-string/jumbo v1, "file_infos="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 753
    const/4 v1, 0x0

    .line 754
    if-lez v2, :cond_6

    .line 755
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 756
    const/4 v1, 0x1

    .line 758
    :cond_6
    if-eqz v0, :cond_8

    .line 759
    if-eqz v1, :cond_7

    .line 760
    const-string/jumbo v1, "|"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 762
    :cond_7
    iget-object v1, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 763
    const-string/jumbo v1, ":"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 764
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 765
    const-string/jumbo v0, ","

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 766
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->g:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 768
    :cond_8
    const-string/jumbo v0, "\r\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 771
    :cond_9
    const-string/jumbo v0, "date="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 772
    invoke-direct {p0}, Lcom/qihoo/antivirus/update/d;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 773
    const-string/jumbo v0, "\r\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 774
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/antivirus/update/af;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 775
    if-eqz v0, :cond_a

    .line 776
    const-string/jumbo v1, "imei="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 777
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 778
    const-string/jumbo v0, "\r\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 780
    :cond_a
    const-string/jumbo v0, "/data"

    invoke-static {v0}, Lcom/qihoo/antivirus/update/af;->d(Ljava/lang/String;)J

    move-result-wide v0

    .line 781
    const-wide/32 v4, 0x100000

    div-long/2addr v0, v4

    .line 782
    const-wide/16 v4, 0x0

    cmp-long v2, v0, v4

    if-ltz v2, :cond_b

    .line 783
    const-string/jumbo v2, "free_disk="

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 784
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 785
    const-string/jumbo v0, "\r\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 787
    :cond_b
    invoke-static {}, Lcom/qihoo/antivirus/update/af;->a()J

    move-result-wide v0

    .line 788
    const-wide/16 v4, 0x0

    cmp-long v2, v0, v4

    if-lez v2, :cond_c

    .line 789
    const-string/jumbo v2, "cpu="

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 790
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 791
    const-string/jumbo v0, "\r\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 793
    :cond_c
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/antivirus/update/af;->a(Landroid/content/Context;)Z

    move-result v0

    .line 794
    const-string/jumbo v1, "wifi="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 795
    if-eqz v0, :cond_14

    const-string/jumbo v0, "1"

    :goto_3
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 796
    const-string/jumbo v0, "\r\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 797
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    .line 798
    if-eqz v0, :cond_d

    .line 799
    const-string/jumbo v1, "brand="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 800
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 801
    const-string/jumbo v0, "\r\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 803
    :cond_d
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 804
    if-eqz v0, :cond_e

    .line 805
    const-string/jumbo v1, "model="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 806
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 807
    const-string/jumbo v0, "\r\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 809
    :cond_e
    sget-object v0, Lcom/qihoo/antivirus/update/d;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/qihoo/antivirus/update/af;->d(Ljava/lang/String;)J

    move-result-wide v0

    .line 810
    const-wide/32 v4, 0x100000

    div-long/2addr v0, v4

    .line 811
    const-wide/16 v4, 0x0

    cmp-long v2, v0, v4

    if-ltz v2, :cond_f

    .line 812
    const-string/jumbo v2, "free_disk_x="

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 813
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 814
    const-string/jumbo v0, "\r\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 817
    :cond_f
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/antivirus/update/k;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 818
    if-eqz v0, :cond_10

    .line 819
    const-string/jumbo v1, "wid="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 820
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 821
    const-string/jumbo v0, "\r\n"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 824
    :cond_10
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 828
    return-object v0

    .line 672
    :cond_11
    const-string/jumbo v0, "0"

    goto/16 :goto_0

    .line 729
    :cond_12
    aget-object v7, v5, v2

    .line 733
    new-instance v8, Lcom/qihoo/antivirus/update/f;

    invoke-direct {v8, v7}, Lcom/qihoo/antivirus/update/f;-><init>(Ljava/io/File;)V

    .line 737
    iget v9, v8, Lcom/qihoo/antivirus/update/f;->d:I

    .line 738
    if-ltz v9, :cond_13

    .line 739
    add-int/lit8 v1, v1, 0x1

    .line 740
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    invoke-direct {p0, v7}, Lcom/qihoo/antivirus/update/d;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 741
    const-string/jumbo v10, "|"

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 742
    iget-object v8, v8, Lcom/qihoo/antivirus/update/f;->a:Ljava/lang/String;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 743
    const-string/jumbo v8, ":"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 744
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 745
    const-string/jumbo v7, ","

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 746
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 729
    :cond_13
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_2

    .line 795
    :cond_14
    const-string/jumbo v0, "0"

    goto/16 :goto_3

    .line 714
    :catch_0
    move-exception v1

    goto/16 :goto_1
.end method

.method public a(ILjava/lang/String;)V
    .locals 1

    .prologue
    .line 345
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    if-eqz v0, :cond_0

    .line 346
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    invoke-interface {v0, p1, p2}, Lcom/qihoo/antivirus/update/ac;->b(ILjava/lang/String;)V

    .line 348
    :cond_0
    return-void
.end method

.method public a(JJ)V
    .locals 1

    .prologue
    .line 257
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    if-eqz v0, :cond_0

    .line 258
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/qihoo/antivirus/update/ac;->b(JJ)V

    .line 260
    :cond_0
    return-void
.end method

.method public a(Lcom/qihoo/antivirus/update/ab;)V
    .locals 2

    .prologue
    .line 321
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    if-eqz v0, :cond_0

    .line 322
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    invoke-direct {p0, p1}, Lcom/qihoo/antivirus/update/d;->c(Lcom/qihoo/antivirus/update/ab;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qihoo/antivirus/update/ac;->e(Ljava/lang/String;)V

    .line 324
    :cond_0
    return-void
.end method

.method public a(Lcom/qihoo/antivirus/update/ac;)V
    .locals 4

    .prologue
    .line 236
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    const-string/jumbo v1, "last_checkupdate_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 237
    iput-object p1, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    .line 238
    new-instance v0, Lcom/qihoo/antivirus/update/o;

    invoke-direct {v0, p0}, Lcom/qihoo/antivirus/update/o;-><init>(Lcom/qihoo/antivirus/update/d;)V

    iput-object v0, p0, Lcom/qihoo/antivirus/update/d;->n:Lcom/qihoo/antivirus/update/o;

    .line 239
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->n:Lcom/qihoo/antivirus/update/o;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lcom/qihoo/antivirus/update/o;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 240
    return-void
.end method

.method public a(Lcom/qihoo/antivirus/update/u;)V
    .locals 0

    .prologue
    .line 848
    iput-object p1, p0, Lcom/qihoo/antivirus/update/d;->e:Lcom/qihoo/antivirus/update/u;

    .line 849
    return-void
.end method

.method public a(Ljava/io/File;Ljava/io/File;IIII)V
    .locals 7

    .prologue
    .line 836
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    if-eqz v0, :cond_0

    .line 837
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/qihoo/antivirus/update/ac;->a(Ljava/lang/String;Ljava/lang/String;IIII)V

    .line 839
    :cond_0
    return-void
.end method

.method public a(Ljava/io/File;Z)V
    .locals 2

    .prologue
    .line 842
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    if-eqz v0, :cond_0

    .line 843
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p2}, Lcom/qihoo/antivirus/update/ac;->a(Ljava/lang/String;Z)V

    .line 845
    :cond_0
    return-void
.end method

.method a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 113
    if-eqz p2, :cond_0

    .line 114
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->d:Lcom/qihoo/antivirus/update/ad;

    invoke-virtual {v0, p1, p2}, Lcom/qihoo/antivirus/update/ad;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 120
    if-eqz p3, :cond_0

    .line 121
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->d:Lcom/qihoo/antivirus/update/ad;

    invoke-virtual {v0, p2, p3}, Lcom/qihoo/antivirus/update/ad;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    :cond_0
    return-void
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/antivirus/update/s;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 146
    iput-object p1, p0, Lcom/qihoo/antivirus/update/d;->k:Ljava/util/ArrayList;

    .line 147
    return-void
.end method

.method public a(Z)V
    .locals 2

    .prologue
    .line 192
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/antivirus/update/d;->o:Lcom/qihoo/antivirus/update/v;

    .line 194
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->d:Lcom/qihoo/antivirus/update/ad;

    const-string/jumbo v1, "timestamp"

    invoke-virtual {v0, v1}, Lcom/qihoo/antivirus/update/ad;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 195
    if-eqz v0, :cond_0

    .line 196
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_1

    const-string/jumbo v0, "B"

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 197
    invoke-direct {p0, v0}, Lcom/qihoo/antivirus/update/d;->g(Ljava/lang/String;)V

    .line 201
    :cond_0
    iget-boolean v0, p0, Lcom/qihoo/antivirus/update/d;->f:Z

    invoke-virtual {p0, v0, p1}, Lcom/qihoo/antivirus/update/d;->a(ZZ)V

    .line 202
    return-void

    .line 196
    :cond_1
    const-string/jumbo v0, "A"

    goto :goto_0
.end method

.method public a(ZLcom/qihoo/antivirus/update/y;)V
    .locals 9

    .prologue
    const/4 v4, 0x3

    .line 389
    iput-object p2, p0, Lcom/qihoo/antivirus/update/d;->r:Lcom/qihoo/antivirus/update/y;

    .line 391
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->p:Lcom/qihoo/antivirus/update/c;

    if-nez v0, :cond_1

    .line 392
    invoke-direct {p0}, Lcom/qihoo/antivirus/update/d;->n()V

    .line 394
    const-string/jumbo v0, "Update"

    const-string/jumbo v1, "version"

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 398
    if-eqz p1, :cond_2

    .line 399
    const-string/jumbo v0, "Update"

    const-string/jumbo v2, "patchurl"

    invoke-virtual {p0, v0, v2}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 400
    const-string/jumbo v0, "Update"

    const-string/jumbo v2, "patchmd5"

    invoke-virtual {p0, v0, v2}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 401
    const-string/jumbo v0, "Update"

    const-string/jumbo v2, "patchsize"

    invoke-virtual {p0, v0, v2}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 407
    :goto_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 411
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, "96"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 412
    iget-object v1, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/qihoo/antivirus/update/ai;->a(Ljava/lang/String;Landroid/content/Context;)V

    .line 437
    :cond_1
    :goto_1
    return-void

    .line 403
    :cond_2
    const-string/jumbo v0, "Update"

    const-string/jumbo v2, "url"

    invoke-virtual {p0, v0, v2}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 404
    const-string/jumbo v0, "Update"

    const-string/jumbo v2, "md5"

    invoke-virtual {p0, v0, v2}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 405
    const-string/jumbo v0, "Update"

    const-string/jumbo v2, "size"

    invoke-virtual {p0, v0, v2}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 416
    :cond_3
    const-wide/16 v6, 0x0

    invoke-static {v0, v6, v7}, Lcom/qihoo/antivirus/update/af;->a(Ljava/lang/String;J)J

    move-result-wide v6

    .line 417
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 418
    sget-object v0, Lcom/qihoo/antivirus/update/d;->b:Ljava/lang/String;

    if-eqz v0, :cond_4

    .line 419
    invoke-virtual {p0, v1}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    .line 420
    new-instance v1, Lcom/qihoo/antivirus/update/c;

    move-object v2, p0

    move v8, p1

    invoke-direct/range {v1 .. v8}, Lcom/qihoo/antivirus/update/c;-><init>(Lcom/qihoo/antivirus/update/d;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZ)V

    iput-object v1, p0, Lcom/qihoo/antivirus/update/d;->p:Lcom/qihoo/antivirus/update/c;

    .line 421
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->p:Lcom/qihoo/antivirus/update/c;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/antivirus/update/c;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_1

    .line 426
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, "98"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 427
    iget-object v1, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/qihoo/antivirus/update/ai;->a(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_1

    .line 433
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, "97"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 434
    iget-object v1, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/qihoo/antivirus/update/ai;->a(Ljava/lang/String;Landroid/content/Context;)V

    goto/16 :goto_1
.end method

.method public a(ZZ)V
    .locals 1

    .prologue
    .line 327
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    if-eqz v0, :cond_0

    .line 328
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    invoke-interface {v0, p1, p2}, Lcom/qihoo/antivirus/update/ac;->a(ZZ)V

    .line 330
    :cond_0
    return-void
.end method

.method public b(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .prologue
    .line 211
    .line 212
    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 217
    :goto_0
    return-object v0

    .line 215
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lcom/qihoo/antivirus/update/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 88
    sget-object v0, Lcom/qihoo/antivirus/update/d;->i:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 127
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->d:Lcom/qihoo/antivirus/update/ad;

    invoke-virtual {v0, p2}, Lcom/qihoo/antivirus/update/ad;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(ILjava/lang/String;)V
    .locals 1

    .prologue
    .line 351
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->r:Lcom/qihoo/antivirus/update/y;

    if-eqz v0, :cond_0

    .line 352
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->r:Lcom/qihoo/antivirus/update/y;

    invoke-interface {v0, p1, p2}, Lcom/qihoo/antivirus/update/y;->a(ILjava/lang/String;)V

    .line 354
    :cond_0
    return-void
.end method

.method public b(JJ)V
    .locals 1

    .prologue
    .line 333
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->r:Lcom/qihoo/antivirus/update/y;

    if-eqz v0, :cond_0

    .line 334
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->r:Lcom/qihoo/antivirus/update/y;

    invoke-interface {v0, p1, p2, p3, p4}, Lcom/qihoo/antivirus/update/y;->a(JJ)V

    .line 336
    :cond_0
    return-void
.end method

.method public b(Lcom/qihoo/antivirus/update/ab;)V
    .locals 2

    .prologue
    .line 339
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->r:Lcom/qihoo/antivirus/update/y;

    if-eqz v0, :cond_0

    .line 340
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->r:Lcom/qihoo/antivirus/update/y;

    invoke-direct {p0, p1}, Lcom/qihoo/antivirus/update/d;->c(Lcom/qihoo/antivirus/update/ab;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qihoo/antivirus/update/y;->a(Ljava/lang/String;)V

    .line 342
    :cond_0
    return-void
.end method

.method public b(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/antivirus/update/q;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 154
    iput-object p1, p0, Lcom/qihoo/antivirus/update/d;->m:Ljava/util/ArrayList;

    .line 163
    return-void
.end method

.method public c()J
    .locals 2

    .prologue
    .line 92
    iget-wide v0, p0, Lcom/qihoo/antivirus/update/d;->l:J

    return-wide v0
.end method

.method public c(Ljava/lang/String;)Ljava/io/File;
    .locals 3

    .prologue
    .line 227
    const/4 v0, 0x0

    .line 228
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    .line 229
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 230
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lcom/qihoo/antivirus/update/d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 232
    :cond_0
    return-object v0
.end method

.method public c(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/antivirus/update/s;",
            ">;)",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/antivirus/update/s;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    const/4 v5, 0x1

    .line 543
    if-eqz p1, :cond_6

    .line 544
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    .line 545
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 546
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_0
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 598
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    move-object v0, v3

    .line 617
    :goto_1
    return-object v0

    .line 546
    :cond_1
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/antivirus/update/s;

    .line 550
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/s;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 551
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/s;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v2, ".patch"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 552
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/s;->d()Ljava/lang/String;

    move-result-object v1

    .line 559
    :goto_2
    const/4 v6, 0x0

    .line 560
    invoke-virtual {p0, v2}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 564
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 566
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v9

    .line 567
    iget-object v10, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    invoke-static {v10, v9}, Lcom/qihoo/antivirus/update/af;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v9

    .line 568
    if-eqz v9, :cond_7

    .line 569
    invoke-static {v9}, Lcom/qihoo/antivirus/update/d;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v9

    .line 570
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_7

    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    move v1, v5

    .line 590
    :goto_3
    if-nez v1, :cond_2

    .line 591
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/s;->j()I

    move-result v1

    invoke-direct {p0, v2, v1}, Lcom/qihoo/antivirus/update/d;->a(Ljava/io/File;I)Z

    move-result v1

    .line 594
    :cond_2
    if-nez v1, :cond_0

    .line 595
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 554
    :cond_3
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/s;->b()Ljava/lang/String;

    move-result-object v2

    .line 555
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/s;->g()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    .line 579
    :cond_4
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v9

    if-eqz v9, :cond_7

    .line 580
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    invoke-direct {p0, v9}, Lcom/qihoo/antivirus/update/d;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 581
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_7

    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    move v1, v5

    .line 582
    goto :goto_3

    :cond_5
    move-object v0, v4

    .line 611
    goto/16 :goto_1

    :cond_6
    move-object v0, v3

    .line 617
    goto/16 :goto_1

    :cond_7
    move v1, v6

    goto :goto_3
.end method

.method public d()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/qihoo/antivirus/update/s;",
            ">;"
        }
    .end annotation

    .prologue
    .line 96
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->k:Ljava/util/ArrayList;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 309
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    if-eqz v0, :cond_0

    .line 310
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    invoke-interface {v0, p1}, Lcom/qihoo/antivirus/update/ac;->c(Ljava/lang/String;)V

    .line 312
    :cond_0
    return-void
.end method

.method public e()Landroid/content/Context;
    .locals 1

    .prologue
    .line 100
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 315
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    if-eqz v0, :cond_0

    .line 316
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    invoke-interface {v0, p1}, Lcom/qihoo/antivirus/update/ac;->d(Ljava/lang/String;)V

    .line 318
    :cond_0
    return-void
.end method

.method public f()V
    .locals 2

    .prologue
    .line 166
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->m:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 167
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 177
    :cond_0
    return-void

    .line 167
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/antivirus/update/q;

    .line 168
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/q;->a()Ljava/lang/String;

    move-result-object v0

    .line 173
    invoke-virtual {p0, v0}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 174
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_0
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 381
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/antivirus/update/d;->p:Lcom/qihoo/antivirus/update/c;

    .line 383
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->r:Lcom/qihoo/antivirus/update/y;

    if-eqz v0, :cond_0

    .line 384
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->r:Lcom/qihoo/antivirus/update/y;

    invoke-interface {v0, p1}, Lcom/qihoo/antivirus/update/y;->b(Ljava/lang/String;)V

    .line 386
    :cond_0
    return-void
.end method

.method public g()Lcom/qihoo/antivirus/update/ad;
    .locals 1

    .prologue
    .line 180
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->d:Lcom/qihoo/antivirus/update/ad;

    return-object v0
.end method

.method public h()V
    .locals 8

    .prologue
    const-wide/16 v6, 0x0

    .line 285
    invoke-virtual {p0}, Lcom/qihoo/antivirus/update/d;->i()I

    move-result v0

    .line 286
    invoke-direct {p0}, Lcom/qihoo/antivirus/update/d;->m()Z

    move-result v1

    iput-boolean v1, p0, Lcom/qihoo/antivirus/update/d;->f:Z

    .line 288
    iget-object v1, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    if-eqz v1, :cond_0

    .line 289
    iget-object v1, p0, Lcom/qihoo/antivirus/update/d;->q:Lcom/qihoo/antivirus/update/ac;

    invoke-interface {v1, v0}, Lcom/qihoo/antivirus/update/ac;->a(I)V

    .line 291
    :cond_0
    if-lez v0, :cond_3

    .line 292
    iput-wide v6, p0, Lcom/qihoo/antivirus/update/d;->l:J

    .line 293
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 301
    invoke-direct {p0}, Lcom/qihoo/antivirus/update/d;->l()V

    .line 305
    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/antivirus/update/d;->n:Lcom/qihoo/antivirus/update/o;

    .line 306
    return-void

    .line 293
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/antivirus/update/s;

    .line 295
    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/s;->e()J

    move-result-wide v2

    cmp-long v2, v2, v6

    if-eqz v2, :cond_2

    .line 296
    iget-wide v2, p0, Lcom/qihoo/antivirus/update/d;->l:J

    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/s;->e()J

    move-result-wide v4

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/qihoo/antivirus/update/d;->l:J

    goto :goto_0

    .line 298
    :cond_2
    iget-wide v2, p0, Lcom/qihoo/antivirus/update/d;->l:J

    invoke-virtual {v0}, Lcom/qihoo/antivirus/update/s;->h()J

    move-result-wide v4

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/qihoo/antivirus/update/d;->l:J

    goto :goto_0

    .line 303
    :cond_3
    if-lez v0, :cond_4

    const/4 v0, 0x1

    :goto_2
    invoke-virtual {p0, v0}, Lcom/qihoo/antivirus/update/d;->a(Z)V

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    goto :goto_2
.end method

.method public i()I
    .locals 1

    .prologue
    .line 441
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->k:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 442
    iget-object v0, p0, Lcom/qihoo/antivirus/update/d;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 444
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public j()V
    .locals 12

    .prologue
    .line 449
    iget-object v1, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    .line 450
    const-string/jumbo v0, "Update"

    const-string/jumbo v2, "version"

    invoke-virtual {p0, v0, v2}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 451
    const-string/jumbo v0, "Update"

    const-string/jumbo v3, "versioncode"

    invoke-virtual {p0, v0, v3}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 452
    const-string/jumbo v0, "Update"

    const-string/jumbo v4, "force"

    invoke-virtual {p0, v0, v4}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 453
    const-string/jumbo v0, "Update"

    const-string/jumbo v5, "description"

    invoke-virtual {p0, v0, v5}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 454
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 455
    const-string/jumbo v5, "\n"

    const-string/jumbo v6, "\\\\n"

    invoke-virtual {v0, v5, v6}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 457
    :cond_0
    const-string/jumbo v5, "Update"

    const-string/jumbo v6, "url"

    invoke-virtual {p0, v5, v6}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 458
    const-string/jumbo v6, "Update"

    const-string/jumbo v7, "size"

    invoke-virtual {p0, v6, v7}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 459
    const-string/jumbo v7, "Update"

    const-string/jumbo v8, "md5"

    invoke-virtual {p0, v7, v8}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 461
    const-string/jumbo v8, "Update"

    const-string/jumbo v9, "patchurl"

    invoke-virtual {p0, v8, v9}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 462
    const-string/jumbo v9, "Update"

    const-string/jumbo v10, "patchsize"

    invoke-virtual {p0, v9, v10}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 463
    const-string/jumbo v10, "Update"

    const-string/jumbo v11, "patchmd5"

    invoke-virtual {p0, v10, v11}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 467
    const-string/jumbo v11, "version"

    invoke-static {v1, v11, v2}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 468
    const-string/jumbo v2, "versioncode"

    invoke-static {v1, v2, v3}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 469
    const-string/jumbo v2, "force"

    invoke-static {v1, v2, v4}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 470
    const-string/jumbo v2, "description"

    invoke-static {v1, v2, v0}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 472
    const-string/jumbo v0, "url"

    invoke-static {v1, v0, v5}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 473
    const-string/jumbo v0, "size"

    invoke-static {v1, v0, v6}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    const-string/jumbo v0, "md5"

    invoke-static {v1, v0, v7}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 476
    const-string/jumbo v0, "patchurl"

    invoke-static {v1, v0, v8}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 477
    const-string/jumbo v0, "patchsize"

    invoke-static {v1, v0, v9}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 478
    const-string/jumbo v0, "patchmd5"

    invoke-static {v1, v0, v10}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 479
    return-void
.end method

.method public k()V
    .locals 12

    .prologue
    .line 483
    iget-object v1, p0, Lcom/qihoo/antivirus/update/d;->c:Landroid/content/Context;

    .line 484
    const-string/jumbo v0, "version"

    invoke-static {v1, v0}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 485
    const-string/jumbo v0, "versioncode"

    invoke-static {v1, v0}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 486
    const-string/jumbo v0, "force"

    invoke-static {v1, v0}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 487
    const-string/jumbo v0, "description"

    invoke-static {v1, v0}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 488
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 489
    const-string/jumbo v5, "\\\\n"

    const-string/jumbo v6, "\n"

    invoke-virtual {v0, v5, v6}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 491
    :cond_0
    const-string/jumbo v5, "url"

    invoke-static {v1, v5}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 492
    const-string/jumbo v6, "size"

    invoke-static {v1, v6}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 493
    const-string/jumbo v7, "md5"

    invoke-static {v1, v7}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 495
    const-string/jumbo v8, "patchurl"

    invoke-static {v1, v8}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 496
    const-string/jumbo v9, "patchsize"

    invoke-static {v1, v9}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 497
    const-string/jumbo v10, "patchmd5"

    invoke-static {v1, v10}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 505
    const-string/jumbo v10, "Update"

    const-string/jumbo v11, "version"

    invoke-virtual {p0, v10, v11, v2}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    if-eqz v3, :cond_1

    .line 507
    const-string/jumbo v2, "Update"

    const-string/jumbo v10, "versioncode"

    invoke-virtual {p0, v2, v10, v3}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 509
    :cond_1
    const-string/jumbo v2, "Update"

    const-string/jumbo v3, "url"

    invoke-virtual {p0, v2, v3, v5}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 510
    const-string/jumbo v2, "Update"

    const-string/jumbo v3, "size"

    invoke-virtual {p0, v2, v3, v6}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 511
    const-string/jumbo v2, "Update"

    const-string/jumbo v3, "md5"

    invoke-virtual {p0, v2, v3, v7}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 513
    const-string/jumbo v2, "Update"

    const-string/jumbo v3, "patchurl"

    invoke-virtual {p0, v2, v3, v8}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 514
    const-string/jumbo v2, "Update"

    const-string/jumbo v3, "patchsize"

    invoke-virtual {p0, v2, v3, v9}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 515
    const-string/jumbo v2, "Update"

    const-string/jumbo v3, "patchmd5"

    invoke-virtual {p0, v2, v3, v1}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 517
    const-string/jumbo v1, "Update"

    const-string/jumbo v2, "force"

    invoke-virtual {p0, v1, v2, v4}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 518
    const-string/jumbo v1, "Update"

    const-string/jumbo v2, "description"

    invoke-virtual {p0, v1, v2, v0}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 519
    return-void
.end method
