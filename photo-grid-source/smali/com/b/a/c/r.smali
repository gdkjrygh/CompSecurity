.class final Lcom/b/a/c/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/b/a/c/o;


# direct methods
.method constructor <init>(Lcom/b/a/c/o;)V
    .locals 0

    .prologue
    .line 997
    iput-object p1, p0, Lcom/b/a/c/r;->a:Lcom/b/a/c/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 1000
    iget-object v0, p0, Lcom/b/a/c/r;->a:Lcom/b/a/c/o;

    iget-object v0, v0, Lcom/b/a/c/o;->e:Lcom/b/a/c/h;

    .line 1903
    new-instance v1, La/a/a/a/a/f/d;

    invoke-direct {v1, v0}, La/a/a/a/a/f/d;-><init>(La/a/a/a/p;)V

    .line 1904
    invoke-interface {v1}, La/a/a/a/a/f/c;->b()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "always_send_reports_opt_in"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v1, v0}, La/a/a/a/a/f/c;->a(Landroid/content/SharedPreferences$Editor;)Z

    .line 1001
    iget-object v0, p0, Lcom/b/a/c/r;->a:Lcom/b/a/c/o;

    iget-object v0, v0, Lcom/b/a/c/o;->b:Lcom/b/a/c/t;

    invoke-virtual {v0, v3}, Lcom/b/a/c/t;->a(Z)V

    .line 1002
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 1003
    return-void
.end method
