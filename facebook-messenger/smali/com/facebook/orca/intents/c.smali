.class Lcom/facebook/orca/intents/c;
.super Ljava/lang/Object;
.source "IntentHandler.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Z

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/google/common/d/a/ab;

.field final synthetic f:Lcom/facebook/orca/intents/b;


# direct methods
.method constructor <init>(Lcom/facebook/orca/intents/b;Landroid/content/Intent;Ljava/lang/String;ZLjava/lang/String;Lcom/google/common/d/a/ab;)V
    .locals 0

    .prologue
    .line 141
    iput-object p1, p0, Lcom/facebook/orca/intents/c;->f:Lcom/facebook/orca/intents/b;

    iput-object p2, p0, Lcom/facebook/orca/intents/c;->a:Landroid/content/Intent;

    iput-object p3, p0, Lcom/facebook/orca/intents/c;->b:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/facebook/orca/intents/c;->c:Z

    iput-object p5, p0, Lcom/facebook/orca/intents/c;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/facebook/orca/intents/c;->e:Lcom/google/common/d/a/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Boolean;)V
    .locals 6

    .prologue
    .line 144
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    .line 147
    iget-object v0, p0, Lcom/facebook/orca/intents/c;->f:Lcom/facebook/orca/intents/b;

    iget-object v1, p0, Lcom/facebook/orca/intents/c;->a:Landroid/content/Intent;

    iget-object v2, p0, Lcom/facebook/orca/intents/c;->f:Lcom/facebook/orca/intents/b;

    iget-object v3, p0, Lcom/facebook/orca/intents/c;->b:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/facebook/orca/intents/c;->c:Z

    iget-object v5, p0, Lcom/facebook/orca/intents/c;->d:Ljava/lang/String;

    invoke-static {v2, v3, v4, v5}, Lcom/facebook/orca/intents/b;->a(Lcom/facebook/orca/intents/b;Ljava/lang/String;ZLjava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/intents/b;->a(Lcom/facebook/orca/intents/b;Landroid/content/Intent;Landroid/content/Intent;)Lcom/google/common/d/a/s;

    .line 151
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/intents/c;->e:Lcom/google/common/d/a/ab;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 152
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 141
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/intents/c;->a(Ljava/lang/Boolean;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 6

    .prologue
    .line 156
    iget-object v0, p0, Lcom/facebook/orca/intents/c;->f:Lcom/facebook/orca/intents/b;

    iget-object v1, p0, Lcom/facebook/orca/intents/c;->a:Landroid/content/Intent;

    iget-object v2, p0, Lcom/facebook/orca/intents/c;->f:Lcom/facebook/orca/intents/b;

    iget-object v3, p0, Lcom/facebook/orca/intents/c;->b:Ljava/lang/String;

    iget-boolean v4, p0, Lcom/facebook/orca/intents/c;->c:Z

    iget-object v5, p0, Lcom/facebook/orca/intents/c;->d:Ljava/lang/String;

    invoke-static {v2, v3, v4, v5}, Lcom/facebook/orca/intents/b;->a(Lcom/facebook/orca/intents/b;Ljava/lang/String;ZLjava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/intents/b;->a(Lcom/facebook/orca/intents/b;Landroid/content/Intent;Landroid/content/Intent;)Lcom/google/common/d/a/s;

    .line 159
    iget-object v0, p0, Lcom/facebook/orca/intents/c;->e:Lcom/google/common/d/a/ab;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 160
    return-void
.end method
