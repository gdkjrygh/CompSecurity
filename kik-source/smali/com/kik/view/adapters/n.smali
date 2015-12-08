.class public abstract Lcom/kik/view/adapters/n;
.super Lcom/kik/view/adapters/ay;
.source "SourceFile"

# interfaces
.implements Lcom/kik/view/adapters/aq;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/view/adapters/n$a;
    }
.end annotation


# instance fields
.field private a:Lkik/a/f/k;

.field protected b:Ljava/util/HashSet;

.field protected c:Z

.field protected final d:Lkik/android/chat/b/d;

.field private final r:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/cache/ad;Lcom/kik/android/a;Lkik/a/e/n;Lkik/a/f/k;Lkik/android/chat/b/d;Lcom/kik/e/a;)V
    .locals 10

    .prologue
    .line 68
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p5

    move-object/from16 v6, p7

    move-object/from16 v7, p6

    move-object/from16 v8, p8

    move-object/from16 v9, p11

    invoke-direct/range {v1 .. v9}, Lcom/kik/view/adapters/ay;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;Landroid/view/View$OnClickListener;Lcom/kik/view/adapters/ar$a;Lcom/kik/android/a;Lcom/kik/cache/ad;Lkik/a/e/n;Lcom/kik/e/a;)V

    .line 47
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lcom/kik/view/adapters/n;->b:Ljava/util/HashSet;

    .line 69
    iput-object p4, p0, Lcom/kik/view/adapters/n;->r:Landroid/view/View$OnClickListener;

    .line 70
    move-object/from16 v0, p9

    iput-object v0, p0, Lcom/kik/view/adapters/n;->a:Lkik/a/f/k;

    .line 71
    move-object/from16 v0, p10

    iput-object v0, p0, Lcom/kik/view/adapters/n;->d:Lkik/android/chat/b/d;

    .line 72
    return-void
.end method


