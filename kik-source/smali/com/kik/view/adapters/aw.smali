.class final Lcom/kik/view/adapters/aw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/view/adapters/au$b;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/kik/view/adapters/au;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/au;I)V
    .locals 0

    .prologue
    .line 183
    iput-object p1, p0, Lcom/kik/view/adapters/aw;->b:Lcom/kik/view/adapters/au;

    iput p2, p0, Lcom/kik/view/adapters/aw;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 196
    iget-object v0, p0, Lcom/kik/view/adapters/aw;->b:Lcom/kik/view/adapters/au;

    invoke-static {v0}, Lcom/kik/view/adapters/au;->a(Lcom/kik/view/adapters/au;)Lcom/kik/view/adapters/au$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 197
    iget-object v0, p0, Lcom/kik/view/adapters/aw;->b:Lcom/kik/view/adapters/au;

    invoke-static {v0}, Lcom/kik/view/adapters/au;->a(Lcom/kik/view/adapters/au;)Lcom/kik/view/adapters/au$b;

    move-result-object v0

    invoke-interface {v0}, Lcom/kik/view/adapters/au$b;->a()V

    .line 199
    :cond_0
    return-void
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6

    .prologue
    .line 188
    iget-object v0, p0, Lcom/kik/view/adapters/aw;->b:Lcom/kik/view/adapters/au;

    invoke-static {v0}, Lcom/kik/view/adapters/au;->a(Lcom/kik/view/adapters/au;)Lcom/kik/view/adapters/au$b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 189
    iget-object v0, p0, Lcom/kik/view/adapters/aw;->b:Lcom/kik/view/adapters/au;

    invoke-static {v0}, Lcom/kik/view/adapters/au;->a(Lcom/kik/view/adapters/au;)Lcom/kik/view/adapters/au$b;

    move-result-object v0

    iget v1, p0, Lcom/kik/view/adapters/aw;->a:I

    add-int/lit8 v3, v1, 0x1

    move-object v1, p1

    move-object v2, p2

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/kik/view/adapters/au$b;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 191
    :cond_0
    return-void
.end method
