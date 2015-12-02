.class public Lcom/facebook/common/e/d;
.super Lcom/facebook/inject/b;
.source "ErrorReportingModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 30
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    .line 24
    const-class v0, Lcom/facebook/common/e/h;

    invoke-virtual {p0, v0}, Lcom/facebook/common/e/d;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/common/e/f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/common/e/f;-><init>(Lcom/facebook/common/e/d;Lcom/facebook/common/e/e;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 27
    return-void
.end method
