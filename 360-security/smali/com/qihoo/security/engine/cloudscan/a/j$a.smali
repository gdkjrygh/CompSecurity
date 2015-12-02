.class public Lcom/qihoo/security/engine/cloudscan/a/j$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/engine/cloudscan/a/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Z

.field private c:Lnet/jarlehansen/protobuf/javame/b;

.field private d:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/j$a;->b:Z

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/j$a;->d:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/j$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/qihoo/security/engine/cloudscan/a/j$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/engine/cloudscan/a/j$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/j$a;->b:Z

    return v0
.end method

.method static synthetic b(Lcom/qihoo/security/engine/cloudscan/a/j$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/j$a;->d:Z

    return v0
.end method

.method static synthetic c(Lcom/qihoo/security/engine/cloudscan/a/j$a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/j$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/qihoo/security/engine/cloudscan/a/j$a;)Lnet/jarlehansen/protobuf/javame/b;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/j$a;->c:Lnet/jarlehansen/protobuf/javame/b;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/qihoo/security/engine/cloudscan/a/j$a;
    .locals 1

    iput-object p1, p0, Lcom/qihoo/security/engine/cloudscan/a/j$a;->a:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/j$a;->b:Z

    return-object p0
.end method

.method public a(Lnet/jarlehansen/protobuf/javame/b;)Lcom/qihoo/security/engine/cloudscan/a/j$a;
    .locals 1

    iput-object p1, p0, Lcom/qihoo/security/engine/cloudscan/a/j$a;->c:Lnet/jarlehansen/protobuf/javame/b;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/j$a;->d:Z

    return-object p0
.end method

.method public a()Lcom/qihoo/security/engine/cloudscan/a/j;
    .locals 2

    new-instance v0, Lcom/qihoo/security/engine/cloudscan/a/j;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/engine/cloudscan/a/j;-><init>(Lcom/qihoo/security/engine/cloudscan/a/j$a;Lcom/qihoo/security/engine/cloudscan/a/j;)V

    return-object v0
.end method
