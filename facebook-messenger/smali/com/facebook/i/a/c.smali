.class public Lcom/facebook/i/a/c;
.super Ljava/lang/Object;
.source "PeerProcessManagerFactory.java"


# instance fields
.field private final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/common/process/d;

.field private final c:Lcom/facebook/common/e/h;

.field private final d:Landroid/os/HandlerThread;

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/facebook/auth/c/b;


# direct methods
.method public constructor <init>(Ljavax/inject/a;Lcom/facebook/common/process/d;Lcom/facebook/common/e/h;Landroid/os/HandlerThread;Ljavax/inject/a;Lcom/facebook/auth/c/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Integer;",
            ">;",
            "Lcom/facebook/common/process/d;",
            "Lcom/facebook/common/e/h;",
            "Landroid/os/HandlerThread;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/facebook/auth/c/b;",
            ")V"
        }
    .end annotation

    .prologue
    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/facebook/i/a/c;->a:Ljavax/inject/a;

    .line 40
    iput-object p2, p0, Lcom/facebook/i/a/c;->b:Lcom/facebook/common/process/d;

    .line 41
    iput-object p3, p0, Lcom/facebook/i/a/c;->c:Lcom/facebook/common/e/h;

    .line 42
    iput-object p4, p0, Lcom/facebook/i/a/c;->d:Landroid/os/HandlerThread;

    .line 43
    iput-object p5, p0, Lcom/facebook/i/a/c;->e:Ljavax/inject/a;

    .line 44
    iput-object p6, p0, Lcom/facebook/i/a/c;->f:Lcom/facebook/auth/c/b;

    .line 45
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/facebook/base/broadcast/j;Z)Lcom/facebook/i/a/b;
    .locals 10

    .prologue
    .line 62
    new-instance v0, Lcom/facebook/i/a/d;

    iget-object v3, p0, Lcom/facebook/i/a/c;->a:Ljavax/inject/a;

    iget-object v4, p0, Lcom/facebook/i/a/c;->b:Lcom/facebook/common/process/d;

    iget-object v5, p0, Lcom/facebook/i/a/c;->c:Lcom/facebook/common/e/h;

    iget-object v6, p0, Lcom/facebook/i/a/c;->f:Lcom/facebook/auth/c/b;

    iget-object v7, p0, Lcom/facebook/i/a/c;->d:Landroid/os/HandlerThread;

    iget-object v8, p0, Lcom/facebook/i/a/c;->e:Ljavax/inject/a;

    move-object v1, p1

    move-object v2, p2

    move v9, p3

    invoke-direct/range {v0 .. v9}, Lcom/facebook/i/a/d;-><init>(Ljava/lang/String;Lcom/facebook/base/broadcast/j;Ljavax/inject/a;Lcom/facebook/common/process/d;Lcom/facebook/common/e/h;Lcom/facebook/auth/c/b;Landroid/os/HandlerThread;Ljavax/inject/a;Z)V

    return-object v0
.end method
