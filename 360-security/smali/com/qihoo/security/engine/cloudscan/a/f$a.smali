.class public Lcom/qihoo/security/engine/cloudscan/a/f$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/engine/cloudscan/a/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/Vector;

.field private b:Z

.field private c:Ljava/util/Vector;

.field private d:Z


# direct methods
.method private constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/f$a;->a:Ljava/util/Vector;

    iput-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/f$a;->b:Z

    new-instance v0, Ljava/util/Vector;

    invoke-direct {v0}, Ljava/util/Vector;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/f$a;->c:Ljava/util/Vector;

    iput-boolean v1, p0, Lcom/qihoo/security/engine/cloudscan/a/f$a;->d:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/engine/cloudscan/a/f$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/qihoo/security/engine/cloudscan/a/f$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/engine/cloudscan/a/f$a;)Ljava/util/Vector;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/f$a;->a:Ljava/util/Vector;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/engine/cloudscan/a/f$a;)Ljava/util/Vector;
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/f$a;->c:Ljava/util/Vector;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/qihoo/security/engine/cloudscan/a/i;)Lcom/qihoo/security/engine/cloudscan/a/f$a;
    .locals 1

    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/f$a;->b:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/f$a;->b:Z

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/f$a;->a:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    return-object p0
.end method

.method public a(Lcom/qihoo/security/engine/cloudscan/a/j;)Lcom/qihoo/security/engine/cloudscan/a/f$a;
    .locals 1

    iget-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/f$a;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/security/engine/cloudscan/a/f$a;->d:Z

    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/engine/cloudscan/a/f$a;->c:Ljava/util/Vector;

    invoke-virtual {v0, p1}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V

    return-object p0
.end method

.method public a()Lcom/qihoo/security/engine/cloudscan/a/f;
    .locals 2

    new-instance v0, Lcom/qihoo/security/engine/cloudscan/a/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/qihoo/security/engine/cloudscan/a/f;-><init>(Lcom/qihoo/security/engine/cloudscan/a/f$a;Lcom/qihoo/security/engine/cloudscan/a/f;)V

    return-object v0
.end method
