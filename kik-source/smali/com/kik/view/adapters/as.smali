.class final Lcom/kik/view/adapters/as;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/kik/view/adapters/au$b;

.field final synthetic b:Lcom/kik/view/adapters/ar;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/ar;Lcom/kik/view/adapters/au$b;)V
    .locals 0

    .prologue
    .line 126
    iput-object p1, p0, Lcom/kik/view/adapters/as;->b:Lcom/kik/view/adapters/ar;

    iput-object p2, p0, Lcom/kik/view/adapters/as;->a:Lcom/kik/view/adapters/au$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcom/kik/view/adapters/as;->a:Lcom/kik/view/adapters/au$b;

    invoke-interface {v0}, Lcom/kik/view/adapters/au$b;->a()V

    .line 131
    return-void
.end method
