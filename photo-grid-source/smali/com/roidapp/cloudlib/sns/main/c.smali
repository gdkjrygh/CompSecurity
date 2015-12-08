.class final Lcom/roidapp/cloudlib/sns/main/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/main/b;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/main/b;)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/main/c;->a:Lcom/roidapp/cloudlib/sns/main/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/c;->a:Lcom/roidapp/cloudlib/sns/main/b;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/main/b;->t:Lcom/roidapp/cloudlib/sns/ab;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/ab;->c()Z

    .line 44
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/c;->a:Lcom/roidapp/cloudlib/sns/main/b;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/main/b;->h_()Z

    .line 45
    return-void
.end method
