.class final Lcom/kik/cards/web/ag;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Landroid/webkit/GeolocationPermissions$Callback;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/kik/cards/web/CardsWebViewFragment;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/CardsWebViewFragment;Landroid/webkit/GeolocationPermissions$Callback;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1875
    iput-object p1, p0, Lcom/kik/cards/web/ag;->c:Lcom/kik/cards/web/CardsWebViewFragment;

    iput-object p2, p0, Lcom/kik/cards/web/ag;->a:Landroid/webkit/GeolocationPermissions$Callback;

    iput-object p3, p0, Lcom/kik/cards/web/ag;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    .line 1879
    iget-object v0, p0, Lcom/kik/cards/web/ag;->a:Landroid/webkit/GeolocationPermissions$Callback;

    iget-object v1, p0, Lcom/kik/cards/web/ag;->b:Ljava/lang/String;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/webkit/GeolocationPermissions$Callback;->invoke(Ljava/lang/String;ZZ)V

    .line 1880
    iget-object v0, p0, Lcom/kik/cards/web/ag;->c:Lcom/kik/cards/web/CardsWebViewFragment;

    iget-object v0, v0, Lcom/kik/cards/web/CardsWebViewFragment;->t:Lkik/android/b/s;

    iget-object v1, p0, Lcom/kik/cards/web/ag;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lkik/android/b/s;->d(Ljava/lang/String;)Lcom/kik/g/p;

    .line 1881
    return-void
.end method
