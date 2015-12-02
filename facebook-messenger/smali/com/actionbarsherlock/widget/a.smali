.class public Lcom/actionbarsherlock/widget/a;
.super Ljava/lang/Object;
.source "PopupMenu.java"

# interfaces
.implements Lcom/actionbarsherlock/internal/view/menu/b;
.implements Lcom/actionbarsherlock/internal/view/menu/i;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/actionbarsherlock/internal/view/menu/a;

.field private c:Landroid/view/View;

.field private d:Lcom/actionbarsherlock/internal/view/menu/d;

.field private e:Lcom/actionbarsherlock/widget/c;

.field private f:Lcom/actionbarsherlock/widget/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 2

    .prologue
    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Lcom/actionbarsherlock/widget/a;->a:Landroid/content/Context;

    .line 68
    new-instance v0, Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-direct {v0, p1}, Lcom/actionbarsherlock/internal/view/menu/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/actionbarsherlock/widget/a;->b:Lcom/actionbarsherlock/internal/view/menu/a;

    .line 69
    iget-object v0, p0, Lcom/actionbarsherlock/widget/a;->b:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0, p0}, Lcom/actionbarsherlock/internal/view/menu/a;->a(Lcom/actionbarsherlock/internal/view/menu/b;)V

    .line 70
    iput-object p2, p0, Lcom/actionbarsherlock/widget/a;->c:Landroid/view/View;

    .line 71
    new-instance v0, Lcom/actionbarsherlock/internal/view/menu/d;

    iget-object v1, p0, Lcom/actionbarsherlock/widget/a;->b:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-direct {v0, p1, v1, p2}, Lcom/actionbarsherlock/internal/view/menu/d;-><init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/a;Landroid/view/View;)V

    iput-object v0, p0, Lcom/actionbarsherlock/widget/a;->d:Lcom/actionbarsherlock/internal/view/menu/d;

    .line 72
    iget-object v0, p0, Lcom/actionbarsherlock/widget/a;->d:Lcom/actionbarsherlock/internal/view/menu/d;

    invoke-virtual {v0, p0}, Lcom/actionbarsherlock/internal/view/menu/d;->a(Lcom/actionbarsherlock/internal/view/menu/i;)V

    .line 73
    return-void
.end method


# virtual methods
.method public a()Lcom/actionbarsherlock/a/a;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/actionbarsherlock/widget/a;->b:Lcom/actionbarsherlock/internal/view/menu/a;

    return-object v0
.end method

.method public a(Lcom/actionbarsherlock/internal/view/menu/a;Z)V
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Lcom/actionbarsherlock/widget/a;->f:Lcom/actionbarsherlock/widget/b;

    if-eqz v0, :cond_0

    .line 155
    iget-object v0, p0, Lcom/actionbarsherlock/widget/a;->f:Lcom/actionbarsherlock/widget/b;

    invoke-interface {v0, p0}, Lcom/actionbarsherlock/widget/b;->a(Lcom/actionbarsherlock/widget/a;)V

    .line 157
    :cond_0
    return-void
.end method

.method public a(Lcom/actionbarsherlock/widget/b;)V
    .locals 0

    .prologue
    .line 137
    iput-object p1, p0, Lcom/actionbarsherlock/widget/a;->f:Lcom/actionbarsherlock/widget/b;

    .line 138
    return-void
.end method

.method public a(Lcom/actionbarsherlock/widget/c;)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lcom/actionbarsherlock/widget/a;->e:Lcom/actionbarsherlock/widget/c;

    .line 129
    return-void
.end method

.method public a(Lcom/actionbarsherlock/internal/view/menu/a;)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 163
    if-nez p1, :cond_1

    const/4 v0, 0x0

    .line 171
    :cond_0
    :goto_0
    return v0

    .line 165
    :cond_1
    invoke-virtual {p1}, Lcom/actionbarsherlock/internal/view/menu/a;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 170
    new-instance v1, Lcom/actionbarsherlock/internal/view/menu/d;

    iget-object v2, p0, Lcom/actionbarsherlock/widget/a;->a:Landroid/content/Context;

    iget-object v3, p0, Lcom/actionbarsherlock/widget/a;->c:Landroid/view/View;

    invoke-direct {v1, v2, p1, v3}, Lcom/actionbarsherlock/internal/view/menu/d;-><init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/a;Landroid/view/View;)V

    invoke-virtual {v1}, Lcom/actionbarsherlock/internal/view/menu/d;->a()V

    goto :goto_0
.end method

.method public a(Lcom/actionbarsherlock/internal/view/menu/a;Lcom/actionbarsherlock/a/b;)Z
    .locals 1

    .prologue
    .line 144
    iget-object v0, p0, Lcom/actionbarsherlock/widget/a;->e:Lcom/actionbarsherlock/widget/c;

    if-eqz v0, :cond_0

    .line 145
    iget-object v0, p0, Lcom/actionbarsherlock/widget/a;->e:Lcom/actionbarsherlock/widget/c;

    invoke-interface {v0, p2}, Lcom/actionbarsherlock/widget/c;->a(Lcom/actionbarsherlock/a/b;)Z

    move-result v0

    .line 147
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()V
    .locals 1

    .prologue
    .line 110
    iget-object v0, p0, Lcom/actionbarsherlock/widget/a;->d:Lcom/actionbarsherlock/internal/view/menu/d;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/d;->a()V

    .line 111
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 119
    iget-object v0, p0, Lcom/actionbarsherlock/widget/a;->d:Lcom/actionbarsherlock/internal/view/menu/d;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/d;->c()V

    .line 120
    return-void
.end method
