.class public abstract Lcom/facebook/common/e/a;
.super Ljava/lang/Object;
.source "AbstractFbErrorReporter.java"

# interfaces
.implements Lcom/facebook/common/e/h;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 12
    invoke-static {p1, p2}, Lcom/facebook/common/e/m;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/common/e/m;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/common/e/a;->a(Lcom/facebook/common/e/m;)V

    .line 13
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 17
    invoke-static {p1, p2}, Lcom/facebook/common/e/m;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/common/e/n;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/facebook/common/e/n;->a(Ljava/lang/Throwable;)Lcom/facebook/common/e/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/common/e/n;->g()Lcom/facebook/common/e/m;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/common/e/a;->a(Lcom/facebook/common/e/m;)V

    .line 18
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 22
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lcom/facebook/common/e/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 27
    invoke-static {p1, p2}, Lcom/facebook/common/e/m;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/common/e/n;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/common/e/n;->a(Z)Lcom/facebook/common/e/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/common/e/n;->g()Lcom/facebook/common/e/m;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/common/e/a;->a(Lcom/facebook/common/e/m;)V

    .line 28
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 32
    invoke-static {p1, p2}, Lcom/facebook/common/e/m;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/common/e/n;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/common/e/n;->a(Z)Lcom/facebook/common/e/n;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/facebook/common/e/n;->a(Ljava/lang/Throwable;)Lcom/facebook/common/e/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/common/e/n;->g()Lcom/facebook/common/e/m;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/common/e/a;->a(Lcom/facebook/common/e/m;)V

    .line 37
    return-void
.end method
