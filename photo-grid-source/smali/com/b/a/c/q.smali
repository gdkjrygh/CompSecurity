.class final Lcom/b/a/c/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/b/a/c/o;


# direct methods
.method constructor <init>(Lcom/b/a/c/o;)V
    .locals 0

    .prologue
    .line 985
    iput-object p1, p0, Lcom/b/a/c/q;->a:Lcom/b/a/c/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 988
    iget-object v0, p0, Lcom/b/a/c/q;->a:Lcom/b/a/c/o;

    iget-object v0, v0, Lcom/b/a/c/o;->b:Lcom/b/a/c/t;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/b/a/c/t;->a(Z)V

    .line 989
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 990
    return-void
.end method
