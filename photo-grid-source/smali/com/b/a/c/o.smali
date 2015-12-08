.class final Lcom/b/a/c/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/b/a/c/t;

.field final synthetic c:Lcom/b/a/c/at;

.field final synthetic d:La/a/a/a/a/g/o;

.field final synthetic e:Lcom/b/a/c/h;


# direct methods
.method constructor <init>(Lcom/b/a/c/h;Landroid/app/Activity;Lcom/b/a/c/t;Lcom/b/a/c/at;La/a/a/a/a/g/o;)V
    .locals 0

    .prologue
    .line 947
    iput-object p1, p0, Lcom/b/a/c/o;->e:Lcom/b/a/c/h;

    iput-object p2, p0, Lcom/b/a/c/o;->a:Landroid/app/Activity;

    iput-object p3, p0, Lcom/b/a/c/o;->b:Lcom/b/a/c/t;

    iput-object p4, p0, Lcom/b/a/c/o;->c:Lcom/b/a/c/at;

    iput-object p5, p0, Lcom/b/a/c/o;->d:La/a/a/a/a/g/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .prologue
    const/4 v9, 0x0

    .line 950
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/b/a/c/o;->a:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 952
    new-instance v1, Lcom/b/a/c/p;

    invoke-direct {v1, p0}, Lcom/b/a/c/p;-><init>(Lcom/b/a/c/o;)V

    .line 960
    iget-object v2, p0, Lcom/b/a/c/o;->a:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 964
    const/4 v3, 0x5

    invoke-static {v2, v3}, Lcom/b/a/c/h;->a(FI)I

    move-result v3

    .line 966
    new-instance v4, Landroid/widget/TextView;

    iget-object v5, p0, Lcom/b/a/c/o;->a:Landroid/app/Activity;

    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 967
    const/16 v5, 0xf

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setAutoLinkMask(I)V

    .line 968
    iget-object v5, p0, Lcom/b/a/c/o;->c:Lcom/b/a/c/at;

    invoke-virtual {v5}, Lcom/b/a/c/at;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 969
    iget-object v5, p0, Lcom/b/a/c/o;->a:Landroid/app/Activity;

    const v6, 0x1030044

    invoke-virtual {v4, v5, v6}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 970
    invoke-virtual {v4, v3, v3, v3, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 972
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setFocusable(Z)V

    .line 974
    new-instance v3, Landroid/widget/ScrollView;

    iget-object v5, p0, Lcom/b/a/c/o;->a:Landroid/app/Activity;

    invoke-direct {v3, v5}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 975
    const/16 v5, 0xe

    invoke-static {v2, v5}, Lcom/b/a/c/h;->a(FI)I

    move-result v5

    const/4 v6, 0x2

    invoke-static {v2, v6}, Lcom/b/a/c/h;->a(FI)I

    move-result v6

    const/16 v7, 0xa

    invoke-static {v2, v7}, Lcom/b/a/c/h;->a(FI)I

    move-result v7

    const/16 v8, 0xc

    invoke-static {v2, v8}, Lcom/b/a/c/h;->a(FI)I

    move-result v2

    invoke-virtual {v3, v5, v6, v7, v2}, Landroid/widget/ScrollView;->setPadding(IIII)V

    .line 977
    invoke-virtual {v3, v4}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 981
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    iget-object v3, p0, Lcom/b/a/c/o;->c:Lcom/b/a/c/at;

    invoke-virtual {v3}, Lcom/b/a/c/at;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    iget-object v3, p0, Lcom/b/a/c/o;->c:Lcom/b/a/c/at;

    invoke-virtual {v3}, Lcom/b/a/c/at;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 984
    iget-object v1, p0, Lcom/b/a/c/o;->d:La/a/a/a/a/g/o;

    iget-boolean v1, v1, La/a/a/a/a/g/o;->d:Z

    if-eqz v1, :cond_0

    .line 985
    new-instance v1, Lcom/b/a/c/q;

    invoke-direct {v1, p0}, Lcom/b/a/c/q;-><init>(Lcom/b/a/c/o;)V

    .line 992
    iget-object v2, p0, Lcom/b/a/c/o;->c:Lcom/b/a/c/at;

    invoke-virtual {v2}, Lcom/b/a/c/at;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 996
    :cond_0
    iget-object v1, p0, Lcom/b/a/c/o;->d:La/a/a/a/a/g/o;

    iget-boolean v1, v1, La/a/a/a/a/g/o;->f:Z

    if-eqz v1, :cond_1

    .line 997
    new-instance v1, Lcom/b/a/c/r;

    invoke-direct {v1, p0}, Lcom/b/a/c/r;-><init>(Lcom/b/a/c/o;)V

    .line 1005
    iget-object v2, p0, Lcom/b/a/c/o;->c:Lcom/b/a/c/at;

    invoke-virtual {v2}, Lcom/b/a/c/at;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1009
    :cond_1
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1010
    return-void
.end method
