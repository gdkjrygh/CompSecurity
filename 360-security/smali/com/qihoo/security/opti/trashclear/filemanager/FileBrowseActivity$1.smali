.class Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)V
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 116
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 162
    :cond_0
    :goto_0
    return-void

    .line 119
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->a(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 120
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 159
    :goto_1
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->i(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->c(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 160
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->a(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 122
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->b(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)V

    goto :goto_1

    .line 125
    :pswitch_2
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    .line 126
    if-eqz v0, :cond_2

    .line 127
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->c(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 128
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v3}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->c(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 129
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    iget-object v4, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v4}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->d(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Ljava/util/Comparator;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->a(Ljava/util/Comparator;)V

    .line 130
    iget-object v3, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_3

    move v0, v1

    :goto_2
    invoke-static {v3, v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->a(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;Z)V

    .line 131
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->e(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->notifyDataSetChanged()V

    .line 133
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->f(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setEnabled(Z)V

    goto :goto_1

    :cond_3
    move v0, v2

    .line 130
    goto :goto_2

    .line 136
    :pswitch_3
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->g(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Lcom/qihoo/security/dialog/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/g;->dismiss()V

    .line 137
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->h(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Lcom/qihoo/security/opti/trashclear/filemanager/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->c()V

    goto :goto_1

    .line 143
    :pswitch_4
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->h(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Lcom/qihoo/security/opti/trashclear/filemanager/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/a;->d()Ljava/lang/String;

    move-result-object v3

    .line 144
    if-eqz v3, :cond_6

    move v1, v2

    .line 145
    :goto_3
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->c(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_6

    .line 146
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->c(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;

    .line 147
    iget-boolean v4, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->d:Z

    if-eqz v4, :cond_5

    .line 145
    :cond_4
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    .line 150
    :cond_5
    iget-object v0, v0, Lcom/qihoo/security/opti/trashclear/filemanager/d;->b:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 151
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->f(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Landroid/widget/ListView;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 156
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$1;->a:Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;

    invoke-static {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;->e(Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity;)Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/opti/trashclear/filemanager/FileBrowseActivity$a;->notifyDataSetChanged()V

    goto/16 :goto_1

    .line 120
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method
