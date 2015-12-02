.class Lcom/qihoo/security/alasticbutton/ElasticImageButton$1;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/alasticbutton/ElasticImageButton;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/alasticbutton/ElasticImageButton;


# direct methods
.method constructor <init>(Lcom/qihoo/security/alasticbutton/ElasticImageButton;)V
    .locals 0

    .prologue
    .line 194
    iput-object p1, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton$1;->a:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 197
    const/4 v0, 0x0

    iget-object v1, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton$1;->a:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/b/b;->a(ILandroid/view/View;)V

    .line 199
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 203
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton$1;->a:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-static {v0, v1}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->a(Lcom/qihoo/security/alasticbutton/ElasticImageButton;Z)Z

    .line 204
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/qihoo/security/ui/b/b;->c(I)V

    .line 205
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton$1;->a:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-static {v0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->a(Lcom/qihoo/security/alasticbutton/ElasticImageButton;)Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 206
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton$1;->a:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-static {v0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->a(Lcom/qihoo/security/alasticbutton/ElasticImageButton;)Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/qihoo/security/alasticbutton/ElasticImageButton$a;->b()V

    .line 209
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/alasticbutton/ElasticImageButton$1;->a:Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->b(Z)V

    .line 210
    return-void
.end method
