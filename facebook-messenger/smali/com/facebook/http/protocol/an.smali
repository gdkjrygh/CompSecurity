.class public Lcom/facebook/http/protocol/an;
.super Ljava/lang/Object;
.source "MethodBatcherImpl.java"

# interfaces
.implements Lcom/facebook/http/protocol/am;


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
.field private final b:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/c/i;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/facebook/http/c/i;

.field private final d:Lcom/facebook/http/c/i;

.field private final e:Lcom/facebook/http/b/ap;

.field private final f:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;"
        }
    .end annotation
.end field

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

.field private final i:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Lcom/fasterxml/jackson/core/JsonFactory;

.field private final l:Lcom/fasterxml/jackson/databind/ObjectMapper;

.field private final m:Lcom/facebook/http/protocol/s;

.field private final n:Lcom/facebook/http/protocol/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 51
    const-class v0, Lcom/facebook/http/protocol/an;

    sput-object v0, Lcom/facebook/http/protocol/an;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/http/c/i;Lcom/facebook/http/c/i;Lcom/facebook/http/b/ap;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Ljavax/inject/a;Lcom/fasterxml/jackson/core/JsonFactory;Lcom/fasterxml/jackson/databind/ObjectMapper;Lcom/facebook/http/protocol/s;Lcom/facebook/http/protocol/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/http/c/i;",
            ">;",
            "Lcom/facebook/http/c/i;",
            "Lcom/facebook/http/c/i;",
            "Lcom/facebook/http/b/ap;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/auth/viewercontext/ViewerContext;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/fasterxml/jackson/core/JsonFactory;",
            "Lcom/fasterxml/jackson/databind/ObjectMapper;",
            "Lcom/facebook/http/protocol/s;",
            "Lcom/facebook/http/protocol/q;",
            ")V"
        }
    .end annotation

    .prologue
    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput-object p1, p0, Lcom/facebook/http/protocol/an;->b:Ljavax/inject/a;

    .line 89
    iput-object p2, p0, Lcom/facebook/http/protocol/an;->c:Lcom/facebook/http/c/i;

    .line 90
    iput-object p3, p0, Lcom/facebook/http/protocol/an;->d:Lcom/facebook/http/c/i;

    .line 91
    iput-object p4, p0, Lcom/facebook/http/protocol/an;->e:Lcom/facebook/http/b/ap;

    .line 92
    iput-object p5, p0, Lcom/facebook/http/protocol/an;->f:Ljavax/inject/a;

    .line 93
    iput-object p6, p0, Lcom/facebook/http/protocol/an;->g:Ljavax/inject/a;

    .line 94
    iput-object p7, p0, Lcom/facebook/http/protocol/an;->h:Ljavax/inject/a;

    .line 95
    iput-object p8, p0, Lcom/facebook/http/protocol/an;->i:Ljavax/inject/a;

    .line 96
    iput-object p9, p0, Lcom/facebook/http/protocol/an;->j:Ljavax/inject/a;

    .line 97
    iput-object p10, p0, Lcom/facebook/http/protocol/an;->k:Lcom/fasterxml/jackson/core/JsonFactory;

    .line 98
    iput-object p11, p0, Lcom/facebook/http/protocol/an;->l:Lcom/fasterxml/jackson/databind/ObjectMapper;

    .line 99
    iput-object p12, p0, Lcom/facebook/http/protocol/an;->m:Lcom/facebook/http/protocol/s;

    .line 100
    iput-object p13, p0, Lcom/facebook/http/protocol/an;->n:Lcom/facebook/http/protocol/q;

    .line 101
    return-void
.end method

.method static synthetic a(Lcom/facebook/http/protocol/an;)Lcom/facebook/http/protocol/q;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/http/protocol/an;->n:Lcom/facebook/http/protocol/q;

    return-object v0
.end method

.method static synthetic b()Ljava/lang/Class;
    .locals 1

    .prologue
    .line 49
    sget-object v0, Lcom/facebook/http/protocol/an;->a:Ljava/lang/Class;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/http/protocol/an;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/http/protocol/an;->h:Ljavax/inject/a;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/http/protocol/an;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/http/protocol/an;->f:Ljavax/inject/a;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/http/protocol/an;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/http/protocol/an;->i:Ljavax/inject/a;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/http/protocol/an;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/http/protocol/an;->j:Ljavax/inject/a;

    return-object v0
.end method

.method static synthetic f(Lcom/facebook/http/protocol/an;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/http/protocol/an;->g:Ljavax/inject/a;

    return-object v0
.end method

.method static synthetic g(Lcom/facebook/http/protocol/an;)Lcom/facebook/http/c/i;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/http/protocol/an;->c:Lcom/facebook/http/c/i;

    return-object v0
.end method

.method static synthetic h(Lcom/facebook/http/protocol/an;)Lcom/facebook/http/c/i;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/http/protocol/an;->d:Lcom/facebook/http/c/i;

    return-object v0
.end method

.method static synthetic i(Lcom/facebook/http/protocol/an;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/http/protocol/an;->b:Ljavax/inject/a;

    return-object v0
.end method

.method static synthetic j(Lcom/facebook/http/protocol/an;)Lcom/facebook/http/b/ap;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/http/protocol/an;->e:Lcom/facebook/http/b/ap;

    return-object v0
.end method

.method static synthetic k(Lcom/facebook/http/protocol/an;)Lcom/facebook/http/protocol/s;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/http/protocol/an;->m:Lcom/facebook/http/protocol/s;

    return-object v0
.end method

.method static synthetic l(Lcom/facebook/http/protocol/an;)Lcom/fasterxml/jackson/core/JsonFactory;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/http/protocol/an;->k:Lcom/fasterxml/jackson/core/JsonFactory;

    return-object v0
.end method

.method static synthetic m(Lcom/facebook/http/protocol/an;)Lcom/fasterxml/jackson/databind/ObjectMapper;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/http/protocol/an;->l:Lcom/fasterxml/jackson/databind/ObjectMapper;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/http/protocol/j;
    .locals 2

    .prologue
    .line 105
    new-instance v0, Lcom/facebook/http/protocol/ap;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/http/protocol/ap;-><init>(Lcom/facebook/http/protocol/an;Lcom/facebook/http/protocol/ao;)V

    return-object v0
.end method
