.class Lcom/facebook/orca/chatheads/dj;
.super Ljava/lang/Object;
.source "ChatThreadView.java"

# interfaces
.implements Lcom/actionbarsherlock/widget/c;


# instance fields
.field final synthetic a:Lcom/facebook/orca/chatheads/dh;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/dh;)V
    .locals 0

    .prologue
    .line 1171
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dj;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/actionbarsherlock/a/b;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 1174
    invoke-interface {p1}, Lcom/actionbarsherlock/a/b;->d()I

    move-result v1

    sget v2, Lcom/facebook/i;->open_full_view:I

    if-ne v1, v2, :cond_0

    .line 1175
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dj;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/dh;->k(Lcom/facebook/orca/chatheads/dh;)V

    .line 1181
    :goto_0
    return v0

    .line 1177
    :cond_0
    invoke-interface {p1}, Lcom/actionbarsherlock/a/b;->d()I

    move-result v1

    sget v2, Lcom/facebook/i;->refresh:I

    if-ne v1, v2, :cond_1

    .line 1178
    iget-object v1, p0, Lcom/facebook/orca/chatheads/dj;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/dh;->l(Lcom/facebook/orca/chatheads/dh;)V

    goto :goto_0

    .line 1181
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dj;->a:Lcom/facebook/orca/chatheads/dh;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/dh;->m(Lcom/facebook/orca/chatheads/dh;)Lcom/facebook/ui/f/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/a/a;

    invoke-direct {v1, p1}, Lcom/facebook/orca/chatheads/a/a;-><init>(Lcom/actionbarsherlock/a/b;)V

    invoke-interface {v0, v1}, Lcom/facebook/ui/f/a;->a(Landroid/view/MenuItem;)Z

    move-result v0

    goto :goto_0
.end method
