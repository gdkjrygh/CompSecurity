.class final Lcom/kik/cards/web/iap/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/kik/cards/web/plugin/a;

.field final synthetic b:Lorg/json/JSONObject;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/kik/cards/web/iap/InAppPurchasePlugin;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/iap/InAppPurchasePlugin;Lcom/kik/cards/web/plugin/a;Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 645
    iput-object p1, p0, Lcom/kik/cards/web/iap/j;->d:Lcom/kik/cards/web/iap/InAppPurchasePlugin;

    iput-object p2, p0, Lcom/kik/cards/web/iap/j;->a:Lcom/kik/cards/web/plugin/a;

    iput-object p3, p0, Lcom/kik/cards/web/iap/j;->b:Lorg/json/JSONObject;

    iput-object p4, p0, Lcom/kik/cards/web/iap/j;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 649
    iget-object v0, p0, Lcom/kik/cards/web/iap/j;->a:Lcom/kik/cards/web/plugin/a;

    iget-object v1, p0, Lcom/kik/cards/web/iap/j;->d:Lcom/kik/cards/web/iap/InAppPurchasePlugin;

    iget-object v2, p0, Lcom/kik/cards/web/iap/j;->b:Lorg/json/JSONObject;

    iget-object v3, p0, Lcom/kik/cards/web/iap/j;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lcom/kik/cards/web/iap/InAppPurchasePlugin;->getAvailableItems(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/kik/cards/web/plugin/j;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/kik/cards/web/plugin/a;->a(Lcom/kik/cards/web/plugin/j;)V

    .line 650
    return-void
.end method
