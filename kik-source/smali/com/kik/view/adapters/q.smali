.class final Lcom/kik/view/adapters/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/au$b;

.field final synthetic b:Lcom/kik/view/adapters/n$a;

.field final synthetic c:Lcom/kik/view/adapters/n;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/n;Lcom/kik/view/adapters/au$b;Lcom/kik/view/adapters/n$a;)V
    .locals 0

    .prologue
    .line 302
    iput-object p1, p0, Lcom/kik/view/adapters/q;->c:Lcom/kik/view/adapters/n;

    iput-object p2, p0, Lcom/kik/view/adapters/q;->a:Lcom/kik/view/adapters/au$b;

    iput-object p3, p0, Lcom/kik/view/adapters/q;->b:Lcom/kik/view/adapters/n$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    .line 308
    iget-object v0, p0, Lcom/kik/view/adapters/q;->a:Lcom/kik/view/adapters/au$b;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/kik/view/adapters/q;->b:Lcom/kik/view/adapters/n$a;

    iget-object v2, v2, Lcom/kik/view/adapters/n$a;->r:Landroid/view/View;

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    invoke-interface/range {v0 .. v5}, Lcom/kik/view/adapters/au$b;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 309
    return-void
.end method
