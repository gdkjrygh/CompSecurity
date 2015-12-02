.class public Lcom/qihoo/security/engine/cloudscan/a/k$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/engine/cloudscan/a/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/qihoo/security/engine/cloudscan/a/b;

.field private b:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/k$a;->b:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/k$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/qihoo/security/engine/cloudscan/a/k$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/engine/cloudscan/a/k$a;)Lcom/qihoo/security/engine/cloudscan/a/b;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/k$a;->a:Lcom/qihoo/security/engine/cloudscan/a/b;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/engine/cloudscan/a/k$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/k$a;->b:Z

    return v0
.end method


# virtual methods
.method public a(Lcom/qihoo/security/engine/cloudscan/a/b;)Lcom/qihoo/security/engine/cloudscan/a/k$a;
    .locals 1

    iput-object p1, p0, Lcom/qihoo/security/engine/cloudscan/a/k$a;->a:Lcom/qihoo/security/engine/cloudscan/a/b;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/k$a;->b:Z

    return-object p0
.end method

.method public a()Lcom/qihoo/security/engine/cloudscan/a/k;
    .locals 2

    new-instance v0, Lcom/qihoo/security/engine/cloudscan/a/k;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/engine/cloudscan/a/k;-><init>(Lcom/qihoo/security/engine/cloudscan/a/k$a;Lcom/qihoo/security/engine/cloudscan/a/k;)V

    return-object v0
.end method
