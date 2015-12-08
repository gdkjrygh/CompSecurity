.class Lcom/scannerfire/model/ListenerObjects$9;
.super Ljava/lang/Object;
.source "ListenerObjects.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scannerfire/model/ListenerObjects;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scannerfire/model/ListenerObjects;


# direct methods
.method constructor <init>(Lcom/scannerfire/model/ListenerObjects;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/scannerfire/model/ListenerObjects$9;->this$0:Lcom/scannerfire/model/ListenerObjects;

    .line 350
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 354
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "http://books.google.com/books?vid=isbn"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/scannerfire/model/ListenerObjects$9;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v2, v2, Lcom/scannerfire/model/ListenerObjects;->value:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 355
    .local v0, "s":Ljava/lang/String;
    iget-object v1, p0, Lcom/scannerfire/model/ListenerObjects$9;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v1, v1, Lcom/scannerfire/model/ListenerObjects;->context:Landroid/app/Activity;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v1, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 356
    return-void
.end method
