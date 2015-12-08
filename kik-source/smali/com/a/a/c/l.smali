.class final Lcom/a/a/c/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/a/g/q$b;


# instance fields
.field final synthetic a:Lcom/a/a/c/g;


# direct methods
.method constructor <init>(Lcom/a/a/c/g;)V
    .locals 0

    .prologue
    .line 879
    iput-object p1, p0, Lcom/a/a/c/l;->a:Lcom/a/a/c/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lb/a/a/a/a/g/t;)Ljava/lang/Object;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 879
    iget-object v1, p1, Lb/a/a/a/a/g/t;->d:Lb/a/a/a/a/g/m;

    iget-boolean v1, v1, Lb/a/a/a/a/g/m;->a:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/a/a/c/l;->a:Lcom/a/a/c/g;

    new-instance v2, Lb/a/a/a/a/f/c;

    invoke-direct {v2, v1}, Lb/a/a/a/a/f/c;-><init>(Lb/a/a/a/l;)V

    invoke-interface {v2}, Lb/a/a/a/a/f/b;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "always_send_reports_opt_in"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method
