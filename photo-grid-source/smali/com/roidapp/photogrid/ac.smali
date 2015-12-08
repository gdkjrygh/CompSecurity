.class final Lcom/roidapp/photogrid/ac;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/bh;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/MainPage;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/MainPage;)V
    .locals 0

    .prologue
    .line 2011
    iput-object p1, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 2015
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->E(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/photogrid/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ba;->a()V

    .line 2016
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->F(Lcom/roidapp/photogrid/MainPage;)V

    .line 2017
    return-void
.end method

.method public final a(I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 2061
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->G(Lcom/roidapp/photogrid/MainPage;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->G(Lcom/roidapp/photogrid/MainPage;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 2062
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->G(Lcom/roidapp/photogrid/MainPage;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2063
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "show_new_premium"

    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2065
    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 2066
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->p()Z

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/bq;->a(ZLandroid/app/Activity;)Lcom/roidapp/photogrid/common/bq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/bq;->c()V

    .line 2070
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->E(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/photogrid/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ba;->a()V

    .line 2071
    return-void

    .line 2068
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    .line 2235
    new-instance v1, Lcom/roidapp/photogrid/release/qi;

    invoke-direct {v1}, Lcom/roidapp/photogrid/release/qi;-><init>()V

    .line 2236
    const v2, 0x7f0b0027

    invoke-virtual {v1, v3, v2}, Lcom/roidapp/photogrid/release/qi;->setStyle(II)V

    .line 2237
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ParentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v2, "PremiumDialog"

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/n;->a(Landroid/support/v4/app/FragmentManager;Landroid/support/v4/app/DialogFragment;Ljava/lang/String;)Z

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 2021
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->p()Z

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/bq;->a(ZLandroid/app/Activity;)Lcom/roidapp/photogrid/common/bq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/bq;->a()V

    .line 2022
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->E(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/photogrid/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ba;->a()V

    .line 2023
    return-void
.end method

.method public final c()V
    .locals 3

    .prologue
    .line 2027
    const-string v0, "https://www.facebook.com/photogridorg"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 2028
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2029
    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 2030
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 2031
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/MainPage;->startActivity(Landroid/content/Intent;)V

    .line 2032
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->E(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/photogrid/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ba;->a()V

    .line 2033
    return-void
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 2037
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->p()Z

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/bq;->a(ZLandroid/app/Activity;)Lcom/roidapp/photogrid/common/bq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/bq;->c()V

    .line 2038
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->E(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/photogrid/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ba;->a()V

    .line 2039
    return-void
.end method

.method public final e()V
    .locals 2

    .prologue
    .line 2043
    new-instance v0, Lcom/roidapp/photogrid/common/o;

    iget-object v1, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, v1}, Lcom/roidapp/photogrid/common/o;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/o;->a()V

    .line 2044
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->E(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/photogrid/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ba;->a()V

    .line 2045
    return-void
.end method

.method public final f()V
    .locals 2

    .prologue
    .line 2049
    new-instance v0, Lcom/roidapp/photogrid/common/o;

    iget-object v1, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, v1}, Lcom/roidapp/photogrid/common/o;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/o;->b()V

    .line 2050
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->E(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/photogrid/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ba;->a()V

    .line 2051
    return-void
.end method

.method public final g()V
    .locals 2

    .prologue
    .line 2055
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    const-string v1, "help"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/HelpActivity;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 2056
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->E(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/photogrid/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ba;->a()V

    .line 2057
    return-void
.end method

.method public final h()V
    .locals 1

    .prologue
    .line 2075
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->H(Lcom/roidapp/photogrid/MainPage;)V

    .line 2076
    return-void
.end method

.method public final i()V
    .locals 3

    .prologue
    .line 2080
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/q;->a(Landroid/app/Activity;)V

    .line 2081
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->G(Lcom/roidapp/photogrid/MainPage;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->G(Lcom/roidapp/photogrid/MainPage;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 2082
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->G(Lcom/roidapp/photogrid/MainPage;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2083
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "show_new_premium"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2085
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/ac;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->E(Lcom/roidapp/photogrid/MainPage;)Lcom/roidapp/photogrid/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/ba;->a()V

    .line 2086
    return-void
.end method
