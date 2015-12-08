.class public final Lkik/android/util/ap;
.super Lkik/android/util/ab;
.source "SourceFile"


# instance fields
.field private e:Lkik/android/chat/fragment/at;

.field private f:Lkik/a/e/w;

.field private g:Lkik/a/e/r;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/kik/cache/ad;Lkik/a/e/w;Lkik/a/e/r;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0, p1, p2}, Lkik/android/util/ab;-><init>(Landroid/content/Context;Lcom/kik/cache/ad;)V

    .line 30
    iput-object p3, p0, Lkik/android/util/ap;->f:Lkik/a/e/w;

    .line 31
    iput-object p4, p0, Lkik/android/util/ap;->g:Lkik/a/e/r;

    .line 32
    return-void
.end method


# virtual methods
.method public final a(ZLkik/a/d/k;Ljava/util/List;ZLandroid/widget/ListView;Lkik/android/util/ao;Lcom/kik/android/a;)V
    .locals 12

    .prologue
    .line 45
    invoke-virtual {p0}, Lkik/android/util/ap;->a()I

    move-result v7

    .line 46
    invoke-virtual {p0, v7}, Lkik/android/util/ap;->a(I)I

    move-result v8

    .line 48
    iget-object v1, p0, Lkik/android/util/ap;->e:Lkik/android/chat/fragment/at;

    if-eqz v1, :cond_0

    invoke-virtual/range {p5 .. p5}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v1

    if-eqz v1, :cond_0

    if-eqz p1, :cond_1

    .line 49
    :cond_0
    new-instance v1, Lkik/android/chat/fragment/at;

    iget-object v4, p0, Lkik/android/util/ap;->f:Lkik/a/e/w;

    iget-object v5, p0, Lkik/android/util/ap;->d:Lcom/kik/cache/ad;

    iget-object v10, p0, Lkik/android/util/ap;->g:Lkik/a/e/r;

    move-object v2, p2

    move-object v3, p3

    move-object/from16 v6, p6

    move/from16 v9, p4

    move-object/from16 v11, p7

    invoke-direct/range {v1 .. v11}, Lkik/android/chat/fragment/at;-><init>(Lkik/a/d/k;Ljava/util/List;Lkik/a/e/w;Lcom/kik/cache/ad;Lkik/android/util/ao;IIZLkik/a/e/r;Lcom/kik/android/a;)V

    iput-object v1, p0, Lkik/android/util/ap;->e:Lkik/android/chat/fragment/at;

    .line 50
    iget-object v1, p0, Lkik/android/util/ap;->e:Lkik/android/chat/fragment/at;

    move-object/from16 v0, p5

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 55
    :goto_0
    return-void

    .line 53
    :cond_1
    iget-object v1, p0, Lkik/android/util/ap;->e:Lkik/android/chat/fragment/at;

    move/from16 v0, p4

    invoke-virtual {v1, p3, v7, v8, v0}, Lkik/android/chat/fragment/at;->a(Ljava/util/List;IIZ)V

    goto :goto_0
.end method
