.class public abstract Lcom/kik/view/adapters/b;
.super Lcom/kik/view/adapters/ay;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/b$a;
    }
.end annotation


# instance fields
.field protected final a:Lkik/android/chat/b/d;


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/android/chat/b/d;Lcom/kik/e/a;)V
    .locals 10

    .prologue
    .line 33
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p6

    move-object v7, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p9

    invoke-direct/range {v1 .. v9}, Lcom/kik/view/adapters/ay;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/android/a;Lcom/kik/cache/ad;Lkik/a/e/n;Lcom/kik/e/a;)V

    .line 34
    move-object/from16 v0, p8

    iput-object v0, p0, Lcom/kik/view/adapters/b;->a:Lkik/android/chat/b/d;

    .line 35
    return-void
.end method


# virtual methods
.method public a(Lcom/kik/view/adapters/ar$b;Lkik/a/d/s;ZLandroid/content/Context;Lcom/kik/view/adapters/au$b;)V
    .locals 7

    .prologue
    const/16 v6, 0xb

    const/16 v5, 0x9

    const/4 v3, -0x1

    const/4 v4, 0x0

    .line 40
    invoke-super/range {p0 .. p5}, Lcom/kik/view/adapters/ay;->a(Lcom/kik/view/adapters/ar$b;Lkik/a/d/s;ZLandroid/content/Context;Lcom/kik/view/adapters/au$b;)V

    move-object v0, p1

    .line 41
    check-cast v0, Lcom/kik/view/adapters/b$a;

    if-eqz v0, :cond_0

    if-nez p2, :cond_1

    .line 43
    :cond_0
    :goto_0
    check-cast p1, Lcom/kik/view/adapters/b$a;

    .line 45
    iget-object v0, p1, Lcom/kik/view/adapters/b$a;->a:Landroid/view/View;

    new-instance v1, Lcom/kik/view/adapters/c;

    invoke-direct {v1, p0, p5, p1}, Lcom/kik/view/adapters/c;-><init>(Lcom/kik/view/adapters/b;Lcom/kik/view/adapters/au$b;Lcom/kik/view/adapters/b$a;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
    iget-object v0, p1, Lcom/kik/view/adapters/b$a;->a:Landroid/view/View;

    new-instance v1, Lcom/kik/view/adapters/d;

    invoke-direct {v1, p0}, Lcom/kik/view/adapters/d;-><init>(Lcom/kik/view/adapters/b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    .line 63
    return-void

    .line 41
    :cond_1
    iget-object v1, v0, Lcom/kik/view/adapters/b$a;->a:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p2}, Lkik/a/d/s;->d()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1, v6, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-virtual {v1, v5, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    iget-object v0, v0, Lcom/kik/view/adapters/b$a;->a:Landroid/view/View;

    iget-object v2, p0, Lcom/kik/view/adapters/b;->a:Lkik/android/chat/b/d;

    invoke-virtual {v2}, Lkik/android/chat/b/d;->c()Lkik/android/chat/b/b;

    move-result-object v2

    const v3, 0x7f0201fb

    invoke-static {v0, v2, v3}, Lkik/android/chat/b/c;->a(Landroid/view/View;Lkik/android/chat/b/b;I)V

    const/16 v0, 0x2d

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iget v2, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    const/4 v3, 0x3

    invoke-static {v3}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v3

    iget v4, v1, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v1, v0, v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v6, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    invoke-virtual {v1, v5, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    iget-object v0, v0, Lcom/kik/view/adapters/b$a;->a:Landroid/view/View;

    iget-object v2, p0, Lcom/kik/view/adapters/b;->a:Lkik/android/chat/b/d;

    invoke-virtual {v2}, Lkik/android/chat/b/d;->e()Lkik/android/chat/b/b;

    move-result-object v2

    const v3, 0x7f0201ab

    invoke-static {v0, v2, v3}, Lkik/android/chat/b/c;->a(Landroid/view/View;Lkik/android/chat/b/b;I)V

    const/16 v0, 0x34

    invoke-static {v0}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v0

    iget v2, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    iget v3, v1, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v1, v0, v2, v4, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    goto :goto_0
.end method
