.class public final Lkik/android/util/aj;
.super Lkik/android/util/ab;
.source "SourceFile"


# instance fields
.field private e:Lkik/android/chat/fragment/as;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/kik/cache/ad;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0, p1, p2}, Lkik/android/util/ab;-><init>(Landroid/content/Context;Lcom/kik/cache/ad;)V

    .line 21
    return-void
.end method


# virtual methods
.method public final a(ZLkik/a/d/m;Landroid/widget/ListView;)V
    .locals 4

    .prologue
    .line 31
    invoke-virtual {p0}, Lkik/android/util/aj;->a()I

    move-result v0

    .line 32
    invoke-virtual {p0, v0}, Lkik/android/util/aj;->a(I)I

    move-result v1

    .line 34
    iget-object v2, p0, Lkik/android/util/aj;->e:Lkik/android/chat/fragment/as;

    if-eqz v2, :cond_0

    invoke-virtual {p3}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v2

    if-eqz v2, :cond_0

    if-eqz p1, :cond_1

    .line 35
    :cond_0
    new-instance v2, Lkik/android/chat/fragment/as;

    iget-object v3, p0, Lkik/android/util/aj;->d:Lcom/kik/cache/ad;

    invoke-direct {v2, p2, v3, v0, v1}, Lkik/android/chat/fragment/as;-><init>(Lkik/a/d/m;Lcom/kik/cache/ad;II)V

    iput-object v2, p0, Lkik/android/util/aj;->e:Lkik/android/chat/fragment/as;

    .line 36
    iget-object v0, p0, Lkik/android/util/aj;->e:Lkik/android/chat/fragment/as;

    invoke-virtual {p3, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 41
    :goto_0
    return-void

    .line 39
    :cond_1
    iget-object v2, p0, Lkik/android/util/aj;->e:Lkik/android/chat/fragment/as;

    invoke-virtual {v2, p2, v0, v1}, Lkik/android/chat/fragment/as;->a(Lkik/a/d/m;II)V

    goto :goto_0
.end method
