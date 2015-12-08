.class final Lcom/roidapp/photogrid/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/template/g;

.field final synthetic b:Lcom/roidapp/photogrid/s;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/s;Lcom/roidapp/cloudlib/template/g;)V
    .locals 0

    .prologue
    .line 258
    iput-object p1, p0, Lcom/roidapp/photogrid/t;->b:Lcom/roidapp/photogrid/s;

    iput-object p2, p0, Lcom/roidapp/photogrid/t;->a:Lcom/roidapp/cloudlib/template/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 262
    iget-object v0, p0, Lcom/roidapp/photogrid/t;->a:Lcom/roidapp/cloudlib/template/g;

    new-instance v1, Lcom/roidapp/photogrid/u;

    iget-object v2, p0, Lcom/roidapp/photogrid/t;->b:Lcom/roidapp/photogrid/s;

    invoke-static {v2}, Lcom/roidapp/photogrid/s;->a(Lcom/roidapp/photogrid/s;)Lcom/roidapp/photogrid/MainPage;

    move-result-object v2

    invoke-static {v2}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/roidapp/photogrid/u;-><init>(Landroid/content/SharedPreferences;B)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/template/g;->a(Lcom/roidapp/cloudlib/template/h;)Z

    .line 267
    return-void
.end method
