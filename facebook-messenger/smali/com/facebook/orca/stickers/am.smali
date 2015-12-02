.class public Lcom/facebook/orca/stickers/am;
.super Lcom/facebook/inject/c;
.source "StickersModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 145
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 30
    const-class v0, Lcom/facebook/d/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/am;->f(Ljava/lang/Class;)Lcom/facebook/inject/a/e;

    .line 32
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/am;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsStickersFeatureEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/stickers/a;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 36
    const-class v0, Lcom/facebook/orca/stickers/h;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/am;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/stickers/ar;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/stickers/ar;-><init>(Lcom/facebook/orca/stickers/am;Lcom/facebook/orca/stickers/an;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 40
    const-class v0, Lcom/facebook/orca/protocol/methods/m;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/am;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/stickers/ap;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/stickers/ap;-><init>(Lcom/facebook/orca/stickers/am;Lcom/facebook/orca/stickers/an;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 42
    const-class v0, Lcom/facebook/orca/protocol/methods/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/am;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/stickers/ao;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/stickers/ao;-><init>(Lcom/facebook/orca/stickers/am;Lcom/facebook/orca/stickers/an;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 45
    const-class v0, Lcom/facebook/orca/stickers/c;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/am;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/stickers/aq;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/stickers/aq;-><init>(Lcom/facebook/orca/stickers/am;Lcom/facebook/orca/stickers/an;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 48
    const-class v0, Lcom/facebook/orca/stickers/k;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/am;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/stickers/as;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/stickers/as;-><init>(Lcom/facebook/orca/stickers/am;Lcom/facebook/orca/stickers/an;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 51
    const-class v0, Lcom/facebook/orca/stickers/al;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/am;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/stickers/aw;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/stickers/aw;-><init>(Lcom/facebook/orca/stickers/am;Lcom/facebook/orca/stickers/an;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 54
    const-class v0, Lcom/facebook/orca/stickers/ak;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/am;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/stickers/av;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/stickers/av;-><init>(Lcom/facebook/orca/stickers/am;Lcom/facebook/orca/stickers/an;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 57
    const-class v0, Lcom/facebook/orca/stickers/e;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/am;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/stickers/au;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/stickers/au;-><init>(Lcom/facebook/orca/stickers/am;Lcom/facebook/orca/stickers/an;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 61
    const-class v0, Lcom/facebook/orca/stickers/w;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/am;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/stickers/at;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/stickers/at;-><init>(Lcom/facebook/orca/stickers/am;Lcom/facebook/orca/stickers/an;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 64
    const-class v0, Lcom/facebook/auth/f/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/stickers/am;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/stickers/ak;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 66
    return-void
.end method
