.class public Lcom/facebook/selfupdate/u;
.super Lcom/facebook/inject/c;
.source "SelfUpdateModule.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x9
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 159
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 35
    const-class v0, Lcom/facebook/selfupdate/ae;

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/u;->d(Ljava/lang/Class;)V

    .line 37
    const-class v0, Lcom/facebook/selfupdate/q;

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/u;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/selfupdate/ac;

    invoke-direct {v1, p0, v2}, Lcom/facebook/selfupdate/ac;-><init>(Lcom/facebook/selfupdate/u;Lcom/facebook/selfupdate/v;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 40
    const-class v0, Lcom/facebook/selfupdate/af;

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/u;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/selfupdate/ad;

    invoke-direct {v1, p0, v2}, Lcom/facebook/selfupdate/ad;-><init>(Lcom/facebook/selfupdate/u;Lcom/facebook/selfupdate/v;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 43
    const-class v0, Lcom/facebook/selfupdate/a;

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/u;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/selfupdate/w;

    invoke-direct {v1, p0, v2}, Lcom/facebook/selfupdate/w;-><init>(Lcom/facebook/selfupdate/u;Lcom/facebook/selfupdate/v;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 45
    const-class v0, Lcom/facebook/selfupdate/g;

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/u;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/selfupdate/y;

    invoke-direct {v1, p0, v2}, Lcom/facebook/selfupdate/y;-><init>(Lcom/facebook/selfupdate/u;Lcom/facebook/selfupdate/v;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 47
    const-class v0, Lcom/facebook/selfupdate/i;

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/u;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/selfupdate/aa;

    invoke-direct {v1, p0, v2}, Lcom/facebook/selfupdate/aa;-><init>(Lcom/facebook/selfupdate/u;Lcom/facebook/selfupdate/v;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 49
    const-class v0, Lcom/facebook/selfupdate/o;

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/u;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/selfupdate/ab;

    invoke-direct {v1, p0, v2}, Lcom/facebook/selfupdate/ab;-><init>(Lcom/facebook/selfupdate/u;Lcom/facebook/selfupdate/v;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 51
    const-class v0, Lcom/facebook/selfupdate/f;

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/u;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/selfupdate/x;

    invoke-direct {v1, p0, v2}, Lcom/facebook/selfupdate/x;-><init>(Lcom/facebook/selfupdate/u;Lcom/facebook/selfupdate/v;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 54
    const-class v0, Lcom/facebook/f/f;

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/u;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/selfupdate/k;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 56
    const-class v0, Lcom/facebook/selfupdate/h;

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/u;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/selfupdate/z;

    invoke-direct {v1, p0, v2}, Lcom/facebook/selfupdate/z;-><init>(Lcom/facebook/selfupdate/u;Lcom/facebook/selfupdate/v;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 59
    const-class v0, Lcom/facebook/base/activity/f;

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/u;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/selfupdate/h;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 61
    return-void
.end method