# virtual methods
.method public a(Lcom/kik/view/adapters/ar$b;Lkik/a/d/s;ZLandroid/content/Context;Lcom/kik/view/adapters/au$b;)V
    .locals 2

    .prologue
    .line 299
    invoke-super/range {p0 .. p5}, Lcom/kik/view/adapters/ay;->a(Lcom/kik/view/adapters/ar$b;Lkik/a/d/s;ZLandroid/content/Context;Lcom/kik/view/adapters/au$b;)V

    .line 301
    check-cast p1, Lcom/kik/view/adapters/n$a;

    .line 302
    iget-object v0, p1, Lcom/kik/view/adapters/n$a;->m:Lkik/android/widget/MaskedFramelayout;

    new-instance v1, Lcom/kik/view/adapters/q;

    invoke-direct {v1, p0, p5, p1}, Lcom/kik/view/adapters/q;-><init>(Lcom/kik/view/adapters/n;Lcom/kik/view/adapters/au$b;Lcom/kik/view/adapters/n$a;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/MaskedFramelayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 312
    iget-object v0, p1, Lcom/kik/view/adapters/n$a;->m:Lkik/android/widget/MaskedFramelayout;

    new-instance v1, Lcom/kik/view/adapters/r;

    invoke-direct {v1, p0}, Lcom/kik/view/adapters/r;-><init>(Lcom/kik/view/adapters/n;)V

    invoke-virtual {v0, v1}, Lkik/android/widget/MaskedFramelayout;->setOnCreateContextMenuListener(Landroid/view/View$OnCreateContextMenuListener;)V

    .line 320
    return-void
.end method

.method public final a(Ljava/util/HashSet;)V
    .locals 1

    .prologue
    .line 76
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lcom/kik/view/adapters/n;->b:Ljava/util/HashSet;

    .line 77
    return-void
.end method

.method protected abstract a(Lkik/a/d/a/a;Lcom/kik/view/adapters/n$a;Z)V
.end method

.method protected a(Lkik/a/d/s;Lcom/kik/view/adapters/ar$b;)V
    .locals 12

    .prologue
    const/16 v7, 0x8

    const/4 v3, 0x0

    const v6, 0x7f0e01c8

    const/4 v5, 0x0

    .line 128
    check-cast p2, Lcom/kik/view/adapters/n$a;

    .line 129
    invoke-virtual {p1}, Lkik/a/d/s;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p2, Lcom/kik/view/adapters/n$a;->i:Landroid/view/View;

    sget v1, Lcom/kik/view/adapters/n;->p:I

    invoke-virtual {v0, v5, v5, v1, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 130
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/kik/view/adapters/n;->a(Lkik/a/d/s;Lcom/kik/view/adapters/n$a;)V

    .line 131
    invoke-virtual {p0, p1}, Lcom/kik/view/adapters/n;->a(Lkik/a/d/s;)Z

    move-result v0

    .line 133
    iget-object v1, p2, Lcom/kik/view/adapters/n$a;->k:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/kik/view/adapters/n;->r:Landroid/view/View$OnClickListener;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    const-class v1, Lkik/a/d/a/a;

    invoke-static {p1, v1}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v1

    check-cast v1, Lkik/a/d/a/a;

    .line 136
    if-nez v1, :cond_1

    .line 229
    :goto_1
    return-void

    .line 129
    :cond_0
    iget-object v0, p2, Lcom/kik/view/adapters/n$a;->i:Landroid/view/View;

    sget v1, Lcom/kik/view/adapters/n;->p:I

    invoke-virtual {v0, v1, v5, v5, v5}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_0

    .line 140
    :cond_1
    iget-object v2, p2, Lcom/kik/view/adapters/n$a;->k:Landroid/widget/ImageView;

    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 141
    invoke-virtual {p0, v1, p2, v0}, Lcom/kik/view/adapters/n;->a(Lkik/a/d/a/a;Lcom/kik/view/adapters/n$a;Z)V

    .line 143
    const-string v0, "true"

    const-string v2, "allow-forward"

    invoke-virtual {v1, v2}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 145
    iget-object v0, p2, Lcom/kik/view/adapters/n$a;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 151
    :goto_2
    iget-object v0, p2, Lcom/kik/view/adapters/n$a;->j:Landroid/widget/TextView;

    const/16 v2, 0x78

    invoke-static {v2}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 152
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    iget-object v2, p2, Lcom/kik/view/adapters/n$a;->j:Landroid/widget/TextView;

    aput-object v2, v0, v5

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 153
    iget-object v0, p2, Lcom/kik/view/adapters/n$a;->j:Landroid/widget/TextView;

    invoke-static {v0}, Lkik/android/util/cv;->a(Landroid/widget/TextView;)V

    .line 154
    iget-object v0, p2, Lcom/kik/view/adapters/n$a;->j:Landroid/widget/TextView;

    invoke-static {v1}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 155
    iget-object v0, p2, Lcom/kik/view/adapters/n$a;->h:Lkik/android/widget/IconImageView;

    iget-object v2, p0, Lcom/kik/view/adapters/n;->n:Lkik/a/e/n;

    invoke-virtual {v0, v1, v2}, Lkik/android/widget/IconImageView;->a(Lkik/a/d/a/a;Lkik/a/e/n;)Z

    .line 157
    invoke-virtual {v1}, Lkik/a/d/a/a;->v()I

    move-result v4

    .line 159
    invoke-virtual {p1}, Lkik/a/d/s;->d()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {v1}, Lkik/a/d/a/a;->w()I

    move-result v0

    if-ltz v0, :cond_9

    sget v0, Lkik/a/d/a/a$a;->e:I

    if-eq v4, v0, :cond_2

    sget v0, Lkik/a/d/a/a$a;->a:I

    if-ne v4, v0, :cond_3

    :cond_2
    invoke-virtual {p1}, Lkik/a/d/s;->c()I

    move-result v0

    const/16 v2, -0x64

    if-ne v0, v2, :cond_9

    .line 162
    :cond_3
    iget-object v0, p2, Lcom/kik/view/adapters/n$a;->r:Landroid/view/View;

    const v2, 0x7f0e015a

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    .line 163
    iget-object v2, p2, Lcom/kik/view/adapters/n$a;->r:Landroid/view/View;

    invoke-virtual {v2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lkik/android/widget/ProgressWidget;

    .line 164
    if-nez v2, :cond_b

    if-eqz v0, :cond_b

    .line 165
    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    .line 166
    iget-object v0, p2, Lcom/kik/view/adapters/n$a;->r:Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/ProgressWidget;

    move-object v11, v0

    .line 169
    :goto_3
    invoke-virtual {v11, v5}, Lkik/android/widget/ProgressWidget;->setVisibility(I)V

    .line 171
    iget-object v0, p2, Lcom/kik/view/adapters/n$a;->r:Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/ProgressWidget;

    invoke-virtual {p0, p2}, Lcom/kik/view/adapters/n;->a(Lcom/kik/view/adapters/n$a;)[Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v2}, Lkik/android/widget/ProgressWidget;->a([Landroid/view/View;)V

    .line 175
    invoke-virtual {p0, p2}, Lcom/kik/view/adapters/n;->b(Lcom/kik/view/adapters/n$a;)V

    .line 178
    sget v0, Lkik/a/d/a/a$a;->d:I

    if-ne v4, v0, :cond_6

    .line 179
    invoke-virtual {v11}, Lkik/android/widget/ProgressWidget;->b()V

    move-object v0, v3

    .line 196
    :cond_4
    :goto_4
    if-eqz v0, :cond_8

    .line 197
    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkik/android/net/a/b;

    .line 198
    new-instance v0, Lcom/kik/view/adapters/o;

    move-object v1, p0

    move-object v3, v11

    move-object v4, p2

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lcom/kik/view/adapters/o;-><init>(Lcom/kik/view/adapters/n;Lkik/android/net/a/b;Lkik/android/widget/ProgressWidget;Lcom/kik/view/adapters/n$a;Lkik/a/d/s;)V

    invoke-virtual {v11, v0}, Lkik/android/widget/ProgressWidget;->a(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_1

    .line 148
    :cond_5
    iget-object v0, p2, Lcom/kik/view/adapters/n$a;->k:Landroid/widget/ImageView;

    invoke-virtual {v0, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_2

    .line 182
    :cond_6
    invoke-static {}, Lkik/android/net/a/e;->a()Lkik/android/net/a/e;

    move-result-object v0

    invoke-virtual {v1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lkik/android/net/a/e;->a(Ljava/lang/String;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    .line 183
    if-nez v0, :cond_7

    .line 185
    new-instance v0, Lkik/android/net/a/c;

    invoke-virtual {p1}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkik/a/d/s;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lkik/a/d/s;->o()[B

    move-result-object v4

    iget-object v5, p0, Lcom/kik/view/adapters/n;->e:Lcom/kik/android/a;

    iget-object v6, p0, Lcom/kik/view/adapters/n;->a:Lkik/a/f/k;

    iget-object v7, p0, Lcom/kik/view/adapters/n;->n:Lkik/a/e/n;

    iget-object v8, p0, Lcom/kik/view/adapters/n;->g:Lkik/a/e/v;

    iget-object v9, p0, Lcom/kik/view/adapters/n;->i:Lkik/a/e/i;

    iget-object v10, p0, Lcom/kik/view/adapters/n;->j:Lkik/a/e/t;

    invoke-direct/range {v0 .. v10}, Lkik/android/net/a/c;-><init>(Lkik/a/d/a/a;Ljava/lang/String;Ljava/lang/String;[BLcom/kik/android/a;Lkik/a/f/k;Lkik/a/e/n;Lkik/a/e/v;Lkik/a/e/i;Lkik/a/e/t;)V

    .line 186
    invoke-virtual {v0}, Lkik/android/net/a/c;->i()V

    .line 187
    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    move-object v0, v2

    .line 189
    :cond_7
    invoke-virtual {v11, v0}, Lkik/android/widget/ProgressWidget;->a(Ljava/lang/ref/WeakReference;)V

    .line 190
    invoke-virtual {p0, p2}, Lcom/kik/view/adapters/n;->d(Lcom/kik/view/adapters/n$a;)Lkik/android/widget/ProgressWheel;

    move-result-object v2

    .line 191
    if-eqz v2, :cond_4

    .line 192
    invoke-virtual {v11, v2}, Lkik/android/widget/ProgressWidget;->a(Lkik/android/widget/ProgressWheel;)V

    goto :goto_4

    .line 208
    :cond_8
    new-instance v0, Lcom/kik/view/adapters/p;

    invoke-direct {v0, p0, v1}, Lcom/kik/view/adapters/p;-><init>(Lcom/kik/view/adapters/n;Lkik/a/d/a/a;)V

    invoke-virtual {v11, v0}, Lkik/android/widget/ProgressWidget;->a(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_1

    .line 219
    :cond_9
    iget-object v0, p2, Lcom/kik/view/adapters/n$a;->r:Landroid/view/View;

    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lkik/android/widget/ProgressWidget;

    .line 220
    if-eqz v0, :cond_a

    .line 222
    invoke-virtual {v0, v3}, Lkik/android/widget/ProgressWidget;->a([Landroid/view/View;)V

    .line 223
    invoke-virtual {v0, v3, v3}, Lkik/android/widget/ProgressWidget;->a(Landroid/view/View;Landroid/view/View;)V

    .line 224
    invoke-virtual {v0, v7}, Lkik/android/widget/ProgressWidget;->setVisibility(I)V

    .line 226
    :cond_a
    invoke-virtual {p0, p2}, Lcom/kik/view/adapters/n;->a(Lcom/kik/view/adapters/n$a;)[Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cv;->b([Landroid/view/View;)V

    .line 227
    invoke-virtual {p0, p2}, Lcom/kik/view/adapters/n;->c(Lcom/kik/view/adapters/n$a;)V

    goto/16 :goto_1

    :cond_b
    move-object v11, v2

    goto/16 :goto_3
.end method

.method protected a(Lkik/a/d/s;Lcom/kik/view/adapters/n$a;)V
    .locals 7

    .prologue
    const/16 v6, 0xb

    const/16 v5, 0x9

    const/4 v3, -0x1

    const/4 v4, 0x0

    .line 279
    iget-object v0, p2, Lcom/kik/view/adapters/n$a;->m:Lkik/android/widget/MaskedFramelayout;

    invoke-virtual {v0}, Lkik/android/widget/MaskedFramelayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 280
    invoke-virtual {p1}, Lkik/a/d/s;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 281
    iget-object v1, p2, Lcom/kik/view/adapters/n$a;->m:Lkik/android/widget/MaskedFramelayout;

    const v2, 0x7f0201fb

    invoke-virtual {v1, v2}, Lkik/android/widget/MaskedFramelayout;->a(I)V

    .line 282
    invoke-virtual {v0, v6, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 283
    invoke-virtual {v0, v5, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 285
    const/16 v1, 0x2d

    invoke-static {v1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    iget v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    const/4 v3, 0x3

    invoke-static {v3}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v3

    iget v4, v0, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    .line 294
    :goto_0
    return-void

    .line 288
    :cond_0
    iget-object v1, p2, Lcom/kik/view/adapters/n$a;->m:Lkik/android/widget/MaskedFramelayout;

    const v2, 0x7f0201ab

    invoke-virtual {v1, v2}, Lkik/android/widget/MaskedFramelayout;->a(I)V

    .line 289
    invoke-virtual {v0, v6, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 290
    invoke-virtual {v0, v5, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 292
    const/16 v1, 0x34

    invoke-static {v1}, Lkik/android/chat/KikApplication;->a(I)I

    move-result v1

    iget v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    iget v3, v0, Landroid/widget/RelativeLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v0, v1, v2, v4, v3}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    goto :goto_0
.end method

.method protected final a(Lkik/android/net/a/b;Landroid/widget/ImageView;Lkik/android/widget/ProgressWidget;Lkik/a/d/f;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 356
    const v0, 0x7f02022f

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 357
    const/16 v0, -0x64

    iget-object v1, p0, Lcom/kik/view/adapters/n;->g:Lkik/a/e/v;

    invoke-virtual {p4, p5, v0, v1}, Lkik/a/d/f;->a(Ljava/lang/String;ILkik/a/e/v;)Z

    .line 358
    invoke-static {}, Lkik/android/net/a/e;->a()Lkik/android/net/a/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkik/android/net/a/e;->b(Lkik/android/net/a/b;)V

    .line 359
    invoke-virtual {p3}, Lkik/android/widget/ProgressWidget;->b()V

    .line 360
    return-void
.end method

.method protected a(Lkik/android/net/a/b;Lkik/android/widget/ProgressWidget;Lcom/kik/view/adapters/n$a;Lkik/a/d/s;)V
    .locals 1

    .prologue
    .line 270
    invoke-static {}, Lkik/android/net/a/e;->a()Lkik/android/net/a/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lkik/android/net/a/e;->a(Lkik/android/net/a/b;)V

    .line 271
    if-eqz p2, :cond_0

    .line 272
    invoke-virtual {p2}, Lkik/android/widget/ProgressWidget;->a()V

    .line 274
    :cond_0
    return-void
.end method

.method public final a(Lkik/a/d/s;)Z
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 86
    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lcom/kik/view/adapters/n;->c:Z

    if-nez v0, :cond_1

    :cond_0
    move v0, v2

    .line 101
    :goto_0
    return v0

    .line 89
    :cond_1
    iget-object v0, p0, Lcom/kik/view/adapters/n;->f:Lkik/a/e/r;

    invoke-virtual {p1}, Lkik/a/d/s;->i()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Lkik/a/e/r;->a(Ljava/lang/String;Z)Lkik/a/d/k;

    move-result-object v1

    .line 90
    if-eqz v1, :cond_2

    instance-of v0, v1, Lkik/a/d/n;

    if-eqz v0, :cond_2

    move-object v0, v1

    check-cast v0, Lkik/a/d/n;

    invoke-virtual {v0}, Lkik/a/d/n;->I()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v2

    .line 92
    goto :goto_0

    .line 94
    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lkik/a/d/k;->v()Z

    move-result v0

    if-eqz v0, :cond_3

    move v0, v2

    .line 96
    goto :goto_0

    .line 98
    :cond_3
    const-class v0, Lkik/a/d/a/a;

    invoke-static {p1, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 99
    if-nez v0, :cond_4

    const/4 v0, 0x0

    .line 100
    :goto_1
    iget-object v1, p0, Lcom/kik/view/adapters/n;->b:Ljava/util/HashSet;

    monitor-enter v1

    .line 101
    if-eqz v0, :cond_5

    :try_start_0
    iget-boolean v3, p0, Lcom/kik/view/adapters/n;->c:Z

    if-eqz v3, :cond_5

    iget-object v3, p0, Lcom/kik/view/adapters/n;->b:Ljava/util/HashSet;

    if-eqz v3, :cond_5

    iget-object v3, p0, Lcom/kik/view/adapters/n;->b:Ljava/util/HashSet;

    invoke-virtual {v3, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x1

    :goto_2
    monitor-exit v1

    goto :goto_0

    .line 102
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 99
    :cond_4
    invoke-virtual {v0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_5
    move v0, v2

    .line 101
    goto :goto_2
.end method

.method protected a(Lcom/kik/view/adapters/n$a;)[Landroid/view/View;
    .locals 3

    .prologue
    .line 238
    const/4 v0, 0x1

    new-array v0, v0, [Landroid/view/View;

    const/4 v1, 0x0

    iget-object v2, p1, Lcom/kik/view/adapters/n$a;->i:Landroid/view/View;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 81
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/kik/view/adapters/n;->c:Z

    .line 82
    return-void
.end method

.method protected abstract b(Lcom/kik/view/adapters/n$a;)V
.end method

.method public final b(Lkik/a/d/s;)V
    .locals 3

    .prologue
    .line 107
    if-nez p1, :cond_0

    .line 115
    :goto_0
    return-void

    .line 111
    :cond_0
    const-class v0, Lkik/a/d/a/a;

    invoke-static {p1, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 112
    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 113
    :goto_1
    iget-object v1, p0, Lcom/kik/view/adapters/n;->b:Ljava/util/HashSet;

    monitor-enter v1

    .line 114
    :try_start_0
    iget-object v2, p0, Lcom/kik/view/adapters/n;->b:Ljava/util/HashSet;

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 115
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 112
    :cond_1
    invoke-virtual {v0}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method protected abstract c(Lcom/kik/view/adapters/n$a;)V
.end method

.method protected d(Lcom/kik/view/adapters/n$a;)Lkik/android/widget/ProgressWheel;
    .locals 1

    .prologue
    .line 249
    const/4 v0, 0x0

    return-object v0
.end method

.method protected d(Lkik/a/d/a/a;)V
    .locals 3

    .prologue
    .line 257
    iget-object v0, p0, Lcom/kik/view/adapters/n;->l:Landroid/content/Context;

    const v1, 0x7f0902bb

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 258
    return-void
.end method
