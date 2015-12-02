.class public Lcom/facebook/base/fragment/AbstractNavigableFragment;
.super Lcom/facebook/base/fragment/FbFragment;
.source "AbstractNavigableFragment.java"

# interfaces
.implements Lcom/facebook/base/fragment/b;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field protected b:Lcom/facebook/base/fragment/c;

.field private c:Landroid/content/Intent;

.field private d:Ljava/lang/String;

.field private e:Lcom/facebook/common/e/h;

.field private f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 22
    const-class v0, Lcom/facebook/base/fragment/AbstractNavigableFragment;

    sput-object v0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/facebook/base/fragment/FbFragment;-><init>()V

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->f:Z

    return-void
.end method

.method static synthetic a(Lcom/facebook/base/fragment/AbstractNavigableFragment;)Landroid/content/Intent;
    .locals 1

    .prologue
    .line 20
    iget-object v0, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->c:Landroid/content/Intent;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/base/fragment/AbstractNavigableFragment;Landroid/content/Intent;)Landroid/content/Intent;
    .locals 0

    .prologue
    .line 20
    iput-object p1, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->c:Landroid/content/Intent;

    return-object p1
.end method


# virtual methods
.method public R()Z
    .locals 1

    .prologue
    .line 66
    iget-boolean v0, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->f:Z

    return v0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 54
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->a(Landroid/os/Bundle;)V

    .line 55
    new-instance v0, Ljava/lang/Throwable;

    invoke-direct {v0}, Ljava/lang/Throwable;-><init>()V

    invoke-static {v0}, Lcom/facebook/common/w/c;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->d:Ljava/lang/String;

    .line 56
    invoke-virtual {p0}, Lcom/facebook/base/fragment/AbstractNavigableFragment;->S()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/common/e/h;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    iput-object v0, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->e:Lcom/facebook/common/e/h;

    .line 57
    return-void
.end method

.method public a(Lcom/facebook/base/fragment/c;)V
    .locals 3

    .prologue
    .line 109
    iput-object p1, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->b:Lcom/facebook/base/fragment/c;

    .line 111
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->c:Landroid/content/Intent;

    if-eqz v0, :cond_0

    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": Saved intent found: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->c:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 113
    sget-object v1, Lcom/facebook/base/fragment/AbstractNavigableFragment;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/Throwable;

    invoke-direct {v2}, Ljava/lang/Throwable;-><init>()V

    invoke-static {v1, v0, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 114
    iget-object v1, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->e:Lcom/facebook/common/e/h;

    const-string v2, "FRAGMENT_NAVIGATION"

    invoke-interface {v1, v2, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/facebook/base/fragment/a;

    invoke-direct {v1, p0, p1}, Lcom/facebook/base/fragment/a;-><init>(Lcom/facebook/base/fragment/AbstractNavigableFragment;Lcom/facebook/base/fragment/c;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 124
    :cond_0
    return-void
.end method

.method protected a(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/facebook/base/fragment/AbstractNavigableFragment;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 104
    new-instance v0, Lcom/facebook/base/fragment/e;

    invoke-direct {v0, p1}, Lcom/facebook/base/fragment/e;-><init>(Ljava/lang/Class;)V

    invoke-virtual {v0}, Lcom/facebook/base/fragment/e;->c()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/base/fragment/AbstractNavigableFragment;->d(Landroid/content/Intent;)V

    .line 105
    return-void
.end method

.method protected b()Z
    .locals 2

    .prologue
    .line 137
    invoke-virtual {p0}, Lcom/facebook/base/fragment/AbstractNavigableFragment;->p()Landroid/support/v4/app/q;

    move-result-object v0

    .line 138
    invoke-virtual {v0}, Landroid/support/v4/app/q;->f()I

    move-result v1

    if-nez v1, :cond_0

    .line 139
    const/4 v0, 0x0

    .line 142
    :goto_0
    return v0

    .line 141
    :cond_0
    invoke-virtual {v0}, Landroid/support/v4/app/q;->d()V

    .line 142
    const/4 v0, 0x1

    goto :goto_0
.end method

.method protected d(Landroid/content/Intent;)V
    .locals 3

    .prologue
    .line 75
    invoke-virtual {p0}, Lcom/facebook/base/fragment/AbstractNavigableFragment;->R()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": Fragment already finished"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 77
    iget-object v1, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->c:Landroid/content/Intent;

    if-eqz v1, :cond_0

    .line 78
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " with saved intent: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->c:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 80
    :cond_0
    sget-object v1, Lcom/facebook/base/fragment/AbstractNavigableFragment;->a:Ljava/lang/Class;

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 81
    iget-object v1, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->e:Lcom/facebook/common/e/h;

    const-string v2, "FRAGMENT_NAVIGATION"

    invoke-interface {v1, v2, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    :goto_0
    return-void

    .line 85
    :cond_1
    iget-object v0, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->b:Lcom/facebook/base/fragment/c;

    if-nez v0, :cond_2

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": No navigation listener set; saving intent."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "  Created at:\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 88
    sget-object v1, Lcom/facebook/base/fragment/AbstractNavigableFragment;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/Throwable;

    invoke-direct {v2}, Ljava/lang/Throwable;-><init>()V

    invoke-static {v1, v0, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 89
    iget-object v1, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->e:Lcom/facebook/common/e/h;

    const-string v2, "FRAGMENT_NAVIGATION"

    invoke-interface {v1, v2, v0}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    iput-object p1, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->c:Landroid/content/Intent;

    .line 95
    :goto_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->f:Z

    goto :goto_0

    .line 92
    :cond_2
    iget-object v0, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->b:Lcom/facebook/base/fragment/c;

    invoke-interface {v0, p0, p1}, Lcom/facebook/base/fragment/c;->a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    goto :goto_1
.end method

.method public h()V
    .locals 1

    .prologue
    .line 61
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->h()V

    .line 62
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/base/fragment/AbstractNavigableFragment;->f:Z

    .line 63
    return-void
.end method
