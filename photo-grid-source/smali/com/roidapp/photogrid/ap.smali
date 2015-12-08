.class final Lcom/roidapp/photogrid/ap;
.super Lcom/roidapp/cloudlib/sns/aa;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/cloudlib/sns/aa",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/MainPage;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/MainPage;)V
    .locals 0

    .prologue
    .line 1157
    iput-object p1, p0, Lcom/roidapp/photogrid/ap;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/aa;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILjava/lang/Exception;)V
    .locals 3

    .prologue
    .line 1183
    invoke-super {p0, p1, p2}, Lcom/roidapp/cloudlib/sns/aa;->b(ILjava/lang/Exception;)V

    .line 1184
    iget-object v0, p0, Lcom/roidapp/photogrid/ap;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1185
    iget-object v0, p0, Lcom/roidapp/photogrid/ap;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->j()V

    .line 1187
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "QPicFailed"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1189
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    const-string v1, "Invitation code get failed."

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 1192
    iget-object v0, p0, Lcom/roidapp/photogrid/ap;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->w(Lcom/roidapp/photogrid/MainPage;)V

    .line 1194
    :cond_0
    return-void
.end method

.method public final synthetic c(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 1157
    check-cast p1, Ljava/lang/String;

    .line 2161
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2162
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/ap;->b(ILjava/lang/Exception;)V

    .line 2163
    :cond_0
    :goto_0
    return-void

    .line 2166
    :cond_1
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/aa;->c(Ljava/lang/Object;)V

    .line 2167
    iget-object v0, p0, Lcom/roidapp/photogrid/ap;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2168
    iget-object v0, p0, Lcom/roidapp/photogrid/ap;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->j()V

    .line 2170
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "QPicFailed"

    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2171
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "QPicCode"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2172
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "QPicCodeTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2175
    iget-object v0, p0, Lcom/roidapp/photogrid/ap;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/MainPage;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "QPicCode"

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/d;->a(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2176
    iget-object v0, p0, Lcom/roidapp/photogrid/ap;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-static {v0}, Lcom/roidapp/photogrid/MainPage;->v(Lcom/roidapp/photogrid/MainPage;)Z

    goto :goto_0
.end method
