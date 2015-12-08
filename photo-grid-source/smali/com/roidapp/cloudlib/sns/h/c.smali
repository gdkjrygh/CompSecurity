.class final Lcom/roidapp/cloudlib/sns/h/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/view/u;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/h/a;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/h/a;)V
    .locals 0

    .prologue
    .line 303
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/c;->a:Lcom/roidapp/cloudlib/sns/h/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(II)V
    .locals 2

    .prologue
    .line 307
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/c;->a:Lcom/roidapp/cloudlib/sns/h/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/h/a;->d(Lcom/roidapp/cloudlib/sns/h/a;)Landroid/widget/EditText;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/c;->a:Lcom/roidapp/cloudlib/sns/h/a;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/h/a;->c(Lcom/roidapp/cloudlib/sns/h/a;)[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, p1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 308
    return-void
.end method
