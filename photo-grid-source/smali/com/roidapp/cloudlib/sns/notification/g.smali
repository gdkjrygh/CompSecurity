.class final Lcom/roidapp/cloudlib/sns/notification/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/sns/notification/n;

.field final synthetic b:Lcom/roidapp/cloudlib/sns/notification/f;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/sns/notification/f;Lcom/roidapp/cloudlib/sns/notification/n;)V
    .locals 0

    .prologue
    .line 150
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/notification/g;->b:Lcom/roidapp/cloudlib/sns/notification/f;

    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/notification/g;->a:Lcom/roidapp/cloudlib/sns/notification/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 153
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/g;->b:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/f;->a(Lcom/roidapp/cloudlib/sns/notification/f;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 154
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/notification/g;->b:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/notification/f;->a(Lcom/roidapp/cloudlib/sns/notification/f;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;Landroid/content/DialogInterface$OnClickListener;)V

    .line 166
    :cond_0
    :goto_0
    return-void

    .line 157
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 158
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/g;->b:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/notification/f;->b(Lcom/roidapp/cloudlib/sns/notification/f;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/b/h;

    .line 159
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-static {v1}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v1

    .line 160
    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/b/h;->c:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->q:Lcom/roidapp/cloudlib/sns/b/c;

    invoke-static {v1, v2}, Lcom/roidapp/cloudlib/sns/g/f;->a(Lcom/roidapp/cloudlib/sns/g/f;Lcom/roidapp/cloudlib/sns/b/c;)Lcom/roidapp/cloudlib/sns/b/c;

    move-result-object v1

    .line 161
    sget-object v2, Lcom/roidapp/cloudlib/sns/b/c;->b:Lcom/roidapp/cloudlib/sns/b/c;

    if-ne v1, v2, :cond_2

    .line 162
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/g;->b:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/notification/f;->a(Lcom/roidapp/cloudlib/sns/notification/f;Lcom/roidapp/cloudlib/sns/b/h;)V

    goto :goto_0

    .line 163
    :cond_2
    sget-object v2, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    if-ne v1, v2, :cond_0

    .line 164
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/notification/g;->b:Lcom/roidapp/cloudlib/sns/notification/f;

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/notification/f;->b(Lcom/roidapp/cloudlib/sns/notification/f;Lcom/roidapp/cloudlib/sns/b/h;)V

    goto :goto_0
.end method
