.class public final Lcom/kik/view/adapters/ap;
.super Lcom/kik/view/adapters/bb;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 16
    invoke-direct {p0, p1}, Lcom/kik/view/adapters/bb;-><init>(Landroid/content/Context;)V

    .line 10
    const-string v0, "Conversations"

    iput-object v0, p0, Lcom/kik/view/adapters/ap;->a:Ljava/lang/String;

    .line 17
    const v0, 0x7f090172

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/view/adapters/ap;->b:Ljava/lang/String;

    .line 18
    const v0, 0x7f090276

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/view/adapters/ap;->c:Ljava/lang/String;

    .line 19
    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/Adapter;)V
    .locals 1

    .prologue
    .line 26
    iget-object v0, p0, Lcom/kik/view/adapters/ap;->b:Ljava/lang/String;

    invoke-super {p0, v0, p1}, Lcom/kik/view/adapters/bb;->c(Ljava/lang/String;Landroid/widget/Adapter;)V

    .line 27
    return-void
.end method

.method public final b(Landroid/widget/Adapter;)V
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/kik/view/adapters/ap;->c:Ljava/lang/String;

    invoke-super {p0, v0, p1}, Lcom/kik/view/adapters/bb;->c(Ljava/lang/String;Landroid/widget/Adapter;)V

    .line 35
    return-void
.end method

.method public final c(Landroid/widget/Adapter;)V
    .locals 1

    .prologue
    .line 39
    iget-object v0, p0, Lcom/kik/view/adapters/ap;->a:Ljava/lang/String;

    invoke-super {p0, v0, p1}, Lcom/kik/view/adapters/bb;->f(Ljava/lang/String;Landroid/widget/Adapter;)V

    .line 40
    return-void
.end method
