.class final Lcom/roidapp/cloudlib/push/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Z

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;ZLandroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 111
    iput-object p1, p0, Lcom/roidapp/cloudlib/push/b;->a:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/roidapp/cloudlib/push/b;->b:Z

    iput-object p3, p0, Lcom/roidapp/cloudlib/push/b;->c:Landroid/content/Context;

    iput-object p4, p0, Lcom/roidapp/cloudlib/push/b;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 114
    iget-object v1, p0, Lcom/roidapp/cloudlib/push/b;->a:Ljava/lang/String;

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/push/b;->b:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    iget-object v2, p0, Lcom/roidapp/cloudlib/push/b;->c:Landroid/content/Context;

    invoke-static {v2}, Lcom/roidapp/cloudlib/push/e;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/cloudlib/push/b;->d:Ljava/lang/String;

    invoke-static {v1, v0, v2, v3}, Lcom/roidapp/cloudlib/push/e;->a(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/push/b;->b:Z

    if-eqz v0, :cond_2

    .line 116
    iget-object v0, p0, Lcom/roidapp/cloudlib/push/b;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/cloudlib/push/a;->c(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "snsToken"

    iget-object v2, p0, Lcom/roidapp/cloudlib/push/b;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 121
    :cond_0
    :goto_1
    return-void

    .line 114
    :cond_1
    const/4 v0, 0x2

    goto :goto_0

    .line 118
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/push/b;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/roidapp/cloudlib/push/a;->c(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "snsToken"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_1
.end method
