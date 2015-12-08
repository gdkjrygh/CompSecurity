.class final Lcom/a/a/c/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/a/a/c/g$a;

.field final synthetic c:Lcom/a/a/c/ap;

.field final synthetic d:Lb/a/a/a/a/g/o;

.field final synthetic e:Lcom/a/a/c/g;


# direct methods
.method constructor <init>(Lcom/a/a/c/g;Landroid/app/Activity;Lcom/a/a/c/g$a;Lcom/a/a/c/ap;Lb/a/a/a/a/g/o;)V
    .locals 0

    .prologue
    .line 942
    iput-object p1, p0, Lcom/a/a/c/n;->e:Lcom/a/a/c/g;

    iput-object p2, p0, Lcom/a/a/c/n;->a:Landroid/app/Activity;

    iput-object p3, p0, Lcom/a/a/c/n;->b:Lcom/a/a/c/g$a;

    iput-object p4, p0, Lcom/a/a/c/n;->c:Lcom/a/a/c/ap;

    iput-object p5, p0, Lcom/a/a/c/n;->d:Lb/a/a/a/a/g/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .prologue
    const/4 v9, 0x0

    .line 945
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/a/a/c/n;->a:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 947
    new-instance v1, Lcom/a/a/c/o;

    invoke-direct {v1, p0}, Lcom/a/a/c/o;-><init>(Lcom/a/a/c/n;)V

    .line 955
    iget-object v2, p0, Lcom/a/a/c/n;->a:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 959
    const/4 v3, 0x5

    invoke-static {v2, v3}, Lcom/a/a/c/g;->a(FI)I

    move-result v3

    .line 961
    new-instance v4, Landroid/widget/TextView;

    iget-object v5, p0, Lcom/a/a/c/n;->a:Landroid/app/Activity;

    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 962
    const/16 v5, 0xf

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setAutoLinkMask(I)V

    .line 963
    iget-object v5, p0, Lcom/a/a/c/n;->c:Lcom/a/a/c/ap;

    invoke-virtual {v5}, Lcom/a/a/c/ap;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 964
    iget-object v5, p0, Lcom/a/a/c/n;->a:Landroid/app/Activity;

    const v6, 0x1030044

    invoke-virtual {v4, v5, v6}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 965
    invoke-virtual {v4, v3, v3, v3, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 967
    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setFocusable(Z)V

    .line 969
    new-instance v3, Landroid/widget/ScrollView;

    iget-object v5, p0, Lcom/a/a/c/n;->a:Landroid/app/Activity;

    invoke-direct {v3, v5}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    .line 970
    const/16 v5, 0xe

    invoke-static {v2, v5}, Lcom/a/a/c/g;->a(FI)I

    move-result v5

    const/4 v6, 0x2

    invoke-static {v2, v6}, Lcom/a/a/c/g;->a(FI)I

    move-result v6

    const/16 v7, 0xa

    invoke-static {v2, v7}, Lcom/a/a/c/g;->a(FI)I

    move-result v7

    const/16 v8, 0xc

    invoke-static {v2, v8}, Lcom/a/a/c/g;->a(FI)I

    move-result v2

    invoke-virtual {v3, v5, v6, v7, v2}, Landroid/widget/ScrollView;->setPadding(IIII)V

    .line 972
    invoke-virtual {v3, v4}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    .line 976
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    iget-object v3, p0, Lcom/a/a/c/n;->c:Lcom/a/a/c/ap;

    invoke-virtual {v3}, Lcom/a/a/c/ap;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    iget-object v3, p0, Lcom/a/a/c/n;->c:Lcom/a/a/c/ap;

    invoke-virtual {v3}, Lcom/a/a/c/ap;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 979
    iget-object v1, p0, Lcom/a/a/c/n;->d:Lb/a/a/a/a/g/o;

    iget-boolean v1, v1, Lb/a/a/a/a/g/o;->d:Z

    if-eqz v1, :cond_0

    .line 980
    new-instance v1, Lcom/a/a/c/p;

    invoke-direct {v1, p0}, Lcom/a/a/c/p;-><init>(Lcom/a/a/c/n;)V

    .line 987
    iget-object v2, p0, Lcom/a/a/c/n;->c:Lcom/a/a/c/ap;

    invoke-virtual {v2}, Lcom/a/a/c/ap;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 991
    :cond_0
    iget-object v1, p0, Lcom/a/a/c/n;->d:Lb/a/a/a/a/g/o;

    iget-boolean v1, v1, Lb/a/a/a/a/g/o;->f:Z

    if-eqz v1, :cond_1

    .line 992
    new-instance v1, Lcom/a/a/c/q;

    invoke-direct {v1, p0}, Lcom/a/a/c/q;-><init>(Lcom/a/a/c/n;)V

    .line 1000
    iget-object v2, p0, Lcom/a/a/c/n;->c:Lcom/a/a/c/ap;

    invoke-virtual {v2}, Lcom/a/a/c/ap;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 1004
    :cond_1
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 1005
    return-void
.end method
