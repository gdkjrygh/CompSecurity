.class final Lcom/roidapp/cloudlib/b/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/b/a;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/b/a;)V
    .locals 0

    .prologue
    .line 158
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .prologue
    .line 172
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->e(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/sns/ab;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 173
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 174
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->f(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/sns/ab;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->b(I)V

    .line 180
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->h(Lcom/roidapp/cloudlib/b/a;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 181
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->a(Lcom/roidapp/cloudlib/b/a;)I

    move-result v0

    if-nez v0, :cond_2

    .line 182
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->i(Lcom/roidapp/cloudlib/b/a;)Ljava/lang/Thread;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->a(Ljava/lang/Thread;)V

    .line 186
    :goto_1
    if-eqz p1, :cond_3

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_3

    .line 187
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 188
    iget-object v1, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/b/a;->a(Lcom/roidapp/cloudlib/b/a;Ljava/lang/String;)V

    .line 189
    iget-object v1, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/b/a;->b(Lcom/roidapp/cloudlib/b/a;Ljava/lang/String;)V

    .line 220
    :goto_2
    return-void

    .line 176
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->g(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/sns/ab;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->b(I)V

    goto :goto_0

    .line 184
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->j(Lcom/roidapp/cloudlib/b/a;)Ljava/lang/Thread;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->a(Ljava/lang/Thread;)V

    goto :goto_1

    .line 191
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->a(Lcom/roidapp/cloudlib/b/a;)I

    move-result v0

    if-nez v0, :cond_4

    .line 192
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->b(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/b/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/j;->f()V

    .line 196
    :goto_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->k(Lcom/roidapp/cloudlib/b/a;)V

    .line 197
    if-eqz p1, :cond_6

    invoke-interface {p1}, Landroid/text/Editable;->length()I

    move-result v0

    if-lez v0, :cond_6

    .line 198
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/b/a;->a(Lcom/roidapp/cloudlib/b/a;Ljava/lang/String;)V

    .line 199
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->a(Lcom/roidapp/cloudlib/b/a;)I

    move-result v0

    if-nez v0, :cond_5

    .line 200
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->b(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/b/j;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/j;->f()V

    .line 201
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->b(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/b/j;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/b/j;->a(Ljava/lang/String;)V

    .line 202
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->b(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/b/j;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->aB:I

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/b/j;->a(I)V

    goto :goto_2

    .line 194
    :cond_4
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->d(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/b/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/g;->f()V

    goto :goto_3

    .line 204
    :cond_5
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->d(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/b/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/b/g;->f()V

    .line 205
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->d(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/b/g;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/b/g;->a(Ljava/lang/String;)V

    .line 206
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->d(Lcom/roidapp/cloudlib/b/a;)Lcom/roidapp/cloudlib/b/g;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/at;->aB:I

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/b/g;->a(I)V

    goto/16 :goto_2

    .line 209
    :cond_6
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/b/a;->a(Lcom/roidapp/cloudlib/b/a;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 213
    :cond_7
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v0}, Lcom/roidapp/cloudlib/b/a;->l(Lcom/roidapp/cloudlib/b/a;)Z

    .line 214
    if-eqz p1, :cond_8

    .line 215
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/b/a;->a(Lcom/roidapp/cloudlib/b/a;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 217
    :cond_8
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/f;->a:Lcom/roidapp/cloudlib/b/a;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/b/a;->a(Lcom/roidapp/cloudlib/b/a;Ljava/lang/String;)V

    goto/16 :goto_2
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 168
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 163
    return-void
.end method
