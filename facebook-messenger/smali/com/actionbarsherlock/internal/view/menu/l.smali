.class public Lcom/actionbarsherlock/internal/view/menu/l;
.super Lcom/actionbarsherlock/internal/view/menu/a;
.source "SubMenuBuilder.java"

# interfaces
.implements Lcom/actionbarsherlock/a/d;


# instance fields
.field private d:Lcom/actionbarsherlock/internal/view/menu/a;

.field private e:Lcom/actionbarsherlock/internal/view/menu/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/actionbarsherlock/internal/view/menu/a;Lcom/actionbarsherlock/internal/view/menu/c;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/a;-><init>(Landroid/content/Context;)V

    .line 40
    iput-object p2, p0, Lcom/actionbarsherlock/internal/view/menu/l;->d:Lcom/actionbarsherlock/internal/view/menu/a;

    .line 41
    iput-object p3, p0, Lcom/actionbarsherlock/internal/view/menu/l;->e:Lcom/actionbarsherlock/internal/view/menu/c;

    .line 42
    return-void
.end method


# virtual methods
.method public a(Lcom/actionbarsherlock/internal/view/menu/b;)V
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/l;->d:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/view/menu/a;->a(Lcom/actionbarsherlock/internal/view/menu/b;)V

    .line 75
    return-void
.end method

.method public a(Z)V
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/l;->d:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/view/menu/a;->a(Z)V

    .line 47
    return-void
.end method

.method a(Lcom/actionbarsherlock/internal/view/menu/a;Lcom/actionbarsherlock/a/b;)Z
    .locals 1

    .prologue
    .line 84
    invoke-super {p0, p1, p2}, Lcom/actionbarsherlock/internal/view/menu/a;->a(Lcom/actionbarsherlock/internal/view/menu/a;Lcom/actionbarsherlock/a/b;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/l;->d:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0, p1, p2}, Lcom/actionbarsherlock/internal/view/menu/a;->a(Lcom/actionbarsherlock/internal/view/menu/a;Lcom/actionbarsherlock/a/b;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Landroid/graphics/drawable/Drawable;)Lcom/actionbarsherlock/a/d;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/l;->e:Lcom/actionbarsherlock/internal/view/menu/c;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/view/menu/c;->a(Landroid/graphics/drawable/Drawable;)Lcom/actionbarsherlock/a/b;

    .line 90
    return-object p0
.end method

.method public b(Landroid/view/View;)Lcom/actionbarsherlock/a/d;
    .locals 1

    .prologue
    .line 115
    invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/a;->a(Landroid/view/View;)Lcom/actionbarsherlock/internal/view/menu/a;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/a/d;

    return-object v0
.end method

.method public b(Lcom/actionbarsherlock/internal/view/menu/c;)Z
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/l;->d:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/view/menu/a;->b(Lcom/actionbarsherlock/internal/view/menu/c;)Z

    move-result v0

    return v0
.end method

.method public c(Landroid/graphics/drawable/Drawable;)Lcom/actionbarsherlock/a/d;
    .locals 1

    .prologue
    .line 99
    invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/a;->a(Landroid/graphics/drawable/Drawable;)Lcom/actionbarsherlock/internal/view/menu/a;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/a/d;

    return-object v0
.end method

.method public d(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/a/d;
    .locals 1

    .prologue
    .line 107
    invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/a;->c(Ljava/lang/CharSequence;)Lcom/actionbarsherlock/internal/view/menu/a;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/a/d;

    return-object v0
.end method

.method public d()Z
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/l;->d:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/a;->d()Z

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/l;->d:Lcom/actionbarsherlock/internal/view/menu/a;

    invoke-virtual {v0}, Lcom/actionbarsherlock/internal/view/menu/a;->e()Z

    move-result v0

    return v0
.end method

.method public k(I)Lcom/actionbarsherlock/a/d;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/l;->e:Lcom/actionbarsherlock/internal/view/menu/c;

    invoke-virtual {v0, p1}, Lcom/actionbarsherlock/internal/view/menu/c;->b(I)Lcom/actionbarsherlock/a/b;

    .line 95
    return-object p0
.end method

.method public l(I)Lcom/actionbarsherlock/a/d;
    .locals 1

    .prologue
    .line 103
    invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/a;->j(I)Lcom/actionbarsherlock/internal/view/menu/a;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/a/d;

    return-object v0
.end method

.method public m(I)Lcom/actionbarsherlock/a/d;
    .locals 1

    .prologue
    .line 111
    invoke-super {p0, p1}, Lcom/actionbarsherlock/internal/view/menu/a;->i(I)Lcom/actionbarsherlock/internal/view/menu/a;

    move-result-object v0

    check-cast v0, Lcom/actionbarsherlock/a/d;

    return-object v0
.end method

.method public n()Lcom/actionbarsherlock/internal/view/menu/a;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/l;->d:Lcom/actionbarsherlock/internal/view/menu/a;

    return-object v0
.end method

.method public q()Lcom/actionbarsherlock/a/b;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lcom/actionbarsherlock/internal/view/menu/l;->e:Lcom/actionbarsherlock/internal/view/menu/c;

    return-object v0
.end method
