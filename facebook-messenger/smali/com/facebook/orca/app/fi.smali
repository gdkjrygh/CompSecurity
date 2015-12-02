.class Lcom/facebook/orca/app/fi;
.super Ljava/lang/Object;
.source "OrcaDataManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/prefs/shared/ae;

.field final synthetic b:Lcom/facebook/orca/app/fg;


# direct methods
.method constructor <init>(Lcom/facebook/orca/app/fg;Lcom/facebook/prefs/shared/ae;)V
    .locals 0

    .prologue
    .line 149
    iput-object p1, p0, Lcom/facebook/orca/app/fi;->b:Lcom/facebook/orca/app/fg;

    iput-object p2, p0, Lcom/facebook/orca/app/fi;->a:Lcom/facebook/prefs/shared/ae;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/orca/app/fi;->b:Lcom/facebook/orca/app/fg;

    invoke-static {v0}, Lcom/facebook/orca/app/fg;->b(Lcom/facebook/orca/app/fg;)Lcom/facebook/prefs/shared/j;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/app/fi;->a:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/facebook/prefs/shared/j;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v0

    .line 153
    if-nez v0, :cond_1

    .line 154
    iget-object v0, p0, Lcom/facebook/orca/app/fi;->b:Lcom/facebook/orca/app/fg;

    invoke-static {v0}, Lcom/facebook/orca/app/fg;->c(Lcom/facebook/orca/app/fg;)Lcom/facebook/auth/b/b;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/auth/b/b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/facebook/orca/app/fi;->b:Lcom/facebook/orca/app/fg;

    invoke-static {v0}, Lcom/facebook/orca/app/fg;->d(Lcom/facebook/orca/app/fg;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/app/dt;

    .line 157
    invoke-virtual {v0}, Lcom/facebook/orca/app/dt;->b()V

    .line 158
    invoke-virtual {v0}, Lcom/facebook/orca/app/dt;->c()V

    .line 166
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/app/fi;->b:Lcom/facebook/orca/app/fg;

    invoke-static {v0}, Lcom/facebook/orca/app/fg;->e(Lcom/facebook/orca/app/fg;)Lcom/facebook/orca/app/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/app/g;->a()V

    .line 167
    return-void

    .line 160
    :cond_1
    sget-object v0, Lcom/facebook/orca/prefs/n;->g:Lcom/facebook/prefs/shared/ae;

    iget-object v1, p0, Lcom/facebook/orca/app/fi;->a:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, v1}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 162
    iget-object v0, p0, Lcom/facebook/orca/app/fi;->b:Lcom/facebook/orca/app/fg;

    invoke-static {v0}, Lcom/facebook/orca/app/fg;->b(Lcom/facebook/orca/app/fg;)Lcom/facebook/prefs/shared/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/prefs/shared/j;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    .line 163
    sget-object v1, Lcom/facebook/orca/prefs/o;->j:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    .line 164
    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    goto :goto_0
.end method
