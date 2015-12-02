.class public Lcom/facebook/ui/media/b/c;
.super Lcom/facebook/inject/b;
.source "MediaModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 39
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 21
    const-class v0, Lcom/facebook/ui/media/attachments/d;

    invoke-virtual {p0, v0}, Lcom/facebook/ui/media/b/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/ui/media/b/e;

    invoke-direct {v1, p0, v2}, Lcom/facebook/ui/media/b/e;-><init>(Lcom/facebook/ui/media/b/c;Lcom/facebook/ui/media/b/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 24
    const-class v0, Lcom/facebook/ui/media/b/a;

    invoke-virtual {p0, v0}, Lcom/facebook/ui/media/b/c;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/ui/media/b/f;

    invoke-direct {v1, p0, v2}, Lcom/facebook/ui/media/b/f;-><init>(Lcom/facebook/ui/media/b/c;Lcom/facebook/ui/media/b/d;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 27
    return-void
.end method
