.class public final Lcom/kik/view/adapters/az;
.super Lcom/kik/view/adapters/e;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Lkik/android/util/bw$a;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/android/chat/b/d;Lcom/kik/e/a;)V
    .locals 12

    .prologue
    .line 23
    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v11}, Lcom/kik/view/adapters/e;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Lkik/android/util/bw$a;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lkik/android/e/f;Lcom/kik/android/a;Lkik/a/e/n;Lkik/android/chat/b/d;Lcom/kik/e/a;)V

    .line 24
    return-void
.end method


# virtual methods
.method protected final a(Lkik/a/d/s;Lcom/kik/view/adapters/ar$b;)V
    .locals 2

    .prologue
    .line 29
    invoke-super {p0, p1, p2}, Lcom/kik/view/adapters/e;->a(Lkik/a/d/s;Lcom/kik/view/adapters/ar$b;)V

    .line 31
    check-cast p2, Lcom/kik/view/adapters/e$a;

    .line 33
    iget-object v0, p2, Lcom/kik/view/adapters/e$a;->b:Landroid/widget/TextView;

    const v1, 0x7f090056

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 34
    return-void
.end method
