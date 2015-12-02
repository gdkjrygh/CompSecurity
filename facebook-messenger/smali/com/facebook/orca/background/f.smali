.class public Lcom/facebook/orca/background/f;
.super Lcom/facebook/inject/c;
.source "MessagesBackgroundModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 137
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 32
    const-class v0, Lcom/facebook/backgroundtasks/f;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/background/f;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 34
    const-class v0, Lcom/facebook/orca/background/c;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/background/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/background/i;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/background/i;-><init>(Lcom/facebook/orca/background/f;Lcom/facebook/orca/background/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 37
    const-class v0, Lcom/facebook/orca/background/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/background/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/background/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/background/h;-><init>(Lcom/facebook/orca/background/f;Lcom/facebook/orca/background/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 40
    const-class v0, Lcom/facebook/orca/background/d;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/background/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/background/j;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/background/j;-><init>(Lcom/facebook/orca/background/f;Lcom/facebook/orca/background/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 43
    const-class v0, Lcom/facebook/orca/background/o;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/background/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/background/k;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/background/k;-><init>(Lcom/facebook/orca/background/f;Lcom/facebook/orca/background/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 46
    const-class v0, Lcom/facebook/orca/background/p;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/background/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/background/l;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/background/l;-><init>(Lcom/facebook/orca/background/f;Lcom/facebook/orca/background/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 49
    const-class v0, Lcom/facebook/orca/background/q;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/background/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/background/m;

    invoke-direct {v1, v2}, Lcom/facebook/orca/background/m;-><init>(Lcom/facebook/orca/background/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 53
    const-class v0, Lcom/facebook/backgroundtasks/c;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/background/f;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/background/c;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/background/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/background/d;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/background/o;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/divebar/bk;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/background/p;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/background/q;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 61
    return-void
.end method
