.class final Lcom/arist/a/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/arist/a/a;

.field private final synthetic b:I

.field private final synthetic c:Lcom/arist/b/b;


# direct methods
.method constructor <init>(Lcom/arist/a/a;ILcom/arist/b/b;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/a/b;->a:Lcom/arist/a/a;

    iput p2, p0, Lcom/arist/a/b;->b:I

    iput-object p3, p0, Lcom/arist/a/b;->c:Lcom/arist/b/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/arist/a/b;->a:Lcom/arist/a/a;

    iget v1, p0, Lcom/arist/a/b;->b:I

    invoke-static {v0, v1}, Lcom/arist/a/a;->a(Lcom/arist/a/a;I)V

    iget-object v0, p0, Lcom/arist/a/b;->a:Lcom/arist/a/a;

    iget-object v1, p0, Lcom/arist/a/b;->c:Lcom/arist/b/b;

    invoke-virtual {v0, p1, v1}, Lcom/arist/a/a;->a(Landroid/view/View;Lcom/arist/b/b;)V

    return-void
.end method
