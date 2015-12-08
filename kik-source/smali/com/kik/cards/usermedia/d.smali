.class final Lcom/kik/cards/usermedia/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/kik/cards/usermedia/CustomGalleryActivity;


# direct methods
.method constructor <init>(Lcom/kik/cards/usermedia/CustomGalleryActivity;)V
    .locals 0

    .prologue
    .line 168
    iput-object p1, p0, Lcom/kik/cards/usermedia/d;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v0, 0x0

    .line 172
    iget-object v1, p0, Lcom/kik/cards/usermedia/d;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v1}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->a(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    iget-object v2, p0, Lcom/kik/cards/usermedia/d;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v2}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->b(Lcom/kik/cards/usermedia/CustomGalleryActivity;)I

    move-result v2

    if-lt v1, v2, :cond_1

    .line 173
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 174
    new-instance v3, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/kik/cards/usermedia/d;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v1}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->a(Lcom/kik/cards/usermedia/CustomGalleryActivity;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 175
    new-instance v1, Lcom/kik/cards/usermedia/CustomGalleryActivity$c;

    iget-object v4, p0, Lcom/kik/cards/usermedia/d;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-direct {v1, v4, v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity$c;-><init>(Lcom/kik/cards/usermedia/CustomGalleryActivity;B)V

    invoke-static {v3, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 176
    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    move v1, v0

    .line 178
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 179
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/cards/usermedia/CustomGalleryActivity$d;

    invoke-virtual {v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity$d;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v1, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 178
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 182
    :cond_0
    const-string v0, "CustomGalleryActivity.EXTRA_RESULTS"

    invoke-virtual {v2, v0, v4}, Landroid/content/Intent;->putStringArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 184
    iget-object v0, p0, Lcom/kik/cards/usermedia/d;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    const/4 v1, -0x1

    invoke-virtual {v0, v1, v2}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->setResult(ILandroid/content/Intent;)V

    .line 185
    iget-object v0, p0, Lcom/kik/cards/usermedia/d;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-virtual {v0}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->finish()V

    .line 193
    :goto_1
    return-void

    .line 188
    :cond_1
    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/kik/cards/usermedia/d;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f090307

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    iget-object v2, p0, Lcom/kik/cards/usermedia/d;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v2}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->b(Lcom/kik/cards/usermedia/CustomGalleryActivity;)I

    move-result v2

    if-ne v2, v4, :cond_2

    iget-object v0, p0, Lcom/kik/cards/usermedia/d;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    const v2, 0x7f0900c2

    invoke-virtual {v0, v2}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v1, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f090193

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/kik/cards/usermedia/d;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    const v3, 0x7f0900c3

    invoke-virtual {v2, v3}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-array v3, v4, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/kik/cards/usermedia/d;->a:Lcom/kik/cards/usermedia/CustomGalleryActivity;

    invoke-static {v4}, Lcom/kik/cards/usermedia/CustomGalleryActivity;->b(Lcom/kik/cards/usermedia/CustomGalleryActivity;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2
.end method
