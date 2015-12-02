.class Lcom/facebook/c/n;
.super Ljava/lang/Object;
.source "FacebookOnlySecureBroadcastReceiver.java"

# interfaces
.implements Lcom/facebook/c/b;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/c/m;


# direct methods
.method constructor <init>(Lcom/facebook/c/m;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 96
    iput-object p1, p0, Lcom/facebook/c/n;->b:Lcom/facebook/c/m;

    iput-object p2, p0, Lcom/facebook/c/n;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;)V
    .locals 2

    .prologue
    .line 99
    iget-object v0, p0, Lcom/facebook/c/n;->b:Lcom/facebook/c/m;

    iget-object v1, p0, Lcom/facebook/c/n;->a:Ljava/lang/String;

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/facebook/c/m;->a(Landroid/content/Context;Landroid/content/Intent;Lcom/facebook/c/c;Ljava/lang/String;)V

    .line 100
    return-void
.end method
