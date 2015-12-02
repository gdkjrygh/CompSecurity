.class public Lcom/facebook/orca/chatheads/ch;
.super Ljava/lang/Object;
.source "ChatHeadsInitializer.java"

# interfaces
.implements Lcom/facebook/base/c;


# instance fields
.field private final a:Lcom/facebook/i/a/a/f;

.field private final b:Lcom/facebook/prefs/shared/d;

.field private final c:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/facebook/orca/chatheads/by;

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

.field private final f:Lcom/facebook/prefs/shared/f;


# direct methods
.method public constructor <init>(Lcom/facebook/i/a/a/f;Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/chatheads/by;Ljavax/inject/a;Ljavax/inject/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/i/a/a/f;",
            "Lcom/facebook/prefs/shared/d;",
            "Lcom/facebook/orca/chatheads/by;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ch;->a:Lcom/facebook/i/a/a/f;

    .line 35
    iput-object p2, p0, Lcom/facebook/orca/chatheads/ch;->b:Lcom/facebook/prefs/shared/d;

    .line 36
    iput-object p4, p0, Lcom/facebook/orca/chatheads/ch;->c:Ljavax/inject/a;

    .line 37
    iput-object p3, p0, Lcom/facebook/orca/chatheads/ch;->d:Lcom/facebook/orca/chatheads/by;

    .line 38
    iput-object p5, p0, Lcom/facebook/orca/chatheads/ch;->e:Ljavax/inject/a;

    .line 40
    new-instance v0, Lcom/facebook/orca/chatheads/ci;

    invoke-direct {v0, p0}, Lcom/facebook/orca/chatheads/ci;-><init>(Lcom/facebook/orca/chatheads/ch;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/ch;->f:Lcom/facebook/prefs/shared/f;

    .line 64
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/ch;)Lcom/facebook/orca/chatheads/by;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ch;->d:Lcom/facebook/orca/chatheads/by;

    return-object v0
.end method

.method static synthetic b(Lcom/facebook/orca/chatheads/ch;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ch;->c:Ljavax/inject/a;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/orca/chatheads/ch;)Lcom/facebook/i/a/a/f;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ch;->a:Lcom/facebook/i/a/a/f;

    return-object v0
.end method

.method static synthetic d(Lcom/facebook/orca/chatheads/ch;)Lcom/facebook/prefs/shared/f;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ch;->f:Lcom/facebook/prefs/shared/f;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/orca/chatheads/ch;)Lcom/facebook/prefs/shared/d;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ch;->b:Lcom/facebook/prefs/shared/d;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ch;->a:Lcom/facebook/i/a/a/f;

    sget-object v1, Lcom/facebook/messages/ipc/peer/d;->k:Landroid/net/Uri;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/ch;->c:Ljavax/inject/a;

    invoke-interface {v2}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/i/a/a/f;->a(Landroid/net/Uri;Ljava/lang/Object;)V

    .line 71
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ch;->b:Lcom/facebook/prefs/shared/d;

    new-instance v1, Lcom/facebook/orca/chatheads/cj;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/cj;-><init>(Lcom/facebook/orca/chatheads/ch;)V

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->a(Ljava/lang/Runnable;)V

    .line 81
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ch;->b:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/orca/prefs/n;->G:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    .line 84
    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/chatheads/ch;->e:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ch;->d:Lcom/facebook/orca/chatheads/by;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/by;->a()V

    .line 87
    :cond_0
    return-void
.end method
