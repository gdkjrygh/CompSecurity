.class public Lcom/kik/view/adapters/j;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/j$a;
    }
.end annotation


# instance fields
.field protected a:Ljava/util/ArrayList;

.field protected final b:Lcom/kik/cache/ad;

.field protected final c:Lcom/kik/android/a;

.field private final d:Landroid/view/LayoutInflater;

.field private final e:Lkik/a/e/r;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;Lcom/kik/cache/ad;Lkik/a/e/r;Lcom/kik/android/a;)V
    .locals 1

    .prologue
    .line 34
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 35
    iput-object p2, p0, Lcom/kik/view/adapters/j;->a:Ljava/util/ArrayList;

    .line 36
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/view/adapters/j;->d:Landroid/view/LayoutInflater;

    .line 37
    iput-object p3, p0, Lcom/kik/view/adapters/j;->b:Lcom/kik/cache/ad;

    .line 38
    iput-object p5, p0, Lcom/kik/view/adapters/j;->c:Lcom/kik/android/a;

    .line 39
    iput-object p4, p0, Lcom/kik/view/adapters/j;->e:Lkik/a/e/r;

    .line 40
    return-void
.end method


# virtual methods
.method protected a(Lcom/kik/view/adapters/j$a;Lkik/a/d/k;)V
    .locals 2

    .prologue
    .line 93
    invoke-virtual {p2}, Lkik/a/d/k;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/kik/view/adapters/j;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f090202

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 94
    :goto_0
    iget-object v1, p1, Lcom/kik/view/adapters/j$a;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    return-void

    .line 93
    :cond_0
    invoke-virtual {p2}, Lkik/a/d/k;->e()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 51
    iget-object v0, p0, Lcom/kik/view/adapters/j;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkik/a/d/k;

    .line 52
    if-nez p2, :cond_0

    .line 53
    iget-object v0, p0, Lcom/kik/view/adapters/j;->d:Landroid/view/LayoutInflater;

    const v2, 0x7f03006e

    invoke-virtual {v0, v2, p3, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 54
    new-instance v2, Lcom/kik/view/adapters/j$a;

    invoke-direct {v2, p0}, Lcom/kik/view/adapters/j$a;-><init>(Lcom/kik/view/adapters/j;)V

    .line 56
    const v0, 0x7f0e0167

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kik/cache/ContactImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/j$a;->b:Lcom/kik/cache/ContactImageView;

    .line 57
    const v0, 0x7f0e0168

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v2, Lcom/kik/view/adapters/j$a;->c:Landroid/widget/ImageView;

    .line 58
    const v0, 0x7f0e016a

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/kik/view/adapters/j$a;->d:Landroid/widget/TextView;

    .line 59
    const v0, 0x7f0e016b

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v2, Lcom/kik/view/adapters/j$a;->e:Landroid/widget/TextView;

    .line 61
    invoke-virtual {p2, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object v6, v2

    .line 66
    :goto_0
    invoke-virtual {v1}, Lkik/a/d/k;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/kik/view/adapters/j;->getContext()Landroid/content/Context;

    move-result-object v0

    const v2, 0x7f090202

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 68
    :goto_1
    invoke-virtual {p0, v6, v1}, Lcom/kik/view/adapters/j;->a(Lcom/kik/view/adapters/j$a;Lkik/a/d/k;)V

    .line 69
    invoke-virtual {v1}, Lkik/a/d/k;->a()Lkik/a/d/j;

    move-result-object v2

    invoke-virtual {v2}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v6, Lcom/kik/view/adapters/j$a;->a:Ljava/lang/String;

    .line 70
    iget-object v2, v6, Lcom/kik/view/adapters/j$a;->d:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    iget-object v0, v6, Lcom/kik/view/adapters/j$a;->b:Lcom/kik/cache/ContactImageView;

    iget-object v2, p0, Lcom/kik/view/adapters/j;->b:Lcom/kik/cache/ad;

    iget-object v4, p0, Lcom/kik/view/adapters/j;->e:Lkik/a/e/r;

    iget-object v5, p0, Lcom/kik/view/adapters/j;->c:Lcom/kik/android/a;

    invoke-virtual/range {v0 .. v5}, Lcom/kik/cache/ContactImageView;->a(Lkik/a/d/k;Lcom/kik/cache/ad;ZLkik/a/e/r;Lcom/kik/android/a;)V

    .line 73
    iget-object v0, v6, Lcom/kik/view/adapters/j$a;->c:Landroid/widget/ImageView;

    invoke-virtual {v1}, Lkik/a/d/k;->i()Z

    move-result v1

    if-eqz v1, :cond_2

    :goto_2
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 75
    iget-object v0, v6, Lcom/kik/view/adapters/j$a;->e:Landroid/widget/TextView;

    const-string v1, "AUTOMATION_CONTACT_USERNAME"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 76
    iget-object v0, v6, Lcom/kik/view/adapters/j$a;->d:Landroid/widget/TextView;

    const-string v1, "AUTOMATION_CONTACT_DISPLAY_NAME"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 78
    return-object p2

    .line 64
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/j$a;

    move-object v6, v0

    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {v1}, Lkik/a/d/k;->c()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 73
    :cond_2
    const/16 v3, 0x8

    goto :goto_2
.end method
