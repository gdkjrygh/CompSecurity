.class final Lcom/a/a/c/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/a/a/c/n;


# direct methods
.method constructor <init>(Lcom/a/a/c/n;)V
    .locals 0

    .prologue
    .line 992
    iput-object p1, p0, Lcom/a/a/c/q;->a:Lcom/a/a/c/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 995
    iget-object v0, p0, Lcom/a/a/c/q;->a:Lcom/a/a/c/n;

    iget-object v0, v0, Lcom/a/a/c/n;->e:Lcom/a/a/c/g;

    new-instance v1, Lb/a/a/a/a/f/c;

    invoke-direct {v1, v0}, Lb/a/a/a/a/f/c;-><init>(Lb/a/a/a/l;)V

    invoke-interface {v1}, Lb/a/a/a/a/f/b;->b()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "always_send_reports_opt_in"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v1, v0}, Lb/a/a/a/a/f/b;->a(Landroid/content/SharedPreferences$Editor;)Z

    .line 996
    iget-object v0, p0, Lcom/a/a/c/q;->a:Lcom/a/a/c/n;

    iget-object v0, v0, Lcom/a/a/c/n;->b:Lcom/a/a/c/g$a;

    invoke-virtual {v0, v3}, Lcom/a/a/c/g$a;->a(Z)V

    .line 997
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 998
    return-void
.end method
