.class final Lcom/ijoysoft/appwall/l;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field final synthetic a:Lcom/ijoysoft/appwall/GiftActivity;


# direct methods
.method constructor <init>(Lcom/ijoysoft/appwall/GiftActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/ijoysoft/appwall/l;->a:Lcom/ijoysoft/appwall/GiftActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/ijoysoft/appwall/l;->a:Lcom/ijoysoft/appwall/GiftActivity;

    const-string v1, "settings"

    invoke-virtual {v0, v1, v3}, Lcom/ijoysoft/appwall/GiftActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-static {v0}, Lcom/ijoysoft/appwall/GiftActivity;->a(Landroid/content/SharedPreferences;)V

    invoke-static {}, Lcom/ijoysoft/appwall/GiftActivity;->a()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v0, p0, Lcom/ijoysoft/appwall/l;->a:Lcom/ijoysoft/appwall/GiftActivity;

    invoke-static {v0}, Lcom/ijoysoft/appwall/GiftActivity;->b(Lcom/ijoysoft/appwall/GiftActivity;)Lcom/ijoysoft/appwall/p;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/ijoysoft/appwall/p;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ijoysoft/appwall/o;

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/o;->b()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-string v2, "changle-list"

    iget-object v0, p0, Lcom/ijoysoft/appwall/l;->a:Lcom/ijoysoft/appwall/GiftActivity;

    invoke-static {v0}, Lcom/ijoysoft/appwall/GiftActivity;->b(Lcom/ijoysoft/appwall/GiftActivity;)Lcom/ijoysoft/appwall/p;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/ijoysoft/appwall/p;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ijoysoft/appwall/o;

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/o;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object v1, p0, Lcom/ijoysoft/appwall/l;->a:Lcom/ijoysoft/appwall/GiftActivity;

    iget-object v0, p0, Lcom/ijoysoft/appwall/l;->a:Lcom/ijoysoft/appwall/GiftActivity;

    invoke-static {v0}, Lcom/ijoysoft/appwall/GiftActivity;->b(Lcom/ijoysoft/appwall/GiftActivity;)Lcom/ijoysoft/appwall/p;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/ijoysoft/appwall/p;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ijoysoft/appwall/o;

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/o;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ijoysoft/appwall/GiftActivity;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ijoysoft/appwall/l;->a:Lcom/ijoysoft/appwall/GiftActivity;

    const-string v1, "APP already installed"

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/ijoysoft/appwall/l;->a:Lcom/ijoysoft/appwall/GiftActivity;

    invoke-static {v0}, Lcom/ijoysoft/appwall/GiftActivity;->b(Lcom/ijoysoft/appwall/GiftActivity;)Lcom/ijoysoft/appwall/p;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/ijoysoft/appwall/p;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ijoysoft/appwall/o;

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/o;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/ijoysoft/appwall/l;->a:Lcom/ijoysoft/appwall/GiftActivity;

    invoke-static {v0}, Lcom/ijoysoft/appwall/GiftActivity;->b(Lcom/ijoysoft/appwall/GiftActivity;)Lcom/ijoysoft/appwall/p;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/ijoysoft/appwall/p;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ijoysoft/appwall/o;

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/o;->f()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/ijoysoft/appwall/l;->a:Lcom/ijoysoft/appwall/GiftActivity;

    invoke-virtual {v2, v1, v0}, Lcom/ijoysoft/appwall/GiftActivity;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/ijoysoft/appwall/l;->a:Lcom/ijoysoft/appwall/GiftActivity;

    invoke-static {v0}, Lcom/ijoysoft/appwall/GiftActivity;->b(Lcom/ijoysoft/appwall/GiftActivity;)Lcom/ijoysoft/appwall/p;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/p;->notifyDataSetChanged()V

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "AppName"

    iget-object v0, p0, Lcom/ijoysoft/appwall/l;->a:Lcom/ijoysoft/appwall/GiftActivity;

    invoke-static {v0}, Lcom/ijoysoft/appwall/GiftActivity;->b(Lcom/ijoysoft/appwall/GiftActivity;)Lcom/ijoysoft/appwall/p;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/ijoysoft/appwall/p;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ijoysoft/appwall/o;

    invoke-virtual {v0}, Lcom/ijoysoft/appwall/o;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "ListArray"

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/ijoysoft/appwall/l;->a:Lcom/ijoysoft/appwall/GiftActivity;

    const-string v1, "which_app_clicked"

    invoke-static {v0, v1, v2}, Lcom/b/a/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V

    goto :goto_0
.end method
