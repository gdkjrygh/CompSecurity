.class public Lcom/facebook/config/server/d;
.super Lcom/facebook/inject/c;
.source "DefaultServerConfigModule.java"


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 28
    const-string v0, "TestApp"

    invoke-direct {p0, v0}, Lcom/facebook/config/server/d;-><init>(Ljava/lang/String;)V

    .line 29
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/facebook/config/server/d;->a:Ljava/lang/String;

    .line 33
    return-void
.end method

.method static synthetic a(Lcom/facebook/config/server/d;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/config/server/d;->a:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 37
    const-class v0, Lcom/facebook/config/server/q;

    invoke-virtual {p0, v0}, Lcom/facebook/config/server/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/config/server/g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/config/server/g;-><init>(Lcom/facebook/config/server/d;Lcom/facebook/config/server/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 39
    const-class v0, Lcom/facebook/config/server/b;

    invoke-virtual {p0, v0}, Lcom/facebook/config/server/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/config/server/f;

    invoke-direct {v1, v2}, Lcom/facebook/config/server/f;-><init>(Lcom/facebook/config/server/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 44
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/config/server/d;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/prefs/shared/IsInternalPrefsEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 49
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/config/server/d;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/config/server/IsBootstrapEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 54
    const-class v0, Lcom/facebook/config/server/j;

    invoke-virtual {p0, v0}, Lcom/facebook/config/server/d;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/config/server/b;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 56
    return-void
.end method
