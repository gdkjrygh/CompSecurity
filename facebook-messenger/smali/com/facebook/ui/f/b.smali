.class public Lcom/facebook/ui/f/b;
.super Lcom/facebook/base/activity/a;
.source "AppMenuHandlerActivityListener.java"


# instance fields
.field private final a:Landroid/app/Activity;

.field private final b:Lcom/facebook/ui/f/a;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/facebook/ui/f/a;)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Lcom/facebook/base/activity/a;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/facebook/ui/f/b;->a:Landroid/app/Activity;

    .line 23
    iput-object p2, p0, Lcom/facebook/ui/f/b;->b:Lcom/facebook/ui/f/a;

    .line 24
    return-void
.end method


# virtual methods
.method public a(Landroid/view/Menu;)V
    .locals 2

    .prologue
    .line 28
    iget-object v0, p0, Lcom/facebook/ui/f/b;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    .line 29
    iget-object v1, p0, Lcom/facebook/ui/f/b;->b:Lcom/facebook/ui/f/a;

    invoke-interface {v1, p1, v0}, Lcom/facebook/ui/f/a;->a(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    .line 30
    return-void
.end method

.method public a(Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/ui/f/b;->b:Lcom/facebook/ui/f/a;

    invoke-interface {v0, p1}, Lcom/facebook/ui/f/a;->a(Landroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method
