.class Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)V
    .locals 0

    .prologue
    .line 153
    iput-object p1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8

    .prologue
    const v7, 0x7f0c0023

    const/4 v6, 0x1

    const/4 v2, 0x0

    .line 157
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 230
    :goto_0
    return-void

    .line 161
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 162
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0, v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;I)I

    .line 163
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->i(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->o:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0026

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 164
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0, v6}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;Z)Z

    .line 165
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->e(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->notifyDataSetChanged()V

    .line 166
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->j(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setSelection(I)V

    .line 167
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)V

    goto :goto_0

    .line 169
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->k(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 170
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->i(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    iget-object v1, v1, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->o:Lcom/qihoo/security/locale/d;

    invoke-virtual {v1, v7}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 171
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0, v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;Z)Z

    .line 172
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->e(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->notifyDataSetChanged()V

    .line 173
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->j(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setSelection(I)V

    .line 174
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)V

    .line 175
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0, v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->c(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;Z)Z

    goto :goto_0

    .line 178
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->k(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v2

    .line 179
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 180
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/a/c$a;

    .line 181
    iget-boolean v4, v0, Lcom/qihoo/security/opti/a/c$a;->c:Z

    if-eqz v4, :cond_3

    .line 182
    add-int/lit8 v1, v1, 0x1

    .line 193
    iget-object v4, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v4}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 194
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    .line 196
    iget-object v4, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v4}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->d(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Lcom/qihoo/security/opti/a/c;

    move-result-object v4

    iget-object v5, v0, Lcom/qihoo/security/opti/a/c$a;->a:Ljava/lang/String;

    iget-boolean v0, v0, Lcom/qihoo/security/opti/a/c$a;->c:Z

    invoke-virtual {v4, v5, v0}, Lcom/qihoo/security/opti/a/c;->a(Ljava/lang/String;Z)V

    :cond_3
    move v0, v1

    move v1, v0

    .line 198
    goto :goto_1

    .line 200
    :cond_4
    if-lez v1, :cond_6

    .line 205
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->h(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)I

    move-result v0

    if-nez v0, :cond_5

    .line 206
    const/16 v0, 0x2b11

    invoke-static {v0, v1}, Lcom/qihoo/security/support/b;->b(II)V

    .line 213
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    iget-object v3, v3, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->o:Lcom/qihoo/security/locale/d;

    const v4, 0x7f0c00b9

    invoke-virtual {v3, v4}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;Ljava/lang/String;)V

    .line 214
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->i(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    iget-object v3, v3, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->o:Lcom/qihoo/security/locale/d;

    invoke-virtual {v3, v7}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 216
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0, v2}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->b(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;Z)Z

    .line 217
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    iget-object v3, v3, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->o:Lcom/qihoo/security/locale/d;

    const v4, 0x7f0c00ba

    new-array v5, v6, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v5, v2

    invoke-virtual {v3, v4, v5}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(Ljava/lang/CharSequence;)V

    .line 219
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->d(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Lcom/qihoo/security/opti/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/a/c;->d()V

    .line 221
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->e(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$a;->notifyDataSetChanged()V

    .line 222
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->j(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setSelection(I)V

    .line 223
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->f(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)V

    .line 224
    iget-object v0, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v0, v6}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->c(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;Z)Z

    goto/16 :goto_0

    .line 208
    :cond_5
    const/16 v0, 0x2c32

    iget-object v3, p0, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity$2;->a:Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;

    invoke-static {v3}, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;->a(Lcom/qihoo/security/ui/opti/sysclear/ProcessClearWhiteListActivity;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v0, v3}, Lcom/qihoo/security/support/b;->b(II)V

    goto :goto_2

    .line 226
    :cond_6
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c00bb

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto/16 :goto_0
.end method
