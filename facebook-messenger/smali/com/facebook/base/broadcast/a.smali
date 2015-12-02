.class public Lcom/facebook/base/broadcast/a;
.super Ljava/lang/Object;
.source "ActivityBroadcaster.java"


# instance fields
.field protected final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/facebook/base/broadcast/a;->a:Landroid/content/Context;

    .line 18
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Intent;)V
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/base/broadcast/a;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/a/e;->a(Landroid/content/Context;)Landroid/support/v4/a/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v4/a/e;->a(Landroid/content/Intent;)Z

    .line 34
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 27
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 28
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 29
    invoke-virtual {p0, v0}, Lcom/facebook/base/broadcast/a;->a(Landroid/content/Intent;)V

    .line 30
    return-void
.end method
