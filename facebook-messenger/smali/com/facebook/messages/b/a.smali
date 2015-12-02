.class public Lcom/facebook/messages/b/a;
.super Lcom/facebook/inject/c;
.source "ContactPickerModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 33
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    .line 24
    const-class v0, Lcom/facebook/abtest/qe/g;

    invoke-virtual {p0, v0}, Lcom/facebook/messages/b/a;->e(Ljava/lang/Class;)V

    .line 25
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsLowPriorityInitOnBackgroundThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/messages/b/a;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/messages/a/a/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 28
    const-class v0, Lcom/facebook/messages/a/a/a;

    invoke-virtual {p0, v0}, Lcom/facebook/messages/b/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/messages/b/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/messages/b/c;-><init>(Lcom/facebook/messages/b/a;Lcom/facebook/messages/b/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 31
    return-void
.end method
