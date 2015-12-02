.class public Lcom/facebook/orca/app/fa;
.super Lcom/facebook/base/a/a;
.source "MessengerApplicationImpl.java"

# interfaces
.implements Lcom/facebook/inject/aa;


# instance fields
.field private final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private c:Lcom/facebook/inject/ag;


# direct methods
.method public constructor <init>(Landroid/app/Application;Lcom/facebook/config/a/a;)V
    .locals 1

    .prologue
    .line 53
    invoke-direct {p0, p1, p2}, Lcom/facebook/base/a/a;-><init>(Landroid/app/Application;Lcom/facebook/config/a/a;)V

    .line 46
    const-class v0, Lcom/facebook/orca/app/fa;

    iput-object v0, p0, Lcom/facebook/orca/app/fa;->b:Ljava/lang/Class;

    .line 54
    return-void
.end method

.method private g()V
    .locals 3

    .prologue
    .line 137
    invoke-virtual {p0}, Lcom/facebook/orca/app/fa;->f()Lcom/facebook/inject/t;

    move-result-object v1

    .line 138
    const-class v0, Lcom/facebook/base/j;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/j;

    .line 139
    if-eqz v0, :cond_0

    sget-object v2, Lcom/facebook/base/j;->DEBUG:Lcom/facebook/base/j;

    if-ne v0, v2, :cond_0

    .line 140
    new-instance v2, Lcom/facebook/o/a;

    const-class v0, Lcom/facebook/common/e/h;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/e/h;

    invoke-direct {v2, v0}, Lcom/facebook/o/a;-><init>(Lcom/facebook/common/e/h;)V

    .line 143
    invoke-virtual {v2}, Lcom/facebook/o/a;->a()Z

    .line 145
    :cond_0
    return-void
.end method


# virtual methods
.method protected b(Lcom/facebook/common/process/c;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/process/c;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/inject/ag;",
            ">;"
        }
    .end annotation

    .prologue
    .line 99
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    .line 100
    new-instance v1, Lcom/facebook/orca/app/dv;

    invoke-virtual {p0}, Lcom/facebook/orca/app/fa;->a()Landroid/app/Application;

    move-result-object v2

    invoke-virtual {p0}, Lcom/facebook/orca/app/fa;->b()Lcom/facebook/config/a/a;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/facebook/orca/app/dv;-><init>(Landroid/app/Application;Lcom/facebook/config/a/a;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    iget-object v1, p0, Lcom/facebook/orca/app/fa;->c:Lcom/facebook/inject/ag;

    if-eqz v1, :cond_0

    .line 102
    iget-object v1, p0, Lcom/facebook/orca/app/fa;->c:Lcom/facebook/inject/ag;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    :cond_0
    return-object v0
.end method

.method public c()V
    .locals 5

    .prologue
    .line 62
    invoke-super {p0}, Lcom/facebook/base/a/a;->c()V

    .line 64
    const-string v0, "MessengerApplicationImpl.onCreate"

    invoke-static {v0}, Lcom/facebook/debug/d/e;->a(Ljava/lang/String;)Lcom/facebook/debug/d/e;

    move-result-object v1

    .line 66
    invoke-virtual {p0}, Lcom/facebook/orca/app/fa;->f()Lcom/facebook/inject/t;

    move-result-object v0

    .line 71
    const-class v2, Lcom/facebook/config/a/a;

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/a;

    .line 72
    iget-object v2, p0, Lcom/facebook/orca/app/fa;->b:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "FbAppType: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lcom/facebook/config/a/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 74
    invoke-direct {p0}, Lcom/facebook/orca/app/fa;->g()V

    .line 76
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    new-instance v2, Lcom/facebook/orca/app/fb;

    invoke-direct {v2, p0}, Lcom/facebook/orca/app/fb;-><init>(Lcom/facebook/orca/app/fa;)V

    invoke-virtual {v0, v2}, Landroid/os/Looper;->setMessageLogging(Landroid/util/Printer;)V

    .line 85
    invoke-static {}, Lcom/facebook/base/b;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    invoke-virtual {p0}, Lcom/facebook/orca/app/fa;->a()Landroid/app/Application;

    move-result-object v0

    sget v2, Lcom/facebook/o;->app_name:I

    invoke-virtual {v0, v2}, Landroid/app/Application;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 88
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 92
    :cond_0
    invoke-static {}, Lcom/facebook/fdlimit/a;->a()Z

    .line 94
    invoke-virtual {v1}, Lcom/facebook/debug/d/e;->a()J

    .line 95
    return-void

    .line 88
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected c(Lcom/facebook/common/process/c;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 110
    invoke-virtual {p0}, Lcom/facebook/orca/app/fa;->f()Lcom/facebook/inject/t;

    move-result-object v1

    .line 111
    const-class v0, Lcom/facebook/backgroundtasks/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/backgroundtasks/d;

    .line 113
    const-class v2, Lcom/facebook/d/b/a;

    invoke-virtual {v1, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/d/b/a;

    .line 115
    const-class v2, Lcom/facebook/contacts/data/b;

    invoke-virtual {v1, v2}, Lcom/facebook/d/b/a;->a(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 116
    const-class v2, Lcom/facebook/contacts/database/ContactsTaskTag;

    invoke-virtual {v0, v2, v3}, Lcom/facebook/backgroundtasks/d;->a(Ljava/lang/Class;Z)V

    .line 118
    :cond_0
    const-class v2, Lcom/facebook/orca/g/aa;

    invoke-virtual {v1, v2}, Lcom/facebook/d/b/a;->a(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 119
    const-class v1, Lcom/facebook/orca/background/MessagesTaskTag;

    invoke-virtual {v0, v1, v3}, Lcom/facebook/backgroundtasks/d;->a(Ljava/lang/Class;Z)V

    .line 121
    :cond_1
    return-void
.end method

.method public e()V
    .locals 2

    .prologue
    .line 125
    invoke-super {p0}, Lcom/facebook/base/a/a;->e()V

    .line 126
    invoke-virtual {p0}, Lcom/facebook/orca/app/fa;->f()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/images/cache/a;

    invoke-virtual {v0}, Lcom/facebook/ui/images/cache/a;->b()V

    .line 127
    invoke-virtual {p0}, Lcom/facebook/orca/app/fa;->f()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/auth/b/b;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/b/b;

    invoke-interface {v0}, Lcom/facebook/auth/b/b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 128
    invoke-virtual {p0}, Lcom/facebook/orca/app/fa;->f()Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/contacts/divebar/e;

    invoke-virtual {v0}, Lcom/facebook/orca/contacts/divebar/e;->a()V

    .line 130
    :cond_0
    return-void
.end method
