.class final Lcom/kik/cards/web/h;
.super Lcom/kik/g/r;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/kik/cards/web/g;


# direct methods
.method constructor <init>(Lcom/kik/cards/web/g;)V
    .locals 0

    .prologue
    .line 490
    iput-object p1, p0, Lcom/kik/cards/web/h;->a:Lcom/kik/cards/web/g;

    invoke-direct {p0}, Lcom/kik/g/r;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 21

    .prologue
    .line 490
    check-cast p1, Lcom/kik/cards/web/av$a;

    new-instance v1, Lcom/kik/cards/web/kik/KikMessageParcelable;

    invoke-virtual/range {p1 .. p1}, Lcom/kik/cards/web/av$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/kik/cards/web/av$a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/kik/cards/web/av$a;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/kik/cards/web/av$a;->g()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {p1 .. p1}, Lcom/kik/cards/web/av$a;->d()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/kik/cards/web/av$a;->f()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/kik/cards/web/av$a;->e()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/kik/cards/web/av$a;->g()Ljava/lang/String;

    move-result-object v11

    const-string v12, "true"

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v1 .. v20}, Lcom/kik/cards/web/kik/KikMessageParcelable;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/cards/web/h;->a:Lcom/kik/cards/web/g;

    iget-object v2, v2, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v2, v2, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    iget-object v2, v2, Lcom/kik/cards/web/CardsWebViewFragment;->r:Lcom/kik/cards/web/picker/PickerRequest;

    if-eqz v2, :cond_0

    const-string v2, "https://kik.com/"

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/cards/web/h;->a:Lcom/kik/cards/web/g;

    iget-object v3, v3, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v3, v3, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-static {v3}, Lcom/kik/cards/web/CardsWebViewFragment;->o(Lcom/kik/cards/web/CardsWebViewFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/kik/cards/web/h;->a:Lcom/kik/cards/web/g;

    iget-object v2, v2, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v2, v2, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v2}, Lcom/kik/cards/web/CardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/cards/web/h;->a:Lcom/kik/cards/web/g;

    iget-object v3, v3, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v3, v3, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    iget-object v3, v3, Lcom/kik/cards/web/CardsWebViewFragment;->p:Lcom/kik/cache/ad;

    invoke-static {v2, v1, v3}, Lkik/android/f/a/ae;->a(Landroid/app/Activity;Lcom/kik/cards/web/kik/KikMessageParcelable;Lcom/kik/cache/ad;)Lcom/kik/g/p;

    move-result-object v1

    new-instance v2, Lcom/kik/cards/web/i;

    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Lcom/kik/cards/web/i;-><init>(Lcom/kik/cards/web/h;)V

    invoke-virtual {v1, v2}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    :goto_0
    return-void

    :cond_0
    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/kik/cards/web/h;->a:Lcom/kik/cards/web/g;

    iget-object v3, v3, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v3, v3, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/kik/cards/web/h;->a:Lcom/kik/cards/web/g;

    iget-object v4, v4, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v4, v4, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v4}, Lcom/kik/cards/web/CardsWebViewFragment;->w()I

    move-result v4

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/kik/cards/web/h;->a:Lcom/kik/cards/web/g;

    iget-object v5, v5, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v5, v5, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    iget-object v5, v5, Lcom/kik/cards/web/CardsWebViewFragment;->g:Lkik/a/e/r;

    invoke-virtual {v2, v1, v3, v4, v5}, Lkik/android/f/a/f;->a(Lcom/kik/cards/web/kik/KikMessageParcelable;Landroid/support/v4/app/Fragment;ILkik/a/e/r;)Lcom/kik/g/p;

    goto :goto_0
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 530
    iget-object v0, p0, Lcom/kik/cards/web/h;->a:Lcom/kik/cards/web/g;

    iget-object v0, v0, Lcom/kik/cards/web/g;->a:Lcom/kik/cards/web/f;

    iget-object v0, v0, Lcom/kik/cards/web/f;->a:Lcom/kik/cards/web/CardsWebViewFragment;

    invoke-virtual {v0}, Lcom/kik/cards/web/CardsWebViewFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const v1, 0x7f090266

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 531
    return-void
.end method
