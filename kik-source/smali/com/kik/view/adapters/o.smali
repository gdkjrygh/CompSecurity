.class final Lcom/kik/view/adapters/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lkik/android/net/a/b;

.field final synthetic b:Lkik/android/widget/ProgressWidget;

.field final synthetic c:Lcom/kik/view/adapters/n$a;

.field final synthetic d:Lkik/a/d/s;

.field final synthetic e:Lcom/kik/view/adapters/n;


# direct methods
.method constructor <init>(Lcom/kik/view/adapters/n;Lkik/android/net/a/b;Lkik/android/widget/ProgressWidget;Lcom/kik/view/adapters/n$a;Lkik/a/d/s;)V
    .locals 0

    .prologue
    .line 198
    iput-object p1, p0, Lcom/kik/view/adapters/o;->e:Lcom/kik/view/adapters/n;

    iput-object p2, p0, Lcom/kik/view/adapters/o;->a:Lkik/android/net/a/b;

    iput-object p3, p0, Lcom/kik/view/adapters/o;->b:Lkik/android/widget/ProgressWidget;

    iput-object p4, p0, Lcom/kik/view/adapters/o;->c:Lcom/kik/view/adapters/n$a;

    iput-object p5, p0, Lcom/kik/view/adapters/o;->d:Lkik/a/d/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    .line 203
    iget-object v0, p0, Lcom/kik/view/adapters/o;->e:Lcom/kik/view/adapters/n;

    iget-object v1, p0, Lcom/kik/view/adapters/o;->a:Lkik/android/net/a/b;

    iget-object v2, p0, Lcom/kik/view/adapters/o;->b:Lkik/android/widget/ProgressWidget;

    iget-object v3, p0, Lcom/kik/view/adapters/o;->c:Lcom/kik/view/adapters/n$a;

    iget-object v4, p0, Lcom/kik/view/adapters/o;->d:Lkik/a/d/s;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kik/view/adapters/n;->a(Lkik/android/net/a/b;Lkik/android/widget/ProgressWidget;Lcom/kik/view/adapters/n$a;Lkik/a/d/s;)V

    .line 204
    return-void
.end method
