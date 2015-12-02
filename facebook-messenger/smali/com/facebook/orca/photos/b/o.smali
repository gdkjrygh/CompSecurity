.class public Lcom/facebook/orca/photos/b/o;
.super Lcom/facebook/inject/c;
.source "PhotoUploadModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 128
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 35
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/b/o;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/IsNewPhotoUploadEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/photos/b/g;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 38
    const-class v0, Lcom/facebook/j/a/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/b/o;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/annotations/MessengerImageResizer;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/photos/b/f;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 42
    const-class v0, Lcom/facebook/orca/photos/b/k;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/b/o;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/photos/b/v;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/photos/b/v;-><init>(Lcom/facebook/orca/photos/b/o;Lcom/facebook/orca/photos/b/p;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/g;->d(Ljava/lang/Class;)V

    .line 45
    const-class v0, Lcom/facebook/orca/photos/b/h;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/b/o;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/photos/b/q;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/photos/b/q;-><init>(Lcom/facebook/orca/photos/b/o;Lcom/facebook/orca/photos/b/p;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 48
    const-class v0, Lcom/facebook/orca/photos/b/ab;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/b/o;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/photos/b/u;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/photos/b/u;-><init>(Lcom/facebook/orca/photos/b/o;Lcom/facebook/orca/photos/b/p;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 51
    const-class v0, Lcom/facebook/orca/photos/b/aa;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/b/o;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/photos/b/s;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/photos/b/s;-><init>(Lcom/facebook/orca/photos/b/o;Lcom/facebook/orca/photos/b/p;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 55
    const-class v0, Lcom/facebook/orca/photos/b/x;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/b/o;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/photos/b/t;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/photos/b/t;-><init>(Lcom/facebook/orca/photos/b/o;Lcom/facebook/orca/photos/b/p;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 59
    const-class v0, Lcom/facebook/abtest/qe/f/b;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/b/o;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/photos/b/d;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 61
    const-class v0, Lcom/facebook/orca/photos/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/photos/b/o;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/photos/b/r;

    invoke-direct {v1, p0, v2}, Lcom/facebook/orca/photos/b/r;-><init>(Lcom/facebook/orca/photos/b/o;Lcom/facebook/orca/photos/b/p;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 64
    return-void
.end method
