.class public abstract Lcom/kik/view/adapters/ar;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/ar$b;,
        Lcom/kik/view/adapters/ar$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/view/View$OnClickListener;

.field protected e:Lcom/kik/android/a;

.field protected f:Lkik/a/e/r;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected g:Lkik/a/e/v;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected h:Lcom/kik/l/ab;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected i:Lkik/a/e/i;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected j:Lkik/a/e/t;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected final k:Landroid/view/LayoutInflater;

.field protected final l:Landroid/content/Context;

.field protected final m:Lcom/kik/view/adapters/ar$a;

.field protected final n:Lkik/a/e/n;


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/android/a;Lkik/a/e/n;Lcom/kik/e/a;)V
    .locals 2

    .prologue
    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p4, p0, Lcom/kik/view/adapters/ar;->m:Lcom/kik/view/adapters/ar$a;

    .line 84
    iput-object p5, p0, Lcom/kik/view/adapters/ar;->e:Lcom/kik/android/a;

    .line 85
    iput-object p6, p0, Lcom/kik/view/adapters/ar;->n:Lkik/a/e/n;

    .line 87
    invoke-interface {p7, p0}, Lcom/kik/e/a;->a(Lcom/kik/view/adapters/ar;)V

    .line 89
    invoke-static {}, Lkik/android/util/DeviceUtils;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 91
    iget-object v0, p0, Lcom/kik/view/adapters/ar;->e:Lcom/kik/android/a;

    if-nez v0, :cond_0

    .line 92
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "MessageViewBinder must not have a null mixpanel"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 94
    :cond_0
    iget-object v0, p0, Lcom/kik/view/adapters/ar;->m:Lcom/kik/view/adapters/ar$a;

    if-nez v0, :cond_1

    .line 95
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "MessageViewBinder must have a contact provider"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 98
    :cond_1
    iput-object p1, p0, Lcom/kik/view/adapters/ar;->k:Landroid/view/LayoutInflater;

    .line 99
    iput-object p2, p0, Lcom/kik/view/adapters/ar;->l:Landroid/content/Context;

    .line 100
    iput-object p3, p0, Lcom/kik/view/adapters/ar;->a:Landroid/view/View$OnClickListener;

    .line 101
    return-void
.end method


# virtual methods
.method public final a(ILandroid/view/View;Landroid/view/ViewGroup;Lkik/a/d/s;ZLcom/kik/view/adapters/au$b;)Landroid/view/View;
    .locals 6

    .prologue
    .line 105
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/view/adapters/ar$b;

    invoke-virtual {p0, v0}, Lcom/kik/view/adapters/ar;->a(Lcom/kik/view/adapters/ar$b;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 111
    :cond_0
    invoke-virtual {p0, p3}, Lcom/kik/view/adapters/ar;->a(Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 114
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/view/adapters/ar$b;

    .line 116
    iput p1, v1, Lcom/kik/view/adapters/ar$b;->n:I

    .line 117
    iget-object v4, p0, Lcom/kik/view/adapters/ar;->l:Landroid/content/Context;

    move-object v0, p0

    move-object v2, p4

    move v3, p5

    move-object v5, p6

    invoke-virtual/range {v0 .. v5}, Lcom/kik/view/adapters/ar;->a(Lcom/kik/view/adapters/ar$b;Lkik/a/d/s;ZLandroid/content/Context;Lcom/kik/view/adapters/au$b;)V

    .line 118
    invoke-virtual {p0, p4, v1}, Lcom/kik/view/adapters/ar;->a(Lkik/a/d/s;Lcom/kik/view/adapters/ar$b;)V

    .line 120
    return-object p2
.end method

.method protected abstract a(Landroid/view/ViewGroup;)Landroid/view/View;
.end method

.method public a(I)V
    .locals 0

    .prologue
    .line 144
    return-void
.end method

.method public a(Lcom/kik/view/adapters/ar$b;Lkik/a/d/s;ZLandroid/content/Context;Lcom/kik/view/adapters/au$b;)V
    .locals 7

    .prologue
    const/4 v2, 0x1

    const/4 v6, 0x0

    .line 125
    iget-object v0, p1, Lcom/kik/view/adapters/ar$b;->p:Lcom/kik/cache/ContactImageView;

    iget-object v1, p0, Lcom/kik/view/adapters/ar;->a:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/kik/cache/ContactImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 126
    iget-object v0, p1, Lcom/kik/view/adapters/ar$b;->r:Landroid/view/View;

    new-instance v1, Lcom/kik/view/adapters/as;

    invoke-direct {v1, p0, p5}, Lcom/kik/view/adapters/as;-><init>(Lcom/kik/view/adapters/ar;Lcom/kik/view/adapters/au$b;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 133
    if-eqz p3, :cond_1

    iget-object v0, p1, Lcom/kik/view/adapters/ar$b;->o:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    new-array v0, v2, [Landroid/view/View;

    iget-object v1, p1, Lcom/kik/view/adapters/ar$b;->o:Landroid/widget/TextView;

    aput-object v1, v0, v6

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    invoke-virtual {p2}, Lkik/a/d/s;->e()J

    move-result-wide v0

    invoke-static {v0, v1, v6}, Lkik/android/util/cq;->a(JZ)Lkik/android/util/cq$a;

    move-result-object v1

    iget-object v0, p1, Lcom/kik/view/adapters/ar$b;->o:Landroid/widget/TextView;

    iget-object v2, v1, Lkik/android/util/cq$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p1, Lcom/kik/view/adapters/ar$b;->o:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Landroid/text/Spannable;

    iget v2, v1, Lkik/android/util/cq$a;->b:I

    if-lez v2, :cond_0

    new-instance v2, Landroid/text/style/ForegroundColorSpan;

    const/16 v3, 0x95

    const/16 v4, 0xa1

    const/16 v5, 0xb2

    invoke-static {v3, v4, v5}, Landroid/graphics/Color;->rgb(III)I

    move-result v3

    invoke-direct {v2, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    iget v1, v1, Lkik/android/util/cq$a;->b:I

    invoke-interface {v0, v2, v6, v1, v6}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    .line 134
    :cond_0
    :goto_0
    return-void

    .line 133
    :cond_1
    new-array v0, v2, [Landroid/view/View;

    iget-object v1, p1, Lcom/kik/view/adapters/ar$b;->o:Landroid/widget/TextView;

    aput-object v1, v0, v6

    invoke-static {v0}, Lkik/android/util/cv;->e([Landroid/view/View;)V

    goto :goto_0
.end method

.method protected abstract a(Lkik/a/d/s;Lcom/kik/view/adapters/ar$b;)V
.end method

.method protected abstract a(Lcom/kik/view/adapters/ar$b;)Z
.end method

.method public b(I)V
    .locals 0

    .prologue
    .line 154
    return-void
.end method

.method public c()V
    .locals 0

    .prologue
    .line 162
    return-void
.end method

.method public c(I)V
    .locals 0

    .prologue
    .line 170
    return-void
.end method
