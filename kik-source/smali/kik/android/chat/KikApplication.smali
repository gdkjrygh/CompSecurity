.class public Lkik/android/chat/KikApplication;
.super Landroid/app/Application;
.source "SourceFile"

# interfaces
.implements Lkik/android/chat/a;


# static fields
.field public static final a:Ljava/lang/String;

.field private static final j:Lorg/c/b;

.field private static k:Lkik/android/chat/KikApplication;

.field private static l:Lkik/android/KikNotificationHandler;

.field private static m:F

.field private static n:Ljava/lang/String;

.field private static o:J


# instance fields
.field private A:Lkik/a/e/v;

.field private B:Lcom/kik/l/ab;

.field private C:Lkik/a/e/f;

.field private D:Lkik/a/f/k;

.field private E:Lkik/a/e/w;

.field private F:Lkik/a/e/b;

.field private G:Lcom/kik/e/a;

.field private H:Lkik/a/ab;

.field private I:Lkik/a/e/k;

.field private J:Lkik/a/e/j;

.field private K:Lkik/a/x;

.field private L:I

.field private M:I

.field private N:Landroid/app/Activity;

.field private O:Lcom/kik/cards/util/a;

.field private volatile P:Ljava/lang/String;

.field private Q:Ljava/util/Timer;

.field private R:Ljava/util/TimerTask;

.field private S:Lkik/android/util/bo;

.field private T:Lkik/android/a/b;

.field private U:Lkik/android/b/j;

.field private V:Lkik/android/b/a;

.field private W:Lcom/kik/g/l;

.field private X:Landroid/os/Handler;

.field private Y:Lcom/kik/g/k;

.field private Z:Lcom/kik/g/p;

.field private aa:Lcom/kik/g/k;

.field private ab:Z

.field private ac:Lkik/android/util/ce;

.field private ad:Lkik/a/e/q;

.field private final ae:Lcom/kik/g/i;

.field private final af:Lcom/kik/g/i;

.field private ag:Lcom/kik/g/i;

.field private ah:Lcom/kik/g/i;

.field private ai:Lcom/kik/g/i;

.field private aj:Lcom/kik/g/i;

.field private ak:Lcom/kik/g/i;

.field private al:Lcom/kik/g/i;

.field private am:Lcom/kik/g/i;

.field private an:Lcom/kik/g/i;

.field private ao:Lcom/kik/g/i;

.field private ap:Lcom/kik/g/i;

.field private aq:Lcom/kik/g/i;

.field private ar:Lcom/kik/g/i;

.field private as:Lcom/kik/g/i;

.field private at:Lcom/kik/g/r;

.field private au:Ljava/util/TimerTask;

.field protected b:Lcom/kik/android/a;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected c:Lcom/kik/android/c/f;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected d:Lkik/android/chat/b/d;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected e:Lkik/android/util/ck;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected f:Lcom/kik/cache/ad;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    .annotation runtime Ljavax/inject/Named;
        value = "CardImageLoader"
    .end annotation
.end field

.field protected g:Lkik/android/util/bj;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected h:Lkik/a/c/c;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field i:Lkik/a/a/c;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field private final p:Lcom/kik/g/f;

.field private final q:Ljava/lang/Object;

.field private r:Lkik/a/e/i;

.field private s:Lkik/a/e/r;

.field private t:Landroid/os/HandlerThread;

