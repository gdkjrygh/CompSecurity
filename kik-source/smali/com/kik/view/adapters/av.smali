.class final Lcom/kik/view/adapters/av;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/view/adapters/au$b;


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/aq;

.field final synthetic b:Lkik/a/d/s;

.field final synthetic c:I

.field final synthetic d:Lcom/kik/view/adapters/au;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/au;Lcom/kik/view/adapters/aq;Lkik/a/d/s;I)V
    .locals 0

    .prologue
    .line 165
    iput-object p1, p0, Lcom/kik/view/adapters/av;->d:Lcom/kik/view/adapters/au;

    iput-object p2, p0, Lcom/kik/view/adapters/av;->a:Lcom/kik/view/adapters/aq;

    iput-object p3, p0, Lcom/kik/view/adapters/av;->b:Lkik/a/d/s;

    iput p4, p0, Lcom/kik/view/adapters/av;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .prologue
    .line 179
    return-void
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    .prologue
    .line 171
    iget-object v0, p0, Lcom/kik/view/adapters/av;->a:Lcom/kik/view/adapters/aq;

    iget-object v1, p0, Lcom/kik/view/adapters/av;->b:Lkik/a/d/s;

    invoke-interface {v0, v1}, Lcom/kik/view/adapters/aq;->b(Lkik/a/d/s;)V

    .line 173
    iget-object v0, p0, Lcom/kik/view/adapters/av;->d:Lcom/kik/view/adapters/au;

    iget v1, p0, Lcom/kik/view/adapters/av;->c:I

    invoke-virtual {v0, v1, p2, p1}, Lcom/kik/view/adapters/au;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 174
    return-void
.end method
