.class final Lcom/kik/cards/web/ad;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/webkit/GeolocationPermissions$Callback;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/kik/cards/web/CardsWebViewFragment;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/CardsWebViewFragment;Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1849
    iput-object p1, p0, Lcom/kik/cards/web/ad;->c:Lcom/kik/cards/web/CardsWebViewFragment;

    iput-object p2, p0, Lcom/kik/cards/web/ad;->a:Landroid/webkit/GeolocationPermissions$Callback;

    iput-object p3, p0, Lcom/kik/cards/web/ad;->b:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 1849
    check-cast p1, Ljava/lang/Boolean;

    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/cards/web/ad;->a:Landroid/webkit/GeolocationPermissions$Callback;

    iget-object v1, p0, Lcom/kik/cards/web/ad;->b:Ljava/lang/String;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/kik/cards/web/ad;->c:Lcom/kik/cards/web/CardsWebViewFragment;

    iget-object v1, p0, Lcom/kik/cards/web/ad;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/kik/cards/web/ad;->a:Landroid/webkit/GeolocationPermissions$Callback;

    invoke-static {v0, v1, v2}, Lcom/kik/cards/web/CardsWebViewFragment;->a(Lcom/kik/cards/web/CardsWebViewFragment;Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 1865
    invoke-super {p0, p1}, Lcom/kik/g/r;->a(Ljava/lang/Throwable;)V

    .line 1866
    iget-object v0, p0, Lcom/kik/cards/web/ad;->c:Lcom/kik/cards/web/CardsWebViewFragment;

    iget-object v1, p0, Lcom/kik/cards/web/ad;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/kik/cards/web/ad;->a:Landroid/webkit/GeolocationPermissions$Callback;

    invoke-static {v0, v1, v2}, Lcom/kik/cards/web/CardsWebViewFragment;->a(Lcom/kik/cards/web/CardsWebViewFragment;Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V

    .line 1867
    return-void
.end method
