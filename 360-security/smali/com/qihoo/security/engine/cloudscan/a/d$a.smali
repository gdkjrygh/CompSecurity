.class public Lcom/qihoo/security/engine/cloudscan/a/d$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/engine/cloudscan/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Z

.field private c:I

.field private d:Z

.field private e:Ljava/lang/String;

.field private f:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d$a;->b:Z

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d$a;->d:Z

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d$a;->f:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/d$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/qihoo/security/engine/cloudscan/a/d$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/engine/cloudscan/a/d$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d$a;->b:Z

    return v0
.end method

.method static synthetic b(Lcom/qihoo/security/engine/cloudscan/a/d$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d$a;->d:Z

    return v0
.end method

.method static synthetic c(Lcom/qihoo/security/engine/cloudscan/a/d$a;)I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d$a;->a:I

    return v0
.end method

.method static synthetic d(Lcom/qihoo/security/engine/cloudscan/a/d$a;)I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d$a;->c:I

    return v0
.end method

.method static synthetic e(Lcom/qihoo/security/engine/cloudscan/a/d$a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d$a;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/engine/cloudscan/a/d$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d$a;->f:Z

    return v0
.end method


# virtual methods
.method public a(I)Lcom/qihoo/security/engine/cloudscan/a/d$a;
    .locals 1

    iput p1, p0, Lcom/qihoo/security/engine/cloudscan/a/d$a;->a:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d$a;->b:Z

    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/d$a;
    .locals 1

    iput-object p1, p0, Lcom/qihoo/security/engine/cloudscan/a/d$a;->e:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d$a;->f:Z

    return-object p0
.end method

.method public a()Lcom/qihoo/security/engine/cloudscan/a/d;
    .locals 2

    new-instance v0, Lcom/qihoo/security/engine/cloudscan/a/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/engine/cloudscan/a/d;-><init>(Lcom/qihoo/security/engine/cloudscan/a/d$a;Lcom/qihoo/security/engine/cloudscan/a/d;)V

    return-object v0
.end method

.method public b(I)Lcom/qihoo/security/engine/cloudscan/a/d$a;
    .locals 1

    iput p1, p0, Lcom/qihoo/security/engine/cloudscan/a/d$a;->c:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/d$a;->d:Z

    return-object p0
.end method
