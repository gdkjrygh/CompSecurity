.class final Lcom/a/a/c/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/a/a/c/n;


# direct methods
.method constructor <init>(Lcom/a/a/c/n;)V
    .locals 0

    .prologue
    .line 947
    iput-object p1, p0, Lcom/a/a/c/o;->a:Lcom/a/a/c/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 950
    iget-object v0, p0, Lcom/a/a/c/o;->a:Lcom/a/a/c/n;

    iget-object v0, v0, Lcom/a/a/c/n;->b:Lcom/a/a/c/g$a;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/a/a/c/g$a;->a(Z)V

    .line 951
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 952
    return-void
.end method
