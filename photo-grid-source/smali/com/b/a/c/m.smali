.class final Lcom/b/a/c/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/a/a/a/a/g/s;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La/a/a/a/a/g/s",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/b/a/c/h;


# direct methods
.method constructor <init>(Lcom/b/a/c/h;)V
    .locals 0

    .prologue
    .line 884
    iput-object p1, p0, Lcom/b/a/c/m;->a:Lcom/b/a/c/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(La/a/a/a/a/g/v;)Ljava/lang/Object;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 884
    .line 1887
    iget-object v1, p1, La/a/a/a/a/g/v;->d:La/a/a/a/a/g/m;

    iget-boolean v1, v1, La/a/a/a/a/g/m;->a:Z

    if-eqz v1, :cond_1

    .line 1888
    iget-object v1, p0, Lcom/b/a/c/m;->a:Lcom/b/a/c/h;

    .line 1897
    new-instance v2, La/a/a/a/a/f/d;

    invoke-direct {v2, v1}, La/a/a/a/a/f/d;-><init>(La/a/a/a/p;)V

    .line 1898
    invoke-interface {v2}, La/a/a/a/a/f/c;->a()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "always_send_reports_opt_in"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 1888
    if-nez v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0

    .line 1890
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0
.end method
