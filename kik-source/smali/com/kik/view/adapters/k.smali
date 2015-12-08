.class public final Lcom/kik/view/adapters/k;
.super Lcom/kik/view/adapters/bb;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0, p1}, Lcom/kik/view/adapters/bb;-><init>(Landroid/content/Context;)V

    .line 16
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/kik/view/adapters/k;->b:Ljava/lang/String;

    invoke-super {p0, v0}, Lcom/kik/view/adapters/bb;->a(Ljava/lang/String;)Landroid/widget/Adapter;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/kik/view/adapters/k;->b:Ljava/lang/String;

    invoke-super {p0, v0}, Lcom/kik/view/adapters/bb;->a(Ljava/lang/String;)Landroid/widget/Adapter;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v0

    goto :goto_0
.end method

.method public final a(Landroid/widget/Adapter;)V
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/kik/view/adapters/k;->c:Ljava/lang/String;

    invoke-super {p0, v0, p1}, Lcom/kik/view/adapters/bb;->e(Ljava/lang/String;Landroid/widget/Adapter;)V

    .line 77
    return-void
.end method

.method public final a(Ljava/lang/String;Landroid/widget/Adapter;)V
    .locals 1

    .prologue
    .line 50
    iput-object p1, p0, Lcom/kik/view/adapters/k;->d:Ljava/lang/String;

    .line 51
    const/4 v0, 0x1

    invoke-super {p0, p1, p2, v0}, Lcom/kik/view/adapters/bb;->c(Ljava/lang/String;Landroid/widget/Adapter;Z)V

    .line 52
    return-void
.end method

.method public final a(Ljava/lang/String;Landroid/widget/Adapter;Z)V
    .locals 0

    .prologue
    .line 24
    iput-object p1, p0, Lcom/kik/view/adapters/k;->a:Ljava/lang/String;

    .line 25
    invoke-super {p0, p1, p2, p3}, Lcom/kik/view/adapters/bb;->c(Ljava/lang/String;Landroid/widget/Adapter;Z)V

    .line 26
    return-void
.end method

.method public final b(Landroid/widget/Adapter;)V
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lcom/kik/view/adapters/k;->d:Ljava/lang/String;

    invoke-super {p0, v0, p1}, Lcom/kik/view/adapters/bb;->e(Ljava/lang/String;Landroid/widget/Adapter;)V

    .line 82
    return-void
.end method

.method public final b(Ljava/lang/String;Landroid/widget/Adapter;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lcom/kik/view/adapters/k;->c:Ljava/lang/String;

    .line 61
    invoke-super {p0, p1, p2}, Lcom/kik/view/adapters/bb;->d(Ljava/lang/String;Landroid/widget/Adapter;)V

    .line 62
    return-void
.end method

.method public final b(Ljava/lang/String;Landroid/widget/Adapter;Z)V
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lcom/kik/view/adapters/k;->b:Ljava/lang/String;

    .line 35
    invoke-super {p0, p1, p2, p3}, Lcom/kik/view/adapters/bb;->c(Ljava/lang/String;Landroid/widget/Adapter;Z)V

    .line 36
    return-void
.end method
