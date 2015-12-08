.class Lcom/scannerfire/model/ListenerObjects$4;
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
    iput-object p1, p0, Lcom/scannerfire/model/ListenerObjects$4;->this$0:Lcom/scannerfire/model/ListenerObjects;

    .line 146
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 150
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.DIAL"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 151
    .local v0, "intent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/scannerfire/model/ListenerObjects$4;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v1, v1, Lcom/scannerfire/model/ListenerObjects;->value:Ljava/lang/String;

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 152
    iget-object v1, p0, Lcom/scannerfire/model/ListenerObjects$4;->this$0:Lcom/scannerfire/model/ListenerObjects;

    iget-object v1, v1, Lcom/scannerfire/model/ListenerObjects;->context:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 153
    return-void
.end method
