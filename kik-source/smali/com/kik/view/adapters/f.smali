.class final Lcom/kik/view/adapters/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/au$b;

.field final synthetic b:Lcom/kik/view/adapters/e$a;

.field final synthetic c:Lcom/kik/view/adapters/e;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/e;Lcom/kik/view/adapters/au$b;Lcom/kik/view/adapters/e$a;)V
    .locals 0

    .prologue
    .line 128
    iput-object p1, p0, Lcom/kik/view/adapters/f;->c:Lcom/kik/view/adapters/e;

    iput-object p2, p0, Lcom/kik/view/adapters/f;->a:Lcom/kik/view/adapters/au$b;

    iput-object p3, p0, Lcom/kik/view/adapters/f;->b:Lcom/kik/view/adapters/e$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    .line 134
    iget-object v0, p0, Lcom/kik/view/adapters/f;->a:Lcom/kik/view/adapters/au$b;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/kik/view/adapters/f;->b:Lcom/kik/view/adapters/e$a;

    iget-object v2, v2, Lcom/kik/view/adapters/e$a;->r:Landroid/view/View;

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    invoke-interface/range {v0 .. v5}, Lcom/kik/view/adapters/au$b;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 135
    return-void
.end method
