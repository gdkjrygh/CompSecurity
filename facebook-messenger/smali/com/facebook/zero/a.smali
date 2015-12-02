.class public Lcom/facebook/zero/a;
.super Ljava/lang/Object;
.source "ZeroLoginAndConfigurationComponent.java"

# interfaces
.implements Lcom/facebook/auth/a/c;
.implements Lcom/facebook/config/background/k;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/zero/b/d;

.field private final c:Lcom/facebook/zero/d/a;

.field private final d:Lcom/facebook/zero/server/d;

.field private final e:Lcom/facebook/zero/protocol/a/b;

.field private final f:Lcom/facebook/zero/ui/p;

.field private final g:Lcom/facebook/zero/rewrite/e;

.field private final h:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/facebook/zero/a;

    sput-object v0, Lcom/facebook/zero/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/zero/b/d;Lcom/facebook/zero/d/a;Lcom/facebook/zero/server/d;Lcom/facebook/zero/protocol/a/b;Lcom/facebook/zero/ui/p;Lcom/facebook/zero/rewrite/e;Ljavax/inject/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/zero/b/d;",
            "Lcom/facebook/zero/d/a;",
            "Lcom/facebook/zero/server/d;",
            "Lcom/facebook/zero/protocol/a/b;",
            "Lcom/facebook/zero/ui/p;",
            "Lcom/facebook/zero/rewrite/e;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    iput-object p1, p0, Lcom/facebook/zero/a;->b:Lcom/facebook/zero/b/d;

    .line 55
    iput-object p2, p0, Lcom/facebook/zero/a;->c:Lcom/facebook/zero/d/a;

    .line 56
    iput-object p3, p0, Lcom/facebook/zero/a;->d:Lcom/facebook/zero/server/d;

    .line 57
    iput-object p4, p0, Lcom/facebook/zero/a;->e:Lcom/facebook/zero/protocol/a/b;

    .line 58
    iput-object p5, p0, Lcom/facebook/zero/a;->f:Lcom/facebook/zero/ui/p;

    .line 59
    iput-object p6, p0, Lcom/facebook/zero/a;->g:Lcom/facebook/zero/rewrite/e;

    .line 60
    iput-object p7, p0, Lcom/facebook/zero/a;->h:Ljavax/inject/a;

    .line 61
    return-void
.end method

.method static synthetic a()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 32
    sget-object v0, Lcom/facebook/zero/a;->a:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/zero/a;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/zero/a;->h:Ljavax/inject/a;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/zero/a;)Lcom/facebook/zero/server/d;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/zero/a;->d:Lcom/facebook/zero/server/d;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/zero/a;)Lcom/facebook/zero/protocol/a/b;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/zero/a;->e:Lcom/facebook/zero/protocol/a/b;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/zero/a;)Lcom/facebook/zero/ui/p;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/zero/a;->f:Lcom/facebook/zero/ui/p;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/zero/a;)Lcom/facebook/zero/b/d;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/zero/a;->b:Lcom/facebook/zero/b/d;

    return-object v0
.end method

.method static synthetic f(Lcom/facebook/zero/a;)Lcom/facebook/zero/rewrite/e;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/zero/a;->g:Lcom/facebook/zero/rewrite/e;

    return-object v0
.end method

.method static synthetic g(Lcom/facebook/zero/a;)Lcom/facebook/zero/d/a;
    .locals 1

    .prologue
    .line 32
    iget-object v0, p0, Lcom/facebook/zero/a;->c:Lcom/facebook/zero/d/a;

    return-object v0
.end method


# virtual methods
.method public b()Lcom/facebook/http/protocol/v;
    .locals 2

    .prologue
    .line 74
    new-instance v0, Lcom/facebook/zero/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/zero/b;-><init>(Lcom/facebook/zero/a;Z)V

    return-object v0
.end method

.method public c()Lcom/facebook/http/protocol/v;
    .locals 2

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/zero/a;->h:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    new-instance v0, Lcom/facebook/zero/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcom/facebook/zero/b;-><init>(Lcom/facebook/zero/a;Z)V

    .line 69
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