.field private u:Ljava/util/Timer;

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Landroid/app/Activity;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 166
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lkik/android/chat/KikApplication;->a:Ljava/lang/String;

    .line 171
    const-string v0, "KikApplication"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/chat/KikApplication;->j:Lorg/c/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 598
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 182
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->p:Lcom/kik/g/f;

    .line 183
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->q:Ljava/lang/Object;

    .line 186
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "MetricsHandler"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->t:Landroid/os/HandlerThread;

    .line 187
    new-instance v0, Ljava/util/Timer;

    const-string v1, "TeardownFail"

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->u:Ljava/util/Timer;

    .line 188
    iput-boolean v2, p0, Lkik/android/chat/KikApplication;->v:Z

    .line 189
    iput-boolean v2, p0, Lkik/android/chat/KikApplication;->w:Z

    .line 190
    iput-boolean v2, p0, Lkik/android/chat/KikApplication;->x:Z

    .line 191
    iput-object v4, p0, Lkik/android/chat/KikApplication;->y:Landroid/app/Activity;

    .line 192
    iput-boolean v3, p0, Lkik/android/chat/KikApplication;->z:Z

    .line 206
    iput v3, p0, Lkik/android/chat/KikApplication;->L:I

    .line 207
    iput v3, p0, Lkik/android/chat/KikApplication;->M:I

    .line 211
    iput-object v4, p0, Lkik/android/chat/KikApplication;->P:Ljava/lang/String;

    .line 215
    new-instance v0, Ljava/util/Timer;

    const-string v1, "BackgroundTimer"

    invoke-direct {v0, v1}, Ljava/util/Timer;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->Q:Ljava/util/Timer;

    .line 216
    iput-object v4, p0, Lkik/android/chat/KikApplication;->R:Ljava/util/TimerTask;

    .line 226
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->Y:Lcom/kik/g/k;

    .line 238
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->aa:Lcom/kik/g/k;

    .line 239
    iput-boolean v2, p0, Lkik/android/chat/KikApplication;->ab:Z

    .line 243
    new-instance v0, Lkik/android/chat/b;

    invoke-direct {v0, p0}, Lkik/android/chat/b;-><init>(Lkik/android/chat/KikApplication;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->ae:Lcom/kik/g/i;

    .line 251
    new-instance v0, Lkik/android/chat/m;

    invoke-direct {v0, p0}, Lkik/android/chat/m;-><init>(Lkik/android/chat/KikApplication;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->af:Lcom/kik/g/i;

    .line 260
    new-instance v0, Lkik/android/chat/y;

    invoke-direct {v0, p0}, Lkik/android/chat/y;-><init>(Lkik/android/chat/KikApplication;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->ag:Lcom/kik/g/i;

    .line 279
    new-instance v0, Lkik/android/chat/z;

    invoke-direct {v0, p0}, Lkik/android/chat/z;-><init>(Lkik/android/chat/KikApplication;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->ah:Lcom/kik/g/i;

    .line 311
    new-instance v0, Lkik/android/chat/ab;

    invoke-direct {v0, p0}, Lkik/android/chat/ab;-><init>(Lkik/android/chat/KikApplication;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->ai:Lcom/kik/g/i;

    .line 340
    new-instance v0, Lkik/android/chat/ad;

    invoke-direct {v0, p0}, Lkik/android/chat/ad;-><init>(Lkik/android/chat/KikApplication;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->aj:Lcom/kik/g/i;

    .line 373
    new-instance v0, Lkik/android/chat/af;

    invoke-direct {v0, p0}, Lkik/android/chat/af;-><init>(Lkik/android/chat/KikApplication;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->ak:Lcom/kik/g/i;

    .line 400
    new-instance v0, Lkik/android/chat/ah;

    invoke-direct {v0, p0}, Lkik/android/chat/ah;-><init>(Lkik/android/chat/KikApplication;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->al:Lcom/kik/g/i;

    .line 408
    new-instance v0, Lkik/android/chat/ai;

    invoke-direct {v0, p0}, Lkik/android/chat/ai;-><init>(Lkik/android/chat/KikApplication;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->am:Lcom/kik/g/i;

    .line 462
    new-instance v0, Lkik/android/chat/c;

    invoke-direct {v0, p0}, Lkik/android/chat/c;-><init>(Lkik/android/chat/KikApplication;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->an:Lcom/kik/g/i;

    .line 472
    new-instance v0, Lkik/android/chat/d;

    invoke-direct {v0, p0}, Lkik/android/chat/d;-><init>(Lkik/android/chat/KikApplication;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->ao:Lcom/kik/g/i;

    .line 518
    new-instance v0, Lkik/android/chat/e;

    invoke-direct {v0, p0}, Lkik/android/chat/e;-><init>(Lkik/android/chat/KikApplication;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->ap:Lcom/kik/g/i;

    .line 541
    new-instance v0, Lkik/android/chat/f;

    invoke-direct {v0, p0}, Lkik/android/chat/f;-><init>(Lkik/android/chat/KikApplication;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->aq:Lcom/kik/g/i;

    .line 550
    new-instance v0, Lkik/android/chat/g;

    invoke-direct {v0, p0}, Lkik/android/chat/g;-><init>(Lkik/android/chat/KikApplication;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->ar:Lcom/kik/g/i;

    .line 559
    new-instance v0, Lkik/android/chat/h;

    invoke-direct {v0, p0}, Lkik/android/chat/h;-><init>(Lkik/android/chat/KikApplication;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->as:Lcom/kik/g/i;

    .line 572
    new-instance v0, Lkik/android/chat/i;

    invoke-direct {v0, p0}, Lkik/android/chat/i;-><init>(Lkik/android/chat/KikApplication;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->at:Lcom/kik/g/r;

    .line 587
    new-instance v0, Lkik/android/chat/j;

    invoke-direct {v0, p0}, Lkik/android/chat/j;-><init>(Lkik/android/chat/KikApplication;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->au:Ljava/util/TimerTask;

    .line 599
    sput-object p0, Lkik/android/chat/KikApplication;->k:Lkik/android/chat/KikApplication;

    .line 600
    return-void
.end method

.method public static a(I)I
    .locals 2

    .prologue
    .line 619
    int-to-float v0, p0

    sget v1, Lkik/android/chat/KikApplication;->m:F

    mul-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static varargs a(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 713
    sget-object v0, Lkik/android/chat/KikApplication;->k:Lkik/android/chat/KikApplication;

    invoke-virtual {v0}, Lkik/android/chat/KikApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 604
    const-string v0, "Kik/%s (Android %s) %s"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    sget-object v3, Lkik/android/chat/KikApplication;->n:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x1

    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aput-object p0, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lkik/android/chat/KikApplication;)Lkik/a/e/i;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->r:Lkik/a/e/i;

    return-object v0
.end method

.method private a(Landroid/content/Context;Lkik/a/a;)V
    .locals 21

    .prologue
    .line 797
    invoke-static {}, Lcom/kik/sdkutils/ab;->a()J

    move-result-wide v4

    .line 798
    const/4 v2, 0x0

    .line 799
    if-eqz p2, :cond_0

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->g()Z

    move-result v3

    if-nez v3, :cond_1

    .line 800
    :cond_0
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->K:Lkik/a/x;

    invoke-virtual {v2}, Lkik/a/x;->c()Lkik/a/a;

    move-result-object p2

    .line 801
    const/4 v2, 0x1

    .line 804
    :cond_1
    new-instance v3, Lkik/android/util/ce;

    sget-object v6, Lkik/android/chat/KikApplication;->k:Lkik/android/chat/KikApplication;

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/chat/KikApplication;->K:Lkik/a/x;

    invoke-virtual {v7}, Lkik/a/x;->b()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v3, v6, v7}, Lkik/android/util/ce;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    move-object/from16 v0, p0

    iput-object v3, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    .line 806
    invoke-static/range {p0 .. p0}, Lkik/android/util/DeviceUtils;->c(Landroid/content/Context;)I

    move-result v3

    move-object/from16 v0, p0

    iput v3, v0, Lkik/android/chat/KikApplication;->L:I

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    invoke-virtual {v3}, Lkik/android/util/ce;->b()Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v6, "kik.version.number"

    const/4 v7, 0x0

    invoke-interface {v3, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    move-object/from16 v0, p0

    iput v3, v0, Lkik/android/chat/KikApplication;->M:I

    invoke-direct/range {p0 .. p0}, Lkik/android/chat/KikApplication;->t()Z

    move-result v3

    if-eqz v3, :cond_3

    move-object/from16 v0, p0

    iget v3, v0, Lkik/android/chat/KikApplication;->M:I

    if-nez v3, :cond_2

    invoke-virtual/range {p0 .. p0}, Lkik/android/chat/KikApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-string v6, "KikPreferences"

    const/4 v7, 0x0

    invoke-virtual {v3, v6, v7}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    if-eqz v3, :cond_2

    const-string v6, "kik.version.number"

    const/4 v7, 0x0

    invoke-interface {v3, v6, v7}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    move-object/from16 v0, p0

    iput v3, v0, Lkik/android/chat/KikApplication;->M:I

    :cond_2
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    invoke-virtual {v3}, Lkik/android/util/ce;->b()Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    const-string v6, "kik.version.number"

    move-object/from16 v0, p0

    iget v7, v0, Lkik/android/chat/KikApplication;->L:I

    invoke-interface {v3, v6, v7}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 807
    :cond_3
    move-object/from16 v0, p0

    iget v3, v0, Lkik/android/chat/KikApplication;->M:I

    const/16 v6, 0x98

    if-ge v3, v6, :cond_4

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    invoke-virtual {v3}, Lkik/android/util/ce;->e()V

    new-instance v3, Lkik/android/chat/w;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lkik/android/chat/w;-><init>(Lkik/android/chat/KikApplication;)V

    invoke-virtual {v3}, Lkik/android/chat/w;->start()V

    .line 809
    :cond_4
    new-instance v13, Lcom/kik/j/q;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->K:Lkik/a/x;

    invoke-virtual {v3}, Lkik/a/x;->b()Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/io/File;

    invoke-virtual/range {p0 .. p0}, Lkik/android/chat/KikApplication;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v7

    iget-object v7, v7, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lkik/android/chat/KikApplication;->getExternalCacheDir()Ljava/io/File;

    move-result-object v7

    invoke-direct {v13, v3, v6, v7}, Lcom/kik/j/q;-><init>(Ljava/lang/String;Ljava/io/File;Ljava/io/File;)V

    .line 810
    invoke-virtual {v13}, Lcom/kik/j/q;->a()Lkik/a/e/q;

    move-result-object v3

    move-object/from16 v0, p0

    iput-object v3, v0, Lkik/android/chat/KikApplication;->ad:Lkik/a/e/q;

    .line 811
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->ad:Lkik/a/e/q;

    move-object/from16 v0, p1

    invoke-static {v0, v3}, Lcom/kik/m/k;->a(Landroid/content/Context;Lkik/a/e/q;)V

    .line 813
    if-eqz v2, :cond_5

    .line 814
    new-instance v2, Lkik/android/j;

    sget-object v3, Lkik/android/chat/KikApplication;->k:Lkik/android/chat/KikApplication;

    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/chat/KikApplication;->K:Lkik/a/x;

    invoke-virtual {v7}, Lkik/a/x;->b()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v0, p0

    iget-object v8, v0, Lkik/android/chat/KikApplication;->ad:Lkik/a/e/q;

    invoke-direct {v2, v3, v6, v7, v8}, Lkik/android/j;-><init>(Lkik/android/chat/KikApplication;Lkik/android/util/aq;Ljava/lang/String;Lkik/a/e/q;)V

    move-object/from16 v0, p2

    invoke-virtual {v0, v2}, Lkik/a/a;->a(Lkik/a/c;)V

    .line 815
    invoke-static {}, Lcom/kik/sdkutils/ab;->a()J

    move-result-wide v2

    .line 816
    sub-long/2addr v2, v4

    sput-wide v2, Lkik/android/chat/KikApplication;->o:J

    .line 819
    :cond_5
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    invoke-static {v2}, Lkik/android/widget/ce;->a(Lkik/android/util/ar;)V

    .line 821
    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->l()Lkik/a/e/w;

    move-result-object v2

    invoke-interface {v2}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v2

    iget-object v2, v2, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-static {}, Lcom/a/a/a;->d()Lcom/a/a/a;

    move-result-object v3

    iget-object v3, v3, Lcom/a/a/a;->c:Lcom/a/a/c/g;

    invoke-virtual {v3, v2}, Lcom/a/a/c/g;->b(Ljava/lang/String;)V

    new-instance v2, Lkik/android/util/bg;

    invoke-virtual/range {p0 .. p0}, Lkik/android/chat/KikApplication;->getBaseContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lkik/android/util/bg;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lcom/a/a/a;->d()Lcom/a/a/a;

    move-result-object v3

    iget-object v3, v3, Lcom/a/a/a;->c:Lcom/a/a/c/g;

    const-string v4, "Version"

    invoke-virtual {v2}, Lcom/kik/m/a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/a/a/c/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/a/a/a;->d()Lcom/a/a/a;

    move-result-object v3

    iget-object v3, v3, Lcom/a/a/a;->c:Lcom/a/a/c/g;

    const-string v4, "BuildDate"

    invoke-virtual {v2}, Lcom/kik/m/a;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/a/a/c/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/a/a/a;->d()Lcom/a/a/a;

    move-result-object v3

    iget-object v3, v3, Lcom/a/a/a;->c:Lcom/a/a/c/g;

    const-string v4, "CommitHash"

    invoke-virtual {v2}, Lcom/kik/m/a;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v4, v2}, Lcom/a/a/c/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 823
    move-object/from16 v0, p2

    move-object/from16 v1, p0

    iput-object v0, v1, Lkik/android/chat/KikApplication;->H:Lkik/a/ab;

    .line 824
    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->o()Lkik/a/e/i;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/KikApplication;->r:Lkik/a/e/i;

    .line 825
    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->n()Lkik/a/e/e;

    move-result-object v2

    check-cast v2, Lkik/android/a/b;

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/KikApplication;->T:Lkik/android/a/b;

    .line 826
    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->k()Lkik/a/e/v;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    .line 827
    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->k()Lkik/a/e/v;

    move-result-object v2

    check-cast v2, Lcom/kik/l/ab;

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/KikApplication;->B:Lcom/kik/l/ab;

    .line 828
    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->h()Lkik/a/e/f;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/KikApplication;->C:Lkik/a/e/f;

    .line 829
    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->j()Lkik/a/f/k;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/KikApplication;->D:Lkik/a/f/k;

    .line 830
    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->q()Lkik/a/e/r;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/KikApplication;->s:Lkik/a/e/r;

    .line 831
    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->l()Lkik/a/e/w;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/KikApplication;->E:Lkik/a/e/w;

    .line 832
    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->m()Lkik/a/e/b;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/KikApplication;->F:Lkik/a/e/b;

    .line 833
    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->z()Lkik/a/e/k;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/KikApplication;->I:Lkik/a/e/k;

    .line 835
    invoke-static/range {p0 .. p0}, Lkik/android/d/d;->a(Landroid/content/Context;)Lkik/android/d/c;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->B:Lcom/kik/l/ab;

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    invoke-interface {v2, v3, v4, v5}, Lkik/android/d/c;->a(Lkik/a/e/v;Lcom/kik/l/ab;Lkik/android/util/ar;)V

    .line 836
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    move-object/from16 v0, p1

    invoke-static {v0, v2}, Lkik/android/util/am;->a(Landroid/content/Context;Lkik/android/util/ar;)V

    .line 837
    invoke-static {}, Lkik/android/util/p;->a()Lkik/android/util/p;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->E:Lkik/a/e/w;

    invoke-virtual {v2, v3}, Lkik/android/util/p;->a(Lkik/a/e/w;)V

    .line 839
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->B:Lcom/kik/l/ab;

    invoke-static {v2}, Lkik/android/gifs/b/e;->a(Lcom/kik/l/ab;)Lkik/android/gifs/b/e;

    .line 840
    invoke-static/range {p0 .. p0}, Lkik/android/gifs/a;->a(Landroid/content/Context;)V

    .line 842
    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->s()Lkik/a/e/n;

    move-result-object v14

    .line 844
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->B:Lcom/kik/l/ab;

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->E:Lkik/a/e/w;

    invoke-static {v2, v3, v4}, Lkik/android/KikDataProvider;->a(Lkik/a/e/v;Lcom/kik/l/ab;Lkik/a/e/w;)V

    .line 846
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->C:Lkik/a/e/f;

    move-object/from16 v0, p1

    invoke-static {v0, v2}, Lkik/android/net/a/e;->a(Landroid/content/Context;Lkik/a/e/f;)Lkik/android/net/a/e;

    .line 848
    new-instance v2, Lkik/android/b/j;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->ad:Lkik/a/e/q;

    move-object/from16 v0, p1

    invoke-direct {v2, v0, v3}, Lkik/android/b/j;-><init>(Landroid/content/Context;Lkik/a/e/q;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/KikApplication;->U:Lkik/android/b/j;

    .line 853
    invoke-static/range {p1 .. p1}, Lkik/android/util/DeviceUtils;->d(Landroid/content/Context;)Z

    move-result v12

    new-instance v15, Lkik/android/chat/a/a;

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->x()Lkik/a/j/m;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->d()Lcom/kik/g/p;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    invoke-direct {v15, v2, v3, v4}, Lkik/android/chat/a/a;-><init>(Lkik/a/j/n;Lcom/kik/g/p;Lkik/a/e/v;)V

    if-eqz v12, :cond_e

    const-string v2, "8065366a28436dbe178c68361639d705"

    :goto_0
    move-object/from16 v0, p1

    invoke-static {v0, v2}, Lcom/mixpanel/android/mpmetrics/v;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/mixpanel/android/mpmetrics/v;

    move-result-object v3

    new-instance v16, Lkik/a/d;

    move-object/from16 v0, v16

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lkik/a/d;-><init>(Lkik/a/a;)V

    new-instance v17, Lcom/kik/j/e;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->B:Lcom/kik/l/ab;

    move-object/from16 v0, v17

    invoke-direct {v0, v2}, Lcom/kik/j/e;-><init>(Lcom/kik/l/ab;)V

    new-instance v2, Lcom/kik/j/o;

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->x()Lkik/a/j/m;

    move-result-object v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/chat/KikApplication;->C:Lkik/a/e/f;

    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/chat/KikApplication;->E:Lkik/a/e/w;

    move-object/from16 v0, p0

    iget-object v8, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    invoke-virtual {v8}, Lkik/android/util/ce;->c()Landroid/content/SharedPreferences;

    move-result-object v8

    move-object/from16 v9, p0

    invoke-direct/range {v2 .. v9}, Lcom/kik/j/o;-><init>(Lcom/mixpanel/android/mpmetrics/v;Lkik/a/j/m;Lkik/a/e/f;Lkik/a/e/v;Lkik/a/e/w;Landroid/content/SharedPreferences;Lkik/android/chat/KikApplication;)V

    new-instance v3, Lcom/kik/j/y;

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/chat/KikApplication;->B:Lcom/kik/l/ab;

    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/chat/KikApplication;->E:Lkik/a/e/w;

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->r()Lkik/a/e/l;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lkik/android/chat/KikApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v8

    invoke-static {v8}, Lkik/android/d/d;->a(Landroid/content/Context;)Lkik/android/d/c;

    move-result-object v8

    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    move-object/from16 v0, p0

    iget-object v11, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    move v9, v12

    invoke-direct/range {v3 .. v11}, Lcom/kik/j/y;-><init>(Lkik/a/e/v;Lcom/kik/l/ab;Lkik/a/e/w;Lkik/a/e/l;Lkik/android/d/c;ZILkik/android/util/ar;)V

    new-instance v4, Lcom/kik/j/w;

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->x()Lkik/a/j/m;

    move-result-object v6

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->d()Lcom/kik/g/p;

    move-result-object v8

    move-object/from16 v0, p0

    iget-object v9, v0, Lkik/android/chat/KikApplication;->E:Lkik/a/e/w;

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->i()Lkik/a/e/t;

    move-result-object v10

    move-object/from16 v0, p0

    iget-object v11, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    move-object/from16 v0, p0

    iget-object v12, v0, Lkik/android/chat/KikApplication;->ad:Lkik/a/e/q;

    move-object/from16 v5, p1

    invoke-direct/range {v4 .. v12}, Lcom/kik/j/w;-><init>(Landroid/content/Context;Lkik/a/j/n;Lkik/a/e/v;Lcom/kik/g/p;Lkik/a/e/w;Lkik/a/e/t;Lkik/android/util/ar;Lkik/a/e/q;)V

    new-instance v12, Lcom/kik/j/c;

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    move-object/from16 v0, p1

    invoke-direct {v12, v0, v15, v5}, Lcom/kik/j/c;-><init>(Landroid/content/Context;Lkik/android/chat/a/a;Lkik/a/e/v;)V

    new-instance v18, Lcom/kik/j/u;

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    move-object/from16 v0, v18

    invoke-direct {v0, v5}, Lcom/kik/j/u;-><init>(Lkik/android/util/ar;)V

    new-instance v19, Lcom/kik/j/m;

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/chat/KikApplication;->C:Lkik/a/e/f;

    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/chat/KikApplication;->aa:Lcom/kik/g/k;

    invoke-virtual {v6}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v6

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    move-object/from16 v0, v19

    invoke-direct {v0, v5, v6, v7}, Lcom/kik/j/m;-><init>(Lkik/a/e/f;Lcom/kik/g/e;Lkik/a/e/v;)V

    new-instance v5, Lcom/kik/j/s;

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->x()Lkik/a/j/m;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->j()Lkik/a/f/k;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->d()Lcom/kik/g/p;

    move-result-object v8

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->h()Lkik/a/e/f;

    move-result-object v9

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->o()Lkik/a/e/i;

    move-result-object v10

    invoke-interface {v10}, Lkik/a/e/i;->v()Lcom/kik/g/e;

    move-result-object v10

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->q()Lkik/a/e/r;

    move-result-object v11

    invoke-direct/range {v5 .. v11}, Lcom/kik/j/s;-><init>(Lkik/a/j/n;Lkik/a/f/k;Lcom/kik/g/p;Lkik/a/e/f;Lcom/kik/g/e;Lkik/a/e/r;)V

    new-instance v6, Lcom/kik/j/k;

    new-instance v7, Lkik/android/util/bj;

    invoke-direct {v7}, Lkik/android/util/bj;-><init>()V

    invoke-direct {v6, v7}, Lcom/kik/j/k;-><init>(Lkik/android/util/bj;)V

    new-instance v7, Lcom/kik/j/g;

    move-object/from16 v0, p0

    iget-object v8, v0, Lkik/android/chat/KikApplication;->B:Lcom/kik/l/ab;

    move-object/from16 v0, p0

    iget-object v9, v0, Lkik/android/chat/KikApplication;->U:Lkik/android/b/j;

    invoke-direct {v7, v8, v9}, Lcom/kik/j/g;-><init>(Lcom/kik/l/ab;Lkik/android/b/j;)V

    new-instance v8, Lkik/a/a/j;

    move-object/from16 v0, p0

    iget-object v9, v0, Lkik/android/chat/KikApplication;->C:Lkik/a/e/f;

    move-object/from16 v0, p0

    iget-object v10, v0, Lkik/android/chat/KikApplication;->T:Lkik/android/a/b;

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->x()Lkik/a/j/m;

    move-result-object v11

    move-object/from16 v0, p0

    iget-object v0, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    move-object/from16 v20, v0

    move-object/from16 v0, v20

    invoke-direct {v8, v9, v10, v11, v0}, Lkik/a/a/j;-><init>(Lkik/a/e/f;Lkik/a/e/e;Lkik/a/j/m;Lkik/a/e/v;)V

    new-instance v9, Lcom/kik/l/a;

    move-object/from16 v0, p0

    iget-object v10, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    move-object/from16 v0, p0

    iget-object v11, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    move-object/from16 v0, p1

    invoke-direct {v9, v10, v0, v11}, Lcom/kik/l/a;-><init>(Lkik/a/e/v;Landroid/content/Context;Lkik/android/util/ce;)V

    new-instance v10, Lcom/kik/j/a;

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->z()Lkik/a/e/k;

    move-result-object v11

    invoke-direct {v10, v9, v8, v11}, Lcom/kik/j/a;-><init>(Lkik/a/e/a;Lkik/a/a/l;Lkik/a/e/k;)V

    invoke-static {}, Lcom/kik/e/b;->a()Lcom/kik/e/b$a;

    move-result-object v8

    move-object/from16 v0, v16

    invoke-virtual {v8, v0}, Lcom/kik/e/b$a;->a(Lkik/a/d;)Lcom/kik/e/b$a;

    move-result-object v8

    invoke-virtual {v8, v2}, Lcom/kik/e/b$a;->a(Lcom/kik/j/o;)Lcom/kik/e/b$a;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/kik/e/b$a;->a(Lcom/kik/j/y;)Lcom/kik/e/b$a;

    move-result-object v2

    invoke-virtual {v2, v4}, Lcom/kik/e/b$a;->a(Lcom/kik/j/w;)Lcom/kik/e/b$a;

    move-result-object v2

    invoke-virtual {v2, v12}, Lcom/kik/e/b$a;->a(Lcom/kik/j/c;)Lcom/kik/e/b$a;

    move-result-object v2

    invoke-virtual {v2, v7}, Lcom/kik/e/b$a;->a(Lcom/kik/j/g;)Lcom/kik/e/b$a;

    move-result-object v2

    new-instance v3, Lcom/kik/j/aa;

    invoke-direct {v3, v15}, Lcom/kik/j/aa;-><init>(Lkik/android/chat/a/a;)V

    invoke-virtual {v2, v3}, Lcom/kik/e/b$a;->a(Lcom/kik/j/aa;)Lcom/kik/e/b$a;

    move-result-object v2

    move-object/from16 v0, v17

    invoke-virtual {v2, v0}, Lcom/kik/e/b$a;->a(Lcom/kik/j/e;)Lcom/kik/e/b$a;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/kik/e/b$a;->a(Lcom/kik/j/k;)Lcom/kik/e/b$a;

    move-result-object v2

    invoke-virtual {v2, v13}, Lcom/kik/e/b$a;->a(Lcom/kik/j/q;)Lcom/kik/e/b$a;

    move-result-object v2

    move-object/from16 v0, v19

    invoke-virtual {v2, v0}, Lcom/kik/e/b$a;->a(Lcom/kik/j/m;)Lcom/kik/e/b$a;

    move-result-object v2

    invoke-virtual {v2, v5}, Lcom/kik/e/b$a;->a(Lcom/kik/j/s;)Lcom/kik/e/b$a;

    move-result-object v2

    move-object/from16 v0, v18

    invoke-virtual {v2, v0}, Lcom/kik/e/b$a;->a(Lcom/kik/j/u;)Lcom/kik/e/b$a;

    move-result-object v2

    invoke-virtual {v2, v10}, Lcom/kik/e/b$a;->a(Lcom/kik/j/a;)Lcom/kik/e/b$a;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/e/b$a;->a()Lcom/kik/e/a;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/KikApplication;->G:Lcom/kik/e/a;

    .line 855
    invoke-virtual/range {p0 .. p0}, Lkik/android/chat/KikApplication;->j()V

    .line 857
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->G:Lcom/kik/e/a;

    move-object/from16 v0, p0

    invoke-interface {v2, v0}, Lcom/kik/e/a;->a(Lkik/android/chat/KikApplication;)V

    .line 858
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->B:Lcom/kik/l/ab;

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/chat/KikApplication;->D:Lkik/a/f/k;

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->i()Lkik/a/e/t;

    move-result-object v6

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/chat/KikApplication;->f:Lcom/kik/cache/ad;

    move-object/from16 v0, p0

    iget-object v8, v0, Lkik/android/chat/KikApplication;->ad:Lkik/a/e/q;

    move-object/from16 v0, p0

    iget-object v9, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    invoke-virtual/range {v2 .. v9}, Lkik/android/f/a/f;->a(Lkik/a/e/v;Lcom/kik/l/ab;Lkik/a/f/k;Lkik/a/e/t;Lcom/kik/cache/ad;Lkik/a/e/q;Lkik/android/util/ar;)V

    .line 860
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->C:Lkik/a/e/f;

    check-cast v2, Lkik/android/net/communicator/a;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    invoke-virtual {v2, v3}, Lkik/android/net/communicator/a;->a(Lcom/kik/android/a;)V

    .line 861
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->C:Lkik/a/e/f;

    check-cast v2, Lkik/android/net/communicator/a;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->H:Lkik/a/ab;

    invoke-virtual {v2, v3}, Lkik/android/net/communicator/a;->a(Lkik/a/ab;)V

    .line 862
    invoke-static {}, Lkik/android/i/i;->a()Lkik/android/i/i;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->G:Lcom/kik/e/a;

    invoke-interface {v3, v2}, Lcom/kik/e/a;->a(Lkik/android/i/i;)V

    .line 864
    new-instance v2, Landroid/os/Handler;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->t:Landroid/os/HandlerThread;

    invoke-virtual {v3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/KikApplication;->X:Landroid/os/Handler;

    .line 869
    invoke-static/range {p1 .. p1}, Lkik/android/util/DeviceUtils;->d(Landroid/content/Context;)Z

    move-result v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    invoke-virtual {v3, v2}, Lcom/kik/android/a;->a(Z)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v3, "50% Core Setup Time"

    sget-wide v4, Lkik/android/chat/KikApplication;->o:J

    long-to-float v4, v4

    const/high16 v5, 0x447a0000    # 1000.0f

    div-float/2addr v4, v5

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-virtual {v2, v3, v4, v5}, Lcom/kik/android/a;->a(Ljava/lang/String;FF)Lcom/kik/android/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v3, "95% Core Setup Time"

    sget-wide v4, Lkik/android/chat/KikApplication;->o:J

    long-to-float v4, v4

    const/high16 v5, 0x447a0000    # 1000.0f

    div-float/2addr v4, v5

    const v5, 0x3f733333    # 0.95f

    invoke-virtual {v2, v3, v4, v5}, Lcom/kik/android/a;->a(Ljava/lang/String;FF)Lcom/kik/android/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v3, "Received New People in Last 7 Days"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/kik/android/a;->g(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v3, "Messages Received in Last 7 Days"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/kik/android/a;->g(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v3, "Messaging Partners in Last 7 Days"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lcom/kik/android/a;->g(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v3, "Chat List Size"

    const-wide/16 v4, 0x0

    invoke-virtual {v2, v3, v4, v5}, Lcom/kik/android/a;->a(Ljava/lang/String;J)Lcom/kik/android/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v3, "New Chat List Size"

    const-wide/16 v4, 0x0

    invoke-virtual {v2, v3, v4, v5}, Lcom/kik/android/a;->a(Ljava/lang/String;J)Lcom/kik/android/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v3, "Block List Size"

    const-wide/16 v4, 0x0

    invoke-virtual {v2, v3, v4, v5}, Lcom/kik/android/a;->a(Ljava/lang/String;J)Lcom/kik/android/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v3, "Is Wear Installed"

    invoke-static/range {p0 .. p0}, Lkik/android/g/c;->a(Landroid/content/Context;)Z

    move-result v4

    invoke-virtual {v2, v3, v4}, Lcom/kik/android/a;->c(Ljava/lang/String;Z)Lcom/kik/android/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v3, "Is Wear Installed"

    invoke-static/range {p0 .. p0}, Lkik/android/g/c;->a(Landroid/content/Context;)Z

    move-result v4

    invoke-virtual {v2, v3, v4}, Lcom/kik/android/a;->c(Ljava/lang/String;Z)Lcom/kik/android/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v3, "Bubble Colour"

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->d:Lkik/android/chat/b/d;

    invoke-virtual {v4}, Lkik/android/chat/b/d;->c()Lkik/android/chat/b/b;

    move-result-object v4

    invoke-virtual {v4}, Lkik/android/chat/b/b;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/kik/android/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a;

    const-string v2, "os.arch"

    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v4, "OS Architecture"

    if-eqz v2, :cond_f

    :goto_1
    invoke-virtual {v3, v4, v2}, Lcom/kik/android/a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a;

    new-instance v2, Lcom/kik/g/p;

    invoke-direct {v2}, Lcom/kik/g/p;-><init>()V

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/KikApplication;->Z:Lcom/kik/g/p;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v3, "App Opened"

    invoke-virtual {v2, v3}, Lcom/kik/android/a;->a(Ljava/lang/String;)Lcom/kik/android/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    invoke-virtual {v2}, Lkik/android/util/ce;->c()Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "kik.install_referrer"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_6

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v5, "Install Referrer"

    invoke-virtual {v4, v5, v3}, Lcom/kik/android/a;->f(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;

    :cond_6
    const-string v3, "kik.install_date"

    const-wide/16 v4, -0x1

    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long v3, v4, v6

    if-eqz v3, :cond_7

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v6, "Install Date"

    invoke-virtual {v3, v6, v4, v5}, Lcom/kik/android/a;->a(Ljava/lang/String;J)Lcom/kik/android/a;

    :cond_7
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v4, "Registrations Since Install"

    const-string v5, "kik.registration_count"

    const/4 v6, 0x0

    invoke-interface {v2, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/kik/android/a;->a(Ljava/lang/String;I)Lcom/kik/android/a;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v4, "Logins Since Install"

    const-string v5, "kik.install_count"

    const/4 v6, 0x0

    invoke-interface {v2, v5, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v3, v4, v2}, Lcom/kik/android/a;->a(Ljava/lang/String;I)Lcom/kik/android/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->Z:Lcom/kik/g/p;

    new-instance v3, Lkik/android/chat/p;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lkik/android/chat/p;-><init>(Lkik/android/chat/KikApplication;)V

    invoke-virtual {v2, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 871
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->B:Lcom/kik/l/ab;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    move-object/from16 v0, p0

    invoke-static {v0, v2, v3}, Lkik/android/gifs/b;->a(Landroid/content/Context;Lcom/kik/l/ab;Lcom/kik/android/a;)Lkik/android/gifs/b;

    .line 873
    sget-object v2, Lkik/android/chat/KikApplication;->l:Lkik/android/KikNotificationHandler;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->E:Lkik/a/e/w;

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->r:Lkik/a/e/i;

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/chat/KikApplication;->G:Lcom/kik/e/a;

    invoke-virtual {v2, v3, v4, v5, v6}, Lkik/android/KikNotificationHandler;->a(Lkik/a/e/w;Lkik/a/e/i;Lkik/a/e/v;Lcom/kik/e/a;)V

    .line 874
    new-instance v2, Lkik/android/util/bo;

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->r:Lkik/a/e/i;

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/chat/KikApplication;->D:Lkik/a/f/k;

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->i()Lkik/a/e/t;

    move-result-object v9

    move-object/from16 v0, p0

    iget-object v10, v0, Lkik/android/chat/KikApplication;->H:Lkik/a/ab;

    move-object/from16 v3, p0

    move-object v8, v14

    invoke-direct/range {v2 .. v10}, Lkik/android/util/bo;-><init>(Landroid/content/Context;Lkik/a/e/i;Lkik/a/e/v;Lcom/kik/android/a;Lkik/a/f/k;Lkik/a/e/n;Lkik/a/e/t;Lkik/a/ab;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/KikApplication;->S:Lkik/android/util/bo;

    .line 876
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->T:Lkik/android/a/b;

    invoke-virtual {v2}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v2

    const-string v3, "CAN"

    invoke-virtual {v2, v3}, Lcom/kik/d/f;->d(Ljava/lang/String;)V

    .line 877
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->T:Lkik/android/a/b;

    invoke-virtual {v2}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v2

    sget-object v3, Lkik/android/chat/KikApplication;->k:Lkik/android/chat/KikApplication;

    invoke-direct {v3}, Lkik/android/chat/KikApplication;->s()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/kik/d/f;->b(Ljava/lang/String;)V

    .line 878
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->T:Lkik/android/a/b;

    invoke-virtual {v2}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Lkik/android/util/DeviceUtils;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/kik/d/f;->e(Ljava/lang/String;)V

    .line 880
    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->t()Lkik/a/e/o;

    move-result-object v10

    invoke-static/range {p1 .. p1}, Lkik/android/d/d;->a(Landroid/content/Context;)Lkik/android/d/c;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lkik/android/chat/KikApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lkik/android/util/DeviceUtils;->d(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_8

    new-instance v2, Lkik/android/chat/s;

    const-string v5, "messageEncryptionPublicKeyCorruptType"

    const-string v6, "none"

    const/4 v3, 0x4

    new-array v7, v3, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "none"

    aput-object v4, v7, v3

    const/4 v3, 0x1

    const-string v4, "corrupt public"

    aput-object v4, v7, v3

    const/4 v3, 0x2

    const-string v4, "corrupt public private"

    aput-object v4, v7, v3

    const/4 v3, 0x3

    const-string v4, "corrupt private"

    aput-object v4, v7, v3

    new-instance v8, Lkik/android/chat/r;

    move-object/from16 v0, p0

    invoke-direct {v8, v0}, Lkik/android/chat/r;-><init>(Lkik/android/chat/KikApplication;)V

    move-object/from16 v0, p0

    iget-object v9, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct/range {v2 .. v10}, Lkik/android/chat/s;-><init>(Lkik/android/chat/KikApplication;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/Runnable;Lkik/android/util/ar;Lkik/a/e/o;)V

    invoke-interface {v11, v2}, Lkik/android/d/c;->a(Lkik/android/d/b;)Z

    :cond_8
    new-instance v2, Lkik/android/d/a;

    const-string v4, "content-preload"

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v7}, Lkik/android/d/a;-><init>(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/Runnable;Lkik/android/util/ar;)V

    invoke-interface {v11, v2}, Lkik/android/d/c;->a(Lkik/android/d/b;)Z

    new-instance v2, Lkik/android/d/a;

    const-string v4, "group-size-fifty-members"

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v0, p0

    iget-object v7, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v7}, Lkik/android/d/a;-><init>(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/Runnable;Lkik/android/util/ar;)V

    invoke-interface {v11, v2}, Lkik/android/d/c;->a(Lkik/android/d/b;)Z

    new-instance v2, Lkik/android/chat/t;

    const-string v5, "force-roster-update"

    new-instance v6, Ljava/lang/Boolean;

    const/4 v3, 0x0

    invoke-direct {v6, v3}, Ljava/lang/Boolean;-><init>(Z)V

    const/4 v3, 0x2

    new-array v7, v3, [Ljava/lang/Boolean;

    const/4 v3, 0x0

    new-instance v4, Ljava/lang/Boolean;

    const/4 v8, 0x0

    invoke-direct {v4, v8}, Ljava/lang/Boolean;-><init>(Z)V

    aput-object v4, v7, v3

    const/4 v3, 0x1

    new-instance v4, Ljava/lang/Boolean;

    const/4 v8, 0x1

    invoke-direct {v4, v8}, Ljava/lang/Boolean;-><init>(Z)V

    aput-object v4, v7, v3

    move-object/from16 v0, p0

    iget-object v8, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v9, p1

    invoke-direct/range {v2 .. v9}, Lkik/android/chat/t;-><init>(Lkik/android/chat/KikApplication;Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;[Ljava/lang/Boolean;Lkik/android/util/ar;Landroid/content/Context;)V

    invoke-interface {v11, v2}, Lkik/android/d/c;->a(Lkik/android/d/b;)Z

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->r:Lkik/a/e/i;

    invoke-interface {v2}, Lkik/a/e/i;->x()V

    .line 882
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    invoke-static {v2}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v2

    .line 883
    if-eqz v2, :cond_9

    .line 884
    invoke-virtual {v2}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/j;->c()Ljava/lang/String;

    move-result-object v2

    .line 885
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->T:Lkik/android/a/b;

    invoke-virtual {v3}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/kik/d/f;->a(Ljava/lang/String;)V

    .line 886
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->T:Lkik/android/a/b;

    invoke-virtual {v2}, Lkik/android/a/b;->a()V

    .line 889
    :cond_9
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    invoke-virtual {v2}, Lkik/android/util/ce;->c()Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v2, "kik.has-kik-ever-run"

    const/4 v4, 0x0

    invoke-interface {v3, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    const-string v4, "kik.version.number.eula"

    const/4 v5, -0x1

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_a

    const/4 v2, 0x1

    :cond_a
    if-nez v2, :cond_b

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "kik.has-kik-ever-run"

    const/4 v4, 0x1

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v2

    if-eqz v2, :cond_b

    sget-object v2, Lkik/android/chat/KikApplication;->k:Lkik/android/chat/KikApplication;

    iget-object v2, v2, Lkik/android/chat/KikApplication;->T:Lkik/android/a/b;

    invoke-virtual {v2}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v2

    invoke-virtual {v2}, Lcom/kik/d/f;->b()V

    .line 891
    :cond_b
    invoke-static {}, Lcom/kik/cards/web/iap/b;->a()Lcom/kik/cards/web/iap/b;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->C:Lkik/a/e/f;

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    move-object/from16 v0, p1

    invoke-virtual {v2, v0, v3, v4}, Lcom/kik/cards/web/iap/b;->a(Landroid/content/Context;Lkik/a/e/f;Lkik/a/e/v;)V

    .line 893
    new-instance v2, Lkik/android/b/a;

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->x()Lkik/a/j/m;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->v()Lkik/a/i/h;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Lkik/android/b/a;-><init>(Lkik/a/j/m;Lkik/a/e/v;Lkik/a/i/h;)V

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/KikApplication;->V:Lkik/android/b/a;

    .line 895
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->p:Lcom/kik/g/f;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->C:Lkik/a/e/f;

    invoke-interface {v3}, Lkik/a/e/f;->d()Lcom/kik/g/e;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->ae:Lcom/kik/g/i;

    invoke-virtual {v2, v3, v4}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 896
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->p:Lcom/kik/g/f;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->r:Lkik/a/e/i;

    invoke-interface {v3}, Lkik/a/e/i;->r()Lcom/kik/g/e;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->ah:Lcom/kik/g/i;

    invoke-virtual {v2, v3, v4}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 897
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->p:Lcom/kik/g/f;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->r:Lkik/a/e/i;

    invoke-interface {v3}, Lkik/a/e/i;->s()Lcom/kik/g/e;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->ai:Lcom/kik/g/i;

    invoke-virtual {v2, v3, v4}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 898
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->p:Lcom/kik/g/f;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->r:Lkik/a/e/i;

    invoke-interface {v3}, Lkik/a/e/i;->t()Lcom/kik/g/e;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->ak:Lcom/kik/g/i;

    invoke-virtual {v2, v3, v4}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 899
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->p:Lcom/kik/g/f;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->r:Lkik/a/e/i;

    invoke-interface {v3}, Lkik/a/e/i;->u()Lcom/kik/g/e;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->aj:Lcom/kik/g/i;

    invoke-virtual {v2, v3, v4}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 900
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->p:Lcom/kik/g/f;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->r:Lkik/a/e/i;

    invoke-interface {v3}, Lkik/a/e/i;->a()Lcom/kik/g/e;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->ag:Lcom/kik/g/i;

    invoke-virtual {v2, v3, v4}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 901
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->p:Lcom/kik/g/f;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->s:Lkik/a/e/r;

    invoke-interface {v3}, Lkik/a/e/r;->a()Lcom/kik/g/e;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->ar:Lcom/kik/g/i;

    invoke-virtual {v2, v3, v4}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 902
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->p:Lcom/kik/g/f;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->E:Lkik/a/e/w;

    invoke-interface {v3}, Lkik/a/e/w;->b()Lcom/kik/g/e;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->as:Lcom/kik/g/i;

    invoke-virtual {v2, v3, v4}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 903
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->p:Lcom/kik/g/f;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->r:Lkik/a/e/i;

    invoke-interface {v3}, Lkik/a/e/i;->e()Lcom/kik/g/e;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->am:Lcom/kik/g/i;

    invoke-virtual {v2, v3, v4}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 904
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->p:Lcom/kik/g/f;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->r:Lkik/a/e/i;

    invoke-interface {v3}, Lkik/a/e/i;->f()Lcom/kik/g/e;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->al:Lcom/kik/g/i;

    invoke-virtual {v2, v3, v4}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 905
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->p:Lcom/kik/g/f;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->r:Lkik/a/e/i;

    invoke-interface {v3}, Lkik/a/e/i;->j()Lcom/kik/g/e;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->an:Lcom/kik/g/i;

    invoke-virtual {v2, v3, v4}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 906
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->p:Lcom/kik/g/f;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->H:Lkik/a/ab;

    invoke-interface {v3}, Lkik/a/ab;->a()Lcom/kik/g/e;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->ao:Lcom/kik/g/i;

    invoke-virtual {v2, v3, v4}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 907
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->p:Lcom/kik/g/f;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->E:Lkik/a/e/w;

    invoke-interface {v3}, Lkik/a/e/w;->a()Lcom/kik/g/e;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->aq:Lcom/kik/g/i;

    invoke-virtual {v2, v3, v4}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 909
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->E:Lkik/a/e/w;

    invoke-interface {v2}, Lkik/a/e/w;->h()Lcom/kik/g/p;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->at:Lcom/kik/g/r;

    invoke-virtual {v2, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 911
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->e:Lkik/android/util/ck;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->s:Lkik/a/e/r;

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    invoke-virtual {v2, v3, v4}, Lkik/android/util/ck;->a(Lkik/a/e/r;Lcom/kik/android/a;)V

    .line 913
    invoke-virtual/range {p2 .. p2}, Lkik/a/a;->d()Lcom/kik/g/p;

    move-result-object v2

    new-instance v3, Lkik/android/chat/o;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lkik/android/chat/o;-><init>(Lkik/android/chat/KikApplication;)V

    invoke-virtual {v2, v3}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 921
    new-instance v2, Lcom/kik/g/l;

    invoke-direct {v2}, Lcom/kik/g/l;-><init>()V

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/chat/KikApplication;->W:Lcom/kik/g/l;

    .line 922
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->B:Lcom/kik/l/ab;

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    move-object/from16 v0, p0

    invoke-static {v0, v2, v3, v4}, Lkik/android/util/a;->a(Landroid/app/Application;Lkik/a/e/v;Lcom/kik/l/ab;Lkik/android/util/ar;)V

    .line 923
    invoke-static/range {p0 .. p0}, Lkik/android/HeadphoneUnpluggedReceiver;->a(Landroid/content/Context;)V

    .line 924
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->g:Lkik/android/util/bj;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    invoke-virtual {v2, v3}, Lkik/android/util/bj;->a(Lcom/kik/android/a;)V

    .line 925
    invoke-direct/range {p0 .. p0}, Lkik/android/chat/KikApplication;->t()Z

    move-result v2

    if-eqz v2, :cond_c

    .line 926
    move-object/from16 v0, p0

    iget v2, v0, Lkik/android/chat/KikApplication;->M:I

    if-nez v2, :cond_10

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    const-string v3, "kik.led.color"

    invoke-interface {v2, v3}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_c

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    const-string v3, "kik.led.color"

    const-string v4, "ff00ff00"

    invoke-interface {v2, v3, v4}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    const-string v3, "kik.vibrate"

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Boolean;)Z

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    const-string v3, "kik.sound"

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Boolean;)Z

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    const-string v3, "kik.developer.mode"

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Boolean;)Z

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    const-string v3, "kik.new.people.notify"

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Boolean;)Z

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    const-string v3, "kik.chat.video.prefetch"

    const v4, 0x7f090368

    invoke-static {v4}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    const-string v3, "kik.chat.video.autoplay"

    const v4, 0x7f090367

    invoke-static {v4}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 929
    :cond_c
    :goto_2
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    invoke-static {v2}, Lkik/a/z;->a(Lkik/a/e/v;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 930
    invoke-direct/range {p0 .. p0}, Lkik/android/chat/KikApplication;->r()V

    .line 932
    :cond_d
    invoke-static {}, Lkik/android/util/s;->b()V

    .line 933
    return-void

    .line 853
    :cond_e
    const-string v2, "36e42d002f7142d1dad9d50f4298db43"

    goto/16 :goto_0

    .line 869
    :cond_f
    const-string v2, "Unknown"

    goto/16 :goto_1

    .line 926
    :cond_10
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    move-object/from16 v0, p0

    iget v3, v0, Lkik/android/chat/KikApplication;->M:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Lkik/a/e/v;->a(Ljava/lang/Integer;)V

    move-object/from16 v0, p0

    iget v2, v0, Lkik/android/chat/KikApplication;->M:I

    const/16 v3, 0xb

    if-ge v2, v3, :cond_11

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->E:Lkik/a/e/w;

    invoke-interface {v3}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v3

    invoke-interface {v2, v3}, Lkik/a/e/v;->a(Lkik/a/d/aa;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->r:Lkik/a/e/i;

    invoke-interface {v2}, Lkik/a/e/i;->E()V

    :cond_11
    move-object/from16 v0, p0

    iget v2, v0, Lkik/android/chat/KikApplication;->M:I

    const/16 v3, 0x29

    if-ge v2, v3, :cond_12

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->F:Lkik/a/e/b;

    invoke-interface {v2}, Lkik/a/e/b;->b()Z

    move-result v2

    if-eqz v2, :cond_12

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->F:Lkik/a/e/b;

    invoke-interface {v2}, Lkik/a/e/b;->d()V

    :cond_12
    move-object/from16 v0, p0

    iget v2, v0, Lkik/android/chat/KikApplication;->M:I

    const/16 v3, 0x30

    if-ge v2, v3, :cond_13

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    new-instance v4, Ljava/lang/Boolean;

    const-string v2, "false"

    const-string v5, "user_profile_listening_by_default"

    invoke-interface {v3, v5}, Lkik/a/e/v;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    const/4 v2, 0x1

    :goto_3
    invoke-direct {v4, v2}, Ljava/lang/Boolean;-><init>(Z)V

    const-string v5, "notify_new_people"

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_16

    const-string v2, "true"

    :goto_4
    invoke-interface {v3, v5, v2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    invoke-static {v3}, Lkik/a/d/aa;->a(Lkik/a/e/v;)Lkik/a/d/aa;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/chat/KikApplication;->E:Lkik/a/e/w;

    invoke-interface {v3, v2}, Lkik/a/e/w;->a(Lkik/a/d/aa;)V

    new-instance v3, Lcom/kik/g/f;

    invoke-direct {v3}, Lcom/kik/g/f;-><init>()V

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->C:Lkik/a/e/f;

    if-eqz v4, :cond_13

    invoke-interface {v4}, Lkik/a/e/f;->b()Lcom/kik/g/e;

    move-result-object v5

    new-instance v6, Lkik/android/chat/x;

    move-object/from16 v0, p0

    invoke-direct {v6, v0, v3, v4, v2}, Lkik/android/chat/x;-><init>(Lkik/android/chat/KikApplication;Lcom/kik/g/f;Lkik/a/e/f;Lkik/a/d/aa;)V

    invoke-virtual {v3, v5, v6}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    :cond_13
    move-object/from16 v0, p0

    iget v2, v0, Lkik/android/chat/KikApplication;->M:I

    const/16 v3, 0x65

    if-ge v2, v3, :cond_14

    :try_start_0
    new-instance v2, Lkik/android/b/ab;

    invoke-virtual/range {p0 .. p0}, Lkik/android/chat/KikApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    invoke-interface {v4}, Lkik/a/e/v;->m()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lkik/android/b/ab;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v2}, Lkik/android/b/ab;->a()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_14
    :goto_5
    move-object/from16 v0, p0

    iget v2, v0, Lkik/android/chat/KikApplication;->M:I

    const/16 v3, 0x84

    if-ge v2, v3, :cond_c

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    const-string v3, "kik.scan.hint.display"

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Boolean;)Z

    goto/16 :goto_2

    :cond_15
    const/4 v2, 0x0

    goto :goto_3

    :cond_16
    const-string v2, "false"

    goto :goto_4

    :catch_0
    move-exception v2

    invoke-static {v2}, Lkik/android/util/bx;->a(Ljava/lang/Throwable;)V

    goto :goto_5
.end method

.method static synthetic a(Lkik/android/chat/KikApplication;Landroid/content/Context;Lkik/a/a;)V
    .locals 0

    .prologue
    .line 164
    invoke-direct {p0, p1, p2}, Lkik/android/chat/KikApplication;->a(Landroid/content/Context;Lkik/a/a;)V

    return-void
.end method

.method private a(Ljava/io/File;)Z
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 1424
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1425
    invoke-virtual {p1}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v2

    move v0, v1

    .line 1426
    :goto_0
    array-length v3, v2

    if-ge v0, v3, :cond_1

    .line 1427
    new-instance v3, Ljava/io/File;

    aget-object v4, v2, v0

    invoke-direct {v3, p1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {p0, v3}, Lkik/android/chat/KikApplication;->a(Ljava/io/File;)Z

    move-result v3

    .line 1428
    if-nez v3, :cond_0

    .line 1433
    :goto_1
    return v1

    .line 1426
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1433
    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v1

    goto :goto_1
.end method

.method static synthetic a(Lkik/android/chat/KikApplication;Ljava/io/File;)Z
    .locals 1

    .prologue
    .line 164
    invoke-direct {p0, p1}, Lkik/android/chat/KikApplication;->a(Ljava/io/File;)Z

    move-result v0

    return v0
.end method

.method public static b(I)I
    .locals 2

    .prologue
    .line 624
    int-to-float v0, p0

    sget v1, Lkik/android/chat/KikApplication;->m:F

    div-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 609
    sget-object v0, Lkik/android/chat/KikApplication;->k:Lkik/android/chat/KikApplication;

    invoke-direct {v0}, Lkik/android/chat/KikApplication;->s()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lkik/android/chat/KikApplication;)Lkik/a/e/r;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->s:Lkik/a/e/r;

    return-object v0
.end method

.method public static b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 660
    sget-object v0, Lkik/android/chat/KikApplication;->k:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->N:Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 661
    sget-object v0, Lkik/android/chat/KikApplication;->k:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->N:Landroid/app/Activity;

    new-instance v1, Lkik/android/chat/k;

    invoke-direct {v1, p0}, Lkik/android/chat/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 668
    :cond_0
    return-void
.end method

.method public static c(I)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 689
    sget-object v0, Lkik/android/chat/KikApplication;->k:Lkik/android/chat/KikApplication;

    invoke-virtual {v0}, Lkik/android/chat/KikApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 690
    if-eqz v0, :cond_0

    .line 691
    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 693
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 614
    sget-object v0, Lkik/android/chat/KikApplication;->k:Lkik/android/chat/KikApplication;

    invoke-static {v0}, Lkik/android/util/DeviceUtils;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lkik/android/chat/KikApplication;)Lkik/android/a/b;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->T:Lkik/android/a/b;

    return-object v0
.end method

.method public static d(I)I
    .locals 1

    .prologue
    .line 698
    sget-object v0, Lkik/android/chat/KikApplication;->k:Lkik/android/chat/KikApplication;

    invoke-virtual {v0}, Lkik/android/chat/KikApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    return v0
.end method

.method static synthetic d(Lkik/android/chat/KikApplication;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->X:Landroid/os/Handler;

    return-object v0
.end method

.method public static d()Lkik/android/util/bo;
    .locals 1

    .prologue
    .line 629
    sget-object v0, Lkik/android/chat/KikApplication;->k:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->S:Lkik/android/util/bo;

    return-object v0
.end method

.method public static e(I)I
    .locals 1

    .prologue
    .line 703
    sget-object v0, Lkik/android/chat/KikApplication;->k:Lkik/android/chat/KikApplication;

    invoke-virtual {v0}, Lkik/android/chat/KikApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    return v0
.end method

.method public static e()V
    .locals 1

    .prologue
    .line 634
    sget-object v0, Lkik/android/chat/KikApplication;->l:Lkik/android/KikNotificationHandler;

    if-eqz v0, :cond_0

    .line 635
    sget-object v0, Lkik/android/chat/KikApplication;->l:Lkik/android/KikNotificationHandler;

    invoke-virtual {v0}, Lkik/android/KikNotificationHandler;->a()V

    .line 637
    :cond_0
    return-void
.end method

.method static synthetic e(Lkik/android/chat/KikApplication;)Z
    .locals 1

    .prologue
    .line 164
    iget-boolean v0, p0, Lkik/android/chat/KikApplication;->x:Z

    return v0
.end method

.method public static f(I)Ljava/lang/String;
    .locals 1

    .prologue
    .line 708
    sget-object v0, Lkik/android/chat/KikApplication;->k:Lkik/android/chat/KikApplication;

    invoke-virtual {v0}, Lkik/android/chat/KikApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic f(Lkik/android/chat/KikApplication;)Z
    .locals 1

    .prologue
    .line 164
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/chat/KikApplication;->x:Z

    return v0
.end method

.method static synthetic g(Lkik/android/chat/KikApplication;)Lkik/a/f/k;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->D:Lkik/a/f/k;

    return-object v0
.end method

.method public static g()V
    .locals 2

    .prologue
    .line 646
    sget-object v0, Lkik/android/chat/KikApplication;->l:Lkik/android/KikNotificationHandler;

    if-eqz v0, :cond_0

    .line 647
    sget-object v0, Lkik/android/chat/KikApplication;->l:Lkik/android/KikNotificationHandler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lkik/android/KikNotificationHandler;->a(Z)V

    .line 649
    :cond_0
    return-void
.end method

.method static synthetic h(Lkik/android/chat/KikApplication;)Lkik/a/e/f;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->C:Lkik/a/e/f;

    return-object v0
.end method

.method public static h()V
    .locals 1

    .prologue
    .line 653
    sget-object v0, Lkik/android/chat/KikApplication;->l:Lkik/android/KikNotificationHandler;

    if-eqz v0, :cond_0

    .line 654
    sget-object v0, Lkik/android/chat/KikApplication;->l:Lkik/android/KikNotificationHandler;

    invoke-virtual {v0}, Lkik/android/KikNotificationHandler;->c()V

    .line 656
    :cond_0
    return-void
.end method

.method static synthetic i(Lkik/android/chat/KikApplication;)Lkik/a/e/v;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    return-object v0
.end method

.method public static i()Lkik/android/a/b;
    .locals 1

    .prologue
    .line 718
    sget-object v0, Lkik/android/chat/KikApplication;->k:Lkik/android/chat/KikApplication;

    iget-object v0, v0, Lkik/android/chat/KikApplication;->T:Lkik/android/a/b;

    return-object v0
.end method

.method static synthetic j(Lkik/android/chat/KikApplication;)Lcom/kik/l/ab;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->B:Lcom/kik/l/ab;

    return-object v0
.end method

.method static synthetic k(Lkik/android/chat/KikApplication;)Lkik/android/util/bo;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->S:Lkik/android/util/bo;

    return-object v0
.end method

.method static synthetic l(Lkik/android/chat/KikApplication;)Lkik/a/ab;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->H:Lkik/a/ab;

    return-object v0
.end method

.method static synthetic m(Lkik/android/chat/KikApplication;)Lcom/kik/g/i;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->ap:Lcom/kik/g/i;

    return-object v0
.end method

.method static synthetic n(Lkik/android/chat/KikApplication;)Lcom/kik/g/f;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->p:Lcom/kik/g/f;

    return-object v0
.end method

.method static synthetic o(Lkik/android/chat/KikApplication;)Ljava/util/TimerTask;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->au:Ljava/util/TimerTask;

    return-object v0
.end method

.method static synthetic p(Lkik/android/chat/KikApplication;)Ljava/util/Timer;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->u:Ljava/util/Timer;

    return-object v0
.end method

.method static synthetic p()Lkik/android/KikNotificationHandler;
    .locals 1

    .prologue
    .line 164
    sget-object v0, Lkik/android/chat/KikApplication;->l:Lkik/android/KikNotificationHandler;

    return-object v0
.end method

.method static synthetic q()Lkik/android/chat/KikApplication;
    .locals 1

    .prologue
    .line 164
    sget-object v0, Lkik/android/chat/KikApplication;->k:Lkik/android/chat/KikApplication;

    return-object v0
.end method

.method static synthetic q(Lkik/android/chat/KikApplication;)V
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->K:Lkik/a/x;

    invoke-virtual {v0}, Lkik/a/x;->d()V

    return-void
.end method

.method static synthetic r(Lkik/android/chat/KikApplication;)Lkik/a/e/w;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->E:Lkik/a/e/w;

    return-object v0
.end method

.method private r()V
    .locals 2

    .prologue
    .line 582
    iget-object v0, p0, Lkik/android/chat/KikApplication;->K:Lkik/a/x;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkik/android/chat/KikApplication;->E:Lkik/a/e/w;

    if-eqz v0, :cond_0

    .line 583
    iget-object v0, p0, Lkik/android/chat/KikApplication;->K:Lkik/a/x;

    iget-object v1, p0, Lkik/android/chat/KikApplication;->E:Lkik/a/e/w;

    invoke-interface {v1}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v1

    iget-object v1, v1, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkik/a/x;->a(Ljava/lang/String;)V

    .line 585
    :cond_0
    return-void
.end method

.method private s()Ljava/lang/String;
    .locals 4

    .prologue
    .line 1139
    iget-object v0, p0, Lkik/android/chat/KikApplication;->P:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 1140
    iget-object v1, p0, Lkik/android/chat/KikApplication;->q:Ljava/lang/Object;

    monitor-enter v1

    .line 1141
    :try_start_0
    iget-object v0, p0, Lkik/android/chat/KikApplication;->P:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1142
    iget-object v0, p0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    invoke-virtual {v0}, Lkik/android/util/ce;->c()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v2, "kik.deviceid"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/KikApplication;->P:Ljava/lang/String;

    .line 1143
    iget-object v0, p0, Lkik/android/chat/KikApplication;->P:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 1144
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "-"

    const-string v3, ""

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lkik/android/chat/KikApplication;->P:Ljava/lang/String;

    .line 1145
    iget-object v0, p0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    invoke-virtual {v0}, Lkik/android/util/ce;->c()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 1146
    const-string v2, "kik.deviceid"

    iget-object v3, p0, Lkik/android/chat/KikApplication;->P:Ljava/lang/String;

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1147
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 1150
    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1152
    :cond_1
    iget-object v0, p0, Lkik/android/chat/KikApplication;->P:Ljava/lang/String;

    return-object v0

    .line 1150
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method static synthetic s(Lkik/android/chat/KikApplication;)Lkik/a/x;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->K:Lkik/a/x;

    return-object v0
.end method

.method static synthetic t(Lkik/android/chat/KikApplication;)V
    .locals 0

    .prologue
    .line 164
    invoke-direct {p0}, Lkik/android/chat/KikApplication;->r()V

    return-void
.end method

.method private t()Z
    .locals 2

    .prologue
    .line 1532
    iget v0, p0, Lkik/android/chat/KikApplication;->M:I

    iget v1, p0, Lkik/android/chat/KikApplication;->L:I

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic u(Lkik/android/chat/KikApplication;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->Y:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic v(Lkik/android/chat/KikApplication;)Lkik/android/b/a;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->V:Lkik/android/b/a;

    return-object v0
.end method

.method static synthetic w(Lkik/android/chat/KikApplication;)Lcom/kik/g/k;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->aa:Lcom/kik/g/k;

    return-object v0
.end method

.method static synthetic x(Lkik/android/chat/KikApplication;)Z
    .locals 1

    .prologue
    .line 164
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/chat/KikApplication;->v:Z

    return v0
.end method

.method static synthetic y(Lkik/android/chat/KikApplication;)Lkik/android/util/ce;
    .locals 1

    .prologue
    .line 164
    iget-object v0, p0, Lkik/android/chat/KikApplication;->ac:Lkik/android/util/ce;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/kik/e/a;
    .locals 1

    .prologue
    .line 1047
    iget-object v0, p0, Lkik/android/chat/KikApplication;->G:Lcom/kik/e/a;

    return-object v0
.end method

.method public final a(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 728
    iput-object p1, p0, Lkik/android/chat/KikApplication;->y:Landroid/app/Activity;

    .line 729
    return-void
.end method

.method protected final a(Lkik/a/d/s;)V
    .locals 14

    .prologue
    .line 1213
    if-nez p1, :cond_1

    .line 1288
    :cond_0
    :goto_0
    return-void

    .line 1218
    :cond_1
    invoke-virtual {p1}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lkik/android/chat/KikApplication;->c(Ljava/lang/String;)Z

    move-result v10

    .line 1220
    iget-object v0, p0, Lkik/android/chat/KikApplication;->s:Lkik/a/e/r;

    invoke-virtual {p1}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v0

    .line 1221
    iget-object v1, p0, Lkik/android/chat/KikApplication;->s:Lkik/a/e/r;

    invoke-virtual {p1}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    .line 1222
    iget-object v2, p0, Lkik/android/chat/KikApplication;->r:Lkik/a/e/i;

    invoke-virtual {p1}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lkik/a/e/i;->a(Ljava/lang/String;)Lkik/a/d/f;

    move-result-object v11

    .line 1224
    invoke-virtual {v0}, Lkik/a/d/k;->l()Z

    move-result v12

    .line 1225
    if-eqz v1, :cond_8

    instance-of v0, v1, Lkik/a/d/n;

    if-eqz v0, :cond_8

    const/4 v3, 0x1

    .line 1226
    :goto_1
    if-eqz v11, :cond_2

    invoke-virtual {v11}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_9

    :cond_2
    const/4 v0, 0x1

    move v9, v0

    .line 1227
    :goto_2
    invoke-virtual {p1}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v0

    const-string v2, "kikteam@"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    .line 1228
    if-eqz v11, :cond_a

    invoke-virtual {v11}, Lkik/a/d/f;->n()Z

    move-result v0

    if-eqz v0, :cond_a

    const/4 v4, 0x1

    .line 1229
    :goto_3
    if-eqz v1, :cond_b

    invoke-virtual {v1}, Lkik/a/d/k;->i()Z

    move-result v0

    if-eqz v0, :cond_b

    const/4 v5, 0x1

    .line 1231
    :goto_4
    invoke-virtual {p1}, Lkik/a/d/s;->a()Ljava/lang/String;

    move-result-object v13

    .line 1233
    if-eqz v13, :cond_c

    invoke-static {v13}, Lkik/a/h/i;->f(Ljava/lang/String;)I

    move-result v8

    .line 1235
    :goto_5
    const-wide/16 v6, 0x0

    .line 1237
    if-eqz v11, :cond_3

    invoke-virtual {v11}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 1238
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v6

    invoke-virtual {v11}, Lkik/a/d/f;->c()Ljava/util/Vector;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Vector;->lastElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/s;

    invoke-virtual {v0}, Lkik/a/d/s;->e()J

    move-result-wide v0

    sub-long v0, v6, v0

    long-to-double v0, v0

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double v6, v0, v6

    .line 1241
    :cond_3
    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "Message Received"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v1

    .line 1243
    invoke-static/range {v1 .. v8}, Lkik/android/util/by;->a(Lcom/kik/android/a$f;ZZZZDI)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v2, "Is Contact"

    invoke-virtual {v0, v2, v12}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v2, "Is Chat Open"

    invoke-virtual {v0, v2, v10}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v2, "Is First Message in Chat"

    invoke-virtual {v0, v2, v9}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v2

    const-string v3, "Is Encrypted"

    invoke-virtual {p1}, Lkik/a/d/s;->o()[B

    move-result-object v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lkik/a/d/s;->k()Z

    move-result v0

    if-eqz v0, :cond_d

    :cond_4
    const/4 v0, 0x1

    :goto_6
    invoke-virtual {v2, v3, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v2, "Is Decryption Failure"

    invoke-virtual {p1}, Lkik/a/d/s;->k()Z

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    .line 1250
    const-class v0, Lkik/a/d/a/a;

    invoke-static {p1, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 1252
    if-nez v0, :cond_e

    .line 1253
    if-eqz v13, :cond_5

    .line 1254
    invoke-static {v1, v13}, Lkik/android/util/by;->a(Lcom/kik/android/a$f;Ljava/lang/String;)Lcom/kik/android/a$f;

    .line 1273
    :cond_5
    :goto_7
    invoke-virtual {p1}, Lkik/a/d/s;->o()[B

    move-result-object v0

    if-eqz v0, :cond_6

    .line 1274
    const-string v0, "Decryption Time"

    invoke-virtual {p1}, Lkik/a/d/s;->p()J

    move-result-wide v2

    long-to-double v2, v2

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v2, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/kik/android/a$f;->a(Ljava/lang/String;D)Lcom/kik/android/a$f;

    .line 1277
    :cond_6
    invoke-virtual {v1}, Lcom/kik/android/a$f;->b()V

    .line 1279
    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "App Session Ended"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Messages Received"

    invoke-virtual {v0, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;)Lcom/kik/android/a$f;

    .line 1281
    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "Messages Received in Last 7 Days"

    invoke-virtual {p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->g(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;

    .line 1283
    if-eqz p1, :cond_7

    const-class v0, Lkik/a/d/a/a;

    invoke-static {p1, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lkik/a/d/a/a;->n()Z

    move-result v1

    if-eqz v1, :cond_13

    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "Stickers Received in Last 7 Days"

    invoke-virtual {p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->g(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;

    .line 1285
    :cond_7
    :goto_8
    if-nez v12, :cond_0

    if-eqz v9, :cond_0

    .line 1286
    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "Received New People in Last 7 Days"

    invoke-virtual {p1}, Lkik/a/d/s;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->g(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;

    goto/16 :goto_0

    .line 1225
    :cond_8
    const/4 v3, 0x0

    goto/16 :goto_1

    .line 1226
    :cond_9
    const/4 v0, 0x0

    move v9, v0

    goto/16 :goto_2

    .line 1228
    :cond_a
    const/4 v4, 0x0

    goto/16 :goto_3

    .line 1229
    :cond_b
    const/4 v5, 0x0

    goto/16 :goto_4

    .line 1233
    :cond_c
    const/4 v8, 0x0

    goto/16 :goto_5

    .line 1243
    :cond_d
    const/4 v0, 0x0

    goto/16 :goto_6

    .line 1258
    :cond_e
    if-eqz v13, :cond_11

    invoke-virtual {v13}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_11

    const/4 v2, 0x1

    .line 1259
    :goto_9
    invoke-virtual {v0}, Lkik/a/d/a/a;->t()Lkik/a/d/a/a$b;

    move-result-object v3

    invoke-virtual {v3}, Lkik/a/d/a/a$b;->a()Ljava/lang/String;

    move-result-object v3

    .line 1260
    invoke-static {v0}, Lkik/android/util/ae;->c(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v4

    .line 1262
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_10

    .line 1263
    const-string v3, "Camera"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    const-string v3, "Gallery"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    .line 1264
    :cond_f
    sget-object v3, Lkik/a/d/a/a$b;->b:Lkik/a/d/a/a$b;

    invoke-virtual {v3}, Lkik/a/d/a/a$b;->a()Ljava/lang/String;

    move-result-object v3

    .line 1270
    :cond_10
    :goto_a
    invoke-static {v1, v4, v2, v3, v0}, Lkik/android/util/by;->a(Lcom/kik/android/a$f;Ljava/lang/String;ZLjava/lang/String;Lkik/a/d/a/a;)Lcom/kik/android/a$f;

    goto/16 :goto_7

    .line 1258
    :cond_11
    const/4 v2, 0x0

    goto :goto_9

    .line 1267
    :cond_12
    sget-object v3, Lkik/a/d/a/a$b;->c:Lkik/a/d/a/a$b;

    invoke-virtual {v3}, Lkik/a/d/a/a$b;->a()Ljava/lang/String;

    move-result-object v3

    goto :goto_a

    .line 1283
    :cond_13
    invoke-virtual {v0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_7

    const-string v2, "com.kik.ext.camera"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_14

    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "Camera Pictures Received in Last 7 Days"

    invoke-virtual {p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->g(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;

    goto :goto_8

    :cond_14
    const-string v2, "com.kik.ext.gallery"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_15

    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "Gallery Pics Received in Last 7 Days"

    invoke-virtual {p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->g(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;

    goto/16 :goto_8

    :cond_15
    const-string v2, "com.kik.ext.video-camera"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_16

    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "Camera Videos Received In Last 7 Days"

    invoke-virtual {p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->g(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;

    goto/16 :goto_8

    :cond_16
    const-string v2, "com.kik.ext.video-gallery"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "Gallery Videos Received In Last 7 Days"

    invoke-virtual {p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->g(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;

    goto/16 :goto_8

    :cond_17
    const-string v2, "com.kik.cards"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-virtual {v0}, Lkik/a/d/a/a;->m()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "Web Pages Received in Last 7 Days"

    invoke-virtual {p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->g(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;

    goto/16 :goto_8

    :cond_18
    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "Cards Received in Last 7 Days"

    invoke-virtual {p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->g(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;

    goto/16 :goto_8

    :cond_19
    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "Native Sdk Content Received in Last 7 Days"

    invoke-virtual {p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->g(Ljava/lang/String;Ljava/lang/String;)Lcom/kik/android/a;

    goto/16 :goto_8
.end method

.method public final b(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 733
    iget-object v0, p0, Lkik/android/chat/KikApplication;->y:Landroid/app/Activity;

    if-ne v0, p1, :cond_0

    .line 734
    const/4 v0, 0x0

    iput-object v0, p0, Lkik/android/chat/KikApplication;->y:Landroid/app/Activity;

    .line 736
    :cond_0
    return-void
.end method

.method public final c(Landroid/app/Activity;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 1173
    iget-object v0, p0, Lkik/android/chat/KikApplication;->N:Landroid/app/Activity;

    if-ne v0, p1, :cond_1

    .line 1175
    iget-object v0, p0, Lkik/android/chat/KikApplication;->R:Ljava/util/TimerTask;

    if-eqz v0, :cond_0

    .line 1176
    iget-object v0, p0, Lkik/android/chat/KikApplication;->R:Ljava/util/TimerTask;

    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 1177
    iput-object v1, p0, Lkik/android/chat/KikApplication;->R:Ljava/util/TimerTask;

    .line 1180
    :cond_0
    iput-object v1, p0, Lkik/android/chat/KikApplication;->N:Landroid/app/Activity;

    .line 1182
    new-instance v0, Lkik/android/chat/v;

    invoke-direct {v0, p0}, Lkik/android/chat/v;-><init>(Lkik/android/chat/KikApplication;)V

    iput-object v0, p0, Lkik/android/chat/KikApplication;->R:Ljava/util/TimerTask;

    .line 1196
    iget-object v0, p0, Lkik/android/chat/KikApplication;->Q:Ljava/util/Timer;

    iget-object v1, p0, Lkik/android/chat/KikApplication;->R:Ljava/util/TimerTask;

    const-wide/16 v2, 0x4e20

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    .line 1198
    :cond_1
    return-void
.end method

.method public final c(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 1484
    iget-object v0, p0, Lkik/android/chat/KikApplication;->N:Landroid/app/Activity;

    .line 1486
    if-eqz v0, :cond_0

    .line 1487
    instance-of v1, v0, Lkik/android/chat/activity/FragmentWrapperActivity;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->hasWindowFocus()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1488
    check-cast v0, Lkik/android/chat/activity/FragmentWrapperActivity;

    .line 1489
    invoke-virtual {v0}, Lkik/android/chat/activity/FragmentWrapperActivity;->a()Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 1491
    instance-of v1, v0, Lkik/android/chat/fragment/KikChatFragment;

    if-eqz v1, :cond_0

    .line 1492
    check-cast v0, Lkik/android/chat/fragment/KikChatFragment;

    .line 1493
    invoke-virtual {v0}, Lkik/android/chat/fragment/KikChatFragment;->i()Lkik/a/d/k;

    move-result-object v0

    invoke-virtual {v0}, Lkik/a/d/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1494
    const/4 v0, 0x1

    .line 1500
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d(Landroid/app/Activity;)V
    .locals 12

    .prologue
    const/4 v4, 0x0

    const/4 v11, 0x1

    const/4 v10, 0x0

    .line 1388
    iget-object v0, p0, Lkik/android/chat/KikApplication;->N:Landroid/app/Activity;

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lkik/android/chat/KikApplication;->v:Z

    if-eqz v0, :cond_2

    .line 1389
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    .line 1390
    invoke-static {}, Lkik/a/h/j;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 1391
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 1393
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v8, -0x1

    cmp-long v0, v0, v8

    if-nez v0, :cond_0

    .line 1394
    const-string v0, "ctime"

    const-string v1, "true"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1397
    :cond_0
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 1398
    const-string v2, "s"

    iget-boolean v0, p0, Lkik/android/chat/KikApplication;->w:Z

    if-eqz v0, :cond_5

    const-wide/16 v0, 0x1

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {v5, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1400
    iget-object v0, p0, Lkik/android/chat/KikApplication;->T:Lkik/android/a/b;

    invoke-virtual {v0}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v1

    sget-object v2, Lcom/kik/d/b/a$k;->k:Lcom/kik/d/b/a$k;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    invoke-virtual/range {v1 .. v7}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;J)V

    .line 1402
    iget-boolean v0, p0, Lkik/android/chat/KikApplication;->z:Z

    if-nez v0, :cond_1

    iput-boolean v11, p0, Lkik/android/chat/KikApplication;->z:Z

    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "App Opened"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Cold Start"

    iget-boolean v2, p0, Lkik/android/chat/KikApplication;->ab:Z

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    iput-boolean v10, p0, Lkik/android/chat/KikApplication;->ab:Z

    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "App Session Ended"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a;->e(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "App Opened"

    invoke-virtual {v0, v1, v11}, Lcom/kik/android/a;->b(Ljava/lang/String;Z)Lcom/kik/android/a;

    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "App Session Started"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 1404
    :cond_1
    :goto_1
    iget-object v0, p0, Lkik/android/chat/KikApplication;->I:Lkik/a/e/k;

    invoke-interface {v0}, Lkik/a/e/k;->c()V

    .line 1406
    iput-boolean v10, p0, Lkik/android/chat/KikApplication;->v:Z

    .line 1407
    iput-boolean v10, p0, Lkik/android/chat/KikApplication;->w:Z

    .line 1410
    :cond_2
    iget-object v0, p0, Lkik/android/chat/KikApplication;->N:Landroid/app/Activity;

    if-nez v0, :cond_3

    .line 1411
    iget-object v0, p0, Lkik/android/chat/KikApplication;->Z:Lcom/kik/g/p;

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 1414
    :cond_3
    iput-object p1, p0, Lkik/android/chat/KikApplication;->N:Landroid/app/Activity;

    .line 1415
    iget-object v0, p0, Lkik/android/chat/KikApplication;->R:Ljava/util/TimerTask;

    if-eqz v0, :cond_4

    .line 1416
    iget-object v0, p0, Lkik/android/chat/KikApplication;->R:Ljava/util/TimerTask;

    invoke-virtual {v0}, Ljava/util/TimerTask;->cancel()Z

    .line 1417
    iput-object v4, p0, Lkik/android/chat/KikApplication;->R:Ljava/util/TimerTask;

    .line 1420
    :cond_4
    return-void

    .line 1398
    :cond_5
    const-wide/16 v0, 0x0

    goto :goto_0

    .line 1402
    :cond_6
    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v1, "App Opened"

    invoke-virtual {v0, v1, v10}, Lcom/kik/android/a;->b(Ljava/lang/String;Z)Lcom/kik/android/a;

    goto :goto_1
.end method

.method public final f()V
    .locals 2

    .prologue
    .line 641
    iget-object v0, p0, Lkik/android/chat/KikApplication;->Y:Lcom/kik/g/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 642
    return-void
.end method

.method public final j()V
    .locals 2

    .prologue
    .line 1157
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lkik/android/net/communicator/CommunicatorService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1158
    invoke-virtual {p0, v0}, Lkik/android/chat/KikApplication;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 1159
    return-void
.end method

.method protected final k()V
    .locals 6

    .prologue
    .line 1202
    iget-object v0, p0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    const-string v1, "kik.registrationtime"

    invoke-interface {v0, v1}, Lkik/a/e/v;->o(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 1204
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    .line 1205
    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    .line 1207
    iget-object v4, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v5, "Time Since Registration"

    sub-long v0, v2, v0

    long-to-double v0, v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v2

    invoke-virtual {v4, v5, v0, v1}, Lcom/kik/android/a;->a(Ljava/lang/String;D)Lcom/kik/android/a;

    .line 1209
    :cond_0
    return-void
.end method

.method protected final l()V
    .locals 8

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1359
    iget-boolean v0, p0, Lkik/android/chat/KikApplication;->z:Z

    if-nez v0, :cond_0

    .line 1379
    :goto_0
    return-void

    .line 1363
    :cond_0
    iput-boolean v2, p0, Lkik/android/chat/KikApplication;->z:Z

    .line 1364
    iget-object v0, p0, Lkik/android/chat/KikApplication;->A:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->a(Lkik/a/e/v;)Z

    move-result v3

    .line 1366
    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v4, "App Closed"

    invoke-virtual {v0, v4}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v4

    const-string v5, "Before Registration"

    if-nez v3, :cond_1

    move v0, v1

    :goto_1
    invoke-virtual {v4, v5, v0}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 1368
    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v4, "App Closed"

    invoke-virtual {v0, v4, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;Z)Lcom/kik/android/a;

    .line 1370
    iget-object v0, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v4, "App Opened"

    const-string v5, "App Closed"

    invoke-virtual {v0, v4, v5}, Lcom/kik/android/a;->b(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v4

    long-to-float v0, v4

    const/high16 v4, 0x447a0000    # 1000.0f

    div-float/2addr v0, v4

    .line 1372
    iget-object v4, p0, Lkik/android/chat/KikApplication;->b:Lcom/kik/android/a;

    const-string v5, "App Session Ended"

    invoke-virtual {v4, v5}, Lcom/kik/android/a;->c(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v4

    const-string v5, "Messages Received"

    const-wide/16 v6, 0x0

    invoke-virtual {v4, v5, v6, v7}, Lcom/kik/android/a$f;->b(Ljava/lang/String;J)Lcom/kik/android/a$f;

    move-result-object v4

    const-string v5, "Before Registration"

    if-nez v3, :cond_2

    :goto_2
    invoke-virtual {v4, v5, v1}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Z)Lcom/kik/android/a$f;

    move-result-object v1

    const-string v2, "Total Time"

    float-to-double v4, v0

    invoke-virtual {v1, v2, v4, v5}, Lcom/kik/android/a$f;->a(Ljava/lang/String;D)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 1378
    iget-object v0, p0, Lkik/android/chat/KikApplication;->T:Lkik/android/a/b;

    invoke-virtual {v0}, Lkik/android/a/b;->c()Lcom/kik/d/f;

    move-result-object v0

    sget-object v1, Lcom/kik/d/b/a$k;->Y:Lcom/kik/d/b/a$k;

    invoke-static {}, Lkik/a/h/j;->b()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/kik/d/f;->a(Lcom/kik/d/b/a$k;J)V

    goto :goto_0

    :cond_1
    move v0, v2

    .line 1366
    goto :goto_1

    :cond_2
    move v1, v2

    .line 1372
    goto :goto_2
.end method

.method public final m()Lcom/kik/g/l;
    .locals 1

    .prologue
    .line 1469
    iget-object v0, p0, Lkik/android/chat/KikApplication;->W:Lcom/kik/g/l;

    return-object v0
.end method

.method public final n()Z
    .locals 1

    .prologue
    .line 1474
    iget-boolean v0, p0, Lkik/android/chat/KikApplication;->v:Z

    return v0
.end method

.method public final o()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 1505
    iget-object v0, p0, Lkik/android/chat/KikApplication;->aa:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public onCreate()V
    .locals 4

    .prologue
    .line 746
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 747
    invoke-static {}, Lkik/android/util/s;->a()V

    .line 748
    const/4 v0, 0x1

    new-array v0, v0, [Lb/a/a/a/l;

    const/4 v1, 0x0

    new-instance v2, Lcom/a/a/a;

    invoke-direct {v2}, Lcom/a/a/a;-><init>()V

    aput-object v2, v0, v1

    invoke-static {p0, v0}, Lb/a/a/a/d;->a(Landroid/content/Context;[Lb/a/a/a/l;)Lb/a/a/a/d;

    .line 749
    new-instance v0, Lorg/spongycastle/jce/provider/BouncyCastleProvider;

    invoke-direct {v0}, Lorg/spongycastle/jce/provider/BouncyCastleProvider;-><init>()V

    invoke-static {v0}, Ljava/security/Security;->addProvider(Ljava/security/Provider;)I

    .line 751
    new-instance v0, Lkik/android/chat/l;

    invoke-direct {v0, p0}, Lkik/android/chat/l;-><init>(Lkik/android/chat/KikApplication;)V

    .line 759
    invoke-virtual {p0}, Lkik/android/chat/KikApplication;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 760
    invoke-static {v0}, Lkik/android/util/DeviceUtils;->a(Landroid/content/Context;)V

    .line 761
    invoke-static {v0}, Lkik/android/util/cj;->a(Landroid/content/Context;)V

    .line 763
    iget-object v1, p0, Lkik/android/chat/KikApplication;->t:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->start()V

    .line 767
    new-instance v1, Lkik/android/chat/n;

    invoke-direct {v1, p0}, Lkik/android/chat/n;-><init>(Lkik/android/chat/KikApplication;)V

    .line 775
    new-instance v1, Lcom/kik/cards/util/a;

    invoke-direct {v1}, Lcom/kik/cards/util/a;-><init>()V

    iput-object v1, p0, Lkik/android/chat/KikApplication;->O:Lcom/kik/cards/util/a;

    .line 777
    iget-object v1, p0, Lkik/android/chat/KikApplication;->p:Lcom/kik/g/f;

    iget-object v2, p0, Lkik/android/chat/KikApplication;->O:Lcom/kik/cards/util/a;

    invoke-virtual {v2}, Lcom/kik/cards/util/a;->a()Lcom/kik/g/e;

    move-result-object v2

    iget-object v3, p0, Lkik/android/chat/KikApplication;->af:Lcom/kik/g/i;

    invoke-virtual {v1, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 779
    sget-object v1, Lkik/android/chat/KikApplication;->k:Lkik/android/chat/KikApplication;

    invoke-static {v1}, Lkik/android/util/DeviceUtils;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lkik/android/chat/KikApplication;->n:Ljava/lang/String;

    .line 781
    invoke-virtual {p0}, Lkik/android/chat/KikApplication;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 783
    sput v1, Lkik/android/chat/KikApplication;->m:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    .line 784
    const/high16 v1, 0x3f800000    # 1.0f

    sput v1, Lkik/android/chat/KikApplication;->m:F

    .line 787
    :cond_0
    new-instance v1, Lkik/android/KikNotificationHandler;

    invoke-direct {v1, p0}, Lkik/android/KikNotificationHandler;-><init>(Landroid/content/Context;)V

    sput-object v1, Lkik/android/chat/KikApplication;->l:Lkik/android/KikNotificationHandler;

    .line 788
    new-instance v1, Lkik/android/h/h;

    invoke-direct {v1, p0}, Lkik/android/h/h;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lkik/android/chat/KikApplication;->J:Lkik/a/e/j;

    .line 789
    new-instance v1, Lkik/a/x;

    iget-object v2, p0, Lkik/android/chat/KikApplication;->J:Lkik/a/e/j;

    invoke-direct {v1, v2}, Lkik/a/x;-><init>(Lkik/a/e/j;)V

    iput-object v1, p0, Lkik/android/chat/KikApplication;->K:Lkik/a/x;

    .line 791
    iget-object v1, p0, Lkik/android/chat/KikApplication;->K:Lkik/a/x;

    invoke-virtual {v1}, Lkik/a/x;->a()Lkik/a/a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lkik/android/chat/KikApplication;->a(Landroid/content/Context;Lkik/a/a;)V

    .line 792
    return-void
.end method
