.class public Lcom/qihoo/security/engine/cloudscan/a/h$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/engine/cloudscan/a/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:Z

.field private c:J

.field private d:Z

.field private e:Lcom/qihoo/security/engine/cloudscan/a/g;

.field private f:Z

.field private g:Lnet/jarlehansen/protobuf/javame/b;

.field private h:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->b:Z

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->d:Z

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->f:Z

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->h:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/h$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/qihoo/security/engine/cloudscan/a/h$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/engine/cloudscan/a/h$a;)I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->a:I

    return v0
.end method

.method static synthetic b(Lcom/qihoo/security/engine/cloudscan/a/h$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->b:Z

    return v0
.end method

.method static synthetic c(Lcom/qihoo/security/engine/cloudscan/a/h$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->c:J

    return-wide v0
.end method

.method static synthetic d(Lcom/qihoo/security/engine/cloudscan/a/h$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->d:Z

    return v0
.end method

.method static synthetic e(Lcom/qihoo/security/engine/cloudscan/a/h$a;)Lcom/qihoo/security/engine/cloudscan/a/g;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->e:Lcom/qihoo/security/engine/cloudscan/a/g;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/engine/cloudscan/a/h$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->f:Z

    return v0
.end method

.method static synthetic g(Lcom/qihoo/security/engine/cloudscan/a/h$a;)Lnet/jarlehansen/protobuf/javame/b;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->g:Lnet/jarlehansen/protobuf/javame/b;

    return-object v0
.end method

.method static synthetic h(Lcom/qihoo/security/engine/cloudscan/a/h$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->h:Z

    return v0
.end method


# virtual methods
.method public a(I)Lcom/qihoo/security/engine/cloudscan/a/h$a;
    .locals 1

    iput p1, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->a:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->b:Z

    return-object p0
.end method

.method public a(J)Lcom/qihoo/security/engine/cloudscan/a/h$a;
    .locals 1

    iput-wide p1, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->c:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->d:Z

    return-object p0
.end method

.method public a(Lcom/qihoo/security/engine/cloudscan/a/g;)Lcom/qihoo/security/engine/cloudscan/a/h$a;
    .locals 1

    iput-object p1, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->e:Lcom/qihoo/security/engine/cloudscan/a/g;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->f:Z

    return-object p0
.end method

.method public a(Lnet/jarlehansen/protobuf/javame/b;)Lcom/qihoo/security/engine/cloudscan/a/h$a;
    .locals 1

    iput-object p1, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->g:Lnet/jarlehansen/protobuf/javame/b;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/h$a;->h:Z

    return-object p0
.end method

.method public a()Lcom/qihoo/security/engine/cloudscan/a/h;
    .locals 2

    new-instance v0, Lcom/qihoo/security/engine/cloudscan/a/h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/engine/cloudscan/a/h;-><init>(Lcom/qihoo/security/engine/cloudscan/a/h$a;Lcom/qihoo/security/engine/cloudscan/a/h;)V

    return-object v0
.end method
