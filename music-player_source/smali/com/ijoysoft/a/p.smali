.class final Lcom/ijoysoft/a/p;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/ijoysoft/a/a;

.field private final synthetic b:Landroid/app/AlertDialog;

.field private final synthetic c:Landroid/app/Activity;

.field private final synthetic d:Z

.field private final synthetic e:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lcom/ijoysoft/a/a;Landroid/app/AlertDialog;Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 1

    iput-object p1, p0, Lcom/ijoysoft/a/p;->a:Lcom/ijoysoft/a/a;

    iput-object p2, p0, Lcom/ijoysoft/a/p;->b:Landroid/app/AlertDialog;

    iput-object p3, p0, Lcom/ijoysoft/a/p;->c:Landroid/app/Activity;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ijoysoft/a/p;->d:Z

    iput-object p4, p0, Lcom/ijoysoft/a/p;->e:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/ijoysoft/a/p;->b:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    iget-object v0, p0, Lcom/ijoysoft/a/p;->c:Landroid/app/Activity;

    const-string v1, "preference_advertisement"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "preference_key_adv_rate"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-boolean v0, p0, Lcom/ijoysoft/a/p;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ijoysoft/a/p;->e:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ijoysoft/a/p;->e:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/ijoysoft/a/p;->a:Lcom/ijoysoft/a/a;

    iget-object v1, p0, Lcom/ijoysoft/a/p;->c:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/ijoysoft/a/a;->b(Lcom/ijoysoft/a/a;Landroid/app/Activity;)V

    goto :goto_0
.end method
