.class public Lcom/facebook/auth/d/b;
.super Lcom/facebook/inject/c;
.source "LoggedInUserAuthModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 52
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 247
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 57
    const-class v0, Lcom/facebook/user/User;

    const-class v1, Lcom/facebook/auth/annotations/LoggedInUser;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/auth/d/b;->b(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 59
    new-instance v0, Lcom/facebook/auth/userscope/b;

    invoke-direct {v0}, Lcom/facebook/auth/userscope/b;-><init>()V

    .line 60
    const-class v1, Lcom/facebook/auth/userscope/UserScoped;

    invoke-virtual {p0, v1, v0}, Lcom/facebook/auth/d/b;->a(Ljava/lang/Class;Lcom/facebook/inject/au;)V

    .line 61
    const-class v1, Lcom/facebook/auth/userscope/b;

    invoke-virtual {p0, v1}, Lcom/facebook/auth/d/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Object;)V

    .line 63
    const-class v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/LoggedInUserId;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/d/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/d/h;-><init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 66
    const-class v0, Lcom/facebook/user/UserKey;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/LoggedInUserKey;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/d/i;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/d/i;-><init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 69
    const-class v0, Lcom/facebook/common/w/q;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/IsMeUserAnEmployee;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/d/a;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 73
    const-class v0, Lcom/facebook/auth/viewercontext/d;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/d/l;

    invoke-direct {v1, v2}, Lcom/facebook/auth/d/l;-><init>(Lcom/facebook/auth/d/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 77
    const-class v0, Lcom/facebook/auth/viewercontext/e;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/viewercontext/i;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->c(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 80
    const-class v0, Lcom/facebook/auth/viewercontext/h;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/d/m;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/d/m;-><init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 84
    const-class v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/d/n;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/d/n;-><init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 86
    const-class v0, Lcom/facebook/auth/credentials/UserTokenCredentials;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/d/k;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/d/k;-><init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 89
    const-class v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/ViewerContextUserId;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/d/o;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/d/o;-><init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 92
    const-class v0, Lcom/facebook/user/UserKey;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/annotations/ViewerContextUserKey;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/d/p;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/d/p;-><init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 96
    const-class v0, Lcom/facebook/auth/protocol/h;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/d/g;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/d/g;-><init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 98
    const-class v0, Lcom/facebook/auth/login/a;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/d/d;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/d/d;-><init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 101
    const-class v0, Lcom/facebook/auth/login/al;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/login/y;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/g;

    .line 103
    const-class v0, Lcom/facebook/auth/login/w;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/d/f;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/d/f;-><init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 106
    const-class v0, Lcom/facebook/base/activity/f;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/b;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/viewercontext/h;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 109
    const-class v0, Lcom/facebook/auth/login/bk;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/d/j;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/d/j;-><init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 113
    const-class v0, Lcom/facebook/auth/c/b;

    invoke-virtual {p0, v0}, Lcom/facebook/auth/d/b;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/d/e;

    invoke-direct {v1, p0, v2}, Lcom/facebook/auth/d/e;-><init>(Lcom/facebook/auth/d/b;Lcom/facebook/auth/d/c;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 116
    return-void
.end method
