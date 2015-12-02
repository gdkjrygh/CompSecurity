.class public Lcom/qihoo/security/gamebooster/e;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/qihoo/security/gamebooster/e;->a:Ljava/util/List;

    .line 24
    invoke-direct {p0, p1}, Lcom/qihoo/security/gamebooster/e;->a(Ljava/util/List;)V

    .line 26
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/gamebooster/e;->b:Ljava/util/List;

    .line 30
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/e;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 31
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/e;->b:Ljava/util/List;

    sget-object v1, Lcom/qihoo/security/gamebooster/LocalGamePkg;->ADD:Lcom/qihoo/security/gamebooster/LocalGamePkg;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/gamebooster/LocalGamePkg;",
            ">;"
        }
    .end annotation

    .prologue
    .line 35
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/e;->b:Ljava/util/List;

    return-object v0
.end method
