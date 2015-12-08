.class public final Lcom/cm/kinfoc/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/cm/kinfoc/o;


# instance fields
.field private b:Lcom/cm/kinfoc/p;

.field private c:I

.field private d:I

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Lcom/cm/kinfoc/n;

.field private volatile h:Z

.field private final i:Ljava/lang/Object;

.field private j:Ljava/util/Timer;

.field private k:Ljava/util/TimerTask;

.field private final l:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 17
    const/4 v0, 0x0

    sput-object v0, Lcom/cm/kinfoc/o;->a:Lcom/cm/kinfoc/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Lcom/cm/kinfoc/p;

    invoke-direct {v0}, Lcom/cm/kinfoc/p;-><init>()V

    iput-object v0, p0, Lcom/cm/kinfoc/o;->b:Lcom/cm/kinfoc/p;

    .line 19
    const/4 v0, -0x1

    iput v0, p0, Lcom/cm/kinfoc/o;->c:I

    .line 20
    iput v2, p0, Lcom/cm/kinfoc/o;->d:I

    .line 21
    iput-object v1, p0, Lcom/cm/kinfoc/o;->e:Ljava/lang/String;

    .line 22
    iput-object v1, p0, Lcom/cm/kinfoc/o;->f:Ljava/lang/String;

    .line 23
    iput-object v1, p0, Lcom/cm/kinfoc/o;->g:Lcom/cm/kinfoc/n;

    .line 24
    iput-boolean v2, p0, Lcom/cm/kinfoc/o;->h:Z

    .line 25
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/cm/kinfoc/o;->i:Ljava/lang/Object;

    .line 27
    iput-object v1, p0, Lcom/cm/kinfoc/o;->j:Ljava/util/Timer;

    .line 28
    iput-object v1, p0, Lcom/cm/kinfoc/o;->k:Ljava/util/TimerTask;

    .line 29
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/cm/kinfoc/o;->l:Ljava/lang/Object;

    return-void
.end method

.method public static a()Lcom/cm/kinfoc/o;
    .locals 1

    .prologue
    .line 36
    sget-object v0, Lcom/cm/kinfoc/o;->a:Lcom/cm/kinfoc/o;

    if-nez v0, :cond_0

    .line 37
    new-instance v0, Lcom/cm/kinfoc/o;

    invoke-direct {v0}, Lcom/cm/kinfoc/o;-><init>()V

    sput-object v0, Lcom/cm/kinfoc/o;->a:Lcom/cm/kinfoc/o;

    .line 40
    :cond_0
    sget-object v0, Lcom/cm/kinfoc/o;->a:Lcom/cm/kinfoc/o;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/cm/kinfoc/n;Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lcom/cm/kinfoc/o;->g:Lcom/cm/kinfoc/n;

    .line 45
    iput p3, p0, Lcom/cm/kinfoc/o;->c:I

    .line 46
    iput p4, p0, Lcom/cm/kinfoc/o;->d:I

    .line 47
    iput-object p5, p0, Lcom/cm/kinfoc/o;->e:Ljava/lang/String;

    .line 48
    iput-object p2, p0, Lcom/cm/kinfoc/o;->f:Ljava/lang/String;

    .line 49
    return-void
.end method
